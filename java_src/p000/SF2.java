package p000;
/* renamed from: SF2 */
/* loaded from: classes8.dex */
public final class SF2 {

    /* renamed from: SF2$a */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C7366a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f33391a;

        static {
            int[] iArr = new int[EnumC37911aM6.values().length];
            f33391a = iArr;
            try {
                iArr[EnumC37911aM6.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33391a[EnumC37911aM6.POST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: a */
    public RF2 m85801a(EnumC37911aM6 enumC37911aM6) throws Exception {
        int i = C7366a.f33391a[enumC37911aM6.ordinal()];
        return i != 1 ? i != 2 ? new SK6() : new SK6() : new MJ6();
    }
}
