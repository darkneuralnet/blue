package p000;

import android.content.Intent;
import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BarcodeScanType;
import co.bird.android.model.Warehouse;
import co.bird.android.model.wire.WireLocationKt;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\"\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, m28432d2 = {"LAr5;", "Lvr5;", "", C17296a.f69688o, "onBackPressed", "q", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "LGt5;", "LGt5;", "serviceCenterManager", "Ldr4;", "b", "Ldr4;", "locationManager", "Lcom/uber/autodispose/ScopeProvider;", "c", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LCr5;", DateTokenConverter.CONVERTER_KEY, "LCr5;", "ui", "Le13;", "e", "Le13;", "navigator", "<init>", "(LGt5;Ldr4;Lcom/uber/autodispose/ScopeProvider;LCr5;Le13;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSelectServiceCenterPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectServiceCenterPresenter.kt\nco/bird/android/feature/servicecenter/SelectServiceCenterPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,80:1\n180#2:81\n180#2:82\n*S KotlinDebug\n*F\n+ 1 SelectServiceCenterPresenter.kt\nco/bird/android/feature/servicecenter/SelectServiceCenterPresenterImpl\n*L\n40#1:81\n52#1:82\n*E\n"})
/* renamed from: Ar5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C31771Ar5 implements InterfaceC50674vr5 {

    /* renamed from: a */
    public final InterfaceC33193Gt5 f1261a;

    /* renamed from: b */
    public final InterfaceC40001dr4 f1262b;

    /* renamed from: c */
    public final ScopeProvider f1263c;

    /* renamed from: d */
    public final InterfaceC32239Cr5 f1264d;

    /* renamed from: e */
    public final InterfaceC40099e13 f1265e;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001aZ\u0012&\b\u0001\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003 \u0006*,\u0012&\b\u0001\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/location/Location;", "location", "Lio/reactivex/K;", "LHM4;", "", "Lco/bird/android/model/Warehouse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Landroid/location/Location;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ar5$a */
    /* loaded from: classes3.dex */
    public static final class C0288a extends Lambda implements Function1<Location, InterfaceC23447K<? extends HM4<List<? extends Warehouse>>>> {
        public C0288a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends HM4<List<Warehouse>>> invoke(Location location) {
            Intrinsics.checkNotNullParameter(location, "location");
            return C31771Ar5.this.f1261a.mo94629e(WireLocationKt.toLocation$default(location, null, 1, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001 \u0003*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LHM4;", "", "Lco/bird/android/model/Warehouse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSelectServiceCenterPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectServiceCenterPresenter.kt\nco/bird/android/feature/servicecenter/SelectServiceCenterPresenterImpl$onCreate$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1#2:81\n*E\n"})
    /* renamed from: Ar5$b */
    /* loaded from: classes3.dex */
    public static final class C0289b extends Lambda implements Function1<HM4<List<? extends Warehouse>>, Unit> {
        public C0289b() {
            super(1);
        }

        /* renamed from: a */
        public final void m115024a(HM4<List<Warehouse>> hm4) {
            if (!hm4.m103939f()) {
                C31771Ar5.this.f1264d.error(new Throwable(String.valueOf(hm4.m103943b())));
                return;
            }
            List<Warehouse> m103944a = hm4.m103944a();
            if (m103944a != null) {
                C31771Ar5.this.f1264d.mo109848Xe(m103944a);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<List<? extends Warehouse>> hm4) {
            m115024a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ar5$c */
    /* loaded from: classes3.dex */
    public static final class C0290c extends Lambda implements Function1<Throwable, Unit> {
        public C0290c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable e) {
            InterfaceC32239Cr5 interfaceC32239Cr5 = C31771Ar5.this.f1264d;
            Intrinsics.checkNotNullExpressionValue(e, "e");
            interfaceC32239Cr5.error(e);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Warehouse;", "kotlin.jvm.PlatformType", "warehouse", "", C17296a.f69688o, "(Lco/bird/android/model/Warehouse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ar5$d */
    /* loaded from: classes3.dex */
    public static final class C0291d extends Lambda implements Function1<Warehouse, Unit> {
        public C0291d() {
            super(1);
        }

        /* renamed from: a */
        public final void m115023a(Warehouse warehouse) {
            Intent intent = new Intent();
            intent.putExtra("warehouse", warehouse);
            C31771Ar5.this.f1265e.mo37029e4(-1, intent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Warehouse warehouse) {
            m115023a(warehouse);
            return Unit.INSTANCE;
        }
    }

    public C31771Ar5(InterfaceC33193Gt5 serviceCenterManager, InterfaceC40001dr4 locationManager, ScopeProvider scopeProvider, InterfaceC32239Cr5 ui, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(serviceCenterManager, "serviceCenterManager");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f1261a = serviceCenterManager;
        this.f1262b = locationManager;
        this.f1263c = scopeProvider;
        this.f1264d = ui;
        this.f1265e = navigator;
    }

    /* renamed from: f */
    public static final InterfaceC23447K m115029f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m115028g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final void m115027h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m115026i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC50674vr5
    /* renamed from: a */
    public void mo7918a() {
        Observable<Location> subscribeOn = this.f1262b.mo43626f(true).take(1L).subscribeOn(C24542a.m31932c());
        final C0288a c0288a = new C0288a();
        Observable observeOn = subscribeOn.flatMapSingle(new InterfaceC23492o() { // from class: wr5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m115029f;
                m115029f = C31771Ar5.m115029f(Function1.this, obj);
                return m115029f;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "override fun onCreate() …ULT_OK, data)\n      }\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f1263c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0289b c0289b = new C0289b();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: xr5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31771Ar5.m115028g(Function1.this, obj);
            }
        };
        final C0290c c0290c = new C0290c();
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: yr5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31771Ar5.m115027h(Function1.this, obj);
            }
        });
        Object m33094as2 = this.f1264d.mo109849V1().m33094as(AutoDispose.m45239a(this.f1263c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0291d c0291d = new C0291d();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: zr5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31771Ar5.m115026i(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC50674vr5
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 10009 && i2 == -1 && intent != null) {
            this.f1265e.mo37190C1(i2, intent);
        }
    }

    @Override // p000.InterfaceC50674vr5
    public void onBackPressed() {
        this.f1265e.mo37030e3();
    }

    @Override // p000.InterfaceC50674vr5
    /* renamed from: q */
    public void mo7917q() {
        InterfaceC40099e13.C19924a.goToBarcodeScanner$default(this.f1265e, BarcodeScanType.WAREHOUSE_ID, null, 2, null);
    }
}
