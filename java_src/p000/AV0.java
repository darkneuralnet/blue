package p000;

import com.google.zxing.FormatException;
/* renamed from: AV0 */
/* loaded from: classes6.dex */
public final class AV0 extends BV0 {

    /* renamed from: b */
    public final int f634b;

    /* renamed from: c */
    public final int f635c;

    public AV0(int i, int i2, int i3) throws FormatException {
        super(i);
        if (i2 >= 0 && i2 <= 10 && i3 >= 0 && i3 <= 10) {
            this.f634b = i2;
            this.f635c = i3;
            return;
        }
        throw FormatException.m45945a();
    }

    /* renamed from: b */
    public int m115719b() {
        return this.f634b;
    }

    /* renamed from: c */
    public int m115718c() {
        return this.f635c;
    }

    /* renamed from: d */
    public boolean m115717d() {
        return this.f634b == 10;
    }

    /* renamed from: e */
    public boolean m115716e() {
        return this.f635c == 10;
    }
}
