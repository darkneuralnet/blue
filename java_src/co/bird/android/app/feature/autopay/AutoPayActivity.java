package co.bird.android.app.feature.autopay;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\n"}, m28432d2 = {"Lco/bird/android/app/feature/autopay/AutoPayActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "<init>", "()V", "B", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class AutoPayActivity extends BaseActivity {

    /* renamed from: B */
    public static final C13672a f61274B = new C13672a(null);

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, m28432d2 = {"Lco/bird/android/app/feature/autopay/AutoPayActivity$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", C17296a.f69688o, "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.autopay.AutoPayActivity$a */
    /* loaded from: classes2.dex */
    public static final class C13672a {
        public /* synthetic */ C13672a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent m60827a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Intent(context, AutoPayActivity.class);
        }

        private C13672a() {
        }
    }

    public AutoPayActivity() {
        super(false, null, null, 7, null);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C39311cj4.autopay);
        LifecycleScopeProvider<EnumC7097RE> m58963Z = m58963Z();
        InterfaceC32604Eg1 m58971M = m58971M();
        C22454gl m58965X = m58965X();
        InterfaceC44647lh6 m58962b0 = m58962b0();
        InterfaceC47617qi1 m58970P = m58970P();
        C22454gl m58965X2 = m58965X();
        C36207Tq4 mo58955y = mo58955y();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        new C22485gr(m58963Z, m58971M, m58965X, m58962b0, m58970P, m58965X2, mo58955y, resources, new C13678c(this, null, null, 6, null), mo58957w(), true).m37405a();
    }
}
