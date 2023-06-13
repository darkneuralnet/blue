package p000;

import com.google.protobuf.C18544t;
/* renamed from: Kv5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC34147Kv5 implements C18544t.InterfaceC18547c {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);
    

    /* renamed from: e */
    public static final C18544t.InterfaceC18548d<EnumC34147Kv5> f20392e = new C18544t.InterfaceC18548d<EnumC34147Kv5>() { // from class: Kv5.a
        @Override // com.google.protobuf.C18544t.InterfaceC18548d
        /* renamed from: a */
        public EnumC34147Kv5 findValueByNumber(int i) {
            return EnumC34147Kv5.m98129a(i);
        }
    };

    /* renamed from: b */
    public final int f20394b;

    /* renamed from: Kv5$b */
    /* loaded from: classes6.dex */
    public static final class C4627b implements C18544t.InterfaceC18549e {

        /* renamed from: a */
        public static final C18544t.InterfaceC18549e f20395a = new C4627b();

        private C4627b() {
        }

        @Override // com.google.protobuf.C18544t.InterfaceC18549e
        /* renamed from: a */
        public boolean mo33504a(int i) {
            return EnumC34147Kv5.m98129a(i) != null;
        }
    }

    EnumC34147Kv5(int i) {
        this.f20394b = i;
    }

    /* renamed from: a */
    public static EnumC34147Kv5 m98129a(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return GAUGES_AND_SYSTEM_EVENTS;
        }
        return SESSION_VERBOSITY_NONE;
    }

    /* renamed from: b */
    public static C18544t.InterfaceC18549e m98128b() {
        return C4627b.f20395a;
    }

    @Override // com.google.protobuf.C18544t.InterfaceC18547c
    public final int getNumber() {
        return this.f20394b;
    }
}
