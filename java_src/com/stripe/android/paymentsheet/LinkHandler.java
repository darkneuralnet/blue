package com.stripe.android.paymentsheet;

import androidx.lifecycle.C11747p;
import ch.qos.logback.core.joran.action.Action;
import co.bird.android.model.LegacyRepairType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.LinkPaymentDetails;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.model.AccountStatus;
import com.stripe.android.link.p042ui.inline.UserInput;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.payments.paymentlauncher.PaymentResult;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.state.LinkState;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001WB\u0019\b\u0007\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\bU\u0010VJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0013\u0010\u0007\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\f\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002J\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\u0004J\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u001c\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0006J/\u0010#\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u000f\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0006\u0010%\u001a\u00020\u0004J\"\u0010%\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u000e\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0012R\u0017\u0010*\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00103\u001a\b\u0012\u0004\u0012\u000202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001d\u00106\u001a\b\u0012\u0004\u0012\u000202058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R*\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00060:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010=R\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00060E8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001c\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010=R\u001f\u0010K\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060E8\u0006¢\u0006\f\n\u0004\bK\u0010G\u001a\u0004\bK\u0010IR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00060:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010=R\u001d\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00060E8\u0006¢\u0006\f\n\u0004\bM\u0010G\u001a\u0004\bN\u0010IR\u001c\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010=R\u001f\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0E8\u0006¢\u0006\f\n\u0004\bP\u0010G\u001a\u0004\bQ\u0010IR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00060R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010T\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006X"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/LinkHandler;", "", "Lcom/stripe/android/paymentsheet/state/LinkState;", TransferTable.COLUMN_STATE, "", "setupLink", "", "requestLinkVerification", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;", "configuration", "setupLinkWithVerification", "(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "paymentMethodCreateParams", "shouldCompleteLinkInlineFlow", "completeLinkInlinePayment", "(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/model/PaymentMethodCreateParams;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/link/LinkActivityResult;", "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;", "convertToPaymentResult", "Lu5;", "activityResultCaller", "registerFromActivity", "unregisterFromActivity", "LZC0;", Action.SCOPE_ATTRIBUTE, "setupLinkLaunchingEagerly", "prepareLink", "success", "handleLinkVerificationResult", "Lcom/stripe/android/link/ui/inline/UserInput;", "userInput", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentSelection", "payWithLinkInline", "(Lcom/stripe/android/link/ui/inline/UserInput;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchLink", "launchedDirectly", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "onLinkActivityResult", "Lcom/stripe/android/link/LinkPaymentLauncher;", "linkLauncher", "Lcom/stripe/android/link/LinkPaymentLauncher;", "getLinkLauncher", "()Lcom/stripe/android/link/LinkPaymentLauncher;", "Landroidx/lifecycle/p;", "savedStateHandle", "Landroidx/lifecycle/p;", "LBX2;", "Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState;", "_processingState", "LBX2;", "LEu1;", "processingState", "LEu1;", "getProcessingState", "()LEu1;", "LGX2;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;", "linkInlineSelection", "LGX2;", "getLinkInlineSelection", "()LGX2;", "setLinkInlineSelection", "(LGX2;)V", "launchedLinkDirectly", "Z", "_showLinkVerificationDialog", "LtP5;", "showLinkVerificationDialog", "LtP5;", "getShowLinkVerificationDialog", "()LtP5;", "_isLinkEnabled", "isLinkEnabled", "_activeLinkSession", "activeLinkSession", "getActiveLinkSession", "_linkConfiguration", "linkConfiguration", "getLinkConfiguration", "LFh0;", "linkVerificationChannel", "LFh0;", "<init>", "(Lcom/stripe/android/link/LinkPaymentLauncher;Landroidx/lifecycle/p;)V", "ProcessingState", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class LinkHandler {
    private final GX2<Boolean> _activeLinkSession;
    private final GX2<Boolean> _isLinkEnabled;
    private final GX2<LinkPaymentLauncher.Configuration> _linkConfiguration;
    private final BX2<ProcessingState> _processingState;
    private final GX2<Boolean> _showLinkVerificationDialog;
    private final InterfaceC49220tP5<Boolean> activeLinkSession;
    private final InterfaceC49220tP5<Boolean> isLinkEnabled;
    private boolean launchedLinkDirectly;
    private final InterfaceC49220tP5<LinkPaymentLauncher.Configuration> linkConfiguration;
    private GX2<PaymentSelection.New.LinkInline> linkInlineSelection;
    private final LinkPaymentLauncher linkLauncher;
    private final InterfaceC32846Fh0<Boolean> linkVerificationChannel;
    private final InterfaceC32730Eu1<ProcessingState> processingState;
    private final C11747p savedStateHandle;
    private final InterfaceC49220tP5<Boolean> showLinkVerificationDialog;

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\nB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState;", "", "()V", "Cancelled", "Completed", "CompletedWithPaymentResult", "Error", "Launched", "PaymentDetailsCollected", "Ready", "Started", "Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Cancelled;", "Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Completed;", "Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$CompletedWithPaymentResult;", "Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Error;", "Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Launched;", "Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$PaymentDetailsCollected;", "Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Ready;", "Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Started;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static abstract class ProcessingState {
        public static final int $stable = 0;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Cancelled;", "Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState;", "()V", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Cancelled extends ProcessingState {
            public static final int $stable = 0;
            public static final Cancelled INSTANCE = new Cancelled();

            private Cancelled() {
                super(null);
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Completed;", "Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState;", "()V", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Completed extends ProcessingState {
            public static final int $stable = 0;
            public static final Completed INSTANCE = new Completed();

            private Completed() {
                super(null);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$CompletedWithPaymentResult;", "Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;", "(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V", "getResult", "()Lcom/stripe/android/payments/paymentlauncher/PaymentResult;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class CompletedWithPaymentResult extends ProcessingState {
            public static final int $stable = PaymentResult.$stable;
            private final PaymentResult result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CompletedWithPaymentResult(PaymentResult result) {
                super(null);
                Intrinsics.checkNotNullParameter(result, "result");
                this.result = result;
            }

            public final PaymentResult getResult() {
                return this.result;
            }
        }

        @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Error;", "Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Error extends ProcessingState {
            public static final int $stable = 0;
            private final String message;

            public Error(String str) {
                super(null);
                this.message = str;
            }

            public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = error.message;
                }
                return error.copy(str);
            }

            public final String component1() {
                return this.message;
            }

            public final Error copy(String str) {
                return new Error(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.areEqual(this.message, ((Error) obj).message);
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                String str = this.message;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                String str = this.message;
                return "Error(message=" + str + ")";
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Launched;", "Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState;", "()V", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Launched extends ProcessingState {
            public static final int $stable = 0;
            public static final Launched INSTANCE = new Launched();

            private Launched() {
                super(null);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$PaymentDetailsCollected;", "Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState;", "details", "Lcom/stripe/android/link/LinkPaymentDetails$New;", "(Lcom/stripe/android/link/LinkPaymentDetails$New;)V", "getDetails", "()Lcom/stripe/android/link/LinkPaymentDetails$New;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class PaymentDetailsCollected extends ProcessingState {
            public static final int $stable = LinkPaymentDetails.New.$stable;
            private final LinkPaymentDetails.New details;

            public PaymentDetailsCollected(LinkPaymentDetails.New r2) {
                super(null);
                this.details = r2;
            }

            public final LinkPaymentDetails.New getDetails() {
                return this.details;
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Ready;", "Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState;", "()V", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Ready extends ProcessingState {
            public static final int $stable = 0;
            public static final Ready INSTANCE = new Ready();

            private Ready() {
                super(null);
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Started;", "Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState;", "()V", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Started extends ProcessingState {
            public static final int $stable = 0;
            public static final Started INSTANCE = new Started();

            private Started() {
                super(null);
            }
        }

        public /* synthetic */ ProcessingState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ProcessingState() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LinkState.LoginState.values().length];
            try {
                iArr[LinkState.LoginState.LoggedIn.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LinkState.LoginState.NeedsVerification.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LinkState.LoginState.LoggedOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AccountStatus.values().length];
            try {
                iArr2[AccountStatus.Verified.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AccountStatus.VerificationStarted.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AccountStatus.NeedsVerification.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[AccountStatus.SignedOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[AccountStatus.Error.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public LinkHandler(LinkPaymentLauncher linkLauncher, C11747p savedStateHandle) {
        Intrinsics.checkNotNullParameter(linkLauncher, "linkLauncher");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.linkLauncher = linkLauncher;
        this.savedStateHandle = savedStateHandle;
        BX2<ProcessingState> m79031b = C36748Vy5.m79031b(1, 5, null, 4, null);
        this._processingState = m79031b;
        this.processingState = m79031b;
        this.linkInlineSelection = C50405vP5.m8742a(null);
        Boolean bool = Boolean.FALSE;
        GX2<Boolean> m8742a = C50405vP5.m8742a(bool);
        this._showLinkVerificationDialog = m8742a;
        this.showLinkVerificationDialog = m8742a;
        GX2<Boolean> m8742a2 = C50405vP5.m8742a(null);
        this._isLinkEnabled = m8742a2;
        this.isLinkEnabled = m8742a2;
        GX2<Boolean> m8742a3 = C50405vP5.m8742a(bool);
        this._activeLinkSession = m8742a3;
        this.activeLinkSession = m8742a3;
        GX2<LinkPaymentLauncher.Configuration> m8742a4 = C50405vP5.m8742a(null);
        this._linkConfiguration = m8742a4;
        this.linkConfiguration = m8742a4;
        this.linkVerificationChannel = C35186Ph0.m89918b(1, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object completeLinkInlinePayment(LinkPaymentLauncher.Configuration configuration, PaymentMethodCreateParams paymentMethodCreateParams, boolean z, Continuation<? super Unit> continuation) {
        LinkHandler$completeLinkInlinePayment$1 linkHandler$completeLinkInlinePayment$1;
        Object coroutine_suspended;
        int i;
        Object m116483attachNewCardToAccount0E7RQCE;
        BX2<ProcessingState> bx2;
        ProcessingState.PaymentDetailsCollected paymentDetailsCollected;
        if (continuation instanceof LinkHandler$completeLinkInlinePayment$1) {
            linkHandler$completeLinkInlinePayment$1 = (LinkHandler$completeLinkInlinePayment$1) continuation;
            int i2 = linkHandler$completeLinkInlinePayment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkHandler$completeLinkInlinePayment$1.label = i2 - Integer.MIN_VALUE;
                Object obj = linkHandler$completeLinkInlinePayment$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = linkHandler$completeLinkInlinePayment$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bx2 = (BX2) linkHandler$completeLinkInlinePayment$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    m116483attachNewCardToAccount0E7RQCE = ((Result) obj).m116792unboximpl();
                } else {
                    ResultKt.throwOnFailure(obj);
                    if (z) {
                        launchLink(configuration, false, paymentMethodCreateParams);
                        return Unit.INSTANCE;
                    }
                    BX2<ProcessingState> bx22 = this._processingState;
                    LinkPaymentLauncher linkPaymentLauncher = this.linkLauncher;
                    linkHandler$completeLinkInlinePayment$1.L$0 = bx22;
                    linkHandler$completeLinkInlinePayment$1.label = 1;
                    m116483attachNewCardToAccount0E7RQCE = linkPaymentLauncher.m116483attachNewCardToAccount0E7RQCE(configuration, paymentMethodCreateParams, linkHandler$completeLinkInlinePayment$1);
                    if (m116483attachNewCardToAccount0E7RQCE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    bx2 = bx22;
                }
                if (Result.m116789isFailureimpl(m116483attachNewCardToAccount0E7RQCE)) {
                    m116483attachNewCardToAccount0E7RQCE = null;
                }
                paymentDetailsCollected = new ProcessingState.PaymentDetailsCollected((LinkPaymentDetails.New) m116483attachNewCardToAccount0E7RQCE);
                linkHandler$completeLinkInlinePayment$1.L$0 = null;
                linkHandler$completeLinkInlinePayment$1.label = 2;
                if (bx2.emit(paymentDetailsCollected, linkHandler$completeLinkInlinePayment$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        linkHandler$completeLinkInlinePayment$1 = new LinkHandler$completeLinkInlinePayment$1(this, continuation);
        Object obj2 = linkHandler$completeLinkInlinePayment$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = linkHandler$completeLinkInlinePayment$1.label;
        if (i == 0) {
        }
        if (Result.m116789isFailureimpl(m116483attachNewCardToAccount0E7RQCE)) {
        }
        paymentDetailsCollected = new ProcessingState.PaymentDetailsCollected((LinkPaymentDetails.New) m116483attachNewCardToAccount0E7RQCE);
        linkHandler$completeLinkInlinePayment$1.L$0 = null;
        linkHandler$completeLinkInlinePayment$1.label = 2;
        if (bx2.emit(paymentDetailsCollected, linkHandler$completeLinkInlinePayment$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    private final PaymentResult convertToPaymentResult(LinkActivityResult linkActivityResult) {
        if (linkActivityResult instanceof LinkActivityResult.Completed) {
            return PaymentResult.Completed.INSTANCE;
        }
        if (linkActivityResult instanceof LinkActivityResult.Canceled) {
            return PaymentResult.Canceled.INSTANCE;
        }
        if (linkActivityResult instanceof LinkActivityResult.Failed) {
            return new PaymentResult.Failed(((LinkActivityResult.Failed) linkActivityResult).getError());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ void launchLink$default(LinkHandler linkHandler, LinkPaymentLauncher.Configuration configuration, boolean z, PaymentMethodCreateParams paymentMethodCreateParams, int i, Object obj) {
        if ((i & 4) != 0) {
            paymentMethodCreateParams = null;
        }
        linkHandler.launchLink(configuration, z, paymentMethodCreateParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object requestLinkVerification(Continuation<? super Boolean> continuation) {
        this._showLinkVerificationDialog.setValue(Boxing.boxBoolean(true));
        return this.linkVerificationChannel.mo28256G(continuation);
    }

    private final void setupLink(LinkState linkState) {
        boolean z;
        LinkState.LoginState loginState;
        GX2<Boolean> gx2 = this._isLinkEnabled;
        boolean z2 = true;
        if (linkState != null) {
            z = true;
        } else {
            z = false;
        }
        gx2.setValue(Boolean.valueOf(z));
        GX2<Boolean> gx22 = this._activeLinkSession;
        if (linkState != null) {
            loginState = linkState.getLoginState();
        } else {
            loginState = null;
        }
        if (loginState != LinkState.LoginState.LoggedIn) {
            z2 = false;
        }
        gx22.setValue(Boolean.valueOf(z2));
        if (linkState == null) {
            return;
        }
        this._linkConfiguration.setValue(linkState.getConfiguration());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setupLinkWithVerification(LinkPaymentLauncher.Configuration configuration, Continuation<? super Unit> continuation) {
        LinkHandler$setupLinkWithVerification$1 linkHandler$setupLinkWithVerification$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        LinkHandler linkHandler;
        LinkPaymentLauncher.Configuration configuration2;
        if (continuation instanceof LinkHandler$setupLinkWithVerification$1) {
            linkHandler$setupLinkWithVerification$1 = (LinkHandler$setupLinkWithVerification$1) continuation;
            int i2 = linkHandler$setupLinkWithVerification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkHandler$setupLinkWithVerification$1.label = i2 - Integer.MIN_VALUE;
                obj = linkHandler$setupLinkWithVerification$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = linkHandler$setupLinkWithVerification$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        configuration2 = (LinkPaymentLauncher.Configuration) linkHandler$setupLinkWithVerification$1.L$1;
                        linkHandler = (LinkHandler) linkHandler$setupLinkWithVerification$1.L$0;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    linkHandler$setupLinkWithVerification$1.L$0 = this;
                    linkHandler$setupLinkWithVerification$1.L$1 = configuration;
                    linkHandler$setupLinkWithVerification$1.label = 1;
                    obj = requestLinkVerification(linkHandler$setupLinkWithVerification$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    linkHandler = this;
                    configuration2 = configuration;
                }
                if (((Boolean) obj).booleanValue()) {
                    launchLink$default(linkHandler, configuration2, true, null, 4, null);
                }
                return Unit.INSTANCE;
            }
        }
        linkHandler$setupLinkWithVerification$1 = new LinkHandler$setupLinkWithVerification$1(this, continuation);
        obj = linkHandler$setupLinkWithVerification$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = linkHandler$setupLinkWithVerification$1.label;
        if (i == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return Unit.INSTANCE;
    }

    public final InterfaceC49220tP5<Boolean> getActiveLinkSession() {
        return this.activeLinkSession;
    }

    public final InterfaceC49220tP5<LinkPaymentLauncher.Configuration> getLinkConfiguration() {
        return this.linkConfiguration;
    }

    public final GX2<PaymentSelection.New.LinkInline> getLinkInlineSelection() {
        return this.linkInlineSelection;
    }

    public final LinkPaymentLauncher getLinkLauncher() {
        return this.linkLauncher;
    }

    public final InterfaceC32730Eu1<ProcessingState> getProcessingState() {
        return this.processingState;
    }

    public final InterfaceC49220tP5<Boolean> getShowLinkVerificationDialog() {
        return this.showLinkVerificationDialog;
    }

    public final void handleLinkVerificationResult(boolean z) {
        this._showLinkVerificationDialog.setValue(Boolean.FALSE);
        this._activeLinkSession.setValue(Boolean.valueOf(z));
        this.linkVerificationChannel.mo2349h(Boolean.valueOf(z));
    }

    public final InterfaceC49220tP5<Boolean> isLinkEnabled() {
        return this.isLinkEnabled;
    }

    public final void launchLink() {
        LinkPaymentLauncher.Configuration value = this.linkConfiguration.getValue();
        if (value == null) {
            return;
        }
        launchLink$default(this, value, false, null, 4, null);
    }

    public final void onLinkActivityResult(LinkActivityResult result) {
        boolean z;
        Intrinsics.checkNotNullParameter(result, "result");
        boolean z2 = result instanceof LinkActivityResult.Completed;
        if (this.launchedLinkDirectly && (result instanceof LinkActivityResult.Canceled) && ((LinkActivityResult.Canceled) result).getReason() == LinkActivityResult.Canceled.Reason.BackPressed) {
            z = true;
        } else {
            z = false;
        }
        if (z2) {
            this._processingState.mo10357b(ProcessingState.Completed.INSTANCE);
        } else if (z) {
            this._processingState.mo10357b(ProcessingState.Cancelled.INSTANCE);
        } else {
            this._processingState.mo10357b(new ProcessingState.CompletedWithPaymentResult(convertToPaymentResult(result)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object payWithLinkInline(UserInput userInput, PaymentSelection paymentSelection, boolean z, Continuation<? super Unit> continuation) {
        LinkHandler$payWithLinkInline$1 linkHandler$payWithLinkInline$1;
        Object coroutine_suspended;
        PaymentSelection.New.Card card;
        PaymentMethodCreateParams paymentMethodCreateParams;
        UserInput userInput2;
        boolean z2;
        PaymentSelection paymentSelection2;
        LinkHandler linkHandler;
        LinkPaymentLauncher.Configuration value;
        LinkHandler linkHandler2;
        boolean z3;
        PaymentMethodCreateParams paymentMethodCreateParams2;
        LinkPaymentLauncher.Configuration configuration;
        int i;
        UserInput userInput3;
        PaymentMethodCreateParams paymentMethodCreateParams3;
        LinkHandler linkHandler3;
        Unit unit;
        Object obj;
        UserInput userInput4;
        boolean z4;
        LinkHandler linkHandler4;
        Object obj2;
        Throwable m116786exceptionOrNullimpl;
        BX2<ProcessingState> bx2;
        ProcessingState.Ready ready;
        if (continuation instanceof LinkHandler$payWithLinkInline$1) {
            linkHandler$payWithLinkInline$1 = (LinkHandler$payWithLinkInline$1) continuation;
            int i2 = linkHandler$payWithLinkInline$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkHandler$payWithLinkInline$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = linkHandler$payWithLinkInline$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                boolean z5 = false;
                switch (linkHandler$payWithLinkInline$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj3);
                        if (paymentSelection instanceof PaymentSelection.New.Card) {
                            card = (PaymentSelection.New.Card) paymentSelection;
                        } else {
                            card = null;
                        }
                        if (card != null && (paymentMethodCreateParams = card.getPaymentMethodCreateParams()) != null) {
                            this.savedStateHandle.m66940m(BaseSheetViewModel.SAVE_PROCESSING, Boxing.boxBoolean(true));
                            BX2<ProcessingState> bx22 = this._processingState;
                            ProcessingState.Started started = ProcessingState.Started.INSTANCE;
                            linkHandler$payWithLinkInline$1.L$0 = this;
                            userInput2 = userInput;
                            linkHandler$payWithLinkInline$1.L$1 = userInput2;
                            linkHandler$payWithLinkInline$1.L$2 = paymentSelection;
                            linkHandler$payWithLinkInline$1.L$3 = paymentMethodCreateParams;
                            z2 = z;
                            linkHandler$payWithLinkInline$1.Z$0 = z2;
                            linkHandler$payWithLinkInline$1.label = 1;
                            if (bx22.emit(started, linkHandler$payWithLinkInline$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            paymentSelection2 = paymentSelection;
                            linkHandler = this;
                            value = linkHandler.linkConfiguration.getValue();
                            if (value == null) {
                                LinkPaymentLauncher.Configuration configuration2 = value;
                                InterfaceC32730Eu1<AccountStatus> accountStatusFlow = linkHandler.linkLauncher.getAccountStatusFlow(configuration2);
                                linkHandler$payWithLinkInline$1.L$0 = linkHandler;
                                linkHandler$payWithLinkInline$1.L$1 = userInput2;
                                linkHandler$payWithLinkInline$1.L$2 = paymentSelection2;
                                linkHandler$payWithLinkInline$1.L$3 = paymentMethodCreateParams;
                                linkHandler$payWithLinkInline$1.L$4 = configuration2;
                                linkHandler$payWithLinkInline$1.Z$0 = z2;
                                linkHandler$payWithLinkInline$1.label = 2;
                                Object m79248w = C36708Vu1.m79248w(accountStatusFlow, linkHandler$payWithLinkInline$1);
                                if (m79248w == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                linkHandler2 = linkHandler;
                                z3 = z2;
                                paymentMethodCreateParams2 = paymentMethodCreateParams;
                                configuration = configuration2;
                                obj3 = m79248w;
                                i = WhenMappings.$EnumSwitchMapping$1[((AccountStatus) obj3).ordinal()];
                                if (i == 1) {
                                    if (i != 2 && i != 3) {
                                        if (i == 4 || i == 5) {
                                            linkHandler2._activeLinkSession.setValue(Boxing.boxBoolean(false));
                                            if (userInput2 != null) {
                                                LinkPaymentLauncher linkPaymentLauncher = linkHandler2.linkLauncher;
                                                linkHandler$payWithLinkInline$1.L$0 = linkHandler2;
                                                linkHandler$payWithLinkInline$1.L$1 = userInput2;
                                                linkHandler$payWithLinkInline$1.L$2 = paymentSelection2;
                                                linkHandler$payWithLinkInline$1.L$3 = null;
                                                linkHandler$payWithLinkInline$1.L$4 = null;
                                                linkHandler$payWithLinkInline$1.Z$0 = z3;
                                                linkHandler$payWithLinkInline$1.label = 7;
                                                Object m116484signInWithUserInput0E7RQCE = linkPaymentLauncher.m116484signInWithUserInput0E7RQCE(configuration, userInput2, linkHandler$payWithLinkInline$1);
                                                if (m116484signInWithUserInput0E7RQCE == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                obj = m116484signInWithUserInput0E7RQCE;
                                                userInput4 = userInput2;
                                                z4 = z3;
                                                linkHandler4 = linkHandler2;
                                                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(obj);
                                                if (m116786exceptionOrNullimpl != null) {
                                                    ((Boolean) obj).booleanValue();
                                                    linkHandler$payWithLinkInline$1.L$0 = linkHandler4;
                                                    linkHandler$payWithLinkInline$1.L$1 = null;
                                                    linkHandler$payWithLinkInline$1.L$2 = null;
                                                    linkHandler$payWithLinkInline$1.label = 8;
                                                    if (linkHandler4.payWithLinkInline(userInput4, paymentSelection2, z4, linkHandler$payWithLinkInline$1) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    linkHandler2 = linkHandler4;
                                                    unit = Unit.INSTANCE;
                                                    if (unit == null) {
                                                        linkHandler2.savedStateHandle.m66940m(BaseSheetViewModel.SAVE_PROCESSING, Boxing.boxBoolean(false));
                                                        BX2<ProcessingState> bx23 = linkHandler2._processingState;
                                                        ProcessingState.Ready ready2 = ProcessingState.Ready.INSTANCE;
                                                        linkHandler$payWithLinkInline$1.L$0 = null;
                                                        linkHandler$payWithLinkInline$1.L$1 = null;
                                                        linkHandler$payWithLinkInline$1.L$2 = null;
                                                        linkHandler$payWithLinkInline$1.L$3 = null;
                                                        linkHandler$payWithLinkInline$1.L$4 = null;
                                                        linkHandler$payWithLinkInline$1.label = 11;
                                                        if (bx23.emit(ready2, linkHandler$payWithLinkInline$1) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                    }
                                                } else {
                                                    BX2<ProcessingState> bx24 = linkHandler4._processingState;
                                                    ProcessingState.Error error = new ProcessingState.Error(m116786exceptionOrNullimpl.getLocalizedMessage());
                                                    linkHandler$payWithLinkInline$1.L$0 = linkHandler4;
                                                    linkHandler$payWithLinkInline$1.L$1 = null;
                                                    linkHandler$payWithLinkInline$1.L$2 = null;
                                                    linkHandler$payWithLinkInline$1.label = 9;
                                                    if (bx24.emit(error, linkHandler$payWithLinkInline$1) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    linkHandler4.savedStateHandle.m66940m(BaseSheetViewModel.SAVE_PROCESSING, Boxing.boxBoolean(false));
                                                    bx2 = linkHandler4._processingState;
                                                    ready = ProcessingState.Ready.INSTANCE;
                                                    linkHandler$payWithLinkInline$1.L$0 = linkHandler4;
                                                    linkHandler$payWithLinkInline$1.label = 10;
                                                    if (bx2.emit(ready, linkHandler$payWithLinkInline$1) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    linkHandler2 = linkHandler4;
                                                    unit = Unit.INSTANCE;
                                                    if (unit == null) {
                                                    }
                                                }
                                            } else {
                                                unit = null;
                                                if (unit == null) {
                                                }
                                            }
                                        }
                                    } else {
                                        linkHandler$payWithLinkInline$1.L$0 = linkHandler2;
                                        linkHandler$payWithLinkInline$1.L$1 = userInput2;
                                        linkHandler$payWithLinkInline$1.L$2 = paymentMethodCreateParams2;
                                        linkHandler$payWithLinkInline$1.L$3 = configuration;
                                        linkHandler$payWithLinkInline$1.L$4 = null;
                                        linkHandler$payWithLinkInline$1.Z$0 = z3;
                                        linkHandler$payWithLinkInline$1.label = 4;
                                        obj3 = linkHandler2.requestLinkVerification(linkHandler$payWithLinkInline$1);
                                        if (obj3 == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        userInput3 = userInput2;
                                        paymentMethodCreateParams3 = paymentMethodCreateParams2;
                                        linkHandler3 = linkHandler2;
                                        if (!((Boolean) obj3).booleanValue()) {
                                            if ((userInput3 instanceof UserInput.SignIn) && z3) {
                                                obj2 = null;
                                                z5 = true;
                                            } else {
                                                obj2 = null;
                                            }
                                            linkHandler$payWithLinkInline$1.L$0 = obj2;
                                            linkHandler$payWithLinkInline$1.L$1 = obj2;
                                            linkHandler$payWithLinkInline$1.L$2 = obj2;
                                            linkHandler$payWithLinkInline$1.L$3 = obj2;
                                            linkHandler$payWithLinkInline$1.label = 5;
                                            if (linkHandler3.completeLinkInlinePayment(configuration, paymentMethodCreateParams3, z5, linkHandler$payWithLinkInline$1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else {
                                            linkHandler3.savedStateHandle.m66940m(BaseSheetViewModel.SAVE_PROCESSING, Boxing.boxBoolean(false));
                                            BX2<ProcessingState> bx25 = linkHandler3._processingState;
                                            ProcessingState.Ready ready3 = ProcessingState.Ready.INSTANCE;
                                            linkHandler$payWithLinkInline$1.L$0 = null;
                                            linkHandler$payWithLinkInline$1.L$1 = null;
                                            linkHandler$payWithLinkInline$1.L$2 = null;
                                            linkHandler$payWithLinkInline$1.L$3 = null;
                                            linkHandler$payWithLinkInline$1.label = 6;
                                            if (bx25.emit(ready3, linkHandler$payWithLinkInline$1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    }
                                } else {
                                    linkHandler2._activeLinkSession.setValue(Boxing.boxBoolean(true));
                                    if ((userInput2 instanceof UserInput.SignIn) && z3) {
                                        z5 = true;
                                    }
                                    linkHandler$payWithLinkInline$1.L$0 = null;
                                    linkHandler$payWithLinkInline$1.L$1 = null;
                                    linkHandler$payWithLinkInline$1.L$2 = null;
                                    linkHandler$payWithLinkInline$1.L$3 = null;
                                    linkHandler$payWithLinkInline$1.L$4 = null;
                                    linkHandler$payWithLinkInline$1.label = 3;
                                    if (linkHandler2.completeLinkInlinePayment(configuration, paymentMethodCreateParams2, z5, linkHandler$payWithLinkInline$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        boolean z6 = linkHandler$payWithLinkInline$1.Z$0;
                        paymentMethodCreateParams = (PaymentMethodCreateParams) linkHandler$payWithLinkInline$1.L$3;
                        paymentSelection2 = (PaymentSelection) linkHandler$payWithLinkInline$1.L$2;
                        userInput2 = (UserInput) linkHandler$payWithLinkInline$1.L$1;
                        LinkHandler linkHandler5 = (LinkHandler) linkHandler$payWithLinkInline$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                        z2 = z6;
                        linkHandler = linkHandler5;
                        value = linkHandler.linkConfiguration.getValue();
                        if (value == null) {
                        }
                        break;
                    case 2:
                        z3 = linkHandler$payWithLinkInline$1.Z$0;
                        configuration = (LinkPaymentLauncher.Configuration) linkHandler$payWithLinkInline$1.L$4;
                        UserInput userInput5 = (UserInput) linkHandler$payWithLinkInline$1.L$1;
                        linkHandler2 = (LinkHandler) linkHandler$payWithLinkInline$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                        paymentMethodCreateParams2 = (PaymentMethodCreateParams) linkHandler$payWithLinkInline$1.L$3;
                        paymentSelection2 = (PaymentSelection) linkHandler$payWithLinkInline$1.L$2;
                        userInput2 = userInput5;
                        i = WhenMappings.$EnumSwitchMapping$1[((AccountStatus) obj3).ordinal()];
                        if (i == 1) {
                        }
                        return Unit.INSTANCE;
                    case 3:
                    case 5:
                    case 6:
                    case 11:
                        ResultKt.throwOnFailure(obj3);
                        return Unit.INSTANCE;
                    case 4:
                        z3 = linkHandler$payWithLinkInline$1.Z$0;
                        configuration = (LinkPaymentLauncher.Configuration) linkHandler$payWithLinkInline$1.L$3;
                        paymentMethodCreateParams3 = (PaymentMethodCreateParams) linkHandler$payWithLinkInline$1.L$2;
                        userInput3 = (UserInput) linkHandler$payWithLinkInline$1.L$1;
                        linkHandler3 = (LinkHandler) linkHandler$payWithLinkInline$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                        if (!((Boolean) obj3).booleanValue()) {
                        }
                        return Unit.INSTANCE;
                    case 7:
                        boolean z7 = linkHandler$payWithLinkInline$1.Z$0;
                        userInput4 = (UserInput) linkHandler$payWithLinkInline$1.L$1;
                        ResultKt.throwOnFailure(obj3);
                        paymentSelection2 = (PaymentSelection) linkHandler$payWithLinkInline$1.L$2;
                        obj = ((Result) obj3).m116792unboximpl();
                        z4 = z7;
                        linkHandler4 = (LinkHandler) linkHandler$payWithLinkInline$1.L$0;
                        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(obj);
                        if (m116786exceptionOrNullimpl != null) {
                        }
                        break;
                    case 8:
                    case 10:
                        linkHandler4 = (LinkHandler) linkHandler$payWithLinkInline$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                        linkHandler2 = linkHandler4;
                        unit = Unit.INSTANCE;
                        if (unit == null) {
                        }
                        return Unit.INSTANCE;
                    case 9:
                        linkHandler4 = (LinkHandler) linkHandler$payWithLinkInline$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                        linkHandler4.savedStateHandle.m66940m(BaseSheetViewModel.SAVE_PROCESSING, Boxing.boxBoolean(false));
                        bx2 = linkHandler4._processingState;
                        ready = ProcessingState.Ready.INSTANCE;
                        linkHandler$payWithLinkInline$1.L$0 = linkHandler4;
                        linkHandler$payWithLinkInline$1.label = 10;
                        if (bx2.emit(ready, linkHandler$payWithLinkInline$1) == coroutine_suspended) {
                        }
                        linkHandler2 = linkHandler4;
                        unit = Unit.INSTANCE;
                        if (unit == null) {
                        }
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        linkHandler$payWithLinkInline$1 = new LinkHandler$payWithLinkInline$1(this, continuation);
        Object obj32 = linkHandler$payWithLinkInline$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean z52 = false;
        switch (linkHandler$payWithLinkInline$1.label) {
        }
    }

    public final void prepareLink(LinkState linkState) {
        setupLink(linkState);
        boolean z = false;
        if (linkState != null && linkState.isReadyForUse()) {
            z = true;
        }
        if (z) {
            this.savedStateHandle.m66940m(BaseSheetViewModel.SAVE_SELECTION, PaymentSelection.Link.INSTANCE);
        }
    }

    public final void registerFromActivity(InterfaceC29050u5 activityResultCaller) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        this.linkLauncher.register(activityResultCaller, new LinkHandler$registerFromActivity$1(this));
    }

    public final void setLinkInlineSelection(GX2<PaymentSelection.New.LinkInline> gx2) {
        Intrinsics.checkNotNullParameter(gx2, "<set-?>");
        this.linkInlineSelection = gx2;
    }

    public final void setupLinkLaunchingEagerly(ZC0 scope, LinkState linkState) {
        LinkState.LoginState loginState;
        int i;
        Intrinsics.checkNotNullParameter(scope, "scope");
        setupLink(linkState);
        if (linkState != null) {
            loginState = linkState.getLoginState();
        } else {
            loginState = null;
        }
        if (loginState == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[loginState.ordinal()];
        }
        if (i != 1) {
            if (i == 2) {
                Z30.m73800d(scope, null, null, new LinkHandler$setupLinkLaunchingEagerly$1(this, linkState, null), 3, null);
                return;
            }
            return;
        }
        launchLink$default(this, linkState.getConfiguration(), true, null, 4, null);
    }

    public final void unregisterFromActivity() {
        this.linkLauncher.unregister();
    }

    public final void launchLink(LinkPaymentLauncher.Configuration configuration, boolean z, PaymentMethodCreateParams paymentMethodCreateParams) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.launchedLinkDirectly = z;
        this.linkLauncher.present(configuration, paymentMethodCreateParams);
        this._processingState.mo10357b(ProcessingState.Launched.INSTANCE);
    }
}
