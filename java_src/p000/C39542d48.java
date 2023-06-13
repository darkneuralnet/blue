package p000;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
/* renamed from: d48  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39542d48 {

    /* renamed from: d */
    public static final C39542d48 f76100d = new C39542d48(true);

    /* renamed from: a */
    public final C33178Gr8 f76101a = new C46508op8(16);

    /* renamed from: b */
    public boolean f76102b;

    /* renamed from: c */
    public boolean f76103c;

    private C39542d48() {
    }

    /* renamed from: a */
    public static int m44641a(O38 o38, Object obj) {
        int mo5074e;
        int m16656A;
        EnumC50737vx8 zzd = o38.zzd();
        int zza = o38.zza();
        o38.zzg();
        int m16656A2 = AbstractC47813r18.m16656A(zza << 3);
        if (zzd == EnumC50737vx8.f114986l) {
            InterfaceC39926dj8 interfaceC39926dj8 = (InterfaceC39926dj8) obj;
            Charset charset = C32791Fa8.f9736a;
            if (!(interfaceC39926dj8 instanceof QT7)) {
                m16656A2 += m16656A2;
            } else {
                QT7 qt7 = (QT7) interfaceC39926dj8;
                throw null;
            }
        }
        EnumC33466Hx8 enumC33466Hx8 = EnumC33466Hx8.INT;
        int i = 4;
        switch (zzd.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                i = 8;
                break;
            case 1:
                ((Float) obj).floatValue();
                break;
            case 2:
                i = AbstractC47813r18.m16655B(((Long) obj).longValue());
                break;
            case 3:
                i = AbstractC47813r18.m16655B(((Long) obj).longValue());
                break;
            case 4:
                i = AbstractC47813r18.m16632w(((Integer) obj).intValue());
                break;
            case 5:
                ((Long) obj).longValue();
                i = 8;
                break;
            case 6:
                ((Integer) obj).intValue();
                break;
            case 7:
                ((Boolean) obj).booleanValue();
                i = 1;
                break;
            case 8:
                if (obj instanceof AbstractC41604gZ7) {
                    mo5074e = ((AbstractC41604gZ7) obj).mo5074e();
                    m16656A = AbstractC47813r18.m16656A(mo5074e);
                    i = m16656A + mo5074e;
                    break;
                } else {
                    i = AbstractC47813r18.m16629z((String) obj);
                    break;
                }
            case 9:
                i = ((InterfaceC39926dj8) obj).mo43831l();
                break;
            case 10:
                if (obj instanceof C51713xc8) {
                    mo5074e = ((C51713xc8) obj).m98652a();
                    m16656A = AbstractC47813r18.m16656A(mo5074e);
                    i = m16656A + mo5074e;
                    break;
                } else {
                    i = AbstractC47813r18.m16631x((InterfaceC39926dj8) obj);
                    break;
                }
            case 11:
                if (obj instanceof AbstractC41604gZ7) {
                    mo5074e = ((AbstractC41604gZ7) obj).mo5074e();
                    m16656A = AbstractC47813r18.m16656A(mo5074e);
                } else {
                    mo5074e = ((byte[]) obj).length;
                    m16656A = AbstractC47813r18.m16656A(mo5074e);
                }
                i = m16656A + mo5074e;
                break;
            case 12:
                i = AbstractC47813r18.m16656A(((Integer) obj).intValue());
                break;
            case 13:
                if (obj instanceof A88) {
                    i = AbstractC47813r18.m16632w(((A88) obj).zza());
                    break;
                } else {
                    i = AbstractC47813r18.m16632w(((Integer) obj).intValue());
                    break;
                }
            case 14:
                ((Integer) obj).intValue();
                break;
            case 15:
                ((Long) obj).longValue();
                i = 8;
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                i = AbstractC47813r18.m16656A((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                i = AbstractC47813r18.m16655B((longValue >> 63) ^ (longValue + longValue));
                break;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return m16656A2 + i;
    }

    /* renamed from: d */
    public static C39542d48 m44638d() {
        return f76100d;
    }

    /* renamed from: l */
    public static Object m44630l(Object obj) {
        if (obj instanceof InterfaceC48237rk8) {
            return ((InterfaceC48237rk8) obj).zzc();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return bArr2;
        }
        return obj;
    }

    /* renamed from: n */
    public static boolean m44628n(Map.Entry entry) {
        O38 o38 = (O38) entry.getKey();
        if (o38.zze() != EnumC33466Hx8.MESSAGE) {
            return true;
        }
        o38.zzg();
        Object value = entry.getValue();
        if (value instanceof InterfaceC48227rj8) {
            return ((InterfaceC48227rj8) value).mo15534d();
        }
        if (value instanceof C51713xc8) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* renamed from: o */
    public static final int m44627o(Map.Entry entry) {
        O38 o38 = (O38) entry.getKey();
        Object value = entry.getValue();
        if (o38.zze() == EnumC33466Hx8.MESSAGE) {
            o38.zzg();
            o38.mo64935x();
            if (value instanceof C51713xc8) {
                int m16656A = AbstractC47813r18.m16656A(((O38) entry.getKey()).zza());
                int m98652a = ((C51713xc8) value).m98652a();
                int m16656A2 = AbstractC47813r18.m16656A(m98652a) + m98652a;
                int m16656A3 = AbstractC47813r18.m16656A(24);
                int m16656A4 = AbstractC47813r18.m16656A(16);
                int m16656A5 = AbstractC47813r18.m16656A(8);
                return m16656A5 + m16656A5 + m16656A4 + m16656A + m16656A3 + m16656A2;
            }
            int m16656A6 = AbstractC47813r18.m16656A(((O38) entry.getKey()).zza());
            int m16656A7 = AbstractC47813r18.m16656A(24) + AbstractC47813r18.m16631x((InterfaceC39926dj8) value);
            int m16656A8 = AbstractC47813r18.m16656A(16);
            int m16656A9 = AbstractC47813r18.m16656A(8);
            return m16656A9 + m16656A9 + m16656A8 + m16656A6 + m16656A7;
        }
        return m44641a(o38, value);
    }

    /* renamed from: b */
    public final int m44640b() {
        int i = 0;
        for (int i2 = 0; i2 < this.f76101a.m104668b(); i2++) {
            i += m44627o(this.f76101a.m104663g(i2));
        }
        for (Map.Entry entry : this.f76101a.m104667c()) {
            i += m44627o(entry);
        }
        return i;
    }

    /* renamed from: c */
    public final C39542d48 clone() {
        C39542d48 c39542d48 = new C39542d48();
        for (int i = 0; i < this.f76101a.m104668b(); i++) {
            Map.Entry m104663g = this.f76101a.m104663g(i);
            c39542d48.m44633i((O38) m104663g.getKey(), m104663g.getValue());
        }
        for (Map.Entry entry : this.f76101a.m104667c()) {
            c39542d48.m44633i((O38) entry.getKey(), entry.getValue());
        }
        c39542d48.f76103c = this.f76103c;
        return c39542d48;
    }

    /* renamed from: e */
    public final Object m44637e(O38 o38) {
        Object obj = this.f76101a.get(o38);
        if (!(obj instanceof C51713xc8)) {
            return obj;
        }
        C51713xc8 c51713xc8 = (C51713xc8) obj;
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39542d48)) {
            return false;
        }
        return this.f76101a.equals(((C39542d48) obj).f76101a);
    }

    /* renamed from: f */
    public final Iterator m44636f() {
        if (this.f76103c) {
            return new C42820ic8(this.f76101a.entrySet().iterator());
        }
        return this.f76101a.entrySet().iterator();
    }

    /* renamed from: g */
    public final void m44635g() {
        if (!this.f76102b) {
            for (int i = 0; i < this.f76101a.m104668b(); i++) {
                Map.Entry m104663g = this.f76101a.m104663g(i);
                if (m104663g.getValue() instanceof V78) {
                    ((V78) m104663g.getValue()).m80338u();
                }
            }
            this.f76101a.mo20468a();
            this.f76102b = true;
        }
    }

    /* renamed from: h */
    public final void m44634h(C39542d48 c39542d48) {
        for (int i = 0; i < c39542d48.f76101a.m104668b(); i++) {
            m44629m(c39542d48.f76101a.m104663g(i));
        }
        for (Map.Entry entry : c39542d48.f76101a.m104667c()) {
            m44629m(entry);
        }
    }

    public final int hashCode() {
        return this.f76101a.hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        if ((r7 instanceof p000.A88) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
        if ((r7 instanceof byte[]) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        if ((r7 instanceof p000.C51713xc8) == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m44633i(O38 o38, Object obj) {
        boolean z;
        o38.zzg();
        EnumC50737vx8 zzd = o38.zzd();
        Charset charset = C32791Fa8.f9736a;
        obj.getClass();
        EnumC50737vx8 enumC50737vx8 = EnumC50737vx8.f114977c;
        EnumC33466Hx8 enumC33466Hx8 = EnumC33466Hx8.INT;
        switch (zzd.m7706a().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if (!(obj instanceof AbstractC41604gZ7)) {
                    break;
                }
                if (obj instanceof C51713xc8) {
                    this.f76103c = true;
                }
                this.f76101a.put(o38, obj);
                return;
            case 7:
                if (!(obj instanceof Integer)) {
                    break;
                }
                if (obj instanceof C51713xc8) {
                }
                this.f76101a.put(o38, obj);
                return;
            case 8:
                if (!(obj instanceof InterfaceC39926dj8)) {
                    break;
                }
                if (obj instanceof C51713xc8) {
                }
                this.f76101a.put(o38, obj);
                return;
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(o38.zza()), o38.zzd().m7706a(), obj.getClass().getName()));
        }
    }

    /* renamed from: j */
    public final boolean m44632j() {
        return this.f76102b;
    }

    /* renamed from: k */
    public final boolean m44631k() {
        for (int i = 0; i < this.f76101a.m104668b(); i++) {
            if (!m44628n(this.f76101a.m104663g(i))) {
                return false;
            }
        }
        for (Map.Entry entry : this.f76101a.m104667c()) {
            if (!m44628n(entry)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public final void m44629m(Map.Entry entry) {
        InterfaceC39926dj8 mo29321c;
        O38 o38 = (O38) entry.getKey();
        Object value = entry.getValue();
        if (!(value instanceof C51713xc8)) {
            o38.zzg();
            if (o38.zze() == EnumC33466Hx8.MESSAGE) {
                Object m44637e = m44637e(o38);
                if (m44637e == null) {
                    this.f76101a.put(o38, m44630l(value));
                    return;
                }
                if (m44637e instanceof InterfaceC48237rk8) {
                    mo29321c = o38.mo64936I1((InterfaceC48237rk8) m44637e, (InterfaceC48237rk8) value);
                } else {
                    InterfaceC35437Qi8 mo43832B = ((InterfaceC39926dj8) m44637e).mo43832B();
                    o38.mo64937B0(mo43832B, (InterfaceC39926dj8) value);
                    mo29321c = mo43832B.mo29321c();
                }
                this.f76101a.put(o38, mo29321c);
                return;
            }
            this.f76101a.put(o38, m44630l(value));
            return;
        }
        C51713xc8 c51713xc8 = (C51713xc8) value;
        throw null;
    }

    public C39542d48(boolean z) {
        m44635g();
        m44635g();
    }
}
