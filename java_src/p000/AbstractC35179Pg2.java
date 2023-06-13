package p000;

import com.nimbusds.jose.shaded.json.parser.ParseException;
import java.io.IOException;
/* renamed from: Pg2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35179Pg2 extends AbstractC34945Og2 {

    /* renamed from: y */
    public int f28891y;

    public AbstractC35179Pg2(int i) {
        super(i);
    }

    @Override // p000.AbstractC34945Og2
    /* renamed from: j */
    public void mo89939j(boolean[] zArr) throws IOException {
        int i = this.f27040g;
        m91688s(zArr);
        mo88199v(i, this.f27040g);
    }

    @Override // p000.AbstractC34945Og2
    /* renamed from: l */
    public Object mo89938l(boolean[] zArr) throws ParseException, IOException {
        int i = this.f27040g;
        mo88203f();
        m91689r();
        char c = this.f27034a;
        if (c != '.' && c != 'E' && c != 'e') {
            m91687t();
            char c2 = this.f27034a;
            if (c2 >= 0 && c2 < '~' && !zArr[c2] && c2 != 26) {
                m91688s(zArr);
                mo88199v(i, this.f27040g);
                if (this.f27043j) {
                    return this.f27039f;
                }
                throw new ParseException(this.f27040g, 1, this.f27039f);
            }
            mo88199v(i, this.f27040g);
            return m91696e(this.f27039f);
        }
        if (c == '.') {
            mo88203f();
            m91689r();
        }
        char c3 = this.f27034a;
        if (c3 != 'E' && c3 != 'e') {
            m91687t();
            char c4 = this.f27034a;
            if (c4 >= 0 && c4 < '~' && !zArr[c4] && c4 != 26) {
                m91688s(zArr);
                mo88199v(i, this.f27040g);
                if (this.f27043j) {
                    return this.f27039f;
                }
                throw new ParseException(this.f27040g, 1, this.f27039f);
            }
            mo88199v(i, this.f27040g);
            return m91698c();
        }
        this.f27037d.m91686a('E');
        mo88203f();
        char c5 = this.f27034a;
        if (c5 != '+' && c5 != '-' && (c5 < '0' || c5 > '9')) {
            m91688s(zArr);
            mo88199v(i, this.f27040g);
            if (this.f27043j) {
                if (!this.f27041h) {
                    m91699b();
                }
                return this.f27039f;
            }
            throw new ParseException(this.f27040g, 1, this.f27039f);
        }
        this.f27037d.m91686a(c5);
        mo88203f();
        m91689r();
        m91687t();
        char c6 = this.f27034a;
        if (c6 >= 0 && c6 < '~' && !zArr[c6] && c6 != 26) {
            m91688s(zArr);
            mo88199v(i, this.f27040g);
            if (this.f27043j) {
                return this.f27039f;
            }
            throw new ParseException(this.f27040g, 1, this.f27039f);
        }
        mo88199v(i, this.f27040g);
        return m91698c();
    }

    @Override // p000.AbstractC34945Og2
    /* renamed from: o */
    public void mo89937o() throws ParseException, IOException {
        if (!this.f27044k && this.f27034a == '\'') {
            if (this.f27043j) {
                mo89939j(AbstractC34945Og2.f27029t);
                return;
            }
            throw new ParseException(this.f27040g, 0, Character.valueOf(this.f27034a));
        }
        int mo88198w = mo88198w(this.f27034a, this.f27040g + 1);
        if (mo88198w != -1) {
            mo88200u(this.f27040g + 1, mo88198w);
            if (this.f27039f.indexOf(92) == -1) {
                m91700a();
                this.f27040g = mo88198w;
                mo88203f();
                return;
            }
            this.f27037d.m91685b();
            m91691p();
            return;
        }
        throw new ParseException(this.f28891y, 3, null);
    }

    /* renamed from: u */
    public abstract void mo88200u(int i, int i2);

    /* renamed from: v */
    public abstract void mo88199v(int i, int i2);

    /* renamed from: w */
    public abstract int mo88198w(char c, int i);
}
