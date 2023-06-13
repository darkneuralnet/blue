package p000;

import java.util.Iterator;
import java.util.List;
/* renamed from: nl7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45874nl7 implements InterfaceC37164Xs7 {

    /* renamed from: b */
    public final InterfaceC37164Xs7 f100475b;

    /* renamed from: c */
    public final String f100476c;

    public C45874nl7(String str) {
        this.f100475b = InterfaceC37164Xs7.f44125h0;
        this.f100476c = str;
    }

    /* renamed from: a */
    public final InterfaceC37164Xs7 m23212a() {
        return this.f100475b;
    }

    /* renamed from: b */
    public final String m23211b() {
        return this.f100476c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C45874nl7)) {
            return false;
        }
        C45874nl7 c45874nl7 = (C45874nl7) obj;
        if (this.f100476c.equals(c45874nl7.f100476c) && this.f100475b.equals(c45874nl7.f100475b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f100476c.hashCode() * 31) + this.f100475b.hashCode();
    }

    @Override // p000.InterfaceC37164Xs7
    /* renamed from: j */
    public final Iterator mo381j() {
        return null;
    }

    @Override // p000.InterfaceC37164Xs7
    /* renamed from: o */
    public final InterfaceC37164Xs7 mo380o(String str, C38159am8 c38159am8, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // p000.InterfaceC37164Xs7
    public final InterfaceC37164Xs7 zzd() {
        return new C45874nl7(this.f100476c, this.f100475b.zzd());
    }

    @Override // p000.InterfaceC37164Xs7
    public final Boolean zzg() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // p000.InterfaceC37164Xs7
    public final Double zzh() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // p000.InterfaceC37164Xs7
    public final String zzi() {
        throw new IllegalStateException("Control is not a String");
    }

    public C45874nl7(String str, InterfaceC37164Xs7 interfaceC37164Xs7) {
        this.f100475b = interfaceC37164Xs7;
        this.f100476c = str;
    }

    public C45874nl7() {
        throw null;
    }
}
