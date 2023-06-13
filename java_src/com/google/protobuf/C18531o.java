package com.google.protobuf;

import com.google.protobuf.C18489P;
import com.google.protobuf.C18531o.InterfaceC18533b;
import com.google.protobuf.C18544t;
import com.google.protobuf.C18554u;
import com.google.protobuf.InterfaceC18462D;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.protobuf.o */
/* loaded from: classes6.dex */
public final class C18531o<T extends InterfaceC18533b<T>> {

    /* renamed from: d */
    public static final C18531o f74841d = new C18531o(true);

    /* renamed from: a */
    public final C18470K<T, Object> f74842a;

    /* renamed from: b */
    public boolean f74843b;

    /* renamed from: c */
    public boolean f74844c;

    /* renamed from: com.google.protobuf.o$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C18532a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f74845a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f74846b;

        static {
            int[] iArr = new int[C18489P.EnumC18491b.values().length];
            f74846b = iArr;
            try {
                iArr[C18489P.EnumC18491b.f74756d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74846b[C18489P.EnumC18491b.f74757e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74846b[C18489P.EnumC18491b.f74758f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74846b[C18489P.EnumC18491b.f74759g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74846b[C18489P.EnumC18491b.f74760h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74846b[C18489P.EnumC18491b.f74761i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74846b[C18489P.EnumC18491b.f74762j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f74846b[C18489P.EnumC18491b.f74763k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f74846b[C18489P.EnumC18491b.f74765m.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f74846b[C18489P.EnumC18491b.f74766n.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f74846b[C18489P.EnumC18491b.f74764l.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f74846b[C18489P.EnumC18491b.f74767o.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f74846b[C18489P.EnumC18491b.f74768p.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f74846b[C18489P.EnumC18491b.f74770r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f74846b[C18489P.EnumC18491b.f74771s.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f74846b[C18489P.EnumC18491b.f74772t.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f74846b[C18489P.EnumC18491b.f74773u.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f74846b[C18489P.EnumC18491b.f74769q.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[C18489P.EnumC18496c.values().length];
            f74845a = iArr2;
            try {
                iArr2[C18489P.EnumC18496c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f74845a[C18489P.EnumC18496c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f74845a[C18489P.EnumC18496c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f74845a[C18489P.EnumC18496c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f74845a[C18489P.EnumC18496c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f74845a[C18489P.EnumC18496c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f74845a[C18489P.EnumC18496c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f74845a[C18489P.EnumC18496c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f74845a[C18489P.EnumC18496c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* renamed from: com.google.protobuf.o$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC18533b<T extends InterfaceC18533b<T>> extends Comparable<T> {
        /* renamed from: S */
        InterfaceC18462D.InterfaceC18463a mo46018S(InterfaceC18462D.InterfaceC18463a interfaceC18463a, InterfaceC18462D interfaceC18462D);

        C18489P.EnumC18496c getLiteJavaType();

