package p000;

import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.map.modelmanager.Filter;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.configs.DestinationConfig;
import co.bird.android.model.wire.configs.RiderDestinationConfig;
import co.bird.android.model.wire.configs.RiderDestinationPinFilterConfig;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\"\u0010#J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R?\u0010\u001e\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010 ¨\u0006$"}, m28432d2 = {"LYz5;", "Lco/bird/android/app/feature/map/modelmanager/Filter;", "Lco/bird/android/model/wire/WireBird;", "", "models", "apply", "Ldr4;", C17296a.f69688o, "Ldr4;", "locationManager", "LTq4;", "b", "LTq4;", "reactiveConfig", "", "c", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", DateTokenConverter.CONVERTER_KEY, "Lkotlin/jvm/functions/Function1;", "getSetDirty", "()Lkotlin/jvm/functions/Function1;", "setSetDirty", "(Lkotlin/jvm/functions/Function1;)V", "setDirty", "Lco/bird/android/model/wire/configs/RiderDestinationPinFilterConfig;", "()Lco/bird/android/model/wire/configs/RiderDestinationPinFilterConfig;", "config", "<init>", "(Ldr4;LTq4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Yz5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C37459Yz5 implements Filter<WireBird> {

    /* renamed from: a */
    public final InterfaceC40001dr4 f47711a;

    /* renamed from: b */
    public final C36207Tq4 f47712b;

    /* renamed from: c */
    public final String f47713c;

    /* renamed from: d */
    public Function1<? super String, Unit> f47714d;

    public C37459Yz5(InterfaceC40001dr4 locationManager, C36207Tq4 reactiveConfig) {
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f47711a = locationManager;
        this.f47712b = reactiveConfig;
        this.f47713c = "destination-birds-nearby-user";
    }

    /* renamed from: a */
    public final RiderDestinationPinFilterConfig m73938a() {
        RiderDestinationConfig rider;
        DestinationConfig destination = this.f47712b.m82623f8().m73665a().getDestination();
        if (destination == null || (rider = destination.getRider()) == null) {
            return null;
        }
        return rider.getOriginPinFilter();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // co.bird.android.app.feature.map.modelmanager.Filter
    public List<WireBird> apply(List<? extends WireBird> models) {
        Integer innerRadiusMeters;
        Integer outerRadiusMeters;
        Integer maxPinsDisplayed;
        List take;
        List<WireBird> plus;
        List<WireBird> plus2;
        Intrinsics.checkNotNullParameter(models, "models");
        RiderDestinationPinFilterConfig m73938a = m73938a();
        if (m73938a != null && (innerRadiusMeters = m73938a.getInnerRadiusMeters()) != null) {
            int intValue = innerRadiusMeters.intValue();
            RiderDestinationPinFilterConfig m73938a2 = m73938a();
            if (m73938a2 != null && (outerRadiusMeters = m73938a2.getOuterRadiusMeters()) != null) {
                int intValue2 = outerRadiusMeters.intValue();
                RiderDestinationPinFilterConfig m73938a3 = m73938a();
                if (m73938a3 != null && (maxPinsDisplayed = m73938a3.getMaxPinsDisplayed()) != null) {
                    int intValue3 = maxPinsDisplayed.intValue();
                    Location m73665a = this.f47711a.mo43616p().m73665a();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (WireBird wireBird : models) {
                        float m73965f = C37429Yw2.f47648a.m73965f(new LatLng(wireBird.getLocation().getLatitude(), wireBird.getLocation().getLongitude()), new LatLng(m73665a.getLatitude(), m73665a.getLongitude()));
                        float f = intValue;
                        if (m73965f <= f) {
                            arrayList.add(wireBird);
                        }
                        if (m73965f > f && m73965f <= intValue2) {
                            arrayList2.add(wireBird);
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

    @Override // co.bird.android.app.feature.map.modelmanager.Filter
    public String getId() {
        return this.f47713c;
    }

    @Override // co.bird.android.app.feature.map.modelmanager.Filter
    public Function1<String, Unit> getSetDirty() {
        return this.f47714d;
    }

    @Override // co.bird.android.app.feature.map.modelmanager.Filter
    public void setSetDirty(Function1<? super String, Unit> function1) {
        this.f47714d = function1;
    }
}
