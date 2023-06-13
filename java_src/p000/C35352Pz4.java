package p000;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.Issue;
import co.bird.android.model.RepairTypeLock;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \"2\u00020\u0001:\u0003#\u0015\u001dB\u0007¢\u0006\u0004\b \u0010!J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\"\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u0006\u0010\u0013\u001a\u00020\u000bR\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006$"}, m28432d2 = {"LPz4;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "N6", "LSz4;", "b", "LSz4;", "a5", "()LSz4;", "setPresenter", "(LSz4;)V", "presenter", "LNy4;", "c", "LNy4;", "component", "<init>", "()V", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairIssueSupertypesFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSupertypesFragment.kt\nco/bird/android/feature/repair/v2/supertypes/RepairIssueSupertypesFragment\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,147:1\n64#2:148\n1#3:149\n766#4:150\n857#4,2:151\n1549#4:153\n1620#4,3:154\n*S KotlinDebug\n*F\n+ 1 RepairIssueSupertypesFragment.kt\nco/bird/android/feature/repair/v2/supertypes/RepairIssueSupertypesFragment\n*L\n71#1:148\n87#1:150\n87#1:151,2\n87#1:153\n87#1:154,3\n*E\n"})
/* renamed from: Pz4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35352Pz4 extends Fragment {

    /* renamed from: d */
    public static final C6612a f29604d = new C6612a(null);

    /* renamed from: b */
    public InterfaceC36054Sz4 f29605b;

    /* renamed from: c */
    public InterfaceC34875Ny4 f29606c;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"LPz4$a;", "", "Lco/bird/android/model/wire/WireBird;", "bird", "LPz4;", C17296a.f69688o, "", "TAG", "Ljava/lang/String;", "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Pz4$a */
    /* loaded from: classes3.dex */
    public static final class C6612a {
        public /* synthetic */ C6612a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C35352Pz4 m89179a(WireBird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            C35352Pz4 c35352Pz4 = new C35352Pz4();
            Bundle bundle = new Bundle();
            bundle.putParcelable("bird", bird);
            c35352Pz4.setArguments(bundle);
            return c35352Pz4;
        }

        private C6612a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"LPz4$b;", "", "LPz4;", "activity", "", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class, InterfaceC34875Ny4.class}, modules = {AbstractC6615c.class})
    /* renamed from: Pz4$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC6613b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JT\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u000eH&¨\u0006\u0013"}, m28432d2 = {"LPz4$b$a;", "", "LlG2;", "mainComponent", "LNy4;", "repairComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "LPz4;", "fragment", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/widget/Button;", "completeRepairs", "addMoreRepairs", "LPz4$b;", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: Pz4$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC6614a {
            /* renamed from: a */
            InterfaceC6613b mo89177a(InterfaceC44393lG2 interfaceC44393lG2, InterfaceC34875Ny4 interfaceC34875Ny4, @BindsInstance BaseActivity baseActivity, @BindsInstance C35352Pz4 c35352Pz4, @BindsInstance ScopeProvider scopeProvider, @BindsInstance RecyclerView recyclerView, @BindsInstance Button button, @BindsInstance Button button2);
        }

        /* renamed from: a */
        void mo89178a(C35352Pz4 c35352Pz4);
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'¨\u0006\u000e"}, m28432d2 = {"LPz4$c;", "", "LCA4;", "impl", "LBA4;", "c", "LyA4;", "LSz4;", "b", "LOz4;", "LMz4;", C17296a.f69688o, "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: Pz4$c */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC6615c {

        /* renamed from: a */
        public static final C6616a f29607a = new C6616a(null);

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"LPz4$c$a;", "", "", "ADD_MORE_REPAIRS", "Ljava/lang/String;", "COMPLETE_REPAIRS", "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: Pz4$c$a */
        /* loaded from: classes3.dex */
        public static final class C6616a {
            public /* synthetic */ C6616a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C6616a() {
            }
        }

        @Binds
        /* renamed from: a */
        public abstract InterfaceC34650Mz4 m89176a(C35118Oz4 c35118Oz4);

        @Binds
        /* renamed from: b */
        public abstract InterfaceC36054Sz4 m89175b(C52048yA4 c52048yA4);

        @Binds
        /* renamed from: c */
        public abstract BA4 m89174c(CA4 ca4);
    }

    /* renamed from: N6 */
    public final void m89181N6() {
        m89180a5().mo3960b();
    }

    /* renamed from: a5 */
    public final InterfaceC36054Sz4 m89180a5() {
        InterfaceC36054Sz4 interfaceC36054Sz4 = this.f29605b;
        if (interfaceC36054Sz4 != null) {
            return interfaceC36054Sz4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        ArrayList parcelableArrayListExtra;
        int collectionSizeOrDefault;
        Issue issue;
        ArrayList parcelableArrayListExtra2;
        List listOf;
        super.onActivityResult(i, i2, intent);
        if (i != 10012) {
            if (i != 10028 || i2 != -1 || intent == null || (issue = (Issue) intent.getParcelableExtra("issue")) == null || (parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("repairs")) == null) {
                return;
            }
            InterfaceC36054Sz4 m89180a5 = m89180a5();
            listOf = CollectionsKt__CollectionsJVMKt.listOf(issue);
            m89180a5.mo3958c(listOf, parcelableArrayListExtra2);
        } else if (i2 == -1 && intent != null && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("repairs")) != null) {
            ArrayList<RepairTypeLock> arrayList = new ArrayList();
            for (Object obj : parcelableArrayListExtra) {
                if (!((RepairTypeLock) obj).component2()) {
                    arrayList.add(obj);
                }
            }
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            for (RepairTypeLock repairTypeLock : arrayList) {
                arrayList2.add(repairTypeLock.component1());
            }
            m89180a5().mo3956d(arrayList2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(C32634Ej4.fragment_repair_v2_supertypes, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        BaseActivity baseActivity;
        InterfaceC34875Ny4 interfaceC34875Ny4;
        WireBird wireBird;
        Intrinsics.checkNotNullParameter(view, "view");
        FragmentActivity activity = getActivity();
        if (activity instanceof BaseActivity) {
            baseActivity = (BaseActivity) activity;
        } else {
            baseActivity = null;
        }
        if (baseActivity == null) {
            return;
        }
        C35343Py4 c35343Py4 = C35343Py4.f29494b;
        Application application = baseActivity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "baseActivity.application");
        this.f29606c = (InterfaceC34875Ny4) AbstractC31704Ak1.component$default(c35343Py4, application, null, 2, null);
        InterfaceC6613b.InterfaceC6614a m93982a = NO0.m93982a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application2 = baseActivity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application2, "baseActivity.application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application2);
        InterfaceC34875Ny4 interfaceC34875Ny42 = this.f29606c;
        if (interfaceC34875Ny42 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("component");
            interfaceC34875Ny4 = null;
        } else {
            interfaceC34875Ny4 = interfaceC34875Ny42;
        }
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        View findViewById = view.findViewById(C35658Rh4.recyclerView);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.recyclerView)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        View findViewById2 = view.findViewById(C35658Rh4.completeRepairs);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.completeRepairs)");
        View findViewById3 = view.findViewById(C35658Rh4.addMoreRepairs);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.addMoreRepairs)");
        m93982a.mo89177a(m21419a, interfaceC34875Ny4, baseActivity, this, m45195i, recyclerView, (Button) findViewById2, (Button) findViewById3).mo89178a(this);
        Bundle arguments = getArguments();
        if (arguments != null && (wireBird = (WireBird) arguments.getParcelable("bird")) != null) {
            m89180a5().mo3962a(wireBird);
        }
    }
}
