package p000;

import android.graphics.Rect;
import ch.qos.logback.classic.net.SyslogAppender;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
/* renamed from: rD2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47924rD2 {

    /* renamed from: c */
    public Map<String, List<C41135fm2>> f106715c;

    /* renamed from: d */
    public Map<String, UD2> f106716d;

    /* renamed from: e */
    public Map<String, C41234fw1> f106717e;

    /* renamed from: f */
    public List<C42075hM2> f106718f;

    /* renamed from: g */
    public LN5<C43013iw1> f106719g;

    /* renamed from: h */
    public C46602oz2<C41135fm2> f106720h;

    /* renamed from: i */
    public List<C41135fm2> f106721i;

    /* renamed from: j */
    public Rect f106722j;

    /* renamed from: k */
    public float f106723k;

    /* renamed from: l */
    public float f106724l;

    /* renamed from: m */
    public float f106725m;

    /* renamed from: n */
    public boolean f106726n;

    /* renamed from: a */
    public final C46263oQ3 f106713a = new C46263oQ3();

    /* renamed from: b */
    public final HashSet<String> f106714b = new HashSet<>();

    /* renamed from: o */
    public int f106727o = 0;

    /* renamed from: a */
    public void m16223a(String str) {
        C32524Dx2.m109586c(str);
        this.f106714b.add(str);
    }

    /* renamed from: b */
    public Rect m16222b() {
        return this.f106722j;
    }

    /* renamed from: c */
    public LN5<C43013iw1> m16221c() {
        return this.f106719g;
    }

    /* renamed from: d */
    public float m16220d() {
        return (m16219e() / this.f106725m) * 1000.0f;
    }

    /* renamed from: e */
    public float m16219e() {
        return this.f106724l - this.f106723k;
    }

    /* renamed from: f */
    public float m16218f() {
        return this.f106724l;
    }

    /* renamed from: g */
    public Map<String, C41234fw1> m16217g() {
        return this.f106717e;
    }

    /* renamed from: h */
    public float m16216h(float f) {
        return C48077rU2.m15911i(this.f106723k, this.f106724l, f);
    }

    /* renamed from: i */
    public float m16215i() {
        return this.f106725m;
    }

    /* renamed from: j */
    public Map<String, UD2> m16214j() {
        return this.f106716d;
    }

    /* renamed from: k */
    public List<C41135fm2> m16213k() {
        return this.f106721i;
    }

    /* renamed from: l */
    public C42075hM2 m16212l(String str) {
        int size = this.f106718f.size();
        for (int i = 0; i < size; i++) {
            C42075hM2 c42075hM2 = this.f106718f.get(i);
            if (c42075hM2.m36527a(str)) {
                return c42075hM2;
            }
        }
        return null;
    }

    /* renamed from: m */
    public int m16211m() {
        return this.f106727o;
    }

    /* renamed from: n */
    public C46263oQ3 m16210n() {
        return this.f106713a;
    }

    /* renamed from: o */
    public List<C41135fm2> m16209o(String str) {
        return this.f106715c.get(str);
    }

    /* renamed from: p */
    public float m16208p() {
        return this.f106723k;
    }

    /* renamed from: q */
    public boolean m16207q() {
        return this.f106726n;
    }

    /* renamed from: r */
    public void m16206r(int i) {
        this.f106727o += i;
    }

    /* renamed from: s */
    public void m16205s(Rect rect, float f, float f2, float f3, List<C41135fm2> list, C46602oz2<C41135fm2> c46602oz2, Map<String, List<C41135fm2>> map, Map<String, UD2> map2, LN5<C43013iw1> ln5, Map<String, C41234fw1> map3, List<C42075hM2> list2) {
        this.f106722j = rect;
        this.f106723k = f;
        this.f106724l = f2;
        this.f106725m = f3;
        this.f106721i = list;
        this.f106720h = c46602oz2;
        this.f106715c = map;
        this.f106716d = map2;
        this.f106719g = ln5;
        this.f106717e = map3;
        this.f106718f = list2;
    }

    /* renamed from: t */
    public C41135fm2 m16204t(long j) {
        return this.f106720h.m20196h(j);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (C41135fm2 c41135fm2 : this.f106721i) {
            sb.append(c41135fm2.m40853y(SyslogAppender.DEFAULT_STACKTRACE_PATTERN));
        }
        return sb.toString();
    }

    /* renamed from: u */
    public void m16203u(boolean z) {
        this.f106726n = z;
    }

    /* renamed from: v */
    public void m16202v(boolean z) {
        this.f106713a.m21090b(z);
    }
}
