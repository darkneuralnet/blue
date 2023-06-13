package p000;

import ch.qos.logback.core.CoreConstants;
/* renamed from: wO7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50991wO7 implements InterfaceC40939fR7 {

    /* renamed from: a */
    public final int f115896a;

    /* renamed from: b */
    public final PQ7 f115897b;

    public C50991wO7(int i, PQ7 pq7) {
        this.f115896a = i;
        this.f115897b = pq7;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC40939fR7.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC40939fR7)) {
            return false;
        }
        InterfaceC40939fR7 interfaceC40939fR7 = (InterfaceC40939fR7) obj;
        if (this.f115896a == interfaceC40939fR7.zza() && this.f115897b.equals(interfaceC40939fR7.zzb())) {
            return true;
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f115896a ^ 14552422) + (this.f115897b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f115896a + "intEncoding=" + this.f115897b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // p000.InterfaceC40939fR7
    public final int zza() {
        return this.f115896a;
    }

    @Override // p000.InterfaceC40939fR7
    public final PQ7 zzb() {
        return this.f115897b;
    }
}
