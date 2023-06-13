package p000;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: pC1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C46728pC1 implements InterfaceC45542nC1 {

    /* renamed from: c */
    public static Class<?> f103254c;

    /* renamed from: d */
    public static boolean f103255d;

    /* renamed from: e */
    public static Method f103256e;

    /* renamed from: f */
    public static boolean f103257f;

    /* renamed from: g */
    public static Method f103258g;

    /* renamed from: h */
    public static boolean f103259h;

    /* renamed from: b */
    public final View f103260b;

    public C46728pC1(View view) {
        this.f103260b = view;
    }

    /* renamed from: b */
    public static InterfaceC45542nC1 m19830b(View view, ViewGroup viewGroup, Matrix matrix) {
        m19829c();
        Method method = f103256e;
        if (method != null) {
            try {
                return new C46728pC1((View) method.invoke(null, view, viewGroup, matrix));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return null;
    }

    /* renamed from: c */
    public static void m19829c() {
        if (!f103257f) {
            try {
                m19828d();
                Method declaredMethod = f103254c.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
                f103256e = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("GhostViewApi21", "Failed to retrieve addGhost method", e);
            }
            f103257f = true;
        }
    }

    /* renamed from: d */
    public static void m19828d() {
        if (!f103255d) {
            try {
                f103254c = Class.forName("android.view.GhostView");
            } catch (ClassNotFoundException e) {
                Log.i("GhostViewApi21", "Failed to retrieve GhostView class", e);
            }
            f103255d = true;
        }
    }

    /* renamed from: e */
    public static void m19827e() {
        if (!f103259h) {
            try {
                m19828d();
                Method declaredMethod = f103254c.getDeclaredMethod("removeGhost", View.class);
                f103258g = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", e);
            }
            f103259h = true;
        }
    }

    /* renamed from: f */
    public static void m19826f(View view) {
        m19827e();
        Method method = f103258g;
        if (method != null) {
            try {
                method.invoke(null, view);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    @Override // p000.InterfaceC45542nC1
    /* renamed from: a */
    public void mo17916a(ViewGroup viewGroup, View view) {
    }

    @Override // p000.InterfaceC45542nC1
    public void setVisibility(int i) {
        this.f103260b.setVisibility(i);
    }
}
