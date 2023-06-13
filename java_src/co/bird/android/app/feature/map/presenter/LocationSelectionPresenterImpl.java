package co.bird.android.app.feature.map.presenter;

import android.annotation.SuppressLint;
import android.location.Address;
import android.location.Location;
import android.os.Bundle;
import co.bird.android.app.feature.map.p008ui.LocationSelectionUi;
import co.bird.android.app.feature.map.presenter.LocationSelectionPresenter;
import co.bird.android.app.feature.map.presenter.LocationSelectionPresenterImpl;
import co.bird.android.model.LocationSelectionModel;
import co.bird.android.model.wire.WireLocation;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.model.PaymentMethod;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24552a;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001BE\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0001\u0010\"\u001a\u00020!\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0001\u0010'\u001a\u00020&¢\u0006\u0004\b1\u00102J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0017J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016J\u0012\u0010\u0017\u001a\u00020\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u0015H\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\"\u0010+\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010\u00020\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\"\u0010/\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010.0.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00063"}, m28432d2 = {"Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;", "Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenter;", "", PaymentMethod.BillingDetails.PARAM_ADDRESS, "", "setAddress", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onStart", "onResume", "outState", "onSaveInstanceState", "onPause", "onStop", "onDestroy", "onLowMemory", "Lio/reactivex/Observable;", "Lco/bird/android/model/LocationSelectionModel;", "observeDone", "observeCompleteRevGeoCodeAddress", "", "hint", "setAddressHint", "Ldr4;", "reactiveLocationManager", "Ldr4;", "Lco/bird/android/app/feature/map/ui/LocationSelectionUi;", "ui", "Lco/bird/android/app/feature/map/ui/LocationSelectionUi;", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lcom/uber/autodispose/ScopeProvider;", "", "createRadius", "D", RequestHeadersFactory.MODEL, "Lco/bird/android/model/LocationSelectionModel;", "Lio/reactivex/c;", "doNotEnableDoneButtonUntil", "Lio/reactivex/c;", "LAG;", "kotlin.jvm.PlatformType", "completeAddress", "LAG;", "Lio/reactivex/subjects/a;", "", "addressFieldHasText", "Lio/reactivex/subjects/a;", "<init>", "(Ldr4;Lco/bird/android/app/feature/map/ui/LocationSelectionUi;Lcom/uber/autodispose/ScopeProvider;DLco/bird/android/model/LocationSelectionModel;Lio/reactivex/c;)V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLocationSelectionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocationSelectionPresenter.kt\nco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt\n*L\n1#1,224:1\n180#2:225\n180#2:227\n180#2:228\n180#2:229\n180#2:230\n180#2:231\n233#3:226\n*S KotlinDebug\n*F\n+ 1 LocationSelectionPresenter.kt\nco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl\n*L\n94#1:225\n114#1:227\n128#1:228\n148#1:229\n158#1:230\n167#1:231\n113#1:226\n*E\n"})
/* loaded from: classes2.dex */
public final class LocationSelectionPresenterImpl implements LocationSelectionPresenter {
    private final C24552a<Boolean> addressFieldHasText;
    private final C0058AG<String> completeAddress;
    private final double createRadius;
    private final AbstractC23461c doNotEnableDoneButtonUntil;
    private final LocationSelectionModel model;
    private final InterfaceC40001dr4 reactiveLocationManager;
    private final ScopeProvider scopeProvider;

    /* renamed from: ui */
    private final LocationSelectionUi f61616ui;

