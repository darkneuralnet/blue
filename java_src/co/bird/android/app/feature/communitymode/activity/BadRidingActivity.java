package co.bird.android.app.feature.communitymode.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.app.feature.communitymode.activity.BadRidingActivity;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.ComplaintSection;
import co.bird.android.model.constant.MapMode;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0014J\b\u0010\t\u001a\u00020\u0004H\u0014J\b\u0010\n\u001a\u00020\u0004H\u0014J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002H\u0014R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\""}, m28432d2 = {"Lco/bird/android/app/feature/communitymode/activity/BadRidingActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "onStart", "onStop", "onPause", "onDestroy", "onLowMemory", "outState", "onSaveInstanceState", "LFw;", "B", "LFw;", "k0", "()LFw;", "setBadRidingPresenterImplFactory", "(LFw;)V", "badRidingPresenterImplFactory", "Lnw;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lnw;", "badRidingPresenter", "LV2;", "D", "LV2;", "binding", "<init>", "()V", "E", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class BadRidingActivity extends BaseActivity {

    /* renamed from: E */
    public static final C13712a f61376E = new C13712a(null);

    /* renamed from: F */
    public static final int f61377F = 8;

    /* renamed from: B */
    public InterfaceC2513Fw f61378B;

    /* renamed from: C */
    public InterfaceC26742nw f61379C;

    /* renamed from: D */
    public C8536V2 f61380D;

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0006\u0010\t\u001a\u00020\b¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/app/feature/communitymode/activity/BadRidingActivity$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/util/ArrayList;", "Lco/bird/android/model/ComplaintSection;", "Lkotlin/collections/ArrayList;", "sections", "Lco/bird/android/model/constant/MapMode;", "role", "Landroid/content/Intent;", C17296a.f69688o, "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.communitymode.activity.BadRidingActivity$a */
    /* loaded from: classes2.dex */
    public static final class C13712a {
        public /* synthetic */ C13712a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent m60725a(Context context, ArrayList<ComplaintSection> sections, MapMode role) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sections, "sections");
            Intrinsics.checkNotNullParameter(role, "role");
            Intent intent = new Intent(context, BadRidingActivity.class);
            intent.putParcelableArrayListExtra("complaint_section", sections);
            C38945c62.m61933a(intent, "map_mode", role);
            return intent;
        }

        private C13712a() {
        }
    }

    public BadRidingActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: m0 */
    public static final void m60726m0(BadRidingActivity this$0, C39011cD1 map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(map, "map");
        C51721xd6 m61676l = map.m61676l();
        m61676l.m4915c(true);
        m61676l.m4917a(true);
        C8536V2 c8536v2 = this$0.f61380D;
        if (c8536v2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c8536v2 = null;
        }
        C1639Dw mo104576a = this$0.m60727k0().mo104576a(this$0.m58963Z(), new C5129Lw(this$0, c8536v2, map), this$0.mo58957w());
        this$0.f61379C = mo104576a;
        if (mo104576a != null) {
            Intent intent = this$0.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "intent");
            mo104576a.mo22165b(intent);
        }
    }

    /* renamed from: k0 */
    public final InterfaceC2513Fw m60727k0() {
        InterfaceC2513Fw interfaceC2513Fw = this.f61378B;
        if (interfaceC2513Fw != null) {
            return interfaceC2513Fw;
        }
        Intrinsics.throwUninitializedPropertyAccessException("badRidingPresenterImplFactory");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        H22.f12748a.mo24085M1(this);
        C8536V2 m80478c = C8536V2.m80478c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m80478c, "inflate(layoutInflater)");
        this.f61380D = m80478c;
        C8536V2 c8536v2 = null;
        if (m80478c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m80478c = null;
        }
        setContentView(m80478c.getRoot());
        C38500bM2.m64632a(this);
        if (bundle != null) {
            bundle2 = bundle.getBundle("map");
        } else {
            bundle2 = null;
        }
        C8536V2 c8536v22 = this.f61380D;
        if (c8536v22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c8536v22 = null;
        }
        c8536v22.f38451e.m50725b(bundle2);
        C8536V2 c8536v23 = this.f61380D;
        if (c8536v23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c8536v2 = c8536v23;
        }
        c8536v2.f38451e.m50726a(new InterfaceC36350Ug3() { // from class: lw
            @Override // p000.InterfaceC36350Ug3
            public final void onMapReady(C39011cD1 c39011cD1) {
                BadRidingActivity.m60726m0(BadRidingActivity.this, c39011cD1);
            }
        });
    }

    @Override // co.bird.android.core.mvp.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C8536V2 c8536v2 = this.f61380D;
        if (c8536v2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c8536v2 = null;
        }
        c8536v2.f38451e.m50724c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        C8536V2 c8536v2 = this.f61380D;
        if (c8536v2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c8536v2 = null;
        }
        c8536v2.f38451e.m50723d();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        C8536V2 c8536v2 = this.f61380D;
        if (c8536v2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c8536v2 = null;
        }
        c8536v2.f38451e.m50722e();
        super.onPause();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        C8536V2 c8536v2 = this.f61380D;
        if (c8536v2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c8536v2 = null;
        }
        c8536v2.f38451e.m50721f();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        if (outState.getBundle("map") == null) {
            outState.putBundle("map", new Bundle());
        }
        C8536V2 c8536v2 = this.f61380D;
        if (c8536v2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c8536v2 = null;
        }
        c8536v2.f38451e.m50720g(outState);
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        C8536V2 c8536v2 = this.f61380D;
        if (c8536v2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c8536v2 = null;
        }
        c8536v2.f38451e.m50719h();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        C8536V2 c8536v2 = this.f61380D;
        if (c8536v2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c8536v2 = null;
        }
        c8536v2.f38451e.m50718i();
    }
}
