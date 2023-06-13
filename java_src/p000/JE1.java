package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\tø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0013\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0016"}, m28432d2 = {"LJE1;", "LzY3;", "LD52;", "anchorBounds", "LG52;", "windowSize", "Lpm2;", "layoutDirection", "popupContentSize", "LA52;", "calculatePosition-llwVHH4", "(LD52;JLpm2;J)J", "calculatePosition", "LLE1;", C17296a.f69688o, "LLE1;", "handleReferencePoint", "b", "J", "offset", "<init>", "(LLE1;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: JE1 */
/* loaded from: classes.dex */
public final class JE1 implements InterfaceC52856zY3 {

    /* renamed from: a */
    public final LE1 f17064a;

    /* renamed from: b */
    public final long f17065b;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: JE1$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C3939a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LE1.values().length];
            try {
                iArr[LE1.TopLeft.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LE1.TopRight.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LE1.TopMiddle.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ JE1(LE1 le1, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(le1, j);
    }

    @Override // p000.InterfaceC52856zY3
    /* renamed from: calculatePosition-llwVHH4  reason: not valid java name */
    public long mo116225calculatePositionllwVHH4(D52 anchorBounds, long j, EnumC47065pm2 layoutDirection, long j2) {
        Intrinsics.checkNotNullParameter(anchorBounds, "anchorBounds");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int i = C3939a.$EnumSwitchMapping$0[this.f17064a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return B52.m114704a((anchorBounds.m110922c() + A52.m116111j(this.f17065b)) - (G52.m105829g(j2) / 2), anchorBounds.m110920e() + A52.m116110k(this.f17065b));
                }
                throw new NoWhenBranchMatchedException();
            }
            return B52.m114704a((anchorBounds.m110922c() + A52.m116111j(this.f17065b)) - G52.m105829g(j2), anchorBounds.m110920e() + A52.m116110k(this.f17065b));
        }
        return B52.m114704a(anchorBounds.m110922c() + A52.m116111j(this.f17065b), anchorBounds.m110920e() + A52.m116110k(this.f17065b));
    }

    public JE1(LE1 le1, long j) {
        this.f17064a = le1;
        this.f17065b = j;
    }
}
