package p000;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
/* renamed from: mJ4  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C45015mJ4 {

    /* renamed from: a */
    public final Set<InterfaceC45599nI4> f97814a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public final Set<InterfaceC45599nI4> f97815b = new HashSet();

    /* renamed from: c */
    public boolean f97816c;

    /* renamed from: a */
    public boolean m25829a(InterfaceC45599nI4 interfaceC45599nI4) {
        boolean z = true;
        if (interfaceC45599nI4 == null) {
            return true;
        }
        boolean remove = this.f97814a.remove(interfaceC45599nI4);
        if (!this.f97815b.remove(interfaceC45599nI4) && !remove) {
            z = false;
        }
        if (z) {
            interfaceC45599nI4.clear();
        }
        return z;
    }

    /* renamed from: b */
    public void m25828b() {
        for (InterfaceC45599nI4 interfaceC45599nI4 : C47029pi6.m18916j(this.f97814a)) {
            m25829a(interfaceC45599nI4);
        }
        this.f97815b.clear();
    }

    /* renamed from: c */
    public void m25827c() {
        this.f97816c = true;
        for (InterfaceC45599nI4 interfaceC45599nI4 : C47029pi6.m18916j(this.f97814a)) {
            if (interfaceC45599nI4.isRunning() || interfaceC45599nI4.isComplete()) {
                interfaceC45599nI4.clear();
                this.f97815b.add(interfaceC45599nI4);
            }
        }
    }

    /* renamed from: d */
    public void m25826d() {
        this.f97816c = true;
        for (InterfaceC45599nI4 interfaceC45599nI4 : C47029pi6.m18916j(this.f97814a)) {
            if (interfaceC45599nI4.isRunning()) {
                interfaceC45599nI4.pause();
                this.f97815b.add(interfaceC45599nI4);
            }
        }
    }

    /* renamed from: e */
    public void m25825e() {
        for (InterfaceC45599nI4 interfaceC45599nI4 : C47029pi6.m18916j(this.f97814a)) {
            if (!interfaceC45599nI4.isComplete() && !interfaceC45599nI4.mo20673f()) {
                interfaceC45599nI4.clear();
                if (!this.f97816c) {
                    interfaceC45599nI4.mo20670i();
                } else {
                    this.f97815b.add(interfaceC45599nI4);
                }
            }
        }
    }

    /* renamed from: f */
    public void m25824f() {
        this.f97816c = false;
        for (InterfaceC45599nI4 interfaceC45599nI4 : C47029pi6.m18916j(this.f97814a)) {
            if (!interfaceC45599nI4.isComplete() && !interfaceC45599nI4.isRunning()) {
                interfaceC45599nI4.mo20670i();
            }
        }
        this.f97815b.clear();
    }

    /* renamed from: g */
    public void m25823g(InterfaceC45599nI4 interfaceC45599nI4) {
        this.f97814a.add(interfaceC45599nI4);
        if (!this.f97816c) {
            interfaceC45599nI4.mo20670i();
            return;
        }
        interfaceC45599nI4.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f97815b.add(interfaceC45599nI4);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f97814a.size() + ", isPaused=" + this.f97816c + "}";
    }
}
