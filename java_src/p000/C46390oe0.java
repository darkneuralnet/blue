package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.PublishedApi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import no.nordicsemi.android.ble.AbstractC26684u0;
@Metadata(m28433d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001nB\u0007¢\u0006\u0004\bm\u0010ZJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002JK\u0010\u0013\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014JI\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018Jm\u0010!\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J!\u0010#\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\f\u001a\u00020\u000bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$Ja\u0010)\u001a\u00020(2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*JO\u0010.\u001a\u00020(2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010+\u001a\u00020%2\u0006\u0010-\u001a\u00020,2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/JO\u00100\u001a\u00020(2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010+\u001a\u00020%2\u0006\u0010-\u001a\u00020,2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101JG\u00104\u001a\u00020(2\u0006\u00103\u001a\u0002022\u0006\u0010+\u001a\u00020%2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105Jg\u0010<\u001a\u00020(2\u0006\u00103\u001a\u0002022\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u0002062\u0006\u0010;\u001a\u0002082\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b<\u0010=JW\u0010@\u001a\u00020(2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010+\u001a\u00020%2\u0006\u0010-\u001a\u00020,2\u0006\u0010?\u001a\u00020>2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010AJW\u0010B\u001a\u00020(2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010+\u001a\u00020%2\u0006\u0010-\u001a\u00020,2\u0006\u0010?\u001a\u00020>2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bB\u0010CJO\u0010F\u001a\u00020(2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010D\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020%2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bF\u0010GJg\u0010L\u001a\u00020(2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010H\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020J2\u0006\u0010+\u001a\u00020%2\u0006\u0010-\u001a\u00020,2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bL\u0010MJG\u0010P\u001a\u00020(2\u0006\u0010O\u001a\u00020N2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bP\u0010QJG\u0010R\u001a\u00020(2\u0006\u0010O\u001a\u00020N2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bR\u0010SR \u0010[\u001a\u00020T8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bU\u0010V\u0012\u0004\bY\u0010Z\u001a\u0004\bW\u0010XR\u001a\u0010`\u001a\u00020\\8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010]\u001a\u0004\b^\u0010_R\u0018\u0010c\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010d\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010bR\u0014\u0010h\u001a\u00020e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0014\u0010j\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010iR\u0014\u0010l\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010i\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006o"}, m28432d2 = {"Loe0;", "LI61;", "LkE3;", "v", "y", "LJ61;", "drawStyle", "A", "La30;", "brush", "style", "", "alpha", "Lsm0;", "colorFilter", "LLW;", "blendMode", "LRl1;", "filterQuality", "e", "(La30;LJ61;FLsm0;II)LkE3;", "Lpm0;", "color", "c", "(JLJ61;FLsm0;II)LkE3;", "strokeWidth", "miter", "LLS5;", "cap", "LNS5;", "join", "LiJ3;", "pathEffect", "i", "(La30;FFIILiJ3;FLsm0;II)LkE3;", "t", "(JF)J", "LCe3;", "start", "end", "", "K", "(La30;JJFILiJ3;FLsm0;I)V", "topLeft", "LxB5;", "size", "m0", "(La30;JJFLJ61;Lsm0;I)V", "k0", "(JJJFLJ61;Lsm0;I)V", "LMW1;", Entry.TYPE_IMAGE, "i0", "(LMW1;JFLJ61;Lsm0;I)V", "LA52;", "srcOffset", "LG52;", "srcSize", "dstOffset", "dstSize", "N0", "(LMW1;JJJJFLJ61;Lsm0;II)V", "LLC0;", "cornerRadius", "R", "(La30;JJJFLJ61;Lsm0;I)V", "W0", "(JJJJLJ61;FLsm0;I)V", "radius", "center", "I", "(JFJFLJ61;Lsm0;I)V", "startAngle", "sweepAngle", "", "useCenter", AbstractC26684u0.f100690q, "(JFFZJJFLJ61;Lsm0;I)V", "LcJ3;", "path", "Z", "(LcJ3;JFLJ61;Lsm0;I)V", "j0", "(LcJ3;La30;FLJ61;Lsm0;I)V", "Loe0$a;", "b", "Loe0$a;", "o", "()Loe0$a;", "getDrawParams$annotations", "()V", "drawParams", "LC61;", "LC61;", "d0", "()LC61;", "drawContext", DateTokenConverter.CONVERTER_KEY, "LkE3;", "fillPaint", "strokePaint", "Lpm2;", "getLayoutDirection", "()Lpm2;", "layoutDirection", "()F", "density", "R0", "fontScale", "<init>", C17296a.f69688o, "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCanvasDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,804:1\n1#2:805\n*E\n"})
/* renamed from: oe0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46390oe0 implements I61 {

    /* renamed from: b */
    public final C27018a f102236b = new C27018a(null, null, null, 0, 15, null);

    /* renamed from: c */
    public final C61 f102237c = new C27019b();

    /* renamed from: d */
    public InterfaceC43783kE3 f102238d;

    /* renamed from: e */
    public InterfaceC43783kE3 f102239e;

    @Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0081\b\u0018\u00002\u00020\u0001B2\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0004\u0012\b\b\u0002\u0010#\u001a\u00020\u0006\u0012\b\b\u0002\u0010(\u001a\u00020\bø\u0001\u0002¢\u0006\u0004\b)\u0010*J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u0019\u0010\t\u001a\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001d\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010#\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R+\u0010(\u001a\u00020\b8\u0006@\u0006X\u0086\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\n\"\u0004\b&\u0010'\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006+"}, m28432d2 = {"Loe0$a;", "", "Lg01;", C17296a.f69688o, "Lpm2;", "b", "Lme0;", "c", "LxB5;", DateTokenConverter.CONVERTER_KEY, "()J", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lg01;", "f", "()Lg01;", "j", "(Lg01;)V", "density", "Lpm2;", "g", "()Lpm2;", "k", "(Lpm2;)V", "layoutDirection", "Lme0;", "e", "()Lme0;", "i", "(Lme0;)V", "canvas", "J", "h", "l", "(J)V", "size", "<init>", "(Lg01;Lpm2;Lme0;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @PublishedApi
    /* renamed from: oe0$a */
    /* loaded from: classes.dex */
    public static final class C27018a {

        /* renamed from: a */
        public InterfaceC41273g01 f102240a;

        /* renamed from: b */
        public EnumC47065pm2 f102241b;

        /* renamed from: c */
        public InterfaceC45204me0 f102242c;

        /* renamed from: d */
        public long f102243d;

        public /* synthetic */ C27018a(InterfaceC41273g01 interfaceC41273g01, EnumC47065pm2 enumC47065pm2, InterfaceC45204me0 interfaceC45204me0, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(interfaceC41273g01, enumC47065pm2, interfaceC45204me0, j);
        }

        /* renamed from: a */
        public final InterfaceC41273g01 m20736a() {
            return this.f102240a;
        }

        /* renamed from: b */
        public final EnumC47065pm2 m20735b() {
            return this.f102241b;
        }

        /* renamed from: c */
        public final InterfaceC45204me0 m20734c() {
            return this.f102242c;
        }

        /* renamed from: d */
        public final long m20733d() {
            return this.f102243d;
        }

        /* renamed from: e */
        public final InterfaceC45204me0 m20732e() {
            return this.f102242c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C27018a) {
                C27018a c27018a = (C27018a) obj;
                return Intrinsics.areEqual(this.f102240a, c27018a.f102240a) && this.f102241b == c27018a.f102241b && Intrinsics.areEqual(this.f102242c, c27018a.f102242c) && C51465xB5.m5733f(this.f102243d, c27018a.f102243d);
            }
            return false;
        }

        /* renamed from: f */
        public final InterfaceC41273g01 m20731f() {
            return this.f102240a;
        }

        /* renamed from: g */
        public final EnumC47065pm2 m20730g() {
            return this.f102241b;
        }

        /* renamed from: h */
        public final long m20729h() {
            return this.f102243d;
        }

        public int hashCode() {
            return (((((this.f102240a.hashCode() * 31) + this.f102241b.hashCode()) * 31) + this.f102242c.hashCode()) * 31) + C51465xB5.m5729j(this.f102243d);
        }

        /* renamed from: i */
        public final void m20728i(InterfaceC45204me0 interfaceC45204me0) {
            Intrinsics.checkNotNullParameter(interfaceC45204me0, "<set-?>");
            this.f102242c = interfaceC45204me0;
        }

        /* renamed from: j */
        public final void m20727j(InterfaceC41273g01 interfaceC41273g01) {
            Intrinsics.checkNotNullParameter(interfaceC41273g01, "<set-?>");
            this.f102240a = interfaceC41273g01;
        }

        /* renamed from: k */
        public final void m20726k(EnumC47065pm2 enumC47065pm2) {
            Intrinsics.checkNotNullParameter(enumC47065pm2, "<set-?>");
            this.f102241b = enumC47065pm2;
        }

        /* renamed from: l */
        public final void m20725l(long j) {
            this.f102243d = j;
        }

        public String toString() {
            return "DrawParams(density=" + this.f102240a + ", layoutDirection=" + this.f102241b + ", canvas=" + this.f102242c + ", size=" + ((Object) C51465xB5.m5726m(this.f102243d)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public C27018a(InterfaceC41273g01 interfaceC41273g01, EnumC47065pm2 enumC47065pm2, InterfaceC45204me0 interfaceC45204me0, long j) {
            this.f102240a = interfaceC41273g01;
            this.f102241b = enumC47065pm2;
            this.f102242c = interfaceC45204me0;
            this.f102243d = j;
        }

        public /* synthetic */ C27018a(InterfaceC41273g01 interfaceC41273g01, EnumC47065pm2 enumC47065pm2, InterfaceC45204me0 interfaceC45204me0, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C46983pe0.f103870a : interfaceC41273g01, (i & 2) != 0 ? EnumC47065pm2.Ltr : enumC47065pm2, (i & 4) != 0 ? new C35124Pa1() : interfaceC45204me0, (i & 8) != 0 ? C51465xB5.f117175b.m5723b() : j, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\tR-\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, m28432d2 = {"oe0$b", "LC61;", "LL61;", C17296a.f69688o, "LL61;", "c", "()LL61;", "transform", "Lme0;", "()Lme0;", "canvas", "LxB5;", "value", "h", "()J", "b", "(J)V", "size", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: oe0$b */
    /* loaded from: classes.dex */
    public static final class C27019b implements C61 {

        /* renamed from: a */
        public final L61 f102244a;

        public C27019b() {
            L61 m19029c;
            m19029c = C46983pe0.m19029c(this);
            this.f102244a = m19029c;
        }

        @Override // p000.C61
        /* renamed from: a */
        public InterfaceC45204me0 mo20724a() {
            return C46390oe0.this.m20741o().m20732e();
        }

        @Override // p000.C61
        /* renamed from: b */
        public void mo20723b(long j) {
            C46390oe0.this.m20741o().m20725l(j);
        }

        @Override // p000.C61
        /* renamed from: c */
        public L61 mo20722c() {
            return this.f102244a;
        }

        @Override // p000.C61
        /* renamed from: h */
        public long mo20721h() {
            return C46390oe0.this.m20741o().m20729h();
        }
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC43783kE3 m20751d(C46390oe0 c46390oe0, long j, J61 j61, float f, C48841sm0 c48841sm0, int i, int i2, int i3, Object obj) {
        int i4;
        if ((i3 & 32) != 0) {
            i4 = I61.f14524O.m102943b();
        } else {
            i4 = i2;
        }
        return c46390oe0.m20752c(j, j61, f, c48841sm0, i, i4);
    }

    /* renamed from: f */
    public static /* synthetic */ InterfaceC43783kE3 m20748f(C46390oe0 c46390oe0, AbstractC37727a30 abstractC37727a30, J61 j61, float f, C48841sm0 c48841sm0, int i, int i2, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            i2 = I61.f14524O.m102943b();
        }
        return c46390oe0.m20749e(abstractC37727a30, j61, f, c48841sm0, i, i2);
    }

    /* renamed from: n */
    public static /* synthetic */ InterfaceC43783kE3 m20742n(C46390oe0 c46390oe0, AbstractC37727a30 abstractC37727a30, float f, float f2, int i, int i2, InterfaceC42642iJ3 interfaceC42642iJ3, float f3, C48841sm0 c48841sm0, int i3, int i4, int i5, Object obj) {
        int i6;
        if ((i5 & 512) != 0) {
            i6 = I61.f14524O.m102943b();
        } else {
            i6 = i4;
        }
        return c46390oe0.m20747i(abstractC37727a30, f, f2, i, i2, interfaceC42642iJ3, f3, c48841sm0, i3, i6);
    }

    /* renamed from: A */
    public final InterfaceC43783kE3 m20759A(J61 j61) {
        boolean z;
        if (Intrinsics.areEqual(j61, C52982zl1.f122162a)) {
            return m20738v();
        }
        if (j61 instanceof KS5) {
            InterfaceC43783kE3 m20737y = m20737y();
            KS5 ks5 = (KS5) j61;
            boolean z2 = true;
            if (m20737y.mo29168q() == ks5.m98859f()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                m20737y.mo29169p(ks5.m98859f());
            }
            if (!LS5.m96924g(m20737y.mo29181d(), ks5.m98863b())) {
                m20737y.mo29183b(ks5.m98863b());
            }
            if (m20737y.mo29175j() != ks5.m98861d()) {
                z2 = false;
            }
            if (!z2) {
                m20737y.mo29172m(ks5.m98861d());
            }
            if (!NS5.m93883g(m20737y.mo29176i(), ks5.m98862c())) {
                m20737y.mo29180e(ks5.m98862c());
            }
            if (!Intrinsics.areEqual(m20737y.mo29164u(), ks5.m98860e())) {
                m20737y.mo29165t(ks5.m98860e());
            }
            return m20737y;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // p000.I61
    /* renamed from: I */
    public void mo20758I(long j, float f, long j2, float f2, J61 style, C48841sm0 c48841sm0, int i) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f102236b.m20732e().mo25257j(j2, f, m20751d(this, j, style, f2, c48841sm0, i, 0, 32, null));
    }

    @Override // p000.I61
    /* renamed from: K */
    public void mo20757K(AbstractC37727a30 brush, long j, long j2, float f, int i, InterfaceC42642iJ3 interfaceC42642iJ3, float f2, C48841sm0 c48841sm0, int i2) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        this.f102236b.m20732e().mo25260g(j, j2, m20742n(this, brush, f, 4.0f, i, NS5.f24612b.m93878b(), interfaceC42642iJ3, f2, c48841sm0, i2, 0, 512, null));
    }

    @Override // p000.I61
    /* renamed from: N0 */
    public void mo20756N0(MW1 image, long j, long j2, long j3, long j4, float f, J61 style, C48841sm0 c48841sm0, int i, int i2) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f102236b.m20732e().mo25263d(image, j, j2, j3, j4, m20749e(null, style, f, c48841sm0, i, i2));
    }

    @Override // p000.I61
    /* renamed from: R */
    public void mo20755R(AbstractC37727a30 brush, long j, long j2, long j3, float f, J61 style, C48841sm0 c48841sm0, int i) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f102236b.m20732e().mo25259h(C32120Ce3.m111944o(j), C32120Ce3.m111943p(j), C32120Ce3.m111944o(j) + C51465xB5.m5730i(j2), C32120Ce3.m111943p(j) + C51465xB5.m5732g(j2), LC0.m97601d(j3), LC0.m97600e(j3), m20748f(this, brush, style, f, c48841sm0, i, 0, 32, null));
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: R0 */
    public float mo3412R0() {
        return this.f102236b.m20731f().mo3412R0();
    }

    @Override // p000.I61
    /* renamed from: W0 */
    public void mo20754W0(long j, long j2, long j3, long j4, J61 style, float f, C48841sm0 c48841sm0, int i) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f102236b.m20732e().mo25259h(C32120Ce3.m111944o(j2), C32120Ce3.m111943p(j2), C32120Ce3.m111944o(j2) + C51465xB5.m5730i(j3), C32120Ce3.m111943p(j2) + C51465xB5.m5732g(j3), LC0.m97601d(j4), LC0.m97600e(j4), m20751d(this, j, style, f, c48841sm0, i, 0, 32, null));
    }

    @Override // p000.I61
    /* renamed from: Z */
    public void mo20753Z(InterfaceC39067cJ3 path, long j, float f, J61 style, C48841sm0 c48841sm0, int i) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f102236b.m20732e().mo25247t(path, m20751d(this, j, style, f, c48841sm0, i, 0, 32, null));
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: b */
    public float mo3408b() {
        return this.f102236b.m20731f().mo3408b();
    }

    /* renamed from: c */
    public final InterfaceC43783kE3 m20752c(long j, J61 j61, float f, C48841sm0 c48841sm0, int i, int i2) {
        InterfaceC43783kE3 m20759A = m20759A(j61);
        long m20740t = m20740t(j, f);
        if (!C47063pm0.m18741o(m20759A.mo29184a(), m20740t)) {
            m20759A.mo29179f(m20740t);
        }
        if (m20759A.mo29173l() != null) {
            m20759A.mo29162w(null);
        }
        if (!Intrinsics.areEqual(m20759A.mo29166s(), c48841sm0)) {
            m20759A.mo29171n(c48841sm0);
        }
        if (!C5016LW.m96779G(m20759A.mo29163v(), i)) {
            m20759A.mo29167r(i);
        }
        if (!C35691Rl1.m86331d(m20759A.mo29161x(), i2)) {
            m20759A.mo29182c(i2);
        }
        return m20759A;
    }

    @Override // p000.I61
    /* renamed from: d0 */
    public C61 mo20750d0() {
        return this.f102237c;
    }

    /* renamed from: e */
    public final InterfaceC43783kE3 m20749e(AbstractC37727a30 abstractC37727a30, J61 j61, float f, C48841sm0 c48841sm0, int i, int i2) {
        boolean z;
        InterfaceC43783kE3 m20759A = m20759A(j61);
        if (abstractC37727a30 != null) {
            abstractC37727a30.mo19362a(mo96360h(), m20759A, f);
        } else {
            if (m20759A.mo29177h() == f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                m20759A.mo29178g(f);
            }
        }
        if (!Intrinsics.areEqual(m20759A.mo29166s(), c48841sm0)) {
            m20759A.mo29171n(c48841sm0);
        }
        if (!C5016LW.m96779G(m20759A.mo29163v(), i)) {
            m20759A.mo29167r(i);
        }
        if (!C35691Rl1.m86331d(m20759A.mo29161x(), i2)) {
            m20759A.mo29182c(i2);
        }
        return m20759A;
    }

    @Override // p000.I61
    public EnumC47065pm2 getLayoutDirection() {
        return this.f102236b.m20730g();
    }

    /* renamed from: i */
    public final InterfaceC43783kE3 m20747i(AbstractC37727a30 abstractC37727a30, float f, float f2, int i, int i2, InterfaceC42642iJ3 interfaceC42642iJ3, float f3, C48841sm0 c48841sm0, int i3, int i4) {
        boolean z;
        boolean z2;
        InterfaceC43783kE3 m20737y = m20737y();
        boolean z3 = true;
        if (abstractC37727a30 != null) {
            abstractC37727a30.mo19362a(mo96360h(), m20737y, f3);
        } else {
            if (m20737y.mo29177h() == f3) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                m20737y.mo29178g(f3);
            }
        }
        if (!Intrinsics.areEqual(m20737y.mo29166s(), c48841sm0)) {
            m20737y.mo29171n(c48841sm0);
        }
        if (!C5016LW.m96779G(m20737y.mo29163v(), i3)) {
            m20737y.mo29167r(i3);
        }
        if (m20737y.mo29168q() == f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            m20737y.mo29169p(f);
        }
        if (m20737y.mo29175j() != f2) {
            z3 = false;
        }
        if (!z3) {
            m20737y.mo29172m(f2);
        }
        if (!LS5.m96924g(m20737y.mo29181d(), i)) {
            m20737y.mo29183b(i);
        }
        if (!NS5.m93883g(m20737y.mo29176i(), i2)) {
            m20737y.mo29180e(i2);
        }
        if (!Intrinsics.areEqual(m20737y.mo29164u(), interfaceC42642iJ3)) {
            m20737y.mo29165t(interfaceC42642iJ3);
        }
        if (!C35691Rl1.m86331d(m20737y.mo29161x(), i4)) {
            m20737y.mo29182c(i4);
        }
        return m20737y;
    }

    @Override // p000.I61
    /* renamed from: i0 */
    public void mo20746i0(MW1 image, long j, float f, J61 style, C48841sm0 c48841sm0, int i) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f102236b.m20732e().mo25250q(image, j, m20748f(this, null, style, f, c48841sm0, i, 0, 32, null));
    }

    @Override // p000.I61
    /* renamed from: j0 */
    public void mo20745j0(InterfaceC39067cJ3 path, AbstractC37727a30 brush, float f, J61 style, C48841sm0 c48841sm0, int i) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f102236b.m20732e().mo25247t(path, m20748f(this, brush, style, f, c48841sm0, i, 0, 32, null));
    }

    @Override // p000.I61
    /* renamed from: k0 */
    public void mo20744k0(long j, long j2, long j3, float f, J61 style, C48841sm0 c48841sm0, int i) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f102236b.m20732e().mo25256k(C32120Ce3.m111944o(j2), C32120Ce3.m111943p(j2), C32120Ce3.m111944o(j2) + C51465xB5.m5730i(j3), C32120Ce3.m111943p(j2) + C51465xB5.m5732g(j3), m20751d(this, j, style, f, c48841sm0, i, 0, 32, null));
    }

    @Override // p000.I61
    /* renamed from: m0 */
    public void mo20743m0(AbstractC37727a30 brush, long j, long j2, float f, J61 style, C48841sm0 c48841sm0, int i) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f102236b.m20732e().mo25256k(C32120Ce3.m111944o(j), C32120Ce3.m111943p(j), C32120Ce3.m111944o(j) + C51465xB5.m5730i(j2), C32120Ce3.m111943p(j) + C51465xB5.m5732g(j2), m20748f(this, brush, style, f, c48841sm0, i, 0, 32, null));
    }

    /* renamed from: o */
    public final C27018a m20741o() {
        return this.f102236b;
    }

    /* renamed from: t */
    public final long m20740t(long j, float f) {
        return !((f > 1.0f ? 1 : (f == 1.0f ? 0 : -1)) == 0) ? C47063pm0.m18743m(j, C47063pm0.m18740p(j) * f, 0.0f, 0.0f, 0.0f, 14, null) : j;
    }

    @Override // p000.I61
    /* renamed from: u0 */
    public void mo20739u0(long j, float f, float f2, boolean z, long j2, long j3, float f3, J61 style, C48841sm0 c48841sm0, int i) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f102236b.m20732e().mo25252o(C32120Ce3.m111944o(j2), C32120Ce3.m111943p(j2), C32120Ce3.m111944o(j2) + C51465xB5.m5730i(j3), C32120Ce3.m111943p(j2) + C51465xB5.m5732g(j3), f, f2, z, m20751d(this, j, style, f3, c48841sm0, i, 0, 32, null));
    }

    /* renamed from: v */
    public final InterfaceC43783kE3 m20738v() {
        InterfaceC43783kE3 interfaceC43783kE3 = this.f102238d;
        if (interfaceC43783kE3 == null) {
            InterfaceC43783kE3 m36156a = C22702hd.m36156a();
            m36156a.mo29170o(C47341qE3.f104958a.m17855a());
            this.f102238d = m36156a;
            return m36156a;
        }
        return interfaceC43783kE3;
    }

    /* renamed from: y */
    public final InterfaceC43783kE3 m20737y() {
        InterfaceC43783kE3 interfaceC43783kE3 = this.f102239e;
        if (interfaceC43783kE3 == null) {
            InterfaceC43783kE3 m36156a = C22702hd.m36156a();
            m36156a.mo29170o(C47341qE3.f104958a.m17854b());
            this.f102239e = m36156a;
            return m36156a;
        }
        return interfaceC43783kE3;
    }
}
