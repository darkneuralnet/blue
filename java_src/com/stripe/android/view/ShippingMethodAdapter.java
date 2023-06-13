package com.stripe.android.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.model.ShippingMethod;
import com.stripe.android.view.ShippingMethodAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0014\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b,\u0010-J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012R.\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR6\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010#\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00038\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0013\u0010+\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006/"}, m28432d2 = {"Lcom/stripe/android/view/ShippingMethodAdapter;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;", "", "getItemCount", "position", "", "getItemId", "Landroid/view/ViewGroup;", "viewGroup", "i", "onCreateViewHolder", "holder", "", "onBindViewHolder", "Lcom/stripe/android/model/ShippingMethod;", "shippingMethod", "setSelected$payments_core_release", "(Lcom/stripe/android/model/ShippingMethod;)V", "setSelected", "Lkotlin/Function1;", "onShippingMethodSelectedCallback", "Lkotlin/jvm/functions/Function1;", "getOnShippingMethodSelectedCallback$payments_core_release", "()Lkotlin/jvm/functions/Function1;", "setOnShippingMethodSelectedCallback$payments_core_release", "(Lkotlin/jvm/functions/Function1;)V", "", "value", "shippingMethods", "Ljava/util/List;", "getShippingMethods$payments_core_release", "()Ljava/util/List;", "setShippingMethods$payments_core_release", "(Ljava/util/List;)V", "selectedIndex", "I", "getSelectedIndex$payments_core_release", "()I", "setSelectedIndex$payments_core_release", "(I)V", "getSelectedShippingMethod", "()Lcom/stripe/android/model/ShippingMethod;", "selectedShippingMethod", "<init>", "()V", "ShippingMethodViewHolder", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class ShippingMethodAdapter extends RecyclerView.AbstractC11843h<ShippingMethodViewHolder> {
    private Function1<? super ShippingMethod, Unit> onShippingMethodSelectedCallback = ShippingMethodAdapter$onShippingMethodSelectedCallback$1.INSTANCE;
    private /* synthetic */ int selectedIndex;
    private List<ShippingMethod> shippingMethods;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$D;", "Lcom/stripe/android/model/ShippingMethod;", "shippingMethod", "", "setShippingMethod", "", "selected", "setSelected", "Lcom/stripe/android/view/ShippingMethodView;", "shippingMethodView", "Lcom/stripe/android/view/ShippingMethodView;", "getShippingMethodView$payments_core_release", "()Lcom/stripe/android/view/ShippingMethodView;", "<init>", "(Lcom/stripe/android/view/ShippingMethodView;)V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class ShippingMethodViewHolder extends RecyclerView.AbstractC11834D {
        private final ShippingMethodView shippingMethodView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShippingMethodViewHolder(ShippingMethodView shippingMethodView) {
            super(shippingMethodView);
            Intrinsics.checkNotNullParameter(shippingMethodView, "shippingMethodView");
            this.shippingMethodView = shippingMethodView;
        }

        public final ShippingMethodView getShippingMethodView$payments_core_release() {
            return this.shippingMethodView;
        }

        public final void setSelected(boolean z) {
            this.shippingMethodView.setSelected(z);
        }

        public final void setShippingMethod(ShippingMethod shippingMethod) {
            Intrinsics.checkNotNullParameter(shippingMethod, "shippingMethod");
            this.shippingMethodView.setShippingMethod(shippingMethod);
        }
    }

    public ShippingMethodAdapter() {
        List<ShippingMethod> emptyList;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.shippingMethods = emptyList;
        setHasStableIds(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(ShippingMethodAdapter this$0, ShippingMethodViewHolder holder, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        this$0.setSelectedIndex$payments_core_release(holder.getBindingAdapterPosition());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemCount() {
        return this.shippingMethods.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public long getItemId(int i) {
        return this.shippingMethods.get(i).hashCode();
    }

    public final Function1<ShippingMethod, Unit> getOnShippingMethodSelectedCallback$payments_core_release() {
        return this.onShippingMethodSelectedCallback;
    }

    public final int getSelectedIndex$payments_core_release() {
        return this.selectedIndex;
    }

    public final ShippingMethod getSelectedShippingMethod() {
        Object orNull;
        orNull = CollectionsKt___CollectionsKt.getOrNull(this.shippingMethods, this.selectedIndex);
        return (ShippingMethod) orNull;
    }

    public final List<ShippingMethod> getShippingMethods$payments_core_release() {
        return this.shippingMethods;
    }

    public final void setOnShippingMethodSelectedCallback$payments_core_release(Function1<? super ShippingMethod, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onShippingMethodSelectedCallback = function1;
    }

    public final void setSelected$payments_core_release(ShippingMethod shippingMethod) {
        Intrinsics.checkNotNullParameter(shippingMethod, "shippingMethod");
        setSelectedIndex$payments_core_release(this.shippingMethods.indexOf(shippingMethod));
    }

    public final void setSelectedIndex$payments_core_release(int i) {
        int i2 = this.selectedIndex;
        if (i2 != i) {
            notifyItemChanged(i2);
            notifyItemChanged(i);
            this.selectedIndex = i;
            this.onShippingMethodSelectedCallback.invoke(this.shippingMethods.get(i));
        }
    }

    public final void setShippingMethods$payments_core_release(List<ShippingMethod> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setSelectedIndex$payments_core_release(0);
        this.shippingMethods = value;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onBindViewHolder(final ShippingMethodViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.setShippingMethod(this.shippingMethods.get(i));
        holder.setSelected(i == this.selectedIndex);
        holder.getShippingMethodView$payments_core_release().setOnClickListener(new View.OnClickListener() { // from class: nz5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShippingMethodAdapter.onBindViewHolder$lambda$0(ShippingMethodAdapter.this, holder, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public ShippingMethodViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "viewGroup.context");
        return new ShippingMethodViewHolder(new ShippingMethodView(context, null, 0, 6, null));
    }
}
