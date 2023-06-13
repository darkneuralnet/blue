package p000;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.AlarmCommand;
import co.bird.android.model.BirdSummaryBody;
import co.bird.android.model.LockCommand;
import co.bird.android.model.MobilePartner;
import co.bird.android.model.SleepCommand;
import co.bird.android.model.UnlockCommand;
import co.bird.android.model.VehicleCommand;
import co.bird.android.model.WakeCommand;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.constant.FlightSheetCommand;
import co.bird.android.model.constant.Placement;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdKt;
import co.bird.android.model.wire.WireLifecycle;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b(\u0010)J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0004J$\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0004J8\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\rH\u0004J\f\u0010\u0012\u001a\u00020\r*\u00020\u0004H\u0004J\u0014\u0010\u0017\u001a\u00020\u0016*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0004J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u001a\u0010 \u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\f\u0010!\u001a\u00020\u0016*\u00020\u0004H\u0002J\f\u0010#\u001a\u00020\"*\u00020\u0004H\u0003R\u001a\u0010\u0015\u001a\u00020\u00148\u0004X\u0084\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006*"}, m28432d2 = {"LtA;", "", "Lco/bird/android/model/BirdSummaryBody;", "birdSummary", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/MobilePartner;", "partner", "LH6;", "l", "i", "LG6;", "headerItem", "", "lock", "alarm", "sleep", "h", "n", "Lco/bird/android/model/constant/Placement;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "q", "locked", "ackLocked", "Lco/bird/android/model/constant/BirdModel;", RequestHeadersFactory.MODEL, "Lco/bird/android/model/VehicleCommand;", "j", "g", "sleeping", "k", "o", "", "p", C17296a.f69688o, "Landroid/content/Context;", "m", "()Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "co.bird.android.feature.lib.command"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseCommandConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCommandConverter.kt\nco/bird/android/command/base/BaseCommandConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,220:1\n1549#2:221\n1620#2,3:222\n*S KotlinDebug\n*F\n+ 1 BaseCommandConverter.kt\nco/bird/android/command/base/BaseCommandConverter\n*L\n81#1:221\n81#1:222,3\n*E\n"})
/* renamed from: tA */
/* loaded from: classes2.dex */
public abstract class AbstractC28540tA {

