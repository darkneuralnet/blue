package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import co.bird.android.model.IssueType;
import co.bird.android.widget.standardcomponents.CheckableItemView;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\nR:\u0010\u0013\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r \u0010*\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b0\u000b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, m28432d2 = {"LmF6;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "LF6;", "r", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "Lco/bird/android/model/IssueType;", "", "v", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "issueCheckSubject", "<init>", "()V", C17296a.f69688o, "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: mF6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44981mF6 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24558d<Pair<IssueType, Boolean>> f97724c;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"LmF6$a;", "Lw1;", "", "position", "", "bind", "Lco/bird/android/widget/standardcomponents/CheckableItemView;", "b", "Lco/bird/android/widget/standardcomponents/CheckableItemView;", "checkableItemView", "", "c", "Z", "binding", "Landroid/view/View;", "view", "<init>", "(LmF6;Landroid/view/View;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWorkOrderIssueAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderIssueAdapter.kt\nco/bird/android/feature/workorders/issues/adapters/WorkOrderIssueAdapter$IssueTypeViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,62:1\n18#2:63\n9#3,4:64\n*S KotlinDebug\n*F\n+ 1 WorkOrderIssueAdapter.kt\nco/bird/android/feature/workorders/issues/adapters/WorkOrderIssueAdapter$IssueTypeViewHolder\n*L\n54#1:63\n54#1:64,4\n*E\n"})
    /* renamed from: mF6$a */
    /* loaded from: classes3.dex */
    public final class C26023a extends C29735w1 {

        /* renamed from: b */
        public final CheckableItemView f97725b;

        /* renamed from: c */
        public boolean f97726c;

        /* renamed from: d */
        public final /* synthetic */ C44981mF6 f97727d;

        @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, m28432d2 = {"mF6$a$a", "Lco/bird/android/widget/standardcomponents/CheckableItemView$b;", "Lco/bird/android/widget/standardcomponents/CheckableItemView;", "view", "", "isChecked", "", C17296a.f69688o, "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nWorkOrderIssueAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderIssueAdapter.kt\nco/bird/android/feature/workorders/issues/adapters/WorkOrderIssueAdapter$IssueTypeViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,62:1\n18#2:63\n9#3,4:64\n*S KotlinDebug\n*F\n+ 1 WorkOrderIssueAdapter.kt\nco/bird/android/feature/workorders/issues/adapters/WorkOrderIssueAdapter$IssueTypeViewHolder$1\n*L\n45#1:63\n45#1:64,4\n*E\n"})
        /* renamed from: mF6$a$a */
        /* loaded from: classes3.dex */
        public static final class C26024a implements CheckableItemView.InterfaceC16699b {

            /* renamed from: b */
            public final /* synthetic */ C44981mF6 f97729b;

            public C26024a(C44981mF6 c44981mF6) {
                this.f97729b = c44981mF6;
            }

            @Override // co.bird.android.widget.standardcomponents.CheckableItemView.InterfaceC16699b
            /* renamed from: a */
            public void mo3842a(CheckableItemView view, boolean z) {
                Intrinsics.checkNotNullParameter(view, "view");
                if (C26023a.this.f97726c) {
                    return;
                }
                Object m105816c = this.f97729b.m94545o().m109394h().get(C26023a.this.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof C32785Fa2)) {
                    m105816c = null;
                }
                C32785Fa2 c32785Fa2 = (C32785Fa2) m105816c;
                if (c32785Fa2 != null) {
                    this.f97729b.f97724c.onNext(TuplesKt.m28425to(c32785Fa2.m106936f(), Boolean.valueOf(z)));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26023a(C44981mF6 c44981mF6, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f97727d = c44981mF6;
            CheckableItemView checkableItemView = (CheckableItemView) view;
            this.f97725b = checkableItemView;
            checkableItemView.setOnCheckChangedListener(new C26024a(c44981mF6));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            this.f97726c = true;
            Object m105816c = this.f97727d.m94545o().m109394h().get(i).m105816c();
            if (!(m105816c instanceof C32785Fa2)) {
                m105816c = null;
            }
            C32785Fa2 c32785Fa2 = (C32785Fa2) m105816c;
            if (c32785Fa2 != null) {
                this.f97725b.m53967e(c32785Fa2);
                this.f97725b.setButtonDrawable(NA0.m94299e(getContext(), C33309Hg4.radio_button_work_order_item));
            }
            this.f97726c = false;
        }
    }

    public C44981mF6() {
        C24558d<Pair<IssueType, Boolean>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Pair<IssueType, Boolean>>()");
        this.f97724c = m31902e;
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C45574nF6();
    }

    /* renamed from: v */
    public final Observable<Pair<IssueType, Boolean>> m25862v() {
        Observable<Pair<IssueType, Boolean>> hide = this.f97724c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "issueCheckSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C37080Xj4.item_checkable_work_order_item ? new C26023a(this, m41761u) : new C29735w1(m41761u);
    }
}
