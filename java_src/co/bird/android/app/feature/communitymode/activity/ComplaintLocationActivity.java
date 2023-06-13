package co.bird.android.app.feature.communitymode.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActionBar;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.ComplaintSection;
import co.bird.android.model.ComplaintType;
import co.bird.android.model.LocationSelectionModel;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0014J\b\u0010\n\u001a\u00020\u0004H\u0014J\b\u0010\u000b\u001a\u00020\u0004H\u0014J\b\u0010\f\u001a\u00020\u0004H\u0014R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, m28432d2 = {"Lco/bird/android/app/feature/communitymode/activity/ComplaintLocationActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onStart", "onResume", "outState", "onSaveInstanceState", "onPause", "onStop", "onDestroy", "Lfq0;", "B", "Lfq0;", "j0", "()Lfq0;", "setComplaintLocationPresenterFactory", "(Lfq0;)V", "complaintLocationPresenterFactory", "Leq0;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Leq0;", "presenter", "<init>", "()V", "D", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ComplaintLocationActivity extends BaseActivity {

    /* renamed from: D */
    public static final C13713a f61383D = new C13713a(null);

    /* renamed from: E */
    public static final int f61384E = 8;

    /* renamed from: B */
    public InterfaceC41173fq0 f61385B;

    /* renamed from: C */
    public C40580eq0 f61386C;

    @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ>\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/app/feature/communitymode/activity/ComplaintLocationActivity$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lco/bird/android/model/ComplaintType;", "complaintType", "Ljava/util/ArrayList;", "Lco/bird/android/model/ComplaintSection;", "Lkotlin/collections/ArrayList;", "sections", "Lco/bird/android/model/LocationSelectionModel;", RequestHeadersFactory.MODEL, "Landroid/content/Intent;", C17296a.f69688o, "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.communitymode.activity.ComplaintLocationActivity$a */
    /* loaded from: classes2.dex */
    public static final class C13713a {
        public /* synthetic */ C13713a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent m60720a(Context context, ComplaintType complaintType, ArrayList<ComplaintSection> arrayList, LocationSelectionModel locationSelectionModel) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, ComplaintLocationActivity.class);
            intent.putExtra("complaint_type", complaintType);
            intent.putParcelableArrayListExtra("complaint_section", arrayList);
            intent.putExtra("location_selection_model", locationSelectionModel);
            return intent;
        }

        private C13713a() {
        }
    }

    public ComplaintLocationActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC41173fq0 m60721j0() {
        InterfaceC41173fq0 interfaceC41173fq0 = this.f61385B;
        if (interfaceC41173fq0 != null) {
            return interfaceC41173fq0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("complaintLocationPresenterFactory");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        H22.f12748a.mo24078R2(this);
        C9608Y5 m75765c = C9608Y5.m75765c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m75765c, "inflate(layoutInflater)");
        setContentView(m75765c.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70242E(getString(C45871nl4.confirm_location_title));
        }
        InterfaceC41173fq0 m60721j0 = m60721j0();
        LifecycleScopeProvider<EnumC7097RE> m58963Z = m58963Z();
        FrameLayout frameLayout = m75765c.f44505b;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.container");
        C40580eq0 mo37428a = m60721j0.mo37428a(this, m58963Z, frameLayout, mo58957w());
        this.f61386C = mo37428a;
        C40580eq0 c40580eq0 = null;
        if (mo37428a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            mo37428a = null;
        }
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        mo37428a.m42494i(bundle, intent);
        C40580eq0 c40580eq02 = this.f61386C;
        if (c40580eq02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        } else {
            c40580eq0 = c40580eq02;
        }
        c40580eq0.m42497f();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        C40580eq0 c40580eq0 = this.f61386C;
        if (c40580eq0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            c40580eq0 = null;
        }
        c40580eq0.onDestroy();
        super.onDestroy();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        C40580eq0 c40580eq0 = this.f61386C;
        if (c40580eq0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            c40580eq0 = null;
        }
        c40580eq0.onPause();
        super.onPause();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        C40580eq0 c40580eq0 = this.f61386C;
        C40580eq0 c40580eq02 = null;
        if (c40580eq0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            c40580eq0 = null;
        }
        c40580eq0.onResume();
        C40580eq0 c40580eq03 = this.f61386C;
        if (c40580eq03 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        } else {
            c40580eq02 = c40580eq03;
        }
        c40580eq02.m42497f();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        C40580eq0 c40580eq0 = this.f61386C;
        if (c40580eq0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            c40580eq0 = null;
        }
        c40580eq0.onSaveInstanceState(outState);
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        C40580eq0 c40580eq0 = this.f61386C;
        if (c40580eq0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            c40580eq0 = null;
        }
        c40580eq0.onStart();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        C40580eq0 c40580eq0 = this.f61386C;
        if (c40580eq0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            c40580eq0 = null;
        }
        c40580eq0.onStop();
        super.onStop();
    }
}
