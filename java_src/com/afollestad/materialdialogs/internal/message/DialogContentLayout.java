package com.afollestad.materialdialogs.internal.message;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.afollestad.materialdialogs.C16848R;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.internal.list.DialogRecyclerView;
import com.afollestad.materialdialogs.internal.main.DialogLayout;
import com.afollestad.materialdialogs.internal.main.DialogScrollView;
import com.afollestad.materialdialogs.message.DialogMessageSettings;
import com.afollestad.materialdialogs.utils.MDUtil;
import com.afollestad.materialdialogs.utils.ViewsKt;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
@Metadata(m28433d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010Q\u001a\u00020P\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010R¢\u0006\u0004\bT\u0010UJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002JP\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0019\u0010\u0011\u001a\u0015\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e¢\u0006\u0002\b\u0010¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016J;\u0010\u001d\u001a\u00020\u00192\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010\u001f\u001a\u00020\u0002J\u001a\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\bJ\u001a\u0010#\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\bJ\u0018\u0010&\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\bH\u0014J0\u0010*\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010)\u001a\u00020\b2\u0006\u0010!\u001a\u00020\bH\u0014R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001b\u00107\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R$\u00109\u001a\u0004\u0018\u0001088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010@\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010F\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0016\u0010O\u001a\u0004\u0018\u00010L8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006V"}, m28432d2 = {"Lcom/afollestad/materialdialogs/internal/message/DialogContentLayout;", "Landroid/widget/FrameLayout;", "", "noVerticalPadding", "", "addContentScrollView", "Lcom/afollestad/materialdialogs/MaterialDialog;", "dialog", "", "res", "", Entry.TYPE_TEXT, "Landroid/graphics/Typeface;", "typeface", "Lkotlin/Function1;", "Lcom/afollestad/materialdialogs/message/DialogMessageSettings;", "Lkotlin/ExtensionFunctionType;", "applySettings", "setMessage", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/lang/CharSequence;Landroid/graphics/Typeface;Lkotlin/jvm/functions/Function1;)V", "Landroidx/recyclerview/widget/RecyclerView$h;", "adapter", "Landroidx/recyclerview/widget/RecyclerView$p;", "layoutManager", "addRecyclerView", "Landroid/view/View;", "view", "scrollable", "horizontalPadding", "addCustomView", "(Ljava/lang/Integer;Landroid/view/View;ZZZ)Landroid/view/View;", "haveMoreThanOneChild", "top", "bottom", "modifyFirstAndLastPadding", "modifyScrollViewPadding", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "changed", "left", "right", "onLayout", "Landroid/view/ViewGroup;", "scrollFrame", "Landroid/view/ViewGroup;", "Landroid/widget/TextView;", "messageTextView", "Landroid/widget/TextView;", "useHorizontalPadding", "Z", "frameHorizontalMargin$delegate", "Lkotlin/Lazy;", "getFrameHorizontalMargin", "()I", "frameHorizontalMargin", "Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;", "scrollView", "Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;", "getScrollView", "()Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;", "setScrollView", "(Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;)V", "Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;", "recyclerView", "Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;", "getRecyclerView", "()Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;", "setRecyclerView", "(Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;)V", "customView", "Landroid/view/View;", "getCustomView", "()Landroid/view/View;", "setCustomView", "(Landroid/view/View;)V", "Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "getRootLayout", "()Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "rootLayout", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core"}, m28431k = 1, m28430mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class DialogContentLayout extends FrameLayout {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DialogContentLayout.class), "frameHorizontalMargin", "getFrameHorizontalMargin()I"))};
    private View customView;
    private final Lazy frameHorizontalMargin$delegate;
    private TextView messageTextView;
    private DialogRecyclerView recyclerView;
    private ViewGroup scrollFrame;
    private DialogScrollView scrollView;
    private boolean useHorizontalPadding;

    public /* synthetic */ DialogContentLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final void addContentScrollView(boolean z) {
        if (this.scrollView == null) {
            DialogScrollView dialogScrollView = (DialogScrollView) ViewsKt.inflate$default(this, C16848R.C16851layout.md_dialog_stub_scrollview, (ViewGroup) null, 2, (Object) null);
            dialogScrollView.setRootView(getRootLayout());
            View childAt = dialogScrollView.getChildAt(0);
            if (childAt != null) {
                this.scrollFrame = (ViewGroup) childAt;
                if (!z) {
                    MDUtil mDUtil = MDUtil.INSTANCE;
                    MDUtil.updatePadding$default(mDUtil, dialogScrollView, 0, 0, 0, mDUtil.dimenPx(dialogScrollView, C16848R.dimen.md_dialog_frame_margin_vertical), 7, null);
                }
                this.scrollView = dialogScrollView;
                addView(dialogScrollView);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    private final int getFrameHorizontalMargin() {
        Lazy lazy = this.frameHorizontalMargin$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return ((Number) lazy.getValue()).intValue();
    }

    private final DialogLayout getRootLayout() {
        ViewParent parent = getParent();
        if (parent != null) {
            return (DialogLayout) parent;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.afollestad.materialdialogs.internal.main.DialogLayout");
    }

    public static /* synthetic */ void modifyFirstAndLastPadding$default(DialogContentLayout dialogContentLayout, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = -1;
        }
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        dialogContentLayout.modifyFirstAndLastPadding(i, i2);
    }

    public static /* synthetic */ void modifyScrollViewPadding$default(DialogContentLayout dialogContentLayout, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = -1;
        }
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        dialogContentLayout.modifyScrollViewPadding(i, i2);
    }

    public final View addCustomView(Integer num, View view, boolean z, boolean z2, boolean z3) {
        boolean z4;
        if (this.customView == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            View view2 = null;
            if (view != null && view.getParent() != null) {
                ViewParent parent = view.getParent();
                if (!(parent instanceof ViewGroup)) {
                    parent = null;
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            }
            if (z) {
                this.useHorizontalPadding = false;
                addContentScrollView(z2);
                if (view == null) {
                    if (num == null) {
                        Intrinsics.throwNpe();
                    }
                    view = (View) ViewsKt.inflate(this, num.intValue(), this.scrollFrame);
                }
                this.customView = view;
                ViewGroup viewGroup2 = this.scrollFrame;
                if (viewGroup2 == null) {
                    Intrinsics.throwNpe();
                }
                View view3 = this.customView;
                if (view3 != null) {
                    if (z3) {
                        MDUtil.updatePadding$default(MDUtil.INSTANCE, view3, getFrameHorizontalMargin(), 0, getFrameHorizontalMargin(), 0, 10, null);
                    }
                    view2 = view3;
                }
                viewGroup2.addView(view2);
            } else {
                this.useHorizontalPadding = z3;
                if (view == null) {
                    if (num == null) {
                        Intrinsics.throwNpe();
                    }
                    view = (View) ViewsKt.inflate$default(this, num.intValue(), (ViewGroup) null, 2, (Object) null);
                }
                this.customView = view;
                addView(view);
            }
            View view4 = this.customView;
            if (view4 == null) {
                Intrinsics.throwNpe();
            }
            return view4;
        }
        throw new IllegalStateException("Custom view already set.".toString());
    }

    public final void addRecyclerView(MaterialDialog materialDialog, RecyclerView.AbstractC11843h<?> abstractC11843h, RecyclerView.AbstractC11855p abstractC11855p) {
        if (this.recyclerView == null) {
            DialogRecyclerView dialogRecyclerView = (DialogRecyclerView) ViewsKt.inflate$default(this, C16848R.C16851layout.md_dialog_stub_recyclerview, (ViewGroup) null, 2, (Object) null);
            dialogRecyclerView.attach(materialDialog);
            if (abstractC11855p == null) {
                abstractC11855p = new LinearLayoutManager(materialDialog.getWindowContext());
            }
            dialogRecyclerView.setLayoutManager(abstractC11855p);
            this.recyclerView = dialogRecyclerView;
            addView(dialogRecyclerView);
        }
        DialogRecyclerView dialogRecyclerView2 = this.recyclerView;
        if (dialogRecyclerView2 != null) {
            dialogRecyclerView2.setAdapter(abstractC11843h);
        }
    }

    public final View getCustomView() {
        return this.customView;
    }

    public final DialogRecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    public final DialogScrollView getScrollView() {
        return this.scrollView;
    }

    public final boolean haveMoreThanOneChild() {
        return getChildCount() > 1;
    }

    public final void modifyFirstAndLastPadding(int i, int i2) {
        if (i != -1) {
            MDUtil.updatePadding$default(MDUtil.INSTANCE, getChildAt(0), 0, i, 0, 0, 13, null);
        }
        if (i2 != -1) {
            MDUtil.updatePadding$default(MDUtil.INSTANCE, getChildAt(getChildCount() - 1), 0, 0, 0, i2, 7, null);
        }
    }

    public final void modifyScrollViewPadding(int i, int i2) {
        View view = this.scrollView;
        if (view == null) {
            view = this.recyclerView;
        }
        if (i != -1) {
            MDUtil.updatePadding$default(MDUtil.INSTANCE, view, 0, i, 0, 0, 13, null);
        }
        if (i2 != -1) {
            MDUtil.updatePadding$default(MDUtil.INSTANCE, view, 0, 0, 0, i2, 7, null);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        int i5;
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        while (i6 < childCount) {
            View currentChild = getChildAt(i6);
            Intrinsics.checkExpressionValueIsNotNull(currentChild, "currentChild");
            int measuredHeight = currentChild.getMeasuredHeight() + i7;
            if (Intrinsics.areEqual(currentChild, this.customView) && this.useHorizontalPadding) {
                i5 = getFrameHorizontalMargin();
                measuredWidth = getMeasuredWidth() - getFrameHorizontalMargin();
            } else {
                measuredWidth = getMeasuredWidth();
                i5 = 0;
            }
            currentChild.layout(i5, i7, measuredWidth, measuredHeight);
            i6++;
            i7 = measuredHeight;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int makeMeasureSpec;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        DialogScrollView dialogScrollView = this.scrollView;
        if (dialogScrollView != null) {
            dialogScrollView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        }
        DialogScrollView dialogScrollView2 = this.scrollView;
        if (dialogScrollView2 != null) {
            i3 = dialogScrollView2.getMeasuredHeight();
        } else {
            i3 = 0;
        }
        int i4 = size2 - i3;
        int childCount = this.scrollView != null ? getChildCount() - 1 : getChildCount();
        if (childCount == 0) {
            setMeasuredDimension(size, i3);
            return;
        }
        int i5 = i4 / childCount;
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            View currentChild = getChildAt(i6);
            Intrinsics.checkExpressionValueIsNotNull(currentChild, "currentChild");
            int id = currentChild.getId();
            DialogScrollView dialogScrollView3 = this.scrollView;
            if (dialogScrollView3 == null || id != dialogScrollView3.getId()) {
                if (Intrinsics.areEqual(currentChild, this.customView) && this.useHorizontalPadding) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - (getFrameHorizontalMargin() * 2), 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                }
                currentChild.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
                i3 += currentChild.getMeasuredHeight();
            }
        }
        setMeasuredDimension(size, i3);
    }

    public final void setCustomView(View view) {
        this.customView = view;
    }

    public final void setMessage(MaterialDialog materialDialog, Integer num, CharSequence charSequence, Typeface typeface, Function1<? super DialogMessageSettings, Unit> function1) {
        addContentScrollView(false);
        if (this.messageTextView == null) {
            int i = C16848R.C16851layout.md_dialog_stub_message;
            ViewGroup viewGroup = this.scrollFrame;
            if (viewGroup == null) {
                Intrinsics.throwNpe();
            }
            TextView textView = (TextView) ViewsKt.inflate(this, i, viewGroup);
            ViewGroup viewGroup2 = this.scrollFrame;
            if (viewGroup2 == null) {
                Intrinsics.throwNpe();
            }
            viewGroup2.addView(textView);
            this.messageTextView = textView;
        }
        TextView textView2 = this.messageTextView;
        if (textView2 == null) {
            Intrinsics.throwNpe();
        }
        DialogMessageSettings dialogMessageSettings = new DialogMessageSettings(materialDialog, textView2);
        if (function1 != null) {
            function1.invoke(dialogMessageSettings);
        }
        TextView textView3 = this.messageTextView;
        if (textView3 != null) {
            if (typeface != null) {
                textView3.setTypeface(typeface);
            }
            MDUtil.maybeSetTextColor$default(MDUtil.INSTANCE, textView3, materialDialog.getWindowContext(), Integer.valueOf(C16848R.attr.md_color_content), null, 4, null);
            dialogMessageSettings.setText$core(num, charSequence);
        }
    }

    public final void setRecyclerView(DialogRecyclerView dialogRecyclerView) {
        this.recyclerView = dialogRecyclerView;
    }

    public final void setScrollView(DialogScrollView dialogScrollView) {
        this.scrollView = dialogScrollView;
    }

    public DialogContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new DialogContentLayout$frameHorizontalMargin$2(this));
        this.frameHorizontalMargin$delegate = lazy;
    }
}
