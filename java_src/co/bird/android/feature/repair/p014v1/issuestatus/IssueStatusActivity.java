package co.bird.android.feature.repair.p014v1.issuestatus;

import android.app.Application;
import android.os.Bundle;
import android.os.Parcelable;
import ch.qos.logback.core.joran.action.Action;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.Issue;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00102\u00020\u0001:\u0003\u0011\u0012\u0013B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/feature/repair/v1/issuestatus/IssueStatusActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Loa2;", "B", "Loa2;", "j0", "()Loa2;", "setPresenter", "(Loa2;)V", "presenter", "<init>", "()V", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, C17296a.f69688o, "b", "c", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIssueStatusActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IssueStatusActivity.kt\nco/bird/android/feature/repair/v1/issuestatus/IssueStatusActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,78:1\n44#2:79\n*S KotlinDebug\n*F\n+ 1 IssueStatusActivity.kt\nco/bird/android/feature/repair/v1/issuestatus/IssueStatusActivity\n*L\n38#1:79\n*E\n"})
/* renamed from: co.bird.android.feature.repair.v1.issuestatus.IssueStatusActivity */
/* loaded from: classes3.dex */
public final class IssueStatusActivity extends BaseActivity {

    /* renamed from: C */
    public static final C15176a f64575C = new C15176a(null);

    /* renamed from: B */
    public InterfaceC46352oa2 f64576B;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/feature/repair/v1/issuestatus/IssueStatusActivity$a;", "", "", "REQUEST_CODE", "I", "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.repair.v1.issuestatus.IssueStatusActivity$a */
    /* loaded from: classes3.dex */
    public static final class C15176a {
        public /* synthetic */ C15176a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C15176a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/repair/v1/issuestatus/IssueStatusActivity$b;", "", "Lco/bird/android/feature/repair/v1/issuestatus/IssueStatusActivity;", "activity", "", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC15179c.class})
    /* renamed from: co.bird.android.feature.repair.v1.issuestatus.IssueStatusActivity$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC15177b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/repair/v1/issuestatus/IssueStatusActivity$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "La4;", "binding", "Lco/bird/android/feature/repair/v1/issuestatus/IssueStatusActivity$b;", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.repair.v1.issuestatus.IssueStatusActivity$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15178a {
            /* renamed from: a */
            InterfaceC15177b mo57590a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C10556a4 c10556a4);
        }

        /* renamed from: a */
        void mo57589a(IssueStatusActivity issueStatusActivity);
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'¨\u0006\t"}, m28432d2 = {"Lco/bird/android/feature/repair/v1/issuestatus/IssueStatusActivity$c;", "", "Lwa2;", "impl", "Lva2;", C17296a.f69688o, "Lsa2;", "Loa2;", "b", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.repair.v1.issuestatus.IssueStatusActivity$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC15179c {
        @Binds
        /* renamed from: a */
        InterfaceC50501va2 m57593a(C51094wa2 c51094wa2);

        @Binds
        /* renamed from: b */
        InterfaceC46352oa2 m57592b(C48723sa2 c48723sa2);
    }

    public IssueStatusActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC46352oa2 m57594j0() {
        InterfaceC46352oa2 interfaceC46352oa2 = this.f64576B;
        if (interfaceC46352oa2 != null) {
            return interfaceC46352oa2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C10556a4 m71940c = C10556a4.m71940c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m71940c, "inflate(layoutInflater)");
        setContentView(m71940c.getRoot());
        InterfaceC15177b.InterfaceC15178a m57591a = C15180a.m57591a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m57591a.mo57590a(m21419a, this, m45197b, m71940c).mo57589a(this);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("issue");
        Intrinsics.checkNotNull(parcelableExtra);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("repairs");
        Intrinsics.checkNotNull(parcelableArrayListExtra);
        m57594j0().mo13988a((Issue) parcelableExtra, parcelableArrayListExtra);
    }
}
