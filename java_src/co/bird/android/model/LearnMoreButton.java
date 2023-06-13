package co.bird.android.model;

import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/LearnMoreButton;", "Lco/bird/android/model/AreaBottomSheetButton;", Entry.TYPE_TEXT, "", "zendeskArticleId", "", "(Ljava/lang/String;J)V", "getText", "()Ljava/lang/String;", "getZendeskArticleId", "()J", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class LearnMoreButton extends AreaBottomSheetButton {
    private final String text;
    private final long zendeskArticleId;

    public /* synthetic */ LearnMoreButton(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, j);
    }

    public static /* synthetic */ LearnMoreButton copy$default(LearnMoreButton learnMoreButton, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = learnMoreButton.text;
        }
        if ((i & 2) != 0) {
            j = learnMoreButton.zendeskArticleId;
        }
        return learnMoreButton.copy(str, j);
    }

    public final String component1() {
        return this.text;
    }

    public final long component2() {
        return this.zendeskArticleId;
    }

    public final LearnMoreButton copy(String text, long j) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new LearnMoreButton(text, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LearnMoreButton) {
            LearnMoreButton learnMoreButton = (LearnMoreButton) obj;
            return Intrinsics.areEqual(this.text, learnMoreButton.text) && this.zendeskArticleId == learnMoreButton.zendeskArticleId;
        }
        return false;
    }

    @Override // co.bird.android.model.AreaBottomSheetButton
    public String getText() {
        return this.text;
    }

    public final long getZendeskArticleId() {
        return this.zendeskArticleId;
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + Long.hashCode(this.zendeskArticleId);
    }

    public String toString() {
        String str = this.text;
        long j = this.zendeskArticleId;
        return "LearnMoreButton(text=" + str + ", zendeskArticleId=" + j + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LearnMoreButton(String text, long j) {
        super(null);
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.zendeskArticleId = j;
    }
}
