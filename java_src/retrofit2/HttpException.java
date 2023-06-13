package retrofit2;

import java.util.Objects;
/* loaded from: classes8.dex */
public class HttpException extends RuntimeException {

    /* renamed from: b */
    public final int f107405b;

    /* renamed from: c */
    public final String f107406c;

    /* renamed from: d */
    public final transient HM4<?> f107407d;

    public HttpException(HM4<?> hm4) {
        super(m15615b(hm4));
        this.f107405b = hm4.m103943b();
        this.f107406c = hm4.m103938g();
        this.f107407d = hm4;
    }

    /* renamed from: b */
    public static String m15615b(HM4<?> hm4) {
        Objects.requireNonNull(hm4, "response == null");
        return "HTTP " + hm4.m103943b() + " " + hm4.m103938g();
    }

    /* renamed from: a */
    public int m15616a() {
        return this.f107405b;
    }

    /* renamed from: c */
    public HM4<?> m15614c() {
        return this.f107407d;
    }
}
