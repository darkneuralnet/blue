package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import com.stripe.android.model.StripeIntent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.time.Duration;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002\"\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, m28432d2 = {"Lkotlin/time/Duration;", "duration", "LEu1;", "countdownFlow-LRDsOJo", "(J)LEu1;", "countdownFlow", "Lcom/stripe/android/model/StripeIntent$Status;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;", "toPollingState", "", PollingViewModelKt.KEY_CURRENT_POLLING_START_TIME, "Ljava/lang/String;", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class PollingViewModelKt {
    private static final String KEY_CURRENT_POLLING_START_TIME = "KEY_CURRENT_POLLING_START_TIME";

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StripeIntent.Status.values().length];
            try {
                iArr[StripeIntent.Status.RequiresAction.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StripeIntent.Status.Succeeded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StripeIntent.Status.Canceled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StripeIntent.Status.Processing.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StripeIntent.Status.RequiresConfirmation.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StripeIntent.Status.RequiresPaymentMethod.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StripeIntent.Status.RequiresCapture.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: countdownFlow-LRDsOJo */
    public static final InterfaceC32730Eu1<Duration> m116634countdownFlowLRDsOJo(long j) {
        return C36708Vu1.m79283E(new PollingViewModelKt$countdownFlow$1(j, null));
    }

    public static final PollingState toPollingState(StripeIntent.Status status) {
        switch (WhenMappings.$EnumSwitchMapping$0[status.ordinal()]) {
            case 1:
                return PollingState.Active;
            case 2:
                return PollingState.Success;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return PollingState.Failed;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
