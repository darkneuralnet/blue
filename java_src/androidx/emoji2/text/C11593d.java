package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.C11581c;
import androidx.emoji2.text.C11605f;
import java.util.Arrays;
import java.util.Set;
/* renamed from: androidx.emoji2.text.d */
/* loaded from: classes.dex */
public final class C11593d {

    /* renamed from: a */
    public final C11581c.InterfaceC11592j f54443a;

    /* renamed from: b */
    public final C11605f f54444b;

    /* renamed from: c */
    public C11581c.InterfaceC11587e f54445c;

    /* renamed from: d */
    public final boolean f54446d;

    /* renamed from: e */
    public final int[] f54447e;

    /* renamed from: androidx.emoji2.text.d$a */
    /* loaded from: classes.dex */
    public static final class C11594a {
        private C11594a() {
        }

        /* renamed from: a */
        public static int m67484a(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    i--;
                    if (i < 0) {
                        if (z) {
                            return -1;
                        }
                        return 0;
                    }
                    char charAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i2--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i2--;
                    } else if (Character.isHighSurrogate(charAt)) {
                        return -1;
                    } else {
                        z = true;
                    }
                }
                return i;
            }
        }

        /* renamed from: b */
        public static int m67483b(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    if (i >= length) {
                        if (z) {
                            return -1;
                        }
                        return length;
                    }
                    char charAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i2--;
                        i++;
                    } else if (!Character.isSurrogate(charAt)) {
                        i2--;
                        i++;
                    } else if (Character.isLowSurrogate(charAt)) {
                        return -1;
                    } else {
                        i++;
                        z = true;
                    }
                }
                return i;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.d$b */
    /* loaded from: classes.dex */
    public static class C11595b implements InterfaceC11596c<C50545ve6> {

        /* renamed from: a */
        public C50545ve6 f54448a;

        /* renamed from: b */
        public final C11581c.InterfaceC11592j f54449b;

        public C11595b(C50545ve6 c50545ve6, C11581c.InterfaceC11592j interfaceC11592j) {
            this.f54448a = c50545ve6;
            this.f54449b = interfaceC11592j;
        }

        @Override // androidx.emoji2.text.C11593d.InterfaceC11596c
        /* renamed from: b */
        public boolean mo67479b(CharSequence charSequence, int i, int i2, C51711xc6 c51711xc6) {
            Spannable spannableString;
            if (c51711xc6.m4936k()) {
                return true;
            }
            if (this.f54448a == null) {
                if (charSequence instanceof Spannable) {
                    spannableString = (Spannable) charSequence;
                } else {
                    spannableString = new SpannableString(charSequence);
                }
                this.f54448a = new C50545ve6(spannableString);
            }
            this.f54448a.setSpan(this.f54449b.mo67496a(c51711xc6), i, i2, 33);
            return true;
        }

        @Override // androidx.emoji2.text.C11593d.InterfaceC11596c
        /* renamed from: c */
        public C50545ve6 mo67480a() {
            return this.f54448a;
        }
    }

    /* renamed from: androidx.emoji2.text.d$c */
    /* loaded from: classes.dex */
    public interface InterfaceC11596c<T> {
        /* renamed from: a */
        T mo67480a();

        /* renamed from: b */
        boolean mo67479b(CharSequence charSequence, int i, int i2, C51711xc6 c51711xc6);
    }

    /* renamed from: androidx.emoji2.text.d$d */
    /* loaded from: classes.dex */
    public static class C11597d implements InterfaceC11596c<C11597d> {

        /* renamed from: a */
        public final int f54450a;

        /* renamed from: b */
        public int f54451b = -1;

        /* renamed from: c */
        public int f54452c = -1;

        public C11597d(int i) {
            this.f54450a = i;
        }

        @Override // androidx.emoji2.text.C11593d.InterfaceC11596c
        /* renamed from: b */
        public boolean mo67479b(CharSequence charSequence, int i, int i2, C51711xc6 c51711xc6) {
            int i3 = this.f54450a;
            if (i <= i3 && i3 < i2) {
                this.f54451b = i;
                this.f54452c = i2;
                return false;
            } else if (i2 > i3) {
                return false;
            } else {
                return true;
            }
        }

        @Override // androidx.emoji2.text.C11593d.InterfaceC11596c
        /* renamed from: c */
        public C11597d mo67480a() {
            return this;
        }
    }

    /* renamed from: androidx.emoji2.text.d$e */
    /* loaded from: classes.dex */
    public static class C11598e implements InterfaceC11596c<C11598e> {

        /* renamed from: a */
        public final String f54453a;

        public C11598e(String str) {
            this.f54453a = str;
        }

        @Override // androidx.emoji2.text.C11593d.InterfaceC11596c
        /* renamed from: b */
        public boolean mo67479b(CharSequence charSequence, int i, int i2, C51711xc6 c51711xc6) {
            if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f54453a)) {
                return true;
            }
            c51711xc6.m4935l(true);
            return false;
        }

        @Override // androidx.emoji2.text.C11593d.InterfaceC11596c
        /* renamed from: c */
        public C11598e mo67480a() {
            return this;
        }
    }

    /* renamed from: androidx.emoji2.text.d$f */
    /* loaded from: classes.dex */
    public static final class C11599f {

        /* renamed from: a */
        public int f54454a = 1;

        /* renamed from: b */
        public final C11605f.C11606a f54455b;

        /* renamed from: c */
        public C11605f.C11606a f54456c;

        /* renamed from: d */
        public C11605f.C11606a f54457d;

        /* renamed from: e */
        public int f54458e;

        /* renamed from: f */
        public int f54459f;

        /* renamed from: g */
        public final boolean f54460g;

        /* renamed from: h */
        public final int[] f54461h;

        public C11599f(C11605f.C11606a c11606a, boolean z, int[] iArr) {
            this.f54455b = c11606a;
            this.f54456c = c11606a;
            this.f54460g = z;
            this.f54461h = iArr;
        }

        /* renamed from: d */
        public static boolean m67474d(int i) {
            return i == 65039;
        }

        /* renamed from: f */
        public static boolean m67472f(int i) {
            return i == 65038;
        }

        /* renamed from: a */
        public int m67477a(int i) {
            C11605f.C11606a m67448a = this.f54456c.m67448a(i);
            int i2 = 2;
            if (this.f54454a != 2) {
                if (m67448a == null) {
                    i2 = m67471g();
                } else {
                    this.f54454a = 2;
                    this.f54456c = m67448a;
                    this.f54459f = 1;
                }
            } else if (m67448a != null) {
                this.f54456c = m67448a;
                this.f54459f++;
            } else if (m67472f(i)) {
                i2 = m67471g();
            } else if (!m67474d(i)) {
                if (this.f54456c.m67447b() != null) {
                    i2 = 3;
                    if (this.f54459f == 1) {
                        if (m67470h()) {
                            this.f54457d = this.f54456c;
                            m67471g();
                        } else {
                            i2 = m67471g();
                        }
                    } else {
                        this.f54457d = this.f54456c;
                        m67471g();
                    }
                } else {
                    i2 = m67471g();
                }
            }
            this.f54458e = i;
            return i2;
        }

        /* renamed from: b */
        public C51711xc6 m67476b() {
            return this.f54456c.m67447b();
        }

        /* renamed from: c */
        public C51711xc6 m67475c() {
            return this.f54457d.m67447b();
        }

        /* renamed from: e */
        public boolean m67473e() {
            if (this.f54454a == 2 && this.f54456c.m67447b() != null && (this.f54459f > 1 || m67470h())) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        public final int m67471g() {
            this.f54454a = 1;
            this.f54456c = this.f54455b;
            this.f54459f = 0;
            return 1;
        }

        /* renamed from: h */
        public final boolean m67470h() {
            if (this.f54456c.m67447b().m4937j() || m67474d(this.f54458e)) {
                return true;
            }
            if (this.f54460g) {
                if (this.f54461h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f54461h, this.f54456c.m67447b().m4945b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public C11593d(C11605f c11605f, C11581c.InterfaceC11592j interfaceC11592j, C11581c.InterfaceC11587e interfaceC11587e, boolean z, int[] iArr, Set<int[]> set) {
        this.f54443a = interfaceC11592j;
        this.f54444b = c11605f;
        this.f54445c = interfaceC11587e;
        this.f54446d = z;
        this.f54447e = iArr;
        m67487i(set);
    }

    /* renamed from: a */
    public static boolean m67495a(Editable editable, KeyEvent keyEvent, boolean z) {
        AbstractC33018Ga1[] abstractC33018Ga1Arr;
        if (m67488h(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!m67489g(selectionStart, selectionEnd) && (abstractC33018Ga1Arr = (AbstractC33018Ga1[]) editable.getSpans(selectionStart, selectionEnd, AbstractC33018Ga1.class)) != null && abstractC33018Ga1Arr.length > 0) {
            for (AbstractC33018Ga1 abstractC33018Ga1 : abstractC33018Ga1Arr) {
                int spanStart = editable.getSpanStart(abstractC33018Ga1);
                int spanEnd = editable.getSpanEnd(abstractC33018Ga1);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m67492d(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (m67489g(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                max = C11594a.m67484a(editable, selectionStart, Math.max(i, 0));
                min = C11594a.m67483b(editable, selectionEnd, Math.max(i2, 0));
                if (max == -1 || min == -1) {
                    return false;
                }
            } else {
                max = Math.max(selectionStart - i, 0);
                min = Math.min(selectionEnd + i2, editable.length());
            }
            AbstractC33018Ga1[] abstractC33018Ga1Arr = (AbstractC33018Ga1[]) editable.getSpans(max, min, AbstractC33018Ga1.class);
            if (abstractC33018Ga1Arr != null && abstractC33018Ga1Arr.length > 0) {
                for (AbstractC33018Ga1 abstractC33018Ga1 : abstractC33018Ga1Arr) {
                    int spanStart = editable.getSpanStart(abstractC33018Ga1);
                    int spanEnd = editable.getSpanEnd(abstractC33018Ga1);
                    max = Math.min(spanStart, max);
                    min = Math.max(spanEnd, min);
                }
                int max2 = Math.max(max, 0);
                int min2 = Math.min(min, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max2, min2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m67491e(Editable editable, int i, KeyEvent keyEvent) {
        boolean m67495a;
        if (i != 67) {
            if (i != 112) {
                m67495a = false;
            } else {
                m67495a = m67495a(editable, keyEvent, true);
            }
        } else {
            m67495a = m67495a(editable, keyEvent, false);
        }
        if (!m67495a) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    /* renamed from: g */
    public static boolean m67489g(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    /* renamed from: h */
    public static boolean m67488h(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    /* renamed from: b */
    public int m67494b(CharSequence charSequence, int i) {
        if (i >= 0 && i < charSequence.length()) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                AbstractC33018Ga1[] abstractC33018Ga1Arr = (AbstractC33018Ga1[]) spanned.getSpans(i, i + 1, AbstractC33018Ga1.class);
                if (abstractC33018Ga1Arr.length > 0) {
                    return spanned.getSpanEnd(abstractC33018Ga1Arr[0]);
                }
            }
            return ((C11597d) m67485k(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new C11597d(i))).f54452c;
        }
        return -1;
    }

    /* renamed from: c */
    public int m67493c(CharSequence charSequence, int i) {
        if (i >= 0 && i < charSequence.length()) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                AbstractC33018Ga1[] abstractC33018Ga1Arr = (AbstractC33018Ga1[]) spanned.getSpans(i, i + 1, AbstractC33018Ga1.class);
                if (abstractC33018Ga1Arr.length > 0) {
                    return spanned.getSpanStart(abstractC33018Ga1Arr[0]);
                }
            }
            return ((C11597d) m67485k(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new C11597d(i))).f54451b;
        }
        return -1;
    }

    /* renamed from: f */
    public final boolean m67490f(CharSequence charSequence, int i, int i2, C51711xc6 c51711xc6) {
        if (c51711xc6.m4943d() == 0) {
            c51711xc6.m4934m(this.f54445c.mo67499a(charSequence, i, i2, c51711xc6.m4939h()));
        }
        if (c51711xc6.m4943d() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final void m67487i(Set<int[]> set) {
        if (set.isEmpty()) {
            return;
        }
        for (int[] iArr : set) {
            String str = new String(iArr, 0, iArr.length);
            m67485k(str, 0, str.length(), 1, true, new C11598e(str));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a8, code lost:
        ((p000.IN5) r11).m102438d();
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046 A[Catch: all -> 0x00af, TryCatch #0 {all -> 0x00af, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:19:0x0037, B:21:0x003f, B:23:0x0042, B:25:0x0046, B:27:0x0052, B:28:0x0055, B:31:0x0063, B:37:0x0071, B:38:0x007d, B:40:0x0091, B:16:0x002c), top: B:54:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0091 A[Catch: all -> 0x00af, TRY_LEAVE, TryCatch #0 {all -> 0x00af, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:19:0x0037, B:21:0x003f, B:23:0x0042, B:25:0x0046, B:27:0x0052, B:28:0x0055, B:31:0x0063, B:37:0x0071, B:38:0x007d, B:40:0x0091, B:16:0x002c), top: B:54:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CharSequence m67486j(CharSequence charSequence, int i, int i2, int i3, boolean z) {
        C50545ve6 c50545ve6;
        int i4;
        C50545ve6 c50545ve62;
        AbstractC33018Ga1[] abstractC33018Ga1Arr;
        boolean z2 = charSequence instanceof IN5;
        if (z2) {
            ((IN5) charSequence).m102441a();
        }
        if (!z2) {
            try {
                if (!(charSequence instanceof Spannable)) {
                    if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, AbstractC33018Ga1.class) <= i2) {
                        c50545ve6 = new C50545ve6(charSequence);
                    } else {
                        c50545ve6 = null;
                    }
                    if (c50545ve6 != null && (abstractC33018Ga1Arr = (AbstractC33018Ga1[]) c50545ve6.getSpans(i, i2, AbstractC33018Ga1.class)) != null && abstractC33018Ga1Arr.length > 0) {
                        for (AbstractC33018Ga1 abstractC33018Ga1 : abstractC33018Ga1Arr) {
                            int spanStart = c50545ve6.getSpanStart(abstractC33018Ga1);
                            int spanEnd = c50545ve6.getSpanEnd(abstractC33018Ga1);
                            if (spanStart != i2) {
                                c50545ve6.removeSpan(abstractC33018Ga1);
                            }
                            i = Math.min(spanStart, i);
                            i2 = Math.max(spanEnd, i2);
                        }
                    }
                    i4 = i2;
                    if (i != i4 && i < charSequence.length()) {
                        if (i3 != Integer.MAX_VALUE && c50545ve6 != null) {
                            i3 -= ((AbstractC33018Ga1[]) c50545ve6.getSpans(0, c50545ve6.length(), AbstractC33018Ga1.class)).length;
                        }
                        c50545ve62 = (C50545ve6) m67485k(charSequence, i, i4, i3, z, new C11595b(c50545ve6, this.f54443a));
                        if (c50545ve62 == null) {
                            return c50545ve62.m8301b();
                        }
                        if (z2) {
                            ((IN5) charSequence).m102438d();
                        }
                        return charSequence;
                    }
                    return charSequence;
                }
            } finally {
                if (z2) {
                    ((IN5) charSequence).m102438d();
                }
            }
        }
        c50545ve6 = new C50545ve6((Spannable) charSequence);
        if (c50545ve6 != null) {
            while (r6 < r5) {
            }
        }
        i4 = i2;
        if (i != i4) {
            if (i3 != Integer.MAX_VALUE) {
                i3 -= ((AbstractC33018Ga1[]) c50545ve6.getSpans(0, c50545ve6.length(), AbstractC33018Ga1.class)).length;
            }
            c50545ve62 = (C50545ve6) m67485k(charSequence, i, i4, i3, z, new C11595b(c50545ve6, this.f54443a));
            if (c50545ve62 == null) {
            }
        }
        return charSequence;
    }

    /* renamed from: k */
    public final <T> T m67485k(CharSequence charSequence, int i, int i2, int i3, boolean z, InterfaceC11596c<T> interfaceC11596c) {
        int i4;
        C11599f c11599f = new C11599f(this.f54444b.m67451f(), this.f54446d, this.f54447e);
        int i5 = 0;
        boolean z2 = true;
        int codePointAt = Character.codePointAt(charSequence, i);
        loop0: while (true) {
            i4 = i;
            while (i < i2 && i5 < i3 && z2) {
                int m67477a = c11599f.m67477a(codePointAt);
                if (m67477a != 1) {
                    if (m67477a != 2) {
                        if (m67477a == 3) {
                            if (z || !m67490f(charSequence, i4, i, c11599f.m67475c())) {
                                i5++;
                                z2 = interfaceC11596c.mo67479b(charSequence, i4, i, c11599f.m67475c());
                            }
                        }
                    } else {
                        i += Character.charCount(codePointAt);
                        if (i < i2) {
                            codePointAt = Character.codePointAt(charSequence, i);
                        }
                    }
                } else {
                    i4 += Character.charCount(Character.codePointAt(charSequence, i4));
                    if (i4 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i4);
                    }
                    i = i4;
                }
            }
        }
        if (c11599f.m67473e() && i5 < i3 && z2 && (z || !m67490f(charSequence, i4, i, c11599f.m67476b()))) {
            interfaceC11596c.mo67479b(charSequence, i4, i, c11599f.m67476b());
        }
        return interfaceC11596c.mo67480a();
    }
}
