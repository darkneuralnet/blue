package p000;

import android.os.Build;
import android.util.CloseGuard;
/* renamed from: jl0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43495jl0 {

    /* renamed from: a */
    public final InterfaceC25002b f93264a;

    /* renamed from: jl0$a */
    /* loaded from: classes.dex */
    public static final class C25001a implements InterfaceC25002b {

        /* renamed from: a */
        public final CloseGuard f93265a;

        public C25001a() {
            C41716gl0.m37534a();
            this.f93265a = C41123fl0.m40908a();
        }

        @Override // p000.C43495jl0.InterfaceC25002b
        /* renamed from: a */
        public void mo30002a() {
            this.f93265a.warnIfOpen();
        }

        @Override // p000.C43495jl0.InterfaceC25002b
        public void close() {
            this.f93265a.close();
        }
    }

    /* renamed from: jl0$b */
    /* loaded from: classes.dex */
    public interface InterfaceC25002b {
        /* renamed from: a */
        void mo30002a();

        void close();
    }

    /* renamed from: jl0$c */
    /* loaded from: classes.dex */
    public static final class C25003c implements InterfaceC25002b {
        @Override // p000.C43495jl0.InterfaceC25002b
        /* renamed from: a */
        public void mo30002a() {
        }

        @Override // p000.C43495jl0.InterfaceC25002b
        public void close() {
        }
    }

    public C43495jl0(InterfaceC25002b interfaceC25002b) {
        this.f93264a = interfaceC25002b;
    }

    /* renamed from: b */
    public static C43495jl0 m30004b() {
        if (Build.VERSION.SDK_INT >= 30) {
            return new C43495jl0(new C25001a());
        }
        return new C43495jl0(new C25003c());
    }

    /* renamed from: a */
    public void m30005a() {
        this.f93264a.close();
    }

    /* renamed from: c */
    public void m30003c() {
        this.f93264a.mo30002a();
    }
}
