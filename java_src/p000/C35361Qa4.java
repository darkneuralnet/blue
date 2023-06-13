package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.model.QCAutoCheck;
import co.bird.android.widget.standardcomponents.LabeledDetailItemView;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0010"}, m28432d2 = {"LQa4;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "<init>", "()V", C17296a.f69688o, "b", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Qa4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35361Qa4 extends AbstractC52206yS0 {

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LQa4$a;", "Lw1;", "", "position", "", "bind", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "instructions", "Landroid/view/View;", "view", "<init>", "(LQa4;Landroid/view/View;)V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nQCAutoChecksAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QCAutoChecksAdapter.kt\nco/bird/android/qualitycontrol/autocheck/adapters/QCAutoChecksAdapter$InstructionsViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,60:1\n18#2:61\n9#3,4:62\n*S KotlinDebug\n*F\n+ 1 QCAutoChecksAdapter.kt\nco/bird/android/qualitycontrol/autocheck/adapters/QCAutoChecksAdapter$InstructionsViewHolder\n*L\n38#1:61\n38#1:62,4\n*E\n"})
    /* renamed from: Qa4$a */
    /* loaded from: classes4.dex */
    public final class C6805a extends C29735w1 {

        /* renamed from: b */
        public final TextView f30545b;

        /* renamed from: c */
        public final /* synthetic */ C35361Qa4 f30546c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6805a(C35361Qa4 c35361Qa4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f30546c = c35361Qa4;
            View findViewById = view.findViewById(C51176wi4.instructions);
            Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.instructions)");
            this.f30545b = (TextView) findViewById;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            TextView textView = this.f30545b;
            Object m105816c = this.f30546c.m94545o().m109397e(i).m105816c();
            if (m105816c != null) {
                z = m105816c instanceof CharSequence;
            } else {
                z = true;
            }
            if (!z) {
                m105816c = null;
            }
            textView.setText((CharSequence) m105816c);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LQa4$b;", "Lw1;", "", "position", "", "bind", "Lco/bird/android/widget/standardcomponents/LabeledDetailItemView;", "b", "Lco/bird/android/widget/standardcomponents/LabeledDetailItemView;", "labeledDetail", "Landroid/view/View;", "view", "<init>", "(LQa4;Landroid/view/View;)V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nQCAutoChecksAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QCAutoChecksAdapter.kt\nco/bird/android/qualitycontrol/autocheck/adapters/QCAutoChecksAdapter$QCAutoCheckViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,60:1\n18#2:61\n9#3,4:62\n*S KotlinDebug\n*F\n+ 1 QCAutoChecksAdapter.kt\nco/bird/android/qualitycontrol/autocheck/adapters/QCAutoChecksAdapter$QCAutoCheckViewHolder\n*L\n46#1:61\n46#1:62,4\n*E\n"})
    /* renamed from: Qa4$b */
    /* loaded from: classes4.dex */
    public final class C6806b extends C29735w1 {

        /* renamed from: b */
        public final LabeledDetailItemView f30547b;

        /* renamed from: c */
        public final /* synthetic */ C35361Qa4 f30548c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6806b(C35361Qa4 c35361Qa4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f30548c = c35361Qa4;
            this.f30547b = (LabeledDetailItemView) view;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            int m94301c;
            Object m105816c = this.f30548c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof QCAutoCheck)) {
                m105816c = null;
            }
            QCAutoCheck qCAutoCheck = (QCAutoCheck) m105816c;
            if (qCAutoCheck != null) {
                this.f30547b.setLabel(qCAutoCheck.getDisplay());
                this.f30547b.setDetail(qCAutoCheck.getResult());
                LabeledDetailItemView labeledDetailItemView = this.f30547b;
                if (qCAutoCheck.getPassed()) {
                    m94301c = NA0.m94301c(this.itemView.getContext(), C32364Df4.birdBlue);
                } else {
                    m94301c = NA0.m94301c(this.itemView.getContext(), C32364Df4.birdRed);
                }
                labeledDetailItemView.setDetailTextColor(m94301c);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C36765Wa4());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C43489jk4.item_auto_checks_complete ? new C29735w1(m41761u) : i == C43489jk4.item_auto_checks_instructions ? new C6805a(this, m41761u) : i == C43489jk4.item_auto_check ? new C6806b(this, m41761u) : new C29735w1(m41761u);
    }
}
