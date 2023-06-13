package p000;
/* renamed from: qw4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC47760qw4 {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* renamed from: qw4$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C27738a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f106095a;

        static {
            int[] iArr = new int[EnumC47760qw4.values().length];
            f106095a = iArr;
            try {
                iArr[EnumC47760qw4.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f106095a[EnumC47760qw4.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f106095a[EnumC47760qw4.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: b */
    public boolean m16773b(int i, boolean z, int i2) {
        int i3 = C27738a.f106095a[ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                return (z && i < 28) || i2 > 4 || i <= 25;
            }
            return true;
        }
        return false;
    }
}
