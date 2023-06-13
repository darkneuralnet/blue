package co.bird.android.app.feature.map.renderer.nestmarker.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C11905h;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.constant.ColoredIcon;
import co.bird.android.model.persistence.nestedstructures.NestAvailableSpaceDetail;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b \u0010!J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R6\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006#"}, m28432d2 = {"Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lw1;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "getItemCount", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "", "selected", "Z", "getSelected", "()Z", "setSelected", "(Z)V", "", "Lco/bird/android/model/persistence/nestedstructures/NestAvailableSpaceDetail;", "value", "availableSpaceDetails", "Ljava/util/List;", "getAvailableSpaceDetails", "()Ljava/util/List;", "setAvailableSpaceDetails", "(Ljava/util/List;)V", "<init>", "()V", "NestAvailableSpaceDetailViewHolder", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class NestAvailableSpaceDetailsAdapter extends RecyclerView.AbstractC11843h<C29735w1> {
    private List<NestAvailableSpaceDetail> availableSpaceDetails;
    private boolean selected;

    @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\u0004\u0018\u00010\n*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter$NestAvailableSpaceDetailViewHolder;", "Lw1;", "", "position", "", "bind", "Lsd2;", "binding", "Lsd2;", "Lco/bird/android/model/persistence/nestedstructures/NestAvailableSpaceDetail;", "Landroid/graphics/drawable/Drawable;", "getDrawable", "(Lco/bird/android/model/persistence/nestedstructures/NestAvailableSpaceDetail;)Landroid/graphics/drawable/Drawable;", "drawable", "Landroid/view/View;", "view", "<init>", "(Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter;Landroid/view/View;)V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public final class NestAvailableSpaceDetailViewHolder extends C29735w1 {
        private final C48753sd2 binding;
        final /* synthetic */ NestAvailableSpaceDetailsAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NestAvailableSpaceDetailViewHolder(NestAvailableSpaceDetailsAdapter nestAvailableSpaceDetailsAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = nestAvailableSpaceDetailsAdapter;
            C48753sd2 m13936a = C48753sd2.m13936a(view);
            Intrinsics.checkNotNullExpressionValue(m13936a, "bind(view)");
            this.binding = m13936a;
        }

        private final Drawable getDrawable(NestAvailableSpaceDetail nestAvailableSpaceDetail) {
            Drawable m103484a;
            ClientIcon icon = nestAvailableSpaceDetail.getIcon();
            if (icon == null || (m103484a = C33341Hk0.m103484a(icon, getContext())) == null) {
                ColoredIcon coloredIcon = nestAvailableSpaceDetail.getColoredIcon();
                if (coloredIcon != null) {
                    return C34295Lm0.m96371a(coloredIcon, getContext());
                }
                return null;
            }
            return m103484a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object orNull;
            orNull = CollectionsKt___CollectionsKt.getOrNull(this.this$0.getAvailableSpaceDetails(), i);
            NestAvailableSpaceDetail nestAvailableSpaceDetail = (NestAvailableSpaceDetail) orNull;
            if (nestAvailableSpaceDetail != null) {
                this.binding.f109053b.setText(String.valueOf(nestAvailableSpaceDetail.getCount()));
                this.binding.f109054c.setImageDrawable(getDrawable(nestAvailableSpaceDetail));
            }
        }
    }

    public NestAvailableSpaceDetailsAdapter() {
        List<NestAvailableSpaceDetail> emptyList;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.availableSpaceDetails = emptyList;
    }

    public final List<NestAvailableSpaceDetail> getAvailableSpaceDetails() {
        return this.availableSpaceDetails;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemCount() {
        return this.availableSpaceDetails.size();
    }

    public final boolean getSelected() {
        return this.selected;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new NestAvailableSpaceDetailsItemDecoration());
        }
    }

    public final void setAvailableSpaceDetails(final List<NestAvailableSpaceDetail> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.availableSpaceDetails.isEmpty()) {
            this.availableSpaceDetails = value;
            notifyItemRangeInserted(0, value.size());
            return;
        }
        C11905h.C11910e m66273c = C11905h.m66273c(new C11905h.AbstractC11907b() { // from class: co.bird.android.app.feature.map.renderer.nestmarker.adapters.NestAvailableSpaceDetailsAdapter$availableSpaceDetails$diff$1
            @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
            public boolean areContentsTheSame(int i, int i2) {
                List list;
                list = NestAvailableSpaceDetailsAdapter.this.availableSpaceDetails;
                return Intrinsics.areEqual(list.get(i), value.get(i2));
            }

            @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
            public boolean areItemsTheSame(int i, int i2) {
                return i == i2;
            }

            @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
            public int getNewListSize() {
                return value.size();
            }

            @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
            public int getOldListSize() {
                List list;
                list = NestAvailableSpaceDetailsAdapter.this.availableSpaceDetails;
                return list.size();
            }
        }, true);
        Intrinsics.checkNotNullExpressionValue(m66273c, "set(value) {\n      if (f…tesTo(this)\n      }\n    }");
        this.availableSpaceDetails = value;
        m66273c.m66261d(this);
    }

    public final void setSelected(boolean z) {
        this.selected = z;
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
        return new NestAvailableSpaceDetailViewHolder(this, C40788fB0.m41761u(context, this.selected ? C45258mj4.item_nest_available_space_detail_selected : C45258mj4.item_nest_available_space_detail, parent, false));
    }
}
