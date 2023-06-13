package p000;

import android.location.Address;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.AddressGuess;
import co.bird.android.model.destination.Destination;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23444H;
import io.reactivex.InterfaceC23446J;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C41318g46;
import p000.Z01;
@Metadata(m28433d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 :2\u00020\u0001:\u0001\u000fB\u0019\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010!\u001a\u00020\u001e¢\u0006\u0004\b8\u00109J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\u0006\u0010\u0010\u001a\u00020\nH\u0016J*\u0010\u0014\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e \u0013*\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u0016\u001a\n \u0013*\u0004\u0018\u00010\u00150\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\f2\u0006\u0010\u0010\u001a\u00020\nH\u0002J\u0018\u0010\u001a\u001a\n \u0013*\u0004\u0018\u00010\u00190\u00192\u0006\u0010\u0010\u001a\u00020\nH\u0002R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R#\u0010&\u001a\n \u0013*\u0004\u0018\u00010\"0\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R \u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010)R&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020(0+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010.R \u00101\u001a\b\u0012\u0004\u0012\u00020/0+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b0\u0010.R\u0014\u00103\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u00102R\u0014\u00107\u001a\u0002048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006;"}, m28432d2 = {"LZ01;", "LO01;", "Lco/bird/android/model/destination/Destination;", "destination", "", "c", "", "latitude", "longitude", "e", "", "query", "Lio/reactivex/F;", "", "Lco/bird/android/model/AddressGuess;", C17296a.f69688o, "id", "Landroid/location/Address;", DateTokenConverter.CONVERTER_KEY, "kotlin.jvm.PlatformType", "x", "Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsRequest;", "r", "Lcom/google/android/gms/maps/model/LatLng;", "s", "Lcom/google/android/libraries/places/api/net/FetchPlaceRequest;", "q", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "placesClient", "Ldr4;", "b", "Ldr4;", "locationManager", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "Lkotlin/Lazy;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "()Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "autocompleteSessionToken", "LAG;", "Lco/bird/android/buava/Optional;", "LAG;", "_destination", "Lio/reactivex/Observable;", "Lio/reactivex/Observable;", "getDestination", "()Lio/reactivex/Observable;", "", "f", "hasDestinationObservable", "()Z", "hasDestination", "Lg46$b;", "D", "()Lg46$b;", "logger", "<init>", "(Lcom/google/android/libraries/places/api/net/PlacesClient;Ldr4;)V", "g", "co.bird.android.manager.destination"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Z01 */
/* loaded from: classes4.dex */
public final class Z01 implements O01 {

    /* renamed from: g */
    public static final C10090a f47723g = new C10090a(null);

    /* renamed from: h */
    public static final List<Place.Field> f47724h;

    /* renamed from: a */
    public final PlacesClient f47725a;

    /* renamed from: b */
    public final InterfaceC40001dr4 f47726b;

    /* renamed from: c */
    public final Lazy f47727c;

    /* renamed from: d */
    public final C0058AG<Optional<Destination>> f47728d;

    /* renamed from: e */
    public final Observable<Optional<Destination>> f47729e;

    /* renamed from: f */
    public final Observable<Boolean> f47730f;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\u0007R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m28432d2 = {"LZ01$a;", "", "", "Lcom/google/android/libraries/places/api/model/Place$Field;", "LAT_LNG_FIELDS", "Ljava/util/List;", "getLAT_LNG_FIELDS$annotations", "()V", "<init>", "co.bird.android.manager.destination"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Z01$a */
    /* loaded from: classes4.dex */
    public static final class C10090a {
        public /* synthetic */ C10090a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C10090a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "kotlin.jvm.PlatformType", "b", "()Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Z01$b */
    /* loaded from: classes4.dex */
    public static final class C10091b extends Lambda implements Function0<AutocompleteSessionToken> {

        /* renamed from: g */
        public static final C10091b f47731g = new C10091b();

        public C10091b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final AutocompleteSessionToken invoke() {
            return AutocompleteSessionToken.newInstance();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/google/android/libraries/places/api/net/FetchPlaceResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lcom/google/android/libraries/places/api/net/FetchPlaceResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Z01$c */
    /* loaded from: classes4.dex */
    public static final class C10092c extends Lambda implements Function1<FetchPlaceResponse, Unit> {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC23444H<LatLng> f47733h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10092c(InterfaceC23444H<LatLng> interfaceC23444H) {
            super(1);
            this.f47733h = interfaceC23444H;
        }

        /* renamed from: a */
        public final void m73889a(FetchPlaceResponse fetchPlaceResponse) {
            C41318g46.AbstractC20723b m73919D = Z01.this.m73919D();
            Place place = fetchPlaceResponse.getPlace();
            m73919D.mo7221o("Successfully loaded place details for guess: " + place, new Object[0]);
            InterfaceC23444H<LatLng> interfaceC23444H = this.f47733h;
            LatLng latLng = fetchPlaceResponse.getPlace().getLatLng();
            Intrinsics.checkNotNull(latLng);
            interfaceC23444H.onSuccess(latLng);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FetchPlaceResponse fetchPlaceResponse) {
            m73889a(fetchPlaceResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nDestinationManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DestinationManagerImpl.kt\nco/bird/android/manager/destination/DestinationManagerImpl$findAddressesFor$1$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,131:1\n1549#2:132\n1620#2,3:133\n*S KotlinDebug\n*F\n+ 1 DestinationManagerImpl.kt\nco/bird/android/manager/destination/DestinationManagerImpl$findAddressesFor$1$3\n*L\n86#1:132\n86#1:133,3\n*E\n"})
    /* renamed from: Z01$d */
    /* loaded from: classes4.dex */
    public static final class C10093d extends Lambda implements Function1<FindAutocompletePredictionsResponse, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f47735h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC23444H<List<AddressGuess>> f47736i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10093d(String str, InterfaceC23444H<List<AddressGuess>> interfaceC23444H) {
            super(1);
            this.f47735h = str;
            this.f47736i = interfaceC23444H;
        }

        /* renamed from: a */
        public final void m73888a(FindAutocompletePredictionsResponse findAutocompletePredictionsResponse) {
            int collectionSizeOrDefault;
            C41318g46.AbstractC20723b m73919D = Z01.this.m73919D();
            int size = findAutocompletePredictionsResponse.getAutocompletePredictions().size();
            String str = this.f47735h;
            m73919D.mo7221o("Successfully loaded " + size + " predictions for query: " + str, new Object[0]);
            InterfaceC23444H<List<AddressGuess>> interfaceC23444H = this.f47736i;
            List<AutocompletePrediction> autocompletePredictions = findAutocompletePredictionsResponse.getAutocompletePredictions();
            Intrinsics.checkNotNullExpressionValue(autocompletePredictions, "response.autocompletePredictions");
            List<AutocompletePrediction> list = autocompletePredictions;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (AutocompletePrediction autocompletePrediction : list) {
                String placeId = autocompletePrediction.getPlaceId();
                Intrinsics.checkNotNullExpressionValue(placeId, "prediction.placeId");
                String spannableString = autocompletePrediction.getPrimaryText(null).toString();
                Intrinsics.checkNotNullExpressionValue(spannableString, "prediction.getPrimaryText(null).toString()");
                String spannableString2 = autocompletePrediction.getSecondaryText(null).toString();
                Intrinsics.checkNotNullExpressionValue(spannableString2, "prediction.getSecondaryText(null).toString()");
                arrayList.add(new AddressGuess(placeId, spannableString, spannableString2));
            }
            interfaceC23444H.onSuccess(arrayList);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FindAutocompletePredictionsResponse findAutocompletePredictionsResponse) {
            m73888a(findAutocompletePredictionsResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/destination/Destination;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Z01$e */
    /* loaded from: classes4.dex */
    public static final class C10094e extends Lambda implements Function1<Optional<Destination>, Boolean> {

        /* renamed from: g */
        public static final C10094e f47737g = new C10094e();

        public C10094e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<Destination> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.m59037c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lcom/google/android/gms/maps/model/LatLng;", "latLng", "Lio/reactivex/K;", "Landroid/location/Address;", "kotlin.jvm.PlatformType", "b", "(Lcom/google/android/gms/maps/model/LatLng;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Z01$f */
    /* loaded from: classes4.dex */
    public static final class C10095f extends Lambda implements Function1<LatLng, InterfaceC23447K<? extends Address>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "Landroid/location/Address;", "kotlin.jvm.PlatformType", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Z01$f$a */
        /* loaded from: classes4.dex */
        public static final class C10096a extends Lambda implements Function1<List<? extends Address>, Address> {

            /* renamed from: g */
            public static final C10096a f47739g = new C10096a();

            public C10096a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Address invoke(List<? extends Address> it) {
                Object first;
                Intrinsics.checkNotNullParameter(it, "it");
                first = CollectionsKt___CollectionsKt.first((List<? extends Object>) it);
                return (Address) first;
            }
        }

        public C10095f() {
            super(1);
        }

        /* renamed from: c */
        public static final Address m73884c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Address) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Address> invoke(LatLng latLng) {
            Intrinsics.checkNotNullParameter(latLng, "latLng");
            Observable<List<Address>> mo43606z = Z01.this.f47726b.mo43606z(latLng.f71430b, latLng.f71431c);
            final C10096a c10096a = C10096a.f47739g;
            return mo43606z.map(new InterfaceC23492o() { // from class: a11
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Address m73884c;
                    m73884c = Z01.C10095f.m73884c(Function1.this, obj);
                    return m73884c;
                }
            }).firstOrError();
        }
    }

    static {
        List<Place.Field> listOf;
        listOf = CollectionsKt__CollectionsJVMKt.listOf(Place.Field.LAT_LNG);
        f47724h = listOf;
    }

    public Z01(PlacesClient placesClient, InterfaceC40001dr4 locationManager) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(placesClient, "placesClient");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        this.f47725a = placesClient;
        this.f47726b = locationManager;
        lazy = LazyKt__LazyJVMKt.lazy(C10091b.f47731g);
        this.f47727c = lazy;
        C0058AG<Optional<Destination>> m115950h = C0058AG.m115950h(Optional.f63040c.m59034a());
        Intrinsics.checkNotNullExpressionValue(m115950h, "createDefault(Optional.absent())");
        this.f47728d = m115950h;
        this.f47729e = m115950h;
        Observable<Optional<Destination>> destination = getDestination();
        final C10094e c10094e = C10094e.f47737g;
        Observable<Boolean> distinctUntilChanged = destination.map(new InterfaceC23492o() { // from class: P01
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m73918E;
                m73918E = Z01.m73918E(Function1.this, obj);
                return m73918E;
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "destination.map { it.isP… }.distinctUntilChanged()");
        this.f47730f = distinctUntilChanged;
    }

    /* renamed from: A */
    public static final void m73922A(Z01 this$0, String query, InterfaceC23444H emitter) {
        List emptyList;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(query, "$query");
        Intrinsics.checkNotNullParameter(emitter, "$emitter");
        C41318g46.AbstractC20723b m73919D = this$0.m73919D();
        m73919D.mo7221o("Cancelled places prediction for query: " + query, new Object[0]);
        if (emitter.mo1769e()) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            emitter.onSuccess(emptyList);
        }
    }

    /* renamed from: B */
    public static final void m73921B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final Boolean m73918E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final InterfaceC23447K m73917F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m73897t(final Z01 this$0, final String id, final InterfaceC23444H emitter) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(id, "$id");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        Task<FetchPlaceResponse> addOnCanceledListener = this$0.f47725a.fetchPlace(this$0.m73900q(id)).addOnFailureListener(new OnFailureListener() { // from class: T01
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                Z01.m73896u(Z01.this, emitter, exc);
            }
        }).addOnCanceledListener(new OnCanceledListener() { // from class: U01
            @Override // com.google.android.gms.tasks.OnCanceledListener
            public final void onCanceled() {
                Z01.m73895v(Z01.this, id, emitter);
            }
        });
        final C10092c c10092c = new C10092c(emitter);
        addOnCanceledListener.addOnSuccessListener(new OnSuccessListener() { // from class: V01
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                Z01.m73894w(Function1.this, obj);
            }
        });
    }

    /* renamed from: u */
    public static final void m73896u(Z01 this$0, InterfaceC23444H emitter, Exception throwable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(emitter, "$emitter");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this$0.m73919D().mo7220p(throwable, "Problem when loading place details from Google API.", new Object[0]);
        emitter.mo4876c(throwable);
    }

    /* renamed from: v */
    public static final void m73895v(Z01 this$0, String id, InterfaceC23444H emitter) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(id, "$id");
        Intrinsics.checkNotNullParameter(emitter, "$emitter");
        C41318g46.AbstractC20723b m73919D = this$0.m73919D();
        m73919D.mo7221o("Cancelled fetch place details for: " + id, new Object[0]);
        emitter.mo4876c(new CancellationException("Fetching place details was cancelled"));
    }

    /* renamed from: w */
    public static final void m73894w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m73892y(final Z01 this$0, final String query, final InterfaceC23444H emitter) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(query, "$query");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        Task<FindAutocompletePredictionsResponse> addOnCanceledListener = this$0.f47725a.findAutocompletePredictions(this$0.m73899r(query)).addOnFailureListener(new OnFailureListener() { // from class: W01
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                Z01.m73891z(Z01.this, emitter, exc);
            }
        }).addOnCanceledListener(new OnCanceledListener() { // from class: X01
            @Override // com.google.android.gms.tasks.OnCanceledListener
            public final void onCanceled() {
                Z01.m73922A(Z01.this, query, emitter);
            }
        });
        final C10093d c10093d = new C10093d(query, emitter);
        addOnCanceledListener.addOnSuccessListener(new OnSuccessListener() { // from class: Y01
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                Z01.m73921B(Function1.this, obj);
            }
        });
    }

    /* renamed from: z */
    public static final void m73891z(Z01 this$0, InterfaceC23444H emitter, Exception throwable) {
        List emptyList;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(emitter, "$emitter");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this$0.m73919D().mo7220p(throwable, "Problem when querying places API for autocomplete.", new Object[0]);
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        emitter.onSuccess(emptyList);
    }

    /* renamed from: C */
    public final AutocompleteSessionToken m73920C() {
        return (AutocompleteSessionToken) this.f47727c.getValue();
    }

    /* renamed from: D */
    public final C41318g46.AbstractC20723b m73919D() {
        C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("destination-mgr");
        Intrinsics.checkNotNullExpressionValue(m40153k, "tag(\"destination-mgr\")");
        return m40153k;
    }

    @Override // p000.O01
    /* renamed from: a */
    public AbstractC23442F<List<AddressGuess>> mo73916a(String query) {
        boolean z;
        List emptyList;
        Intrinsics.checkNotNullParameter(query, "query");
        if (query.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && query.length() >= 3) {
            return m73893x(query);
        }
        m73919D().mo7221o("Address guess query is empty, or too short. Returning no guesses", new Object[0]);
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        AbstractC23442F<List<AddressGuess>> m33158H = AbstractC23442F.m33158H(emptyList);
        Intrinsics.checkNotNullExpressionValue(m33158H, "{\n      logger.i(\"Addres…e.just(emptyList())\n    }");
        return m33158H;
    }

    @Override // p000.O01
    /* renamed from: b */
    public boolean mo73915b() {
        Optional<Destination> value = this.f47728d.getValue();
        return value != null && value.m59037c();
    }

    @Override // p000.O01
    /* renamed from: c */
    public void mo73914c(Destination destination) {
        this.f47728d.accept(Optional.f63040c.m59033b(destination));
    }

    @Override // p000.O01
    /* renamed from: d */
    public AbstractC23442F<Address> mo73913d(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        AbstractC23442F<LatLng> m73898s = m73898s(id);
        final C10095f c10095f = new C10095f();
        AbstractC23442F m33165A = m73898s.m33165A(new InterfaceC23492o() { // from class: Q01
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m73917F;
                m73917F = Z01.m73917F(Function1.this, obj);
                return m73917F;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun loadAddress…      .firstOrError()\n  }");
        return m33165A;
    }

    @Override // p000.O01
    /* renamed from: e */
    public void mo73912e(double d, double d2) {
        String address = this.f47726b.mo43614r(d, d2).blockingFirst();
        Intrinsics.checkNotNullExpressionValue(address, "address");
        mo73914c(new Destination(d, d2, address));
    }

    @Override // p000.O01
    /* renamed from: f */
    public Observable<Boolean> mo73911f() {
        return this.f47730f;
    }

    @Override // p000.O01
    public Observable<Optional<Destination>> getDestination() {
        return this.f47729e;
    }

    /* renamed from: q */
    public final FetchPlaceRequest m73900q(String str) {
        FetchPlaceRequest.Builder builder = FetchPlaceRequest.builder(str, f47724h);
        builder.setSessionToken(m73920C());
        return builder.build();
    }

    /* renamed from: r */
    public final FindAutocompletePredictionsRequest m73899r(String str) {
        FindAutocompletePredictionsRequest.Builder builder = FindAutocompletePredictionsRequest.builder();
        builder.setSessionToken(m73920C());
        builder.setQuery(str);
        return builder.build();
    }

    /* renamed from: s */
    public final AbstractC23442F<LatLng> m73898s(final String str) {
        AbstractC23442F<LatLng> m33142Y = AbstractC23442F.m33126j(new InterfaceC23446J() { // from class: R01
            @Override // io.reactivex.InterfaceC23446J
            public final void subscribe(InterfaceC23444H interfaceC23444H) {
                Z01.m73897t(Z01.this, str, interfaceC23444H);
            }
        }).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "create<LatLng> { emitter…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    /* renamed from: x */
    public final AbstractC23442F<List<AddressGuess>> m73893x(final String str) {
        AbstractC23442F<List<AddressGuess>> m33152N = AbstractC23442F.m33126j(new InterfaceC23446J() { // from class: S01
            @Override // io.reactivex.InterfaceC23446J
            public final void subscribe(InterfaceC23444H interfaceC23444H) {
                Z01.m73892y(Z01.this, str, interfaceC23444H);
            }
        }).m33142Y(C24542a.m31932c()).m33152N(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33152N, "create<List<AddressGuess…bserveOn(Schedulers.io())");
        return m33152N;
    }
}
