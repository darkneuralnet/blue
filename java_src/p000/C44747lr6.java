package p000;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: lr6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C44747lr6 {

    /* renamed from: a */
    public static boolean f96825a = true;

    /* renamed from: b */
    public static Method f96826b;

    /* renamed from: c */
    public static boolean f96827c;

    private C44747lr6() {
    }

    /* renamed from: a */
    public static int m26737a(ViewGroup viewGroup, int i) {
        int childDrawingOrder;
        if (Build.VERSION.SDK_INT >= 29) {
            childDrawingOrder = viewGroup.getChildDrawingOrder(i);
            return childDrawingOrder;
        }
        if (!f96827c) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", cls, cls);
                f96826b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f96827c = true;
        }
        Method method = f96826b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i))).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i;
    }

    /* renamed from: b */
    public static InterfaceC42968ir6 m26736b(ViewGroup viewGroup) {
        return new C42375hr6(viewGroup);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public static void m26735c(ViewGroup viewGroup, boolean z) {
        if (f96825a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f96825a = false;
            }
        }
    }

    /* renamed from: d */
    public static void m26734d(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else {
            m26735c(viewGroup, z);
        }
    }
}
