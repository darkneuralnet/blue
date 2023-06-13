package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.constant.NestIcon;
import co.bird.android.model.persistence.NestFlightSheetDetails;
import co.bird.android.model.persistence.nestedstructures.ClaimDetails;
import co.bird.android.model.persistence.nestedstructures.NestAllowedVehicleDetails;
import co.bird.android.model.persistence.nestedstructures.NestBirdle;
import co.bird.android.model.persistence.nestedstructures.NestBirdleIcon;
import co.bird.android.model.persistence.nestedstructures.NestButtons;
import co.bird.android.model.persistence.nestedstructures.NestCapacity;
import co.bird.android.model.persistence.nestedstructures.NestCapacityRecommendation;
import co.bird.android.model.persistence.nestedstructures.NestDetails;
import co.bird.android.model.persistence.nestedstructures.NestFavoritePartner;
import co.bird.android.model.persistence.nestedstructures.NestImages;
import co.bird.android.model.persistence.nestedstructures.NestStatus;
import co.bird.android.model.persistence.nestedstructures.NestSummary;
import co.bird.android.model.persistence.nestedstructures.NestVehicle;
import co.bird.android.model.persistence.nestedstructures.NestVehicleDetails;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import co.bird.android.model.wire.WireClaimDetails;
import co.bird.android.model.wire.WireFormattedFlightSheetDetail;
import co.bird.android.model.wire.WireNestAllowedVehicleDetails;
import co.bird.android.model.wire.WireNestBirdle;
import co.bird.android.model.wire.WireNestBirdleIcon;
import co.bird.android.model.wire.WireNestButtons;
import co.bird.android.model.wire.WireNestCapacity;
import co.bird.android.model.wire.WireNestCapacityRecommendation;
import co.bird.android.model.wire.WireNestDetails;
import co.bird.android.model.wire.WireNestFavoritePartner;
import co.bird.android.model.wire.WireNestFlightSheetDetails;
import co.bird.android.model.wire.WireNestImages;
import co.bird.android.model.wire.WireNestStatus;
import co.bird.android.model.wire.WireNestSummary;
import co.bird.android.model.wire.WireNestVehicle;
import co.bird.android.model.wire.WireNestVehicleDetails;
import co.bird.android.model.wire.WireThemedColors;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002\u001a\f\u0010\n\u001a\u00020\t*\u00020\bH\u0002\u001a\f\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002\u001a\u0016\u0010\u0012\u001a\u00020\u0011*\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002\u001a\f\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0002\u001a\f\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0002\u001a\f\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0002\u001a\f\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0002\u001a\f\u0010!\u001a\u00020 *\u00020\u001fH\u0002\u001a\f\u0010$\u001a\u00020#*\u00020\"H\u0002\u001a\f\u0010'\u001a\u00020&*\u00020%H\u0002\u001a\f\u0010*\u001a\u00020)*\u00020(H\u0002\u001a\f\u0010-\u001a\u00020,*\u00020+H\u0002\u001a\f\u00100\u001a\u00020/*\u00020.H\u0002¨\u00061"}, m28432d2 = {"Lco/bird/android/model/wire/WireNestFlightSheetDetails;", "", "nestId", "Lco/bird/android/model/persistence/NestFlightSheetDetails;", C17296a.f69688o, "Lco/bird/android/model/wire/WireNestSummary;", "Lco/bird/android/model/persistence/nestedstructures/NestSummary;", "m", "Lco/bird/android/model/wire/WireNestBirdle;", "Lco/bird/android/model/persistence/nestedstructures/NestBirdle;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/wire/WireNestBirdleIcon;", "Lco/bird/android/model/persistence/nestedstructures/NestBirdleIcon;", "e", "Lco/bird/android/model/wire/WireNestStatus;", "Lorg/joda/time/DateTime;", "claimExpiresAt", "Lco/bird/android/model/persistence/nestedstructures/NestStatus;", "l", "Lco/bird/android/model/wire/WireNestImages;", "Lco/bird/android/model/persistence/nestedstructures/NestImages;", "k", "Lco/bird/android/model/wire/WireNestCapacity;", "Lco/bird/android/model/persistence/nestedstructures/NestCapacity;", "g", "Lco/bird/android/model/wire/WireNestCapacityRecommendation;", "Lco/bird/android/model/persistence/nestedstructures/NestCapacityRecommendation;", "h", "Lco/bird/android/model/wire/WireNestDetails;", "Lco/bird/android/model/persistence/nestedstructures/NestDetails;", "i", "Lco/bird/android/model/wire/WireNestVehicleDetails;", "Lco/bird/android/model/persistence/nestedstructures/NestVehicleDetails;", "o", "Lco/bird/android/model/wire/WireNestVehicle;", "Lco/bird/android/model/persistence/nestedstructures/NestVehicle;", "n", "Lco/bird/android/model/wire/WireNestButtons;", "Lco/bird/android/model/persistence/nestedstructures/NestButtons;", "f", "Lco/bird/android/model/wire/WireClaimDetails;", "Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;", "b", "Lco/bird/android/model/wire/WireNestAllowedVehicleDetails;", "Lco/bird/android/model/persistence/nestedstructures/NestAllowedVehicleDetails;", "c", "Lco/bird/android/model/wire/WireNestFavoritePartner;", "Lco/bird/android/model/persistence/nestedstructures/NestFavoritePartner;", "j", "co.bird.android.repository.nest-flight-sheet"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNestFlightSheetConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFlightSheetConversion.kt\nco/bird/android/repository/nestflightsheet/conversion/NestFlightSheetConversionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,169:1\n1549#2:170\n1620#2,3:171\n1549#2:174\n1620#2,3:175\n1549#2:178\n1620#2,3:179\n1549#2:182\n1620#2,3:183\n1549#2:186\n1620#2,3:187\n1549#2:190\n1620#2,3:191\n*S KotlinDebug\n*F\n+ 1 NestFlightSheetConversion.kt\nco/bird/android/repository/nestflightsheet/conversion/NestFlightSheetConversionKt\n*L\n65#1:170\n65#1:171,3\n99#1:174\n99#1:175,3\n114#1:178\n114#1:179,3\n122#1:182\n122#1:183,3\n140#1:186\n140#1:187,3\n158#1:190\n158#1:191,3\n*E\n"})
/* renamed from: F33 */
/* loaded from: classes4.dex */
public final class F33 {
    /* renamed from: a */
    public static final NestFlightSheetDetails m108050a(WireNestFlightSheetDetails wireNestFlightSheetDetails, String nestId) {
        NestBirdle nestBirdle;
        NestStatus nestStatus;
        NestImages nestImages;
        NestCapacity nestCapacity;
        NestDetails nestDetails;
        NestVehicleDetails nestVehicleDetails;
        NestButtons nestButtons;
        ClaimDetails claimDetails;
        NestAllowedVehicleDetails nestAllowedVehicleDetails;
        Intrinsics.checkNotNullParameter(wireNestFlightSheetDetails, "<this>");
        Intrinsics.checkNotNullParameter(nestId, "nestId");
        NestSummary m108038m = m108038m(wireNestFlightSheetDetails.getNestSummary());
        WireNestBirdle nestBirdle2 = wireNestFlightSheetDetails.getNestBirdle();
        if (nestBirdle2 != null) {
            nestBirdle = m108047d(nestBirdle2);
        } else {
            nestBirdle = null;
        }
        WireNestStatus nestStatus2 = wireNestFlightSheetDetails.getNestStatus();
        if (nestStatus2 != null) {
            nestStatus = m108039l(nestStatus2, wireNestFlightSheetDetails.getNestSummary().getClaimExpiresAt());
        } else {
            nestStatus = null;
        }
        WireNestImages nestImages2 = wireNestFlightSheetDetails.getNestImages();
        if (nestImages2 != null) {
            nestImages = m108040k(nestImages2);
        } else {
            nestImages = null;
        }
        WireNestCapacity nestCapacity2 = wireNestFlightSheetDetails.getNestCapacity();
        if (nestCapacity2 != null) {
            nestCapacity = m108044g(nestCapacity2);
        } else {
            nestCapacity = null;
        }
        WireNestDetails nestDetails2 = wireNestFlightSheetDetails.getNestDetails();
        if (nestDetails2 != null) {
            nestDetails = m108042i(nestDetails2);
        } else {
            nestDetails = null;
        }
        WireNestVehicleDetails vehicleDetails = wireNestFlightSheetDetails.getVehicleDetails();
        if (vehicleDetails != null) {
            nestVehicleDetails = m108036o(vehicleDetails);
        } else {
            nestVehicleDetails = null;
        }
        WireNestButtons nestButtons2 = wireNestFlightSheetDetails.getNestButtons();
        if (nestButtons2 != null) {
            nestButtons = m108045f(nestButtons2);
        } else {
            nestButtons = null;
        }
        WireClaimDetails claimDetails2 = wireNestFlightSheetDetails.getClaimDetails();
        if (claimDetails2 != null) {
            claimDetails = m108049b(claimDetails2);
        } else {
            claimDetails = null;
        }
        WireNestAllowedVehicleDetails nestAllowedVehicles = wireNestFlightSheetDetails.getNestAllowedVehicles();
        if (nestAllowedVehicles != null) {
            nestAllowedVehicleDetails = m108048c(nestAllowedVehicles);
        } else {
            nestAllowedVehicleDetails = null;
        }
        return new NestFlightSheetDetails(nestId, m108038m, nestBirdle, nestStatus, nestImages, nestCapacity, nestDetails, nestVehicleDetails, nestButtons, claimDetails, nestAllowedVehicleDetails, wireNestFlightSheetDetails.getNewClaimErrorMessage());
    }

