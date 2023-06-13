package p000;

import kotlin.text.Typography;
/* renamed from: Gv9 */
/* loaded from: classes6.dex */
public enum Gv9 implements Qm9 {
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6);
    

    /* renamed from: g */
    public static final Wm9<Gv9> f12643g = new Wm9<Gv9>() { // from class: Yu9
    };

    /* renamed from: b */
    public final int f12645b;

    Gv9(int i) {
        this.f12645b = i;
    }

    /* renamed from: a */
    public static InterfaceC39356cn9 m104578a() {
        return C38250av9.f56551a;
    }

    /* renamed from: b */
    public static Gv9 m104577b(int i) {
        if (i != 2) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                        return null;
                    }
                    return X86_64;
                }
                return ARM64;
            }
            return X86;
        }
        return ARM7;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + Gv9.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f12645b + " name=" + name() + Typography.greater;
    }

    @Override // p000.Qm9
    public final int zza() {
        return this.f12645b;
    }
}
