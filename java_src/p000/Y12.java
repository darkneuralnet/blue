package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.identification.IdentificationIngestionResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"LY12;", "LgT1;", "Lco/bird/android/model/identification/IdentificationIngestionResult;", "ingestionResult", "b", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/identification/IdentificationIngestionResult;", "c", "()Lco/bird/android/model/identification/IdentificationIngestionResult;", "<init>", "(Lco/bird/android/model/identification/IdentificationIngestionResult;)V", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Y12 */
/* loaded from: classes3.dex */
public final class Y12 extends AbstractC41544gT1 {

    /* renamed from: b */
    public final IdentificationIngestionResult f44452b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y12(IdentificationIngestionResult ingestionResult) {
        super(ingestionResult.toString(), null);
        Intrinsics.checkNotNullParameter(ingestionResult, "ingestionResult");
        this.f44452b = ingestionResult;
    }

    public static /* synthetic */ Y12 copy$default(Y12 y12, IdentificationIngestionResult identificationIngestionResult, int i, Object obj) {
        if ((i & 1) != 0) {
            identificationIngestionResult = y12.f44452b;
        }
        return y12.m75826b(identificationIngestionResult);
    }

    /* renamed from: b */
    public final Y12 m75826b(IdentificationIngestionResult ingestionResult) {
        Intrinsics.checkNotNullParameter(ingestionResult, "ingestionResult");
        return new Y12(ingestionResult);
    }

    /* renamed from: c */
    public final IdentificationIngestionResult m75825c() {
        return this.f44452b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Y12) && this.f44452b == ((Y12) obj).f44452b;
    }

    public int hashCode() {
        return this.f44452b.hashCode();
    }

    public String toString() {
        IdentificationIngestionResult identificationIngestionResult = this.f44452b;
        return "IngestionResultEntry(ingestionResult=" + identificationIngestionResult + ")";
    }
}
