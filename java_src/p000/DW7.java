package p000;

import ch.qos.logback.core.CoreConstants;
/* renamed from: DW7 */
/* loaded from: classes5.dex */
public final class DW7 implements KY7 {

    /* renamed from: a */
    public final int f5841a;

    /* renamed from: b */
    public final EnumC50479vX7 f5842b;

    public DW7(int i, EnumC50479vX7 enumC50479vX7) {
        this.f5841a = i;
        this.f5842b = enumC50479vX7;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return KY7.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KY7)) {
            return false;
        }
        KY7 ky7 = (KY7) obj;
        if (this.f5841a == ky7.zza() && this.f5842b.equals(ky7.zzb())) {
            return true;
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f5841a ^ 14552422) + (this.f5842b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f5841a + "intEncoding=" + this.f5842b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // p000.KY7
    public final int zza() {
        return this.f5841a;
    }

    @Override // p000.KY7
    public final EnumC50479vX7 zzb() {
        return this.f5842b;
    }
}
