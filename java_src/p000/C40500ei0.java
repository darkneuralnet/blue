package p000;
/* renamed from: ei0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C40500ei0 {

    /* renamed from: a */
    public final int f78704a;

    /* renamed from: b */
    public final int f78705b;

    /* renamed from: c */
    public final int f78706c;

    /* renamed from: d */
    public final int f78707d;

    /* renamed from: e */
    public final int f78708e;

    /* renamed from: f */
    public final int f78709f;

    /* renamed from: g */
    public final int f78710g;

    /* renamed from: h */
    public final int[] f78711h = m42615a();

    public C40500ei0(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f78704a = i;
        this.f78705b = i2;
        this.f78706c = i3;
        this.f78707d = i4;
        this.f78708e = i5;
        this.f78709f = i6;
        this.f78710g = i7;
    }

    /* renamed from: b */
    public static boolean m42614b(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: a */
    public final int[] m42615a() {
        return new int[]{this.f78704a, this.f78705b, this.f78706c, this.f78707d, this.f78708e, this.f78709f, this.f78710g};
    }

    /* renamed from: c */
    public String m42613c(int i) {
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i2 : this.f78711h) {
            if (m42614b(i, i2)) {
                sb.append(m42612d(i2));
                sb.append(" ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: d */
    public final String m42612d(int i) {
        if (i == this.f78705b) {
            return "READ";
        }
        if (i == this.f78707d) {
            return "WRITE";
        }
        if (i == this.f78706c) {
            return "WRITE_NO_RESPONSE";
        }
        if (i == this.f78710g) {
            return "SIGNED_WRITE";
        }
        if (i == this.f78709f) {
            return "INDICATE";
        }
        if (i == this.f78704a) {
            return "BROADCAST";
        }
        if (i == this.f78708e) {
            return "NOTIFY";
        }
        if (i == 0) {
            return "";
        }
        C52323ye5.m3125d("Unknown property specified (%d)", Integer.valueOf(i));
        return "UNKNOWN (" + i + " -> check android.bluetooth.BluetoothGattCharacteristic)";
    }
}
