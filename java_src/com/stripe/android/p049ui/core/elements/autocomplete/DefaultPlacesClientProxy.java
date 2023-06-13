package com.stripe.android.p049ui.core.elements.autocomplete;

import android.text.SpannableString;
import android.text.style.StyleSpan;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.model.AddressComponent;
import com.google.android.libraries.places.api.model.AddressComponents;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.p049ui.core.elements.autocomplete.model.FetchPlaceResponse;
import com.stripe.android.p049ui.core.elements.autocomplete.model.FindAutocompletePredictionsResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eJ<\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/autocomplete/DefaultPlacesClientProxy;", "Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "Lcom/google/android/libraries/places/api/net/PlacesClient;", "(Lcom/google/android/libraries/places/api/net/PlacesClient;)V", "token", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "kotlin.jvm.PlatformType", "fetchPlace", "Lkotlin/Result;", "Lcom/stripe/android/ui/core/elements/autocomplete/model/FetchPlaceResponse;", "placeId", "", "fetchPlace-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findAutocompletePredictions", "Lcom/stripe/android/ui/core/elements/autocomplete/model/FindAutocompletePredictionsResponse;", "query", "country", "limit", "", "findAutocompletePredictions-BWLJW6A", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPlacesClientProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlacesClientProxy.kt\ncom/stripe/android/ui/core/elements/autocomplete/DefaultPlacesClientProxy\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,172:1\n1549#2:173\n1620#2,3:174\n1549#2:177\n1620#2,3:178\n*S KotlinDebug\n*F\n+ 1 PlacesClientProxy.kt\ncom/stripe/android/ui/core/elements/autocomplete/DefaultPlacesClientProxy\n*L\n98#1:173\n98#1:174,3\n129#1:177\n129#1:178,3\n*E\n"})
/* renamed from: com.stripe.android.ui.core.elements.autocomplete.DefaultPlacesClientProxy */
/* loaded from: classes7.dex */
public final class DefaultPlacesClientProxy implements PlacesClientProxy {
    private final PlacesClient client;
    private final AutocompleteSessionToken token;

