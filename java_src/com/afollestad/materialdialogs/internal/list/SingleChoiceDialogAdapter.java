package com.afollestad.materialdialogs.internal.list;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.C16848R;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.WhichButton;
import com.afollestad.materialdialogs.actions.DialogActionExtKt;
import com.afollestad.materialdialogs.list.DialogListExtKt;
import com.afollestad.materialdialogs.utils.ColorsKt;
import com.afollestad.materialdialogs.utils.MDUtil;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012Y\u0012\u0004\u0012\u00020\u0004\u0012O\u0012M\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005j\u0002`\u000e0\u0003B\u008a\u0001\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e\u0012\b\u0010A\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010B\u001a\u00020\n\u0012\u0006\u00109\u001a\u00020+\u0012Q\u0010;\u001aM\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005j\u0002`\u000e¢\u0006\u0004\bC\u0010DJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\nH\u0016J\b\u0010\u0016\u001a\u00020\nH\u0016J\u0018\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\nH\u0016J&\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016J\b\u0010\u001d\u001a\u00020\rH\u0016Ji\u0010!\u001a\u00020\r2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e2Q\u0010 \u001aM\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005j\u0002`\u000eH\u0016J\u0010\u0010$\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010%\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010&\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010'\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"H\u0016J\b\u0010(\u001a\u00020\rH\u0016J\b\u0010)\u001a\u00020\rH\u0016J\b\u0010*\u001a\u00020\rH\u0016J\u0010\u0010,\u001a\u00020+2\u0006\u0010\u000b\u001a\u00020\nH\u0016R$\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020\n8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b.\u0010/\"\u0004\b0\u0010\u0010R\u0016\u00101\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00103R(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0014\u00109\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:Rm\u0010;\u001aM\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005j\u0002`\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006E"}, m28432d2 = {"Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/afollestad/materialdialogs/internal/list/SingleChoiceViewHolder;", "Lcom/afollestad/materialdialogs/internal/list/DialogAdapter;", "", "Lkotlin/Function3;", "Lcom/afollestad/materialdialogs/MaterialDialog;", "Lkotlin/ParameterName;", "name", "dialog", "", "index", Entry.TYPE_TEXT, "", "Lcom/afollestad/materialdialogs/list/SingleChoiceListener;", "itemClicked$core", "(I)V", "itemClicked", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "onBindViewHolder", "", "", "payloads", "positiveButtonClicked", "", "items", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "replaceItems", "", "indices", "disableItems", "checkItems", "uncheckItems", "toggleItems", "checkAllItems", "uncheckAllItems", "toggleAllChecked", "", "isItemChecked", "value", "currentSelection", "I", "setCurrentSelection", "disabledIndices", "[I", "Lcom/afollestad/materialdialogs/MaterialDialog;", "Ljava/util/List;", "getItems$core", "()Ljava/util/List;", "setItems$core", "(Ljava/util/List;)V", "waitForActionButton", "Z", BaseSheetViewModel.SAVE_SELECTION, "Lkotlin/jvm/functions/Function3;", "getSelection$core", "()Lkotlin/jvm/functions/Function3;", "setSelection$core", "(Lkotlin/jvm/functions/Function3;)V", "disabledItems", "initialSelection", "<init>", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/util/List;[IIZLkotlin/jvm/functions/Function3;)V", "core"}, m28431k = 1, m28430mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class SingleChoiceDialogAdapter extends RecyclerView.AbstractC11843h<SingleChoiceViewHolder> implements DialogAdapter<CharSequence, Function3<? super MaterialDialog, ? super Integer, ? super CharSequence, ? extends Unit>> {
    private int currentSelection;
    private MaterialDialog dialog;
    private int[] disabledIndices;
    private List<? extends CharSequence> items;
    private Function3<? super MaterialDialog, ? super Integer, ? super CharSequence, Unit> selection;
    private final boolean waitForActionButton;

    public SingleChoiceDialogAdapter(MaterialDialog materialDialog, List<? extends CharSequence> list, int[] iArr, int i, boolean z, Function3<? super MaterialDialog, ? super Integer, ? super CharSequence, Unit> function3) {
        this.dialog = materialDialog;
        this.items = list;
        this.waitForActionButton = z;
        this.selection = function3;
        this.currentSelection = i;
        this.disabledIndices = iArr == null ? new int[0] : iArr;
    }

    private final void setCurrentSelection(int i) {
        int i2 = this.currentSelection;
        if (i == i2) {
            return;
        }
        this.currentSelection = i;
        notifyItemChanged(i2, UncheckPayload.INSTANCE);
        notifyItemChanged(i, CheckPayload.INSTANCE);
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void checkAllItems() {
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void checkItems(int[] iArr) {
        boolean z;
        int i;
        boolean contains;
        boolean z2 = true;
        if (iArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = iArr[0];
        } else {
            i = -1;
        }
        if (i < 0 || i >= this.items.size()) {
            z2 = false;
        }
        if (z2) {
            contains = ArraysKt___ArraysKt.contains(this.disabledIndices, i);
            if (contains) {
                return;
            }
            setCurrentSelection(i);
            return;
        }
        throw new IllegalStateException(("Index " + i + " is out of range for this adapter of " + this.items.size() + " items.").toString());
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
        return this.currentSelection == i;
    }

    public final void itemClicked$core(int i) {
        setCurrentSelection(i);
        if (this.waitForActionButton && DialogActionExtKt.hasActionButtons(this.dialog)) {
            DialogActionExtKt.setActionButtonEnabled(this.dialog, WhichButton.POSITIVE, true);
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
        Function3<? super MaterialDialog, ? super Integer, ? super CharSequence, Unit> function3;
        int i = this.currentSelection;
        if (i > -1 && (function3 = this.selection) != null) {
            function3.invoke(this.dialog, Integer.valueOf(i), this.items.get(this.currentSelection));
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
        boolean z;
        int i;
        boolean contains;
        boolean z2 = true;
        if (iArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = iArr[0];
        } else {
            i = -1;
        }
        contains = ArraysKt___ArraysKt.contains(this.disabledIndices, i);
        if (contains) {
            return;
        }
        if (iArr.length != 0) {
            z2 = false;
        }
        if (!z2 && this.currentSelection != i) {
            setCurrentSelection(i);
        } else {
            setCurrentSelection(-1);
        }
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void uncheckAllItems() {
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void uncheckItems(int[] iArr) {
        boolean z;
        int i;
        boolean contains;
        boolean z2 = true;
        if (iArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = iArr[0];
        } else {
            i = -1;
        }
        if (i < 0 || i >= this.items.size()) {
            z2 = false;
        }
        if (z2) {
            contains = ArraysKt___ArraysKt.contains(this.disabledIndices, i);
            if (contains) {
                return;
            }
            setCurrentSelection(-1);
            return;
        }
        throw new IllegalStateException(("Index " + i + " is out of range for this adapter of " + this.items.size() + " items.").toString());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public /* bridge */ /* synthetic */ void onBindViewHolder(SingleChoiceViewHolder singleChoiceViewHolder, int i, List list) {
        onBindViewHolder2(singleChoiceViewHolder, i, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public SingleChoiceViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        MDUtil mDUtil = MDUtil.INSTANCE;
        SingleChoiceViewHolder singleChoiceViewHolder = new SingleChoiceViewHolder(mDUtil.inflate(viewGroup, this.dialog.getWindowContext(), C16848R.C16851layout.md_listitem_singlechoice), this);
        MDUtil.maybeSetTextColor$default(mDUtil, singleChoiceViewHolder.getTitleView(), this.dialog.getWindowContext(), Integer.valueOf(C16848R.attr.md_color_content), null, 4, null);
        int[] resolveColors$default = ColorsKt.resolveColors$default(this.dialog, new int[]{C16848R.attr.md_color_widget, C16848R.attr.md_color_widget_unchecked}, null, 2, null);
        C48921su0.m13543d(singleChoiceViewHolder.getControlView(), mDUtil.createColorSelector(this.dialog.getWindowContext(), resolveColors$default[1], resolveColors$default[0]));
        return singleChoiceViewHolder;
    }

    /* renamed from: replaceItems  reason: avoid collision after fix types in other method */
    public void replaceItems2(List<? extends CharSequence> list, Function3<? super MaterialDialog, ? super Integer, ? super CharSequence, Unit> function3) {
        this.items = list;
        if (function3 != null) {
            this.selection = function3;
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onBindViewHolder(SingleChoiceViewHolder singleChoiceViewHolder, int i) {
        boolean contains;
        contains = ArraysKt___ArraysKt.contains(this.disabledIndices, i);
        singleChoiceViewHolder.setEnabled(!contains);
        singleChoiceViewHolder.getControlView().setChecked(this.currentSelection == i);
        singleChoiceViewHolder.getTitleView().setText(this.items.get(i));
        View view = singleChoiceViewHolder.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
        view.setBackground(DialogListExtKt.getItemSelector(this.dialog));
        if (this.dialog.getBodyFont() != null) {
            singleChoiceViewHolder.getTitleView().setTypeface(this.dialog.getBodyFont());
        }
    }

    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(SingleChoiceViewHolder singleChoiceViewHolder, int i, List<Object> list) {
        Object firstOrNull;
        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) list);
        if (Intrinsics.areEqual(firstOrNull, CheckPayload.INSTANCE)) {
            singleChoiceViewHolder.getControlView().setChecked(true);
        } else if (Intrinsics.areEqual(firstOrNull, UncheckPayload.INSTANCE)) {
            singleChoiceViewHolder.getControlView().setChecked(false);
        } else {
            super.onBindViewHolder((SingleChoiceDialogAdapter) singleChoiceViewHolder, i, list);
        }
    }
}
