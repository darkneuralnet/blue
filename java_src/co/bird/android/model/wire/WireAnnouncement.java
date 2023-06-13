package co.bird.android.model.wire;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.AnnouncementContentType;
import co.bird.android.model.constant.AnnouncementContext;
import co.bird.android.model.constant.AnnouncementDisplayType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bÿ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010 J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u00107J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010I\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cHÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010N\u001a\u00020\tHÆ\u0003J\t\u0010O\u001a\u00020\u000bHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0088\u0002\u0010T\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010UJ\u0013\u0010V\u001a\u00020\u00152\b\u0010W\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010X\u001a\u00020YHÖ\u0001J\t\u0010Z\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\"R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\"R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\"R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\"R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\"R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00108\u001a\u0004\b6\u00107R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\"R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\"R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\"R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010$¨\u0006["}, m28432d2 = {"Lco/bird/android/model/wire/WireAnnouncement;", "", "id", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Lco/bird/android/model/constant/AnnouncementContext;", "contextParameters", "Lco/bird/android/model/wire/WireAnnouncementContextParameters;", "displayType", "Lco/bird/android/model/constant/AnnouncementDisplayType;", "contentType", "Lco/bird/android/model/constant/AnnouncementContentType;", "title", "titleAsset", "Lco/bird/android/model/wire/WireLegacyAsset;", "message", "messageUrl", "buttonText", "analyticsTitle", "buttonUrl", "openInWebview", "", "auxiliaryTitle", "auxiliaryBody", "auxiliaryAsset", "shareContent", "learnMoreUrl", "pages", "", "Lco/bird/android/model/wire/WireAnnouncementPage;", "navigationTitle", "startingBirdCode", "(Ljava/lang/String;Lco/bird/android/model/constant/AnnouncementContext;Lco/bird/android/model/wire/WireAnnouncementContextParameters;Lco/bird/android/model/constant/AnnouncementDisplayType;Lco/bird/android/model/constant/AnnouncementContentType;Ljava/lang/String;Lco/bird/android/model/wire/WireLegacyAsset;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireLegacyAsset;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getAnalyticsTitle", "()Ljava/lang/String;", "getAuxiliaryAsset", "()Lco/bird/android/model/wire/WireLegacyAsset;", "getAuxiliaryBody", "getAuxiliaryTitle", "getButtonText", "getButtonUrl", "getContentType", "()Lco/bird/android/model/constant/AnnouncementContentType;", "getContext", "()Lco/bird/android/model/constant/AnnouncementContext;", "getContextParameters", "()Lco/bird/android/model/wire/WireAnnouncementContextParameters;", "getDisplayType", "()Lco/bird/android/model/constant/AnnouncementDisplayType;", "getId", "getLearnMoreUrl", "getMessage", "getMessageUrl", "getNavigationTitle", "getOpenInWebview", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPages", "()Ljava/util/List;", "getShareContent", "getStartingBirdCode", "getTitle", "getTitleAsset", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lco/bird/android/model/constant/AnnouncementContext;Lco/bird/android/model/wire/WireAnnouncementContextParameters;Lco/bird/android/model/constant/AnnouncementDisplayType;Lco/bird/android/model/constant/AnnouncementContentType;Ljava/lang/String;Lco/bird/android/model/wire/WireLegacyAsset;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireLegacyAsset;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lco/bird/android/model/wire/WireAnnouncement;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireAnnouncement {
    @JsonProperty("analytics_title")
    @InterfaceC41208ft5("analytics_title")
    private final String analyticsTitle;
    @JsonProperty("auxiliary_asset")
    @InterfaceC41208ft5("auxiliary_asset")
    private final WireLegacyAsset auxiliaryAsset;
    @JsonProperty("auxiliary_body")
    @InterfaceC41208ft5("auxiliary_body")
    private final String auxiliaryBody;
    @JsonProperty("auxiliary_title")
    @InterfaceC41208ft5("auxiliary_title")
    private final String auxiliaryTitle;
    @JsonProperty("button_text")
    @InterfaceC41208ft5("button_text")
    private final String buttonText;
    @JsonProperty("button_url")
    @InterfaceC41208ft5("button_url")
    private final String buttonUrl;
    @JsonProperty("content_type")
    @InterfaceC41208ft5("content_type")
    private final AnnouncementContentType contentType;
    @JsonProperty(CoreConstants.CONTEXT_SCOPE_VALUE)
    @InterfaceC41208ft5(CoreConstants.CONTEXT_SCOPE_VALUE)
    private final AnnouncementContext context;
    @JsonProperty("context_parameters")
    @InterfaceC41208ft5("context_parameters")
    private final WireAnnouncementContextParameters contextParameters;
    @JsonProperty("display_type")
    @InterfaceC41208ft5("display_type")
    private final AnnouncementDisplayType displayType;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66712id;
    @JsonProperty("learn_more_url")
    @InterfaceC41208ft5("learn_more_url")
    private final String learnMoreUrl;
    @JsonProperty("message")
    @InterfaceC41208ft5("message")
    private final String message;
    @JsonProperty("message_url")
    @InterfaceC41208ft5("message_url")
    private final String messageUrl;
    @JsonProperty("navigation_title")
    @InterfaceC41208ft5("navigation_title")
    private final String navigationTitle;
    @JsonProperty("open_in_webview")
    @InterfaceC41208ft5("open_in_webview")
    private final Boolean openInWebview;
    @JsonProperty("pages")
    @InterfaceC41208ft5("pages")
    private final List<WireAnnouncementPage> pages;
    @JsonProperty("share_content")
    @InterfaceC41208ft5("share_content")
    private final String shareContent;
    private final String startingBirdCode;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("title_asset")
    @InterfaceC41208ft5("title_asset")
    private final WireLegacyAsset titleAsset;

    public WireAnnouncement() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
    }

    public final String component1() {
        return this.f66712id;
    }

    public final String component10() {
        return this.buttonText;
    }

    public final String component11() {
        return this.analyticsTitle;
    }

    public final String component12() {
        return this.buttonUrl;
    }

    public final Boolean component13() {
        return this.openInWebview;
    }

    public final String component14() {
        return this.auxiliaryTitle;
    }

    public final String component15() {
        return this.auxiliaryBody;
    }

    public final WireLegacyAsset component16() {
        return this.auxiliaryAsset;
    }

    public final String component17() {
        return this.shareContent;
    }

    public final String component18() {
        return this.learnMoreUrl;
    }

    public final List<WireAnnouncementPage> component19() {
        return this.pages;
    }

    public final AnnouncementContext component2() {
        return this.context;
    }

    public final String component20() {
        return this.navigationTitle;
    }

    public final String component21() {
        return this.startingBirdCode;
    }

    public final WireAnnouncementContextParameters component3() {
        return this.contextParameters;
    }

    public final AnnouncementDisplayType component4() {
        return this.displayType;
    }

    public final AnnouncementContentType component5() {
        return this.contentType;
    }

    public final String component6() {
        return this.title;
    }

    public final WireLegacyAsset component7() {
        return this.titleAsset;
    }

    public final String component8() {
        return this.message;
    }

    public final String component9() {
        return this.messageUrl;
    }

    public final WireAnnouncement copy(String id, AnnouncementContext context, WireAnnouncementContextParameters wireAnnouncementContextParameters, AnnouncementDisplayType displayType, AnnouncementContentType contentType, String str, WireLegacyAsset wireLegacyAsset, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, WireLegacyAsset wireLegacyAsset2, String str9, String str10, List<WireAnnouncementPage> list, String str11, String str12) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        return new WireAnnouncement(id, context, wireAnnouncementContextParameters, displayType, contentType, str, wireLegacyAsset, str2, str3, str4, str5, str6, bool, str7, str8, wireLegacyAsset2, str9, str10, list, str11, str12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireAnnouncement) {
            WireAnnouncement wireAnnouncement = (WireAnnouncement) obj;
            return Intrinsics.areEqual(this.f66712id, wireAnnouncement.f66712id) && this.context == wireAnnouncement.context && Intrinsics.areEqual(this.contextParameters, wireAnnouncement.contextParameters) && this.displayType == wireAnnouncement.displayType && this.contentType == wireAnnouncement.contentType && Intrinsics.areEqual(this.title, wireAnnouncement.title) && Intrinsics.areEqual(this.titleAsset, wireAnnouncement.titleAsset) && Intrinsics.areEqual(this.message, wireAnnouncement.message) && Intrinsics.areEqual(this.messageUrl, wireAnnouncement.messageUrl) && Intrinsics.areEqual(this.buttonText, wireAnnouncement.buttonText) && Intrinsics.areEqual(this.analyticsTitle, wireAnnouncement.analyticsTitle) && Intrinsics.areEqual(this.buttonUrl, wireAnnouncement.buttonUrl) && Intrinsics.areEqual(this.openInWebview, wireAnnouncement.openInWebview) && Intrinsics.areEqual(this.auxiliaryTitle, wireAnnouncement.auxiliaryTitle) && Intrinsics.areEqual(this.auxiliaryBody, wireAnnouncement.auxiliaryBody) && Intrinsics.areEqual(this.auxiliaryAsset, wireAnnouncement.auxiliaryAsset) && Intrinsics.areEqual(this.shareContent, wireAnnouncement.shareContent) && Intrinsics.areEqual(this.learnMoreUrl, wireAnnouncement.learnMoreUrl) && Intrinsics.areEqual(this.pages, wireAnnouncement.pages) && Intrinsics.areEqual(this.navigationTitle, wireAnnouncement.navigationTitle) && Intrinsics.areEqual(this.startingBirdCode, wireAnnouncement.startingBirdCode);
        }
        return false;
    }

    public final String getAnalyticsTitle() {
        return this.analyticsTitle;
    }

    public final WireLegacyAsset getAuxiliaryAsset() {
        return this.auxiliaryAsset;
    }

    public final String getAuxiliaryBody() {
        return this.auxiliaryBody;
    }

    public final String getAuxiliaryTitle() {
        return this.auxiliaryTitle;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getButtonUrl() {
        return this.buttonUrl;
    }

    public final AnnouncementContentType getContentType() {
        return this.contentType;
    }

    public final AnnouncementContext getContext() {
        return this.context;
    }

    public final WireAnnouncementContextParameters getContextParameters() {
        return this.contextParameters;
    }

    public final AnnouncementDisplayType getDisplayType() {
        return this.displayType;
    }

    public final String getId() {
        return this.f66712id;
    }

    public final String getLearnMoreUrl() {
        return this.learnMoreUrl;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getMessageUrl() {
        return this.messageUrl;
    }

    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    public final Boolean getOpenInWebview() {
        return this.openInWebview;
    }

    public final List<WireAnnouncementPage> getPages() {
        return this.pages;
    }

    public final String getShareContent() {
        return this.shareContent;
    }

    public final String getStartingBirdCode() {
        return this.startingBirdCode;
    }

    public final String getTitle() {
        return this.title;
    }

    public final WireLegacyAsset getTitleAsset() {
        return this.titleAsset;
    }

    public int hashCode() {
        int hashCode = ((this.f66712id.hashCode() * 31) + this.context.hashCode()) * 31;
        WireAnnouncementContextParameters wireAnnouncementContextParameters = this.contextParameters;
        int hashCode2 = (((((hashCode + (wireAnnouncementContextParameters == null ? 0 : wireAnnouncementContextParameters.hashCode())) * 31) + this.displayType.hashCode()) * 31) + this.contentType.hashCode()) * 31;
        String str = this.title;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        WireLegacyAsset wireLegacyAsset = this.titleAsset;
        int hashCode4 = (hashCode3 + (wireLegacyAsset == null ? 0 : wireLegacyAsset.hashCode())) * 31;
        String str2 = this.message;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.messageUrl;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.buttonText;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.analyticsTitle;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.buttonUrl;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.openInWebview;
        int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str7 = this.auxiliaryTitle;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.auxiliaryBody;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        WireLegacyAsset wireLegacyAsset2 = this.auxiliaryAsset;
        int hashCode13 = (hashCode12 + (wireLegacyAsset2 == null ? 0 : wireLegacyAsset2.hashCode())) * 31;
        String str9 = this.shareContent;
        int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.learnMoreUrl;
        int hashCode15 = (hashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<WireAnnouncementPage> list = this.pages;
        int hashCode16 = (hashCode15 + (list == null ? 0 : list.hashCode())) * 31;
        String str11 = this.navigationTitle;
        int hashCode17 = (hashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.startingBirdCode;
        return hashCode17 + (str12 != null ? str12.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66712id;
        AnnouncementContext announcementContext = this.context;
        WireAnnouncementContextParameters wireAnnouncementContextParameters = this.contextParameters;
        AnnouncementDisplayType announcementDisplayType = this.displayType;
        AnnouncementContentType announcementContentType = this.contentType;
        String str2 = this.title;
        WireLegacyAsset wireLegacyAsset = this.titleAsset;
        String str3 = this.message;
        String str4 = this.messageUrl;
        String str5 = this.buttonText;
        String str6 = this.analyticsTitle;
        String str7 = this.buttonUrl;
        Boolean bool = this.openInWebview;
        String str8 = this.auxiliaryTitle;
        String str9 = this.auxiliaryBody;
        WireLegacyAsset wireLegacyAsset2 = this.auxiliaryAsset;
        String str10 = this.shareContent;
        String str11 = this.learnMoreUrl;
        List<WireAnnouncementPage> list = this.pages;
        String str12 = this.navigationTitle;
        String str13 = this.startingBirdCode;
        return "WireAnnouncement(id=" + str + ", context=" + announcementContext + ", contextParameters=" + wireAnnouncementContextParameters + ", displayType=" + announcementDisplayType + ", contentType=" + announcementContentType + ", title=" + str2 + ", titleAsset=" + wireLegacyAsset + ", message=" + str3 + ", messageUrl=" + str4 + ", buttonText=" + str5 + ", analyticsTitle=" + str6 + ", buttonUrl=" + str7 + ", openInWebview=" + bool + ", auxiliaryTitle=" + str8 + ", auxiliaryBody=" + str9 + ", auxiliaryAsset=" + wireLegacyAsset2 + ", shareContent=" + str10 + ", learnMoreUrl=" + str11 + ", pages=" + list + ", navigationTitle=" + str12 + ", startingBirdCode=" + str13 + ")";
    }

    public WireAnnouncement(String id, AnnouncementContext context, WireAnnouncementContextParameters wireAnnouncementContextParameters, AnnouncementDisplayType displayType, AnnouncementContentType contentType, String str, WireLegacyAsset wireLegacyAsset, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, WireLegacyAsset wireLegacyAsset2, String str9, String str10, List<WireAnnouncementPage> list, String str11, String str12) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.f66712id = id;
        this.context = context;
        this.contextParameters = wireAnnouncementContextParameters;
        this.displayType = displayType;
        this.contentType = contentType;
        this.title = str;
        this.titleAsset = wireLegacyAsset;
        this.message = str2;
        this.messageUrl = str3;
        this.buttonText = str4;
        this.analyticsTitle = str5;
        this.buttonUrl = str6;
        this.openInWebview = bool;
        this.auxiliaryTitle = str7;
        this.auxiliaryBody = str8;
        this.auxiliaryAsset = wireLegacyAsset2;
        this.shareContent = str9;
        this.learnMoreUrl = str10;
        this.pages = list;
        this.navigationTitle = str11;
        this.startingBirdCode = str12;
    }

    public /* synthetic */ WireAnnouncement(String str, AnnouncementContext announcementContext, WireAnnouncementContextParameters wireAnnouncementContextParameters, AnnouncementDisplayType announcementDisplayType, AnnouncementContentType announcementContentType, String str2, WireLegacyAsset wireLegacyAsset, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8, String str9, WireLegacyAsset wireLegacyAsset2, String str10, String str11, List list, String str12, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? AnnouncementContext.UNKNOWN : announcementContext, (i & 4) != 0 ? null : wireAnnouncementContextParameters, (i & 8) != 0 ? AnnouncementDisplayType.MODAL : announcementDisplayType, (i & 16) != 0 ? AnnouncementContentType.NATIVE : announcementContentType, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : wireLegacyAsset, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : str7, (i & 4096) != 0 ? null : bool, (i & 8192) != 0 ? null : str8, (i & 16384) != 0 ? null : str9, (i & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? null : wireLegacyAsset2, (i & 65536) != 0 ? null : str10, (i & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? null : str11, (i & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? null : list, (i & 524288) != 0 ? null : str12, (i & 1048576) != 0 ? null : str13);
    }
}
