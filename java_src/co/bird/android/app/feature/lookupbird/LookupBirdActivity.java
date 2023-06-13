package co.bird.android.app.feature.lookupbird;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import co.bird.android.core.mvp.BaseActivity;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006$"}, m28432d2 = {"Lco/bird/android/app/feature/lookupbird/LookupBirdActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "LgD2;", "B", "LgD2;", "j0", "()LgD2;", "setFactory", "(LgD2;)V", "factory", "LZC2;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LZC2;", "k0", "()LZC2;", "n0", "(LZC2;)V", "presenter", "LjD2;", "D", "LjD2;", "m0", "()LjD2;", "o0", "(LjD2;)V", "ui", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class LookupBirdActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC41401gD2 f61554B;

    /* renamed from: C */
    public ZC2 f61555C;

    /* renamed from: D */
    public InterfaceC43180jD2 f61556D;

    public LookupBirdActivity() {
        super(false, null, Boolean.TRUE, 3, null);
    }

    /* renamed from: j0 */
    public final InterfaceC41401gD2 m60575j0() {
        InterfaceC41401gD2 interfaceC41401gD2 = this.f61554B;
        if (interfaceC41401gD2 != null) {
            return interfaceC41401gD2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("factory");
        return null;
    }

    /* renamed from: k0 */
    public final ZC2 m60574k0() {
        ZC2 zc2 = this.f61555C;
        if (zc2 != null) {
            return zc2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    /* renamed from: m0 */
    public final InterfaceC43180jD2 m60573m0() {
        InterfaceC43180jD2 interfaceC43180jD2 = this.f61556D;
        if (interfaceC43180jD2 != null) {
            return interfaceC43180jD2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ui");
        return null;
    }

    /* renamed from: n0 */
    public final void m60572n0(ZC2 zc2) {
        Intrinsics.checkNotNullParameter(zc2, "<set-?>");
        this.f61555C = zc2;
    }

    /* renamed from: o0 */
    public final void m60571o0(InterfaceC43180jD2 interfaceC43180jD2) {
        Intrinsics.checkNotNullParameter(interfaceC43180jD2, "<set-?>");
        this.f61556D = interfaceC43180jD2;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        H22.f12748a.mo24036p2(this);
        setContentView(C39311cj4.activity_lookup_bird);
        m60571o0(new C43773kD2(this));
        C40808fD2 mo36603a = m60575j0().mo36603a(m58963Z(), m60573m0(), mo58957w());
        mo36603a.mo41729a();
        m60572n0(mo36603a);
        m60574k0().mo41729a();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(C36387Uk4.menu_bird_search, menu);
        MenuItem item = menu.findItem(C36585Vg4.next);
        InterfaceC43180jD2 m60573m0 = m60573m0();
        Intrinsics.checkNotNullExpressionValue(item, "item");
        m60573m0.mo29189t0(item);
        m60574k0().mo41727c();
        return super.onCreateOptionsMenu(menu);
    }
}
