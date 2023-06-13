package co.bird.android.model.identification;

import co.bird.android.model.LegacyRepairType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationDetectedStringsSatisfiedResult;", "Lco/bird/android/model/identification/IdentificationDetectedStringsResult;", "strings", "", "", "(Ljava/util/List;)V", "getStrings", "()Ljava/util/List;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class IdentificationDetectedStringsSatisfiedResult extends IdentificationDetectedStringsResult {
    private final List<String> strings;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentificationDetectedStringsSatisfiedResult(List<String> strings) {
        super(null);
        Intrinsics.checkNotNullParameter(strings, "strings");
        this.strings = strings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IdentificationDetectedStringsSatisfiedResult copy$default(IdentificationDetectedStringsSatisfiedResult identificationDetectedStringsSatisfiedResult, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = identificationDetectedStringsSatisfiedResult.strings;
        }
        return identificationDetectedStringsSatisfiedResult.copy(list);
    }

    public final List<String> component1() {
        return this.strings;
    }

    public final IdentificationDetectedStringsSatisfiedResult copy(List<String> strings) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        return new IdentificationDetectedStringsSatisfiedResult(strings);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IdentificationDetectedStringsSatisfiedResult) && Intrinsics.areEqual(this.strings, ((IdentificationDetectedStringsSatisfiedResult) obj).strings);
    }

    public final List<String> getStrings() {
        return this.strings;
    }

    public int hashCode() {
        return this.strings.hashCode();
    }

    public String toString() {
        List<String> list = this.strings;
        return "IdentificationDetectedStringsSatisfiedResult(strings=" + list + ")";
    }
}
