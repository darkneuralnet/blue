package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a&\u0010\b\u001a\u00020\u00072\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0006\u001a\u00060\u0000j\u0002`\u0005\u001a\n\u0010\n\u001a\u00020\u0000*\u00020\t\u001a\u000e\u0010\u000b\u001a\u00060\u0000j\u0002`\u0001*\u00020\t\u001a\u000e\u0010\r\u001a\u00060\u0000j\u0002`\f*\u00020\t\u001a\n\u0010\u000f\u001a\u00020\u000e*\u00020\u0000\u001a\n\u0010\u0011\u001a\u00020\u0003*\u00020\u0010\u001a\n\u0010\u0012\u001a\u00020\t*\u00020\u0007\u001a(\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0015\u001a(\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0015\u001a<\u0010\u001d\u001a\u00060\u0007j\u0002`\u001a2\n\u0010\u0013\u001a\u00060\u0007j\u0002`\u001a2\n\u0010\u0014\u001a\u00060\u0007j\u0002`\u001a2\u0006\u0010\u0016\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0015\u001a\n\u0010\u001e\u001a\u00020\t*\u00020\t\u001a\u001a\u0010\"\u001a\u00020!*\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0015\u001a\u001c\u0010$\u001a\u00020!*\u00020#2\u0006\u0010\u001f\u001a\u00020#2\b\b\u0002\u0010 \u001a\u00020\u0015\u001a\u001c\u0010%\u001a\u00020!*\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u0015\"\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b&\u0010'*\n\u0010)\"\u00020(2\u00020(*\n\u0010*\"\u00020\u00002\u00020\u0000*\n\u0010+\"\u00020\u00002\u00020\u0000*\n\u0010,\"\u00020\u00002\u00020\u0000*\n\u0010-\"\u00020\u00002\u00020\u0000*\n\u0010.\"\u00020\u00002\u00020\u0000*\n\u0010/\"\u00020\u00072\u00020\u0007¨\u00060"}, m28432d2 = {"Lhu1;", "Lio/github/sceneview/math/Position;", "position", "LUc4;", "quaternion", "Lio/github/sceneview/math/Scale;", "scale", "LyM2;", C17296a.f69688o, "", "m", "p", "Lio/github/sceneview/math/Direction;", "l", "LQj6;", "q", "LVc4;", "o", "k", "start", "end", "", "deltaSeconds", "epsilon", "g", "i", "Lio/github/sceneview/math/Transform;", "", TransferTable.COLUMN_SPEED, "h", "n", "v", "delta", "", "b", "Liu1;", "c", DateTokenConverter.CONVERTER_KEY, "f", "(LyM2;)LUc4;", "LUj6;", "Axis", "Direction", "Position", "Rotation", "Scale", "Size", "Transform", "sceneview_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: gN2 */
/* loaded from: classes6.dex */
public final class C41491gN2 {
    /* renamed from: a */
    public static final C52154yM2 m39564a(C42400hu1 position, C36315Uc4 quaternion, C42400hu1 scale) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(quaternion, "quaternion");
        Intrinsics.checkNotNullParameter(scale, "scale");
        return C45642nN2.m23928h(position).m3575e(C45642nN2.m23930f(quaternion)).m3575e(C45642nN2.m23929g(scale));
    }

    /* renamed from: b */
    public static final boolean m39563b(float f, float f2, float f3) {
        return Math.abs(f - f2) < f3;
    }

    /* renamed from: c */
    public static final boolean m39562c(C42993iu1 c42993iu1, C42993iu1 v, float f) {
        Intrinsics.checkNotNullParameter(c42993iu1, "<this>");
        Intrinsics.checkNotNullParameter(v, "v");
        if (m39563b(c42993iu1.m31660e(), v.m31660e(), f) && m39563b(c42993iu1.m31659f(), v.m31659f(), f) && m39563b(c42993iu1.m31658g(), v.m31658g(), f) && m39563b(c42993iu1.m31661d(), v.m31661d(), f)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m39561d(C52154yM2 c52154yM2, C52154yM2 m, float f) {
        Intrinsics.checkNotNullParameter(c52154yM2, "<this>");
        Intrinsics.checkNotNullParameter(m, "m");
        if (m39562c(c52154yM2.m3578b(), m.m3578b(), f) && m39562c(c52154yM2.m3577c(), m.m3577c(), f) && m39562c(c52154yM2.m3576d(), m.m3576d(), f) && m39562c(c52154yM2.m3579a(), m.m3579a(), f)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static /* synthetic */ boolean m39560e(C52154yM2 c52154yM2, C52154yM2 c52154yM22, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.001f;
        }
        return m39561d(c52154yM2, c52154yM22, f);
    }

    /* renamed from: f */
    public static final C36315Uc4 m39559f(C52154yM2 c52154yM2) {
        Intrinsics.checkNotNullParameter(c52154yM2, "<this>");
        return C45642nN2.m23931e(c52154yM2).m3573g();
    }

    /* renamed from: g */
    public static final C42400hu1 m39558g(C42400hu1 start, C42400hu1 end, float f, float f2) {
        boolean z;
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        C41807gu1 c41807gu1 = new C41807gu1(start.m35576g(), start.m35575h());
        C41807gu1 c41807gu12 = new C41807gu1(end.m35576g(), end.m35575h());
        boolean z4 = true;
        if (Math.abs(c41807gu1.m37349a() - c41807gu12.m37349a()) < f2) {
            z = true;
        } else {
            z = false;
        }
        if (Math.abs(c41807gu1.m37348b() - c41807gu12.m37348b()) < f2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C7878TY c7878ty = new C7878TY(z, z2);
        if (Math.abs(start.m35574i() - end.m35574i()) < f2) {
            z3 = true;
        } else {
            z3 = false;
        }
        C8309UY c8309uy = new C8309UY(c7878ty, z3);
        if (!c8309uy.m81367a() || !c8309uy.m81366b() || !c8309uy.m81365c()) {
            z4 = false;
        }
        if (!z4) {
            float f3 = 1.0f - f;
            return new C42400hu1((start.m35576g() * f3) + (end.m35576g() * f), (start.m35575h() * f3) + (end.m35575h() * f), (start.m35574i() * f3) + (end.m35574i() * f));
        }
        return end;
    }

    /* renamed from: h */
    public static final C52154yM2 m39557h(C52154yM2 start, C52154yM2 end, double d, float f, float f2) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        C42993iu1 m3578b = start.m3578b();
        C42993iu1 m3578b2 = end.m3578b();
        C42400hu1 c42400hu1 = new C42400hu1(m3578b.m31660e(), m3578b.m31659f(), m3578b.m31658g());
        C42400hu1 c42400hu12 = new C42400hu1(m3578b2.m31660e(), m3578b2.m31659f(), m3578b2.m31658g());
        C41807gu1 c41807gu1 = new C41807gu1(c42400hu1.m35576g(), c42400hu1.m35575h());
        C41807gu1 c41807gu12 = new C41807gu1(c42400hu12.m35576g(), c42400hu12.m35575h());
        C8671VY c8671vy = new C8671VY(new C8309UY(new C7878TY(Math.abs(c41807gu1.m37349a() - c41807gu12.m37349a()) < f2, Math.abs(c41807gu1.m37348b() - c41807gu12.m37348b()) < f2), Math.abs(c42400hu1.m35574i() - c42400hu12.m35574i()) < f2), Math.abs(m3578b.m31661d() - m3578b2.m31661d()) < f2);
        boolean z = c8671vy.m79791b() && c8671vy.m79790c() && c8671vy.m79789d() && c8671vy.m79792a();
        C42993iu1 m3577c = start.m3577c();
        C42993iu1 m3577c2 = end.m3577c();
        C42400hu1 c42400hu13 = new C42400hu1(m3577c.m31660e(), m3577c.m31659f(), m3577c.m31658g());
        C42400hu1 c42400hu14 = new C42400hu1(m3577c2.m31660e(), m3577c2.m31659f(), m3577c2.m31658g());
        C41807gu1 c41807gu13 = new C41807gu1(c42400hu13.m35576g(), c42400hu13.m35575h());
        C41807gu1 c41807gu14 = new C41807gu1(c42400hu14.m35576g(), c42400hu14.m35575h());
        C8671VY c8671vy2 = new C8671VY(new C8309UY(new C7878TY(Math.abs(c41807gu13.m37349a() - c41807gu14.m37349a()) < f2, Math.abs(c41807gu13.m37348b() - c41807gu14.m37348b()) < f2), Math.abs(c42400hu13.m35574i() - c42400hu14.m35574i()) < f2), Math.abs(m3577c.m31661d() - m3577c2.m31661d()) < f2);
        boolean z2 = c8671vy2.m79791b() && c8671vy2.m79790c() && c8671vy2.m79789d() && c8671vy2.m79792a();
        C42993iu1 m3576d = start.m3576d();
        C42993iu1 m3576d2 = end.m3576d();
        C42400hu1 c42400hu15 = new C42400hu1(m3576d.m31660e(), m3576d.m31659f(), m3576d.m31658g());
        C42400hu1 c42400hu16 = new C42400hu1(m3576d2.m31660e(), m3576d2.m31659f(), m3576d2.m31658g());
        C41807gu1 c41807gu15 = new C41807gu1(c42400hu15.m35576g(), c42400hu15.m35575h());
        C41807gu1 c41807gu16 = new C41807gu1(c42400hu16.m35576g(), c42400hu16.m35575h());
        C8671VY c8671vy3 = new C8671VY(new C8309UY(new C7878TY(Math.abs(c41807gu15.m37349a() - c41807gu16.m37349a()) < f2, Math.abs(c41807gu15.m37348b() - c41807gu16.m37348b()) < f2), Math.abs(c42400hu15.m35574i() - c42400hu16.m35574i()) < f2), Math.abs(m3576d.m31661d() - m3576d2.m31661d()) < f2);
        boolean z3 = c8671vy3.m79791b() && c8671vy3.m79790c() && c8671vy3.m79789d() && c8671vy3.m79792a();
        C42993iu1 m3579a = start.m3579a();
        C42993iu1 m3579a2 = end.m3579a();
        C42400hu1 c42400hu17 = new C42400hu1(m3579a.m31660e(), m3579a.m31659f(), m3579a.m31658g());
        C42400hu1 c42400hu18 = new C42400hu1(m3579a2.m31660e(), m3579a2.m31659f(), m3579a2.m31658g());
        C41807gu1 c41807gu17 = new C41807gu1(c42400hu17.m35576g(), c42400hu17.m35575h());
        C41807gu1 c41807gu18 = new C41807gu1(c42400hu18.m35576g(), c42400hu18.m35575h());
        C8671VY c8671vy4 = new C8671VY(new C8309UY(new C7878TY(Math.abs(c41807gu17.m37349a() - c41807gu18.m37349a()) < f2, Math.abs(c41807gu17.m37348b() - c41807gu18.m37348b()) < f2), Math.abs(c42400hu17.m35574i() - c42400hu18.m35574i()) < f2), Math.abs(m3579a.m31661d() - m3579a2.m31661d()) < f2);
        C8671VY c8671vy5 = new C8671VY(z, z2, z3, c8671vy4.m79791b() && c8671vy4.m79790c() && c8671vy4.m79789d() && c8671vy4.m79792a());
        if (c8671vy5.m79791b() && c8671vy5.m79790c() && c8671vy5.m79789d() && c8671vy5.m79792a()) {
            return end;
        }
        float m77082b = XM2.m77082b((float) (f * d), 0.0f, 1.0f);
        C42993iu1 m3579a3 = start.m3579a();
        C42400hu1 c42400hu19 = new C42400hu1(m3579a3.m31660e(), m3579a3.m31659f(), m3579a3.m31658g());
        C42993iu1 m3579a4 = end.m3579a();
        C42400hu1 m39558g = m39558g(c42400hu19, new C42400hu1(m3579a4.m31660e(), m3579a4.m31659f(), m3579a4.m31658g()), m77082b, f2);
        C36315Uc4 m39556i = m39556i(m39559f(start), m39559f(end), m77082b, f2);
        C42993iu1 m3578b3 = start.m3578b();
        C42400hu1 c42400hu110 = new C42400hu1(m3578b3.m31660e(), m3578b3.m31659f(), m3578b3.m31658g());
        C42993iu1 m3577c3 = start.m3577c();
        C42400hu1 c42400hu111 = new C42400hu1(m3577c3.m31660e(), m3577c3.m31659f(), m3577c3.m31658g());
        C42993iu1 m3576d3 = start.m3576d();
        C42400hu1 c42400hu112 = new C42400hu1(m3576d3.m31660e(), m3576d3.m31659f(), m3576d3.m31658g());
        C42400hu1 c42400hu113 = new C42400hu1((float) Math.sqrt((c42400hu110.m35576g() * c42400hu110.m35576g()) + (c42400hu110.m35575h() * c42400hu110.m35575h()) + (c42400hu110.m35574i() * c42400hu110.m35574i())), (float) Math.sqrt((c42400hu111.m35576g() * c42400hu111.m35576g()) + (c42400hu111.m35575h() * c42400hu111.m35575h()) + (c42400hu111.m35574i() * c42400hu111.m35574i())), (float) Math.sqrt((c42400hu112.m35576g() * c42400hu112.m35576g()) + (c42400hu112.m35575h() * c42400hu112.m35575h()) + (c42400hu112.m35574i() * c42400hu112.m35574i())));
        C42993iu1 m3578b4 = end.m3578b();
        C42400hu1 c42400hu114 = new C42400hu1(m3578b4.m31660e(), m3578b4.m31659f(), m3578b4.m31658g());
        C42993iu1 m3577c4 = end.m3577c();
        C42400hu1 c42400hu115 = new C42400hu1(m3577c4.m31660e(), m3577c4.m31659f(), m3577c4.m31658g());
        C42993iu1 m3576d4 = end.m3576d();
        C42400hu1 c42400hu116 = new C42400hu1(m3576d4.m31660e(), m3576d4.m31659f(), m3576d4.m31658g());
        return m39564a(m39558g, m39556i, m39558g(c42400hu113, new C42400hu1((float) Math.sqrt((c42400hu114.m35576g() * c42400hu114.m35576g()) + (c42400hu114.m35575h() * c42400hu114.m35575h()) + (c42400hu114.m35574i() * c42400hu114.m35574i())), (float) Math.sqrt((c42400hu115.m35576g() * c42400hu115.m35576g()) + (c42400hu115.m35575h() * c42400hu115.m35575h()) + (c42400hu115.m35574i() * c42400hu115.m35574i())), (float) Math.sqrt((c42400hu116.m35576g() * c42400hu116.m35576g()) + (c42400hu116.m35575h() * c42400hu116.m35575h()) + (c42400hu116.m35574i() * c42400hu116.m35574i()))), m77082b, f2));
    }

    /* renamed from: i */
    public static final C36315Uc4 m39556i(C36315Uc4 start, C36315Uc4 end, float f, float f2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        C36315Uc4 m78132f = C36783Wc4.m78132f(start);
        C42993iu1 c42993iu1 = new C42993iu1(m78132f.m81261b(), m78132f.m81260c(), m78132f.m81259d(), m78132f.m81262a());
        C36315Uc4 m78132f2 = C36783Wc4.m78132f(end);
        C42993iu1 c42993iu12 = new C42993iu1(m78132f2.m81261b(), m78132f2.m81260c(), m78132f2.m81259d(), m78132f2.m81262a());
        C42400hu1 c42400hu1 = new C42400hu1(c42993iu1.m31660e(), c42993iu1.m31659f(), c42993iu1.m31658g());
        C42400hu1 c42400hu12 = new C42400hu1(c42993iu12.m31660e(), c42993iu12.m31659f(), c42993iu12.m31658g());
        C41807gu1 c41807gu1 = new C41807gu1(c42400hu1.m35576g(), c42400hu1.m35575h());
        C41807gu1 c41807gu12 = new C41807gu1(c42400hu12.m35576g(), c42400hu12.m35575h());
        boolean z5 = true;
        if (Math.abs(c41807gu1.m37349a() - c41807gu12.m37349a()) < f2) {
            z = true;
        } else {
            z = false;
        }
        if (Math.abs(c41807gu1.m37348b() - c41807gu12.m37348b()) < f2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C7878TY c7878ty = new C7878TY(z, z2);
        if (Math.abs(c42400hu1.m35574i() - c42400hu12.m35574i()) < f2) {
            z3 = true;
        } else {
            z3 = false;
        }
        C8309UY c8309uy = new C8309UY(c7878ty, z3);
        if (Math.abs(c42993iu1.m31661d() - c42993iu12.m31661d()) < f2) {
            z4 = true;
        } else {
            z4 = false;
        }
        C8671VY c8671vy = new C8671VY(c8309uy, z4);
        if (!c8671vy.m79791b() || !c8671vy.m79790c() || !c8671vy.m79789d() || !c8671vy.m79792a()) {
            z5 = false;
        }
        if (!z5) {
            return C36783Wc4.m78130h(start, end, f, 0.0f, 8, null);
        }
        return end;
    }

    /* renamed from: j */
    public static /* synthetic */ C52154yM2 m39555j(C52154yM2 c52154yM2, C52154yM2 c52154yM22, double d, float f, float f2, int i, Object obj) {
        if ((i & 16) != 0) {
            f2 = 0.001f;
        }
        return m39557h(c52154yM2, c52154yM22, d, f, f2);
    }

    /* renamed from: k */
    public static final float[] m39554k(C52154yM2 c52154yM2) {
        Intrinsics.checkNotNullParameter(c52154yM2, "<this>");
        return new float[]{c52154yM2.m3578b().m31660e(), c52154yM2.m3578b().m31659f(), c52154yM2.m3578b().m31658g(), c52154yM2.m3578b().m31661d(), c52154yM2.m3577c().m31660e(), c52154yM2.m3577c().m31659f(), c52154yM2.m3577c().m31658g(), c52154yM2.m3577c().m31661d(), c52154yM2.m3576d().m31660e(), c52154yM2.m3576d().m31659f(), c52154yM2.m3576d().m31658g(), c52154yM2.m3576d().m31661d(), c52154yM2.m3579a().m31660e(), c52154yM2.m3579a().m31659f(), c52154yM2.m3579a().m31658g(), c52154yM2.m3579a().m31661d()};
    }

    /* renamed from: l */
    public static final C42400hu1 m39553l(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return new C42400hu1(fArr[0], fArr[1], fArr[2]);
    }

    /* renamed from: m */
    public static final C42400hu1 m39552m(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return new C42400hu1(fArr[0], fArr[1], fArr[2]);
    }

    /* renamed from: n */
    public static final float[] m39551n(float[] fArr) {
        float[] floatArray;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf((float) Math.pow(f, 2.2f)));
        }
        floatArray = CollectionsKt___CollectionsKt.toFloatArray(arrayList);
        return floatArray;
    }

    /* renamed from: o */
    public static final C36315Uc4 m39550o(C36549Vc4 c36549Vc4) {
        Intrinsics.checkNotNullParameter(c36549Vc4, "<this>");
        return new C36315Uc4(c36549Vc4.f39340a, c36549Vc4.f39341b, c36549Vc4.f39342c, c36549Vc4.f39343d);
    }

    /* renamed from: p */
    public static final C42400hu1 m39549p(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return new C42400hu1(fArr[0], fArr[1], fArr[2]);
    }

    /* renamed from: q */
    public static final C35444Qj6 m39548q(C42400hu1 c42400hu1) {
        Intrinsics.checkNotNullParameter(c42400hu1, "<this>");
        return new C35444Qj6(c42400hu1.m35576g(), c42400hu1.m35575h(), c42400hu1.m35574i());
    }
}
