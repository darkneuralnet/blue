package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* renamed from: pM4  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C46821pM4 {

    /* renamed from: a */
    public boolean f103559a;

    /* renamed from: b */
    public final Handler f103560b = new Handler(Looper.getMainLooper(), new C27276a());

    /* renamed from: pM4$a */
    /* loaded from: classes5.dex */
    public static final class C27276a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((VL4) message.obj).mo5712b();
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public synchronized void m19422a(VL4<?> vl4, boolean z) {
        if (!this.f103559a && !z) {
            this.f103559a = true;
            vl4.mo5712b();
            this.f103559a = false;
        }
        this.f103560b.obtainMessage(1, vl4).sendToTarget();
    }
}
