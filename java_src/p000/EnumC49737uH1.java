package p000;

import com.google.crypto.tink.shaded.protobuf.C18238v;
/* renamed from: uH1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC49737uH1 implements C18238v.InterfaceC18241c {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: j */
    public static final C18238v.InterfaceC18242d<EnumC49737uH1> f112123j = new C18238v.InterfaceC18242d<EnumC49737uH1>() { // from class: uH1.a
        @Override // com.google.crypto.tink.shaded.protobuf.C18238v.InterfaceC18242d
        /* renamed from: a */
        public EnumC49737uH1 findValueByNumber(int i) {
            return EnumC49737uH1.m10491a(i);
        }
    };

    /* renamed from: b */
    public final int f112125b;

    EnumC49737uH1(int i) {
        this.f112125b = i;
    }

    /* renamed from: a */
    public static EnumC49737uH1 m10491a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return SHA224;
                        }
                        return SHA512;
                    }
                    return SHA256;
                }
                return SHA384;
            }
            return SHA1;
        }
        return UNKNOWN_HASH;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C18238v.InterfaceC18241c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f112125b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
