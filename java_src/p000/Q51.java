package p000;

import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.identification.IdentificationDocumentType;
import com.facebook.share.internal.C17296a;
import com.simplecityapps.recyclerview_fastscroll.views.FastScrollRecyclerView;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import io.reactivex.AbstractC24507p;
import io.reactivex.disposables.C23464b;
import io.reactivex.subjects.C24556c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 *2\u00020\u0001:\u0003+\u0018\u001cB\u0007¢\u0006\u0004\b(\u0010)J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000fH\u0002R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010#\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u000f0\u000f0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006,"}, m28432d2 = {"LQ51;", "Lac5;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "onPause", "Lio/reactivex/p;", "Lco/bird/android/model/identification/IdentificationDocumentType;", "a5", "Landroid/content/DialogInterface;", "dialog", "onCancel", "onDismiss", "option", "N6", "LP51;", "b", "LP51;", "adapter", "Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollRecyclerView;", "c", "Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollRecyclerView;", "recyclerView", "Lio/reactivex/subjects/c;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/subjects/c;", "documentClicks", "Lio/reactivex/disposables/b;", "e", "Lio/reactivex/disposables/b;", "compositeDisposable", "<init>", "()V", "f", C17296a.f69688o, "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDocumentTypePickerBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocumentTypePickerBottomSheet.kt\nco/bird/android/feature/identification/bottomsheet/DocumentTypePickerBottomSheet\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,144:1\n64#2:145\n*S KotlinDebug\n*F\n+ 1 DocumentTypePickerBottomSheet.kt\nco/bird/android/feature/identification/bottomsheet/DocumentTypePickerBottomSheet\n*L\n68#1:145\n*E\n"})
/* renamed from: Q51 */
/* loaded from: classes3.dex */
public final class Q51 extends AbstractC38056ac5 {

    /* renamed from: f */
    public static final C6675a f29811f = new C6675a(null);

    /* renamed from: b */
    public P51 f29812b;

    /* renamed from: c */
    public FastScrollRecyclerView f29813c;

    /* renamed from: d */
    public final C24556c<IdentificationDocumentType> f29814d;

    /* renamed from: e */
    public final C23464b f29815e;

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0007\u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000f"}, m28432d2 = {"LQ51$a;", "", "", "Lco/bird/android/model/identification/IdentificationDocumentType;", "documentTypes", "selectedDocument", "LQ51;", C17296a.f69688o, "", "DOCUMENT_TYPES", "Ljava/lang/String;", "SELECTED_DOCUMENT", "TAG", "<init>", "()V", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Q51$a */
    /* loaded from: classes3.dex */
    public static final class C6675a {
        public /* synthetic */ C6675a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Q51 m88944a(List<? extends IdentificationDocumentType> documentTypes, IdentificationDocumentType identificationDocumentType) {
            Intrinsics.checkNotNullParameter(documentTypes, "documentTypes");
            Q51 q51 = new Q51();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("document_types", C44691lm0.m26849a(documentTypes));
            bundle.putParcelable("selected_document", identificationDocumentType);
            q51.setArguments(bundle);
            return q51;
        }

