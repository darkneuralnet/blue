package p000;
/* renamed from: Dn1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32433Dn1 implements InterfaceC48812sj1<InterfaceC35934Sm1> {

    /* renamed from: a */
    public final C31731An1 f6321a;

    public C32433Dn1(C31731An1 c31731An1) {
        this.f6321a = c31731An1;
    }

    /* renamed from: a */
    public static C32433Dn1 m109951a(C31731An1 c31731An1) {
        return new C32433Dn1(c31731An1);
    }

    /* renamed from: c */
    public static InterfaceC35934Sm1 m109949c(C31731An1 c31731An1) {
        return (InterfaceC35934Sm1) C51679xZ3.m5004c(c31731An1.m115269c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC35934Sm1 get() {
        return m109949c(this.f6321a);
    }
}
