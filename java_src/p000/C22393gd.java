package p000;

import android.graphics.Paint;
import android.graphics.Shader;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\bJ\u0010KB\t\b\u0016¢\u0006\u0004\bJ\u0010LJ\f\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001f\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001e\u0010\u0010\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R.\u0010\u001d\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010#\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u001e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R-\u0010%\u001a\u00020$2\u0006\u0010%\u001a\u00020$8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b\u0005\u0010&\"\u0004\b'\u0010(R-\u0010-\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R-\u00101\u001a\u00020.2\u0006\u0010\u0016\u001a\u00020.8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,R$\u00104\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u001e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b2\u0010 \"\u0004\b3\u0010\"R-\u00106\u001a\u0002052\u0006\u0010\u0016\u001a\u0002058V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b\u0012\u0010*\"\u0004\b\t\u0010,R-\u00109\u001a\u0002072\u0006\u0010\u0016\u001a\u0002078V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b8\u0010*\"\u0004\b\u0017\u0010,R$\u0010<\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u001e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b:\u0010 \"\u0004\b;\u0010\"R-\u0010?\u001a\u00020=2\u0006\u0010\u0016\u001a\u00020=8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b>\u0010*\"\u0004\b\u000e\u0010,R4\u0010D\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\u000e\u0010\u0016\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR(\u0010I\u001a\u0004\u0018\u00010\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006M"}, m28432d2 = {"Lgd;", "LkE3;", "Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/NativePaint;", "k", C17296a.f69688o, "Landroid/graphics/Paint;", "internalPaint", "LLW;", "b", "I", "_blendMode", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "c", "Landroid/graphics/Shader;", "internalShader", "Lsm0;", DateTokenConverter.CONVERTER_KEY, "Lsm0;", "internalColorFilter", "LiJ3;", "value", "e", "LiJ3;", "u", "()LiJ3;", "t", "(LiJ3;)V", "pathEffect", "", "h", "()F", "g", "(F)V", "alpha", "Lpm0;", "color", "()J", "f", "(J)V", "v", "()I", "r", "(I)V", "blendMode", "LqE3;", "getStyle-TiuSbCo", "o", "style", "q", "p", "strokeWidth", "LLS5;", "strokeCap", "LNS5;", "i", "strokeJoin", "j", "m", "strokeMiterLimit", "LRl1;", "x", "filterQuality", "l", "()Landroid/graphics/Shader;", "w", "(Landroid/graphics/Shader;)V", "shader", "s", "()Lsm0;", "n", "(Lsm0;)V", "colorFilter", "<init>", "(Landroid/graphics/Paint;)V", "()V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: gd */
/* loaded from: classes.dex */
public final class C22393gd implements InterfaceC43783kE3 {

    /* renamed from: a */
    public Paint f83950a;

    /* renamed from: b */
    public int f83951b;

    /* renamed from: c */
    public Shader f83952c;

    /* renamed from: d */
    public C48841sm0 f83953d;

    /* renamed from: e */
    public InterfaceC42642iJ3 f83954e;

    public C22393gd(Paint internalPaint) {
        Intrinsics.checkNotNullParameter(internalPaint, "internalPaint");
        this.f83950a = internalPaint;
        this.f83951b = C5016LW.f21593b.m96748B();
    }

    @Override // p000.InterfaceC43783kE3
    /* renamed from: a */
    public long mo29184a() {
        return C22702hd.m36154c(this.f83950a);
    }

    @Override // p000.InterfaceC43783kE3
    /* renamed from: b */
    public void mo29183b(int i) {
        C22702hd.m36140q(this.f83950a, i);
    }

    @Override // p000.InterfaceC43783kE3
    /* renamed from: c */
    public void mo29182c(int i) {
        C22702hd.m36143n(this.f83950a, i);
    }

    @Override // p000.InterfaceC43783kE3
    /* renamed from: d */
    public int mo29181d() {
        return C22702hd.m36152e(this.f83950a);
    }

    @Override // p000.InterfaceC43783kE3
    /* renamed from: e */
    public void mo29180e(int i) {
        C22702hd.m36139r(this.f83950a, i);
    }

    @Override // p000.InterfaceC43783kE3
    /* renamed from: f */
    public void mo29179f(long j) {
        C22702hd.m36145l(this.f83950a, j);
    }

    @Override // p000.InterfaceC43783kE3
    /* renamed from: g */
    public void mo29178g(float f) {
        C22702hd.m36147j(this.f83950a, f);
    }

    @Override // p000.InterfaceC43783kE3
    /* renamed from: h */
    public float mo29177h() {
        return C22702hd.m36155b(this.f83950a);
    }

    @Override // p000.InterfaceC43783kE3
    /* renamed from: i */
    public int mo29176i() {
        return C22702hd.m36151f(this.f83950a);
    }

    @Override // p000.InterfaceC43783kE3
    /* renamed from: j */
    public float mo29175j() {
        return C22702hd.m36150g(this.f83950a);
    }

    @Override // p000.InterfaceC43783kE3
    /* renamed from: k */
    public Paint mo29174k() {
        return this.f83950a;
    }

    @Override // p000.InterfaceC43783kE3
    /* renamed from: l */
    public Shader mo29173l() {
        return this.f83952c;
    }

    @Override // p000.InterfaceC43783kE3
    /* renamed from: m */
    public void mo29172m(float f) {
        C22702hd.m36138s(this.f83950a, f);
    }

    @Override // p000.InterfaceC43783kE3
    /* renamed from: n */
    public void mo29171n(C48841sm0 c48841sm0) {
        this.f83953d = c48841sm0;
        C22702hd.m36144m(this.f83950a, c48841sm0);
    }

    @Override // p000.InterfaceC43783kE3
    /* renamed from: o */
    public void mo29170o(int i) {
        C22702hd.m36136u(this.f83950a, i);
    }

    @Override // p000.InterfaceC43783kE3
    /* renamed from: p */
    public void mo29169p(float f) {
        C22702hd.m36137t(this.f83950a, f);
    }

    @Override // p000.InterfaceC43783kE3
    /* renamed from: q */
    public float mo29168q() {
        return C22702hd.m36149h(this.f83950a);
    }

    @Override // p000.InterfaceC43783kE3
    /* renamed from: r */
    public void mo29167r(int i) {
        if (!C5016LW.m96779G(this.f83951b, i)) {
            this.f83951b = i;
            C22702hd.m36146k(this.f83950a, i);
        }
    }

    @Override // p000.InterfaceC43783kE3
    /* renamed from: s */
    public C48841sm0 mo29166s() {
        return this.f83953d;
    }

    @Override // p000.InterfaceC43783kE3
    /* renamed from: t */
    public void mo29165t(InterfaceC42642iJ3 interfaceC42642iJ3) {
        C22702hd.m36142o(this.f83950a, interfaceC42642iJ3);
        this.f83954e = interfaceC42642iJ3;
    }

    @Override // p000.InterfaceC43783kE3
    /* renamed from: u */
    public InterfaceC42642iJ3 mo29164u() {
        return this.f83954e;
    }

    @Override // p000.InterfaceC43783kE3
    /* renamed from: v */
    public int mo29163v() {
        return this.f83951b;
    }

    @Override // p000.InterfaceC43783kE3
    /* renamed from: w */
    public void mo29162w(Shader shader) {
        this.f83952c = shader;
        C22702hd.m36141p(this.f83950a, shader);
    }

    @Override // p000.InterfaceC43783kE3
    /* renamed from: x */
    public int mo29161x() {
        return C22702hd.m36153d(this.f83950a);
    }

    public C22393gd() {
        this(C22702hd.m36148i());
    }
}
