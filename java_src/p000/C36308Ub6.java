package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import p000.C32514Dw1;
import p000.C34386Lw1;
/* renamed from: Ub6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C36308Ub6 extends C33968Kb6 {

    /* renamed from: g */
    public final Class<?> f37641g;

    /* renamed from: h */
    public final Constructor<?> f37642h;

    /* renamed from: i */
    public final Method f37643i;

    /* renamed from: j */
    public final Method f37644j;

    /* renamed from: k */
    public final Method f37645k;

    /* renamed from: l */
    public final Method f37646l;

    /* renamed from: m */
    public final Method f37647m;

    public C36308Ub6() {
        Class<?> cls;
        Constructor<?> constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = m81283y();
            constructor = m81282z(cls);
            method = m81285v(cls);
            method2 = m81284w(cls);
            method3 = m81293A(cls);
            method4 = m81286u(cls);
            method5 = mo79683x(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f37641g = cls;
        this.f37642h = constructor;
        this.f37643i = method;
        this.f37644j = method2;
        this.f37645k = method3;
        this.f37646l = method4;
        this.f37647m = method5;
    }

    /* renamed from: o */
    private Object m81292o() {
        try {
            return this.f37642h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: A */
    public Method m81293A(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", new Class[0]);
    }

    @Override // p000.C33968Kb6, p000.C49933uc6
    /* renamed from: b */
    public Typeface mo9961b(Context context, C32514Dw1.C1671c c1671c, Resources resources, int i) {
        C32514Dw1.C1672d[] m109610a;
        FontVariationAxis[] fromFontVariationSettings;
        if (!m81287t()) {
            return super.mo9961b(context, c1671c, resources, i);
        }
        Object m81292o = m81292o();
        if (m81292o == null) {
            return null;
        }
        for (C32514Dw1.C1672d c1672d : c1671c.m109610a()) {
            String m109609a = c1672d.m109609a();
            int m109607c = c1672d.m109607c();
            int m109605e = c1672d.m109605e();
            boolean m109604f = c1672d.m109604f();
            fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(c1672d.m109606d());
            if (!m81290q(context, m81292o, m109609a, m109607c, m109605e, m109604f ? 1 : 0, fromFontVariationSettings)) {
                m81291p(m81292o);
                return null;
            }
        }
        if (!m81288s(m81292o)) {
            return null;
        }
        return mo79684l(m81292o);
    }

    @Override // p000.C33968Kb6, p000.C49933uc6
    /* renamed from: c */
    public Typeface mo9960c(Context context, CancellationSignal cancellationSignal, C34386Lw1.C5132b[] c5132bArr, int i) {
        Typeface mo79684l;
        Typeface.Builder weight;
        Typeface.Builder italic;
        Typeface build;
        if (c5132bArr.length < 1) {
            return null;
        }
        if (!m81287t()) {
            C34386Lw1.C5132b mo9954i = mo9954i(c5132bArr, i);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(mo9954i.m96108d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                C36074Tb6.m83349a();
                weight = C35840Sb6.m85204a(openFileDescriptor.getFileDescriptor()).setWeight(mo9954i.m96107e());
                italic = weight.setItalic(mo9954i.m96106f());
                build = italic.build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> m8366h = C50525vc6.m8366h(context, c5132bArr, cancellationSignal);
        Object m81292o = m81292o();
        if (m81292o == null) {
            return null;
        }
        boolean z = false;
        for (C34386Lw1.C5132b c5132b : c5132bArr) {
            ByteBuffer byteBuffer = m8366h.get(c5132b.m96108d());
            if (byteBuffer != null) {
                if (!m81289r(m81292o, byteBuffer, c5132b.m96109c(), c5132b.m96107e(), c5132b.m96106f() ? 1 : 0)) {
                    m81291p(m81292o);
                    return null;
                }
                z = true;
            }
        }
        if (!z) {
            m81291p(m81292o);
            return null;
        } else if (!m81288s(m81292o) || (mo79684l = mo79684l(m81292o)) == null) {
            return null;
        } else {
            return Typeface.create(mo79684l, i);
        }
    }

    @Override // p000.C49933uc6
    /* renamed from: e */
    public Typeface mo9958e(Context context, Resources resources, int i, String str, int i2) {
        if (!m81287t()) {
            return super.mo9958e(context, resources, i, str, i2);
        }
        Object m81292o = m81292o();
        if (m81292o == null) {
            return null;
        }
        if (!m81290q(context, m81292o, str, 0, -1, -1, null)) {
            m81291p(m81292o);
            return null;
        } else if (!m81288s(m81292o)) {
            return null;
        } else {
            return mo79684l(m81292o);
        }
    }

    /* renamed from: l */
    public Typeface mo79684l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f37641g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f37647m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: p */
    public final void m81291p(Object obj) {
        try {
            this.f37646l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: q */
    public final boolean m81290q(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f37643i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: r */
    public final boolean m81289r(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f37644j.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: s */
    public final boolean m81288s(Object obj) {
        try {
            return ((Boolean) this.f37645k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: t */
    public final boolean m81287t() {
        if (this.f37643i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (this.f37643i != null) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public Method m81286u(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* renamed from: v */
    public Method m81285v(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: w */
    public Method m81284w(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* renamed from: x */
    public Method mo79683x(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* renamed from: y */
    public Class<?> m81283y() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    /* renamed from: z */
    public Constructor<?> m81282z(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }
}
