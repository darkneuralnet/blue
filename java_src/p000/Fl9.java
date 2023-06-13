package p000;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
/* renamed from: Fl9 */
/* loaded from: classes6.dex */
public final /* synthetic */ class Fl9 implements OnFailureListener {

    /* renamed from: a */
    public static final /* synthetic */ Fl9 f10077a = new Fl9();

    private /* synthetic */ Fl9() {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }
}
