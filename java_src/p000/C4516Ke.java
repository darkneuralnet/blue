package p000;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
/* renamed from: Ke */
/* loaded from: classes.dex */
public final class C4516Ke {

    /* renamed from: b */
    public static final ViewGroup.MarginLayoutParams f19954b;

    /* renamed from: a */
    public LinearLayoutManager f19955a;

    /* renamed from: Ke$a */
    /* loaded from: classes.dex */
    public class C4517a implements Comparator<int[]> {
        public C4517a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f19954b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public C4516Ke(LinearLayoutManager linearLayoutManager) {
        this.f19955a = linearLayoutManager;
    }

    /* renamed from: c */
    public static boolean m98633c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m98633c(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m98635a() {
        boolean z;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int top;
        int i;
        int bottom;
        int i2;
        int m66594d0 = this.f19955a.m66594d0();
        if (m66594d0 == 0) {
            return true;
        }
        if (this.f19955a.m66744F2() == 0) {
            z = true;
        } else {
            z = false;
        }
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, m66594d0, 2);
        for (int i3 = 0; i3 < m66594d0; i3++) {
            View m66597c0 = this.f19955a.m66597c0(i3);
            if (m66597c0 != null) {
                ViewGroup.LayoutParams layoutParams = m66597c0.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = f19954b;
                }
                int[] iArr2 = iArr[i3];
                if (z) {
                    top = m66597c0.getLeft();
                    i = marginLayoutParams.leftMargin;
                } else {
                    top = m66597c0.getTop();
                    i = marginLayoutParams.topMargin;
                }
                iArr2[0] = top - i;
                int[] iArr3 = iArr[i3];
                if (z) {
                    bottom = m66597c0.getRight();
                    i2 = marginLayoutParams.rightMargin;
                } else {
                    bottom = m66597c0.getBottom();
                    i2 = marginLayoutParams.bottomMargin;
                }
                iArr3[1] = bottom + i2;
            } else {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
        }
        Arrays.sort(iArr, new C4517a());
        for (int i4 = 1; i4 < m66594d0; i4++) {
            if (iArr[i4 - 1][1] != iArr[i4][0]) {
                return false;
            }
        }
        int[] iArr4 = iArr[0];
        int i5 = iArr4[1];
        int i6 = iArr4[0];
        int i7 = i5 - i6;
        if (i6 <= 0 && iArr[m66594d0 - 1][1] >= i7) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m98634b() {
        int m66594d0 = this.f19955a.m66594d0();
        for (int i = 0; i < m66594d0; i++) {
            if (m98633c(this.f19955a.m66597c0(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean m98632d() {
        if ((!m98635a() || this.f19955a.m66594d0() <= 1) && m98634b()) {
            return true;
        }
        return false;
    }
}
