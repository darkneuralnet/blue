package co.bird.android.feature.servicecenter.batches.batchsearch;

import android.app.Application;
import android.os.Bundle;
import ch.qos.logback.core.joran.action.Action;
import co.bird.android.core.mvp.BaseActivity;
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
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/batches/batchsearch/BatchSearchActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LtF;", "B", "LtF;", "getPresenter", "()LtF;", "setPresenter", "(LtF;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBatchSearchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BatchSearchActivity.kt\nco/bird/android/feature/servicecenter/batches/batchsearch/BatchSearchActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,69:1\n44#2:70\n*S KotlinDebug\n*F\n+ 1 BatchSearchActivity.kt\nco/bird/android/feature/servicecenter/batches/batchsearch/BatchSearchActivity\n*L\n31#1:70\n*E\n"})
/* loaded from: classes3.dex */
public final class BatchSearchActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC28663tF f65283B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/batches/batchsearch/BatchSearchActivity$a;", "", "Lco/bird/android/feature/servicecenter/batches/batchsearch/BatchSearchActivity;", "activity", "", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC15579b.class})
    /* renamed from: co.bird.android.feature.servicecenter.batches.batchsearch.BatchSearchActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15577a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/batches/batchsearch/BatchSearchActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "LY2;", "binding", "Lco/bird/android/feature/servicecenter/batches/batchsearch/BatchSearchActivity$a;", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.servicecenter.batches.batchsearch.BatchSearchActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15578a {
            /* renamed from: a */
            InterfaceC15577a mo56898a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C9603Y2 c9603y2);
        }

        /* renamed from: a */
        void mo56904a(BatchSearchActivity batchSearchActivity);
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/batches/batchsearch/BatchSearchActivity$b;", "", "LNF;", "impl", "LJF;", "c", "LHF;", "LtF;", "b", "LqF;", "LoF;", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.servicecenter.batches.batchsearch.BatchSearchActivity$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC15579b {
        @Binds
        /* renamed from: a */
        InterfaceC26874oF m56908a(C27561qF c27561qF);

        @Binds
        /* renamed from: b */
        InterfaceC28663tF m56907b(C3095HF c3095hf);

        @Binds
        /* renamed from: c */
        InterfaceC3940JF m56906c(C5519NF c5519nf);
    }

    public BatchSearchActivity() {
        super(false, null, null, 7, null);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C9603Y2 m75821c = C9603Y2.m75821c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m75821c, "inflate(layoutInflater)");
        setContentView(m75821c.getRoot());
        InterfaceC15577a.InterfaceC15578a m56905a = C15580a.m56905a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m56905a.mo56898a(m21419a, this, m45197b, m75821c).mo56904a(this);
    }
}
