package p000;

import com.google.android.gms.internal.places.zzaj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.InterfaceC44828lz7;
/* renamed from: Gx7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33231Gx7<FieldDescriptorType extends InterfaceC44828lz7<FieldDescriptorType>> {

    /* renamed from: d */
    public static final C33231Gx7 f12663d = new C33231Gx7(true);

    /* renamed from: b */
    public boolean f12665b;

    /* renamed from: c */
    public boolean f12666c = false;

    /* renamed from: a */
    public final ZY7<FieldDescriptorType, Object> f12664a = ZY7.m72953c(16);

    private C33231Gx7() {
    }

    /* renamed from: f */
    public static <T extends InterfaceC44828lz7<T>> C33231Gx7<T> m104563f() {
        return f12663d;
    }

    /* renamed from: h */
    public static int m104561h(EnumC49068t88 enumC49068t88, int i, Object obj) {
        int m51070v0 = zzaj.m51070v0(i);
        if (enumC49068t88 == EnumC49068t88.f109930m) {
            C44389lF7.m27611i((InterfaceC52815zT7) obj);
            m51070v0 <<= 1;
        }
        return m51070v0 + m104555n(enumC49068t88, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
        if ((r3 instanceof p000.JH7) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
        if ((r3 instanceof byte[]) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        if ((r3 instanceof p000.TK7) == false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0047  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m104557l(EnumC49068t88 enumC49068t88, Object obj) {
        C44389lF7.m27619a(obj);
        boolean z = true;
        boolean z2 = false;
        switch (C35796Rw7.f32927a[enumC49068t88.m13007a().ordinal()]) {
            case 1:
                z = obj instanceof Integer;
                z2 = z;
                if (!z2) {
                    return;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 2:
                z = obj instanceof Long;
                z2 = z;
                if (!z2) {
                }
                break;
            case 3:
                z = obj instanceof Float;
                z2 = z;
                if (!z2) {
                }
                break;
            case 4:
                z = obj instanceof Double;
                z2 = z;
                if (!z2) {
                }
                break;
            case 5:
                z = obj instanceof Boolean;
                z2 = z;
                if (!z2) {
                }
                break;
            case 6:
                z = obj instanceof String;
                z2 = z;
                if (!z2) {
                }
                break;
            case 7:
                if (!(obj instanceof AbstractC43604jv9)) {
                    break;
                }
                z2 = z;
                if (!z2) {
                }
                break;
            case 8:
                if (!(obj instanceof Integer)) {
                    break;
                }
                z2 = z;
                if (!z2) {
                }
                break;
            case 9:
                if (!(obj instanceof InterfaceC52815zT7)) {
                    break;
                }
                z2 = z;
                if (!z2) {
                }
                break;
            default:
                if (!z2) {
                }
                break;
        }
    }

    /* renamed from: m */
    public static int m104556m(InterfaceC44828lz7<?> interfaceC44828lz7, Object obj) {
        EnumC49068t88 m26560A = interfaceC44828lz7.m26560A();
        int m26554z = interfaceC44828lz7.m26554z();
        if (interfaceC44828lz7.m26557O()) {
            int i = 0;
            if (interfaceC44828lz7.m26556Z0()) {
                for (Object obj2 : (List) obj) {
                    i += m104555n(m26560A, obj2);
                }
                return zzaj.m51070v0(m26554z) + i + zzaj.m51117D0(i);
            }
            for (Object obj3 : (List) obj) {
                i += m104561h(m26560A, m26554z, obj3);
            }
            return i;
        }
        return m104561h(m26560A, m26554z, obj);
    }

    /* renamed from: n */
    public static int m104555n(EnumC49068t88 enumC49068t88, Object obj) {
        switch (C35796Rw7.f32928b[enumC49068t88.ordinal()]) {
            case 1:
                return zzaj.m51078q(((Double) obj).doubleValue());
            case 2:
                return zzaj.m51107R(((Float) obj).floatValue());
            case 3:
                return zzaj.m51102Y(((Long) obj).longValue());
            case 4:
                return zzaj.m51099b0(((Long) obj).longValue());
            case 5:
                return zzaj.m51068w0(((Integer) obj).intValue());
            case 6:
                return zzaj.m51086i0(((Long) obj).longValue());
            case 7:
                return zzaj.m51063z0(((Integer) obj).intValue());
            case 8:
                return zzaj.m51111K(((Boolean) obj).booleanValue());
            case 9:
                return zzaj.m51104U((InterfaceC52815zT7) obj);
            case 10:
                if (obj instanceof TK7) {
                    return zzaj.m51095e((TK7) obj);
                }
                return zzaj.m51112J((InterfaceC52815zT7) obj);
            case 11:
                if (obj instanceof AbstractC43604jv9) {
                    return zzaj.m51067x((AbstractC43604jv9) obj);
                }
                return zzaj.m51082n0((String) obj);
            case 12:
                if (obj instanceof AbstractC43604jv9) {
                    return zzaj.m51067x((AbstractC43604jv9) obj);
                }
                return zzaj.m51110L((byte[]) obj);
            case 13:
                return zzaj.m51066x0(((Integer) obj).intValue());
            case 14:
                return zzaj.m51120A0(((Integer) obj).intValue());
            case 15:
                return zzaj.m51084k0(((Long) obj).longValue());
            case 16:
                return zzaj.m51064y0(((Integer) obj).intValue());
            case 17:
                return zzaj.m51092f0(((Long) obj).longValue());
            case 18:
                if (obj instanceof JH7) {
                    return zzaj.m51119B0(((JH7) obj).m100729z());
                }
                return zzaj.m51119B0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: o */
    public static boolean m104554o(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.m26558C() == EnumC52286ya8.MESSAGE) {
            if (key.m26557O()) {
                for (InterfaceC52815zT7 interfaceC52815zT7 : (List) entry.getValue()) {
                    if (!interfaceC52815zT7.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof InterfaceC52815zT7) {
                    if (!((InterfaceC52815zT7) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof TK7) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: q */
    public static int m104552q(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (key.m26558C() == EnumC52286ya8.MESSAGE && !key.m26557O() && !key.m26556Z0()) {
            if (value instanceof TK7) {
                return zzaj.m51072u(entry.getKey().m26554z(), (TK7) value);
            }
            return zzaj.m51071v(entry.getKey().m26554z(), (InterfaceC52815zT7) value);
        }
        return m104556m(key, value);
    }

    /* renamed from: r */
    public static Object m104551r(Object obj) {
        if (obj instanceof NU7) {
            return ((NU7) obj).m93853Y1();
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
    public final Iterator<Map.Entry<FieldDescriptorType, Object>> m104568a() {
        if (this.f12666c) {
            return new C49788uM7(this.f12664a.m72943m().iterator());
        }
        return this.f12664a.m72943m().iterator();
    }

    /* renamed from: b */
    public final boolean m104567b() {
        return this.f12665b;
    }

    /* renamed from: c */
    public final boolean m104566c() {
        for (int i = 0; i < this.f12664a.m72945k(); i++) {
            if (!m104554o(this.f12664a.m72952d(i))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f12664a.m72944l()) {
            if (!m104554o(entry)) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        C33231Gx7 c33231Gx7 = new C33231Gx7();
        for (int i = 0; i < this.f12664a.m72945k(); i++) {
            Map.Entry<FieldDescriptorType, Object> m72952d = this.f12664a.m72952d(i);
            c33231Gx7.m104558k(m72952d.getKey(), m72952d.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f12664a.m72944l()) {
            c33231Gx7.m104558k(entry.getKey(), entry.getValue());
        }
        c33231Gx7.f12666c = this.f12666c;
        return c33231Gx7;
    }

    /* renamed from: d */
    public final Iterator<Map.Entry<FieldDescriptorType, Object>> m104565d() {
        if (this.f12666c) {
            return new C49788uM7(this.f12664a.entrySet().iterator());
        }
        return this.f12664a.entrySet().iterator();
    }

    /* renamed from: e */
    public final void m104564e() {
        if (this.f12665b) {
            return;
        }
        this.f12664a.mo72954b();
        this.f12665b = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33231Gx7)) {
            return false;
        }
        return this.f12664a.equals(((C33231Gx7) obj).f12664a);
    }

    /* renamed from: g */
    public final int m104562g() {
        int i = 0;
        for (int i2 = 0; i2 < this.f12664a.m72945k(); i2++) {
            i += m104552q(this.f12664a.m72952d(i2));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f12664a.m72944l()) {
            i += m104552q(entry);
        }
        return i;
    }

    public final int hashCode() {
        return this.f12664a.hashCode();
    }

    /* renamed from: i */
    public final Object m104560i(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f12664a.get(fielddescriptortype);
        if (obj instanceof TK7) {
            return TK7.m83770e();
        }
        return obj;
    }

    /* renamed from: j */
    public final void m104559j(C33231Gx7<FieldDescriptorType> c33231Gx7) {
        for (int i = 0; i < c33231Gx7.f12664a.m72945k(); i++) {
            m104553p(c33231Gx7.f12664a.m72952d(i));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : c33231Gx7.f12664a.m72944l()) {
            m104553p(entry);
        }
    }

    /* renamed from: k */
    public final void m104558k(FieldDescriptorType fielddescriptortype, Object obj) {
        if (fielddescriptortype.m26557O()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    m104557l(fielddescriptortype.m26560A(), obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            m104557l(fielddescriptortype.m26560A(), obj);
        }
        if (obj instanceof TK7) {
            this.f12666c = true;
        }
        this.f12664a.put(fielddescriptortype, obj);
    }

    /* renamed from: p */
    public final void m104553p(Map.Entry<FieldDescriptorType, Object> entry) {
        InterfaceC52815zT7 mo27252j1;
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof TK7) {
            value = TK7.m83770e();
        }
        if (key.m26557O()) {
            Object m104560i = m104560i(key);
            if (m104560i == null) {
                m104560i = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) m104560i).add(m104551r(obj));
            }
            this.f12664a.put(key, m104560i);
        } else if (key.m26558C() == EnumC52286ya8.MESSAGE) {
            Object m104560i2 = m104560i(key);
            if (m104560i2 == null) {
                this.f12664a.put(key, m104551r(value));
                return;
            }
            if (m104560i2 instanceof NU7) {
                mo27252j1 = key.m26559B2((NU7) m104560i2, (NU7) value);
            } else {
                mo27252j1 = key.m26555o1(((InterfaceC52815zT7) m104560i2).mo1331e(), (InterfaceC52815zT7) value).mo27252j1();
            }
            this.f12664a.put(key, mo27252j1);
        } else {
            this.f12664a.put(key, m104551r(value));
        }
    }

    public C33231Gx7(boolean z) {
        m104564e();
    }
}
