package co.bird.android.feature.commandcenter.routing;

import android.os.Bundle;
import androidx.fragment.app.AbstractC11685m;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/feature/commandcenter/routing/RoutingActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onBackPressed", "Lvc5;", "B", "Lvc5;", "getPresenter", "()Lvc5;", "setPresenter", "(Lvc5;)V", "presenter", "Lco/bird/android/feature/commandcenter/routing/b;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lco/bird/android/feature/commandcenter/routing/b;", "fragment", "<init>", "()V", "D", C17296a.f69688o, "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class RoutingActivity extends BaseActivity {

    /* renamed from: D */
    public static final C14713a f63668D = new C14713a(null);

    /* renamed from: B */
    public InterfaceC50524vc5 f63669B;

    /* renamed from: C */
    public C14717b f63670C;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/feature/commandcenter/routing/RoutingActivity$a;", "", "", "REQUEST_CODE", "I", "<init>", "()V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.commandcenter.routing.RoutingActivity$a */
    /* loaded from: classes3.dex */
    public static final class C14713a {
        public /* synthetic */ C14713a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C14713a() {
        }
    }

    public RoutingActivity() {
        super(false, null, null, 7, null);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C14717b c14717b = this.f63670C;
        if (c14717b == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragment");
            c14717b = null;
        }
        c14717b.m58465N6();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Unit unit;
        super.onCreate(bundle);
        setContentView(C36369Ui4.activity_routing);
        WireBird wireBird = (WireBird) getIntent().getParcelableExtra("bird");
        C14717b c14717b = null;
        if (wireBird != null) {
            this.f63670C = C14717b.f63677c.m58463a(wireBird);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            return;
        }
        AbstractC11685m m67311q = getSupportFragmentManager().m67311q();
        int i = C42273hh4.fragmentContainer;
        C14717b c14717b2 = this.f63670C;
        if (c14717b2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragment");
        } else {
            c14717b = c14717b2;
        }
        m67311q.m67104t(i, c14717b).mo67115i();
    }
}
