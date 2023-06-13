package p000;

import java.util.List;
/* renamed from: iw1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C43013iw1 {

    /* renamed from: a */
    public final List<C47781qy5> f91735a;

    /* renamed from: b */
    public final char f91736b;

    /* renamed from: c */
    public final double f91737c;

    /* renamed from: d */
    public final double f91738d;

    /* renamed from: e */
    public final String f91739e;

    /* renamed from: f */
    public final String f91740f;

    public C43013iw1(List<C47781qy5> list, char c, double d, double d2, String str, String str2) {
        this.f91735a = list;
        this.f91736b = c;
        this.f91737c = d;
        this.f91738d = d2;
        this.f91739e = str;
        this.f91740f = str2;
    }

    /* renamed from: c */
    public static int m31595c(char c, String str, String str2) {
        return (((c * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    /* renamed from: a */
    public List<C47781qy5> m31597a() {
        return this.f91735a;
    }

    /* renamed from: b */
    public double m31596b() {
        return this.f91738d;
    }

    public int hashCode() {
        return m31595c(this.f91736b, this.f91740f, this.f91739e);
    }
}
