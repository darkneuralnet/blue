package co.bird.android.model;

import co.bird.android.model.persistence.Bird;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003JA\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001e"}, m28432d2 = {"Lco/bird/android/model/CampaignButton;", "Lco/bird/android/model/FlightSheetButton;", Entry.TYPE_TEXT, "", "campaignName", "message", "description", "bird", "Lco/bird/android/model/persistence/Bird;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/Bird;)V", "getBird", "()Lco/bird/android/model/persistence/Bird;", "getCampaignName", "()Ljava/lang/String;", "getDescription", "getMessage", "getText", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class CampaignButton extends FlightSheetButton {
    private final Bird bird;
    private final String campaignName;
    private final String description;
    private final String message;
    private final String text;

    public /* synthetic */ CampaignButton(String str, String str2, String str3, String str4, Bird bird, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, str2, str3, str4, bird);
    }

    public static /* synthetic */ CampaignButton copy$default(CampaignButton campaignButton, String str, String str2, String str3, String str4, Bird bird, int i, Object obj) {
        if ((i & 1) != 0) {
            str = campaignButton.text;
        }
        if ((i & 2) != 0) {
            str2 = campaignButton.campaignName;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = campaignButton.message;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = campaignButton.description;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            bird = campaignButton.bird;
        }
        return campaignButton.copy(str, str5, str6, str7, bird);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.campaignName;
    }

    public final String component3() {
        return this.message;
    }

    public final String component4() {
        return this.description;
    }

    public final Bird component5() {
        return this.bird;
    }

    public final CampaignButton copy(String text, String str, String str2, String str3, Bird bird) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(bird, "bird");
        return new CampaignButton(text, str, str2, str3, bird);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CampaignButton) {
            CampaignButton campaignButton = (CampaignButton) obj;
            return Intrinsics.areEqual(this.text, campaignButton.text) && Intrinsics.areEqual(this.campaignName, campaignButton.campaignName) && Intrinsics.areEqual(this.message, campaignButton.message) && Intrinsics.areEqual(this.description, campaignButton.description) && Intrinsics.areEqual(this.bird, campaignButton.bird);
        }
        return false;
    }

    public final Bird getBird() {
        return this.bird;
    }

    public final String getCampaignName() {
        return this.campaignName;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // co.bird.android.model.FlightSheetButton
    public String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.campaignName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        return ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.bird.hashCode();
    }

    public String toString() {
        String str = this.text;
        String str2 = this.campaignName;
        String str3 = this.message;
        String str4 = this.description;
        Bird bird = this.bird;
        return "CampaignButton(text=" + str + ", campaignName=" + str2 + ", message=" + str3 + ", description=" + str4 + ", bird=" + bird + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CampaignButton(String text, String str, String str2, String str3, Bird bird) {
        super(null);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.text = text;
        this.campaignName = str;
        this.message = str2;
        this.description = str3;
        this.bird = bird;
    }
}
