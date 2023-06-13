package p000;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C11939n;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: ZL5 */
/* loaded from: classes6.dex */
public class ZL5 extends LinearLayoutManager {

    /* renamed from: ZL5$a */
    /* loaded from: classes6.dex */
    public class C10239a extends C11939n {
        public C10239a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C11939n
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public ZL5(Context context, int i, boolean z) {
        super(context, i, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: a2 */
    public void mo51837a2(RecyclerView recyclerView, RecyclerView.C11872z c11872z, int i) {
        C10239a c10239a = new C10239a(recyclerView.getContext());
        c10239a.setTargetPosition(i);
        m66598b2(c10239a);
    }
}
