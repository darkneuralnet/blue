package com.afollestad.materialdialogs.internal.list;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.C16848R;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.WhichButton;
import com.afollestad.materialdialogs.actions.DialogActionExtKt;
import com.afollestad.materialdialogs.list.DialogListExtKt;
import com.afollestad.materialdialogs.utils.MDUtil;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012Y\u0012\u0004\u0012\u00020\u0004\u0012O\u0012M\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005j\u0002`\u000e0\u0003B\u0082\u0001\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0019\u0012\b\u00108\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u00100\u001a\u00020&\u0012Q\u00102\u001aM\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005j\u0002`\u000e¢\u0006\u0004\b9\u0010:J\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nJ\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\nH\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\u0018\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\nH\u0016J\b\u0010\u0018\u001a\u00020\rH\u0016Ji\u0010\u001c\u001a\u00020\r2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00192Q\u0010\u001b\u001aM\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005j\u0002`\u000eH\u0016J\u0010\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010 \u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010!\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010\"\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010#\u001a\u00020\rH\u0016J\b\u0010$\u001a\u00020\rH\u0016J\b\u0010%\u001a\u00020\rH\u0016J\u0010\u0010'\u001a\u00020&2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0016\u0010(\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010*R(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0016\u00100\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101Rm\u00102\u001aM\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005j\u0002`\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006;"}, m28432d2 = {"Lcom/afollestad/materialdialogs/internal/list/PlainListDialogAdapter;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/afollestad/materialdialogs/internal/list/PlainListViewHolder;", "Lcom/afollestad/materialdialogs/internal/list/DialogAdapter;", "", "Lkotlin/Function3;", "Lcom/afollestad/materialdialogs/MaterialDialog;", "Lkotlin/ParameterName;", "name", "dialog", "", "index", Entry.TYPE_TEXT, "", "Lcom/afollestad/materialdialogs/list/ItemListener;", "itemClicked", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "onBindViewHolder", "positiveButtonClicked", "", "items", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "replaceItems", "", "indices", "disableItems", "checkItems", "uncheckItems", "toggleItems", "checkAllItems", "uncheckAllItems", "toggleAllChecked", "", "isItemChecked", "disabledIndices", "[I", "Lcom/afollestad/materialdialogs/MaterialDialog;", "Ljava/util/List;", "getItems$core", "()Ljava/util/List;", "setItems$core", "(Ljava/util/List;)V", "waitForPositiveButton", "Z", BaseSheetViewModel.SAVE_SELECTION, "Lkotlin/jvm/functions/Function3;", "getSelection$core", "()Lkotlin/jvm/functions/Function3;", "setSelection$core", "(Lkotlin/jvm/functions/Function3;)V", "disabledItems", "<init>", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/util/List;[IZLkotlin/jvm/functions/Function3;)V", "core"}, m28431k = 1, m28430mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class PlainListDialogAdapter extends RecyclerView.AbstractC11843h<PlainListViewHolder> implements DialogAdapter<CharSequence, Function3<? super MaterialDialog, ? super Integer, ? super CharSequence, ? extends Unit>> {
    private MaterialDialog dialog;
    private int[] disabledIndices;
    private List<? extends CharSequence> items;
    private Function3<? super MaterialDialog, ? super Integer, ? super CharSequence, Unit> selection;
    private boolean waitForPositiveButton;

    public PlainListDialogAdapter(MaterialDialog materialDialog, List<? extends CharSequence> list, int[] iArr, boolean z, Function3<? super MaterialDialog, ? super Integer, ? super CharSequence, Unit> function3) {
        this.dialog = materialDialog;
        this.items = list;
        this.waitForPositiveButton = z;
        this.selection = function3;
        this.disabledIndices = iArr == null ? new int[0] : iArr;
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void checkAllItems() {
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void checkItems(int[] iArr) {
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void disableItems(int[] iArr) {
        this.disabledIndices = iArr;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemCount() {
        return this.items.size();
    }

    public final List<CharSequence> getItems$core() {
        return this.items;
    }

    public final Function3<MaterialDialog, Integer, CharSequence, Unit> getSelection$core() {
        return this.selection;
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public boolean isItemChecked(int i) {
        return false;
    }

    public final void itemClicked(int i) {
        if (this.waitForPositiveButton && DialogActionExtKt.hasActionButton(this.dialog, WhichButton.POSITIVE)) {
            Object obj = this.dialog.getConfig().get("activated_index");
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            this.dialog.getConfig().put("activated_index", Integer.valueOf(i));
            if (num != null) {
                notifyItemChanged(num.intValue());
            }
            notifyItemChanged(i);
            return;
        }
        Function3<? super MaterialDialog, ? super Integer, ? super CharSequence, Unit> function3 = this.selection;
        if (function3 != null) {
            function3.invoke(this.dialog, Integer.valueOf(i), this.items.get(i));
        }
        if (this.dialog.getAutoDismissEnabled() && !DialogActionExtKt.hasActionButtons(this.dialog)) {
            this.dialog.dismiss();
        }
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void positiveButtonClicked() {
        Object obj = this.dialog.getConfig().get("activated_index");
        if (!(obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            Function3<? super MaterialDialog, ? super Integer, ? super CharSequence, Unit> function3 = this.selection;
            if (function3 != null) {
                function3.invoke(this.dialog, num, this.items.get(num.intValue()));
            }
            this.dialog.getConfig().remove("activated_index");
        }
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public /* bridge */ /* synthetic */ void replaceItems(List<? extends CharSequence> list, Function3<? super MaterialDialog, ? super Integer, ? super CharSequence, ? extends Unit> function3) {
        replaceItems2(list, (Function3<? super MaterialDialog, ? super Integer, ? super CharSequence, Unit>) function3);
    }

    public final void setItems$core(List<? extends CharSequence> list) {
        this.items = list;
    }

    public final void setSelection$core(Function3<? super MaterialDialog, ? super Integer, ? super CharSequence, Unit> function3) {
        this.selection = function3;
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void toggleAllChecked() {
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void toggleItems(int[] iArr) {
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void uncheckAllItems() {
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void uncheckItems(int[] iArr) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onBindViewHolder(PlainListViewHolder plainListViewHolder, int i) {
        boolean contains;
        View view = plainListViewHolder.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
        contains = ArraysKt___ArraysKt.contains(this.disabledIndices, i);
        boolean z = true;
        view.setEnabled(!contains);
        plainListViewHolder.getTitleView().setText(this.items.get(i));
        View view2 = plainListViewHolder.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
        view2.setBackground(DialogListExtKt.getItemSelector(this.dialog));
        Object obj = this.dialog.getConfig().get("activated_index");
        if (!(obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        View view3 = plainListViewHolder.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "holder.itemView");
        view3.setActivated((num == null || num.intValue() != i) ? false : false);
        if (this.dialog.getBodyFont() != null) {
            plainListViewHolder.getTitleView().setTypeface(this.dialog.getBodyFont());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public PlainListViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        MDUtil mDUtil = MDUtil.INSTANCE;
        PlainListViewHolder plainListViewHolder = new PlainListViewHolder(mDUtil.inflate(viewGroup, this.dialog.getWindowContext(), C16848R.C16851layout.md_listitem), this);
        MDUtil.maybeSetTextColor$default(mDUtil, plainListViewHolder.getTitleView(), this.dialog.getWindowContext(), Integer.valueOf(C16848R.attr.md_color_content), null, 4, null);
        return plainListViewHolder;
    }

    /* renamed from: replaceItems  reason: avoid collision after fix types in other method */
    public void replaceItems2(List<? extends CharSequence> list, Function3<? super MaterialDialog, ? super Integer, ? super CharSequence, Unit> function3) {
        this.items = list;
        if (function3 != null) {
            this.selection = function3;
        }
        notifyDataSetChanged();
    }
}
