package p000;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.ViewGroup;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.map.p008ui.LocationSelectionUi;
import co.bird.android.app.feature.map.p008ui.LocationSelectionUiImplFactory;
import co.bird.android.app.feature.map.presenter.LocationSelectionPresenter;
import co.bird.android.app.feature.map.presenter.LocationSelectionPresenterImpl;
import co.bird.android.app.feature.map.presenter.LocationSelectionPresenterImplFactory;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.ComplaintSection;
import co.bird.android.model.ComplaintType;
import co.bird.android.model.LocationSelectionModel;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.persistence.Area;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.model.PaymentMethod;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC12495bn;
import p000.UX0;
@Metadata(m28433d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 L2\u00020\u0001:\u0001MBc\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\n\u0010 \u001a\u00060\u001cj\u0002`\u001d\u0012\u0006\u0010#\u001a\u00020!\u0012\b\b\u0001\u0010'\u001a\u00020$\u0012\u000e\b\u0001\u0010,\u001a\b\u0012\u0004\u0012\u00020)0(\u0012\b\b\u0001\u0010/\u001a\u00020-\u0012\b\b\u0001\u00103\u001a\u000200¢\u0006\u0004\bJ\u0010KJ\u0018\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0006J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010 \u001a\u00060\u001cj\u0002`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R*\u0010E\u001a\u0016\u0012\u0004\u0012\u00020A\u0018\u00010@j\n\u0012\u0004\u0012\u00020A\u0018\u0001`B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006N"}, m28432d2 = {"Leq0;", "LUX0;", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/content/Intent;", "intent", "", "i", "f", "onStart", "onResume", "outState", "onSaveInstanceState", "onPause", "onStop", "onDestroy", "Lbn;", "b", "Lbn;", "areaManager", "LaM;", "c", "LaM;", "birdManager", "Lco/bird/android/app/feature/map/ui/LocationSelectionUiImplFactory;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/app/feature/map/ui/LocationSelectionUiImplFactory;", "uiFactory", "Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;", "Lco/bird/android/app/feature/communitymode/presenter/LocationSelectionPresenterFactory;", "e", "Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;", "locationSelectionPresenterFactory", "LVq4;", "LVq4;", "eventStream", "Lco/bird/android/core/mvp/BaseActivity;", "g", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "h", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "Landroid/view/ViewGroup;", "Landroid/view/ViewGroup;", "rootView", "Le13;", "j", "Le13;", "navigator", "Lco/bird/android/app/feature/map/ui/LocationSelectionUi;", "k", "Lco/bird/android/app/feature/map/ui/LocationSelectionUi;", "ui", "Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenter;", "l", "Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenter;", "locationSelectionPresenter", "Lco/bird/android/model/ComplaintType;", "m", "Lco/bird/android/model/ComplaintType;", "type", "Ljava/util/ArrayList;", "Lco/bird/android/model/ComplaintSection;", "Lkotlin/collections/ArrayList;", "n", "Ljava/util/ArrayList;", "sections", "Lco/bird/android/model/LocationSelectionModel;", "o", "Lco/bird/android/model/LocationSelectionModel;", RequestHeadersFactory.MODEL, "<init>", "(Lbn;LaM;Lco/bird/android/app/feature/map/ui/LocationSelectionUiImplFactory;Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;LVq4;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Landroid/view/ViewGroup;Le13;)V", "p", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComplaintLocationPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintLocationPresenter.kt\nco/bird/android/app/feature/communitymode/presenter/ComplaintLocationPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,147:1\n180#2:148\n180#2:149\n*S KotlinDebug\n*F\n+ 1 ComplaintLocationPresenter.kt\nco/bird/android/app/feature/communitymode/presenter/ComplaintLocationPresenter\n*L\n95#1:148\n108#1:149\n*E\n"})
/* renamed from: eq0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C40580eq0 implements UX0 {

    /* renamed from: p */
    public static final C20118a f78974p = new C20118a(null);

    /* renamed from: q */
    public static final int f78975q = 8;

    /* renamed from: b */
    public final InterfaceC12495bn f78976b;

    /* renamed from: c */
    public final InterfaceC10636aM f78977c;

    /* renamed from: d */
    public final LocationSelectionUiImplFactory f78978d;

    /* renamed from: e */
    public final LocationSelectionPresenterImplFactory f78979e;

    /* renamed from: f */
    public final InterfaceC36675Vq4 f78980f;

    /* renamed from: g */
    public final BaseActivity f78981g;

    /* renamed from: h */
    public final LifecycleScopeProvider<EnumC7097RE> f78982h;

    /* renamed from: i */
    public final ViewGroup f78983i;

    /* renamed from: j */
    public final InterfaceC40099e13 f78984j;

    /* renamed from: k */
    public LocationSelectionUi f78985k;

    /* renamed from: l */
    public LocationSelectionPresenter f78986l;

    /* renamed from: m */
    public ComplaintType f78987m;

    /* renamed from: n */
    public ArrayList<ComplaintSection> f78988n;

    /* renamed from: o */
    public LocationSelectionModel f78989o;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Leq0$a;", "", "", "CREATE_RADIUS", "D", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: eq0$a */
    /* loaded from: classes2.dex */
    public static final class C20118a {
        public /* synthetic */ C20118a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C20118a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/LocationSelectionModel;", "kotlin.jvm.PlatformType", RequestHeadersFactory.MODEL, "", C17296a.f69688o, "(Lco/bird/android/model/LocationSelectionModel;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: eq0$b */
    /* loaded from: classes2.dex */
    public static final class C20119b extends Lambda implements Function1<LocationSelectionModel, Unit> {
        public C20119b() {
            super(1);
        }

        /* renamed from: a */
        public final void m42490a(LocationSelectionModel locationSelectionModel) {
            Unit unit;
            Unit unit2 = null;
            if (C40580eq0.this.f78987m != null) {
                C40580eq0 c40580eq0 = C40580eq0.this;
                Intent intent = new Intent();
                intent.putExtra(PaymentMethod.BillingDetails.PARAM_ADDRESS, locationSelectionModel.getAddress());
                intent.putExtra("location", locationSelectionModel.getLocation());
                c40580eq0.f78981g.setResult(-1, intent);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C40580eq0.this.f78980f.mo77815b(new LocationSelectionModel(locationSelectionModel.getLocation(), locationSelectionModel.getAddress()));
            }
            if (locationSelectionModel != null) {
                C40580eq0 c40580eq02 = C40580eq0.this;
                Intent intent2 = new Intent();
                intent2.putExtra(PaymentMethod.BillingDetails.PARAM_ADDRESS, locationSelectionModel.getAddress());
                intent2.putExtra("location", locationSelectionModel.getLocation());
                c40580eq02.f78984j.mo37029e4(-1, intent2);
                unit2 = Unit.INSTANCE;
            }
            if (unit2 == null) {
                C40580eq0.this.f78984j.close();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LocationSelectionModel locationSelectionModel) {
            m42490a(locationSelectionModel);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: eq0$c */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C20120c extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C20120c f78991b = new C20120c();

        public C20120c() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Landroid/location/Location;", "location", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Landroid/location/Location;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: eq0$d */
    /* loaded from: classes2.dex */
    public static final class C20121d extends Lambda implements Function1<Location, InterfaceC23496h> {
        public C20121d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(Location location) {
            Intrinsics.checkNotNullParameter(location, "location");
            return InterfaceC12495bn.C12496a.refreshAreasNearby$default(C40580eq0.this.f78976b, location, 5000.0d, MapMode.RIDER, false, 8, null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: eq0$e */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C20122e extends FunctionReferenceImpl implements Function1<List<? extends Area>, Unit> {
        public C20122e(Object obj) {
            super(1, obj, LocationSelectionUi.class, "setAreas", "setAreas(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Area> list) {
            invoke2((List<Area>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<Area> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((LocationSelectionUi) this.receiver).setAreas(p0);
        }
    }

    public C40580eq0(InterfaceC12495bn areaManager, InterfaceC10636aM birdManager, LocationSelectionUiImplFactory uiFactory, LocationSelectionPresenterImplFactory locationSelectionPresenterFactory, InterfaceC36675Vq4 eventStream, BaseActivity activity, LifecycleScopeProvider<EnumC7097RE> scopeProvider, ViewGroup rootView, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(areaManager, "areaManager");
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(uiFactory, "uiFactory");
        Intrinsics.checkNotNullParameter(locationSelectionPresenterFactory, "locationSelectionPresenterFactory");
        Intrinsics.checkNotNullParameter(eventStream, "eventStream");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f78976b = areaManager;
        this.f78977c = birdManager;
        this.f78978d = uiFactory;
        this.f78979e = locationSelectionPresenterFactory;
        this.f78980f = eventStream;
        this.f78981g = activity;
        this.f78982h = scopeProvider;
        this.f78983i = rootView;
        this.f78984j = navigator;
    }

    /* renamed from: g */
    public static final void m42496g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final void m42495h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final InterfaceC23496h m42493j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final InterfaceC23434B m42492k(C40580eq0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.f78976b.mo63995r();
    }

    /* renamed from: l */
    public static final void m42491l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f */
    public final void m42497f() {
        LocationSelectionPresenter locationSelectionPresenter = this.f78986l;
        if (locationSelectionPresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("locationSelectionPresenter");
            locationSelectionPresenter = null;
        }
        Observable<LocationSelectionModel> observeOn = locationSelectionPresenter.observeDone().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "locationSelectionPresent…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f78982h));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20119b c20119b = new C20119b();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Zp0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40580eq0.m42496g(Function1.this, obj);
            }
        };
        final C20120c c20120c = C20120c.f78991b;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: aq0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40580eq0.m42495h(Function1.this, obj);
            }
        });
    }

    /* renamed from: i */
    public final void m42494i(Bundle bundle, Intent intent) {
        LocationSelectionUi locationSelectionUi;
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f78989o = (LocationSelectionModel) intent.getParcelableExtra("location_selection_model");
        C33463Hx5 m103193c = C33463Hx5.m103193c(this.f78981g.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m103193c, "inflate(activity.layoutInflater)");
        this.f78985k = this.f78978d.create(this.f78981g, m103193c);
        this.f78983i.addView(m103193c.getRoot());
        LocationSelectionPresenterImplFactory locationSelectionPresenterImplFactory = this.f78979e;
        LocationSelectionUi locationSelectionUi2 = this.f78985k;
        LocationSelectionUi locationSelectionUi3 = null;
        if (locationSelectionUi2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ui");
            locationSelectionUi = null;
        } else {
            locationSelectionUi = locationSelectionUi2;
        }
        LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider = this.f78982h;
        LocationSelectionModel locationSelectionModel = this.f78989o;
        AbstractC23461c m33039p = AbstractC23461c.m33039p();
        Intrinsics.checkNotNullExpressionValue(m33039p, "complete()");
        LocationSelectionPresenterImpl create = locationSelectionPresenterImplFactory.create(locationSelectionUi, lifecycleScopeProvider, 27.4332d, locationSelectionModel, m33039p);
        this.f78986l = create;
        if (create == null) {
            Intrinsics.throwUninitializedPropertyAccessException("locationSelectionPresenter");
            create = null;
        }
        create.onCreate(bundle);
        LocationSelectionUi locationSelectionUi4 = this.f78985k;
        if (locationSelectionUi4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ui");
            locationSelectionUi4 = null;
        }
        Observable<Location> centerLocation = locationSelectionUi4.centerLocation();
        final C20121d c20121d = new C20121d();
        Observable observeOn = centerLocation.flatMapCompletable(new InterfaceC23492o() { // from class: bq0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m42493j;
                m42493j = C40580eq0.m42493j(Function1.this, obj);
                return m42493j;
            }
        }).m33043l(Observable.defer(new Callable() { // from class: cq0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23434B m42492k;
                m42492k = C40580eq0.m42492k(C40580eq0.this);
                return m42492k;
            }
        })).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "fun onCreate(savedInstan…as.COMPLAINT_SECTION)\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f78982h));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ObservableSubscribeProxy observableSubscribeProxy = (ObservableSubscribeProxy) m33094as;
        LocationSelectionUi locationSelectionUi5 = this.f78985k;
        if (locationSelectionUi5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ui");
        } else {
            locationSelectionUi3 = locationSelectionUi5;
        }
        final C20122e c20122e = new C20122e(locationSelectionUi3);
        observableSubscribeProxy.subscribe(new InterfaceC23484g() { // from class: dq0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40580eq0.m42491l(Function1.this, obj);
            }
        });
        Serializable serializableExtra = intent.getSerializableExtra("complaint_type");
        if (serializableExtra != null) {
            this.f78987m = (ComplaintType) serializableExtra;
        }
        this.f78988n = intent.getParcelableArrayListExtra("complaint_section");
    }

    @Override // p000.UX0
    public void onDestroy() {
        LocationSelectionPresenter locationSelectionPresenter = this.f78986l;
        if (locationSelectionPresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("locationSelectionPresenter");
            locationSelectionPresenter = null;
        }
        locationSelectionPresenter.onDestroy();
        UX0.C8308a.m81388b(this);
    }

    @Override // p000.UX0
    public void onPause() {
        LocationSelectionPresenter locationSelectionPresenter = this.f78986l;
        if (locationSelectionPresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("locationSelectionPresenter");
            locationSelectionPresenter = null;
        }
        locationSelectionPresenter.onPause();
    }

    @Override // p000.UX0
    public void onResume() {
        LocationSelectionPresenter locationSelectionPresenter = this.f78986l;
        if (locationSelectionPresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("locationSelectionPresenter");
            locationSelectionPresenter = null;
        }
        locationSelectionPresenter.onResume();
    }

    @Override // p000.UX0
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        LocationSelectionPresenter locationSelectionPresenter = this.f78986l;
        if (locationSelectionPresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("locationSelectionPresenter");
            locationSelectionPresenter = null;
        }
        locationSelectionPresenter.onSaveInstanceState(outState);
    }

    @Override // p000.UX0
    public void onStart() {
        LocationSelectionPresenter locationSelectionPresenter = this.f78986l;
        if (locationSelectionPresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("locationSelectionPresenter");
            locationSelectionPresenter = null;
        }
        locationSelectionPresenter.onStart();
    }

    @Override // p000.UX0
    public void onStop() {
        LocationSelectionPresenter locationSelectionPresenter = this.f78986l;
        if (locationSelectionPresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("locationSelectionPresenter");
            locationSelectionPresenter = null;
        }
        locationSelectionPresenter.onStop();
    }
}
