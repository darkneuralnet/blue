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
import co.bird.android.model.DialogResponse;
import co.bird.android.model.wire.WireBird;
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
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001f2\u00020\u0001:\u0003 \u0011\u001aB\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u000e0\u000e0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006!"}, m28432d2 = {"LDn5;", "Lac5;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "Lio/reactivex/Observable;", "Lco/bird/android/model/DialogResponse;", "N6", "LFn5;", "b", "LFn5;", "a5", "()LFn5;", "setPresenter", "(LFn5;)V", "presenter", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "responseSubject", "<init>", "()V", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScrapInspectionConfirmationBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapInspectionConfirmationBottomSheet.kt\nco/bird/android/feature/scrap/landing/dialog/inspectionconfirmation/ScrapInspectionConfirmationBottomSheet\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n64#2:113\n1#3:114\n*S KotlinDebug\n*F\n+ 1 ScrapInspectionConfirmationBottomSheet.kt\nco/bird/android/feature/scrap/landing/dialog/inspectionconfirmation/ScrapInspectionConfirmationBottomSheet\n*L\n60#1:113\n*E\n"})
/* renamed from: Dn5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32437Dn5 extends AbstractC38056ac5 {

    /* renamed from: d */
    public static final C1601a f6328d = new C1601a(null);

    /* renamed from: b */
    public InterfaceC32905Fn5 f6329b;

    /* renamed from: c */
    public final C24558d<DialogResponse> f6330c;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"LDn5$a;", "", "Lco/bird/android/model/wire/WireBird;", "bird", "LDn5;", C17296a.f69688o, "", "TAG", "Ljava/lang/String;", "<init>", "()V", "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Dn5$a */
    /* loaded from: classes3.dex */
    public static final class C1601a {
        public /* synthetic */ C1601a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C32437Dn5 m109938a(WireBird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            C32437Dn5 c32437Dn5 = new C32437Dn5();
            Bundle bundle = new Bundle();
            bundle.putParcelable("bird", bird);
            c32437Dn5.setArguments(bundle);
            return c32437Dn5;
        }

        private C1601a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"LDn5$b;", "", "LDn5;", "activity", "", C17296a.f69688o, "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {AbstractC1604c.class})
    /* renamed from: Dn5$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC1602b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\\\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\r2\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&¨\u0006\u0014"}, m28432d2 = {"LDn5$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Landroid/widget/TextView;", "message", "Landroid/widget/Button;", "confirm", "cancel", "Landroid/content/DialogInterface;", "dialog", "Lio/reactivex/subjects/h;", "Lco/bird/android/model/DialogResponse;", "responseSubject", "LDn5$b;", C17296a.f69688o, "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: Dn5$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC1603a {
            /* renamed from: a */
            InterfaceC1602b mo30647a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance TextView textView, @BindsInstance Button button, @BindsInstance Button button2, @BindsInstance DialogInterface dialogInterface, @BindsInstance AbstractC24569h<DialogResponse> abstractC24569h);
        }

        /* renamed from: a */
        void mo30646a(C32437Dn5 c32437Dn5);
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'¨\u0006\u000b"}, m28432d2 = {"LDn5$c;", "", "LMn5;", "impl", "LJn5;", "b", "LIn5;", "LFn5;", C17296a.f69688o, "<init>", "()V", "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: Dn5$c */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC1604c {

        /* renamed from: a */
        public static final C1605a f6331a = new C1605a(null);

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"LDn5$c$a;", "", "", "CANCEL", "Ljava/lang/String;", "CONFIRM", "<init>", "()V", "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: Dn5$c$a */
        /* loaded from: classes3.dex */
        public static final class C1605a {
            public /* synthetic */ C1605a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C1605a() {
            }
        }

        @Binds
        /* renamed from: a */
        public abstract InterfaceC32905Fn5 m109937a(C33607In5 c33607In5);

        @Binds
        /* renamed from: b */
        public abstract InterfaceC33841Jn5 m109936b(C34543Mn5 c34543Mn5);
    }

    public C32437Dn5() {
        C24558d<DialogResponse> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<DialogResponse>()");
        this.f6330c = m31902e;
    }

    /* renamed from: N6 */
    public final Observable<DialogResponse> m109940N6() {
        Observable<DialogResponse> hide = this.f6330c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "responseSubject.hide()");
        return hide;
    }

    /* renamed from: a5 */
    public final InterfaceC32905Fn5 m109939a5() {
        InterfaceC32905Fn5 interfaceC32905Fn5 = this.f6329b;
        if (interfaceC32905Fn5 != null) {
            return interfaceC32905Fn5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(C34272Lj4.bottom_sheet_scrap_inspection_confirmation, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        BaseActivity baseActivity;
        WireBird wireBird;
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
        InterfaceC1602b.InterfaceC1603a m30648a = C43295jQ0.m30648a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = baseActivity2.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "activity.application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        View findViewById = view.findViewById(C37296Yh4.message);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.message)");
        TextView textView = (TextView) findViewById;
        View findViewById2 = view.findViewById(C37296Yh4.confirm);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.confirm)");
        View findViewById3 = view.findViewById(C37296Yh4.cancel);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.cancel)");
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog);
        m30648a.mo30647a(m21419a, baseActivity2, m45195i, textView, (Button) findViewById2, (Button) findViewById3, dialog, this.f6330c).mo30646a(this);
        Bundle arguments = getArguments();
        if (arguments != null && (wireBird = (WireBird) arguments.getParcelable("bird")) != null) {
            m109939a5().mo101717a(wireBird);
        }
    }
}
