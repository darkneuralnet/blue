package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* renamed from: Hg2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C33307Hg2 extends ArrayList<Object> implements List<Object>, InterfaceC34009Kg2, InterfaceC35881Sg2 {
    private static final long serialVersionUID = 9106884089231309568L;

    /* renamed from: o */
    public static String m103535o(List<? extends Object> list, C36115Tg2 c36115Tg2) {
        StringBuilder sb = new StringBuilder();
        try {
            m103534w(list, sb, c36115Tg2);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    /* renamed from: w */
    public static void m103534w(Iterable<? extends Object> iterable, Appendable appendable, C36115Tg2 c36115Tg2) throws IOException {
        if (iterable == null) {
            appendable.append("null");
        } else {
            C32164Cj2.f4555g.mo420a(iterable, appendable, c36115Tg2);
        }
    }

    @Override // p000.InterfaceC35647Rg2
    /* renamed from: e */
    public void mo86451e(Appendable appendable) throws IOException {
        m103534w(this, appendable, C36583Vg2.f39455a);
    }

    @Override // p000.InterfaceC33775Jg2
    /* renamed from: f */
    public String mo96487f() {
        return m103535o(this, C36583Vg2.f39455a);
    }

    @Override // p000.InterfaceC35881Sg2
    /* renamed from: h */
    public void mo85140h(Appendable appendable, C36115Tg2 c36115Tg2) throws IOException {
        m103534w(this, appendable, c36115Tg2);
    }

    @Override // p000.InterfaceC34009Kg2
    /* renamed from: j */
    public String mo96485j(C36115Tg2 c36115Tg2) {
        return m103535o(this, c36115Tg2);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return mo96487f();
    }
}
