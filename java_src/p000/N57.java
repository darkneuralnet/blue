package p000;
/* renamed from: N57 */
/* loaded from: classes5.dex */
public abstract class N57 extends AbstractC52594z57 {

    /* renamed from: d */
    public final CharSequence f24147d;

    /* renamed from: e */
    public final D57 f24148e;

    /* renamed from: f */
    public int f24149f = 0;

    /* renamed from: g */
    public int f24150g;

    public N57(O57 o57, CharSequence charSequence) {
        D57 d57;
        d57 = o57.f25635a;
        this.f24148e = d57;
        this.f24150g = Integer.MAX_VALUE;
        this.f24147d = charSequence;
    }

    @Override // p000.AbstractC52594z57
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo1832a() {
        int mo94380c;
        int i = this.f24149f;
        while (true) {
            int i2 = this.f24149f;
            if (i2 != -1) {
                int mo94379d = mo94379d(i2);
                if (mo94379d == -1) {
                    mo94379d = this.f24147d.length();
                    this.f24149f = -1;
                    mo94380c = -1;
                } else {
                    mo94380c = mo94380c(mo94379d);
                    this.f24149f = mo94380c;
                }
                if (mo94380c == i) {
                    int i3 = mo94380c + 1;
                    this.f24149f = i3;
                    if (i3 > this.f24147d.length()) {
                        this.f24149f = -1;
                    }
                } else {
                    if (i < mo94379d) {
                        this.f24147d.charAt(i);
                    }
                    if (i < mo94379d) {
                        this.f24147d.charAt(mo94379d - 1);
                    }
                    int i4 = this.f24150g;
                    if (i4 == 1) {
                        mo94379d = this.f24147d.length();
                        this.f24149f = -1;
                        if (mo94379d > i) {
                            this.f24147d.charAt(mo94379d - 1);
                        }
                    } else {
                        this.f24150g = i4 - 1;
                    }
                    return this.f24147d.subSequence(i, mo94379d).toString();
                }
            } else {
                m1831b();
                return null;
            }
        }
    }

    /* renamed from: c */
    public abstract int mo94380c(int i);

    /* renamed from: d */
    public abstract int mo94379d(int i);
}
