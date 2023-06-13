package co.bird.android.feature.transferorder.operator;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import co.bird.android.core.mrp.BaseActivityLite;
import co.bird.android.feature.transferorder.operator.InterfaceC15803b;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.S74;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b-\u0010.J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\"\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006/"}, m28432d2 = {"Lco/bird/android/feature/transferorder/operator/OperatorOrderActivity;", "Lco/bird/android/core/mrp/BaseActivityLite;", "LOp3;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "onBackPressed", "LPp3;", TransferTable.COLUMN_STATE, "S", "LMp3;", "j", "LMp3;", "R", "()LMp3;", "setPresenter", "(LMp3;)V", "presenter", "LGp3;", "k", "LGp3;", "Q", "()LGp3;", "setOperatorOrderNavigator", "(LGp3;)V", "operatorOrderNavigator", "Lco/bird/android/feature/transferorder/operator/b;", "l", "Lco/bird/android/feature/transferorder/operator/b;", "P", "()Lco/bird/android/feature/transferorder/operator/b;", "U", "(Lco/bird/android/feature/transferorder/operator/b;)V", "component", "Lx4;", "m", "Lx4;", "binding", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorOrderActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderActivity.kt\nco/bird/android/feature/transferorder/operator/OperatorOrderActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,53:1\n1#2:54\n1855#3,2:55\n*S KotlinDebug\n*F\n+ 1 OperatorOrderActivity.kt\nco/bird/android/feature/transferorder/operator/OperatorOrderActivity\n*L\n39#1:55,2\n*E\n"})
/* loaded from: classes3.dex */
public final class OperatorOrderActivity extends BaseActivityLite implements InterfaceC35027Op3 {

    /* renamed from: j */
    public C34559Mp3 f65695j;

    /* renamed from: k */
    public C33155Gp3 f65696k;

    /* renamed from: l */
    public InterfaceC15803b f65697l;

    /* renamed from: m */
    public C30031x4 f65698m;

    /* renamed from: P */
    public final InterfaceC15803b m56543P() {
        InterfaceC15803b interfaceC15803b = this.f65697l;
        if (interfaceC15803b != null) {
            return interfaceC15803b;
        }
        Intrinsics.throwUninitializedPropertyAccessException("component");
        return null;
    }

    /* renamed from: Q */
    public final C33155Gp3 m56542Q() {
        C33155Gp3 c33155Gp3 = this.f65696k;
        if (c33155Gp3 != null) {
            return c33155Gp3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("operatorOrderNavigator");
        return null;
    }

    /* renamed from: R */
    public final C34559Mp3 m56541R() {
        C34559Mp3 c34559Mp3 = this.f65695j;
        if (c34559Mp3 != null) {
            return c34559Mp3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: S */
    public void render(AbstractC35261Pp3 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof C50691vt2) {
            S74.C7343a.showProgress$default(m58990F(), ((C50691vt2) state).m7865b(), 0, 2, null);
        }
    }

    /* renamed from: U */
    public final void m56539U(InterfaceC15803b interfaceC15803b) {
        Intrinsics.checkNotNullParameter(interfaceC15803b, "<set-?>");
        this.f65697l = interfaceC15803b;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        List<Fragment> m67283z0 = getSupportFragmentManager().m67283z0();
        Intrinsics.checkNotNullExpressionValue(m67283z0, "supportFragmentManager.fragments");
        for (Fragment fragment : m67283z0) {
            fragment.onActivityResult(i, i2, intent);
        }
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (m56542Q().mo28392a()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C30031x4 m5883c = C30031x4.m5883c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m5883c, "inflate(layoutInflater)");
        this.f65698m = m5883c;
        if (m5883c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m5883c = null;
        }
        setContentView(m5883c.getRoot());
        InterfaceC15803b.InterfaceC15804a m56538a = C15800a.m56538a();
        InterfaceC44393lG2 m58989H = m58989H();
        BaseActivityLite.InterfaceC14454a m58991E = m58991E();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        InterfaceC15803b mo56523a = m56538a.mo56523a(m58989H, m58991E, supportFragmentManager, C39912di4.container);
        mo56523a.mo56527a(this);
        m56539U(mo56523a);
        m56541R().consume(this);
    }
}
