package com.stripe.android.p049ui.core.elements.autocomplete;

import com.stripe.android.p049ui.core.elements.autocomplete.model.FetchPlaceResponse;
import com.stripe.android.p049ui.core.elements.autocomplete.model.FindAutocompletePredictionsResponse;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ<\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/autocomplete/UnsupportedPlacesClientProxy;", "Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;", "()V", "fetchPlace", "Lkotlin/Result;", "Lcom/stripe/android/ui/core/elements/autocomplete/model/FetchPlaceResponse;", "placeId", "", "fetchPlace-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findAutocompletePredictions", "Lcom/stripe/android/ui/core/elements/autocomplete/model/FindAutocompletePredictionsResponse;", "query", "country", "limit", "", "findAutocompletePredictions-BWLJW6A", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.autocomplete.UnsupportedPlacesClientProxy */
/* loaded from: classes7.dex */
public final class UnsupportedPlacesClientProxy implements PlacesClientProxy {
    @Override // com.stripe.android.p049ui.core.elements.autocomplete.PlacesClientProxy
    /* renamed from: fetchPlace-gIAlu-s */
    public Object mo116666fetchPlacegIAlus(String str, Continuation<? super Result<FetchPlaceResponse>> continuation) {
        IllegalStateException illegalStateException = new IllegalStateException("Missing Google Places dependency, please add it to your apps build.gradle");
        Result.Companion companion = Result.Companion;
        return Result.m116783constructorimpl(ResultKt.createFailure(illegalStateException));
    }

    @Override // com.stripe.android.p049ui.core.elements.autocomplete.PlacesClientProxy
    /* renamed from: findAutocompletePredictions-BWLJW6A */
    public Object mo116667findAutocompletePredictionsBWLJW6A(String str, String str2, int i, Continuation<? super Result<FindAutocompletePredictionsResponse>> continuation) {
        IllegalStateException illegalStateException = new IllegalStateException("Missing Google Places dependency, please add it to your apps build.gradle");
        Result.Companion companion = Result.Companion;
        return Result.m116783constructorimpl(ResultKt.createFailure(illegalStateException));
    }
}