    /* renamed from: b */
    public static final ClaimDetails m108049b(WireClaimDetails wireClaimDetails) {
        return new ClaimDetails(wireClaimDetails.getStatus(), wireClaimDetails.getSpaces(), wireClaimDetails.getClaimId());
    }

    /* renamed from: c */
    public static final NestAllowedVehicleDetails m108048c(WireNestAllowedVehicleDetails wireNestAllowedVehicleDetails) {
        int collectionSizeOrDefault;
        int idx = wireNestAllowedVehicleDetails.getIdx();
        String title = wireNestAllowedVehicleDetails.getTitle();
        ClientIcon icon = wireNestAllowedVehicleDetails.getIcon();
        List<WireNestVehicle> vehicles = wireNestAllowedVehicleDetails.getVehicles();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(vehicles, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireNestVehicle wireNestVehicle : vehicles) {
            arrayList.add(m108037n(wireNestVehicle));
        }
        return new NestAllowedVehicleDetails(idx, title, arrayList, icon);
    }

    /* renamed from: d */
    public static final NestBirdle m108047d(WireNestBirdle wireNestBirdle) {
        int collectionSizeOrDefault;
        int idx = wireNestBirdle.getIdx();
        List<WireNestBirdleIcon> icons = wireNestBirdle.getIcons();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(icons, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireNestBirdleIcon wireNestBirdleIcon : icons) {
            arrayList.add(m108046e(wireNestBirdleIcon));
        }
        return new NestBirdle(idx, arrayList);
    }

