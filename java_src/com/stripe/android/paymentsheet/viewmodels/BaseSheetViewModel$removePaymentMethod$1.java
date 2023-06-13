package com.stripe.android.paymentsheet.viewmodels;

import androidx.lifecycle.C11747p;
import com.stripe.android.core.networking.NetworkConstantsKt;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.navigation.PaymentSheetScreen;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$removePaymentMethod$1", m28418f = "BaseSheetViewModel.kt", m28417i = {}, m28416l = {NetworkConstantsKt.HTTP_TOO_MANY_REQUESTS}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
@SourceDebugExtension({"SMAP\nBaseSheetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseSheetViewModel.kt\ncom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$removePaymentMethod$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,527:1\n766#2:528\n857#2,2:529\n*S KotlinDebug\n*F\n+ 1 BaseSheetViewModel.kt\ncom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$removePaymentMethod$1\n*L\n424#1:528\n424#1:529,2\n*E\n"})
/* loaded from: classes7.dex */
public final class BaseSheetViewModel$removePaymentMethod$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $paymentMethodId;
    int label;
    final /* synthetic */ BaseSheetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSheetViewModel$removePaymentMethod$1(BaseSheetViewModel baseSheetViewModel, String str, Continuation<? super BaseSheetViewModel$removePaymentMethod$1> continuation) {
        super(2, continuation);
        this.this$0 = baseSheetViewModel;
        this.$paymentMethodId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseSheetViewModel$removePaymentMethod$1(this.this$0, this.$paymentMethodId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((BaseSheetViewModel$removePaymentMethod$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        PaymentSelection.Saved saved;
        String str;
        PaymentMethod paymentMethod;
        List<PaymentMethod> value;
        boolean z;
        List<PaymentSheetScreen> listOf;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        boolean z2 = true;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            PaymentSelection value2 = this.this$0.getSelection$paymentsheet_release().getValue();
            ArrayList arrayList = null;
            if (value2 instanceof PaymentSelection.Saved) {
                saved = (PaymentSelection.Saved) value2;
            } else {
                saved = null;
            }
            if (saved != null && (paymentMethod = saved.getPaymentMethod()) != null) {
                str = paymentMethod.f75358id;
            } else {
                str = null;
            }
            if (Intrinsics.areEqual(str, this.$paymentMethodId)) {
                this.this$0.getSavedStateHandle().m66940m(BaseSheetViewModel.SAVE_SELECTION, null);
            }
            C11747p savedStateHandle = this.this$0.getSavedStateHandle();
            List<PaymentMethod> value3 = this.this$0.getPaymentMethods$paymentsheet_release().getValue();
            if (value3 != null) {
                String str2 = this.$paymentMethodId;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : value3) {
                    if (!Intrinsics.areEqual(((PaymentMethod) obj2).f75358id, str2)) {
                        arrayList2.add(obj2);
                    }
                }
                arrayList = arrayList2;
            }
            savedStateHandle.m66940m(BaseSheetViewModel.SAVE_PAYMENT_METHODS, arrayList);
            PaymentSheet.CustomerConfiguration customerConfig$paymentsheet_release = this.this$0.getCustomerConfig$paymentsheet_release();
            if (customerConfig$paymentsheet_release != null) {
                BaseSheetViewModel baseSheetViewModel = this.this$0;
                String str3 = this.$paymentMethodId;
                CustomerRepository customerRepository = baseSheetViewModel.getCustomerRepository();
                this.label = 1;
                obj = customerRepository.detachPaymentMethod(customerConfig$paymentsheet_release, str3, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            value = this.this$0.getPaymentMethods$paymentsheet_release().getValue();
            if (value == null && !value.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if ((z || !(this.this$0.getCurrentScreen().getValue() instanceof PaymentSheetScreen.SelectSavedPaymentMethods)) ? false : false) {
                GX2<List<PaymentSheetScreen>> backStack = this.this$0.getBackStack();
                listOf = CollectionsKt__CollectionsJVMKt.listOf(PaymentSheetScreen.AddFirstPaymentMethod.INSTANCE);
                backStack.setValue(listOf);
            }
            return Unit.INSTANCE;
        }
        PaymentMethod paymentMethod2 = (PaymentMethod) obj;
        value = this.this$0.getPaymentMethods$paymentsheet_release().getValue();
        if (value == null) {
        }
        z = true;
        if (z) {
        }
        if ((z || !(this.this$0.getCurrentScreen().getValue() instanceof PaymentSheetScreen.SelectSavedPaymentMethods)) ? false : false) {
        }
        return Unit.INSTANCE;
    }
}