    public DefaultPlacesClientProxy(PlacesClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
        this.token = AutocompleteSessionToken.newInstance();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    @Override // com.stripe.android.p049ui.core.elements.autocomplete.PlacesClientProxy
    /* renamed from: fetchPlace-gIAlu-s  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo116666fetchPlacegIAlus(String str, Continuation<? super Result<FetchPlaceResponse>> continuation) {
        DefaultPlacesClientProxy$fetchPlace$1 defaultPlacesClientProxy$fetchPlace$1;
        Object coroutine_suspended;
        int i;
        List listOf;
        AddressComponents addressComponents;
        ArrayList arrayList;
        List<AddressComponent> asList;
        int collectionSizeOrDefault;
        try {
            if (continuation instanceof DefaultPlacesClientProxy$fetchPlace$1) {
                defaultPlacesClientProxy$fetchPlace$1 = (DefaultPlacesClientProxy$fetchPlace$1) continuation;
                int i2 = defaultPlacesClientProxy$fetchPlace$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    defaultPlacesClientProxy$fetchPlace$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = defaultPlacesClientProxy$fetchPlace$1.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = defaultPlacesClientProxy$fetchPlace$1.label;
                    if (i == 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        PlacesClient placesClient = this.client;
                        listOf = CollectionsKt__CollectionsJVMKt.listOf(Place.Field.ADDRESS_COMPONENTS);
                        Task<com.google.android.libraries.places.api.net.FetchPlaceResponse> fetchPlace = placesClient.fetchPlace(FetchPlaceRequest.newInstance(str, listOf));
                        Intrinsics.checkNotNullExpressionValue(fetchPlace, "client.fetchPlace(\n     …          )\n            )");
                        defaultPlacesClientProxy$fetchPlace$1.label = 1;
                        obj = DZ5.m110169a(fetchPlace, defaultPlacesClientProxy$fetchPlace$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    Result.Companion companion = Result.Companion;
                    addressComponents = ((com.google.android.libraries.places.api.net.FetchPlaceResponse) obj).getPlace().getAddressComponents();
                    if (addressComponents == null && (asList = addressComponents.asList()) != null) {
                        List<AddressComponent> list = asList;
                        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                        arrayList = new ArrayList(collectionSizeOrDefault);
                        for (AddressComponent addressComponent : list) {
                            String shortName = addressComponent.getShortName();
                            String name = addressComponent.getName();
                            Intrinsics.checkNotNullExpressionValue(name, "it.name");
                            List<String> types = addressComponent.getTypes();
                            Intrinsics.checkNotNullExpressionValue(types, "it.types");
                            arrayList.add(new com.stripe.android.p049ui.core.elements.autocomplete.model.AddressComponent(shortName, name, types));
                        }
                    } else {
                        arrayList = null;
                    }
                    return Result.m116783constructorimpl(new FetchPlaceResponse(new com.stripe.android.p049ui.core.elements.autocomplete.model.Place(arrayList)));
                }
            }
            if (i == 0) {
            }
            Result.Companion companion2 = Result.Companion;
            addressComponents = ((com.google.android.libraries.places.api.net.FetchPlaceResponse) obj).getPlace().getAddressComponents();
            if (addressComponents == null) {
            }
            arrayList = null;
            return Result.m116783constructorimpl(new FetchPlaceResponse(new com.stripe.android.p049ui.core.elements.autocomplete.model.Place(arrayList)));
        } catch (Exception e) {
            Result.Companion companion3 = Result.Companion;
            String message = e.getMessage();
            return Result.m116783constructorimpl(ResultKt.createFailure(new Exception("Could not fetch place: " + message)));
        }
        defaultPlacesClientProxy$fetchPlace$1 = new DefaultPlacesClientProxy$fetchPlace$1(this, continuation);
        Object obj2 = defaultPlacesClientProxy$fetchPlace$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultPlacesClientProxy$fetchPlace$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c A[Catch: Exception -> 0x00ce, LOOP:0: B:21:0x0086->B:23:0x008c, LOOP_END, TryCatch #0 {Exception -> 0x00ce, blocks: (B:12:0x0027, B:20:0x0068, B:21:0x0086, B:23:0x008c, B:24:0x00c0, B:17:0x0036), top: B:29:0x0021 }] */
    @Override // com.stripe.android.p049ui.core.elements.autocomplete.PlacesClientProxy
    /* renamed from: findAutocompletePredictions-BWLJW6A  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo116667findAutocompletePredictionsBWLJW6A(String str, String str2, int i, Continuation<? super Result<FindAutocompletePredictionsResponse>> continuation) {
        DefaultPlacesClientProxy$findAutocompletePredictions$1 defaultPlacesClientProxy$findAutocompletePredictions$1;
        Object coroutine_suspended;
        int i2;
        int collectionSizeOrDefault;
        List take;
        try {
            if (continuation instanceof DefaultPlacesClientProxy$findAutocompletePredictions$1) {
                defaultPlacesClientProxy$findAutocompletePredictions$1 = (DefaultPlacesClientProxy$findAutocompletePredictions$1) continuation;
                int i3 = defaultPlacesClientProxy$findAutocompletePredictions$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    defaultPlacesClientProxy$findAutocompletePredictions$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = defaultPlacesClientProxy$findAutocompletePredictions$1.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = defaultPlacesClientProxy$findAutocompletePredictions$1.label;
                    if (i2 == 0) {
                        if (i2 == 1) {
                            i = defaultPlacesClientProxy$findAutocompletePredictions$1.I$0;
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        Task<com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse> findAutocompletePredictions = this.client.findAutocompletePredictions(FindAutocompletePredictionsRequest.builder().setSessionToken(this.token).setQuery(str).setCountry(str2).setTypeFilter(TypeFilter.ADDRESS).build());
                        Intrinsics.checkNotNullExpressionValue(findAutocompletePredictions, "client.findAutocompleteP…   .build()\n            )");
                        defaultPlacesClientProxy$findAutocompletePredictions$1.I$0 = i;
                        defaultPlacesClientProxy$findAutocompletePredictions$1.label = 1;
                        obj = DZ5.m110169a(findAutocompletePredictions, defaultPlacesClientProxy$findAutocompletePredictions$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    Result.Companion companion = Result.Companion;
                    List<AutocompletePrediction> autocompletePredictions = ((com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse) obj).getAutocompletePredictions();
                    Intrinsics.checkNotNullExpressionValue(autocompletePredictions, "response.autocompletePredictions");
                    List<AutocompletePrediction> list = autocompletePredictions;
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                    ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                    for (AutocompletePrediction autocompletePrediction : list) {
                        SpannableString primaryText = autocompletePrediction.getPrimaryText(new StyleSpan(1));
                        Intrinsics.checkNotNullExpressionValue(primaryText, "it.getPrimaryText(StyleSpan(Typeface.BOLD))");
                        SpannableString secondaryText = autocompletePrediction.getSecondaryText(new StyleSpan(1));
                        Intrinsics.checkNotNullExpressionValue(secondaryText, "it.getSecondaryText(StyleSpan(Typeface.BOLD))");
                        String placeId = autocompletePrediction.getPlaceId();
                        Intrinsics.checkNotNullExpressionValue(placeId, "it.placeId");
                        arrayList.add(new com.stripe.android.p049ui.core.elements.autocomplete.model.AutocompletePrediction(primaryText, secondaryText, placeId));
                    }
                    take = CollectionsKt___CollectionsKt.take(arrayList, i);
                    return Result.m116783constructorimpl(new FindAutocompletePredictionsResponse(take));
                }
            }
            if (i2 == 0) {
            }
            Result.Companion companion2 = Result.Companion;
            List<AutocompletePrediction> autocompletePredictions2 = ((com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse) obj).getAutocompletePredictions();
            Intrinsics.checkNotNullExpressionValue(autocompletePredictions2, "response.autocompletePredictions");
            List<AutocompletePrediction> list2 = autocompletePredictions2;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            while (r6.hasNext()) {
            }
            take = CollectionsKt___CollectionsKt.take(arrayList2, i);
            return Result.m116783constructorimpl(new FindAutocompletePredictionsResponse(take));
        } catch (Exception e) {
            Result.Companion companion3 = Result.Companion;
            String message = e.getMessage();
            return Result.m116783constructorimpl(ResultKt.createFailure(new Exception("Could not find autocomplete predictions: " + message)));
        }
        defaultPlacesClientProxy$findAutocompletePredictions$1 = new DefaultPlacesClientProxy$findAutocompletePredictions$1(this, continuation);
        Object obj2 = defaultPlacesClientProxy$findAutocompletePredictions$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = defaultPlacesClientProxy$findAutocompletePredictions$1.label;
    }
}
