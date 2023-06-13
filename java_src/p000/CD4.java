package p000;

import android.app.Application;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.Issue;
import co.bird.android.model.LegacyRepair;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \"2\u00020\u0001:\u0003#\u0014\u001dB\u0007¢\u0006\u0004\b \u0010!J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u00110\u00110\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006$"}, m28432d2 = {"LCD4;", "Lac5;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "Lio/reactivex/Observable;", "Lco/bird/android/model/DialogResponse;", "a5", "LID4;", "b", "LID4;", "N6", "()LID4;", "setPresenter", "(LID4;)V", "presenter", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "dismissSubject", "<init>", "()V", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairSummaryBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairSummaryBottomSheet.kt\nco/bird/android/feature/repair/v2/supertypes/repairsummary/RepairSummaryBottomSheet\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,120:1\n64#2:121\n*S KotlinDebug\n*F\n+ 1 RepairSummaryBottomSheet.kt\nco/bird/android/feature/repair/v2/supertypes/repairsummary/RepairSummaryBottomSheet\n*L\n62#1:121\n*E\n"})
/* renamed from: CD4 */
/* loaded from: classes3.dex */
public final class CD4 extends AbstractC38056ac5 {

    /* renamed from: d */
    public static final C0925a f3626d = new C0925a(null);

    /* renamed from: b */
    public ID4 f3627b;

    /* renamed from: c */
    public final C24558d<DialogResponse> f3628c;

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\"\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m28432d2 = {"LCD4$a;", "", "", "Lco/bird/android/model/Issue;", "issues", "Lco/bird/android/model/LegacyRepair;", "repairs", "LCD4;", C17296a.f69688o, "", "TAG", "Ljava/lang/String;", "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: CD4$a */
    /* loaded from: classes3.dex */
    public static final class C0925a {
        public /* synthetic */ C0925a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final CD4 m112609a(List<Issue> issues, List<LegacyRepair> repairs) {
            Intrinsics.checkNotNullParameter(issues, "issues");
            Intrinsics.checkNotNullParameter(repairs, "repairs");
            CD4 cd4 = new CD4();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("issues", new ArrayList<>(issues));
            bundle.putParcelableArrayList("repairs", new ArrayList<>(repairs));
            cd4.setArguments(bundle);
            return cd4;
        }

        private C0925a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"LCD4$b;", "", "LCD4;", "activity", "", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {AbstractC0928c.class})
    /* renamed from: CD4$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC0926b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JB\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\fH&¨\u0006\u0010"}, m28432d2 = {"LCD4$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Landroid/content/DialogInterface;", "dialog", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/widget/Button;", "done", "LCD4$b;", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: CD4$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC0927a {
            /* renamed from: a */
            InterfaceC0926b mo61437a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance DialogInterface dialogInterface, @BindsInstance RecyclerView recyclerView, @BindsInstance Button button);
        }

        /* renamed from: a */
        void mo61436a(CD4 cd4);
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'¨\u0006\u000e"}, m28432d2 = {"LCD4$c;", "", "LQD4;", "impl", "LPD4;", "c", "LMD4;", "LID4;", "b", "LGD4;", "LED4;", C17296a.f69688o, "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: CD4$c */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC0928c {
        @Binds
        /* renamed from: a */
        public abstract ED4 m112608a(GD4 gd4);

        @Binds
        /* renamed from: b */
        public abstract ID4 m112607b(MD4 md4);

        @Binds
        /* renamed from: c */
        public abstract PD4 m112606c(QD4 qd4);
    }

    public CD4() {
        C24558d<DialogResponse> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<DialogResponse>()");
        this.f3628c = m31902e;
    }

    /* renamed from: N6 */
    public final ID4 m112611N6() {
        ID4 id4 = this.f3627b;
        if (id4 != null) {
            return id4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    /* renamed from: a5 */
    public final Observable<DialogResponse> m112610a5() {
        Observable<DialogResponse> hide = this.f3628c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "dismissSubject.hide()");
        return hide;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(C32634Ej4.bottom_sheet_repair_summary, viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        DialogResponse dialogResponse;
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        if (m112611N6().mo95560b()) {
            dialogResponse = DialogResponse.OK;
        } else {
            dialogResponse = DialogResponse.CANCEL;
        }
        this.f3628c.onNext(dialogResponse);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        BaseActivity baseActivity;
        ArrayList parcelableArrayList;
        Bundle arguments;
        ArrayList parcelableArrayList2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
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
        InterfaceC0926b.InterfaceC0927a m61438a = C39118cP0.m61438a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = baseActivity2.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "baseActivity.application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog);
        View findViewById = view.findViewById(C35658Rh4.recyclerView);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.recyclerView)");
        View findViewById2 = view.findViewById(C35658Rh4.done);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.done)");
        m61438a.mo61437a(m21419a, baseActivity2, m45195i, dialog, (RecyclerView) findViewById, (Button) findViewById2).mo61436a(this);
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (parcelableArrayList = arguments2.getParcelableArrayList("issues")) != null && (arguments = getArguments()) != null && (parcelableArrayList2 = arguments.getParcelableArrayList("repairs")) != null) {
            m112611N6().mo95561a(parcelableArrayList, parcelableArrayList2);
        }
    }
}
