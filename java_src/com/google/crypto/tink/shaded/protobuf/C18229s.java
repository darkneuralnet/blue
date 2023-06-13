package com.google.crypto.tink.shaded.protobuf;
/* renamed from: com.google.crypto.tink.shaded.protobuf.s */
/* loaded from: classes6.dex */
public class C18229s implements InterfaceC49253tT2 {

    /* renamed from: a */
    public static final C18229s f74194a = new C18229s();

    private C18229s() {
    }

    /* renamed from: c */
    public static C18229s m47481c() {
        return f74194a;
    }

    @Override // p000.InterfaceC49253tT2
    /* renamed from: a */
    public InterfaceC48068rT2 mo12305a(Class<?> cls) {
        if (AbstractC18230t.class.isAssignableFrom(cls)) {
            try {
                return (InterfaceC48068rT2) AbstractC18230t.m47467p(cls.asSubclass(AbstractC18230t.class)).m47473i();
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for " + cls.getName(), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
    }

    @Override // p000.InterfaceC49253tT2
    /* renamed from: b */
    public boolean mo12304b(Class<?> cls) {
        return AbstractC18230t.class.isAssignableFrom(cls);
    }
}
