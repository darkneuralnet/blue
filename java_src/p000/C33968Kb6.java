package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000.C32514Dw1;
import p000.C34386Lw1;
/* renamed from: Kb6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C33968Kb6 extends C49933uc6 {

    /* renamed from: b */
    public static Class<?> f19902b = null;

    /* renamed from: c */
    public static Constructor<?> f19903c = null;

    /* renamed from: d */
    public static Method f19904d = null;

    /* renamed from: e */
    public static Method f19905e = null;

    /* renamed from: f */
    public static boolean f19906f = false;

    /* renamed from: k */
    public static boolean m98704k(Object obj, String str, int i, boolean z) {
        m98701n();
        try {
            return ((Boolean) f19904d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: l */
    public static Typeface m98703l(Object obj) {
        m98701n();
        try {
            Object newInstance = Array.newInstance(f19902b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f19905e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: n */
    public static void m98701n() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f19906f) {
            return;
        }
        f19906f = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f19903c = constructor;
        f19902b = cls;
        f19904d = method2;
        f19905e = method;
    }

    /* renamed from: o */
    public static Object m98700o() {
        m98701n();
        try {
            return f19903c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p000.C49933uc6
    /* renamed from: b */
    public Typeface mo9961b(Context context, C32514Dw1.C1671c c1671c, Resources resources, int i) {
        C32514Dw1.C1672d[] m109610a;
        Object m98700o = m98700o();
        for (C32514Dw1.C1672d c1672d : c1671c.m109610a()) {
            File m8369e = C50525vc6.m8369e(context);
            if (m8369e == null) {
                return null;
            }
            try {
                if (!C50525vc6.m8371c(m8369e, resources, c1672d.m109608b())) {
                    return null;
                }
                if (!m98704k(m98700o, m8369e.getPath(), c1672d.m109605e(), c1672d.m109604f())) {
                    return null;
                }
                m8369e.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                m8369e.delete();
            }
        }
        return m98703l(m98700o);
    }

    @Override // p000.C49933uc6
    /* renamed from: c */
    public Typeface mo9960c(Context context, CancellationSignal cancellationSignal, C34386Lw1.C5132b[] c5132bArr, int i) {
        if (c5132bArr.length < 1) {
            return null;
        }
        C34386Lw1.C5132b mo9954i = mo9954i(c5132bArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(mo9954i.m96108d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            File m98702m = m98702m(openFileDescriptor);
            if (m98702m != null && m98702m.canRead()) {
                Typeface createFromFile = Typeface.createFromFile(m98702m);
                openFileDescriptor.close();
                return createFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface mo9959d = super.mo9959d(context, fileInputStream);
            fileInputStream.close();
            openFileDescriptor.close();
            return mo9959d;
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public final File m98702m(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }
}
