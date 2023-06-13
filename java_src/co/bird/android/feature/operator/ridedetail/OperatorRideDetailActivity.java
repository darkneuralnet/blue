package co.bird.android.feature.operator.ridedetail;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/feature/operator/ridedetail/OperatorRideDetailActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LZs3;", "B", "LZs3;", "j0", "()LZs3;", "setPresenter", "(LZs3;)V", "presenter", "<init>", "()V", C17296a.f69688o, "ridedetail_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorRideDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorRideDetailActivity.kt\nco/bird/android/feature/operator/ridedetail/OperatorRideDetailActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,50:1\n44#2:51\n*S KotlinDebug\n*F\n+ 1 OperatorRideDetailActivity.kt\nco/bird/android/feature/operator/ridedetail/OperatorRideDetailActivity\n*L\n27#1:51\n*E\n"})
/* loaded from: classes3.dex */
public final class OperatorRideDetailActivity extends BaseActivity {

    /* renamed from: B */
    public C37628Zs3 f64289B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/operator/ridedetail/OperatorRideDetailActivity$a;", "", "Lco/bird/android/feature/operator/ridedetail/OperatorRideDetailActivity;", "activity", "", C17296a.f69688o, "ridedetail_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: co.bird.android.feature.operator.ridedetail.OperatorRideDetailActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15023a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/operator/ridedetail/OperatorRideDetailActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lz4;", "operatorRideDetailBinding", "Lco/bird/android/feature/operator/ridedetail/OperatorRideDetailActivity$a;", C17296a.f69688o, "ridedetail_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.operator.ridedetail.OperatorRideDetailActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15024a {
            /* renamed from: a */
            InterfaceC15023a mo57871a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C30900z4 c30900z4);
        }

        /* renamed from: a */
        void mo57870a(OperatorRideDetailActivity operatorRideDetailActivity);
    }

    public OperatorRideDetailActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final C37628Zs3 m57873j0() {
        C37628Zs3 c37628Zs3 = this.f64289B;
        if (c37628Zs3 != null) {
            return c37628Zs3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C30900z4 m1856c = C30900z4.m1856c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m1856c, "inflate(layoutInflater)");
        setContentView(m1856c.getRoot());
        InterfaceC15023a.InterfaceC15024a m57872a = C15025a.m57872a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m57872a.mo57871a(m21419a, this, m45197b, m1856c).mo57870a(this);
        C37628Zs3 m57873j0 = m57873j0();
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        m57873j0.m72368b(intent);
    }
}
