package p000;

import com.google.crypto.tink.shaded.protobuf.C18238v;
/* renamed from: eA3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC40189eA3 implements C18238v.InterfaceC18241c {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: i */
    public static final C18238v.InterfaceC18242d<EnumC40189eA3> f78051i = new C18238v.InterfaceC18242d<EnumC40189eA3>() { // from class: eA3.a
        @Override // com.google.crypto.tink.shaded.protobuf.C18238v.InterfaceC18242d
        /* renamed from: a */
        public EnumC40189eA3 findValueByNumber(int i) {
            return EnumC40189eA3.m43160a(i);
        }
    };

    /* renamed from: b */
    public final int f78053b;

    EnumC40189eA3(int i) {
        this.f78053b = i;
    }

    /* renamed from: a */
    public static EnumC40189eA3 m43160a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return CRUNCHY;
                    }
                    return RAW;
                }
                return LEGACY;
            }
            return TINK;
        }
        return UNKNOWN_PREFIX;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C18238v.InterfaceC18241c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f78053b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
