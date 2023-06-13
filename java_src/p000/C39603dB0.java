package p000;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
/* renamed from: dB0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39603dB0 {

    /* renamed from: dB0$a */
    /* loaded from: classes.dex */
    public static class C19689a {
        private C19689a() {
        }

        /* renamed from: a */
        public static Context m44546a(Context context, String str) {
            Context createAttributionContext;
            createAttributionContext = context.createAttributionContext(str);
            return createAttributionContext;
        }

        /* renamed from: b */
        public static String m44545b(Context context) {
            String attributionTag;
            attributionTag = context.getAttributionTag();
            return attributionTag;
        }
    }

    private C39603dB0() {
    }

    /* renamed from: a */
    public static Context m44549a(Context context) {
        String m44545b;
        Context applicationContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 30 && (m44545b = C19689a.m44545b(context)) != null) {
            return C19689a.m44546a(applicationContext, m44545b);
        }
        return applicationContext;
    }

    /* renamed from: b */
    public static Application m44548b(Context context) {
        for (Context m44549a = m44549a(context); m44549a instanceof ContextWrapper; m44549a = m44547c((ContextWrapper) m44549a)) {
            if (m44549a instanceof Application) {
                return (Application) m44549a;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static Context m44547c(ContextWrapper contextWrapper) {
        String m44545b;
        Context baseContext = contextWrapper.getBaseContext();
        if (Build.VERSION.SDK_INT >= 30 && (m44545b = C19689a.m44545b(contextWrapper)) != null) {
            return C19689a.m44546a(baseContext, m44545b);
        }
        return baseContext;
    }
}
