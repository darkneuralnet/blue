package co.bird.android.feature.notificationcenter;

import android.app.Application;
import android.os.Bundle;
import android.view.MenuItem;
import co.bird.android.core.mrp.BaseActivityLite;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0002R\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006!"}, m28432d2 = {"Lco/bird/android/feature/notificationcenter/NotificationCenterActivity;", "Lco/bird/android/core/mrp/BaseActivityLite;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "P", "LAa3;", "j", "LAa3;", "R", "()LAa3;", "setFragmentNavigator", "(LAa3;)V", "fragmentNavigator", "Ls4;", "k", "Ls4;", "binding", "Lpa3;", "l", "Lpa3;", "Q", "()Lpa3;", "S", "(Lpa3;)V", "component", "<init>", "()V", "notification-center_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class NotificationCenterActivity extends BaseActivityLite {

    /* renamed from: j */
    public C31616Aa3 f64264j;

    /* renamed from: k */
    public C28166s4 f64265k;

    /* renamed from: l */
    public InterfaceC46946pa3 f64266l;

    @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"co/bird/android/feature/notificationcenter/NotificationCenterActivity$a", "LVe3;", "", "handleOnBackPressed", "notification-center_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.notificationcenter.NotificationCenterActivity$a */
    /* loaded from: classes3.dex */
    public static final class C15009a extends AbstractC36566Ve3 {
        public C15009a() {
            super(true);
        }

        @Override // p000.AbstractC36566Ve3
        public void handleOnBackPressed() {
            NotificationCenterActivity.this.m57899P();
        }
    }

    /* renamed from: P */
    public final void m57899P() {
        if (!m57898Q().mo19101b().mo28392a()) {
            C47539qa3.f105440b.m115329a();
            finish();
        }
    }

    /* renamed from: Q */
    public final InterfaceC46946pa3 m57898Q() {
        InterfaceC46946pa3 interfaceC46946pa3 = this.f64266l;
        if (interfaceC46946pa3 != null) {
            return interfaceC46946pa3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("component");
        return null;
    }

    /* renamed from: R */
    public final C31616Aa3 m57897R() {
        C31616Aa3 c31616Aa3 = this.f64264j;
        if (c31616Aa3 != null) {
            return c31616Aa3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fragmentNavigator");
        return null;
    }

    /* renamed from: S */
    public final void m57896S(InterfaceC46946pa3 interfaceC46946pa3) {
        Intrinsics.checkNotNullParameter(interfaceC46946pa3, "<set-?>");
        this.f64266l = interfaceC46946pa3;
    }

    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Map<String, ? extends Object> mapOf;
        super.onCreate(bundle);
        getOnBackPressedDispatcher().m70498b(this, new C15009a());
        C28166s4 m14815c = C28166s4.m14815c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m14815c, "inflate(layoutInflater)");
        this.f64265k = m14815c;
        if (m14815c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m14815c = null;
        }
        setContentView(m14815c.getRoot());
        C47539qa3 c47539qa3 = C47539qa3.f105440b;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("fragment_manager", getSupportFragmentManager()), TuplesKt.m28425to("container_id", Integer.valueOf(C32850Fh4.container)));
        m57896S(c47539qa3.m115328b(application, mapOf));
        m57898Q().mo19102a(this);
        m57897R().m115499e();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == 16908332) {
            m57899P();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
