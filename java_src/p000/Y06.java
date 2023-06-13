package p000;

import java.util.Locale;
/* renamed from: Y06 */
/* loaded from: classes.dex */
public final class Y06 {

    /* renamed from: a */
    public static final X06 f44427a = new C9597e(null, false);

    /* renamed from: b */
    public static final X06 f44428b = new C9597e(null, true);

    /* renamed from: c */
    public static final X06 f44429c;

    /* renamed from: d */
    public static final X06 f44430d;

    /* renamed from: e */
    public static final X06 f44431e;

    /* renamed from: f */
    public static final X06 f44432f;

    /* renamed from: Y06$a */
    /* loaded from: classes.dex */
    public static class C9593a implements InterfaceC9595c {

        /* renamed from: b */
        public static final C9593a f44433b = new C9593a(true);

        /* renamed from: a */
        public final boolean f44434a;

        public C9593a(boolean z) {
            this.f44434a = z;
        }

        @Override // p000.Y06.InterfaceC9595c
        /* renamed from: a */
        public int mo75857a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int m75859a = Y06.m75859a(Character.getDirectionality(charSequence.charAt(i)));
                if (m75859a != 0) {
                    if (m75859a == 1) {
                        if (!this.f44434a) {
                            return 1;
                        }
                    } else {
                        continue;
                        i++;
                        z = z;
                    }
                } else if (this.f44434a) {
                    return 0;
                }
                z = true;
                i++;
                z = z;
            }
            if (z) {
                return this.f44434a ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: Y06$b */
    /* loaded from: classes.dex */
    public static class C9594b implements InterfaceC9595c {

        /* renamed from: a */
        public static final C9594b f44435a = new C9594b();

        private C9594b() {
        }

        @Override // p000.Y06.InterfaceC9595c
        /* renamed from: a */
        public int mo75857a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = Y06.m75858b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* renamed from: Y06$c */
    /* loaded from: classes.dex */
    public interface InterfaceC9595c {
        /* renamed from: a */
        int mo75857a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: Y06$d */
    /* loaded from: classes.dex */
    public static abstract class AbstractC9596d implements X06 {

        /* renamed from: a */
        public final InterfaceC9595c f44436a;

        public AbstractC9596d(InterfaceC9595c interfaceC9595c) {
            this.f44436a = interfaceC9595c;
        }

        @Override // p000.X06
        /* renamed from: a */
        public boolean mo75856a(CharSequence charSequence, int i, int i2) {
            if (charSequence != null && i >= 0 && i2 >= 0 && charSequence.length() - i2 >= i) {
                if (this.f44436a == null) {
                    return mo75854b();
                }
                return m75855c(charSequence, i, i2);
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: b */
        public abstract boolean mo75854b();

        /* renamed from: c */
        public final boolean m75855c(CharSequence charSequence, int i, int i2) {
            int mo75857a = this.f44436a.mo75857a(charSequence, i, i2);
            if (mo75857a == 0) {
                return true;
            }
            if (mo75857a != 1) {
                return mo75854b();
            }
            return false;
        }
    }

    /* renamed from: Y06$e */
    /* loaded from: classes.dex */
    public static class C9597e extends AbstractC9596d {

        /* renamed from: b */
        public final boolean f44437b;

        public C9597e(InterfaceC9595c interfaceC9595c, boolean z) {
            super(interfaceC9595c);
            this.f44437b = z;
        }

        @Override // p000.Y06.AbstractC9596d
        /* renamed from: b */
        public boolean mo75854b() {
            return this.f44437b;
        }
    }

    /* renamed from: Y06$f */
    /* loaded from: classes.dex */
    public static class C9598f extends AbstractC9596d {

        /* renamed from: b */
        public static final C9598f f44438b = new C9598f();

        public C9598f() {
            super(null);
        }

        @Override // p000.Y06.AbstractC9596d
        /* renamed from: b */
        public boolean mo75854b() {
            return P26.m91040a(Locale.getDefault()) == 1;
        }
    }

    static {
        C9594b c9594b = C9594b.f44435a;
        f44429c = new C9597e(c9594b, false);
        f44430d = new C9597e(c9594b, true);
        f44431e = new C9597e(C9593a.f44433b, false);
        f44432f = C9598f.f44438b;
    }

    private Y06() {
    }

    /* renamed from: a */
    public static int m75859a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    public static int m75858b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
