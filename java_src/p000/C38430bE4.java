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
import co.bird.android.model.DialogResponse;
import com.facebook.share.internal.C17296a;
import com.google.android.material.bottomsheet.C17714b;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import io.reactivex.AbstractC23442F;
import io.reactivex.subjects.C24567g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 #2\u00020\u0001:\u0002$\u0015B\u0007¢\u0006\u0004\b!\u0010\"J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010 \u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u00120\u00120\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006%"}, m28432d2 = {"LbE4;", "Lcom/google/android/material/bottomsheet/b;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "onResume", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "Lio/reactivex/F;", "Lco/bird/android/model/DialogResponse;", "N6", "LgE4;", "b", "LgE4;", "a5", "()LgE4;", "setPresenter", "(LgE4;)V", "presenter", "Lio/reactivex/subjects/g;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/g;", "responseSubject", "<init>", "()V", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairV3CompleteBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3CompleteBottomSheet.kt\nco/bird/android/feature/repair/v3/overview/dialogs/RepairV3CompleteBottomSheet\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,83:1\n64#2:84\n*S KotlinDebug\n*F\n+ 1 RepairV3CompleteBottomSheet.kt\nco/bird/android/feature/repair/v3/overview/dialogs/RepairV3CompleteBottomSheet\n*L\n45#1:84\n*E\n"})
/* renamed from: bE4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38430bE4 extends C17714b {

    /* renamed from: d */
    public static final C12327a f57117d = new C12327a(null);

    /* renamed from: b */
    public C41412gE4 f57118b;

    /* renamed from: c */
    public final C24567g<DialogResponse> f57119c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LbE4$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: bE4$a */
    /* loaded from: classes3.dex */
    public static final class C12327a {
        public /* synthetic */ C12327a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C12327a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"LbE4$b;", "", "LbE4;", "activity", "", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: bE4$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC12328b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JH\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u000e\u001a\u00020\rH&¨\u0006\u0011"}, m28432d2 = {"LbE4$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le00;", "binding", "Lio/reactivex/subjects/g;", "Lco/bird/android/model/DialogResponse;", "responseSubject", "Landroid/content/DialogInterface;", "dialog", "LbE4$b;", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: bE4$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC12329a {
            /* renamed from: a */
            InterfaceC12328b mo36459a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C40086e00 c40086e00, @BindsInstance C24567g<DialogResponse> c24567g, @BindsInstance DialogInterface dialogInterface);
        }

        /* renamed from: a */
        void mo36458a(C38430bE4 c38430bE4);
    }

    public C38430bE4() {
        C24567g<DialogResponse> m31882w0 = C24567g.m31882w0();
        Intrinsics.checkNotNullExpressionValue(m31882w0, "create<DialogResponse>()");
        this.f57119c = m31882w0;
    }

    /* renamed from: N6 */
    public final AbstractC23442F<DialogResponse> m64785N6() {
        AbstractC23442F<DialogResponse> m33160F = this.f57119c.m33160F();
        Intrinsics.checkNotNullExpressionValue(m33160F, "responseSubject.hide()");
        return m33160F;
    }

    /* renamed from: a5 */
    public final C41412gE4 m64784a5() {
        C41412gE4 c41412gE4 = this.f57118b;
        if (c41412gE4 != null) {
            return c41412gE4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return C40086e00.m43413c(inflater).getRoot();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        this.f57119c.onSuccess(DialogResponse.DISMISS);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m64784a5().m39816d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        BaseActivity baseActivity;
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
        C40086e00 m43415a = C40086e00.m43415a(view);
        Intrinsics.checkNotNullExpressionValue(m43415a, "bind(view)");
        InterfaceC12328b.InterfaceC12329a m36460a = C42100hP0.m36460a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = baseActivity2.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "activity.application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        C24567g<DialogResponse> c24567g = this.f57119c;
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog);
        m36460a.mo36459a(m21419a, baseActivity2, m45195i, m43415a, c24567g, dialog).mo36458a(this);
    }
}
