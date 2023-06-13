package p000;

import ch.qos.logback.core.CoreConstants;
/* renamed from: k08  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43652k08 implements D18 {

    /* renamed from: a */
    public final int f93756a;

    /* renamed from: b */
    public final EnumC47220q18 f93757b;

    public C43652k08(int i, EnumC47220q18 enumC47220q18) {
        this.f93756a = i;
        this.f93757b = enumC47220q18;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return D18.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D18)) {
            return false;
        }
        D18 d18 = (D18) obj;
        if (this.f93756a == d18.zza() && this.f93757b.equals(d18.zzb())) {
            return true;
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f93756a ^ 14552422) + (this.f93757b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f93756a + "intEncoding=" + this.f93757b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // p000.D18
    public final int zza() {
        return this.f93756a;
    }

    @Override // p000.D18
    public final EnumC47220q18 zzb() {
        return this.f93757b;
    }
}
