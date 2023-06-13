package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m28432d2 = {"Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;", "", "id", "", "recurringCanceledAt", "Lorg/joda/time/DateTime;", "activity", "Lco/bird/android/model/persistence/BirdPlusActivityView;", "trial", "Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/persistence/BirdPlusActivityView;Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;)V", "getActivity", "()Lco/bird/android/model/persistence/BirdPlusActivityView;", "getId", "()Ljava/lang/String;", "getRecurringCanceledAt", "()Lorg/joda/time/DateTime;", "getTrial", "()Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdPlusUserSubscriptionView {
    @JsonProperty("activity")
    @InterfaceC41208ft5("activity")
    private final BirdPlusActivityView activity;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66673id;
    @JsonProperty("recurring_canceled_at")
    @InterfaceC41208ft5("recurring_canceled_at")
    private final DateTime recurringCanceledAt;
    @JsonProperty("trial")
    @InterfaceC41208ft5("trial")
    private final BirdPlusSubcriptionPlanTrialView trial;

    public BirdPlusUserSubscriptionView() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ BirdPlusUserSubscriptionView copy$default(BirdPlusUserSubscriptionView birdPlusUserSubscriptionView, String str, DateTime dateTime, BirdPlusActivityView birdPlusActivityView, BirdPlusSubcriptionPlanTrialView birdPlusSubcriptionPlanTrialView, int i, Object obj) {
        if ((i & 1) != 0) {
            str = birdPlusUserSubscriptionView.f66673id;
        }
        if ((i & 2) != 0) {
            dateTime = birdPlusUserSubscriptionView.recurringCanceledAt;
        }
        if ((i & 4) != 0) {
            birdPlusActivityView = birdPlusUserSubscriptionView.activity;
        }
        if ((i & 8) != 0) {
            birdPlusSubcriptionPlanTrialView = birdPlusUserSubscriptionView.trial;
        }
        return birdPlusUserSubscriptionView.copy(str, dateTime, birdPlusActivityView, birdPlusSubcriptionPlanTrialView);
    }

    public final String component1() {
        return this.f66673id;
    }

    public final DateTime component2() {
        return this.recurringCanceledAt;
    }

    public final BirdPlusActivityView component3() {
        return this.activity;
    }

    public final BirdPlusSubcriptionPlanTrialView component4() {
        return this.trial;
    }

    public final BirdPlusUserSubscriptionView copy(String str, DateTime dateTime, BirdPlusActivityView birdPlusActivityView, BirdPlusSubcriptionPlanTrialView birdPlusSubcriptionPlanTrialView) {
        return new BirdPlusUserSubscriptionView(str, dateTime, birdPlusActivityView, birdPlusSubcriptionPlanTrialView);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BirdPlusUserSubscriptionView) {
            BirdPlusUserSubscriptionView birdPlusUserSubscriptionView = (BirdPlusUserSubscriptionView) obj;
            return Intrinsics.areEqual(this.f66673id, birdPlusUserSubscriptionView.f66673id) && Intrinsics.areEqual(this.recurringCanceledAt, birdPlusUserSubscriptionView.recurringCanceledAt) && Intrinsics.areEqual(this.activity, birdPlusUserSubscriptionView.activity) && Intrinsics.areEqual(this.trial, birdPlusUserSubscriptionView.trial);
        }
        return false;
    }

    public final BirdPlusActivityView getActivity() {
        return this.activity;
    }

    public final String getId() {
        return this.f66673id;
    }

    public final DateTime getRecurringCanceledAt() {
        return this.recurringCanceledAt;
    }

    public final BirdPlusSubcriptionPlanTrialView getTrial() {
        return this.trial;
    }

    public int hashCode() {
        String str = this.f66673id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        DateTime dateTime = this.recurringCanceledAt;
        int hashCode2 = (hashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        BirdPlusActivityView birdPlusActivityView = this.activity;
        int hashCode3 = (hashCode2 + (birdPlusActivityView == null ? 0 : birdPlusActivityView.hashCode())) * 31;
        BirdPlusSubcriptionPlanTrialView birdPlusSubcriptionPlanTrialView = this.trial;
        return hashCode3 + (birdPlusSubcriptionPlanTrialView != null ? birdPlusSubcriptionPlanTrialView.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66673id;
        DateTime dateTime = this.recurringCanceledAt;
        BirdPlusActivityView birdPlusActivityView = this.activity;
        BirdPlusSubcriptionPlanTrialView birdPlusSubcriptionPlanTrialView = this.trial;
        return "BirdPlusUserSubscriptionView(id=" + str + ", recurringCanceledAt=" + dateTime + ", activity=" + birdPlusActivityView + ", trial=" + birdPlusSubcriptionPlanTrialView + ")";
    }

    public BirdPlusUserSubscriptionView(String str, DateTime dateTime, BirdPlusActivityView birdPlusActivityView, BirdPlusSubcriptionPlanTrialView birdPlusSubcriptionPlanTrialView) {
        this.f66673id = str;
        this.recurringCanceledAt = dateTime;
        this.activity = birdPlusActivityView;
        this.trial = birdPlusSubcriptionPlanTrialView;
    }

    public /* synthetic */ BirdPlusUserSubscriptionView(String str, DateTime dateTime, BirdPlusActivityView birdPlusActivityView, BirdPlusSubcriptionPlanTrialView birdPlusSubcriptionPlanTrialView, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : dateTime, (i & 4) != 0 ? null : birdPlusActivityView, (i & 8) != 0 ? null : birdPlusSubcriptionPlanTrialView);
    }
}
