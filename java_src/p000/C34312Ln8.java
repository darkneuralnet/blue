package p000;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* renamed from: Ln8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34312Ln8 {

    /* renamed from: a */
    public static final Class<?> f22074a;

    /* renamed from: b */
    public static final AbstractC32467Dq8<?, ?> f22075b;

    /* renamed from: c */
    public static final AbstractC32467Dq8<?, ?> f22076c;

    /* renamed from: d */
    public static final AbstractC32467Dq8<?, ?> f22077d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f22074a = cls;
        f22075b = m96336j(false);
        f22076c = m96336j(true);
        f22077d = new C40005dr8();
    }

    /* renamed from: a */
    public static AbstractC32467Dq8<?, ?> m96345a() {
        return f22075b;
    }

    /* renamed from: b */
    public static AbstractC32467Dq8<?, ?> m96344b() {
        return f22076c;
    }

    /* renamed from: c */
    public static AbstractC32467Dq8<?, ?> m96343c() {
        return f22077d;
    }

    /* renamed from: d */
    public static <UT, UB> UB m96342d(int i, List<Integer> list, InterfaceC32341Dc8 interfaceC32341Dc8, UB ub, AbstractC32467Dq8<UT, UB> abstractC32467Dq8) {
        if (interfaceC32341Dc8 == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (interfaceC32341Dc8.zza()) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) m96341e(i, intValue, ub, abstractC32467Dq8);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return ub;
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!interfaceC32341Dc8.zza()) {
                    ub = (UB) m96341e(i, intValue2, ub, abstractC32467Dq8);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: e */
    public static <UT, UB> UB m96341e(int i, int i2, UB ub, AbstractC32467Dq8<UT, UB> abstractC32467Dq8) {
        if (ub == null) {
            ub = abstractC32467Dq8.mo43587c();
        }
        abstractC32467Dq8.mo43586d(ub, i, i2);
        return ub;
    }

    /* renamed from: f */
    public static <T, UT, UB> void m96340f(AbstractC32467Dq8<UT, UB> abstractC32467Dq8, T t, T t2) {
        abstractC32467Dq8.mo43584f(t, abstractC32467Dq8.mo43588b(abstractC32467Dq8.mo43589a(t), abstractC32467Dq8.mo43589a(t2)));
    }

    /* renamed from: g */
    public static void m96339g(Class<?> cls) {
        Class<?> cls2;
        if (!AbstractC35140Pb8.class.isAssignableFrom(cls) && (cls2 = f22074a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: h */
    public static boolean m96338h(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: i */
    public static <T> void m96337i(C49995ui8 c49995ui8, T t, T t2, long j) {
        C38229at8.m65306p(t, j, C49995ui8.m9847a(C38229at8.m65316f(t, j), C38229at8.m65316f(t2, j)));
    }

    /* renamed from: j */
    public static AbstractC32467Dq8<?, ?> m96336j(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (AbstractC32467Dq8) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }
}
