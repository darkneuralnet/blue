package p000;

import android.database.ContentObserver;
import android.os.Handler;
/* renamed from: Tu8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36247Tu8 extends ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ C41824gv8 f36443a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36247Tu8(C41824gv8 c41824gv8, Handler handler) {
        super(null);
        this.f36443a = c41824gv8;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.f36443a.m37315e();
    }
}
