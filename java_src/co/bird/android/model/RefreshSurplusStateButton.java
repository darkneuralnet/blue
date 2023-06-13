package co.bird.android.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/model/RefreshSurplusStateButton;", "Lco/bird/android/model/BountyFlightSheetButton;", "surplusId", "", "(Ljava/lang/String;)V", "getSurplusId", "()Ljava/lang/String;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RefreshSurplusStateButton extends BountyFlightSheetButton {
    private final String surplusId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshSurplusStateButton(String surplusId) {
        super(null);
        Intrinsics.checkNotNullParameter(surplusId, "surplusId");
        this.surplusId = surplusId;
    }

    public static /* synthetic */ RefreshSurplusStateButton copy$default(RefreshSurplusStateButton refreshSurplusStateButton, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = refreshSurplusStateButton.surplusId;
        }
        return refreshSurplusStateButton.copy(str);
    }

    public final String component1() {
        return this.surplusId;
    }

    public final RefreshSurplusStateButton copy(String surplusId) {
        Intrinsics.checkNotNullParameter(surplusId, "surplusId");
        return new RefreshSurplusStateButton(surplusId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RefreshSurplusStateButton) && Intrinsics.areEqual(this.surplusId, ((RefreshSurplusStateButton) obj).surplusId);
    }

    public final String getSurplusId() {
        return this.surplusId;
    }

    public int hashCode() {
        return this.surplusId.hashCode();
    }

    public String toString() {
        String str = this.surplusId;
        return "RefreshSurplusStateButton(surplusId=" + str + ")";
    }
}
