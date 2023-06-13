package p000;

import java.io.Serializable;
/* renamed from: vu0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50699vu0 implements Serializable {

    /* renamed from: c */
    public static final C50699vu0 f114872c = new C50699vu0("DEF");
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public final String f114873b;

    public C50699vu0(String str) {
        if (str != null) {
            this.f114873b = str;
            return;
        }
        throw new IllegalArgumentException("The compression algorithm name must not be null");
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C50699vu0) && toString().equals(obj.toString())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f114873b.hashCode();
    }

    public String toString() {
        return this.f114873b;
    }
}
