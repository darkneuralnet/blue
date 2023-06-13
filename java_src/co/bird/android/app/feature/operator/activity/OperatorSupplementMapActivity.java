package co.bird.android.app.feature.operator.activity;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import ch.qos.logback.core.joran.action.Action;
import co.bird.android.core.map.BaseMapActivity;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.OperatorSupplementMapPurpose;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.MapView;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
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
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0002/0B\u0007¢\u0006\u0004\b-\u0010.J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0017J*\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u001a\u0010\u0017\u001a\u00020\t8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+¨\u00061"}, m28432d2 = {"Lco/bird/android/app/feature/operator/activity/OperatorSupplementMapActivity;", "Lco/bird/android/core/map/BaseMapActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LcD1;", "map", "onMapReady", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "q0", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "H", "I", "o0", "()I", "layoutResource", "Lcom/google/android/gms/maps/MapView;", "Lkotlin/Lazy;", "n0", "()Lcom/google/android/gms/maps/MapView;", "googleMapView", "LGt3;", "J", "LGt3;", "B0", "()LGt3;", "setPresenter", "(LGt3;)V", "presenter", "LB4;", "K", "LB4;", "binding", "Lco/bird/android/model/OperatorSupplementMapPurpose;", "P", "Lco/bird/android/model/OperatorSupplementMapPurpose;", "mapPurpose", "<init>", "()V", C17296a.f69688o, "b", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorSupplementMapActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorSupplementMapActivity.kt\nco/bird/android/app/feature/operator/activity/OperatorSupplementMapActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,120:1\n44#2:121\n*S KotlinDebug\n*F\n+ 1 OperatorSupplementMapActivity.kt\nco/bird/android/app/feature/operator/activity/OperatorSupplementMapActivity\n*L\n66#1:121\n*E\n"})
/* loaded from: classes2.dex */
public final class OperatorSupplementMapActivity extends BaseMapActivity {

    /* renamed from: H */
    public final int f61720H;

    /* renamed from: I */
    public final Lazy f61721I;

    /* renamed from: J */
    public InterfaceC33191Gt3 f61722J;

    /* renamed from: K */
    public C0384B4 f61723K;

    /* renamed from: P */
    public OperatorSupplementMapPurpose f61724P;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/app/feature/operator/activity/OperatorSupplementMapActivity$a;", "", "Lco/bird/android/app/feature/operator/activity/OperatorSupplementMapActivity;", "activity", "", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC13926b.class})
    /* renamed from: co.bird.android.app.feature.operator.activity.OperatorSupplementMapActivity$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC13924a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JB\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\fH&¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/app/feature/operator/activity/OperatorSupplementMapActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "LcD1;", "map", "LDQ3;", "permissionManager", "LB4;", "binding", "Lco/bird/android/app/feature/operator/activity/OperatorSupplementMapActivity$a;", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.feature.operator.activity.OperatorSupplementMapActivity$a$a */
        /* loaded from: classes2.dex */
        public interface InterfaceC13925a {
            /* renamed from: a */
            InterfaceC13924a mo60233a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C39011cD1 c39011cD1, @BindsInstance DQ3 dq3, @BindsInstance C0384B4 c0384b4);
        }

        /* renamed from: a */
        void mo60232a(OperatorSupplementMapActivity operatorSupplementMapActivity);
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'¨\u0006\t"}, m28432d2 = {"Lco/bird/android/app/feature/operator/activity/OperatorSupplementMapActivity$b;", "", "LVy3;", "impl", "Lxu3;", C17296a.f69688o, "Lsu3;", "LGt3;", "b", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.app.feature.operator.activity.OperatorSupplementMapActivity$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC13926b {
        @Binds
        /* renamed from: a */
        InterfaceC51888xu3 m60291a(C36746Vy3 c36746Vy3);

        @Binds
        /* renamed from: b */
        InterfaceC33191Gt3 m60290b(C48924su3 c48924su3);
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lcom/google/android/gms/maps/MapView;", "kotlin.jvm.PlatformType", "b", "()Lcom/google/android/gms/maps/MapView;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.operator.activity.OperatorSupplementMapActivity$c */
    /* loaded from: classes2.dex */
    public static final class C13927c extends Lambda implements Function0<MapView> {
        public C13927c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final MapView invoke() {
            return (MapView) OperatorSupplementMapActivity.this.findViewById(C36585Vg4.mapView);
        }
    }

    public OperatorSupplementMapActivity() {
        super(true);
        Lazy lazy;
        this.f61720H = C39311cj4.activity_operator_supplement_map;
        lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C13927c());
        this.f61721I = lazy;
    }

    /* renamed from: B0 */
    public final InterfaceC33191Gt3 m60292B0() {
        InterfaceC33191Gt3 interfaceC33191Gt3 = this.f61722J;
        if (interfaceC33191Gt3 != null) {
            return interfaceC33191Gt3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.map.BaseMapActivity
    /* renamed from: n0 */
    public MapView mo58944n0() {
        Object value = this.f61721I.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-googleMapView>(...)");
        return (MapView) value;
    }

    @Override // co.bird.android.core.map.BaseMapActivity
    /* renamed from: o0 */
    public int mo58943o0() {
        return this.f61720H;
    }

    @Override // co.bird.android.core.map.BaseMapActivity, co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0384B4 m114758a = C0384B4.m114758a(((ViewGroup) findViewById(16908290)).getChildAt(0));
        Intrinsics.checkNotNullExpressionValue(m114758a, "bind(findViewById<ViewGr…d.content).getChildAt(0))");
        this.f61723K = m114758a;
        if (m114758a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m114758a = null;
        }
        setSupportActionBar(m114758a.f1613x);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70245B(true);
        }
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.mo70212v(true);
        }
        String stringExtra = getIntent().getStringExtra("operator_supplement_map_purpose");
        Intrinsics.checkNotNull(stringExtra);
        this.f61724P = OperatorSupplementMapPurpose.valueOf(stringExtra);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        OperatorSupplementMapPurpose operatorSupplementMapPurpose = this.f61724P;
        if (operatorSupplementMapPurpose == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapPurpose");
            operatorSupplementMapPurpose = null;
        }
        if (operatorSupplementMapPurpose == OperatorSupplementMapPurpose.LOCATE_BIRD) {
            getMenuInflater().inflate(C36387Uk4.menu_operator_supplement_map_activity, menu);
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // co.bird.android.core.map.BaseMapActivity, p000.InterfaceC36350Ug3
    @SuppressLint({"MissingPermission"})
    public void onMapReady(C39011cD1 map) {
        Intrinsics.checkNotNullParameter(map, "map");
        super.onMapReady(map);
        C51721xd6 m61676l = map.m61676l();
        m61676l.m4915c(false);
        m61676l.m4917a(true);
        InterfaceC13924a.InterfaceC13925a m60234a = C13975b.m60234a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        DQ3 mo58956x = mo58956x();
        C0384B4 c0384b4 = this.f61723K;
        if (c0384b4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c0384b4 = null;
        }
        m60234a.mo60233a(m21419a, this, m45197b, map, mo58956x, c0384b4).mo60232a(this);
        InterfaceC33191Gt3 m60292B0 = m60292B0();
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        m60292B0.mo13486b(intent);
    }

    @Override // co.bird.android.core.map.BaseMapActivity
    /* renamed from: q0 */
    public void mo58942q0(int i, int i2, Intent intent, C39011cD1 map) {
        Intrinsics.checkNotNullParameter(map, "map");
        super.mo58942q0(i, i2, intent, map);
        m60292B0().onActivityResult(i, i2, intent);
    }
}
