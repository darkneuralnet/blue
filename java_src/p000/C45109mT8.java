package p000;

import com.google.android.gms.common.internal.Objects;
/* renamed from: mT8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45109mT8 {

    /* renamed from: a */
    public final QS8 f98081a;

    /* renamed from: b */
    public final Integer f98082b;

    /* renamed from: c */
    public final Integer f98083c;

    /* renamed from: d */
    public final Boolean f98084d;

    public /* synthetic */ C45109mT8(FS8 fs8, C38569bT8 c38569bT8) {
        QS8 qs8;
        Integer num;
        qs8 = fs8.f9401a;
        this.f98081a = qs8;
        num = fs8.f9402b;
        this.f98082b = num;
        this.f98083c = null;
        this.f98084d = null;
    }

    @InterfaceC40939fR7(zza = 1)
    /* renamed from: a */
    public final QS8 m25542a() {
        return this.f98081a;
    }

    @InterfaceC40939fR7(zza = 2)
    /* renamed from: b */
    public final Integer m25541b() {
        return this.f98082b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C45109mT8)) {
            return false;
        }
        C45109mT8 c45109mT8 = (C45109mT8) obj;
        if (Objects.equal(this.f98081a, c45109mT8.f98081a) && Objects.equal(this.f98082b, c45109mT8.f98082b) && Objects.equal(null, null) && Objects.equal(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f98081a, this.f98082b, null, null);
    }
}
