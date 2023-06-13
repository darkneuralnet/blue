package p000;

import android.annotation.SuppressLint;
import android.text.Editable;
/* renamed from: Ba1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31848Ba1 extends Editable.Factory {

    /* renamed from: a */
    public static final Object f2529a = new Object();

    /* renamed from: b */
    public static volatile Editable.Factory f2530b;

    /* renamed from: c */
    public static Class<?> f2531c;

    @SuppressLint({"PrivateApi"})
    private C31848Ba1() {
        try {
            f2531c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C31848Ba1.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f2530b == null) {
            synchronized (f2529a) {
                if (f2530b == null) {
                    f2530b = new C31848Ba1();
                }
            }
        }
        return f2530b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f2531c;
        if (cls != null) {
            return IN5.m102439c(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
