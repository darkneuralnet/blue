package com.google.android.material.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes6.dex */
public class MaterialDividerItemDecoration extends RecyclerView.AbstractC11854o {

    /* renamed from: j */
    public static final int f72808j = C50021ul4.Widget_MaterialComponents_MaterialDivider;

    /* renamed from: b */
    public Drawable f72809b;

    /* renamed from: c */
    public int f72810c;

    /* renamed from: d */
    public int f72811d;

    /* renamed from: e */
    public int f72812e;

    /* renamed from: f */
    public int f72813f;

    /* renamed from: g */
    public int f72814g;

    /* renamed from: h */
    public boolean f72815h;

    /* renamed from: i */
    public final Rect f72816i;

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, C49961uf4.materialDividerStyle, i);
    }

    /* renamed from: f */
    public final void m49584f(Canvas canvas, RecyclerView recyclerView) {
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
        int i2 = i + this.f72813f;
        int i3 = height - this.f72814g;
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            if (m49579k(recyclerView, childAt)) {
                recyclerView.getDecoratedBoundsWithMargins(childAt, this.f72816i);
                int round = this.f72816i.right + Math.round(childAt.getTranslationX());
                this.f72809b.setBounds(round - this.f72810c, i2, round, i3);
                this.f72809b.draw(canvas);
            }
        }
        canvas.restore();
    }

    /* renamed from: g */
    public final void m49583g(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int i;
        int i2;
        int i3;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            i = 0;
        }
        boolean z = true;
        if (C38790bq6.m62548D(recyclerView) != 1) {
            z = false;
        }
        if (z) {
            i2 = this.f72814g;
        } else {
            i2 = this.f72813f;
        }
        int i4 = i + i2;
        if (z) {
            i3 = this.f72813f;
        } else {
            i3 = this.f72814g;
        }
        int i5 = width - i3;
        int childCount = recyclerView.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = recyclerView.getChildAt(i6);
            if (m49579k(recyclerView, childAt)) {
                recyclerView.getDecoratedBoundsWithMargins(childAt, this.f72816i);
                int round = this.f72816i.bottom + Math.round(childAt.getTranslationY());
                this.f72809b.setBounds(i4, round - this.f72810c, i5, round);
                this.f72809b.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C11872z c11872z) {
        rect.set(0, 0, 0, 0);
        if (m49579k(recyclerView, view)) {
            if (this.f72812e == 1) {
                rect.bottom = this.f72810c;
            } else {
                rect.right = this.f72810c;
            }
        }
    }

    /* renamed from: h */
    public void m49582h(int i) {
        this.f72811d = i;
        Drawable m90834r = P61.m90834r(this.f72809b);
        this.f72809b = m90834r;
        P61.m90838n(m90834r, i);
    }

    /* renamed from: i */
    public void m49581i(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("Invalid orientation: " + i + ". It should be either HORIZONTAL or VERTICAL");
        }
        this.f72812e = i;
    }

    /* renamed from: j */
    public boolean m49580j(int i, RecyclerView.AbstractC11843h<?> abstractC11843h) {
        return true;
    }

    /* renamed from: k */
    public final boolean m49579k(RecyclerView recyclerView, View view) {
        boolean z;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.AbstractC11843h adapter = recyclerView.getAdapter();
        if (adapter != null && childAdapterPosition == adapter.getItemCount() - 1) {
            z = true;
        } else {
            z = false;
        }
        if (childAdapterPosition == -1) {
            return false;
        }
        if ((z && !this.f72815h) || !m49580j(childAdapterPosition, adapter)) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C11872z c11872z) {
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        if (this.f72812e == 1) {
            m49583g(canvas, recyclerView);
        } else {
            m49584f(canvas, recyclerView);
        }
    }

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f72816i = new Rect();
        TypedArray m21866i = C46052o36.m21866i(context, attributeSet, C37098Xl4.MaterialDivider, i, f72808j, new int[0]);
        this.f72811d = NM2.m94029b(context, m21866i, C37098Xl4.MaterialDivider_dividerColor).getDefaultColor();
        this.f72810c = m21866i.getDimensionPixelSize(C37098Xl4.MaterialDivider_dividerThickness, context.getResources().getDimensionPixelSize(C35172Pf4.material_divider_thickness));
        this.f72813f = m21866i.getDimensionPixelOffset(C37098Xl4.MaterialDivider_dividerInsetStart, 0);
        this.f72814g = m21866i.getDimensionPixelOffset(C37098Xl4.MaterialDivider_dividerInsetEnd, 0);
        this.f72815h = m21866i.getBoolean(C37098Xl4.MaterialDivider_lastItemDecorated, true);
        m21866i.recycle();
        this.f72809b = new ShapeDrawable();
        m49582h(this.f72811d);
        m49581i(i2);
    }
}
