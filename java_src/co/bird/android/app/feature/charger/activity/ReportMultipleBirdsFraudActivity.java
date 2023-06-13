package co.bird.android.app.feature.charger.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import co.bird.android.app.feature.map.p008ui.ReactiveMapEventImpl;
import co.bird.android.app.feature.map.presenter.MapPresenter;
import co.bird.android.app.feature.map.presenter.MapPresenterImpl;
import co.bird.android.app.feature.map.presenter.MapPresenterImplFactory;
import co.bird.android.core.map.BaseMapActivity;
import co.bird.android.model.constant.MapMode;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.CameraPosition;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bD\u0010EJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0014J\b\u0010\n\u001a\u00020\u0004H\u0014J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J*\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00105\u001a\u00020\f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b2\u0010\u001b\u001a\u0004\b3\u00104R\u001b\u0010;\u001a\u0002068TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010C\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006F"}, m28432d2 = {"Lco/bird/android/app/feature/charger/activity/ReportMultipleBirdsFraudActivity;", "Lco/bird/android/core/map/BaseMapActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LcD1;", "map", "A0", "onPause", "onDestroy", "onMapReady", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "q0", "LBK2;", "H", "LBK2;", "B0", "()LBK2;", "setMapMarkerOverridesManager", "(LBK2;)V", "mapMarkerOverridesManager", "LQG4;", "I", "LQG4;", "E0", "()LQG4;", "setMapUiFactory", "(LQG4;)V", "mapUiFactory", "Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory;", "J", "Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory;", "C0", "()Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory;", "setMapPresenterFactory", "(Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory;)V", "mapPresenterFactory", "LeH4;", "K", "LeH4;", "F0", "()LeH4;", "setReportMultipleBirdsPresenterFactory", "(LeH4;)V", "reportMultipleBirdsPresenterFactory", "P", "o0", "()I", "layoutResource", "Lcom/google/android/gms/maps/MapView;", "Q", "Lkotlin/Lazy;", "n0", "()Lcom/google/android/gms/maps/MapView;", "googleMapView", "Lco/bird/android/app/feature/map/presenter/MapPresenter;", "R", "Lco/bird/android/app/feature/map/presenter/MapPresenter;", "mapPresenter", "LTG4;", "S", "LTG4;", "reportMultipleBirdsPresenter", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReportMultipleBirdsFraudActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportMultipleBirdsFraudActivity.kt\nco/bird/android/app/feature/charger/activity/ReportMultipleBirdsFraudActivity\n+ 2 Intent+.kt\nco/bird/android/library/extension/Intent_Kt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,108:1\n6#2:109\n1#3:110\n13#4,2:111\n15#4,2:115\n1109#5,2:113\n*S KotlinDebug\n*F\n+ 1 ReportMultipleBirdsFraudActivity.kt\nco/bird/android/app/feature/charger/activity/ReportMultipleBirdsFraudActivity\n*L\n66#1:109\n66#1:110\n66#1:111,2\n66#1:115,2\n66#1:113,2\n*E\n"})
/* loaded from: classes2.dex */
public final class ReportMultipleBirdsFraudActivity extends BaseMapActivity {

    /* renamed from: H */
    public BK2 f61343H;

    /* renamed from: I */
    public QG4 f61344I;

    /* renamed from: J */
    public MapPresenterImplFactory f61345J;

    /* renamed from: K */
    public InterfaceC40253eH4 f61346K;

    /* renamed from: P */
    public final int f61347P;

    /* renamed from: Q */
    public final Lazy f61348Q;

    /* renamed from: R */
    public MapPresenter f61349R;

    /* renamed from: S */
    public TG4 f61350S;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lcom/google/android/gms/maps/MapView;", "kotlin.jvm.PlatformType", "b", "()Lcom/google/android/gms/maps/MapView;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.charger.activity.ReportMultipleBirdsFraudActivity$a */
    /* loaded from: classes2.dex */
    public static final class C13699a extends Lambda implements Function0<MapView> {
        public C13699a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final MapView invoke() {
            return (MapView) ReportMultipleBirdsFraudActivity.this.findViewById(C36585Vg4.mapView);
        }
    }

