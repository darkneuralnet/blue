package p000;

import ch.qos.logback.core.CoreConstants;
/* renamed from: Fi7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32862Fi7 implements InterfaceC42929in7 {

    /* renamed from: a */
    public final int f9992a;

    /* renamed from: b */
    public final EnumC46477om7 f9993b;

    public C32862Fi7(int i, EnumC46477om7 enumC46477om7) {
        this.f9992a = i;
        this.f9993b = enumC46477om7;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC42929in7.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC42929in7)) {
            return false;
        }
        InterfaceC42929in7 interfaceC42929in7 = (InterfaceC42929in7) obj;
        if (this.f9992a == interfaceC42929in7.zza() && this.f9993b.equals(interfaceC42929in7.zzb())) {
            return true;
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f9992a ^ 14552422) + (this.f9993b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f9992a + "intEncoding=" + this.f9993b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // p000.InterfaceC42929in7
    public final int zza() {
        return this.f9992a;
    }

    @Override // p000.InterfaceC42929in7
    public final EnumC46477om7 zzb() {
        return this.f9993b;
    }
}
