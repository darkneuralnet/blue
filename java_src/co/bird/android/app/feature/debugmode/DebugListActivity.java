package co.bird.android.app.feature.debugmode;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/app/feature/debugmode/DebugListActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LOU0;", "B", "LOU0;", "j0", "()LOU0;", "k0", "(LOU0;)V", "presenter", "<init>", "()V", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class DebugListActivity extends BaseActivity {

    /* renamed from: C */
    public static final C13732a f61434C = new C13732a(null);

    /* renamed from: D */
    public static final int f61435D = 8;

    /* renamed from: B */
    public OU0 f61436B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, m28432d2 = {"Lco/bird/android/app/feature/debugmode/DebugListActivity$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", C17296a.f69688o, "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.debugmode.DebugListActivity$a */
    /* loaded from: classes2.dex */
    public static final class C13732a {
        public /* synthetic */ C13732a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent m60668a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Intent(context, DebugListActivity.class);
        }

        private C13732a() {
        }
    }

    public DebugListActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final OU0 m60670j0() {
        OU0 ou0 = this.f61436B;
        if (ou0 != null) {
            return ou0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    /* renamed from: k0 */
    public final void m60669k0(OU0 ou0) {
        Intrinsics.checkNotNullParameter(ou0, "<set-?>");
        this.f61436B = ou0;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C29039u3 m10937c = C29039u3.m10937c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m10937c, "inflate(layoutInflater)");
        setContentView(m10937c.getRoot());
        RecyclerView recyclerView = m10937c.f111621b;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.recyclerView");
        RU0 ru0 = new RU0(this, recyclerView);
        m60669k0(new PU0(m58963Z(), ru0, mo58957w(), m58964Y()));
        ru0.m86727Pl(m60670j0());
    }
}
