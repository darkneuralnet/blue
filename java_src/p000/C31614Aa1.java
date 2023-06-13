package p000;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
/* renamed from: Aa1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31614Aa1 {

    /* renamed from: a */
    public final C0157b f815a;

    /* renamed from: b */
    public int f816b = Integer.MAX_VALUE;

    /* renamed from: c */
    public int f817c = 0;

    /* renamed from: Aa1$a */
    /* loaded from: classes.dex */
    public static class C0156a extends C0157b {

        /* renamed from: a */
        public final EditText f818a;

        /* renamed from: b */
        public final C33720Ja1 f819b;

        public C0156a(EditText editText, boolean z) {
            this.f818a = editText;
            C33720Ja1 c33720Ja1 = new C33720Ja1(editText, z);
            this.f819b = c33720Ja1;
            editText.addTextChangedListener(c33720Ja1);
            editText.setEditableFactory(C31848Ba1.getInstance());
        }

        @Override // p000.C31614Aa1.C0157b
        /* renamed from: a */
        public KeyListener mo115504a(KeyListener keyListener) {
            if (keyListener instanceof C32784Fa1) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (keyListener instanceof NumberKeyListener) {
                return keyListener;
            }
            return new C32784Fa1(keyListener);
        }

        @Override // p000.C31614Aa1.C0157b
        /* renamed from: b */
        public boolean mo115503b() {
            return this.f819b.m100188b();
        }

        @Override // p000.C31614Aa1.C0157b
        /* renamed from: c */
        public InputConnection mo115502c(InputConnection inputConnection, EditorInfo editorInfo) {
            if (inputConnection instanceof C32316Da1) {
                return inputConnection;
            }
            return new C32316Da1(this.f818a, inputConnection, editorInfo);
        }

        @Override // p000.C31614Aa1.C0157b
        /* renamed from: d */
        public void mo115501d(boolean z) {
            this.f819b.m100186d(z);
        }
    }

    /* renamed from: Aa1$b */
    /* loaded from: classes.dex */
    public static class C0157b {
        /* renamed from: a */
        public KeyListener mo115504a(KeyListener keyListener) {
            return keyListener;
        }

        /* renamed from: b */
        public boolean mo115503b() {
            return false;
        }

        /* renamed from: c */
        public InputConnection mo115502c(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection;
        }

        /* renamed from: d */
        public void mo115501d(boolean z) {
        }
    }

    public C31614Aa1(EditText editText, boolean z) {
        HZ3.m103730h(editText, "editText cannot be null");
        this.f815a = new C0156a(editText, z);
    }

    /* renamed from: a */
    public KeyListener m115508a(KeyListener keyListener) {
        return this.f815a.mo115504a(keyListener);
    }

    /* renamed from: b */
    public boolean m115507b() {
        return this.f815a.mo115503b();
    }

    /* renamed from: c */
    public InputConnection m115506c(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f815a.mo115502c(inputConnection, editorInfo);
    }

    /* renamed from: d */
    public void m115505d(boolean z) {
        this.f815a.mo115501d(z);
    }
}
