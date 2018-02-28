package springUtil;

import ann.MBean;

import java.io.File;
import java.lang.annotation.Annotation;
import java.util.*;


public class SpringApp {


    private static Map<String, Object> map = new HashMap<>();


    public SpringApp() {
        File f = new File(this.getClass().getResource("/").getPath());
        addClassBean(f);

    }

    public Object getBean(String userService) {

        return map.get(userService);
    }

    public static void addClassBean(File file) {
        for (File f : Objects.requireNonNull(file.listFiles())) {
            if (f.isDirectory()) addClassBean(f);
            if (f.isFile()) {
                if (f.getName().lastIndexOf(".class") != -1) {
                    try {
                        String pack = f.getPath();
                        pack = pack.substring(pack.indexOf("main") + 5, pack.length());
                        pack = pack.substring(0, pack.indexOf(".class")).replace('\\', '.');
                        Class cls = Class.forName(pack);
                        Annotation[] ann = cls.getAnnotations();
                        for (Annotation annotatedType : ann) {
                            if (annotatedType instanceof MBean) {
                                Object o = cls.newInstance();
                                map.put(cls.getSimpleName(), o);
                            }
                        }
                    } catch (Exception ignored) {
                    }
                }
            }
        }
    }

}
