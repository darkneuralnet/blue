package p000;

import android.app.Application;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.google.android.material.bottomsheet.C17714b;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 !2\u00020\u0001:\u0003\"\u0013\u001cB\u0007¢\u0006\u0004\b\u001f\u0010 J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u000b0\u000b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006#"}, m28432d2 = {"LbQ1;", "Lcom/google/android/material/bottomsheet/b;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "Lio/reactivex/Observable;", "a5", "LdQ1;", "b", "LdQ1;", "N6", "()LdQ1;", "setPresenter", "(LdQ1;)V", "presenter", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "dismissSubject", "<init>", "()V", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIdToolPromptBottomSheetFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolPromptBottomSheetFragment.kt\nco/bird/android/feature/repair/v2/subtypes/dialogs/idtools/IdToolPromptBottomSheetFragment\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n64#2:114\n1#3:115\n*S KotlinDebug\n*F\n+ 1 IdToolPromptBottomSheetFragment.kt\nco/bird/android/feature/repair/v2/subtypes/dialogs/idtools/IdToolPromptBottomSheetFragment\n*L\n57#1:114\n*E\n"})
/* renamed from: bQ1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38535bQ1 extends C17714b {

    /* renamed from: d */
    public static final C12386a f57472d = new C12386a(null);

    /* renamed from: b */
    public InterfaceC39739dQ1 f57473b;

    /* renamed from: c */
    public final C24558d<Unit> f57474c;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"LbQ1$a;", "", "", "idToolDisplay", "LbQ1;", C17296a.f69688o, "TAG", "Ljava/lang/String;", "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: bQ1$a */
    /* loaded from: classes3.dex */
    public static final class C12386a {
        public /* synthetic */ C12386a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C38535bQ1 m64550a(String idToolDisplay) {
            Intrinsics.checkNotNullParameter(idToolDisplay, "idToolDisplay");
            C38535bQ1 c38535bQ1 = new C38535bQ1();
            Bundle bundle = new Bundle();
            bundle.putString("part", idToolDisplay);
            c38535bQ1.setArguments(bundle);
            return c38535bQ1;
        }

        private C12386a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"LbQ1$b;", "", "LbQ1;", "fragment", "", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {AbstractC12389c.class})
    /* renamed from: bQ1$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC12387b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JL\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\rH&¨\u0006\u0011"}, m28432d2 = {"LbQ1$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Landroid/widget/TextView;", "title", "description", "Landroid/widget/Button;", "scan", "Landroid/content/DialogInterface;", "dialog", "LbQ1$b;", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: bQ1$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC12388a {
            /* renamed from: a */
            InterfaceC12387b mo64548a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance TextView textView, @BindsInstance TextView textView2, @BindsInstance Button button, @BindsInstance DialogInterface dialogInterface);
        }

        /* renamed from: a */
        void mo64549a(C38535bQ1 c38535bQ1);
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'¨\u0006\u000b"}, m28432d2 = {"LbQ1$c;", "", "LhQ1;", "impl", "LgQ1;", "b", "LfQ1;", "LdQ1;", C17296a.f69688o, "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: bQ1$c */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC12389c {

        /* renamed from: a */
        public static final C12390a f57475a = new C12390a(null);

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"LbQ1$c$a;", "", "", "DESCRIPTION", "Ljava/lang/String;", "TITLE", "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: bQ1$c$a */
        /* loaded from: classes3.dex */
        public static final class C12390a {
            public /* synthetic */ C12390a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C12390a() {
            }
        }

        @Binds
        /* renamed from: a */
        public abstract InterfaceC39739dQ1 m64547a(C40924fQ1 c40924fQ1);

        @Binds
        /* renamed from: b */
        public abstract InterfaceC41517gQ1 m64546b(C42110hQ1 c42110hQ1);
    }

    public C38535bQ1() {
        C24558d<Unit> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Unit>()");
        this.f57474c = m31902e;
    }

    /* renamed from: N6 */
    public final InterfaceC39739dQ1 m64552N6() {
        InterfaceC39739dQ1 interfaceC39739dQ1 = this.f57473b;
        if (interfaceC39739dQ1 != null) {
            return interfaceC39739dQ1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    /* renamed from: a5 */
    public final Observable<Unit> m64551a5() {
        Observable<Unit> hide = this.f57474c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "dismissSubject.hide()");
        return hide;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(C32634Ej4.bottom_sheet_id_tool_prompt, viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        this.f57474c.onNext(Unit.INSTANCE);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        BaseActivity baseActivity;
        String string;
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
        InterfaceC12387b.InterfaceC12388a m107309a = FK0.m107309a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = baseActivity2.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "baseActivity.application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        TextView textView = (TextView) view.findViewById(C35658Rh4.title);
        TextView textView2 = (TextView) view.findViewById(C35658Rh4.description);
        Button button = (Button) view.findViewById(C35658Rh4.scan);
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog);
        Intrinsics.checkNotNullExpressionValue(textView, "findViewById(R.id.title)");
        Intrinsics.checkNotNullExpressionValue(textView2, "findViewById(R.id.description)");
        Intrinsics.checkNotNullExpressionValue(button, "findViewById(R.id.scan)");
        m107309a.mo64548a(m21419a, baseActivity2, m45195i, textView, textView2, button, dialog).mo64549a(this);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("part")) != null) {
            m64552N6().mo41414a(string);
        }
    }
}
