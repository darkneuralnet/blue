package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.NonRepair;
import co.bird.android.model.NonRepairReason;
import co.bird.android.model.Repair;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J&\u0010\u0011\u001a\u00020\n2\u001e\u0010\u0010\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0004\u0012\u00020\n0\fJ\u001a\u0010\u0013\u001a\u00020\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\fR0\u0010\u0016\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0004\u0012\u00020\n\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u001d"}, m28432d2 = {"LQE4;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "Lkotlin/Function1;", "Lkotlin/Pair;", "Lco/bird/android/model/Repair;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "w", "Lco/bird/android/model/NonRepair;", "v", "c", "Lkotlin/jvm/functions/Function1;", "repairListener", DateTokenConverter.CONVERTER_KEY, "nonRepairListener", "<init>", "()V", C17296a.f69688o, "b", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: QE4 */
/* loaded from: classes3.dex */
public final class QE4 extends AbstractC52206yS0 {

    /* renamed from: c */
    public Function1<? super Pair<Repair, Boolean>, Unit> f30081c;

    /* renamed from: d */
    public Function1<? super NonRepair, Unit> f30082d;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LQE4$a;", "Lw1;", "", "position", "", "bind", "Lif2;", "b", "Lif2;", "binding", "Landroid/view/View;", "view", "<init>", "(LQE4;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairV3IssueRepairAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3IssueRepairAdapter.kt\nco/bird/android/feature/repair/v3/issues/adapters/RepairV3IssueRepairAdapter$NonRepairViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,110:1\n18#2:111\n9#3,4:112\n288#4,2:116\n*S KotlinDebug\n*F\n+ 1 RepairV3IssueRepairAdapter.kt\nco/bird/android/feature/repair/v3/issues/adapters/RepairV3IssueRepairAdapter$NonRepairViewHolder\n*L\n92#1:111\n92#1:112,4\n93#1:116,2\n*E\n"})
    /* renamed from: QE4$a */
    /* loaded from: classes3.dex */
    public final class C6739a extends C29735w1 {

        /* renamed from: b */
        public final C42844if2 f30083b;

        /* renamed from: c */
        public final /* synthetic */ QE4 f30084c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nRepairV3IssueRepairAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3IssueRepairAdapter.kt\nco/bird/android/feature/repair/v3/issues/adapters/RepairV3IssueRepairAdapter$NonRepairViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n18#2:111\n9#3,4:112\n1#4:116\n*S KotlinDebug\n*F\n+ 1 RepairV3IssueRepairAdapter.kt\nco/bird/android/feature/repair/v3/issues/adapters/RepairV3IssueRepairAdapter$NonRepairViewHolder$1\n*L\n86#1:111\n86#1:112,4\n*E\n"})
        /* renamed from: QE4$a$a */
        /* loaded from: classes3.dex */
        public static final class C6740a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ QE4 f30086h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6740a(QE4 qe4) {
                super(1);
                this.f30086h = qe4;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Function1 function1;
                int adapterPosition = C6739a.this.getAdapterPosition();
                if (adapterPosition != -1) {
                    Object m105816c = this.f30086h.m94545o().m109397e(adapterPosition).m105816c();
                    if (!(m105816c instanceof NonRepair)) {
                        m105816c = null;
                    }
                    NonRepair nonRepair = (NonRepair) m105816c;
                    if (nonRepair == null || (function1 = this.f30086h.f30082d) == null) {
                        return;
                    }
                    function1.invoke(nonRepair);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6739a(QE4 qe4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f30084c = qe4;
            C42844if2 m33617a = C42844if2.m33617a(view);
            Intrinsics.checkNotNullExpressionValue(m33617a, "bind(view)");
            this.f30083b = m33617a;
            View itemView = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            C34585Ms2.m94661j(itemView, new C6740a(qe4));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            String string;
            int i2;
            Object m105816c = this.f30084c.m94545o().m109397e(i).m105816c();
            Object obj = null;
            if (!(m105816c instanceof NonRepair)) {
                m105816c = null;
            }
            NonRepair nonRepair = (NonRepair) m105816c;
            if (nonRepair != null) {
                Iterator<T> it = nonRepair.getReasons().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((NonRepairReason) next).getSelected()) {
                        obj = next;
                        break;
                    }
                }
                NonRepairReason nonRepairReason = (NonRepairReason) obj;
                this.f30083b.f87705b.setText(nonRepair.getDisplay());
                if (nonRepair.getSelected()) {
                    TextView textView = this.f30083b.f87706c;
                    if (nonRepairReason == null || (string = nonRepairReason.getDisplay()) == null) {
                        string = this.itemView.getContext().getString(C45871nl4.repair_non_repair_confirmed);
                    }
                    textView.setText(string);
                    TextView textView2 = this.f30083b.f87706c;
                    Context context = this.itemView.getContext();
                    if (nonRepair.getAllowRepairs()) {
                        i2 = C32364Df4.failedIssueRed;
                    } else {
                        i2 = C32364Df4.passedIssueGreen;
                    }
                    textView2.setBackgroundTintList(NA0.m94300d(context, i2));
                    TextView textView3 = this.f30083b.f87706c;
                    Intrinsics.checkNotNullExpressionValue(textView3, "binding.reason");
                    C49520tu6.m11233r(textView3);
                    return;
                }
                TextView textView4 = this.f30083b.f87706c;
                Intrinsics.checkNotNullExpressionValue(textView4, "binding.reason");
                C49520tu6.m11239l(textView4);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"LQE4$b;", "Lw1;", "", "position", "", "bind", "Landroid/widget/CheckBox;", "b", "Landroid/widget/CheckBox;", "checkbox", "", "c", "Z", "binding", "Landroid/view/View;", "view", "<init>", "(LQE4;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairV3IssueRepairAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3IssueRepairAdapter.kt\nco/bird/android/feature/repair/v3/issues/adapters/RepairV3IssueRepairAdapter$RepairViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,110:1\n18#2:111\n9#3,4:112\n*S KotlinDebug\n*F\n+ 1 RepairV3IssueRepairAdapter.kt\nco/bird/android/feature/repair/v3/issues/adapters/RepairV3IssueRepairAdapter$RepairViewHolder\n*L\n69#1:111\n69#1:112,4\n*E\n"})
    /* renamed from: QE4$b */
    /* loaded from: classes3.dex */
    public final class C6741b extends C29735w1 {

        /* renamed from: b */
        public final CheckBox f30087b;

        /* renamed from: c */
        public boolean f30088c;

        /* renamed from: d */
        public final /* synthetic */ QE4 f30089d;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/widget/CompoundButton;", "<anonymous parameter 0>", "", "isChecked", "", C17296a.f69688o, "(Landroid/widget/CompoundButton;Z)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nRepairV3IssueRepairAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3IssueRepairAdapter.kt\nco/bird/android/feature/repair/v3/issues/adapters/RepairV3IssueRepairAdapter$RepairViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,110:1\n18#2:111\n9#3,4:112\n*S KotlinDebug\n*F\n+ 1 RepairV3IssueRepairAdapter.kt\nco/bird/android/feature/repair/v3/issues/adapters/RepairV3IssueRepairAdapter$RepairViewHolder$1\n*L\n60#1:111\n60#1:112,4\n*E\n"})
        /* renamed from: QE4$b$a */
        /* loaded from: classes3.dex */
        public static final class C6742a extends Lambda implements Function2<CompoundButton, Boolean, Unit> {

            /* renamed from: h */
            public final /* synthetic */ QE4 f30091h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6742a(QE4 qe4) {
                super(2);
                this.f30091h = qe4;
            }

            /* renamed from: a */
            public final void m88704a(CompoundButton compoundButton, boolean z) {
                Function1 function1;
                int adapterPosition = C6741b.this.getAdapterPosition();
                if (adapterPosition != -1 && !C6741b.this.f30088c) {
                    Object m105816c = this.f30091h.m94545o().m109397e(adapterPosition).m105816c();
                    if (!(m105816c instanceof IF4)) {
                        m105816c = null;
                    }
                    IF4 if4 = (IF4) m105816c;
                    if (if4 != null && (function1 = this.f30091h.f30081c) != null) {
                        function1.invoke(TuplesKt.m28425to(if4.m102666d(), Boolean.valueOf(z)));
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(CompoundButton compoundButton, Boolean bool) {
                m88704a(compoundButton, bool.booleanValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6741b(QE4 qe4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f30089d = qe4;
            CheckBox checkBox = (CheckBox) view;
            this.f30087b = checkBox;
            C34585Ms2.m94663h(checkBox, new C6742a(qe4));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            this.f30088c = true;
            Object m105816c = this.f30089d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof IF4)) {
                m105816c = null;
            }
            IF4 if4 = (IF4) m105816c;
            if (if4 != null) {
                this.f30087b.setText(if4.m102668b());
                this.f30087b.setChecked(if4.m102665e());
                this.f30087b.setEnabled(if4.m102667c());
            }
            this.f30088c = false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new RE4());
        }
    }

    /* renamed from: v */
    public final void m88707v(Function1<? super NonRepair, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f30082d = listener;
    }

    /* renamed from: w */
    public final void m88706w(Function1<? super Pair<Repair, Boolean>, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f30081c = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C32634Ej4.item_repair_v3 ? new C6741b(this, m41761u) : i == C32634Ej4.item_repair_v3_issue_non_repair ? new C6739a(this, m41761u) : new C29735w1(m41761u);
    }
}
