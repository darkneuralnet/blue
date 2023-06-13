package p000;

import ch.qos.logback.core.CoreConstants;
/* renamed from: VU7 */
/* loaded from: classes5.dex */
public final class VU7 implements InterfaceC45135mW7 {

    /* renamed from: a */
    public final int f39165a;

    /* renamed from: b */
    public final YV7 f39166b;

    public VU7(int i, YV7 yv7) {
        this.f39165a = i;
        this.f39166b = yv7;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC45135mW7.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC45135mW7)) {
            return false;
        }
        InterfaceC45135mW7 interfaceC45135mW7 = (InterfaceC45135mW7) obj;
        if (this.f39165a == interfaceC45135mW7.zza() && this.f39166b.equals(interfaceC45135mW7.zzb())) {
            return true;
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f39165a ^ 14552422) + (this.f39166b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f39165a + "intEncoding=" + this.f39166b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // p000.InterfaceC45135mW7
    public final int zza() {
        return this.f39165a;
    }

    @Override // p000.InterfaceC45135mW7
    public final YV7 zzb() {
        return this.f39166b;
    }
}
