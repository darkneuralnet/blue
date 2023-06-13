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
import co.bird.android.model.Warehouse;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.subjects.AbstractC24569h;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 $2\u00020\u0001:\u0003%\u0014\u001dB\u0007¢\u0006\u0004\b\"\u0010#J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u001a\u0010\u0012\u001a\u00020\u000b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\u0010R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u000e0\u000e0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006&"}, m28432d2 = {"Ljz6;", "Lac5;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "Lio/reactivex/Observable;", "Lco/bird/android/model/DialogResponse;", "A9", "Lkotlin/Function1;", "onResponse", "t8", "Llz6;", "b", "Llz6;", "N6", "()Llz6;", "setPresenter", "(Llz6;)V", "presenter", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "responseSubject", DateTokenConverter.CONVERTER_KEY, "Lkotlin/jvm/functions/Function1;", "<init>", "()V", "e", C17296a.f69688o, "warehouse-checker_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWarehouseVerificationBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WarehouseVerificationBottomSheet.kt\nco/bird/android/warehousechecker/dialogs/warehouseverification/WarehouseVerificationBottomSheet\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,127:1\n64#2:128\n44#2:129\n180#3:130\n*S KotlinDebug\n*F\n+ 1 WarehouseVerificationBottomSheet.kt\nco/bird/android/warehousechecker/dialogs/warehouseverification/WarehouseVerificationBottomSheet\n*L\n65#1:128\n80#1:129\n80#1:130\n*E\n"})
/* renamed from: jz6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43641jz6 extends AbstractC38056ac5 {

    /* renamed from: e */
    public static final C25068a f93709e = new C25068a(null);

    /* renamed from: b */
    public InterfaceC44827lz6 f93710b;

    /* renamed from: c */
    public final C24558d<DialogResponse> f93711c;

    /* renamed from: d */
    public Function1<? super DialogResponse, Unit> f93712d;

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u000e"}, m28432d2 = {"Ljz6$a;", "", "Lco/bird/android/model/Warehouse;", "currentWarehouse", "suggestedWarehouse", "Ljz6;", C17296a.f69688o, "", "CURRENT_WAREHOUSE", "Ljava/lang/String;", "SUGGESTED_WAREHOUSE", "TAG", "<init>", "()V", "warehouse-checker_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: jz6$a */
    /* loaded from: classes4.dex */
    public static final class C25068a {
        public /* synthetic */ C25068a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C43641jz6 m29515a(Warehouse currentWarehouse, Warehouse warehouse) {
            Intrinsics.checkNotNullParameter(currentWarehouse, "currentWarehouse");
            C43641jz6 c43641jz6 = new C43641jz6();
            Bundle bundle = new Bundle();
            bundle.putParcelable("current_warehouse", currentWarehouse);
            bundle.putParcelable("suggested_warehouse", warehouse);
            c43641jz6.setArguments(bundle);
            return c43641jz6;
        }

        private C25068a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Ljz6$b;", "", "Ljz6;", "activity", "", C17296a.f69688o, "warehouse-checker_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {AbstractC25071c.class})
    /* renamed from: jz6$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC25069b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\\\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\r2\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&¨\u0006\u0014"}, m28432d2 = {"Ljz6$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Landroid/widget/TextView;", "message", "Landroid/widget/Button;", "update", "selectAnother", "Landroid/content/DialogInterface;", "dialog", "Lio/reactivex/subjects/h;", "Lco/bird/android/model/DialogResponse;", "responseSubject", "Ljz6$b;", C17296a.f69688o, "warehouse-checker_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: jz6$b$a */
        /* loaded from: classes4.dex */
        public interface InterfaceC25070a {
            /* renamed from: a */
            InterfaceC25069b mo29513a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance TextView textView, @BindsInstance Button button, @BindsInstance Button button2, @BindsInstance DialogInterface dialogInterface, @BindsInstance AbstractC24569h<DialogResponse> abstractC24569h);
        }

        /* renamed from: a */
        void mo29514a(C43641jz6 c43641jz6);
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'¨\u0006\u000b"}, m28432d2 = {"Ljz6$c;", "", "Lsz6;", "impl", "Lpz6;", "b", "Loz6;", "Llz6;", C17296a.f69688o, "<init>", "()V", "warehouse-checker_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: jz6$c */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC25071c {

        /* renamed from: a */
        public static final C25072a f93713a = new C25072a(null);

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"Ljz6$c$a;", "", "", "SELECT_ANOTHER", "Ljava/lang/String;", "UPDATE", "<init>", "()V", "warehouse-checker_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: jz6$c$a */
        /* loaded from: classes4.dex */
        public static final class C25072a {
            public /* synthetic */ C25072a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C25072a() {
            }
        }

        @Binds
        /* renamed from: a */
        public abstract InterfaceC44827lz6 m29512a(C46606oz6 c46606oz6);

        @Binds
        /* renamed from: b */
        public abstract InterfaceC47199pz6 m29511b(C48977sz6 c48977sz6);
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jz6$d */
    /* loaded from: classes4.dex */
    public static final class C25073d extends Lambda implements Function1<DialogResponse, Unit> {

        /* renamed from: g */
        public static final C25073d f93714g = new C25073d();

        public C25073d() {
            super(1);
        }

        /* renamed from: a */
        public final void m29510a(DialogResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m29510a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jz6$e */
    /* loaded from: classes4.dex */
    public static final class C25074e extends Lambda implements Function1<DialogResponse, Unit> {
        public C25074e() {
            super(1);
        }

        /* renamed from: a */
        public final void m29509a(DialogResponse response) {
            Function1 function1 = C43641jz6.this.f93712d;
            Intrinsics.checkNotNullExpressionValue(response, "response");
            function1.invoke(response);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m29509a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    public C43641jz6() {
        C24558d<DialogResponse> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<DialogResponse>()");
        this.f93711c = m31902e;
        this.f93712d = C25073d.f93714g;
    }

    public static final void onViewCreated$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: A9 */
    public final Observable<DialogResponse> m29519A9() {
        Observable<DialogResponse> hide = this.f93711c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "responseSubject.hide()");
        return hide;
    }

    /* renamed from: N6 */
    public final InterfaceC44827lz6 m29518N6() {
        InterfaceC44827lz6 interfaceC44827lz6 = this.f93710b;
        if (interfaceC44827lz6 != null) {
            return interfaceC44827lz6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(C44675lk4.bottom_sheet_warehouse_verification, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        BaseActivity baseActivity;
        Warehouse warehouse;
        Intrinsics.checkNotNullParameter(view, "view");
        FragmentActivity activity = getActivity();
        Warehouse warehouse2 = null;
        if (activity instanceof BaseActivity) {
            baseActivity = (BaseActivity) activity;
        } else {
            baseActivity = null;
        }
        if (baseActivity == null) {
            return;
        }
        InterfaceC25069b.InterfaceC25070a m98889a = KR0.m98889a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = baseActivity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "activity.application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        View findViewById = view.findViewById(C52362yi4.message);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.message)");
        TextView textView = (TextView) findViewById;
        View findViewById2 = view.findViewById(C52362yi4.update);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.update)");
        View findViewById3 = view.findViewById(C52362yi4.selectAnother);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.selectAnother)");
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog);
        m98889a.mo29513a(m21419a, baseActivity, m45195i, textView, (Button) findViewById2, (Button) findViewById3, dialog, this.f93711c).mo29514a(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            warehouse2 = (Warehouse) arguments.getParcelable("suggested_warehouse");
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (warehouse = (Warehouse) arguments2.getParcelable("current_warehouse")) != null) {
            m29518N6().mo20184a(warehouse, warehouse2);
        }
        C24558d<DialogResponse> c24558d = this.f93711c;
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as = c24558d.m33094as(AutoDispose.m45239a(m45197b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25074e c25074e = new C25074e();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: iz6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43641jz6.onViewCreated$lambda$1(Function1.this, obj);
            }
        });
    }

    /* renamed from: t8 */
    public final void m29516t8(Function1<? super DialogResponse, Unit> onResponse) {
        Intrinsics.checkNotNullParameter(onResponse, "onResponse");
        this.f93712d = onResponse;
    }
}
