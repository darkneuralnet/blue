package p000;

import android.content.Context;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.AlarmCommand;
import co.bird.android.model.AlarmOption;
import co.bird.android.model.AllReviewsButton;
import co.bird.android.model.BatterySwapButton;
import co.bird.android.model.CampaignButton;
import co.bird.android.model.CannotAccessButton;
import co.bird.android.model.CannotCaptureReports;
import co.bird.android.model.CommandMethod;
import co.bird.android.model.DiagnosticsButton;
import co.bird.android.model.FlightSheetButton;
import co.bird.android.model.InspectionButton;
import co.bird.android.model.LastRideInfoButton;
import co.bird.android.model.LightsCommand;
import co.bird.android.model.LockCommand;
import co.bird.android.model.MarkDamaged;
import co.bird.android.model.MarkForInspectionButton;
import co.bird.android.model.MarkMissingButton;
import co.bird.android.model.OperatorBottomSheetButton;
import co.bird.android.model.OtherPossibleLocationsButton;
import co.bird.android.model.PastRepairsButton;
import co.bird.android.model.PrivatePropertyButton;
import co.bird.android.model.QuickCaptureButton;
import co.bird.android.model.RideHistoryButton;
import co.bird.android.model.SearchNearbyButton;
import co.bird.android.model.SoftResetCommand;
import co.bird.android.model.UnlockBatteryCommand;
import co.bird.android.model.UnlockCableCommand;
import co.bird.android.model.UnlockCommand;
import co.bird.android.model.UnlockHelmetCommand;
import co.bird.android.model.UnmarkDamaged;
import co.bird.android.model.VehicleCommand;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.constant.FlightSheetAction;
import co.bird.android.model.constant.FlightSheetCommand;
import co.bird.android.model.constant.FlightSheetSummaryAction;
import co.bird.android.model.constant.QuickCaptureState;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.FlightSheetDetails;
import co.bird.android.model.persistence.nestedstructures.BirdLocationTrack;
import co.bird.android.model.persistence.nestedstructures.FlightSheetActions;
import co.bird.android.model.persistence.nestedstructures.FlightSheetBackground;
import co.bird.android.model.persistence.nestedstructures.FlightSheetBanner;
import co.bird.android.model.persistence.nestedstructures.FlightSheetCampaign;
import co.bird.android.model.persistence.nestedstructures.FlightSheetCommands;
import co.bird.android.model.persistence.nestedstructures.FlightSheetDetail;
import co.bird.android.model.persistence.nestedstructures.FlightSheetInfoSection;
import co.bird.android.model.persistence.nestedstructures.FlightSheetInfoSectionAction;
import co.bird.android.model.persistence.nestedstructures.FlightSheetIntOption;
import co.bird.android.model.persistence.nestedstructures.FlightSheetRideHistory;
import co.bird.android.model.persistence.nestedstructures.FlightSheetRideRating;
import co.bird.android.model.persistence.nestedstructures.FlightSheetRideRatings;
import co.bird.android.model.persistence.nestedstructures.FlightSheetSection;
import co.bird.android.model.persistence.nestedstructures.FlightSheetVehicleSummary;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.jvm.internal.StringCompanionObject;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J,\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J(\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0018\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0018\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u0018\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\u0018\u0010!\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0002J\u001a\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0002J\u0010\u0010(\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0002J\u0016\u0010*\u001a\u0004\u0018\u00010)*\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006/"}, m28432d2 = {"Lht1;", "LtA;", "Lco/bird/android/model/persistence/Bird;", "bird", "Lco/bird/android/model/persistence/FlightSheetDetails;", "details", "Lco/bird/android/model/constant/QuickCaptureState;", TransferTable.COLUMN_STATE, "Lorg/joda/time/DateTime;", "quickCaptureTimeout", "", "LH6;", "r", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;", "banner", "u", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetVehicleSummary;", "vehicleSummary", "B", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetCommands;", "commands", "v", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetActions;", "actions", "t", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;", "infoSection", "y", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatings;", "rideRatings", "A", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideHistory;", "rideHistory", "z", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetSection;", "section", "LG6;", "x", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetDetail;", "detail", "w", "Lco/bird/android/model/FlightSheetButton;", "s", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFlightSheetV2Converter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetV2Converter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Converter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,489:1\n1#2:490\n1#2:506\n1#2:525\n1#2:544\n1#2:561\n37#3,2:491\n37#3,2:493\n37#3,2:509\n37#3,2:528\n1045#4:495\n1603#4,9:496\n1855#4:505\n1856#4:507\n1612#4:508\n1549#4:511\n1620#4,3:512\n1603#4,9:515\n1855#4:524\n1856#4:526\n1612#4:527\n1603#4,9:530\n1855#4:539\n1549#4:540\n1620#4,3:541\n1856#4:545\n1612#4:546\n1549#4:547\n1620#4,3:548\n1603#4,9:551\n1855#4:560\n1856#4:562\n1612#4:563\n1549#4:564\n1620#4,3:565\n1549#4:568\n1620#4,3:569\n1549#4:572\n1620#4,3:573\n1549#4:576\n1620#4,3:577\n1549#4:580\n1620#4,3:581\n*S KotlinDebug\n*F\n+ 1 FlightSheetV2Converter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Converter\n*L\n89#1:506\n141#1:525\n178#1:544\n334#1:561\n83#1:491,2\n84#1:493,2\n100#1:509,2\n173#1:528,2\n88#1:495\n89#1:496,9\n89#1:505\n89#1:507\n89#1:508\n131#1:511\n131#1:512,3\n141#1:515,9\n141#1:524\n141#1:526\n141#1:527\n178#1:530,9\n178#1:539\n300#1:540\n300#1:541,3\n178#1:545\n178#1:546\n328#1:547\n328#1:548,3\n334#1:551,9\n334#1:560\n334#1:562\n334#1:563\n391#1:564\n391#1:565,3\n397#1:568\n397#1:569,3\n403#1:572\n403#1:573,3\n413#1:576\n413#1:577,3\n430#1:580\n430#1:581,3\n*E\n"})
/* renamed from: ht1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42390ht1 extends AbstractC28540tA {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ht1$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C22783a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[QuickCaptureState.values().length];
            try {
                iArr[QuickCaptureState.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QuickCaptureState.INITIATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FlightSheetSummaryAction.values().length];
            try {
                iArr2[FlightSheetSummaryAction.QUICK_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[FlightSheetCommand.values().length];
            try {
                iArr3[FlightSheetCommand.LOCK_BT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr3[FlightSheetCommand.LOCK_CELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[FlightSheetCommand.BATTERY_LOCK_BT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[FlightSheetCommand.BATTERY_LOCK_CELL.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[FlightSheetCommand.CABLE_LOCK_BT.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[FlightSheetCommand.CABLE_LOCK_CELL.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[FlightSheetCommand.HELMET_UNLOCK_CELL.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[FlightSheetCommand.HELMET_UNLOCK_BT.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[FlightSheetCommand.ALARM_BT.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[FlightSheetCommand.ALARM_CELL.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[FlightSheetCommand.FLASH_LIGHTS_BT.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[FlightSheetCommand.SOFT_RESET_BT.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[FlightSheetAction.values().length];
            try {
                iArr4[FlightSheetAction.BATTERY_SWAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[FlightSheetAction.OTHER_POSSIBLE_LOCATIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[FlightSheetAction.SEARCH_NEARBY.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[FlightSheetAction.CANNOT_ACCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[FlightSheetAction.PRIVATE_PROPERTY.ordinal()] = 5;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[FlightSheetAction.MARK_MISSING.ordinal()] = 6;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr4[FlightSheetAction.MARK_DAMAGED.ordinal()] = 7;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr4[FlightSheetAction.UNMARK_DAMAGED.ordinal()] = 8;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr4[FlightSheetAction.PAST_REPAIRS.ordinal()] = 9;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr4[FlightSheetAction.DIAGNOSTICS.ordinal()] = 10;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr4[FlightSheetAction.INSPECTION.ordinal()] = 11;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr4[FlightSheetAction.LAST_RIDE.ordinal()] = 12;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr4[FlightSheetAction.MARK_FOR_INSPECTION.ordinal()] = 13;
            } catch (NoSuchFieldError unused28) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 FlightSheetV2Converter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Converter\n*L\n1#1,328:1\n88#2:329\n*E\n"})
    /* renamed from: ht1$b */
    /* loaded from: classes3.dex */
    public static final class C22784b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((FlightSheetSection) t).getIdx()), Integer.valueOf(((FlightSheetSection) t2).getIdx()));
            return compareValues;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42390ht1(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: A */
    public final C3023H6 m35670A(Bird bird, FlightSheetRideRatings flightSheetRideRatings) {
        int collectionSizeOrDefault;
        List mutableList;
        List<FlightSheetRideRating> ratings = flightSheetRideRatings.getRatings();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(ratings, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (FlightSheetRideRating flightSheetRideRating : ratings) {
            arrayList.add(new C2637G6(flightSheetRideRating, C45268mk4.view_labeled_ride_rating_with_review, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        mutableList.add(new C2637G6(flightSheetRideRatings.getTags(), C45268mk4.item_labeled_tags, false, 4, null));
        String string = m12962m().getString(C45871nl4.all_reviews_uppercased);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.string.all_reviews_uppercased)");
        mutableList.add(new C2637G6(new AllReviewsButton(string, bird.getId()), C45268mk4.item_button_secondary, false, 4, null));
        return new C3023H6(mutableList, m35662x(bird, flightSheetRideRatings), null, 4, null);
    }

    /* renamed from: B */
    public final C3023H6 m35669B(Bird bird, FlightSheetVehicleSummary flightSheetVehicleSummary, QuickCaptureState quickCaptureState, DateTime dateTime) {
        String str;
        Collection emptyList;
        List mutableListOf;
        C2637G6 c2637g6;
        String string;
        int collectionSizeOrDefault;
        String str2 = "# " + flightSheetVehicleSummary.getBirdCode();
        BirdModel model = flightSheetVehicleSummary.getModel();
        String string2 = m12962m().getString(C45871nl4.battery_percent, Integer.valueOf(flightSheetVehicleSummary.getBattery()));
        int battery = flightSheetVehicleSummary.getBattery();
        Double ratingAverage = flightSheetVehicleSummary.getRatingAverage();
        if (ratingAverage != null) {
            double doubleValue = ratingAverage.doubleValue();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%s %s", Arrays.copyOf(new Object[]{Double.valueOf(doubleValue), m12962m().getString(C45871nl4.average_abbreviated)}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            str = format;
        } else {
            str = null;
        }
        DateTime lastLocatedAt = flightSheetVehicleSummary.getLastLocatedAt();
        TU5 tu5 = new TU5(model, str2, battery, string2, str, lastLocatedAt != null ? C46880pT0.getElapsedTime$default(lastLocatedAt, m12962m(), false, 2, null) : null, flightSheetVehicleSummary.getLastLocatedSource(), flightSheetVehicleSummary.getMarkerLabel(), flightSheetVehicleSummary.getBadges());
        List<FlightSheetCampaign> campaigns = flightSheetVehicleSummary.getCampaigns();
        if (campaigns != null) {
            List<FlightSheetCampaign> list = campaigns;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            emptyList = new ArrayList(collectionSizeOrDefault);
            for (FlightSheetCampaign flightSheetCampaign : list) {
                emptyList.add(new C2637G6(new CampaignButton(null, flightSheetCampaign.getCampaignName(), flightSheetCampaign.getMessage(), flightSheetCampaign.getDescription(), bird, 1, null), C37548Zj4.item_flight_sheet_campaign, false, 4, null));
            }
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (FlightSheetSummaryAction flightSheetSummaryAction : flightSheetVehicleSummary.getActions()) {
            if (C22783a.$EnumSwitchMapping$1[flightSheetSummaryAction.ordinal()] == 1) {
                int i = C22783a.$EnumSwitchMapping$0[quickCaptureState.ordinal()];
                if (i != 1) {
                    string = i != 2 ? "" : m12962m().getString(C45871nl4.cancel_photo);
                } else {
                    string = m12962m().getString(C45871nl4.quickstart_unselected_bird_cta);
                }
                Intrinsics.checkNotNullExpressionValue(string, "when (state) {\n         …   else -> \"\"\n          }");
                c2637g6 = new C2637G6(new QuickCaptureButton(string, bird, quickCaptureState, dateTime), C37548Zj4.item_flight_sheet_summary_quick_capture, false, 4, null);
            } else {
                c2637g6 = null;
            }
            if (c2637g6 != null) {
                arrayList.add(c2637g6);
            }
        }
        String id = bird.getId();
        String statusTitle = flightSheetVehicleSummary.getStatusTitle();
        String statusDescription = flightSheetVehicleSummary.getStatusDescription();
        ClientIcon statusIcon = flightSheetVehicleSummary.getStatusIcon();
        if (!(statusIcon != ClientIcon.UNKNOWN)) {
            statusIcon = null;
        }
        GQ5 gq5 = new GQ5(id, statusTitle, statusDescription, statusIcon != null ? C33341Hk0.m103484a(statusIcon, m12962m()) : null, Integer.valueOf(NA0.m94301c(m12962m(), C32364Df4.birdWhite)), Integer.valueOf(flightSheetVehicleSummary.getStatusIconBackgroundColor().getLightMode()));
        C2637G6 c2637g62 = new C2637G6(tu5, C37548Zj4.item_flight_sheet_summary, false, 4, null);
        C2637G6 c2637g63 = new C2637G6(gq5, C37548Zj4.item_flight_sheet_status, false, 4, null);
        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
        spreadBuilder.add(c2637g62);
        spreadBuilder.addSpread(emptyList.toArray(new C2637G6[0]));
        spreadBuilder.addSpread(arrayList.toArray(new C2637G6[0]));
        spreadBuilder.add(c2637g63);
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(spreadBuilder.toArray(new C2637G6[spreadBuilder.size()]));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: r */
    public final List<C3023H6> m35668r(Bird bird, FlightSheetDetails details, QuickCaptureState state, DateTime quickCaptureTimeout) {
        C3023H6 c3023h6;
        List listOfNotNull;
        List<FlightSheetSection> sortedWith;
        List<C3023H6> listOfNotNull2;
        C3023H6 c3023h62;
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(quickCaptureTimeout, "quickCaptureTimeout");
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        FlightSheetBanner banner = details.getBanner();
        if (banner != null) {
            c3023h6 = m35665u(banner);
        } else {
            c3023h6 = null;
        }
        spreadBuilder.add(c3023h6);
        SpreadBuilder spreadBuilder2 = new SpreadBuilder(6);
        spreadBuilder2.add(details.getVehicleSummary());
        spreadBuilder2.add(details.getCommands());
        spreadBuilder2.addSpread(details.getActionSections().toArray(new FlightSheetActions[0]));
        spreadBuilder2.addSpread(details.getInfoSections().toArray(new FlightSheetInfoSection[0]));
        spreadBuilder2.add(details.getRideRatings());
        spreadBuilder2.add(details.getRideHistory());
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(spreadBuilder2.toArray(new FlightSheetSection[spreadBuilder2.size()]));
        sortedWith = CollectionsKt___CollectionsKt.sortedWith(listOfNotNull, new C22784b());
        ArrayList arrayList = new ArrayList();
        for (FlightSheetSection flightSheetSection : sortedWith) {
            if (flightSheetSection instanceof FlightSheetVehicleSummary) {
                c3023h62 = m35669B(bird, (FlightSheetVehicleSummary) flightSheetSection, state, quickCaptureTimeout);
            } else if (flightSheetSection instanceof FlightSheetCommands) {
                c3023h62 = m35664v(bird, (FlightSheetCommands) flightSheetSection);
            } else if (flightSheetSection instanceof FlightSheetActions) {
                c3023h62 = m35666t(bird, (FlightSheetActions) flightSheetSection);
            } else if (flightSheetSection instanceof FlightSheetInfoSection) {
                c3023h62 = m35661y(bird, (FlightSheetInfoSection) flightSheetSection);
            } else if (flightSheetSection instanceof FlightSheetRideRatings) {
                c3023h62 = m35670A(bird, (FlightSheetRideRatings) flightSheetSection);
            } else if (flightSheetSection instanceof FlightSheetRideHistory) {
                c3023h62 = m35660z(bird, (FlightSheetRideHistory) flightSheetSection);
            } else {
                c3023h62 = null;
            }
            if (c3023h62 != null) {
                arrayList.add(c3023h62);
            }
        }
        spreadBuilder.addSpread(arrayList.toArray(new C3023H6[0]));
        listOfNotNull2 = CollectionsKt__CollectionsKt.listOfNotNull(spreadBuilder.toArray(new C3023H6[spreadBuilder.size()]));
        return listOfNotNull2;
    }

    /* renamed from: s */
    public final FlightSheetButton m35667s(FlightSheetInfoSection flightSheetInfoSection, Bird bird) {
        if (Intrinsics.areEqual(flightSheetInfoSection.getAction(), FlightSheetInfoSectionAction.CannotCaptureReports.INSTANCE)) {
            return new CannotCaptureReports(bird);
        }
        return null;
    }

    /* renamed from: t */
    public final C3023H6 m35666t(Bird bird, FlightSheetActions flightSheetActions) {
        int collectionSizeOrDefault;
        List mutableList;
        OperatorBottomSheetButton batterySwapButton;
        ArrayList<Object> arrayList = new ArrayList();
        for (FlightSheetAction flightSheetAction : flightSheetActions.getActions()) {
            switch (C22783a.$EnumSwitchMapping$3[flightSheetAction.ordinal()]) {
                case 1:
                    String string = m12962m().getString(C45871nl4.swap_battery);
                    Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.string.swap_battery)");
                    batterySwapButton = new BatterySwapButton(flightSheetAction, string, bird);
                    break;
                case 2:
                    String string2 = m12962m().getString(C45871nl4.flight_sheet_action_other_possible_locations);
                    Intrinsics.checkNotNullExpressionValue(string2, "context.getString(L.stri…other_possible_locations)");
                    batterySwapButton = new OtherPossibleLocationsButton(flightSheetAction, string2, bird);
                    break;
                case 3:
                    String string3 = m12962m().getString(C45871nl4.flight_sheet_action_search_nearby);
                    Intrinsics.checkNotNullExpressionValue(string3, "context.getString(L.stri…eet_action_search_nearby)");
                    batterySwapButton = new SearchNearbyButton(flightSheetAction, string3, bird);
                    break;
                case 4:
                    String string4 = m12962m().getString(C45871nl4.flight_sheet_action_cannot_capture);
                    Intrinsics.checkNotNullExpressionValue(string4, "context.getString(L.stri…et_action_cannot_capture)");
                    batterySwapButton = new CannotAccessButton(flightSheetAction, string4, bird);
                    break;
                case 5:
                    String string5 = m12962m().getString(C45871nl4.flight_sheet_action_property_report);
                    Intrinsics.checkNotNullExpressionValue(string5, "context.getString(L.stri…t_action_property_report)");
                    batterySwapButton = new PrivatePropertyButton(flightSheetAction, string5, bird);
                    break;
                case 6:
                    String string6 = m12962m().getString(C45871nl4.flight_sheet_action_mark_missing);
                    Intrinsics.checkNotNullExpressionValue(string6, "context.getString(L.stri…heet_action_mark_missing)");
                    batterySwapButton = new MarkMissingButton(flightSheetAction, string6, bird);
                    break;
                case 7:
                    String string7 = m12962m().getString(C45871nl4.flight_sheet_action_mark_damaged);
                    Intrinsics.checkNotNullExpressionValue(string7, "context.getString(L.stri…heet_action_mark_damaged)");
                    batterySwapButton = new MarkDamaged(flightSheetAction, string7, bird);
                    break;
                case 8:
                    String string8 = m12962m().getString(C45871nl4.flight_sheet_action_unmark_damaged);
                    Intrinsics.checkNotNullExpressionValue(string8, "context.getString(L.stri…et_action_unmark_damaged)");
                    batterySwapButton = new UnmarkDamaged(flightSheetAction, string8, bird);
                    break;
                case 9:
                    String string9 = m12962m().getString(C45871nl4.flight_sheet_action_past_repairs);
                    Intrinsics.checkNotNullExpressionValue(string9, "context.getString(L.stri…heet_action_past_repairs)");
                    batterySwapButton = new PastRepairsButton(flightSheetAction, string9, bird);
                    break;
                case 10:
                    String string10 = m12962m().getString(C45871nl4.flight_sheet_action_diagnostics);
                    Intrinsics.checkNotNullExpressionValue(string10, "context.getString(L.stri…sheet_action_diagnostics)");
                    batterySwapButton = new DiagnosticsButton(flightSheetAction, string10, bird);
                    break;
                case 11:
                    String string11 = m12962m().getString(C45871nl4.flight_sheet_inspect_vehicle_title);
                    Intrinsics.checkNotNullExpressionValue(string11, "context.getString(L.stri…et_inspect_vehicle_title)");
                    batterySwapButton = new InspectionButton(flightSheetAction, string11, bird);
                    break;
                case 12:
                    String string12 = m12962m().getString(C45871nl4.flight_sheet_action_last_ride_info);
                    Intrinsics.checkNotNullExpressionValue(string12, "context.getString(L.stri…et_action_last_ride_info)");
                    batterySwapButton = new LastRideInfoButton(flightSheetAction, string12, bird);
                    break;
                case 13:
                    String string13 = m12962m().getString(C45871nl4.flight_sheet_action_mark_for_inspection);
                    Intrinsics.checkNotNullExpressionValue(string13, "context.getString(L.stri…tion_mark_for_inspection)");
                    batterySwapButton = new MarkForInspectionButton(flightSheetAction, string13, bird);
                    break;
                default:
                    batterySwapButton = null;
                    break;
            }
            if (batterySwapButton != null) {
                arrayList.add(batterySwapButton);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (Object obj : arrayList) {
            arrayList2.add(new C2637G6(obj, C45268mk4.item_button_secondary, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
        return new C3023H6(mutableList, m35662x(bird, flightSheetActions), null, 4, null);
    }

    /* renamed from: u */
    public final C3023H6 m35665u(FlightSheetBanner flightSheetBanner) {
        List mutableListOf;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(flightSheetBanner, C37548Zj4.item_flight_sheet_banner, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: v */
    public final C3023H6 m35664v(Bird bird, FlightSheetCommands flightSheetCommands) {
        int collectionSizeOrDefault;
        List mutableList;
        Parcelable lockCommand;
        int collectionSizeOrDefault2;
        BirdModel fromString = BirdModel.Companion.fromString(bird.getModel());
        if (fromString == null) {
            fromString = BirdModel.UNKNOWN;
        }
        ArrayList<VehicleCommand> arrayList = new ArrayList();
        for (FlightSheetCommand flightSheetCommand : flightSheetCommands.getCommands()) {
            switch (C22783a.$EnumSwitchMapping$2[flightSheetCommand.ordinal()]) {
                case 1:
                    if (bird.getLocked()) {
                        int i = C48193rg4.ic_unlock;
                        String string = m12962m().getString(C45871nl4.flight_sheet_command_bluetooth_unlock);
                        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…command_bluetooth_unlock)");
                        lockCommand = new UnlockCommand(flightSheetCommand, fromString, "", i, string, CommandMethod.BLUETOOTH);
                        break;
                    } else {
                        int i2 = C48193rg4.ic_lock;
                        String string2 = m12962m().getString(C45871nl4.flight_sheet_command_bluetooth_lock);
                        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(L.stri…t_command_bluetooth_lock)");
                        lockCommand = new LockCommand(flightSheetCommand, fromString, "", i2, string2, CommandMethod.BLUETOOTH);
                        break;
                    }
                case 2:
                    if (bird.getLocked()) {
                        int i3 = C48193rg4.ic_unlock;
                        String string3 = m12962m().getString(C45871nl4.flight_sheet_command_cellular_unlock);
                        Intrinsics.checkNotNullExpressionValue(string3, "context.getString(L.stri…_command_cellular_unlock)");
                        lockCommand = new UnlockCommand(flightSheetCommand, fromString, "", i3, string3, CommandMethod.CELLULAR);
                        break;
                    } else {
                        int i4 = C48193rg4.ic_lock;
                        String string4 = m12962m().getString(C45871nl4.flight_sheet_command_cellular_lock);
                        Intrinsics.checkNotNullExpressionValue(string4, "context.getString(L.stri…et_command_cellular_lock)");
                        lockCommand = new LockCommand(flightSheetCommand, fromString, "", i4, string4, CommandMethod.CELLULAR);
                        break;
                    }
                case 3:
                    int i5 = C48193rg4.ic_unlock;
                    String string5 = m12962m().getString(C45871nl4.android_unlock_battery_bluetooth);
                    Intrinsics.checkNotNullExpressionValue(string5, "context.getString(L.stri…unlock_battery_bluetooth)");
                    lockCommand = new UnlockBatteryCommand(flightSheetCommand, fromString, "", i5, string5, CommandMethod.BLUETOOTH);
                    break;
                case 4:
                    int i6 = C48193rg4.ic_unlock;
                    String string6 = m12962m().getString(C45871nl4.android_unlock_battery_cellular);
                    Intrinsics.checkNotNullExpressionValue(string6, "context.getString(L.stri…_unlock_battery_cellular)");
                    lockCommand = new UnlockBatteryCommand(flightSheetCommand, fromString, "", i6, string6, CommandMethod.CELLULAR);
                    break;
                case 5:
                    int i7 = C48193rg4.ic_unlock;
                    String string7 = m12962m().getString(C45871nl4.android_unlock_cable_bluetooth);
                    Intrinsics.checkNotNullExpressionValue(string7, "context.getString(L.stri…d_unlock_cable_bluetooth)");
                    lockCommand = new UnlockCableCommand(flightSheetCommand, fromString, "", i7, string7, CommandMethod.BLUETOOTH);
                    break;
                case 6:
                    int i8 = C48193rg4.ic_unlock;
                    String string8 = m12962m().getString(C45871nl4.android_unlock_cable_cellular);
                    Intrinsics.checkNotNullExpressionValue(string8, "context.getString(L.stri…id_unlock_cable_cellular)");
                    lockCommand = new UnlockCableCommand(flightSheetCommand, fromString, "", i8, string8, CommandMethod.CELLULAR);
                    break;
                case 7:
                    int i9 = C48193rg4.ic_helmet;
                    String string9 = m12962m().getString(C45871nl4.unlock_helmet_cellular);
                    Intrinsics.checkNotNullExpressionValue(string9, "context.getString(L.string.unlock_helmet_cellular)");
                    lockCommand = new UnlockHelmetCommand(flightSheetCommand, fromString, "", i9, string9, CommandMethod.CELLULAR);
                    break;
                case 8:
                    int i10 = C48193rg4.ic_helmet;
                    String string10 = m12962m().getString(C45871nl4.unlock_helmet);
                    Intrinsics.checkNotNullExpressionValue(string10, "context.getString(L.string.unlock_helmet)");
                    lockCommand = new UnlockHelmetCommand(flightSheetCommand, fromString, "", i10, string10, CommandMethod.BLUETOOTH);
                    break;
                case 9:
                    int i11 = C48193rg4.ic_sound;
                    String string11 = m12962m().getString(C45871nl4.flight_sheet_command_bluetooth_alarm);
                    Intrinsics.checkNotNullExpressionValue(string11, "context.getString(L.stri…_command_bluetooth_alarm)");
                    lockCommand = new AlarmCommand(flightSheetCommand, fromString, "", i11, string11, CommandMethod.BLUETOOTH, null, 64, null);
                    break;
                case 10:
                    int i12 = C48193rg4.ic_sound;
                    String string12 = m12962m().getString(C45871nl4.flight_sheet_command_cellular_alarm);
                    Intrinsics.checkNotNullExpressionValue(string12, "context.getString(L.stri…t_command_cellular_alarm)");
                    CommandMethod commandMethod = CommandMethod.CELLULAR;
                    List<FlightSheetIntOption> alarmDurationOptions = flightSheetCommands.getAlarmDurationOptions();
                    collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(alarmDurationOptions, 10);
                    ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
                    for (FlightSheetIntOption flightSheetIntOption : alarmDurationOptions) {
                        arrayList2.add(new AlarmOption(flightSheetIntOption.getValue(), flightSheetIntOption.getLabel()));
                    }
                    lockCommand = new AlarmCommand(flightSheetCommand, fromString, "", i12, string12, commandMethod, arrayList2);
                    break;
                case 11:
                    int i13 = C48193rg4.ic_light;
                    String string13 = m12962m().getString(C45871nl4.flight_sheet_command_bluetooth_lights);
                    Intrinsics.checkNotNullExpressionValue(string13, "context.getString(L.stri…command_bluetooth_lights)");
                    lockCommand = new LightsCommand(flightSheetCommand, fromString, "", i13, string13, CommandMethod.BLUETOOTH);
                    break;
                case 12:
                    int i14 = C48193rg4.ic_power;
                    String string14 = m12962m().getString(C45871nl4.flight_sheet_command_bluetooth_soft_reset);
                    Intrinsics.checkNotNullExpressionValue(string14, "context.getString(L.stri…and_bluetooth_soft_reset)");
                    lockCommand = new SoftResetCommand(flightSheetCommand, fromString, "", i14, string14, CommandMethod.BLUETOOTH);
                    break;
                default:
                    lockCommand = null;
                    break;
            }
            if (lockCommand != null) {
                arrayList.add(lockCommand);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
        for (VehicleCommand vehicleCommand : arrayList) {
            arrayList3.add(new C2637G6(vehicleCommand, C37548Zj4.item_flight_sheet_command, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList3);
        return new C3023H6(mutableList, m35662x(bird, flightSheetCommands), null, 4, null);
    }

    /* renamed from: w */
    public final C2637G6 m35663w(FlightSheetDetail flightSheetDetail) {
        return new C2637G6(flightSheetDetail, C37548Zj4.item_labeled_detail, false, 4, null);
    }

    /* renamed from: x */
    public final C2637G6 m35662x(Bird bird, FlightSheetSection flightSheetSection) {
        FlightSheetBackground flightSheetBackground;
        if (flightSheetSection instanceof FlightSheetInfoSection) {
            String title = flightSheetSection.getTitle();
            FlightSheetInfoSection flightSheetInfoSection = (FlightSheetInfoSection) flightSheetSection;
            return new C2637G6(new U12(flightSheetInfoSection.getBackgroundColor(), title, flightSheetInfoSection.getSubtitle(), m35667s(flightSheetInfoSection, bird)), C37548Zj4.item_flight_sheet_action_header, false, 4, null);
        }
        String title2 = flightSheetSection.getTitle();
        ThemedColors themedColors = null;
        if (title2 == null) {
            return null;
        }
        if (flightSheetSection instanceof FlightSheetBackground) {
            flightSheetBackground = (FlightSheetBackground) flightSheetSection;
        } else {
            flightSheetBackground = null;
        }
        if (flightSheetBackground != null) {
            themedColors = flightSheetBackground.getBackgroundColor();
        }
        return new C2637G6(new C36626Vl0(title2, true, false, themedColors, 4, null), C37548Zj4.item_collapsable_header, false, 4, null);
    }

    /* renamed from: y */
    public final C3023H6 m35661y(Bird bird, FlightSheetInfoSection flightSheetInfoSection) {
        int collectionSizeOrDefault;
        List mutableList;
        List<FlightSheetDetail> details = flightSheetInfoSection.getDetails();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(details, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (FlightSheetDetail flightSheetDetail : details) {
            arrayList.add(m35663w(flightSheetDetail));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return new C3023H6(mutableList, m35662x(bird, flightSheetInfoSection), null, 4, null);
    }

    /* renamed from: z */
    public final C3023H6 m35660z(Bird bird, FlightSheetRideHistory flightSheetRideHistory) {
        int collectionSizeOrDefault;
        List mutableList;
        int collectionSizeOrDefault2;
        List<FlightSheetDetail> details = flightSheetRideHistory.getDetails();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(details, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (FlightSheetDetail flightSheetDetail : details) {
            arrayList.add(m35663w(flightSheetDetail));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        String string = m12962m().getString(C45871nl4.flight_sheet_last_ride_rating);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…t_sheet_last_ride_rating)");
        mutableList.add(new C2637G6(new C46484on4(string, flightSheetRideHistory.getRating()), C37548Zj4.item_labeled_rating, false, 4, null));
        BirdModel model = flightSheetRideHistory.getModel();
        Geolocation location = flightSheetRideHistory.getLocation();
        List<BirdLocationTrack> tracks = flightSheetRideHistory.getTracks();
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(tracks, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        for (BirdLocationTrack birdLocationTrack : tracks) {
            arrayList2.add(birdLocationTrack.getLocation());
        }
        mutableList.add(new C2637G6(new XL2(model, location, arrayList2), C37548Zj4.item_last_ride_map, false, 4, null));
        String endPhotoUrl = flightSheetRideHistory.getEndPhotoUrl();
        if (endPhotoUrl != null) {
            mutableList.add(new C2637G6(endPhotoUrl, C37548Zj4.item_last_ride_photo, false, 4, null));
        }
        String string2 = m12962m().getString(C45871nl4.flight_sheet_last_ride_ride_history);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(L.stri…t_last_ride_ride_history)");
        mutableList.add(new C2637G6(new RideHistoryButton(string2, NA0.m94299e(m12962m(), C48193rg4.ic_history), null, null, null, bird, 28, null), C45268mk4.item_white_button_with_end_chevron, false, 4, null));
        return new C3023H6(mutableList, m35662x(bird, flightSheetRideHistory), null, 4, null);
    }
}
