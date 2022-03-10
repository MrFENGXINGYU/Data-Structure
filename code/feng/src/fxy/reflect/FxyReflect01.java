package fxy.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class FxyReflect01 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		Class class1 = Class.forName("fxy.reflect.Student");
		System.out.println(class1);

		Field[] fields = class1.getDeclaredFields();
		for (Field field : fields) {
			String name = field.getName();
			Type type = field.getGenericType();
			int mod = field.getModifiers();
			System.out.println(name + type);
		}

		Method[] method = class1.getDeclaredMethods();
		for (Method method2 : method) {
			String name = method2.getName();
			Type type = method2.getGenericReturnType();
			System.out.println(name + ", " + type);
		}

	}

}
