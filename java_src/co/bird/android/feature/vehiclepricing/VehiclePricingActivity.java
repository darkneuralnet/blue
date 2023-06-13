package co.bird.android.feature.vehiclepricing;

import android.app.Application;
import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.VehiclePricingDetails;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import dagger.Binds;
import dagger.Component;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lcn6;", "B", "Lcn6;", "j0", "()Lcn6;", "setPresenter", "(Lcn6;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "c", "vehicle-pricing_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class VehiclePricingActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC39353cn6 f65861B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$a;", "", "Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity;", "activity", "", C17296a.f69688o, "vehicle-pricing_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {C15883b.class})
    /* renamed from: co.bird.android.feature.vehiclepricing.VehiclePricingActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15881a {

        @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\bH&¨\u0006\n"}, m28432d2 = {"Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$a$a;", "", "Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;", "vehiclePricingModule", "b", "LlG2;", "mainComponent", C17296a.f69688o, "Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$a;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "vehicle-pricing_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @Component.Builder
        /* renamed from: co.bird.android.feature.vehiclepricing.VehiclePricingActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15882a {
            /* renamed from: a */
            InterfaceC15882a mo56332a(InterfaceC44393lG2 interfaceC44393lG2);

            /* renamed from: b */
            InterfaceC15882a mo56331b(C15883b c15883b);

            InterfaceC15881a build();
        }

        /* renamed from: a */
        void mo56328a(VehiclePricingActivity vehiclePricingActivity);
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J\b\u0010\n\u001a\u00020\tH\u0007R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;", "", "Lco/bird/android/core/mvp/BaseActivity;", C17296a.f69688o, "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "c", "Lco/bird/android/model/VehiclePricingDetails;", DateTokenConverter.CONVERTER_KEY, "", "b", "Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity;", "Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity;", "activity", "<init>", "(Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity;)V", "vehicle-pricing_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module(includes = {InterfaceC15884c.class})
    /* renamed from: co.bird.android.feature.vehiclepricing.VehiclePricingActivity$b */
    /* loaded from: classes3.dex */
    public static final class C15883b {

        /* renamed from: a */
        public final VehiclePricingActivity f65862a;

        public C15883b(VehiclePricingActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f65862a = activity;
        }

        @Provides
        /* renamed from: a */
        public final BaseActivity m56339a() {
            return this.f65862a;
        }

        @Provides
        /* renamed from: b */
        public final boolean m56338b() {
            return this.f65862a.getIntent().getBooleanExtra("vehicle_pricing_from_scan", false);
        }

        @Provides
        /* renamed from: c */
        public final LifecycleScopeProvider<EnumC7097RE> m56337c() {
            return this.f65862a;
        }

        @Provides
        /* renamed from: d */
        public final VehiclePricingDetails m56336d() {
            return (VehiclePricingDetails) this.f65862a.getIntent().getParcelableExtra("vehicle_pricing_details");
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'¨\u0006\t"}, m28432d2 = {"Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$c;", "", "Lnn6;", "impl", "Lmn6;", C17296a.f69688o, "Ljn6;", "Lcn6;", "b", "vehicle-pricing_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.vehiclepricing.VehiclePricingActivity$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC15884c {
        @Binds
        /* renamed from: a */
        InterfaceC45300mn6 m56335a(C45893nn6 c45893nn6);

        @Binds
        /* renamed from: b */
        InterfaceC39353cn6 m56334b(C43521jn6 c43521jn6);
    }

    public VehiclePricingActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC39353cn6 m56340j0() {
        InterfaceC39353cn6 interfaceC39353cn6 = this.f65861B;
        if (interfaceC39353cn6 != null) {
            return interfaceC39353cn6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C35910Sj4.activity_vehicle_pricing);
        InterfaceC15881a.InterfaceC15882a m56333a = C15885a.m56333a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        m56333a.mo56332a(c46172oG2.m21419a(application)).mo56331b(new C15883b(this)).build().mo56328a(this);
        m56340j0().mo29922a();
    }
}
