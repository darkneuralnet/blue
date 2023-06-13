package co.bird.android.feature.repair.p015v2.overview;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.google.android.material.tabs.TabLayout;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import dagger.Provides;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\"\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, m28432d2 = {"Lco/bird/android/feature/repair/v2/overview/RepairV2Activity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onBackPressed", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "LWD4;", "B", "LWD4;", "j0", "()LWD4;", "setPresenter", "(LWD4;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV2Activity.kt\nco/bird/android/feature/repair/v2/overview/RepairV2Activity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,112:1\n1#2:113\n288#3,2:114\n1855#3,2:116\n*S KotlinDebug\n*F\n+ 1 RepairV2Activity.kt\nco/bird/android/feature/repair/v2/overview/RepairV2Activity\n*L\n46#1:114,2\n69#1:116,2\n*E\n"})
/* renamed from: co.bird.android.feature.repair.v2.overview.RepairV2Activity */
/* loaded from: classes3.dex */
public final class RepairV2Activity extends BaseActivity {

    /* renamed from: B */
    public WD4 f64638B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/repair/v2/overview/RepairV2Activity$a;", "", "Lco/bird/android/feature/repair/v2/overview/RepairV2Activity;", "activity", "", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {AbstractC15215b.class})
    /* renamed from: co.bird.android.feature.repair.v2.overview.RepairV2Activity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15213a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/repair/v2/overview/RepairV2Activity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/google/android/material/tabs/TabLayout;", "tabLayout", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "Lco/bird/android/feature/repair/v2/overview/RepairV2Activity$a;", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.repair.v2.overview.RepairV2Activity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15214a {
            /* renamed from: a */
            InterfaceC15213a mo57542a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance TabLayout tabLayout, @BindsInstance ViewPager2 viewPager2);
        }

        /* renamed from: a */
        void mo57541a(RepairV2Activity repairV2Activity);
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/feature/repair/v2/overview/RepairV2Activity$b;", "", "LaE4;", "impl", "LYD4;", "b", "LXD4;", "LWD4;", C17296a.f69688o, "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.repair.v2.overview.RepairV2Activity$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC15215b {

        /* renamed from: a */
        public static final C15216a f64639a = new C15216a(null);

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, m28432d2 = {"Lco/bird/android/feature/repair/v2/overview/RepairV2Activity$b$a;", "", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", C17296a.f69688o, "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @Module
        @SourceDebugExtension({"SMAP\nRepairV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV2Activity.kt\nco/bird/android/feature/repair/v2/overview/RepairV2Activity$RepairV2Module$Companion\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,112:1\n44#2:113\n*S KotlinDebug\n*F\n+ 1 RepairV2Activity.kt\nco/bird/android/feature/repair/v2/overview/RepairV2Activity$RepairV2Module$Companion\n*L\n89#1:113\n*E\n"})
        /* renamed from: co.bird.android.feature.repair.v2.overview.RepairV2Activity$b$a */
        /* loaded from: classes3.dex */
        public static final class C15216a {
            public /* synthetic */ C15216a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Provides
            @JvmStatic
            /* renamed from: a */
            public final ScopeProvider m57544a(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(activity);
                Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
                return m45197b;
            }

            private C15216a() {
            }
        }

        @Provides
        @JvmStatic
        /* renamed from: c */
        public static final ScopeProvider m57545c(BaseActivity baseActivity) {
            return f64639a.m57544a(baseActivity);
        }

        @Binds
        /* renamed from: a */
        public abstract WD4 m57547a(XD4 xd4);

        @Binds
        /* renamed from: b */
        public abstract YD4 m57546b(C37837aE4 c37837aE4);
    }

    public RepairV2Activity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final WD4 m57548j0() {
        WD4 wd4 = this.f64638B;
        if (wd4 != null) {
            return wd4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10028 && i2 == -1 && intent == null) {
            mo58957w().close();
            return;
        }
        List<Fragment> m67283z0 = getSupportFragmentManager().m67283z0();
        Intrinsics.checkNotNullExpressionValue(m67283z0, "supportFragmentManager.fragments");
        for (Fragment fragment : m67283z0) {
            fragment.onActivityResult(i, i2, intent);
        }
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C35352Pz4 c35352Pz4;
        Object obj;
        List<Fragment> m67283z0 = getSupportFragmentManager().m67283z0();
        Intrinsics.checkNotNullExpressionValue(m67283z0, "supportFragmentManager.fragments");
        Iterator<T> it = m67283z0.iterator();
        while (true) {
            c35352Pz4 = null;
            if (it.hasNext()) {
                obj = it.next();
                if (((Fragment) obj) instanceof C35352Pz4) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Fragment fragment = (Fragment) obj;
        if (fragment instanceof C35352Pz4) {
            c35352Pz4 = (C35352Pz4) fragment;
        }
        if (c35352Pz4 != null) {
            c35352Pz4.m89181N6();
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C32634Ej4.activity_repair_v2_overview);
        InterfaceC15213a.InterfaceC15214a m57543a = C15217a.m57543a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        View findViewById = findViewById(C35658Rh4.tabs);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.tabs)");
        View findViewById2 = findViewById(C35658Rh4.viewPager);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.viewPager)");
        m57543a.mo57542a(m21419a, this, (TabLayout) findViewById, (ViewPager2) findViewById2).mo57541a(this);
        WireBird wireBird = (WireBird) getIntent().getParcelableExtra("bird");
        if (wireBird != null) {
            m57548j0().mo77175a(wireBird);
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
