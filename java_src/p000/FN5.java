package p000;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
/* renamed from: FN5 */
/* loaded from: classes4.dex */
public class FN5 extends RecyclerView.AbstractC11854o {

    /* renamed from: b */
    public int f9266b = -1;

    /* renamed from: c */
    public int f9267c = -1;

    /* renamed from: d */
    public final int f9268d;

    /* renamed from: e */
    public final int f9269e;

    public FN5(Context context, int i) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        this.f9268d = dimensionPixelSize;
        this.f9269e = dimensionPixelSize / 2;
    }

    /* renamed from: f */
    public int m107273f(RecyclerView recyclerView, int i) {
        RecyclerView.AbstractC11855p layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).m66765s3().mo66752e(i, this.f9267c);
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            return i % this.f9267c;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            return 0;
        }
        return -1;
    }

    /* renamed from: g */
    public int m107272g(RecyclerView recyclerView, int i) {
        RecyclerView.AbstractC11855p layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).m66765s3().mo56202f(i);
        }
        if ((layoutManager instanceof StaggeredGridLayoutManager) || (layoutManager instanceof LinearLayoutManager)) {
            return 1;
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C11872z c11872z) {
        super.getItemOffsets(rect, view, recyclerView, c11872z);
        if (this.f9266b == -1) {
            this.f9266b = m107271h(recyclerView);
        }
        if (this.f9267c == -1) {
            this.f9267c = m107270i(recyclerView);
        }
        int m66574s0 = recyclerView.getLayoutManager().m66574s0();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int m107272g = m107272g(recyclerView, childAdapterPosition);
        int m107273f = m107273f(recyclerView, childAdapterPosition);
        if (this.f9267c < 1) {
            return;
        }
        m107263p(rect, recyclerView, m66574s0, childAdapterPosition, m107272g, m107273f);
    }

    /* renamed from: h */
    public int m107271h(RecyclerView recyclerView) {
        RecyclerView.AbstractC11855p layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).m66744F2();
        }
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).m66744F2();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) layoutManager).m66474I2();
        }
        return 1;
    }

    /* renamed from: i */
    public int m107270i(RecyclerView recyclerView) {
        RecyclerView.AbstractC11855p layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).m66769o3();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) layoutManager).m66473J2();
        }
        if (layoutManager instanceof LinearLayoutManager) {
            return 1;
        }
        return -1;
    }

    /* renamed from: j */
    public boolean m107269j(RecyclerView recyclerView, int i, int i2, int i3, int i4) {
        boolean z;
        if (this.f9266b == 1) {
            if (i2 >= i - this.f9267c) {
                z = true;
            } else {
                z = false;
            }
            return m107267l(z, recyclerView, i, i2, i4);
        } else if (i4 + i3 != this.f9267c) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: k */
    public boolean m107268k(boolean z, RecyclerView recyclerView, int i) {
        int i2 = 0;
        if (z) {
            while (i >= 0) {
                i2 += m107272g(recyclerView, i);
                i--;
            }
        }
        if (!z || i2 > this.f9267c) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public boolean m107267l(boolean z, RecyclerView recyclerView, int i, int i2, int i3) {
        int i4 = 0;
        if (z) {
            while (i2 < i) {
                i4 += m107272g(recyclerView, i2);
                i2++;
            }
        }
        if (!z || i4 > this.f9267c - i3) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public boolean m107266m(RecyclerView recyclerView, int i, int i2, int i3, int i4) {
        boolean z;
        if (this.f9266b == 1) {
            if (i4 != 0) {
                return false;
            }
            return true;
        }
        if (i2 != 0) {
            if (i2 < this.f9267c) {
                z = true;
            } else {
                z = false;
            }
            if (!m107268k(z, recyclerView, i2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    public boolean m107265n(RecyclerView recyclerView, int i, int i2, int i3, int i4) {
        boolean z;
        if (this.f9266b == 1) {
            if (i4 + i3 != this.f9267c) {
                return false;
            }
            return true;
        }
        if (i2 >= i - this.f9267c) {
            z = true;
        } else {
            z = false;
        }
        return m107267l(z, recyclerView, i, i2, i4);
    }

    /* renamed from: o */
    public boolean m107264o(RecyclerView recyclerView, int i, int i2, int i3, int i4) {
        boolean z;
        if (this.f9266b == 1) {
            if (i2 != 0) {
                if (i2 < this.f9267c) {
                    z = true;
                } else {
                    z = false;
                }
                if (!m107268k(z, recyclerView, i2)) {
                    return false;
                }
            }
            return true;
        } else if (i4 != 0) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: p */
    public void m107263p(Rect rect, RecyclerView recyclerView, int i, int i2, int i3, int i4) {
        int i5 = this.f9269e;
        rect.top = i5;
        rect.bottom = i5;
        rect.left = i5;
        rect.right = i5;
        if (m107264o(recyclerView, i, i2, i3, i4)) {
            rect.top = this.f9268d;
        }
        if (m107266m(recyclerView, i, i2, i3, i4)) {
            rect.left = this.f9268d;
        }
        if (m107265n(recyclerView, i, i2, i3, i4)) {
            rect.right = this.f9268d;
        }
        if (m107269j(recyclerView, i, i2, i3, i4)) {
            rect.bottom = this.f9268d;
        }
    }
}
