package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.MapMarkerKind;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0000H\u0007¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/constant/MapMarkerKind;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/graphics/drawable/Drawable;", "b", "", C17296a.f69688o, "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: yK2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52136yK2 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yK2$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C30555a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MapMarkerKind.values().length];
            try {
                iArr[MapMarkerKind.CHARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MapMarkerKind.DAMAGED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MapMarkerKind.DESIGNATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MapMarkerKind.IN_RIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MapMarkerKind.IN_TASK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MapMarkerKind.MISSING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MapMarkerKind.MOVE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MapMarkerKind.LEGAL_PRESERVE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[MapMarkerKind.LIPO.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[MapMarkerKind.OFFLINE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[MapMarkerKind.PERIL_REBALANCE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[MapMarkerKind.PROPERTY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[MapMarkerKind.RADAR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[MapMarkerKind.READY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[MapMarkerKind.SUBMERGED.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[MapMarkerKind.ULM.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[MapMarkerKind.DEBRAIN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[MapMarkerKind.TASK_ORDER_FACILITY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[MapMarkerKind.TASK_ORDER_HOLD.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[MapMarkerKind.TASK_ORDER_MARKET.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[MapMarkerKind.TASK_ORDER_KEEP.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[MapMarkerKind.CAPTIVE_RECOVERY.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[MapMarkerKind.COLLECT.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[MapMarkerKind.DOWN.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[MapMarkerKind.INSPECTION.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[MapMarkerKind.PERIL.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[MapMarkerKind.PRIVATE_PROPERTY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[MapMarkerKind.REBALANCE_FOR_TRANSPORT.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final int m3672a(MapMarkerKind mapMarkerKind) {
        Intrinsics.checkNotNullParameter(mapMarkerKind, "<this>");
        switch (C30555a.$EnumSwitchMapping$0[mapMarkerKind.ordinal()]) {
            case 1:
                return C48193rg4.ic_marker_operator_charge;
            case 2:
                return C48193rg4.ic_marker_operator_damaged;
            case 3:
                return C48193rg4.ic_marker_operator_designated;
            case 4:
                return C48193rg4.ic_marker_operator_in_ride;
            case 5:
                return C48193rg4.ic_marker_operator_in_task;
            case 6:
                return C48193rg4.ic_marker_operator_missing;
            case 7:
                return C48193rg4.ic_marker_operator_move;
            case 8:
                return C48193rg4.ic_marker_operator_legal_preserve;
            case 9:
                return C48193rg4.ic_marker_operator_lipo;
            case 10:
                return C48193rg4.ic_map_marker_debrained;
            case 11:
                return C48193rg4.ic_marker_operator_peril_rebalance;
            case 12:
                return C48193rg4.ic_marker_operator_property;
            case 13:
                return C48193rg4.ic_marker_operator_radar;
            case 14:
                return C48193rg4.marker_operator_regular;
            case 15:
                return C48193rg4.ic_map_marker_submerged;
            case 16:
                return C48193rg4.ic_marker_operator_ulm;
            case 17:
                return C48193rg4.ic_pin_debrain;
            case 18:
                return C48193rg4.ic_truck_facility;
            case 19:
                return C48193rg4.ic_home_hold;
            case 20:
                return C48193rg4.ic_arrow_market;
            case 21:
                return C48193rg4.ic_gift;
            case 22:
                return C48193rg4.ic_marker_operator_captive_recovery;
            case 23:
                return C48193rg4.marker_operator_collect;
            case 24:
                return C48193rg4.marker_operator_down;
            case 25:
                return C48193rg4.ic_map_marker_inspection_white_bg;
            case 26:
                return C48193rg4.ic_map_marker_peril;
            case 27:
                return C48193rg4.ic_marker_operator_private_property;
            case 28:
                return C48193rg4.ic_marker_operator_rebalance_for_transport;
            default:
                return C48193rg4.marker_operator_regular;
        }
    }

    /* renamed from: b */
    public static final Drawable m3671b(MapMarkerKind mapMarkerKind, Context context) {
        int i;
        Intrinsics.checkNotNullParameter(mapMarkerKind, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        switch (C30555a.$EnumSwitchMapping$0[mapMarkerKind.ordinal()]) {
            case 1:
                i = C48193rg4.ic_badge_charge;
                break;
            case 2:
                i = C48193rg4.ic_badge_damaged;
                break;
            case 3:
                i = C48193rg4.ic_badge_designated;
                break;
            case 4:
                i = C48193rg4.ic_badge_in_ride;
                break;
            case 5:
                i = C48193rg4.ic_badge_in_task;
                break;
            case 6:
                i = C48193rg4.ic_badge_missing;
                break;
            case 7:
                i = C48193rg4.ic_badge_rebalance;
                break;
            case 8:
                i = C48193rg4.ic_badge_legal_preserve;
                break;
            case 9:
                i = C48193rg4.ic_badge_lipo;
                break;
            case 10:
                i = C48193rg4.ic_badge_offline;
                break;
            case 11:
                i = C48193rg4.ic_badge_area;
                break;
            case 12:
                i = C48193rg4.ic_badge_property_report;
                break;
            case 13:
                i = C48193rg4.ic_badge_radar;
                break;
            case 14:
                i = C48193rg4.ic_badge_available;
                break;
            case 15:
                i = C48193rg4.ic_badge_submerged;
                break;
            case 16:
                i = C48193rg4.ic_badge_ulm;
                break;
            case 17:
                i = C48193rg4.ic_pin_debrain;
                break;
            case 18:
                i = C48193rg4.ic_truck_facility;
                break;
            case 19:
                i = C48193rg4.ic_home_hold;
                break;
            case 20:
                i = C48193rg4.ic_arrow_market;
                break;
            case 21:
                i = C48193rg4.ic_gift;
                break;
            default:
                i = C48193rg4.ic_badge_available;
                break;
        }
        return NA0.m94299e(context, i);
    }
}
