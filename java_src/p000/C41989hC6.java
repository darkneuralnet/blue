package p000;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import p000.C41989hC6;
/* renamed from: hC6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41989hC6 {

    /* renamed from: a */
    public final C22598e f84855a;

    /* renamed from: hC6$a */
    /* loaded from: classes.dex */
    public static class C22594a extends C22598e {

        /* renamed from: a */
        public final Window f84856a;

        /* renamed from: b */
        public final View f84857b;

        public C22594a(Window window, View view) {
            this.f84856a = window;
            this.f84857b = view;
        }

        /* renamed from: h */
        public static /* synthetic */ void m36616h(View view) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }

        @Override // p000.C41989hC6.C22598e
        /* renamed from: a */
        public void mo36608a(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    m36617g(i2);
                }
            }
        }

        @Override // p000.C41989hC6.C22598e
        /* renamed from: e */
        public void mo36604e(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    m36613k(i2);
                }
            }
        }

        /* renamed from: g */
        public final void m36617g(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 8) {
                        ((InputMethodManager) this.f84856a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f84856a.getDecorView().getWindowToken(), 0);
                        return;
                    }
                    return;
                }
                m36615i(2);
                return;
            }
            m36615i(4);
        }

        /* renamed from: i */
        public void m36615i(int i) {
            View decorView = this.f84856a.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        /* renamed from: j */
        public void m36614j(int i) {
            this.f84856a.addFlags(i);
        }

        /* renamed from: k */
        public final void m36613k(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 8) {
                        final View view = this.f84857b;
                        if (!view.isInEditMode() && !view.onCheckIsTextEditor()) {
                            view = this.f84856a.getCurrentFocus();
                        } else {
                            view.requestFocus();
                        }
                        if (view == null) {
                            view = this.f84856a.findViewById(16908290);
                        }
                        if (view != null && view.hasWindowFocus()) {
                            view.post(new Runnable() { // from class: gC6
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C41989hC6.C22594a.m36616h(view);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    return;
                }
                m36612l(2);
                return;
            }
            m36612l(4);
            m36611m(1024);
        }

        /* renamed from: l */
        public void m36612l(int i) {
            View decorView = this.f84856a.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        /* renamed from: m */
        public void m36611m(int i) {
            this.f84856a.clearFlags(i);
        }
    }

    /* renamed from: hC6$b */
    /* loaded from: classes.dex */
    public static class C22595b extends C22594a {
        public C22595b(Window window, View view) {
            super(window, view);
        }

        @Override // p000.C41989hC6.C22598e
        /* renamed from: b */
        public boolean mo36607b() {
            return (this.f84856a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // p000.C41989hC6.C22598e
        /* renamed from: d */
        public void mo36605d(boolean z) {
            if (z) {
                m36611m(67108864);
                m36614j(Integer.MIN_VALUE);
                m36615i(8192);
                return;
            }
            m36612l(8192);
        }
    }

    /* renamed from: hC6$c */
    /* loaded from: classes.dex */
    public static class C22596c extends C22595b {
        public C22596c(Window window, View view) {
            super(window, view);
        }

        @Override // p000.C41989hC6.C22598e
        /* renamed from: c */
        public void mo36606c(boolean z) {
            if (z) {
                m36611m(134217728);
                m36614j(Integer.MIN_VALUE);
                m36615i(16);
                return;
            }
            m36612l(16);
        }
    }

    /* renamed from: hC6$e */
    /* loaded from: classes.dex */
    public static class C22598e {
        /* renamed from: a */
        public void mo36608a(int i) {
        }

        /* renamed from: b */
        public boolean mo36607b() {
            return false;
        }

        /* renamed from: c */
        public void mo36606c(boolean z) {
        }

        /* renamed from: d */
        public void mo36605d(boolean z) {
        }

        /* renamed from: e */
        public void mo36604e(int i) {
        }
    }

    @Deprecated
    public C41989hC6(WindowInsetsController windowInsetsController) {
        this.f84855a = new C22597d(windowInsetsController, this);
    }

    @Deprecated
    /* renamed from: f */
    public static C41989hC6 m36619f(WindowInsetsController windowInsetsController) {
        return new C41989hC6(windowInsetsController);
    }

    /* renamed from: a */
    public void m36624a(int i) {
        this.f84855a.mo36608a(i);
    }

    /* renamed from: b */
    public boolean m36623b() {
        return this.f84855a.mo36607b();
    }

    /* renamed from: c */
    public void m36622c(boolean z) {
        this.f84855a.mo36606c(z);
    }

    /* renamed from: d */
    public void m36621d(boolean z) {
        this.f84855a.mo36605d(z);
    }

    /* renamed from: e */
    public void m36620e(int i) {
        this.f84855a.mo36604e(i);
    }

    /* renamed from: hC6$d */
    /* loaded from: classes.dex */
    public static class C22597d extends C22598e {

        /* renamed from: a */
        public final C41989hC6 f84858a;

        /* renamed from: b */
        public final WindowInsetsController f84859b;

        /* renamed from: c */
        public final NA5<Object, WindowInsetsController.OnControllableInsetsChangedListener> f84860c;

        /* renamed from: d */
        public Window f84861d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public C22597d(Window window, C41989hC6 c41989hC6) {
            this(r0, c41989hC6);
            WindowInsetsController insetsController;
            insetsController = window.getInsetsController();
            this.f84861d = window;
        }

        @Override // p000.C41989hC6.C22598e
        /* renamed from: a */
        public void mo36608a(int i) {
            this.f84859b.hide(i);
        }

        @Override // p000.C41989hC6.C22598e
        /* renamed from: b */
        public boolean mo36607b() {
            int systemBarsAppearance;
            systemBarsAppearance = this.f84859b.getSystemBarsAppearance();
            return (systemBarsAppearance & 8) != 0;
        }

        @Override // p000.C41989hC6.C22598e
        /* renamed from: c */
        public void mo36606c(boolean z) {
            if (z) {
                if (this.f84861d != null) {
                    m36610f(16);
                }
                this.f84859b.setSystemBarsAppearance(16, 16);
                return;
            }
            if (this.f84861d != null) {
                m36609g(16);
            }
            this.f84859b.setSystemBarsAppearance(0, 16);
        }

        @Override // p000.C41989hC6.C22598e
        /* renamed from: d */
        public void mo36605d(boolean z) {
            if (z) {
                if (this.f84861d != null) {
                    m36610f(8192);
                }
                this.f84859b.setSystemBarsAppearance(8, 8);
                return;
            }
            if (this.f84861d != null) {
                m36609g(8192);
            }
            this.f84859b.setSystemBarsAppearance(0, 8);
        }

        @Override // p000.C41989hC6.C22598e
        /* renamed from: e */
        public void mo36604e(int i) {
            Window window = this.f84861d;
            if (window != null && (i & 8) != 0 && Build.VERSION.SDK_INT < 32) {
                ((InputMethodManager) window.getContext().getSystemService("input_method")).isActive();
            }
            this.f84859b.show(i);
        }

        /* renamed from: f */
        public void m36610f(int i) {
            View decorView = this.f84861d.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        /* renamed from: g */
        public void m36609g(int i) {
            View decorView = this.f84861d.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        public C22597d(WindowInsetsController windowInsetsController, C41989hC6 c41989hC6) {
            this.f84860c = new NA5<>();
            this.f84859b = windowInsetsController;
            this.f84858a = c41989hC6;
        }
    }

    public C41989hC6(Window window, View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f84855a = new C22597d(window, this);
        } else if (i >= 26) {
            this.f84855a = new C22596c(window, view);
        } else {
            this.f84855a = new C22595b(window, view);
        }
    }
}
