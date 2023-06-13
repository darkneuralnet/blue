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
import p000.CA2;
import p000.InterfaceC44782lv1;
import p000.S74;
@Metadata(m28433d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\b\b\u0001\u0010&\u001a\u00020#\u0012\b\b\u0001\u0010*\u001a\u00020'\u0012\b\b\u0001\u0010.\u001a\u00020+¢\u0006\u0004\b8\u00109J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eH\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000eH\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000eH\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\"\u00107\u001a\u0010\u0012\f\u0012\n 4*\u0004\u0018\u00010\u00110\u0011038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u0006:"}, m28432d2 = {"LCA2;", "Llv1;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onStart", "onResume", "outState", "onSaveInstanceState", "onPause", "onStop", "onDestroy", "onLowMemory", "Lio/reactivex/Observable;", "", "Bk", "", "g7", "LEi0;", "m7", "LGi0;", "rc", "LCx4;", "b", "LCx4;", "manager", "LEa;", "c", "LEa;", "analyticsManager", "Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;", "locationPresenterFactory", "LQA2;", "e", "LQA2;", RequestHeadersFactory.MODEL, "Lcom/uber/autodispose/ScopeProvider;", "f", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/app/feature/map/ui/LocationSelectionUi;", "g", "Lco/bird/android/app/feature/map/ui/LocationSelectionUi;", "ui", "Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenter;", "h", "Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenter;", "locationSelectionPresenter", "LAG;", "kotlin.jvm.PlatformType", "i", "LAG;", "loadingAvailability", "<init>", "(LCx4;LEa;Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;LQA2;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/app/feature/map/ui/LocationSelectionUi;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLongTermRentalSetupLocationPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongTermRentalSetupLocationPresenter.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupLocationPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nio/reactivex/rxkotlin/Observables\n*L\n1#1,178:1\n180#2:179\n180#2:180\n180#2:181\n180#2:182\n180#2:183\n61#3,2:184\n*S KotlinDebug\n*F\n+ 1 LongTermRentalSetupLocationPresenter.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupLocationPresenter\n*L\n90#1:179\n97#1:180\n102#1:181\n132#1:182\n139#1:183\n156#1:184,2\n*E\n"})
/* renamed from: CA2 */
/* loaded from: classes2.dex */
public final class CA2 implements InterfaceC44782lv1 {

    /* renamed from: b */
    public final InterfaceC32292Cx4 f3522b;

    /* renamed from: c */
    public final InterfaceC1880Ea f3523c;

    /* renamed from: d */
    public final LocationSelectionPresenterImplFactory f3524d;

    /* renamed from: e */
    public final QA2 f3525e;

    /* renamed from: f */
    public final ScopeProvider f3526f;

    /* renamed from: g */
    public final LocationSelectionUi f3527g;

    /* renamed from: h */
    public LocationSelectionPresenter f3528h;

    /* renamed from: i */
    public final C0058AG<Boolean> f3529i;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\f\u0010\f\u001a\u00028\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u00022\u0006\u0010\t\u001a\u00028\u0003H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"", "T1", "T2", "T3", "T4", "R", "t1", "t2", "t3", "t4", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$5\n+ 2 LongTermRentalSetupLocationPresenter.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupLocationPresenter\n*L\n1#1,304:1\n163#2:305\n*E\n"})
    /* renamed from: CA2$a */
    /* loaded from: classes2.dex */
    public static final class C0899a<T1, T2, T3, T4, R> implements InterfaceC23486i<T1, T2, T3, T4, R> {
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
    /* renamed from: CA2$b */
    /* loaded from: classes2.dex */
    public static final class C0900b extends Lambda implements Function1<Boolean, Unit> {
        public C0900b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean canProceed) {
            InterfaceC1880Ea interfaceC1880Ea = CA2.this.f3523c;
            Intrinsics.checkNotNullExpressionValue(canProceed, "canProceed");
            interfaceC1880Ea.mo55956N(new RentalLocationPlansAvailable(canProceed.booleanValue()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Landroid/location/Location;", "location", "Lio/reactivex/K;", "", "Lco/bird/android/model/persistence/Area;", "kotlin.jvm.PlatformType", "b", "(Landroid/location/Location;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: CA2$c */
    /* loaded from: classes2.dex */
    public static final class C0901c extends Lambda implements Function1<Location, InterfaceC23447K<? extends List<? extends Area>>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: CA2$c$a */
        /* loaded from: classes2.dex */
        public static final class C0902a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ CA2 f3532g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0902a(CA2 ca2) {
                super(1);
                this.f3532g = ca2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                this.f3532g.f3527g.errorGeneric();
            }
        }

        public C0901c() {
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
            AbstractC23442F<List<Area>> mo87533f = CA2.this.f3522b.mo87533f(location, 5000.0d);
            final C0902a c0902a = new C0902a(CA2.this);
            AbstractC23442F<List<Area>> m33106t = mo87533f.m33106t(new InterfaceC23484g() { // from class: DA2
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    CA2.C0901c.invoke$lambda$0(Function1.this, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33106t, "override fun onResume() …ui.showProgress(it) }\n  }");
            return C28237sD.progress$default(m33106t, CA2.this.f3527g, 0, 2, (Object) null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/RentalPlan;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: CA2$d */
    /* loaded from: classes2.dex */
    public static final class C0903d extends Lambda implements Function1<List<? extends RentalPlan>, Unit> {

        /* renamed from: g */
        public static final C0903d f3533g = new C0903d();

        public C0903d() {
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
    /* renamed from: CA2$e */
    /* loaded from: classes2.dex */
    public static final class C0904e extends Lambda implements Function1<Throwable, Unit> {
        public C0904e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            LocationSelectionUi locationSelectionUi = CA2.this.f3527g;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            locationSelectionUi.error(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: CA2$f */
    /* loaded from: classes2.dex */
    public static final class C0905f extends Lambda implements Function1<Boolean, Unit> {
        public C0905f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean it) {
            LocationSelectionUi locationSelectionUi = CA2.this.f3527g;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            S74.C7343a.showProgress$default(locationSelectionUi, it.booleanValue(), 0, 2, null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: CA2$g */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0906g extends FunctionReferenceImpl implements Function1<List<? extends Area>, Unit> {
        public C0906g(Object obj) {
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
    /* renamed from: CA2$h */
    /* loaded from: classes2.dex */
    public static final class C0907h extends Lambda implements Function1<Throwable, Unit> {
        public C0907h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            CA2.this.f3527g.errorGeneric();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0000 \u0003*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireLocation;", "it", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireLocation;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: CA2$i */
    /* loaded from: classes2.dex */
    public static final class C0908i extends Lambda implements Function1<WireLocation, Optional<WireLocation>> {

        /* renamed from: g */
        public static final C0908i f3537g = new C0908i();

        public C0908i() {
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
    /* renamed from: CA2$j */
    /* loaded from: classes2.dex */
    public static final class C0909j extends Lambda implements Function1<String, Optional<String>> {

        /* renamed from: g */
        public static final C0909j f3538g = new C0909j();

        public C0909j() {
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
    /* renamed from: CA2$k */
    /* loaded from: classes2.dex */
    public static final class C0910k extends Lambda implements Function1<WireLocation, InterfaceC23447K<? extends RentalPlansResponse>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/RentalPlansResponse;", "response", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: CA2$k$a */
        /* loaded from: classes2.dex */
        public static final class C0911a extends Lambda implements Function1<HM4<RentalPlansResponse>, InterfaceC23447K<? extends RentalPlansResponse>> {

            /* renamed from: g */
            public static final C0911a f3540g = new C0911a();

            public C0911a() {
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
        /* renamed from: CA2$k$b */
        /* loaded from: classes2.dex */
        public static final class C0912b extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ CA2 f3541g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0912b(CA2 ca2) {
                super(1);
                this.f3541g = ca2;
            }

            /* renamed from: a */
            public final void m112680a(InterfaceC23465c interfaceC23465c) {
                this.f3541g.f3529i.accept(Boolean.TRUE);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m112680a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        public C0910k() {
            super(1);
        }

        /* renamed from: e */
        public static final void m112683e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: f */
        public static final void m112682f(CA2 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f3529i.accept(Boolean.FALSE);
        }

        public static final InterfaceC23447K invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d */
        public final InterfaceC23447K<? extends RentalPlansResponse> invoke(WireLocation location) {
            Intrinsics.checkNotNullParameter(location, "location");
            AbstractC23442F<HM4<RentalPlansResponse>> mo87537b = CA2.this.f3522b.mo87537b(location.fromLocation());
            final C0911a c0911a = C0911a.f3540g;
            AbstractC23442F<R> m33165A = mo87537b.m33165A(new InterfaceC23492o() { // from class: EA2
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K invoke$lambda$0;
                    invoke$lambda$0 = CA2.C0910k.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
            final C0912b c0912b = new C0912b(CA2.this);
            AbstractC23442F m33102v = m33165A.m33102v(new InterfaceC23484g() { // from class: FA2
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    CA2.C0910k.m112683e(Function1.this, obj);
                }
            });
            final CA2 ca2 = CA2.this;
            return m33102v.m33110r(new InterfaceC23478a() { // from class: GA2
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    CA2.C0910k.m112682f(CA2.this);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/RentalPlansResponse;", "response", "", "Lco/bird/android/model/RentalPlan;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/RentalPlansResponse;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLongTermRentalSetupLocationPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongTermRentalSetupLocationPresenter.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupLocationPresenter$onResume$7\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,178:1\n766#2:179\n857#2,2:180\n*S KotlinDebug\n*F\n+ 1 LongTermRentalSetupLocationPresenter.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupLocationPresenter$onResume$7\n*L\n118#1:179\n118#1:180,2\n*E\n"})
    /* renamed from: CA2$l */
    /* loaded from: classes2.dex */
    public static final class C0913l extends Lambda implements Function1<RentalPlansResponse, List<? extends RentalPlan>> {

        /* renamed from: g */
        public static final C0913l f3542g = new C0913l();

        public C0913l() {
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
    /* renamed from: CA2$m */
    /* loaded from: classes2.dex */
    public static final class C0914m extends Lambda implements Function1<List<? extends RentalPlan>, Unit> {
        public C0914m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends RentalPlan> list) {
            invoke2((List<RentalPlan>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<RentalPlan> validPlans) {
            C37791a94<List<RentalPlan>> m88831h = CA2.this.f3525e.m88831h();
            Intrinsics.checkNotNullExpressionValue(validPlans, "validPlans");
            m88831h.accept(validPlans);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "validPlans", "", "Lco/bird/android/model/RentalPlan;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: CA2$n */
    /* loaded from: classes2.dex */
    public static final class C0915n extends Lambda implements Function1<List<? extends RentalPlan>, Unit> {
        public C0915n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends RentalPlan> list) {
            invoke2((List<RentalPlan>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<RentalPlan> validPlans) {
            Intrinsics.checkNotNullExpressionValue(validPlans, "validPlans");
            if (!validPlans.isEmpty()) {
                CA2.this.f3527g.setHeadsUpText(Integer.valueOf(C45871nl4.long_term_rental_pick_location));
            } else {
                CA2.this.f3527g.setHeadsUpText(Integer.valueOf(C45871nl4.long_term_rental_pick_location_out_of_service_area));
            }
        }
    }

    public CA2(InterfaceC32292Cx4 manager, InterfaceC1880Ea analyticsManager, LocationSelectionPresenterImplFactory locationPresenterFactory, QA2 model, ScopeProvider scopeProvider, LocationSelectionUi ui) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(locationPresenterFactory, "locationPresenterFactory");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f3522b = manager;
        this.f3523c = analyticsManager;
        this.f3524d = locationPresenterFactory;
        this.f3525e = model;
        this.f3526f = scopeProvider;
        this.f3527g = ui;
        C0058AG<Boolean> m115950h = C0058AG.m115950h(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(m115950h, "createDefault(false)");
        this.f3529i = m115950h;
    }

    /* renamed from: n */
    public static final void m112704n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final InterfaceC23447K m112703o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m112702p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m112701q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m112700r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m112699s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final Optional m112698t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final Optional m112697u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final InterfaceC23447K m112696v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final List m112695w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m112694x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m112693y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m112692z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
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
        C0058AG<Boolean> c0058ag = this.f3529i;
        Observable<WireLocation> observeLocation = this.f3527g.observeLocation(true);
        LocationSelectionPresenter locationSelectionPresenter = this.f3528h;
        if (locationSelectionPresenter == null || (never = locationSelectionPresenter.observeCompleteRevGeoCodeAddress()) == null) {
            never = Observable.never();
            Intrinsics.checkNotNullExpressionValue(never, "never()");
        }
        Observable combineLatest = Observable.combineLatest(c0058ag, observeLocation, never, this.f3525e.m88831h(), new C0899a());
        Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest…nction(t1, t2, t3, t4) })");
        Observable distinctUntilChanged = combineLatest.startWith((Observable) Boolean.FALSE).distinctUntilChanged();
        final C0900b c0900b = new C0900b();
        Observable<Boolean> doOnNext = distinctUntilChanged.doOnNext(new InterfaceC23484g() { // from class: pA2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CA2.m112704n(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "override fun canProceed(… canProceed))\n      }\n  }");
        return doOnNext;
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: m7 */
    public Observable<EnumC32621Ei0> mo12m7() {
        Observable<EnumC32621Ei0> just = Observable.just(EnumC32621Ei0.NEXT);
        Intrinsics.checkNotNullExpressionValue(just, "just(CheckoutProceedType.NEXT)");
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
        this.f3523c.mo55956N(new RentalLocationScreenShown());
        this.f3527g.showDoneButton(false);
        Optional<WireLocation> value = this.f3525e.m88826m().getValue();
        LocationSelectionModel locationSelectionModel = null;
        if (value != null) {
            wireLocation = value.m59035e();
        } else {
            wireLocation = null;
        }
        Optional<String> value2 = this.f3525e.m88832g().getValue();
        if (value2 != null) {
            str = value2.m59035e();
        } else {
            str = null;
        }
        if (wireLocation != null && str != null) {
            locationSelectionModel = new LocationSelectionModel(wireLocation, str);
        }
        LocationSelectionPresenterImplFactory locationSelectionPresenterImplFactory = this.f3524d;
        LocationSelectionUi locationSelectionUi = this.f3527g;
        ScopeProvider scopeProvider = this.f3526f;
        AbstractC23461c m33071O = AbstractC23461c.m33071O();
        Intrinsics.checkNotNullExpressionValue(m33071O, "never()");
        LocationSelectionPresenterImpl create = locationSelectionPresenterImplFactory.create(locationSelectionUi, scopeProvider, 27.4332d, locationSelectionModel, m33071O);
        this.f3528h = create;
        if (create != null) {
            create.onCreate(bundle);
        }
        LocationSelectionPresenter locationSelectionPresenter = this.f3528h;
        if (locationSelectionPresenter != null) {
            locationSelectionPresenter.setAddressHint(C45871nl4.bird_delivery_address);
        }
    }

    @Override // p000.UX0
    public void onDestroy() {
        LocationSelectionPresenter locationSelectionPresenter = this.f3528h;
        if (locationSelectionPresenter != null) {
            locationSelectionPresenter.onDestroy();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p000.UX0
    public void onLowMemory() {
        LocationSelectionPresenter locationSelectionPresenter = this.f3528h;
        if (locationSelectionPresenter != null) {
            locationSelectionPresenter.onLowMemory();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p000.UX0
    public void onPause() {
        LocationSelectionPresenter locationSelectionPresenter = this.f3528h;
        if (locationSelectionPresenter != null) {
            locationSelectionPresenter.onPause();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p000.UX0
    public void onResume() {
        Observable<String> observeCompleteRevGeoCodeAddress;
        InterfaceC44782lv1.C25814a.m26676g(this);
        LocationSelectionPresenter locationSelectionPresenter = this.f3528h;
        if (locationSelectionPresenter != null) {
            locationSelectionPresenter.onResume();
        }
        Observable<Location> centerLocation = this.f3527g.centerLocation();
        final C0901c c0901c = new C0901c();
        Observable<R> flatMapSingle = centerLocation.flatMapSingle(new InterfaceC23492o() { // from class: tA2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m112703o;
                m112703o = CA2.m112703o(Function1.this, obj);
                return m112703o;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "override fun onResume() …ui.showProgress(it) }\n  }");
        Observable observeOn = C37279Yf5.m74557f0(flatMapSingle, 3).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "override fun onResume() …ui.showProgress(it) }\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f3526f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0906g c0906g = new C0906g(this.f3527g);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: wA2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CA2.m112702p(Function1.this, obj);
            }
        };
        final C0907h c0907h = new C0907h();
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: xA2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CA2.m112699s(Function1.this, obj);
            }
        });
        Observable<WireLocation> observeLocation = this.f3527g.observeLocation(true);
        final C0908i c0908i = C0908i.f3537g;
        Observable<R> map = observeLocation.map(new InterfaceC23492o() { // from class: yA2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m112698t;
                m112698t = CA2.m112698t(Function1.this, obj);
                return m112698t;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "ui.observeLocation(inclu…tional.fromNullable(it) }");
        Object m33094as2 = map.m33094as(AutoDispose.m45239a(this.f3526f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as2).subscribe(this.f3525e.m88826m());
        LocationSelectionPresenter locationSelectionPresenter2 = this.f3528h;
        if (locationSelectionPresenter2 != null && (observeCompleteRevGeoCodeAddress = locationSelectionPresenter2.observeCompleteRevGeoCodeAddress()) != null) {
            final C0909j c0909j = C0909j.f3538g;
            Observable<R> map2 = observeCompleteRevGeoCodeAddress.map(new InterfaceC23492o() { // from class: zA2
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Optional m112697u;
                    m112697u = CA2.m112697u(Function1.this, obj);
                    return m112697u;
                }
            });
            if (map2 != 0) {
                Object m33094as3 = map2.m33094as(AutoDispose.m45239a(this.f3526f));
                Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
                ObservableSubscribeProxy observableSubscribeProxy = (ObservableSubscribeProxy) m33094as3;
                if (observableSubscribeProxy != null) {
                    observableSubscribeProxy.subscribe(this.f3525e.m88832g());
                }
            }
        }
        Observable<WireLocation> observeLocation2 = this.f3527g.observeLocation(true);
        final C0910k c0910k = new C0910k();
        Observable<R> switchMapSingle = observeLocation2.switchMapSingle(new InterfaceC23492o() { // from class: AA2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m112696v;
                m112696v = CA2.m112696v(Function1.this, obj);
                return m112696v;
            }
        });
        final C0913l c0913l = C0913l.f3542g;
        Observable map3 = switchMapSingle.map(new InterfaceC23492o() { // from class: BA2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m112695w;
                m112695w = CA2.m112695w(Function1.this, obj);
                return m112695w;
            }
        });
        final C0914m c0914m = new C0914m();
        Observable observeOn2 = map3.doOnNext(new InterfaceC23484g() { // from class: qA2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CA2.m112694x(Function1.this, obj);
            }
        }).observeOn(C23454a.m33087a());
        final C0915n c0915n = new C0915n();
        Observable doOnNext = observeOn2.doOnNext(new InterfaceC23484g() { // from class: rA2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CA2.m112693y(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "override fun onResume() …ui.showProgress(it) }\n  }");
        Object m33094as4 = C37279Yf5.m74557f0(doOnNext, 3).m33094as(AutoDispose.m45239a(this.f3526f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0903d c0903d = C0903d.f3533g;
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: sA2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CA2.m112692z(Function1.this, obj);
            }
        };
        final C0904e c0904e = new C0904e();
        ((ObservableSubscribeProxy) m33094as4).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: uA2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CA2.m112701q(Function1.this, obj);
            }
        });
        Observable<Boolean> observeOn3 = this.f3529i.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "loadingAvailability\n    …dSchedulers.mainThread())");
        Object m33094as5 = observeOn3.m33094as(AutoDispose.m45239a(this.f3526f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0905f c0905f = new C0905f();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: vA2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CA2.m112700r(Function1.this, obj);
            }
        });
    }

    @Override // p000.UX0
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        LocationSelectionPresenter locationSelectionPresenter = this.f3528h;
        if (locationSelectionPresenter != null) {
            locationSelectionPresenter.onSaveInstanceState(outState);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p000.UX0
    public void onStart() {
        LocationSelectionPresenter locationSelectionPresenter = this.f3528h;
        if (locationSelectionPresenter != null) {
            locationSelectionPresenter.onStart();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p000.UX0
    public void onStop() {
        LocationSelectionPresenter locationSelectionPresenter = this.f3528h;
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
        return InterfaceC44782lv1.C25814a.m26682a(this);
    }
}
