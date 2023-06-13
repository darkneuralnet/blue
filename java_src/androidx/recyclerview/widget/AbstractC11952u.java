package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: androidx.recyclerview.widget.u */
/* loaded from: classes.dex */
public abstract class AbstractC11952u extends RecyclerView.AbstractC11849m {
    private static final boolean DEBUG = false;
    private static final String TAG = "SimpleItemAnimator";
    boolean mSupportsChangeAnimations = true;

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateAdd(RecyclerView.AbstractC11834D abstractC11834D);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11849m
    public boolean animateAppearance(RecyclerView.AbstractC11834D abstractC11834D, RecyclerView.AbstractC11849m.C11852c c11852c, RecyclerView.AbstractC11849m.C11852c c11852c2) {
        int i;
        int i2;
        if (c11852c != null && ((i = c11852c.f55224a) != (i2 = c11852c2.f55224a) || c11852c.f55225b != c11852c2.f55225b)) {
            return animateMove(abstractC11834D, i, c11852c.f55225b, i2, c11852c2.f55225b);
        }
        return animateAdd(abstractC11834D);
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateChange(RecyclerView.AbstractC11834D abstractC11834D, RecyclerView.AbstractC11834D abstractC11834D2, int i, int i2, int i3, int i4);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11849m
    public boolean animateChange(RecyclerView.AbstractC11834D abstractC11834D, RecyclerView.AbstractC11834D abstractC11834D2, RecyclerView.AbstractC11849m.C11852c c11852c, RecyclerView.AbstractC11849m.C11852c c11852c2) {
        int i;
        int i2;
        int i3 = c11852c.f55224a;
        int i4 = c11852c.f55225b;
        if (abstractC11834D2.shouldIgnore()) {
            int i5 = c11852c.f55224a;
            i2 = c11852c.f55225b;
            i = i5;
        } else {
            i = c11852c2.f55224a;
            i2 = c11852c2.f55225b;
        }
        return animateChange(abstractC11834D, abstractC11834D2, i3, i4, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11849m
    public boolean animateDisappearance(RecyclerView.AbstractC11834D abstractC11834D, RecyclerView.AbstractC11849m.C11852c c11852c, RecyclerView.AbstractC11849m.C11852c c11852c2) {
        int i;
        int i2;
        int i3 = c11852c.f55224a;
        int i4 = c11852c.f55225b;
        View view = abstractC11834D.itemView;
        if (c11852c2 == null) {
            i = view.getLeft();
        } else {
            i = c11852c2.f55224a;
        }
        int i5 = i;
        if (c11852c2 == null) {
            i2 = view.getTop();
        } else {
            i2 = c11852c2.f55225b;
        }
        int i6 = i2;
        if (!abstractC11834D.isRemoved() && (i3 != i5 || i4 != i6)) {
            view.layout(i5, i6, view.getWidth() + i5, view.getHeight() + i6);
            return animateMove(abstractC11834D, i3, i4, i5, i6);
        }
        return animateRemove(abstractC11834D);
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateMove(RecyclerView.AbstractC11834D abstractC11834D, int i, int i2, int i3, int i4);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11849m
    public boolean animatePersistence(RecyclerView.AbstractC11834D abstractC11834D, RecyclerView.AbstractC11849m.C11852c c11852c, RecyclerView.AbstractC11849m.C11852c c11852c2) {
        int i = c11852c.f55224a;
        int i2 = c11852c2.f55224a;
        if (i == i2 && c11852c.f55225b == c11852c2.f55225b) {
            dispatchMoveFinished(abstractC11834D);
            return false;
        }
        return animateMove(abstractC11834D, i, c11852c.f55225b, i2, c11852c2.f55225b);
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateRemove(RecyclerView.AbstractC11834D abstractC11834D);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11849m
    public boolean canReuseUpdatedViewHolder(RecyclerView.AbstractC11834D abstractC11834D) {
        return !this.mSupportsChangeAnimations || abstractC11834D.isInvalid();
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchAddFinished(RecyclerView.AbstractC11834D abstractC11834D) {
        onAddFinished(abstractC11834D);
        dispatchAnimationFinished(abstractC11834D);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchAddStarting(RecyclerView.AbstractC11834D abstractC11834D) {
        onAddStarting(abstractC11834D);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchChangeFinished(RecyclerView.AbstractC11834D abstractC11834D, boolean z) {
        onChangeFinished(abstractC11834D, z);
        dispatchAnimationFinished(abstractC11834D);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchChangeStarting(RecyclerView.AbstractC11834D abstractC11834D, boolean z) {
        onChangeStarting(abstractC11834D, z);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchMoveFinished(RecyclerView.AbstractC11834D abstractC11834D) {
        onMoveFinished(abstractC11834D);
        dispatchAnimationFinished(abstractC11834D);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchMoveStarting(RecyclerView.AbstractC11834D abstractC11834D) {
        onMoveStarting(abstractC11834D);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchRemoveFinished(RecyclerView.AbstractC11834D abstractC11834D) {
        onRemoveFinished(abstractC11834D);
        dispatchAnimationFinished(abstractC11834D);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchRemoveStarting(RecyclerView.AbstractC11834D abstractC11834D) {
        onRemoveStarting(abstractC11834D);
    }

    public boolean getSupportsChangeAnimations() {
        return this.mSupportsChangeAnimations;
    }

    @SuppressLint({"UnknownNullness"})
    public void onAddFinished(RecyclerView.AbstractC11834D abstractC11834D) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onAddStarting(RecyclerView.AbstractC11834D abstractC11834D) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onChangeFinished(RecyclerView.AbstractC11834D abstractC11834D, boolean z) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onChangeStarting(RecyclerView.AbstractC11834D abstractC11834D, boolean z) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onMoveFinished(RecyclerView.AbstractC11834D abstractC11834D) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onMoveStarting(RecyclerView.AbstractC11834D abstractC11834D) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onRemoveFinished(RecyclerView.AbstractC11834D abstractC11834D) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onRemoveStarting(RecyclerView.AbstractC11834D abstractC11834D) {
    }

    public void setSupportsChangeAnimations(boolean z) {
        this.mSupportsChangeAnimations = z;
    }
}
