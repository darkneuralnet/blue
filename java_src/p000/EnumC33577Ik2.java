package p000;

import com.google.crypto.tink.shaded.protobuf.C18238v;
/* renamed from: Ik2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC33577Ik2 implements C18238v.InterfaceC18241c {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: h */
    public static final C18238v.InterfaceC18242d<EnumC33577Ik2> f16138h = new C18238v.InterfaceC18242d<EnumC33577Ik2>() { // from class: Ik2.a
        @Override // com.google.crypto.tink.shaded.protobuf.C18238v.InterfaceC18242d
        /* renamed from: a */
        public EnumC33577Ik2 findValueByNumber(int i) {
            return EnumC33577Ik2.m101741a(i);
        }
    };

    /* renamed from: b */
    public final int f16140b;

    EnumC33577Ik2(int i) {
        this.f16140b = i;
    }

    /* renamed from: a */
    public static EnumC33577Ik2 m101741a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return DESTROYED;
                }
                return DISABLED;
            }
            return ENABLED;
        }
        return UNKNOWN_STATUS;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C18238v.InterfaceC18241c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f16140b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
