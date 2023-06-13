package p000;

import com.nimbusds.jose.shaded.json.parser.ParseException;
/* renamed from: Qg2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C35413Qg2 extends AbstractC35179Pg2 {

    /* renamed from: z */
    public String f30743z;

    public C35413Qg2(int i) {
        super(i);
    }

    @Override // p000.AbstractC34945Og2
    /* renamed from: f */
    public void mo88203f() {
        int i = this.f27040g + 1;
        this.f27040g = i;
        if (i >= this.f28891y) {
            this.f27034a = (char) 26;
        } else {
            this.f27034a = this.f30743z.charAt(i);
        }
    }

    @Override // p000.AbstractC34945Og2
    /* renamed from: k */
    public void mo88202k() throws ParseException {
        int i = this.f27040g + 1;
        this.f27040g = i;
        if (i < this.f28891y) {
            this.f27034a = this.f30743z.charAt(i);
        } else {
            this.f27034a = (char) 26;
            throw new ParseException(this.f27040g - 1, 3, "EOF");
        }
    }

    @Override // p000.AbstractC34945Og2
    /* renamed from: n */
    public void mo88201n() {
        int i = this.f27040g + 1;
        this.f27040g = i;
        if (i >= this.f28891y) {
            this.f27034a = (char) 26;
        } else {
            this.f27034a = this.f30743z.charAt(i);
        }
    }

    @Override // p000.AbstractC35179Pg2
    /* renamed from: u */
    public void mo88200u(int i, int i2) {
        this.f27039f = this.f30743z.substring(i, i2);
    }

    @Override // p000.AbstractC35179Pg2
    /* renamed from: v */
    public void mo88199v(int i, int i2) {
        while (i < i2 - 1 && Character.isWhitespace(this.f30743z.charAt(i))) {
            i++;
        }
        while (true) {
            int i3 = i2 - 1;
            if (i3 <= i || !Character.isWhitespace(this.f30743z.charAt(i3))) {
                break;
            }
            i2--;
        }
        mo88200u(i, i2);
    }

    @Override // p000.AbstractC35179Pg2
    /* renamed from: w */
    public int mo88198w(char c, int i) {
        return this.f30743z.indexOf(c, i);
    }

    /* renamed from: x */
    public Object m88197x(String str) throws ParseException {
        return m88196y(str, C36583Vg2.f39457c.f78737b);
    }

    /* renamed from: y */
    public <T> T m88196y(String str, AbstractC41105fj2<T> abstractC41105fj2) throws ParseException {
        this.f27035b = abstractC41105fj2.f80494a;
        this.f30743z = str;
        this.f28891y = str.length();
        return (T) m91697d(abstractC41105fj2);
    }
}
