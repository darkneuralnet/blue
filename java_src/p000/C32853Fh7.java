package p000;

import android.database.ContentObserver;
import android.os.Handler;
/* renamed from: Fh7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32853Fh7 extends ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ C34014Kg7 f9962a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32853Fh7(C34014Kg7 c34014Kg7, Handler handler) {
        super(null);
        this.f9962a = c34014Kg7;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.f9962a.m98522d();
        this.f9962a.m98520f();
    }
}
