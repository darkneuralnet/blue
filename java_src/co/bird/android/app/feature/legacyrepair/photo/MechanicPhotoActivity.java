package co.bird.android.app.feature.legacyrepair.photo;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.BirdInspectionPoint;
import co.bird.android.model.MechanicPhotoMode;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0014J\b\u0010\f\u001a\u00020\u0004H\u0014R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/app/feature/legacyrepair/photo/MechanicPhotoActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "onBackPressed", "onResume", "onPause", "LlP2;", "B", "LlP2;", "ui", "LPO2;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LPO2;", "presenter", "<init>", "()V", "D", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class MechanicPhotoActivity extends BaseActivity {

    /* renamed from: D */
    public static final C13761a f61493D = new C13761a(null);

    /* renamed from: E */
    public static final int f61494E = 8;

    /* renamed from: B */
    public InterfaceC44474lP2 f61495B;

    /* renamed from: C */
    public PO2 f61496C;

    @Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014Jb\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\r\u0018\u0001`\u000e¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/app/feature/legacyrepair/photo/MechanicPhotoActivity$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lco/bird/android/model/MechanicPhotoMode;", "mode", "Lco/bird/android/model/wire/WireBird;", "bird", "", "id", "Landroid/location/Location;", "location", "Ljava/util/ArrayList;", "Lco/bird/android/model/BirdInspectionPoint;", "Lkotlin/collections/ArrayList;", "points", "unselectedPoints", "Landroid/content/Intent;", C17296a.f69688o, "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.legacyrepair.photo.MechanicPhotoActivity$a */
    /* loaded from: classes2.dex */
    public static final class C13761a {
        public /* synthetic */ C13761a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent m60619a(Context context, MechanicPhotoMode mode, WireBird bird, String id, Location location, ArrayList<BirdInspectionPoint> points, ArrayList<BirdInspectionPoint> arrayList) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(bird, "bird");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(location, "location");
            Intrinsics.checkNotNullParameter(points, "points");
            Intent intent = new Intent(context, MechanicPhotoActivity.class);
            intent.putExtra("bird", bird);
            intent.putExtra("photo_mode", mode);
            intent.putExtra("inspection_or_repair_id", id);
            intent.putExtra("location", location);
            if (mode == MechanicPhotoMode.INSPECTION) {
                intent.putParcelableArrayListExtra("inspection_point_list", points);
            } else {
                intent.putParcelableArrayListExtra("selected_repaired_list", points);
                intent.putParcelableArrayListExtra("unselected_repaired_list", arrayList);
            }
            return intent;
        }

        private C13761a() {
        }
    }

    public MechanicPhotoActivity() {
        super(false, null, null, 7, null);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        PO2 po2 = this.f61496C;
        if (po2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            po2 = null;
        }
        po2.onBackPressed();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C7643T3 m84402c = C7643T3.m84402c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m84402c, "inflate(layoutInflater)");
        setContentView(m84402c.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70242E(getResources().getString(C45871nl4.mechanic_repair_flow_action_bar_title));
        }
        this.f61495B = new C45660nP2(this, m84402c);
        LifecycleScopeProvider<EnumC7097RE> m58963Z = m58963Z();
        InterfaceC44474lP2 interfaceC44474lP2 = this.f61495B;
        if (interfaceC44474lP2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ui");
            interfaceC44474lP2 = null;
        }
        C43288jP2 c43288jP2 = new C43288jP2(m58963Z, interfaceC44474lP2, mo58957w(), m58966U(), m58967S());
        this.f61496C = c43288jP2;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        c43288jP2.mo30689b(intent);
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.mo70212v(false);
            supportActionBar2.mo70245B(false);
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == 16908332) {
            setResult(0);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        PO2 po2 = this.f61496C;
        if (po2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            po2 = null;
        }
        po2.onPause();
        super.onPause();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        PO2 po2 = this.f61496C;
        if (po2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            po2 = null;
        }
        po2.onResume();
    }
}
