package p000;

import co.bird.android.model.constant.BirdAction;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0007¨\u0006\u0004"}, m28432d2 = {"Lco/bird/android/model/constant/BirdAction;", "", "b", C17296a.f69688o, "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: eH */
/* loaded from: classes3.dex */
public final class C19999eH {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: eH$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C20000a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BirdAction.values().length];
            try {
                iArr[BirdAction.MARK_MISSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BirdAction.CANNOT_ACCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BirdAction.MARK_FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BirdAction.MARK_DAMAGED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BirdAction.MARK_FOUND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BirdAction.MARK_LOST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BirdAction.CAPTURE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BirdAction.RELEASE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BirdAction.UNLOCK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BirdAction.LOCK.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BirdAction.ALARM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BirdAction.CHIRP_ALARM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BirdAction.ALARM_ON.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BirdAction.ALARM_OFF.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[BirdAction.START_CHARGE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[BirdAction.COMPLETE_CHARGE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[BirdAction.CANCEL_TASK.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[BirdAction.DAMAGED_CHARGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[BirdAction.REPAIR.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[BirdAction.START_REPAIR.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[BirdAction.CONTINUE_REPAIR.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[BirdAction.REPORT_FRAUD.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[BirdAction.ORDER_SPARE_PARTS.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[BirdAction.VALIDATE_RELEASE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[BirdAction.SEARCH_NEARBY.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[BirdAction.NO_ACTION.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[BirdAction.GET_CODE.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[BirdAction.WAKE_BIRD.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[BirdAction.SLEEP_BIRD.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[BirdAction.REMOVE_FROM_LIST.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[BirdAction.UNLOCK_SMARTLOCK.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[BirdAction.REPLACE_PHYSICAL_LOCK.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[BirdAction.FLIGHT_SHEET.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[BirdAction.UNKNOWN.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final int m43060a(BirdAction birdAction) {
        Intrinsics.checkNotNullParameter(birdAction, "<this>");
        switch (C20000a.$EnumSwitchMapping$0[birdAction.ordinal()]) {
            case 1:
                return C45871nl4.bird_action_mark_missing_success;
            case 2:
                return C45871nl4.bird_action_cannot_access_success;
            case 3:
                return C45871nl4.bird_action_mark_fixed_success;
            case 4:
                return C45871nl4.bird_action_mark_damaged_success;
            case 5:
                return C45871nl4.bird_action_mark_found_success;
            case 6:
                return C45871nl4.bird_action_mark_lost_success;
            case 7:
                return C45871nl4.bird_action_capture_success;
            case 8:
                return C45871nl4.bird_action_release_success;
            case 9:
                return C45871nl4.bird_action_unlock_success;
            case 10:
                return C45871nl4.bird_action_lock_success;
            case 11:
                return C45871nl4.bird_action_alarm_success;
            case 12:
                return C45871nl4.bird_action_alarm_success;
            case 13:
                return C45871nl4.bird_action_alarm_on_success;
            case 14:
                return C45871nl4.bird_action_alarm_off_success;
            case 15:
                return C45871nl4.bird_action_start_charge_success;
            case 16:
                return C45871nl4.bird_action_complete_charge_success;
            case 17:
                return C45871nl4.bird_action_cancel_task_success;
            case 18:
                return C45871nl4.bird_action_damaged_charge_success;
            case 19:
                return C45871nl4.bird_action_damaged_charge_success;
            case 20:
                return C45871nl4.bird_action_start_repair_success;
            case 21:
                return C45871nl4.bird_action_continue_repair_success;
            case 22:
                return C45871nl4.bird_action_report_fraud_success;
            case 23:
                return C45871nl4.bird_action_needs_parts_success;
            case 24:
                return C45871nl4.bird_action_validate_release_success;
            case 25:
                return C45871nl4.bird_action_search_nearby_success;
            case 26:
                return C45871nl4.bird_action_unknown;
            case 27:
                return C45871nl4.bird_action_unknown;
            case 28:
                return C45871nl4.bird_action_wake_success;
            case 29:
                return C45871nl4.bird_action_sleep_success;
            case 30:
                return C46464ol4.empty;
            case 31:
                return C45871nl4.bird_action_unknown;
            case 32:
                return C45871nl4.bird_action_unknown;
            case 33:
                return C46464ol4.empty;
            case 34:
                return C45871nl4.bird_action_unknown;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: b */
    public static final int m43059b(BirdAction birdAction) {
        Intrinsics.checkNotNullParameter(birdAction, "<this>");
        switch (C20000a.$EnumSwitchMapping$0[birdAction.ordinal()]) {
            case 1:
                return C45871nl4.bird_action_mark_missing;
            case 2:
                return C45871nl4.bird_action_cannot_capture;
            case 3:
                return C45871nl4.bird_action_mark_fixed;
            case 4:
                return C45871nl4.bird_action_report_damaged;
            case 5:
                return C45871nl4.bird_action_mark_found;
            case 6:
                return C45871nl4.bird_action_mark_lost;
            case 7:
                return C45871nl4.bird_action_capture;
            case 8:
                return C45871nl4.bird_action_release;
            case 9:
                return C45871nl4.bird_action_unlock;
            case 10:
                return C45871nl4.bird_action_lock;
            case 11:
                return C45871nl4.bird_action_alarm;
            case 12:
                return C45871nl4.bird_action_chirp_alarm;
            case 13:
                return C45871nl4.bird_action_alarm_on;
            case 14:
                return C45871nl4.bird_action_alarm_off;
            case 15:
                return C45871nl4.bird_action_start_charge;
            case 16:
                return C45871nl4.bird_action_complete_charge;
            case 17:
                return C45871nl4.bird_action_cancel_task;
            case 18:
                return C45871nl4.bird_action_damaged_charge;
            case 19:
                return C45871nl4.bird_action_repair;
            case 20:
                return C45871nl4.bird_action_start_repair;
            case 21:
                return C45871nl4.bird_action_continue_repair;
            case 22:
                return C45871nl4.bird_action_report_fraud;
            case 23:
                return C45871nl4.bird_action_needs_parts;
            case 24:
                return C45871nl4.bird_action_validate_release;
            case 25:
                return C45871nl4.bird_action_search_nearby;
            case 26:
                return C45871nl4.bird_action_unknown;
            case 27:
                return C45871nl4.bird_action_unknown;
            case 28:
                return C45871nl4.bird_action_wake;
            case 29:
                return C45871nl4.bird_action_sleep;
            case 30:
                return C45871nl4.bird_action_remove_from_list;
            case 31:
                return C45871nl4.bird_action_unknown;
            case 32:
                return C45871nl4.bird_action_unknown;
            case 33:
                return C45871nl4.bird_action_remove_from_list;
            case 34:
                return C45871nl4.bird_action_unknown;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
