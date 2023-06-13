package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: androidx.recyclerview.widget.i */
/* loaded from: classes.dex */
public class C11915i extends RecyclerView.AbstractC11854o {

    /* renamed from: e */
    public static final int[] f55457e = {16843284};

    /* renamed from: b */
    public Drawable f55458b;

    /* renamed from: c */
    public int f55459c;

    /* renamed from: d */
    public final Rect f55460d = new Rect();

    @SuppressLint({"UnknownNullness"})
    public C11915i(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f55457e);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f55458b = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        m66248h(i);
    }

    /* renamed from: f */
    public final void m66250f(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int i;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.getLayoutManager().m66585j0(childAt, this.f55460d);
            int round = this.f55460d.right + Math.round(childAt.getTranslationX());
            this.f55458b.setBounds(round - this.f55458b.getIntrinsicWidth(), i, round, height);
            this.f55458b.draw(canvas);
        }
        canvas.restore();
    }

    /* renamed from: g */
    public final void m66249g(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int i;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            i = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.getDecoratedBoundsWithMargins(childAt, this.f55460d);
            int round = this.f55460d.bottom + Math.round(childAt.getTranslationY());
            this.f55458b.setBounds(i, round - this.f55458b.getIntrinsicHeight(), width, round);
            this.f55458b.draw(canvas);
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    @SuppressLint({"UnknownNullness"})
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C11872z c11872z) {
        Drawable drawable = this.f55458b;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f55459c == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    /* renamed from: h */
    public void m66248h(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.f55459c = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    @SuppressLint({"UnknownNullness"})
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C11872z c11872z) {
        if (recyclerView.getLayoutManager() != null && this.f55458b != null) {
            if (this.f55459c == 1) {
                m66249g(canvas, recyclerView);
            } else {
                m66250f(canvas, recyclerView);
            }
        }
    }
}
