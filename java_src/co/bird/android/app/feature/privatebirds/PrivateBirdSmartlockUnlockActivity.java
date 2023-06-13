package co.bird.android.app.feature.privatebirds;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import co.bird.android.core.mvp.BaseActivity;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u001b\u0010\u0012\u001a\u00020\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/app/feature/privatebirds/PrivateBirdSmartlockUnlockActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "Ll54;", "B", "Lkotlin/Lazy;", "j0", "()Ll54;", "presenter", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PrivateBirdSmartlockUnlockActivity extends BaseActivity {

    /* renamed from: B */
    public final Lazy f62312B;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Ll54;", "b", "()Ll54;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.privatebirds.PrivateBirdSmartlockUnlockActivity$a */
    /* loaded from: classes2.dex */
    public static final class C14194a extends Lambda implements Function0<C44291l54> {
        public C14194a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C44291l54 invoke() {
            return new C44291l54(PrivateBirdSmartlockUnlockActivity.this.m58963Z(), new XL5(PrivateBirdSmartlockUnlockActivity.this), PrivateBirdSmartlockUnlockActivity.this.mo58957w());
        }
    }

    public PrivateBirdSmartlockUnlockActivity() {
        super(false, null, null, 7, null);
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new C14194a());
        this.f62312B = lazy;
    }

    /* renamed from: j0 */
    public final C44291l54 m59654j0() {
        return (C44291l54) this.f62312B.getValue();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C39311cj4.activity_smartlock_unlock);
        mo58977D();
        m59654j0().m27880b();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(C36387Uk4.menu_private_smartlock_unlock, menu);
        return true;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (!m59654j0().m27878d(item) && !super.onOptionsItemSelected(item)) {
            return false;
        }
        return true;
    }
}
