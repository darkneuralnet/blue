package co.bird.android.model.persistence;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.AnnouncementContentType;
import co.bird.android.model.constant.AnnouncementContext;
import co.bird.android.model.constant.AnnouncementDisplayType;
import co.bird.android.model.persistence.nestedstructures.AnnouncementContextParameters;
import co.bird.android.model.persistence.nestedstructures.AnnouncementPage;
import co.bird.android.model.persistence.nestedstructures.LegacyAsset;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b<\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BË\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001fJ\t\u0010A\u001a\u00020\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010:J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010K\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cHÆ\u0003J\t\u0010L\u001a\u00020\u0005HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010O\u001a\u00020\tHÆ\u0003J\t\u0010P\u001a\u00020\u000bHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jü\u0001\u0010U\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010VJ\u0013\u0010W\u001a\u00020\u00152\b\u0010X\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Y\u001a\u00020ZHÖ\u0001J9\u0010[\u001a\u00020\u00152\b\u0010\\\u001a\u0004\u0018\u00010]2\b\u0010^\u001a\u0004\u0018\u00010Z2\b\u0010_\u001a\u0004\u0018\u00010\u00032\u000e\u0010`\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001c¢\u0006\u0002\u0010aJ\u0012\u0010b\u001a\u00020\u00152\b\u0010_\u001a\u0004\u0018\u00010\u0003H\u0002J\u0017\u0010c\u001a\u00020\u00152\b\u0010^\u001a\u0004\u0018\u00010ZH\u0002¢\u0006\u0002\u0010dJ\u0018\u0010e\u001a\u00020\u00152\u000e\u0010`\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001cH\u0002J\u0017\u0010f\u001a\u00020\u00152\b\u0010g\u001a\u0004\u0018\u00010]H\u0002¢\u0006\u0002\u0010hJ\t\u0010i\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0011\u00101\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u00103\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b3\u00102R\u0011\u00104\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b4\u00102R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010!R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010!R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010!R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010!R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010;\u001a\u0004\b9\u0010:R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010!R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010!R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010#¨\u0006j"}, m28432d2 = {"Lco/bird/android/model/persistence/Announcement;", "", "id", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Lco/bird/android/model/constant/AnnouncementContext;", "contextParameters", "Lco/bird/android/model/persistence/nestedstructures/AnnouncementContextParameters;", "displayType", "Lco/bird/android/model/constant/AnnouncementDisplayType;", "contentType", "Lco/bird/android/model/constant/AnnouncementContentType;", "title", "titleAsset", "Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;", "message", "messageUrl", "buttonText", "analyticsTitle", "buttonUrl", "openInWebview", "", "auxiliaryTitle", "auxiliaryBody", "auxiliaryAsset", "shareContent", "learnMoreUrl", "pages", "", "Lco/bird/android/model/persistence/nestedstructures/AnnouncementPage;", "navigationTitle", "(Ljava/lang/String;Lco/bird/android/model/constant/AnnouncementContext;Lco/bird/android/model/persistence/nestedstructures/AnnouncementContextParameters;Lco/bird/android/model/constant/AnnouncementDisplayType;Lco/bird/android/model/constant/AnnouncementContentType;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getAnalyticsTitle", "()Ljava/lang/String;", "getAuxiliaryAsset", "()Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;", "getAuxiliaryBody", "getAuxiliaryTitle", "getButtonText", "getButtonUrl", "getContentType", "()Lco/bird/android/model/constant/AnnouncementContentType;", "getContext", "()Lco/bird/android/model/constant/AnnouncementContext;", "getContextParameters", "()Lco/bird/android/model/persistence/nestedstructures/AnnouncementContextParameters;", "getDisplayType", "()Lco/bird/android/model/constant/AnnouncementDisplayType;", "getId", "isFullscreen", "()Z", "isGenericBanner", "isSideMenuBanner", "getLearnMoreUrl", "getMessage", "getMessageUrl", "getNavigationTitle", "getOpenInWebview", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPages", "()Ljava/util/List;", "getShareContent", "getTitle", "getTitleAsset", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lco/bird/android/model/constant/AnnouncementContext;Lco/bird/android/model/persistence/nestedstructures/AnnouncementContextParameters;Lco/bird/android/model/constant/AnnouncementDisplayType;Lco/bird/android/model/constant/AnnouncementContentType;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lco/bird/android/model/persistence/Announcement;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "isQualified", "rating", "", "duration", "role", "operatorRoles", "(Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Z", "isRoleQualified", "isWithinDuration", "(Ljava/lang/Integer;)Z", "isWithinOperatorRoles", "isWithinThreshold", "value", "(Ljava/lang/Float;)Z", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class Announcement {
    private final String analyticsTitle;
    private final LegacyAsset auxiliaryAsset;
    private final String auxiliaryBody;
    private final String auxiliaryTitle;
    private final String buttonText;
    private final String buttonUrl;
    private final AnnouncementContentType contentType;
    private final AnnouncementContext context;
    private final AnnouncementContextParameters contextParameters;
    private final AnnouncementDisplayType displayType;

    /* renamed from: id */
    private final String f66668id;
    private final String learnMoreUrl;
    private final String message;
    private final String messageUrl;
    private final String navigationTitle;
    private final Boolean openInWebview;
    private final List<AnnouncementPage> pages;
    private final String shareContent;
    private final String title;
    private final LegacyAsset titleAsset;

    public Announcement(String id, AnnouncementContext context, AnnouncementContextParameters announcementContextParameters, AnnouncementDisplayType displayType, AnnouncementContentType contentType, String str, LegacyAsset legacyAsset, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, LegacyAsset legacyAsset2, String str9, String str10, List<AnnouncementPage> list, String str11) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.f66668id = id;
        this.context = context;
        this.contextParameters = announcementContextParameters;
        this.displayType = displayType;
        this.contentType = contentType;
        this.title = str;
        this.titleAsset = legacyAsset;
        this.message = str2;
        this.messageUrl = str3;
        this.buttonText = str4;
        this.analyticsTitle = str5;
        this.buttonUrl = str6;
        this.openInWebview = bool;
        this.auxiliaryTitle = str7;
        this.auxiliaryBody = str8;
        this.auxiliaryAsset = legacyAsset2;
        this.shareContent = str9;
        this.learnMoreUrl = str10;
        this.pages = list;
        this.navigationTitle = str11;
    }

    private final boolean isRoleQualified(String str) {
        AnnouncementContextParameters announcementContextParameters = this.contextParameters;
        if (announcementContextParameters == null || str == null) {
            return true;
        }
        return Intrinsics.areEqual(str, announcementContextParameters.getRole());
    }

    private final boolean isWithinDuration(Integer num) {
        boolean z;
        boolean z2;
        AnnouncementContextParameters announcementContextParameters = this.contextParameters;
        if (announcementContextParameters == null) {
            return true;
        }
        if (num == null) {
            if (announcementContextParameters.getMinDuration() == null) {
                return true;
            }
        } else {
            if (announcementContextParameters.getMinDuration() != null && announcementContextParameters.getMinDuration().intValue() > num.intValue()) {
                z = false;
            } else {
                z = true;
            }
            if (announcementContextParameters.getMaxDuration() != null && announcementContextParameters.getMaxDuration().intValue() < num.intValue()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z && z2) {
                return true;
            }
        }
        return false;
    }

    private final boolean isWithinOperatorRoles(List<String> list) {
        boolean contains;
        AnnouncementContextParameters announcementContextParameters = this.contextParameters;
        if (announcementContextParameters == null) {
            return true;
        }
        if (list != null) {
            contains = CollectionsKt___CollectionsKt.contains(list, announcementContextParameters.getOperatorRole());
            return contains;
        }
        return false;
    }

    private final boolean isWithinThreshold(Float f) {
        boolean z;
        boolean z2;
        AnnouncementContextParameters announcementContextParameters = this.contextParameters;
        if (announcementContextParameters == null) {
            return true;
        }
        if (f == null) {
            if (announcementContextParameters.getMinThreshold() == null) {
                return true;
            }
        } else {
            if (announcementContextParameters.getMinThreshold() != null && announcementContextParameters.getMinThreshold().floatValue() > f.floatValue()) {
                z = false;
            } else {
                z = true;
            }
            if (announcementContextParameters.getMaxThreshold() != null && announcementContextParameters.getMaxThreshold().floatValue() < f.floatValue()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z && z2) {
                return true;
            }
        }
        return false;
    }

    public final String component1() {
        return this.f66668id;
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

    public final LegacyAsset component16() {
        return this.auxiliaryAsset;
    }

    public final String component17() {
        return this.shareContent;
    }

    public final String component18() {
        return this.learnMoreUrl;
    }

    public final List<AnnouncementPage> component19() {
        return this.pages;
    }

    public final AnnouncementContext component2() {
        return this.context;
    }

    public final String component20() {
        return this.navigationTitle;
    }

    public final AnnouncementContextParameters component3() {
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

    public final LegacyAsset component7() {
        return this.titleAsset;
    }

    public final String component8() {
        return this.message;
    }

    public final String component9() {
        return this.messageUrl;
    }

    public final Announcement copy(String id, AnnouncementContext context, AnnouncementContextParameters announcementContextParameters, AnnouncementDisplayType displayType, AnnouncementContentType contentType, String str, LegacyAsset legacyAsset, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, LegacyAsset legacyAsset2, String str9, String str10, List<AnnouncementPage> list, String str11) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        return new Announcement(id, context, announcementContextParameters, displayType, contentType, str, legacyAsset, str2, str3, str4, str5, str6, bool, str7, str8, legacyAsset2, str9, str10, list, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Announcement) {
            Announcement announcement = (Announcement) obj;
            return Intrinsics.areEqual(this.f66668id, announcement.f66668id) && this.context == announcement.context && Intrinsics.areEqual(this.contextParameters, announcement.contextParameters) && this.displayType == announcement.displayType && this.contentType == announcement.contentType && Intrinsics.areEqual(this.title, announcement.title) && Intrinsics.areEqual(this.titleAsset, announcement.titleAsset) && Intrinsics.areEqual(this.message, announcement.message) && Intrinsics.areEqual(this.messageUrl, announcement.messageUrl) && Intrinsics.areEqual(this.buttonText, announcement.buttonText) && Intrinsics.areEqual(this.analyticsTitle, announcement.analyticsTitle) && Intrinsics.areEqual(this.buttonUrl, announcement.buttonUrl) && Intrinsics.areEqual(this.openInWebview, announcement.openInWebview) && Intrinsics.areEqual(this.auxiliaryTitle, announcement.auxiliaryTitle) && Intrinsics.areEqual(this.auxiliaryBody, announcement.auxiliaryBody) && Intrinsics.areEqual(this.auxiliaryAsset, announcement.auxiliaryAsset) && Intrinsics.areEqual(this.shareContent, announcement.shareContent) && Intrinsics.areEqual(this.learnMoreUrl, announcement.learnMoreUrl) && Intrinsics.areEqual(this.pages, announcement.pages) && Intrinsics.areEqual(this.navigationTitle, announcement.navigationTitle);
        }
        return false;
    }

    public final String getAnalyticsTitle() {
        return this.analyticsTitle;
    }

    public final LegacyAsset getAuxiliaryAsset() {
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

    public final AnnouncementContextParameters getContextParameters() {
        return this.contextParameters;
    }

    public final AnnouncementDisplayType getDisplayType() {
        return this.displayType;
    }

    public final String getId() {
        return this.f66668id;
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

    public final List<AnnouncementPage> getPages() {
        return this.pages;
    }

    public final String getShareContent() {
        return this.shareContent;
    }

    public final String getTitle() {
        return this.title;
    }

    public final LegacyAsset getTitleAsset() {
        return this.titleAsset;
    }

    public int hashCode() {
        int hashCode = ((this.f66668id.hashCode() * 31) + this.context.hashCode()) * 31;
        AnnouncementContextParameters announcementContextParameters = this.contextParameters;
        int hashCode2 = (((((hashCode + (announcementContextParameters == null ? 0 : announcementContextParameters.hashCode())) * 31) + this.displayType.hashCode()) * 31) + this.contentType.hashCode()) * 31;
        String str = this.title;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        LegacyAsset legacyAsset = this.titleAsset;
        int hashCode4 = (hashCode3 + (legacyAsset == null ? 0 : legacyAsset.hashCode())) * 31;
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
        LegacyAsset legacyAsset2 = this.auxiliaryAsset;
        int hashCode13 = (hashCode12 + (legacyAsset2 == null ? 0 : legacyAsset2.hashCode())) * 31;
        String str9 = this.shareContent;
        int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.learnMoreUrl;
        int hashCode15 = (hashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<AnnouncementPage> list = this.pages;
        int hashCode16 = (hashCode15 + (list == null ? 0 : list.hashCode())) * 31;
        String str11 = this.navigationTitle;
        return hashCode16 + (str11 != null ? str11.hashCode() : 0);
    }

    public final boolean isFullscreen() {
        return this.displayType == AnnouncementDisplayType.FULL_SCREEN;
    }

    public final boolean isGenericBanner() {
        return this.displayType == AnnouncementDisplayType.BANNER && this.context != AnnouncementContext.SIDE_MENU;
    }

    public final boolean isQualified(Float f, Integer num, String str, List<String> list) {
        if (isWithinThreshold(f) && isWithinDuration(num) && (isRoleQualified(str) || isWithinOperatorRoles(list))) {
            return true;
        }
        return false;
    }

    public final boolean isSideMenuBanner() {
        return this.displayType == AnnouncementDisplayType.BANNER && this.context == AnnouncementContext.SIDE_MENU;
    }

    public String toString() {
        String str = this.f66668id;
        AnnouncementContext announcementContext = this.context;
        AnnouncementContextParameters announcementContextParameters = this.contextParameters;
        AnnouncementDisplayType announcementDisplayType = this.displayType;
        AnnouncementContentType announcementContentType = this.contentType;
        String str2 = this.title;
        LegacyAsset legacyAsset = this.titleAsset;
        String str3 = this.message;
        String str4 = this.messageUrl;
        String str5 = this.buttonText;
        String str6 = this.analyticsTitle;
        String str7 = this.buttonUrl;
        Boolean bool = this.openInWebview;
        String str8 = this.auxiliaryTitle;
        String str9 = this.auxiliaryBody;
        LegacyAsset legacyAsset2 = this.auxiliaryAsset;
        String str10 = this.shareContent;
        String str11 = this.learnMoreUrl;
        List<AnnouncementPage> list = this.pages;
        String str12 = this.navigationTitle;
        return "Announcement(id=" + str + ", context=" + announcementContext + ", contextParameters=" + announcementContextParameters + ", displayType=" + announcementDisplayType + ", contentType=" + announcementContentType + ", title=" + str2 + ", titleAsset=" + legacyAsset + ", message=" + str3 + ", messageUrl=" + str4 + ", buttonText=" + str5 + ", analyticsTitle=" + str6 + ", buttonUrl=" + str7 + ", openInWebview=" + bool + ", auxiliaryTitle=" + str8 + ", auxiliaryBody=" + str9 + ", auxiliaryAsset=" + legacyAsset2 + ", shareContent=" + str10 + ", learnMoreUrl=" + str11 + ", pages=" + list + ", navigationTitle=" + str12 + ")";
    }
}
