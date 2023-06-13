package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.C17466a;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.List;
/* renamed from: Wr1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C36915Wr1 extends RecyclerView.AbstractC11854o {

    /* renamed from: d */
    public static final int[] f42198d = {16843284};

    /* renamed from: b */
    public Drawable f42199b;

    /* renamed from: c */
    public int f42200c;

    public C36915Wr1(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f42198d);
        this.f42199b = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        m77795n(3);
    }

    /* renamed from: f */
    public final void m77803f(Canvas canvas, RecyclerView recyclerView) {
        int top;
        int intrinsicHeight;
        int left;
        int right;
        int i;
        int i2;
        int i3;
        if (!m77800i()) {
            return;
        }
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
        int mo51833c = flexboxLayoutManager.mo51833c();
        int left2 = recyclerView.getLeft() - recyclerView.getPaddingLeft();
        int right2 = recyclerView.getRight() + recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
            if (mo51833c == 3) {
                intrinsicHeight = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                top = this.f42199b.getIntrinsicHeight() + intrinsicHeight;
            } else {
                top = childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                intrinsicHeight = top - this.f42199b.getIntrinsicHeight();
            }
            if (flexboxLayoutManager.mo51785u()) {
                if (flexboxLayoutManager.m51862N2()) {
                    i2 = Math.min(childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + this.f42199b.getIntrinsicWidth(), right2);
                    i3 = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    this.f42199b.setBounds(i3, intrinsicHeight, i2, top);
                    this.f42199b.draw(canvas);
                } else {
                    left = Math.max((childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f42199b.getIntrinsicWidth(), left2);
                    right = childAt.getRight();
                    i = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                }
            } else {
                left = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                right = childAt.getRight();
                i = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            }
            int i5 = left;
            i2 = right + i;
            i3 = i5;
            this.f42199b.setBounds(i3, intrinsicHeight, i2, top);
            this.f42199b.draw(canvas);
        }
    }

    /* renamed from: g */
    public final void m77802g(Canvas canvas, RecyclerView recyclerView) {
        int left;
        int intrinsicWidth;
        int max;
        int bottom;
        int i;
        int i2;
        if (!m77799j()) {
            return;
        }
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
        int top = recyclerView.getTop() - recyclerView.getPaddingTop();
        int bottom2 = recyclerView.getBottom() + recyclerView.getPaddingBottom();
        int childCount = recyclerView.getChildCount();
        int mo51833c = flexboxLayoutManager.mo51833c();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
            if (flexboxLayoutManager.m51862N2()) {
                intrinsicWidth = childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                left = this.f42199b.getIntrinsicWidth() + intrinsicWidth;
            } else {
                left = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                intrinsicWidth = left - this.f42199b.getIntrinsicWidth();
            }
            if (flexboxLayoutManager.mo51785u()) {
                max = childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                bottom = childAt.getBottom();
                i = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            } else if (mo51833c == 3) {
                int min = Math.min(childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + this.f42199b.getIntrinsicHeight(), bottom2);
                max = childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                i2 = min;
                this.f42199b.setBounds(intrinsicWidth, max, left, i2);
                this.f42199b.draw(canvas);
            } else {
                max = Math.max((childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f42199b.getIntrinsicHeight(), top);
                bottom = childAt.getBottom();
                i = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            }
            i2 = bottom + i;
            this.f42199b.setBounds(intrinsicWidth, max, left, i2);
            this.f42199b.draw(canvas);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C11872z c11872z) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            return;
        }
        if (!m77800i() && !m77799j()) {
            rect.set(0, 0, 0, 0);
            return;
        }
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
        List<C17466a> m51871J2 = flexboxLayoutManager.m51871J2();
        m77796m(rect, childAdapterPosition, flexboxLayoutManager, m51871J2, flexboxLayoutManager.mo51833c());
        m77797l(rect, childAdapterPosition, flexboxLayoutManager, m51871J2);
    }

    /* renamed from: h */
    public final boolean m77801h(int i, List<C17466a> list, FlexboxLayoutManager flexboxLayoutManager) {
        int m51869K2 = flexboxLayoutManager.m51869K2(i);
        if ((m51869K2 != -1 && m51869K2 < flexboxLayoutManager.mo51826f().size() && flexboxLayoutManager.mo51826f().get(m51869K2).f70273o == i) || i == 0) {
            return true;
        }
        if (list.size() != 0 && list.get(list.size() - 1).f70274p == i - 1) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m77800i() {
        return (this.f42200c & 1) > 0;
    }

    /* renamed from: j */
    public final boolean m77799j() {
        return (this.f42200c & 2) > 0;
    }

    /* renamed from: k */
    public void m77798k(Drawable drawable) {
        if (drawable != null) {
            this.f42199b = drawable;
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    /* renamed from: l */
    public final void m77797l(Rect rect, int i, FlexboxLayoutManager flexboxLayoutManager, List<C17466a> list) {
        if (list.size() == 0 || flexboxLayoutManager.m51869K2(i) == 0) {
            return;
        }
        if (flexboxLayoutManager.mo51785u()) {
            if (!m77800i()) {
                rect.top = 0;
                rect.bottom = 0;
                return;
            }
            rect.top = this.f42199b.getIntrinsicHeight();
            rect.bottom = 0;
        } else if (!m77799j()) {
        } else {
            if (flexboxLayoutManager.m51862N2()) {
                rect.right = this.f42199b.getIntrinsicWidth();
                rect.left = 0;
                return;
            }
            rect.left = this.f42199b.getIntrinsicWidth();
            rect.right = 0;
        }
    }

    /* renamed from: m */
    public final void m77796m(Rect rect, int i, FlexboxLayoutManager flexboxLayoutManager, List<C17466a> list, int i2) {
        if (m77801h(i, list, flexboxLayoutManager)) {
            return;
        }
        if (flexboxLayoutManager.mo51785u()) {
            if (!m77799j()) {
                rect.left = 0;
                rect.right = 0;
            } else if (flexboxLayoutManager.m51862N2()) {
                rect.right = this.f42199b.getIntrinsicWidth();
                rect.left = 0;
            } else {
                rect.left = this.f42199b.getIntrinsicWidth();
                rect.right = 0;
            }
        } else if (!m77800i()) {
            rect.top = 0;
            rect.bottom = 0;
        } else if (i2 == 3) {
            rect.bottom = this.f42199b.getIntrinsicHeight();
            rect.top = 0;
        } else {
            rect.top = this.f42199b.getIntrinsicHeight();
            rect.bottom = 0;
        }
    }

    /* renamed from: n */
    public void m77795n(int i) {
        this.f42200c = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C11872z c11872z) {
        m77803f(canvas, recyclerView);
        m77802g(canvas, recyclerView);
    }
}
