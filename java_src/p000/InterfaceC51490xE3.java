package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H&J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H&J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H&J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H&J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H&J\u001a\u0010\u0013\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0011H&J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0011H&J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u0002H&J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u0002H&J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u000bH&J\u001d\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H&J \u0010\"\u001a\u00020!2\u0006\u0010\u0007\u001a\u00020\u0002H&ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#JU\u00101\u001a\u0002002\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010/\u001a\u00020.H'ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102J]\u00106\u001a\u0002002\u0006\u0010%\u001a\u00020$2\u0006\u00104\u001a\u0002032\b\b\u0002\u00105\u001a\u00020\u000b2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010/\u001a\u00020.H'ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u00109R\u0014\u0010>\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u00109R\u0014\u0010@\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u00109R\u0014\u0010B\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\bA\u00109R\u0014\u0010E\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010H\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u001c\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0I8&X¦\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010K\u0082\u0001\u0001Mø\u0001\u0003\u0082\u0002\u0015\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!\n\u0004\b!0\u0001¨\u0006NÀ\u0006\u0001"}, m28432d2 = {"LxE3;", "", "", "start", "end", "LcJ3;", "p", "offset", "LOs4;", "l", "lineIndex", "", "j", "n", "c", "k", "g", "", "visibleEnd", "h", "u", "usePrimaryDirection", "q", "LUL4;", "b", "v", "vertical", "i", "LCe3;", "position", "f", "(J)I", "w", "Ls26;", DateTokenConverter.CONVERTER_KEY, "(I)J", "Lme0;", "canvas", "Lpm0;", "color", "LPx5;", "shadow", "LR06;", "textDecoration", "LJ61;", "drawStyle", "LLW;", "blendMode", "", "t", "(Lme0;JLPx5;LR06;LJ61;I)V", "La30;", "brush", "alpha", "r", "(Lme0;La30;FLPx5;LR06;LJ61;I)V", "getWidth", "()F", "width", "getHeight", "height", C17296a.f69688o, "minIntrinsicWidth", "e", "firstBaseline", "s", "lastBaseline", "o", "()Z", "didExceedMaxLines", "m", "()I", "lineCount", "", "x", "()Ljava/util/List;", "placeholderRects", "Lid;", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: xE3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC51490xE3 {
    /* renamed from: a */
    float mo5643a();

    /* renamed from: b */
    UL4 mo5642b(int i);

    /* renamed from: c */
    float mo5641c(int i);

    /* renamed from: d */
    long mo5640d(int i);

    /* renamed from: e */
    float mo5639e();

    /* renamed from: f */
    int mo5638f(long j);

    /* renamed from: g */
    int mo5637g(int i);

    float getHeight();

    float getWidth();

    /* renamed from: h */
    int mo5636h(int i, boolean z);

    /* renamed from: i */
    int mo5635i(float f);

    /* renamed from: j */
    float mo5634j(int i);

    /* renamed from: k */
    float mo5633k(int i);

    /* renamed from: l */
    C35055Os4 mo5632l(int i);

    /* renamed from: m */
    int mo5631m();

    /* renamed from: n */
    float mo5630n(int i);

    /* renamed from: o */
    boolean mo5629o();

    /* renamed from: p */
    InterfaceC39067cJ3 mo5628p(int i, int i2);

    /* renamed from: q */
    float mo5627q(int i, boolean z);

    /* renamed from: r */
    void mo5626r(InterfaceC45204me0 interfaceC45204me0, AbstractC37727a30 abstractC37727a30, float f, C35335Px5 c35335Px5, R06 r06, J61 j61, int i);

    /* renamed from: s */
    float mo5625s();

    /* renamed from: t */
    void mo5624t(InterfaceC45204me0 interfaceC45204me0, long j, C35335Px5 c35335Px5, R06 r06, J61 j61, int i);

    /* renamed from: u */
    int mo5623u(int i);

    /* renamed from: v */
    UL4 mo5622v(int i);

    /* renamed from: w */
    C35055Os4 mo5621w(int i);

    /* renamed from: x */
    List<C35055Os4> mo5620x();
}
