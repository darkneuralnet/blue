package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C18178U;
import com.google.crypto.tink.shaded.protobuf.C18225q.InterfaceC18227b;
import com.google.crypto.tink.shaded.protobuf.C18238v;
import com.google.crypto.tink.shaded.protobuf.C18248w;
import com.google.crypto.tink.shaded.protobuf.InterfaceC18149F;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.crypto.tink.shaded.protobuf.q */
/* loaded from: classes6.dex */
public final class C18225q<T extends InterfaceC18227b<T>> {

    /* renamed from: d */
    public static final C18225q f74185d = new C18225q(true);

    /* renamed from: a */
    public final C18159O<T, Object> f74186a;

    /* renamed from: b */
    public boolean f74187b;

    /* renamed from: c */
    public boolean f74188c;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.q$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C18226a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f74189a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f74190b;

        static {
            int[] iArr = new int[C18178U.EnumC18180b.values().length];
            f74190b = iArr;
            try {
                iArr[C18178U.EnumC18180b.f74089d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74190b[C18178U.EnumC18180b.f74090e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74190b[C18178U.EnumC18180b.f74091f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74190b[C18178U.EnumC18180b.f74092g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74190b[C18178U.EnumC18180b.f74093h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74190b[C18178U.EnumC18180b.f74094i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74190b[C18178U.EnumC18180b.f74095j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f74190b[C18178U.EnumC18180b.f74096k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f74190b[C18178U.EnumC18180b.f74098m.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f74190b[C18178U.EnumC18180b.f74099n.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f74190b[C18178U.EnumC18180b.f74097l.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f74190b[C18178U.EnumC18180b.f74100o.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f74190b[C18178U.EnumC18180b.f74101p.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f74190b[C18178U.EnumC18180b.f74103r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f74190b[C18178U.EnumC18180b.f74104s.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f74190b[C18178U.EnumC18180b.f74105t.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f74190b[C18178U.EnumC18180b.f74106u.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f74190b[C18178U.EnumC18180b.f74102q.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[C18178U.EnumC18185c.values().length];
            f74189a = iArr2;
            try {
                iArr2[C18178U.EnumC18185c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f74189a[C18178U.EnumC18185c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f74189a[C18178U.EnumC18185c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f74189a[C18178U.EnumC18185c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f74189a[C18178U.EnumC18185c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f74189a[C18178U.EnumC18185c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f74189a[C18178U.EnumC18185c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f74189a[C18178U.EnumC18185c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f74189a[C18178U.EnumC18185c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.q$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC18227b<T extends InterfaceC18227b<T>> extends Comparable<T> {
        /* renamed from: a0 */
        InterfaceC18149F.InterfaceC18150a mo47440a0(InterfaceC18149F.InterfaceC18150a interfaceC18150a, InterfaceC18149F interfaceC18149F);

        C18178U.EnumC18185c getLiteJavaType();

        C18178U.EnumC18180b getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();
    }

    private C18225q() {
        this.f74186a = C18159O.m47912q(16);
    }

    /* renamed from: c */
    public static Object m47515c(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    /* renamed from: d */
    public static int m47514d(C18178U.EnumC18180b enumC18180b, int i, Object obj) {
        int m48169U = CodedOutputStream.m48169U(i);
        if (enumC18180b == C18178U.EnumC18180b.f74098m) {
            m48169U *= 2;
        }
        return m48169U + m47513e(enumC18180b, obj);
    }

    /* renamed from: e */
    public static int m47513e(C18178U.EnumC18180b enumC18180b, Object obj) {
        switch (C18226a.f74190b[enumC18180b.ordinal()]) {
            case 1:
                return CodedOutputStream.m48149j(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.m48137r(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.m48126y(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.m48165Y(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.m48128w(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.m48139p(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.m48142n(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.m48156e(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.m48134t((InterfaceC18149F) obj);
            case 10:
                if (obj instanceof C18248w) {
                    return CodedOutputStream.m48196B((C18248w) obj);
                }
                return CodedOutputStream.m48188G((InterfaceC18149F) obj);
            case 11:
                if (obj instanceof AbstractC18199g) {
                    return CodedOutputStream.m48152h((AbstractC18199g) obj);
                }
                return CodedOutputStream.m48170T((String) obj);
            case 12:
                if (obj instanceof AbstractC18199g) {
                    return CodedOutputStream.m48152h((AbstractC18199g) obj);
                }
                return CodedOutputStream.m48154f((byte[]) obj);
            case 13:
                return CodedOutputStream.m48167W(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.m48178L(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.m48176N(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.m48174P(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.m48172R(((Long) obj).longValue());
            case 18:
                if (obj instanceof C18238v.InterfaceC18241c) {
                    return CodedOutputStream.m48146l(((C18238v.InterfaceC18241c) obj).getNumber());
                }
                return CodedOutputStream.m48146l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: f */
    public static int m47512f(InterfaceC18227b<?> interfaceC18227b, Object obj) {
        C18178U.EnumC18180b liteType = interfaceC18227b.getLiteType();
        int number = interfaceC18227b.getNumber();
        if (interfaceC18227b.isRepeated()) {
            int i = 0;
            if (interfaceC18227b.isPacked()) {
                for (Object obj2 : (List) obj) {
                    i += m47513e(liteType, obj2);
                }
                return CodedOutputStream.m48169U(number) + i + CodedOutputStream.m48182J(i);
            }
            for (Object obj3 : (List) obj) {
                i += m47514d(liteType, number, obj3);
            }
            return i;
        }
        return m47514d(liteType, number, obj);
    }

    /* renamed from: h */
    public static <T extends InterfaceC18227b<T>> C18225q<T> m47510h() {
        return f74185d;
    }

    /* renamed from: p */
    public static <T extends InterfaceC18227b<T>> boolean m47502p(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.getLiteJavaType() == C18178U.EnumC18185c.MESSAGE) {
            if (key.isRepeated()) {
                for (InterfaceC18149F interfaceC18149F : (List) entry.getValue()) {
                    if (!interfaceC18149F.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof InterfaceC18149F) {
                    if (!((InterfaceC18149F) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof C18248w) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: q */
    public static boolean m47501q(C18178U.EnumC18180b enumC18180b, Object obj) {
        C18238v.m47423a(obj);
        switch (C18226a.f74189a[enumC18180b.m47800a().ordinal()]) {
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
                if ((obj instanceof AbstractC18199g) || (obj instanceof byte[])) {
                    return true;
                }
                return false;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof C18238v.InterfaceC18241c)) {
                    return true;
                }
                return false;
            case 9:
                if ((obj instanceof InterfaceC18149F) || (obj instanceof C18248w)) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    /* renamed from: v */
    public static <T extends InterfaceC18227b<T>> C18225q<T> m47496v() {
        return new C18225q<>();
    }

    /* renamed from: a */
    public void m47517a(T t, Object obj) {
        List list;
        if (t.isRepeated()) {
            m47494x(t, obj);
            Object m47509i = m47509i(t);
            if (m47509i == null) {
                list = new ArrayList();
                this.f74186a.put(t, list);
            } else {
                list = (List) m47509i;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public C18225q<T> clone() {
        C18225q<T> m47496v = m47496v();
        for (int i = 0; i < this.f74186a.m47917k(); i++) {
            Map.Entry<T, Object> m47918j = this.f74186a.m47918j(i);
            m47496v.m47495w(m47918j.getKey(), m47918j.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f74186a.m47915m()) {
            m47496v.m47495w(entry.getKey(), entry.getValue());
        }
        m47496v.f74188c = this.f74188c;
        return m47496v;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18225q)) {
            return false;
        }
        return this.f74186a.equals(((C18225q) obj).f74186a);
    }

    /* renamed from: g */
    public Iterator<Map.Entry<T, Object>> m47511g() {
        if (this.f74188c) {
            return new C18248w.C18251c(this.f74186a.m47920h().iterator());
        }
        return this.f74186a.m47920h().iterator();
    }

    public int hashCode() {
        return this.f74186a.hashCode();
    }

    /* renamed from: i */
    public Object m47509i(T t) {
        Object obj = this.f74186a.get(t);
        if (obj instanceof C18248w) {
            return ((C18248w) obj).m47411f();
        }
        return obj;
    }

    /* renamed from: j */
    public int m47508j() {
        int i = 0;
        for (int i2 = 0; i2 < this.f74186a.m47917k(); i2++) {
            i += m47507k(this.f74186a.m47918j(i2));
        }
        for (Map.Entry<T, Object> entry : this.f74186a.m47915m()) {
            i += m47507k(entry);
        }
        return i;
    }

    /* renamed from: k */
    public final int m47507k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.getLiteJavaType() == C18178U.EnumC18185c.MESSAGE && !key.isRepeated() && !key.isPacked()) {
            if (value instanceof C18248w) {
                return CodedOutputStream.m48124z(entry.getKey().getNumber(), (C18248w) value);
            }
            return CodedOutputStream.m48194D(entry.getKey().getNumber(), (InterfaceC18149F) value);
        }
        return m47512f(key, value);
    }

    /* renamed from: l */
    public int m47506l() {
        int i = 0;
        for (int i2 = 0; i2 < this.f74186a.m47917k(); i2++) {
            Map.Entry<T, Object> m47918j = this.f74186a.m47918j(i2);
            i += m47512f(m47918j.getKey(), m47918j.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f74186a.m47915m()) {
            i += m47512f(entry.getKey(), entry.getValue());
        }
        return i;
    }

    /* renamed from: m */
    public boolean m47505m() {
        return this.f74186a.isEmpty();
    }

    /* renamed from: n */
    public boolean m47504n() {
        return this.f74187b;
    }

    /* renamed from: o */
    public boolean m47503o() {
        for (int i = 0; i < this.f74186a.m47917k(); i++) {
            if (!m47502p(this.f74186a.m47918j(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.f74186a.m47915m()) {
            if (!m47502p(entry)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    public Iterator<Map.Entry<T, Object>> m47500r() {
        if (this.f74188c) {
            return new C18248w.C18251c(this.f74186a.entrySet().iterator());
        }
        return this.f74186a.entrySet().iterator();
    }

    /* renamed from: s */
    public void m47499s() {
        if (this.f74187b) {
            return;
        }
        this.f74186a.mo47909p();
        this.f74187b = true;
    }

    /* renamed from: t */
    public void m47498t(C18225q<T> c18225q) {
        for (int i = 0; i < c18225q.f74186a.m47917k(); i++) {
            m47497u(c18225q.f74186a.m47918j(i));
        }
        for (Map.Entry<T, Object> entry : c18225q.f74186a.m47915m()) {
            m47497u(entry);
        }
    }

    /* renamed from: u */
    public final void m47497u(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C18248w) {
            value = ((C18248w) value).m47411f();
        }
        if (key.isRepeated()) {
            Object m47509i = m47509i(key);
            if (m47509i == null) {
                m47509i = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) m47509i).add(m47515c(obj));
            }
            this.f74186a.put(key, m47509i);
        } else if (key.getLiteJavaType() == C18178U.EnumC18185c.MESSAGE) {
            Object m47509i2 = m47509i(key);
            if (m47509i2 == null) {
                this.f74186a.put(key, m47515c(value));
                return;
            }
            this.f74186a.put(key, key.mo47440a0(((InterfaceC18149F) m47509i2).toBuilder(), (InterfaceC18149F) value).build());
        } else {
            this.f74186a.put(key, m47515c(value));
        }
    }

    /* renamed from: w */
    public void m47495w(T t, Object obj) {
        if (t.isRepeated()) {
            if (obj instanceof List) {
                ArrayList<Object> arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                for (Object obj2 : arrayList) {
                    m47494x(t, obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            m47494x(t, obj);
        }
        if (obj instanceof C18248w) {
            this.f74188c = true;
        }
        this.f74186a.put(t, obj);
    }

    /* renamed from: x */
    public final void m47494x(T t, Object obj) {
        if (m47501q(t.getLiteType(), obj)) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.getNumber()), t.getLiteType().m47800a(), obj.getClass().getName()));
    }

    public C18225q(boolean z) {
        this(C18159O.m47912q(0));
        m47499s();
    }

    public C18225q(C18159O<T, Object> c18159o) {
        this.f74186a = c18159o;
        m47499s();
    }
}
