package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Point;
import co.bird.android.model.constant.BountyFlightSheetActionType;
import co.bird.android.model.constant.BountyFlightSheetSectionType;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.persistence.BountyFlightSheetDetails;
import co.bird.android.model.persistence.BountyMapMarker;
import co.bird.android.model.persistence.FleetMarker;
import co.bird.android.model.persistence.nestedstructures.BountyFlightSheetAction;
import co.bird.android.model.persistence.nestedstructures.BountyFlightSheetHeader;
import co.bird.android.model.persistence.nestedstructures.BountyFlightSheetMapButtonOverrides;
import co.bird.android.model.persistence.nestedstructures.BountyFlightSheetSection;
import co.bird.android.model.persistence.nestedstructures.BountyFlightSheetSectionPhotos;
import co.bird.android.model.persistence.nestedstructures.BountyFlightSheetSectionText;
import co.bird.android.model.persistence.nestedstructures.BountyFlightSheetSectionVehicleList;
import co.bird.android.model.persistence.nestedstructures.BountyFlightSheetVehicle;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import co.bird.android.model.wire.WireBounty;
import co.bird.android.model.wire.WireBountyFlightSheetAction;
import co.bird.android.model.wire.WireBountyFlightSheetDetails;
import co.bird.android.model.wire.WireBountyFlightSheetHeader;
import co.bird.android.model.wire.WireBountyFlightSheetMapButtonOverrides;
import co.bird.android.model.wire.WireBountyFlightSheetSection;
import co.bird.android.model.wire.WireBountyFlightSheetSectionPhotos;
import co.bird.android.model.wire.WireBountyFlightSheetSectionText;
import co.bird.android.model.wire.WireBountyFlightSheetSectionVehicleList;
import co.bird.android.model.wire.WireBountyFlightSheetVehicle;
import co.bird.android.model.wire.WireFleetMarker;
import co.bird.android.model.wire.WireThemedColors;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0007\u001a\u00020\u0006*\u00020\u0005\u001a\f\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\b\u001a\n\u0010\r\u001a\u00020\f*\u00020\u000b\u001a\n\u0010\u0010\u001a\u00020\u000f*\u00020\u000e\u001a\n\u0010\u0013\u001a\u00020\u0012*\u00020\u0011\u001a\n\u0010\u0016\u001a\u00020\u0015*\u00020\u0014\u001a\n\u0010\u0019\u001a\u00020\u0018*\u00020\u0017\u001a\n\u0010\u001c\u001a\u00020\u001b*\u00020\u001a\u001a\n\u0010\u001f\u001a\u00020\u001e*\u00020\u001d¨\u0006 "}, m28432d2 = {"Lco/bird/android/model/wire/WireBountyFlightSheetDetails;", "", "id", "Lco/bird/android/model/persistence/BountyFlightSheetDetails;", C17296a.f69688o, "Lco/bird/android/model/wire/WireBountyFlightSheetMapButtonOverrides;", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetMapButtonOverrides;", "e", "Lco/bird/android/model/wire/WireBountyFlightSheetAction;", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction;", "c", "Lco/bird/android/model/wire/WireBountyFlightSheetHeader;", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetHeader;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/wire/WireBountyFlightSheetSection;", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSection;", "f", "Lco/bird/android/model/wire/WireBountyFlightSheetSectionPhotos;", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionPhotos;", "g", "Lco/bird/android/model/wire/WireBountyFlightSheetSectionText;", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionText;", "h", "Lco/bird/android/model/wire/WireBountyFlightSheetSectionVehicleList;", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionVehicleList;", "i", "Lco/bird/android/model/wire/WireBountyFlightSheetVehicle;", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetVehicle;", "j", "Lco/bird/android/model/wire/WireBounty;", "Lco/bird/android/model/persistence/BountyMapMarker;", "b", "bounty_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBountyConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BountyConversion.kt\nco/bird/android/repository/converter/BountyConversionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1549#2:124\n1620#2,3:125\n1549#2:128\n1620#2,3:129\n1549#2:133\n1620#2,3:134\n1#3:132\n*S KotlinDebug\n*F\n+ 1 BountyConversion.kt\nco/bird/android/repository/converter/BountyConversionKt\n*L\n31#1:124\n31#1:125,3\n33#1:128\n33#1:129,3\n100#1:133\n100#1:134,3\n*E\n"})
/* renamed from: z00  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52537z00 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z00$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C30809a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BountyFlightSheetActionType.values().length];
            try {
                iArr[BountyFlightSheetActionType.NAVIGATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BountyFlightSheetActionType.RECHECK_SURPLUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BountyFlightSheetActionType.ACCEPT_DESIGNATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BountyFlightSheetActionType.CANCEL_DESIGNATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BountyFlightSheetActionType.CAPTURE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BountyFlightSheetActionType.RESOLVE_COMPLAINT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BountyFlightSheetActionType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final BountyFlightSheetDetails m2124a(WireBountyFlightSheetDetails wireBountyFlightSheetDetails, String id) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Intrinsics.checkNotNullParameter(wireBountyFlightSheetDetails, "<this>");
        Intrinsics.checkNotNullParameter(id, "id");
        List<WireBountyFlightSheetMapButtonOverrides> mapButtonOverrides = wireBountyFlightSheetDetails.getMapButtonOverrides();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(mapButtonOverrides, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireBountyFlightSheetMapButtonOverrides wireBountyFlightSheetMapButtonOverrides : mapButtonOverrides) {
            arrayList.add(m2120e(wireBountyFlightSheetMapButtonOverrides));
        }
        BountyFlightSheetHeader m2121d = m2121d(wireBountyFlightSheetDetails.getHeader());
        List<WireBountyFlightSheetSection> sections = wireBountyFlightSheetDetails.getSections();
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(sections, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        for (WireBountyFlightSheetSection wireBountyFlightSheetSection : sections) {
            arrayList2.add(m2119f(wireBountyFlightSheetSection));
        }
        return new BountyFlightSheetDetails(id, arrayList, m2121d, arrayList2);
    }

    /* renamed from: b */
    public static final BountyMapMarker m2123b(WireBounty wireBounty) {
        FleetMarker fleetMarker;
        DateTime dateTime;
        Intrinsics.checkNotNullParameter(wireBounty, "<this>");
        String id = wireBounty.getId();
        Geolocation m17966a = C47311qB0.m17966a(wireBounty.getLocation());
        WireFleetMarker marker = wireBounty.getMarker();
        if (marker != null) {
            fleetMarker = C47311qB0.m17965b(marker);
        } else {
            fleetMarker = null;
        }
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        WireFleetMarker marker2 = wireBounty.getMarker();
        if (marker2 != null) {
            dateTime = marker2.getCountdownUntil();
        } else {
            dateTime = null;
        }
        return new BountyMapMarker(id, m17966a, fleetMarker, now, dateTime);
    }

    /* renamed from: c */
    public static final BountyFlightSheetAction m2122c(WireBountyFlightSheetAction wireBountyFlightSheetAction) {
        BountyFlightSheetAction navigate;
        String acceptDestinationConfirmationBody;
        List<String> bountyIds;
        Intrinsics.checkNotNullParameter(wireBountyFlightSheetAction, "<this>");
        switch (C30809a.$EnumSwitchMapping$0[wireBountyFlightSheetAction.getType().ordinal()]) {
            case 1:
                Point navigationLocation = wireBountyFlightSheetAction.getNavigationLocation();
                if (navigationLocation == null) {
                    return null;
                }
                navigate = new BountyFlightSheetAction.Navigate(navigationLocation);
                break;
            case 2:
                String surplusId = wireBountyFlightSheetAction.getSurplusId();
                if (surplusId == null) {
                    return null;
                }
                navigate = new BountyFlightSheetAction.RecheckSurplus(surplusId);
                break;
            case 3:
                String acceptDestinationConfirmationTitle = wireBountyFlightSheetAction.getAcceptDestinationConfirmationTitle();
                if (acceptDestinationConfirmationTitle == null || (acceptDestinationConfirmationBody = wireBountyFlightSheetAction.getAcceptDestinationConfirmationBody()) == null || (bountyIds = wireBountyFlightSheetAction.getBountyIds()) == null) {
                    return null;
                }
                navigate = new BountyFlightSheetAction.AcceptDesignation(acceptDestinationConfirmationTitle, acceptDestinationConfirmationBody, bountyIds);
                break;
                break;
            case 4:
                List<String> bountyIds2 = wireBountyFlightSheetAction.getBountyIds();
                if (bountyIds2 == null) {
                    return null;
                }
                navigate = new BountyFlightSheetAction.CancelDesignation(bountyIds2);
                break;
            case 5:
                return BountyFlightSheetAction.Capture.INSTANCE;
            case 6:
                List<String> complaintIds = wireBountyFlightSheetAction.getComplaintIds();
                if (complaintIds == null) {
                    return null;
                }
                navigate = new BountyFlightSheetAction.ResolveComplaint(complaintIds);
                break;
            case 7:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return navigate;
    }

    /* renamed from: d */
    public static final BountyFlightSheetHeader m2121d(WireBountyFlightSheetHeader wireBountyFlightSheetHeader) {
        Intrinsics.checkNotNullParameter(wireBountyFlightSheetHeader, "<this>");
        return new BountyFlightSheetHeader(C47311qB0.m17965b(wireBountyFlightSheetHeader.getMarker()), wireBountyFlightSheetHeader.getTitle(), wireBountyFlightSheetHeader.getSubtitle());
    }

    /* renamed from: e */
    public static final BountyFlightSheetMapButtonOverrides m2120e(WireBountyFlightSheetMapButtonOverrides wireBountyFlightSheetMapButtonOverrides) {
        BountyFlightSheetAction bountyFlightSheetAction;
        Intrinsics.checkNotNullParameter(wireBountyFlightSheetMapButtonOverrides, "<this>");
        String title = wireBountyFlightSheetMapButtonOverrides.getTitle();
        WireBountyFlightSheetAction action = wireBountyFlightSheetMapButtonOverrides.getAction();
        if (action != null) {
            bountyFlightSheetAction = m2122c(action);
        } else {
            bountyFlightSheetAction = null;
        }
        return new BountyFlightSheetMapButtonOverrides(title, bountyFlightSheetAction);
    }

    /* renamed from: f */
    public static final BountyFlightSheetSection m2119f(WireBountyFlightSheetSection wireBountyFlightSheetSection) {
        BountyFlightSheetSectionText bountyFlightSheetSectionText;
        BountyFlightSheetSectionVehicleList bountyFlightSheetSectionVehicleList;
        Intrinsics.checkNotNullParameter(wireBountyFlightSheetSection, "<this>");
        BountyFlightSheetSectionType type = wireBountyFlightSheetSection.getType();
        WireBountyFlightSheetSectionText text = wireBountyFlightSheetSection.getText();
        BountyFlightSheetSectionPhotos bountyFlightSheetSectionPhotos = null;
        if (text != null) {
            bountyFlightSheetSectionText = m2117h(text);
        } else {
            bountyFlightSheetSectionText = null;
        }
        WireBountyFlightSheetSectionVehicleList vehicleList = wireBountyFlightSheetSection.getVehicleList();
        if (vehicleList != null) {
            bountyFlightSheetSectionVehicleList = m2116i(vehicleList);
        } else {
            bountyFlightSheetSectionVehicleList = null;
        }
        WireBountyFlightSheetSectionPhotos photos = wireBountyFlightSheetSection.getPhotos();
        if (photos != null) {
            bountyFlightSheetSectionPhotos = m2118g(photos);
        }
        return new BountyFlightSheetSection(type, bountyFlightSheetSectionText, bountyFlightSheetSectionVehicleList, bountyFlightSheetSectionPhotos);
    }

    /* renamed from: g */
    public static final BountyFlightSheetSectionPhotos m2118g(WireBountyFlightSheetSectionPhotos wireBountyFlightSheetSectionPhotos) {
        Intrinsics.checkNotNullParameter(wireBountyFlightSheetSectionPhotos, "<this>");
        return new BountyFlightSheetSectionPhotos(wireBountyFlightSheetSectionPhotos.getTitle(), wireBountyFlightSheetSectionPhotos.getPhotoUrls());
    }

    /* renamed from: h */
    public static final BountyFlightSheetSectionText m2117h(WireBountyFlightSheetSectionText wireBountyFlightSheetSectionText) {
        BountyFlightSheetAction bountyFlightSheetAction;
        Intrinsics.checkNotNullParameter(wireBountyFlightSheetSectionText, "<this>");
        String title = wireBountyFlightSheetSectionText.getTitle();
        String body = wireBountyFlightSheetSectionText.getBody();
        WireBountyFlightSheetAction action = wireBountyFlightSheetSectionText.getAction();
        if (action != null) {
            bountyFlightSheetAction = m2122c(action);
        } else {
            bountyFlightSheetAction = null;
        }
        return new BountyFlightSheetSectionText(title, body, bountyFlightSheetAction, wireBountyFlightSheetSectionText.getAutoDetectLinks());
    }

    /* renamed from: i */
    public static final BountyFlightSheetSectionVehicleList m2116i(WireBountyFlightSheetSectionVehicleList wireBountyFlightSheetSectionVehicleList) {
        BountyFlightSheetAction bountyFlightSheetAction;
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(wireBountyFlightSheetSectionVehicleList, "<this>");
        String title = wireBountyFlightSheetSectionVehicleList.getTitle();
        String subtitle = wireBountyFlightSheetSectionVehicleList.getSubtitle();
        WireBountyFlightSheetAction action = wireBountyFlightSheetSectionVehicleList.getAction();
        if (action != null) {
            bountyFlightSheetAction = m2122c(action);
        } else {
            bountyFlightSheetAction = null;
        }
        List<WireBountyFlightSheetVehicle> vehicles = wireBountyFlightSheetSectionVehicleList.getVehicles();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(vehicles, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireBountyFlightSheetVehicle wireBountyFlightSheetVehicle : vehicles) {
            arrayList.add(m2115j(wireBountyFlightSheetVehicle));
        }
        return new BountyFlightSheetSectionVehicleList(title, subtitle, bountyFlightSheetAction, arrayList);
    }

    /* renamed from: j */
    public static final BountyFlightSheetVehicle m2115j(WireBountyFlightSheetVehicle wireBountyFlightSheetVehicle) {
        ThemedColors themedColors;
        Intrinsics.checkNotNullParameter(wireBountyFlightSheetVehicle, "<this>");
        ClientIcon icon = wireBountyFlightSheetVehicle.getIcon();
        WireThemedColors iconColor = wireBountyFlightSheetVehicle.getIconColor();
        if (iconColor != null) {
            themedColors = C47311qB0.m17961f(iconColor);
        } else {
            themedColors = null;
        }
        return new BountyFlightSheetVehicle(icon, themedColors, C47311qB0.m17961f(wireBountyFlightSheetVehicle.getIconBackgroundColor()), wireBountyFlightSheetVehicle.getCode(), wireBountyFlightSheetVehicle.getBattery());
    }
}
