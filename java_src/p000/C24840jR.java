package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.BirdPlusSubscriptionViewIneligibleReason;
import co.bird.android.model.constant.BirdPlusSubscriptionViewStatus;
import co.bird.android.model.persistence.BirdPlusActivityView;
import co.bird.android.model.persistence.BirdPlusDisplayView;
import co.bird.android.model.persistence.BirdPlusPerkView;
import co.bird.android.model.persistence.BirdPlusSubcriptionPlanTrialView;
import co.bird.android.model.persistence.BirdPlusSubscriptionPlanView;
import co.bird.android.model.persistence.BirdPlusUserSubscriptionView;
import co.bird.android.model.persistence.BirdPlusView;
import co.bird.android.model.persistence.nestedstructures.AssetMedia;
import co.bird.android.model.persistence.nestedstructures.LegacyAsset;
import co.bird.android.model.wire.WireAssetMedia;
import co.bird.android.model.wire.WireLegacyAsset;
import co.bird.api.response.BirdPlusViewResponse;
import co.bird.api.response.WireBirdPlusActivity;
import co.bird.api.response.WireBirdPlusDisplay;
import co.bird.api.response.WireBirdPlusPerk;
import co.bird.api.response.WireBirdPlusSubscriptionPlan;
import co.bird.api.response.WireBirdPlusUserSubscription;
import co.bird.api.response.WireBirdPlusView;
import co.bird.api.response.WireSubscriptionPlanTrial;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000\u001a\u001e\u0010\t\u001a\u00020\u0002*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u001a\n\u0010\f\u001a\u00020\u000b*\u00020\n\u001a\n\u0010\u000f\u001a\u00020\u000e*\u00020\r\u001a\n\u0010\u0011\u001a\u00020\u0010*\u00020\u0005\u001a\n\u0010\u0014\u001a\u00020\u0013*\u00020\u0012\u001a\n\u0010\u0017\u001a\u00020\u0016*\u00020\u0015\u001a\n\u0010\u001a\u001a\u00020\u0019*\u00020\u0018\u001a\n\u0010\u001d\u001a\u00020\u001c*\u00020\u001b\u001a\n\u0010 \u001a\u00020\u001f*\u00020\u001e¨\u0006!"}, m28432d2 = {"Lco/bird/api/response/BirdPlusViewResponse;", "", "Lco/bird/android/model/persistence/BirdPlusView;", "j", "Lco/bird/api/response/WireBirdPlusView;", "Lco/bird/api/response/WireBirdPlusDisplay;", "display", "", "zendeskArticleId", "g", "Lco/bird/api/response/WireBirdPlusSubscriptionPlan;", "Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;", "e", "Lco/bird/api/response/WireBirdPlusUserSubscription;", "Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;", "f", "Lco/bird/android/model/persistence/BirdPlusDisplayView;", "b", "Lco/bird/android/model/wire/WireLegacyAsset;", "Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;", "i", "Lco/bird/android/model/wire/WireAssetMedia;", "Lco/bird/android/model/persistence/nestedstructures/AssetMedia;", "h", "Lco/bird/api/response/WireSubscriptionPlanTrial;", "Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/api/response/WireBirdPlusPerk;", "Lco/bird/android/model/persistence/BirdPlusPerkView;", "c", "Lco/bird/api/response/WireBirdPlusActivity;", "Lco/bird/android/model/persistence/BirdPlusActivityView;", C17296a.f69688o, "co.bird.android.repository.birdplus"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdPlusViewConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPlusViewConversion.kt\nco/bird/android/repository/birdplus/converters/BirdPlusViewConversionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,131:1\n1549#2:132\n1620#2,3:133\n1549#2:136\n1620#2,3:137\n1549#2:140\n1620#2,3:141\n1549#2:144\n1620#2,3:145\n*S KotlinDebug\n*F\n+ 1 BirdPlusViewConversion.kt\nco/bird/android/repository/birdplus/converters/BirdPlusViewConversionKt\n*L\n25#1:132\n25#1:133,3\n26#1:136\n26#1:137,3\n27#1:140\n27#1:141,3\n59#1:144\n59#1:145,3\n*E\n"})
/* renamed from: jR */
/* loaded from: classes4.dex */
public final class C24840jR {
    /* renamed from: a */
    public static final BirdPlusActivityView m30633a(WireBirdPlusActivity wireBirdPlusActivity) {
        Intrinsics.checkNotNullParameter(wireBirdPlusActivity, "<this>");
        return new BirdPlusActivityView(null, null, null, null);
    }

