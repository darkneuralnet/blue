package p000;

import android.content.Intent;
import android.location.Location;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BirdProblem;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0001\u0010\u000e\u001a\u00020\f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0002R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, m28432d2 = {"LOH4;", "LKH4;", "Landroid/content/Intent;", "intent", "", "b", "e", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", C17296a.f69688o, "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "LSH4;", "LSH4;", "ui", "Le13;", "c", "Le13;", "navigator", "LJy4;", DateTokenConverter.CONVERTER_KEY, "LJy4;", "repairClient", "Lco/bird/android/model/wire/WireBird;", "Lco/bird/android/model/wire/WireBird;", "bird", "Landroid/location/Location;", "f", "Landroid/location/Location;", "location", "", "g", "Z", "startOver", "<init>", "(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LSH4;Le13;LJy4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReportedDamagesPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportedDamagesPresenter.kt\nco/bird/android/app/feature/legacyrepair/reporteddamages/ReportedDamagesPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,91:1\n180#2:92\n180#2:93\n*S KotlinDebug\n*F\n+ 1 ReportedDamagesPresenter.kt\nco/bird/android/app/feature/legacyrepair/reporteddamages/ReportedDamagesPresenterImpl\n*L\n55#1:92\n85#1:93\n*E\n"})
/* renamed from: OH4 */
/* loaded from: classes2.dex */
public final class OH4 implements KH4 {

    /* renamed from: a */
    public final LifecycleScopeProvider<EnumC7097RE> f26286a;

    /* renamed from: b */
    public final SH4 f26287b;

    /* renamed from: c */
    public final InterfaceC40099e13 f26288c;

    /* renamed from: d */
    public final InterfaceC33939Jy4 f26289d;

    /* renamed from: e */
    public WireBird f26290e;

    /* renamed from: f */
    public Location f26291f;

    /* renamed from: g */
    public boolean f26292g;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: OH4$a */
    /* loaded from: classes2.dex */
    public static final class C5936a extends Lambda implements Function1<Unit, Unit> {
        public C5936a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13 interfaceC40099e13 = OH4.this.f26288c;
            WireBird wireBird = OH4.this.f26290e;
            Location location = null;
            if (wireBird == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
                wireBird = null;
            }
            Location location2 = OH4.this.f26291f;
            if (location2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("location");
            } else {
                location = location2;
            }
            interfaceC40099e13.mo37001j2(wireBird, location, OH4.this.f26292g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001 \u0003*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LHM4;", "", "Lco/bird/android/model/BirdProblem;", "kotlin.jvm.PlatformType", "damagesResponse", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OH4$b */
    /* loaded from: classes2.dex */
    public static final class C5937b extends Lambda implements Function1<HM4<List<? extends BirdProblem>>, Unit> {
        public C5937b() {
            super(1);
        }

        /* renamed from: a */
        public final void m92566a(HM4<List<BirdProblem>> hm4) {
            WireBird wireBird = null;
            Location location = null;
            if (hm4.m103939f()) {
                List<BirdProblem> m103944a = hm4.m103944a();
                if (m103944a != null) {
                    OH4 oh4 = OH4.this;
                    if (m103944a.isEmpty()) {
                        oh4.f26288c.close();
                        InterfaceC40099e13 interfaceC40099e13 = oh4.f26288c;
                        WireBird wireBird2 = oh4.f26290e;
                        if (wireBird2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("bird");
                            wireBird2 = null;
                        }
                        Location location2 = oh4.f26291f;
                        if (location2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("location");
                        } else {
                            location = location2;
                        }
                        interfaceC40099e13.mo37001j2(wireBird2, location, oh4.f26292g);
                        return;
                    }
                    oh4.f26287b.mo83971Mi();
                    oh4.f26287b.mo83969j4(m103944a);
                    return;
                }
                return;
            }
            Object[] objArr = new Object[2];
            WireBird wireBird3 = OH4.this.f26290e;
            if (wireBird3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
            } else {
                wireBird = wireBird3;
            }
            objArr[0] = wireBird.getId();
            objArr[1] = hm4.m103940e();
            C41318g46.m40160d("Error response when loading list of problems for Bird %s with error body %s", objArr);
            OH4.this.f26287b.error(C45871nl4.mechanic_reported_damages_failed_to_load_damages);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<List<? extends BirdProblem>> hm4) {
            m92566a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: OH4$c */
    /* loaded from: classes2.dex */
    public static final class C5938c extends Lambda implements Function1<Throwable, Unit> {
        public C5938c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            Object[] objArr = new Object[1];
            WireBird wireBird = OH4.this.f26290e;
            if (wireBird == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
                wireBird = null;
            }
            objArr[0] = wireBird.getId();
            C41318g46.m40158f(th, "Could not load list of problems for Bird %s", objArr);
            OH4.this.f26287b.error(C45871nl4.mechanic_reported_damages_failed_to_load_damages);
        }
    }

    public OH4(LifecycleScopeProvider<EnumC7097RE> scopeProvider, SH4 ui, InterfaceC40099e13 navigator, InterfaceC33939Jy4 repairClient) {
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(repairClient, "repairClient");
        this.f26286a = scopeProvider;
        this.f26287b = ui;
        this.f26288c = navigator;
        this.f26289d = repairClient;
    }

    /* renamed from: f */
    public static final void m92569f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m92568g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final void m92567h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.KH4
    /* renamed from: b */
    public void mo92573b(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Parcelable parcelableExtra = intent.getParcelableExtra("bird");
        Intrinsics.checkNotNull(parcelableExtra);
        this.f26290e = (WireBird) parcelableExtra;
        Parcelable parcelableExtra2 = intent.getParcelableExtra("location");
        Intrinsics.checkNotNull(parcelableExtra2);
        this.f26291f = (Location) parcelableExtra2;
        this.f26292g = intent.getBooleanExtra("inspection_start_over", false);
        InterfaceC33939Jy4 interfaceC33939Jy4 = this.f26289d;
        WireBird wireBird = this.f26290e;
        WireBird wireBird2 = null;
        if (wireBird == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
            wireBird = null;
        }
        Observable<HM4<List<BirdProblem>>> subscribeOn = interfaceC33939Jy4.m99485c(wireBird.getId()).observeOn(C23454a.m33087a()).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "repairClient.birdProblem…scribeOn(Schedulers.io())");
        Object m33094as = subscribeOn.m33094as(AutoDispose.m45239a(this.f26286a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5937b c5937b = new C5937b();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: LH4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                OH4.m92568g(Function1.this, obj);
            }
        };
        final C5938c c5938c = new C5938c();
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: MH4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                OH4.m92567h(Function1.this, obj);
            }
        });
        SH4 sh4 = this.f26287b;
        WireBird wireBird3 = this.f26290e;
        if (wireBird3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
        } else {
            wireBird2 = wireBird3;
        }
        sh4.mo83968m(wireBird2.getCode());
        m92570e();
    }

    /* renamed from: e */
    public final void m92570e() {
        Observable<Unit> observeOn = this.f26287b.mo83970N5().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.startInspectionClicks…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f26286a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5936a c5936a = new C5936a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: NH4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                OH4.m92569f(Function1.this, obj);
            }
        });
    }
}
