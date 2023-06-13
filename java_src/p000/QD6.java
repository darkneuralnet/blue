package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Issue;
import co.bird.android.model.constant.BirdModel;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0010"}, m28432d2 = {"LQD6;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "<init>", "()V", C17296a.f69688o, "b", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: QD6 */
/* loaded from: classes3.dex */
public final class QD6 extends AbstractC52206yS0 {

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, m28432d2 = {"LQD6$a;", "Lw1;", "", "position", "", "bind", "Landroid/widget/ImageView;", "b", "Landroid/widget/ImageView;", "scooterImage", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "status", DateTokenConverter.CONVERTER_KEY, "instruction", "Landroid/view/View;", "e", "Landroid/view/View;", "indicator", "view", "<init>", "(LQD6;Landroid/view/View;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWorkOrderInspectionCompleteAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderInspectionCompleteAdapter.kt\nco/bird/android/feature/workorders/inspection/dialog/inspectioncomplete/adapters/WorkOrderInspectionCompleteAdapter$InstructionViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,65:1\n18#2:66\n9#3,4:67\n*S KotlinDebug\n*F\n+ 1 WorkOrderInspectionCompleteAdapter.kt\nco/bird/android/feature/workorders/inspection/dialog/inspectioncomplete/adapters/WorkOrderInspectionCompleteAdapter$InstructionViewHolder\n*L\n42#1:66\n42#1:67,4\n*E\n"})
    /* renamed from: QD6$a */
    /* loaded from: classes3.dex */
    public final class C6730a extends C29735w1 {

        /* renamed from: b */
        public final ImageView f30051b;

        /* renamed from: c */
        public final TextView f30052c;

        /* renamed from: d */
        public final TextView f30053d;

        /* renamed from: e */
        public final View f30054e;

        /* renamed from: f */
        public final /* synthetic */ QD6 f30055f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6730a(QD6 qd6, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f30055f = qd6;
            View findViewById = view.findViewById(C44062ki4.scooterImage);
            Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.scooterImage)");
            this.f30051b = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C44062ki4.status);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.status)");
            this.f30052c = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C44062ki4.instructions);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.instructions)");
            this.f30053d = (TextView) findViewById3;
            View findViewById4 = view.findViewById(C44062ki4.indicator);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "view.findViewById(R.id.indicator)");
            this.f30054e = findViewById4;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f30055f.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof S32)) {
                m105816c = null;
            }
            S32 s32 = (S32) m105816c;
            if (s32 != null) {
                this.f30052c.setText(s32.m86053e());
                this.f30053d.setText(s32.m86055c());
                ImageView imageView = this.f30051b;
                BirdModel m86054d = s32.m86054d();
                Context context = this.f30051b.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "scooterImage.context");
                imageView.setImageDrawable(C6327PM.m90445a(m86054d, context));
                this.f30054e.setBackgroundTintList(ColorStateList.valueOf(s32.m86056b()));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u0012"}, m28432d2 = {"LQD6$b;", "Lw1;", "", "position", "", "bind", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "issue", "c", Stripe3ds2AuthParams.FIELD_SOURCE, DateTokenConverter.CONVERTER_KEY, "status", "Landroid/view/View;", "view", "<init>", "(LQD6;Landroid/view/View;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWorkOrderInspectionCompleteAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderInspectionCompleteAdapter.kt\nco/bird/android/feature/workorders/inspection/dialog/inspectioncomplete/adapters/WorkOrderInspectionCompleteAdapter$IssueViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,65:1\n18#2:66\n9#3,4:67\n*S KotlinDebug\n*F\n+ 1 WorkOrderInspectionCompleteAdapter.kt\nco/bird/android/feature/workorders/inspection/dialog/inspectioncomplete/adapters/WorkOrderInspectionCompleteAdapter$IssueViewHolder\n*L\n57#1:66\n57#1:67,4\n*E\n"})
    /* renamed from: QD6$b */
    /* loaded from: classes3.dex */
    public final class C6731b extends C29735w1 {

        /* renamed from: b */
        public final TextView f30056b;

        /* renamed from: c */
        public final TextView f30057c;

        /* renamed from: d */
        public final TextView f30058d;

        /* renamed from: e */
        public final /* synthetic */ QD6 f30059e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6731b(QD6 qd6, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f30059e = qd6;
            View findViewById = view.findViewById(C44062ki4.issue);
            Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.issue)");
            this.f30056b = (TextView) findViewById;
            View findViewById2 = view.findViewById(C44062ki4.source);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.source)");
            this.f30057c = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C44062ki4.status);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.status)");
            this.f30058d = (TextView) findViewById3;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f30059e.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof Issue)) {
                m105816c = null;
            }
            Issue issue = (Issue) m105816c;
            if (issue != null) {
                this.f30056b.setText(issue.getDisplay());
                this.f30057c.setText(issue.getSourceDisplay());
                this.f30058d.setText(issue.getStatusDisplay());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new WD6());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C37080Xj4.item_inspection_complete_instructions ? new C6730a(this, m41761u) : i == C37080Xj4.item_issue_header ? new C6731b(this, m41761u) : new C29735w1(m41761u);
    }
}
