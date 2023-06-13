package p000;

import android.app.Application;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import co.bird.android.model.wire.WireTransferOrderFilter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.subjects.C24567g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0001<B\u0007¢\u0006\u0004\b9\u0010:J$\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0013H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0013H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0013H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013H\u0016J\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001a0\u0019R\"\u0010#\u001a\u00020\u001c8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010,\u001a\u0010\u0012\f\u0012\n )*\u0004\u0018\u00010\u00170\u00170(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R.\u00100\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0017 )*\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001a0\u001a0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u0006="}, m28432d2 = {"Ll86;", "Lhc5;", "Lv86;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "Lw86;", TransferTable.COLUMN_STATE, "t8", "Lio/reactivex/h;", "T0", "Lio/reactivex/Observable;", "H0", "w9", "q1", "Lco/bird/android/model/wire/WireTransferOrderFilter;", "S4", "Lio/reactivex/F;", "", "a5", "Lu86;", "e", "Lu86;", "N6", "()Lu86;", "setPresenter$co_bird_android_feature_transfer_order", "(Lu86;)V", "presenter", "Lk00;", "f", "Lk00;", "binding", "Lma4;", "kotlin.jvm.PlatformType", "g", "Lma4;", "selectedRelay", "Lio/reactivex/subjects/g;", "h", "Lio/reactivex/subjects/g;", "filterAppliesSubject", "Lo86;", "i", "Lo86;", "converter", "Lk86;", "j", "Lk86;", "adapter", "<init>", "()V", "k", C17296a.f69688o, "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransferOrderLandingFiltersBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferOrderLandingFiltersBottomSheet.kt\nco/bird/android/feature/transferorder/landing/filters/TransferOrderLandingFiltersBottomSheet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,122:1\n1855#2,2:123\n1#3:125\n64#4:126\n*S KotlinDebug\n*F\n+ 1 TransferOrderLandingFiltersBottomSheet.kt\nco/bird/android/feature/transferorder/landing/filters/TransferOrderLandingFiltersBottomSheet\n*L\n74#1:123,2\n98#1:126\n*E\n"})
/* renamed from: l86  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44323l86 extends AbstractC42224hc5 implements InterfaceC50251v86 {

    /* renamed from: k */
    public static final C25640a f95626k = new C25640a(null);

    /* renamed from: e */
    public C49659u86 f95627e;

    /* renamed from: f */
    public C43644k00 f95628f;

    /* renamed from: g */
    public final C45168ma4<WireTransferOrderFilter> f95629g;

    /* renamed from: h */
    public final C24567g<List<WireTransferOrderFilter>> f95630h;

    /* renamed from: i */
    public final C46102o86 f95631i;

    /* renamed from: j */
    public final C43730k86 f95632j;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, m28432d2 = {"Ll86$a;", "", "", "Lco/bird/android/model/wire/WireTransferOrderFilter;", "enabledFilters", "Ll86;", C17296a.f69688o, "", "ENABLED_FILTERS", "Ljava/lang/String;", "TAG", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: l86$a */
    /* loaded from: classes3.dex */
    public static final class C25640a {
        public /* synthetic */ C25640a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C44323l86 m27747a(List<WireTransferOrderFilter> enabledFilters) {
            Intrinsics.checkNotNullParameter(enabledFilters, "enabledFilters");
            C44323l86 c44323l86 = new C44323l86();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("enabled_filters", C44691lm0.m26849a(enabledFilters));
            c44323l86.setArguments(bundle);
            return c44323l86;
        }

        private C25640a() {
        }
    }

    public C44323l86() {
        C45168ma4<WireTransferOrderFilter> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<WireTransferOrderFilter>()");
        this.f95629g = m25409g;
        C24567g<List<WireTransferOrderFilter>> m31882w0 = C24567g.m31882w0();
        Intrinsics.checkNotNullExpressionValue(m31882w0, "create<List<WireTransferOrderFilter>>()");
        this.f95630h = m31882w0;
        this.f95631i = new C46102o86();
        this.f95632j = new C43730k86();
    }

    @Override // p000.InterfaceC50251v86
    /* renamed from: H0 */
    public Observable<Unit> mo9139H0() {
        C43644k00 c43644k00 = this.f95628f;
        if (c43644k00 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c43644k00 = null;
        }
        Button button = c43644k00.f93737b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.apply");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: N6 */
    public final C49659u86 m27750N6() {
        C49659u86 c49659u86 = this.f95627e;
        if (c49659u86 != null) {
            return c49659u86;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.InterfaceC50251v86
    /* renamed from: S4 */
    public Observable<WireTransferOrderFilter> mo9138S4() {
        Observable<WireTransferOrderFilter> merge = Observable.merge(this.f95632j.m29243S4(), this.f95629g.hide());
        Intrinsics.checkNotNullExpressionValue(merge, "merge(\n    adapter.filte…selectedRelay.hide(),\n  )");
        return merge;
    }

    @Override // com.uber.autodispose.ScopeProvider
    /* renamed from: T0 */
    public InterfaceC23496h mo231T0() {
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        InterfaceC23496h mo231T0 = m45195i.mo231T0();
        Intrinsics.checkNotNullExpressionValue(mo231T0, "scope(FragmentLifecycleResolver).requestScope()");
        return mo231T0;
    }

    /* renamed from: a5 */
    public final AbstractC23442F<List<WireTransferOrderFilter>> m27749a5() {
        AbstractC23442F<List<WireTransferOrderFilter>> m33160F = this.f95630h.m33160F();
        Intrinsics.checkNotNullExpressionValue(m33160F, "filterAppliesSubject.hide()");
        return m33160F;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ConstraintLayout root = C43644k00.m29494c(inflater, viewGroup, false).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "inflate(inflater, container, false).root");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Application application;
        ArrayList<WireTransferOrderFilter> parcelableArrayList;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C43644k00 m29496a = C43644k00.m29496a(view);
        Intrinsics.checkNotNullExpressionValue(m29496a, "bind(view)");
        this.f95628f = m29496a;
        FragmentActivity activity = getActivity();
        C43644k00 c43644k00 = null;
        if (activity != null) {
            application = activity.getApplication();
        } else {
            application = null;
        }
        if (application == null) {
            return;
        }
        C39747dR0.m44278a().mo24280a(C46172oG2.f101711a.m21419a(application)).mo24281a(this);
        C43644k00 c43644k002 = this.f95628f;
        if (c43644k002 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c43644k002 = null;
        }
        c43644k002.f93742g.setAdapter(this.f95632j);
        C43644k00 c43644k003 = this.f95628f;
        if (c43644k003 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c43644k003 = null;
        }
        c43644k003.f93742g.setLayoutManager(new LinearLayoutManager(getActivity()));
        C43644k00 c43644k004 = this.f95628f;
        if (c43644k004 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c43644k00 = c43644k004;
        }
        c43644k00.f93742g.setItemAnimator(new C11894g());
        m27750N6().consume(this);
        Bundle arguments = getArguments();
        if (arguments != null && (parcelableArrayList = arguments.getParcelableArrayList("enabled_filters")) != null) {
            C45168ma4<WireTransferOrderFilter> c45168ma4 = this.f95629g;
            for (WireTransferOrderFilter wireTransferOrderFilter : parcelableArrayList) {
                c45168ma4.accept(wireTransferOrderFilter);
            }
        }
    }

    @Override // p000.InterfaceC50251v86
    /* renamed from: q1 */
    public Observable<Unit> mo9137q1() {
        C43644k00 c43644k00 = this.f95628f;
        if (c43644k00 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c43644k00 = null;
        }
        ImageView imageView = c43644k00.f93739d;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.close");
        return C44626lf5.clicksThrottle$default(imageView, 0L, 1, null);
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: t8 */
    public void render(InterfaceC50844w86 state) {
        Dialog dialog;
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof C36569Ve6) {
            this.f95632j.mo24871u(this.f95631i.m21725a(state.getFilters(), state.mo7357a()));
        } else if (state instanceof C26582nm) {
            this.f95630h.onSuccess(state.mo7357a());
            Dialog dialog2 = getDialog();
            if (dialog2 != null) {
                dialog2.dismiss();
            }
        } else if ((state instanceof C39327cl0) && (dialog = getDialog()) != null) {
            dialog.dismiss();
        }
    }

    @Override // p000.InterfaceC50251v86
    /* renamed from: w9 */
    public Observable<Unit> mo9136w9() {
        C43644k00 c43644k00 = this.f95628f;
        if (c43644k00 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c43644k00 = null;
        }
        TextView textView = c43644k00.f93743h;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.reset");
        return C44626lf5.clicksThrottle$default(textView, 0L, 1, null);
    }
}
