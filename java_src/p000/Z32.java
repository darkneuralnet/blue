package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0010"}, m28432d2 = {"LZ32;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "<init>", "()V", C17296a.f69688o, "b", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Z32 */
/* loaded from: classes3.dex */
public final class Z32 extends AbstractC52206yS0 {

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LZ32$a;", "Lw1;", "", "position", "", "bind", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "display", "Landroid/view/View;", "view", "<init>", "(LZ32;Landroid/view/View;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectionV3CompleteAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectionV3CompleteAdapter.kt\nco/bird/android/feature/workorders/v3/dialog/InspectionV3CompleteAdapter$FailedInspectionViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,57:1\n18#2:58\n9#3,4:59\n*S KotlinDebug\n*F\n+ 1 InspectionV3CompleteAdapter.kt\nco/bird/android/feature/workorders/v3/dialog/InspectionV3CompleteAdapter$FailedInspectionViewHolder\n*L\n53#1:58\n53#1:59,4\n*E\n"})
    /* renamed from: Z32$a */
    /* loaded from: classes3.dex */
    public final class C10108a extends C29735w1 {

        /* renamed from: b */
        public final TextView f47788b;

        /* renamed from: c */
        public final /* synthetic */ Z32 f47789c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10108a(Z32 z32, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f47789c = z32;
            this.f47788b = (TextView) view;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            TextView textView = this.f47788b;
            Object m105816c = this.f47789c.m94545o().m109397e(i).m105816c();
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

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u001c\u0010\u0010\u001a\n \u0007*\u0004\u0018\u00010\r0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, m28432d2 = {"LZ32$b;", "Lw1;", "", "position", "", "bind", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "b", "Landroid/widget/ImageView;", "scooter", "c", "icon", "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/TextView;", "message", "Landroid/view/View;", "view", "<init>", "(LZ32;Landroid/view/View;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectionV3CompleteAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectionV3CompleteAdapter.kt\nco/bird/android/feature/workorders/v3/dialog/InspectionV3CompleteAdapter$HeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,57:1\n18#2:58\n9#3,4:59\n*S KotlinDebug\n*F\n+ 1 InspectionV3CompleteAdapter.kt\nco/bird/android/feature/workorders/v3/dialog/InspectionV3CompleteAdapter$HeaderViewHolder\n*L\n39#1:58\n39#1:59,4\n*E\n"})
    /* renamed from: Z32$b */
    /* loaded from: classes3.dex */
    public final class C10109b extends C29735w1 {

        /* renamed from: b */
        public final ImageView f47790b;

        /* renamed from: c */
        public final ImageView f47791c;

        /* renamed from: d */
        public final TextView f47792d;

        /* renamed from: e */
        public final /* synthetic */ Z32 f47793e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10109b(Z32 z32, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f47793e = z32;
            this.f47790b = (ImageView) view.findViewById(C44062ki4.scooter);
            this.f47791c = (ImageView) view.findViewById(C44062ki4.complete);
            this.f47792d = (TextView) view.findViewById(C44062ki4.message);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            Object m105816c = this.f47793e.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof R32)) {
                m105816c = null;
            }
            R32 r32 = (R32) m105816c;
            if (r32 != null) {
                this.f47790b.setImageDrawable(r32.m87368d());
                this.f47791c.setImageDrawable(r32.m87370b());
                this.f47792d.setText(r32.m87369c());
                TextView message = this.f47792d;
                Intrinsics.checkNotNullExpressionValue(message, "message");
                if (r32.m87369c() != null) {
                    z = true;
                } else {
                    z = false;
                }
                C49520tu6.show$default(message, z, 0, 2, null);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C39536d42());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C37080Xj4.item_inspection_complete_header ? new C10109b(this, m41761u) : i == C37080Xj4.item_inspection_complete_issue ? new C10108a(this, m41761u) : new C29735w1(m41761u);
    }
}
