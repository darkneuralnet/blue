package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: zq7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C53038zq7 implements InterfaceC37164Xs7, InterfaceC33159Gp7 {

    /* renamed from: b */
    public final Map f122316b = new HashMap();

    @Override // p000.InterfaceC33159Gp7
    /* renamed from: a */
    public final InterfaceC37164Xs7 mo385a(String str) {
        if (this.f122316b.containsKey(str)) {
            return (InterfaceC37164Xs7) this.f122316b.get(str);
        }
        return InterfaceC37164Xs7.f44125h0;
    }

    @Override // p000.InterfaceC33159Gp7
    /* renamed from: b */
    public final boolean mo384b(String str) {
        return this.f122316b.containsKey(str);
    }

    @Override // p000.InterfaceC33159Gp7
    /* renamed from: c */
    public final void mo383c(String str, InterfaceC37164Xs7 interfaceC37164Xs7) {
        if (interfaceC37164Xs7 == null) {
            this.f122316b.remove(str);
        } else {
            this.f122316b.put(str, interfaceC37164Xs7);
        }
    }

    /* renamed from: d */
    public final List m382d() {
        return new ArrayList(this.f122316b.keySet());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53038zq7)) {
            return false;
        }
        return this.f122316b.equals(((C53038zq7) obj).f122316b);
    }

    public final int hashCode() {
        return this.f122316b.hashCode();
    }

    @Override // p000.InterfaceC37164Xs7
    /* renamed from: j */
    public final Iterator mo381j() {
        return C36885Wn7.m77827b(this.f122316b);
    }

    @Override // p000.InterfaceC37164Xs7
    /* renamed from: o */
    public InterfaceC37164Xs7 mo380o(String str, C38159am8 c38159am8, List list) {
        if ("toString".equals(str)) {
            return new C43019iw7(toString());
        }
        return C36885Wn7.m77828a(this, new C43019iw7(str), c38159am8, list);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.f122316b.isEmpty()) {
            for (String str : this.f122316b.keySet()) {
                sb.append(String.format("%s: %s,", str, this.f122316b.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // p000.InterfaceC37164Xs7
    public final InterfaceC37164Xs7 zzd() {
        C53038zq7 c53038zq7 = new C53038zq7();
        for (Map.Entry entry : this.f122316b.entrySet()) {
            if (entry.getValue() instanceof InterfaceC33159Gp7) {
                c53038zq7.f122316b.put((String) entry.getKey(), (InterfaceC37164Xs7) entry.getValue());
            } else {
                c53038zq7.f122316b.put((String) entry.getKey(), ((InterfaceC37164Xs7) entry.getValue()).zzd());
            }
        }
        return c53038zq7;
    }

    @Override // p000.InterfaceC37164Xs7
    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    @Override // p000.InterfaceC37164Xs7
    public final Double zzh() {
        return Double.valueOf(Double.NaN);
    }

    @Override // p000.InterfaceC37164Xs7
    public final String zzi() {
        return "[object Object]";
    }
}
