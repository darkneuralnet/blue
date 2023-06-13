package co.bird.android.feature.commandcenter.routing;

import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u001c2\u00020\u0001:\u0003\u001d\u0013\u001cB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0006\u0010\u0011\u001a\u00020\u000bR\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, m28432d2 = {"Lco/bird/android/feature/commandcenter/routing/b;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "N6", "Lvc5;", "b", "Lvc5;", "a5", "()Lvc5;", "setPresenter", "(Lvc5;)V", "presenter", "<init>", "()V", "c", C17296a.f69688o, "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRoutingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoutingFragment.kt\nco/bird/android/feature/commandcenter/routing/RoutingFragment\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,113:1\n64#2:114\n9#3,4:115\n*S KotlinDebug\n*F\n+ 1 RoutingFragment.kt\nco/bird/android/feature/commandcenter/routing/RoutingFragment\n*L\n56#1:114\n63#1:115,4\n*E\n"})
/* renamed from: co.bird.android.feature.commandcenter.routing.b */
/* loaded from: classes3.dex */
public final class C14717b extends Fragment {

    /* renamed from: c */
    public static final C14718a f63677c = new C14718a(null);

    /* renamed from: b */
    public InterfaceC50524vc5 f63678b;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, m28432d2 = {"Lco/bird/android/feature/commandcenter/routing/b$a;", "", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/feature/commandcenter/routing/b;", C17296a.f69688o, "<init>", "()V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.commandcenter.routing.b$a */
    /* loaded from: classes3.dex */
    public static final class C14718a {
        public /* synthetic */ C14718a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C14717b m58463a(WireBird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            C14717b c14717b = new C14717b();
            Bundle bundle = new Bundle();
            bundle.putParcelable("bird", bird);
            c14717b.setArguments(bundle);
            return c14717b;
        }

        private C14718a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/commandcenter/routing/b$b;", "", "Lco/bird/android/feature/commandcenter/routing/b;", "activity", "", C17296a.f69688o, "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {AbstractC14721c.class})
    /* renamed from: co.bird.android.feature.commandcenter.routing.b$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC14719b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J8\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH&¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/feature/commandcenter/routing/b$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/widget/Button;", "confirm", "Lco/bird/android/feature/commandcenter/routing/b$b;", C17296a.f69688o, "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.commandcenter.routing.b$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC14720a {
            /* renamed from: a */
            InterfaceC14719b mo58461a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance RecyclerView recyclerView, @BindsInstance Button button);
        }

        /* renamed from: a */
        void mo58462a(C14717b c14717b);
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/feature/commandcenter/routing/b$c;", "", "LTc5;", "impl", "LSc5;", "c", "LOc5;", "Lvc5;", "b", "Lqc5;", "Loc5;", C17296a.f69688o, "<init>", "()V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.commandcenter.routing.b$c */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC14721c {
        @Binds
        /* renamed from: a */
        public abstract InterfaceC46375oc5 m58460a(C47561qc5 c47561qc5);

        @Binds
        /* renamed from: b */
        public abstract InterfaceC50524vc5 m58459b(C34912Oc5 c34912Oc5);

        @Binds
        /* renamed from: c */
        public abstract InterfaceC35848Sc5 m58458c(C36082Tc5 c36082Tc5);
    }

    /* renamed from: N6 */
    public final void m58465N6() {
        m58464a5().onBackPressed();
    }

    /* renamed from: a5 */
    public final InterfaceC50524vc5 m58464a5() {
        InterfaceC50524vc5 interfaceC50524vc5 = this.f63678b;
        if (interfaceC50524vc5 != null) {
            return interfaceC50524vc5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(C36369Ui4.fragment_routing, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == 16908332) {
            m58464a5().onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        BaseActivity baseActivity;
        WireBird wireBird;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        BaseActivity baseActivity2 = null;
        if (activity instanceof BaseActivity) {
            baseActivity = (BaseActivity) activity;
        } else {
            baseActivity = null;
        }
        if (baseActivity == null) {
            return;
        }
        InterfaceC14719b.InterfaceC14720a m58470a = C14714a.m58470a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = baseActivity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "activity.application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        View findViewById = view.findViewById(C42273hh4.recyclerView);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.recyclerView)");
        View findViewById2 = view.findViewById(C42273hh4.confirmButton);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.confirmButton)");
        m58470a.mo58461a(m21419a, baseActivity, m45195i, (RecyclerView) findViewById, (Button) findViewById2).mo58462a(this);
        Bundle arguments = getArguments();
        if (arguments != null && (wireBird = (WireBird) arguments.getParcelable("bird")) != null) {
            InterfaceC50524vc5 m58464a5 = m58464a5();
            if (baseActivity instanceof InterfaceC50101ut4) {
                baseActivity2 = baseActivity;
            }
            m58464a5.mo8374a(wireBird, (InterfaceC50101ut4) baseActivity2);
        }
    }
}
