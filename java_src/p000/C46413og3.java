package p000;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.map.p008ui.LocationSelectionUi;
import co.bird.android.app.feature.map.presenter.LocationSelectionPresenter;
import co.bird.android.app.feature.map.presenter.LocationSelectionPresenterImpl;
import co.bird.android.app.feature.map.presenter.LocationSelectionPresenterImplFactory;
import co.bird.android.buava.Optional;
import co.bird.android.model.LocationSelectionModel;
import co.bird.android.model.RentalPlan;
import co.bird.android.model.RentalPlansResponse;
import co.bird.android.model.analytics.RentalLocationPlansAvailable;
import co.bird.android.model.analytics.RentalLocationScreenShown;
import co.bird.android.model.persistence.Area;
import co.bird.android.model.wire.WireLocation;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23486i;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24523e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C46413og3;
import p000.InterfaceC44782lv1;
import p000.S74;
@Metadata(m28433d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\b\b\u0001\u0010'\u001a\u00020$\u0012\b\b\u0001\u0010+\u001a\u00020(\u0012\b\b\u0001\u0010/\u001a\u00020,¢\u0006\u0004\b9\u0010:J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eH\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000eH\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000eH\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\"\u00108\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\u00110\u0011048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u0006;"}, m28432d2 = {"Log3;", "Llv1;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onStart", "onResume", "outState", "onSaveInstanceState", "onPause", "onStop", "onDestroy", "onLowMemory", "Lio/reactivex/Observable;", "", "Bk", "", "g7", "LEi0;", "m7", "LGi0;", "rc", "z5", "LCx4;", "b", "LCx4;", "manager", "LEa;", "c", "LEa;", "analyticsManager", "Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;", "locationPresenterFactory", "LQA2;", "e", "LQA2;", RequestHeadersFactory.MODEL, "Lcom/uber/autodispose/ScopeProvider;", "f", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/app/feature/map/ui/LocationSelectionUi;", "g", "Lco/bird/android/app/feature/map/ui/LocationSelectionUi;", "ui", "Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenter;", "h", "Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenter;", "locationSelectionPresenter", "LAG;", "kotlin.jvm.PlatformType", "i", "LAG;", "loadingAvailability", "<init>", "(LCx4;LEa;Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;LQA2;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/app/feature/map/ui/LocationSelectionUi;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOnDemandSetupLocationPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnDemandSetupLocationPresenter.kt\nco/bird/android/app/feature/longterm/OnDemandSetupLocationPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nio/reactivex/rxkotlin/Observables\n*L\n1#1,184:1\n180#2:185\n180#2:186\n180#2:187\n180#2:188\n180#2:189\n180#2:190\n61#3,2:191\n*S KotlinDebug\n*F\n+ 1 OnDemandSetupLocationPresenter.kt\nco/bird/android/app/feature/longterm/OnDemandSetupLocationPresenter\n*L\n78#1:185\n98#1:186\n105#1:187\n110#1:188\n138#1:189\n145#1:190\n162#1:191,2\n*E\n"})
/* renamed from: og3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C46413og3 implements InterfaceC44782lv1 {

    /* renamed from: b */
    public final InterfaceC32292Cx4 f102306b;

    /* renamed from: c */
    public final InterfaceC1880Ea f102307c;

    /* renamed from: d */
    public final LocationSelectionPresenterImplFactory f102308d;

    /* renamed from: e */
    public final QA2 f102309e;

    /* renamed from: f */
    public final ScopeProvider f102310f;

    /* renamed from: g */
    public final LocationSelectionUi f102311g;

    /* renamed from: h */
    public LocationSelectionPresenter f102312h;

    /* renamed from: i */
    public final C0058AG<Boolean> f102313i;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\f\u0010\f\u001a\u00028\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u00022\u0006\u0010\t\u001a\u00028\u0003H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"", "T1", "T2", "T3", "T4", "R", "t1", "t2", "t3", "t4", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$5\n+ 2 OnDemandSetupLocationPresenter.kt\nco/bird/android/app/feature/longterm/OnDemandSetupLocationPresenter\n*L\n1#1,304:1\n169#2:305\n*E\n"})
    /* renamed from: og3$a */
    /* loaded from: classes2.dex */
    public static final class C27024a<T1, T2, T3, T4, R> implements InterfaceC23486i<T1, T2, T3, T4, R> {
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
            if ((!r4.isEmpty()) != false) goto L7;
         */
        @Override // io.reactivex.functions.InterfaceC23486i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final R apply(T1 t1, T2 t2, T3 t3, T4 t4) {
            boolean z;
            boolean isBlank;
            List list = (List) t4;
            String str = (String) t3;
            WireLocation wireLocation = (WireLocation) t2;
            if (!((Boolean) t1).booleanValue()) {
                isBlank = StringsKt__StringsJVMKt.isBlank(str);
                z = true;
                if (!isBlank) {
                }
            }
            z = false;
            return (R) Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "canProceed", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: og3$b */
    /* loaded from: classes2.dex */
    public static final class C27025b extends Lambda implements Function1<Boolean, Unit> {
        public C27025b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean canProceed) {
            InterfaceC1880Ea interfaceC1880Ea = C46413og3.this.f102307c;
            Intrinsics.checkNotNullExpressionValue(canProceed, "canProceed");
            interfaceC1880Ea.mo55956N(new RentalLocationPlansAvailable(canProceed.booleanValue()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: og3$c */
    /* loaded from: classes2.dex */
    public static final class C27026c extends Lambda implements Function1<Boolean, Unit> {
        public C27026c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean it) {
            LocationSelectionUi locationSelectionUi = C46413og3.this.f102311g;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            locationSelectionUi.enableDoneButton(it.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Landroid/location/Location;", "location", "Lio/reactivex/K;", "", "Lco/bird/android/model/persistence/Area;", "kotlin.jvm.PlatformType", "b", "(Landroid/location/Location;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: og3$d */
    /* loaded from: classes2.dex */
    public static final class C27027d extends Lambda implements Function1<Location, InterfaceC23447K<? extends List<? extends Area>>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: og3$d$a */
        /* loaded from: classes2.dex */
        public static final class C27028a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C46413og3 f102317g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27028a(C46413og3 c46413og3) {
                super(1);
                this.f102317g = c46413og3;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                this.f102317g.f102311g.errorGeneric();
            }
        }

        public C27027d() {
            super(1);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends List<Area>> invoke(Location location) {
            Intrinsics.checkNotNullParameter(location, "location");
            AbstractC23442F<List<Area>> mo87533f = C46413og3.this.f102306b.mo87533f(location, 5000.0d);
            final C27028a c27028a = new C27028a(C46413og3.this);
            AbstractC23442F<List<Area>> m33106t = mo87533f.m33106t(new InterfaceC23484g() { // from class: pg3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C46413og3.C27027d.invoke$lambda$0(Function1.this, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33106t, "override fun onResume() …ui.showProgress(it) }\n  }");
            return C28237sD.progress$default(m33106t, C46413og3.this.f102311g, 0, 2, (Object) null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/RentalPlan;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: og3$e */
    /* loaded from: classes2.dex */
    public static final class C27029e extends Lambda implements Function1<List<? extends RentalPlan>, Unit> {

        /* renamed from: g */
        public static final C27029e f102318g = new C27029e();

        public C27029e() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<RentalPlan> list) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends RentalPlan> list) {
            invoke2((List<RentalPlan>) list);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: og3$f */
    /* loaded from: classes2.dex */
    public static final class C27030f extends Lambda implements Function1<Throwable, Unit> {
        public C27030f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            LocationSelectionUi locationSelectionUi = C46413og3.this.f102311g;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            locationSelectionUi.error(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: og3$g */
    /* loaded from: classes2.dex */
    public static final class C27031g extends Lambda implements Function1<Boolean, Unit> {
        public C27031g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean it) {
            LocationSelectionUi locationSelectionUi = C46413og3.this.f102311g;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            S74.C7343a.showProgress$default(locationSelectionUi, it.booleanValue(), 0, 2, null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: og3$h */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C27032h extends FunctionReferenceImpl implements Function1<List<? extends Area>, Unit> {
        public C27032h(Object obj) {
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

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: og3$i */
    /* loaded from: classes2.dex */
    public static final class C27033i extends Lambda implements Function1<Throwable, Unit> {
        public C27033i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C46413og3.this.f102311g.errorGeneric();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0000 \u0003*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireLocation;", "it", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireLocation;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: og3$j */
    /* loaded from: classes2.dex */
    public static final class C27034j extends Lambda implements Function1<WireLocation, Optional<WireLocation>> {

        /* renamed from: g */
        public static final C27034j f102322g = new C27034j();

        public C27034j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<WireLocation> invoke(WireLocation it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Optional.f63040c.m59033b(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0000 \u0003*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: og3$k */
    /* loaded from: classes2.dex */
    public static final class C27035k extends Lambda implements Function1<String, Optional<String>> {

        /* renamed from: g */
        public static final C27035k f102323g = new C27035k();

        public C27035k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final Optional<String> invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Optional.f63040c.m59033b(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireLocation;", "location", "Lio/reactivex/K;", "Lco/bird/android/model/RentalPlansResponse;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "(Lco/bird/android/model/wire/WireLocation;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: og3$l */
    /* loaded from: classes2.dex */
    public static final class C27036l extends Lambda implements Function1<WireLocation, InterfaceC23447K<? extends RentalPlansResponse>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/RentalPlansResponse;", "response", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: og3$l$a */
        /* loaded from: classes2.dex */
        public static final class C27037a extends Lambda implements Function1<HM4<RentalPlansResponse>, InterfaceC23447K<? extends RentalPlansResponse>> {

            /* renamed from: g */
            public static final C27037a f102325g = new C27037a();

            public C27037a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23447K<? extends RentalPlansResponse> invoke(HM4<RentalPlansResponse> response) {
                AbstractC23442F m33158H;
                Intrinsics.checkNotNullParameter(response, "response");
                RentalPlansResponse m103944a = response.m103944a();
                if (m103944a == null || (m33158H = AbstractC23442F.m33158H(m103944a)) == null) {
                    return AbstractC23442F.m33100x(C38816bt2.f59712b);
                }
                return m33158H;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: og3$l$b */
        /* loaded from: classes2.dex */
        public static final class C27038b extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C46413og3 f102326g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27038b(C46413og3 c46413og3) {
                super(1);
                this.f102326g = c46413og3;
            }

            /* renamed from: a */
            public final void m20623a(InterfaceC23465c interfaceC23465c) {
                this.f102326g.f102313i.accept(Boolean.TRUE);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m20623a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        public C27036l() {
            super(1);
        }

        /* renamed from: e */
        public static final void m20626e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: f */
        public static final void m20625f(C46413og3 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f102313i.accept(Boolean.FALSE);
        }

        public static final InterfaceC23447K invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d */
        public final InterfaceC23447K<? extends RentalPlansResponse> invoke(WireLocation location) {
            Intrinsics.checkNotNullParameter(location, "location");
            AbstractC23442F<HM4<RentalPlansResponse>> mo87537b = C46413og3.this.f102306b.mo87537b(location.fromLocation());
            final C27037a c27037a = C27037a.f102325g;
            AbstractC23442F<R> m33165A = mo87537b.m33165A(new InterfaceC23492o() { // from class: qg3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K invoke$lambda$0;
                    invoke$lambda$0 = C46413og3.C27036l.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
            final C27038b c27038b = new C27038b(C46413og3.this);
            AbstractC23442F m33102v = m33165A.m33102v(new InterfaceC23484g() { // from class: rg3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C46413og3.C27036l.m20626e(Function1.this, obj);
                }
            });
            final C46413og3 c46413og3 = C46413og3.this;
            return m33102v.m33110r(new InterfaceC23478a() { // from class: sg3
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C46413og3.C27036l.m20625f(C46413og3.this);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/RentalPlansResponse;", "response", "", "Lco/bird/android/model/RentalPlan;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/RentalPlansResponse;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOnDemandSetupLocationPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnDemandSetupLocationPresenter.kt\nco/bird/android/app/feature/longterm/OnDemandSetupLocationPresenter$onResume$7\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,184:1\n766#2:185\n857#2,2:186\n*S KotlinDebug\n*F\n+ 1 OnDemandSetupLocationPresenter.kt\nco/bird/android/app/feature/longterm/OnDemandSetupLocationPresenter$onResume$7\n*L\n126#1:185\n126#1:186,2\n*E\n"})
    /* renamed from: og3$m */
    /* loaded from: classes2.dex */
    public static final class C27039m extends Lambda implements Function1<RentalPlansResponse, List<? extends RentalPlan>> {

        /* renamed from: g */
        public static final C27039m f102327g = new C27039m();

        public C27039m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<RentalPlan> invoke(RentalPlansResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            ArrayList arrayList = new ArrayList();
            for (Object obj : response.getPlans()) {
                if (!((RentalPlan) obj).getDeliveryWindows().isEmpty()) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "validPlans", "", "Lco/bird/android/model/RentalPlan;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: og3$n */
    /* loaded from: classes2.dex */
    public static final class C27040n extends Lambda implements Function1<List<? extends RentalPlan>, Unit> {
        public C27040n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends RentalPlan> list) {
            invoke2((List<RentalPlan>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<RentalPlan> validPlans) {
            C37791a94<List<RentalPlan>> m88831h = C46413og3.this.f102309e.m88831h();
            Intrinsics.checkNotNullExpressionValue(validPlans, "validPlans");
            m88831h.accept(validPlans);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "validPlans", "", "Lco/bird/android/model/RentalPlan;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: og3$o */
    /* loaded from: classes2.dex */
    public static final class C27041o extends Lambda implements Function1<List<? extends RentalPlan>, Unit> {
        public C27041o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends RentalPlan> list) {
            invoke2((List<RentalPlan>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<RentalPlan> list) {
            if (list.isEmpty()) {
                C46413og3.this.f102311g.setHeadsUpText(Integer.valueOf(C45871nl4.long_term_rental_pick_location_out_of_service_area));
            }
        }
    }

    public C46413og3(InterfaceC32292Cx4 manager, InterfaceC1880Ea analyticsManager, LocationSelectionPresenterImplFactory locationPresenterFactory, QA2 model, ScopeProvider scopeProvider, LocationSelectionUi ui) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(locationPresenterFactory, "locationPresenterFactory");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f102306b = manager;
        this.f102307c = analyticsManager;
        this.f102308d = locationPresenterFactory;
        this.f102309e = model;
        this.f102310f = scopeProvider;
        this.f102311g = ui;
        C0058AG<Boolean> m115950h = C0058AG.m115950h(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(m115950h, "createDefault(false)");
        this.f102313i = m115950h;
    }

    /* renamed from: A */
    public static final List m20662A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m20661B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m20646o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m20645p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m20644q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m20643r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m20642s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m20641t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final InterfaceC23447K m20640u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m20639v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m20638w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final Optional m20637x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final Optional m20636y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final InterfaceC23447K m20635z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: Bk */
    public Observable<Object> mo22Bk() {
        Observable<Object> never = Observable.never();
        Intrinsics.checkNotNullExpressionValue(never, "never()");
        return never;
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: g7 */
    public Observable<Boolean> mo14g7() {
        Observable<String> never;
        C24523e c24523e = C24523e.f91168a;
        C0058AG<Boolean> c0058ag = this.f102313i;
        Observable<WireLocation> observeLocation = this.f102311g.observeLocation(true);
        LocationSelectionPresenter locationSelectionPresenter = this.f102312h;
        if (locationSelectionPresenter == null || (never = locationSelectionPresenter.observeCompleteRevGeoCodeAddress()) == null) {
            never = Observable.never();
            Intrinsics.checkNotNullExpressionValue(never, "never()");
        }
        Observable combineLatest = Observable.combineLatest(c0058ag, observeLocation, never, this.f102309e.m88831h(), new C27024a());
        Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest…nction(t1, t2, t3, t4) })");
        Observable distinctUntilChanged = combineLatest.startWith((Observable) Boolean.FALSE).distinctUntilChanged();
        final C27025b c27025b = new C27025b();
        Observable<Boolean> doOnNext = distinctUntilChanged.doOnNext(new InterfaceC23484g() { // from class: ag3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46413og3.m20646o(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "override fun canProceed(… canProceed))\n      }\n  }");
        return doOnNext;
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: m7 */
    public Observable<EnumC32621Ei0> mo12m7() {
        Observable<EnumC32621Ei0> just = Observable.just(EnumC32621Ei0.NONE);
        Intrinsics.checkNotNullExpressionValue(just, "just(CheckoutProceedType.NONE)");
        return just;
    }

    @Override // p000.InterfaceC44782lv1
    public void onActivityResult(int i, int i2, Intent intent) {
        InterfaceC44782lv1.C25814a.m26681b(this, i, i2, intent);
    }

    @Override // p000.UX0
    public void onCreate(Bundle bundle) {
        WireLocation wireLocation;
        String str;
        InterfaceC44782lv1.C25814a.m26680c(this, bundle);
        this.f102307c.mo55956N(new RentalLocationScreenShown());
        this.f102311g.showDoneButton(true);
        Optional<WireLocation> value = this.f102309e.m88826m().getValue();
        LocationSelectionModel locationSelectionModel = null;
        if (value != null) {
            wireLocation = value.m59035e();
        } else {
            wireLocation = null;
        }
        Optional<String> value2 = this.f102309e.m88832g().getValue();
        if (value2 != null) {
            str = value2.m59035e();
        } else {
            str = null;
        }
        if (wireLocation != null && str != null) {
            locationSelectionModel = new LocationSelectionModel(wireLocation, str);
        }
        LocationSelectionPresenterImplFactory locationSelectionPresenterImplFactory = this.f102308d;
        LocationSelectionUi locationSelectionUi = this.f102311g;
        ScopeProvider scopeProvider = this.f102310f;
        AbstractC23461c m33071O = AbstractC23461c.m33071O();
        Intrinsics.checkNotNullExpressionValue(m33071O, "never()");
        LocationSelectionPresenterImpl create = locationSelectionPresenterImplFactory.create(locationSelectionUi, scopeProvider, 27.4332d, locationSelectionModel, m33071O);
        create.onCreate(bundle);
        create.setAddressHint(C45871nl4.bird_delivery_address);
        this.f102312h = create;
        Observable<Boolean> observeOn = mo14g7().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "canProceed()\n      .obse…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f102310f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C27026c c27026c = new C27026c();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: fg3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46413og3.m20645p(Function1.this, obj);
            }
        });
    }

    @Override // p000.UX0
    public void onDestroy() {
        LocationSelectionPresenter locationSelectionPresenter = this.f102312h;
        if (locationSelectionPresenter != null) {
            locationSelectionPresenter.onDestroy();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p000.UX0
    public void onLowMemory() {
        LocationSelectionPresenter locationSelectionPresenter = this.f102312h;
        if (locationSelectionPresenter != null) {
            locationSelectionPresenter.onLowMemory();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p000.UX0
    public void onPause() {
        LocationSelectionPresenter locationSelectionPresenter = this.f102312h;
        if (locationSelectionPresenter != null) {
            locationSelectionPresenter.onPause();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p000.UX0
    public void onResume() {
        Observable<String> observeCompleteRevGeoCodeAddress;
        InterfaceC44782lv1.C25814a.m26676g(this);
        LocationSelectionPresenter locationSelectionPresenter = this.f102312h;
        if (locationSelectionPresenter != null) {
            locationSelectionPresenter.onResume();
        }
        Observable<Location> centerLocation = this.f102311g.centerLocation();
        final C27027d c27027d = new C27027d();
        Observable<R> flatMapSingle = centerLocation.flatMapSingle(new InterfaceC23492o() { // from class: gg3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m20640u;
                m20640u = C46413og3.m20640u(Function1.this, obj);
                return m20640u;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "override fun onResume() …ui.showProgress(it) }\n  }");
        Observable observeOn = C37279Yf5.m74557f0(flatMapSingle, 3).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "override fun onResume() …ui.showProgress(it) }\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f102310f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C27032h c27032h = new C27032h(this.f102311g);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: jg3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46413og3.m20639v(Function1.this, obj);
            }
        };
        final C27033i c27033i = new C27033i();
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: kg3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46413og3.m20638w(Function1.this, obj);
            }
        });
        Observable<WireLocation> observeLocation = this.f102311g.observeLocation(true);
        final C27034j c27034j = C27034j.f102322g;
        Observable<R> map = observeLocation.map(new InterfaceC23492o() { // from class: lg3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m20637x;
                m20637x = C46413og3.m20637x(Function1.this, obj);
                return m20637x;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "ui.observeLocation(inclu…tional.fromNullable(it) }");
        Object m33094as2 = map.m33094as(AutoDispose.m45239a(this.f102310f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as2).subscribe(this.f102309e.m88826m());
        LocationSelectionPresenter locationSelectionPresenter2 = this.f102312h;
        if (locationSelectionPresenter2 != null && (observeCompleteRevGeoCodeAddress = locationSelectionPresenter2.observeCompleteRevGeoCodeAddress()) != null) {
            final C27035k c27035k = C27035k.f102323g;
            Observable<R> map2 = observeCompleteRevGeoCodeAddress.map(new InterfaceC23492o() { // from class: mg3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Optional m20636y;
                    m20636y = C46413og3.m20636y(Function1.this, obj);
                    return m20636y;
                }
            });
            if (map2 != 0) {
                Object m33094as3 = map2.m33094as(AutoDispose.m45239a(this.f102310f));
                Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
                ObservableSubscribeProxy observableSubscribeProxy = (ObservableSubscribeProxy) m33094as3;
                if (observableSubscribeProxy != null) {
                    observableSubscribeProxy.subscribe(this.f102309e.m88832g());
                }
            }
        }
        Observable<WireLocation> observeLocation2 = this.f102311g.observeLocation(true);
        final C27036l c27036l = new C27036l();
        Observable<R> switchMapSingle = observeLocation2.switchMapSingle(new InterfaceC23492o() { // from class: ng3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m20635z;
                m20635z = C46413og3.m20635z(Function1.this, obj);
                return m20635z;
            }
        });
        final C27039m c27039m = C27039m.f102327g;
        Observable map3 = switchMapSingle.map(new InterfaceC23492o() { // from class: bg3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m20662A;
                m20662A = C46413og3.m20662A(Function1.this, obj);
                return m20662A;
            }
        });
        final C27040n c27040n = new C27040n();
        Observable observeOn2 = map3.doOnNext(new InterfaceC23484g() { // from class: cg3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46413og3.m20661B(Function1.this, obj);
            }
        }).observeOn(C23454a.m33087a());
        final C27041o c27041o = new C27041o();
        Observable doOnNext = observeOn2.doOnNext(new InterfaceC23484g() { // from class: dg3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46413og3.m20644q(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "override fun onResume() …ui.showProgress(it) }\n  }");
        Object m33094as4 = C37279Yf5.m74557f0(doOnNext, 3).m33094as(AutoDispose.m45239a(this.f102310f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C27029e c27029e = C27029e.f102318g;
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: eg3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46413og3.m20643r(Function1.this, obj);
            }
        };
        final C27030f c27030f = new C27030f();
        ((ObservableSubscribeProxy) m33094as4).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: hg3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46413og3.m20642s(Function1.this, obj);
            }
        });
        Observable<Boolean> observeOn3 = this.f102313i.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "loadingAvailability\n    …dSchedulers.mainThread())");
        Object m33094as5 = observeOn3.m33094as(AutoDispose.m45239a(this.f102310f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C27031g c27031g = new C27031g();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: ig3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46413og3.m20641t(Function1.this, obj);
            }
        });
    }

    @Override // p000.UX0
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        LocationSelectionPresenter locationSelectionPresenter = this.f102312h;
        if (locationSelectionPresenter != null) {
            locationSelectionPresenter.onSaveInstanceState(outState);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p000.UX0
    public void onStart() {
        LocationSelectionPresenter locationSelectionPresenter = this.f102312h;
        if (locationSelectionPresenter != null) {
            locationSelectionPresenter.onStart();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p000.UX0
    public void onStop() {
        LocationSelectionPresenter locationSelectionPresenter = this.f102312h;
        if (locationSelectionPresenter != null) {
            locationSelectionPresenter.onStop();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: rc */
    public Observable<EnumC33089Gi0> mo11rc() {
        Observable<EnumC33089Gi0> just = Observable.just(EnumC33089Gi0.BACK);
        Intrinsics.checkNotNullExpressionValue(just, "just(CheckoutReverseType.BACK)");
        return just;
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: z5 */
    public Observable<Unit> mo10z5() {
        return this.f102311g.doneClicks();
    }
}
