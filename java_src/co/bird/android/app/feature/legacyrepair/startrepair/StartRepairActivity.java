package co.bird.android.app.feature.legacyrepair.startrepair;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.BirdInspectionPoint;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/app/feature/legacyrepair/startrepair/StartRepairActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "LdP5;", "B", "LdP5;", "ui", "LMO5;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LMO5;", "presenter", "<init>", "()V", "D", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class StartRepairActivity extends BaseActivity {

    /* renamed from: D */
    public static final C13763a f61511D = new C13763a(null);

    /* renamed from: E */
    public static final int f61512E = 8;

    /* renamed from: B */
    public InterfaceC39734dP5 f61513B;

    /* renamed from: C */
    public MO5 f61514C;

    @Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J>\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/app/feature/legacyrepair/startrepair/StartRepairActivity$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lco/bird/android/model/wire/WireBird;", "bird", "Landroid/location/Location;", "location", "", "repairId", "Ljava/util/ArrayList;", "Lco/bird/android/model/BirdInspectionPoint;", "Lkotlin/collections/ArrayList;", "inspectionPointList", "Landroid/content/Intent;", C17296a.f69688o, "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.legacyrepair.startrepair.StartRepairActivity$a */
    /* loaded from: classes2.dex */
    public static final class C13763a {
        public /* synthetic */ C13763a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent m60604a(Context context, WireBird bird, Location location, String repairId, ArrayList<BirdInspectionPoint> inspectionPointList) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(bird, "bird");
            Intrinsics.checkNotNullParameter(location, "location");
            Intrinsics.checkNotNullParameter(repairId, "repairId");
            Intrinsics.checkNotNullParameter(inspectionPointList, "inspectionPointList");
            Intent intent = new Intent(context, StartRepairActivity.class);
            intent.putExtra("bird", bird);
            intent.putExtra("location", location);
            intent.putExtra("repair_id", repairId);
            intent.putParcelableArrayListExtra("inspection_point_list", inspectionPointList);
            return intent;
        }

        private C13763a() {
        }
    }

    public StartRepairActivity() {
        super(false, null, null, 7, null);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        MO5 mo5 = this.f61514C;
        if (mo5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            mo5 = null;
        }
        mo5.onActivityResult(i, i2, intent);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C25104k6 m29311c = C25104k6.m29311c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m29311c, "inflate(layoutInflater)");
        setContentView(m29311c.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70242E(getResources().getString(C45871nl4.mechanic_repair_flow_action_bar_title));
        }
        this.f61513B = new C42105hP5(this, m29311c);
        LifecycleScopeProvider<EnumC7097RE> m58963Z = m58963Z();
        InterfaceC39734dP5 interfaceC39734dP5 = this.f61513B;
        if (interfaceC39734dP5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ui");
            interfaceC39734dP5 = null;
        }
        C37937aP5 c37937aP5 = new C37937aP5(m58963Z, interfaceC39734dP5, mo58957w(), mo58955y(), m58971M(), m58973J(), m58966U(), m58967S());
        this.f61514C = c37937aP5;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        c37937aP5.mo71456b(intent);
    }
}
