package p000;
/* renamed from: pq2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC47105pq2 {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");
    

    /* renamed from: b */
    public int f104157b;

    /* renamed from: c */
    public String f104158c;

    EnumC47105pq2(int i, String str) {
        this.f104157b = i;
        this.f104158c = str;
    }

    /* renamed from: a */
    public int m18644a() {
        return this.f104157b;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f104158c;
    }
}
