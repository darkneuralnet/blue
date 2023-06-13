package p000;

import com.google.android.gms.internal.clearcut.zzbn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.HQ7;
/* renamed from: TO7 */
/* loaded from: classes5.dex */
public final class TO7<FieldDescriptorType extends HQ7<FieldDescriptorType>> {

    /* renamed from: d */
    public static final TO7 f35418d = new TO7(true);

    /* renamed from: b */
    public boolean f35420b;

    /* renamed from: c */
    public boolean f35421c = false;

    /* renamed from: a */
    public final C48485s98<FieldDescriptorType, Object> f35419a = C48485s98.m14628f(16);

    private TO7() {
    }

    /* renamed from: f */
    public static int m83691f(EnumC44659li8 enumC44659li8, int i, Object obj) {
        int m51446B0 = zzbn.m51446B0(i);
        if (enumC44659li8 == EnumC44659li8.f96615m) {
            C37975aT7.m71324i((H28) obj);
            m51446B0 <<= 1;
        }
        return m51446B0 + m83682o(enumC44659li8, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
        if ((r3 instanceof p000.InterfaceC46887pT7) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
        if ((r3 instanceof byte[]) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        if ((r3 instanceof p000.C48683sV7) == false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0047  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m83687j(EnumC44659li8 enumC44659li8, Object obj) {
        C37975aT7.m71332a(obj);
        boolean z = true;
        boolean z2 = false;
        switch (C48629sP7.f108748a[enumC44659li8.m26926a().ordinal()]) {
            case 1:
                z = obj instanceof Integer;
                z2 = z;
                if (z2) {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                return;
            case 2:
                z = obj instanceof Long;
                z2 = z;
                if (z2) {
                }
                break;
            case 3:
                z = obj instanceof Float;
                z2 = z;
                if (z2) {
                }
                break;
            case 4:
                z = obj instanceof Double;
                z2 = z;
                if (z2) {
                }
                break;
            case 5:
                z = obj instanceof Boolean;
                z2 = z;
                if (z2) {
                }
                break;
            case 6:
                z = obj instanceof String;
                z2 = z;
                if (z2) {
                }
                break;
            case 7:
                if (!(obj instanceof TD7)) {
                    break;
                }
                z2 = z;
                if (z2) {
                }
                break;
            case 8:
                if (!(obj instanceof Integer)) {
                    break;
                }
                z2 = z;
                if (z2) {
                }
                break;
            case 9:
                if (!(obj instanceof H28)) {
                    break;
                }
                z2 = z;
                if (z2) {
                }
                break;
            default:
                if (z2) {
                }
                break;
        }
    }

    /* renamed from: k */
    public static <T extends HQ7<T>> TO7<T> m83686k() {
        return f35418d;
    }

    /* renamed from: n */
    public static int m83683n(HQ7<?> hq7, Object obj) {
        EnumC44659li8 mo51542i3 = hq7.mo51542i3();
        int zzc = hq7.zzc();
        if (hq7.mo51540z()) {
            int i = 0;
            List<Object> list = (List) obj;
            if (hq7.mo51545A()) {
                for (Object obj2 : list) {
                    i += m83682o(mo51542i3, obj2);
                }
                return zzbn.m51446B0(zzc) + i + zzbn.m51433J0(i);
            }
            for (Object obj3 : list) {
                i += m83691f(mo51542i3, zzc, obj3);
            }
            return i;
        }
        return m83691f(mo51542i3, zzc, obj);
    }

    /* renamed from: o */
    public static int m83682o(EnumC44659li8 enumC44659li8, Object obj) {
        switch (C48629sP7.f108749b[enumC44659li8.ordinal()]) {
            case 1:
                return zzbn.m51393w(((Double) obj).doubleValue());
            case 2:
                return zzbn.m51391x(((Float) obj).floatValue());
            case 3:
                return zzbn.m51417e0(((Long) obj).longValue());
            case 4:
                return zzbn.m51412h0(((Long) obj).longValue());
            case 5:
                return zzbn.m51444C0(((Integer) obj).intValue());
            case 6:
                return zzbn.m51403p0(((Long) obj).longValue());
            case 7:
                return zzbn.m51438F0(((Integer) obj).intValue());
            case 8:
                return zzbn.m51439F(((Boolean) obj).booleanValue());
            case 9:
                return zzbn.m51422Z((H28) obj);
            case 10:
                return obj instanceof C48683sV7 ? zzbn.m51418e((C48683sV7) obj) : zzbn.m51428R((H28) obj);
            case 11:
                return obj instanceof TD7 ? zzbn.m51443D((TD7) obj) : zzbn.m51401q0((String) obj);
            case 12:
                return obj instanceof TD7 ? zzbn.m51443D((TD7) obj) : zzbn.m51421a0((byte[]) obj);
            case 13:
                return zzbn.m51442D0(((Integer) obj).intValue());
            case 14:
                return zzbn.m51437G0(((Integer) obj).intValue());
            case 15:
                return zzbn.m51399s0(((Long) obj).longValue());
            case 16:
                return zzbn.m51440E0(((Integer) obj).intValue());
            case 17:
                return zzbn.m51406l0(((Long) obj).longValue());
            case 18:
                return obj instanceof InterfaceC46887pT7 ? zzbn.m51435H0(((InterfaceC46887pT7) obj).zzc()) : zzbn.m51435H0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: p */
    public static boolean m83681p(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.mo51543V() == EnumC31936Bj8.MESSAGE) {
            boolean mo51540z = key.mo51540z();
            Object value = entry.getValue();
            if (mo51540z) {
                for (H28 h28 : (List) value) {
                    if (!h28.isInitialized()) {
                        return false;
                    }
                }
            } else if (!(value instanceof H28)) {
                if (value instanceof C48683sV7) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            } else if (!((H28) value).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    public static int m83679r(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (key.mo51543V() != EnumC31936Bj8.MESSAGE || key.mo51540z() || key.mo51545A()) {
            return m83683n(key, value);
        }
        boolean z = value instanceof C48683sV7;
        int zzc = entry.getKey().zzc();
        return z ? zzbn.m51447B(zzc, (C48683sV7) value) : zzbn.m51423Y(zzc, (H28) value);
    }

    /* renamed from: s */
    public static Object m83678s(Object obj) {
        if (obj instanceof D48) {
            return ((D48) obj).m110965k1();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    /* renamed from: a */
    public final Iterator<Map.Entry<FieldDescriptorType, Object>> m83696a() {
        return this.f35421c ? new C42763iW7(this.f35419a.m14620n().iterator()) : this.f35419a.m14620n().iterator();
    }

    /* renamed from: b */
    public final boolean m83695b() {
        return this.f35419a.isEmpty();
    }

    /* renamed from: c */
    public final boolean m83694c() {
        return this.f35420b;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        TO7 to7 = new TO7();
        for (int i = 0; i < this.f35419a.m14622l(); i++) {
            Map.Entry<FieldDescriptorType, Object> m14627g = this.f35419a.m14627g(i);
            to7.m83688i(m14627g.getKey(), m14627g.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f35419a.m14621m()) {
            to7.m83688i(entry.getKey(), entry.getValue());
        }
        to7.f35421c = this.f35421c;
        return to7;
    }

    /* renamed from: d */
    public final boolean m83693d() {
        for (int i = 0; i < this.f35419a.m14622l(); i++) {
            if (!m83681p(this.f35419a.m14627g(i))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f35419a.m14621m()) {
            if (!m83681p(entry)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final Iterator<Map.Entry<FieldDescriptorType, Object>> m83692e() {
        return this.f35421c ? new C42763iW7(this.f35419a.entrySet().iterator()) : this.f35419a.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TO7) {
            return this.f35419a.equals(((TO7) obj).f35419a);
        }
        return false;
    }

    /* renamed from: g */
    public final Object m83690g(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f35419a.get(fielddescriptortype);
        return obj instanceof C48683sV7 ? C48683sV7.m14124e() : obj;
    }

    /* renamed from: h */
    public final void m83689h(TO7<FieldDescriptorType> to7) {
        for (int i = 0; i < to7.f35419a.m14622l(); i++) {
            m83680q(to7.f35419a.m14627g(i));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : to7.f35419a.m14621m()) {
            m83680q(entry);
        }
    }

    public final int hashCode() {
        return this.f35419a.hashCode();
    }

    /* renamed from: i */
    public final void m83688i(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.mo51540z()) {
            m83687j(fielddescriptortype.mo51542i3(), obj);
        } else if (!(obj instanceof List)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                m83687j(fielddescriptortype.mo51542i3(), obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof C48683sV7) {
            this.f35421c = true;
        }
        this.f35419a.put(fielddescriptortype, obj);
    }

    /* renamed from: l */
    public final int m83685l() {
        int i = 0;
        for (int i2 = 0; i2 < this.f35419a.m14622l(); i2++) {
            Map.Entry<FieldDescriptorType, Object> m14627g = this.f35419a.m14627g(i2);
            i += m83683n(m14627g.getKey(), m14627g.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f35419a.m14621m()) {
            i += m83683n(entry.getKey(), entry.getValue());
        }
        return i;
    }

    /* renamed from: m */
    public final int m83684m() {
        int i = 0;
        for (int i2 = 0; i2 < this.f35419a.m14622l(); i2++) {
            i += m83679r(this.f35419a.m14627g(i2));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f35419a.m14621m()) {
            i += m83679r(entry);
        }
        return i;
    }

    /* renamed from: q */
    public final void m83680q(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C48683sV7) {
            value = C48683sV7.m14124e();
        }
        if (key.mo51540z()) {
            Object m83690g = m83690g(key);
            if (m83690g == null) {
                m83690g = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) m83690g).add(m83678s(obj));
            }
            this.f35419a.put(key, m83690g);
        } else if (key.mo51543V() != EnumC31936Bj8.MESSAGE) {
            this.f35419a.put(key, m83678s(value));
        } else {
            Object m83690g2 = m83690g(key);
            if (m83690g2 == null) {
                this.f35419a.put(key, m83678s(value));
            } else {
                this.f35419a.put(key, m83690g2 instanceof D48 ? key.mo51544I((D48) m83690g2, (D48) value) : key.mo51541t3(((H28) m83690g2).mo51556l(), (H28) value).mo51552L1());
            }
        }
    }

    /* renamed from: t */
    public final void m83677t() {
        if (this.f35420b) {
            return;
        }
        this.f35419a.mo14617q();
        this.f35420b = true;
    }

    public TO7(boolean z) {
        m83677t();
    }
}
