package co.bird.android.app.feature.searchbird;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import co.bird.android.core.mvp.BaseActivity;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m28432d2 = {"Lco/bird/android/app/feature/searchbird/BirdSearchActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onDestroy", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "LtT;", "B", "LtT;", "ui", "LfT;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LfT;", "presenter", "LqT;", "D", "LqT;", "j0", "()LqT;", "setFactory", "(LqT;)V", "factory", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class BirdSearchActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC28719tT f62741B;

    /* renamed from: C */
    public InterfaceC20425fT f62742C;

    /* renamed from: D */
    public InterfaceC27605qT f62743D;

    public BirdSearchActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC27605qT m59397j0() {
        InterfaceC27605qT interfaceC27605qT = this.f62743D;
        if (interfaceC27605qT != null) {
            return interfaceC27605qT;
        }
        Intrinsics.throwUninitializedPropertyAccessException("factory");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        InterfaceC28719tT interfaceC28719tT;
        super.onCreate(bundle);
        H22.f12748a.mo24074T0(this);
        setContentView(C39311cj4.activity_bird_search);
        this.f62741B = new C29197uT(this);
        InterfaceC27605qT m59397j0 = m59397j0();
        LifecycleScopeProvider<EnumC7097RE> m58963Z = m58963Z();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        InterfaceC28719tT interfaceC28719tT2 = this.f62741B;
        C27296pT c27296pT = null;
        if (interfaceC28719tT2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ui");
            interfaceC28719tT = null;
        } else {
            interfaceC28719tT = interfaceC28719tT2;
        }
        C27296pT mo15928a = m59397j0.mo15928a(m58963Z, resources, interfaceC28719tT, mo58957w(), mo58956x());
        this.f62742C = mo15928a;
        if (mo15928a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        } else {
            c27296pT = mo15928a;
        }
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        c27296pT.mo19271b(intent);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(C36387Uk4.menu_bird_search, menu);
        MenuItem item = menu.findItem(C36585Vg4.next);
        InterfaceC28719tT interfaceC28719tT = this.f62741B;
        InterfaceC20425fT interfaceC20425fT = null;
        if (interfaceC28719tT == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ui");
            interfaceC28719tT = null;
        }
        Intrinsics.checkNotNullExpressionValue(item, "item");
        interfaceC28719tT.mo10249t0(item);
        InterfaceC20425fT interfaceC20425fT2 = this.f62742C;
        if (interfaceC20425fT2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        } else {
            interfaceC20425fT = interfaceC20425fT2;
        }
        interfaceC20425fT.mo19270c();
        return super.onCreateOptionsMenu(menu);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        InterfaceC20425fT interfaceC20425fT = this.f62742C;
        if (interfaceC20425fT == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            interfaceC20425fT = null;
        }
        interfaceC20425fT.onDestroy();
        super.onDestroy();
    }
}
