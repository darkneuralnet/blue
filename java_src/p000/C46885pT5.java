package p000;
/* renamed from: pT5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46885pT5 {

    /* renamed from: a */
    public final Object f103735a;

    /* renamed from: b */
    public final C45106mT5 f103736b;

    /* renamed from: c */
    public volatile boolean f103737c = true;

    public C46885pT5(Object obj, C45106mT5 c45106mT5) {
        this.f103735a = obj;
        this.f103736b = c45106mT5;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C46885pT5)) {
            return false;
        }
        C46885pT5 c46885pT5 = (C46885pT5) obj;
        if (this.f103735a != c46885pT5.f103735a || !this.f103736b.equals(c46885pT5.f103736b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f103735a.hashCode() + this.f103736b.f98079f.hashCode();
    }
}
