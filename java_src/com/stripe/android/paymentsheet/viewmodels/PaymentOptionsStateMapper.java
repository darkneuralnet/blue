package com.stripe.android.paymentsheet.viewmodels;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.PaymentOptionsState;
import com.stripe.android.paymentsheet.PaymentOptionsStateFactory;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SavedSelection;
import com.stripe.android.paymentsheet.state.GooglePayState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u007f\u0012\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0012\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0012\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0012\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0012\u0012\u001a\u0010\u0017\u001a\u0016\u0012\f\u0012\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJG\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0010H\u0086\u0002R\"\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R(\u0010\u0017\u001a\u0016\u0012\f\u0012\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;", "", "", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethods", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "currentSelection", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "initialSelection", "", "isLinkEnabled", "Lcom/stripe/android/paymentsheet/state/GooglePayState;", "googlePayState", "Lcom/stripe/android/paymentsheet/PaymentOptionsState;", "createPaymentOptionsState", "(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/model/SavedSelection;Ljava/lang/Boolean;Lcom/stripe/android/paymentsheet/state/GooglePayState;)Lcom/stripe/android/paymentsheet/PaymentOptionsState;", "LEu1;", "invoke", "LtP5;", "LtP5;", "Lkotlin/Function1;", "", "Lcom/stripe/android/model/PaymentMethodCode;", "nameProvider", "Lkotlin/jvm/functions/Function1;", "isNotPaymentFlow", "Z", "<init>", "(LtP5;LtP5;LtP5;LtP5;LtP5;Lkotlin/jvm/functions/Function1;Z)V", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class PaymentOptionsStateMapper {
    private final InterfaceC49220tP5<PaymentSelection> currentSelection;
    private final InterfaceC49220tP5<GooglePayState> googlePayState;
    private final InterfaceC49220tP5<SavedSelection> initialSelection;
    private final InterfaceC49220tP5<Boolean> isLinkEnabled;
    private final boolean isNotPaymentFlow;
    private final Function1<String, String> nameProvider;
    private final InterfaceC49220tP5<List<PaymentMethod>> paymentMethods;

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentOptionsStateMapper(InterfaceC49220tP5<? extends List<PaymentMethod>> paymentMethods, InterfaceC49220tP5<? extends GooglePayState> googlePayState, InterfaceC49220tP5<Boolean> isLinkEnabled, InterfaceC49220tP5<? extends SavedSelection> initialSelection, InterfaceC49220tP5<? extends PaymentSelection> currentSelection, Function1<? super String, String> nameProvider, boolean z) {
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        Intrinsics.checkNotNullParameter(googlePayState, "googlePayState");
        Intrinsics.checkNotNullParameter(isLinkEnabled, "isLinkEnabled");
        Intrinsics.checkNotNullParameter(initialSelection, "initialSelection");
        Intrinsics.checkNotNullParameter(currentSelection, "currentSelection");
        Intrinsics.checkNotNullParameter(nameProvider, "nameProvider");
        this.paymentMethods = paymentMethods;
        this.googlePayState = googlePayState;
        this.isLinkEnabled = isLinkEnabled;
        this.initialSelection = initialSelection;
        this.currentSelection = currentSelection;
        this.nameProvider = nameProvider;
        this.isNotPaymentFlow = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentOptionsState createPaymentOptionsState(List<PaymentMethod> list, PaymentSelection paymentSelection, SavedSelection savedSelection, Boolean bool, GooglePayState googlePayState) {
        boolean z;
        boolean z2;
        if (list == null || savedSelection == null || bool == null) {
            return null;
        }
        PaymentOptionsStateFactory paymentOptionsStateFactory = PaymentOptionsStateFactory.INSTANCE;
        if ((googlePayState instanceof GooglePayState.Available) && this.isNotPaymentFlow) {
            z = true;
        } else {
            z = false;
        }
        if (bool.booleanValue() && this.isNotPaymentFlow) {
            z2 = true;
        } else {
            z2 = false;
        }
        return paymentOptionsStateFactory.create(list, z, z2, savedSelection, paymentSelection, this.nameProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invoke$lambda$0(List list, PaymentSelection paymentSelection, SavedSelection savedSelection, Continuation continuation) {
        return new Triple(list, paymentSelection, savedSelection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invoke$lambda$1(Boolean bool, GooglePayState googlePayState, Continuation continuation) {
        return new Pair(bool, googlePayState);
    }

    public final InterfaceC32730Eu1<PaymentOptionsState> invoke() {
        return C36708Vu1.m79257n(C36708Vu1.m79258m(this.paymentMethods, this.currentSelection, this.initialSelection, PaymentOptionsStateMapper$invoke$2.INSTANCE), C36708Vu1.m79257n(this.isLinkEnabled, this.googlePayState, PaymentOptionsStateMapper$invoke$4.INSTANCE), new PaymentOptionsStateMapper$invoke$5(this, null));
    }
}
