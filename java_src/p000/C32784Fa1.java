package p000;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.C11581c;
/* renamed from: Fa1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32784Fa1 implements KeyListener {

    /* renamed from: a */
    public final KeyListener f9711a;

    /* renamed from: b */
    public final C2359a f9712b;

    /* renamed from: Fa1$a */
    /* loaded from: classes.dex */
    public static class C2359a {
        /* renamed from: a */
        public boolean m106938a(Editable editable, int i, KeyEvent keyEvent) {
            return C11581c.m67523i(editable, i, keyEvent);
        }
    }

    public C32784Fa1(KeyListener keyListener) {
        this(keyListener, new C2359a());
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i) {
        this.f9711a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f9711a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        if (!this.f9712b.m106938a(editable, i, keyEvent) && !this.f9711a.onKeyDown(view, editable, i, keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f9711a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f9711a.onKeyUp(view, editable, i, keyEvent);
    }

    public C32784Fa1(KeyListener keyListener, C2359a c2359a) {
        this.f9711a = keyListener;
        this.f9712b = c2359a;
    }
}
