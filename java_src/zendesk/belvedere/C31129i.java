package zendesk.belvedere;

import android.util.Log;
/* renamed from: zendesk.belvedere.i */
/* loaded from: classes8.dex */
public class C31129i {

    /* renamed from: a */
    public static InterfaceC31131b f121883a = new C31130a();

    /* renamed from: zendesk.belvedere.i$a */
    /* loaded from: classes8.dex */
    public static class C31130a implements InterfaceC31131b {

        /* renamed from: a */
        public boolean f121884a = false;

        @Override // zendesk.belvedere.C31129i.InterfaceC31131b
        /* renamed from: a */
        public void mo666a(String str, String str2) {
            if (this.f121884a) {
                Log.e(str, str2);
            }
        }

        @Override // zendesk.belvedere.C31129i.InterfaceC31131b
        /* renamed from: b */
        public void mo665b(String str, String str2) {
            if (this.f121884a) {
                Log.d(str, str2);
            }
        }

        @Override // zendesk.belvedere.C31129i.InterfaceC31131b
        /* renamed from: c */
        public void mo664c(String str, String str2) {
            if (this.f121884a) {
                Log.w(str, str2);
            }
        }

        @Override // zendesk.belvedere.C31129i.InterfaceC31131b
        /* renamed from: d */
        public void mo663d(boolean z) {
            this.f121884a = z;
        }

        @Override // zendesk.belvedere.C31129i.InterfaceC31131b
        /* renamed from: e */
        public void mo662e(String str, String str2, Throwable th) {
            if (this.f121884a) {
                Log.e(str, str2, th);
            }
        }
    }

    /* renamed from: zendesk.belvedere.i$b */
    /* loaded from: classes8.dex */
    public interface InterfaceC31131b {
        /* renamed from: a */
        void mo666a(String str, String str2);

        /* renamed from: b */
        void mo665b(String str, String str2);

        /* renamed from: c */
        void mo664c(String str, String str2);

        /* renamed from: d */
        void mo663d(boolean z);

        /* renamed from: e */
        void mo662e(String str, String str2, Throwable th);
    }

    /* renamed from: a */
    public static void m671a(String str, String str2) {
        f121883a.mo665b(str, str2);
    }

    /* renamed from: b */
    public static void m670b(String str, String str2) {
        f121883a.mo666a(str, str2);
    }

    /* renamed from: c */
    public static void m669c(String str, String str2, Throwable th) {
        f121883a.mo662e(str, str2, th);
    }

    /* renamed from: d */
    public static void m668d(InterfaceC31131b interfaceC31131b) {
        f121883a = interfaceC31131b;
    }

    /* renamed from: e */
    public static void m667e(String str, String str2) {
        f121883a.mo664c(str, str2);
    }
}
