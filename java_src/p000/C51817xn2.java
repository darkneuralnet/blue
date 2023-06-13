package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002Bw\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\u0006\u0010\u001b\u001a\u00020\u0016\u0012\u0006\u0010=\u001a\u00020\u0002\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0006\u0010\"\u001a\u00020\u000b\u0012\u0006\u0010$\u001a\u00020\u000b\u0012\u0006\u0010%\u001a\u00020\u000b\u0012\u0006\u0010(\u001a\u00020\u0011\u0012\u0006\u0010.\u001a\u00020)\u0012\u0006\u00101\u001a\u00020\u000b\u0012\u0006\u00104\u001a\u00020\u000b¢\u0006\u0004\b>\u0010?J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0001R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\f\u0010\u001fR\u001a\u0010\"\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b!\u0010\u000fR\u001a\u0010$\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b#\u0010\u000fR\u001a\u0010%\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0006\u0010\u000fR\u001a\u0010(\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010\u0012\u001a\u0004\b'\u0010\u0014R\u001a\u0010.\u001a\u00020)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u00101\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010\r\u001a\u0004\b0\u0010\u000fR\u001a\u00104\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u0010\r\u001a\u0004\b3\u0010\u000fR \u00108\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u000b058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u00107R\u0014\u0010:\u001a\u00020\u000b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b9\u0010\u000fR\u0014\u0010<\u001a\u00020\u000b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b;\u0010\u000f¨\u0006@"}, m28432d2 = {"Lxn2;", "Lvn2;", "LyO2;", "", "c", "Lzn2;", C17296a.f69688o, "Lzn2;", "g", "()Lzn2;", "firstVisibleLine", "", "b", "I", "h", "()I", "firstVisibleLineScrollOffset", "", "Z", "e", "()Z", "canScrollForward", "", DateTokenConverter.CONVERTER_KEY, "F", "f", "()F", "consumedScroll", "", "Lln2;", "Ljava/util/List;", "()Ljava/util/List;", "visibleItemsInfo", "getViewportStartOffset", "viewportStartOffset", "getViewportEndOffset", "viewportEndOffset", "totalItemsCount", "i", "getReverseLayout", "reverseLayout", "LEy3;", "j", "LEy3;", "getOrientation", "()LEy3;", "orientation", "k", "getAfterContentPadding", "afterContentPadding", "l", "getMainAxisItemSpacing", "mainAxisItemSpacing", "", "LL9;", "()Ljava/util/Map;", "alignmentLines", "getHeight", "height", "getWidth", "width", "measureResult", "<init>", "(Lzn2;IZFLyO2;Ljava/util/List;IIIZLEy3;II)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: xn2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51817xn2 implements InterfaceC50631vn2, InterfaceC52172yO2 {

    /* renamed from: a */
    public final C53003zn2 f118103a;

    /* renamed from: b */
    public final int f118104b;

    /* renamed from: c */
    public final boolean f118105c;

    /* renamed from: d */
    public final float f118106d;

    /* renamed from: e */
    public final List<InterfaceC44703ln2> f118107e;

    /* renamed from: f */
    public final int f118108f;

    /* renamed from: g */
    public final int f118109g;

    /* renamed from: h */
    public final int f118110h;

    /* renamed from: i */
    public final boolean f118111i;

    /* renamed from: j */
    public final EnumC32768Ey3 f118112j;

    /* renamed from: k */
    public final int f118113k;

    /* renamed from: l */
    public final int f118114l;

    /* renamed from: m */
    public final /* synthetic */ InterfaceC52172yO2 f118115m;

    /* JADX WARN: Multi-variable type inference failed */
    public C51817xn2(C53003zn2 c53003zn2, int i, boolean z, float f, InterfaceC52172yO2 measureResult, List<? extends InterfaceC44703ln2> visibleItemsInfo, int i2, int i3, int i4, boolean z2, EnumC32768Ey3 orientation, int i5, int i6) {
        Intrinsics.checkNotNullParameter(measureResult, "measureResult");
        Intrinsics.checkNotNullParameter(visibleItemsInfo, "visibleItemsInfo");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.f118103a = c53003zn2;
        this.f118104b = i;
        this.f118105c = z;
        this.f118106d = f;
        this.f118107e = visibleItemsInfo;
        this.f118108f = i2;
        this.f118109g = i3;
        this.f118110h = i4;
        this.f118111i = z2;
        this.f118112j = orientation;
        this.f118113k = i5;
        this.f118114l = i6;
        this.f118115m = measureResult;
    }

    @Override // p000.InterfaceC50631vn2
    /* renamed from: a */
    public int mo4707a() {
        return this.f118110h;
    }

    @Override // p000.InterfaceC50631vn2
    /* renamed from: b */
    public List<InterfaceC44703ln2> mo4706b() {
        return this.f118107e;
    }

    @Override // p000.InterfaceC52172yO2
    /* renamed from: c */
    public void mo1429c() {
        this.f118115m.mo1429c();
    }

    @Override // p000.InterfaceC52172yO2
    /* renamed from: d */
    public Map<AbstractC4750L9, Integer> mo1428d() {
        return this.f118115m.mo1428d();
    }

    /* renamed from: e */
    public final boolean m4705e() {
        return this.f118105c;
    }

    /* renamed from: f */
    public final float m4704f() {
        return this.f118106d;
    }

    /* renamed from: g */
    public final C53003zn2 m4703g() {
        return this.f118103a;
    }

    @Override // p000.InterfaceC52172yO2
    public int getHeight() {
        return this.f118115m.getHeight();
    }

    @Override // p000.InterfaceC52172yO2
    public int getWidth() {
        return this.f118115m.getWidth();
    }

    /* renamed from: h */
    public final int m4702h() {
        return this.f118104b;
    }
}
