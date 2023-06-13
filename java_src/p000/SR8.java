package p000;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* renamed from: SR8 */
/* loaded from: classes5.dex */
public final class SR8 {

    /* renamed from: d */
    public static final SR8 f33678d = new SR8(true);

    /* renamed from: a */
    public final C44306l69 f33679a = new C41321g49(16);

    /* renamed from: b */
    public boolean f33680b;

    /* renamed from: c */
    public boolean f33681c;

    private SR8() {
    }

    /* renamed from: a */
    public static SR8 m85470a() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m85467d(HR8 hr8, Object obj) {
        boolean z;
        N99 zzb = hr8.zzb();
        Charset charset = XV8.f43341a;
        obj.getClass();
        N99 n99 = N99.f24206c;
        U99 u99 = U99.INT;
        switch (zzb.m94304a().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(hr8.zza()), hr8.zzb().m94304a(), obj.getClass().getName()));
            case 1:
                z = obj instanceof Long;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(hr8.zza()), hr8.zzb().m94304a(), obj.getClass().getName()));
            case 2:
                z = obj instanceof Float;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(hr8.zza()), hr8.zzb().m94304a(), obj.getClass().getName()));
            case 3:
                z = obj instanceof Double;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(hr8.zza()), hr8.zzb().m94304a(), obj.getClass().getName()));
            case 4:
                z = obj instanceof Boolean;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(hr8.zza()), hr8.zzb().m94304a(), obj.getClass().getName()));
            case 5:
                z = obj instanceof String;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(hr8.zza()), hr8.zzb().m94304a(), obj.getClass().getName()));
            case 6:
                if ((obj instanceof AbstractC40913fO8) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(hr8.zza()), hr8.zzb().m94304a(), obj.getClass().getName()));
            case 7:
                if (obj instanceof Integer) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(hr8.zza()), hr8.zzb().m94304a(), obj.getClass().getName()));
            case 8:
                if ((obj instanceof InterfaceC47814r19) || (obj instanceof NW8)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(hr8.zza()), hr8.zzb().m94304a(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(hr8.zza()), hr8.zzb().m94304a(), obj.getClass().getName()));
        }
    }

    /* renamed from: b */
    public final void m85469b() {
        if (!this.f33680b) {
            for (int i = 0; i < this.f33679a.m27853b(); i++) {
                Map.Entry m27848g = this.f33679a.m27848g(i);
                if (m27848g.getValue() instanceof AbstractC46897pU8) {
                    ((AbstractC46897pU8) m27848g.getValue()).m19198u();
                }
            }
            this.f33679a.mo27854a();
            this.f33680b = true;
        }
    }

    /* renamed from: c */
    public final void m85468c(HR8 hr8, Object obj) {
        if (hr8.zzc()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    m85467d(hr8, arrayList.get(i));
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            m85467d(hr8, obj);
        }
        if (obj instanceof NW8) {
            this.f33681c = true;
        }
        this.f33679a.put(hr8, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        SR8 sr8 = new SR8();
        for (int i = 0; i < this.f33679a.m27853b(); i++) {
            Map.Entry m27848g = this.f33679a.m27848g(i);
            sr8.m85468c((HR8) m27848g.getKey(), m27848g.getValue());
        }
        for (Map.Entry entry : this.f33679a.m27852c()) {
            sr8.m85468c((HR8) entry.getKey(), entry.getValue());
        }
        sr8.f33681c = this.f33681c;
        return sr8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SR8)) {
            return false;
        }
        return this.f33679a.equals(((SR8) obj).f33679a);
    }

    public final int hashCode() {
        return this.f33679a.hashCode();
    }

    public SR8(boolean z) {
        m85469b();
        m85469b();
    }
}
