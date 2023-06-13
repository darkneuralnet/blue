package p000;
/* renamed from: kl1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC44089kl1 {
    JSON(".json"),
    ZIP(".zip");
    

    /* renamed from: b */
    public final String f94876b;

    EnumC44089kl1(String str) {
        this.f94876b = str;
    }

    /* renamed from: b */
    public String m28525b() {
        return ".temp" + this.f94876b;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f94876b;
    }
}
