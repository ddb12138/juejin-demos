
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

public class ParamProcessor {
    public static void setDefalutValue(Object obj) {
        //先获取传进来的类Class
        Class source = obj.getClass();
        ArrayList<Field> fields = new ArrayList<>();
        while (source != null) {
            //获取所有属性(包括私有属性)
            fields.addAll(Arrays.asList(source.getDeclaredFields()));
            source = source.getSuperclass();
        }
        for (Field field : fields) {
            //设置放开权限
            field.setAccessible(true);
            //判断是否该属性有注解
            if (field.isAnnotationPresent(ParamAnno.class)) {
                try {
                    //返回指定对象上此 Field 表示的字段的值
                    Object val = field.get(obj);
                    //可以通过判断语句来选择注入对象是否是空值(即原本有值的话要不要覆盖上注解的值)
                    if (val != null) {
                        continue;
                    }
                    //获取该属性的种类
                    Class type = field.getType();
                    if (type.isPrimitive()) {
                        //判断是否为原始类(boolean,char,byte,short,int,long,float,double)
                        continue;
                    }
                    //获取注解上的值
                    String defVal = field.getAnnotation(ParamAnno.class).value();
                    if (String.class.isAssignableFrom(type)) {
                        field.set(obj, defVal);
                    } else if (Number.class.isAssignableFrom(type)) {
                        if (Byte.class.isAssignableFrom(type)) {
                            field.set(obj, Byte.valueOf(defVal));
                        } else if (Float.class.isAssignableFrom(type)) {
                            field.set(obj, Float.valueOf(defVal));
                        } else if (Short.class.isAssignableFrom(type)) {
                            field.set(obj, Short.valueOf(defVal));
                        } else if (Double.class.isAssignableFrom(type)) {
                            field.set(obj, Double.valueOf(defVal));
                        } else if (Integer.class.isAssignableFrom(type)) {
                            field.set(obj, Integer.valueOf(defVal));
                        } else if (Long.class.isAssignableFrom(type)) {
                            field.set(obj, Long.valueOf(defVal));
                        }
                    }else if (Boolean.class.isAssignableFrom(type)){
                        field.set(obj,Boolean.valueOf(defVal));
                    }else if (Character.class.isAssignableFrom(type)){
                        field.set(obj,Character.valueOf(defVal.charAt(0)));
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