        private C6675a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"LQ51$b;", "", "LQ51;", "activity", "", C17296a.f69688o, "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {AbstractC6678c.class})
    /* renamed from: Q51$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC6676b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J>\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&¨\u0006\u000f"}, m28432d2 = {"LQ51$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Landroid/content/DialogInterface;", "dialog", "Lio/reactivex/p;", "Lco/bird/android/model/identification/IdentificationDocumentType;", "documentClicks", "LQ51$b;", C17296a.f69688o, "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: Q51$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC6677a {
            /* renamed from: a */
            InterfaceC6676b mo88942a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance DialogInterface dialogInterface, @BindsInstance AbstractC24507p<IdentificationDocumentType> abstractC24507p);
        }

        /* renamed from: a */
        void mo88943a(Q51 q51);
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"LQ51$c;", "", "<init>", "()V", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: Q51$c */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC6678c {
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/view/View;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "Lco/bird/android/model/identification/IdentificationDocumentType;", "item", "", C17296a.f69688o, "(Landroid/view/View;ILco/bird/android/model/identification/IdentificationDocumentType;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Q51$d */
    /* loaded from: classes3.dex */
    public static final class C6679d extends Lambda implements Function3<View, Integer, IdentificationDocumentType, Unit> {
        public C6679d() {
            super(3);
        }

        /* renamed from: a */
        public final void m88941a(View view, int i, IdentificationDocumentType item) {
            Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(item, "item");
            Q51.this.m88946N6(item);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(View view, Integer num, IdentificationDocumentType identificationDocumentType) {
            m88941a(view, num.intValue(), identificationDocumentType);
            return Unit.INSTANCE;
        }
    }

    public Q51() {
        C24556c<IdentificationDocumentType> m31906k0 = C24556c.m31906k0();
        Intrinsics.checkNotNullExpressionValue(m31906k0, "create<IdentificationDocumentType>()");
        this.f29814d = m31906k0;
        this.f29815e = new C23464b();
    }

    /* renamed from: N6 */
    public final void m88946N6(IdentificationDocumentType identificationDocumentType) {
        this.f29814d.onSuccess(identificationDocumentType);
        dismiss();
    }

    /* renamed from: a5 */
    public final AbstractC24507p<IdentificationDocumentType> m88945a5() {
        AbstractC24507p<IdentificationDocumentType> m32070E = this.f29814d.m32070E();
        Intrinsics.checkNotNullExpressionValue(m32070E, "documentClicks.hide()");
        return m32070E;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        if (!this.f29814d.m31905l0()) {
            this.f29814d.onComplete();
        }
        super.onCancel(dialog);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(C42293hj4.bottom_sheet_picker, viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        if (!this.f29814d.m31905l0()) {
            this.f29814d.onComplete();
        }
        super.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        this.f29815e.m33026d();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        BaseActivity baseActivity;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        List list = null;
        if (activity instanceof BaseActivity) {
            baseActivity = (BaseActivity) activity;
        } else {
            baseActivity = null;
        }
        if (baseActivity == null) {
            return;
        }
        InterfaceC6676b.InterfaceC6677a m104045a = HI0.m104045a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = baseActivity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "activity.application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog);
        m104045a.mo88942a(m21419a, baseActivity, m45195i, dialog, this.f29814d).mo88943a(this);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        this.f29812b = new P51(requireContext);
        FastScrollRecyclerView fastScrollRecyclerView = (FastScrollRecyclerView) C49520tu6.m11238m(view, C49981uh4.recyclerView);
        if (fastScrollRecyclerView != null) {
            fastScrollRecyclerView.setLayoutManager(new LinearLayoutManager(baseActivity));
            fastScrollRecyclerView.setItemAnimator(new C34466Mf0(D62.f5249f.mo110910b()));
            fastScrollRecyclerView.addItemDecoration(new FN5(baseActivity, C37044Xf4.card_spacing));
            fastScrollRecyclerView.setAdapter(this.f29812b);
        } else {
            fastScrollRecyclerView = null;
        }
        this.f29813c = fastScrollRecyclerView;
        TextView textView = (TextView) C49520tu6.m11238m(view, C49981uh4.title);
        if (textView != null) {
            textView.setText(C45871nl4.identification_document_type_title);
        }
        P51 p51 = this.f29812b;
        if (p51 != null) {
            p51.m44888y(new C6679d());
        }
        P51 p512 = this.f29812b;
        if (p512 != null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                list = arguments.getParcelableArrayList("document_types");
            }
            if (list == null) {
                list = CollectionsKt__CollectionsKt.emptyList();
            }
            p512.m44899C(list);
        }
    }
}
