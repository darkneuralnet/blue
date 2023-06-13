package p000;

import android.app.Application;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.NonRepair;
import com.facebook.share.internal.C17296a;
import com.google.android.material.bottomsheet.C17714b;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import io.reactivex.AbstractC24507p;
import io.reactivex.subjects.C24556c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 #2\u00020\u0001:\u0002$\u0015B\u0007¢\u0006\u0004\b!\u0010\"J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010 \u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u00120\u00120\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006%"}, m28432d2 = {"Le93;", "Lcom/google/android/material/bottomsheet/b;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "onResume", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "Lio/reactivex/p;", "Lco/bird/android/model/NonRepair;", "N6", "Ls93;", "b", "Ls93;", "a5", "()Ls93;", "setPresenter", "(Ls93;)V", "presenter", "Lio/reactivex/subjects/c;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/c;", "resultSubject", "<init>", "()V", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNonRepairBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonRepairBottomSheet.kt\nco/bird/android/feature/repair/v3/issues/dialogs/nonrepair/NonRepairBottomSheet\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n64#2:96\n1#3:97\n*S KotlinDebug\n*F\n+ 1 NonRepairBottomSheet.kt\nco/bird/android/feature/repair/v3/issues/dialogs/nonrepair/NonRepairBottomSheet\n*L\n55#1:96\n*E\n"})
/* renamed from: e93  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40179e93 extends C17714b {

    /* renamed from: d */
    public static final C19972a f78025d = new C19972a(null);

    /* renamed from: b */
    public C48480s93 f78026b;

    /* renamed from: c */
    public final C24556c<NonRepair> f78027c;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, m28432d2 = {"Le93$a;", "", "Lco/bird/android/model/NonRepair;", "nonRepair", "Le93;", C17296a.f69688o, "", "NON_REPAIR", "Ljava/lang/String;", "TAG", "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: e93$a */
    /* loaded from: classes3.dex */
    public static final class C19972a {
        public /* synthetic */ C19972a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C40179e93 m43172a(NonRepair nonRepair) {
            Intrinsics.checkNotNullParameter(nonRepair, "nonRepair");
            C40179e93 c40179e93 = new C40179e93();
            Bundle bundle = new Bundle();
            bundle.putParcelable("non_repair", nonRepair);
            c40179e93.setArguments(bundle);
            return c40179e93;
        }

        private C19972a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Le93$b;", "", "Le93;", "activity", "", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: e93$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC19973b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JH\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u000e\u001a\u00020\rH&¨\u0006\u0011"}, m28432d2 = {"Le93$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LRZ;", "binding", "Lio/reactivex/subjects/c;", "Lco/bird/android/model/NonRepair;", "resultSubject", "Landroid/content/DialogInterface;", "dialog", "Le93$b;", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: e93$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC19974a {
            /* renamed from: a */
            InterfaceC19973b mo43170a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C7204RZ c7204rz, @BindsInstance C24556c<NonRepair> c24556c, @BindsInstance DialogInterface dialogInterface);
        }

        /* renamed from: a */
        void mo43171a(C40179e93 c40179e93);
    }

    public C40179e93() {
        C24556c<NonRepair> m31906k0 = C24556c.m31906k0();
        Intrinsics.checkNotNullExpressionValue(m31906k0, "create<NonRepair>()");
        this.f78027c = m31906k0;
    }

    /* renamed from: N6 */
    public final AbstractC24507p<NonRepair> m43174N6() {
        AbstractC24507p<NonRepair> m32070E = this.f78027c.m32070E();
        Intrinsics.checkNotNullExpressionValue(m32070E, "resultSubject.hide()");
        return m32070E;
    }

    /* renamed from: a5 */
    public final C48480s93 m43173a5() {
        C48480s93 c48480s93 = this.f78026b;
        if (c48480s93 != null) {
            return c48480s93;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return C7204RZ.m86615c(inflater).getRoot();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        this.f78027c.onComplete();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m43173a5().m14654l();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        BaseActivity baseActivity;
        NonRepair nonRepair;
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
        C7204RZ m86617a = C7204RZ.m86617a(view);
        Intrinsics.checkNotNullExpressionValue(m86617a, "bind(view)");
        InterfaceC19973b.InterfaceC19974a m115900a = AM0.m115900a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = baseActivity2.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "activity.application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        C24556c<NonRepair> c24556c = this.f78027c;
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog);
        m115900a.mo43170a(m21419a, baseActivity2, m45195i, m86617a, c24556c, dialog).mo43171a(this);
        Bundle arguments = getArguments();
        if (arguments != null && (nonRepair = (NonRepair) arguments.getParcelable("non_repair")) != null) {
            m43173a5().m14655k(nonRepair);
        }
    }
}
