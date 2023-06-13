package com.afollestad.materialdialogs.internal.list;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.C16848R;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.WhichButton;
import com.afollestad.materialdialogs.actions.DialogActionExtKt;
import com.afollestad.materialdialogs.list.DialogListExtKt;
import com.afollestad.materialdialogs.utils.ColorsKt;
import com.afollestad.materialdialogs.utils.IntArraysKt;
import com.afollestad.materialdialogs.utils.MDUtil;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012_\u0012\u0004\u0012\u00020\u0004\u0012U\u0012S\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005j\u0002`\u000f0\u0003B\u0098\u0001\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f\u0012\b\u0010A\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010B\u001a\u00020\n\u0012\u0006\u00108\u001a\u00020*\u0012\u0006\u0010:\u001a\u00020*\u0012W\u0010;\u001aS\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005j\u0002`\u000f¢\u0006\u0004\bC\u0010DJ\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\u0018\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0010H\u0016J&\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00102\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016J\b\u0010 \u001a\u00020\u000eH\u0016Jo\u0010\"\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f2W\u0010!\u001aS\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005j\u0002`\u000fH\u0016J\u0010\u0010#\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010$\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010%\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010&\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010'\u001a\u00020\u000eH\u0016J\b\u0010(\u001a\u00020\u000eH\u0016J\b\u0010)\u001a\u00020\u000eH\u0016J\u0010\u0010+\u001a\u00020*2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R$\u0010-\u001a\u00020\n2\u0006\u0010,\u001a\u00020\n8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b-\u0010.\"\u0004\b/\u00100R\u0016\u00101\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010.R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00102R(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0014\u00108\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00109Rs\u0010;\u001aS\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005j\u0002`\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006E"}, m28432d2 = {"Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/afollestad/materialdialogs/internal/list/MultiChoiceViewHolder;", "Lcom/afollestad/materialdialogs/internal/list/DialogAdapter;", "", "Lkotlin/Function3;", "Lcom/afollestad/materialdialogs/MaterialDialog;", "Lkotlin/ParameterName;", "name", "dialog", "", "indices", "", "items", "", "Lcom/afollestad/materialdialogs/list/MultiChoiceListener;", "", "index", "itemClicked$core", "(I)V", "itemClicked", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "onBindViewHolder", "", "", "payloads", "positiveButtonClicked", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "replaceItems", "disableItems", "checkItems", "uncheckItems", "toggleItems", "checkAllItems", "uncheckAllItems", "toggleAllChecked", "", "isItemChecked", "value", "currentSelection", "[I", "setCurrentSelection", "([I)V", "disabledIndices", "Lcom/afollestad/materialdialogs/MaterialDialog;", "Ljava/util/List;", "getItems$core", "()Ljava/util/List;", "setItems$core", "(Ljava/util/List;)V", "waitForActionButton", "Z", "allowEmptySelection", BaseSheetViewModel.SAVE_SELECTION, "Lkotlin/jvm/functions/Function3;", "getSelection$core", "()Lkotlin/jvm/functions/Function3;", "setSelection$core", "(Lkotlin/jvm/functions/Function3;)V", "disabledItems", "initialSelection", "<init>", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/util/List;[I[IZZLkotlin/jvm/functions/Function3;)V", "core"}, m28431k = 1, m28430mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class MultiChoiceDialogAdapter extends RecyclerView.AbstractC11843h<MultiChoiceViewHolder> implements DialogAdapter<CharSequence, Function3<? super MaterialDialog, ? super int[], ? super List<? extends CharSequence>, ? extends Unit>> {
    private final boolean allowEmptySelection;
    private int[] currentSelection;
    private MaterialDialog dialog;
    private int[] disabledIndices;
    private List<? extends CharSequence> items;
    private Function3<? super MaterialDialog, ? super int[], ? super List<? extends CharSequence>, Unit> selection;
    private final boolean waitForActionButton;

    public MultiChoiceDialogAdapter(MaterialDialog materialDialog, List<? extends CharSequence> list, int[] iArr, int[] iArr2, boolean z, boolean z2, Function3<? super MaterialDialog, ? super int[], ? super List<? extends CharSequence>, Unit> function3) {
        this.dialog = materialDialog;
        this.items = list;
        this.waitForActionButton = z;
        this.allowEmptySelection = z2;
        this.selection = function3;
        this.currentSelection = iArr2;
        this.disabledIndices = iArr == null ? new int[0] : iArr;
    }

    private final void setCurrentSelection(int[] iArr) {
        boolean contains;
        boolean contains2;
        int[] iArr2 = this.currentSelection;
        this.currentSelection = iArr;
        for (int i : iArr2) {
            contains2 = ArraysKt___ArraysKt.contains(iArr, i);
            if (!contains2) {
                notifyItemChanged(i, UncheckPayload.INSTANCE);
            }
        }
        for (int i2 : iArr) {
            contains = ArraysKt___ArraysKt.contains(iArr2, i2);
            if (!contains) {
                notifyItemChanged(i2, CheckPayload.INSTANCE);
            }
        }
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void checkAllItems() {
        boolean contains;
        int[] iArr = this.currentSelection;
        int itemCount = getItemCount();
        int[] iArr2 = new int[itemCount];
        boolean z = false;
        for (int i = 0; i < itemCount; i++) {
            iArr2[i] = i;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < itemCount; i2++) {
            int i3 = iArr2[i2];
            contains = ArraysKt___ArraysKt.contains(iArr, i3);
            if (true ^ contains) {
                arrayList.add(Integer.valueOf(i3));
            }
        }
        setCurrentSelection(IntArraysKt.appendAll(this.currentSelection, arrayList));
        if (iArr.length == 0) {
            z = true;
        }
        if (z) {
            DialogActionExtKt.setActionButtonEnabled(this.dialog, WhichButton.POSITIVE, true);
        }
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void checkItems(int[] iArr) {
        boolean z;
        boolean contains;
        int[] iArr2 = this.currentSelection;
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (int i : iArr) {
            if (i >= 0 && i < this.items.size()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                contains = ArraysKt___ArraysKt.contains(iArr2, i);
                if (true ^ contains) {
                    arrayList.add(Integer.valueOf(i));
                }
            } else {
                throw new IllegalStateException(("Index " + i + " is out of range for this adapter of " + this.items.size() + " items.").toString());
            }
        }
        setCurrentSelection(IntArraysKt.appendAll(this.currentSelection, arrayList));
        if (iArr2.length == 0) {
            z2 = true;
        }
        if (z2) {
            DialogActionExtKt.setActionButtonEnabled(this.dialog, WhichButton.POSITIVE, true);
        }
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

    public final Function3<MaterialDialog, int[], List<? extends CharSequence>, Unit> getSelection$core() {
        return this.selection;
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public boolean isItemChecked(int i) {
        boolean contains;
        contains = ArraysKt___ArraysKt.contains(this.currentSelection, i);
        return contains;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
        if ((r2 ^ 1) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void itemClicked$core(int i) {
        List mutableList;
        int[] intArray;
        char c;
        mutableList = ArraysKt___ArraysKt.toMutableList(this.currentSelection);
        if (mutableList.contains(Integer.valueOf(i))) {
            mutableList.remove(Integer.valueOf(i));
        } else {
            mutableList.add(Integer.valueOf(i));
        }
        intArray = CollectionsKt___CollectionsKt.toIntArray(mutableList);
        setCurrentSelection(intArray);
        boolean z = false;
        if (this.waitForActionButton && DialogActionExtKt.hasActionButtons(this.dialog)) {
            MaterialDialog materialDialog = this.dialog;
            WhichButton whichButton = WhichButton.POSITIVE;
            if (!this.allowEmptySelection) {
                if (this.currentSelection.length == 0) {
                    c = 1;
                } else {
                    c = 0;
                }
            }
            z = true;
            DialogActionExtKt.setActionButtonEnabled(materialDialog, whichButton, z);
            return;
        }
        List<? extends CharSequence> list = this.items;
        int[] iArr = this.currentSelection;
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            arrayList.add(list.get(i2));
        }
        Function3<? super MaterialDialog, ? super int[], ? super List<? extends CharSequence>, Unit> function3 = this.selection;
        if (function3 != null) {
            function3.invoke(this.dialog, this.currentSelection, arrayList);
        }
        if (this.dialog.getAutoDismissEnabled() && !DialogActionExtKt.hasActionButtons(this.dialog)) {
            this.dialog.dismiss();
        }
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void positiveButtonClicked() {
        boolean z;
        if (!this.allowEmptySelection) {
            if (this.currentSelection.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!(!z)) {
                return;
            }
        }
        List<? extends CharSequence> list = this.items;
        int[] iArr = this.currentSelection;
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            arrayList.add(list.get(i));
        }
        Function3<? super MaterialDialog, ? super int[], ? super List<? extends CharSequence>, Unit> function3 = this.selection;
        if (function3 != null) {
            function3.invoke(this.dialog, this.currentSelection, arrayList);
        }
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public /* bridge */ /* synthetic */ void replaceItems(List<? extends CharSequence> list, Function3<? super MaterialDialog, ? super int[], ? super List<? extends CharSequence>, ? extends Unit> function3) {
        replaceItems2(list, (Function3<? super MaterialDialog, ? super int[], ? super List<? extends CharSequence>, Unit>) function3);
    }

    public final void setItems$core(List<? extends CharSequence> list) {
        this.items = list;
    }

    public final void setSelection$core(Function3<? super MaterialDialog, ? super int[], ? super List<? extends CharSequence>, Unit> function3) {
        this.selection = function3;
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void toggleAllChecked() {
        boolean z;
        if (this.currentSelection.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            checkAllItems();
        } else {
            uncheckAllItems();
        }
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void toggleItems(int[] iArr) {
        List mutableList;
        int[] intArray;
        boolean contains;
        mutableList = ArraysKt___ArraysKt.toMutableList(this.currentSelection);
        boolean z = false;
        for (int i : iArr) {
            contains = ArraysKt___ArraysKt.contains(this.disabledIndices, i);
            if (!contains) {
                if (mutableList.contains(Integer.valueOf(i))) {
                    mutableList.remove(Integer.valueOf(i));
                } else {
                    mutableList.add(Integer.valueOf(i));
                }
            }
        }
        intArray = CollectionsKt___CollectionsKt.toIntArray(mutableList);
        MaterialDialog materialDialog = this.dialog;
        WhichButton whichButton = WhichButton.POSITIVE;
        boolean z2 = true;
        if (intArray.length == 0) {
            z = true;
        }
        if (z) {
            z2 = this.allowEmptySelection;
        }
        DialogActionExtKt.setActionButtonEnabled(materialDialog, whichButton, z2);
        setCurrentSelection(intArray);
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void uncheckAllItems() {
        setCurrentSelection(new int[0]);
        DialogActionExtKt.setActionButtonEnabled(this.dialog, WhichButton.POSITIVE, this.allowEmptySelection);
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void uncheckItems(int[] iArr) {
        boolean contains;
        int[] iArr2 = this.currentSelection;
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i < length) {
                int i2 = iArr[i];
                if (i2 < 0 || i2 >= this.items.size()) {
                    z2 = false;
                }
                if (z2) {
                    contains = ArraysKt___ArraysKt.contains(iArr2, i2);
                    if (contains) {
                        arrayList.add(Integer.valueOf(i2));
                    }
                    i++;
                } else {
                    throw new IllegalStateException(("Index " + i2 + " is out of range for this adapter of " + this.items.size() + " items.").toString());
                }
            } else {
                int[] removeAll = IntArraysKt.removeAll(this.currentSelection, arrayList);
                if (removeAll.length == 0) {
                    z = true;
                }
                if (z) {
                    DialogActionExtKt.setActionButtonEnabled(this.dialog, WhichButton.POSITIVE, this.allowEmptySelection);
                }
                setCurrentSelection(removeAll);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public /* bridge */ /* synthetic */ void onBindViewHolder(MultiChoiceViewHolder multiChoiceViewHolder, int i, List list) {
        onBindViewHolder2(multiChoiceViewHolder, i, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public MultiChoiceViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        MDUtil mDUtil = MDUtil.INSTANCE;
        MultiChoiceViewHolder multiChoiceViewHolder = new MultiChoiceViewHolder(mDUtil.inflate(viewGroup, this.dialog.getWindowContext(), C16848R.C16851layout.md_listitem_multichoice), this);
        MDUtil.maybeSetTextColor$default(mDUtil, multiChoiceViewHolder.getTitleView(), this.dialog.getWindowContext(), Integer.valueOf(C16848R.attr.md_color_content), null, 4, null);
        int[] resolveColors$default = ColorsKt.resolveColors$default(this.dialog, new int[]{C16848R.attr.md_color_widget, C16848R.attr.md_color_widget_unchecked}, null, 2, null);
        C48921su0.m13543d(multiChoiceViewHolder.getControlView(), mDUtil.createColorSelector(this.dialog.getWindowContext(), resolveColors$default[1], resolveColors$default[0]));
        return multiChoiceViewHolder;
    }

    /* renamed from: replaceItems  reason: avoid collision after fix types in other method */
    public void replaceItems2(List<? extends CharSequence> list, Function3<? super MaterialDialog, ? super int[], ? super List<? extends CharSequence>, Unit> function3) {
        this.items = list;
        if (function3 != null) {
            this.selection = function3;
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onBindViewHolder(MultiChoiceViewHolder multiChoiceViewHolder, int i) {
        boolean contains;
        boolean contains2;
        contains = ArraysKt___ArraysKt.contains(this.disabledIndices, i);
        multiChoiceViewHolder.setEnabled(!contains);
        AppCompatCheckBox controlView = multiChoiceViewHolder.getControlView();
        contains2 = ArraysKt___ArraysKt.contains(this.currentSelection, i);
        controlView.setChecked(contains2);
        multiChoiceViewHolder.getTitleView().setText(this.items.get(i));
        View view = multiChoiceViewHolder.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
        view.setBackground(DialogListExtKt.getItemSelector(this.dialog));
        if (this.dialog.getBodyFont() != null) {
            multiChoiceViewHolder.getTitleView().setTypeface(this.dialog.getBodyFont());
        }
    }

    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(MultiChoiceViewHolder multiChoiceViewHolder, int i, List<Object> list) {
        Object firstOrNull;
        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) list);
        if (Intrinsics.areEqual(firstOrNull, CheckPayload.INSTANCE)) {
            multiChoiceViewHolder.getControlView().setChecked(true);
        } else if (Intrinsics.areEqual(firstOrNull, UncheckPayload.INSTANCE)) {
            multiChoiceViewHolder.getControlView().setChecked(false);
        } else {
            super.onBindViewHolder((MultiChoiceDialogAdapter) multiChoiceViewHolder, i, list);
            super.onBindViewHolder((MultiChoiceDialogAdapter) multiChoiceViewHolder, i, list);
        }
    }
}
