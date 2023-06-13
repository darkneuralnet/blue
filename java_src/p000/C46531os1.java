package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.model.constant.FlightSheetBadge;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016R6\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, m28432d2 = {"Los1;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lw1;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "onBindViewHolder", "getItemCount", "", "Lco/bird/android/model/constant/FlightSheetBadge;", "value", "b", "Ljava/util/List;", "o", "()Ljava/util/List;", "p", "(Ljava/util/List;)V", "badges", "<init>", "()V", C17296a.f69688o, "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: os1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46531os1 extends RecyclerView.AbstractC11843h<C29735w1> {

    /* renamed from: b */
    public List<? extends FlightSheetBadge> f102673b;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Los1$a;", "Lw1;", "", "position", "", "bind", "LVb2;", "b", "LVb2;", "binding", "Landroid/view/View;", "view", "<init>", "(Los1;Landroid/view/View;)V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: os1$a */
    /* loaded from: classes3.dex */
    public final class C27084a extends C29735w1 {

        /* renamed from: b */
        public final C36538Vb2 f102674b;

        /* renamed from: c */
        public final /* synthetic */ C46531os1 f102675c;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: os1$a$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C27085a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FlightSheetBadge.values().length];
                try {
                    iArr[FlightSheetBadge.MICRO_REBALANCE_ELIGIBLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27084a(C46531os1 c46531os1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f102675c = c46531os1;
            C36538Vb2 m79707a = C36538Vb2.m79707a(view);
            Intrinsics.checkNotNullExpressionValue(m79707a, "bind(view)");
            this.f102674b = m79707a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            if (C27085a.$EnumSwitchMapping$0[this.f102675c.m20415o().get(i).ordinal()] == 1) {
                Drawable m41773i = C40788fB0.m41773i(getContext(), C48193rg4.ic_rebalance);
                int m41776f = C40788fB0.m41776f(getContext(), C32364Df4.birdWhite);
                int m41776f2 = C40788fB0.m41776f(getContext(), C32364Df4.birdNewRoad);
                this.f102674b.getRoot().setImageDrawable(m41773i);
                this.f102674b.getRoot().setImageTintList(ColorStateList.valueOf(m41776f));
                this.f102674b.getRoot().setBackgroundTintList(ColorStateList.valueOf(m41776f2));
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public C46531os1() {
        List<? extends FlightSheetBadge> emptyList;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f102673b = emptyList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemCount() {
        return this.f102673b.size();
    }

    /* renamed from: o */
    public final List<FlightSheetBadge> m20415o() {
        return this.f102673b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C47124ps1());
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* renamed from: p */
    public final void m20414p(List<? extends FlightSheetBadge> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f102673b = value;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onBindViewHolder(C29735w1 holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        return new C27084a(this, C40788fB0.m41761u(context, C37548Zj4.item_flight_sheet_badge, parent, false));
    }
}
