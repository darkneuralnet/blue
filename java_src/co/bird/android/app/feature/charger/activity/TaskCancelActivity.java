package co.bird.android.app.feature.charger.activity;

import android.content.Intent;
import android.os.Bundle;
import co.bird.android.app.feature.charger.presenter.TaskCancelPresenterImpl;
import co.bird.android.core.mvp.BaseActivity;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/app/feature/charger/activity/TaskCancelActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onDestroy", "LrZ5;", "B", "LrZ5;", "ui", "LYY5;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LYY5;", "presenter", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class TaskCancelActivity extends BaseActivity {

    /* renamed from: B */
    public C48125rZ5 f61352B;

    /* renamed from: C */
    public YY5 f61353C;

    public TaskCancelActivity() {
        super(false, null, null, 7, null);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C39311cj4.activity_task_indirect_cancel);
        mo58977D();
        this.f61352B = new C48125rZ5(this);
        LifecycleScopeProvider<EnumC7097RE> m58963Z = m58963Z();
        C48125rZ5 c48125rZ5 = this.f61352B;
        if (c48125rZ5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ui");
            c48125rZ5 = null;
        }
        TaskCancelPresenterImpl taskCancelPresenterImpl = new TaskCancelPresenterImpl(m58963Z, c48125rZ5, mo58957w(), m58973J(), m58975F());
        this.f61353C = taskCancelPresenterImpl;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        taskCancelPresenterImpl.mo60738b(intent);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        YY5 yy5 = this.f61353C;
        if (yy5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            yy5 = null;
        }
        yy5.onDestroy();
        super.onDestroy();
    }
}
