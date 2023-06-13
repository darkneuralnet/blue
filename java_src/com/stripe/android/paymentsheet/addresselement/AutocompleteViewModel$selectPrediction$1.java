package com.stripe.android.paymentsheet.addresselement;

import android.app.Application;
import com.stripe.android.model.Address;
import com.stripe.android.p049ui.core.elements.autocomplete.PlacesClientProxy;
import com.stripe.android.p049ui.core.elements.autocomplete.model.AutocompletePrediction;
import com.stripe.android.p049ui.core.elements.autocomplete.model.FetchPlaceResponse;
import com.stripe.android.p049ui.core.elements.autocomplete.model.Place;
import com.stripe.android.p049ui.core.elements.autocomplete.model.TransformGoogleToStripeAddressKt;
import com.stripe.android.paymentsheet.PaymentSheet;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel$selectPrediction$1", m28418f = "AutocompleteViewModel.kt", m28417i = {}, m28416l = {117}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class AutocompleteViewModel$selectPrediction$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ AutocompletePrediction $prediction;
    int label;
    final /* synthetic */ AutocompleteViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutocompleteViewModel$selectPrediction$1(AutocompleteViewModel autocompleteViewModel, AutocompletePrediction autocompletePrediction, Continuation<? super AutocompleteViewModel$selectPrediction$1> continuation) {
        super(2, continuation);
        this.this$0 = autocompleteViewModel;
        this.$prediction = autocompletePrediction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AutocompleteViewModel$selectPrediction$1(this.this$0, this.$prediction, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((AutocompleteViewModel$selectPrediction$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Object obj2;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                obj2 = ((Result) obj).m116792unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            this.this$0._loading.setValue(Boxing.boxBoolean(true));
            PlacesClientProxy placesClientProxy = this.this$0.placesClient;
            if (placesClientProxy != null) {
                String placeId = this.$prediction.getPlaceId();
                this.label = 1;
                Object mo116666fetchPlacegIAlus = placesClientProxy.mo116666fetchPlacegIAlus(placeId, this);
                if (mo116666fetchPlacegIAlus == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj2 = mo116666fetchPlacegIAlus;
            }
            return Unit.INSTANCE;
        }
        AutocompleteViewModel autocompleteViewModel = this.this$0;
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(obj2);
        if (m116786exceptionOrNullimpl == null) {
            autocompleteViewModel._loading.setValue(Boxing.boxBoolean(false));
            Place place = ((FetchPlaceResponse) obj2).getPlace();
            Application application = autocompleteViewModel.getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication()");
            Address transformGoogleToStripeAddress = TransformGoogleToStripeAddressKt.transformGoogleToStripeAddress(place, application);
            autocompleteViewModel.getAddressResult().setValue(Result.m116782boximpl(Result.m116783constructorimpl(new AddressDetails(null, new PaymentSheet.Address(transformGoogleToStripeAddress.getCity(), transformGoogleToStripeAddress.getCountry(), transformGoogleToStripeAddress.getLine1(), transformGoogleToStripeAddress.getLine2(), transformGoogleToStripeAddress.getPostalCode(), transformGoogleToStripeAddress.getState()), null, null, 13, null))));
            AutocompleteViewModel.setResultAndGoBack$default(autocompleteViewModel, null, 1, null);
        } else {
            autocompleteViewModel._loading.setValue(Boxing.boxBoolean(false));
            autocompleteViewModel.getAddressResult().setValue(Result.m116782boximpl(Result.m116783constructorimpl(ResultKt.createFailure(m116786exceptionOrNullimpl))));
            AutocompleteViewModel.setResultAndGoBack$default(autocompleteViewModel, null, 1, null);
        }
        return Unit.INSTANCE;
    }
}