    public LocationSelectionPresenterImpl(InterfaceC40001dr4 reactiveLocationManager, LocationSelectionUi ui, ScopeProvider scopeProvider, double d, LocationSelectionModel locationSelectionModel, AbstractC23461c doNotEnableDoneButtonUntil) {
        Intrinsics.checkNotNullParameter(reactiveLocationManager, "reactiveLocationManager");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(doNotEnableDoneButtonUntil, "doNotEnableDoneButtonUntil");
        this.reactiveLocationManager = reactiveLocationManager;
        this.f61616ui = ui;
        this.scopeProvider = scopeProvider;
        this.createRadius = d;
        this.model = locationSelectionModel;
        this.doNotEnableDoneButtonUntil = doNotEnableDoneButtonUntil;
        C0058AG<String> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<String>()");
        this.completeAddress = m115951g;
        C24552a<Boolean> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<Boolean>()");
        this.addressFieldHasText = m31922e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23434B observeDone$lambda$23(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean observeDone$lambda$24(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String observeDone$lambda$25(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocationSelectionModel observeDone$lambda$26(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (LocationSelectionModel) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$6$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23434B onCreate$lambda$6$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$6$lambda$4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$6$lambda$5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23434B onResume$lambda$10(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$11(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$12(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onResume$lambda$13(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23447K onResume$lambda$14(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onResume$lambda$15(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Address onResume$lambda$16(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Address) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$17(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$18(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean onResume$lambda$19(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$21(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Unit) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAddress(String str) {
        boolean z;
        this.f61616ui.setAddress(str);
        this.completeAddress.accept(str);
        C24552a<Boolean> c24552a = this.addressFieldHasText;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        c24552a.onNext(Boolean.valueOf(z));
    }

    @Override // co.bird.android.app.feature.map.presenter.LocationSelectionPresenter
    public Observable<String> observeCompleteRevGeoCodeAddress() {
        Observable<String> hide = this.completeAddress.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "completeAddress.hide()");
        return hide;
    }

    @Override // co.bird.android.app.feature.map.presenter.LocationSelectionPresenter
    public Observable<LocationSelectionModel> observeDone() {
        Observable<Unit> doneClicks = this.f61616ui.doneClicks();
        final LocationSelectionPresenterImpl$observeDone$1 locationSelectionPresenterImpl$observeDone$1 = new LocationSelectionPresenterImpl$observeDone$1(this);
        Observable<R> flatMap = doneClicks.flatMap(new InterfaceC23492o() { // from class: bw2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B observeDone$lambda$23;
                observeDone$lambda$23 = LocationSelectionPresenterImpl.observeDone$lambda$23(Function1.this, obj);
                return observeDone$lambda$23;
            }
        });
        final LocationSelectionPresenterImpl$observeDone$2 locationSelectionPresenterImpl$observeDone$2 = LocationSelectionPresenterImpl$observeDone$2.INSTANCE;
        Observable observeOn = flatMap.filter(new InterfaceC23494q() { // from class: mw2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean observeDone$lambda$24;
                observeDone$lambda$24 = LocationSelectionPresenterImpl.observeDone$lambda$24(Function1.this, obj);
                return observeDone$lambda$24;
            }
        }).observeOn(C23454a.m33087a());
        final LocationSelectionPresenterImpl$observeDone$3 locationSelectionPresenterImpl$observeDone$3 = new LocationSelectionPresenterImpl$observeDone$3(this);
        Observable map = observeOn.map(new InterfaceC23492o() { // from class: qw2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String observeDone$lambda$25;
                observeDone$lambda$25 = LocationSelectionPresenterImpl.observeDone$lambda$25(Function1.this, obj);
                return observeDone$lambda$25;
            }
        });
        final LocationSelectionPresenterImpl$observeDone$4 locationSelectionPresenterImpl$observeDone$4 = new LocationSelectionPresenterImpl$observeDone$4(this);
        Observable<LocationSelectionModel> map2 = map.map(new InterfaceC23492o() { // from class: rw2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                LocationSelectionModel observeDone$lambda$26;
                observeDone$lambda$26 = LocationSelectionPresenterImpl.observeDone$lambda$26(Function1.this, obj);
                return observeDone$lambda$26;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "override fun observeDone…ss = address)\n      }\n  }");
        return map2;
    }

    @Override // co.bird.android.app.feature.map.presenter.LocationSelectionPresenter, p000.UX0
    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        if (bundle != null) {
            bundle2 = bundle.getBundle("map");
        } else {
            bundle2 = null;
        }
        this.f61616ui.onCreate(bundle2);
        LocationSelectionModel locationSelectionModel = this.model;
        if (locationSelectionModel != null) {
            WireLocation location = locationSelectionModel.getLocation();
            setAddress(locationSelectionModel.getAddress());
            this.f61616ui.setLocation(location, false, false);
            AbstractC23442F<Location> m33152N = this.reactiveLocationManager.mo43627e(true).m33142Y(C24542a.m31932c()).m33152N(C23454a.m33087a());
            final LocationSelectionPresenterImpl$onCreate$1$1 locationSelectionPresenterImpl$onCreate$1$1 = new LocationSelectionPresenterImpl$onCreate$1$1(this);
            if (m33152N.subscribe(new InterfaceC23484g() { // from class: kw2
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    LocationSelectionPresenterImpl.onCreate$lambda$1$lambda$0(Function1.this, obj);
                }
            }) != null) {
                return;
            }
        }
        AbstractC23442F<Location> m33152N2 = this.reactiveLocationManager.mo43627e(true).m33142Y(C24542a.m31932c()).m33152N(C23454a.m33087a());
        final LocationSelectionPresenterImpl$onCreate$2$1 locationSelectionPresenterImpl$onCreate$2$1 = new LocationSelectionPresenterImpl$onCreate$2$1(this);
        AbstractC23442F<Location> m33101w = m33152N2.m33101w(new InterfaceC23484g() { // from class: lw2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LocationSelectionPresenterImpl.onCreate$lambda$6$lambda$2(Function1.this, obj);
            }
        });
        final LocationSelectionPresenterImpl$onCreate$2$2 locationSelectionPresenterImpl$onCreate$2$2 = new LocationSelectionPresenterImpl$onCreate$2$2(this);
        Observable observeOn = m33101w.m33162D(new InterfaceC23492o() { // from class: nw2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B onCreate$lambda$6$lambda$3;
                onCreate$lambda$6$lambda$3 = LocationSelectionPresenterImpl.onCreate$lambda$6$lambda$3(Function1.this, obj);
                return onCreate$lambda$6$lambda$3;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "{\n      reactiveLocation…ber.e(e)\n        })\n    }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final LocationSelectionPresenterImpl$onCreate$2$3 locationSelectionPresenterImpl$onCreate$2$3 = new LocationSelectionPresenterImpl$onCreate$2$3(this);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: ow2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LocationSelectionPresenterImpl.onCreate$lambda$6$lambda$4(Function1.this, obj);
            }
        };
        final LocationSelectionPresenterImpl$onCreate$2$4 locationSelectionPresenterImpl$onCreate$2$4 = LocationSelectionPresenterImpl$onCreate$2$4.INSTANCE;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: pw2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LocationSelectionPresenterImpl.onCreate$lambda$6$lambda$5(Function1.this, obj);
            }
        });
    }

    @Override // co.bird.android.app.feature.map.presenter.LocationSelectionPresenter, p000.UX0
    public void onDestroy() {
        this.f61616ui.onDestroy();
        LocationSelectionPresenter.DefaultImpls.onDestroy(this);
    }

    @Override // co.bird.android.app.feature.map.presenter.LocationSelectionPresenter, p000.UX0
    public void onLowMemory() {
        this.f61616ui.onLowMemory();
    }

    @Override // co.bird.android.app.feature.map.presenter.LocationSelectionPresenter, p000.UX0
    public void onPause() {
        this.f61616ui.onPause();
    }

    @Override // co.bird.android.app.feature.map.presenter.LocationSelectionPresenter, p000.UX0
    @SuppressLint({"CheckResult"})
    public void onResume() {
        this.f61616ui.onResume();
        Observable<WireLocation> mapClicks = this.f61616ui.mapClicks();
        final LocationSelectionPresenterImpl$onResume$1 locationSelectionPresenterImpl$onResume$1 = LocationSelectionPresenterImpl$onResume$1.INSTANCE;
        Observable merge = Observable.merge(mapClicks.map(new InterfaceC23492o() { // from class: sw2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Unit onResume$lambda$7;
                onResume$lambda$7 = LocationSelectionPresenterImpl.onResume$lambda$7(Function1.this, obj);
                return onResume$lambda$7;
            }
        }), this.f61616ui.keyboardDoneClicks());
        Intrinsics.checkNotNullExpressionValue(merge, "merge(\n      ui.mapClick…eyboardDoneClicks()\n    )");
        Observable withLatestFrom = merge.withLatestFrom((InterfaceC23434B) this.completeAddress, (InterfaceC23480c) new InterfaceC23480c<Unit, String, R>() { // from class: co.bird.android.app.feature.map.presenter.LocationSelectionPresenterImpl$onResume$$inlined$withLatestFrom$1
            @Override // io.reactivex.functions.InterfaceC23480c
            public final R apply(Unit unit, String str) {
                return (R) str;
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        Object m33094as = withLatestFrom.m33094as(AutoDispose.m45239a(this.scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final LocationSelectionPresenterImpl$onResume$3 locationSelectionPresenterImpl$onResume$3 = new LocationSelectionPresenterImpl$onResume$3(this);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: xw2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LocationSelectionPresenterImpl.onResume$lambda$9(Function1.this, obj);
            }
        });
        Observable debounce = LocationSelectionUi.DefaultImpls.observeLocation$default(this.f61616ui, false, 1, null).debounce(100L, TimeUnit.MILLISECONDS);
        final LocationSelectionPresenterImpl$onResume$4 locationSelectionPresenterImpl$onResume$4 = new LocationSelectionPresenterImpl$onResume$4(this);
        Observable observeOn = debounce.flatMap(new InterfaceC23492o() { // from class: cw2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B onResume$lambda$10;
                onResume$lambda$10 = LocationSelectionPresenterImpl.onResume$lambda$10(Function1.this, obj);
                return onResume$lambda$10;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "@SuppressLint(\"CheckResu…e && enabled)\n      }\n  }");
        Object m33094as2 = observeOn.m33094as(AutoDispose.m45239a(this.scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final LocationSelectionPresenterImpl$onResume$5 locationSelectionPresenterImpl$onResume$5 = new LocationSelectionPresenterImpl$onResume$5(this);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: dw2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LocationSelectionPresenterImpl.onResume$lambda$11(Function1.this, obj);
            }
        };
        final LocationSelectionPresenterImpl$onResume$6 locationSelectionPresenterImpl$onResume$6 = new LocationSelectionPresenterImpl$onResume$6(this);
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: ew2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LocationSelectionPresenterImpl.onResume$lambda$12(Function1.this, obj);
            }
        });
        Observable<String> distinct = this.f61616ui.observeAddressField().distinct();
        final LocationSelectionPresenterImpl$onResume$7 locationSelectionPresenterImpl$onResume$7 = LocationSelectionPresenterImpl$onResume$7.INSTANCE;
        Observable<String> filter = distinct.filter(new InterfaceC23494q() { // from class: fw2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean onResume$lambda$13;
                onResume$lambda$13 = LocationSelectionPresenterImpl.onResume$lambda$13(Function1.this, obj);
                return onResume$lambda$13;
            }
        });
        final LocationSelectionPresenterImpl$onResume$8 locationSelectionPresenterImpl$onResume$8 = new LocationSelectionPresenterImpl$onResume$8(this);
        Observable<R> switchMapSingle = filter.switchMapSingle(new InterfaceC23492o() { // from class: gw2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K onResume$lambda$14;
                onResume$lambda$14 = LocationSelectionPresenterImpl.onResume$lambda$14(Function1.this, obj);
                return onResume$lambda$14;
            }
        });
        final LocationSelectionPresenterImpl$onResume$9 locationSelectionPresenterImpl$onResume$9 = LocationSelectionPresenterImpl$onResume$9.INSTANCE;
        Observable filter2 = switchMapSingle.filter(new InterfaceC23494q() { // from class: hw2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean onResume$lambda$15;
                onResume$lambda$15 = LocationSelectionPresenterImpl.onResume$lambda$15(Function1.this, obj);
                return onResume$lambda$15;
            }
        });
        final LocationSelectionPresenterImpl$onResume$10 locationSelectionPresenterImpl$onResume$10 = LocationSelectionPresenterImpl$onResume$10.INSTANCE;
        Observable observeOn2 = filter2.map(new InterfaceC23492o() { // from class: iw2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Address onResume$lambda$16;
                onResume$lambda$16 = LocationSelectionPresenterImpl.onResume$lambda$16(Function1.this, obj);
                return onResume$lambda$16;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "@SuppressLint(\"CheckResu…e && enabled)\n      }\n  }");
        Object m33094as3 = observeOn2.m33094as(AutoDispose.m45239a(this.scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final LocationSelectionPresenterImpl$onResume$11 locationSelectionPresenterImpl$onResume$11 = new LocationSelectionPresenterImpl$onResume$11(this);
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: jw2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LocationSelectionPresenterImpl.onResume$lambda$17(Function1.this, obj);
            }
        };
        final LocationSelectionPresenterImpl$onResume$12 locationSelectionPresenterImpl$onResume$12 = LocationSelectionPresenterImpl$onResume$12.INSTANCE;
        ((ObservableSubscribeProxy) m33094as3).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: tw2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LocationSelectionPresenterImpl.onResume$lambda$18(Function1.this, obj);
            }
        });
        Observable<String> observeAddressField = this.f61616ui.observeAddressField();
        final LocationSelectionPresenterImpl$onResume$13 locationSelectionPresenterImpl$onResume$13 = LocationSelectionPresenterImpl$onResume$13.INSTANCE;
        Observable<R> map = observeAddressField.map(new InterfaceC23492o() { // from class: uw2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean onResume$lambda$19;
                onResume$lambda$19 = LocationSelectionPresenterImpl.onResume$lambda$19(Function1.this, obj);
                return onResume$lambda$19;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "ui.observeAddressField()… .map { it.isNotBlank() }");
        Object m33094as4 = map.m33094as(AutoDispose.m45239a(this.scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as4).subscribe(this.addressFieldHasText);
        AbstractC23442F m33048i0 = this.doNotEnableDoneButtonUntil.m33048i0(new Callable() { // from class: vw2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Boolean bool;
                bool = Boolean.TRUE;
                return bool;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33048i0, "doNotEnableDoneButtonUnt…\n      .toSingle { true }");
        C24523e c24523e = C24523e.f91168a;
        Observable m33123k0 = m33048i0.m33123k0();
        Intrinsics.checkNotNullExpressionValue(m33123k0, "doneButtonEnablable.toObservable()");
        Observable observeOn3 = c24523e.m31956a(m33123k0, this.addressFieldHasText).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as5 = observeOn3.m33094as(AutoDispose.m45239a(this.scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final LocationSelectionPresenterImpl$onResume$14 locationSelectionPresenterImpl$onResume$14 = new LocationSelectionPresenterImpl$onResume$14(this);
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: ww2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LocationSelectionPresenterImpl.onResume$lambda$21(Function1.this, obj);
            }
        });
    }

    @Override // co.bird.android.app.feature.map.presenter.LocationSelectionPresenter, p000.UX0
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        if (outState.getBundle("map") == null) {
            outState.putBundle("map", new Bundle());
        }
        this.f61616ui.onSaveInstanceState(outState);
        LocationSelectionPresenter.DefaultImpls.onSaveInstanceState(this, outState);
    }

    @Override // co.bird.android.app.feature.map.presenter.LocationSelectionPresenter, p000.UX0
    public void onStart() {
        this.f61616ui.onStart();
    }

    @Override // co.bird.android.app.feature.map.presenter.LocationSelectionPresenter, p000.UX0
    public void onStop() {
        this.f61616ui.onStop();
    }

    @Override // co.bird.android.app.feature.map.presenter.LocationSelectionPresenter
    public void setAddressHint(int i) {
        this.f61616ui.setAddressHint(i);
    }
}
