package p000;
/* renamed from: UG */
/* loaded from: classes8.dex */
public enum EnumC8246UG implements WZ3 {
    KIBI("Ki", 1),
    MEBI("Mi", 2),
    GIBI("Gi", 3),
    TEBI("Ti", 4),
    PEBI("Pi", 5),
    EXBI("Ei", 6),
    ZEBI("Zi", 7),
    YOBI(C9916Yi.f46302c, 8);
    

    /* renamed from: b */
    public final String f37153b;

    /* renamed from: c */
    public final int f37154c;

    EnumC8246UG(String str, int i) {
        this.f37153b = str;
        this.f37154c = i;
    }

    @Override // p000.WZ3
    /* renamed from: a */
    public String mo71321a() {
        return this.f37153b;
    }

    @Override // p000.WZ3
    /* renamed from: b */
    public int mo71320b() {
        return this.f37154c;
    }

    @Override // p000.WZ3
    /* renamed from: c */
    public Integer getValue() {
        return 1024;
    }
}