        C18489P.EnumC18491b getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();
    }

    private C18531o() {
        this.f74842a = C18470K.m46455q(16);
    }

    /* renamed from: A */
    public static void m46110A(CodedOutputStream codedOutputStream, C18489P.EnumC18491b enumC18491b, int i, Object obj) throws IOException {
        if (enumC18491b == C18489P.EnumC18491b.f74765m) {
            codedOutputStream.m46660w0(i, (InterfaceC18462D) obj);
            return;
        }
        codedOutputStream.mo46645S0(i, m46096m(enumC18491b, false));
        m46109B(codedOutputStream, enumC18491b, obj);
    }

    /* renamed from: B */
    public static void m46109B(CodedOutputStream codedOutputStream, C18489P.EnumC18491b enumC18491b, Object obj) throws IOException {
        switch (C18532a.f74846b[enumC18491b.ordinal()]) {
            case 1:
                codedOutputStream.m46674n0(((Double) obj).doubleValue());
                return;
            case 2:
                codedOutputStream.m46662v0(((Float) obj).floatValue());
                return;
            case 3:
                codedOutputStream.m46725D0(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.mo46641W0(((Long) obj).longValue());
                return;
            case 5:
                codedOutputStream.mo46652B0(((Integer) obj).intValue());
                return;
            case 6:
                codedOutputStream.mo46628t0(((Long) obj).longValue());
                return;
            case 7:
                codedOutputStream.mo46630r0(((Integer) obj).intValue());
                return;
            case 8:
                codedOutputStream.m46683h0(((Boolean) obj).booleanValue());
                return;
            case 9:
                codedOutputStream.m46656y0((InterfaceC18462D) obj);
                return;
            case 10:
                codedOutputStream.mo46650F0((InterfaceC18462D) obj);
                return;
            case 11:
                if (obj instanceof AbstractC18504e) {
                    codedOutputStream.mo46632l0((AbstractC18504e) obj);
                    return;
                } else {
                    codedOutputStream.mo46646R0((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof AbstractC18504e) {
                    codedOutputStream.mo46632l0((AbstractC18504e) obj);
                    return;
                } else {
                    codedOutputStream.m46681i0((byte[]) obj);
                    return;
                }
            case 13:
                codedOutputStream.mo46643U0(((Integer) obj).intValue());
                return;
            case 14:
                codedOutputStream.m46717J0(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.m46713L0(((Long) obj).longValue());
                return;
            case 16:
                codedOutputStream.m46709N0(((Integer) obj).intValue());
                return;
            case 17:
                codedOutputStream.m46705P0(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof C18544t.InterfaceC18547c) {
                    codedOutputStream.m46670p0(((C18544t.InterfaceC18547c) obj).getNumber());
                    return;
                } else {
                    codedOutputStream.m46670p0(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: c */
    public static Object m46106c(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    /* renamed from: d */
    public static int m46105d(C18489P.EnumC18491b enumC18491b, int i, Object obj) {
        int m46701T = CodedOutputStream.m46701T(i);
        if (enumC18491b == C18489P.EnumC18491b.f74765m) {
            m46701T *= 2;
        }
        return m46701T + m46104e(enumC18491b, obj);
    }

    /* renamed from: e */
    public static int m46104e(C18489P.EnumC18491b enumC18491b, Object obj) {
        switch (C18532a.f74846b[enumC18491b.ordinal()]) {
            case 1:
                return CodedOutputStream.m46680j(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.m46668r(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.m46657y(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.m46697X(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.m46661w(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.m46671p(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.m46675n(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.m46687e(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.m46666t((InterfaceC18462D) obj);
            case 10:
                if (obj instanceof C18554u) {
                    return CodedOutputStream.m46729B((C18554u) obj);
                }
                return CodedOutputStream.m46722G((InterfaceC18462D) obj);
            case 11:
                if (obj instanceof AbstractC18504e) {
                    return CodedOutputStream.m46684h((AbstractC18504e) obj);
                }
                return CodedOutputStream.m46702S((String) obj);
            case 12:
                if (obj instanceof AbstractC18504e) {
                    return CodedOutputStream.m46684h((AbstractC18504e) obj);
                }
                return CodedOutputStream.m46686f((byte[]) obj);
            case 13:
                return CodedOutputStream.m46699V(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.m46716K(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.m46712M(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.m46708O(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.m46704Q(((Long) obj).longValue());
            case 18:
                if (obj instanceof C18544t.InterfaceC18547c) {
                    return CodedOutputStream.m46678l(((C18544t.InterfaceC18547c) obj).getNumber());
                }
                return CodedOutputStream.m46678l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: f */
    public static int m46103f(InterfaceC18533b<?> interfaceC18533b, Object obj) {
        C18489P.EnumC18491b liteType = interfaceC18533b.getLiteType();
        int number = interfaceC18533b.getNumber();
        if (interfaceC18533b.isRepeated()) {
            int i = 0;
            if (interfaceC18533b.isPacked()) {
                for (Object obj2 : (List) obj) {
                    i += m46104e(liteType, obj2);
                }
                return CodedOutputStream.m46701T(number) + i + CodedOutputStream.m46699V(i);
            }
            for (Object obj3 : (List) obj) {
                i += m46105d(liteType, number, obj3);
            }
            return i;
        }
        return m46105d(liteType, number, obj);
    }

    /* renamed from: h */
    public static <T extends InterfaceC18533b<T>> C18531o<T> m46101h() {
        return f74841d;
    }

    /* renamed from: m */
    public static int m46096m(C18489P.EnumC18491b enumC18491b, boolean z) {
        if (z) {
            return 2;
        }
        return enumC18491b.m46340c();
    }

    /* renamed from: q */
    public static <T extends InterfaceC18533b<T>> boolean m46092q(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.getLiteJavaType() == C18489P.EnumC18496c.MESSAGE) {
            if (key.isRepeated()) {
                for (Object obj : (List) entry.getValue()) {
                    if (!m46091r(obj)) {
                        return false;
                    }
                }
                return true;
            }
            return m46091r(entry.getValue());
        }
        return true;
    }

    /* renamed from: r */
    public static boolean m46091r(Object obj) {
        if (obj instanceof InterfaceC51031wT2) {
            return ((InterfaceC51031wT2) obj).isInitialized();
        }
        if (obj instanceof C18554u) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* renamed from: s */
    public static boolean m46090s(C18489P.EnumC18491b enumC18491b, Object obj) {
        C18544t.m46000a(obj);
        switch (C18532a.f74845a[enumC18491b.m46341b().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                if ((obj instanceof AbstractC18504e) || (obj instanceof byte[])) {
                    return true;
                }
                return false;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof C18544t.InterfaceC18547c)) {
                    return true;
                }
                return false;
            case 9:
                if ((obj instanceof InterfaceC18462D) || (obj instanceof C18554u)) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    /* renamed from: x */
    public static <T extends InterfaceC18533b<T>> C18531o<T> m46085x() {
        return new C18531o<>();
    }

    /* renamed from: a */
    public void m46108a(T t, Object obj) {
        List list;
        if (t.isRepeated()) {
            m46083z(t, obj);
            Object m46100i = m46100i(t);
            if (m46100i == null) {
                list = new ArrayList();
                this.f74842a.put(t, list);
            } else {
                list = (List) m46100i;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public C18531o<T> clone() {
        C18531o<T> m46085x = m46085x();
        for (int i = 0; i < this.f74842a.m46460k(); i++) {
            Map.Entry<T, Object> m46461j = this.f74842a.m46461j(i);
            m46085x.m46084y(m46461j.getKey(), m46461j.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f74842a.m46458m()) {
            m46085x.m46084y(entry.getKey(), entry.getValue());
        }
        m46085x.f74844c = this.f74844c;
        return m46085x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18531o)) {
            return false;
        }
        return this.f74842a.equals(((C18531o) obj).f74842a);
    }

    /* renamed from: g */
    public Iterator<Map.Entry<T, Object>> m46102g() {
        if (this.f74844c) {
            return new C18554u.C18557c(this.f74842a.m46463h().iterator());
        }
        return this.f74842a.m46463h().iterator();
    }

    public int hashCode() {
        return this.f74842a.hashCode();
    }

    /* renamed from: i */
    public Object m46100i(T t) {
        Object obj = this.f74842a.get(t);
        if (obj instanceof C18554u) {
            return ((C18554u) obj).m45988f();
        }
        return obj;
    }

    /* renamed from: j */
    public int m46099j() {
        int i = 0;
        for (int i2 = 0; i2 < this.f74842a.m46460k(); i2++) {
            i += m46098k(this.f74842a.m46461j(i2));
        }
        for (Map.Entry<T, Object> entry : this.f74842a.m46458m()) {
            i += m46098k(entry);
        }
        return i;
    }

    /* renamed from: k */
    public final int m46098k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.getLiteJavaType() == C18489P.EnumC18496c.MESSAGE && !key.isRepeated() && !key.isPacked()) {
            if (value instanceof C18554u) {
                return CodedOutputStream.m46655z(entry.getKey().getNumber(), (C18554u) value);
            }
            return CodedOutputStream.m46726D(entry.getKey().getNumber(), (InterfaceC18462D) value);
        }
        return m46103f(key, value);
    }

    /* renamed from: l */
    public int m46097l() {
        int i = 0;
        for (int i2 = 0; i2 < this.f74842a.m46460k(); i2++) {
            Map.Entry<T, Object> m46461j = this.f74842a.m46461j(i2);
            i += m46103f(m46461j.getKey(), m46461j.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f74842a.m46458m()) {
            i += m46103f(entry.getKey(), entry.getValue());
        }
        return i;
    }

    /* renamed from: n */
    public boolean m46095n() {
        return this.f74842a.isEmpty();
    }

    /* renamed from: o */
    public boolean m46094o() {
        return this.f74843b;
    }

    /* renamed from: p */
    public boolean m46093p() {
        for (int i = 0; i < this.f74842a.m46460k(); i++) {
            if (!m46092q(this.f74842a.m46461j(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.f74842a.m46458m()) {
            if (!m46092q(entry)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: t */
    public Iterator<Map.Entry<T, Object>> m46089t() {
        if (this.f74844c) {
            return new C18554u.C18557c(this.f74842a.entrySet().iterator());
        }
        return this.f74842a.entrySet().iterator();
    }

    /* renamed from: u */
    public void m46088u() {
        if (this.f74843b) {
            return;
        }
        for (int i = 0; i < this.f74842a.m46460k(); i++) {
            Map.Entry<T, Object> m46461j = this.f74842a.m46461j(i);
            if (m46461j.getValue() instanceof AbstractC18536r) {
                ((AbstractC18536r) m46461j.getValue()).m46062I();
            }
        }
        this.f74842a.mo46452p();
        this.f74843b = true;
    }

    /* renamed from: v */
    public void m46087v(C18531o<T> c18531o) {
        for (int i = 0; i < c18531o.f74842a.m46460k(); i++) {
            m46086w(c18531o.f74842a.m46461j(i));
        }
        for (Map.Entry<T, Object> entry : c18531o.f74842a.m46458m()) {
            m46086w(entry);
        }
    }

    /* renamed from: w */
    public final void m46086w(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C18554u) {
            value = ((C18554u) value).m45988f();
        }
        if (key.isRepeated()) {
            Object m46100i = m46100i(key);
            if (m46100i == null) {
                m46100i = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) m46100i).add(m46106c(obj));
            }
            this.f74842a.put(key, m46100i);
        } else if (key.getLiteJavaType() == C18489P.EnumC18496c.MESSAGE) {
            Object m46100i2 = m46100i(key);
            if (m46100i2 == null) {
                this.f74842a.put(key, m46106c(value));
                return;
            }
            this.f74842a.put(key, key.mo46018S(((InterfaceC18462D) m46100i2).toBuilder(), (InterfaceC18462D) value).build());
        } else {
            this.f74842a.put(key, m46106c(value));
        }
    }

    /* renamed from: y */
    public void m46084y(T t, Object obj) {
        if (t.isRepeated()) {
            if (obj instanceof List) {
                ArrayList<Object> arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                for (Object obj2 : arrayList) {
                    m46083z(t, obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            m46083z(t, obj);
        }
        if (obj instanceof C18554u) {
            this.f74844c = true;
        }
        this.f74842a.put(t, obj);
    }

    /* renamed from: z */
    public final void m46083z(T t, Object obj) {
        if (m46090s(t.getLiteType(), obj)) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.getNumber()), t.getLiteType().m46341b(), obj.getClass().getName()));
    }

    public C18531o(boolean z) {
        this(C18470K.m46455q(0));
        m46088u();
    }

    public C18531o(C18470K<T, Object> c18470k) {
        this.f74842a = c18470k;
        m46088u();
    }
}
