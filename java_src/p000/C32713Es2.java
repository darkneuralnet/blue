package p000;

import android.widget.ListView;
/* renamed from: Es2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32713Es2 {

    /* renamed from: Es2$a */
    /* loaded from: classes.dex */
    public static class C2007a {
        private C2007a() {
        }

        /* renamed from: a */
        public static boolean m108281a(ListView listView, int i) {
            return listView.canScrollList(i);
        }

        /* renamed from: b */
        public static void m108280b(ListView listView, int i) {
            listView.scrollListBy(i);
        }
    }

    private C32713Es2() {
    }

    /* renamed from: a */
    public static boolean m108283a(ListView listView, int i) {
        return C2007a.m108281a(listView, i);
    }

    /* renamed from: b */
    public static void m108282b(ListView listView, int i) {
        C2007a.m108280b(listView, i);
    }
}
