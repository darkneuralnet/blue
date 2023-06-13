package com.stripe.android.p049ui.core.elements.autocomplete;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.stripe.android.p049ui.core.C19369R;
import com.stripe.android.p049ui.core.elements.autocomplete.model.FetchPlaceResponse;
import com.stripe.android.p049ui.core.elements.autocomplete.model.FindAutocompletePredictionsResponse;
import com.stripe.android.uicore.elements.DefaultIsPlacesAvailable;
import com.stripe.android.uicore.elements.IsPlacesAvailable;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J*\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ<\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;", "", "fetchPlace", "Lkotlin/Result;", "Lcom/stripe/android/ui/core/elements/autocomplete/model/FetchPlaceResponse;", "placeId", "", "fetchPlace-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findAutocompletePredictions", "Lcom/stripe/android/ui/core/elements/autocomplete/model/FindAutocompletePredictionsResponse;", "query", "country", "limit", "", "findAutocompletePredictions-BWLJW6A", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.autocomplete.PlacesClientProxy */
/* loaded from: classes7.dex */
public interface PlacesClientProxy {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JF\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001f\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion;", "", "()V", "create", "Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "googlePlacesApiKey", "", "isPlacesAvailable", "Lcom/stripe/android/uicore/elements/IsPlacesAvailable;", "clientFactory", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "initializer", "Lkotlin/Function0;", "", "getPlacesPoweredByGoogleDrawable", "", "isSystemDarkTheme", "", "(ZLcom/stripe/android/uicore/elements/IsPlacesAvailable;)Ljava/lang/Integer;", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.ui.core.elements.autocomplete.PlacesClientProxy$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ PlacesClientProxy create$default(Companion companion, Context context, String str, IsPlacesAvailable isPlacesAvailable, Function1 function1, Function0 function0, int i, Object obj) {
            if ((i & 4) != 0) {
                isPlacesAvailable = new DefaultIsPlacesAvailable();
            }
            IsPlacesAvailable isPlacesAvailable2 = isPlacesAvailable;
            PlacesClientProxy$Companion$create$1 placesClientProxy$Companion$create$1 = function1;
            if ((i & 8) != 0) {
                placesClientProxy$Companion$create$1 = new PlacesClientProxy$Companion$create$1(context);
            }
            Function1 function12 = placesClientProxy$Companion$create$1;
            PlacesClientProxy$Companion$create$2 placesClientProxy$Companion$create$2 = function0;
            if ((i & 16) != 0) {
                placesClientProxy$Companion$create$2 = new PlacesClientProxy$Companion$create$2(context, str);
            }
            return companion.create(context, str, isPlacesAvailable2, function12, placesClientProxy$Companion$create$2);
        }

        public static /* synthetic */ Integer getPlacesPoweredByGoogleDrawable$default(Companion companion, boolean z, IsPlacesAvailable isPlacesAvailable, int i, Object obj) {
            if ((i & 2) != 0) {
                isPlacesAvailable = new DefaultIsPlacesAvailable();
            }
            return companion.getPlacesPoweredByGoogleDrawable(z, isPlacesAvailable);
        }

        public final PlacesClientProxy create(Context context, String googlePlacesApiKey, IsPlacesAvailable isPlacesAvailable, Function1<? super Context, ? extends PlacesClient> clientFactory, Function0<Unit> initializer) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(googlePlacesApiKey, "googlePlacesApiKey");
            Intrinsics.checkNotNullParameter(isPlacesAvailable, "isPlacesAvailable");
            Intrinsics.checkNotNullParameter(clientFactory, "clientFactory");
            Intrinsics.checkNotNullParameter(initializer, "initializer");
            if (isPlacesAvailable.invoke()) {
                initializer.invoke();
                return new DefaultPlacesClientProxy(clientFactory.invoke(context));
            }
            return new UnsupportedPlacesClientProxy();
        }

        public final Integer getPlacesPoweredByGoogleDrawable(boolean z, IsPlacesAvailable isPlacesAvailable) {
            int i;
            Intrinsics.checkNotNullParameter(isPlacesAvailable, "isPlacesAvailable");
            if (isPlacesAvailable.invoke()) {
                if (z) {
                    i = C19369R.C19370drawable.places_powered_by_google_dark;
                } else {
                    i = C19369R.C19370drawable.places_powered_by_google_light;
                }
                return Integer.valueOf(i);
            }
            return null;
        }
    }

    /* renamed from: fetchPlace-gIAlu-s */
    Object mo116666fetchPlacegIAlus(String str, Continuation<? super Result<FetchPlaceResponse>> continuation);

    /* renamed from: findAutocompletePredictions-BWLJW6A */
    Object mo116667findAutocompletePredictionsBWLJW6A(String str, String str2, int i, Continuation<? super Result<FindAutocompletePredictionsResponse>> continuation);
}
