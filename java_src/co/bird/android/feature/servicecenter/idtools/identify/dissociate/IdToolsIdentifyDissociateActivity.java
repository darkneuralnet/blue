package co.bird.android.feature.servicecenter.idtools.identify.dissociate;

import android.app.Application;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.app.ActionBar;
import co.bird.android.feature.servicecenter.idtools.identify.IdToolsIdentifyActivity;
import co.bird.android.feature.servicecenter.idtools.identify.dissociate.InterfaceC15611a;
import co.bird.android.model.IdToolOption;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0014@\u0014X\u0095.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/idtools/identify/dissociate/IdToolsIdentifyDissociateActivity;", "Lco/bird/android/feature/servicecenter/idtools/identify/IdToolsIdentifyActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LFR1;", "E", "LFR1;", "m0", "()LFR1;", "setPresenter", "(LFR1;)V", "presenter", "<init>", "()V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIdToolsIdentifyDissociateActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsIdentifyDissociateActivity.kt\nco/bird/android/feature/servicecenter/idtools/identify/dissociate/IdToolsIdentifyDissociateActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,77:1\n44#2:78\n*S KotlinDebug\n*F\n+ 1 IdToolsIdentifyDissociateActivity.kt\nco/bird/android/feature/servicecenter/idtools/identify/dissociate/IdToolsIdentifyDissociateActivity\n*L\n35#1:78\n*E\n"})
/* loaded from: classes3.dex */
public final class IdToolsIdentifyDissociateActivity extends IdToolsIdentifyActivity {

    /* renamed from: E */
    protected FR1 f65348E;

    @Override // co.bird.android.feature.servicecenter.idtools.identify.IdToolsIdentifyActivity
    /* renamed from: m0 */
    public FR1 mo56856m0() {
        FR1 fr1 = this.f65348E;
        if (fr1 != null) {
            return fr1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.feature.servicecenter.idtools.identify.IdToolsIdentifyActivity, co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C52189yQ1 c52189yQ1 = C52189yQ1.f119504b;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        m56861o0((InterfaceC48632sQ1) AbstractC31704Ak1.component$default(c52189yQ1, application, null, 2, null));
        InterfaceC15611a.InterfaceC15612a mo14226b = m56863k0().mo14226b();
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        mo14226b.mo56854a(this, m45197b, m56864j0(), mo58956x()).mo56855a(this);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("id_tool_option");
        Intrinsics.checkNotNull(parcelableExtra);
        IdToolOption idToolOption = (IdToolOption) parcelableExtra;
        mo56856m0().mo1369f(idToolOption, true);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70242E(getString(C45871nl4.id_tools_dissociate_format, C37942aQ1.label$default(idToolOption, this, false, 2, null)));
        }
    }
}