    /* renamed from: b */
    public static final BirdPlusDisplayView m30632b(WireBirdPlusDisplay wireBirdPlusDisplay) {
        LegacyAsset legacyAsset;
        LegacyAsset legacyAsset2;
        LegacyAsset legacyAsset3;
        LegacyAsset legacyAsset4;
        LegacyAsset legacyAsset5;
        LegacyAsset legacyAsset6;
        Intrinsics.checkNotNullParameter(wireBirdPlusDisplay, "<this>");
        WireLegacyAsset heroImage = wireBirdPlusDisplay.getHeroImage();
        if (heroImage != null) {
            legacyAsset = m30625i(heroImage);
        } else {
            legacyAsset = null;
        }
        WireLegacyAsset heroAnimation = wireBirdPlusDisplay.getHeroAnimation();
        if (heroAnimation != null) {
            legacyAsset2 = m30625i(heroAnimation);
        } else {
            legacyAsset2 = null;
        }
        String heroPillLabel = wireBirdPlusDisplay.getHeroPillLabel();
        String heroMessage = wireBirdPlusDisplay.getHeroMessage();
        WireLegacyAsset bannerIcon = wireBirdPlusDisplay.getBannerIcon();
        if (bannerIcon != null) {
            legacyAsset3 = m30625i(bannerIcon);
        } else {
            legacyAsset3 = null;
        }
        String bannerTitle = wireBirdPlusDisplay.getBannerTitle();
        String bannerMessage = wireBirdPlusDisplay.getBannerMessage();
        String planPreviewTitle = wireBirdPlusDisplay.getPlanPreviewTitle();
        String planPreviewMessage = wireBirdPlusDisplay.getPlanPreviewMessage();
        String planName = wireBirdPlusDisplay.getPlanName();
        WireLegacyAsset purchasedHeroTopImage = wireBirdPlusDisplay.getPurchasedHeroTopImage();
        if (purchasedHeroTopImage != null) {
            legacyAsset4 = m30625i(purchasedHeroTopImage);
        } else {
            legacyAsset4 = null;
        }
        String purchasedMessage = wireBirdPlusDisplay.getPurchasedMessage();
        WireLegacyAsset purchasedHeroBottomImage = wireBirdPlusDisplay.getPurchasedHeroBottomImage();
        if (purchasedHeroBottomImage != null) {
            legacyAsset5 = m30625i(purchasedHeroBottomImage);
        } else {
            legacyAsset5 = null;
        }
        WireLegacyAsset purchasedHeroAnimation = wireBirdPlusDisplay.getPurchasedHeroAnimation();
        if (purchasedHeroAnimation != null) {
            legacyAsset6 = m30625i(purchasedHeroAnimation);
        } else {
            legacyAsset6 = null;
        }
        return new BirdPlusDisplayView(legacyAsset, legacyAsset2, heroPillLabel, heroMessage, legacyAsset3, bannerTitle, bannerMessage, planPreviewTitle, planPreviewMessage, planName, legacyAsset4, purchasedMessage, legacyAsset5, legacyAsset6, wireBirdPlusDisplay.getPurchasedHeroTopColor(), wireBirdPlusDisplay.getPurchasedHeroBottomColor());
    }

    /* renamed from: c */
    public static final BirdPlusPerkView m30631c(WireBirdPlusPerk wireBirdPlusPerk) {
        LegacyAsset legacyAsset;
        Intrinsics.checkNotNullParameter(wireBirdPlusPerk, "<this>");
        WireLegacyAsset icon = wireBirdPlusPerk.getIcon();
        if (icon != null) {
            legacyAsset = m30625i(icon);
        } else {
            legacyAsset = null;
        }
        return new BirdPlusPerkView(legacyAsset, wireBirdPlusPerk.getTitle(), wireBirdPlusPerk.getDescription());
    }

    /* renamed from: d */
    public static final BirdPlusSubcriptionPlanTrialView m30630d(WireSubscriptionPlanTrial wireSubscriptionPlanTrial) {
        Intrinsics.checkNotNullParameter(wireSubscriptionPlanTrial, "<this>");
        return new BirdPlusSubcriptionPlanTrialView(wireSubscriptionPlanTrial.getDescription());
    }

