package co.bird.android.app.feature.communitymode.activity;

import android.content.Intent;
import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"Lco/bird/android/app/feature/communitymode/activity/ComplaintActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "Liq0;", "B", "Liq0;", "k0", "()Liq0;", "m0", "(Liq0;)V", "presenter", "Lrq0;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lrq0;", "j0", "()Lrq0;", "setComplaintPresenterFactory", "(Lrq0;)V", "complaintPresenterFactory", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ComplaintActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC42952iq0 f61381B;

    /* renamed from: C */
    public InterfaceC48289rq0 f61382C;

    public ComplaintActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC48289rq0 m60724j0() {
        InterfaceC48289rq0 interfaceC48289rq0 = this.f61382C;
        if (interfaceC48289rq0 != null) {
            return interfaceC48289rq0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("complaintPresenterFactory");
        return null;
    }

    /* renamed from: k0 */
    public final InterfaceC42952iq0 m60723k0() {
        InterfaceC42952iq0 interfaceC42952iq0 = this.f61381B;
        if (interfaceC42952iq0 != null) {
            return interfaceC42952iq0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    /* renamed from: m0 */
    public final void m60722m0(InterfaceC42952iq0 interfaceC42952iq0) {
        Intrinsics.checkNotNullParameter(interfaceC42952iq0, "<set-?>");
        this.f61381B = interfaceC42952iq0;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m60723k0().onActivityResult(i, i2, intent);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C39311cj4.activity_complaint);
        H22.f12748a.mo24072V0(this);
        m60722m0(m60724j0().mo13595a(m58963Z(), new C42379hs0(this), mo58957w()));
        InterfaceC42952iq0 m60723k0 = m60723k0();
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        m60723k0.mo16948b(intent);
    }
}
