package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
/* renamed from: b16  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C38306b16 {

    /* renamed from: c */
    public float f56798c;

    /* renamed from: f */
    public N06 f56801f;

    /* renamed from: a */
    public final TextPaint f56796a = new TextPaint(1);

    /* renamed from: b */
    public final P06 f56797b = new C12271a();

    /* renamed from: d */
    public boolean f56799d = true;

    /* renamed from: e */
    public WeakReference<InterfaceC12272b> f56800e = new WeakReference<>(null);

    /* renamed from: b16$a */
    /* loaded from: classes6.dex */
    public class C12271a extends P06 {
        public C12271a() {
        }

        @Override // p000.P06
        /* renamed from: a */
        public void mo49941a(int i) {
            C38306b16.this.f56799d = true;
            InterfaceC12272b interfaceC12272b = (InterfaceC12272b) C38306b16.this.f56800e.get();
            if (interfaceC12272b != null) {
                interfaceC12272b.mo49869a();
            }
        }

        @Override // p000.P06
        /* renamed from: b */
        public void mo49940b(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            C38306b16.this.f56799d = true;
            InterfaceC12272b interfaceC12272b = (InterfaceC12272b) C38306b16.this.f56800e.get();
            if (interfaceC12272b != null) {
                interfaceC12272b.mo49869a();
            }
        }
    }

    /* renamed from: b16$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC12272b {
        /* renamed from: a */
        void mo49869a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C38306b16(InterfaceC12272b interfaceC12272b) {
        m65105g(interfaceC12272b);
    }

    /* renamed from: c */
    public final float m65109c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f56796a.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: d */
    public N06 m65108d() {
        return this.f56801f;
    }

    /* renamed from: e */
    public TextPaint m65107e() {
        return this.f56796a;
    }

    /* renamed from: f */
    public float m65106f(String str) {
        if (!this.f56799d) {
            return this.f56798c;
        }
        float m65109c = m65109c(str);
        this.f56798c = m65109c;
        this.f56799d = false;
        return m65109c;
    }

    /* renamed from: g */
    public void m65105g(InterfaceC12272b interfaceC12272b) {
        this.f56800e = new WeakReference<>(interfaceC12272b);
    }

    /* renamed from: h */
    public void m65104h(N06 n06, Context context) {
        if (this.f56801f != n06) {
            this.f56801f = n06;
            if (n06 != null) {
                n06.m94475o(context, this.f56796a, this.f56797b);
                InterfaceC12272b interfaceC12272b = this.f56800e.get();
                if (interfaceC12272b != null) {
                    this.f56796a.drawableState = interfaceC12272b.getState();
                }
                n06.m94476n(context, this.f56796a, this.f56797b);
                this.f56799d = true;
            }
            InterfaceC12272b interfaceC12272b2 = this.f56800e.get();
            if (interfaceC12272b2 != null) {
                interfaceC12272b2.mo49869a();
                interfaceC12272b2.onStateChange(interfaceC12272b2.getState());
            }
        }
    }

    /* renamed from: i */
    public void m65103i(boolean z) {
        this.f56799d = z;
    }

    /* renamed from: j */
    public void m65102j(Context context) {
        this.f56801f.m94476n(context, this.f56796a, this.f56797b);
    }
}
