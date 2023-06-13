package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.SkuOrderStatus;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\u0012\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/constant/SkuOrderStatus;", "", "b", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "co.bird.android.feature.transfer-order"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSkuOrderStatus+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkuOrderStatus+.kt\nco/bird/android/feature/transferorder/extensions/SkuOrderStatus_Kt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
/* renamed from: DC5 */
/* loaded from: classes3.dex */
public final class DC5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: DC5$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C1431a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SkuOrderStatus.values().length];
            try {
                iArr[SkuOrderStatus.IN_TRANSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SkuOrderStatus.CANCELED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SkuOrderStatus.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SkuOrderStatus.CHECKED_IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SkuOrderStatus.PROCESSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SkuOrderStatus.PROCESSED_WITH_OSD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SkuOrderStatus.READY_FOR_PROCESSING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SkuOrderStatus.READY_FOR_PICKUP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SkuOrderStatus.RECEIVED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SkuOrderStatus.RECEIVED_WITH_OSD.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SkuOrderStatus.RETURN_TO_SENDER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SkuOrderStatus.COMPLETED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[SkuOrderStatus.UNKNOWN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final String m110690a(SkuOrderStatus skuOrderStatus, Context context) {
        int i;
        Intrinsics.checkNotNullParameter(skuOrderStatus, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        switch (C1431a.$EnumSwitchMapping$0[skuOrderStatus.ordinal()]) {
            case 1:
                i = C45871nl4.transfer_order_status_in_transit;
                break;
            case 2:
                i = C45871nl4.canceled;
                break;
            case 3:
                i = C45871nl4.pending;
                break;
            case 4:
                i = C45871nl4.transfer_order_status_checked_in;
                break;
            case 5:
                i = C45871nl4.status_processed;
                break;
            case 6:
                i = C45871nl4.status_processed_with_osd;
                break;
            case 7:
                i = C45871nl4.status_ready_for_processing;
                break;
            case 8:
                i = C45871nl4.ready_for_pickup;
                break;
            case 9:
                i = C45871nl4.received;
                break;
            case 10:
                i = C45871nl4.received_with_osd;
                break;
            case 11:
                i = C45871nl4.return_to_sender;
                break;
            case 12:
                i = C45871nl4.completed;
                break;
            case 13:
                i = C45871nl4.model_name_unknown;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return context.getString(i);
    }

    /* renamed from: b */
    public static final int m110689b(SkuOrderStatus skuOrderStatus) {
        Intrinsics.checkNotNullParameter(skuOrderStatus, "<this>");
        switch (C1431a.$EnumSwitchMapping$0[skuOrderStatus.ordinal()]) {
            case 1:
                return C32364Df4.birdYellow;
            case 2:
            case 3:
                return C32364Df4.birdRed;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return C32364Df4.birdGreen;
            default:
                return C32364Df4.primaryText;
        }
    }
}
