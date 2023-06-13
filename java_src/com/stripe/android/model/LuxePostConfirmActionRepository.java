package com.stripe.android.model;

import co.bird.android.model.LegacyRepairType;
import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.StripeIntent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\b\u0007\u0018\u0000  2\u00020\u0001:\u0003 !\"B\u0005¢\u0006\u0002\u0010\u0002J/\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u000fJ$\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\u0010\t\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00192\n\u0010\u001a\u001a\u00060\u0005j\u0002`\nH\u0001¢\u0006\u0002\b\u001bJ\u001c\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u001fH\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m28432d2 = {"Lcom/stripe/android/model/LuxePostConfirmActionRepository;", "", "()V", "lpmToConfirmActionSpec", "", "", "Lcom/stripe/android/model/LuxePostConfirmActionRepository$LuxeAction;", "getAction", "Lcom/stripe/android/model/LuxePostConfirmActionRepository$Result;", "lpmCode", "Lcom/stripe/android/model/PaymentMethodCode;", "status", "Lcom/stripe/android/model/StripeIntent$Status;", "stripeIntentJson", "Lorg/json/JSONObject;", "getAction$payments_core_release", "getActionCreator", "Lcom/stripe/android/model/LuxePostConfirmActionCreator;", "getPostAuthorizeIntentOutcome", "", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "getPostAuthorizeIntentOutcome$payments_core_release", "(Lcom/stripe/android/model/StripeIntent;)Ljava/lang/Integer;", "isPresent", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "isPresent$payments_core_release", "update", "", "additionalData", "", "Companion", "LuxeAction", com.paypal.android.sdk.onetouch.core.Result.f74995h, "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nLuxePostConfirmActionRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LuxePostConfirmActionRepository.kt\ncom/stripe/android/model/LuxePostConfirmActionRepository\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,78:1\n515#2:79\n500#2,6:80\n125#3:86\n152#3,3:87\n*S KotlinDebug\n*F\n+ 1 LuxePostConfirmActionRepository.kt\ncom/stripe/android/model/LuxePostConfirmActionRepository\n*L\n54#1:79\n54#1:80,6\n55#1:86\n55#1:87,3\n*E\n"})
/* loaded from: classes7.dex */
public final class LuxePostConfirmActionRepository {
    private final Map<String, LuxeAction> lpmToConfirmActionSpec = new LinkedHashMap();
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final LuxePostConfirmActionRepository Instance = new LuxePostConfirmActionRepository();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/LuxePostConfirmActionRepository$Companion;", "", "()V", "Instance", "Lcom/stripe/android/model/LuxePostConfirmActionRepository;", "getInstance", "()Lcom/stripe/android/model/LuxePostConfirmActionRepository;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LuxePostConfirmActionRepository getInstance() {
            return LuxePostConfirmActionRepository.Instance;
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0002\u0010\bJ\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0003J5\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lcom/stripe/android/model/LuxePostConfirmActionRepository$LuxeAction;", "", "postConfirmStatusToAction", "", "Lcom/stripe/android/model/StripeIntent$Status;", "Lcom/stripe/android/model/LuxePostConfirmActionCreator;", "postConfirmActionIntentStatus", "", "(Ljava/util/Map;Ljava/util/Map;)V", "getPostConfirmActionIntentStatus", "()Ljava/util/Map;", "getPostConfirmStatusToAction", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class LuxeAction {
        public static final int $stable = 8;
        private final Map<StripeIntent.Status, Integer> postConfirmActionIntentStatus;
        private final Map<StripeIntent.Status, LuxePostConfirmActionCreator> postConfirmStatusToAction;

        /* JADX WARN: Multi-variable type inference failed */
        public LuxeAction(Map<StripeIntent.Status, ? extends LuxePostConfirmActionCreator> postConfirmStatusToAction, Map<StripeIntent.Status, Integer> postConfirmActionIntentStatus) {
            Intrinsics.checkNotNullParameter(postConfirmStatusToAction, "postConfirmStatusToAction");
            Intrinsics.checkNotNullParameter(postConfirmActionIntentStatus, "postConfirmActionIntentStatus");
            this.postConfirmStatusToAction = postConfirmStatusToAction;
            this.postConfirmActionIntentStatus = postConfirmActionIntentStatus;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LuxeAction copy$default(LuxeAction luxeAction, Map map, Map map2, int i, Object obj) {
            if ((i & 1) != 0) {
                map = luxeAction.postConfirmStatusToAction;
            }
            if ((i & 2) != 0) {
                map2 = luxeAction.postConfirmActionIntentStatus;
            }
            return luxeAction.copy(map, map2);
        }

        public final Map<StripeIntent.Status, LuxePostConfirmActionCreator> component1() {
            return this.postConfirmStatusToAction;
        }

        public final Map<StripeIntent.Status, Integer> component2() {
            return this.postConfirmActionIntentStatus;
        }

        public final LuxeAction copy(Map<StripeIntent.Status, ? extends LuxePostConfirmActionCreator> postConfirmStatusToAction, Map<StripeIntent.Status, Integer> postConfirmActionIntentStatus) {
            Intrinsics.checkNotNullParameter(postConfirmStatusToAction, "postConfirmStatusToAction");
            Intrinsics.checkNotNullParameter(postConfirmActionIntentStatus, "postConfirmActionIntentStatus");
            return new LuxeAction(postConfirmStatusToAction, postConfirmActionIntentStatus);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof LuxeAction) {
                LuxeAction luxeAction = (LuxeAction) obj;
                return Intrinsics.areEqual(this.postConfirmStatusToAction, luxeAction.postConfirmStatusToAction) && Intrinsics.areEqual(this.postConfirmActionIntentStatus, luxeAction.postConfirmActionIntentStatus);
            }
            return false;
        }

        public final Map<StripeIntent.Status, Integer> getPostConfirmActionIntentStatus() {
            return this.postConfirmActionIntentStatus;
        }

        public final Map<StripeIntent.Status, LuxePostConfirmActionCreator> getPostConfirmStatusToAction() {
            return this.postConfirmStatusToAction;
        }

        public int hashCode() {
            return (this.postConfirmStatusToAction.hashCode() * 31) + this.postConfirmActionIntentStatus.hashCode();
        }

        public String toString() {
            Map<StripeIntent.Status, LuxePostConfirmActionCreator> map = this.postConfirmStatusToAction;
            Map<StripeIntent.Status, Integer> map2 = this.postConfirmActionIntentStatus;
            return "LuxeAction(postConfirmStatusToAction=" + map + ", postConfirmActionIntentStatus=" + map2 + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/model/LuxePostConfirmActionRepository$Result;", "", "()V", JsonDocumentFields.ACTION, "NoAction", "NotSupported", "Lcom/stripe/android/model/LuxePostConfirmActionRepository$Result$Action;", "Lcom/stripe/android/model/LuxePostConfirmActionRepository$Result$NoAction;", "Lcom/stripe/android/model/LuxePostConfirmActionRepository$Result$NotSupported;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static abstract class Result {

        @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/model/LuxePostConfirmActionRepository$Result$Action;", "Lcom/stripe/android/model/LuxePostConfirmActionRepository$Result;", "postConfirmAction", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "(Lcom/stripe/android/model/StripeIntent$NextActionData;)V", "getPostConfirmAction", "()Lcom/stripe/android/model/StripeIntent$NextActionData;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Action extends Result {
            public static final int $stable = 0;
            private final StripeIntent.NextActionData postConfirmAction;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Action(StripeIntent.NextActionData postConfirmAction) {
                super(null);
                Intrinsics.checkNotNullParameter(postConfirmAction, "postConfirmAction");
                this.postConfirmAction = postConfirmAction;
            }

            public static /* synthetic */ Action copy$default(Action action, StripeIntent.NextActionData nextActionData, int i, Object obj) {
                if ((i & 1) != 0) {
                    nextActionData = action.postConfirmAction;
                }
                return action.copy(nextActionData);
            }

            public final StripeIntent.NextActionData component1() {
                return this.postConfirmAction;
            }

            public final Action copy(StripeIntent.NextActionData postConfirmAction) {
                Intrinsics.checkNotNullParameter(postConfirmAction, "postConfirmAction");
                return new Action(postConfirmAction);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Action) && Intrinsics.areEqual(this.postConfirmAction, ((Action) obj).postConfirmAction);
            }

            public final StripeIntent.NextActionData getPostConfirmAction() {
                return this.postConfirmAction;
            }

            public int hashCode() {
                return this.postConfirmAction.hashCode();
            }

            public String toString() {
                StripeIntent.NextActionData nextActionData = this.postConfirmAction;
                return "Action(postConfirmAction=" + nextActionData + ")";
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/model/LuxePostConfirmActionRepository$Result$NoAction;", "Lcom/stripe/android/model/LuxePostConfirmActionRepository$Result;", "()V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class NoAction extends Result {
            public static final int $stable = 0;
            public static final NoAction INSTANCE = new NoAction();

            private NoAction() {
                super(null);
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/model/LuxePostConfirmActionRepository$Result$NotSupported;", "Lcom/stripe/android/model/LuxePostConfirmActionRepository$Result;", "()V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
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

    private final LuxePostConfirmActionCreator getActionCreator(String str, StripeIntent.Status status) {
        Map<StripeIntent.Status, LuxePostConfirmActionCreator> postConfirmStatusToAction;
        Object firstOrNull;
        boolean z;
        LuxeAction luxeAction = this.lpmToConfirmActionSpec.get(str);
        if (luxeAction != null && (postConfirmStatusToAction = luxeAction.getPostConfirmStatusToAction()) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<StripeIntent.Status, LuxePostConfirmActionCreator> entry : postConfirmStatusToAction.entrySet()) {
                if (entry.getKey() == status) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                arrayList.add((LuxePostConfirmActionCreator) entry2.getValue());
            }
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) arrayList);
            return (LuxePostConfirmActionCreator) firstOrNull;
        }
        return null;
    }

    public final Result getAction$payments_core_release(String str, StripeIntent.Status status, JSONObject stripeIntentJson) {
        Result create$payments_core_release;
        Intrinsics.checkNotNullParameter(stripeIntentJson, "stripeIntentJson");
        LuxePostConfirmActionCreator actionCreator = getActionCreator(str, status);
        if (actionCreator == null || (create$payments_core_release = actionCreator.create$payments_core_release(stripeIntentJson)) == null) {
            return Result.NotSupported.INSTANCE;
        }
        return create$payments_core_release;
    }

    public final Integer getPostAuthorizeIntentOutcome$payments_core_release(StripeIntent stripeIntent) {
        String str;
        Map<StripeIntent.Status, Integer> postConfirmActionIntentStatus;
        Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
        if (stripeIntent.requiresAction() && stripeIntent.getNextActionData() == null) {
            return 2;
        }
        Map<String, LuxeAction> map = this.lpmToConfirmActionSpec;
        PaymentMethod paymentMethod = stripeIntent.getPaymentMethod();
        if (paymentMethod != null) {
            str = paymentMethod.code;
        } else {
            str = null;
        }
        LuxeAction luxeAction = map.get(str);
        if (luxeAction == null || (postConfirmActionIntentStatus = luxeAction.getPostConfirmActionIntentStatus()) == null) {
            return null;
        }
        return postConfirmActionIntentStatus.get(stripeIntent.getStatus());
    }

    public final boolean isPresent$payments_core_release(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return this.lpmToConfirmActionSpec.containsKey(code);
    }

    public final void update(Map<String, LuxeAction> additionalData) {
        Intrinsics.checkNotNullParameter(additionalData, "additionalData");
        this.lpmToConfirmActionSpec.putAll(additionalData);
    }
}
