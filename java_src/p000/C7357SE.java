package p000;
/* renamed from: SE */
/* loaded from: classes8.dex */
public class C7357SE implements InterfaceC39410cr5 {

    /* renamed from: a */
    public C52053yB0[] f33360a;

    /* renamed from: b */
    public Object f33361b;

    public C7357SE(C52053yB0[] c52053yB0Arr, Object obj) {
        this.f33360a = c52053yB0Arr;
        this.f33361b = obj;
    }

    @Override // p000.InterfaceC39410cr5
    public Object getData() {
        return this.f33361b;
    }

    @Override // p000.InterfaceC39410cr5
    /* renamed from: h */
    public C52053yB0[] mo44967h() {
        return this.f33360a;
    }

    @Override // p000.InterfaceC39410cr5
    public boolean isClosed() {
        C52053yB0[] c52053yB0Arr = this.f33360a;
        return c52053yB0Arr[0].equals(c52053yB0Arr[c52053yB0Arr.length - 1]);
    }

    @Override // p000.InterfaceC39410cr5
    public int size() {
        return this.f33360a.length;
    }

    public String toString() {
        return C44204kw6.m28148B(new C52646zB0(this.f33360a));
    }

    @Override // p000.InterfaceC39410cr5
    /* renamed from: u */
    public C52053yB0 mo44966u(int i) {
        return this.f33360a[i];
    }
}
