package co.bird.android.feature.servicecenter.batches.vehiclesinbatch;

import android.app.Application;
import android.os.Bundle;
import android.os.Parcelable;
import ch.qos.logback.core.joran.action.Action;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBatch;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/batches/vehiclesinbatch/VehiclesInBatchActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "LXn6;", "B", "LXn6;", "j0", "()LXn6;", "setPresenter", "(LXn6;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVehiclesInBatchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehiclesInBatchActivity.kt\nco/bird/android/feature/servicecenter/batches/vehiclesinbatch/VehiclesInBatchActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,79:1\n44#2:80\n*S KotlinDebug\n*F\n+ 1 VehiclesInBatchActivity.kt\nco/bird/android/feature/servicecenter/batches/vehiclesinbatch/VehiclesInBatchActivity\n*L\n34#1:80\n*E\n"})
/* loaded from: classes3.dex */
public final class VehiclesInBatchActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC37118Xn6 f65316B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/batches/vehiclesinbatch/VehiclesInBatchActivity$a;", "", "Lco/bird/android/feature/servicecenter/batches/vehiclesinbatch/VehiclesInBatchActivity;", "activity", "", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC15602b.class})
    /* renamed from: co.bird.android.feature.servicecenter.batches.vehiclesinbatch.VehiclesInBatchActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15600a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J8\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH&¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/batches/vehiclesinbatch/VehiclesInBatchActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "Lq6;", "binding", "Lco/bird/android/model/wire/WireBatch;", "batch", "Lco/bird/android/feature/servicecenter/batches/vehiclesinbatch/VehiclesInBatchActivity$a;", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.servicecenter.batches.vehiclesinbatch.VehiclesInBatchActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15601a {
            /* renamed from: a */
            InterfaceC15600a mo56873a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C27489q6 c27489q6, @BindsInstance WireBatch wireBatch);
        }

        /* renamed from: a */
        void mo56872a(VehiclesInBatchActivity vehiclesInBatchActivity);
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/batches/vehiclesinbatch/VehiclesInBatchActivity$b;", "", "Lqo6;", "impl", "Lpo6;", C17296a.f69688o, "Lmo6;", "LXn6;", "b", "LVn6;", "LTn6;", "c", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.servicecenter.batches.vehiclesinbatch.VehiclesInBatchActivity$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC15602b {
        @Binds
        /* renamed from: a */
        InterfaceC47089po6 m56877a(C47682qo6 c47682qo6);

        @Binds
        /* renamed from: b */
        InterfaceC37118Xn6 m56876b(C45310mo6 c45310mo6);

        @Binds
        /* renamed from: c */
        InterfaceC36182Tn6 m56875c(C36650Vn6 c36650Vn6);
    }

    public VehiclesInBatchActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC37118Xn6 m56878j0() {
        InterfaceC37118Xn6 interfaceC37118Xn6 = this.f65316B;
        if (interfaceC37118Xn6 != null) {
            return interfaceC37118Xn6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C27489q6 m18188c = C27489q6.m18188c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m18188c, "inflate(layoutInflater)");
        setContentView(m18188c.getRoot());
        Parcelable parcelableExtra = getIntent().getParcelableExtra("batch");
        Intrinsics.checkNotNull(parcelableExtra);
        WireBatch wireBatch = (WireBatch) parcelableExtra;
        InterfaceC15600a.InterfaceC15601a m56874a = C15603a.m56874a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m56874a.mo56873a(m21419a, this, m45197b, m18188c, wireBatch).mo56872a(this);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m56878j0().refresh();
    }
}
