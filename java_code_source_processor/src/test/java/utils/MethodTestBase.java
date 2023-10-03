package utils;

import org.junit.Assert;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.stream.Stream;

public abstract class MethodTestBase {
    Class originalClass = null;
    Class patchedClass = null;

    abstract public void generateSources();
    public MethodTestBase(String filePath, String originalClassName, String patchedClassName){
        generateSources();
        File file = new File(filePath);

        try {
            URL url = file.toURI().toURL();
            URL[] urls = new URL[]{url};
            ClassLoader cl = new URLClassLoader(urls);
            this.originalClass = cl.loadClass(originalClassName);
            this.patchedClass = cl.loadClass(patchedClassName);

        } catch (MalformedURLException e) {
        } catch (ClassNotFoundException e) {
        } catch (Exception e) {
            System.out.println("fail");
        }
    }

    protected <A> void executeMethod(String methodName, Class[] classes, Stream<A> values){
        try {
            executeMethodCore(methodName, classes, values);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    protected <A> void executeFunction(String methodName, Class[] classes, Stream<A> values){
        try {
            executeFunctionCore(methodName, classes, values);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    private <A> void executeMethodCore(String methodName, Class[] classes, Stream<A> values) throws NoSuchMethodException {
        final Method originalMethod = originalClass.getMethod(methodName, classes);
        final Method patchedMethod =  patchedClass.getMethod(methodName, classes);

        values.forEach((val) -> {
            final var logger1 = new StringBuilder();
            final var logger2 = new StringBuilder();

            try {
                final var res1 = originalMethod.invoke(originalClass.newInstance(), val, logger1);
                final var res2 = patchedMethod.invoke(patchedClass.newInstance(), val, logger2);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            }

            System.out.println("-------------------------------");
            System.out.println(methodName);
            System.out.println(logger1);
            System.out.println(logger2);
            Assert.assertEquals(logger1.toString(), logger2.toString());
        });
    }
    private <A> void executeFunctionCore(String methodName, Class[] classes, Stream<A> values) throws NoSuchMethodException {
        final Method originalMethod = originalClass.getMethod(methodName, classes);
        final Method patchedMethod =  patchedClass.getMethod(methodName, classes);

        final var logger1 = new StringBuilder();
        final var logger2 = new StringBuilder();

        values.forEach((val) -> {
            try {
                logger1.append(originalMethod.invoke(originalClass.newInstance(), val));
                logger2.append(patchedMethod.invoke(patchedClass.newInstance(), val));
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            }
        });
        System.out.println("-------------------------------");
        System.out.println(methodName);
        System.out.println(logger1);
        System.out.println(logger2);
        Assert.assertEquals(logger1.toString(), logger2.toString());
    }

}
