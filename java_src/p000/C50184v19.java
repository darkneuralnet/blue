package p000;

import ch.qos.logback.core.CoreConstants;
/* renamed from: v19  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50184v19 implements InterfaceC49009t29 {

    /* renamed from: a */
    public final int f113356a;

    /* renamed from: b */
    public final EnumC43080j29 f113357b;

    public C50184v19(int i, EnumC43080j29 enumC43080j29) {
        this.f113356a = i;
        this.f113357b = enumC43080j29;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC49009t29.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC49009t29)) {
            return false;
        }
        InterfaceC49009t29 interfaceC49009t29 = (InterfaceC49009t29) obj;
        if (this.f113356a == interfaceC49009t29.zza() && this.f113357b.equals(interfaceC49009t29.zzb())) {
            return true;
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f113356a ^ 14552422) + (this.f113357b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f113356a + "intEncoding=" + this.f113357b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // p000.InterfaceC49009t29
    public final int zza() {
        return this.f113356a;
    }

    @Override // p000.InterfaceC49009t29
    public final EnumC43080j29 zzb() {
        return this.f113357b;
    }
}
