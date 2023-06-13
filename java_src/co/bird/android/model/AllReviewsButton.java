package co.bird.android.model;

import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/model/AllReviewsButton;", "Lco/bird/android/model/FlightSheetButton;", Entry.TYPE_TEXT, "", "birdId", "(Ljava/lang/String;Ljava/lang/String;)V", "getBirdId", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class AllReviewsButton extends FlightSheetButton {
    private final String birdId;
    private final String text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllReviewsButton(String text, String birdId) {
        super(null);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        this.text = text;
        this.birdId = birdId;
    }

    public static /* synthetic */ AllReviewsButton copy$default(AllReviewsButton allReviewsButton, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = allReviewsButton.text;
        }
        if ((i & 2) != 0) {
            str2 = allReviewsButton.birdId;
        }
        return allReviewsButton.copy(str, str2);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.birdId;
    }

    public final AllReviewsButton copy(String text, String birdId) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        return new AllReviewsButton(text, birdId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AllReviewsButton) {
            AllReviewsButton allReviewsButton = (AllReviewsButton) obj;
            return Intrinsics.areEqual(this.text, allReviewsButton.text) && Intrinsics.areEqual(this.birdId, allReviewsButton.birdId);
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    @Override // co.bird.android.model.FlightSheetButton
    public String getText() {
        return this.text;
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + this.birdId.hashCode();
    }

    public String toString() {
        String str = this.text;
        String str2 = this.birdId;
        return "AllReviewsButton(text=" + str + ", birdId=" + str2 + ")";
    }
}
