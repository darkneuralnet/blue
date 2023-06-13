package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: da9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39837da9 {

    /* renamed from: c */
    public static final C39837da9 f76815c = new C39837da9(true);

    /* renamed from: a */
    public final C47052pk9 f76816a = new C38130aj9(16);

    /* renamed from: b */
    public boolean f76817b;

    private C39837da9() {
    }

    /* renamed from: a */
    public static int m44111a(W99 w99, Object obj) {
        EnumC41152fn9 zzb = w99.zzb();
        w99.zza();
        w99.zze();
        w99.zzd();
        int i = 0;
        for (Object obj2 : (List) obj) {
            int m73703c = Z79.m73703c(202056002);
            if (zzb == EnumC41152fn9.f80694l) {
                C44007kc9.m28731i((InterfaceC47012pg9) obj2);
                m73703c += m73703c;
            }
            EnumC44710ln9 enumC44710ln9 = EnumC44710ln9.INT;
            int i2 = 4;
            switch (zzb.ordinal()) {
                case 0:
                    ((Double) obj2).doubleValue();
                    break;
                case 1:
                    ((Float) obj2).floatValue();
                    continue;
                    i += m73703c + i2;
                case 2:
                    i2 = Z79.m73701e(((Long) obj2).longValue());
                    continue;
                    i += m73703c + i2;
                case 3:
                    i2 = Z79.m73701e(((Long) obj2).longValue());
                    continue;
                    i += m73703c + i2;
                case 4:
                    i2 = Z79.m73708E(((Integer) obj2).intValue());
                    continue;
                    i += m73703c + i2;
                case 5:
                    ((Long) obj2).longValue();
                    break;
                case 6:
                    ((Integer) obj2).intValue();
                    continue;
                    i += m73703c + i2;
                case 7:
                    ((Boolean) obj2).booleanValue();
                    i2 = 1;
                    continue;
                    i += m73703c + i2;
                case 8:
                    if (obj2 instanceof T69) {
                        i2 = Z79.m73711B((T69) obj2);
                        continue;
                    } else {
                        i2 = Z79.m73704b((String) obj2);
                    }
                    i += m73703c + i2;
                case 9:
                    i2 = Z79.m73709D((InterfaceC47012pg9) obj2);
                    continue;
                    i += m73703c + i2;
                case 10:
                    if (obj2 instanceof Kc9) {
                        i2 = Z79.m73707F((Kc9) obj2);
                        continue;
                    } else {
                        i2 = Z79.m73706G((InterfaceC47012pg9) obj2);
                    }
                    i += m73703c + i2;
                case 11:
                    if (obj2 instanceof T69) {
                        i2 = Z79.m73711B((T69) obj2);
                        continue;
                    } else {
                        i2 = Z79.m73712A((byte[]) obj2);
                    }
                    i += m73703c + i2;
                case 12:
                    i2 = Z79.m73702d(((Integer) obj2).intValue());
                    continue;
                    i += m73703c + i2;
                case 13:
                    if (obj2 instanceof Ib9) {
                        i2 = Z79.m73708E(((Ib9) obj2).zza());
                        continue;
                    } else {
                        i2 = Z79.m73708E(((Integer) obj2).intValue());
                    }
                    i += m73703c + i2;
                case 14:
                    ((Integer) obj2).intValue();
                    continue;
                    i += m73703c + i2;
                case 15:
                    ((Long) obj2).longValue();
                    break;
                case 16:
                    int intValue = ((Integer) obj2).intValue();
                    i2 = Z79.m73702d((intValue >> 31) ^ (intValue + intValue));
                    continue;
                    i += m73703c + i2;
                case 17:
                    long longValue = ((Long) obj2).longValue();
                    i2 = Z79.m73701e((longValue >> 63) ^ (longValue + longValue));
                    continue;
                    i += m73703c + i2;
                default:
                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
            i2 = 8;
            i += m73703c + i2;
        }
        return i;
    }

    /* renamed from: d */
    public static C39837da9 m44108d() {
        return f76815c;
    }

    /* renamed from: n */
    public static boolean m44098n(Map.Entry entry) {
        W99 w99 = (W99) entry.getKey();
        if (w99.zzc() == EnumC44710ln9.MESSAGE) {
            w99.zze();
            for (Object obj : (List) entry.getValue()) {
                if (obj instanceof InterfaceC51161wg9) {
                    if (!((InterfaceC51161wg9) obj).zzv()) {
                        return false;
                    }
                } else if (!(obj instanceof Kc9)) {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
            return true;
        }
        return true;
    }

    /* renamed from: o */
    public static final int m44097o(Map.Entry entry) {
        W99 w99 = (W99) entry.getKey();
        Object value = entry.getValue();
        if (w99.zzc() == EnumC44710ln9.MESSAGE) {
            w99.zze();
        }
        return m44111a(w99, value);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m44096p(W99 w99, Object obj) {
        boolean z;
        EnumC41152fn9 zzb = w99.zzb();
        C44007kc9.m28735e(obj);
        EnumC41152fn9 enumC41152fn9 = EnumC41152fn9.f80685c;
        EnumC44710ln9 enumC44710ln9 = EnumC44710ln9.INT;
        switch (zzb.m40811a().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                if (z) {
                    return;
                }
                w99.zza();
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", 202056002, w99.zzb().m40811a(), obj.getClass().getName()));
            case 1:
                z = obj instanceof Long;
                if (z) {
                }
                w99.zza();
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", 202056002, w99.zzb().m40811a(), obj.getClass().getName()));
            case 2:
                z = obj instanceof Float;
                if (z) {
                }
                w99.zza();
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", 202056002, w99.zzb().m40811a(), obj.getClass().getName()));
            case 3:
                z = obj instanceof Double;
                if (z) {
                }
                w99.zza();
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", 202056002, w99.zzb().m40811a(), obj.getClass().getName()));
            case 4:
                z = obj instanceof Boolean;
                if (z) {
                }
                w99.zza();
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", 202056002, w99.zzb().m40811a(), obj.getClass().getName()));
            case 5:
                z = obj instanceof String;
                if (z) {
                }
                w99.zza();
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", 202056002, w99.zzb().m40811a(), obj.getClass().getName()));
            case 6:
                if ((obj instanceof T69) || (obj instanceof byte[])) {
                    return;
                }
                w99.zza();
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", 202056002, w99.zzb().m40811a(), obj.getClass().getName()));
            case 7:
                if ((obj instanceof Integer) || (obj instanceof Ib9)) {
                    return;
                }
                w99.zza();
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", 202056002, w99.zzb().m40811a(), obj.getClass().getName()));
            case 8:
                if ((obj instanceof InterfaceC47012pg9) || (obj instanceof Kc9)) {
                    return;
                }
                w99.zza();
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", 202056002, w99.zzb().m40811a(), obj.getClass().getName()));
            default:
                w99.zza();
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", 202056002, w99.zzb().m40811a(), obj.getClass().getName()));
        }
    }

    /* renamed from: b */
    public final int m44110b() {
        int i = 0;
        for (int i2 = 0; i2 < this.f76816a.m18843b(); i2++) {
            i += m44097o(this.f76816a.m18838g(i2));
        }
        for (Map.Entry entry : this.f76816a.m18842c()) {
            i += m44097o(entry);
        }
        return i;
    }

    /* renamed from: c */
    public final C39837da9 clone() {
        C39837da9 c39837da9 = new C39837da9();
        for (int i = 0; i < this.f76816a.m18843b(); i++) {
            Map.Entry m18838g = this.f76816a.m18838g(i);
            c39837da9.m44102j((W99) m18838g.getKey(), m18838g.getValue());
        }
        for (Map.Entry entry : this.f76816a.m18842c()) {
            c39837da9.m44102j((W99) entry.getKey(), entry.getValue());
        }
        return c39837da9;
    }

    /* renamed from: e */
    public final Object m44107e(W99 w99) {
        Object obj = this.f76816a.get(w99);
        if (!(obj instanceof Kc9)) {
            return obj;
        }
        Kc9 kc9 = (Kc9) obj;
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39837da9)) {
            return false;
        }
        return this.f76816a.equals(((C39837da9) obj).f76816a);
    }

    /* renamed from: f */
    public final Iterator m44106f() {
        return this.f76816a.entrySet().iterator();
    }

    /* renamed from: g */
    public final void m44105g(W99 w99, Object obj) {
        List list;
        m44096p(w99, obj);
        Object m44107e = m44107e(w99);
        if (m44107e == null) {
            list = new ArrayList();
            this.f76816a.put(w99, list);
        } else {
            list = (List) m44107e;
        }
        list.add(obj);
    }

    /* renamed from: h */
    public final void m44104h() {
        if (this.f76817b) {
            return;
        }
        this.f76816a.mo18844a();
        this.f76817b = true;
    }

    public final int hashCode() {
        return this.f76816a.hashCode();
    }

    /* renamed from: i */
    public final void m44103i(C39837da9 c39837da9) {
        for (int i = 0; i < c39837da9.f76816a.m18843b(); i++) {
            m44099m(c39837da9.f76816a.m18838g(i));
        }
        for (Map.Entry entry : c39837da9.f76816a.m18842c()) {
            m44099m(entry);
        }
    }

    /* renamed from: j */
    public final void m44102j(W99 w99, Object obj) {
        w99.zze();
        if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m44096p(w99, arrayList.get(i));
            }
            this.f76816a.put(w99, arrayList);
            return;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* renamed from: k */
    public final boolean m44101k() {
        return this.f76817b;
    }

    /* renamed from: l */
    public final boolean m44100l() {
        for (int i = 0; i < this.f76816a.m18843b(); i++) {
            if (!m44098n(this.f76816a.m18838g(i))) {
                return false;
            }
        }
        for (Map.Entry entry : this.f76816a.m18842c()) {
            if (!m44098n(entry)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public final void m44099m(Map.Entry entry) {
        W99 w99 = (W99) entry.getKey();
        Object value = entry.getValue();
        if (!(value instanceof Kc9)) {
            w99.zze();
            Object m44107e = m44107e(w99);
            if (m44107e == null) {
                m44107e = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) m44107e;
                if (obj instanceof InterfaceC38703bh9) {
                    obj = ((InterfaceC38703bh9) obj).zzc();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    Object obj2 = new byte[length];
                    System.arraycopy(bArr, 0, obj2, 0, length);
                    obj = obj2;
                }
                list.add(obj);
            }
            this.f76816a.put(w99, m44107e);
            return;
        }
        Kc9 kc9 = (Kc9) value;
        throw null;
    }

    public C39837da9(boolean z) {
        m44104h();
        m44104h();
    }
}
