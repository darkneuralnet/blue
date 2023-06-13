package p000;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: mz2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class EnumC45416mz2 {

    /* renamed from: b */
    public static final EnumC45416mz2 f99191b;

    /* renamed from: c */
    public static final EnumC45416mz2 f99192c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC45416mz2[] f99193d;

    /* renamed from: mz2$a */
    /* loaded from: classes6.dex */
    public enum C26329a extends EnumC45416mz2 {
        public C26329a(String str, int i) {
            super(str, i, null);
        }
    }

    static {
        C26329a c26329a = new C26329a("DEFAULT", 0);
        f99191b = c26329a;
        EnumC45416mz2 enumC45416mz2 = new EnumC45416mz2("STRING", 1) { // from class: mz2.b
        };
        f99192c = enumC45416mz2;
        f99193d = new EnumC45416mz2[]{c26329a, enumC45416mz2};
    }

    public EnumC45416mz2(String str, int i) {
    }

    public static EnumC45416mz2 valueOf(String str) {
        return (EnumC45416mz2) Enum.valueOf(EnumC45416mz2.class, str);
    }

    public static EnumC45416mz2[] values() {
        return (EnumC45416mz2[]) f99193d.clone();
    }

    public /* synthetic */ EnumC45416mz2(String str, int i, C26329a c26329a) {
        this(str, i);
    }
}
