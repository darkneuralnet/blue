package co.bird.android.feature.hardcount;

import android.app.Application;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\t*\u0001\u001f\u0018\u00002\u00020\u0001:\u0002%&B\u0007¢\u0006\u0004\b#\u0010$J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\f\u001a\u00020\u0004H\u0014J\b\u0010\r\u001a\u00020\u0004H\u0014R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001e\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006'"}, m28432d2 = {"Lco/bird/android/feature/hardcount/HardCountActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "onResume", "onPause", "LrG1;", "B", "LrG1;", "j0", "()LrG1;", "setPresenter", "(LrG1;)V", "presenter", "Landroid/net/ConnectivityManager;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Landroid/net/ConnectivityManager;", "connectivityManager", "Landroid/net/NetworkRequest;", "kotlin.jvm.PlatformType", "D", "Landroid/net/NetworkRequest;", "networkRequest", "co/bird/android/feature/hardcount/HardCountActivity$c", "E", "Lco/bird/android/feature/hardcount/HardCountActivity$c;", "networkCallback", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHardCountActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardCountActivity.kt\nco/bird/android/feature/hardcount/HardCountActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n44#2:124\n1#3:125\n*S KotlinDebug\n*F\n+ 1 HardCountActivity.kt\nco/bird/android/feature/hardcount/HardCountActivity\n*L\n57#1:124\n*E\n"})
/* loaded from: classes3.dex */
public final class HardCountActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC47950rG1 f64052B;

    /* renamed from: C */
    public ConnectivityManager f64053C;

    /* renamed from: D */
    public final NetworkRequest f64054D;

    /* renamed from: E */
    public final C14868c f64055E;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/hardcount/HardCountActivity$a;", "", "Lco/bird/android/feature/hardcount/HardCountActivity;", "activity", "", C17296a.f69688o, "co.bird.android.feature.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {AbstractC14867b.class})
    /* renamed from: co.bird.android.feature.hardcount.HardCountActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC14865a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/hardcount/HardCountActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LH3;", "binding", "Lco/bird/android/feature/hardcount/HardCountActivity$a;", C17296a.f69688o, "co.bird.android.feature.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.hardcount.HardCountActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC14866a {
            /* renamed from: a */
            InterfaceC14865a mo58095a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C3013H3 c3013h3);
        }

        /* renamed from: a */
        void mo58094a(HardCountActivity hardCountActivity);
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/feature/hardcount/HardCountActivity$b;", "", "LpH1;", "impl", "LoH1;", "c", "LZG1;", "LrG1;", "b", "LgF1;", "LeF1;", C17296a.f69688o, "<init>", "()V", "co.bird.android.feature.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.hardcount.HardCountActivity$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC14867b {
        @Binds
        /* renamed from: a */
        public abstract InterfaceC40232eF1 m58099a(C41418gF1 c41418gF1);

        @Binds
        /* renamed from: b */
        public abstract InterfaceC47950rG1 m58098b(ZG1 zg1);

        @Binds
        /* renamed from: c */
        public abstract InterfaceC46180oH1 m58097c(C46773pH1 c46773pH1);
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m28432d2 = {"co/bird/android/feature/hardcount/HardCountActivity$c", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "", "onAvailable", "onLost", "co.bird.android.feature.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.hardcount.HardCountActivity$c */
    /* loaded from: classes3.dex */
    public static final class C14868c extends ConnectivityManager.NetworkCallback {
        public C14868c() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            super.onAvailable(network);
            HardCountActivity.this.m58100j0().mo16139c(true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            super.onLost(network);
            HardCountActivity.this.m58100j0().mo16139c(false);
        }
    }

    public HardCountActivity() {
        super(false, null, null, 7, null);
        this.f64054D = new NetworkRequest.Builder().addTransportType(1).build();
        this.f64055E = new C14868c();
    }

    /* renamed from: j0 */
    public final InterfaceC47950rG1 m58100j0() {
        InterfaceC47950rG1 interfaceC47950rG1 = this.f64052B;
        if (interfaceC47950rG1 != null) {
            return interfaceC47950rG1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        super.onActivityResult(i, i2, intent);
        if ((i == 10001 || i == 10003) && intent != null && (stringExtra = intent.getStringExtra("raw_scan_result")) != null) {
            m58100j0().mo16140b(stringExtra);
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C3013H3 m104473c = C3013H3.m104473c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m104473c, "inflate(layoutInflater)");
        setContentView(m104473c.getRoot());
        Object systemService = getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f64053C = (ConnectivityManager) systemService;
        InterfaceC14865a.InterfaceC14866a m58096a = C14869a.m58096a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m58096a.mo58095a(m21419a, this, m45197b, m104473c).mo58094a(this);
        m58100j0().mo16141a(getIntent().getIntExtra("hard_count_expected_scans", -1), getIntent().getStringExtra("hard_count_session_id"));
    }

    @Override // co.bird.android.core.mvp.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        m58100j0().onPause();
        ConnectivityManager connectivityManager = this.f64053C;
        if (connectivityManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectivityManager");
            connectivityManager = null;
        }
        connectivityManager.unregisterNetworkCallback(this.f64055E);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m58100j0().onResume();
        ConnectivityManager connectivityManager = this.f64053C;
        if (connectivityManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectivityManager");
            connectivityManager = null;
        }
        connectivityManager.registerNetworkCallback(this.f64054D, this.f64055E);
    }
}
