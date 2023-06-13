package p000;

import co.bird.android.model.constant.AreaIconType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/model/constant/AreaIconType;", "", "b", "(Lco/bird/android/model/constant/AreaIconType;)Ljava/lang/Integer;", C17296a.f69688o, "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: an */
/* loaded from: classes3.dex */
public final class C10854an {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: an$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10855a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AreaIconType.values().length];
            try {
                iArr[AreaIconType.WARNING_RED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AreaIconType.WARNING_YELLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AreaIconType.DOWN_ARROW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AreaIconType.UP_ARROW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AreaIconType.LOCK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AreaIconType.RESTRICTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AreaIconType.DOLLAR_SIGN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AreaIconType.STATS_UP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AreaIconType.STATS_DOWN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AreaIconType.REBALANCE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AreaIconType.UNKNOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final Integer m70750a(AreaIconType areaIconType) {
        Intrinsics.checkNotNullParameter(areaIconType, "<this>");
        switch (C10855a.$EnumSwitchMapping$0[areaIconType.ordinal()]) {
            case 7:
                return Integer.valueOf(C48193rg4.ic_dollar_sign_twilight);
            case 8:
                return Integer.valueOf(C48193rg4.ic_stats_up_red);
            case 9:
                return Integer.valueOf(C48193rg4.ic_stats_down_twilight);
            case 10:
                return Integer.valueOf(C48193rg4.ic_drop_circle);
            default:
                return m70749b(areaIconType);
        }
    }

    /* renamed from: b */
    public static final Integer m70749b(AreaIconType areaIconType) {
        Intrinsics.checkNotNullParameter(areaIconType, "<this>");
        switch (C10855a.$EnumSwitchMapping$0[areaIconType.ordinal()]) {
            case 1:
                return Integer.valueOf(C48193rg4.ic_rider_bar_outside_service_area_triangle);
            case 2:
                return Integer.valueOf(C48193rg4.ic_rider_bar_inside_buffer_service_area);
            case 3:
                return Integer.valueOf(C48193rg4.ic_arrow_down_white);
            case 4:
                return Integer.valueOf(C48193rg4.ic_arrow_up);
            case 5:
                return Integer.valueOf(C48193rg4.ic_lock);
            case 6:
                return Integer.valueOf(C48193rg4.ic_close_circle);
            case 7:
                return Integer.valueOf(C48193rg4.ic_dollar_sign_white);
            case 8:
                return Integer.valueOf(C48193rg4.ic_stats_up_white);
            case 9:
                return Integer.valueOf(C48193rg4.ic_stats_down_white);
            case 10:
                return Integer.valueOf(C48193rg4.ic_arrow_down_white);
            case 11:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
