package com.stripe.android.paymentsheet.addresselement;

import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.addresselement.AddressElementScreen;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.addresselement.InputAddressViewModel$navigateToAutocompleteScreen$1", m28418f = "InputAddressViewModel.kt", m28417i = {1}, m28416l = {149, 151}, m28415m = "invokeSuspend", m28414n = {"addressDetails"}, m28413s = {"L$0"})
/* loaded from: classes7.dex */
public final class InputAddressViewModel$navigateToAutocompleteScreen$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ InputAddressViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputAddressViewModel$navigateToAutocompleteScreen$1(InputAddressViewModel inputAddressViewModel, Continuation<? super InputAddressViewModel$navigateToAutocompleteScreen$1> continuation) {
        super(2, continuation);
        this.this$0 = inputAddressViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InputAddressViewModel$navigateToAutocompleteScreen$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((InputAddressViewModel$navigateToAutocompleteScreen$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        AddressDetails addressDetails;
        AddressDetails addressDetails2;
        PaymentSheet.Address address;
        String country;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    addressDetails2 = (AddressDetails) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    addressDetails = addressDetails2;
                    if (addressDetails != null && (address = addressDetails.getAddress()) != null && (country = address.getCountry()) != null) {
                        this.this$0.getNavigator().navigateTo(new AddressElementScreen.Autocomplete(country));
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            InputAddressViewModel inputAddressViewModel = this.this$0;
            this.label = 1;
            obj = inputAddressViewModel.getCurrentAddress(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        addressDetails = (AddressDetails) obj;
        if (addressDetails != null) {
            GX2 gx2 = this.this$0._collectedAddress;
            this.L$0 = addressDetails;
            this.label = 2;
            if (gx2.emit(addressDetails, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            addressDetails2 = addressDetails;
            addressDetails = addressDetails2;
        }
        if (addressDetails != null) {
            this.this$0.getNavigator().navigateTo(new AddressElementScreen.Autocomplete(country));
        }
        return Unit.INSTANCE;
    }
}
