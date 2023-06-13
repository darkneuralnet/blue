package co.bird.android.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\bHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m28432d2 = {"Lco/bird/android/model/TutorialStep;", "", "id", "", "title", "zendeskArticleId", "", "position", "", "event", "Lco/bird/android/model/ContractorOnboardEvent;", "(Ljava/lang/String;Ljava/lang/String;JILco/bird/android/model/ContractorOnboardEvent;)V", "getEvent", "()Lco/bird/android/model/ContractorOnboardEvent;", "getId", "()Ljava/lang/String;", "getPosition", "()I", "getTitle", "getZendeskArticleId", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class TutorialStep {
    @JsonProperty("event")
    @InterfaceC41208ft5("event")
    private final ContractorOnboardEvent event;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66631id;
    @JsonProperty("position")
    @InterfaceC41208ft5("position")
    private final int position;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("zendesk_article_id")
    @InterfaceC41208ft5("zendesk_article_id")
    private final long zendeskArticleId;

    public TutorialStep() {
        this(null, null, 0L, 0, null, 31, null);
    }

    public static /* synthetic */ TutorialStep copy$default(TutorialStep tutorialStep, String str, String str2, long j, int i, ContractorOnboardEvent contractorOnboardEvent, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = tutorialStep.f66631id;
        }
        if ((i2 & 2) != 0) {
            str2 = tutorialStep.title;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            j = tutorialStep.zendeskArticleId;
        }
        long j2 = j;
        if ((i2 & 8) != 0) {
            i = tutorialStep.position;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            contractorOnboardEvent = tutorialStep.event;
        }
        return tutorialStep.copy(str, str3, j2, i3, contractorOnboardEvent);
    }

    public final String component1() {
        return this.f66631id;
    }

    public final String component2() {
        return this.title;
    }

    public final long component3() {
        return this.zendeskArticleId;
    }

    public final int component4() {
        return this.position;
    }

    public final ContractorOnboardEvent component5() {
        return this.event;
    }

    public final TutorialStep copy(String id, String title, long j, int i, ContractorOnboardEvent contractorOnboardEvent) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        return new TutorialStep(id, title, j, i, contractorOnboardEvent);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TutorialStep) {
            TutorialStep tutorialStep = (TutorialStep) obj;
            return Intrinsics.areEqual(this.f66631id, tutorialStep.f66631id) && Intrinsics.areEqual(this.title, tutorialStep.title) && this.zendeskArticleId == tutorialStep.zendeskArticleId && this.position == tutorialStep.position && Intrinsics.areEqual(this.event, tutorialStep.event);
        }
        return false;
    }

    public final ContractorOnboardEvent getEvent() {
        return this.event;
    }

    public final String getId() {
        return this.f66631id;
    }

    public final int getPosition() {
        return this.position;
    }

    public final String getTitle() {
        return this.title;
    }

    public final long getZendeskArticleId() {
        return this.zendeskArticleId;
    }

    public int hashCode() {
        int hashCode = ((((((this.f66631id.hashCode() * 31) + this.title.hashCode()) * 31) + Long.hashCode(this.zendeskArticleId)) * 31) + Integer.hashCode(this.position)) * 31;
        ContractorOnboardEvent contractorOnboardEvent = this.event;
        return hashCode + (contractorOnboardEvent == null ? 0 : contractorOnboardEvent.hashCode());
    }

    public String toString() {
        String str = this.f66631id;
        String str2 = this.title;
        long j = this.zendeskArticleId;
        int i = this.position;
        ContractorOnboardEvent contractorOnboardEvent = this.event;
        return "TutorialStep(id=" + str + ", title=" + str2 + ", zendeskArticleId=" + j + ", position=" + i + ", event=" + contractorOnboardEvent + ")";
    }

    public TutorialStep(String id, String title, long j, int i, ContractorOnboardEvent contractorOnboardEvent) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f66631id = id;
        this.title = title;
        this.zendeskArticleId = j;
        this.position = i;
        this.event = contractorOnboardEvent;
    }

    public /* synthetic */ TutorialStep(String str, String str2, long j, int i, ContractorOnboardEvent contractorOnboardEvent, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) == 0 ? str2 : "", (i2 & 4) != 0 ? 0L : j, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : contractorOnboardEvent);
    }
}
