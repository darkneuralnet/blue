package com.afollestad.materialdialogs.list;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.WhichButton;
import com.afollestad.materialdialogs.actions.DialogActionExtKt;
import com.afollestad.materialdialogs.internal.list.DialogAdapter;
import com.afollestad.materialdialogs.internal.list.SingleChoiceDialogAdapter;
import com.afollestad.materialdialogs.utils.MDUtil;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function3;
@Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a¤\u0001\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00062S\b\u0002\u0010\u0010\u001aM\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011j\u0002`\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a\u0012\u0010\u0018\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0019\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u008e\u0001\u0010\u001a\u001a\u00020\u0002*\u00020\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2S\b\u0002\u0010\u0010\u001aM\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011j\u0002`\u0016¢\u0006\u0002\u0010\u001b¨\u0006\u001c"}, m28432d2 = {"checkItem", "", "Lcom/afollestad/materialdialogs/MaterialDialog;", "index", "", "isItemChecked", "", "listItemsSingleChoice", "res", "items", "", "", "disabledIndices", "", "initialSelection", "waitForPositiveButton", BaseSheetViewModel.SAVE_SELECTION, "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "dialog", Entry.TYPE_TEXT, "Lcom/afollestad/materialdialogs/list/SingleChoiceListener;", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/util/List;[IIZLkotlin/jvm/functions/Function3;)Lcom/afollestad/materialdialogs/MaterialDialog;", "toggleItemChecked", "uncheckItem", "updateListItemsSingleChoice", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/util/List;[ILkotlin/jvm/functions/Function3;)Lcom/afollestad/materialdialogs/MaterialDialog;", "core"}, m28431k = 2, m28430mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class DialogSingleChoiceExtKt {
    public static final void checkItem(MaterialDialog materialDialog, int i) {
        String str;
        RecyclerView.AbstractC11843h<?> listAdapter = DialogListExtKt.getListAdapter(materialDialog);
        if (listAdapter instanceof DialogAdapter) {
            ((DialogAdapter) listAdapter).checkItems(new int[]{i});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't check item on adapter: ");
        if (listAdapter != null) {
            str = listAdapter.getClass().getName();
        } else {
            str = "null";
        }
        sb.append(str);
        throw new UnsupportedOperationException(sb.toString());
    }

    public static final boolean isItemChecked(MaterialDialog materialDialog, int i) {
        String str;
        RecyclerView.AbstractC11843h<?> listAdapter = DialogListExtKt.getListAdapter(materialDialog);
        if (listAdapter instanceof DialogAdapter) {
            return ((DialogAdapter) listAdapter).isItemChecked(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't check if item is checked on adapter: ");
        if (listAdapter != null) {
            str = listAdapter.getClass().getName();
        } else {
            str = "null";
        }
        sb.append(str);
        throw new UnsupportedOperationException(sb.toString());
    }

    public static final MaterialDialog listItemsSingleChoice(MaterialDialog materialDialog, Integer num, List<? extends CharSequence> list, int[] iArr, int i, boolean z, Function3<? super MaterialDialog, ? super Integer, ? super CharSequence, Unit> function3) {
        List<? extends CharSequence> list2;
        List<? extends CharSequence> list3;
        boolean z2;
        MDUtil mDUtil = MDUtil.INSTANCE;
        mDUtil.assertOneSet("listItemsSingleChoice", list, num);
        if (list == null) {
            list2 = ArraysKt___ArraysKt.toList(mDUtil.getStringArray(materialDialog.getWindowContext(), num));
            list3 = list2;
        } else {
            list3 = list;
        }
        boolean z3 = false;
        if (i < -1 && i >= list3.size()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            if (DialogListExtKt.getListAdapter(materialDialog) != null) {
                Log.w("MaterialDialogs", "Prefer calling updateListItemsSingleChoice(...) over listItemsSingleChoice(...) again.");
                return updateListItemsSingleChoice(materialDialog, num, list, iArr, function3);
            }
            WhichButton whichButton = WhichButton.POSITIVE;
            if (i > -1) {
                z3 = true;
            }
            DialogActionExtKt.setActionButtonEnabled(materialDialog, whichButton, z3);
            return DialogListExtKt.customListAdapter$default(materialDialog, new SingleChoiceDialogAdapter(materialDialog, list3, iArr, i, z, function3), null, 2, null);
        }
        throw new IllegalArgumentException(("Initial selection " + i + " must be between -1 and the size of your items array " + list3.size()).toString());
    }

    public static /* synthetic */ MaterialDialog listItemsSingleChoice$default(MaterialDialog materialDialog, Integer num, List list, int[] iArr, int i, boolean z, Function3 function3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = null;
        }
        if ((i2 & 2) != 0) {
            list = null;
        }
        if ((i2 & 4) != 0) {
            iArr = null;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            z = true;
        }
        if ((i2 & 32) != 0) {
            function3 = null;
        }
        return listItemsSingleChoice(materialDialog, num, list, iArr, i, z, function3);
    }

    public static final void toggleItemChecked(MaterialDialog materialDialog, int i) {
        String str;
        RecyclerView.AbstractC11843h<?> listAdapter = DialogListExtKt.getListAdapter(materialDialog);
        if (listAdapter instanceof DialogAdapter) {
            ((DialogAdapter) listAdapter).toggleItems(new int[]{i});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't toggle checked item on adapter: ");
        if (listAdapter != null) {
            str = listAdapter.getClass().getName();
        } else {
            str = "null";
        }
        sb.append(str);
        throw new UnsupportedOperationException(sb.toString());
    }

    public static final void uncheckItem(MaterialDialog materialDialog, int i) {
        String str;
        RecyclerView.AbstractC11843h<?> listAdapter = DialogListExtKt.getListAdapter(materialDialog);
        if (listAdapter instanceof DialogAdapter) {
            ((DialogAdapter) listAdapter).uncheckItems(new int[]{i});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't uncheck item on adapter: ");
        if (listAdapter != null) {
            str = listAdapter.getClass().getName();
        } else {
            str = "null";
        }
        sb.append(str);
        throw new UnsupportedOperationException(sb.toString());
    }

    public static final MaterialDialog updateListItemsSingleChoice(MaterialDialog materialDialog, Integer num, List<? extends CharSequence> list, int[] iArr, Function3<? super MaterialDialog, ? super Integer, ? super CharSequence, Unit> function3) {
        MDUtil mDUtil = MDUtil.INSTANCE;
        mDUtil.assertOneSet("updateListItemsSingleChoice", list, num);
        if (list == null) {
            list = ArraysKt___ArraysKt.toList(mDUtil.getStringArray(materialDialog.getWindowContext(), num));
        }
        RecyclerView.AbstractC11843h<?> listAdapter = DialogListExtKt.getListAdapter(materialDialog);
        if (listAdapter instanceof SingleChoiceDialogAdapter) {
            SingleChoiceDialogAdapter singleChoiceDialogAdapter = (SingleChoiceDialogAdapter) listAdapter;
            singleChoiceDialogAdapter.replaceItems2(list, function3);
            if (iArr != null) {
                singleChoiceDialogAdapter.disableItems(iArr);
            }
            return materialDialog;
        }
        throw new IllegalStateException("updateListItemsSingleChoice(...) can't be used before you've created a single choice list dialog.".toString());
    }

    public static /* synthetic */ MaterialDialog updateListItemsSingleChoice$default(MaterialDialog materialDialog, Integer num, List list, int[] iArr, Function3 function3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            iArr = null;
        }
        if ((i & 8) != 0) {
            function3 = null;
        }
        return updateListItemsSingleChoice(materialDialog, num, list, iArr, function3);
    }
}
