package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import co.bird.android.model.WorkOrder;
import co.bird.android.widget.VehicleSummaryView;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\r"}, m28432d2 = {"LPB4;", "LtD;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "<init>", "()V", C17296a.f69688o, "b", "c", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: PB4 */
/* loaded from: classes3.dex */
public final class PB4 extends AbstractC28652tD {

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, m28432d2 = {"LPB4$a;", "Lw1;", "", "position", "", "bind", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "b", "Landroid/widget/TextView;", "notes", "Landroid/view/View;", "view", "<init>", "(LPB4;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairOverviewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairOverviewAdapter.kt\nco/bird/android/feature/repair/v1/overview/adapters/RepairOverviewAdapter$NotesViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,55:1\n18#2:56\n9#3,4:57\n*S KotlinDebug\n*F\n+ 1 RepairOverviewAdapter.kt\nco/bird/android/feature/repair/v1/overview/adapters/RepairOverviewAdapter$NotesViewHolder\n*L\n51#1:56\n51#1:57,4\n*E\n"})
    /* renamed from: PB4$a */
    /* loaded from: classes3.dex */
    public final class C6292a extends C29735w1 {

        /* renamed from: b */
        public final TextView f28058b;

        /* renamed from: c */
        public final /* synthetic */ PB4 f28059c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6292a(PB4 pb4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f28059c = pb4;
            this.f28058b = (TextView) view.findViewById(C35658Rh4.notes);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            TextView textView = this.f28058b;
            Object m105816c = this.f28059c.m94545o().m109394h().get(i).m105816c();
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

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LPB4$b;", "Lw1;", "", "position", "", "bind", "Lco/bird/android/widget/VehicleSummaryView;", "b", "Lco/bird/android/widget/VehicleSummaryView;", "summaryView", "Landroid/view/View;", "view", "<init>", "(LPB4;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairOverviewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairOverviewAdapter.kt\nco/bird/android/feature/repair/v1/overview/adapters/RepairOverviewAdapter$VehicleSummaryViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n18#2:56\n9#3,4:57\n1#4:61\n*S KotlinDebug\n*F\n+ 1 RepairOverviewAdapter.kt\nco/bird/android/feature/repair/v1/overview/adapters/RepairOverviewAdapter$VehicleSummaryViewHolder\n*L\n31#1:56\n31#1:57,4\n*E\n"})
    /* renamed from: PB4$b */
    /* loaded from: classes3.dex */
    public final class C6293b extends C29735w1 {

        /* renamed from: b */
        public final VehicleSummaryView f28060b;

        /* renamed from: c */
        public final /* synthetic */ PB4 f28061c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6293b(PB4 pb4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f28061c = pb4;
            this.f28060b = (VehicleSummaryView) view;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f28061c.m94545o().m109394h().get(i).m105816c();
            if (!(m105816c instanceof C50043un6)) {
                m105816c = null;
            }
            C50043un6 c50043un6 = (C50043un6) m105816c;
            if (c50043un6 != null) {
                this.f28060b.m54355e(c50043un6);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u0011"}, m28432d2 = {"LPB4$c;", "Lw1;", "", "position", "", "bind", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "b", "Landroid/widget/TextView;", "status", "c", "issues", "Landroid/view/View;", "view", "<init>", "(LPB4;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairOverviewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairOverviewAdapter.kt\nco/bird/android/feature/repair/v1/overview/adapters/RepairOverviewAdapter$WorkOrderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n18#2:56\n9#3,4:57\n1#4:61\n*S KotlinDebug\n*F\n+ 1 RepairOverviewAdapter.kt\nco/bird/android/feature/repair/v1/overview/adapters/RepairOverviewAdapter$WorkOrderViewHolder\n*L\n40#1:56\n40#1:57,4\n*E\n"})
    /* renamed from: PB4$c */
    /* loaded from: classes3.dex */
    public final class C6294c extends C29735w1 {

        /* renamed from: b */
        public final TextView f28062b;

        /* renamed from: c */
        public final TextView f28063c;

        /* renamed from: d */
        public final /* synthetic */ PB4 f28064d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6294c(PB4 pb4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f28064d = pb4;
            this.f28062b = (TextView) view.findViewById(C35658Rh4.status);
            this.f28063c = (TextView) view.findViewById(C35658Rh4.issues);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f28064d.m94545o().m109394h().get(i).m105816c();
            String str = null;
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair != null) {
                String str2 = (String) pair.component2();
                TextView textView = this.f28062b;
                String statusDisplay = ((WorkOrder) pair.component1()).getStatusDisplay();
                if (statusDisplay != null) {
                    str = StringsKt__StringsJVMKt.capitalize(statusDisplay);
                }
                textView.setText(str);
                this.f28063c.setText(str2);
            }
        }
    }

    @Override // p000.AbstractC28652tD, androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C45851nj4.item_vehicle_summary ? new C6293b(this, m41761u) : i == C32634Ej4.item_repair_work_order_header ? new C6294c(this, m41761u) : i == C32634Ej4.item_repair_notes ? new C6292a(this, m41761u) : super.onCreateViewHolder(parent, i);
    }
}
