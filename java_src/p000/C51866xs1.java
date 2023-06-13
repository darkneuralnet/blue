package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.BirdLocationSource;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.constant.FlightSheetAction;
import co.bird.android.model.constant.FlightSheetCommand;
import co.bird.android.model.constant.FlightSheetContext;
import co.bird.android.model.persistence.FlightSheetDetails;
import co.bird.android.model.persistence.nestedstructures.BirdLocationTrack;
import co.bird.android.model.persistence.nestedstructures.FlightSheetActions;
import co.bird.android.model.persistence.nestedstructures.FlightSheetBanner;
import co.bird.android.model.persistence.nestedstructures.FlightSheetCampaign;
import co.bird.android.model.persistence.nestedstructures.FlightSheetCommands;
import co.bird.android.model.persistence.nestedstructures.FlightSheetDetail;
import co.bird.android.model.persistence.nestedstructures.FlightSheetInfoSection;
import co.bird.android.model.persistence.nestedstructures.FlightSheetInfoSectionAction;
import co.bird.android.model.persistence.nestedstructures.FlightSheetIntOption;
import co.bird.android.model.persistence.nestedstructures.FlightSheetRideHistory;
import co.bird.android.model.persistence.nestedstructures.FlightSheetRideRating;
import co.bird.android.model.persistence.nestedstructures.FlightSheetRideRatingTag;
import co.bird.android.model.persistence.nestedstructures.FlightSheetRideRatings;
import co.bird.android.model.persistence.nestedstructures.FlightSheetVehicleSummary;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.persistence.nestedstructures.TaskOrderInfo;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import co.bird.android.model.wire.WireBirdLocationTrack;
import co.bird.android.model.wire.WireFlightSheetActions;
import co.bird.android.model.wire.WireFlightSheetBanner;
import co.bird.android.model.wire.WireFlightSheetCampaign;
import co.bird.android.model.wire.WireFlightSheetCommands;
import co.bird.android.model.wire.WireFlightSheetDetail;
import co.bird.android.model.wire.WireFlightSheetDetails;
import co.bird.android.model.wire.WireFlightSheetInfoSection;
import co.bird.android.model.wire.WireFlightSheetInfoSectionAction;
import co.bird.android.model.wire.WireFlightSheetIntOption;
import co.bird.android.model.wire.WireFlightSheetRatingTag;
import co.bird.android.model.wire.WireFlightSheetRideHistory;
import co.bird.android.model.wire.WireFlightSheetRideRating;
import co.bird.android.model.wire.WireFlightSheetRideRatings;
import co.bird.android.model.wire.WireFlightSheetVehicleSummary;
import co.bird.android.model.wire.WireTaskOrderInfo;
import co.bird.android.model.wire.WireThemedColors;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u001a\n\u0010\t\u001a\u00020\b*\u00020\u0007\u001a\n\u0010\f\u001a\u00020\u000b*\u00020\n\u001a\n\u0010\u000f\u001a\u00020\u000e*\u00020\r\u001a\n\u0010\u0012\u001a\u00020\u0011*\u00020\u0010\u001a\n\u0010\u0015\u001a\u00020\u0014*\u00020\u0013\u001a\n\u0010\u0018\u001a\u00020\u0017*\u00020\u0016\u001a\n\u0010\u001b\u001a\u00020\u001a*\u00020\u0019\u001a\n\u0010\u001e\u001a\u00020\u001d*\u00020\u001c\u001a\n\u0010!\u001a\u00020 *\u00020\u001f\u001a\n\u0010$\u001a\u00020#*\u00020\"\u001a\n\u0010'\u001a\u00020&*\u00020%\u001a\n\u0010*\u001a\u00020)*\u00020(\u001a\n\u0010-\u001a\u00020,*\u00020+\u001a\n\u00100\u001a\u00020/*\u00020.\u001a\f\u00103\u001a\u0004\u0018\u000102*\u000201¨\u00064"}, m28432d2 = {"Lco/bird/android/model/wire/WireFlightSheetDetails;", "", "vehicleId", "Lco/bird/android/model/constant/FlightSheetContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lco/bird/android/model/persistence/FlightSheetDetails;", C17296a.f69688o, "Lco/bird/android/model/wire/WireTaskOrderInfo;", "Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;", "p", "Lco/bird/android/model/wire/WireFlightSheetBanner;", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetVehicleSummary;", "o", "Lco/bird/android/model/wire/WireFlightSheetCommands;", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetCommands;", "f", "Lco/bird/android/model/wire/WireFlightSheetActions;", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetActions;", "c", "Lco/bird/android/model/wire/WireFlightSheetInfoSection;", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;", "h", "Lco/bird/android/model/wire/WireFlightSheetRideHistory;", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideHistory;", "k", "Lco/bird/android/model/wire/WireFlightSheetRideRatings;", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatings;", "n", "Lco/bird/android/model/wire/WireFlightSheetRideRating;", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRating;", "l", "Lco/bird/android/model/wire/WireFlightSheetRatingTag;", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatingTag;", "m", "Lco/bird/android/model/wire/WireFlightSheetDetail;", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetDetail;", "g", "Lco/bird/android/model/wire/WireFlightSheetIntOption;", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetIntOption;", "j", "Lco/bird/android/model/wire/WireBirdLocationTrack;", "Lco/bird/android/model/persistence/nestedstructures/BirdLocationTrack;", "b", "Lco/bird/android/model/wire/WireFlightSheetCampaign;", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetCampaign;", "e", "Lco/bird/android/model/wire/WireFlightSheetInfoSectionAction;", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSectionAction;", "i", "co.bird.android.repository.flight-sheet"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFlightSheetConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetConversion.kt\nco/bird/android/repository/flightsheet/converters/FlightSheetConversionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,197:1\n1549#2:198\n1620#2,3:199\n1549#2:202\n1620#2,3:203\n1549#2:206\n1620#2,3:207\n1549#2:210\n1620#2,3:211\n1549#2:214\n1620#2,3:215\n1549#2:218\n1620#2,3:219\n1549#2:222\n1620#2,3:223\n1549#2:226\n1620#2,3:227\n1549#2:230\n1620#2,3:231\n*S KotlinDebug\n*F\n+ 1 FlightSheetConversion.kt\nco/bird/android/repository/flightsheet/converters/FlightSheetConversionKt\n*L\n47#1:198\n47#1:199,3\n48#1:202\n48#1:203,3\n86#1:206\n86#1:207,3\n98#1:210\n98#1:211,3\n117#1:214\n117#1:215,3\n127#1:218\n127#1:219,3\n132#1:222\n132#1:223,3\n140#1:226\n140#1:227,3\n141#1:230\n141#1:231,3\n*E\n"})
/* renamed from: xs1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C51866xs1 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xs1$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C30334a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlightSheetAction.values().length];
            try {
                iArr[FlightSheetAction.CANNOT_CAPTURE_REPORTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final FlightSheetDetails m4547a(WireFlightSheetDetails wireFlightSheetDetails, String vehicleId, FlightSheetContext context) {
        FlightSheetBanner flightSheetBanner;
        FlightSheetCommands flightSheetCommands;
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        FlightSheetRideHistory flightSheetRideHistory;
        TaskOrderInfo taskOrderInfo;
        Intrinsics.checkNotNullParameter(wireFlightSheetDetails, "<this>");
        Intrinsics.checkNotNullParameter(vehicleId, "vehicleId");
        Intrinsics.checkNotNullParameter(context, "context");
        WireFlightSheetBanner banner = wireFlightSheetDetails.getBanner();
        FlightSheetRideRatings flightSheetRideRatings = null;
        if (banner != null) {
            flightSheetBanner = m4544d(banner);
        } else {
            flightSheetBanner = null;
        }
        FlightSheetVehicleSummary m4533o = m4533o(wireFlightSheetDetails.getVehicleSummary());
        WireFlightSheetCommands commands = wireFlightSheetDetails.getCommands();
        if (commands != null) {
            flightSheetCommands = m4542f(commands);
        } else {
            flightSheetCommands = null;
        }
        List<WireFlightSheetActions> actionSections = wireFlightSheetDetails.getActionSections();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(actionSections, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireFlightSheetActions wireFlightSheetActions : actionSections) {
            arrayList.add(m4545c(wireFlightSheetActions));
        }
        List<WireFlightSheetInfoSection> infoSections = wireFlightSheetDetails.getInfoSections();
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(infoSections, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        for (WireFlightSheetInfoSection wireFlightSheetInfoSection : infoSections) {
            arrayList2.add(m4540h(wireFlightSheetInfoSection));
        }
        WireFlightSheetRideHistory rideHistory = wireFlightSheetDetails.getRideHistory();
        if (rideHistory != null) {
            flightSheetRideHistory = m4537k(rideHistory);
        } else {
            flightSheetRideHistory = null;
        }
        WireTaskOrderInfo taskOrderInfo2 = wireFlightSheetDetails.getTaskOrderInfo();
        if (taskOrderInfo2 != null) {
            taskOrderInfo = m4532p(taskOrderInfo2);
        } else {
            taskOrderInfo = null;
        }
        WireFlightSheetRideRatings rideRatings = wireFlightSheetDetails.getRideRatings();
        if (rideRatings != null) {
            flightSheetRideRatings = m4534n(rideRatings);
        }
        return new FlightSheetDetails(vehicleId, context, flightSheetBanner, m4533o, flightSheetCommands, arrayList, arrayList2, flightSheetRideHistory, taskOrderInfo, flightSheetRideRatings);
    }

    /* renamed from: b */
    public static final BirdLocationTrack m4546b(WireBirdLocationTrack wireBirdLocationTrack) {
        Intrinsics.checkNotNullParameter(wireBirdLocationTrack, "<this>");
        return new BirdLocationTrack(C47311qB0.m17966a(wireBirdLocationTrack.getLocation()), wireBirdLocationTrack.getCreatedAt());
    }

    /* renamed from: c */
    public static final FlightSheetActions m4545c(WireFlightSheetActions wireFlightSheetActions) {
        ThemedColors themedColors;
        Intrinsics.checkNotNullParameter(wireFlightSheetActions, "<this>");
        int idx = wireFlightSheetActions.getIdx();
        String title = wireFlightSheetActions.getTitle();
        List<FlightSheetAction> actions = wireFlightSheetActions.getActions();
        WireThemedColors backgroundColor = wireFlightSheetActions.getBackgroundColor();
        if (backgroundColor != null) {
            themedColors = C47311qB0.m17961f(backgroundColor);
        } else {
            themedColors = null;
        }
        return new FlightSheetActions(idx, title, themedColors, actions);
    }

    /* renamed from: d */
    public static final FlightSheetBanner m4544d(WireFlightSheetBanner wireFlightSheetBanner) {
        ThemedColors themedColors;
        ThemedColors themedColors2;
        Intrinsics.checkNotNullParameter(wireFlightSheetBanner, "<this>");
        String text = wireFlightSheetBanner.getText();
        ThemedColors m17961f = C47311qB0.m17961f(wireFlightSheetBanner.getTextColor());
        ClientIcon icon = wireFlightSheetBanner.getIcon();
        WireThemedColors iconColor = wireFlightSheetBanner.getIconColor();
        if (iconColor != null) {
            themedColors = C47311qB0.m17961f(iconColor);
        } else {
            themedColors = null;
        }
        WireThemedColors backgroundColor = wireFlightSheetBanner.getBackgroundColor();
        if (backgroundColor != null) {
            themedColors2 = C47311qB0.m17961f(backgroundColor);
        } else {
            themedColors2 = null;
        }
        return new FlightSheetBanner(text, m17961f, icon, themedColors, themedColors2);
    }

    /* renamed from: e */
    public static final FlightSheetCampaign m4543e(WireFlightSheetCampaign wireFlightSheetCampaign) {
        Intrinsics.checkNotNullParameter(wireFlightSheetCampaign, "<this>");
        return new FlightSheetCampaign(wireFlightSheetCampaign.getCampaignName(), wireFlightSheetCampaign.getIcon(), C47311qB0.m17961f(wireFlightSheetCampaign.getIconBackgroundColor()), wireFlightSheetCampaign.getMessage(), wireFlightSheetCampaign.getDescription());
    }

    /* renamed from: f */
    public static final FlightSheetCommands m4542f(WireFlightSheetCommands wireFlightSheetCommands) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(wireFlightSheetCommands, "<this>");
        int idx = wireFlightSheetCommands.getIdx();
        String title = wireFlightSheetCommands.getTitle();
        List<FlightSheetCommand> commands = wireFlightSheetCommands.getCommands();
        List<WireFlightSheetIntOption> alarmDurationOptions = wireFlightSheetCommands.getAlarmDurationOptions();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(alarmDurationOptions, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireFlightSheetIntOption wireFlightSheetIntOption : alarmDurationOptions) {
            arrayList.add(m4538j(wireFlightSheetIntOption));
        }
        return new FlightSheetCommands(idx, title, commands, arrayList, wireFlightSheetCommands.isBirdLocked());
    }

    /* renamed from: g */
    public static final FlightSheetDetail m4541g(WireFlightSheetDetail wireFlightSheetDetail) {
        Intrinsics.checkNotNullParameter(wireFlightSheetDetail, "<this>");
        return new FlightSheetDetail(wireFlightSheetDetail.getLabel(), wireFlightSheetDetail.getDetail());
    }

    /* renamed from: h */
    public static final FlightSheetInfoSection m4540h(WireFlightSheetInfoSection wireFlightSheetInfoSection) {
        int collectionSizeOrDefault;
        ThemedColors themedColors;
        FlightSheetInfoSectionAction flightSheetInfoSectionAction;
        Intrinsics.checkNotNullParameter(wireFlightSheetInfoSection, "<this>");
        int idx = wireFlightSheetInfoSection.getIdx();
        String title = wireFlightSheetInfoSection.getTitle();
        String subtitle = wireFlightSheetInfoSection.getSubtitle();
        List<WireFlightSheetDetail> details = wireFlightSheetInfoSection.getDetails();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(details, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireFlightSheetDetail wireFlightSheetDetail : details) {
            arrayList.add(m4541g(wireFlightSheetDetail));
        }
        WireThemedColors backgroundColor = wireFlightSheetInfoSection.getBackgroundColor();
        if (backgroundColor != null) {
            themedColors = C47311qB0.m17961f(backgroundColor);
        } else {
            themedColors = null;
        }
        WireFlightSheetInfoSectionAction action = wireFlightSheetInfoSection.getAction();
        if (action != null) {
            flightSheetInfoSectionAction = m4539i(action);
        } else {
            flightSheetInfoSectionAction = null;
        }
        return new FlightSheetInfoSection(idx, title, subtitle, flightSheetInfoSectionAction, themedColors, arrayList);
    }

    /* renamed from: i */
    public static final FlightSheetInfoSectionAction m4539i(WireFlightSheetInfoSectionAction wireFlightSheetInfoSectionAction) {
        Intrinsics.checkNotNullParameter(wireFlightSheetInfoSectionAction, "<this>");
        if (C30334a.$EnumSwitchMapping$0[wireFlightSheetInfoSectionAction.getKind().ordinal()] == 1) {
            return FlightSheetInfoSectionAction.CannotCaptureReports.INSTANCE;
        }
        return null;
    }

    /* renamed from: j */
    public static final FlightSheetIntOption m4538j(WireFlightSheetIntOption wireFlightSheetIntOption) {
        Intrinsics.checkNotNullParameter(wireFlightSheetIntOption, "<this>");
        return new FlightSheetIntOption(wireFlightSheetIntOption.getLabel(), wireFlightSheetIntOption.getValue());
    }

    /* renamed from: k */
    public static final FlightSheetRideHistory m4537k(WireFlightSheetRideHistory wireFlightSheetRideHistory) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Intrinsics.checkNotNullParameter(wireFlightSheetRideHistory, "<this>");
        int idx = wireFlightSheetRideHistory.getIdx();
        String title = wireFlightSheetRideHistory.getTitle();
        List<WireFlightSheetDetail> details = wireFlightSheetRideHistory.getDetails();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(details, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireFlightSheetDetail wireFlightSheetDetail : details) {
            arrayList.add(m4541g(wireFlightSheetDetail));
        }
        String endPhotoUrl = wireFlightSheetRideHistory.getEndPhotoUrl();
        int rating = wireFlightSheetRideHistory.getRating();
        BirdModel model = wireFlightSheetRideHistory.getModel();
        Geolocation m17966a = C47311qB0.m17966a(wireFlightSheetRideHistory.getLocation());
        List<WireBirdLocationTrack> tracks = wireFlightSheetRideHistory.getTracks();
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(tracks, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        for (WireBirdLocationTrack wireBirdLocationTrack : tracks) {
            arrayList2.add(m4546b(wireBirdLocationTrack));
        }
        return new FlightSheetRideHistory(idx, title, arrayList, endPhotoUrl, rating, model, m17966a, arrayList2);
    }

    /* renamed from: l */
    public static final FlightSheetRideRating m4536l(WireFlightSheetRideRating wireFlightSheetRideRating) {
        Intrinsics.checkNotNullParameter(wireFlightSheetRideRating, "<this>");
        return new FlightSheetRideRating(wireFlightSheetRideRating.getLabel(), wireFlightSheetRideRating.getRating(), wireFlightSheetRideRating.getFeedback());
    }

    /* renamed from: m */
    public static final FlightSheetRideRatingTag m4535m(WireFlightSheetRatingTag wireFlightSheetRatingTag) {
        Intrinsics.checkNotNullParameter(wireFlightSheetRatingTag, "<this>");
        return new FlightSheetRideRatingTag(wireFlightSheetRatingTag.getLabel(), wireFlightSheetRatingTag.getCount());
    }

    /* renamed from: n */
    public static final FlightSheetRideRatings m4534n(WireFlightSheetRideRatings wireFlightSheetRideRatings) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Intrinsics.checkNotNullParameter(wireFlightSheetRideRatings, "<this>");
        int idx = wireFlightSheetRideRatings.getIdx();
        String title = wireFlightSheetRideRatings.getTitle();
        List<WireFlightSheetRideRating> ratings = wireFlightSheetRideRatings.getRatings();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(ratings, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireFlightSheetRideRating wireFlightSheetRideRating : ratings) {
            arrayList.add(m4536l(wireFlightSheetRideRating));
        }
        List<WireFlightSheetRatingTag> tags = wireFlightSheetRideRatings.getTags();
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(tags, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        for (WireFlightSheetRatingTag wireFlightSheetRatingTag : tags) {
            arrayList2.add(m4535m(wireFlightSheetRatingTag));
        }
        return new FlightSheetRideRatings(idx, title, arrayList, arrayList2);
    }

    /* renamed from: o */
    public static final FlightSheetVehicleSummary m4533o(WireFlightSheetVehicleSummary wireFlightSheetVehicleSummary) {
        ArrayList arrayList;
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(wireFlightSheetVehicleSummary, "<this>");
        int idx = wireFlightSheetVehicleSummary.getIdx();
        String title = wireFlightSheetVehicleSummary.getTitle();
        String birdCode = wireFlightSheetVehicleSummary.getBirdCode();
        BirdModel model = wireFlightSheetVehicleSummary.getModel();
        int battery = wireFlightSheetVehicleSummary.getBattery();
        DateTime lastLocatedAt = wireFlightSheetVehicleSummary.getLastLocatedAt();
        BirdLocationSource lastLocatedSource = wireFlightSheetVehicleSummary.getLastLocatedSource();
        ClientIcon statusIcon = wireFlightSheetVehicleSummary.getStatusIcon();
        ThemedColors m17961f = C47311qB0.m17961f(wireFlightSheetVehicleSummary.getStatusIconColor());
        ThemedColors m17961f2 = C47311qB0.m17961f(wireFlightSheetVehicleSummary.getStatusIconBackgroundColor());
        String statusTitle = wireFlightSheetVehicleSummary.getStatusTitle();
        String statusDescription = wireFlightSheetVehicleSummary.getStatusDescription();
        Double ratingAverage = wireFlightSheetVehicleSummary.getRatingAverage();
        List<WireFlightSheetCampaign> campaigns = wireFlightSheetVehicleSummary.getCampaigns();
        if (campaigns != null) {
            List<WireFlightSheetCampaign> list = campaigns;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            for (WireFlightSheetCampaign wireFlightSheetCampaign : list) {
                arrayList2.add(m4543e(wireFlightSheetCampaign));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new FlightSheetVehicleSummary(idx, title, birdCode, model, battery, lastLocatedAt, lastLocatedSource, statusIcon, m17961f, m17961f2, statusTitle, statusDescription, ratingAverage, arrayList, wireFlightSheetVehicleSummary.getActions(), wireFlightSheetVehicleSummary.getMarkerLabel(), wireFlightSheetVehicleSummary.getBadges());
    }

    /* renamed from: p */
    public static final TaskOrderInfo m4532p(WireTaskOrderInfo wireTaskOrderInfo) {
        Intrinsics.checkNotNullParameter(wireTaskOrderInfo, "<this>");
        return new TaskOrderInfo(wireTaskOrderInfo.getCanOperate());
    }
}
