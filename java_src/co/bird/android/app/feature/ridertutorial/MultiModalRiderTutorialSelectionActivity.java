package co.bird.android.app.feature.ridertutorial;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/app/feature/ridertutorial/MultiModalRiderTutorialSelectionActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LHW2;", "B", "LHW2;", "j0", "()LHW2;", "setPresenterFactory", "(LHW2;)V", "presenterFactory", "<init>", "()V", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class MultiModalRiderTutorialSelectionActivity extends BaseActivity {

    /* renamed from: C */
    public static final C14304a f62712C = new C14304a(null);

    /* renamed from: D */
    public static final int f62713D = 8;

    /* renamed from: B */
    public HW2 f62714B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, m28432d2 = {"Lco/bird/android/app/feature/ridertutorial/MultiModalRiderTutorialSelectionActivity$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", C17296a.f69688o, "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.ridertutorial.MultiModalRiderTutorialSelectionActivity$a */
    /* loaded from: classes2.dex */
    public static final class C14304a {
        public /* synthetic */ C14304a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent m59418a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Intent(context, MultiModalRiderTutorialSelectionActivity.class);
        }

        private C14304a() {
        }
    }

    public MultiModalRiderTutorialSelectionActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final HW2 m59419j0() {
        HW2 hw2 = this.f62714B;
        if (hw2 != null) {
            return hw2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenterFactory");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        H22.f12748a.mo24081Q(this);
        super.onCreate(bundle);
        setContentView(C39311cj4.multi_modal_tutorial_selection);
        m59419j0().mo101964a(m58963Z(), new OW2(this, null, 2, null)).m105045b();
    }
}
