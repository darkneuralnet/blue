package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0000\u001a\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002\u001a\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b\u001a\u0018\u0010\r\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b\u001a\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0002\u001a \u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u0000\u001a \u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u0000¨\u0006\u0015"}, m28432d2 = {"Lhu1;", "s", "LyM2;", "g", "t", "h", "m", "e", "LUc4;", "quaternion", "f", "LVb5;", "order", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "eye", "target", "up", "b", "forward", "c", "sceneview_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: nN2  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C45642nN2 {

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: nN2$a */
    /* loaded from: classes7.dex */
    public /* synthetic */ class C26466a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC36541Vb5.values().length];
            try {
                iArr[EnumC36541Vb5.f39323f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC36541Vb5.f39322e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC36541Vb5.f39324g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC36541Vb5.f39325h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC36541Vb5.f39327j.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC36541Vb5.f39326i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final C42400hu1 m23935a(C52154yM2 m, EnumC36541Vb5 order) {
        Intrinsics.checkNotNullParameter(m, "m");
        Intrinsics.checkNotNullParameter(order, "order");
        C42400hu1 c42400hu1 = new C42400hu1(0.0f, 0.0f, 0.0f, 7, null);
        float f = 1.0f;
        switch (C26466a.$EnumSwitchMapping$0[order.ordinal()]) {
            case 1:
                EnumC36380Uj6 m79687b = order.m79687b();
                float m31660e = m.m3577c().m31660e();
                if (m31660e < -1.0f) {
                    f = -1.0f;
                } else if (m31660e <= 1.0f) {
                    f = m31660e;
                }
                c42400hu1.m35573j(m79687b, (float) Math.asin(-f));
                if (Math.abs(m.m3577c().m31660e()) < 0.9999999f) {
                    c42400hu1.m35573j(order.m79685d(), (float) Math.atan2(m.m3577c().m31658g(), m.m3577c().m31659f()));
                    c42400hu1.m35573j(order.m79686c(), (float) Math.atan2(m.m3576d().m31660e(), m.m3578b().m31660e()));
                    break;
                } else {
                    c42400hu1.m35573j(order.m79685d(), (float) Math.atan2(-m.m3576d().m31659f(), m.m3576d().m31658g()));
                    c42400hu1.m35573j(order.m79686c(), 0.0f);
                    break;
                }
            case 2:
                EnumC36380Uj6 m79687b2 = order.m79687b();
                float m31660e2 = m.m3576d().m31660e();
                if (m31660e2 < -1.0f) {
                    f = -1.0f;
                } else if (m31660e2 <= 1.0f) {
                    f = m31660e2;
                }
                c42400hu1.m35573j(m79687b2, (float) Math.asin(f));
                if (Math.abs(m.m3576d().m31660e()) < 0.9999999f) {
                    c42400hu1.m35573j(order.m79685d(), (float) Math.atan2(-m.m3576d().m31659f(), m.m3576d().m31658g()));
                    c42400hu1.m35573j(order.m79686c(), (float) Math.atan2(-m.m3577c().m31660e(), m.m3578b().m31660e()));
                    break;
                } else {
                    c42400hu1.m35573j(order.m79685d(), (float) Math.atan2(m.m3577c().m31658g(), m.m3577c().m31659f()));
                    c42400hu1.m35573j(order.m79686c(), 0.0f);
                    break;
                }
            case 3:
                EnumC36380Uj6 m79687b3 = order.m79687b();
                float m31659f = m.m3576d().m31659f();
                if (m31659f < -1.0f) {
                    f = -1.0f;
                } else if (m31659f <= 1.0f) {
                    f = m31659f;
                }
                c42400hu1.m35573j(m79687b3, (float) Math.asin(-f));
                if (Math.abs(m.m3576d().m31659f()) < 0.9999999f) {
                    c42400hu1.m35573j(order.m79685d(), (float) Math.atan2(m.m3576d().m31660e(), m.m3576d().m31658g()));
                    c42400hu1.m35573j(order.m79686c(), (float) Math.atan2(m.m3578b().m31659f(), m.m3577c().m31659f()));
                    break;
                } else {
                    c42400hu1.m35573j(order.m79685d(), (float) Math.atan2(-m.m3578b().m31658g(), m.m3578b().m31660e()));
                    c42400hu1.m35573j(order.m79686c(), 0.0f);
                    break;
                }
            case 4:
                EnumC36380Uj6 m79687b4 = order.m79687b();
                float m31659f2 = m.m3578b().m31659f();
                if (m31659f2 < -1.0f) {
                    f = -1.0f;
                } else if (m31659f2 <= 1.0f) {
                    f = m31659f2;
                }
                c42400hu1.m35573j(m79687b4, (float) Math.asin(f));
                if (Math.abs(m.m3578b().m31659f()) < 0.9999999f) {
                    c42400hu1.m35573j(order.m79686c(), (float) Math.atan2(-m.m3576d().m31659f(), m.m3577c().m31659f()));
                    c42400hu1.m35573j(order.m79685d(), (float) Math.atan2(-m.m3578b().m31658g(), m.m3578b().m31660e()));
                    break;
                } else {
                    c42400hu1.m35573j(order.m79686c(), 0.0f);
                    c42400hu1.m35573j(order.m79685d(), (float) Math.atan2(m.m3576d().m31660e(), m.m3576d().m31658g()));
                    break;
                }
            case 5:
                EnumC36380Uj6 m79687b5 = order.m79687b();
                float m31658g = m.m3578b().m31658g();
                if (m31658g < -1.0f) {
                    f = -1.0f;
                } else if (m31658g <= 1.0f) {
                    f = m31658g;
                }
                c42400hu1.m35573j(m79687b5, (float) Math.asin(-f));
                if (Math.abs(m.m3578b().m31658g()) < 0.9999999f) {
                    c42400hu1.m35573j(order.m79686c(), (float) Math.atan2(m.m3577c().m31658g(), m.m3576d().m31658g()));
                    c42400hu1.m35573j(order.m79685d(), (float) Math.atan2(m.m3578b().m31659f(), m.m3578b().m31660e()));
                    break;
                } else {
                    c42400hu1.m35573j(order.m79686c(), 0.0f);
                    c42400hu1.m35573j(order.m79685d(), (float) Math.atan2(-m.m3577c().m31660e(), m.m3577c().m31659f()));
                    break;
                }
            case 6:
                EnumC36380Uj6 m79687b6 = order.m79687b();
                float m31658g2 = m.m3577c().m31658g();
                if (m31658g2 < -1.0f) {
                    f = -1.0f;
                } else if (m31658g2 <= 1.0f) {
                    f = m31658g2;
                }
                c42400hu1.m35573j(m79687b6, (float) Math.asin(f));
                if (Math.abs(m.m3577c().m31658g()) < 0.9999999f) {
                    c42400hu1.m35573j(order.m79686c(), (float) Math.atan2(-m.m3578b().m31658g(), m.m3576d().m31658g()));
                    c42400hu1.m35573j(order.m79685d(), (float) Math.atan2(-m.m3577c().m31660e(), m.m3577c().m31659f()));
                    break;
                } else {
                    c42400hu1.m35573j(order.m79686c(), 0.0f);
                    c42400hu1.m35573j(order.m79685d(), (float) Math.atan2(m.m3578b().m31659f(), m.m3578b().m31660e()));
                    break;
                }
        }
        C42400hu1 m35578e = C42400hu1.m35578e(c42400hu1, 0.0f, 0.0f, 0.0f, 7, null);
        m35578e.m35572k(m35578e.m35576g() * 57.295776f);
        m35578e.m35571l(m35578e.m35575h() * 57.295776f);
        m35578e.m35570m(m35578e.m35574i() * 57.295776f);
        return m35578e;
    }

    /* renamed from: b */
    public static final C52154yM2 m23934b(C42400hu1 eye, C42400hu1 target, C42400hu1 up) {
        Intrinsics.checkNotNullParameter(eye, "eye");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(up, "up");
        return m23933c(eye, new C42400hu1(target.m35576g() - eye.m35576g(), target.m35575h() - eye.m35575h(), target.m35574i() - eye.m35574i()), up);
    }

    /* renamed from: c */
    public static final C52154yM2 m23933c(C42400hu1 eye, C42400hu1 forward, C42400hu1 up) {
        Intrinsics.checkNotNullParameter(eye, "eye");
        Intrinsics.checkNotNullParameter(forward, "forward");
        Intrinsics.checkNotNullParameter(up, "up");
        C42400hu1 m60973a = C39323ck6.m60973a(forward);
        C42400hu1 m60973a2 = C39323ck6.m60973a(new C42400hu1((m60973a.m35575h() * up.m35574i()) - (m60973a.m35574i() * up.m35575h()), (m60973a.m35574i() * up.m35576g()) - (m60973a.m35576g() * up.m35574i()), (m60973a.m35576g() * up.m35575h()) - (m60973a.m35575h() * up.m35576g())));
        return new C52154yM2(new C42993iu1(m60973a2, 0.0f, 2, (DefaultConstructorMarker) null), new C42993iu1(C39323ck6.m60973a(new C42400hu1((m60973a2.m35575h() * m60973a.m35574i()) - (m60973a2.m35574i() * m60973a.m35575h()), (m60973a2.m35574i() * m60973a.m35576g()) - (m60973a2.m35576g() * m60973a.m35574i()), (m60973a2.m35576g() * m60973a.m35575h()) - (m60973a2.m35575h() * m60973a.m35576g()))), 0.0f, 2, (DefaultConstructorMarker) null), new C42993iu1(m60973a.m35569n(), 0.0f, 2, (DefaultConstructorMarker) null), new C42993iu1(eye, 1.0f));
    }

    /* renamed from: d */
    public static final C36315Uc4 m23932d(C52154yM2 m) {
        C36315Uc4 c36315Uc4;
        Intrinsics.checkNotNullParameter(m, "m");
        float m31660e = m.m3578b().m31660e() + m.m3577c().m31659f() + m.m3576d().m31658g();
        if (m31660e > 0.0f) {
            float sqrt = ((float) Math.sqrt(m31660e + 1.0f)) * 2.0f;
            c36315Uc4 = new C36315Uc4((m.m3577c().m31658g() - m.m3576d().m31659f()) / sqrt, (m.m3576d().m31660e() - m.m3578b().m31658g()) / sqrt, (m.m3578b().m31659f() - m.m3577c().m31660e()) / sqrt, sqrt * 0.25f);
        } else if (m.m3578b().m31660e() > m.m3577c().m31659f() && m.m3578b().m31660e() > m.m3576d().m31658g()) {
            float sqrt2 = ((float) Math.sqrt(((m.m3578b().m31660e() + 1.0f) - m.m3577c().m31659f()) - m.m3576d().m31658g())) * 2.0f;
            c36315Uc4 = new C36315Uc4(0.25f * sqrt2, (m.m3577c().m31660e() + m.m3578b().m31659f()) / sqrt2, (m.m3576d().m31660e() + m.m3578b().m31658g()) / sqrt2, (m.m3577c().m31658g() - m.m3576d().m31659f()) / sqrt2);
        } else if (m.m3577c().m31659f() > m.m3576d().m31658g()) {
            float sqrt3 = ((float) Math.sqrt(((m.m3577c().m31659f() + 1.0f) - m.m3578b().m31660e()) - m.m3576d().m31658g())) * 2.0f;
            c36315Uc4 = new C36315Uc4((m.m3577c().m31660e() + m.m3578b().m31659f()) / sqrt3, 0.25f * sqrt3, (m.m3576d().m31659f() + m.m3577c().m31658g()) / sqrt3, (m.m3576d().m31660e() - m.m3578b().m31658g()) / sqrt3);
        } else {
            float sqrt4 = ((float) Math.sqrt(((m.m3576d().m31658g() + 1.0f) - m.m3578b().m31660e()) - m.m3577c().m31659f())) * 2.0f;
            c36315Uc4 = new C36315Uc4((m.m3576d().m31660e() + m.m3578b().m31658g()) / sqrt4, (m.m3576d().m31659f() + m.m3577c().m31658g()) / sqrt4, 0.25f * sqrt4, (m.m3578b().m31659f() - m.m3577c().m31660e()) / sqrt4);
        }
        return C36783Wc4.m78132f(c36315Uc4);
    }

    /* renamed from: e */
    public static final C52154yM2 m23931e(C52154yM2 m) {
        Intrinsics.checkNotNullParameter(m, "m");
        C42993iu1 m3578b = m.m3578b();
        C42400hu1 m60973a = C39323ck6.m60973a(new C42400hu1(m3578b.m31660e(), m3578b.m31659f(), m3578b.m31658g()));
        C42993iu1 m3577c = m.m3577c();
        C42400hu1 m60973a2 = C39323ck6.m60973a(new C42400hu1(m3577c.m31660e(), m3577c.m31659f(), m3577c.m31658g()));
        C42993iu1 m3576d = m.m3576d();
        return new C52154yM2(m60973a, m60973a2, C39323ck6.m60973a(new C42400hu1(m3576d.m31660e(), m3576d.m31659f(), m3576d.m31658g())), (C42400hu1) null, 8, (DefaultConstructorMarker) null);
    }

    /* renamed from: f */
    public static final C52154yM2 m23930f(C36315Uc4 quaternion) {
        Intrinsics.checkNotNullParameter(quaternion, "quaternion");
        C36315Uc4 m78132f = C36783Wc4.m78132f(quaternion);
        return new C52154yM2(new C42993iu1(1.0f - (((m78132f.m81260c() * m78132f.m81260c()) + (m78132f.m81259d() * m78132f.m81259d())) * 2.0f), ((m78132f.m81261b() * m78132f.m81260c()) + (m78132f.m81259d() * m78132f.m81262a())) * 2.0f, ((m78132f.m81261b() * m78132f.m81259d()) - (m78132f.m81260c() * m78132f.m81262a())) * 2.0f, 0.0f, 8, null), new C42993iu1(((m78132f.m81261b() * m78132f.m81260c()) - (m78132f.m81259d() * m78132f.m81262a())) * 2.0f, 1.0f - (((m78132f.m81261b() * m78132f.m81261b()) + (m78132f.m81259d() * m78132f.m81259d())) * 2.0f), ((m78132f.m81260c() * m78132f.m81259d()) + (m78132f.m81261b() * m78132f.m81262a())) * 2.0f, 0.0f, 8, null), new C42993iu1(((m78132f.m81261b() * m78132f.m81259d()) + (m78132f.m81260c() * m78132f.m81262a())) * 2.0f, ((m78132f.m81260c() * m78132f.m81259d()) - (m78132f.m81261b() * m78132f.m81262a())) * 2.0f, 1.0f - (((m78132f.m81261b() * m78132f.m81261b()) + (m78132f.m81260c() * m78132f.m81260c())) * 2.0f), 0.0f, 8, null), (C42993iu1) null, 8, (DefaultConstructorMarker) null);
    }

    /* renamed from: g */
    public static final C52154yM2 m23929g(C42400hu1 s) {
        Intrinsics.checkNotNullParameter(s, "s");
        return new C52154yM2(new C42993iu1(s.m35576g(), 0.0f, 0.0f, 0.0f, 14, null), new C42993iu1(0.0f, s.m35575h(), 0.0f, 0.0f, 13, null), new C42993iu1(0.0f, 0.0f, s.m35574i(), 0.0f, 11, null), (C42993iu1) null, 8, (DefaultConstructorMarker) null);
    }

    /* renamed from: h */
    public static final C52154yM2 m23928h(C42400hu1 t) {
        Intrinsics.checkNotNullParameter(t, "t");
        return new C52154yM2((C42993iu1) null, (C42993iu1) null, (C42993iu1) null, new C42993iu1(t, 1.0f), 7, (DefaultConstructorMarker) null);
    }
}
