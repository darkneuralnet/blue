package p000;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
/* renamed from: TP6 */
/* loaded from: classes5.dex */
public final class TP6 implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ Context f35431b;

    /* renamed from: c */
    public final /* synthetic */ Intent f35432c;

    public TP6(Context context, Intent intent) {
        this.f35431b = context;
        this.f35432c = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.f35431b.startActivity(this.f35432c);
        } catch (ActivityNotFoundException e) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
        }
    }
}
