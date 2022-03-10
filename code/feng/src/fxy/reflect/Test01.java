package fxy.reflect;

import java.awt.Checkbox;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test01 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, IOException, NoSuchMethodException, SecurityException, IllegalArgumentException,
			InvocationTargetException, NoSuchFieldException {
//		String pathName = "src\\re.properties";
//		File dir = new File(pathName);
//		FileInputStream fileInputStream = new FileInputStream(dir);
		Properties properties = new Properties();
		properties.load(new FileInputStream("src\\re.properties"));
		String classpath = properties.getProperty("classpath");
		String method = properties.getProperty("method");

		Class class1 = Class.forName(classpath);
		Object object = class1.newInstance();
		Method method2 = class1.getMethod(method);
		method2.invoke(object);
		System.out.println(object.getClass());

		Constructor constructor = class1.getConstructor();
		System.out.println(constructor);

		Field field = class1.getField("number");
		System.out.println(field);
		for (String string : args) {
			
		}
		
		

	}
}
