package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.InterfaceC11728i;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
final class ImmLeaksCleaner implements InterfaceC11728i {

    /* renamed from: c */
    public static int f51425c;

    /* renamed from: d */
    public static Field f51426d;

    /* renamed from: e */
    public static Field f51427e;

    /* renamed from: f */
    public static Field f51428f;

    /* renamed from: b */
    public Activity f51429b;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: a */
    public static void m70500a() {
        try {
            f51425c = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f51427e = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f51428f = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f51426d = declaredField3;
            declaredField3.setAccessible(true);
            f51425c = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.InterfaceC11728i
    public void onStateChanged(LifecycleOwner lifecycleOwner, AbstractC11719f.EnumC11720a enumC11720a) {
        if (enumC11720a != AbstractC11719f.EnumC11720a.ON_DESTROY) {
            return;
        }
        if (f51425c == 0) {
            m70500a();
        }
        if (f51425c == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f51429b.getSystemService("input_method");
            try {
                Object obj = f51426d.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f51427e.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f51428f.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (ClassCastException unused2) {
                    } catch (IllegalAccessException unused3) {
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
