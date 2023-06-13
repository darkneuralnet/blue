package co.bird.android.app.feature.wakebirds;

import android.content.Intent;
import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/app/feature/wakebirds/WakeFlockProgressActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LPw6;", "B", "LPw6;", "j0", "()LPw6;", "setPresenterFactory", "(LPw6;)V", "presenterFactory", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class WakeFlockProgressActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC35327Pw6 f62848B;

    public WakeFlockProgressActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC35327Pw6 m59330j0() {
        InterfaceC35327Pw6 interfaceC35327Pw6 = this.f62848B;
        if (interfaceC35327Pw6 != null) {
            return interfaceC35327Pw6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenterFactory");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C29054u6 m10867c = C29054u6.m10867c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m10867c, "inflate(layoutInflater)");
        setContentView(m10867c.getRoot());
        H22.f12748a.mo24092G1(this);
        C34157Kw6 mo87563a = m59330j0().mo87563a(m58963Z(), mo58957w(), new C36263Tw6(this, m10867c));
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        mo87563a.m98096r(intent);
    }
}
