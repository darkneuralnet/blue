package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.model.constant.OperatorOrderViewType;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0018\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f0\u000eR:\u0010\u0017\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011 \u0014*\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f0\u000f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, m28432d2 = {"Lop3;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "LF6;", "r", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "Lco/bird/android/model/constant/OperatorOrderViewType;", "N4", "Lma4;", "kotlin.jvm.PlatformType", "c", "Lma4;", "orderRelay", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: op3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46503op3 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C45168ma4<Pair<String, OperatorOrderViewType>> f102532c;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lop3$a;", "Lw1;", "", "position", "", "bind", "LPd2;", "b", "LPd2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lop3;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorOrderLandingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderLandingAdapter.kt\nco/bird/android/feature/transferorder/operator/landing/adapters/OperatorOrderLandingAdapter$HeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,76:1\n18#2:77\n9#3,4:78\n*S KotlinDebug\n*F\n+ 1 OperatorOrderLandingAdapter.kt\nco/bird/android/feature/transferorder/operator/landing/adapters/OperatorOrderLandingAdapter$HeaderViewHolder\n*L\n50#1:77\n50#1:78,4\n*E\n"})
    /* renamed from: op3$a */
    /* loaded from: classes3.dex */
    public final class C27065a extends C29735w1 {

        /* renamed from: b */
        public final C35152Pd2 f102533b;

        /* renamed from: c */
        public final /* synthetic */ C46503op3 f102534c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27065a(C46503op3 c46503op3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f102534c = c46503op3;
            C35152Pd2 m90053a = C35152Pd2.m90053a(view);
            Intrinsics.checkNotNullExpressionValue(m90053a, "bind(view)");
            this.f102533b = m90053a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            TextView root = this.f102533b.getRoot();
            Object m105816c = this.f102534c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof String)) {
                m105816c = null;
            }
            root.setText((CharSequence) m105816c);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lop3$b;", "Lw1;", "", "position", "", "bind", "LQd2;", "b", "LQd2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lop3;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorOrderLandingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderLandingAdapter.kt\nco/bird/android/feature/transferorder/operator/landing/adapters/OperatorOrderLandingAdapter$OrderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,76:1\n18#2:77\n9#3,4:78\n*S KotlinDebug\n*F\n+ 1 OperatorOrderLandingAdapter.kt\nco/bird/android/feature/transferorder/operator/landing/adapters/OperatorOrderLandingAdapter$OrderViewHolder\n*L\n66#1:77\n66#1:78,4\n*E\n"})
    /* renamed from: op3$b */
    /* loaded from: classes3.dex */
    public final class C27066b extends C29735w1 {

        /* renamed from: b */
        public final C35386Qd2 f102535b;

        /* renamed from: c */
        public final /* synthetic */ C46503op3 f102536c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nOperatorOrderLandingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderLandingAdapter.kt\nco/bird/android/feature/transferorder/operator/landing/adapters/OperatorOrderLandingAdapter$OrderViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n18#2:77\n9#3,4:78\n1#4:82\n*S KotlinDebug\n*F\n+ 1 OperatorOrderLandingAdapter.kt\nco/bird/android/feature/transferorder/operator/landing/adapters/OperatorOrderLandingAdapter$OrderViewHolder$1\n*L\n59#1:77\n59#1:78,4\n*E\n"})
        /* renamed from: op3$b$a */
        /* loaded from: classes3.dex */
        public static final class C27067a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C46503op3 f102537g;

            /* renamed from: h */
            public final /* synthetic */ C27066b f102538h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27067a(C46503op3 c46503op3, C27066b c27066b) {
                super(1);
                this.f102537g = c46503op3;
                this.f102538h = c27066b;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Pair m28425to;
                C1737E6 m94545o = this.f102537g.m94545o();
                Integer safePosition = this.f102538h.getSafePosition();
                if (safePosition != null) {
                    Object m105816c = m94545o.m109397e(safePosition.intValue()).m105816c();
                    if (!(m105816c instanceof C36431Up3)) {
                        m105816c = null;
                    }
                    C36431Up3 c36431Up3 = (C36431Up3) m105816c;
                    if (c36431Up3 == null || (m28425to = TuplesKt.m28425to(c36431Up3.m80793d(), c36431Up3.m80791f())) == null) {
                        return;
                    }
                    this.f102537g.f102532c.accept(m28425to);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27066b(C46503op3 c46503op3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f102536c = c46503op3;
            C35386Qd2 m88306a = C35386Qd2.m88306a(view);
            Intrinsics.checkNotNullExpressionValue(m88306a, "bind(view)");
            this.f102535b = m88306a;
            ConstraintLayout root = m88306a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C27067a(c46503op3, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            Object m105816c = this.f102536c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C36431Up3)) {
                m105816c = null;
            }
            C36431Up3 c36431Up3 = (C36431Up3) m105816c;
            if (c36431Up3 != null) {
                this.f102535b.f30598c.setText(c36431Up3.m80795b());
                this.f102535b.f30600e.setText(c36431Up3.m80792e());
                this.f102535b.f30599d.setText(c36431Up3.m80794c());
                TextView textView = this.f102535b.f30599d;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.details");
                if (c36431Up3.m80794c() != null) {
                    z = true;
                } else {
                    z = false;
                }
                C49520tu6.show$default(textView, z, 0, 2, null);
            }
        }
    }

    public C46503op3() {
        C45168ma4<Pair<String, OperatorOrderViewType>> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Pair<String, OperatorOrderViewType>>()");
        this.f102532c = m25409g;
    }

    /* renamed from: N4 */
    public final Observable<Pair<String, OperatorOrderViewType>> m20470N4() {
        Observable<Pair<String, OperatorOrderViewType>> hide = this.f102532c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "orderRelay.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C49467tp3());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C47096pp3();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C35442Qj4.item_operator_landing_header ? new C27065a(this, m41761u) : i == C35442Qj4.item_operator_landing_order ? new C27066b(this, m41761u) : new C29735w1(m41761u);
    }
}