    /* renamed from: e */
    public static final NestBirdleIcon m108046e(WireNestBirdleIcon wireNestBirdleIcon) {
        return new NestBirdleIcon(wireNestBirdleIcon.getIcon(), wireNestBirdleIcon.getCount());
    }

    /* renamed from: f */
    public static final NestButtons m108045f(WireNestButtons wireNestButtons) {
        List emptyList;
        int collectionSizeOrDefault;
        int idx = wireNestButtons.getIdx();
        List<WireNestFavoritePartner> availableFavoritePartners = wireNestButtons.getAvailableFavoritePartners();
        if (availableFavoritePartners != null) {
            List<WireNestFavoritePartner> list = availableFavoritePartners;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            emptyList = new ArrayList(collectionSizeOrDefault);
            for (WireNestFavoritePartner wireNestFavoritePartner : list) {
                emptyList.add(m108041j(wireNestFavoritePartner));
            }
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        return new NestButtons(idx, emptyList, wireNestButtons.getButtons());
    }

    /* renamed from: g */
    public static final NestCapacity m108044g(WireNestCapacity wireNestCapacity) {
        int collectionSizeOrDefault;
        int idx = wireNestCapacity.getIdx();
        int capacity = wireNestCapacity.getCapacity();
        List<WireNestCapacityRecommendation> recommendations = wireNestCapacity.getRecommendations();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(recommendations, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireNestCapacityRecommendation wireNestCapacityRecommendation : recommendations) {
            arrayList.add(m108043h(wireNestCapacityRecommendation));
        }
        return new NestCapacity(idx, capacity, arrayList);
    }

    /* renamed from: h */
    public static final NestCapacityRecommendation m108043h(WireNestCapacityRecommendation wireNestCapacityRecommendation) {
        return new NestCapacityRecommendation(wireNestCapacityRecommendation.getIcon(), wireNestCapacityRecommendation.getTitle(), wireNestCapacityRecommendation.getQuantity());
    }

    /* renamed from: i */
    public static final NestDetails m108042i(WireNestDetails wireNestDetails) {
        int collectionSizeOrDefault;
        int idx = wireNestDetails.getIdx();
        List<WireFormattedFlightSheetDetail> details = wireNestDetails.getDetails();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(details, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireFormattedFlightSheetDetail wireFormattedFlightSheetDetail : details) {
            arrayList.add(C47311qB0.m17963d(wireFormattedFlightSheetDetail));
        }
        return new NestDetails(idx, arrayList);
    }

    /* renamed from: j */
    public static final NestFavoritePartner m108041j(WireNestFavoritePartner wireNestFavoritePartner) {
        return new NestFavoritePartner(wireNestFavoritePartner.getPartnerId(), wireNestFavoritePartner.getDisplayName());
    }

    /* renamed from: k */
    public static final NestImages m108040k(WireNestImages wireNestImages) {
        return new NestImages(wireNestImages.getIdx(), wireNestImages.getImageUrls());
    }

    /* renamed from: l */
    public static final NestStatus m108039l(WireNestStatus wireNestStatus, DateTime dateTime) {
        ThemedColors themedColors;
        int idx = wireNestStatus.getIdx();
        String title = wireNestStatus.getTitle();
        String details = wireNestStatus.getDetails();
        NestIcon nestIcon = wireNestStatus.getNestIcon();
        WireThemedColors iconBackgroundColor = wireNestStatus.getIconBackgroundColor();
        if (iconBackgroundColor != null) {
            themedColors = C47311qB0.m17961f(iconBackgroundColor);
        } else {
            themedColors = null;
        }
        return new NestStatus(idx, title, details, nestIcon, themedColors, wireNestStatus.isRecommended(), dateTime);
    }

    /* renamed from: m */
    public static final NestSummary m108038m(WireNestSummary wireNestSummary) {
        return new NestSummary(wireNestSummary.getIdx(), wireNestSummary.getTitle(), wireNestSummary.getCapacity(), wireNestSummary.getClaimExpiresAt());
    }

    /* renamed from: n */
    public static final NestVehicle m108037n(WireNestVehicle wireNestVehicle) {
        return new NestVehicle(wireNestVehicle.getTitle(), wireNestVehicle.getStatusIcon(), C47311qB0.m17961f(wireNestVehicle.getStatusBackgroundColor()), wireNestVehicle.getBattery(), wireNestVehicle.getBirdId(), wireNestVehicle.getExpiresAt());
    }

    /* renamed from: o */
    public static final NestVehicleDetails m108036o(WireNestVehicleDetails wireNestVehicleDetails) {
        int collectionSizeOrDefault;
        int idx = wireNestVehicleDetails.getIdx();
        String title = wireNestVehicleDetails.getTitle();
        List<WireNestVehicle> vehicles = wireNestVehicleDetails.getVehicles();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(vehicles, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireNestVehicle wireNestVehicle : vehicles) {
            arrayList.add(m108037n(wireNestVehicle));
        }
        return new NestVehicleDetails(idx, title, arrayList);
    }
}
