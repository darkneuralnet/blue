package com.google.protobuf;
/* renamed from: com.google.protobuf.q */
/* loaded from: classes6.dex */
public class C18535q implements InterfaceC48660sT2 {

    /* renamed from: a */
    public static final C18535q f74850a = new C18535q();

    private C18535q() {
    }

    /* renamed from: c */
    public static C18535q m46070c() {
        return f74850a;
    }

    @Override // p000.InterfaceC48660sT2
    /* renamed from: a */
    public InterfaceC47475qT2 mo14168a(Class<?> cls) {
        if (AbstractC18536r.class.isAssignableFrom(cls)) {
            try {
                return (InterfaceC47475qT2) AbstractC18536r.m46069A(cls.asSubclass(AbstractC18536r.class)).m46047p();
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for " + cls.getName(), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
    }

    @Override // p000.InterfaceC48660sT2
    /* renamed from: b */
    public boolean mo14167b(Class<?> cls) {
        return AbstractC18536r.class.isAssignableFrom(cls);
    }
}
