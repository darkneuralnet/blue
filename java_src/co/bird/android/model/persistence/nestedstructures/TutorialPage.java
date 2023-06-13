package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ConfigurableTutorialType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jq\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013¨\u0006-"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/TutorialPage;", "", "id", "", "type", "Lco/bird/android/model/constant/ConfigurableTutorialType;", "title", "message", "quiz", "Lco/bird/android/model/persistence/nestedstructures/TutorialQuiz;", "asset", "Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;", "buttonText", "helpButtonText", "zendeskHelpUrl", "(Ljava/lang/String;Lco/bird/android/model/constant/ConfigurableTutorialType;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/TutorialQuiz;Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAsset", "()Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;", "getButtonText", "()Ljava/lang/String;", "getHelpButtonText", "getId", "getMessage", "getQuiz", "()Lco/bird/android/model/persistence/nestedstructures/TutorialQuiz;", "getTitle", "getType", "()Lco/bird/android/model/constant/ConfigurableTutorialType;", "getZendeskHelpUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class TutorialPage {
    @JsonProperty("asset")
    @InterfaceC41208ft5("asset")
    private final LegacyAsset asset;
    @JsonProperty("button_text")
    @InterfaceC41208ft5("button_text")
    private final String buttonText;
    @JsonProperty("help_button_text")
    @InterfaceC41208ft5("help_button_text")
    private final String helpButtonText;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66706id;
    @JsonProperty("message")
    @InterfaceC41208ft5("message")
    private final String message;
    @JsonProperty("quiz")
    @InterfaceC41208ft5("quiz")
    private final TutorialQuiz quiz;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("type")
    @InterfaceC41208ft5("type")
    private final ConfigurableTutorialType type;
    @JsonProperty("zendesk_help_url")
    @InterfaceC41208ft5("zendesk_help_url")
    private final String zendeskHelpUrl;

    public TutorialPage(String id, ConfigurableTutorialType type, String str, String str2, TutorialQuiz tutorialQuiz, LegacyAsset legacyAsset, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f66706id = id;
        this.type = type;
        this.title = str;
        this.message = str2;
        this.quiz = tutorialQuiz;
        this.asset = legacyAsset;
        this.buttonText = str3;
        this.helpButtonText = str4;
        this.zendeskHelpUrl = str5;
    }

    public final String component1() {
        return this.f66706id;
    }

    public final ConfigurableTutorialType component2() {
        return this.type;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.message;
    }

    public final TutorialQuiz component5() {
        return this.quiz;
    }

    public final LegacyAsset component6() {
        return this.asset;
    }

    public final String component7() {
        return this.buttonText;
    }

    public final String component8() {
        return this.helpButtonText;
    }

    public final String component9() {
        return this.zendeskHelpUrl;
    }

    public final TutorialPage copy(String id, ConfigurableTutorialType type, String str, String str2, TutorialQuiz tutorialQuiz, LegacyAsset legacyAsset, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        return new TutorialPage(id, type, str, str2, tutorialQuiz, legacyAsset, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TutorialPage) {
            TutorialPage tutorialPage = (TutorialPage) obj;
            return Intrinsics.areEqual(this.f66706id, tutorialPage.f66706id) && this.type == tutorialPage.type && Intrinsics.areEqual(this.title, tutorialPage.title) && Intrinsics.areEqual(this.message, tutorialPage.message) && Intrinsics.areEqual(this.quiz, tutorialPage.quiz) && Intrinsics.areEqual(this.asset, tutorialPage.asset) && Intrinsics.areEqual(this.buttonText, tutorialPage.buttonText) && Intrinsics.areEqual(this.helpButtonText, tutorialPage.helpButtonText) && Intrinsics.areEqual(this.zendeskHelpUrl, tutorialPage.zendeskHelpUrl);
        }
        return false;
    }

    public final LegacyAsset getAsset() {
        return this.asset;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getHelpButtonText() {
        return this.helpButtonText;
    }

    public final String getId() {
        return this.f66706id;
    }

    public final String getMessage() {
        return this.message;
    }

    public final TutorialQuiz getQuiz() {
        return this.quiz;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ConfigurableTutorialType getType() {
        return this.type;
    }

    public final String getZendeskHelpUrl() {
        return this.zendeskHelpUrl;
    }

    public int hashCode() {
        int hashCode = ((this.f66706id.hashCode() * 31) + this.type.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TutorialQuiz tutorialQuiz = this.quiz;
        int hashCode4 = (hashCode3 + (tutorialQuiz == null ? 0 : tutorialQuiz.hashCode())) * 31;
        LegacyAsset legacyAsset = this.asset;
        int hashCode5 = (hashCode4 + (legacyAsset == null ? 0 : legacyAsset.hashCode())) * 31;
        String str3 = this.buttonText;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.helpButtonText;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.zendeskHelpUrl;
        return hashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66706id;
        ConfigurableTutorialType configurableTutorialType = this.type;
        String str2 = this.title;
        String str3 = this.message;
        TutorialQuiz tutorialQuiz = this.quiz;
        LegacyAsset legacyAsset = this.asset;
        String str4 = this.buttonText;
        String str5 = this.helpButtonText;
        String str6 = this.zendeskHelpUrl;
        return "TutorialPage(id=" + str + ", type=" + configurableTutorialType + ", title=" + str2 + ", message=" + str3 + ", quiz=" + tutorialQuiz + ", asset=" + legacyAsset + ", buttonText=" + str4 + ", helpButtonText=" + str5 + ", zendeskHelpUrl=" + str6 + ")";
    }

    public /* synthetic */ TutorialPage(String str, ConfigurableTutorialType configurableTutorialType, String str2, String str3, TutorialQuiz tutorialQuiz, LegacyAsset legacyAsset, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, configurableTutorialType, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : tutorialQuiz, (i & 32) != 0 ? null : legacyAsset, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6);
    }
}
