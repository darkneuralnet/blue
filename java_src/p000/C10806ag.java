package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.AnnouncementContentType;
import co.bird.android.model.constant.AnnouncementContext;
import co.bird.android.model.constant.AnnouncementDisplayType;
import co.bird.android.model.persistence.Announcement;
import co.bird.android.model.persistence.nestedstructures.AnnouncementContextParameters;
import co.bird.android.model.persistence.nestedstructures.AnnouncementPage;
import co.bird.android.model.persistence.nestedstructures.AssetMedia;
import co.bird.android.model.persistence.nestedstructures.LegacyAsset;
import co.bird.android.model.wire.WireAnnouncement;
import co.bird.android.model.wire.WireAnnouncementContextParameters;
import co.bird.android.model.wire.WireAnnouncementPage;
import co.bird.android.model.wire.WireAssetMedia;
import co.bird.android.model.wire.WireLegacyAsset;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0006\u001a\n\u0010\u000b\u001a\u00020\n*\u00020\t\u001a\n\u0010\u000e\u001a\u00020\r*\u00020\f¨\u0006\u000f"}, m28432d2 = {"Lco/bird/android/model/wire/WireAnnouncement;", "Lco/bird/android/model/persistence/Announcement;", C17296a.f69688o, "Lco/bird/android/model/wire/WireAnnouncementPage;", "Lco/bird/android/model/persistence/nestedstructures/AnnouncementPage;", "c", "Lco/bird/android/model/wire/WireAnnouncementContextParameters;", "Lco/bird/android/model/persistence/nestedstructures/AnnouncementContextParameters;", "b", "Lco/bird/android/model/wire/WireLegacyAsset;", "Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;", "e", "Lco/bird/android/model/wire/WireAssetMedia;", "Lco/bird/android/model/persistence/nestedstructures/AssetMedia;", DateTokenConverter.CONVERTER_KEY, "co.bird.android.repository.announcement"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnnouncementConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnouncementConversion.kt\nco/bird/android/repository/announcement/converters/AnnouncementConversionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,70:1\n1549#2:71\n1620#2,3:72\n*S KotlinDebug\n*F\n+ 1 AnnouncementConversion.kt\nco/bird/android/repository/announcement/converters/AnnouncementConversionKt\n*L\n35#1:71\n35#1:72,3\n*E\n"})
/* renamed from: ag */
/* loaded from: classes4.dex */
public final class C10806ag {
    /* renamed from: a */
    public static final Announcement m70903a(WireAnnouncement wireAnnouncement) {
        AnnouncementContextParameters announcementContextParameters;
        LegacyAsset legacyAsset;
        LegacyAsset legacyAsset2;
        String str;
        ArrayList arrayList;
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(wireAnnouncement, "<this>");
        String id = wireAnnouncement.getId();
        AnnouncementContext context = wireAnnouncement.getContext();
        WireAnnouncementContextParameters contextParameters = wireAnnouncement.getContextParameters();
        if (contextParameters != null) {
            announcementContextParameters = m70902b(contextParameters);
        } else {
            announcementContextParameters = null;
        }
        AnnouncementDisplayType displayType = wireAnnouncement.getDisplayType();
        AnnouncementContentType contentType = wireAnnouncement.getContentType();
        String title = wireAnnouncement.getTitle();
        WireLegacyAsset titleAsset = wireAnnouncement.getTitleAsset();
        if (titleAsset != null) {
            legacyAsset = m70899e(titleAsset);
        } else {
            legacyAsset = null;
        }
        String message = wireAnnouncement.getMessage();
        String messageUrl = wireAnnouncement.getMessageUrl();
        String buttonText = wireAnnouncement.getButtonText();
        String analyticsTitle = wireAnnouncement.getAnalyticsTitle();
        String buttonUrl = wireAnnouncement.getButtonUrl();
        Boolean openInWebview = wireAnnouncement.getOpenInWebview();
        String auxiliaryTitle = wireAnnouncement.getAuxiliaryTitle();
        String auxiliaryBody = wireAnnouncement.getAuxiliaryBody();
        WireLegacyAsset auxiliaryAsset = wireAnnouncement.getAuxiliaryAsset();
        if (auxiliaryAsset != null) {
            legacyAsset2 = m70899e(auxiliaryAsset);
        } else {
            legacyAsset2 = null;
        }
        String shareContent = wireAnnouncement.getShareContent();
        String learnMoreUrl = wireAnnouncement.getLearnMoreUrl();
        List<WireAnnouncementPage> pages = wireAnnouncement.getPages();
        if (pages != null) {
            List<WireAnnouncementPage> list = pages;
            str = auxiliaryTitle;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            for (WireAnnouncementPage wireAnnouncementPage : list) {
                arrayList2.add(m70901c(wireAnnouncementPage));
            }
            arrayList = arrayList2;
        } else {
            str = auxiliaryTitle;
            arrayList = null;
        }
        return new Announcement(id, context, announcementContextParameters, displayType, contentType, title, legacyAsset, message, messageUrl, buttonText, analyticsTitle, buttonUrl, openInWebview, str, auxiliaryBody, legacyAsset2, shareContent, learnMoreUrl, arrayList, wireAnnouncement.getNavigationTitle());
    }

    /* renamed from: b */
    public static final AnnouncementContextParameters m70902b(WireAnnouncementContextParameters wireAnnouncementContextParameters) {
        Intrinsics.checkNotNullParameter(wireAnnouncementContextParameters, "<this>");
        return new AnnouncementContextParameters(wireAnnouncementContextParameters.getMinThreshold(), wireAnnouncementContextParameters.getMaxThreshold(), wireAnnouncementContextParameters.getMinDuration(), wireAnnouncementContextParameters.getMaxDuration(), wireAnnouncementContextParameters.getRole(), wireAnnouncementContextParameters.getOperatorRole());
    }

    /* renamed from: c */
    public static final AnnouncementPage m70901c(WireAnnouncementPage wireAnnouncementPage) {
        LegacyAsset legacyAsset;
        Intrinsics.checkNotNullParameter(wireAnnouncementPage, "<this>");
        String title = wireAnnouncementPage.getTitle();
        String message = wireAnnouncementPage.getMessage();
        WireLegacyAsset titleAsset = wireAnnouncementPage.getTitleAsset();
        if (titleAsset != null) {
            legacyAsset = m70899e(titleAsset);
        } else {
            legacyAsset = null;
        }
        return new AnnouncementPage(title, message, legacyAsset);
    }

    /* renamed from: d */
    public static final AssetMedia m70900d(WireAssetMedia wireAssetMedia) {
        Intrinsics.checkNotNullParameter(wireAssetMedia, "<this>");
        return new AssetMedia(wireAssetMedia.getMediaId(), wireAssetMedia.getName(), wireAssetMedia.getMediaUrl(), wireAssetMedia.getMediaType());
    }

    /* renamed from: e */
    public static final LegacyAsset m70899e(WireLegacyAsset wireLegacyAsset) {
        Intrinsics.checkNotNullParameter(wireLegacyAsset, "<this>");
        return new LegacyAsset(wireLegacyAsset.getKind(), m70900d(wireLegacyAsset.getMedia()));
    }
}
