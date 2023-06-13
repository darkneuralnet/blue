package co.bird.android.model.wire;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, m28432d2 = {"Lco/bird/android/model/wire/WireOperatorTaskBanner;", "", "title", "", "titleColor", "Lco/bird/android/model/wire/WireThemedColors;", "backgroundColor", "(Ljava/lang/String;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireThemedColors;)V", "getBackgroundColor", "()Lco/bird/android/model/wire/WireThemedColors;", "getTitle", "()Ljava/lang/String;", "getTitleColor", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireOperatorTaskBanner {
    @JsonProperty("background_color")
    @InterfaceC41208ft5("background_color")
    private final WireThemedColors backgroundColor;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("title_color")
    @InterfaceC41208ft5("title_color")
    private final WireThemedColors titleColor;

    public WireOperatorTaskBanner() {
        this(null, null, null, 7, null);
    }

    public final WireThemedColors getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getTitle() {
        return this.title;
    }

    public final WireThemedColors getTitleColor() {
        return this.titleColor;
    }

    public WireOperatorTaskBanner(String title, WireThemedColors titleColor, WireThemedColors backgroundColor) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleColor, "titleColor");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.title = title;
        this.titleColor = titleColor;
        this.backgroundColor = backgroundColor;
    }

    public /* synthetic */ WireOperatorTaskBanner(String str, WireThemedColors wireThemedColors, WireThemedColors wireThemedColors2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new WireThemedColors(0, 0, 3, null) : wireThemedColors, (i & 4) != 0 ? new WireThemedColors(0, 0, 3, null) : wireThemedColors2);
    }
}
