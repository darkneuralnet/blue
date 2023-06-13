package co.bird.android.feature.ownedbirds;

import android.app.Application;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.persistence.extensions.Bird_Kt;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/feature/ownedbirds/OwnedBirdDetailsActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "onBackPressed", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "LRA3;", "B", "LRA3;", "j0", "()LRA3;", "setPresenter", "(LRA3;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOwnedBirdDetailsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OwnedBirdDetailsActivity.kt\nco/bird/android/feature/ownedbirds/OwnedBirdDetailsActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,111:1\n44#2:112\n*S KotlinDebug\n*F\n+ 1 OwnedBirdDetailsActivity.kt\nco/bird/android/feature/ownedbirds/OwnedBirdDetailsActivity\n*L\n45#1:112\n*E\n"})
/* loaded from: classes3.dex */
public final class OwnedBirdDetailsActivity extends BaseActivity {

    /* renamed from: B */
    public RA3 f64334B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/ownedbirds/OwnedBirdDetailsActivity$a;", "", "Lco/bird/android/feature/ownedbirds/OwnedBirdDetailsActivity;", "activity", "", C17296a.f69688o, "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {C15055b.class})
    /* renamed from: co.bird.android.feature.ownedbirds.OwnedBirdDetailsActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15053a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JJ\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u000eH&¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/feature/ownedbirds/OwnedBirdDetailsActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/feature/ownedbirds/OwnedBirdDetailsActivity$b;", "ownedBirdDetailsModule", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LF4;", "binding", "", "birdId", "", "justPaired", "Lco/bird/android/feature/ownedbirds/OwnedBirdDetailsActivity$a;", C17296a.f69688o, "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.ownedbirds.OwnedBirdDetailsActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15054a {
            /* renamed from: a */
            InterfaceC15053a mo57821a(InterfaceC44393lG2 interfaceC44393lG2, C15055b c15055b, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C2126F4 c2126f4, @BindsInstance String str, @BindsInstance boolean z);
        }

        /* renamed from: a */
        void mo57820a(OwnedBirdDetailsActivity ownedBirdDetailsActivity);
    }

    @Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\f\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002H\u0007R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/feature/ownedbirds/OwnedBirdDetailsActivity$b;", "", "Ldagger/Lazy;", "LtC3;", "privateBirdPresenterImpl", "LF34;", "birdAirPresenterImpl", "Lf44;", "birdBikePresenterImpl", "LB44;", "birdFlexPresenterImpl", "LRA3;", C17296a.f69688o, "", "Ljava/lang/String;", "getModel", "()Ljava/lang/String;", RequestHeadersFactory.MODEL, "<init>", "(Ljava/lang/String;)V", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.ownedbirds.OwnedBirdDetailsActivity$b */
    /* loaded from: classes3.dex */
    public static final class C15055b {

        /* renamed from: a */
        public final String f64335a;

        public C15055b(String str) {
            this.f64335a = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
            if (r0.equals(co.bird.android.model.persistence.extensions.Bird_Kt.MODEL_BIRD_BIKE_UNPAIRED) == false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
            if (r0.equals(co.bird.android.model.persistence.extensions.Bird_Kt.MODEL_BIRD_BIKE_PAIRABLE) == false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
            r3 = r5.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, "birdBikePresenterImpl.get()");
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
            return r3;
         */
        @Provides
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final RA3 m57827a(Lazy<C49101tC3> privateBirdPresenterImpl, Lazy<F34> birdAirPresenterImpl, Lazy<C40723f44> birdBikePresenterImpl, Lazy<B44> birdFlexPresenterImpl) {
            Intrinsics.checkNotNullParameter(privateBirdPresenterImpl, "privateBirdPresenterImpl");
            Intrinsics.checkNotNullParameter(birdAirPresenterImpl, "birdAirPresenterImpl");
            Intrinsics.checkNotNullParameter(birdBikePresenterImpl, "birdBikePresenterImpl");
            Intrinsics.checkNotNullParameter(birdFlexPresenterImpl, "birdFlexPresenterImpl");
            String str = this.f64335a;
            if (str != null) {
                switch (str.hashCode()) {
                    case -104534543:
                        if (str.equals(Bird_Kt.MODEL_BIRD_AIR)) {
                            F34 f34 = birdAirPresenterImpl.get();
                            Intrinsics.checkNotNullExpressionValue(f34, "birdAirPresenterImpl.get()");
                            return f34;
                        }
                        break;
                    case 103331:
                        break;
                    case 112641:
                        break;
                    case 96754055:
                        if (str.equals(Bird_Kt.MODEL_BIRD_FLEX)) {
                            B44 b44 = birdFlexPresenterImpl.get();
                            Intrinsics.checkNotNullExpressionValue(b44, "birdFlexPresenterImpl.get()");
                            return b44;
                        }
                        break;
                }
            }
            C49101tC3 c49101tC3 = privateBirdPresenterImpl.get();
            Intrinsics.checkNotNullExpressionValue(c49101tC3, "privateBirdPresenterImpl.get()");
            return c49101tC3;
        }
    }

    public OwnedBirdDetailsActivity() {
        super(true, null, null, 6, null);
    }

    /* renamed from: j0 */
    public final RA3 m57828j0() {
        RA3 ra3 = this.f64334B;
        if (ra3 != null) {
            return ra3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (m57828j0().onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C2126F4 m107870c = C2126F4.m107870c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m107870c, "inflate(layoutInflater)");
        setContentView(m107870c.getRoot());
        setSupportActionBar(m107870c.f8600h);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70212v(true);
        }
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.mo70208z(C48193rg4.ic_arrow_left_white);
        }
        C15055b c15055b = new C15055b(getIntent().getStringExtra("bird_model"));
        InterfaceC15053a.InterfaceC15054a m57822a = C15061a.m57822a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        String stringExtra = getIntent().getStringExtra("bird_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        m57822a.mo57821a(m21419a, c15055b, this, m45197b, m107870c, stringExtra, getIntent().getBooleanExtra("just_paired", false)).mo57820a(this);
        m57828j0().mo12816a();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == 16908332 && m57828j0().onBackPressed()) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m57828j0().onResume();
    }
}
