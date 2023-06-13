package co.bird.android.feature.ridepass.p017v1;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.ScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/feature/ridepass/v1/RidePassActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "LfV4;", "B", "LfV4;", "j0", "()LfV4;", "setPresenter", "(LfV4;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.feature.ridepass.v1.RidePassActivity */
/* loaded from: classes3.dex */
public final class RidePassActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC40972fV4 f64790B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/ridepass/v1/RidePassActivity$a;", "", "Lco/bird/android/feature/ridepass/v1/RidePassActivity;", "activity", "", C17296a.f69688o, "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {AbstractC15300b.class})
    /* renamed from: co.bird.android.feature.ridepass.v1.RidePassActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15298a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, m28432d2 = {"Lco/bird/android/feature/ridepass/v1/RidePassActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lco/bird/android/feature/ridepass/v1/RidePassActivity$a;", C17296a.f69688o, "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.ridepass.v1.RidePassActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15299a {
            /* renamed from: a */
            InterfaceC15298a mo57422a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity);
        }

        /* renamed from: a */
        void mo57421a(RidePassActivity ridePassActivity);
    }

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH'¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/feature/ridepass/v1/RidePassActivity$b;", "", "LwV4;", "presenter", "LfV4;", C17296a.f69688o, "LKV4;", "ui", "LJV4;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/core/mvp/BaseActivity;", "impl", "Lcom/uber/autodispose/ScopeProvider;", "c", "<init>", "()V", "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.ridepass.v1.RidePassActivity$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC15300b {

        /* renamed from: a */
        public static final C15301a f64791a = new C15301a(null);

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, m28432d2 = {"Lco/bird/android/feature/ridepass/v1/RidePassActivity$b$a;", "", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "", C17296a.f69688o, "<init>", "()V", "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @Module
        /* renamed from: co.bird.android.feature.ridepass.v1.RidePassActivity$b$a */
        /* loaded from: classes3.dex */
        public static final class C15301a {
            public /* synthetic */ C15301a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Provides
            @JvmStatic
            /* renamed from: a */
            public final String m57424a(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                String stringExtra = activity.getIntent().getStringExtra("ride_pass_link_code");
                Intrinsics.checkNotNull(stringExtra);
                return stringExtra;
            }

            private C15301a() {
            }
        }

        @Provides
        @JvmStatic
        /* renamed from: b */
        public static final String m57427b(BaseActivity baseActivity) {
            return f64791a.m57424a(baseActivity);
        }

        @Binds
        /* renamed from: a */
        public abstract InterfaceC40972fV4 m57428a(C51051wV4 c51051wV4);

        @Binds
        /* renamed from: c */
        public abstract ScopeProvider m57426c(BaseActivity baseActivity);

        @Binds
        /* renamed from: d */
        public abstract JV4 m57425d(KV4 kv4);
    }

    public RidePassActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC40972fV4 m57429j0() {
        InterfaceC40972fV4 interfaceC40972fV4 = this.f64790B;
        if (interfaceC40972fV4 != null) {
            return interfaceC40972fV4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m57429j0().onActivityResult(i, i2, intent);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C33102Gj4.activity_ride_pass);
        InterfaceC15298a.InterfaceC15299a m57423a = C15302a.m57423a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        m57423a.mo57422a(c46172oG2.m21419a(application), this).mo57421a(this);
        m57429j0().mo6757a();
    }
}
