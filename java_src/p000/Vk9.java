package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000.Pk9;
/* renamed from: Vk9 */
/* loaded from: classes6.dex */
public final class Vk9<T extends Pk9<T>> {

    /* renamed from: d */
    public static final Vk9 f39691d = new Vk9(true);

    /* renamed from: a */
    public final Ar9<T, Object> f39692a = new C44157kr9(16);

    /* renamed from: b */
    public boolean f39693b;

    /* renamed from: c */
    public boolean f39694c;

    private Vk9() {
    }

    /* renamed from: a */
    public static int m79469a(Rs9 rs9, int i, Object obj) {
        int m15507k = AbstractC48228rj9.m15507k(i);
        if (rs9 == Rs9.f32777m) {
            Fn9.m106446i((Np9) obj);
            m15507k += m15507k;
        }
        Ts9 ts9 = Ts9.INT;
        int i2 = 4;
        switch (rs9.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                i2 = 8;
                break;
            case 1:
                ((Float) obj).floatValue();
                break;
            case 2:
                i2 = AbstractC48228rj9.m15505m(((Long) obj).longValue());
                break;
            case 3:
                i2 = AbstractC48228rj9.m15505m(((Long) obj).longValue());
                break;
            case 4:
                i2 = AbstractC48228rj9.m15513e(((Integer) obj).intValue());
                break;
            case 5:
                ((Long) obj).longValue();
                i2 = 8;
                break;
            case 6:
                ((Integer) obj).intValue();
                break;
            case 7:
                ((Boolean) obj).booleanValue();
                i2 = 1;
                break;
            case 8:
                if (obj instanceof AbstractC45836nh9) {
                    i2 = AbstractC48228rj9.m15516b((AbstractC45836nh9) obj);
                    break;
                } else {
                    i2 = AbstractC48228rj9.m15508j((String) obj);
                    break;
                }
            case 9:
                i2 = AbstractC48228rj9.m15514d((Np9) obj);
                break;
            case 10:
                if (obj instanceof Vn9) {
                    i2 = AbstractC48228rj9.m15512f((Vn9) obj);
                    break;
                } else {
                    i2 = AbstractC48228rj9.m15511g((Np9) obj);
                    break;
                }
            case 11:
                if (obj instanceof AbstractC45836nh9) {
                    i2 = AbstractC48228rj9.m15516b((AbstractC45836nh9) obj);
                    break;
                } else {
                    i2 = AbstractC48228rj9.m15518O((byte[]) obj);
                    break;
                }
            case 12:
                i2 = AbstractC48228rj9.m15506l(((Integer) obj).intValue());
                break;
            case 13:
                if (obj instanceof Qm9) {
                    i2 = AbstractC48228rj9.m15513e(((Qm9) obj).zza());
                    break;
                } else {
                    i2 = AbstractC48228rj9.m15513e(((Integer) obj).intValue());
                    break;
                }
            case 14:
                ((Integer) obj).intValue();
                break;
            case 15:
                ((Long) obj).longValue();
                i2 = 8;
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                i2 = AbstractC48228rj9.m15506l((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                i2 = AbstractC48228rj9.m15505m((longValue >> 63) ^ (longValue + longValue));
                break;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return m15507k + i2;
    }

    /* renamed from: b */
    public static <T extends Pk9<T>> Vk9<T> m79468b() {
        throw null;
    }

    /* renamed from: e */
    public static void m79465e(AbstractC48228rj9 abstractC48228rj9, Rs9 rs9, int i, Object obj) throws IOException {
        if (rs9 != Rs9.f32777m) {
            abstractC48228rj9.mo15523J(i, rs9.zza());
            Ts9 ts9 = Ts9.INT;
            switch (rs9.ordinal()) {
                case 0:
                    abstractC48228rj9.mo15530C(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                    return;
                case 1:
                    abstractC48228rj9.mo15532A(Float.floatToRawIntBits(((Float) obj).floatValue()));
                    return;
                case 2:
                    abstractC48228rj9.mo15519N(((Long) obj).longValue());
                    return;
                case 3:
                    abstractC48228rj9.mo15519N(((Long) obj).longValue());
                    return;
                case 4:
                    abstractC48228rj9.mo15528E(((Integer) obj).intValue());
                    return;
                case 5:
                    abstractC48228rj9.mo15530C(((Long) obj).longValue());
                    return;
                case 6:
                    abstractC48228rj9.mo15532A(((Integer) obj).intValue());
                    return;
                case 7:
                    abstractC48228rj9.mo15498t(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                    return;
                case 8:
                    if (obj instanceof AbstractC45836nh9) {
                        abstractC48228rj9.mo15493y((AbstractC45836nh9) obj);
                        return;
                    } else {
                        abstractC48228rj9.mo15524I((String) obj);
                        return;
                    }
                case 9:
                    ((Np9) obj).mo81209j(abstractC48228rj9);
                    return;
                case 10:
                    abstractC48228rj9.mo15526G((Np9) obj);
                    return;
                case 11:
                    if (obj instanceof AbstractC45836nh9) {
                        abstractC48228rj9.mo15493y((AbstractC45836nh9) obj);
                        return;
                    }
                    byte[] bArr = (byte[]) obj;
                    abstractC48228rj9.mo15496v(bArr, 0, bArr.length);
                    return;
                case 12:
                    abstractC48228rj9.mo15521L(((Integer) obj).intValue());
                    return;
                case 13:
                    if (obj instanceof Qm9) {
                        abstractC48228rj9.mo15528E(((Qm9) obj).zza());
                        return;
                    } else {
                        abstractC48228rj9.mo15528E(((Integer) obj).intValue());
                        return;
                    }
                case 14:
                    abstractC48228rj9.mo15532A(((Integer) obj).intValue());
                    return;
                case 15:
                    abstractC48228rj9.mo15530C(((Long) obj).longValue());
                    return;
                case 16:
                    int intValue = ((Integer) obj).intValue();
                    abstractC48228rj9.mo15521L((intValue >> 31) ^ (intValue + intValue));
                    return;
                case 17:
                    long longValue = ((Long) obj).longValue();
                    abstractC48228rj9.mo15519N((longValue >> 63) ^ (longValue + longValue));
                    return;
                default:
                    return;
            }
        }
        Np9 np9 = (Np9) obj;
        Fn9.m106446i(np9);
        abstractC48228rj9.mo15523J(i, 3);
        np9.mo81209j(abstractC48228rj9);
        abstractC48228rj9.mo15523J(i, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m79464f(T t, Object obj) {
        boolean z;
        Rs9 zzb = t.zzb();
        Fn9.m106450e(obj);
        Rs9 rs9 = Rs9.f32768d;
        Ts9 ts9 = Ts9.INT;
        switch (zzb.m86249a().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.zza()), t.zzb().m86249a(), obj.getClass().getName()));
            case 1:
                z = obj instanceof Long;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.zza()), t.zzb().m86249a(), obj.getClass().getName()));
            case 2:
                z = obj instanceof Float;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.zza()), t.zzb().m86249a(), obj.getClass().getName()));
            case 3:
                z = obj instanceof Double;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.zza()), t.zzb().m86249a(), obj.getClass().getName()));
            case 4:
                z = obj instanceof Boolean;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.zza()), t.zzb().m86249a(), obj.getClass().getName()));
            case 5:
                z = obj instanceof String;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.zza()), t.zzb().m86249a(), obj.getClass().getName()));
            case 6:
                if ((obj instanceof AbstractC45836nh9) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.zza()), t.zzb().m86249a(), obj.getClass().getName()));
            case 7:
                if ((obj instanceof Integer) || (obj instanceof Qm9)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.zza()), t.zzb().m86249a(), obj.getClass().getName()));
            case 8:
                if ((obj instanceof Np9) || (obj instanceof Vn9)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.zza()), t.zzb().m86249a(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.zza()), t.zzb().m86249a(), obj.getClass().getName()));
        }
    }

    /* renamed from: c */
    public final void m79467c() {
        if (this.f39693b) {
            return;
        }
        this.f39692a.mo28370a();
        this.f39693b = true;
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        Vk9 vk9 = new Vk9();
        for (int i = 0; i < this.f39692a.m115021b(); i++) {
            Map.Entry<T, Object> m115016g = this.f39692a.m115016g(i);
            vk9.m79466d(m115016g.getKey(), m115016g.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f39692a.m115020c()) {
            vk9.m79466d(entry.getKey(), entry.getValue());
        }
        vk9.f39694c = this.f39694c;
        return vk9;
    }

    /* renamed from: d */
    public final void m79466d(T t, Object obj) {
        if (t.zzc()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    m79464f(t, arrayList.get(i));
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            m79464f(t, obj);
        }
        if (obj instanceof Vn9) {
            this.f39694c = true;
        }
        this.f39692a.put(t, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vk9)) {
            return false;
        }
        return this.f39692a.equals(((Vk9) obj).f39692a);
    }

    public final int hashCode() {
        return this.f39692a.hashCode();
    }

    public Vk9(boolean z) {
        m79467c();
        m79467c();
    }
}
