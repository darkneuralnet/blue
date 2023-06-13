package com.afollestad.materialdialogs.internal.list;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.C16848R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m28432d2 = {"Lcom/afollestad/materialdialogs/internal/list/MultiChoiceViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$D;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "view", "", "onClick", "Landroidx/appcompat/widget/AppCompatCheckBox;", "controlView", "Landroidx/appcompat/widget/AppCompatCheckBox;", "getControlView", "()Landroidx/appcompat/widget/AppCompatCheckBox;", "Landroid/widget/TextView;", "titleView", "Landroid/widget/TextView;", "getTitleView", "()Landroid/widget/TextView;", "Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;", "adapter", "Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;", "", "value", "isEnabled", "()Z", "setEnabled", "(Z)V", "itemView", "<init>", "(Landroid/view/View;Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;)V", "core"}, m28431k = 1, m28430mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class MultiChoiceViewHolder extends RecyclerView.AbstractC11834D implements View.OnClickListener {
    private final MultiChoiceDialogAdapter adapter;
    private final AppCompatCheckBox controlView;
    private final TextView titleView;

    public MultiChoiceViewHolder(View view, MultiChoiceDialogAdapter multiChoiceDialogAdapter) {
        super(view);
        this.adapter = multiChoiceDialogAdapter;
        view.setOnClickListener(this);
        View findViewById = view.findViewById(C16848R.C16850id.md_control);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.md_control)");
        this.controlView = (AppCompatCheckBox) findViewById;
        View findViewById2 = view.findViewById(C16848R.C16850id.md_title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.md_title)");
        this.titleView = (TextView) findViewById2;
    }

    public final AppCompatCheckBox getControlView() {
        return this.controlView;
    }

    public final TextView getTitleView() {
        return this.titleView;
    }

    public final boolean isEnabled() {
        View itemView = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(itemView, "itemView");
        return itemView.isEnabled();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (getAdapterPosition() < 0) {
            return;
        }
        this.adapter.itemClicked$core(getAdapterPosition());
    }

    public final void setEnabled(boolean z) {
        View itemView = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(itemView, "itemView");
        itemView.setEnabled(z);
        this.controlView.setEnabled(z);
        this.titleView.setEnabled(z);
    }
}
