package p000;

import android.app.Application;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.Issue;
import co.bird.android.model.IssueStatus;
import co.bird.android.model.constant.IssueStatusReason;
import com.facebook.share.internal.C17296a;
import com.google.android.material.bottomsheet.C17714b;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import io.reactivex.Observable;
import io.reactivex.subjects.AbstractC24569h;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 !2\u00020\u0001:\u0003\"\u0013\u001cB\u0007¢\u0006\u0004\b\u001f\u0010 J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\u0011\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000e0\rR\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R>\u0010\u001e\u001a,\u0012(\u0012&\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010 \u001b*\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000e0\u000e0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006#"}, m28432d2 = {"Lbe0;", "Lcom/google/android/material/bottomsheet/b;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "Lco/bird/android/model/IssueStatus;", "Lco/bird/android/model/constant/IssueStatusReason;", "P", "Lfe0;", "b", "Lfe0;", "a5", "()Lfe0;", "setPresenter", "(Lfe0;)V", "presenter", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "statusSubject", "<init>", "()V", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCantRepairBottomSheetFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CantRepairBottomSheetFragment.kt\nco/bird/android/feature/repair/v2/subtypes/dialogs/cantrepair/CantRepairBottomSheetFragment\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n64#2:107\n1#3:108\n*S KotlinDebug\n*F\n+ 1 CantRepairBottomSheetFragment.kt\nco/bird/android/feature/repair/v2/subtypes/dialogs/cantrepair/CantRepairBottomSheetFragment\n*L\n60#1:107\n*E\n"})
/* renamed from: be0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38664be0 extends C17714b {

    /* renamed from: d */
    public static final C12464c f57795d = new C12464c(null);

    /* renamed from: b */
    public InterfaceC41053fe0 f57796b;

    /* renamed from: c */
    public final C24558d<Pair<IssueStatus, IssueStatusReason>> f57797c;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lbe0$a;", "", "Lbe0;", "activity", "", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {AbstractC12463b.class})
    /* renamed from: be0$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC12461a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001Jj\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u001c\b\u0001\u0010\u0010\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r0\f2\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0014\u001a\u00020\u0013H&¨\u0006\u0017"}, m28432d2 = {"Lbe0$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lbe0;", "fragment", "Landroid/content/DialogInterface;", "dialog", "Lio/reactivex/subjects/h;", "Lkotlin/Pair;", "Lco/bird/android/model/IssueStatus;", "Lco/bird/android/model/constant/IssueStatusReason;", "statusSubject", "Landroid/widget/TextView;", "issue", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lbe0$a;", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: be0$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC12462a {
            /* renamed from: a */
            InterfaceC12461a mo64231a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C38664be0 c38664be0, @BindsInstance DialogInterface dialogInterface, @BindsInstance AbstractC24569h<Pair<IssueStatus, IssueStatusReason>> abstractC24569h, @BindsInstance TextView textView, @BindsInstance RecyclerView recyclerView);
        }

        /* renamed from: a */
        void mo64232a(C38664be0 c38664be0);
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'¨\u0006\u000b"}, m28432d2 = {"Lbe0$b;", "", "Lle0;", "impl", "Lke0;", "b", "Lje0;", "Lfe0;", C17296a.f69688o, "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: be0$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC12463b {
        @Binds
        /* renamed from: a */
        public abstract InterfaceC41053fe0 m64230a(C43425je0 c43425je0);

        @Binds
        /* renamed from: b */
        public abstract InterfaceC44018ke0 m64229b(C44611le0 c44611le0);
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"Lbe0$c;", "", "Lco/bird/android/model/Issue;", "issue", "Lbe0;", C17296a.f69688o, "", "TAG", "Ljava/lang/String;", "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: be0$c */
    /* loaded from: classes3.dex */
    public static final class C12464c {
        public /* synthetic */ C12464c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C38664be0 m64228a(Issue issue) {
            Intrinsics.checkNotNullParameter(issue, "issue");
            C38664be0 c38664be0 = new C38664be0();
            Bundle bundle = new Bundle();
            bundle.putParcelable("issue", issue);
            c38664be0.setArguments(bundle);
            return c38664be0;
        }

        private C12464c() {
        }
    }

    public C38664be0() {
        C24558d<Pair<IssueStatus, IssueStatusReason>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Pair<IssueStatus, IssueStatusReason?>>()");
        this.f57797c = m31902e;
    }

    /* renamed from: P */
    public final Observable<Pair<IssueStatus, IssueStatusReason>> m64234P() {
        Observable<Pair<IssueStatus, IssueStatusReason>> hide = this.f57797c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "statusSubject.hide()");
        return hide;
    }

    /* renamed from: a5 */
    public final InterfaceC41053fe0 m64233a5() {
        InterfaceC41053fe0 interfaceC41053fe0 = this.f57796b;
        if (interfaceC41053fe0 != null) {
            return interfaceC41053fe0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(C32634Ej4.bottom_sheet_cant_repair, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        BaseActivity baseActivity;
        Issue issue;
        Intrinsics.checkNotNullParameter(view, "view");
        FragmentActivity activity = getActivity();
        if (activity instanceof BaseActivity) {
            baseActivity = (BaseActivity) activity;
        } else {
            baseActivity = null;
        }
        BaseActivity baseActivity2 = baseActivity;
        if (baseActivity2 == null) {
            return;
        }
        InterfaceC12461a.InterfaceC12462a m112468a = CH0.m112468a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = baseActivity2.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "baseActivity.application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog);
        C24558d<Pair<IssueStatus, IssueStatusReason>> c24558d = this.f57797c;
        TextView textView = (TextView) view.findViewById(C35658Rh4.issue);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C35658Rh4.recyclerView);
        Intrinsics.checkNotNullExpressionValue(textView, "findViewById(R.id.issue)");
        Intrinsics.checkNotNullExpressionValue(recyclerView, "findViewById(R.id.recyclerView)");
        m112468a.mo64231a(m21419a, baseActivity2, m45195i, this, dialog, c24558d, textView, recyclerView).mo64232a(this);
        Bundle arguments = getArguments();
        if (arguments != null && (issue = (Issue) arguments.getParcelable("issue")) != null) {
            m64233a5().mo30162a(issue);
        }
    }
}
