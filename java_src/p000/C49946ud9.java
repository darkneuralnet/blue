package p000;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
/* renamed from: ud9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C49946ud9 implements OnFailureListener {

    /* renamed from: a */
    public static final /* synthetic */ C49946ud9 f112690a = new C49946ud9();

    private /* synthetic */ C49946ud9() {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }
}
