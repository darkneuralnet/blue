package p000;

import java.net.URI;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* renamed from: Bp0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31982Bp0 extends AbstractC52108yH1 {
    private static final long serialVersionUID = 1;

    /* renamed from: i */
    public final URI f2921i;

    /* renamed from: j */
    public final AbstractC41085fh2 f2922j;

    /* renamed from: k */
    public final URI f2923k;

    /* renamed from: l */
    public final C3824Iy f2924l;

    /* renamed from: m */
    public final C3824Iy f2925m;

    /* renamed from: n */
    public final List<C2990Gy> f2926n;

    /* renamed from: o */
    public final String f2927o;

    public AbstractC31982Bp0(C1744E9 c1744e9, C33073Gg2 c33073Gg2, String str, Set<String> set, URI uri, AbstractC41085fh2 abstractC41085fh2, URI uri2, C3824Iy c3824Iy, C3824Iy c3824Iy2, List<C2990Gy> list, String str2, Map<String, Object> map, C3824Iy c3824Iy3) {
        super(c1744e9, c33073Gg2, str, set, map, c3824Iy3);
        this.f2921i = uri;
        this.f2922j = abstractC41085fh2;
        this.f2923k = uri2;
        this.f2924l = c3824Iy;
        this.f2925m = c3824Iy2;
        if (list != null) {
            this.f2926n = Collections.unmodifiableList(new ArrayList(list));
        } else {
            this.f2926n = null;
        }
        this.f2927o = str2;
    }

    /* renamed from: q */
    public static AbstractC41085fh2 m113455q(Map<String, Object> map) throws ParseException {
        if (map == null) {
            return null;
        }
        AbstractC41085fh2 m41023l = AbstractC41085fh2.m41023l(map);
        if (!m41023l.mo20514k()) {
            return m41023l;
        }
        throw new ParseException("Non-public key in jwk header parameter", 0);
    }

    @Override // p000.AbstractC52108yH1
    /* renamed from: i */
    public Map<String, Object> mo3722i() {
        Map<String, Object> mo3722i = super.mo3722i();
        URI uri = this.f2921i;
        if (uri != null) {
            mo3722i.put("jku", uri.toString());
        }
        AbstractC41085fh2 abstractC41085fh2 = this.f2922j;
        if (abstractC41085fh2 != null) {
            mo3722i.put("jwk", abstractC41085fh2.mo20513m());
        }
        URI uri2 = this.f2923k;
        if (uri2 != null) {
            mo3722i.put("x5u", uri2.toString());
        }
        C3824Iy c3824Iy = this.f2924l;
        if (c3824Iy != null) {
            mo3722i.put("x5t", c3824Iy.toString());
        }
        C3824Iy c3824Iy2 = this.f2925m;
        if (c3824Iy2 != null) {
            mo3722i.put("x5t#S256", c3824Iy2.toString());
        }
        List<C2990Gy> list = this.f2926n;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f2926n.size());
            for (C2990Gy c2990Gy : this.f2926n) {
                arrayList.add(c2990Gy.toString());
            }
            mo3722i.put("x5c", arrayList);
        }
        String str = this.f2927o;
        if (str != null) {
            mo3722i.put("kid", str);
        }
        return mo3722i;
    }

    /* renamed from: j */
    public AbstractC41085fh2 mo33584j() {
        return this.f2922j;
    }

    /* renamed from: k */
    public URI mo33583k() {
        return this.f2921i;
    }

    /* renamed from: l */
    public String mo33582l() {
        return this.f2927o;
    }

    /* renamed from: m */
    public List<C2990Gy> mo33581m() {
        return this.f2926n;
    }

    /* renamed from: n */
    public C3824Iy mo33580n() {
        return this.f2925m;
    }

    @Deprecated
    /* renamed from: o */
    public C3824Iy mo33579o() {
        return this.f2924l;
    }

    /* renamed from: p */
    public URI mo33578p() {
        return this.f2923k;
    }
}
