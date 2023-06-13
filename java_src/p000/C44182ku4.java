package p000;
/* renamed from: ku4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44182ku4 implements InterfaceC48812sj1<C43589ju4> {

    /* renamed from: a */
    public final Y94<InterfaceC31797Au4> f95176a;

    public C44182ku4(Y94<InterfaceC31797Au4> y94) {
        this.f95176a = y94;
    }

    /* renamed from: a */
    public static C44182ku4 m28199a(Y94<InterfaceC31797Au4> y94) {
        return new C44182ku4(y94);
    }

    /* renamed from: c */
    public static C43589ju4 m28197c(InterfaceC31797Au4 interfaceC31797Au4) {
        return new C43589ju4(interfaceC31797Au4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C43589ju4 get() {
        return m28197c(this.f95176a.get());
    }
}
