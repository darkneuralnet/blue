package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p000.C32514Dw1;
import p000.C34386Lw1;
/* renamed from: Lb6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C34202Lb6 extends C49933uc6 {

    /* renamed from: b */
    public static final Class<?> f21747b;

    /* renamed from: c */
    public static final Constructor<?> f21748c;

    /* renamed from: d */
    public static final Method f21749d;

    /* renamed from: e */
    public static final Method f21750e;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f21748c = constructor;
        f21747b = cls;
        f21749d = method2;
        f21750e = method;
    }

    /* renamed from: k */
    public static boolean m96601k(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f21749d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: l */
    public static Typeface m96600l(Object obj) {
        try {
            Object newInstance = Array.newInstance(f21747b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f21750e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static boolean m96599m() {
        Method method = f21749d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        if (method != null) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static Object m96598n() {
        try {
            return f21748c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // p000.C49933uc6
    /* renamed from: b */
    public Typeface mo9961b(Context context, C32514Dw1.C1671c c1671c, Resources resources, int i) {
        C32514Dw1.C1672d[] m109610a;
        Object m96598n = m96598n();
        if (m96598n == null) {
            return null;
        }
        for (C32514Dw1.C1672d c1672d : c1671c.m109610a()) {
            ByteBuffer m8372b = C50525vc6.m8372b(context, resources, c1672d.m109608b());
            if (m8372b == null || !m96601k(m96598n, m8372b, c1672d.m109607c(), c1672d.m109605e(), c1672d.m109604f())) {
                return null;
            }
        }
        return m96600l(m96598n);
    }

    @Override // p000.C49933uc6
    /* renamed from: c */
    public Typeface mo9960c(Context context, CancellationSignal cancellationSignal, C34386Lw1.C5132b[] c5132bArr, int i) {
        Object m96598n = m96598n();
        if (m96598n == null) {
            return null;
        }
        NA5 na5 = new NA5();
        for (C34386Lw1.C5132b c5132b : c5132bArr) {
            Uri m96108d = c5132b.m96108d();
            ByteBuffer byteBuffer = (ByteBuffer) na5.get(m96108d);
            if (byteBuffer == null) {
                byteBuffer = C50525vc6.m8368f(context, cancellationSignal, m96108d);
                na5.put(m96108d, byteBuffer);
            }
            if (byteBuffer == null || !m96601k(m96598n, byteBuffer, c5132b.m96109c(), c5132b.m96107e(), c5132b.m96106f())) {
                return null;
            }
        }
        Typeface m96600l = m96600l(m96598n);
        if (m96600l == null) {
            return null;
        }
        return Typeface.create(m96600l, i);
    }
}
