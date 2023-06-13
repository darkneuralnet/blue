package p000;

import java.util.ArrayList;
import java.util.List;
/* renamed from: p01  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C46610p01 implements InterfaceC44238l01 {

    /* renamed from: d */
    public AbstractC41387gB6 f102904d;

    /* renamed from: f */
    public int f102906f;

    /* renamed from: g */
    public int f102907g;

    /* renamed from: a */
    public InterfaceC44238l01 f102901a = null;

    /* renamed from: b */
    public boolean f102902b = false;

    /* renamed from: c */
    public boolean f102903c = false;

    /* renamed from: e */
    public EnumC27118a f102905e = EnumC27118a.UNKNOWN;

    /* renamed from: h */
    public int f102908h = 1;

    /* renamed from: i */
    public Y31 f102909i = null;

    /* renamed from: j */
    public boolean f102910j = false;

    /* renamed from: k */
    public List<InterfaceC44238l01> f102911k = new ArrayList();

    /* renamed from: l */
    public List<C46610p01> f102912l = new ArrayList();

    /* renamed from: p01$a */
    /* loaded from: classes.dex */
    public enum EnumC27118a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public C46610p01(AbstractC41387gB6 abstractC41387gB6) {
        this.f102904d = abstractC41387gB6;
    }

    @Override // p000.InterfaceC44238l01
    /* renamed from: a */
    public void mo5649a(InterfaceC44238l01 interfaceC44238l01) {
        for (C46610p01 c46610p01 : this.f102912l) {
            if (!c46610p01.f102910j) {
                return;
            }
        }
        this.f102903c = true;
        InterfaceC44238l01 interfaceC44238l012 = this.f102901a;
        if (interfaceC44238l012 != null) {
            interfaceC44238l012.mo5649a(this);
        }
        if (this.f102902b) {
            this.f102904d.mo5649a(this);
            return;
        }
        C46610p01 c46610p012 = null;
        int i = 0;
        for (C46610p01 c46610p013 : this.f102912l) {
            if (!(c46610p013 instanceof Y31)) {
                i++;
                c46610p012 = c46610p013;
            }
        }
        if (c46610p012 != null && i == 1 && c46610p012.f102910j) {
            Y31 y31 = this.f102909i;
            if (y31 != null) {
                if (y31.f102910j) {
                    this.f102906f = this.f102908h * y31.f102907g;
                } else {
                    return;
                }
            }
            mo20170d(c46610p012.f102907g + this.f102906f);
        }
        InterfaceC44238l01 interfaceC44238l013 = this.f102901a;
        if (interfaceC44238l013 != null) {
            interfaceC44238l013.mo5649a(this);
        }
    }

    /* renamed from: b */
    public void m20172b(InterfaceC44238l01 interfaceC44238l01) {
        this.f102911k.add(interfaceC44238l01);
        if (this.f102910j) {
            interfaceC44238l01.mo5649a(interfaceC44238l01);
        }
    }

    /* renamed from: c */
    public void m20171c() {
        this.f102912l.clear();
        this.f102911k.clear();
        this.f102910j = false;
        this.f102907g = 0;
        this.f102903c = false;
        this.f102902b = false;
    }

    /* renamed from: d */
    public void mo20170d(int i) {
        if (this.f102910j) {
            return;
        }
        this.f102910j = true;
        this.f102907g = i;
        for (InterfaceC44238l01 interfaceC44238l01 : this.f102911k) {
            interfaceC44238l01.mo5649a(interfaceC44238l01);
        }
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f102904d.f81750b.m31335v());
        sb.append(":");
        sb.append(this.f102905e);
        sb.append("(");
        if (this.f102910j) {
            obj = Integer.valueOf(this.f102907g);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.f102912l.size());
        sb.append(":d=");
        sb.append(this.f102911k.size());
        sb.append(">");
        return sb.toString();
    }
}
