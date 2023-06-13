package p000;
/* renamed from: LP5 */
/* loaded from: classes5.dex */
public abstract class LP5 {

    /* renamed from: LP5$b */
    /* loaded from: classes5.dex */
    public static class C4911b extends LP5 {

        /* renamed from: a */
        public volatile boolean f21384a;

        public C4911b() {
            super();
        }

        @Override // p000.LP5
        /* renamed from: b */
        public void mo96960b(boolean z) {
            this.f21384a = z;
        }

        @Override // p000.LP5
        /* renamed from: c */
        public void mo96959c() {
            if (!this.f21384a) {
                return;
            }
            throw new IllegalStateException("Already released");
        }
    }

    /* renamed from: a */
    public static LP5 m96961a() {
        return new C4911b();
    }

    /* renamed from: b */
    public abstract void mo96960b(boolean z);

    /* renamed from: c */
    public abstract void mo96959c();

    private LP5() {
    }
}
