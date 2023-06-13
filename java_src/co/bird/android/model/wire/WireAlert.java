package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.AlertImage;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005¢\u0006\u0002\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010#\u001a\u00020\u0005HÆ\u0003Jd\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\u00032\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0007HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u001a\u0010\u0010R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015¨\u0006*"}, m28432d2 = {"Lco/bird/android/model/wire/WireAlert;", "", "blocking", "", "body", "", "backgroundColor", "", "html", "identifier", Entry.TYPE_IMAGE, "Lco/bird/android/model/constant/AlertImage;", "textColor", "title", "(ZLjava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;Lco/bird/android/model/constant/AlertImage;Ljava/lang/Integer;Ljava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBlocking", "()Z", "getBody", "()Ljava/lang/String;", "getHtml", "getIdentifier", "getImage", "()Lco/bird/android/model/constant/AlertImage;", "getTextColor", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ZLjava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;Lco/bird/android/model/constant/AlertImage;Ljava/lang/Integer;Ljava/lang/String;)Lco/bird/android/model/wire/WireAlert;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireAlert {
    @JsonProperty("background_color")
    @InterfaceC41208ft5("background_color")
    private final Integer backgroundColor;
    @JsonProperty("blocking")
    @InterfaceC41208ft5("blocking")
    private final boolean blocking;
    @JsonProperty("body")
    @InterfaceC41208ft5("body")
    private final String body;
    @JsonProperty("html")
    @InterfaceC41208ft5("html")
    private final boolean html;
    @JsonProperty("identifier")
    @InterfaceC41208ft5("identifier")
    private final String identifier;
    @JsonProperty(Entry.TYPE_IMAGE)
    @InterfaceC41208ft5(Entry.TYPE_IMAGE)
    private final AlertImage image;
    @JsonProperty("text_color")
    @InterfaceC41208ft5("text_color")
    private final Integer textColor;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public WireAlert() {
        this(false, null, null, false, null, null, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
    }

    public final boolean component1() {
        return this.blocking;
    }

    public final String component2() {
        return this.body;
    }

    public final Integer component3() {
        return this.backgroundColor;
    }

    public final boolean component4() {
        return this.html;
    }

    public final String component5() {
        return this.identifier;
    }

    public final AlertImage component6() {
        return this.image;
    }

    public final Integer component7() {
        return this.textColor;
    }

    public final String component8() {
        return this.title;
    }

    public final WireAlert copy(boolean z, String body, Integer num, boolean z2, String identifier, AlertImage alertImage, Integer num2, String title) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(title, "title");
        return new WireAlert(z, body, num, z2, identifier, alertImage, num2, title);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireAlert) {
            WireAlert wireAlert = (WireAlert) obj;
            return this.blocking == wireAlert.blocking && Intrinsics.areEqual(this.body, wireAlert.body) && Intrinsics.areEqual(this.backgroundColor, wireAlert.backgroundColor) && this.html == wireAlert.html && Intrinsics.areEqual(this.identifier, wireAlert.identifier) && this.image == wireAlert.image && Intrinsics.areEqual(this.textColor, wireAlert.textColor) && Intrinsics.areEqual(this.title, wireAlert.title);
        }
        return false;
    }

    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public final boolean getBlocking() {
        return this.blocking;
    }

    public final String getBody() {
        return this.body;
    }

    public final boolean getHtml() {
        return this.html;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final AlertImage getImage() {
        return this.image;
    }

    public final Integer getTextColor() {
        return this.textColor;
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    public int hashCode() {
        boolean z = this.blocking;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = ((r0 * 31) + this.body.hashCode()) * 31;
        Integer num = this.backgroundColor;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        boolean z2 = this.html;
        int hashCode3 = (((hashCode2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.identifier.hashCode()) * 31;
        AlertImage alertImage = this.image;
        int hashCode4 = (hashCode3 + (alertImage == null ? 0 : alertImage.hashCode())) * 31;
        Integer num2 = this.textColor;
        return ((hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.title.hashCode();
    }

    public String toString() {
        boolean z = this.blocking;
        String str = this.body;
        Integer num = this.backgroundColor;
        boolean z2 = this.html;
        String str2 = this.identifier;
        AlertImage alertImage = this.image;
        Integer num2 = this.textColor;
        String str3 = this.title;
        return "WireAlert(blocking=" + z + ", body=" + str + ", backgroundColor=" + num + ", html=" + z2 + ", identifier=" + str2 + ", image=" + alertImage + ", textColor=" + num2 + ", title=" + str3 + ")";
    }

    public WireAlert(boolean z, String body, Integer num, boolean z2, String identifier, AlertImage alertImage, Integer num2, String title) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(title, "title");
        this.blocking = z;
        this.body = body;
        this.backgroundColor = num;
        this.html = z2;
        this.identifier = identifier;
        this.image = alertImage;
        this.textColor = num2;
        this.title = title;
    }

    public /* synthetic */ WireAlert(boolean z, String str, Integer num, boolean z2, String str2, AlertImage alertImage, Integer num2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? null : alertImage, (i & 64) == 0 ? num2 : null, (i & 128) == 0 ? str3 : "");
    }
}
