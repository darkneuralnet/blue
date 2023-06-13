package p000;

import ch.qos.logback.core.CoreConstants;
/* renamed from: ZO7 */
/* loaded from: classes5.dex */
public final class ZO7 implements HR7 {

    /* renamed from: a */
    public final int f48490a;

    /* renamed from: b */
    public final EnumC48647sR7 f48491b;

    public ZO7(int i, EnumC48647sR7 enumC48647sR7) {
        this.f48490a = i;
        this.f48491b = enumC48647sR7;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return HR7.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HR7)) {
            return false;
        }
        HR7 hr7 = (HR7) obj;
        if (this.f48490a == hr7.zza() && this.f48491b.equals(hr7.zzb())) {
            return true;
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f48490a ^ 14552422) + (this.f48491b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f48490a + "intEncoding=" + this.f48491b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // p000.HR7
    public final int zza() {
        return this.f48490a;
    }

    @Override // p000.HR7
    public final EnumC48647sR7 zzb() {
        return this.f48491b;
    }
}
