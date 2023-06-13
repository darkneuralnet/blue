package co.bird.android.qualitycontrol.base;

import android.content.Intent;
import co.bird.android.core.mvp.BaseActivity;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/qualitycontrol/base/BaseQualityControlActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "", "onActivityResult", "LSb4;", "B", "LSb4;", "j0", "()LSb4;", "setPresenter", "(LSb4;)V", "presenter", "<init>", "()V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseQualityControlActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseQualityControlActivity.kt\nco/bird/android/qualitycontrol/base/BaseQualityControlActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,21:1\n1#2:22\n*E\n"})
/* loaded from: classes4.dex */
public abstract class BaseQualityControlActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC35838Sb4 f66899B;

    public BaseQualityControlActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC35838Sb4 m55022j0() {
        InterfaceC35838Sb4 interfaceC35838Sb4 = this.f66899B;
        if (interfaceC35838Sb4 != null) {
            return interfaceC35838Sb4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        ArrayList parcelableArrayListExtra;
        super.onActivityResult(i, i2, intent);
        if (i == 10019 && i2 == -1 && intent != null && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("issues")) != null) {
            m55022j0().mo85206b(parcelableArrayListExtra);
        }
    }
}
