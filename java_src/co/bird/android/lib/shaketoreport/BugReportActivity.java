package co.bird.android.lib.shaketoreport;

import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/lib/shaketoreport/BugReportActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LM30;", "B", "LM30;", "j0", "()LM30;", "setPresenter", "(LM30;)V", "presenter", "<init>", "()V", C17296a.f69688o, "shaketoreport_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBugReportActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BugReportActivity.kt\nco/bird/android/lib/shaketoreport/BugReportActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n44#2:68\n1#3:69\n*S KotlinDebug\n*F\n+ 1 BugReportActivity.kt\nco/bird/android/lib/shaketoreport/BugReportActivity\n*L\n34#1:68\n*E\n"})
/* loaded from: classes3.dex */
public final class BugReportActivity extends BaseActivity {

    /* renamed from: B */
    public M30 f66050B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/lib/shaketoreport/BugReportActivity$a;", "", "Lco/bird/android/lib/shaketoreport/BugReportActivity;", "activity", "", C17296a.f69688o, "shaketoreport_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: co.bird.android.lib.shaketoreport.BugReportActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC16007a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JB\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\fH&¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/lib/shaketoreport/BugReportActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Landroid/widget/ImageView;", "screenshot", "Landroid/widget/EditText;", "description", "Landroid/widget/Button;", "submit", "Lco/bird/android/lib/shaketoreport/BugReportActivity$a;", C17296a.f69688o, "shaketoreport_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.lib.shaketoreport.BugReportActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC16008a {
            /* renamed from: a */
            InterfaceC16007a mo56102a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance ImageView imageView, @BindsInstance EditText editText, @BindsInstance Button button);
        }

        /* renamed from: a */
        void mo56106a(BugReportActivity bugReportActivity);
    }

    public BugReportActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final M30 m56108j0() {
        M30 m30 = this.f66050B;
        if (m30 != null) {
            return m30;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        File file;
        super.onCreate(bundle);
        setContentView(C40524ek4.activity_bug_report);
        InterfaceC16007a.InterfaceC16008a m56107a = C16009a.m56107a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        View findViewById = findViewById(C48805si4.screenshot);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.screenshot)");
        ImageView imageView = (ImageView) findViewById;
        View findViewById2 = findViewById(C48805si4.description);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.description)");
        EditText editText = (EditText) findViewById2;
        View findViewById3 = findViewById(C48805si4.submitReport);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.submitReport)");
        m56107a.mo56102a(m21419a, this, m45197b, imageView, editText, (Button) findViewById3).mo56106a(this);
        String stringExtra = getIntent().getStringExtra("screenshot");
        if (stringExtra != null) {
            file = new File(stringExtra);
        } else {
            file = null;
        }
        M30 m56108j0 = m56108j0();
        S30 s30 = S30.f33090a;
        m56108j0.m95919t(s30.m86061b(this), file, s30.m86060c(this));
    }
}
