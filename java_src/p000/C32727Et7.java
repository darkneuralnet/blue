package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
/* renamed from: Et7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32727Et7 {

    /* renamed from: d */
    public static final C32727Et7 f8277d = new C32727Et7(true);

    /* renamed from: a */
    public final C37191Xv7 f8278a = new C35553Qv7(16);

    /* renamed from: b */
    public boolean f8279b;

    /* renamed from: c */
    public boolean f8280c;

    private C32727Et7() {
    }

    /* renamed from: a */
    public static int m108249a(EnumC33690Iw7 enumC33690Iw7, int i, Object obj) {
        int m9559l = AbstractC50104ut7.m9559l(i);
        if (enumC33690Iw7 == EnumC33690Iw7.f16492m) {
            C46557ou7.m20289i((InterfaceC41230fv7) obj);
            m9559l += m9559l;
        }
        return m9559l + m108248b(enumC33690Iw7, obj);
    }

    /* renamed from: b */
    public static int m108248b(EnumC33690Iw7 enumC33690Iw7, Object obj) {
        EnumC33690Iw7 enumC33690Iw72 = EnumC33690Iw7.f16483d;
        EnumC33924Jw7 enumC33924Jw7 = EnumC33924Jw7.INT;
        switch (enumC33690Iw7.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                Logger logger = AbstractC50104ut7.f113168b;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                Logger logger2 = AbstractC50104ut7.f113168b;
                return 4;
            case 2:
                return AbstractC50104ut7.m9557n(((Long) obj).longValue());
            case 3:
                return AbstractC50104ut7.m9557n(((Long) obj).longValue());
            case 4:
                return AbstractC50104ut7.m9565f(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                Logger logger3 = AbstractC50104ut7.f113168b;
                return 8;
            case 6:
                ((Integer) obj).intValue();
                Logger logger4 = AbstractC50104ut7.f113168b;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                Logger logger5 = AbstractC50104ut7.f113168b;
                return 1;
            case 8:
                if (obj instanceof AbstractC44175kt7) {
                    return AbstractC50104ut7.m9568c((AbstractC44175kt7) obj);
                }
                return AbstractC50104ut7.m9560k((String) obj);
            case 9:
                return AbstractC50104ut7.m9566e((InterfaceC41230fv7) obj);
            case 10:
                if (obj instanceof C34374Lu7) {
                    return AbstractC50104ut7.m9564g((C34374Lu7) obj);
                }
                return AbstractC50104ut7.m9563h((InterfaceC41230fv7) obj);
            case 11:
                if (obj instanceof AbstractC44175kt7) {
                    return AbstractC50104ut7.m9568c((AbstractC44175kt7) obj);
                }
                return AbstractC50104ut7.m9569b((byte[]) obj);
            case 12:
                return AbstractC50104ut7.m9558m(((Integer) obj).intValue());
            case 13:
                if (obj instanceof InterfaceC41813gu7) {
                    return AbstractC50104ut7.m9565f(((InterfaceC41813gu7) obj).zza());
                }
                return AbstractC50104ut7.m9565f(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                Logger logger6 = AbstractC50104ut7.f113168b;
                return 4;
            case 15:
                ((Long) obj).longValue();
                Logger logger7 = AbstractC50104ut7.f113168b;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return AbstractC50104ut7.m9558m((intValue >> 31) ^ (intValue + intValue));
            case 17:
                long longValue = ((Long) obj).longValue();
                return AbstractC50104ut7.m9557n((longValue >> 63) ^ (longValue + longValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: c */
    public static int m108247c(InterfaceC32493Dt7 interfaceC32493Dt7, Object obj) {
        EnumC33690Iw7 zzd = interfaceC32493Dt7.zzd();
        int zza = interfaceC32493Dt7.zza();
        if (interfaceC32493Dt7.zzg()) {
            int i = 0;
            if (interfaceC32493Dt7.mo44848x()) {
                for (Object obj2 : (List) obj) {
                    i += m108248b(zzd, obj2);
                }
                return AbstractC50104ut7.m9559l(zza) + i + AbstractC50104ut7.m9558m(i);
            }
            for (Object obj3 : (List) obj) {
                i += m108249a(zzd, zza, obj3);
            }
            return i;
        }
        return m108249a(zzd, zza, obj);
    }

    /* renamed from: f */
    public static C32727Et7 m108244f() {
        return f8277d;
    }

    /* renamed from: l */
    public static void m108238l(AbstractC50104ut7 abstractC50104ut7, EnumC33690Iw7 enumC33690Iw7, int i, Object obj) throws IOException {
        if (enumC33690Iw7 != EnumC33690Iw7.f16492m) {
            abstractC50104ut7.mo9575M(i, enumC33690Iw7.zza());
            EnumC33924Jw7 enumC33924Jw7 = EnumC33924Jw7.INT;
            switch (enumC33690Iw7.ordinal()) {
                case 0:
                    abstractC50104ut7.mo9584D(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                    return;
                case 1:
                    abstractC50104ut7.mo9586B(Float.floatToRawIntBits(((Float) obj).floatValue()));
                    return;
                case 2:
                    abstractC50104ut7.mo9571Q(((Long) obj).longValue());
                    return;
                case 3:
                    abstractC50104ut7.mo9571Q(((Long) obj).longValue());
                    return;
                case 4:
                    abstractC50104ut7.mo9582F(((Integer) obj).intValue());
                    return;
                case 5:
                    abstractC50104ut7.mo9584D(((Long) obj).longValue());
                    return;
                case 6:
                    abstractC50104ut7.mo9586B(((Integer) obj).intValue());
                    return;
                case 7:
                    abstractC50104ut7.mo9550u(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                    return;
                case 8:
                    if (obj instanceof AbstractC44175kt7) {
                        abstractC50104ut7.mo9545z((AbstractC44175kt7) obj);
                        return;
                    } else {
                        abstractC50104ut7.mo9576L((String) obj);
                        return;
                    }
                case 9:
                    ((InterfaceC41230fv7) obj).mo190y(abstractC50104ut7);
                    return;
                case 10:
                    abstractC50104ut7.mo9580H((InterfaceC41230fv7) obj);
                    return;
                case 11:
                    if (obj instanceof AbstractC44175kt7) {
                        abstractC50104ut7.mo9545z((AbstractC44175kt7) obj);
                        return;
                    }
                    byte[] bArr = (byte[]) obj;
                    abstractC50104ut7.mo9548w(bArr, 0, bArr.length);
                    return;
                case 12:
                    abstractC50104ut7.mo9573O(((Integer) obj).intValue());
                    return;
                case 13:
                    if (obj instanceof InterfaceC41813gu7) {
                        abstractC50104ut7.mo9582F(((InterfaceC41813gu7) obj).zza());
                        return;
                    } else {
                        abstractC50104ut7.mo9582F(((Integer) obj).intValue());
                        return;
                    }
                case 14:
                    abstractC50104ut7.mo9586B(((Integer) obj).intValue());
                    return;
                case 15:
                    abstractC50104ut7.mo9584D(((Long) obj).longValue());
                    return;
                case 16:
                    int intValue = ((Integer) obj).intValue();
                    abstractC50104ut7.mo9573O((intValue >> 31) ^ (intValue + intValue));
                    return;
                case 17:
                    long longValue = ((Long) obj).longValue();
                    abstractC50104ut7.mo9571Q((longValue >> 63) ^ (longValue + longValue));
                    return;
                default:
                    return;
            }
        }
        InterfaceC41230fv7 interfaceC41230fv7 = (InterfaceC41230fv7) obj;
        C46557ou7.m20289i(interfaceC41230fv7);
        abstractC50104ut7.mo9575M(i, 3);
        interfaceC41230fv7.mo190y(abstractC50104ut7);
        abstractC50104ut7.mo9575M(i, 4);
    }

    /* renamed from: o */
    public static Object m108235o(Object obj) {
        if (obj instanceof InterfaceC32043Bv7) {
            return ((InterfaceC32043Bv7) obj).zzc();
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

    /* renamed from: q */
    public static boolean m108233q(Map.Entry entry) {
        InterfaceC32493Dt7 interfaceC32493Dt7 = (InterfaceC32493Dt7) entry.getKey();
        if (interfaceC32493Dt7.zze() == EnumC33924Jw7.MESSAGE) {
            if (interfaceC32493Dt7.zzg()) {
                for (Object obj : (List) entry.getValue()) {
                    if (!m108232r(obj)) {
                        return false;
                    }
                }
                return true;
            }
            return m108232r(entry.getValue());
        }
        return true;
    }

    /* renamed from: r */
    public static boolean m108232r(Object obj) {
        if (obj instanceof InterfaceC41823gv7) {
            return ((InterfaceC41823gv7) obj).mo37320n();
        }
        if (obj instanceof C34374Lu7) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* renamed from: s */
    public static final int m108231s(Map.Entry entry) {
        int m9558m;
        int m9558m2;
        InterfaceC32493Dt7 interfaceC32493Dt7 = (InterfaceC32493Dt7) entry.getKey();
        Object value = entry.getValue();
        if (interfaceC32493Dt7.zze() == EnumC33924Jw7.MESSAGE && !interfaceC32493Dt7.zzg() && !interfaceC32493Dt7.mo44848x()) {
            if (value instanceof C34374Lu7) {
                int zza = ((InterfaceC32493Dt7) entry.getKey()).zza();
                int m9558m3 = AbstractC50104ut7.m9558m(8);
                int m94585a = ((C34374Lu7) value).m94585a();
                m9558m = m9558m3 + m9558m3 + AbstractC50104ut7.m9558m(16) + AbstractC50104ut7.m9558m(zza);
                m9558m2 = AbstractC50104ut7.m9558m(24) + AbstractC50104ut7.m9558m(m94585a) + m94585a;
            } else {
                int zza2 = ((InterfaceC32493Dt7) entry.getKey()).zza();
                int m9558m4 = AbstractC50104ut7.m9558m(8);
                m9558m = m9558m4 + m9558m4 + AbstractC50104ut7.m9558m(16) + AbstractC50104ut7.m9558m(zza2);
                m9558m2 = AbstractC50104ut7.m9558m(24) + AbstractC50104ut7.m9563h((InterfaceC41230fv7) value);
            }
            return m9558m + m9558m2;
        }
        return m108247c(interfaceC32493Dt7, value);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m108230t(InterfaceC32493Dt7 interfaceC32493Dt7, Object obj) {
        boolean z;
        EnumC33690Iw7 zzd = interfaceC32493Dt7.zzd();
        C46557ou7.m20293e(obj);
        EnumC33690Iw7 enumC33690Iw7 = EnumC33690Iw7.f16483d;
        EnumC33924Jw7 enumC33924Jw7 = EnumC33924Jw7.INT;
        switch (zzd.m101461a().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC32493Dt7.zza()), interfaceC32493Dt7.zzd().m101461a(), obj.getClass().getName()));
            case 1:
                z = obj instanceof Long;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC32493Dt7.zza()), interfaceC32493Dt7.zzd().m101461a(), obj.getClass().getName()));
            case 2:
                z = obj instanceof Float;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC32493Dt7.zza()), interfaceC32493Dt7.zzd().m101461a(), obj.getClass().getName()));
            case 3:
                z = obj instanceof Double;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC32493Dt7.zza()), interfaceC32493Dt7.zzd().m101461a(), obj.getClass().getName()));
            case 4:
                z = obj instanceof Boolean;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC32493Dt7.zza()), interfaceC32493Dt7.zzd().m101461a(), obj.getClass().getName()));
            case 5:
                z = obj instanceof String;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC32493Dt7.zza()), interfaceC32493Dt7.zzd().m101461a(), obj.getClass().getName()));
            case 6:
                if ((obj instanceof AbstractC44175kt7) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC32493Dt7.zza()), interfaceC32493Dt7.zzd().m101461a(), obj.getClass().getName()));
            case 7:
                if ((obj instanceof Integer) || (obj instanceof InterfaceC41813gu7)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC32493Dt7.zza()), interfaceC32493Dt7.zzd().m101461a(), obj.getClass().getName()));
            case 8:
                if ((obj instanceof InterfaceC41230fv7) || (obj instanceof C34374Lu7)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC32493Dt7.zza()), interfaceC32493Dt7.zzd().m101461a(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC32493Dt7.zza()), interfaceC32493Dt7.zzd().m101461a(), obj.getClass().getName()));
        }
    }

    /* renamed from: d */
    public final int m108246d() {
        int i = 0;
        for (int i2 = 0; i2 < this.f8278a.m76096b(); i2++) {
            i += m108231s(this.f8278a.m76091g(i2));
        }
        for (Map.Entry entry : this.f8278a.m76095c()) {
            i += m108231s(entry);
        }
        return i;
    }

    /* renamed from: e */
    public final C32727Et7 clone() {
        C32727Et7 c32727Et7 = new C32727Et7();
        for (int i = 0; i < this.f8278a.m76096b(); i++) {
            Map.Entry m76091g = this.f8278a.m76091g(i);
            c32727Et7.m108239k((InterfaceC32493Dt7) m76091g.getKey(), m76091g.getValue());
        }
        for (Map.Entry entry : this.f8278a.m76095c()) {
            c32727Et7.m108239k((InterfaceC32493Dt7) entry.getKey(), entry.getValue());
        }
        c32727Et7.f8280c = this.f8280c;
        return c32727Et7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32727Et7)) {
            return false;
        }
        return this.f8278a.equals(((C32727Et7) obj).f8278a);
    }

    /* renamed from: g */
    public final Object m108243g(InterfaceC32493Dt7 interfaceC32493Dt7) {
        Object obj = this.f8278a.get(interfaceC32493Dt7);
        if (!(obj instanceof C34374Lu7)) {
            return obj;
        }
        C34374Lu7 c34374Lu7 = (C34374Lu7) obj;
        throw null;
    }

    /* renamed from: h */
    public final Iterator m108242h() {
        if (this.f8280c) {
            return new C34140Ku7(this.f8278a.entrySet().iterator());
        }
        return this.f8278a.entrySet().iterator();
    }

    public final int hashCode() {
        return this.f8278a.hashCode();
    }

    /* renamed from: i */
    public final void m108241i() {
        if (this.f8279b) {
            return;
        }
        this.f8278a.mo76097a();
        this.f8279b = true;
    }

    /* renamed from: j */
    public final void m108240j(C32727Et7 c32727Et7) {
        for (int i = 0; i < c32727Et7.f8278a.m76096b(); i++) {
            m108234p(c32727Et7.f8278a.m76091g(i));
        }
        for (Map.Entry entry : c32727Et7.f8278a.m76095c()) {
            m108234p(entry);
        }
    }

    /* renamed from: k */
    public final void m108239k(InterfaceC32493Dt7 interfaceC32493Dt7, Object obj) {
        if (interfaceC32493Dt7.zzg()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    m108230t(interfaceC32493Dt7, arrayList.get(i));
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            m108230t(interfaceC32493Dt7, obj);
        }
        if (obj instanceof C34374Lu7) {
            this.f8280c = true;
        }
        this.f8278a.put(interfaceC32493Dt7, obj);
    }

    /* renamed from: m */
    public final boolean m108237m() {
        return this.f8279b;
    }

    /* renamed from: n */
    public final boolean m108236n() {
        for (int i = 0; i < this.f8278a.m76096b(); i++) {
            if (!m108233q(this.f8278a.m76091g(i))) {
                return false;
            }
        }
        for (Map.Entry entry : this.f8278a.m76095c()) {
            if (!m108233q(entry)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    public final void m108234p(Map.Entry entry) {
        InterfaceC41230fv7 mo42381i;
        InterfaceC32493Dt7 interfaceC32493Dt7 = (InterfaceC32493Dt7) entry.getKey();
        Object value = entry.getValue();
        if (!(value instanceof C34374Lu7)) {
            if (interfaceC32493Dt7.zzg()) {
                Object m108243g = m108243g(interfaceC32493Dt7);
                if (m108243g == null) {
                    m108243g = new ArrayList();
                }
                for (Object obj : (List) value) {
                    ((List) m108243g).add(m108235o(obj));
                }
                this.f8278a.put(interfaceC32493Dt7, m108243g);
                return;
            } else if (interfaceC32493Dt7.zze() == EnumC33924Jw7.MESSAGE) {
                Object m108243g2 = m108243g(interfaceC32493Dt7);
                if (m108243g2 == null) {
                    this.f8278a.put(interfaceC32493Dt7, m108235o(value));
                    return;
                }
                if (m108243g2 instanceof InterfaceC32043Bv7) {
                    mo42381i = interfaceC32493Dt7.mo44847z0((InterfaceC32043Bv7) m108243g2, (InterfaceC32043Bv7) value);
                } else {
                    mo42381i = interfaceC32493Dt7.mo44849X(((InterfaceC41230fv7) m108243g2).mo189z(), (InterfaceC41230fv7) value).mo42381i();
                }
                this.f8278a.put(interfaceC32493Dt7, mo42381i);
                return;
            } else {
                this.f8278a.put(interfaceC32493Dt7, m108235o(value));
                return;
            }
        }
        C34374Lu7 c34374Lu7 = (C34374Lu7) value;
        throw null;
    }

    public C32727Et7(boolean z) {
        m108241i();
        m108241i();
    }
}
