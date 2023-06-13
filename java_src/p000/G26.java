package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
@Metadata(m28433d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001<B'\b\u0000\u0012\u0006\u0010@\u001a\u00020\u0002\u0012\u0006\u0010D\u001a\u00020\u0004\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001B\u001b\b\u0010\u0012\u0006\u0010@\u001a\u00020\u0002\u0012\u0006\u0010D\u001a\u00020\u0004¢\u0006\u0006\b\u0084\u0001\u0010\u0086\u0001BÜ\u0001\b\u0017\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\t\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\b\b\u0002\u0010'\u001a\u00020\u000b\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(ø\u0001\u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0087\u0001B\u008c\u0002\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\t\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\b\b\u0002\u0010'\u001a\u00020\u000b\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102ø\u0001\u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0088\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\u0014\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0000H\u0007J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0004H\u0007Jã\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\t2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010'\u001a\u00020\u000b2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+J\u0091\u0002\u00104\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\t2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010'\u001a\u00020\u000b2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\n\b\u0002\u00103\u001a\u0004\u0018\u000102ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105J\u0013\u00107\u001a\u0002062\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u000e\u00108\u001a\u0002062\u0006\u0010\u0006\u001a\u00020\u0000J\b\u0010:\u001a\u000209H\u0016J\b\u0010;\u001a\u00020\u0015H\u0016R\u001a\u0010@\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010D\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010-\u001a\u0004\u0018\u00010,8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001c\u0010N\u001a\u0004\u0018\u00010I8GX\u0087\u0004¢\u0006\f\u0012\u0004\bL\u0010M\u001a\u0004\bJ\u0010KR\u001a\u0010\n\u001a\u00020\t8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bO\u0010PR\u001a\u0010U\u001a\u00020Q8GX\u0087\u0004¢\u0006\f\u0012\u0004\bT\u0010M\u001a\u0004\bR\u0010SR\u001a\u0010\f\u001a\u00020\u000b8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bV\u0010PR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\bW\u0010XR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b_\u0010`R\u001a\u0010\u0017\u001a\u00020\u000b8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\ba\u0010PR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\bf\u0010gR\u001a\u0010\u001e\u001a\u00020\t8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bh\u0010PR\u0013\u0010 \u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0013\u0010\"\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\bk\u0010lR\u001c\u0010q\u001a\u0004\u0018\u00010m8GX\u0087\u0004¢\u0006\f\u0012\u0004\bp\u0010M\u001a\u0004\bn\u0010oR\u001c\u0010$\u001a\u0004\u0018\u00010#8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\br\u0010sR\u001c\u0010&\u001a\u0004\u0018\u00010%8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bt\u0010uR\u001a\u0010'\u001a\u00020\u000b8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bv\u0010PR\u0013\u0010)\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0013\u0010/\u001a\u0004\u0018\u00010.8F¢\u0006\u0006\u001a\u0004\by\u0010zR\u001c\u00103\u001a\u0004\u0018\u0001028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b{\u0010|R\u001c\u00101\u001a\u0004\u0018\u0001008Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b}\u0010~R \u0010\u0083\u0001\u001a\u0004\u0018\u00010\u007f8GX\u0087\u0004¢\u0006\u000f\u0012\u0005\b\u0082\u0001\u0010M\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0089\u0001"}, m28432d2 = {"LG26;", "", "LGN5;", "L", "LDE3;", "K", LegacyRepairType.OTHER_KEY, "J", "I", "Lpm0;", "color", "LM26;", "fontSize", "LJw1;", "fontWeight", "LEw1;", "fontStyle", "LFw1;", "fontSynthesis", "Lkw1;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "LHE;", "baselineShift", "LL16;", "textGeometricTransform", "Luv2;", "localeList", "background", "LR06;", "textDecoration", "LPx5;", "shadow", "Lr06;", "textAlign", "LW06;", "textDirection", "lineHeight", "LN16;", "textIndent", DateTokenConverter.CONVERTER_KEY, "(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;)LG26;", "LlW3;", "platformStyle", "Lor2;", "lineHeightStyle", "Lfr2;", "lineBreak", "LUN1;", "hyphens", "b", "(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;LlW3;Lor2;Lfr2;LUN1;)LG26;", "", "equals", "H", "", "hashCode", "toString", C17296a.f69688o, "LGN5;", "A", "()LGN5;", "spanStyle", "LDE3;", "x", "()LDE3;", "paragraphStyle", "c", "LlW3;", "y", "()LlW3;", "La30;", "i", "()La30;", "getBrush$annotations", "()V", "brush", "j", "()J", "", "f", "()F", "getAlpha$annotations", "alpha", "n", "q", "()LJw1;", "o", "()LEw1;", "p", "()LFw1;", "l", "()Lkw1;", "m", "()Ljava/lang/String;", "s", "h", "()LHE;", "E", "()LL16;", "w", "()Luv2;", "g", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "()LR06;", "z", "()LPx5;", "LJ61;", "k", "()LJ61;", "getDrawStyle$annotations", "drawStyle", "B", "()Lr06;", "D", "()LW06;", "u", "F", "()LN16;", "v", "()Lor2;", "r", "()LUN1;", "t", "()Lfr2;", "Ll26;", "G", "()Ll26;", "getTextMotion$annotations", "textMotion", "<init>", "(LGN5;LDE3;LlW3;)V", "(LGN5;LDE3;)V", "(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;LlW3;Lor2;Lfr2;LUN1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: G26 */
/* loaded from: classes.dex */
public final class G26 {

    /* renamed from: d */
    public static final C2620a f10825d = new C2620a(null);

    /* renamed from: e */
    public static final G26 f10826e = new G26(0, 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, null, 0, null, null, null, null, null, 4194303, null);

    /* renamed from: a */
    public final GN5 f10827a;

    /* renamed from: b */
    public final DE3 f10828b;

    /* renamed from: c */
    public final C44538lW3 f10829c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m28432d2 = {"LG26$a;", "", "LG26;", "Default", "LG26;", C17296a.f69688o, "()LG26;", "getDefault$annotations", "()V", "<init>", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: G26$a */
    /* loaded from: classes.dex */
    public static final class C2620a {
        public /* synthetic */ C2620a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final G26 m105898a() {
            return G26.f10826e;
        }

        private C2620a() {
        }
    }

    public /* synthetic */ G26(long j, long j2, C33918Jw1 c33918Jw1, C32748Ew1 c32748Ew1, C32982Fw1 c32982Fw1, AbstractC44199kw1 abstractC44199kw1, String str, long j3, C3091HE c3091he, L16 l16, C50119uv2 c50119uv2, long j4, R06 r06, C35335Px5 c35335Px5, C47801r06 c47801r06, W06 w06, long j5, N16 n16, C44538lW3 c44538lW3, C46522or2 c46522or2, C41185fr2 c41185fr2, UN1 un1, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, c33918Jw1, c32748Ew1, c32982Fw1, abstractC44199kw1, str, j3, c3091he, l16, c50119uv2, j4, r06, c35335Px5, c47801r06, w06, j5, n16, c44538lW3, c46522or2, c41185fr2, un1);
    }

    /* renamed from: A */
    public final GN5 m105936A() {
        return this.f10827a;
    }

    /* renamed from: B */
    public final C47801r06 m105935B() {
        return this.f10828b.m110652j();
    }

    /* renamed from: C */
    public final R06 m105934C() {
        return this.f10827a.m105156s();
    }

    /* renamed from: D */
    public final W06 m105933D() {
        return this.f10828b.m110650l();
    }

    /* renamed from: E */
    public final L16 m105932E() {
        return this.f10827a.m105154u();
    }

    /* renamed from: F */
    public final N16 m105931F() {
        return this.f10828b.m110649m();
    }

    /* renamed from: G */
    public final C44263l26 m105930G() {
        return this.f10828b.m110648n();
    }

    /* renamed from: H */
    public final boolean m105929H(G26 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (this != other && (!Intrinsics.areEqual(this.f10828b, other.f10828b) || !this.f10827a.m105153v(other.f10827a))) {
            return false;
        }
        return true;
    }

    /* renamed from: I */
    public final G26 m105928I(DE3 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return new G26(m105925L(), m105926K().m110647o(other));
    }

    /* renamed from: J */
    public final G26 m105927J(G26 g26) {
        if (g26 != null && !Intrinsics.areEqual(g26, f10826e)) {
            return new G26(m105925L().m105151x(g26.m105925L()), m105926K().m110647o(g26.m105926K()));
        }
        return this;
    }

    /* renamed from: K */
    public final DE3 m105926K() {
        return this.f10828b;
    }

    /* renamed from: L */
    public final GN5 m105925L() {
        return this.f10827a;
    }

    /* renamed from: b */
    public final G26 m105923b(long j, long j2, C33918Jw1 c33918Jw1, C32748Ew1 c32748Ew1, C32982Fw1 c32982Fw1, AbstractC44199kw1 abstractC44199kw1, String str, long j3, C3091HE c3091he, L16 l16, C50119uv2 c50119uv2, long j4, R06 r06, C35335Px5 c35335Px5, C47801r06 c47801r06, W06 w06, long j5, N16 n16, C44538lW3 c44538lW3, C46522or2 c46522or2, C41185fr2 c41185fr2, UN1 un1) {
        H16 m104494b;
        if (C47063pm0.m18741o(j, this.f10827a.m105168g())) {
            m104494b = this.f10827a.m105155t();
        } else {
            m104494b = H16.f12733a.m104494b(j);
        }
        return new G26(new GN5(m104494b, j2, c33918Jw1, c32748Ew1, c32982Fw1, abstractC44199kw1, str, j3, c3091he, l16, c50119uv2, j4, r06, c35335Px5, c44538lW3 != null ? c44538lW3.m27190b() : null, m105914k(), (DefaultConstructorMarker) null), new DE3(c47801r06, w06, j5, n16, c44538lW3 != null ? c44538lW3.m27191a() : null, c46522or2, c41185fr2, un1, m105930G(), (DefaultConstructorMarker) null), c44538lW3);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "TextStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* renamed from: d */
    public final /* synthetic */ G26 m105921d(long j, long j2, C33918Jw1 c33918Jw1, C32748Ew1 c32748Ew1, C32982Fw1 c32982Fw1, AbstractC44199kw1 abstractC44199kw1, String str, long j3, C3091HE c3091he, L16 l16, C50119uv2 c50119uv2, long j4, R06 r06, C35335Px5 c35335Px5, C47801r06 c47801r06, W06 w06, long j5, N16 n16) {
        H16 m104494b;
        if (C47063pm0.m18741o(j, this.f10827a.m105168g())) {
            m104494b = this.f10827a.m105155t();
        } else {
            m104494b = H16.f12733a.m104494b(j);
        }
        return new G26(new GN5(m104494b, j2, c33918Jw1, c32748Ew1, c32982Fw1, abstractC44199kw1, str, j3, c3091he, l16, c50119uv2, j4, r06, c35335Px5, this.f10827a.m105158q(), this.f10827a.m105167h(), (DefaultConstructorMarker) null), new DE3(c47801r06, w06, j5, n16, this.f10828b.m110653i(), m105903v(), m105905t(), m105907r(), m105930G(), (DefaultConstructorMarker) null), this.f10829c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G26)) {
            return false;
        }
        G26 g26 = (G26) obj;
        if (Intrinsics.areEqual(this.f10827a, g26.f10827a) && Intrinsics.areEqual(this.f10828b, g26.f10828b) && Intrinsics.areEqual(this.f10829c, g26.f10829c)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final float m105919f() {
        return this.f10827a.m105172c();
    }

    /* renamed from: g */
    public final long m105918g() {
        return this.f10827a.m105171d();
    }

    /* renamed from: h */
    public final C3091HE m105917h() {
        return this.f10827a.m105170e();
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.f10827a.hashCode() * 31) + this.f10828b.hashCode()) * 31;
        C44538lW3 c44538lW3 = this.f10829c;
        if (c44538lW3 != null) {
            i = c44538lW3.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    /* renamed from: i */
    public final AbstractC37727a30 m105916i() {
        return this.f10827a.m105169f();
    }

    /* renamed from: j */
    public final long m105915j() {
        return this.f10827a.m105168g();
    }

    /* renamed from: k */
    public final J61 m105914k() {
        return this.f10827a.m105167h();
    }

    /* renamed from: l */
    public final AbstractC44199kw1 m105913l() {
        return this.f10827a.m105166i();
    }

    /* renamed from: m */
    public final String m105912m() {
        return this.f10827a.m105165j();
    }

    /* renamed from: n */
    public final long m105911n() {
        return this.f10827a.m105164k();
    }

    /* renamed from: o */
    public final C32748Ew1 m105910o() {
        return this.f10827a.m105163l();
    }

    /* renamed from: p */
    public final C32982Fw1 m105909p() {
        return this.f10827a.m105162m();
    }

    /* renamed from: q */
    public final C33918Jw1 m105908q() {
        return this.f10827a.m105161n();
    }

    /* renamed from: r */
    public final UN1 m105907r() {
        return this.f10828b.m110659c();
    }

    /* renamed from: s */
    public final long m105906s() {
        return this.f10827a.m105160o();
    }

    /* renamed from: t */
    public final C41185fr2 m105905t() {
        return this.f10828b.m110657e();
    }

    public String toString() {
        return "TextStyle(color=" + ((Object) C47063pm0.m18734v(m105915j())) + ", brush=" + m105916i() + ", alpha=" + m105919f() + ", fontSize=" + ((Object) M26.m95970j(m105911n())) + ", fontWeight=" + m105908q() + ", fontStyle=" + m105910o() + ", fontSynthesis=" + m105909p() + ", fontFamily=" + m105913l() + ", fontFeatureSettings=" + m105912m() + ", letterSpacing=" + ((Object) M26.m95970j(m105906s())) + ", baselineShift=" + m105917h() + ", textGeometricTransform=" + m105932E() + ", localeList=" + m105902w() + ", background=" + ((Object) C47063pm0.m18734v(m105918g())) + ", textDecoration=" + m105934C() + ", shadow=" + m105899z() + ", drawStyle=" + m105914k() + ", textAlign=" + m105935B() + ", textDirection=" + m105933D() + ", lineHeight=" + ((Object) M26.m95970j(m105904u())) + ", textIndent=" + m105931F() + ", platformStyle=" + this.f10829c + ", lineHeightStyle=" + m105903v() + ", lineBreak=" + m105905t() + ", hyphens=" + m105907r() + ", textMotion=" + m105930G() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* renamed from: u */
    public final long m105904u() {
        return this.f10828b.m110655g();
    }

    /* renamed from: v */
    public final C46522or2 m105903v() {
        return this.f10828b.m110654h();
    }

    /* renamed from: w */
    public final C50119uv2 m105902w() {
        return this.f10827a.m105159p();
    }

    /* renamed from: x */
    public final DE3 m105901x() {
        return this.f10828b;
    }

    /* renamed from: y */
    public final C44538lW3 m105900y() {
        return this.f10829c;
    }

    /* renamed from: z */
    public final C35335Px5 m105899z() {
        return this.f10827a.m105157r();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "TextStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public /* synthetic */ G26(long j, long j2, C33918Jw1 c33918Jw1, C32748Ew1 c32748Ew1, C32982Fw1 c32982Fw1, AbstractC44199kw1 abstractC44199kw1, String str, long j3, C3091HE c3091he, L16 l16, C50119uv2 c50119uv2, long j4, R06 r06, C35335Px5 c35335Px5, C47801r06 c47801r06, W06 w06, long j5, N16 n16, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, c33918Jw1, c32748Ew1, c32982Fw1, abstractC44199kw1, str, j3, c3091he, l16, c50119uv2, j4, r06, c35335Px5, c47801r06, w06, j5, n16);
    }

    public G26(GN5 spanStyle, DE3 paragraphStyle, C44538lW3 c44538lW3) {
        Intrinsics.checkNotNullParameter(spanStyle, "spanStyle");
        Intrinsics.checkNotNullParameter(paragraphStyle, "paragraphStyle");
        this.f10827a = spanStyle;
        this.f10828b = paragraphStyle;
        this.f10829c = c44538lW3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public G26(GN5 spanStyle, DE3 paragraphStyle) {
        this(spanStyle, paragraphStyle, H26.m104480a(spanStyle.m105158q(), paragraphStyle.m110653i()));
        Intrinsics.checkNotNullParameter(spanStyle, "spanStyle");
        Intrinsics.checkNotNullParameter(paragraphStyle, "paragraphStyle");
    }

    public /* synthetic */ G26(long j, long j2, C33918Jw1 c33918Jw1, C32748Ew1 c32748Ew1, C32982Fw1 c32982Fw1, AbstractC44199kw1 abstractC44199kw1, String str, long j3, C3091HE c3091he, L16 l16, C50119uv2 c50119uv2, long j4, R06 r06, C35335Px5 c35335Px5, C47801r06 c47801r06, W06 w06, long j5, N16 n16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C47063pm0.f104050b.m18726g() : j, (i & 2) != 0 ? M26.f22473b.m95968a() : j2, (i & 4) != 0 ? null : c33918Jw1, (i & 8) != 0 ? null : c32748Ew1, (i & 16) != 0 ? null : c32982Fw1, (i & 32) != 0 ? null : abstractC44199kw1, (i & 64) != 0 ? null : str, (i & 128) != 0 ? M26.f22473b.m95968a() : j3, (i & 256) != 0 ? null : c3091he, (i & 512) != 0 ? null : l16, (i & 1024) != 0 ? null : c50119uv2, (i & 2048) != 0 ? C47063pm0.f104050b.m18726g() : j4, (i & 4096) != 0 ? null : r06, (i & 8192) != 0 ? null : c35335Px5, (i & 16384) != 0 ? null : c47801r06, (i & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? null : w06, (i & 65536) != 0 ? M26.f22473b.m95968a() : j5, (i & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? null : n16, null);
    }

    public G26(long j, long j2, C33918Jw1 c33918Jw1, C32748Ew1 c32748Ew1, C32982Fw1 c32982Fw1, AbstractC44199kw1 abstractC44199kw1, String str, long j3, C3091HE c3091he, L16 l16, C50119uv2 c50119uv2, long j4, R06 r06, C35335Px5 c35335Px5, C47801r06 c47801r06, W06 w06, long j5, N16 n16) {
        this(new GN5(j, j2, c33918Jw1, c32748Ew1, c32982Fw1, abstractC44199kw1, str, j3, c3091he, l16, c50119uv2, j4, r06, c35335Px5, (C39795dW3) null, (J61) null, (DefaultConstructorMarker) null), new DE3(c47801r06, w06, j5, n16, (ZV3) null, (C46522or2) null, (C41185fr2) null, (UN1) null, (C44263l26) null, (DefaultConstructorMarker) null), null);
    }

    public /* synthetic */ G26(long j, long j2, C33918Jw1 c33918Jw1, C32748Ew1 c32748Ew1, C32982Fw1 c32982Fw1, AbstractC44199kw1 abstractC44199kw1, String str, long j3, C3091HE c3091he, L16 l16, C50119uv2 c50119uv2, long j4, R06 r06, C35335Px5 c35335Px5, C47801r06 c47801r06, W06 w06, long j5, N16 n16, C44538lW3 c44538lW3, C46522or2 c46522or2, C41185fr2 c41185fr2, UN1 un1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C47063pm0.f104050b.m18726g() : j, (i & 2) != 0 ? M26.f22473b.m95968a() : j2, (i & 4) != 0 ? null : c33918Jw1, (i & 8) != 0 ? null : c32748Ew1, (i & 16) != 0 ? null : c32982Fw1, (i & 32) != 0 ? null : abstractC44199kw1, (i & 64) != 0 ? null : str, (i & 128) != 0 ? M26.f22473b.m95968a() : j3, (i & 256) != 0 ? null : c3091he, (i & 512) != 0 ? null : l16, (i & 1024) != 0 ? null : c50119uv2, (i & 2048) != 0 ? C47063pm0.f104050b.m18726g() : j4, (i & 4096) != 0 ? null : r06, (i & 8192) != 0 ? null : c35335Px5, (i & 16384) != 0 ? null : c47801r06, (i & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? null : w06, (i & 65536) != 0 ? M26.f22473b.m95968a() : j5, (i & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? null : n16, (i & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? null : c44538lW3, (i & 524288) != 0 ? null : c46522or2, (i & 1048576) != 0 ? null : c41185fr2, (i & 2097152) != 0 ? null : un1, null);
    }

    public G26(long j, long j2, C33918Jw1 c33918Jw1, C32748Ew1 c32748Ew1, C32982Fw1 c32982Fw1, AbstractC44199kw1 abstractC44199kw1, String str, long j3, C3091HE c3091he, L16 l16, C50119uv2 c50119uv2, long j4, R06 r06, C35335Px5 c35335Px5, C47801r06 c47801r06, W06 w06, long j5, N16 n16, C44538lW3 c44538lW3, C46522or2 c46522or2, C41185fr2 c41185fr2, UN1 un1) {
        this(new GN5(j, j2, c33918Jw1, c32748Ew1, c32982Fw1, abstractC44199kw1, str, j3, c3091he, l16, c50119uv2, j4, r06, c35335Px5, c44538lW3 != null ? c44538lW3.m27190b() : null, (DefaultConstructorMarker) null), new DE3(c47801r06, w06, j5, n16, c44538lW3 != null ? c44538lW3.m27191a() : null, c46522or2, c41185fr2, un1, (DefaultConstructorMarker) null), c44538lW3);
    }
}
