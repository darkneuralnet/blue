package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.model.DamageTrack;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0010"}, m28432d2 = {"Le31;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "<init>", "()V", C17296a.f69688o, "b", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: e31  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40117e31 extends AbstractC52206yS0 {

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Le31$a;", "Lw1;", "", "position", "", "bind", "Ldf2;", "b", "Ldf2;", "binding", "Landroid/view/View;", "view", "<init>", "(Le31;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nDiagnosticsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiagnosticsAdapter.kt\nco/bird/android/feature/repair/diagnostics/adapters/DiagnosticsAdapter$DiagnosticsViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,55:1\n18#2:56\n9#3,4:57\n*S KotlinDebug\n*F\n+ 1 DiagnosticsAdapter.kt\nco/bird/android/feature/repair/diagnostics/adapters/DiagnosticsAdapter$DiagnosticsViewHolder\n*L\n40#1:56\n40#1:57,4\n*E\n"})
    /* renamed from: e31$a */
    /* loaded from: classes3.dex */
    public final class C19954a extends C29735w1 {

        /* renamed from: b */
        public final C39880df2 f77646b;

        /* renamed from: c */
        public final /* synthetic */ C40117e31 f77647c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19954a(C40117e31 c40117e31, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f77647c = c40117e31;
            C39880df2 m43930a = C39880df2.m43930a(view);
            Intrinsics.checkNotNullExpressionValue(m43930a, "bind(view)");
            this.f77646b = m43930a;
        }

        @Override // p000.C29735w1
        @SuppressLint({"SetTextI18n"})
        public void bind(int i) {
            Object m105816c = this.f77647c.m94545o().m109397e(i).m105816c();
            String str = null;
            if (!(m105816c instanceof DamageTrack)) {
                m105816c = null;
            }
            DamageTrack damageTrack = (DamageTrack) m105816c;
            if (damageTrack != null) {
                this.f77646b.f77014c.setText(damageTrack.getCodeHeader() + " (" + damageTrack.getCode() + ")");
                TextView textView = this.f77646b.f77013b;
                DateTime createdAtTime = damageTrack.getCreatedAtTime();
                if (createdAtTime != null) {
                    Context context = this.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
                    str = C46880pT0.m19259c(createdAtTime, context, true);
                }
                textView.setText(str);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Le31$b;", "Lw1;", "", "position", "", "bind", "Lef2;", "b", "Lef2;", "binding", "Landroid/view/View;", "view", "<init>", "(Le31;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nDiagnosticsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiagnosticsAdapter.kt\nco/bird/android/feature/repair/diagnostics/adapters/DiagnosticsAdapter$EmptyViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,55:1\n18#2:56\n9#3,4:57\n*S KotlinDebug\n*F\n+ 1 DiagnosticsAdapter.kt\nco/bird/android/feature/repair/diagnostics/adapters/DiagnosticsAdapter$EmptyViewHolder\n*L\n51#1:56\n51#1:57,4\n*E\n"})
    /* renamed from: e31$b */
    /* loaded from: classes3.dex */
    public final class C19955b extends C29735w1 {

        /* renamed from: b */
        public final C40472ef2 f77648b;

        /* renamed from: c */
        public final /* synthetic */ C40117e31 f77649c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19955b(C40117e31 c40117e31, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f77649c = c40117e31;
            C40472ef2 m42649a = C40472ef2.m42649a(view);
            Intrinsics.checkNotNullExpressionValue(m42649a, "bind(view)");
            this.f77648b = m42649a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            TextView textView = this.f77648b.f78671b;
            Object m105816c = this.f77649c.m94545o().m109397e(i).m105816c();
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
        return i == C32634Ej4.item_repair_info ? new C19954a(this, m41761u) : i == C32634Ej4.item_repair_info_empty ? new C19955b(this, m41761u) : new C29735w1(m41761u);
    }
}
