package p000;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
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
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 +2\u00020\u0001:\u0002,\u0015B\u0007¢\u0006\u0004\b)\u0010*J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010 \u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u00120\u00120\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006-"}, m28432d2 = {"LyZ;", "Lcom/google/android/material/bottomsheet/b;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "onResume", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "Lio/reactivex/F;", "Lco/bird/android/model/DialogResponse;", "N6", "LEZ;", "b", "LEZ;", "a5", "()LEZ;", "setPresenter", "(LEZ;)V", "presenter", "Lio/reactivex/subjects/g;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/g;", "responseSubject", "LNy;", DateTokenConverter.CONVERTER_KEY, "LNy;", "alert", "", "e", "I", "bottomSheetLayout", "<init>", "()V", "f", C17296a.f69688o, "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBottomSheetAlertDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetAlertDialogFragment.kt\nco/bird/android/core/base/bottomsheetalert/BottomSheetAlertDialogFragment\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n64#2:100\n1#3:101\n*S KotlinDebug\n*F\n+ 1 BottomSheetAlertDialogFragment.kt\nco/bird/android/core/base/bottomsheetalert/BottomSheetAlertDialogFragment\n*L\n61#1:100\n*E\n"})
/* renamed from: yZ */
/* loaded from: classes2.dex */
public final class C30619yZ extends C17714b {

    /* renamed from: f */
    public static final C30622b f119735f = new C30622b(null);

    /* renamed from: b */
    public C1865EZ f119736b;

    /* renamed from: c */
    public final C24567g<DialogResponse> f119737c;

    /* renamed from: d */
    public AbstractC5751Ny f119738d;

    /* renamed from: e */
    public int f119739e;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"LyZ$a;", "", "LyZ;", "activity", "", C17296a.f69688o, "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component
    /* renamed from: yZ$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC30620a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J@\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\f\u001a\u00020\u000bH&¨\u0006\u000f"}, m28432d2 = {"LyZ$a$a;", "", "Landroid/app/Activity;", "activity", "Landroidx/constraintlayout/widget/ConstraintLayout;", "root", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lio/reactivex/subjects/g;", "Lco/bird/android/model/DialogResponse;", "responseSubject", "Landroid/content/DialogInterface;", "dialog", "LyZ$a;", C17296a.f69688o, "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: yZ$a$a */
        /* loaded from: classes2.dex */
        public interface InterfaceC30621a {
            /* renamed from: a */
            InterfaceC30620a mo3263a(@BindsInstance Activity activity, @BindsInstance ConstraintLayout constraintLayout, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C24567g<DialogResponse> c24567g, @BindsInstance DialogInterface dialogInterface);
        }

        /* renamed from: a */
        void mo3264a(C30619yZ c30619yZ);
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, m28432d2 = {"LyZ$b;", "", "LNy;", "alert", "", "bottomSheetLayout", "LyZ;", C17296a.f69688o, "", "TAG", "Ljava/lang/String;", "<init>", "()V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: yZ$b */
    /* loaded from: classes2.dex */
    public static final class C30622b {
        public /* synthetic */ C30622b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C30619yZ newInstance$default(C30622b c30622b, AbstractC5751Ny abstractC5751Ny, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = C33804Jj4.bottom_sheet_alert;
            }
            return c30622b.m3262a(abstractC5751Ny, i);
        }

        /* renamed from: a */
        public final C30619yZ m3262a(AbstractC5751Ny alert, int i) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            C30619yZ c30619yZ = new C30619yZ();
            c30619yZ.f119738d = alert;
            c30619yZ.f119739e = i;
            return c30619yZ;
        }

        private C30622b() {
        }
    }

    public C30619yZ() {
        C24567g<DialogResponse> m31882w0 = C24567g.m31882w0();
        Intrinsics.checkNotNullExpressionValue(m31882w0, "create<DialogResponse>()");
        this.f119737c = m31882w0;
        this.f119739e = C33804Jj4.bottom_sheet_alert;
    }

    /* renamed from: N6 */
    public final AbstractC23442F<DialogResponse> m3266N6() {
        AbstractC23442F<DialogResponse> m33160F = this.f119737c.m33160F();
        Intrinsics.checkNotNullExpressionValue(m33160F, "responseSubject.hide()");
        return m33160F;
    }

    /* renamed from: a5 */
    public final C1865EZ m3265a5() {
        C1865EZ c1865ez = this.f119736b;
        if (c1865ez != null) {
            return c1865ez;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(this.f119739e, viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        this.f119737c.onSuccess(DialogResponse.DISMISS);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m3265a5().m108830e();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        C24567g<DialogResponse> c24567g = this.f119737c;
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog);
        C41435gH0.m39766a().mo3263a(activity, (ConstraintLayout) view, m45195i, c24567g, dialog).mo3264a(this);
        AbstractC5751Ny abstractC5751Ny = this.f119738d;
        if (abstractC5751Ny != null) {
            m3265a5().m108825j(abstractC5751Ny);
        }
    }
}
