package p000;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.C11581c;
/* renamed from: Da1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32316Da1 extends InputConnectionWrapper {

    /* renamed from: a */
    public final TextView f5968a;

    /* renamed from: b */
    public final C1546a f5969b;

    /* renamed from: Da1$a */
    /* loaded from: classes.dex */
    public static class C1546a {
        /* renamed from: a */
        public boolean m110165a(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
            return C11581c.m67524h(inputConnection, editable, i, i2, z);
        }

        /* renamed from: b */
        public void m110164b(EditorInfo editorInfo) {
            if (C11581c.m67521k()) {
                C11581c.m67529c().m67508x(editorInfo);
            }
        }
    }

    public C32316Da1(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new C1546a());
    }

    /* renamed from: a */
    public final Editable m110166a() {
        return this.f5968a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        if (!this.f5969b.m110165a(this, m110166a(), i, i2, false) && !super.deleteSurroundingText(i, i2)) {
            return false;
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        if (!this.f5969b.m110165a(this, m110166a(), i, i2, true) && !super.deleteSurroundingTextInCodePoints(i, i2)) {
            return false;
        }
        return true;
    }

    public C32316Da1(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, C1546a c1546a) {
        super(inputConnection, false);
        this.f5968a = textView;
        this.f5969b = c1546a;
        c1546a.m110164b(editorInfo);
    }
}
