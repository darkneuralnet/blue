package co.bird.android.feature.merchant.activity;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.Component;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/feature/merchant/activity/MerchantHistoryDetailsActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LB66;", "B", "LB66;", "j0", "()LB66;", "setPresenter", "(LB66;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.merchant"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class MerchantHistoryDetailsActivity extends BaseActivity {

    /* renamed from: B */
    public B66 f64156B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/merchant/activity/MerchantHistoryDetailsActivity$a;", "", "Lco/bird/android/feature/merchant/activity/MerchantHistoryDetailsActivity;", "activity", "", C17296a.f69688o, "co.bird.android.feature.merchant"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {C14955b.class})
    /* renamed from: co.bird.android.feature.merchant.activity.MerchantHistoryDetailsActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC14953a {

        @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\bH&¨\u0006\n"}, m28432d2 = {"Lco/bird/android/feature/merchant/activity/MerchantHistoryDetailsActivity$a$a;", "", "Lco/bird/android/feature/merchant/activity/MerchantHistoryDetailsActivity$b;", "merchantHistoryModule", "b", "LlG2;", "mainComponent", C17296a.f69688o, "Lco/bird/android/feature/merchant/activity/MerchantHistoryDetailsActivity$a;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "co.bird.android.feature.merchant"}, m28431k = 1, m28430mv = {1, 8, 0})
        @Component.Builder
        /* renamed from: co.bird.android.feature.merchant.activity.MerchantHistoryDetailsActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC14954a {
            /* renamed from: a */
            InterfaceC14954a mo57954a(InterfaceC44393lG2 interfaceC44393lG2);

            /* renamed from: b */
            InterfaceC14954a mo57953b(C14955b c14955b);

            InterfaceC14953a build();
        }

        /* renamed from: a */
        void mo57950a(MerchantHistoryDetailsActivity merchantHistoryDetailsActivity);
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\r"}, m28432d2 = {"Lco/bird/android/feature/merchant/activity/MerchantHistoryDetailsActivity$b;", "", "Lco/bird/android/core/mvp/BaseActivity;", C17296a.f69688o, "Lcom/uber/autodispose/ScopeProvider;", "c", "LL66;", "b", "Lco/bird/android/feature/merchant/activity/MerchantHistoryDetailsActivity;", "Lco/bird/android/feature/merchant/activity/MerchantHistoryDetailsActivity;", "activity", "<init>", "(Lco/bird/android/feature/merchant/activity/MerchantHistoryDetailsActivity;)V", "co.bird.android.feature.merchant"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module(includes = {InterfaceC14956a.class})
    @SourceDebugExtension({"SMAP\nMerchantHistoryDetailsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MerchantHistoryDetailsActivity.kt\nco/bird/android/feature/merchant/activity/MerchantHistoryDetailsActivity$MerchantTransactionModule\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,76:1\n44#2:77\n*S KotlinDebug\n*F\n+ 1 MerchantHistoryDetailsActivity.kt\nco/bird/android/feature/merchant/activity/MerchantHistoryDetailsActivity$MerchantTransactionModule\n*L\n48#1:77\n*E\n"})
    /* renamed from: co.bird.android.feature.merchant.activity.MerchantHistoryDetailsActivity$b */
    /* loaded from: classes3.dex */
    public static final class C14955b {

        /* renamed from: a */
        public final MerchantHistoryDetailsActivity f64157a;

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/merchant/activity/MerchantHistoryDetailsActivity$b$a;", "", "LJ66;", "impl", "LB66;", C17296a.f69688o, "co.bird.android.feature.merchant"}, m28431k = 1, m28430mv = {1, 8, 0})
        @Module
        /* renamed from: co.bird.android.feature.merchant.activity.MerchantHistoryDetailsActivity$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC14956a {
            @Binds
            /* renamed from: a */
            B66 m57977a(J66 j66);
        }

        public C14955b(MerchantHistoryDetailsActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f64157a = activity;
        }

        @Provides
        /* renamed from: a */
        public final BaseActivity m57980a() {
            return this.f64157a;
        }

        @Provides
        /* renamed from: b */
        public final L66 m57979b() {
            return new M66(this.f64157a);
        }

        @Provides
        /* renamed from: c */
        public final ScopeProvider m57978c() {
            AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this.f64157a);
            Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
            return m45197b;
        }
    }

    public MerchantHistoryDetailsActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final B66 m57981j0() {
        B66 b66 = this.f64156B;
        if (b66 != null) {
            return b66;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C46444oj4.activity_merchant_history_details);
        mo58977D();
        InterfaceC14953a.InterfaceC14954a m57955a = C14973b.m57955a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        m57955a.mo57954a(c46172oG2.m21419a(application)).mo57953b(new C14955b(this)).build().mo57950a(this);
        B66 m57981j0 = m57981j0();
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        m57981j0.mo101142b(intent);
    }
}
