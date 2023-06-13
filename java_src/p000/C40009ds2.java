package p000;

import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.simplecityapps.recyclerview_fastscroll.views.FastScrollRecyclerView;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import io.reactivex.AbstractC24507p;
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
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 '*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0003(\u0019\u001dB\u0007¢\u0006\u0004\b%\u0010&J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010$\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00018\u00008\u00000 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006)"}, m28432d2 = {"Lds2;", "Landroid/os/Parcelable;", "T", "Lac5;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "Lio/reactivex/p;", "a5", "Landroid/content/DialogInterface;", "dialog", "onCancel", "onDismiss", "option", "N6", "(Landroid/os/Parcelable;)V", "Lcs2;", "b", "Lcs2;", "adapter", "Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollRecyclerView;", "c", "Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollRecyclerView;", "recyclerView", "Lio/reactivex/subjects/c;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/subjects/c;", "elementClicks", "<init>", "()V", "e", C17296a.f69688o, "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nListPickerBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListPickerBottomSheet.kt\nco/bird/android/feature/identification/bottomsheet/ListPickerBottomSheet\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,143:1\n64#2:144\n*S KotlinDebug\n*F\n+ 1 ListPickerBottomSheet.kt\nco/bird/android/feature/identification/bottomsheet/ListPickerBottomSheet\n*L\n70#1:144\n*E\n"})
/* renamed from: ds2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40009ds2<T extends Parcelable> extends AbstractC38056ac5 {

    /* renamed from: e */
    public static final C19877a f77321e = new C19877a(null);

    /* renamed from: b */
    public C39417cs2<T> f77322b;

    /* renamed from: c */
    public FastScrollRecyclerView f77323c;

    /* renamed from: d */
    public final C24556c<T> f77324d;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t\"\b\b\u0001\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u0013"}, m28432d2 = {"Lds2$a;", "", "Landroid/os/Parcelable;", "T", "", "listElements", "selectedElement", "", "title", "Lds2;", C17296a.f69688o, "(Ljava/util/List;Landroid/os/Parcelable;Ljava/lang/String;)Lds2;", "LIST_ELEMENTS", "Ljava/lang/String;", "SELECTED_LIST_ELEMENT", "TAG", "TITLE", "<init>", "()V", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: ds2$a */
    /* loaded from: classes3.dex */
    public static final class C19877a {
        public /* synthetic */ C19877a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final <T extends Parcelable> C40009ds2<T> m43578a(List<? extends T> listElements, T t, String title) {
            Intrinsics.checkNotNullParameter(listElements, "listElements");
            Intrinsics.checkNotNullParameter(title, "title");
            C40009ds2<T> c40009ds2 = new C40009ds2<>();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("list_elements", C44691lm0.m26849a(listElements));
            bundle.putParcelable("selected_list_element", t);
            bundle.putString("title", title);
            c40009ds2.setArguments(bundle);
            return c40009ds2;
        }

        private C19877a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\u0007"}, m28432d2 = {"Lds2$b;", "", "Lds2;", "Landroid/os/Parcelable;", "activity", "", C17296a.f69688o, "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {AbstractC19880c.class})
    /* renamed from: ds2$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC19878b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J<\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\f\b\u0001\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH&¨\u0006\u000e"}, m28432d2 = {"Lds2$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Landroid/content/DialogInterface;", "dialog", "Lio/reactivex/p;", "elementClicks", "Lds2$b;", C17296a.f69688o, "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: ds2$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC19879a {
            /* renamed from: a */
            InterfaceC19878b mo43576a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance DialogInterface dialogInterface, @BindsInstance AbstractC24507p<?> abstractC24507p);
        }

        /* renamed from: a */
        void mo43577a(C40009ds2<Parcelable> c40009ds2);
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lds2$c;", "", "<init>", "()V", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: ds2$c */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC19880c {
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Landroid/os/Parcelable;", "T", "Landroid/view/View;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "item", "", C17296a.f69688o, "(Landroid/view/View;ILandroid/os/Parcelable;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ds2$d */
    /* loaded from: classes3.dex */
    public static final class C19881d extends Lambda implements Function3<View, Integer, Parcelable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C40009ds2<T> f77325g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19881d(C40009ds2<T> c40009ds2) {
            super(3);
            this.f77325g = c40009ds2;
        }

        /* renamed from: a */
        public final void m43575a(View view, int i, Parcelable item) {
            Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(item, "item");
            this.f77325g.m43580N6(item);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(View view, Integer num, Parcelable parcelable) {
            m43575a(view, num.intValue(), parcelable);
            return Unit.INSTANCE;
        }
    }

    public C40009ds2() {
        C24556c<T> m31906k0 = C24556c.m31906k0();
        Intrinsics.checkNotNullExpressionValue(m31906k0, "create<T>()");
        this.f77324d = m31906k0;
    }

    /* renamed from: N6 */
    public final void m43580N6(T t) {
        this.f77324d.onSuccess(t);
        dismiss();
    }

    /* renamed from: a5 */
    public final AbstractC24507p<T> m43579a5() {
        AbstractC24507p<T> m32070E = this.f77324d.m32070E();
        Intrinsics.checkNotNullExpressionValue(m32070E, "elementClicks.hide()");
        return m32070E;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        if (!this.f77324d.m31905l0()) {
            this.f77324d.onComplete();
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
        if (!this.f77324d.m31905l0()) {
            this.f77324d.onComplete();
        }
        super.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        BaseActivity baseActivity;
        String str;
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
        InterfaceC19878b.InterfaceC19879a m95436a = ML0.m95436a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = baseActivity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "activity.application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog);
        InterfaceC19878b mo43576a = m95436a.mo43576a(m21419a, baseActivity, m45195i, dialog, this.f77324d);
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type co.bird.android.feature.identification.bottomsheet.ListPickerBottomSheet<android.os.Parcelable>");
        mo43576a.mo43577a(this);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        this.f77322b = new C39417cs2<>(requireContext);
        FastScrollRecyclerView fastScrollRecyclerView = (FastScrollRecyclerView) C49520tu6.m11238m(view, C49981uh4.recyclerView);
        if (fastScrollRecyclerView != null) {
            fastScrollRecyclerView.setLayoutManager(new LinearLayoutManager(baseActivity));
            fastScrollRecyclerView.setItemAnimator(new C34466Mf0(D62.f5249f.mo110910b()));
            fastScrollRecyclerView.addItemDecoration(new FN5(baseActivity, C37044Xf4.card_spacing));
            fastScrollRecyclerView.setAdapter(this.f77322b);
        } else {
            fastScrollRecyclerView = null;
        }
        this.f77323c = fastScrollRecyclerView;
        TextView textView = (TextView) C49520tu6.m11238m(view, C49981uh4.title);
        if (textView != null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                str = arguments.getString("title");
            } else {
                str = null;
            }
            textView.setText(str);
        }
        C39417cs2<T> c39417cs2 = this.f77322b;
        if (c39417cs2 != null) {
            c39417cs2.m44888y(new C19881d(this));
        }
        C39417cs2<T> c39417cs22 = this.f77322b;
        if (c39417cs22 != null) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                list = arguments2.getParcelableArrayList("list_elements");
            }
            if (list == null) {
                list = CollectionsKt__CollectionsKt.emptyList();
            }
            c39417cs22.m44899C(list);
        }
    }
}
