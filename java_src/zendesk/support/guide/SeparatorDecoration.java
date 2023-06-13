package zendesk.support.guide;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import zendesk.support.guide.HelpRecyclerViewAdapter;
/* loaded from: classes8.dex */
class SeparatorDecoration extends RecyclerView.AbstractC11854o {
    private Drawable divider;

    public SeparatorDecoration(Drawable drawable) {
        this.divider = drawable;
    }

    private boolean isItemACategory(RecyclerView.AbstractC11834D abstractC11834D) {
        return abstractC11834D instanceof HelpRecyclerViewAdapter.CategoryViewHolder;
    }

    private boolean isItemAnExpandedCategory(RecyclerView.AbstractC11834D abstractC11834D) {
        if ((abstractC11834D instanceof HelpRecyclerViewAdapter.CategoryViewHolder) && ((HelpRecyclerViewAdapter.CategoryViewHolder) abstractC11834D).isExpanded()) {
            return true;
        }
        return false;
    }

    private boolean isItemAnUnexpandedCategory(RecyclerView.AbstractC11834D abstractC11834D) {
        if ((abstractC11834D instanceof HelpRecyclerViewAdapter.CategoryViewHolder) && !((HelpRecyclerViewAdapter.CategoryViewHolder) abstractC11834D).isExpanded()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C11872z c11872z) {
        super.onDraw(canvas, recyclerView, c11872z);
        if (recyclerView.getItemAnimator() != null && recyclerView.getItemAnimator().isRunning()) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (shouldShowTopSeparator(recyclerView, i)) {
                int paddingLeft = recyclerView.getPaddingLeft();
                int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                int top = childAt.getTop() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).topMargin;
                this.divider.setBounds(paddingLeft, top, width, this.divider.getIntrinsicHeight() + top);
                this.divider.draw(canvas);
            }
        }
    }

    public boolean shouldShowTopSeparator(RecyclerView recyclerView, int i) {
        boolean z;
        boolean isItemACategory = isItemACategory(recyclerView.getChildViewHolder(recyclerView.getChildAt(i)));
        boolean isItemAnExpandedCategory = isItemAnExpandedCategory(recyclerView.getChildViewHolder(recyclerView.getChildAt(i)));
        if (i > 0 && isItemAnUnexpandedCategory(recyclerView.getChildViewHolder(recyclerView.getChildAt(i - 1)))) {
            z = true;
        } else {
            z = false;
        }
        if (!isItemACategory) {
            return false;
        }
        if (!isItemAnExpandedCategory && z) {
            return false;
        }
        return true;
    }
}
