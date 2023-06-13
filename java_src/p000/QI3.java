package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.model.RepairLog;
import com.facebook.share.internal.C17296a;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0003\u000f\u0010\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0011"}, m28432d2 = {"LQI3;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "<init>", "()V", "c", C17296a.f69688o, "b", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: QI3 */
/* loaded from: classes3.dex */
public final class QI3 extends AbstractC52206yS0 {

    /* renamed from: c */
    public static final C6759a f30196c = new C6759a(null);

    /* renamed from: d */
    public static final SimpleDateFormat f30197d = new SimpleDateFormat("MMMM dd, yyyy", Locale.getDefault());

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LQI3$a;", "", "Ljava/text/SimpleDateFormat;", "DATE_FORMATTER", "Ljava/text/SimpleDateFormat;", "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: QI3$a */
    /* loaded from: classes3.dex */
    public static final class C6759a {
        public /* synthetic */ C6759a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C6759a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LQI3$b;", "Lw1;", "", "position", "", "bind", "Lef2;", "b", "Lef2;", "binding", "Landroid/view/View;", "view", "<init>", "(LQI3;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPastRepairsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PastRepairsAdapter.kt\nco/bird/android/feature/repair/pastrepairs/adapters/PastRepairsAdapter$EmptyViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,63:1\n18#2:64\n9#3,4:65\n*S KotlinDebug\n*F\n+ 1 PastRepairsAdapter.kt\nco/bird/android/feature/repair/pastrepairs/adapters/PastRepairsAdapter$EmptyViewHolder\n*L\n59#1:64\n59#1:65,4\n*E\n"})
    /* renamed from: QI3$b */
    /* loaded from: classes3.dex */
    public final class C6760b extends C29735w1 {

        /* renamed from: b */
        public final C40472ef2 f30198b;

        /* renamed from: c */
        public final /* synthetic */ QI3 f30199c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6760b(QI3 qi3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f30199c = qi3;
            C40472ef2 m42649a = C40472ef2.m42649a(view);
            Intrinsics.checkNotNullExpressionValue(m42649a, "bind(view)");
            this.f30198b = m42649a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            TextView textView = this.f30198b.f78671b;
            Object m105816c = this.f30199c.m94545o().m109397e(i).m105816c();
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

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LQI3$c;", "Lw1;", "", "position", "", "bind", "Ldf2;", "b", "Ldf2;", "binding", "Landroid/view/View;", "view", "<init>", "(LQI3;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPastRepairsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PastRepairsAdapter.kt\nco/bird/android/feature/repair/pastrepairs/adapters/PastRepairsAdapter$PastRepairViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,63:1\n18#2:64\n9#3,4:65\n*S KotlinDebug\n*F\n+ 1 PastRepairsAdapter.kt\nco/bird/android/feature/repair/pastrepairs/adapters/PastRepairsAdapter$PastRepairViewHolder\n*L\n44#1:64\n44#1:65,4\n*E\n"})
    /* renamed from: QI3$c */
    /* loaded from: classes3.dex */
    public final class C6761c extends C29735w1 {

        /* renamed from: b */
        public final C39880df2 f30200b;

        /* renamed from: c */
        public final /* synthetic */ QI3 f30201c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6761c(QI3 qi3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f30201c = qi3;
            C39880df2 m43930a = C39880df2.m43930a(view);
            Intrinsics.checkNotNullExpressionValue(m43930a, "bind(view)");
            this.f30200b = m43930a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f30201c.m94545o().m109397e(i).m105816c();
            Object obj = null;
            if (!(m105816c instanceof RepairLog)) {
                m105816c = null;
            }
            RepairLog repairLog = (RepairLog) m105816c;
            if (repairLog != null) {
                this.f30200b.f77014c.setText(repairLog.getRepairSubType());
                TextView textView = this.f30200b.f77013b;
                Context context = this.itemView.getContext();
                int i2 = C45871nl4.past_repair_details_format;
                Object[] objArr = new Object[2];
                objArr[0] = repairLog.getRepairerEmail();
                SimpleDateFormat simpleDateFormat = QI3.f30197d;
                DateTime createdAtTime = repairLog.getCreatedAtTime();
                if (createdAtTime != null) {
                    obj = createdAtTime.toDate();
                }
                if (obj == null) {
                    obj = "";
                } else {
                    Intrinsics.checkNotNullExpressionValue(obj, "repairLog.createdAtTime?.toDate() ?: \"\"");
                }
                objArr[1] = simpleDateFormat.format(obj);
                textView.setText(context.getString(i2, objArr));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C35577Qy4());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C32634Ej4.item_repair_info ? new C6761c(this, m41761u) : i == C32634Ej4.item_repair_info_empty ? new C6760b(this, m41761u) : new C29735w1(m41761u);
    }
}
