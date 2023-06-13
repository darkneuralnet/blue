package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.map.modelmanager.Filter;
import co.bird.android.model.ParkingNest;
import co.bird.android.model.destination.Destination;
import co.bird.android.model.wire.configs.DestinationConfig;
import co.bird.android.model.wire.configs.RiderDestinationConfig;
import co.bird.android.model.wire.configs.RiderDestinationPinFilterConfig;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.LatLng;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C41318g46;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001b0%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b)\u0010*J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR?\u0010\u001a\u001a\u001f\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010#¨\u0006+"}, m28432d2 = {"LlA5;", "Lco/bird/android/app/feature/map/modelmanager/Filter;", "Lco/bird/android/model/ParkingNest;", "", "models", "apply", "LTq4;", C17296a.f69688o, "LTq4;", "reactiveConfig", "", "b", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "c", "Lkotlin/jvm/functions/Function1;", "getSetDirty", "()Lkotlin/jvm/functions/Function1;", "setSetDirty", "(Lkotlin/jvm/functions/Function1;)V", "setDirty", "Lco/bird/android/model/destination/Destination;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/destination/Destination;", "destination", "Lg46$b;", "()Lg46$b;", "logger", "Lco/bird/android/model/wire/configs/RiderDestinationPinFilterConfig;", "()Lco/bird/android/model/wire/configs/RiderDestinationPinFilterConfig;", "config", "Lio/reactivex/Observable;", "destinationStream", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "<init>", "(Lio/reactivex/Observable;Lcom/uber/autodispose/ScopeProvider;LTq4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nShowParkingNearDestinationFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShowParkingNearDestinationFilter.kt\nco/bird/android/app/feature/destination/filter/ShowParkingNearDestinationFilter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,78:1\n180#2:79\n*S KotlinDebug\n*F\n+ 1 ShowParkingNearDestinationFilter.kt\nco/bird/android/app/feature/destination/filter/ShowParkingNearDestinationFilter\n*L\n35#1:79\n*E\n"})
/* renamed from: lA5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C44342lA5 implements Filter<ParkingNest> {

    /* renamed from: a */
    public final C36207Tq4 f95672a;

    /* renamed from: b */
    public final String f95673b;

    /* renamed from: c */
    public Function1<? super String, Unit> f95674c;

    /* renamed from: d */
    public Destination f95675d;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: lA5$a */
    /* loaded from: classes2.dex */
    public static final class C25647a extends Lambda implements Function1<Throwable, Unit> {
        public C25647a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            C44342lA5.this.m27701b().mo7220p(throwable, "Error while observing destination stream changes", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/destination/Destination;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/destination/Destination;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: lA5$b */
    /* loaded from: classes2.dex */
    public static final class C25648b extends Lambda implements Function1<Destination, Unit> {
        public C25648b() {
            super(1);
        }

        /* renamed from: a */
        public final void m27700a(Destination destination) {
            C44342lA5.this.f95675d = destination;
            Function1<String, Unit> setDirty = C44342lA5.this.getSetDirty();
            if (setDirty != null) {
                setDirty.invoke(C44342lA5.this.getId());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Destination destination) {
            m27700a(destination);
            return Unit.INSTANCE;
        }
    }

    public C44342lA5(Observable<Destination> destinationStream, ScopeProvider scopeProvider, C36207Tq4 reactiveConfig) {
        Intrinsics.checkNotNullParameter(destinationStream, "destinationStream");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f95672a = reactiveConfig;
        this.f95673b = "destination-edit-parking-filter";
        Observable<Destination> observeOn = destinationStream.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "destinationStream\n      …dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        C44606ld5.subscribeBy$default((ObservableSubscribeProxy) m33094as, new C25647a(), null, new C25648b(), 2, null);
    }

    /* renamed from: a */
    public final RiderDestinationPinFilterConfig m27702a() {
        RiderDestinationConfig rider;
        DestinationConfig destination = this.f95672a.m82623f8().m73665a().getDestination();
        if (destination == null || (rider = destination.getRider()) == null) {
            return null;
        }
        return rider.getDestinationPinFilter();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // co.bird.android.app.feature.map.modelmanager.Filter
    public List<ParkingNest> apply(List<? extends ParkingNest> models) {
        Integer innerRadiusMeters;
        Integer outerRadiusMeters;
        Integer maxPinsDisplayed;
        List take;
        List<ParkingNest> plus;
        List<ParkingNest> plus2;
        Intrinsics.checkNotNullParameter(models, "models");
        RiderDestinationPinFilterConfig m27702a = m27702a();
        if (m27702a != null && (innerRadiusMeters = m27702a.getInnerRadiusMeters()) != null) {
            int intValue = innerRadiusMeters.intValue();
            RiderDestinationPinFilterConfig m27702a2 = m27702a();
            if (m27702a2 != null && (outerRadiusMeters = m27702a2.getOuterRadiusMeters()) != null) {
                int intValue2 = outerRadiusMeters.intValue();
                RiderDestinationPinFilterConfig m27702a3 = m27702a();
                if (m27702a3 != null && (maxPinsDisplayed = m27702a3.getMaxPinsDisplayed()) != null) {
                    int intValue3 = maxPinsDisplayed.intValue();
                    Destination destination = this.f95675d;
                    if (destination == null) {
                        return models;
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (ParkingNest parkingNest : models) {
                        float m73965f = C37429Yw2.f47648a.m73965f(new LatLng(parkingNest.getLocation().getLatitude(), parkingNest.getLocation().getLongitude()), new LatLng(destination.getLatitude(), destination.getLongitude()));
                        float f = intValue;
                        if (m73965f <= f) {
                            arrayList.add(parkingNest);
                        }
                        if (m73965f > f && m73965f <= intValue2) {
                            arrayList2.add(parkingNest);
                        }
                    }
                    if (arrayList.size() < intValue3) {
                        int size = intValue3 - arrayList.size();
                        if (arrayList2.size() <= size) {
                            plus2 = CollectionsKt___CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2);
                            return plus2;
                        }
                        take = CollectionsKt___CollectionsKt.take(arrayList2, size);
                        plus = CollectionsKt___CollectionsKt.plus((Collection) arrayList, (Iterable) take);
                        return plus;
                    }
                    return arrayList;
                }
            }
        }
        return models;
    }

    /* renamed from: b */
    public final C41318g46.AbstractC20723b m27701b() {
        C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("show-park-dest-filter");
        Intrinsics.checkNotNullExpressionValue(m40153k, "tag(\"show-park-dest-filter\")");
        return m40153k;
    }

    @Override // co.bird.android.app.feature.map.modelmanager.Filter
    public String getId() {
        return this.f95673b;
    }

    @Override // co.bird.android.app.feature.map.modelmanager.Filter
    public Function1<String, Unit> getSetDirty() {
        return this.f95674c;
    }

    @Override // co.bird.android.app.feature.map.modelmanager.Filter
    public void setSetDirty(Function1<? super String, Unit> function1) {
        this.f95674c = function1;
    }
}
