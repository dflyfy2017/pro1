package cb;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;

import java.io.IOException;

public class Un_myBatis {
    public static void main(String[] args) throws Exception {

        ClassPool pool = ClassPool.getDefault();
        CtClass driverClass = pool.get("com.seventh7.mybatis.ref.license.ActivationDriver");
        CtClass javaUtil = pool.get("com.seventh7.mybatis.util.JavaUtils");
        CtMethod activate = driverClass.getMethod("activate", "(Ljava/lang/String;)Lcom/seventh7/mybatis/ref/license/ActivationResult;");
        CtMethod refValid = javaUtil.getDeclaredMethod("refValid");
        try {
            refValid.setBody("{return true;}");
        } catch (CannotCompileException e) {
            e.printStackTrace();
        }
        System.out.println(activate);
        try {
            activate.setBody("{com.seventh7.mybatis.ref.license.LicenseData licenseData = new com.seventh7.mybatis.ref.license.LicenseData(\"1\", \"2\");com.seventh7.mybatis.ref.license.ActivationResult res =com.seventh7.mybatis.ref.license.ActivationResult.success(licenseData); return res;}");
        } catch (CannotCompileException e) {
            e.printStackTrace();
        }
        try {
            driverClass.writeFile("activate");
            javaUtil.writeFile("activate");
        } catch (CannotCompileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
