package co.bird.android.app.feature.legacyrepair.certifyrepair;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/app/feature/legacyrepair/certifyrepair/CertifyRepairActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lbh0;", "B", "Lbh0;", "j0", "()Lbh0;", "setFactory", "(Lbh0;)V", "factory", "<init>", "()V", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CertifyRepairActivity extends BaseActivity {

    /* renamed from: C */
    public static final C13755a f61473C = new C13755a(null);

    /* renamed from: D */
    public static final int f61474D = 8;

    /* renamed from: B */
    public InterfaceC38694bh0 f61475B;

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/app/feature/legacyrepair/certifyrepair/CertifyRepairActivity$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lco/bird/android/model/wire/WireBird;", "bird", "", "repairId", "", "shouldEscalate", "Landroid/content/Intent;", C17296a.f69688o, "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.legacyrepair.certifyrepair.CertifyRepairActivity$a */
    /* loaded from: classes2.dex */
    public static final class C13755a {
        public /* synthetic */ C13755a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent m60632a(Context context, WireBird bird, String repairId, boolean z) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(bird, "bird");
            Intrinsics.checkNotNullParameter(repairId, "repairId");
            Intent intent = new Intent(context, CertifyRepairActivity.class);
            intent.putExtra("bird", bird);
            intent.putExtra("repair_id", repairId);
            intent.putExtra("should_escalate", z);
            return intent;
        }

        private C13755a() {
        }
    }

    public CertifyRepairActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC38694bh0 m60633j0() {
        InterfaceC38694bh0 interfaceC38694bh0 = this.f61475B;
        if (interfaceC38694bh0 != null) {
            return interfaceC38694bh0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("factory");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        H22.f12748a.mo24090I(this);
        C23106i3 m34579c = C23106i3.m34579c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m34579c, "inflate(layoutInflater)");
        setContentView(m34579c.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70242E(getResources().getString(C45871nl4.mechanic_repair_flow_action_bar_title));
        }
        C38101ah0 mo61058a = m60633j0().mo61058a(m58963Z(), new C41676gh0(this, m34579c), mo58957w());
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        mo61058a.m70865b(intent);
    }
}
