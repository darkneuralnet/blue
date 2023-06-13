package p000;
/* renamed from: Pw7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35328Pw7 {

    /* renamed from: a */
    public final Object f29437a;

    /* renamed from: b */
    public final Object f29438b;

    /* renamed from: c */
    public final Object f29439c;

    public C35328Pw7(Object obj, Object obj2, Object obj3) {
        this.f29437a = obj;
        this.f29438b = obj2;
        this.f29439c = obj3;
    }

    /* renamed from: a */
    public final IllegalArgumentException m89292a() {
        String valueOf = String.valueOf(this.f29437a);
        String valueOf2 = String.valueOf(this.f29438b);
        String valueOf3 = String.valueOf(this.f29437a);
        String valueOf4 = String.valueOf(this.f29439c);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        StringBuilder sb = new StringBuilder(length + 39 + length2 + valueOf3.length() + valueOf4.length());
        sb.append("Multiple entries with same key: ");
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        sb.append(" and ");
        sb.append(valueOf3);
        sb.append("=");
        sb.append(valueOf4);
        return new IllegalArgumentException(sb.toString());
    }
}
