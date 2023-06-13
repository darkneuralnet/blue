package p000;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: en7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC40557en7 implements InterfaceC37164Xs7, InterfaceC33159Gp7 {

    /* renamed from: b */
    public final String f78859b;

    /* renamed from: c */
    public final Map f78860c = new HashMap();

    public AbstractC40557en7(String str) {
        this.f78859b = str;
    }

    @Override // p000.InterfaceC33159Gp7
    /* renamed from: a */
    public final InterfaceC37164Xs7 mo385a(String str) {
        if (this.f78860c.containsKey(str)) {
            return (InterfaceC37164Xs7) this.f78860c.get(str);
        }
        return InterfaceC37164Xs7.f44125h0;
    }

    @Override // p000.InterfaceC33159Gp7
    /* renamed from: b */
    public final boolean mo384b(String str) {
        return this.f78860c.containsKey(str);
    }

    @Override // p000.InterfaceC33159Gp7
    /* renamed from: c */
    public final void mo383c(String str, InterfaceC37164Xs7 interfaceC37164Xs7) {
        if (interfaceC37164Xs7 == null) {
            this.f78860c.remove(str);
        } else {
            this.f78860c.put(str, interfaceC37164Xs7);
        }
    }

    /* renamed from: d */
    public abstract InterfaceC37164Xs7 mo4521d(C38159am8 c38159am8, List list);

    /* renamed from: e */
    public final String m42554e() {
        return this.f78859b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC40557en7)) {
            return false;
        }
        AbstractC40557en7 abstractC40557en7 = (AbstractC40557en7) obj;
        String str = this.f78859b;
        if (str == null) {
            return false;
        }
        return str.equals(abstractC40557en7.f78859b);
    }

    public final int hashCode() {
        String str = this.f78859b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // p000.InterfaceC37164Xs7
    /* renamed from: j */
    public final Iterator mo381j() {
        return C36885Wn7.m77827b(this.f78860c);
    }

    @Override // p000.InterfaceC37164Xs7
    /* renamed from: o */
    public final InterfaceC37164Xs7 mo380o(String str, C38159am8 c38159am8, List list) {
        if ("toString".equals(str)) {
            return new C43019iw7(this.f78859b);
        }
        return C36885Wn7.m77828a(this, new C43019iw7(str), c38159am8, list);
    }

    @Override // p000.InterfaceC37164Xs7
    public InterfaceC37164Xs7 zzd() {
        return this;
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
        return this.f78859b;
    }
}
