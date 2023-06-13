package co.bird.android.library.flow;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import co.bird.android.core.mvp.BaseActivity;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b=\u0010>J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0014J\"\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016J\u0006\u0010\u0019\u001a\u00020\u0004J\u0006\u0010\u001a\u001a\u00020\u0004J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020\u001bJ\u0016\u0010\"\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0010J\u000e\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#J\b\u0010&\u001a\u00020\u0004H\u0002R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098$X¤\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006?"}, m28432d2 = {"Lco/bird/android/library/flow/FlowActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "outState", "onSaveInstanceState", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "onBackPressed", "Landroid/view/View;", "navView", "setCustomNavView", "n0", "m0", "", "nodeId", "LDi0;", "j0", "LEi0;", "type", "enabled", "p0", "LGi0;", "reverseType", "q0", "o0", "LJu1;", "B", "Lkotlin/Lazy;", "k0", "()LJu1;", "presenter", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LEi0;", "proceedType", "D", "LGi0;", "E", "Z", "proceedButtonEnabled", "Lj3;", "F", "Lj3;", "binding", "LMu1;", "getCoordinator", "()LMu1;", "coordinator", "<init>", "()V", "flow_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFlowActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowActivity.kt\nco/bird/android/library/flow/FlowActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
/* loaded from: classes3.dex */
public abstract class FlowActivity extends BaseActivity {

    /* renamed from: B */
    public final Lazy f66097B;

    /* renamed from: C */
    public EnumC32621Ei0 f66098C;

    /* renamed from: D */
    public EnumC33089Gi0 f66099D;

    /* renamed from: E */
    public boolean f66100E;

    /* renamed from: F */
    public C24694j3 f66101F;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.library.flow.FlowActivity$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C16037a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC33089Gi0.values().length];
            try {
                iArr[EnumC33089Gi0.BACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC33089Gi0.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC33089Gi0.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LJu1;", "b", "()LJu1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFlowActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowActivity.kt\nco/bird/android/library/flow/FlowActivity$presenter$2\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,136:1\n44#2:137\n*S KotlinDebug\n*F\n+ 1 FlowActivity.kt\nco/bird/android/library/flow/FlowActivity$presenter$2\n*L\n22#1:137\n*E\n"})
    /* renamed from: co.bird.android.library.flow.FlowActivity$b */
    /* loaded from: classes3.dex */
    public static final class C16038b extends Lambda implements Function0<C33900Ju1> {
        public C16038b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C33900Ju1 invoke() {
            List<C32387Di0> mo14962a = FlowActivity.this.getCoordinator().mo14962a();
            FlowActivity flowActivity = FlowActivity.this;
            FragmentManager supportFragmentManager = flowActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
            C34368Lu1 c34368Lu1 = new C34368Lu1(flowActivity, supportFragmentManager);
            AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(FlowActivity.this);
            Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
            return new C33900Ju1(mo14962a, c34368Lu1, m45197b, FlowActivity.this.mo58957w());
        }
    }

    public FlowActivity() {
        super(true, null, null, 6, null);
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new C16038b());
        this.f66097B = lazy;
        this.f66098C = EnumC32621Ei0.NONE;
        this.f66099D = EnumC33089Gi0.NONE;
    }

    public abstract AbstractC34602Mu1 getCoordinator();

    /* renamed from: j0 */
    public final C32387Di0 m56046j0(String nodeId) {
        Intrinsics.checkNotNullParameter(nodeId, "nodeId");
        return m56045k0().m99574e(nodeId);
    }

    /* renamed from: k0 */
    public final C33900Ju1 m56045k0() {
        return (C33900Ju1) this.f66097B.getValue();
    }

    /* renamed from: m0 */
    public final void m56044m0() {
        m56042o0();
        m56045k0().m99572g();
    }

    /* renamed from: n0 */
    public final void m56043n0() {
        m56042o0();
        m56045k0().m99571h();
    }

    /* renamed from: o0 */
    public final void m56042o0() {
        C24694j3 c24694j3 = this.f66101F;
        C24694j3 c24694j32 = null;
        if (c24694j3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c24694j3 = null;
        }
        FrameLayout frameLayout = c24694j3.f92054c;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        C24694j3 c24694j33 = this.f66101F;
        if (c24694j33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c24694j32 = c24694j33;
        }
        FrameLayout frameLayout2 = c24694j32.f92054c;
        if (frameLayout2 != null) {
            C49520tu6.m11239l(frameLayout2);
        }
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (Fragment fragment : getSupportFragmentManager().m67283z0()) {
            if (fragment != null) {
                fragment.onActivityResult(i, i2, intent);
            }
        }
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m59031A();
        int i = C16037a.$EnumSwitchMapping$0[this.f66099D.ordinal()];
        if (i != 1) {
            if (i == 2) {
                mo58957w().close();
                return;
            }
            return;
        }
        m56043n0();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C24694j3 m31218c = C24694j3.m31218c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m31218c, "inflate(layoutInflater)");
        this.f66101F = m31218c;
        C24694j3 c24694j3 = null;
        if (m31218c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m31218c = null;
        }
        setContentView(m31218c.getRoot());
        C24694j3 c24694j32 = this.f66101F;
        if (c24694j32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c24694j3 = c24694j32;
        }
        setSupportActionBar(c24694j3.f92056e);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70210x(true);
            supportActionBar.mo70212v(true);
        }
        m56040q0(EnumC33089Gi0.CLOSE);
        getCoordinator().mo14961b(bundle);
        m56045k0().m99569j(bundle);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        boolean z;
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(C32877Fk4.menu_checkout, menu);
        MenuItem findItem = menu.findItem(C49398ti4.next);
        boolean z2 = true;
        if (this.f66098C == EnumC32621Ei0.NEXT) {
            z = true;
        } else {
            z = false;
        }
        findItem.setVisible(z);
        findItem.setEnabled(this.f66100E);
        MenuItem findItem2 = menu.findItem(C49398ti4.skip);
        if (this.f66098C != EnumC32621Ei0.SKIP) {
            z2 = false;
        }
        findItem2.setVisible(z2);
        findItem2.setEnabled(this.f66100E);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        m56045k0().m99572g();
        return true;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        getCoordinator().mo14960c(outState);
        m56045k0().m99566m(outState);
    }

    /* renamed from: p0 */
    public final void m56041p0(EnumC32621Ei0 type, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f66098C = type;
        this.f66100E = z;
        invalidateOptionsMenu();
    }

    /* renamed from: q0 */
    public final void m56040q0(EnumC33089Gi0 reverseType) {
        ActionBar supportActionBar;
        Intrinsics.checkNotNullParameter(reverseType, "reverseType");
        this.f66099D = reverseType;
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.mo70212v(true);
        }
        int i = C16037a.$EnumSwitchMapping$0[reverseType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && (supportActionBar = getSupportActionBar()) != null) {
                    supportActionBar.mo70212v(false);
                    supportActionBar.mo70245B(false);
                    return;
                }
                return;
            }
            mo58977D();
            return;
        }
        ActionBar supportActionBar3 = getSupportActionBar();
        if (supportActionBar3 != null) {
            supportActionBar3.mo70246A(null);
        }
    }

    public final void setCustomNavView(View view) {
        boolean z;
        m56042o0();
        if (view != null) {
            C24694j3 c24694j3 = this.f66101F;
            if (c24694j3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c24694j3 = null;
            }
            c24694j3.f92054c.addView(view);
        }
        C24694j3 c24694j32 = this.f66101F;
        if (c24694j32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c24694j32 = null;
        }
        FrameLayout frameLayout = c24694j32.f92054c;
        if (frameLayout != null) {
            if (view != null) {
                z = true;
            } else {
                z = false;
            }
            C49520tu6.show$default(frameLayout, z, 0, 2, null);
        }
    }
}
