package co.bird.android.feature.p010ar.parking;

import android.app.Application;
import android.content.Intent;
import android.os.Parcelable;
import co.bird.android.app.feature.map.p008ui.ReactiveMapEventImpl;
import co.bird.android.app.feature.map.p008ui.renderer.MapPolygonableRenderer;
import co.bird.android.app.feature.map.p008ui.renderer.ParkingNestRenderer;
import co.bird.android.core.map.BaseMapActivity;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.p010ar.view.SemiCircleMapView;
import co.bird.android.model.wire.WireRide;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.MapView;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002,-B\u0007¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0016J*\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\t8\u0014X\u0094D¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010(¨\u0006."}, m28432d2 = {"Lco/bird/android/feature/ar/parking/VpsParkingActivity;", "Lco/bird/android/core/map/BaseMapActivity;", "LcD1;", "map", "", "onMapReady", "A0", "onPause", "onBackPressed", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "q0", "Lnv6;", "H", "Lnv6;", "C0", "()Lnv6;", "setPresenterFactory", "(Lnv6;)V", "presenterFactory", "Lfv6;", "I", "Lfv6;", "presenter", "J", "o0", "()I", "layoutResource", "Ls6;", "K", "Lkotlin/Lazy;", "B0", "()Ls6;", "layoutBinding", "Lcom/google/android/gms/maps/MapView;", "P", "n0", "()Lcom/google/android/gms/maps/MapView;", "googleMapView", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.ar-parking"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVpsParkingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VpsParkingActivity.kt\nco/bird/android/feature/ar/parking/VpsParkingActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,117:1\n44#2:118\n*S KotlinDebug\n*F\n+ 1 VpsParkingActivity.kt\nco/bird/android/feature/ar/parking/VpsParkingActivity\n*L\n57#1:118\n*E\n"})
/* renamed from: co.bird.android.feature.ar.parking.VpsParkingActivity */
/* loaded from: classes3.dex */
public final class VpsParkingActivity extends BaseMapActivity {

    /* renamed from: H */
    public InterfaceC45973nv6 f63145H;

    /* renamed from: I */
    public C41229fv6 f63146I;

    /* renamed from: J */
    public final int f63147J;

    /* renamed from: K */
    public final Lazy f63148K;

    /* renamed from: P */
    public final Lazy f63149P;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/ar/parking/VpsParkingActivity$a;", "", "Lco/bird/android/feature/ar/parking/VpsParkingActivity;", "activity", "", C17296a.f69688o, "co.bird.android.feature.ar-parking"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {AbstractC14469b.class})
    /* renamed from: co.bird.android.feature.ar.parking.VpsParkingActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC14467a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J`\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0013\u001a\u00020\u0012H&¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/feature/ar/parking/VpsParkingActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Ls6;", "binding", "LcD1;", "googleMap", "LDQ3;", "permissionManager", "Lco/bird/android/model/wire/WireRide;", "ride", "Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;", "polygonableRenderer", "Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;", "parkingNestRenderer", "Lco/bird/android/feature/ar/parking/VpsParkingActivity$a;", C17296a.f69688o, "co.bird.android.feature.ar-parking"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.ar.parking.VpsParkingActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC14468a {
            /* renamed from: a */
            InterfaceC14467a mo58938a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C28178s6 c28178s6, @BindsInstance C39011cD1 c39011cD1, @BindsInstance DQ3 dq3, @BindsInstance WireRide wireRide, @BindsInstance MapPolygonableRenderer mapPolygonableRenderer, @BindsInstance ParkingNestRenderer parkingNestRenderer);
        }

        /* renamed from: a */
        void mo58937a(VpsParkingActivity vpsParkingActivity);
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lco/bird/android/feature/ar/parking/VpsParkingActivity$b;", "", "<init>", "()V", "co.bird.android.feature.ar-parking"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.ar.parking.VpsParkingActivity$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC14469b {
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lco/bird/android/feature/ar/view/SemiCircleMapView;", "b", "()Lco/bird/android/feature/ar/view/SemiCircleMapView;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.ar.parking.VpsParkingActivity$c */
    /* loaded from: classes3.dex */
    public static final class C14470c extends Lambda implements Function0<SemiCircleMapView> {
        public C14470c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final SemiCircleMapView invoke() {
            return VpsParkingActivity.this.getLayoutBinding().f108253f.m58881i();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Ls6;", "b", "()Ls6;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.ar.parking.VpsParkingActivity$d */
    /* loaded from: classes3.dex */
    public static final class C14471d extends Lambda implements Function0<C28178s6> {
        public C14471d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C28178s6 invoke() {
            C28178s6 m14783c = C28178s6.m14783c(VpsParkingActivity.this.getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(m14783c, "inflate(layoutInflater)");
            return m14783c;
        }
    }

    public VpsParkingActivity() {
        super(true);
        Lazy lazy;
        Lazy lazy2;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new C14471d());
        this.f63148K = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new C14470c());
        this.f63149P = lazy2;
    }

    @Override // co.bird.android.core.map.BaseMapActivity
    /* renamed from: A0 */
    public void mo58947A0(C39011cD1 map) {
        Intrinsics.checkNotNullParameter(map, "map");
        super.mo58947A0(map);
        C41229fv6 c41229fv6 = this.f63146I;
        if (c41229fv6 != null) {
            c41229fv6.m40515Y(map);
        }
    }

    @Override // co.bird.android.core.map.BaseMapActivity
    /* renamed from: B0 */
    public C28178s6 getLayoutBinding() {
        return (C28178s6) this.f63148K.getValue();
    }

    /* renamed from: C0 */
    public final InterfaceC45973nv6 m58945C0() {
        InterfaceC45973nv6 interfaceC45973nv6 = this.f63145H;
        if (interfaceC45973nv6 != null) {
            return interfaceC45973nv6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenterFactory");
        return null;
    }

    @Override // co.bird.android.core.map.BaseMapActivity
    /* renamed from: n0 */
    public MapView mo58944n0() {
        return (MapView) this.f63149P.getValue();
    }

    @Override // co.bird.android.core.map.BaseMapActivity
    /* renamed from: o0 */
    public int mo58943o0() {
        return this.f63147J;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C41229fv6 c41229fv6 = this.f63146I;
        if (c41229fv6 != null) {
            c41229fv6.m40518V();
        }
        super.onBackPressed();
    }

    @Override // co.bird.android.core.map.BaseMapActivity, p000.InterfaceC36350Ug3
    public void onMapReady(C39011cD1 map) {
        Intrinsics.checkNotNullParameter(map, "map");
        super.onMapReady(map);
        ReactiveMapEventImpl reactiveMapEventImpl = new ReactiveMapEventImpl(map);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("ride");
        Intrinsics.checkNotNull(parcelableExtra);
        WireRide wireRide = (WireRide) parcelableExtra;
        MapPolygonableRenderer mapPolygonableRenderer = new MapPolygonableRenderer(map, reactiveMapEventImpl, this, C36441Uq4.m80769c(mo58955y(), wireRide.getBird()).getRiderMapConfig(), m58968R());
        ParkingNestRenderer parkingNestRenderer = new ParkingNestRenderer(this, map, mo58955y().m82623f8().m73665a().getParkingConfig().getEnableRiderParkingNestRadius());
        InterfaceC14467a.InterfaceC14468a m58939a = C14472a.m58939a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m58939a.mo58938a(m21419a, this, m45197b, getLayoutBinding(), map, mo58956x(), wireRide, mapPolygonableRenderer, parkingNestRenderer).mo58937a(this);
        C41229fv6 create = m58945C0().create();
        this.f63146I = create;
        if (create != null) {
            create.m40517W();
        }
    }

    @Override // co.bird.android.core.map.BaseMapActivity, co.bird.android.core.mvp.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        C41229fv6 c41229fv6 = this.f63146I;
        if (c41229fv6 != null) {
            c41229fv6.m40516X();
        }
        super.onPause();
    }

    @Override // co.bird.android.core.map.BaseMapActivity
    /* renamed from: q0 */
    public void mo58942q0(int i, int i2, Intent intent, C39011cD1 map) {
        Intrinsics.checkNotNullParameter(map, "map");
        super.onActivityResult(i, i2, intent);
    }
}
