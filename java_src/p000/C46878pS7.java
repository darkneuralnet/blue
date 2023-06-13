package p000;

import android.database.ContentObserver;
import android.os.Handler;
/* renamed from: pS7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46878pS7 extends ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ ES7 f103690a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46878pS7(ES7 es7, Handler handler) {
        super(null);
        this.f103690a = es7;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.f103690a.m108966d();
    }
}
