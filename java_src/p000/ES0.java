package p000;

import ch.qos.logback.core.CoreConstants;
/* renamed from: ES0 */
/* loaded from: classes6.dex */
public class ES0 {

    /* renamed from: a */
    public final int f7472a;

    /* renamed from: b */
    public final int f7473b;

    public ES0(int i, int i2) {
        this.f7472a = i;
        this.f7473b = i2;
    }

    /* renamed from: a */
    public final int m109004a() {
        return this.f7473b;
    }

    /* renamed from: b */
    public final int m109003b() {
        return this.f7472a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ES0)) {
            return false;
        }
        ES0 es0 = (ES0) obj;
        if (this.f7472a != es0.f7472a || this.f7473b != es0.f7473b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f7472a ^ this.f7473b;
    }

    public final String toString() {
        return this.f7472a + "(" + this.f7473b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
