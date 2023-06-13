package com.afollestad.materialdialogs.internal.list;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.utils.MDUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000I\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u000eJ\b\u0010\u0017\u001a\u00020\u000eH\u0002J\b\u0010\u0018\u001a\u00020\tH\u0002J\b\u0010\u0019\u001a\u00020\tH\u0002J\b\u0010\u001a\u001a\u00020\tH\u0002J\b\u0010\u001b\u001a\u00020\u000eH\u0014J\b\u0010\u001c\u001a\u00020\u000eH\u0014J(\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001fH\u0014RF\u0010\u0007\u001a:\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\bj\u0004\u0018\u0001`\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012¨\u0006#"}, m28432d2 = {"Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "invalidateDividersDelegate", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "scrolledDown", "atBottom", "", "Lcom/afollestad/materialdialogs/internal/list/InvalidateDividersDelegate;", "scrollListeners", "com/afollestad/materialdialogs/internal/list/DialogRecyclerView$scrollListeners$1", "Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView$scrollListeners$1;", "attach", "dialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invalidateDividers", "invalidateOverScroll", "isAtBottom", "isAtTop", "isScrollable", "onAttachedToWindow", "onDetachedFromWindow", "onScrollChanged", "left", "", "top", "oldl", "oldt", "core"}, m28431k = 1, m28430mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class DialogRecyclerView extends RecyclerView {
    private Function2<? super Boolean, ? super Boolean, Unit> invalidateDividersDelegate;
    private final DialogRecyclerView$scrollListeners$1 scrollListeners;

    public /* synthetic */ DialogRecyclerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateOverScroll() {
        int i = 2;
        if (getChildCount() != 0 && getMeasuredHeight() != 0 && !isScrollable()) {
            i = 1;
        }
        setOverScrollMode(i);
    }

    private final boolean isAtBottom() {
        RecyclerView.AbstractC11843h adapter = getAdapter();
        if (adapter == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(adapter, "adapter!!");
        int itemCount = adapter.getItemCount() - 1;
        RecyclerView.AbstractC11855p layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) layoutManager).m66706s2() == itemCount) {
                return true;
            }
        } else if ((layoutManager instanceof GridLayoutManager) && ((GridLayoutManager) layoutManager).m66706s2() == itemCount) {
            return true;
        }
        return false;
    }

    private final boolean isAtTop() {
        RecyclerView.AbstractC11855p layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) layoutManager).m66711n2() == 0) {
                return true;
            }
        } else if ((layoutManager instanceof GridLayoutManager) && ((GridLayoutManager) layoutManager).m66711n2() == 0) {
            return true;
        }
        return false;
    }

    private final boolean isScrollable() {
        return isAtBottom() && isAtTop();
    }

    public final void attach(MaterialDialog materialDialog) {
        this.invalidateDividersDelegate = new DialogRecyclerView$attach$1(materialDialog);
    }

    public final void invalidateDividers() {
        Function2<? super Boolean, ? super Boolean, Unit> function2;
        if (getChildCount() != 0 && getMeasuredHeight() != 0 && (function2 = this.invalidateDividersDelegate) != null) {
            function2.invoke(Boolean.valueOf(!isAtTop()), Boolean.valueOf(!isAtBottom()));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MDUtil.INSTANCE.waitForWidth(this, DialogRecyclerView$onAttachedToWindow$1.INSTANCE);
        addOnScrollListener(this.scrollListeners);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeOnScrollListener(this.scrollListeners);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        invalidateDividers();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.afollestad.materialdialogs.internal.list.DialogRecyclerView$scrollListeners$1] */
    public DialogRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.scrollListeners = new RecyclerView.AbstractC11863t() { // from class: com.afollestad.materialdialogs.internal.list.DialogRecyclerView$scrollListeners$1
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11863t
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                DialogRecyclerView.this.invalidateDividers();
            }
        };
    }
}