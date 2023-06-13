package p000;

import com.google.android.gms.internal.vision.zzii;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.OF8;
/* renamed from: qF8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C47355qF8<T extends OF8<T>> {

    /* renamed from: d */
    public static final C47355qF8 f104997d = new C47355qF8(true);

    /* renamed from: a */
    public final BV8<T, Object> f104998a;

    /* renamed from: b */
    public boolean f104999b;

    /* renamed from: c */
    public boolean f105000c;

    private C47355qF8() {
        this.f104998a = BV8.m113938d(16);
    }

    /* renamed from: a */
    public static int m17731a(T19 t19, int i, Object obj) {
        int m50814g0 = zzii.m50814g0(i);
        if (t19 == T19.f34662m) {
            C52124yI8.m3688g((InterfaceC44489lQ8) obj);
            m50814g0 <<= 1;
        }
        return m50814g0 + m17730b(t19, obj);
    }

    /* renamed from: b */
    public static int m17730b(T19 t19, Object obj) {
        switch (C40239eF8.f78170b[t19.ordinal()]) {
            case 1:
                return zzii.m50790z(((Double) obj).doubleValue());
            case 2:
                return zzii.m50848A(((Float) obj).floatValue());
            case 3:
                return zzii.m50818d0(((Long) obj).longValue());
            case 4:
                return zzii.m50810i0(((Long) obj).longValue());
            case 5:
                return zzii.m50808k0(((Integer) obj).intValue());
            case 6:
                return zzii.m50800r0(((Long) obj).longValue());
            case 7:
                return zzii.m50794w0(((Integer) obj).intValue());
            case 8:
                return zzii.m50832L(((Boolean) obj).booleanValue());
            case 9:
                return zzii.m50825V((InterfaceC44489lQ8) obj);
            case 10:
                if (obj instanceof MK8) {
                    return zzii.m50819d((MK8) obj);
                }
                return zzii.m50833K((InterfaceC44489lQ8) obj);
            case 11:
                if (obj instanceof AbstractC53119zy8) {
                    return zzii.m50834J((AbstractC53119zy8) obj);
                }
                return zzii.m50835I((String) obj);
            case 12:
                if (obj instanceof AbstractC53119zy8) {
                    return zzii.m50834J((AbstractC53119zy8) obj);
                }
                return zzii.m50831M((byte[]) obj);
            case 13:
                return zzii.m50803o0(((Integer) obj).intValue());
            case 14:
                return zzii.m50789z0(((Integer) obj).intValue());
            case 15:
                return zzii.m50795v0(((Long) obj).longValue());
            case 16:
                return zzii.m50799s0(((Integer) obj).intValue());
            case 17:
                return zzii.m50804n0(((Long) obj).longValue());
            case 18:
                if (obj instanceof InterfaceC45010mI8) {
                    return zzii.m50845B0(((InterfaceC45010mI8) obj).zza());
                }
                return zzii.m50845B0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: c */
    public static Object m17729c(Object obj) {
        if (obj instanceof InterfaceC39153cS8) {
            return ((InterfaceC39153cS8) obj).zza();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    /* renamed from: e */
    public static <T extends OF8<T>> C47355qF8<T> m17727e() {
        return f104997d;
    }

    /* renamed from: h */
    public static <T extends OF8<T>> boolean m17724h(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzc() == EnumC51380x29.MESSAGE) {
            if (key.zzd()) {
                for (InterfaceC44489lQ8 interfaceC44489lQ8 : (List) entry.getValue()) {
                    if (!interfaceC44489lQ8.mo50995a()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof InterfaceC44489lQ8) {
                    if (!((InterfaceC44489lQ8) value).mo50995a()) {
                        return false;
                    }
                } else if (value instanceof MK8) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: l */
    public static int m17720l(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzc() == EnumC51380x29.MESSAGE && !key.zzd() && !key.zze()) {
            if (value instanceof MK8) {
                return zzii.m50840E(entry.getKey().zza(), (MK8) value);
            }
            return zzii.m50838F(entry.getKey().zza(), (InterfaceC44489lQ8) value);
        }
        return m17719m(key, value);
    }

    /* renamed from: m */
    public static int m17719m(OF8<?> of8, Object obj) {
        T19 zzb = of8.zzb();
        int zza = of8.zza();
        if (of8.zzd()) {
            int i = 0;
            if (of8.zze()) {
                for (Object obj2 : (List) obj) {
                    i += m17730b(zzb, obj2);
                }
                return zzii.m50814g0(zza) + i + zzii.m50841D0(i);
            }
            for (Object obj3 : (List) obj) {
                i += m17731a(zzb, zza, obj3);
            }
            return i;
        }
        return m17731a(zzb, zza, obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        if ((r6 instanceof p000.InterfaceC45010mI8) == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
        if ((r6 instanceof byte[]) == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
        if ((r6 instanceof p000.MK8) == false) goto L3;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m17716p(T t, Object obj) {
        boolean z;
        T19 zzb = t.zzb();
        C52124yI8.m3691d(obj);
        switch (C40239eF8.f78169a[zzb.m84416a().ordinal()]) {
            case 1:
                z = obj instanceof Integer;
                break;
            case 2:
                z = obj instanceof Long;
                break;
            case 3:
                z = obj instanceof Float;
                break;
            case 4:
                z = obj instanceof Double;
                break;
            case 5:
                z = obj instanceof Boolean;
                break;
            case 6:
                z = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof AbstractC53119zy8)) {
                    break;
                }
                z = true;
                break;
            case 8:
                if (!(obj instanceof Integer)) {
                    break;
                }
                z = true;
                break;
            case 9:
                if (!(obj instanceof InterfaceC44489lQ8)) {
                    break;
                }
                z = true;
                break;
            default:
                z = false;
                break;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.zza()), t.zzb().m84416a(), obj.getClass().getName()));
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        C47355qF8 c47355qF8 = new C47355qF8();
        for (int i = 0; i < this.f104998a.m113933j(); i++) {
            Map.Entry<T, Object> m113935h = this.f104998a.m113935h(i);
            c47355qF8.m17725g(m113935h.getKey(), m113935h.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f104998a.m113930m()) {
            c47355qF8.m17725g(entry.getKey(), entry.getValue());
        }
        c47355qF8.f105000c = this.f105000c;
        return c47355qF8;
    }

    /* renamed from: d */
    public final Object m17728d(T t) {
        Object obj = this.f104998a.get(t);
        if (obj instanceof MK8) {
            MK8 mk8 = (MK8) obj;
            return MK8.m95437e();
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47355qF8)) {
            return false;
        }
        return this.f104998a.equals(((C47355qF8) obj).f104998a);
    }

    /* renamed from: f */
    public final void m17726f(C47355qF8<T> c47355qF8) {
        for (int i = 0; i < c47355qF8.f104998a.m113933j(); i++) {
            m17722j(c47355qF8.f104998a.m113935h(i));
        }
        for (Map.Entry<T, Object> entry : c47355qF8.f104998a.m113930m()) {
            m17722j(entry);
        }
    }

    /* renamed from: g */
    public final void m17725g(T t, Object obj) {
        if (t.zzd()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    m17716p(t, obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            m17716p(t, obj);
        }
        if (obj instanceof MK8) {
            this.f105000c = true;
        }
        this.f104998a.put(t, obj);
    }

    public final int hashCode() {
        return this.f104998a.hashCode();
    }

    /* renamed from: i */
    public final void m17723i() {
        if (this.f104999b) {
            return;
        }
        this.f104998a.mo17480e();
        this.f104999b = true;
    }

    /* renamed from: j */
    public final void m17722j(Map.Entry<T, Object> entry) {
        InterfaceC44489lQ8 mo50971x;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof MK8) {
            MK8 mk8 = (MK8) value;
            value = MK8.m95437e();
        }
        if (key.zzd()) {
            Object m17728d = m17728d(key);
            if (m17728d == null) {
                m17728d = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) m17728d).add(m17729c(obj));
            }
            this.f104998a.put(key, m17728d);
        } else if (key.zzc() == EnumC51380x29.MESSAGE) {
            Object m17728d2 = m17728d(key);
            if (m17728d2 == null) {
                this.f104998a.put(key, m17729c(value));
                return;
            }
            if (m17728d2 instanceof InterfaceC39153cS8) {
                mo50971x = key.mo50969l3((InterfaceC39153cS8) m17728d2, (InterfaceC39153cS8) value);
            } else {
                mo50971x = key.mo50968v0(((InterfaceC44489lQ8) m17728d2).mo27297d(), (InterfaceC44489lQ8) value).mo50971x();
            }
            this.f104998a.put(key, mo50971x);
        } else {
            this.f104998a.put(key, m17729c(value));
        }
    }

    /* renamed from: k */
    public final void m17721k(T t, Object obj) {
        List list;
        if (t.zzd()) {
            m17716p(t, obj);
            Object m17728d = m17728d(t);
            if (m17728d == null) {
                list = new ArrayList();
                this.f104998a.put(t, list);
            } else {
                list = (List) m17728d;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: n */
    public final boolean m17718n() {
        return this.f104999b;
    }

    /* renamed from: o */
    public final Iterator<Map.Entry<T, Object>> m17717o() {
        if (this.f105000c) {
            return new YK8(this.f104998a.entrySet().iterator());
        }
        return this.f104998a.entrySet().iterator();
    }

    /* renamed from: q */
    public final Iterator<Map.Entry<T, Object>> m17715q() {
        if (this.f105000c) {
            return new YK8(this.f104998a.m113928o().iterator());
        }
        return this.f104998a.m113928o().iterator();
    }

    /* renamed from: r */
    public final boolean m17714r() {
        for (int i = 0; i < this.f104998a.m113933j(); i++) {
            if (!m17724h(this.f104998a.m113935h(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.f104998a.m113930m()) {
            if (!m17724h(entry)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    public final int m17713s() {
        int i = 0;
        for (int i2 = 0; i2 < this.f104998a.m113933j(); i2++) {
            i += m17720l(this.f104998a.m113935h(i2));
        }
        for (Map.Entry<T, Object> entry : this.f104998a.m113930m()) {
            i += m17720l(entry);
        }
        return i;
    }

    public C47355qF8(boolean z) {
        this(BV8.m113938d(0));
        m17723i();
    }

    public C47355qF8(BV8<T, Object> bv8) {
        this.f104998a = bv8;
        m17723i();
    }
}