    /* renamed from: e */
    public static final BirdPlusSubscriptionPlanView m30629e(WireBirdPlusSubscriptionPlan wireBirdPlusSubscriptionPlan) {
        BirdPlusDisplayView birdPlusDisplayView;
        BirdPlusSubcriptionPlanTrialView birdPlusSubcriptionPlanTrialView;
        ArrayList arrayList;
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(wireBirdPlusSubscriptionPlan, "<this>");
        String id = wireBirdPlusSubscriptionPlan.getId();
        String codename = wireBirdPlusSubscriptionPlan.getCodename();
        Integer priceAmount = wireBirdPlusSubscriptionPlan.getPriceAmount();
        Integer priceAmountTax = wireBirdPlusSubscriptionPlan.getPriceAmountTax();
        String currency = wireBirdPlusSubscriptionPlan.getCurrency();
        String zendeskArticleId = wireBirdPlusSubscriptionPlan.getZendeskArticleId();
        String legalMessage = wireBirdPlusSubscriptionPlan.getLegalMessage();
        WireBirdPlusDisplay display = wireBirdPlusSubscriptionPlan.getDisplay();
        if (display != null) {
            birdPlusDisplayView = m30632b(display);
        } else {
            birdPlusDisplayView = null;
        }
        WireSubscriptionPlanTrial trial = wireBirdPlusSubscriptionPlan.getTrial();
        if (trial != null) {
            birdPlusSubcriptionPlanTrialView = m30630d(trial);
        } else {
            birdPlusSubcriptionPlanTrialView = null;
        }
        List<WireBirdPlusPerk> perks = wireBirdPlusSubscriptionPlan.getPerks();
        if (perks != null) {
            List<WireBirdPlusPerk> list = perks;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            for (WireBirdPlusPerk wireBirdPlusPerk : list) {
                arrayList2.add(m30631c(wireBirdPlusPerk));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new BirdPlusSubscriptionPlanView(id, codename, priceAmount, priceAmountTax, currency, zendeskArticleId, legalMessage, birdPlusDisplayView, birdPlusSubcriptionPlanTrialView, arrayList);
    }

    /* renamed from: f */
    public static final BirdPlusUserSubscriptionView m30628f(WireBirdPlusUserSubscription wireBirdPlusUserSubscription) {
        BirdPlusActivityView birdPlusActivityView;
        Intrinsics.checkNotNullParameter(wireBirdPlusUserSubscription, "<this>");
        String id = wireBirdPlusUserSubscription.getId();
        DateTime recurringCanceledAt = wireBirdPlusUserSubscription.getRecurringCanceledAt();
        WireBirdPlusActivity activity = wireBirdPlusUserSubscription.getActivity();
        BirdPlusSubcriptionPlanTrialView birdPlusSubcriptionPlanTrialView = null;
        if (activity != null) {
            birdPlusActivityView = m30633a(activity);
        } else {
            birdPlusActivityView = null;
        }
        WireSubscriptionPlanTrial trial = wireBirdPlusUserSubscription.getTrial();
        if (trial != null) {
            birdPlusSubcriptionPlanTrialView = m30630d(trial);
        }
        return new BirdPlusUserSubscriptionView(id, recurringCanceledAt, birdPlusActivityView, birdPlusSubcriptionPlanTrialView);
    }

    /* renamed from: g */
    public static final BirdPlusView m30627g(WireBirdPlusView wireBirdPlusView, WireBirdPlusDisplay wireBirdPlusDisplay, String str) {
        String str2;
        String str3;
        String str4;
        BirdPlusSubscriptionPlanView birdPlusSubscriptionPlanView;
        BirdPlusUserSubscriptionView birdPlusUserSubscriptionView;
        BirdPlusDisplayView birdPlusDisplayView;
        String codename;
        String id;
        String id2;
        Intrinsics.checkNotNullParameter(wireBirdPlusView, "<this>");
        BirdPlusSubscriptionViewStatus status = wireBirdPlusView.getStatus();
        WireBirdPlusSubscriptionPlan subscriptionPlan = wireBirdPlusView.getSubscriptionPlan();
        if (subscriptionPlan == null || (id2 = subscriptionPlan.getId()) == null) {
            str2 = "";
        } else {
            str2 = id2;
        }
        WireBirdPlusUserSubscription userSubscription = wireBirdPlusView.getUserSubscription();
        if (userSubscription == null || (id = userSubscription.getId()) == null) {
            str3 = "";
        } else {
            str3 = id;
        }
        WireBirdPlusSubscriptionPlan subscriptionPlan2 = wireBirdPlusView.getSubscriptionPlan();
        if (subscriptionPlan2 == null || (codename = subscriptionPlan2.getCodename()) == null) {
            str4 = "";
        } else {
            str4 = codename;
        }
        WireBirdPlusSubscriptionPlan subscriptionPlan3 = wireBirdPlusView.getSubscriptionPlan();
        if (subscriptionPlan3 != null) {
            birdPlusSubscriptionPlanView = m30629e(subscriptionPlan3);
        } else {
            birdPlusSubscriptionPlanView = null;
        }
        WireBirdPlusUserSubscription userSubscription2 = wireBirdPlusView.getUserSubscription();
        if (userSubscription2 != null) {
            birdPlusUserSubscriptionView = m30628f(userSubscription2);
        } else {
            birdPlusUserSubscriptionView = null;
        }
        BirdPlusSubscriptionViewIneligibleReason ineligibleReason = wireBirdPlusView.getIneligibleReason();
        if (wireBirdPlusDisplay != null) {
            birdPlusDisplayView = m30632b(wireBirdPlusDisplay);
        } else {
            birdPlusDisplayView = null;
        }
        return new BirdPlusView(status, str2, str3, str4, birdPlusSubscriptionPlanView, birdPlusUserSubscriptionView, ineligibleReason, birdPlusDisplayView, str);
    }

    /* renamed from: h */
    public static final AssetMedia m30626h(WireAssetMedia wireAssetMedia) {
        Intrinsics.checkNotNullParameter(wireAssetMedia, "<this>");
        return new AssetMedia(wireAssetMedia.getMediaId(), wireAssetMedia.getName(), wireAssetMedia.getMediaUrl(), wireAssetMedia.getMediaType());
    }

    /* renamed from: i */
    public static final LegacyAsset m30625i(WireLegacyAsset wireLegacyAsset) {
        Intrinsics.checkNotNullParameter(wireLegacyAsset, "<this>");
        return new LegacyAsset(wireLegacyAsset.getKind(), m30626h(wireLegacyAsset.getMedia()));
    }

    /* renamed from: j */
    public static final List<BirdPlusView> m30624j(BirdPlusViewResponse birdPlusViewResponse) {
        ArrayList arrayList;
        ArrayList arrayList2;
        List listOfNotNull;
        List<BirdPlusView> flatten;
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        int collectionSizeOrDefault3;
        Intrinsics.checkNotNullParameter(birdPlusViewResponse, "<this>");
        List[] listArr = new List[3];
        List<WireBirdPlusView> available = birdPlusViewResponse.getAvailable();
        ArrayList arrayList3 = null;
        if (available != null) {
            List<WireBirdPlusView> list = available;
            collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            arrayList = new ArrayList(collectionSizeOrDefault3);
            for (WireBirdPlusView wireBirdPlusView : list) {
                arrayList.add(m30627g(wireBirdPlusView, birdPlusViewResponse.getDisplay(), birdPlusViewResponse.getZendeskArticleId()));
            }
        } else {
            arrayList = null;
        }
        listArr[0] = arrayList;
        List<WireBirdPlusView> active = birdPlusViewResponse.getActive();
        if (active != null) {
            List<WireBirdPlusView> list2 = active;
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            arrayList2 = new ArrayList(collectionSizeOrDefault2);
            for (WireBirdPlusView wireBirdPlusView2 : list2) {
                arrayList2.add(m30627g(wireBirdPlusView2, birdPlusViewResponse.getDisplay(), birdPlusViewResponse.getZendeskArticleId()));
            }
        } else {
            arrayList2 = null;
        }
        listArr[1] = arrayList2;
        List<WireBirdPlusView> ineligible = birdPlusViewResponse.getIneligible();
        if (ineligible != null) {
            List<WireBirdPlusView> list3 = ineligible;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10);
            arrayList3 = new ArrayList(collectionSizeOrDefault);
            for (WireBirdPlusView wireBirdPlusView3 : list3) {
                arrayList3.add(m30627g(wireBirdPlusView3, birdPlusViewResponse.getDisplay(), birdPlusViewResponse.getZendeskArticleId()));
            }
        }
        listArr[2] = arrayList3;
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) listArr);
        flatten = CollectionsKt__IterablesKt.flatten(listOfNotNull);
        return flatten;
    }
}
