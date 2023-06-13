package p000;
/* renamed from: sR8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC48648sR8 extends AbstractC42683iN8 {

    /* renamed from: d */
    public final CharSequence f108822d;

    /* renamed from: e */
    public final UO8 f108823e;

    /* renamed from: f */
    public int f108824f = 0;

    /* renamed from: g */
    public int f108825g;

    public AbstractC48648sR8(CR8 cr8, CharSequence charSequence) {
        UO8 uo8;
        uo8 = cr8.f4084a;
        this.f108823e = uo8;
        this.f108825g = Integer.MAX_VALUE;
        this.f108822d = charSequence;
    }

    @Override // p000.AbstractC42683iN8
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo14187a() {
        int mo14186c;
        int i = this.f108824f;
        while (true) {
            int i2 = this.f108824f;
            if (i2 != -1) {
                int mo14185d = mo14185d(i2);
                if (mo14185d == -1) {
                    mo14185d = this.f108822d.length();
                    this.f108824f = -1;
                    mo14186c = -1;
                } else {
                    mo14186c = mo14186c(mo14185d);
                    this.f108824f = mo14186c;
                }
                if (mo14186c == i) {
                    int i3 = mo14186c + 1;
                    this.f108824f = i3;
                    if (i3 > this.f108822d.length()) {
                        this.f108824f = -1;
                    }
                } else {
                    if (i < mo14185d) {
                        this.f108822d.charAt(i);
                    }
                    if (i < mo14185d) {
                        this.f108822d.charAt(mo14185d - 1);
                    }
                    int i4 = this.f108825g;
                    if (i4 == 1) {
                        mo14185d = this.f108822d.length();
                        this.f108824f = -1;
                        if (mo14185d > i) {
                            this.f108822d.charAt(mo14185d - 1);
                        }
                    } else {
                        this.f108825g = i4 - 1;
                    }
                    return this.f108822d.subSequence(i, mo14185d).toString();
                }
            } else {
                m34038b();
                return null;
            }
        }
    }

    /* renamed from: c */
    public abstract int mo14186c(int i);

    /* renamed from: d */
    public abstract int mo14185d(int i);
}
