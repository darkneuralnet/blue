package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
/* renamed from: eB0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C40195eB0 {
    /* renamed from: a */
    public static Activity m43152a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
