package co.bird.android.feature.birdairdiagnostics;

import android.app.Application;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/feature/birdairdiagnostics/BirdAirScanActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "LZI;", "B", "LZI;", "j0", "()LZI;", "setPresenter", "(LZI;)V", "presenter", "<init>", "()V", C17296a.f69688o, "co.bird.android.feature.bird-air-diagnostics"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdAirScanActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdAirScanActivity.kt\nco/bird/android/feature/birdairdiagnostics/BirdAirScanActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,70:1\n44#2:71\n*S KotlinDebug\n*F\n+ 1 BirdAirScanActivity.kt\nco/bird/android/feature/birdairdiagnostics/BirdAirScanActivity\n*L\n31#1:71\n*E\n"})
/* loaded from: classes3.dex */
public final class BirdAirScanActivity extends BaseActivity {

    /* renamed from: B */
    public C10223ZI f63275B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/birdairdiagnostics/BirdAirScanActivity$a;", "", "Lco/bird/android/feature/birdairdiagnostics/BirdAirScanActivity;", "activity", "", C17296a.f69688o, "co.bird.android.feature.bird-air-diagnostics"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: co.bird.android.feature.birdairdiagnostics.BirdAirScanActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC14519a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/birdairdiagnostics/BirdAirScanActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LZ2;", "binding", "Lco/bird/android/feature/birdairdiagnostics/BirdAirScanActivity$a;", C17296a.f69688o, "co.bird.android.feature.bird-air-diagnostics"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.birdairdiagnostics.BirdAirScanActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC14520a {
            /* renamed from: a */
            InterfaceC14519a mo58821a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C10104Z2 c10104z2);
        }

        /* renamed from: a */
        void mo58825a(BirdAirScanActivity birdAirScanActivity);
    }

    public BirdAirScanActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final C10223ZI m58827j0() {
        C10223ZI c10223zi = this.f63275B;
        if (c10223zi != null) {
            return c10223zi;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C10104Z2 m73818c = C10104Z2.m73818c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m73818c, "inflate(layoutInflater)");
        setContentView(m73818c.getRoot());
        InterfaceC14519a.InterfaceC14520a m58826a = C14521a.m58826a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m58826a.mo58821a(m21419a, this, m45197b, m73818c).mo58825a(this);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(C34281Lk4.menu_bird_air_scan, menu);
        return true;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C38105ah4.refresh) {
            m58827j0().m73349i();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m58827j0().m73352f();
    }
}
