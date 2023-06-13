package p000;

import android.widget.ListView;
/* renamed from: Ds2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C32479Ds2 extends AbstractView$OnTouchListenerC13320bt {

    /* renamed from: t */
    public final ListView f6450t;

    public C32479Ds2(ListView listView) {
        super(listView);
        this.f6450t = listView;
    }

    @Override // p000.AbstractView$OnTouchListenerC13320bt
    /* renamed from: a */
    public boolean mo62241a(int i) {
        return false;
    }

    @Override // p000.AbstractView$OnTouchListenerC13320bt
    /* renamed from: b */
    public boolean mo62240b(int i) {
        ListView listView = this.f6450t;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else if (i >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.AbstractView$OnTouchListenerC13320bt
    /* renamed from: j */
    public void mo62232j(int i, int i2) {
        C32713Es2.m108282b(this.f6450t, i2);
    }
}
