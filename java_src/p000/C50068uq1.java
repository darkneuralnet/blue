package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.ChartFillStrategy;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.constant.ComplicationKind;
import co.bird.android.model.constant.FleetStatusActionKind;
import co.bird.android.model.persistence.FleetList;
import co.bird.android.model.persistence.FleetListSection;
import co.bird.android.model.persistence.FleetListVehicle;
import co.bird.android.model.persistence.FleetStatus;
import co.bird.android.model.persistence.FleetStatusSummary;
import co.bird.android.model.persistence.common.ConstantsKt;
import co.bird.android.model.persistence.nestedstructures.Facet;
import co.bird.android.model.persistence.nestedstructures.FleetListAction;
import co.bird.android.model.persistence.nestedstructures.FleetListComplication;
import co.bird.android.model.persistence.nestedstructures.FleetListMessage;
import co.bird.android.model.persistence.nestedstructures.FleetRating;
import co.bird.android.model.persistence.nestedstructures.FleetRatingGroup;
import co.bird.android.model.persistence.nestedstructures.FleetState;
import co.bird.android.model.persistence.nestedstructures.FleetStatusAction;
import co.bird.android.model.persistence.nestedstructures.FleetStatusChart;
import co.bird.android.model.persistence.nestedstructures.FleetStatusChartSection;
import co.bird.android.model.persistence.nestedstructures.FleetStatusContent;
import co.bird.android.model.persistence.nestedstructures.FleetStatusListAction;
import co.bird.android.model.persistence.nestedstructures.FleetStatusMapAction;
import co.bird.android.model.persistence.nestedstructures.FleetSubstate;
import co.bird.android.model.persistence.nestedstructures.MultiSelectFilterOption;
import co.bird.android.model.persistence.nestedstructures.OperatorMapFilterBundle;
import co.bird.android.model.persistence.nestedstructures.OperatorMapMultiSelectFilter;
import co.bird.android.model.persistence.nestedstructures.OperatorMapRangeSelectFilter;
import co.bird.android.model.persistence.nestedstructures.RangeSelectFilterOption;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import co.bird.android.model.wire.WireBatteryComplication;
import co.bird.android.model.wire.WireFacet;
import co.bird.android.model.wire.WireFleetList;
import co.bird.android.model.wire.WireFleetListAction;
import co.bird.android.model.wire.WireFleetListComplication;
import co.bird.android.model.wire.WireFleetListMessage;
import co.bird.android.model.wire.WireFleetListSection;
import co.bird.android.model.wire.WireFleetListVehicle;
import co.bird.android.model.wire.WireFleetRating;
import co.bird.android.model.wire.WireFleetRatingGroup;
import co.bird.android.model.wire.WireFleetState;
import co.bird.android.model.wire.WireFleetStatus;
import co.bird.android.model.wire.WireFleetStatusAction;
import co.bird.android.model.wire.WireFleetStatusChart;
import co.bird.android.model.wire.WireFleetStatusChartSection;
import co.bird.android.model.wire.WireFleetStatusContent;
import co.bird.android.model.wire.WireFleetStatusListAction;
import co.bird.android.model.wire.WireFleetStatusMapAction;
import co.bird.android.model.wire.WireFleetStatusSummary;
import co.bird.android.model.wire.WireFleetSubstate;
import co.bird.android.model.wire.WireIconComplication;
import co.bird.android.model.wire.WireMultiSelectFilterOption;
import co.bird.android.model.wire.WireOperatorMapFilterBundle;
import co.bird.android.model.wire.WireOperatorMapMultiSelectFilter;
import co.bird.android.model.wire.WireOperatorMapRangeSelectFilter;
import co.bird.android.model.wire.WireRangeSelectFilterOption;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0006\u001a\u0012\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n\u001a\n\u0010\u0010\u001a\u00020\u000f*\u00020\u000e\u001a\n\u0010\u0013\u001a\u00020\u0012*\u00020\u0011\u001a\n\u0010\u0016\u001a\u00020\u0015*\u00020\u0014\u001a\n\u0010\u0019\u001a\u00020\u0018*\u00020\u0017\u001a\n\u0010\u001c\u001a\u00020\u001b*\u00020\u001a\u001a\n\u0010\u001f\u001a\u00020\u001e*\u00020\u001d\u001a\n\u0010\"\u001a\u00020!*\u00020 \u001a\n\u0010%\u001a\u00020$*\u00020#\u001a\n\u0010(\u001a\u00020'*\u00020&\u001a\n\u0010+\u001a\u00020**\u00020)\u001a\n\u0010.\u001a\u00020-*\u00020,\u001a\n\u00101\u001a\u000200*\u00020/\u001a\n\u00104\u001a\u000203*\u000202\u001a\u001a\u00108\u001a\u000207*\u0002052\u0006\u00106\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n\u001a\n\u0010;\u001a\u00020:*\u000209\u001a\u001a\u0010>\u001a\u00020=*\u00020<2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00106\u001a\u00020\n\u001a\"\u0010B\u001a\u00020A*\u00020?2\u0006\u00106\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010@\u001a\u00020\n\u001a\f\u0010E\u001a\u0004\u0018\u00010D*\u00020C\u001a\n\u0010H\u001a\u00020G*\u00020F\u001a\n\u0010K\u001a\u00020J*\u00020I¨\u0006L"}, m28432d2 = {"Lco/bird/android/model/wire/WireFleetStatusSummary;", "Lco/bird/android/model/persistence/FleetStatusSummary;", "e", "Lco/bird/android/model/wire/WireFleetStatusChart;", "Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;", "n", "Lco/bird/android/model/wire/WireFleetStatusChartSection;", "Lco/bird/android/model/persistence/nestedstructures/FleetStatusChartSection;", "o", "Lco/bird/android/model/wire/WireFleetStatus;", "", "fleetId", "Lco/bird/android/model/persistence/FleetStatus;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/wire/WireFleetStatusContent;", "Lco/bird/android/model/persistence/nestedstructures/FleetStatusContent;", "p", "Lco/bird/android/model/wire/WireFleetRating;", "Lco/bird/android/model/persistence/nestedstructures/FleetRating;", "j", "Lco/bird/android/model/wire/WireFleetRatingGroup;", "Lco/bird/android/model/persistence/nestedstructures/FleetRatingGroup;", "k", "Lco/bird/android/model/wire/WireFleetState;", "Lco/bird/android/model/persistence/nestedstructures/FleetState;", "l", "Lco/bird/android/model/wire/WireFleetSubstate;", "Lco/bird/android/model/persistence/nestedstructures/FleetSubstate;", "s", "Lco/bird/android/model/wire/WireFleetStatusAction;", "Lco/bird/android/model/persistence/nestedstructures/FleetStatusAction;", "m", "Lco/bird/android/model/wire/WireFleetStatusMapAction;", "Lco/bird/android/model/persistence/nestedstructures/FleetStatusMapAction;", "r", "Lco/bird/android/model/wire/WireFleetStatusListAction;", "Lco/bird/android/model/persistence/nestedstructures/FleetStatusListAction;", "q", "Lco/bird/android/model/wire/WireOperatorMapFilterBundle;", "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;", "u", "Lco/bird/android/model/wire/WireOperatorMapMultiSelectFilter;", "Lco/bird/android/model/persistence/nestedstructures/OperatorMapMultiSelectFilter;", "v", "Lco/bird/android/model/wire/WireOperatorMapRangeSelectFilter;", "Lco/bird/android/model/persistence/nestedstructures/OperatorMapRangeSelectFilter;", "w", "Lco/bird/android/model/wire/WireMultiSelectFilterOption;", "Lco/bird/android/model/persistence/nestedstructures/MultiSelectFilterOption;", "t", "Lco/bird/android/model/wire/WireRangeSelectFilterOption;", "Lco/bird/android/model/persistence/nestedstructures/RangeSelectFilterOption;", "x", "Lco/bird/android/model/wire/WireFleetList;", "list", "Lco/bird/android/model/persistence/FleetList;", C17296a.f69688o, "Lco/bird/android/model/wire/WireFleetListMessage;", "Lco/bird/android/model/persistence/nestedstructures/FleetListMessage;", "i", "Lco/bird/android/model/wire/WireFleetListSection;", "Lco/bird/android/model/persistence/FleetListSection;", "b", "Lco/bird/android/model/wire/WireFleetListVehicle;", "section", "Lco/bird/android/model/persistence/FleetListVehicle;", "c", "Lco/bird/android/model/wire/WireFleetListComplication;", "Lco/bird/android/model/persistence/nestedstructures/FleetListComplication;", "h", "Lco/bird/android/model/wire/WireFleetListAction;", "Lco/bird/android/model/persistence/nestedstructures/FleetListAction;", "g", "Lco/bird/android/model/wire/WireFacet;", "Lco/bird/android/model/persistence/nestedstructures/Facet;", "f", "co.bird.android.repository.fleet-status"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFleetStatusConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetStatusConversion.kt\nco/bird/android/repository/fleetstatus/converters/FleetStatusConversionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,283:1\n1549#2:284\n1620#2,3:285\n1549#2:288\n1620#2,3:289\n1549#2:292\n1620#2,3:293\n1549#2:296\n1620#2,3:297\n1549#2:300\n1620#2,3:301\n1549#2:304\n1620#2,3:305\n1549#2:308\n1620#2,3:309\n1549#2:312\n1620#2,3:313\n*S KotlinDebug\n*F\n+ 1 FleetStatusConversion.kt\nco/bird/android/repository/fleetstatus/converters/FleetStatusConversionKt\n*L\n69#1:284\n69#1:285,3\n100#1:288\n100#1:289,3\n109#1:292\n109#1:293,3\n129#1:296\n129#1:297,3\n140#1:300\n140#1:301,3\n168#1:304\n168#1:305,3\n169#1:308\n169#1:309,3\n225#1:312\n225#1:313,3\n*E\n"})
/* renamed from: uq1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50068uq1 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: uq1$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C29317a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ComplicationKind.values().length];
            try {
                iArr[ComplicationKind.BATTERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ComplicationKind.ICON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final FleetList m9686a(WireFleetList wireFleetList, String list, String fleetId) {
        FleetListMessage fleetListMessage;
        Intrinsics.checkNotNullParameter(wireFleetList, "<this>");
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        String title = wireFleetList.getTitle();
        WireFleetListMessage message = wireFleetList.getMessage();
        if (message != null) {
            fleetListMessage = m9678i(message);
        } else {
            fleetListMessage = null;
        }
        return new FleetList(title, fleetListMessage, list, fleetId);
    }

    /* renamed from: b */
    public static final FleetListSection m9685b(WireFleetListSection wireFleetListSection, String fleetId, String list) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(wireFleetListSection, "<this>");
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(list, "list");
        String title = wireFleetListSection.getTitle();
        List<WireFacet> facets = wireFleetListSection.getFacets();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(facets, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireFacet wireFacet : facets) {
            arrayList.add(m9681f(wireFacet));
        }
        return new FleetListSection(title, fleetId, list, arrayList);
    }

    /* renamed from: c */
    public static final FleetListVehicle m9684c(WireFleetListVehicle wireFleetListVehicle, String list, String fleetId, String section) {
        FleetListComplication fleetListComplication;
        FleetListAction fleetListAction;
        Intrinsics.checkNotNullParameter(wireFleetListVehicle, "<this>");
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(section, "section");
        String vehicleId = wireFleetListVehicle.getVehicleId();
        String title = wireFleetListVehicle.getTitle();
        ClientIcon icon = wireFleetListVehicle.getIcon();
        ThemedColors m17961f = C47311qB0.m17961f(wireFleetListVehicle.getIconColor());
        ThemedColors m17961f2 = C47311qB0.m17961f(wireFleetListVehicle.getIconBackgroundColor());
        String caption = wireFleetListVehicle.getCaption();
        ThemedColors m17961f3 = C47311qB0.m17961f(wireFleetListVehicle.getCaptionColor());
        String caption2 = wireFleetListVehicle.getCaption2();
        ThemedColors m17961f4 = C47311qB0.m17961f(wireFleetListVehicle.getCaption2Color());
        String notification = wireFleetListVehicle.getNotification();
        WireFleetListComplication complication = wireFleetListVehicle.getComplication();
        if (complication != null) {
            fleetListComplication = m9679h(complication);
        } else {
            fleetListComplication = null;
        }
        WireFleetListAction action = wireFleetListVehicle.getAction();
        if (action == null || (fleetListAction = m9680g(action)) == null) {
            fleetListAction = new FleetListAction(wireFleetListVehicle.getVehicleId(), null, 2, null);
        }
        return new FleetListVehicle(vehicleId, title, icon, m17961f, m17961f2, caption, m17961f3, caption2, m17961f4, notification, fleetListComplication, fleetListAction, wireFleetListVehicle.getFacetIndex(), C47311qB0.m17961f(wireFleetListVehicle.getBackgroundColor()), list, fleetId, section);
    }

    /* renamed from: d */
    public static final FleetStatus m9683d(WireFleetStatus wireFleetStatus, String fleetId) {
        FleetStatusContent fleetStatusContent;
        Intrinsics.checkNotNullParameter(wireFleetStatus, "<this>");
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        String title = wireFleetStatus.getTitle();
        String predictionId = wireFleetStatus.getPredictionId();
        if (predictionId == null) {
            predictionId = ConstantsKt.NONE;
        }
        String str = predictionId;
        String label = wireFleetStatus.getLabel();
        boolean showBackButton = wireFleetStatus.getShowBackButton();
        String backButtonLabel = wireFleetStatus.getBackButtonLabel();
        WireFleetStatusContent content = wireFleetStatus.getContent();
        if (content != null) {
            fleetStatusContent = m9671p(content);
        } else {
            fleetStatusContent = null;
        }
        return new FleetStatus(0L, fleetId, title, str, label, showBackButton, backButtonLabel, fleetStatusContent, null, 257, null);
    }

    /* renamed from: e */
    public static final FleetStatusSummary m9682e(WireFleetStatusSummary wireFleetStatusSummary) {
        FleetStatusChart fleetStatusChart;
        Intrinsics.checkNotNullParameter(wireFleetStatusSummary, "<this>");
        String fleetId = wireFleetStatusSummary.getFleetId();
        String title = wireFleetStatusSummary.getTitle();
        String description = wireFleetStatusSummary.getDescription();
        WireFleetStatusChart chart = wireFleetStatusSummary.getChart();
        if (chart != null) {
            fleetStatusChart = m9673n(chart);
        } else {
            fleetStatusChart = null;
        }
        return new FleetStatusSummary(fleetId, title, description, fleetStatusChart);
    }

    /* renamed from: f */
    public static final Facet m9681f(WireFacet wireFacet) {
        Intrinsics.checkNotNullParameter(wireFacet, "<this>");
        return new Facet(wireFacet.getName(), wireFacet.getDisplayName());
    }

    /* renamed from: g */
    public static final FleetListAction m9680g(WireFleetListAction wireFleetListAction) {
        Intrinsics.checkNotNullParameter(wireFleetListAction, "<this>");
        return new FleetListAction(wireFleetListAction.getVehicleId(), wireFleetListAction.getKind());
    }

    /* renamed from: h */
    public static final FleetListComplication m9679h(WireFleetListComplication wireFleetListComplication) {
        int i;
        WireIconComplication iconComplication;
        Intrinsics.checkNotNullParameter(wireFleetListComplication, "<this>");
        int i2 = C29317a.$EnumSwitchMapping$0[wireFleetListComplication.getKind().ordinal()];
        if (i2 != 1) {
            if (i2 != 2 || (iconComplication = wireFleetListComplication.getIconComplication()) == null) {
                return null;
            }
            return new FleetListComplication.IconComplication(iconComplication.getIcon(), iconComplication.getNumIcons(), iconComplication.getNumFilled(), C47311qB0.m17961f(iconComplication.getUnfilledColor()), C47311qB0.m17961f(iconComplication.getFilledColor()));
        }
        WireBatteryComplication batteryComplication = wireFleetListComplication.getBatteryComplication();
        if (batteryComplication != null) {
            i = batteryComplication.getBattery();
        } else {
            i = 0;
        }
        return new FleetListComplication.BatteryComplication(i);
    }

    /* renamed from: i */
    public static final FleetListMessage m9678i(WireFleetListMessage wireFleetListMessage) {
        Intrinsics.checkNotNullParameter(wireFleetListMessage, "<this>");
        return new FleetListMessage(wireFleetListMessage.getTitle(), wireFleetListMessage.getIcon(), C47311qB0.m17961f(wireFleetListMessage.getIconColor()), C47311qB0.m17961f(wireFleetListMessage.getTitleColor()), C47311qB0.m17961f(wireFleetListMessage.getBackgroundColor()), wireFleetListMessage.getDescription());
    }

    /* renamed from: j */
    public static final FleetRating m9677j(WireFleetRating wireFleetRating) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(wireFleetRating, "<this>");
        double rating = wireFleetRating.getRating();
        String description = wireFleetRating.getDescription();
        List<WireFleetRatingGroup> groups = wireFleetRating.getGroups();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(groups, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireFleetRatingGroup wireFleetRatingGroup : groups) {
            arrayList.add(m9676k(wireFleetRatingGroup));
        }
        return new FleetRating(rating, description, arrayList);
    }

    /* renamed from: k */
    public static final FleetRatingGroup m9676k(WireFleetRatingGroup wireFleetRatingGroup) {
        Intrinsics.checkNotNullParameter(wireFleetRatingGroup, "<this>");
        return new FleetRatingGroup(wireFleetRatingGroup.getTitle(), wireFleetRatingGroup.getCount(), wireFleetRatingGroup.getBirdIds());
    }

    /* renamed from: l */
    public static final FleetState m9675l(WireFleetState wireFleetState) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(wireFleetState, "<this>");
        ClientIcon icon = wireFleetState.getIcon();
        ThemedColors m17961f = C47311qB0.m17961f(wireFleetState.getIconColor());
        ThemedColors m17961f2 = C47311qB0.m17961f(wireFleetState.getIconBackgroundColor());
        String title = wireFleetState.getTitle();
        String description = wireFleetState.getDescription();
        String kind = wireFleetState.getKind();
        List<WireFleetSubstate> substates = wireFleetState.getSubstates();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(substates, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireFleetSubstate wireFleetSubstate : substates) {
            arrayList.add(m9668s(wireFleetSubstate));
        }
        return new FleetState(icon, m17961f, m17961f2, title, description, kind, arrayList);
    }

    /* renamed from: m */
    public static final FleetStatusAction m9674m(WireFleetStatusAction wireFleetStatusAction) {
        FleetStatusMapAction fleetStatusMapAction;
        Intrinsics.checkNotNullParameter(wireFleetStatusAction, "<this>");
        FleetStatusActionKind kind = wireFleetStatusAction.getKind();
        WireFleetStatusMapAction mapAction = wireFleetStatusAction.getMapAction();
        FleetStatusListAction fleetStatusListAction = null;
        if (mapAction != null) {
            fleetStatusMapAction = m9669r(mapAction);
        } else {
            fleetStatusMapAction = null;
        }
        WireFleetStatusListAction listAction = wireFleetStatusAction.getListAction();
        if (listAction != null) {
            fleetStatusListAction = m9670q(listAction);
        }
        return new FleetStatusAction(kind, fleetStatusMapAction, fleetStatusListAction, wireFleetStatusAction.getMetadata());
    }

    /* renamed from: n */
    public static final FleetStatusChart m9673n(WireFleetStatusChart wireFleetStatusChart) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(wireFleetStatusChart, "<this>");
        String title = wireFleetStatusChart.getTitle();
        int fromDegrees = wireFleetStatusChart.getFromDegrees();
        ChartFillStrategy fillStrategy = wireFleetStatusChart.getFillStrategy();
        List<WireFleetStatusChartSection> sections = wireFleetStatusChart.getSections();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(sections, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireFleetStatusChartSection wireFleetStatusChartSection : sections) {
            arrayList.add(m9672o(wireFleetStatusChartSection));
        }
        return new FleetStatusChart(title, fromDegrees, fillStrategy, arrayList);
    }

    /* renamed from: o */
    public static final FleetStatusChartSection m9672o(WireFleetStatusChartSection wireFleetStatusChartSection) {
        Intrinsics.checkNotNullParameter(wireFleetStatusChartSection, "<this>");
        return new FleetStatusChartSection(wireFleetStatusChartSection.getId(), wireFleetStatusChartSection.getPosition(), wireFleetStatusChartSection.getLabel(), wireFleetStatusChartSection.getShowLabel(), wireFleetStatusChartSection.getFillDegrees(), C47311qB0.m17961f(wireFleetStatusChartSection.getFillColor()), wireFleetStatusChartSection.getFillHeight());
    }

    /* renamed from: p */
    public static final FleetStatusContent m9671p(WireFleetStatusContent wireFleetStatusContent) {
        FleetStatusChart fleetStatusChart;
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(wireFleetStatusContent, "<this>");
        WireFleetStatusChart chart = wireFleetStatusContent.getChart();
        FleetRating fleetRating = null;
        if (chart != null) {
            fleetStatusChart = m9673n(chart);
        } else {
            fleetStatusChart = null;
        }
        List<WireFleetState> states = wireFleetStatusContent.getStates();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(states, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireFleetState wireFleetState : states) {
            arrayList.add(m9675l(wireFleetState));
        }
        WireFleetRating rating = wireFleetStatusContent.getRating();
        if (rating != null) {
            fleetRating = m9677j(rating);
        }
        return new FleetStatusContent(fleetStatusChart, arrayList, fleetRating);
    }

    /* renamed from: q */
    public static final FleetStatusListAction m9670q(WireFleetStatusListAction wireFleetStatusListAction) {
        Intrinsics.checkNotNullParameter(wireFleetStatusListAction, "<this>");
        return new FleetStatusListAction(wireFleetStatusListAction.getSubstate());
    }

    /* renamed from: r */
    public static final FleetStatusMapAction m9669r(WireFleetStatusMapAction wireFleetStatusMapAction) {
        OperatorMapFilterBundle operatorMapFilterBundle;
        Intrinsics.checkNotNullParameter(wireFleetStatusMapAction, "<this>");
        WireOperatorMapFilterBundle vehicleFilters = wireFleetStatusMapAction.getVehicleFilters();
        OperatorMapFilterBundle operatorMapFilterBundle2 = null;
        if (vehicleFilters != null) {
            operatorMapFilterBundle = m9666u(vehicleFilters);
        } else {
            operatorMapFilterBundle = null;
        }
        WireOperatorMapFilterBundle areaFilters = wireFleetStatusMapAction.getAreaFilters();
        if (areaFilters != null) {
            operatorMapFilterBundle2 = m9666u(areaFilters);
        }
        return new FleetStatusMapAction(operatorMapFilterBundle, operatorMapFilterBundle2, wireFleetStatusMapAction.getRegion());
    }

    /* renamed from: s */
    public static final FleetSubstate m9668s(WireFleetSubstate wireFleetSubstate) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(wireFleetSubstate, "<this>");
        ClientIcon icon = wireFleetSubstate.getIcon();
        ThemedColors m17961f = C47311qB0.m17961f(wireFleetSubstate.getIconColor());
        ThemedColors m17961f2 = C47311qB0.m17961f(wireFleetSubstate.getBackgroundColor());
        String title = wireFleetSubstate.getTitle();
        ThemedColors m17961f3 = C47311qB0.m17961f(wireFleetSubstate.getTitleColor());
        List<WireFleetStatusAction> actions = wireFleetSubstate.getActions();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(actions, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireFleetStatusAction wireFleetStatusAction : actions) {
            arrayList.add(m9674m(wireFleetStatusAction));
        }
        return new FleetSubstate(icon, m17961f, m17961f2, title, m17961f3, arrayList, wireFleetSubstate.getKind());
    }

    /* renamed from: t */
    public static final MultiSelectFilterOption m9667t(WireMultiSelectFilterOption wireMultiSelectFilterOption) {
        Intrinsics.checkNotNullParameter(wireMultiSelectFilterOption, "<this>");
        return new MultiSelectFilterOption(wireMultiSelectFilterOption.getSelections());
    }

    /* renamed from: u */
    public static final OperatorMapFilterBundle m9666u(WireOperatorMapFilterBundle wireOperatorMapFilterBundle) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Intrinsics.checkNotNullParameter(wireOperatorMapFilterBundle, "<this>");
        List<WireOperatorMapMultiSelectFilter> multiSelectFilters = wireOperatorMapFilterBundle.getMultiSelectFilters();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(multiSelectFilters, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireOperatorMapMultiSelectFilter wireOperatorMapMultiSelectFilter : multiSelectFilters) {
            arrayList.add(m9665v(wireOperatorMapMultiSelectFilter));
        }
        List<WireOperatorMapRangeSelectFilter> rangeSelectFilters = wireOperatorMapFilterBundle.getRangeSelectFilters();
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(rangeSelectFilters, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        for (WireOperatorMapRangeSelectFilter wireOperatorMapRangeSelectFilter : rangeSelectFilters) {
            arrayList2.add(m9664w(wireOperatorMapRangeSelectFilter));
        }
        return new OperatorMapFilterBundle(arrayList, arrayList2, null, 4, null);
    }

    /* renamed from: v */
    public static final OperatorMapMultiSelectFilter m9665v(WireOperatorMapMultiSelectFilter wireOperatorMapMultiSelectFilter) {
        Intrinsics.checkNotNullParameter(wireOperatorMapMultiSelectFilter, "<this>");
        return new OperatorMapMultiSelectFilter(wireOperatorMapMultiSelectFilter.getId(), m9667t(wireOperatorMapMultiSelectFilter.getOptions()));
    }

    /* renamed from: w */
    public static final OperatorMapRangeSelectFilter m9664w(WireOperatorMapRangeSelectFilter wireOperatorMapRangeSelectFilter) {
        Intrinsics.checkNotNullParameter(wireOperatorMapRangeSelectFilter, "<this>");
        return new OperatorMapRangeSelectFilter(wireOperatorMapRangeSelectFilter.getId(), m9663x(wireOperatorMapRangeSelectFilter.getOptions()), null, 4, null);
    }

    /* renamed from: x */
    public static final RangeSelectFilterOption m9663x(WireRangeSelectFilterOption wireRangeSelectFilterOption) {
        Intrinsics.checkNotNullParameter(wireRangeSelectFilterOption, "<this>");
        return new RangeSelectFilterOption(wireRangeSelectFilterOption.getStart(), wireRangeSelectFilterOption.getEnd());
    }
}
