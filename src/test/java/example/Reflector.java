package example;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Reflector {

    /*public static void main(String[] args) {
        Reflector.reflect(Example.class);
    }*/

    public static void reflect(Class clazz) {
        Class supercl = clazz.getSuperclass();
        String modifiers = Modifier.toString(clazz.getModifiers());
        if (modifiers.length() > 0)
            System.out.print(modifiers + " ");
        System.out.println("class " + clazz.getSimpleName() + "\n");

        if (supercl != null) {
            System.out.println("EXTENDS CLASS:");
            System.out.print("   ");
            System.out.println(supercl.getName());
        }
        System.out.println("\nFIELDS:");
        printFields(clazz);
        System.out.println("\nMETHODS:");
        printMethods(clazz);
        System.out.println("\nCONSTRUCTORS:");
        printConstructors(clazz);
        System.out.println("\nIMPLEMENTS INTERFACES:");
        printInterfaces(clazz);
    }

    /**
     * Prints all constructors of a class
     *
     * @param cl a class
     */
    public static void printConstructors(Class cl) {
        Constructor[] constructors = cl.getDeclaredConstructors();

        for (Constructor c : constructors) {
            String name = c.getName();
            System.out.print("   ");
            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.print(name + "(");

            // print parameter types
            Class[] paramTypes = c.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if (j > 0) System.out.print(", ");
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    /**
     * Prints all methods of a class
     *
     * @param cl a class
     */
    public static void printMethods(Class cl) {
        Method[] methods = cl.getDeclaredMethods();

        for (Method m : methods) {
            Class retType = m.getReturnType();
            String name = m.getName();

            System.out.print("   ");
            // print modifiers, return type and method name
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0)
                System.out.print(modifiers + " ");
            System.out.print(retType.getName() + " " + name + "(");

            // print parameter types
            Class[] paramTypes = m.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if (j > 0) System.out.print(", ");
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    /**
     * Prints all fields of a class
     *
     * @param cl a class
     */
    public static void printFields(Class cl) {
        Field[] fields = cl.getDeclaredFields();

        for (Field f : fields) {
            Class type = f.getType();
            String name = f.getName();
            System.out.print("   ");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.println(type.getName() + " " + name + ";");
        }
    }

    public static void printInterfaces(Class cl) {
        Class[] interfaces = cl.getInterfaces();

        for (Class anInterface : interfaces) {
            String name = anInterface.getName();
            System.out.print("   ");
            String modifiers = Modifier.toString(anInterface.getModifiers());
            if (modifiers.length() > 0) System.out.println(modifiers + " ");
            System.out.println(anInterface.getName() + " " + name + ";");
        }
    }
}
