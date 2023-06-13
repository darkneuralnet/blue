package p000;

import ch.qos.logback.core.util.FileSize;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: hR5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class EnumC42123hR5 {

    /* renamed from: c */
    public static final EnumC42123hR5 f85234c;

    /* renamed from: d */
    public static final EnumC42123hR5 f85235d;

    /* renamed from: e */
    public static final EnumC42123hR5 f85236e;

    /* renamed from: f */
    public static final EnumC42123hR5 f85237f;

    /* renamed from: g */
    public static final EnumC42123hR5 f85238g;

    /* renamed from: h */
    public static final /* synthetic */ EnumC42123hR5[] f85239h;

    /* renamed from: b */
    public long f85240b;

    /* renamed from: hR5$a */
    /* loaded from: classes6.dex */
    public enum C22656a extends EnumC42123hR5 {
        public C22656a(String str, int i, long j) {
            super(str, i, j, null);
        }
    }

    static {
        C22656a c22656a = new C22656a("TERABYTES", 0, 1099511627776L);
        f85234c = c22656a;
        EnumC42123hR5 enumC42123hR5 = new EnumC42123hR5("GIGABYTES", 1, 1073741824L) { // from class: hR5.b
        };
        f85235d = enumC42123hR5;
        EnumC42123hR5 enumC42123hR52 = new EnumC42123hR5("MEGABYTES", 2, FileSize.MB_COEFFICIENT) { // from class: hR5.c
        };
        f85236e = enumC42123hR52;
        EnumC42123hR5 enumC42123hR53 = new EnumC42123hR5("KILOBYTES", 3, 1024L) { // from class: hR5.d
        };
        f85237f = enumC42123hR53;
        EnumC42123hR5 enumC42123hR54 = new EnumC42123hR5("BYTES", 4, 1L) { // from class: hR5.e
        };
        f85238g = enumC42123hR54;
        f85239h = new EnumC42123hR5[]{c22656a, enumC42123hR5, enumC42123hR52, enumC42123hR53, enumC42123hR54};
    }

    public /* synthetic */ EnumC42123hR5(String str, int i, long j, C22656a c22656a) {
        this(str, i, j);
    }

    public static EnumC42123hR5 valueOf(String str) {
        return (EnumC42123hR5) Enum.valueOf(EnumC42123hR5.class, str);
    }

    public static EnumC42123hR5[] values() {
        return (EnumC42123hR5[]) f85239h.clone();
    }

    /* renamed from: a */
    public long m36396a(long j) {
        return (j * this.f85240b) / f85237f.f85240b;
    }

    public EnumC42123hR5(String str, int i, long j) {
        this.f85240b = j;
    }
}
