package p000;

import com.google.protobuf.C18544t;
/* renamed from: im */
/* loaded from: classes6.dex */
public enum EnumC23350im implements C18544t.InterfaceC18547c {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);
    

    /* renamed from: g */
    public static final C18544t.InterfaceC18548d<EnumC23350im> f87845g = new C18544t.InterfaceC18548d<EnumC23350im>() { // from class: im.a
        @Override // com.google.protobuf.C18544t.InterfaceC18548d
        /* renamed from: a */
        public EnumC23350im findValueByNumber(int i) {
            return EnumC23350im.m33507a(i);
        }
    };

    /* renamed from: b */
    public final int f87847b;

    /* renamed from: im$b */
    /* loaded from: classes6.dex */
    public static final class C23352b implements C18544t.InterfaceC18549e {

        /* renamed from: a */
        public static final C18544t.InterfaceC18549e f87848a = new C23352b();

        private C23352b() {
        }

        @Override // com.google.protobuf.C18544t.InterfaceC18549e
        /* renamed from: a */
        public boolean mo33504a(int i) {
            return EnumC23350im.m33507a(i) != null;
        }
    }

    EnumC23350im(int i) {
        this.f87847b = i;
    }

    /* renamed from: a */
    public static EnumC23350im m33507a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return FOREGROUND_BACKGROUND;
                }
                return BACKGROUND;
            }
            return FOREGROUND;
        }
        return APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    /* renamed from: b */
    public static C18544t.InterfaceC18549e m33506b() {
        return C23352b.f87848a;
    }

    @Override // com.google.protobuf.C18544t.InterfaceC18547c
    public final int getNumber() {
        return this.f87847b;
    }
}
