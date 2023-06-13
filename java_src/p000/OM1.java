package p000;

import p000.C37875aI6;
/* renamed from: OM1 */
/* loaded from: classes5.dex */
public class OM1 {

    /* renamed from: a */
    public float f26420a;

    /* renamed from: b */
    public float f26421b;

    /* renamed from: c */
    public float f26422c;

    /* renamed from: d */
    public float f26423d;

    /* renamed from: e */
    public int f26424e;

    /* renamed from: f */
    public int f26425f;

    /* renamed from: g */
    public int f26426g;

    /* renamed from: h */
    public C37875aI6.EnumC10624a f26427h;

    /* renamed from: i */
    public float f26428i;

    /* renamed from: j */
    public float f26429j;

    public OM1(float f, float f2, float f3, float f4, int i, C37875aI6.EnumC10624a enumC10624a) {
        this.f26424e = -1;
        this.f26426g = -1;
        this.f26420a = f;
        this.f26421b = f2;
        this.f26422c = f3;
        this.f26423d = f4;
        this.f26425f = i;
        this.f26427h = enumC10624a;
    }

    /* renamed from: a */
    public boolean m92394a(OM1 om1) {
        return om1 != null && this.f26425f == om1.f26425f && this.f26420a == om1.f26420a && this.f26426g == om1.f26426g && this.f26424e == om1.f26424e;
    }

    /* renamed from: b */
    public C37875aI6.EnumC10624a m92393b() {
        return this.f26427h;
    }

    /* renamed from: c */
    public int m92392c() {
        return this.f26424e;
    }

    /* renamed from: d */
    public int m92391d() {
        return this.f26425f;
    }

    /* renamed from: e */
    public float m92390e() {
        return this.f26428i;
    }

    /* renamed from: f */
    public float m92389f() {
        return this.f26429j;
    }

    /* renamed from: g */
    public int m92388g() {
        return this.f26426g;
    }

    /* renamed from: h */
    public float m92387h() {
        return this.f26420a;
    }

    /* renamed from: i */
    public float m92386i() {
        return this.f26422c;
    }

    /* renamed from: j */
    public float m92385j() {
        return this.f26421b;
    }

    /* renamed from: k */
    public float m92384k() {
        return this.f26423d;
    }

    /* renamed from: l */
    public void m92383l(int i) {
        this.f26424e = i;
    }

    /* renamed from: m */
    public void m92382m(float f, float f2) {
        this.f26428i = f;
        this.f26429j = f2;
    }

    public String toString() {
        return "Highlight, x: " + this.f26420a + ", y: " + this.f26421b + ", dataSetIndex: " + this.f26425f + ", stackIndex (only stacked barentry): " + this.f26426g;
    }

    public OM1(float f, float f2, float f3, float f4, int i, int i2, C37875aI6.EnumC10624a enumC10624a) {
        this(f, f2, f3, f4, i, enumC10624a);
        this.f26426g = i2;
    }
}
