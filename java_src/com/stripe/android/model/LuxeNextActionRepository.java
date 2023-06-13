package com.stripe.android.model;

import co.bird.android.model.LegacyRepairType;
import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.stripe.android.model.LuxeActionCreatorForStatus;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.StripeIntent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\b\u0007\u0018\u0000 !2\u00020\u0001:\u0003!\"#B\u0005¢\u0006\u0002\u0010\u0002J/\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u000fJ$\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\u0010\t\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00192\n\u0010\u001a\u001a\u00060\u0005j\u0002`\nH\u0001¢\u0006\u0002\b\u001bJ!\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u001fH\u0000¢\u0006\u0002\b R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m28432d2 = {"Lcom/stripe/android/model/LuxeNextActionRepository;", "", "()V", "codeToNextActionSpec", "", "", "Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;", "getAction", "Lcom/stripe/android/model/LuxeNextActionRepository$Result;", "lpmCode", "Lcom/stripe/android/model/PaymentMethodCode;", "status", "Lcom/stripe/android/model/StripeIntent$Status;", "stripeIntentJson", "Lorg/json/JSONObject;", "getAction$payments_core_release", "getActionCreator", "Lcom/stripe/android/model/LuxeActionCreatorForStatus;", "getPostAuthorizeIntentOutcome", "", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "getPostAuthorizeIntentOutcome$payments_core_release", "(Lcom/stripe/android/model/StripeIntent;)Ljava/lang/Integer;", "isPresent", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "isPresent$payments_core_release", "update", "", "additionalData", "", "update$payments_core_release", "Companion", "LuxeAction", com.paypal.android.sdk.onetouch.core.Result.f74995h, "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nLuxeNextActionRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LuxeNextActionRepository.kt\ncom/stripe/android/model/LuxeNextActionRepository\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
/* loaded from: classes7.dex */
public final class LuxeNextActionRepository {
    private final Map<String, LuxeAction> codeToNextActionSpec = new LinkedHashMap();
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final LuxeNextActionRepository Instance = new LuxeNextActionRepository();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/LuxeNextActionRepository$Companion;", "", "()V", "Instance", "Lcom/stripe/android/model/LuxeNextActionRepository;", "getInstance", "()Lcom/stripe/android/model/LuxeNextActionRepository;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LuxeNextActionRepository getInstance() {
            return LuxeNextActionRepository.Instance;
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;", "", "postConfirmStatusNextStatus", "Lcom/stripe/android/model/LuxeActionCreatorForStatus;", "postAuthorizeIntentStatus", "", "Lcom/stripe/android/model/StripeIntent$Status;", "", "(Lcom/stripe/android/model/LuxeActionCreatorForStatus;Ljava/util/Map;)V", "getPostAuthorizeIntentStatus", "()Ljava/util/Map;", "getPostConfirmStatusNextStatus", "()Lcom/stripe/android/model/LuxeActionCreatorForStatus;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class LuxeAction {
        private final Map<StripeIntent.Status, Integer> postAuthorizeIntentStatus;
        private final LuxeActionCreatorForStatus postConfirmStatusNextStatus;

        public LuxeAction(LuxeActionCreatorForStatus luxeActionCreatorForStatus, Map<StripeIntent.Status, Integer> postAuthorizeIntentStatus) {
            Intrinsics.checkNotNullParameter(postAuthorizeIntentStatus, "postAuthorizeIntentStatus");
            this.postConfirmStatusNextStatus = luxeActionCreatorForStatus;
            this.postAuthorizeIntentStatus = postAuthorizeIntentStatus;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LuxeAction copy$default(LuxeAction luxeAction, LuxeActionCreatorForStatus luxeActionCreatorForStatus, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                luxeActionCreatorForStatus = luxeAction.postConfirmStatusNextStatus;
            }
            if ((i & 2) != 0) {
                map = luxeAction.postAuthorizeIntentStatus;
            }
            return luxeAction.copy(luxeActionCreatorForStatus, map);
        }

        public final LuxeActionCreatorForStatus component1() {
            return this.postConfirmStatusNextStatus;
        }

        public final Map<StripeIntent.Status, Integer> component2() {
            return this.postAuthorizeIntentStatus;
        }

        public final LuxeAction copy(LuxeActionCreatorForStatus luxeActionCreatorForStatus, Map<StripeIntent.Status, Integer> postAuthorizeIntentStatus) {
            Intrinsics.checkNotNullParameter(postAuthorizeIntentStatus, "postAuthorizeIntentStatus");
            return new LuxeAction(luxeActionCreatorForStatus, postAuthorizeIntentStatus);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof LuxeAction) {
                LuxeAction luxeAction = (LuxeAction) obj;
                return Intrinsics.areEqual(this.postConfirmStatusNextStatus, luxeAction.postConfirmStatusNextStatus) && Intrinsics.areEqual(this.postAuthorizeIntentStatus, luxeAction.postAuthorizeIntentStatus);
            }
            return false;
        }

        public final Map<StripeIntent.Status, Integer> getPostAuthorizeIntentStatus() {
            return this.postAuthorizeIntentStatus;
        }

        public final LuxeActionCreatorForStatus getPostConfirmStatusNextStatus() {
            return this.postConfirmStatusNextStatus;
        }

        public int hashCode() {
            LuxeActionCreatorForStatus luxeActionCreatorForStatus = this.postConfirmStatusNextStatus;
            return ((luxeActionCreatorForStatus == null ? 0 : luxeActionCreatorForStatus.hashCode()) * 31) + this.postAuthorizeIntentStatus.hashCode();
        }

        public String toString() {
            LuxeActionCreatorForStatus luxeActionCreatorForStatus = this.postConfirmStatusNextStatus;
            Map<StripeIntent.Status, Integer> map = this.postAuthorizeIntentStatus;
            return "LuxeAction(postConfirmStatusNextStatus=" + luxeActionCreatorForStatus + ", postAuthorizeIntentStatus=" + map + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/model/LuxeNextActionRepository$Result;", "", "()V", JsonDocumentFields.ACTION, "NoAction", "NotSupported", "Lcom/stripe/android/model/LuxeNextActionRepository$Result$Action;", "Lcom/stripe/android/model/LuxeNextActionRepository$Result$NoAction;", "Lcom/stripe/android/model/LuxeNextActionRepository$Result$NotSupported;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static abstract class Result {

        @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/model/LuxeNextActionRepository$Result$Action;", "Lcom/stripe/android/model/LuxeNextActionRepository$Result;", "nextActionData", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "(Lcom/stripe/android/model/StripeIntent$NextActionData;)V", "getNextActionData", "()Lcom/stripe/android/model/StripeIntent$NextActionData;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Action extends Result {
            public static final int $stable = 0;
            private final StripeIntent.NextActionData nextActionData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Action(StripeIntent.NextActionData nextActionData) {
                super(null);
                Intrinsics.checkNotNullParameter(nextActionData, "nextActionData");
                this.nextActionData = nextActionData;
            }

            public static /* synthetic */ Action copy$default(Action action, StripeIntent.NextActionData nextActionData, int i, Object obj) {
                if ((i & 1) != 0) {
                    nextActionData = action.nextActionData;
                }
                return action.copy(nextActionData);
            }

            public final StripeIntent.NextActionData component1() {
                return this.nextActionData;
            }

            public final Action copy(StripeIntent.NextActionData nextActionData) {
                Intrinsics.checkNotNullParameter(nextActionData, "nextActionData");
                return new Action(nextActionData);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Action) && Intrinsics.areEqual(this.nextActionData, ((Action) obj).nextActionData);
            }

            public final StripeIntent.NextActionData getNextActionData() {
                return this.nextActionData;
            }

            public int hashCode() {
                return this.nextActionData.hashCode();
            }

            public String toString() {
                StripeIntent.NextActionData nextActionData = this.nextActionData;
                return "Action(nextActionData=" + nextActionData + ")";
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/model/LuxeNextActionRepository$Result$NoAction;", "Lcom/stripe/android/model/LuxeNextActionRepository$Result;", "()V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class NoAction extends Result {
            public static final int $stable = 0;
            public static final NoAction INSTANCE = new NoAction();

            private NoAction() {
                super(null);
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/model/LuxeNextActionRepository$Result$NotSupported;", "Lcom/stripe/android/model/LuxeNextActionRepository$Result;", "()V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class NotSupported extends Result {
            public static final int $stable = 0;
            public static final NotSupported INSTANCE = new NotSupported();

            private NotSupported() {
                super(null);
            }
        }

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Result() {
        }
    }

    private final LuxeActionCreatorForStatus getActionCreator(String str, StripeIntent.Status status) {
        LuxeAction luxeAction = this.codeToNextActionSpec.get(str);
        LuxeActionCreatorForStatus postConfirmStatusNextStatus = luxeAction != null ? luxeAction.getPostConfirmStatusNextStatus() : null;
        if ((postConfirmStatusNextStatus != null ? postConfirmStatusNextStatus.getStatus() : null) == status) {
            return postConfirmStatusNextStatus;
        }
        return null;
    }

    public final Result getAction$payments_core_release(String str, StripeIntent.Status status, JSONObject stripeIntentJson) {
        LuxeActionCreatorForStatus.ActionCreator actionCreator;
        Result create$payments_core_release;
        Intrinsics.checkNotNullParameter(stripeIntentJson, "stripeIntentJson");
        LuxeActionCreatorForStatus actionCreator2 = getActionCreator(str, status);
        if (actionCreator2 == null || (actionCreator = actionCreator2.getActionCreator()) == null || (create$payments_core_release = actionCreator.create$payments_core_release(stripeIntentJson)) == null) {
            return Result.NotSupported.INSTANCE;
        }
        return create$payments_core_release;
    }

    public final Integer getPostAuthorizeIntentOutcome$payments_core_release(StripeIntent stripeIntent) {
        String str;
        Map<StripeIntent.Status, Integer> postAuthorizeIntentStatus;
        Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
        if (stripeIntent.requiresAction() && stripeIntent.getNextActionData() == null) {
            return 2;
        }
        Map<String, LuxeAction> map = this.codeToNextActionSpec;
        PaymentMethod paymentMethod = stripeIntent.getPaymentMethod();
        if (paymentMethod != null) {
            str = paymentMethod.code;
        } else {
            str = null;
        }
        LuxeAction luxeAction = map.get(str);
        if (luxeAction == null || (postAuthorizeIntentStatus = luxeAction.getPostAuthorizeIntentStatus()) == null) {
            return null;
        }
        return postAuthorizeIntentStatus.get(stripeIntent.getStatus());
    }

    public final boolean isPresent$payments_core_release(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return this.codeToNextActionSpec.containsKey(code);
    }

    public final void update$payments_core_release(Map<String, LuxeAction> additionalData) {
        Intrinsics.checkNotNullParameter(additionalData, "additionalData");
        this.codeToNextActionSpec.putAll(additionalData);
    }
}
