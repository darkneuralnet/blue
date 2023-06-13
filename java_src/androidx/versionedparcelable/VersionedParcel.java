package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public abstract class VersionedParcel {

    /* renamed from: a */
    public final C28385so<String, Method> f56010a;

    /* renamed from: b */
    public final C28385so<String, Method> f56011b;

    /* renamed from: c */
    public final C28385so<String, Class> f56012c;

    /* loaded from: classes.dex */
    public static class ParcelException extends RuntimeException {
    }

    public VersionedParcel(C28385so<String, Method> c28385so, C28385so<String, Method> c28385so2, C28385so<String, Class> c28385so3) {
        this.f56010a = c28385so;
        this.f56011b = c28385so2;
        this.f56012c = c28385so3;
    }

    /* renamed from: A */
    public abstract void mo65788A(byte[] bArr);

    /* renamed from: B */
    public void m65787B(byte[] bArr, int i) {
        mo65752w(i);
        mo65788A(bArr);
    }

    /* renamed from: C */
    public abstract void mo65786C(CharSequence charSequence);

    /* renamed from: D */
    public void m65785D(CharSequence charSequence, int i) {
        mo65752w(i);
        mo65786C(charSequence);
    }

    /* renamed from: E */
    public abstract void mo65784E(int i);

    /* renamed from: F */
    public void m65783F(int i, int i2) {
        mo65752w(i2);
        mo65784E(i);
    }

    /* renamed from: G */
    public abstract void mo65782G(Parcelable parcelable);

    /* renamed from: H */
    public void m65781H(Parcelable parcelable, int i) {
        mo65752w(i);
        mo65782G(parcelable);
    }

    /* renamed from: I */
    public abstract void mo65780I(String str);

    /* renamed from: J */
    public void m65779J(String str, int i) {
        mo65752w(i);
        mo65780I(str);
    }

    /* renamed from: K */
    public <T extends InterfaceC33149Go6> void m65778K(T t, VersionedParcel versionedParcel) {
        try {
            m65770e(t.getClass()).invoke(null, t, versionedParcel);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* renamed from: L */
    public void m65777L(InterfaceC33149Go6 interfaceC33149Go6) {
        if (interfaceC33149Go6 == null) {
            mo65780I(null);
            return;
        }
        m65775N(interfaceC33149Go6);
        VersionedParcel mo65773b = mo65773b();
        m65778K(interfaceC33149Go6, mo65773b);
        mo65773b.mo65774a();
    }

    /* renamed from: M */
    public void m65776M(InterfaceC33149Go6 interfaceC33149Go6, int i) {
        mo65752w(i);
        m65777L(interfaceC33149Go6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: N */
    public final void m65775N(InterfaceC33149Go6 interfaceC33149Go6) {
        try {
            mo65780I(m65772c(interfaceC33149Go6.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(interfaceC33149Go6.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    /* renamed from: a */
    public abstract void mo65774a();

    /* renamed from: b */
    public abstract VersionedParcel mo65773b();

    /* renamed from: c */
    public final Class m65772c(Class<? extends InterfaceC33149Go6> cls) throws ClassNotFoundException {
        Class cls2 = this.f56012c.get(cls.getName());
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            this.f56012c.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    /* renamed from: d */
    public final Method m65771d(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f56010a.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
            this.f56010a.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    /* renamed from: e */
    public final Method m65770e(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f56011b.get(cls.getName());
        if (method == null) {
            Class m65772c = m65772c(cls);
            System.currentTimeMillis();
            Method declaredMethod = m65772c.getDeclaredMethod("write", cls, VersionedParcel.class);
            this.f56011b.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    /* renamed from: f */
    public boolean m65769f() {
        return false;
    }

    /* renamed from: g */
    public abstract boolean mo65768g();

    /* renamed from: h */
    public boolean m65767h(boolean z, int i) {
        if (!mo65762m(i)) {
            return z;
        }
        return mo65768g();
    }

    /* renamed from: i */
    public abstract byte[] mo65766i();

    /* renamed from: j */
    public byte[] m65765j(byte[] bArr, int i) {
        if (!mo65762m(i)) {
            return bArr;
        }
        return mo65766i();
    }

    /* renamed from: k */
    public abstract CharSequence mo65764k();

    /* renamed from: l */
    public CharSequence m65763l(CharSequence charSequence, int i) {
        if (!mo65762m(i)) {
            return charSequence;
        }
        return mo65764k();
    }

    /* renamed from: m */
    public abstract boolean mo65762m(int i);

    /* renamed from: n */
    public <T extends InterfaceC33149Go6> T m65761n(String str, VersionedParcel versionedParcel) {
        try {
            return (T) m65771d(str).invoke(null, versionedParcel);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* renamed from: o */
    public abstract int mo65760o();

    /* renamed from: p */
    public int m65759p(int i, int i2) {
        if (!mo65762m(i2)) {
            return i;
        }
        return mo65760o();
    }

    /* renamed from: q */
    public abstract <T extends Parcelable> T mo65758q();

    /* renamed from: r */
    public <T extends Parcelable> T m65757r(T t, int i) {
        if (!mo65762m(i)) {
            return t;
        }
        return (T) mo65758q();
    }

    /* renamed from: s */
    public abstract String mo65756s();

    /* renamed from: t */
    public String m65755t(String str, int i) {
        if (!mo65762m(i)) {
            return str;
        }
        return mo65756s();
    }

    /* renamed from: u */
    public <T extends InterfaceC33149Go6> T m65754u() {
        String mo65756s = mo65756s();
        if (mo65756s == null) {
            return null;
        }
        return (T) m65761n(mo65756s, mo65773b());
    }

    /* renamed from: v */
    public <T extends InterfaceC33149Go6> T m65753v(T t, int i) {
        if (!mo65762m(i)) {
            return t;
        }
        return (T) m65754u();
    }

    /* renamed from: w */
    public abstract void mo65752w(int i);

    /* renamed from: x */
    public void m65751x(boolean z, boolean z2) {
    }

    /* renamed from: y */
    public abstract void mo65750y(boolean z);

    /* renamed from: z */
    public void m65749z(boolean z, int i) {
        mo65752w(i);
        mo65750y(z);
    }
}
