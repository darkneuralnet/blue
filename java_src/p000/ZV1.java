package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.identification.IdentificationIntentPermissionStatus;
import co.bird.android.model.identification.IdentificationRequestIdentifier;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0016"}, m28432d2 = {"LZV1;", "", "Lco/bird/android/model/identification/IdentificationRequestIdentifier;", "identifier", "Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;", "status", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/identification/IdentificationRequestIdentifier;", "getIdentifier", "()Lco/bird/android/model/identification/IdentificationRequestIdentifier;", "b", "Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;", "()Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;", "<init>", "(Lco/bird/android/model/identification/IdentificationRequestIdentifier;Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ZV1 */
/* loaded from: classes2.dex */
public final class ZV1 {

    /* renamed from: a */
    public final IdentificationRequestIdentifier f48686a;

    /* renamed from: b */
    public final IdentificationIntentPermissionStatus f48687b;

    public ZV1(IdentificationRequestIdentifier identificationRequestIdentifier, IdentificationIntentPermissionStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f48686a = identificationRequestIdentifier;
        this.f48687b = status;
    }

    public static /* synthetic */ ZV1 copy$default(ZV1 zv1, IdentificationRequestIdentifier identificationRequestIdentifier, IdentificationIntentPermissionStatus identificationIntentPermissionStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            identificationRequestIdentifier = zv1.f48686a;
        }
        if ((i & 2) != 0) {
            identificationIntentPermissionStatus = zv1.f48687b;
        }
        return zv1.m73013a(identificationRequestIdentifier, identificationIntentPermissionStatus);
    }

    /* renamed from: a */
    public final ZV1 m73013a(IdentificationRequestIdentifier identificationRequestIdentifier, IdentificationIntentPermissionStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new ZV1(identificationRequestIdentifier, status);
    }

    /* renamed from: b */
    public final IdentificationIntentPermissionStatus m73012b() {
        return this.f48687b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZV1) {
            ZV1 zv1 = (ZV1) obj;
            return Intrinsics.areEqual(this.f48686a, zv1.f48686a) && Intrinsics.areEqual(this.f48687b, zv1.f48687b);
        }
        return false;
    }

    public int hashCode() {
        IdentificationRequestIdentifier identificationRequestIdentifier = this.f48686a;
        return ((identificationRequestIdentifier == null ? 0 : identificationRequestIdentifier.hashCode()) * 31) + this.f48687b.hashCode();
    }

    public String toString() {
        IdentificationRequestIdentifier identificationRequestIdentifier = this.f48686a;
        IdentificationIntentPermissionStatus identificationIntentPermissionStatus = this.f48687b;
        return "IdentificationStatusState(identifier=" + identificationRequestIdentifier + ", status=" + identificationIntentPermissionStatus + ")";
    }
}
