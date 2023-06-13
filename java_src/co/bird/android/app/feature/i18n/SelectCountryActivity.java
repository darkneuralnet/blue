package co.bird.android.app.feature.i18n;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.simplecityapps.recyclerview_fastscroll.views.FastScrollRecyclerView;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/app/feature/i18n/SelectCountryActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onDestroy", "Ljr5;", "B", "Ljr5;", "j0", "()Ljr5;", "k0", "(Ljr5;)V", "presenter", "<init>", "()V", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SelectCountryActivity extends BaseActivity {

    /* renamed from: C */
    public static final C13754a f61470C = new C13754a(null);

    /* renamed from: D */
    public static final int f61471D = 8;

    /* renamed from: B */
    public InterfaceC43560jr5 f61472B;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/app/feature/i18n/SelectCountryActivity$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "", "countries", "Landroid/content/Intent;", C17296a.f69688o, "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.i18n.SelectCountryActivity$a */
    /* loaded from: classes2.dex */
    public static final class C13754a {
        public /* synthetic */ C13754a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent m60634a(Context context, Set<String> countries) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(countries, "countries");
            Intent intent = new Intent(context, SelectCountryActivity.class);
            intent.putStringArrayListExtra("countries", new ArrayList<>(countries));
            return intent;
        }

        private C13754a() {
        }
    }

    public SelectCountryActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC43560jr5 m60636j0() {
        InterfaceC43560jr5 interfaceC43560jr5 = this.f61472B;
        if (interfaceC43560jr5 != null) {
            return interfaceC43560jr5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    /* renamed from: k0 */
    public final void m60635k0(InterfaceC43560jr5 interfaceC43560jr5) {
        Intrinsics.checkNotNullParameter(interfaceC43560jr5, "<set-?>");
        this.f61472B = interfaceC43560jr5;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        H22.f12748a.mo24033s0(this);
        C9294X5 m77427c = C9294X5.m77427c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m77427c, "inflate(layoutInflater)");
        setContentView(m77427c.getRoot());
        FastScrollRecyclerView fastScrollRecyclerView = m77427c.f42629c;
        Intrinsics.checkNotNullExpressionValue(fastScrollRecyclerView, "binding.recyclerView");
        m60635k0(new C46525or5(m58963Z(), new C47711qr5(this, fastScrollRecyclerView), mo58957w(), m58971M()));
        InterfaceC43560jr5 m60636j0 = m60636j0();
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        m60636j0.mo20432b(intent);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        m60636j0().onDestroy();
        super.onDestroy();
    }
}
