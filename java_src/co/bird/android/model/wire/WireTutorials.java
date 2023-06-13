package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ConfigurableTutorialStyle;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JS\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, m28432d2 = {"Lco/bird/android/model/wire/WireTutorials;", "", "header", "", "title", "message", "buttonText", "style", "Lco/bird/android/model/constant/ConfigurableTutorialStyle;", "tutorials", "", "Lco/bird/android/model/wire/WireTutorial;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ConfigurableTutorialStyle;Ljava/util/List;)V", "getButtonText", "()Ljava/lang/String;", "getHeader", "getMessage", "getStyle", "()Lco/bird/android/model/constant/ConfigurableTutorialStyle;", "getTitle", "getTutorials", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireTutorials {
    @JsonProperty("button_text")
    @InterfaceC41208ft5("button_text")
    private final String buttonText;
    @JsonProperty("header")
    @InterfaceC41208ft5("header")
    private final String header;
    @JsonProperty("message")
    @InterfaceC41208ft5("message")
    private final String message;
    @JsonProperty("style")
    @InterfaceC41208ft5("style")
    private final ConfigurableTutorialStyle style;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("tutorials")
    @InterfaceC41208ft5("tutorials")
    private final List<WireTutorial> tutorials;

    public WireTutorials(String str, String str2, String str3, String str4, ConfigurableTutorialStyle style, List<WireTutorial> tutorials) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(tutorials, "tutorials");
        this.header = str;
        this.title = str2;
        this.message = str3;
        this.buttonText = str4;
        this.style = style;
        this.tutorials = tutorials;
    }

    public static /* synthetic */ WireTutorials copy$default(WireTutorials wireTutorials, String str, String str2, String str3, String str4, ConfigurableTutorialStyle configurableTutorialStyle, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireTutorials.header;
        }
        if ((i & 2) != 0) {
            str2 = wireTutorials.title;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = wireTutorials.message;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = wireTutorials.buttonText;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            configurableTutorialStyle = wireTutorials.style;
        }
        ConfigurableTutorialStyle configurableTutorialStyle2 = configurableTutorialStyle;
        List<WireTutorial> list2 = list;
        if ((i & 32) != 0) {
            list2 = wireTutorials.tutorials;
        }
        return wireTutorials.copy(str, str5, str6, str7, configurableTutorialStyle2, list2);
    }

    public final String component1() {
        return this.header;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.message;
    }

    public final String component4() {
        return this.buttonText;
    }

    public final ConfigurableTutorialStyle component5() {
        return this.style;
    }

    public final List<WireTutorial> component6() {
        return this.tutorials;
    }

    public final WireTutorials copy(String str, String str2, String str3, String str4, ConfigurableTutorialStyle style, List<WireTutorial> tutorials) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(tutorials, "tutorials");
        return new WireTutorials(str, str2, str3, str4, style, tutorials);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireTutorials) {
            WireTutorials wireTutorials = (WireTutorials) obj;
            return Intrinsics.areEqual(this.header, wireTutorials.header) && Intrinsics.areEqual(this.title, wireTutorials.title) && Intrinsics.areEqual(this.message, wireTutorials.message) && Intrinsics.areEqual(this.buttonText, wireTutorials.buttonText) && this.style == wireTutorials.style && Intrinsics.areEqual(this.tutorials, wireTutorials.tutorials);
        }
        return false;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getMessage() {
        return this.message;
    }

    public final ConfigurableTutorialStyle getStyle() {
        return this.style;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<WireTutorial> getTutorials() {
        return this.tutorials;
    }

    public int hashCode() {
        String str = this.header;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.message;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.buttonText;
        return ((((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.style.hashCode()) * 31) + this.tutorials.hashCode();
    }

    public String toString() {
        String str = this.header;
        String str2 = this.title;
        String str3 = this.message;
        String str4 = this.buttonText;
        ConfigurableTutorialStyle configurableTutorialStyle = this.style;
        List<WireTutorial> list = this.tutorials;
        return "WireTutorials(header=" + str + ", title=" + str2 + ", message=" + str3 + ", buttonText=" + str4 + ", style=" + configurableTutorialStyle + ", tutorials=" + list + ")";
    }

    public /* synthetic */ WireTutorials(String str, String str2, String str3, String str4, ConfigurableTutorialStyle configurableTutorialStyle, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, configurableTutorialStyle, list);
    }
}
