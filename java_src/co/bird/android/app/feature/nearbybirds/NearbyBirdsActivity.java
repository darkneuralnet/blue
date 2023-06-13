package co.bird.android.app.feature.nearbybirds;

import android.app.Application;
import android.content.ClipboardManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import io.reactivex.AbstractC23437E;
import io.reactivex.schedulers.C24542a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u0007¢\u0006\u0004\b \u0010!J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006%"}, m28432d2 = {"Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "onDestroy", "onBackPressed", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "Lu23;", "B", "Lu23;", "j0", "()Lu23;", "setPresenter", "(Lu23;)V", "presenter", "Ly23;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Ly23;", "k0", "()Ly23;", "m0", "(Ly23;)V", "ui", "<init>", "()V", "D", C17296a.f69688o, "b", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNearbyBirdsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NearbyBirdsActivity.kt\nco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n44#2:120\n1#3:121\n*S KotlinDebug\n*F\n+ 1 NearbyBirdsActivity.kt\nco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity\n*L\n49#1:120\n*E\n"})
/* loaded from: classes2.dex */
public final class NearbyBirdsActivity extends BaseActivity {

    /* renamed from: D */
    public static final C13907a f61655D = new C13907a(null);

    /* renamed from: E */
    public static final int f61656E = 8;

    /* renamed from: B */
    public C49596u23 f61657B;

    /* renamed from: C */
    public InterfaceC51967y23 f61658C;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity$a;", "", "", "REQUEST_CODE", "I", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.nearbybirds.NearbyBirdsActivity$a */
    /* loaded from: classes2.dex */
    public static final class C13907a {
        public /* synthetic */ C13907a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C13907a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity$b;", "", "Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity;", "activity", "", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: co.bird.android.app.feature.nearbybirds.NearbyBirdsActivity$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC13908b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JL\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\fH&¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Landroid/content/ClipboardManager;", "clipboardManager", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Ly23;", "ui", "Lio/reactivex/E;", "bufferScheduler", "intervalScheduler", "Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity$b;", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.feature.nearbybirds.NearbyBirdsActivity$b$a */
        /* loaded from: classes2.dex */
        public interface InterfaceC13909a {
            /* renamed from: a */
            InterfaceC13908b mo60340a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ClipboardManager clipboardManager, @BindsInstance ScopeProvider scopeProvider, @BindsInstance InterfaceC51967y23 interfaceC51967y23, @BindsInstance AbstractC23437E abstractC23437E, @BindsInstance AbstractC23437E abstractC23437E2);
        }

        /* renamed from: a */
        void mo60339a(NearbyBirdsActivity nearbyBirdsActivity);
    }

    public NearbyBirdsActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final C49596u23 m60344j0() {
        C49596u23 c49596u23 = this.f61657B;
        if (c49596u23 != null) {
            return c49596u23;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    /* renamed from: k0 */
    public final InterfaceC51967y23 m60343k0() {
        InterfaceC51967y23 interfaceC51967y23 = this.f61658C;
        if (interfaceC51967y23 != null) {
            return interfaceC51967y23;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ui");
        return null;
    }

    /* renamed from: m0 */
    public final void m60342m0(InterfaceC51967y23 interfaceC51967y23) {
        Intrinsics.checkNotNullParameter(interfaceC51967y23, "<set-?>");
        this.f61658C = interfaceC51967y23;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (m60344j0().m11017T()) {
            super.onBackPressed();
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        setContentView(C39311cj4.activity_nearby_birds);
        m60342m0(new C52560z23(this));
        InterfaceC13908b.InterfaceC13909a m60341a = C13910a.m60341a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        InterfaceC51967y23 m60343k0 = m60343k0();
        Object systemService = getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        AbstractC23437E m31934a = C24542a.m31934a();
        AbstractC23437E m31934a2 = C24542a.m31934a();
        Intrinsics.checkNotNullExpressionValue(m31934a, "computation()");
        Intrinsics.checkNotNullExpressionValue(m31934a2, "computation()");
        m60341a.mo60340a(m21419a, this, (ClipboardManager) systemService, m45197b, m60343k0, m31934a, m31934a2).mo60339a(this);
        C49596u23 m60344j0 = m60344j0();
        if (getCallingActivity() != null) {
            z = true;
        } else {
            z = false;
        }
        m60344j0.m11016U(z, getIntent().getExtras());
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(C36387Uk4.menu_nearby_birds, menu);
        MenuItem findItem = menu.findItem(C36585Vg4.infoButton);
        Drawable icon = findItem.getIcon();
        if (icon != null) {
            drawable = P61.m90834r(icon);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            P61.m90838n(drawable, NA0.m94301c(this, C32364Df4.white));
        }
        findItem.setIcon(drawable);
        m60343k0().mo1925Z0(menu);
        m60344j0().m11007b0();
        return true;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m60344j0().m11003d0();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (!m60344j0().m11001e0(item) && !super.onOptionsItemSelected(item)) {
            return false;
        }
        return true;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m60344j0().m10991j0();
    }
}
