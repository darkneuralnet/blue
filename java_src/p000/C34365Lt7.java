package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: Lt7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34365Lt7 implements InterfaceC37164Xs7 {

    /* renamed from: b */
    public final String f22207b;

    /* renamed from: c */
    public final ArrayList f22208c;

    public C34365Lt7(String str, List list) {
        this.f22207b = str;
        ArrayList arrayList = new ArrayList();
        this.f22208c = arrayList;
        arrayList.addAll(list);
    }

    /* renamed from: a */
    public final String m96234a() {
        return this.f22207b;
    }

    /* renamed from: b */
    public final ArrayList m96233b() {
        return this.f22208c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34365Lt7)) {
            return false;
        }
        C34365Lt7 c34365Lt7 = (C34365Lt7) obj;
        String str = this.f22207b;
        if (str == null ? c34365Lt7.f22207b != null : !str.equals(c34365Lt7.f22207b)) {
            return false;
        }
        return this.f22208c.equals(c34365Lt7.f22208c);
    }

    public final int hashCode() {
        int i;
        String str = this.f22207b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return (i * 31) + this.f22208c.hashCode();
    }

    @Override // p000.InterfaceC37164Xs7
    /* renamed from: j */
    public final Iterator mo381j() {
        return null;
    }

    @Override // p000.InterfaceC37164Xs7
    /* renamed from: o */
    public final InterfaceC37164Xs7 mo380o(String str, C38159am8 c38159am8, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // p000.InterfaceC37164Xs7
    public final InterfaceC37164Xs7 zzd() {
        return this;
    }

    @Override // p000.InterfaceC37164Xs7
    public final Boolean zzg() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // p000.InterfaceC37164Xs7
    public final Double zzh() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // p000.InterfaceC37164Xs7
    public final String zzi() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }
}
