package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0010"}, m28432d2 = {"LG50;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "<init>", "()V", C17296a.f69688o, "b", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBulkStatusAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkStatusAdapter.kt\nco/bird/android/feature/bulkscanner/report/regular/adapters/BulkStatusAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n1#2:55\n*E\n"})
/* renamed from: G50 */
/* loaded from: classes3.dex */
public final class G50 extends AbstractC52206yS0 {

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LG50$a;", "Lw1;", "", "position", "", "bind", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "detail", "Landroid/view/View;", "view", "<init>", "(LG50;Landroid/view/View;)V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBulkStatusAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkStatusAdapter.kt\nco/bird/android/feature/bulkscanner/report/regular/adapters/BulkStatusAdapter$DetailViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,54:1\n18#2:55\n9#3,4:56\n*S KotlinDebug\n*F\n+ 1 BulkStatusAdapter.kt\nco/bird/android/feature/bulkscanner/report/regular/adapters/BulkStatusAdapter$DetailViewHolder\n*L\n50#1:55\n50#1:56,4\n*E\n"})
    /* renamed from: G50$a */
    /* loaded from: classes3.dex */
    public final class C2634a extends C29735w1 {

        /* renamed from: b */
        public final TextView f10889b;

        /* renamed from: c */
        public final /* synthetic */ G50 f10890c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2634a(G50 g50, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f10890c = g50;
            this.f10889b = (TextView) view;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            TextView textView = this.f10889b;
            Object m105816c = this.f10890c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof CharSequence)) {
                m105816c = null;
            }
            textView.setText((CharSequence) m105816c);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LG50$b;", "Lw1;", "", "position", "", "bind", "Lfb2;", "b", "Lfb2;", "binding", "Landroid/view/View;", "view", "<init>", "(LG50;Landroid/view/View;)V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBulkStatusAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkStatusAdapter.kt\nco/bird/android/feature/bulkscanner/report/regular/adapters/BulkStatusAdapter$StatusViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,54:1\n18#2:55\n9#3,4:56\n*S KotlinDebug\n*F\n+ 1 BulkStatusAdapter.kt\nco/bird/android/feature/bulkscanner/report/regular/adapters/BulkStatusAdapter$StatusViewHolder\n*L\n39#1:55\n39#1:56,4\n*E\n"})
    /* renamed from: G50$b */
    /* loaded from: classes3.dex */
    public final class C2635b extends C29735w1 {

        /* renamed from: b */
        public final C41025fb2 f10891b;

        /* renamed from: c */
        public final /* synthetic */ G50 f10892c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2635b(G50 g50, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f10892c = g50;
            C41025fb2 m41152a = C41025fb2.m41152a(view);
            Intrinsics.checkNotNullExpressionValue(m41152a, "bind(view)");
            this.f10891b = m41152a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f10892c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C41312g40)) {
                m105816c = null;
            }
            C41312g40 c41312g40 = (C41312g40) m105816c;
            if (c41312g40 != null) {
                this.f10891b.f80345b.setImageDrawable(c41312g40.m40166b());
                this.f10891b.f80346c.setText(c41312g40.m40165c());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            I50 i50 = new I50();
            Context context = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "recyclerView.context");
            i50.m91737n(C49347td3.m12002a(2, context));
            recyclerView.addItemDecoration(i50);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C35901Si4.item_bulk_operation_status ? new C2635b(this, m41761u) : i == C35901Si4.item_bulk_operation_detail ? new C2634a(this, m41761u) : new C29735w1(m41761u);
    }
}
