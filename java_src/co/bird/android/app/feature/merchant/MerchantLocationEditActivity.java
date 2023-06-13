package co.bird.android.app.feature.merchant;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import co.bird.android.app.feature.merchant.InterfaceC13905b;
import co.bird.android.core.map.BaseMapActivity;
import co.bird.android.model.wire.WireLocation;
import com.google.android.gms.maps.MapView;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00118\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"Lco/bird/android/app/feature/merchant/MerchantLocationEditActivity;", "Lco/bird/android/core/map/BaseMapActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LcD1;", "map", "A0", "LUQ2;", "H", "LUQ2;", "B0", "()LUQ2;", "setLocationEditPresenter", "(LUQ2;)V", "locationEditPresenter", "", "I", "o0", "()I", "layoutResource", "Lcom/google/android/gms/maps/MapView;", "J", "Lkotlin/Lazy;", "n0", "()Lcom/google/android/gms/maps/MapView;", "googleMapView", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class MerchantLocationEditActivity extends BaseMapActivity {

    /* renamed from: H */
    public UQ2 f61639H;

    /* renamed from: I */
    public final int f61640I;

    /* renamed from: J */
    public final Lazy f61641J;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lcom/google/android/gms/maps/MapView;", "kotlin.jvm.PlatformType", "b", "()Lcom/google/android/gms/maps/MapView;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.merchant.MerchantLocationEditActivity$a */
    /* loaded from: classes2.dex */
    public static final class C13899a extends Lambda implements Function0<MapView> {
        public C13899a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final MapView invoke() {
            return (MapView) MerchantLocationEditActivity.this.findViewById(C36585Vg4.mapView);
        }
    }

    public MerchantLocationEditActivity() {
        super(false);
        Lazy lazy;
        this.f61640I = C39311cj4.activity_merchant_location_edit;
        lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C13899a());
        this.f61641J = lazy;
    }

    @Override // co.bird.android.core.map.BaseMapActivity
    /* renamed from: A0 */
    public void mo58947A0(C39011cD1 map) {
        Intrinsics.checkNotNullParameter(map, "map");
        super.mo58947A0(map);
        m60353B0().onResume();
    }

    /* renamed from: B0 */
    public final UQ2 m60353B0() {
        UQ2 uq2 = this.f61639H;
        if (uq2 != null) {
            return uq2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("locationEditPresenter");
        return null;
    }

    @Override // co.bird.android.core.map.BaseMapActivity
    /* renamed from: n0 */
    public MapView mo58944n0() {
        Object value = this.f61641J.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-googleMapView>(...)");
        return (MapView) value;
    }

    @Override // co.bird.android.core.map.BaseMapActivity
    /* renamed from: o0 */
    public int mo58943o0() {
        return this.f61640I;
    }

    @Override // co.bird.android.core.map.BaseMapActivity, co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo58977D();
        InterfaceC13905b.InterfaceC13906a m60351a = C13900a.m60351a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        m60351a.mo60345a(c46172oG2.m21419a(applicationContext), this).mo60346a(this);
        UQ2 m60353B0 = m60353B0();
        String stringExtra = getIntent().getStringExtra("merchant_site_id");
        Intrinsics.checkNotNull(stringExtra);
        String stringExtra2 = getIntent().getStringExtra("merchant_id");
        Intrinsics.checkNotNull(stringExtra2);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("location");
        Intrinsics.checkNotNull(parcelableExtra);
        m60353B0.mo36427a(stringExtra, stringExtra2, (WireLocation) parcelableExtra);
    }
}
