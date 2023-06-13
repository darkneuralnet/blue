package p000;

import java.util.Set;
/* renamed from: FM7 */
/* loaded from: classes5.dex */
public abstract class FM7 extends BJ7 implements Set {

    /* renamed from: c */
    public transient HL7 f9252c;

    @Override // p000.BJ7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public abstract ST7 iterator();

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: h */
    public final HL7 m107274h() {
        HL7 hl7 = this.f9252c;
        if (hl7 == null) {
            HL7 mo78437j = mo78437j();
            this.f9252c = mo78437j;
            return mo78437j;
        }
        return hl7;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return C49851uT7.m10233a(this);
    }

    /* renamed from: j */
    public HL7 mo78437j() {
        return HL7.m103969j(toArray());
    }
}
