package p000;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
/* renamed from: tA6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C49086tA6 {

    /* renamed from: tA6$a */
    /* loaded from: classes.dex */
    public static class C28542a {

        /* renamed from: a */
        public static final DA6 f109985a = new DA6(C49086tA6.m12932d().getWebkitToCompatConverter());

        private C28542a() {
        }
    }

    /* renamed from: tA6$b */
    /* loaded from: classes.dex */
    public static class C28543b {

        /* renamed from: a */
        public static final InterfaceC52643zA6 f109986a = C49086tA6.m12935a();

        private C28543b() {
        }
    }

    private C49086tA6() {
    }

    /* renamed from: a */
    public static InterfaceC52643zA6 m12935a() {
        try {
            return new AA6((WebViewProviderFactoryBoundaryInterface) C48980t00.m13276a(WebViewProviderFactoryBoundaryInterface.class, m12934b()));
        } catch (ClassNotFoundException unused) {
            return new C41877h12();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    public static InvocationHandler m12934b() throws IllegalAccessException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, m12931e()).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0]);
    }

    /* renamed from: c */
    public static DA6 m12933c() {
        return C28542a.f109985a;
    }

    /* renamed from: d */
    public static InterfaceC52643zA6 m12932d() {
        return C28543b.f109986a;
    }

    /* renamed from: e */
    public static ClassLoader m12931e() {
        ClassLoader webViewClassLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            webViewClassLoader = WebView.getWebViewClassLoader();
            return webViewClassLoader;
        }
        return m12930f().getClass().getClassLoader();
    }

    /* renamed from: f */
    public static Object m12930f() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, new Object[0]);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
