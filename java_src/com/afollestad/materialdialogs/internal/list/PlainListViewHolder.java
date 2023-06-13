package com.afollestad.materialdialogs.internal.list;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.TypeCastException;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"Lcom/afollestad/materialdialogs/internal/list/PlainListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$D;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "view", "", "onClick", "Landroid/widget/TextView;", "titleView", "Landroid/widget/TextView;", "getTitleView", "()Landroid/widget/TextView;", "Lcom/afollestad/materialdialogs/internal/list/PlainListDialogAdapter;", "adapter", "Lcom/afollestad/materialdialogs/internal/list/PlainListDialogAdapter;", "itemView", "<init>", "(Landroid/view/View;Lcom/afollestad/materialdialogs/internal/list/PlainListDialogAdapter;)V", "core"}, m28431k = 1, m28430mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class PlainListViewHolder extends RecyclerView.AbstractC11834D implements View.OnClickListener {
    private final PlainListDialogAdapter adapter;
    private final TextView titleView;

    public PlainListViewHolder(View view, PlainListDialogAdapter plainListDialogAdapter) {
        super(view);
        this.adapter = plainListDialogAdapter;
        view.setOnClickListener(this);
        View childAt = ((ViewGroup) view).getChildAt(0);
        if (childAt != null) {
            this.titleView = (TextView) childAt;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
    }

    public final TextView getTitleView() {
        return this.titleView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.adapter.itemClicked(getAdapterPosition());
    }
}
