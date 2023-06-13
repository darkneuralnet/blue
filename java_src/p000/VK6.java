package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.annotation.Nullable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* renamed from: VK6 */
/* loaded from: classes6.dex */
public abstract class VK6<StateT> {

    /* renamed from: a */
    public final C42061hK6 f38875a;

    /* renamed from: b */
    public final IntentFilter f38876b;

    /* renamed from: c */
    public final Context f38877c;

    /* renamed from: d */
    public final Set<KP5<StateT>> f38878d = new HashSet();
    @Nullable

    /* renamed from: e */
    public RJ6 f38879e = null;

    /* renamed from: f */
    public volatile boolean f38880f = false;

    public VK6(C42061hK6 c42061hK6, IntentFilter intentFilter, Context context) {
        this.f38875a = c42061hK6;
        this.f38876b = intentFilter;
        this.f38877c = RO6.m86776c(context);
    }

    /* renamed from: a */
    public abstract void mo61428a(Context context, Intent intent);

    /* renamed from: b */
    public final void m79955b() {
        RJ6 rj6;
        if ((this.f38880f || !this.f38878d.isEmpty()) && this.f38879e == null) {
            RJ6 rj62 = new RJ6(this);
            this.f38879e = rj62;
            this.f38877c.registerReceiver(rj62, this.f38876b);
        }
        if (this.f38880f || !this.f38878d.isEmpty() || (rj6 = this.f38879e) == null) {
            return;
        }
        this.f38877c.unregisterReceiver(rj6);
        this.f38879e = null;
    }

    /* renamed from: c */
    public final synchronized void m79954c(boolean z) {
        this.f38880f = z;
        m79955b();
    }

    /* renamed from: d */
    public final synchronized void m79953d(StateT statet) {
        Iterator it = new HashSet(this.f38878d).iterator();
        while (it.hasNext()) {
            ((KP5) it.next()).mo48465a(statet);
        }
    }

    /* renamed from: e */
    public final synchronized boolean m79952e() {
        return this.f38879e != null;
    }
}
