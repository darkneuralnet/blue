package p000;

import android.content.Context;
import com.google.firebase.remoteconfig.internal.C18381c;
import com.google.firebase.remoteconfig.internal.C18384d;
import com.google.firebase.remoteconfig.internal.C18387e;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
/* renamed from: zv0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C53081zv0 {

    /* renamed from: a */
    public final Set<InterfaceC32738Ev0> f122470a;

    /* renamed from: b */
    public final C18387e f122471b;

    /* renamed from: c */
    public final C18381c f122472c;

    /* renamed from: d */
    public final C31722Am1 f122473d;

    /* renamed from: e */
    public final InterfaceC35934Sm1 f122474e;

    /* renamed from: f */
    public final C34601Mu0 f122475f;

    /* renamed from: g */
    public final Context f122476g;

    /* renamed from: h */
    public final String f122477h;

    /* renamed from: i */
    public final C18384d f122478i;

    /* renamed from: j */
    public final ScheduledExecutorService f122479j;

    public C53081zv0(C31722Am1 c31722Am1, InterfaceC35934Sm1 interfaceC35934Sm1, C18381c c18381c, C34601Mu0 c34601Mu0, Context context, String str, C18384d c18384d, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f122470a = linkedHashSet;
        this.f122471b = new C18387e(c31722Am1, interfaceC35934Sm1, c18381c, c34601Mu0, context, str, linkedHashSet, c18384d, scheduledExecutorService);
        this.f122473d = c31722Am1;
        this.f122472c = c18381c;
        this.f122474e = interfaceC35934Sm1;
        this.f122475f = c34601Mu0;
        this.f122476g = context;
        this.f122477h = str;
        this.f122478i = c18384d;
        this.f122479j = scheduledExecutorService;
    }

    /* renamed from: a */
    public final synchronized void m118a() {
        if (!this.f122470a.isEmpty()) {
            this.f122471b.m46925B();
        }
    }

    /* renamed from: b */
    public synchronized void m117b(boolean z) {
        this.f122471b.m46899y(z);
        if (!z) {
            m118a();
        }
    }
}