    public ReportMultipleBirdsFraudActivity() {
        super(false);
        Lazy lazy;
        this.f61347P = C39311cj4.activity_report_multiple_birds_fraud;
        lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C13699a());
        this.f61348Q = lazy;
    }

    @Override // co.bird.android.core.map.BaseMapActivity
    /* renamed from: A0 */
    public void mo58947A0(C39011cD1 map) {
        Intrinsics.checkNotNullParameter(map, "map");
        super.mo58947A0(map);
        MapPresenter mapPresenter = this.f61349R;
        if (mapPresenter != null) {
            mapPresenter.onResume(m58995p0());
        }
    }

    /* renamed from: B0 */
    public final BK2 m60762B0() {
        BK2 bk2 = this.f61343H;
        if (bk2 != null) {
            return bk2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mapMarkerOverridesManager");
        return null;
    }

    /* renamed from: C0 */
    public final MapPresenterImplFactory m60761C0() {
        MapPresenterImplFactory mapPresenterImplFactory = this.f61345J;
        if (mapPresenterImplFactory != null) {
            return mapPresenterImplFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mapPresenterFactory");
        return null;
    }

    /* renamed from: E0 */
    public final QG4 m60760E0() {
        QG4 qg4 = this.f61344I;
        if (qg4 != null) {
            return qg4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mapUiFactory");
        return null;
    }

    /* renamed from: F0 */
    public final InterfaceC40253eH4 m60759F0() {
        InterfaceC40253eH4 interfaceC40253eH4 = this.f61346K;
        if (interfaceC40253eH4 != null) {
            return interfaceC40253eH4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reportMultipleBirdsPresenterFactory");
        return null;
    }

    @Override // co.bird.android.core.map.BaseMapActivity
    /* renamed from: n0 */
    public MapView mo58944n0() {
        Object value = this.f61348Q.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-googleMapView>(...)");
        return (MapView) value;
    }

    @Override // co.bird.android.core.map.BaseMapActivity
    /* renamed from: o0 */
    public int mo58943o0() {
        return this.f61347P;
    }

    @Override // co.bird.android.core.map.BaseMapActivity, co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        H22.f12748a.mo24073T1(this);
        mo58977D();
    }

    @Override // co.bird.android.core.map.BaseMapActivity, co.bird.android.core.mvp.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Enum] */
    @Override // co.bird.android.core.map.BaseMapActivity, p000.InterfaceC36350Ug3
    public void onMapReady(C39011cD1 map) {
        boolean equals;
        MapMode mapMode;
        MapMode mapMode2;
        Intrinsics.checkNotNullParameter(map, "map");
        super.onMapReady(map);
        C51721xd6 m61676l = map.m61676l();
        m61676l.m4915c(false);
        m61676l.m4917a(false);
        boolean enableUserLocationV2 = mo58955y().m82623f8().m73665a().getRiderMapConfig().getEnableUserLocationV2();
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        String stringExtra = intent.getStringExtra("map_mode");
        boolean z = true;
        if (stringExtra != null) {
            try {
                Object[] enumConstants = MapMode.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants);
                for (Object obj : enumConstants) {
                    equals = StringsKt__StringsJVMKt.equals(((Enum) obj).name(), stringExtra, true);
                    if (equals) {
                        Intrinsics.checkNotNullExpressionValue(obj, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                        mapMode = (Enum) obj;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            } catch (Exception unused) {
                Object[] enumConstants2 = MapMode.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants2);
                for (Object obj2 : enumConstants2) {
                    ?? r7 = (Enum) obj2;
                    if (Intrinsics.areEqual(r7.name(), "UNKNOWN")) {
                        Intrinsics.checkNotNullExpressionValue(obj2, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                        mapMode = r7;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }
        mapMode = null;
        Intrinsics.checkNotNull(mapMode);
        MapMode mapMode3 = mapMode;
        CameraPosition cameraPosition = (CameraPosition) getIntent().getParcelableExtra("camera_position");
        QG4 m60760E0 = m60760E0();
        ReactiveMapEventImpl reactiveMapEventImpl = new ReactiveMapEventImpl(map);
        MapView mo58944n0 = mo58944n0();
        if (mapMode3 == null) {
            mapMode2 = MapMode.RIDER;
        } else {
            mapMode2 = mapMode3;
        }
        BK2 m60762B0 = m60762B0();
        View findViewById = findViewById(C36585Vg4.frameContainer);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.frameContainer)");
        PG4 mo87002a = m60760E0.mo87002a(this, cameraPosition, map, reactiveMapEventImpl, mo58944n0, null, mapMode2, false, enableUserLocationV2, m60762B0, false, findViewById);
        InterfaceC40253eH4 m60759F0 = m60759F0();
        LifecycleScopeProvider<EnumC7097RE> m58963Z = m58963Z();
        View findViewById2 = findViewById(C36585Vg4.infoText);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.infoText)");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = findViewById(C36585Vg4.bottomLayout);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.bottomLayout)");
        View findViewById4 = findViewById(C36585Vg4.btnRedraw);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(R.id.btnRedraw)");
        Button button = (Button) findViewById4;
        View findViewById5 = findViewById(C36585Vg4.btnNext);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(R.id.btnNext)");
        this.f61350S = m60759F0.mo41618a(m58963Z, new C42032hH4(this, textView, findViewById3, button, (Button) findViewById5), mo87002a, mo58957w(), mapMode3);
        MapPresenterImplFactory m60761C0 = m60761C0();
        AndroidLifecycleScopeProvider m58995p0 = m58995p0();
        MapMode mapMode4 = MapMode.RIDER;
        if (cameraPosition != null) {
            z = false;
        }
        MapPresenterImpl create = m60761C0.create(m58995p0, mo87002a, mapMode4, z);
        mo87002a.mo90538zj(false);
        TG4 tg4 = this.f61350S;
        Intrinsics.checkNotNull(tg4);
        tg4.mo44441a();
        this.f61349R = create;
    }

    @Override // co.bird.android.core.map.BaseMapActivity, co.bird.android.core.mvp.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        MapPresenter mapPresenter = this.f61349R;
        if (mapPresenter != null) {
            mapPresenter.onPause();
        }
    }

    @Override // co.bird.android.core.map.BaseMapActivity
    /* renamed from: q0 */
    public void mo58942q0(int i, int i2, Intent intent, C39011cD1 map) {
        Intrinsics.checkNotNullParameter(map, "map");
        TG4 tg4 = this.f61350S;
        if (tg4 != null) {
            tg4.onActivityResult(i, i2, intent);
        }
    }
}
