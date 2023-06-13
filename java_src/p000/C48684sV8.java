package p000;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
@VisibleForTesting
/* renamed from: sV8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C48684sV8 {

    /* renamed from: a */
    public final Context f108892a;

    @VisibleForTesting
    public C48684sV8(Context context) {
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.f108892a = applicationContext;
    }
}
