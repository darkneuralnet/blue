package p000;

import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogInterface$OnCancelListenerC11663c;
import androidx.fragment.app.FragmentActivity;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.widget.adapter.ViewHolderSupplier;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import io.reactivex.Observable;
import io.reactivex.subjects.AbstractC24569h;
import io.reactivex.subjects.C24558d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.S74;
@Metadata(m28433d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0004<\"*1B\u0007¢\u0006\u0004\b9\u0010:J&\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\fH\u0016J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\u0014\u0010\u001e\u001a\u00020\f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bJ\u0014\u0010\u001f\u001a\u00020\f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bR.\u0010(\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010 8\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0016\u00103\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\"\u00108\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\u00190\u0019048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u0006="}, m28432d2 = {"LnQ5;", "Landroidx/fragment/app/c;", "LS74;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "Landroid/app/Dialog;", "onCreateDialog", "onStart", "", "show", "", "hiddenState", "showProgress", "startProgress", "stopProgress", "Lio/reactivex/Observable;", "LnQ5$b;", "a5", "", "LH6;", "sections", "A9", "t8", "LxQ5;", "<set-?>", "b", "LxQ5;", "getUi", "()LxQ5;", "B9", "(LxQ5;)V", "ui", "LoQ5;", "c", "LoQ5;", "N6", "()LoQ5;", "setPresenter", "(LoQ5;)V", "presenter", DateTokenConverter.CONVERTER_KEY, "Z", "progress", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "e", "Lio/reactivex/subjects/d;", "responseSubject", "<init>", "()V", "f", C17296a.f69688o, "status-dialog_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStatusDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatusDialog.kt\nco/bird/android/statusdialog/StatusDialog\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,154:1\n64#2:155\n*S KotlinDebug\n*F\n+ 1 StatusDialog.kt\nco/bird/android/statusdialog/StatusDialog\n*L\n67#1:155\n*E\n"})
/* renamed from: nQ5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C45672nQ5 extends DialogInterface$OnCancelListenerC11663c implements S74 {

    /* renamed from: f */
    public static final C26503a f99920f = new C26503a(null);

    /* renamed from: b */
    public InterfaceC51600xQ5 f99921b;

    /* renamed from: c */
    public InterfaceC46265oQ5 f99922c;

    /* renamed from: d */
    public boolean f99923d;

    /* renamed from: e */
    public final C24558d<EnumC26504b> f99924e;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, m28432d2 = {"LnQ5$a;", "", "Lco/bird/android/widget/adapter/ViewHolderSupplier;", "LeT0;", "supplier", "LnQ5;", C17296a.f69688o, "", "TAG", "Ljava/lang/String;", "VIEW_HOLDER_SUPPLIER", "<init>", "()V", "status-dialog_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: nQ5$a */
    /* loaded from: classes4.dex */
    public static final class C26503a {
        public /* synthetic */ C26503a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C45672nQ5 m23790a(ViewHolderSupplier<AbstractC40357eT0> supplier) {
            Intrinsics.checkNotNullParameter(supplier, "supplier");
            C45672nQ5 c45672nQ5 = new C45672nQ5();
            Bundle bundle = new Bundle();
            bundle.putParcelable("view_holder_supplier", supplier);
            c45672nQ5.setArguments(bundle);
            return c45672nQ5;
        }

        private C26503a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m28432d2 = {"LnQ5$b;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "status-dialog_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: nQ5$b */
    /* loaded from: classes4.dex */
    public enum EnumC26504b {
        CANCEL,
        OKAY,
        TRY_AGAIN,
        NEXT_ONE
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"LnQ5$c;", "", "LnQ5;", "activity", "", C17296a.f69688o, "status-dialog_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC26507d.class})
    /* renamed from: nQ5$c */
    /* loaded from: classes4.dex */
    public interface InterfaceC26505c {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001Jb\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H&¨\u0006\u0016"}, m28432d2 = {"LnQ5$c$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "LnQ5;", "fragment", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "Lco/bird/android/widget/adapter/ViewHolderSupplier;", "LeT0;", "supplier", "Landroid/content/DialogInterface;", "dialog", "LG31;", "binding", "Lio/reactivex/subjects/h;", "LnQ5$b;", "responseSubject", "LnQ5$c;", C17296a.f69688o, "status-dialog_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: nQ5$c$a */
        /* loaded from: classes4.dex */
        public interface InterfaceC26506a {
            /* renamed from: a */
            InterfaceC26505c mo23787a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance C45672nQ5 c45672nQ5, @BindsInstance ScopeProvider scopeProvider, @BindsInstance ViewHolderSupplier<AbstractC40357eT0> viewHolderSupplier, @BindsInstance DialogInterface dialogInterface, @BindsInstance G31 g31, @BindsInstance AbstractC24569h<EnumC26504b> abstractC24569h);
        }

        /* renamed from: a */
        void mo23788a(C45672nQ5 c45672nQ5);
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'¨\u0006\t"}, m28432d2 = {"LnQ5$d;", "", "LAQ5;", "impl", "LxQ5;", C17296a.f69688o, "LvQ5;", "LoQ5;", "b", "status-dialog_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: nQ5$d */
    /* loaded from: classes4.dex */
    public interface InterfaceC26507d {
        @Binds
        /* renamed from: a */
        InterfaceC51600xQ5 m23786a(AQ5 aq5);

        @Binds
        /* renamed from: b */
        InterfaceC46265oQ5 m23785b(C50414vQ5 c50414vQ5);
    }

    @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"nQ5$e", "Landroid/app/Dialog;", "", "onBackPressed", "status-dialog_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: nQ5$e */
    /* loaded from: classes4.dex */
    public static final class DialogC26508e extends Dialog {
        public DialogC26508e(Context context, int i) {
            super(context, i);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            C45672nQ5.this.m23793N6().onBackPressed();
        }
    }

    public C45672nQ5() {
        C24558d<EnumC26504b> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Response>()");
        this.f99924e = m31902e;
    }

    /* renamed from: A9 */
    public final void m23795A9(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        m23793N6().mo8700b1(sections);
    }

    /* renamed from: B9 */
    public final void m23794B9(InterfaceC51600xQ5 interfaceC51600xQ5) {
        this.f99921b = interfaceC51600xQ5;
    }

    /* renamed from: N6 */
    public final InterfaceC46265oQ5 m23793N6() {
        InterfaceC46265oQ5 interfaceC46265oQ5 = this.f99922c;
        if (interfaceC46265oQ5 != null) {
            return interfaceC46265oQ5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    /* renamed from: a5 */
    public final Observable<EnumC26504b> m23792a5() {
        Observable<EnumC26504b> hide = this.f99924e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "responseSubject.hide()");
        return hide;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c
    public Dialog onCreateDialog(Bundle bundle) {
        Context context = getContext();
        Intrinsics.checkNotNull(context);
        return new DialogC26508e(context, getTheme());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return G31.m105889c(inflater, viewGroup, false).f10844h;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Window window2;
        Window window3;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window3 = dialog.getWindow()) != null) {
            window3.setDimAmount(0.0f);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window2 = dialog2.getWindow()) != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null && (window = dialog3.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ViewHolderSupplier<AbstractC40357eT0> viewHolderSupplier;
        Intrinsics.checkNotNullParameter(view, "view");
        G31 m105891a = G31.m105891a(view);
        Intrinsics.checkNotNullExpressionValue(m105891a, "bind(view)");
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type co.bird.android.core.mvp.BaseActivity");
        BaseActivity baseActivity = (BaseActivity) activity;
        Bundle arguments = getArguments();
        if (arguments != null && (viewHolderSupplier = (ViewHolderSupplier) arguments.getParcelable("view_holder_supplier")) != null) {
            InterfaceC26505c.InterfaceC26506a m98909a = KQ0.m98909a();
            C46172oG2 c46172oG2 = C46172oG2.f101711a;
            Application application = baseActivity.getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "baseActivity.application");
            InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
            AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
            Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
            Dialog dialog = getDialog();
            Intrinsics.checkNotNull(dialog);
            m98909a.mo23787a(m21419a, baseActivity, this, m45195i, viewHolderSupplier, dialog, m105891a, this.f99924e).mo23788a(this);
            InterfaceC51600xQ5 interfaceC51600xQ5 = this.f99921b;
            if (interfaceC51600xQ5 != null) {
                S74.C7343a.showProgress$default(interfaceC51600xQ5, this.f99923d, 0, 2, null);
            }
        }
    }

    @Override // p000.S74
    public void showProgress(boolean z, int i) {
        InterfaceC51600xQ5 interfaceC51600xQ5 = this.f99921b;
        if (interfaceC51600xQ5 != null) {
            interfaceC51600xQ5.showProgress(z, i);
        }
    }

    @Override // p000.S74
    public void startProgress() {
        this.f99923d = true;
        InterfaceC51600xQ5 interfaceC51600xQ5 = this.f99921b;
        if (interfaceC51600xQ5 != null) {
            interfaceC51600xQ5.startProgress();
        }
    }

    @Override // p000.S74
    public void stopProgress(int i) {
        this.f99923d = false;
        InterfaceC51600xQ5 interfaceC51600xQ5 = this.f99921b;
        if (interfaceC51600xQ5 != null) {
            S74.C7343a.stopProgress$default(interfaceC51600xQ5, 0, 1, null);
        }
    }

    /* renamed from: t8 */
    public final void m23791t8(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        m23793N6().mo8694g1(sections);
    }
}
