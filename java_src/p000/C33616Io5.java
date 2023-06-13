package p000;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.model.wire.WireItemScrapReason;
import co.bird.android.model.wire.WireSkuScanItem;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23496h;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.subjects.C24567g;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u00010B\u0007¢\u0006\u0004\b-\u0010.J&\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0014\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013H\u0016J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u0013R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR.\u0010$\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0015 !*\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00140\u00140 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u00061"}, m28432d2 = {"LIo5;", "Lhc5;", "LMo5;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "LNo5;", TransferTable.COLUMN_STATE, "N6", "Lio/reactivex/h;", "T0", "Lio/reactivex/F;", "", "Lco/bird/android/model/wire/WireItemScrapReason;", "O", "t8", "LGo5;", "e", "LGo5;", "adapter", "LJo5;", "f", "LJo5;", "converter", "Lio/reactivex/subjects/g;", "kotlin.jvm.PlatformType", "g", "Lio/reactivex/subjects/g;", "scrapReasonSingle", "Lh00;", "h", "Lh00;", "binding", "LLo5;", "i", "LLo5;", "presenter", "<init>", "()V", "j", C17296a.f69688o, "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScrapOrderReasonBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapOrderReasonBottomSheet.kt\nco/bird/android/feature/transferorder/scanner/outbound/scrap/dialogs/ScrapOrderReasonBottomSheet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,84:1\n1#2:85\n64#3:86\n*S KotlinDebug\n*F\n+ 1 ScrapOrderReasonBottomSheet.kt\nco/bird/android/feature/transferorder/scanner/outbound/scrap/dialogs/ScrapOrderReasonBottomSheet\n*L\n76#1:86\n*E\n"})
/* renamed from: Io5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33616Io5 extends AbstractC42224hc5 implements InterfaceC34552Mo5 {

    /* renamed from: j */
    public static final C3765a f16235j = new C3765a(null);

    /* renamed from: e */
    public final C33148Go5 f16236e = new C33148Go5();

    /* renamed from: f */
    public final C33850Jo5 f16237f = new C33850Jo5();

    /* renamed from: g */
    public final C24567g<List<WireItemScrapReason>> f16238g;

    /* renamed from: h */
    public C41865h00 f16239h;

    /* renamed from: i */
    public final C34318Lo5 f16240i;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, m28432d2 = {"LIo5$a;", "", "", "Lco/bird/android/model/wire/WireItemScrapReason;", "reasons", "LIo5;", C17296a.f69688o, "", "SCRAP_REASONS", "Ljava/lang/String;", "TAG", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Io5$a */
    /* loaded from: classes3.dex */
    public static final class C3765a {
        public /* synthetic */ C3765a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C33616Io5 m101682a(List<WireItemScrapReason> reasons) {
            Intrinsics.checkNotNullParameter(reasons, "reasons");
            C33616Io5 c33616Io5 = new C33616Io5();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("scrap_reasons", C44691lm0.m26849a(reasons));
            c33616Io5.setArguments(bundle);
            return c33616Io5;
        }

        private C3765a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireItemScrapReason;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireItemScrapReason;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Io5$b */
    /* loaded from: classes3.dex */
    public static final class C3766b extends Lambda implements Function1<WireItemScrapReason, Unit> {
        public C3766b() {
            super(1);
        }

        /* renamed from: a */
        public final void m101681a(WireItemScrapReason wireItemScrapReason) {
            Dialog dialog = C33616Io5.this.getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireItemScrapReason wireItemScrapReason) {
            m101681a(wireItemScrapReason);
            return Unit.INSTANCE;
        }
    }

    public C33616Io5() {
        C24567g<List<WireItemScrapReason>> m31882w0 = C24567g.m31882w0();
        Intrinsics.checkNotNullExpressionValue(m31882w0, "create<List<WireItemScrapReason>>()");
        this.f16238g = m31882w0;
        this.f16240i = new C34318Lo5();
    }

    /* renamed from: A9 */
    public static final void m101686A9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: N6 */
    public void render(InterfaceC34786No5 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f16236e.mo24871u(this.f16237f.m99670a(state.mo76740a()));
        WireSkuScanItem mo76738c = state.mo76738c();
        if (mo76738c != null) {
            C41865h00 c41865h00 = this.f16239h;
            C41865h00 c41865h002 = null;
            if (c41865h00 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c41865h00 = null;
            }
            c41865h00.f84581b.setText(mo76738c.getItemDisplayName());
            C41865h00 c41865h003 = this.f16239h;
            if (c41865h003 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c41865h002 = c41865h003;
            }
            c41865h002.f84583d.setText(mo76738c.getItemDisplayCaption());
        }
    }

    @Override // p000.InterfaceC34552Mo5
    /* renamed from: O */
    public AbstractC23442F<List<WireItemScrapReason>> mo94779O() {
        AbstractC23442F<List<WireItemScrapReason>> m33160F = this.f16238g.m33160F();
        Intrinsics.checkNotNullExpressionValue(m33160F, "scrapReasonSingle.hide()");
        return m33160F;
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

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        setCancelable(false);
        C41865h00 m37234c = C41865h00.m37234c(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(m37234c, "this");
        this.f16239h = m37234c;
        return m37234c.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C41865h00 c41865h00 = this.f16239h;
        List<WireItemScrapReason> list = null;
        if (c41865h00 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c41865h00 = null;
        }
        RecyclerView recyclerView = c41865h00.f84584e;
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setItemAnimator(new C11894g());
        recyclerView.setAdapter(this.f16236e);
        this.f16240i.consume(this);
        C24567g<List<WireItemScrapReason>> c24567g = this.f16238g;
        Bundle arguments = getArguments();
        if (arguments != null) {
            list = arguments.getParcelableArrayList("scrap_reasons");
        }
        if (list == null) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        c24567g.onSuccess(list);
    }

    /* renamed from: t8 */
    public final AbstractC23442F<WireItemScrapReason> m101683t8() {
        AbstractC23442F<WireItemScrapReason> m104701v = this.f16236e.m104701v();
        final C3766b c3766b = new C3766b();
        AbstractC23442F<WireItemScrapReason> m33101w = m104701v.m33101w(new InterfaceC23484g() { // from class: Ho5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33616Io5.m101686A9(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "fun scrapReasonSelects()…ess { dialog?.dismiss() }");
        return m33101w;
    }
}
