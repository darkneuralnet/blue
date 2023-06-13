package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0012J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003J\u009c\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u000fHÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0016\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\"\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0014¨\u00068"}, m28432d2 = {"Lco/bird/android/model/wire/WireRiderTutorialStep;", "", "id", "", "title", "subtitle", "body", "fileName", "loopFileName", "progressStart", "", "progressLoopStart", "progressLoopEnd", "delayLoopStart", "textColor", "", "buttonBackgroundColor", "buttonTextColor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFFFLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getBody", "()Ljava/lang/String;", "getButtonBackgroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getButtonTextColor", "getDelayLoopStart", "()F", "getFileName", "getId", "getLoopFileName", "getProgressLoopEnd", "getProgressLoopStart", "getProgressStart", "getSubtitle", "getTextColor", "getTitle", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFFFLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lco/bird/android/model/wire/WireRiderTutorialStep;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireRiderTutorialStep {
    @JsonProperty("body")
    @InterfaceC41208ft5("body")
    private final String body;
    @JsonProperty("button_background_color")
    @InterfaceC41208ft5("button_background_color")
    private final Integer buttonBackgroundColor;
    @JsonProperty("button_text_color")
    @InterfaceC41208ft5("button_text_color")
    private final Integer buttonTextColor;
    @JsonProperty("delay_loop_start")
    @InterfaceC41208ft5("delay_loop_start")
    private final float delayLoopStart;
    @JsonProperty("file_name")
    @InterfaceC41208ft5("file_name")
    private final String fileName;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66761id;
    @JsonProperty("loop_file_name")
    @InterfaceC41208ft5("loop_file_name")
    private final String loopFileName;
    @JsonProperty("progress_loop_end")
    @InterfaceC41208ft5("progress_loop_end")
    private final float progressLoopEnd;
    @JsonProperty("progress_loop_start")
    @InterfaceC41208ft5("progress_loop_start")
    private final float progressLoopStart;
    @JsonProperty("progress_start")
    @InterfaceC41208ft5("progress_start")
    private final float progressStart;
    @JsonProperty("subtitle")
    @InterfaceC41208ft5("subtitle")
    private final String subtitle;
    @JsonProperty("text_color")
    @InterfaceC41208ft5("text_color")
    private final Integer textColor;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public WireRiderTutorialStep() {
        this(null, null, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, 8191, null);
    }

    public final String component1() {
        return this.f66761id;
    }

    public final float component10() {
        return this.delayLoopStart;
    }

    public final Integer component11() {
        return this.textColor;
    }

    public final Integer component12() {
        return this.buttonBackgroundColor;
    }

    public final Integer component13() {
        return this.buttonTextColor;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final String component4() {
        return this.body;
    }

    public final String component5() {
        return this.fileName;
    }

    public final String component6() {
        return this.loopFileName;
    }

    public final float component7() {
        return this.progressStart;
    }

    public final float component8() {
        return this.progressLoopStart;
    }

    public final float component9() {
        return this.progressLoopEnd;
    }

    public final WireRiderTutorialStep copy(String id, String title, String str, String body, String str2, String str3, float f, float f2, float f3, float f4, Integer num, Integer num2, Integer num3) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        return new WireRiderTutorialStep(id, title, str, body, str2, str3, f, f2, f3, f4, num, num2, num3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireRiderTutorialStep) {
            WireRiderTutorialStep wireRiderTutorialStep = (WireRiderTutorialStep) obj;
            return Intrinsics.areEqual(this.f66761id, wireRiderTutorialStep.f66761id) && Intrinsics.areEqual(this.title, wireRiderTutorialStep.title) && Intrinsics.areEqual(this.subtitle, wireRiderTutorialStep.subtitle) && Intrinsics.areEqual(this.body, wireRiderTutorialStep.body) && Intrinsics.areEqual(this.fileName, wireRiderTutorialStep.fileName) && Intrinsics.areEqual(this.loopFileName, wireRiderTutorialStep.loopFileName) && Float.compare(this.progressStart, wireRiderTutorialStep.progressStart) == 0 && Float.compare(this.progressLoopStart, wireRiderTutorialStep.progressLoopStart) == 0 && Float.compare(this.progressLoopEnd, wireRiderTutorialStep.progressLoopEnd) == 0 && Float.compare(this.delayLoopStart, wireRiderTutorialStep.delayLoopStart) == 0 && Intrinsics.areEqual(this.textColor, wireRiderTutorialStep.textColor) && Intrinsics.areEqual(this.buttonBackgroundColor, wireRiderTutorialStep.buttonBackgroundColor) && Intrinsics.areEqual(this.buttonTextColor, wireRiderTutorialStep.buttonTextColor);
        }
        return false;
    }

    public final String getBody() {
        return this.body;
    }

    public final Integer getButtonBackgroundColor() {
        return this.buttonBackgroundColor;
    }

    public final Integer getButtonTextColor() {
        return this.buttonTextColor;
    }

    public final float getDelayLoopStart() {
        return this.delayLoopStart;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getId() {
        return this.f66761id;
    }

    public final String getLoopFileName() {
        return this.loopFileName;
    }

    public final float getProgressLoopEnd() {
        return this.progressLoopEnd;
    }

    public final float getProgressLoopStart() {
        return this.progressLoopStart;
    }

    public final float getProgressStart() {
        return this.progressStart;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final Integer getTextColor() {
        return this.textColor;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((this.f66761id.hashCode() * 31) + this.title.hashCode()) * 31;
        String str = this.subtitle;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.body.hashCode()) * 31;
        String str2 = this.fileName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.loopFileName;
        int hashCode4 = (((((((((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Float.hashCode(this.progressStart)) * 31) + Float.hashCode(this.progressLoopStart)) * 31) + Float.hashCode(this.progressLoopEnd)) * 31) + Float.hashCode(this.delayLoopStart)) * 31;
        Integer num = this.textColor;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.buttonBackgroundColor;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.buttonTextColor;
        return hashCode6 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66761id;
        String str2 = this.title;
        String str3 = this.subtitle;
        String str4 = this.body;
        String str5 = this.fileName;
        String str6 = this.loopFileName;
        float f = this.progressStart;
        float f2 = this.progressLoopStart;
        float f3 = this.progressLoopEnd;
        float f4 = this.delayLoopStart;
        Integer num = this.textColor;
        Integer num2 = this.buttonBackgroundColor;
        Integer num3 = this.buttonTextColor;
        return "WireRiderTutorialStep(id=" + str + ", title=" + str2 + ", subtitle=" + str3 + ", body=" + str4 + ", fileName=" + str5 + ", loopFileName=" + str6 + ", progressStart=" + f + ", progressLoopStart=" + f2 + ", progressLoopEnd=" + f3 + ", delayLoopStart=" + f4 + ", textColor=" + num + ", buttonBackgroundColor=" + num2 + ", buttonTextColor=" + num3 + ")";
    }

    public WireRiderTutorialStep(String id, String title, String str, String body, String str2, String str3, float f, float f2, float f3, float f4, Integer num, Integer num2, Integer num3) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f66761id = id;
        this.title = title;
        this.subtitle = str;
        this.body = body;
        this.fileName = str2;
        this.loopFileName = str3;
        this.progressStart = f;
        this.progressLoopStart = f2;
        this.progressLoopEnd = f3;
        this.delayLoopStart = f4;
        this.textColor = num;
        this.buttonBackgroundColor = num2;
        this.buttonTextColor = num3;
    }

    public /* synthetic */ WireRiderTutorialStep(String str, String str2, String str3, String str4, String str5, String str6, float f, float f2, float f3, float f4, Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? 0.0f : f, (i & 128) != 0 ? 0.0f : f2, (i & 256) != 0 ? 1.0f : f3, (i & 512) == 0 ? f4 : 0.0f, (i & 1024) != 0 ? null : num, (i & 2048) != 0 ? null : num2, (i & 4096) == 0 ? num3 : null);
    }
}
