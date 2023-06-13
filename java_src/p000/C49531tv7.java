package p000;
/* renamed from: tv7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49531tv7 {

    /* renamed from: a */
    public final Object f111384a;

    /* renamed from: b */
    public final Object f111385b;

    /* renamed from: c */
    public final Object f111386c;

    public C49531tv7(Object obj, Object obj2, Object obj3) {
        this.f111384a = obj;
        this.f111385b = obj2;
        this.f111386c = obj3;
    }

    /* renamed from: a */
    public final IllegalArgumentException m11200a() {
        String valueOf = String.valueOf(this.f111384a);
        String valueOf2 = String.valueOf(this.f111385b);
        String valueOf3 = String.valueOf(this.f111384a);
        String valueOf4 = String.valueOf(this.f111386c);
        return new IllegalArgumentException("Multiple entries with same key: " + valueOf + "=" + valueOf2 + " and " + valueOf3 + "=" + valueOf4);
    }
}
