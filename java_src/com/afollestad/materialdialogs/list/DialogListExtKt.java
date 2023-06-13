package com.afollestad.materialdialogs.list;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.C16848R;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.internal.list.DialogRecyclerView;
import com.afollestad.materialdialogs.internal.list.PlainListDialogAdapter;
import com.afollestad.materialdialogs.utils.ColorsKt;
import com.afollestad.materialdialogs.utils.MDUtil;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\u0012\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003*\u00020\u0000H\u0007\u001a\"\u0010\b\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u001a\u009c\u0001\u0010\u001b\u001a\u00020\u0000*\u00020\u00002\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102S\b\u0002\u0010\u001a\u001aM\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0012j\u0002`\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0090\u0001\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2S\b\u0002\u0010\u001a\u001aM\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0012j\u0002`\u0019¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u000e\u0010 \u001a\u0004\u0018\u00010\u001f*\u00020\u0000H\u0007¨\u0006!"}, m28432d2 = {"Lcom/afollestad/materialdialogs/MaterialDialog;", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "Landroidx/recyclerview/widget/RecyclerView$h;", "getListAdapter", "adapter", "Landroidx/recyclerview/widget/RecyclerView$p;", "layoutManager", "customListAdapter", "", "res", "", "", "items", "", "disabledIndices", "", "waitForPositiveButton", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "dialog", "index", Entry.TYPE_TEXT, "", "Lcom/afollestad/materialdialogs/list/ItemListener;", BaseSheetViewModel.SAVE_SELECTION, "listItems", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/util/List;[IZLkotlin/jvm/functions/Function3;)Lcom/afollestad/materialdialogs/MaterialDialog;", "updateListItems", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/util/List;[ILkotlin/jvm/functions/Function3;)Lcom/afollestad/materialdialogs/MaterialDialog;", "Landroid/graphics/drawable/Drawable;", "getItemSelector", "core"}, m28431k = 2, m28430mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class DialogListExtKt {
    public static final MaterialDialog customListAdapter(MaterialDialog materialDialog, RecyclerView.AbstractC11843h<?> abstractC11843h, RecyclerView.AbstractC11855p abstractC11855p) {
        materialDialog.getView().getContentLayout().addRecyclerView(materialDialog, abstractC11843h, abstractC11855p);
        return materialDialog;
    }

    public static /* synthetic */ MaterialDialog customListAdapter$default(MaterialDialog materialDialog, RecyclerView.AbstractC11843h abstractC11843h, RecyclerView.AbstractC11855p abstractC11855p, int i, Object obj) {
        if ((i & 2) != 0) {
            abstractC11855p = null;
        }
        return customListAdapter(materialDialog, abstractC11843h, abstractC11855p);
    }

    public static final Drawable getItemSelector(MaterialDialog materialDialog) {
        int resolveColor$default;
        MDUtil mDUtil = MDUtil.INSTANCE;
        Context context = materialDialog.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        Drawable resolveDrawable$default = MDUtil.resolveDrawable$default(mDUtil, context, null, Integer.valueOf(C16848R.attr.md_item_selector), null, 10, null);
        if ((resolveDrawable$default instanceof RippleDrawable) && (resolveColor$default = ColorsKt.resolveColor$default(materialDialog, null, Integer.valueOf(C16848R.attr.md_ripple_color), null, 5, null)) != 0) {
            ((RippleDrawable) resolveDrawable$default).setColor(ColorStateList.valueOf(resolveColor$default));
        }
        return resolveDrawable$default;
    }

    public static final RecyclerView.AbstractC11843h<?> getListAdapter(MaterialDialog materialDialog) {
        DialogRecyclerView recyclerView = materialDialog.getView().getContentLayout().getRecyclerView();
        if (recyclerView != null) {
            return recyclerView.getAdapter();
        }
        return null;
    }

    public static final RecyclerView getRecyclerView(MaterialDialog materialDialog) {
        DialogRecyclerView recyclerView = materialDialog.getView().getContentLayout().getRecyclerView();
        if (recyclerView != null) {
            return recyclerView;
        }
        throw new IllegalStateException("This dialog is not a list dialog.");
    }

    public static final MaterialDialog listItems(MaterialDialog materialDialog, Integer num, List<? extends CharSequence> list, int[] iArr, boolean z, Function3<? super MaterialDialog, ? super Integer, ? super CharSequence, Unit> function3) {
        List<? extends CharSequence> list2;
        List<? extends CharSequence> list3;
        MDUtil mDUtil = MDUtil.INSTANCE;
        mDUtil.assertOneSet("listItems", list, num);
        if (list == null) {
            list2 = ArraysKt___ArraysKt.toList(mDUtil.getStringArray(materialDialog.getWindowContext(), num));
            list3 = list2;
        } else {
            list3 = list;
        }
        if (getListAdapter(materialDialog) != null) {
            Log.w("MaterialDialogs", "Prefer calling updateListItems(...) over listItems(...) again.");
            return updateListItems(materialDialog, num, list, iArr, function3);
        }
        return customListAdapter$default(materialDialog, new PlainListDialogAdapter(materialDialog, list3, iArr, z, function3), null, 2, null);
    }

    public static /* synthetic */ MaterialDialog listItems$default(MaterialDialog materialDialog, Integer num, List list, int[] iArr, boolean z, Function3 function3, int i, Object obj) {
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
            z = true;
        }
        if ((i & 16) != 0) {
            function3 = null;
        }
        return listItems(materialDialog, num, list, iArr, z, function3);
    }

    public static final MaterialDialog updateListItems(MaterialDialog materialDialog, Integer num, List<? extends CharSequence> list, int[] iArr, Function3<? super MaterialDialog, ? super Integer, ? super CharSequence, Unit> function3) {
        MDUtil mDUtil = MDUtil.INSTANCE;
        mDUtil.assertOneSet("updateListItems", list, num);
        if (list == null) {
            list = ArraysKt___ArraysKt.toList(mDUtil.getStringArray(materialDialog.getWindowContext(), num));
        }
        RecyclerView.AbstractC11843h<?> listAdapter = getListAdapter(materialDialog);
        if (listAdapter instanceof PlainListDialogAdapter) {
            PlainListDialogAdapter plainListDialogAdapter = (PlainListDialogAdapter) listAdapter;
            plainListDialogAdapter.replaceItems2(list, function3);
            if (iArr != null) {
                plainListDialogAdapter.disableItems(iArr);
            }
            return materialDialog;
        }
        throw new IllegalStateException("updateListItems(...) can't be used before you've created a plain list dialog.".toString());
    }

    public static /* synthetic */ MaterialDialog updateListItems$default(MaterialDialog materialDialog, Integer num, List list, int[] iArr, Function3 function3, int i, Object obj) {
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
        return updateListItems(materialDialog, num, list, iArr, function3);
    }
}
