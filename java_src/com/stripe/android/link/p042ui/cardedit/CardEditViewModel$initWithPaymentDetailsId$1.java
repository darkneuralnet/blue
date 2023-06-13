package com.stripe.android.link.p042ui.cardedit;

import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.p042ui.ErrorMessage;
import com.stripe.android.link.p042ui.ErrorMessageKt;
import com.stripe.android.link.p042ui.wallet.PaymentDetailsResult;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.p049ui.core.FormController;
import com.stripe.android.p049ui.core.forms.LinkCardFormKt;
import com.stripe.android.p049ui.core.injection.FormControllerSubcomponent;
import com.stripe.android.uicore.elements.IdentifierSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.link.ui.cardedit.CardEditViewModel$initWithPaymentDetailsId$1", m28418f = "CardEditViewModel.kt", m28417i = {}, m28416l = {62}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
@SourceDebugExtension({"SMAP\nCardEditViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardEditViewModel.kt\ncom/stripe/android/link/ui/cardedit/CardEditViewModel$initWithPaymentDetailsId$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,175:1\n800#2,11:176\n288#2,2:187\n*S KotlinDebug\n*F\n+ 1 CardEditViewModel.kt\ncom/stripe/android/link/ui/cardedit/CardEditViewModel$initWithPaymentDetailsId$1\n*L\n64#1:176,11\n65#1:187,2\n*E\n"})
/* renamed from: com.stripe.android.link.ui.cardedit.CardEditViewModel$initWithPaymentDetailsId$1 */
/* loaded from: classes7.dex */
public final class CardEditViewModel$initWithPaymentDetailsId$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $paymentDetailsId;
    int label;
    final /* synthetic */ CardEditViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardEditViewModel$initWithPaymentDetailsId$1(CardEditViewModel cardEditViewModel, String str, Continuation<? super CardEditViewModel$initWithPaymentDetailsId$1> continuation) {
        super(2, continuation);
        this.this$0 = cardEditViewModel;
        this.$paymentDetailsId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CardEditViewModel$initWithPaymentDetailsId$1(this.this$0, this.$paymentDetailsId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((CardEditViewModel$initWithPaymentDetailsId$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        LinkAccountManager linkAccountManager;
        Object m116494listPaymentDetailsIoAF18A;
        Unit unit;
        Object obj2;
        Y94 y94;
        Map<IdentifierSpec, String> buildInitialFormValues;
        Set<IdentifierSpec> of;
        LinkActivityContract.Args args;
        LinkActivityContract.Args args2;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                m116494listPaymentDetailsIoAF18A = ((Result) obj).m116792unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            linkAccountManager = this.this$0.linkAccountManager;
            this.label = 1;
            m116494listPaymentDetailsIoAF18A = linkAccountManager.m116494listPaymentDetailsIoAF18A(this);
            if (m116494listPaymentDetailsIoAF18A == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        CardEditViewModel cardEditViewModel = this.this$0;
        String str = this.$paymentDetailsId;
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116494listPaymentDetailsIoAF18A);
        if (m116786exceptionOrNullimpl == null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : ((ConsumerPaymentDetails) m116494listPaymentDetailsIoAF18A).getPaymentDetails()) {
                if (obj3 instanceof ConsumerPaymentDetails.Card) {
                    arrayList.add(obj3);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                unit = null;
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (Intrinsics.areEqual(((ConsumerPaymentDetails.Card) obj2).getId(), str)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            ConsumerPaymentDetails.Card card = (ConsumerPaymentDetails.Card) obj2;
            if (card != null) {
                cardEditViewModel.setPaymentDetails(card);
                GX2<FormController> formController = cardEditViewModel.getFormController();
                y94 = cardEditViewModel.formControllerProvider;
                FormControllerSubcomponent.Builder formSpec = ((FormControllerSubcomponent.Builder) y94.get()).formSpec(LinkCardFormKt.getLinkCardForm());
                buildInitialFormValues = cardEditViewModel.buildInitialFormValues(card);
                FormControllerSubcomponent.Builder initialValues = formSpec.initialValues(buildInitialFormValues);
                of = SetsKt__SetsJVMKt.setOf(IdentifierSpec.Companion.getCardNumber());
                FormControllerSubcomponent.Builder viewModelScope = initialValues.viewOnlyFields(of).viewModelScope(C36218Tr6.m82333a(cardEditViewModel));
                args = cardEditViewModel.args;
                FormControllerSubcomponent.Builder shippingValues = viewModelScope.stripeIntent(args.getStripeIntent$link_release()).shippingValues(null);
                args2 = cardEditViewModel.args;
                formController.setValue(shippingValues.merchantName(args2.getMerchantName$link_release()).build().getFormController());
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                cardEditViewModel.dismiss(new PaymentDetailsResult.Failure(new ErrorMessage.Raw("Payment details " + str + " not found.")), false);
            }
        } else {
            cardEditViewModel.dismiss(new PaymentDetailsResult.Failure(ErrorMessageKt.getErrorMessage(m116786exceptionOrNullimpl)), false);
        }
        return Unit.INSTANCE;
    }
}
