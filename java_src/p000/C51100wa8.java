package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000.InterfaceC41614ga8;
/* renamed from: wa8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51100wa8<T extends InterfaceC41614ga8<T>> {

    /* renamed from: d */
    public static final C51100wa8 f116232d = new C51100wa8(true);

    /* renamed from: a */
    public final C33394Hp8<T, Object> f116233a = new C37588Zn8(16);

    /* renamed from: b */
    public boolean f116234b;

    /* renamed from: c */
    public boolean f116235c;

    private C51100wa8() {
    }

    /* renamed from: a */
    public static <T extends InterfaceC41614ga8<T>> C51100wa8<T> m6624a() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m6621d(T t, Object obj) {
        boolean z;
        EnumC39453cv8 zzb = t.zzb();
        C41051fd8.m41090e(obj);
        EnumC39453cv8 enumC39453cv8 = EnumC39453cv8.f75856c;
        EnumC47161pv8 enumC47161pv8 = EnumC47161pv8.INT;
        switch (zzb.m44814a().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.zza()), t.zzb().m44814a(), obj.getClass().getName()));
            case 1:
                z = obj instanceof Long;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.zza()), t.zzb().m44814a(), obj.getClass().getName()));
            case 2:
                z = obj instanceof Float;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.zza()), t.zzb().m44814a(), obj.getClass().getName()));
            case 3:
                z = obj instanceof Double;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.zza()), t.zzb().m44814a(), obj.getClass().getName()));
            case 4:
                z = obj instanceof Boolean;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.zza()), t.zzb().m44814a(), obj.getClass().getName()));
            case 5:
                z = obj instanceof String;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.zza()), t.zzb().m44814a(), obj.getClass().getName()));
            case 6:
                if ((obj instanceof AbstractC50836w78) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.zza()), t.zzb().m44814a(), obj.getClass().getName()));
            case 7:
                if (obj instanceof Integer) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.zza()), t.zzb().m44814a(), obj.getClass().getName()));
            case 8:
                if (obj instanceof InterfaceC34042Kj8) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.zza()), t.zzb().m44814a(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.zza()), t.zzb().m44814a(), obj.getClass().getName()));
        }
    }

    /* renamed from: b */
    public final void m6623b() {
        if (this.f116234b) {
            return;
        }
        this.f116233a.mo72486a();
        this.f116234b = true;
    }

    /* renamed from: c */
    public final void m6622c(T t, Object obj) {
        if (t.zzc()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    m6621d(t, arrayList.get(i));
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            m6621d(t, obj);
        }
        this.f116233a.put(t, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        C51100wa8 c51100wa8 = new C51100wa8();
        for (int i = 0; i < this.f116233a.m103405b(); i++) {
            Map.Entry<T, Object> m103400g = this.f116233a.m103400g(i);
            c51100wa8.m6622c(m103400g.getKey(), m103400g.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f116233a.m103404c()) {
            c51100wa8.m6622c(entry.getKey(), entry.getValue());
        }
        c51100wa8.f116235c = this.f116235c;
        return c51100wa8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C51100wa8)) {
            return false;
        }
        return this.f116233a.equals(((C51100wa8) obj).f116233a);
    }

    public final int hashCode() {
        return this.f116233a.hashCode();
    }

    public C51100wa8(boolean z) {
        m6623b();
        m6623b();
    }
}
