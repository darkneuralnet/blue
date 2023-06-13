package p000;

import co.bird.android.model.Detail;
import java.util.Objects;
/* renamed from: n7 */
/* loaded from: classes8.dex */
public final class C26407n7 extends AbstractC26779o0 implements InterfaceC34742Nj6<Number> {
    private static final long serialVersionUID = -2981335308595652284L;

    /* renamed from: e */
    public final Number f99463e;

    public C26407n7(Number number) {
        this.f99463e = C49060t80.m13024c().mo13931d(number);
    }

    @Override // p000.InterfaceC38077ae6, p000.InterfaceC44546lX2
    /* renamed from: D */
    public boolean mo22026D() {
        return mo18701d();
    }

    @Override // p000.InterfaceC38077ae6
    /* renamed from: d */
    public boolean mo18701d() {
        return C49060t80.m13024c().mo13930e(this.f99463e);
    }

    @Override // p000.AbstractC26779o0
    /* renamed from: e */
    public boolean mo18700e(AbstractC26779o0 abstractC26779o0) {
        return abstractC26779o0 instanceof C26407n7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C26407n7) {
            return Objects.equals(this.f99463e, ((C26407n7) obj).f99463e);
        }
        return false;
    }

    @Override // p000.AbstractC26779o0
    /* renamed from: h */
    public AbstractC26779o0 mo18698h(AbstractC26779o0 abstractC26779o0) {
        return new C26407n7(C49060t80.m13024c().mo13928g(this.f99463e, ((C26407n7) abstractC26779o0).f99463e));
    }

    public int hashCode() {
        return Objects.hashCode(this.f99463e);
    }

    @Override // p000.AbstractC26779o0
    /* renamed from: i */
    public String mo18697i() {
        String str;
        InterfaceC48754sd3 m13024c = C49060t80.m13024c();
        Object[] objArr = new Object[2];
        if (m13024c.mo13926i(this.f99463e) < 0) {
            str = Detail.EMPTY_CHAR;
        } else {
            str = "+";
        }
        objArr[0] = str;
        objArr[1] = m13024c.mo13927h(this.f99463e);
        return String.format("x -> x %s %s", objArr);
    }

    @Override // java.lang.Comparable
    /* renamed from: j */
    public int compareTo(InterfaceC38077ae6 interfaceC38077ae6) {
        if (this == interfaceC38077ae6) {
            return 0;
        }
        if (interfaceC38077ae6 instanceof C26407n7) {
            return C49060t80.m13024c().mo13933b(getValue(), ((C26407n7) interfaceC38077ae6).getValue());
        }
        return -1;
    }

    /* renamed from: k */
    public Number m24321k() {
        return this.f99463e;
    }

    @Override // p000.InterfaceC34742Nj6
    /* renamed from: l */
    public Number getValue() {
        return this.f99463e;
    }

    @Override // p000.AbstractC26779o0
    /* renamed from: m */
    public C26407n7 mo18699g() {
        return new C26407n7(C49060t80.m13024c().mo13925j(this.f99463e));
    }
}
