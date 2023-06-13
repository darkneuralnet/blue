package co.bird.android.app.feature.legacyrepair.inspection;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/app/feature/legacyrepair/inspection/SafetyInspectionActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onBackPressed", "LYh5;", "B", "LYh5;", "ui", "Lzh5;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lzh5;", "presenter", "<init>", "()V", "D", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SafetyInspectionActivity extends BaseActivity {

    /* renamed from: D */
    public static final C13760a f61489D = new C13760a(null);

    /* renamed from: E */
    public static final int f61490E = 8;

    /* renamed from: B */
    public InterfaceC37297Yh5 f61491B;

    /* renamed from: C */
    public InterfaceC52946zh5 f61492C;

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/app/feature/legacyrepair/inspection/SafetyInspectionActivity$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lco/bird/android/model/wire/WireBird;", "bird", "Landroid/location/Location;", "location", "", "startOver", "Landroid/content/Intent;", C17296a.f69688o, "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.legacyrepair.inspection.SafetyInspectionActivity$a */
    /* loaded from: classes2.dex */
    public static final class C13760a {
        public /* synthetic */ C13760a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent m60620a(Context context, WireBird bird, Location location, boolean z) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(bird, "bird");
            Intrinsics.checkNotNullParameter(location, "location");
            Intent intent = new Intent(context, SafetyInspectionActivity.class);
            intent.putExtra("bird", bird);
            intent.putExtra("location", location);
            intent.putExtra("inspection_start_over", z);
            return intent;
        }

        private C13760a() {
        }
    }

    public SafetyInspectionActivity() {
        super(false, null, null, 7, null);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        InterfaceC52946zh5 interfaceC52946zh5 = this.f61492C;
        if (interfaceC52946zh5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            interfaceC52946zh5 = null;
        }
        interfaceC52946zh5.onBackPressed();
        super.onBackPressed();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C7329S5 m86027c = C7329S5.m86027c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m86027c, "inflate(layoutInflater)");
        setContentView(m86027c.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70242E(getResources().getString(C45871nl4.mechanic_repair_flow_action_bar_title));
        }
        this.f61491B = new C38709bi5(this, m86027c);
        LifecycleScopeProvider<EnumC7097RE> m58963Z = m58963Z();
        InterfaceC37297Yh5 interfaceC37297Yh5 = this.f61491B;
        if (interfaceC37297Yh5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ui");
            interfaceC37297Yh5 = null;
        }
        C36361Uh5 c36361Uh5 = new C36361Uh5(m58963Z, this, interfaceC37297Yh5, mo58957w(), m58971M(), m58966U());
        this.f61492C = c36361Uh5;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        c36361Uh5.mo538b(intent);
    }
}