    /* renamed from: a */
    public final Context f109962a;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tA$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C28541a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Placement.values().length];
            try {
                iArr[Placement.PRIVATE_PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Placement.IN_MARKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Placement.FACILITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Placement.TRANSIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Placement.IMPOUND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Placement.IN_3PL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Placement.TERMINATED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Placement.LOST.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AbstractC28540tA(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f109962a = context;
    }

    public static /* synthetic */ C3023H6 generateCommandSection$default(AbstractC28540tA abstractC28540tA, WireBird wireBird, C2637G6 c2637g6, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj == null) {
            return abstractC28540tA.m12967h(wireBird, c2637g6, (i & 4) != 0 ? true : z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? true : z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateCommandSection");
    }

    public static /* synthetic */ C3023H6 generateFieldSummarySection$default(AbstractC28540tA abstractC28540tA, WireBird wireBird, BirdSummaryBody birdSummaryBody, MobilePartner mobilePartner, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                mobilePartner = null;
            }
            return abstractC28540tA.m12966i(wireBird, birdSummaryBody, mobilePartner);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateFieldSummarySection");
    }

    public static /* synthetic */ C3023H6 generateVehicleSummarySection$default(AbstractC28540tA abstractC28540tA, BirdSummaryBody birdSummaryBody, WireBird wireBird, MobilePartner mobilePartner, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                wireBird = null;
            }
            if ((i & 4) != 0) {
                mobilePartner = null;
            }
            return abstractC28540tA.m12963l(birdSummaryBody, wireBird, mobilePartner);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateVehicleSummarySection");
    }

    /* renamed from: g */
    public final VehicleCommand m12968g(BirdModel birdModel) {
        FlightSheetCommand flightSheetCommand = FlightSheetCommand.ALARM_CELL;
        String string = this.f109962a.getString(C45871nl4.command_center_command_alarm_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…nter_command_alarm_title)");
        int i = C48193rg4.ic_alarm;
        String string2 = this.f109962a.getString(C45871nl4.command_center_command_alarm_command);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(L.stri…er_command_alarm_command)");
        AlarmCommand alarmCommand = new AlarmCommand(flightSheetCommand, birdModel, string, i, string2, null, null, 96, null);
        if (!alarmCommand.getBluetooth() && !alarmCommand.getCellular()) {
            return null;
        }
        return alarmCommand;
    }

    /* renamed from: h */
    public final C3023H6 m12967h(WireBird bird, C2637G6 c2637g6, boolean z, boolean z2, boolean z3) {
        VehicleCommand vehicleCommand;
        VehicleCommand vehicleCommand2;
        List listOfNotNull;
        int collectionSizeOrDefault;
        List mutableList;
        Intrinsics.checkNotNullParameter(bird, "bird");
        BirdModel fromString = BirdModel.Companion.fromString(bird.getModel());
        if (fromString == null) {
            fromString = BirdModel.M365;
        }
        VehicleCommand[] vehicleCommandArr = new VehicleCommand[3];
        VehicleCommand vehicleCommand3 = null;
        if (z) {
            vehicleCommand = m12965j(bird.getLocked(), bird.getAckLocked(), fromString);
        } else {
            vehicleCommand = null;
        }
        vehicleCommandArr[0] = vehicleCommand;
        if (z2) {
            vehicleCommand2 = m12968g(fromString);
        } else {
            vehicleCommand2 = null;
        }
        vehicleCommandArr[1] = vehicleCommand2;
        if (z3) {
            vehicleCommand3 = m12964k(WireBirdKt.isAsleep(bird), fromString);
        }
        vehicleCommandArr[2] = vehicleCommand3;
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) vehicleCommandArr);
        List<VehicleCommand> list = listOfNotNull;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (VehicleCommand vehicleCommand4 : list) {
            arrayList.add(new C2637G6(vehicleCommand4, C45851nj4.item_command_center_command, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return new C3023H6(mutableList, c2637g6, null, 4, null);
    }

    /* renamed from: i */
    public final C3023H6 m12966i(WireBird bird, BirdSummaryBody birdSummary, MobilePartner mobilePartner) {
        int i;
        int i2;
        List mutableListOf;
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(birdSummary, "birdSummary");
        String m12960o = m12960o(bird);
        int m12959p = m12959p(bird);
        BirdModel model = birdSummary.getBirdSummary().getModel();
        String modelDisplay = birdSummary.getBirdSummary().getModelDisplay();
        Context context = this.f109962a;
        int i3 = C45871nl4.bird_status_brain_battery_format_with_tracked_at;
        Object[] objArr = new Object[2];
        Integer batteryLevel = birdSummary.getBirdSummary().getBatteryLevel();
        if (batteryLevel != null) {
            i = batteryLevel.intValue();
        } else {
            i = 0;
        }
        objArr[0] = Integer.valueOf(i);
        objArr[1] = C46880pT0.getElapsedTime$default(birdSummary.getBirdSummary().getBatteryLastTrackedAtTime(), this.f109962a, false, 2, null);
        String string = context.getString(i3, objArr);
        Integer batteryLevel2 = birdSummary.getBirdSummary().getBatteryLevel();
        if (batteryLevel2 != null) {
            i2 = batteryLevel2.intValue();
        } else {
            i2 = 0;
        }
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(new C50043un6(m12960o, Integer.valueOf(m12959p), null, null, null, null, null, null, null, mobilePartner, model, birdSummary.getBirdSummary().getCode(), i2, string, null, null, null, modelDisplay, null, null, null, null, C46880pT0.getElapsedTime$default(birdSummary.getBirdSummary().getTrackedAtTime(), this.f109962a, false, 2, null), null, null, null, m12958q(bird.getLifecycle().getPlacement(), this.f109962a), null, null, null, false, false, false, false, false, false, false, false, null, -71450116, 127, null), C45851nj4.item_field_summary, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: j */
    public final VehicleCommand m12965j(boolean z, boolean z2, BirdModel birdModel) {
        SpannableString span$default;
        SpannableString m25592n;
        if (z) {
            if (z2) {
                String string = this.f109962a.getString(C45871nl4.command_center_command_locked_title);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…ter_command_locked_title)");
                String string2 = this.f109962a.getString(C45871nl4.command_center_command_title_format, string);
                Intrinsics.checkNotNullExpressionValue(string2, "context.getString(L.stri…mand_title_format, title)");
                m25592n = C45097mS5.span$default(string2, string, null, 2, null);
            } else {
                String string3 = this.f109962a.getString(C45871nl4.command_center_command_pending_lock_title);
                Intrinsics.checkNotNullExpressionValue(string3, "context.getString(L.stri…mmand_pending_lock_title)");
                String string4 = this.f109962a.getString(C45871nl4.command_center_command_title_format, string3);
                Intrinsics.checkNotNullExpressionValue(string4, "context.getString(L.stri…mand_title_format, title)");
                m25592n = C45097mS5.m25592n(C45097mS5.span$default(string4, string3, null, 2, null), string3, new ForegroundColorSpan(NA0.m94301c(this.f109962a, C32364Df4.birdRed)));
            }
            FlightSheetCommand flightSheetCommand = FlightSheetCommand.LOCK_CELL;
            int i = C33309Hg4.ic_lock_dark;
            String string5 = this.f109962a.getString(C45871nl4.command_center_command_unlock_command);
            Intrinsics.checkNotNullExpressionValue(string5, "context.getString(L.stri…r_command_unlock_command)");
            return new UnlockCommand(flightSheetCommand, birdModel, m25592n, i, string5, null, 32, null);
        }
        if (z2) {
            String string6 = this.f109962a.getString(C45871nl4.command_center_command_pending_unlock_title);
            Intrinsics.checkNotNullExpressionValue(string6, "context.getString(L.stri…and_pending_unlock_title)");
            String string7 = this.f109962a.getString(C45871nl4.command_center_command_title_format, string6);
            Intrinsics.checkNotNullExpressionValue(string7, "context.getString(L.stri…mand_title_format, title)");
            span$default = C45097mS5.m25592n(C45097mS5.span$default(string7, string6, null, 2, null), string6, new ForegroundColorSpan(NA0.m94301c(this.f109962a, C32364Df4.birdRed)));
        } else {
            String string8 = this.f109962a.getString(C45871nl4.command_center_command_unlocked_title);
            Intrinsics.checkNotNullExpressionValue(string8, "context.getString(L.stri…r_command_unlocked_title)");
            String string9 = this.f109962a.getString(C45871nl4.command_center_command_title_format, string8);
            Intrinsics.checkNotNullExpressionValue(string9, "context.getString(L.stri…mand_title_format, title)");
            span$default = C45097mS5.span$default(string9, string8, null, 2, null);
        }
        FlightSheetCommand flightSheetCommand2 = FlightSheetCommand.LOCK_CELL;
        int i2 = C33309Hg4.ic_lock_dark;
        String string10 = this.f109962a.getString(C45871nl4.command_center_command_lock_command);
        Intrinsics.checkNotNullExpressionValue(string10, "context.getString(L.stri…ter_command_lock_command)");
        return new LockCommand(flightSheetCommand2, birdModel, span$default, i2, string10, null, 32, null);
    }

    /* renamed from: k */
    public final VehicleCommand m12964k(boolean z, BirdModel birdModel) {
        VehicleCommand sleepCommand;
        if (z) {
            String string = this.f109962a.getString(C45871nl4.command_center_command_sleep_title);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…nter_command_sleep_title)");
            FlightSheetCommand flightSheetCommand = FlightSheetCommand.UNKNOWN;
            String string2 = this.f109962a.getString(C45871nl4.command_center_command_title_format, string);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(L.stri…le_format, sleepingTitle)");
            SpannableString span$default = C45097mS5.span$default(string2, string, null, 2, null);
            int i = C48193rg4.ic_power;
            String string3 = this.f109962a.getString(C45871nl4.command_center_command_wake_command);
            Intrinsics.checkNotNullExpressionValue(string3, "context.getString(L.stri…ter_command_wake_command)");
            sleepCommand = new WakeCommand(flightSheetCommand, birdModel, span$default, i, string3, null, 32, null);
        } else {
            String string4 = this.f109962a.getString(C45871nl4.command_center_command_wake_title);
            Intrinsics.checkNotNullExpressionValue(string4, "context.getString(L.stri…enter_command_wake_title)");
            FlightSheetCommand flightSheetCommand2 = FlightSheetCommand.UNKNOWN;
            String string5 = this.f109962a.getString(C45871nl4.command_center_command_title_format, string4);
            Intrinsics.checkNotNullExpressionValue(string5, "context.getString(L.stri…title_format, awakeTitle)");
            SpannableString span$default2 = C45097mS5.span$default(string5, string4, null, 2, null);
            int i2 = C48193rg4.ic_power;
            String string6 = this.f109962a.getString(C45871nl4.command_center_command_sleep_command);
            Intrinsics.checkNotNullExpressionValue(string6, "context.getString(L.stri…er_command_sleep_command)");
            sleepCommand = new SleepCommand(flightSheetCommand2, birdModel, span$default2, i2, string6, null, 32, null);
        }
        if (!sleepCommand.getBluetooth() && !sleepCommand.getCellular()) {
            return null;
        }
        return sleepCommand;
    }

    /* renamed from: l */
    public final C3023H6 m12963l(BirdSummaryBody birdSummary, WireBird wireBird, MobilePartner mobilePartner) {
        Placement placement;
        MobilePartner mobilePartner2;
        boolean z;
        List mutableListOf;
        WireLifecycle lifecycle;
        Intrinsics.checkNotNullParameter(birdSummary, "birdSummary");
        Context context = this.f109962a;
        if (wireBird != null && (lifecycle = wireBird.getLifecycle()) != null) {
            placement = lifecycle.getPlacement();
        } else {
            placement = null;
        }
        if (placement == Placement.FACILITY) {
            mobilePartner2 = mobilePartner;
            z = true;
        } else {
            mobilePartner2 = mobilePartner;
            z = false;
        }
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(C29888wT.m6790a(birdSummary, context, z, mobilePartner2), C45851nj4.item_vehicle_summary, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: m */
    public final Context m12962m() {
        return this.f109962a;
    }

    /* renamed from: n */
    public final boolean m12961n(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        if (!WireBirdKt.isDamaged(wireBird) && !WireBirdKt.isTotaled(wireBird) && !wireBird.getDisconnected() && !wireBird.getSubmerged()) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public final String m12960o(WireBird wireBird) {
        if (WireBirdKt.isCollect(wireBird)) {
            String string = this.f109962a.getString(C45871nl4.operator_task_status_collect_label);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…ask_status_collect_label)");
            return string;
        } else if (m12961n(wireBird)) {
            String string2 = this.f109962a.getString(C45871nl4.operator_task_status_damaged_label);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(L.stri…ask_status_damaged_label)");
            return string2;
        } else {
            String string3 = this.f109962a.getString(C45871nl4.operator_task_status_ready_label);
            Intrinsics.checkNotNullExpressionValue(string3, "context.getString(L.stri…_task_status_ready_label)");
            return string3;
        }
    }

    /* renamed from: p */
    public final int m12959p(WireBird wireBird) {
        if (WireBirdKt.isCollect(wireBird)) {
            return NA0.m94301c(this.f109962a, C32364Df4.birdRed);
        }
        if (m12961n(wireBird)) {
            return NA0.m94301c(this.f109962a, C32364Df4.birdRed);
        }
        return NA0.m94301c(this.f109962a, C32364Df4.birdNewRoad);
    }

    /* renamed from: q */
    public final String m12958q(Placement placement, Context context) {
        Intrinsics.checkNotNullParameter(placement, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        switch (C28541a.$EnumSwitchMapping$0[placement.ordinal()]) {
            case 1:
                String string = context.getString(C45871nl4.placement_private_property);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…acement_private_property)");
                return string;
            case 2:
                String string2 = context.getString(C45871nl4.placement_in_market);
                Intrinsics.checkNotNullExpressionValue(string2, "context.getString(L.string.placement_in_market)");
                return string2;
            case 3:
                String string3 = context.getString(C45871nl4.placement_facility);
                Intrinsics.checkNotNullExpressionValue(string3, "context.getString(L.string.placement_facility)");
                return string3;
            case 4:
                String string4 = context.getString(C45871nl4.placement_transit);
                Intrinsics.checkNotNullExpressionValue(string4, "context.getString(L.string.placement_transit)");
                return string4;
            case 5:
                String string5 = context.getString(C45871nl4.placement_impound);
                Intrinsics.checkNotNullExpressionValue(string5, "context.getString(L.string.placement_impound)");
                return string5;
            case 6:
                String string6 = context.getString(C45871nl4.placement_in_3_pl);
                Intrinsics.checkNotNullExpressionValue(string6, "context.getString(L.string.placement_in_3_pl)");
                return string6;
            case 7:
                String string7 = context.getString(C45871nl4.placement_terminated);
                Intrinsics.checkNotNullExpressionValue(string7, "context.getString(L.string.placement_terminated)");
                return string7;
            case 8:
                String string8 = context.getString(C45871nl4.placement_lost);
                Intrinsics.checkNotNullExpressionValue(string8, "context.getString(L.string.placement_lost)");
                return string8;
            default:
                String string9 = context.getString(C45871nl4.placement_unknown);
                Intrinsics.checkNotNullExpressionValue(string9, "context.getString(L.string.placement_unknown)");
                return string9;
        }
    }
}
