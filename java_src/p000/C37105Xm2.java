package p000;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.math.BigDecimal;
/* renamed from: Xm2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37105Xm2 extends Number {

    /* renamed from: b */
    public final String f43898b;

    public C37105Xm2(String str) {
        this.f43898b = str;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new BigDecimal(this.f43898b);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f43898b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37105Xm2)) {
            return false;
        }
        String str = this.f43898b;
        String str2 = ((C37105Xm2) obj).f43898b;
        if (str == str2 || str.equals(str2)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f43898b);
    }

    public int hashCode() {
        return this.f43898b.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f43898b);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f43898b);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f43898b).intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f43898b);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f43898b).longValue();
        }
    }

    public String toString() {
        return this.f43898b;
    }
}
