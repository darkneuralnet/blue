package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import co.bird.android.model.RepairType;
import co.bird.android.widget.standardcomponents.CheckableItemView;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\nR=\u0010\u0015\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r \u0010*\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b0\u000b0\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, m28432d2 = {"LZC4;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "LF6;", "r", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "Lco/bird/android/model/RepairType;", "", "w", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "v", "()Lio/reactivex/subjects/d;", "repairCheckSubject", "<init>", "()V", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ZC4 */
/* loaded from: classes3.dex */
public final class ZC4 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24558d<Pair<RepairType, Boolean>> f47924c;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"LZC4$a;", "Lw1;", "", "position", "", "bind", "Lco/bird/android/widget/standardcomponents/CheckableItemView;", "b", "Lco/bird/android/widget/standardcomponents/CheckableItemView;", "checkableItemView", "", "c", "Z", "binding", "Landroid/view/View;", "view", "<init>", "(LZC4;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairSelectionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairSelectionAdapter.kt\nco/bird/android/feature/repair/v1/selection/adapters/RepairSelectionAdapter$RepairSelectionItemViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,57:1\n18#2:58\n9#3,4:59\n*S KotlinDebug\n*F\n+ 1 RepairSelectionAdapter.kt\nco/bird/android/feature/repair/v1/selection/adapters/RepairSelectionAdapter$RepairSelectionItemViewHolder\n*L\n50#1:58\n50#1:59,4\n*E\n"})
    /* renamed from: ZC4$a */
    /* loaded from: classes3.dex */
    public final class C10126a extends C29735w1 {

        /* renamed from: b */
        public final CheckableItemView f47925b;

        /* renamed from: c */
        public boolean f47926c;

        /* renamed from: d */
        public final /* synthetic */ ZC4 f47927d;

        @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, m28432d2 = {"ZC4$a$a", "Lco/bird/android/widget/standardcomponents/CheckableItemView$b;", "Lco/bird/android/widget/standardcomponents/CheckableItemView;", "view", "", "isChecked", "", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nRepairSelectionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairSelectionAdapter.kt\nco/bird/android/feature/repair/v1/selection/adapters/RepairSelectionAdapter$RepairSelectionItemViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,57:1\n18#2:58\n9#3,4:59\n*S KotlinDebug\n*F\n+ 1 RepairSelectionAdapter.kt\nco/bird/android/feature/repair/v1/selection/adapters/RepairSelectionAdapter$RepairSelectionItemViewHolder$1\n*L\n40#1:58\n40#1:59,4\n*E\n"})
        /* renamed from: ZC4$a$a */
        /* loaded from: classes3.dex */
        public static final class C10127a implements CheckableItemView.InterfaceC16699b {

            /* renamed from: b */
            public final /* synthetic */ ZC4 f47929b;

            public C10127a(ZC4 zc4) {
                this.f47929b = zc4;
            }

            @Override // co.bird.android.widget.standardcomponents.CheckableItemView.InterfaceC16699b
            /* renamed from: a */
            public void mo3842a(CheckableItemView view, boolean z) {
                Intrinsics.checkNotNullParameter(view, "view");
                if (!C10126a.this.f47926c && C10126a.this.getAdapterPosition() != -1) {
                    Object m105816c = this.f47929b.m94545o().m109394h().get(C10126a.this.getAdapterPosition()).m105816c();
                    if (!(m105816c instanceof C50287vC4)) {
                        m105816c = null;
                    }
                    C50287vC4 c50287vC4 = (C50287vC4) m105816c;
                    if (c50287vC4 != null) {
                        this.f47929b.m73619v().onNext(TuplesKt.m28425to(c50287vC4.m9025e(), Boolean.valueOf(z)));
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10126a(ZC4 zc4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f47927d = zc4;
            CheckableItemView checkableItemView = (CheckableItemView) view;
            this.f47925b = checkableItemView;
            checkableItemView.setOnCheckChangedListener(new C10127a(zc4));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            this.f47926c = true;
            Object m105816c = this.f47927d.m94545o().m109394h().get(i).m105816c();
            if (!(m105816c instanceof C50287vC4)) {
                m105816c = null;
            }
            C50287vC4 c50287vC4 = (C50287vC4) m105816c;
            if (c50287vC4 != null) {
                this.f47925b.m53967e(c50287vC4);
            }
            this.f47926c = false;
        }
    }

    public ZC4() {
        C24558d<Pair<RepairType, Boolean>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Pair<RepairType, Boolean>>()");
        this.f47924c = m31902e;
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C37828aD4();
    }

    /* renamed from: v */
    public final C24558d<Pair<RepairType, Boolean>> m73619v() {
        return this.f47924c;
    }

    /* renamed from: w */
    public final Observable<Pair<RepairType, Boolean>> m73618w() {
        Observable<Pair<RepairType, Boolean>> hide = this.f47924c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "repairCheckSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        return new C10126a(this, C40788fB0.m41761u(context, i, parent, false));
    }
}
