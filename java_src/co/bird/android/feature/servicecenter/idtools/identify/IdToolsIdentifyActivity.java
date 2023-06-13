package co.bird.android.feature.servicecenter.idtools.identify;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WirePart;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 -2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b+\u0010,J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0014J\"\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\"\u0010\u001c\u001a\u00020\u00158\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010*\u001a\u00020%8$@$X¤\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006/"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/idtools/identify/IdToolsIdentifyActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "onPause", "Landroid/content/Intent;", "intent", "onNewIntent", "", "requestCode", "resultCode", MessageExtension.FIELD_DATA, "onActivityResult", "onBackPressed", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "LsQ1;", "B", "LsQ1;", "k0", "()LsQ1;", "o0", "(LsQ1;)V", "component", "LP3;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LP3;", "j0", "()LP3;", "n0", "(LP3;)V", "binding", "LFR1;", "m0", "()LFR1;", "setPresenter", "(LFR1;)V", "presenter", "<init>", "()V", "D", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIdToolsIdentifyActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsIdentifyActivity.kt\nco/bird/android/feature/servicecenter/idtools/identify/IdToolsIdentifyActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
/* loaded from: classes3.dex */
public abstract class IdToolsIdentifyActivity extends BaseActivity {

    /* renamed from: D */
    public static final C15607a f65326D = new C15607a(null);

    /* renamed from: B */
    public InterfaceC48632sQ1 f65327B;

    /* renamed from: C */
    public C6233P3 f65328C;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/idtools/identify/IdToolsIdentifyActivity$a;", "", "", "IDENTIFYING_PART_REPAIRS", "Ljava/lang/String;", "<init>", "()V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.servicecenter.idtools.identify.IdToolsIdentifyActivity$a */
    /* loaded from: classes3.dex */
    public static final class C15607a {
        public /* synthetic */ C15607a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C15607a() {
        }
    }

    public IdToolsIdentifyActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final C6233P3 m56864j0() {
        C6233P3 c6233p3 = this.f65328C;
        if (c6233p3 != null) {
            return c6233p3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    /* renamed from: k0 */
    public final InterfaceC48632sQ1 m56863k0() {
        InterfaceC48632sQ1 interfaceC48632sQ1 = this.f65327B;
        if (interfaceC48632sQ1 != null) {
            return interfaceC48632sQ1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("component");
        return null;
    }

    /* renamed from: m0 */
    public abstract FR1 mo56856m0();

    /* renamed from: n0 */
    public final void m56862n0(C6233P3 c6233p3) {
        Intrinsics.checkNotNullParameter(c6233p3, "<set-?>");
        this.f65328C = c6233p3;
    }

    /* renamed from: o0 */
    public final void m56861o0(InterfaceC48632sQ1 interfaceC48632sQ1) {
        Intrinsics.checkNotNullParameter(interfaceC48632sQ1, "<set-?>");
        this.f65327B = interfaceC48632sQ1;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        WireBird wireBird;
        WirePart wirePart;
        super.onActivityResult(i, i2, intent);
        switch (i) {
            case 10000:
            case 10001:
            case 10003:
                if (i2 == -1) {
                    WirePart wirePart2 = null;
                    if (intent != null) {
                        wireBird = (WireBird) intent.getParcelableExtra("bird");
                    } else {
                        wireBird = null;
                    }
                    if (intent != null) {
                        wirePart2 = (WirePart) intent.getParcelableExtra("part");
                    }
                    if (wireBird != null && wirePart2 != null) {
                        mo56856m0().mo1371b(wireBird, wirePart2);
                        return;
                    }
                    return;
                }
                mo56856m0().mo36732c();
                return;
            case 10002:
            case 10004:
                if (i2 == -1 && intent != null && (wirePart = (WirePart) intent.getParcelableExtra("part")) != null) {
                    mo56856m0().mo1370d(wirePart);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        mo56856m0().onBackPressed();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C6233P3 m91035c = C6233P3.m91035c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m91035c, "inflate(layoutInflater)");
        m56862n0(m91035c);
        setContentView(m56864j0().getRoot());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        mo56856m0().mo36735a(intent);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == 16908332) {
            mo56856m0().onBackPressed();
            return true;
        }
        return false;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        mo56856m0().onPause();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        mo56856m0().onResume();
    }
}
