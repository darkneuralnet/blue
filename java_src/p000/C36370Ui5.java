package p000;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ULong;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C1577Df;
import p000.C3091HE;
import p000.C32120Ce3;
import p000.C33918Jw1;
import p000.C35335Px5;
import p000.C47063pm0;
import p000.C47748qv2;
import p000.C48413s26;
import p000.C50119uv2;
import p000.L16;
import p000.M26;
import p000.N16;
import p000.R06;
@Metadata(m28433d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\t\u001a\u00020\b\"\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f\"&\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\".\u0010\u0016\u001a\u001c\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00140\u0013\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000f\".\u0010\u001a\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0014\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u0012\u0004\b\u0018\u0010\u0019\" \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u000f\"&\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u0012\u0004\b\u001f\u0010\u0019\"&\u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\u000f\u001a\u0004\b\"\u0010\u0011\"&\u0010'\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010\u000f\u001a\u0004\b&\u0010\u0011\" \u0010*\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u000f\" \u0010-\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u000f\" \u00100\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u000f\" \u00103\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u000f\"#\u00106\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b5\u0010\u000f\"#\u00109\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b8\u0010\u000f\" \u0010<\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010\u000f\"#\u0010?\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b>\u0010\u000f\")\u0010C\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bA\u0010\u000f\u0012\u0004\bB\u0010\u0019\"#\u0010F\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bE\u0010\u000f\" \u0010I\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010\u000f\" \u0010K\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u000f\"$\u0010N\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\b0\u0000*\u00020L8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b;\u0010M\"$\u0010N\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\b0\u0000*\u00020O8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b>\u0010P\"$\u0010N\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\b0\u0000*\u00020Q8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bA\u0010R\"$\u0010N\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\b0\u0000*\u00020S8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u0010T\"'\u0010N\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\b0\u0000*\u00020U8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b%\u0010V\"'\u0010N\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\b0\u0000*\u00020W8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\bE\u0010X\"$\u0010N\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\b0\u0000*\u00020Y8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u0010Z\"'\u0010N\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\b0\u0000*\u00020[8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b)\u0010\\\"'\u0010N\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\b0\u0000*\u00020]8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\bH\u0010^\"'\u0010N\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\b0\u0000*\u00020_8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b5\u0010`\"$\u0010N\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\b0\u0000*\u00020a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u0010b\"$\u0010N\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\b0\u0000*\u00020c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b/\u0010d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006e"}, m28432d2 = {"LRi5;", "T", "Original", "Saveable", "value", "saver", "LTi5;", Action.SCOPE_ATTRIBUTE, "", "u", "(Ljava/lang/Object;LRi5;LTi5;)Ljava/lang/Object;", "t", "(Ljava/lang/Object;)Ljava/lang/Object;", "LDf;", C17296a.f69688o, "LRi5;", "e", "()LRi5;", "AnnotatedStringSaver", "", "LDf$b;", "b", "AnnotationRangeListSaver", "c", "getAnnotationRangeSaver$annotations", "()V", "AnnotationRangeSaver", "LAo6;", DateTokenConverter.CONVERTER_KEY, "VerbatimTtsAnnotationSaver", "LKf6;", "getUrlAnnotationSaver$annotations", "UrlAnnotationSaver", "LDE3;", "f", "ParagraphStyleSaver", "LGN5;", "g", "s", "SpanStyleSaver", "LR06;", "h", "TextDecorationSaver", "LL16;", "i", "TextGeometricTransformSaver", "LN16;", "j", "TextIndentSaver", "LJw1;", "k", "FontWeightSaver", "LHE;", "l", "BaselineShiftSaver", "Ls26;", "m", "TextRangeSaver", "LPx5;", "n", "ShadowSaver", "Lpm0;", "o", "ColorSaver", "LM26;", "p", "getTextUnitSaver$annotations", "TextUnitSaver", "LCe3;", "q", "OffsetSaver", "Luv2;", "r", "LocaleListSaver", "Lqv2;", "LocaleSaver", "LR06$a;", "(LR06$a;)LRi5;", "Saver", "LL16$a;", "(LL16$a;)LRi5;", "LN16$a;", "(LN16$a;)LRi5;", "LJw1$a;", "(LJw1$a;)LRi5;", "LHE$a;", "(LHE$a;)LRi5;", "Ls26$a;", "(Ls26$a;)LRi5;", "LPx5$a;", "(LPx5$a;)LRi5;", "Lpm0$a;", "(Lpm0$a;)LRi5;", "LM26$a;", "(LM26$a;)LRi5;", "LCe3$a;", "(LCe3$a;)LRi5;", "Luv2$a;", "(Luv2$a;)LRi5;", "Lqv2$a;", "(Lqv2$a;)LRi5;", "ui-text_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n1#2:422\n*E\n"})
/* renamed from: Ui5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36370Ui5 {

    /* renamed from: a */
    public static final InterfaceC35668Ri5<C1577Df, Object> f37823a = C35902Si5.m85006a(C8399a.f37854g, C8400b.f37855g);

    /* renamed from: b */
    public static final InterfaceC35668Ri5<List<C1577Df.C1580b<? extends Object>>, Object> f37824b = C35902Si5.m85006a(C8401c.f37856g, C8402d.f37857g);

    /* renamed from: c */
    public static final InterfaceC35668Ri5<C1577Df.C1580b<? extends Object>, Object> f37825c = C35902Si5.m85006a(C8403e.f37858g, C8405f.f37859g);

    /* renamed from: d */
    public static final InterfaceC35668Ri5<C31745Ao6, Object> f37826d = C35902Si5.m85006a(C8397K.f37852g, C8398L.f37853g);

    /* renamed from: e */
    public static final InterfaceC35668Ri5<C34004Kf6, Object> f37827e = C35902Si5.m85006a(C8395I.f37850g, C8396J.f37851g);

    /* renamed from: f */
    public static final InterfaceC35668Ri5<DE3, Object> f37828f = C35902Si5.m85006a(C8419s.f37872g, C8420t.f37873g);

    /* renamed from: g */
    public static final InterfaceC35668Ri5<GN5, Object> f37829g = C35902Si5.m85006a(C8423w.f37876g, C8424x.f37877g);

    /* renamed from: h */
    public static final InterfaceC35668Ri5<R06, Object> f37830h = C35902Si5.m85006a(C8425y.f37878g, C8426z.f37879g);

    /* renamed from: i */
    public static final InterfaceC35668Ri5<L16, Object> f37831i = C35902Si5.m85006a(C8387A.f37842g, C8388B.f37843g);

    /* renamed from: j */
    public static final InterfaceC35668Ri5<N16, Object> f37832j = C35902Si5.m85006a(C8389C.f37844g, C8390D.f37845g);

    /* renamed from: k */
    public static final InterfaceC35668Ri5<C33918Jw1, Object> f37833k = C35902Si5.m85006a(C8411k.f37864g, C8412l.f37865g);

    /* renamed from: l */
    public static final InterfaceC35668Ri5<C3091HE, Object> f37834l = C35902Si5.m85006a(C8407g.f37860g, C8408h.f37861g);

    /* renamed from: m */
    public static final InterfaceC35668Ri5<C48413s26, Object> f37835m = C35902Si5.m85006a(C8391E.f37846g, C8392F.f37847g);

    /* renamed from: n */
    public static final InterfaceC35668Ri5<C35335Px5, Object> f37836n = C35902Si5.m85006a(C8421u.f37874g, C8422v.f37875g);

    /* renamed from: o */
    public static final InterfaceC35668Ri5<C47063pm0, Object> f37837o = C35902Si5.m85006a(C8409i.f37862g, C8410j.f37863g);

    /* renamed from: p */
    public static final InterfaceC35668Ri5<M26, Object> f37838p = C35902Si5.m85006a(C8393G.f37848g, C8394H.f37849g);

    /* renamed from: q */
    public static final InterfaceC35668Ri5<C32120Ce3, Object> f37839q = C35902Si5.m85006a(C8417q.f37870g, C8418r.f37871g);

    /* renamed from: r */
    public static final InterfaceC35668Ri5<C50119uv2, Object> f37840r = C35902Si5.m85006a(C8413m.f37866g, C8414n.f37867g);

    /* renamed from: s */
    public static final InterfaceC35668Ri5<C47748qv2, Object> f37841s = C35902Si5.m85006a(C8415o.f37868g, C8416p.f37869g);

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTi5;", "LL16;", "it", "", C17296a.f69688o, "(LTi5;LL16;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ui5$A */
    /* loaded from: classes.dex */
    public static final class C8387A extends Lambda implements Function2<InterfaceC36136Ti5, L16, Object> {

        /* renamed from: g */
        public static final C8387A f37842g = new C8387A();

        public C8387A() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(InterfaceC36136Ti5 Saver, L16 it) {
            ArrayList arrayListOf;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            arrayListOf = CollectionsKt__CollectionsKt.arrayListOf(Float.valueOf(it.m97920b()), Float.valueOf(it.m97919c()));
            return arrayListOf;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "LL16;", "b", "(Ljava/lang/Object;)LL16;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ui5$B */
    /* loaded from: classes.dex */
    public static final class C8388B extends Lambda implements Function1<Object, L16> {

        /* renamed from: g */
        public static final C8388B f37843g = new C8388B();

        public C8388B() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final L16 invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            return new L16(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTi5;", "LN16;", "it", "", C17296a.f69688o, "(LTi5;LN16;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ui5$C */
    /* loaded from: classes.dex */
    public static final class C8389C extends Lambda implements Function2<InterfaceC36136Ti5, N16, Object> {

        /* renamed from: g */
        public static final C8389C f37844g = new C8389C();

        public C8389C() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(InterfaceC36136Ti5 Saver, N16 it) {
            ArrayList arrayListOf;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            M26 m95978b = M26.m95978b(it.m94450b());
            M26.C5158a c5158a = M26.f22473b;
            arrayListOf = CollectionsKt__CollectionsKt.arrayListOf(C36370Ui5.m81024u(m95978b, C36370Ui5.m81027r(c5158a), Saver), C36370Ui5.m81024u(M26.m95978b(it.m94449c()), C36370Ui5.m81027r(c5158a), Saver));
            return arrayListOf;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "LN16;", "b", "(Ljava/lang/Object;)LN16;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextIndentSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n55#2,2:422\n55#2,2:425\n1#3:424\n1#3:427\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextIndentSaver$2\n*L\n295#1:422,2\n296#1:425,2\n295#1:424\n296#1:427\n*E\n"})
    /* renamed from: Ui5$D */
    /* loaded from: classes.dex */
    public static final class C8390D extends Lambda implements Function1<Object, N16> {

        /* renamed from: g */
        public static final C8390D f37845g = new C8390D();

        public C8390D() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final N16 invoke(Object it) {
            M26 mo85002b;
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            M26.C5158a c5158a = M26.f22473b;
            InterfaceC35668Ri5<M26, Object> m81027r = C36370Ui5.m81027r(c5158a);
            Boolean bool = Boolean.FALSE;
            M26 m26 = null;
            if (Intrinsics.areEqual(obj, bool) || obj == null) {
                mo85002b = null;
            } else {
                mo85002b = m81027r.mo85002b(obj);
            }
            Intrinsics.checkNotNull(mo85002b);
            long m95969k = mo85002b.m95969k();
            Object obj2 = list.get(1);
            InterfaceC35668Ri5<M26, Object> m81027r2 = C36370Ui5.m81027r(c5158a);
            if (!Intrinsics.areEqual(obj2, bool) && obj2 != null) {
                m26 = m81027r2.mo85002b(obj2);
            }
            Intrinsics.checkNotNull(m26);
            return new N16(m95969k, m26.m95969k(), null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTi5;", "Ls26;", "it", "", C17296a.f69688o, "(LTi5;J)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ui5$E */
    /* loaded from: classes.dex */
    public static final class C8391E extends Lambda implements Function2<InterfaceC36136Ti5, C48413s26, Object> {

        /* renamed from: g */
        public static final C8391E f37846g = new C8391E();

        public C8391E() {
            super(2);
        }

        /* renamed from: a */
        public final Object m81019a(InterfaceC36136Ti5 Saver, long j) {
            ArrayList arrayListOf;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            arrayListOf = CollectionsKt__CollectionsKt.arrayListOf((Integer) C36370Ui5.m81025t(Integer.valueOf(C48413s26.m14832n(j))), (Integer) C36370Ui5.m81025t(Integer.valueOf(C48413s26.m14837i(j))));
            return arrayListOf;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC36136Ti5 interfaceC36136Ti5, C48413s26 c48413s26) {
            return m81019a(interfaceC36136Ti5, c48413s26.m14828r());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "Ls26;", "b", "(Ljava/lang/Object;)Ls26;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextRangeSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n70#2:422\n1#3:423\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextRangeSaver$2\n*L\n329#1:422\n329#1:423\n*E\n"})
    /* renamed from: Ui5$F */
    /* loaded from: classes.dex */
    public static final class C8392F extends Lambda implements Function1<Object, C48413s26> {

        /* renamed from: g */
        public static final C8392F f37847g = new C8392F();

        public C8392F() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final C48413s26 invoke(Object it) {
            Integer num;
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            Integer num2 = null;
            if (obj != null) {
                num = (Integer) obj;
            } else {
                num = null;
            }
            Intrinsics.checkNotNull(num);
            int intValue = num.intValue();
            Object obj2 = list.get(1);
            if (obj2 != null) {
                num2 = (Integer) obj2;
            }
            Intrinsics.checkNotNull(num2);
            return C48413s26.m14844b(C49006t26.m13200b(intValue, num2.intValue()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTi5;", "LM26;", "it", "", C17296a.f69688o, "(LTi5;J)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ui5$G */
    /* loaded from: classes.dex */
    public static final class C8393G extends Lambda implements Function2<InterfaceC36136Ti5, M26, Object> {

        /* renamed from: g */
        public static final C8393G f37848g = new C8393G();

        public C8393G() {
            super(2);
        }

        /* renamed from: a */
        public final Object m81017a(InterfaceC36136Ti5 Saver, long j) {
            ArrayList arrayListOf;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            arrayListOf = CollectionsKt__CollectionsKt.arrayListOf(C36370Ui5.m81025t(Float.valueOf(M26.m95972h(j))), C36370Ui5.m81025t(O26.m92978d(M26.m95973g(j))));
            return arrayListOf;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC36136Ti5 interfaceC36136Ti5, M26 m26) {
            return m81017a(interfaceC36136Ti5, m26.m95969k());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "LM26;", "b", "(Ljava/lang/Object;)LM26;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextUnitSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n70#2:422\n1#3:423\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextUnitSaver$2\n*L\n374#1:422\n374#1:423\n*E\n"})
    /* renamed from: Ui5$H */
    /* loaded from: classes.dex */
    public static final class C8394H extends Lambda implements Function1<Object, M26> {

        /* renamed from: g */
        public static final C8394H f37849g = new C8394H();

        public C8394H() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final M26 invoke(Object it) {
            Float f;
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            O26 o26 = null;
            if (obj != null) {
                f = (Float) obj;
            } else {
                f = null;
            }
            Intrinsics.checkNotNull(f);
            float floatValue = f.floatValue();
            Object obj2 = list.get(1);
            if (obj2 != null) {
                o26 = (O26) obj2;
            }
            Intrinsics.checkNotNull(o26);
            return M26.m95978b(N26.m94419a(floatValue, o26.m92972j()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTi5;", "LKf6;", "it", "", C17296a.f69688o, "(LTi5;LKf6;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ui5$I */
    /* loaded from: classes.dex */
    public static final class C8395I extends Lambda implements Function2<InterfaceC36136Ti5, C34004Kf6, Object> {

        /* renamed from: g */
        public static final C8395I f37850g = new C8395I();

        public C8395I() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(InterfaceC36136Ti5 Saver, C34004Kf6 it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return C36370Ui5.m81025t(it.m98577a());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "LKf6;", "b", "(Ljava/lang/Object;)LKf6;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$UrlAnnotationSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n70#2:422\n1#3:423\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$UrlAnnotationSaver$2\n*L\n198#1:422\n198#1:423\n*E\n"})
    /* renamed from: Ui5$J */
    /* loaded from: classes.dex */
    public static final class C8396J extends Lambda implements Function1<Object, C34004Kf6> {

        /* renamed from: g */
        public static final C8396J f37851g = new C8396J();

        public C8396J() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final C34004Kf6 invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new C34004Kf6((String) it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTi5;", "LAo6;", "it", "", C17296a.f69688o, "(LTi5;LAo6;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ui5$K */
    /* loaded from: classes.dex */
    public static final class C8397K extends Lambda implements Function2<InterfaceC36136Ti5, C31745Ao6, Object> {

        /* renamed from: g */
        public static final C8397K f37852g = new C8397K();

        public C8397K() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(InterfaceC36136Ti5 Saver, C31745Ao6 it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return C36370Ui5.m81025t(it.m115146a());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "LAo6;", "b", "(Ljava/lang/Object;)LAo6;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$VerbatimTtsAnnotationSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n70#2:422\n1#3:423\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$VerbatimTtsAnnotationSaver$2\n*L\n192#1:422\n192#1:423\n*E\n"})
    /* renamed from: Ui5$L */
    /* loaded from: classes.dex */
    public static final class C8398L extends Lambda implements Function1<Object, C31745Ao6> {

        /* renamed from: g */
        public static final C8398L f37853g = new C8398L();

        public C8398L() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final C31745Ao6 invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new C31745Ao6((String) it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTi5;", "LDf;", "it", "", C17296a.f69688o, "(LTi5;LDf;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ui5$a */
    /* loaded from: classes.dex */
    public static final class C8399a extends Lambda implements Function2<InterfaceC36136Ti5, C1577Df, Object> {

        /* renamed from: g */
        public static final C8399a f37854g = new C8399a();

        public C8399a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(InterfaceC36136Ti5 Saver, C1577Df it) {
            ArrayList arrayListOf;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            arrayListOf = CollectionsKt__CollectionsKt.arrayListOf(C36370Ui5.m81025t(it.m110052j()), C36370Ui5.m81024u(it.m110056f(), C36370Ui5.f37824b, Saver), C36370Ui5.m81024u(it.m110058d(), C36370Ui5.f37824b, Saver), C36370Ui5.m81024u(it.m110060b(), C36370Ui5.f37824b, Saver));
            return arrayListOf;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "LDf;", "b", "(Ljava/lang/Object;)LDf;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotatedStringSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n55#2,2:422\n55#2,2:425\n70#2:428\n55#2,2:431\n1#3:424\n1#3:427\n1#3:429\n1#3:430\n1#3:433\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotatedStringSaver$2\n*L\n86#1:422,2\n88#1:425,2\n90#1:428\n93#1:431,2\n86#1:424\n88#1:427\n90#1:429\n93#1:433\n*E\n"})
    /* renamed from: Ui5$b */
    /* loaded from: classes.dex */
    public static final class C8400b extends Lambda implements Function1<Object, C1577Df> {

        /* renamed from: g */
        public static final C8400b f37855g = new C8400b();

        public C8400b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final C1577Df invoke(Object it) {
            List list;
            List list2;
            String str;
            List list3;
            List list4;
            Intrinsics.checkNotNullParameter(it, "it");
            List list5 = (List) it;
            Object obj = list5.get(1);
            InterfaceC35668Ri5 interfaceC35668Ri5 = C36370Ui5.f37824b;
            Boolean bool = Boolean.FALSE;
            List list6 = null;
            if (Intrinsics.areEqual(obj, bool) || obj == null) {
                list = null;
            } else {
                list = (List) interfaceC35668Ri5.mo85002b(obj);
            }
            Object obj2 = list5.get(2);
            InterfaceC35668Ri5 interfaceC35668Ri52 = C36370Ui5.f37824b;
            if (Intrinsics.areEqual(obj2, bool) || obj2 == null) {
                list2 = null;
            } else {
                list2 = (List) interfaceC35668Ri52.mo85002b(obj2);
            }
            Object obj3 = list5.get(0);
            if (obj3 != null) {
                str = (String) obj3;
            } else {
                str = null;
            }
            Intrinsics.checkNotNull(str);
            if (list != null) {
                List list7 = list;
                if (list7.isEmpty()) {
                    list7 = null;
                }
                list3 = list7;
            } else {
                list3 = null;
            }
            if (list2 != null) {
                List list8 = list2;
                if (list8.isEmpty()) {
                    list8 = null;
                }
                list4 = list8;
            } else {
                list4 = null;
            }
            Object obj4 = list5.get(3);
            InterfaceC35668Ri5 interfaceC35668Ri53 = C36370Ui5.f37824b;
            if (!Intrinsics.areEqual(obj4, bool) && obj4 != null) {
                list6 = (List) interfaceC35668Ri53.mo85002b(obj4);
            }
            return new C1577Df(str, list3, list4, list6);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LTi5;", "", "LDf$b;", "", "it", C17296a.f69688o, "(LTi5;Ljava/util/List;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeListSaver$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,421:1\n151#2,3:422\n33#2,4:425\n154#2,2:429\n38#2:431\n156#2:432\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeListSaver$1\n*L\n100#1:422,3\n100#1:425,4\n100#1:429,2\n100#1:431\n100#1:432\n*E\n"})
    /* renamed from: Ui5$c */
    /* loaded from: classes.dex */
    public static final class C8401c extends Lambda implements Function2<InterfaceC36136Ti5, List<? extends C1577Df.C1580b<? extends Object>>, Object> {

        /* renamed from: g */
        public static final C8401c f37856g = new C8401c();

        public C8401c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(InterfaceC36136Ti5 Saver, List<? extends C1577Df.C1580b<? extends Object>> it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            ArrayList arrayList = new ArrayList(it.size());
            int size = it.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(C36370Ui5.m81024u(it.get(i), C36370Ui5.f37825c, Saver));
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "LDf$b;", "b", "(Ljava/lang/Object;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeListSaver$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n151#2,3:422\n33#2,4:425\n154#2:429\n155#2:433\n38#2:434\n156#2:435\n55#3,2:430\n1#4:432\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeListSaver$2\n*L\n107#1:422,3\n107#1:425,4\n107#1:429\n107#1:433\n107#1:434\n107#1:435\n108#1:430,2\n108#1:432\n*E\n"})
    /* renamed from: Ui5$d */
    /* loaded from: classes.dex */
    public static final class C8402d extends Lambda implements Function1<Object, List<? extends C1577Df.C1580b<? extends Object>>> {

        /* renamed from: g */
        public static final C8402d f37857g = new C8402d();

        public C8402d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final List<C1577Df.C1580b<? extends Object>> invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                InterfaceC35668Ri5 interfaceC35668Ri5 = C36370Ui5.f37825c;
                C1577Df.C1580b c1580b = null;
                if (!Intrinsics.areEqual(obj, Boolean.FALSE) && obj != null) {
                    c1580b = (C1577Df.C1580b) interfaceC35668Ri5.mo85002b(obj);
                }
                Intrinsics.checkNotNull(c1580b);
                arrayList.add(c1580b);
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTi5;", "LDf$b;", "", "it", C17296a.f69688o, "(LTi5;LDf$b;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ui5$e */
    /* loaded from: classes.dex */
    public static final class C8403e extends Lambda implements Function2<InterfaceC36136Ti5, C1577Df.C1580b<? extends Object>, Object> {

        /* renamed from: g */
        public static final C8403e f37858g = new C8403e();

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Ui5$e$a */
        /* loaded from: classes.dex */
        public /* synthetic */ class C8404a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC2902Gf.values().length];
                try {
                    iArr[EnumC2902Gf.Paragraph.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC2902Gf.Span.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC2902Gf.VerbatimTts.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC2902Gf.Url.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC2902Gf.String.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C8403e() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(InterfaceC36136Ti5 Saver, C1577Df.C1580b<? extends Object> it) {
            EnumC2902Gf enumC2902Gf;
            Object m81024u;
            ArrayList arrayListOf;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            Object m110028e = it.m110028e();
            if (m110028e instanceof DE3) {
                enumC2902Gf = EnumC2902Gf.Paragraph;
            } else if (m110028e instanceof GN5) {
                enumC2902Gf = EnumC2902Gf.Span;
            } else if (m110028e instanceof C31745Ao6) {
                enumC2902Gf = EnumC2902Gf.VerbatimTts;
            } else if (m110028e instanceof C34004Kf6) {
                enumC2902Gf = EnumC2902Gf.Url;
            } else {
                enumC2902Gf = EnumC2902Gf.String;
            }
            int i = C8404a.$EnumSwitchMapping$0[enumC2902Gf.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                m81024u = C36370Ui5.m81025t(it.m110028e());
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            Object m110028e2 = it.m110028e();
                            Intrinsics.checkNotNull(m110028e2, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                            m81024u = C36370Ui5.m81024u((C34004Kf6) m110028e2, C36370Ui5.f37827e, Saver);
                        }
                    } else {
                        Object m110028e3 = it.m110028e();
                        Intrinsics.checkNotNull(m110028e3, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                        m81024u = C36370Ui5.m81024u((C31745Ao6) m110028e3, C36370Ui5.f37826d, Saver);
                    }
                } else {
                    Object m110028e4 = it.m110028e();
                    Intrinsics.checkNotNull(m110028e4, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                    m81024u = C36370Ui5.m81024u((GN5) m110028e4, C36370Ui5.m81026s(), Saver);
                }
            } else {
                Object m110028e5 = it.m110028e();
                Intrinsics.checkNotNull(m110028e5, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                m81024u = C36370Ui5.m81024u((DE3) m110028e5, C36370Ui5.m81039f(), Saver);
            }
            arrayListOf = CollectionsKt__CollectionsKt.arrayListOf(C36370Ui5.m81025t(enumC2902Gf), m81024u, C36370Ui5.m81025t(Integer.valueOf(it.m110027f())), C36370Ui5.m81025t(Integer.valueOf(it.m110029d())), C36370Ui5.m81025t(it.m110026g()));
            return arrayListOf;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0000\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "LDf$b;", "b", "(Ljava/lang/Object;)LDf$b;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n70#2:422\n70#2:424\n70#2:426\n70#2:428\n55#2,2:430\n55#2,2:433\n55#2,2:436\n55#2,2:439\n70#2:442\n1#3:423\n1#3:425\n1#3:427\n1#3:429\n1#3:432\n1#3:435\n1#3:438\n1#3:441\n1#3:443\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeSaver$2\n*L\n160#1:422\n161#1:424\n162#1:426\n163#1:428\n167#1:430,2\n171#1:433,2\n175#1:436,2\n179#1:439,2\n183#1:442\n160#1:423\n161#1:425\n162#1:427\n163#1:429\n167#1:432\n171#1:435\n175#1:438\n179#1:441\n183#1:443\n*E\n"})
    /* renamed from: Ui5$f */
    /* loaded from: classes.dex */
    public static final class C8405f extends Lambda implements Function1<Object, C1577Df.C1580b<? extends Object>> {

        /* renamed from: g */
        public static final C8405f f37859g = new C8405f();

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Ui5$f$a */
        /* loaded from: classes.dex */
        public /* synthetic */ class C8406a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC2902Gf.values().length];
                try {
                    iArr[EnumC2902Gf.Paragraph.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC2902Gf.Span.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC2902Gf.VerbatimTts.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC2902Gf.Url.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC2902Gf.String.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C8405f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final C1577Df.C1580b<? extends Object> invoke(Object it) {
            EnumC2902Gf enumC2902Gf;
            Integer num;
            Integer num2;
            String str;
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            DE3 de3 = null;
            if (obj != null) {
                enumC2902Gf = (EnumC2902Gf) obj;
            } else {
                enumC2902Gf = null;
            }
            Intrinsics.checkNotNull(enumC2902Gf);
            Object obj2 = list.get(2);
            if (obj2 != null) {
                num = (Integer) obj2;
            } else {
                num = null;
            }
            Intrinsics.checkNotNull(num);
            int intValue = num.intValue();
            Object obj3 = list.get(3);
            if (obj3 != null) {
                num2 = (Integer) obj3;
            } else {
                num2 = null;
            }
            Intrinsics.checkNotNull(num2);
            int intValue2 = num2.intValue();
            Object obj4 = list.get(4);
            if (obj4 != null) {
                str = (String) obj4;
            } else {
                str = null;
            }
            Intrinsics.checkNotNull(str);
            int i = C8406a.$EnumSwitchMapping$0[enumC2902Gf.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                Object obj5 = list.get(1);
                                if (obj5 != null) {
                                    de3 = (String) obj5;
                                }
                                Intrinsics.checkNotNull(de3);
                                return new C1577Df.C1580b<>(de3, intValue, intValue2, str);
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        Object obj6 = list.get(1);
                        InterfaceC35668Ri5 interfaceC35668Ri5 = C36370Ui5.f37827e;
                        if (!Intrinsics.areEqual(obj6, Boolean.FALSE) && obj6 != null) {
                            de3 = (C34004Kf6) interfaceC35668Ri5.mo85002b(obj6);
                        }
                        Intrinsics.checkNotNull(de3);
                        return new C1577Df.C1580b<>(de3, intValue, intValue2, str);
                    }
                    Object obj7 = list.get(1);
                    InterfaceC35668Ri5 interfaceC35668Ri52 = C36370Ui5.f37826d;
                    if (!Intrinsics.areEqual(obj7, Boolean.FALSE) && obj7 != null) {
                        de3 = (C31745Ao6) interfaceC35668Ri52.mo85002b(obj7);
                    }
                    Intrinsics.checkNotNull(de3);
                    return new C1577Df.C1580b<>(de3, intValue, intValue2, str);
                }
                Object obj8 = list.get(1);
                InterfaceC35668Ri5<GN5, Object> m81026s = C36370Ui5.m81026s();
                if (!Intrinsics.areEqual(obj8, Boolean.FALSE) && obj8 != null) {
                    de3 = m81026s.mo85002b(obj8);
                }
                Intrinsics.checkNotNull(de3);
                return new C1577Df.C1580b<>(de3, intValue, intValue2, str);
            }
            Object obj9 = list.get(1);
            InterfaceC35668Ri5<DE3, Object> m81039f = C36370Ui5.m81039f();
            if (!Intrinsics.areEqual(obj9, Boolean.FALSE) && obj9 != null) {
                de3 = m81039f.mo85002b(obj9);
            }
            Intrinsics.checkNotNull(de3);
            return new C1577Df.C1580b<>(de3, intValue, intValue2, str);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTi5;", "LHE;", "it", "", C17296a.f69688o, "(LTi5;F)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ui5$g */
    /* loaded from: classes.dex */
    public static final class C8407g extends Lambda implements Function2<InterfaceC36136Ti5, C3091HE, Object> {

        /* renamed from: g */
        public static final C8407g f37860g = new C8407g();

        public C8407g() {
            super(2);
        }

        /* renamed from: a */
        public final Object m81005a(InterfaceC36136Ti5 Saver, float f) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            return Float.valueOf(f);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC36136Ti5 interfaceC36136Ti5, C3091HE c3091he) {
            return m81005a(interfaceC36136Ti5, c3091he.m104155h());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "LHE;", "b", "(Ljava/lang/Object;)LHE;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ui5$h */
    /* loaded from: classes.dex */
    public static final class C8408h extends Lambda implements Function1<Object, C3091HE> {

        /* renamed from: g */
        public static final C8408h f37861g = new C8408h();

        public C8408h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final C3091HE invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C3091HE.m104161b(C3091HE.m104160c(((Float) it).floatValue()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTi5;", "Lpm0;", "it", "", C17296a.f69688o, "(LTi5;J)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ui5$i */
    /* loaded from: classes.dex */
    public static final class C8409i extends Lambda implements Function2<InterfaceC36136Ti5, C47063pm0, Object> {

        /* renamed from: g */
        public static final C8409i f37862g = new C8409i();

        public C8409i() {
            super(2);
        }

        /* renamed from: a */
        public final Object m81003a(InterfaceC36136Ti5 Saver, long j) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            return ULong.m116951boximpl(j);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC36136Ti5 interfaceC36136Ti5, C47063pm0 c47063pm0) {
            return m81003a(interfaceC36136Ti5, c47063pm0.m18733w());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "Lpm0;", "b", "(Ljava/lang/Object;)Lpm0;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ui5$j */
    /* loaded from: classes.dex */
    public static final class C8410j extends Lambda implements Function1<Object, C47063pm0> {

        /* renamed from: g */
        public static final C8410j f37863g = new C8410j();

        public C8410j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final C47063pm0 invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C47063pm0.m18747i(C47063pm0.m18746j(((ULong) it).m117009unboximpl()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTi5;", "LJw1;", "it", "", C17296a.f69688o, "(LTi5;LJw1;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ui5$k */
    /* loaded from: classes.dex */
    public static final class C8411k extends Lambda implements Function2<InterfaceC36136Ti5, C33918Jw1, Object> {

        /* renamed from: g */
        public static final C8411k f37864g = new C8411k();

        public C8411k() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(InterfaceC36136Ti5 Saver, C33918Jw1 it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.m99544k());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "LJw1;", "b", "(Ljava/lang/Object;)LJw1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ui5$l */
    /* loaded from: classes.dex */
    public static final class C8412l extends Lambda implements Function1<Object, C33918Jw1> {

        /* renamed from: g */
        public static final C8412l f37865g = new C8412l();

        public C8412l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final C33918Jw1 invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new C33918Jw1(((Integer) it).intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTi5;", "Luv2;", "it", "", C17296a.f69688o, "(LTi5;Luv2;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$LocaleListSaver$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,421:1\n151#2,3:422\n33#2,4:425\n154#2,2:429\n38#2:431\n156#2:432\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$LocaleListSaver$1\n*L\n404#1:422,3\n404#1:425,4\n404#1:429,2\n404#1:431\n404#1:432\n*E\n"})
    /* renamed from: Ui5$m */
    /* loaded from: classes.dex */
    public static final class C8413m extends Lambda implements Function2<InterfaceC36136Ti5, C50119uv2, Object> {

        /* renamed from: g */
        public static final C8413m f37866g = new C8413m();

        public C8413m() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(InterfaceC36136Ti5 Saver, C50119uv2 it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            List<C47748qv2> m9494c = it.m9494c();
            ArrayList arrayList = new ArrayList(m9494c.size());
            int size = m9494c.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(C36370Ui5.m81024u(m9494c.get(i), C36370Ui5.m81035j(C47748qv2.f106064b), Saver));
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "Luv2;", "b", "(Ljava/lang/Object;)Luv2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$LocaleListSaver$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n151#2,3:422\n33#2,4:425\n154#2:429\n155#2:433\n38#2:434\n156#2:435\n55#3,2:430\n1#4:432\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$LocaleListSaver$2\n*L\n411#1:422,3\n411#1:425,4\n411#1:429\n411#1:433\n411#1:434\n411#1:435\n411#1:430,2\n411#1:432\n*E\n"})
    /* renamed from: Ui5$n */
    /* loaded from: classes.dex */
    public static final class C8414n extends Lambda implements Function1<Object, C50119uv2> {

        /* renamed from: g */
        public static final C8414n f37867g = new C8414n();

        public C8414n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final C50119uv2 invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                InterfaceC35668Ri5<C47748qv2, Object> m81035j = C36370Ui5.m81035j(C47748qv2.f106064b);
                C47748qv2 c47748qv2 = null;
                if (!Intrinsics.areEqual(obj, Boolean.FALSE) && obj != null) {
                    c47748qv2 = m81035j.mo85002b(obj);
                }
                Intrinsics.checkNotNull(c47748qv2);
                arrayList.add(c47748qv2);
            }
            return new C50119uv2(arrayList);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTi5;", "Lqv2;", "it", "", C17296a.f69688o, "(LTi5;Lqv2;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ui5$o */
    /* loaded from: classes.dex */
    public static final class C8415o extends Lambda implements Function2<InterfaceC36136Ti5, C47748qv2, Object> {

        /* renamed from: g */
        public static final C8415o f37868g = new C8415o();

        public C8415o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(InterfaceC36136Ti5 Saver, C47748qv2 it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m16785d();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "Lqv2;", "b", "(Ljava/lang/Object;)Lqv2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ui5$p */
    /* loaded from: classes.dex */
    public static final class C8416p extends Lambda implements Function1<Object, C47748qv2> {

        /* renamed from: g */
        public static final C8416p f37869g = new C8416p();

        public C8416p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final C47748qv2 invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new C47748qv2((String) it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTi5;", "LCe3;", "it", "", C17296a.f69688o, "(LTi5;J)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ui5$q */
    /* loaded from: classes.dex */
    public static final class C8417q extends Lambda implements Function2<InterfaceC36136Ti5, C32120Ce3, Object> {

        /* renamed from: g */
        public static final C8417q f37870g = new C8417q();

        public C8417q() {
            super(2);
        }

        /* renamed from: a */
        public final Object m80995a(InterfaceC36136Ti5 Saver, long j) {
            ArrayList arrayListOf;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            if (C32120Ce3.m111947l(j, C32120Ce3.f4427b.m111933b())) {
                return Boolean.FALSE;
            }
            arrayListOf = CollectionsKt__CollectionsKt.arrayListOf((Float) C36370Ui5.m81025t(Float.valueOf(C32120Ce3.m111944o(j))), (Float) C36370Ui5.m81025t(Float.valueOf(C32120Ce3.m111943p(j))));
            return arrayListOf;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC36136Ti5 interfaceC36136Ti5, C32120Ce3 c32120Ce3) {
            return m80995a(interfaceC36136Ti5, c32120Ce3.m111935x());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "LCe3;", "b", "(Ljava/lang/Object;)LCe3;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$OffsetSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n70#2:422\n1#3:423\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$OffsetSaver$2\n*L\n394#1:422\n394#1:423\n*E\n"})
    /* renamed from: Ui5$r */
    /* loaded from: classes.dex */
    public static final class C8418r extends Lambda implements Function1<Object, C32120Ce3> {

        /* renamed from: g */
        public static final C8418r f37871g = new C8418r();

        public C8418r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final C32120Ce3 invoke(Object it) {
            Float f;
            Intrinsics.checkNotNullParameter(it, "it");
            if (Intrinsics.areEqual(it, Boolean.FALSE)) {
                return C32120Ce3.m111955d(C32120Ce3.f4427b.m111933b());
            }
            List list = (List) it;
            Object obj = list.get(0);
            Float f2 = null;
            if (obj != null) {
                f = (Float) obj;
            } else {
                f = null;
            }
            Intrinsics.checkNotNull(f);
            float floatValue = f.floatValue();
            Object obj2 = list.get(1);
            if (obj2 != null) {
                f2 = (Float) obj2;
            }
            Intrinsics.checkNotNull(f2);
            return C32120Ce3.m111955d(C33056Ge3.m104938a(floatValue, f2.floatValue()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTi5;", "LDE3;", "it", "", C17296a.f69688o, "(LTi5;LDE3;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ui5$s */
    /* loaded from: classes.dex */
    public static final class C8419s extends Lambda implements Function2<InterfaceC36136Ti5, DE3, Object> {

        /* renamed from: g */
        public static final C8419s f37872g = new C8419s();

        public C8419s() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(InterfaceC36136Ti5 Saver, DE3 it) {
            ArrayList arrayListOf;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            arrayListOf = CollectionsKt__CollectionsKt.arrayListOf(C36370Ui5.m81025t(it.m110652j()), C36370Ui5.m81025t(it.m110650l()), C36370Ui5.m81024u(M26.m95978b(it.m110655g()), C36370Ui5.m81027r(M26.f22473b), Saver), C36370Ui5.m81024u(it.m110649m(), C36370Ui5.m81029p(N16.f23977c), Saver));
            return arrayListOf;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "LDE3;", "b", "(Ljava/lang/Object;)LDE3;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ParagraphStyleSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n70#2:422\n70#2:424\n55#2,2:426\n55#2,2:429\n1#3:423\n1#3:425\n1#3:428\n1#3:431\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ParagraphStyleSaver$2\n*L\n213#1:422\n214#1:424\n215#1:426,2\n216#1:429,2\n213#1:423\n214#1:425\n215#1:428\n216#1:431\n*E\n"})
    /* renamed from: Ui5$t */
    /* loaded from: classes.dex */
    public static final class C8420t extends Lambda implements Function1<Object, DE3> {

        /* renamed from: g */
        public static final C8420t f37873g = new C8420t();

        public C8420t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final DE3 invoke(Object it) {
            C47801r06 c47801r06;
            W06 w06;
            M26 mo85002b;
            N16 mo85002b2;
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            if (obj != null) {
                c47801r06 = (C47801r06) obj;
            } else {
                c47801r06 = null;
            }
            Object obj2 = list.get(1);
            if (obj2 != null) {
                w06 = (W06) obj2;
            } else {
                w06 = null;
            }
            Object obj3 = list.get(2);
            InterfaceC35668Ri5<M26, Object> m81027r = C36370Ui5.m81027r(M26.f22473b);
            Boolean bool = Boolean.FALSE;
            if (Intrinsics.areEqual(obj3, bool) || obj3 == null) {
                mo85002b = null;
            } else {
                mo85002b = m81027r.mo85002b(obj3);
            }
            Intrinsics.checkNotNull(mo85002b);
            long m95969k = mo85002b.m95969k();
            Object obj4 = list.get(3);
            InterfaceC35668Ri5<N16, Object> m81029p = C36370Ui5.m81029p(N16.f23977c);
            if (Intrinsics.areEqual(obj4, bool) || obj4 == null) {
                mo85002b2 = null;
            } else {
                mo85002b2 = m81029p.mo85002b(obj4);
            }
            return new DE3(c47801r06, w06, m95969k, mo85002b2, (ZV3) null, (C46522or2) null, (C41185fr2) null, (UN1) null, 240, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTi5;", "LPx5;", "it", "", C17296a.f69688o, "(LTi5;LPx5;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ui5$u */
    /* loaded from: classes.dex */
    public static final class C8421u extends Lambda implements Function2<InterfaceC36136Ti5, C35335Px5, Object> {

        /* renamed from: g */
        public static final C8421u f37874g = new C8421u();

        public C8421u() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(InterfaceC36136Ti5 Saver, C35335Px5 it) {
            ArrayList arrayListOf;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            arrayListOf = CollectionsKt__CollectionsKt.arrayListOf(C36370Ui5.m81024u(C47063pm0.m18747i(it.m89240c()), C36370Ui5.m81037h(C47063pm0.f104050b), Saver), C36370Ui5.m81024u(C32120Ce3.m111955d(it.m89239d()), C36370Ui5.m81033l(C32120Ce3.f4427b), Saver), C36370Ui5.m81025t(Float.valueOf(it.m89241b())));
            return arrayListOf;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "LPx5;", "b", "(Ljava/lang/Object;)LPx5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ShadowSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n55#2,2:422\n55#2,2:425\n70#2:428\n1#3:424\n1#3:427\n1#3:429\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ShadowSaver$2\n*L\n348#1:422,2\n349#1:425,2\n350#1:428\n348#1:424\n349#1:427\n350#1:429\n*E\n"})
    /* renamed from: Ui5$v */
    /* loaded from: classes.dex */
    public static final class C8422v extends Lambda implements Function1<Object, C35335Px5> {

        /* renamed from: g */
        public static final C8422v f37875g = new C8422v();

        public C8422v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final C35335Px5 invoke(Object it) {
            C47063pm0 mo85002b;
            C32120Ce3 mo85002b2;
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            InterfaceC35668Ri5<C47063pm0, Object> m81037h = C36370Ui5.m81037h(C47063pm0.f104050b);
            Boolean bool = Boolean.FALSE;
            Float f = null;
            if (Intrinsics.areEqual(obj, bool) || obj == null) {
                mo85002b = null;
            } else {
                mo85002b = m81037h.mo85002b(obj);
            }
            Intrinsics.checkNotNull(mo85002b);
            long m18733w = mo85002b.m18733w();
            Object obj2 = list.get(1);
            InterfaceC35668Ri5<C32120Ce3, Object> m81033l = C36370Ui5.m81033l(C32120Ce3.f4427b);
            if (Intrinsics.areEqual(obj2, bool) || obj2 == null) {
                mo85002b2 = null;
            } else {
                mo85002b2 = m81033l.mo85002b(obj2);
            }
            Intrinsics.checkNotNull(mo85002b2);
            long m111935x = mo85002b2.m111935x();
            Object obj3 = list.get(2);
            if (obj3 != null) {
                f = (Float) obj3;
            }
            Intrinsics.checkNotNull(f);
            return new C35335Px5(m18733w, m111935x, f.floatValue(), null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTi5;", "LGN5;", "it", "", C17296a.f69688o, "(LTi5;LGN5;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ui5$w */
    /* loaded from: classes.dex */
    public static final class C8423w extends Lambda implements Function2<InterfaceC36136Ti5, GN5, Object> {

        /* renamed from: g */
        public static final C8423w f37876g = new C8423w();

        public C8423w() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(InterfaceC36136Ti5 Saver, GN5 it) {
            ArrayList arrayListOf;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            C47063pm0 m18747i = C47063pm0.m18747i(it.m105168g());
            C47063pm0.C27386a c27386a = C47063pm0.f104050b;
            M26 m95978b = M26.m95978b(it.m105164k());
            M26.C5158a c5158a = M26.f22473b;
            arrayListOf = CollectionsKt__CollectionsKt.arrayListOf(C36370Ui5.m81024u(m18747i, C36370Ui5.m81037h(c27386a), Saver), C36370Ui5.m81024u(m95978b, C36370Ui5.m81027r(c5158a), Saver), C36370Ui5.m81024u(it.m105161n(), C36370Ui5.m81036i(C33918Jw1.f18784c), Saver), C36370Ui5.m81025t(it.m105163l()), C36370Ui5.m81025t(it.m105162m()), C36370Ui5.m81025t(-1), C36370Ui5.m81025t(it.m105165j()), C36370Ui5.m81024u(M26.m95978b(it.m105160o()), C36370Ui5.m81027r(c5158a), Saver), C36370Ui5.m81024u(it.m105170e(), C36370Ui5.m81038g(C3091HE.f13105b), Saver), C36370Ui5.m81024u(it.m105154u(), C36370Ui5.m81030o(L16.f20613c), Saver), C36370Ui5.m81024u(it.m105159p(), C36370Ui5.m81034k(C50119uv2.f113196d), Saver), C36370Ui5.m81024u(C47063pm0.m18747i(it.m105171d()), C36370Ui5.m81037h(c27386a), Saver), C36370Ui5.m81024u(it.m105156s(), C36370Ui5.m81031n(R06.f31395b), Saver), C36370Ui5.m81024u(it.m105157r(), C36370Ui5.m81032m(C35335Px5.f29462d), Saver));
            return arrayListOf;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "LGN5;", "b", "(Ljava/lang/Object;)LGN5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$SpanStyleSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n55#2,2:422\n55#2,2:425\n55#2,2:428\n70#2:431\n70#2:433\n70#2:435\n55#2,2:437\n55#2,2:440\n55#2,2:443\n55#2,2:446\n55#2,2:449\n55#2,2:452\n55#2,2:455\n1#3:424\n1#3:427\n1#3:430\n1#3:432\n1#3:434\n1#3:436\n1#3:439\n1#3:442\n1#3:445\n1#3:448\n1#3:451\n1#3:454\n1#3:457\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$SpanStyleSaver$2\n*L\n243#1:422,2\n244#1:425,2\n245#1:428,2\n246#1:431\n247#1:433\n249#1:435\n250#1:437,2\n251#1:440,2\n252#1:443,2\n253#1:446,2\n254#1:449,2\n255#1:452,2\n256#1:455,2\n243#1:424\n244#1:427\n245#1:430\n246#1:432\n247#1:434\n249#1:436\n250#1:439\n251#1:442\n252#1:445\n253#1:448\n254#1:451\n255#1:454\n256#1:457\n*E\n"})
    /* renamed from: Ui5$x */
    /* loaded from: classes.dex */
    public static final class C8424x extends Lambda implements Function1<Object, GN5> {

        /* renamed from: g */
        public static final C8424x f37877g = new C8424x();

        public C8424x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final GN5 invoke(Object it) {
            C47063pm0 mo85002b;
            M26 mo85002b2;
            C33918Jw1 mo85002b3;
            C32748Ew1 c32748Ew1;
            C32982Fw1 c32982Fw1;
            String str;
            M26 mo85002b4;
            C3091HE mo85002b5;
            L16 mo85002b6;
            C50119uv2 mo85002b7;
            C47063pm0 mo85002b8;
            R06 mo85002b9;
            C35335Px5 mo85002b10;
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            C47063pm0.C27386a c27386a = C47063pm0.f104050b;
            InterfaceC35668Ri5<C47063pm0, Object> m81037h = C36370Ui5.m81037h(c27386a);
            Boolean bool = Boolean.FALSE;
            if (Intrinsics.areEqual(obj, bool) || obj == null) {
                mo85002b = null;
            } else {
                mo85002b = m81037h.mo85002b(obj);
            }
            Intrinsics.checkNotNull(mo85002b);
            long m18733w = mo85002b.m18733w();
            Object obj2 = list.get(1);
            M26.C5158a c5158a = M26.f22473b;
            InterfaceC35668Ri5<M26, Object> m81027r = C36370Ui5.m81027r(c5158a);
            if (Intrinsics.areEqual(obj2, bool) || obj2 == null) {
                mo85002b2 = null;
            } else {
                mo85002b2 = m81027r.mo85002b(obj2);
            }
            Intrinsics.checkNotNull(mo85002b2);
            long m95969k = mo85002b2.m95969k();
            Object obj3 = list.get(2);
            InterfaceC35668Ri5<C33918Jw1, Object> m81036i = C36370Ui5.m81036i(C33918Jw1.f18784c);
            if (Intrinsics.areEqual(obj3, bool) || obj3 == null) {
                mo85002b3 = null;
            } else {
                mo85002b3 = m81036i.mo85002b(obj3);
            }
            Object obj4 = list.get(3);
            if (obj4 != null) {
                c32748Ew1 = (C32748Ew1) obj4;
            } else {
                c32748Ew1 = null;
            }
            Object obj5 = list.get(4);
            if (obj5 != null) {
                c32982Fw1 = (C32982Fw1) obj5;
            } else {
                c32982Fw1 = null;
            }
            Object obj6 = list.get(6);
            if (obj6 != null) {
                str = (String) obj6;
            } else {
                str = null;
            }
            Object obj7 = list.get(7);
            InterfaceC35668Ri5<M26, Object> m81027r2 = C36370Ui5.m81027r(c5158a);
            if (Intrinsics.areEqual(obj7, bool) || obj7 == null) {
                mo85002b4 = null;
            } else {
                mo85002b4 = m81027r2.mo85002b(obj7);
            }
            Intrinsics.checkNotNull(mo85002b4);
            long m95969k2 = mo85002b4.m95969k();
            Object obj8 = list.get(8);
            InterfaceC35668Ri5<C3091HE, Object> m81038g = C36370Ui5.m81038g(C3091HE.f13105b);
            if (Intrinsics.areEqual(obj8, bool) || obj8 == null) {
                mo85002b5 = null;
            } else {
                mo85002b5 = m81038g.mo85002b(obj8);
            }
            Object obj9 = list.get(9);
            InterfaceC35668Ri5<L16, Object> m81030o = C36370Ui5.m81030o(L16.f20613c);
            if (Intrinsics.areEqual(obj9, bool) || obj9 == null) {
                mo85002b6 = null;
            } else {
                mo85002b6 = m81030o.mo85002b(obj9);
            }
            Object obj10 = list.get(10);
            InterfaceC35668Ri5<C50119uv2, Object> m81034k = C36370Ui5.m81034k(C50119uv2.f113196d);
            if (Intrinsics.areEqual(obj10, bool) || obj10 == null) {
                mo85002b7 = null;
            } else {
                mo85002b7 = m81034k.mo85002b(obj10);
            }
            Object obj11 = list.get(11);
            InterfaceC35668Ri5<C47063pm0, Object> m81037h2 = C36370Ui5.m81037h(c27386a);
            if (Intrinsics.areEqual(obj11, bool) || obj11 == null) {
                mo85002b8 = null;
            } else {
                mo85002b8 = m81037h2.mo85002b(obj11);
            }
            Intrinsics.checkNotNull(mo85002b8);
            long m18733w2 = mo85002b8.m18733w();
            Object obj12 = list.get(12);
            InterfaceC35668Ri5<R06, Object> m81031n = C36370Ui5.m81031n(R06.f31395b);
            if (Intrinsics.areEqual(obj12, bool) || obj12 == null) {
                mo85002b9 = null;
            } else {
                mo85002b9 = m81031n.mo85002b(obj12);
            }
            Object obj13 = list.get(13);
            InterfaceC35668Ri5<C35335Px5, Object> m81032m = C36370Ui5.m81032m(C35335Px5.f29462d);
            if (Intrinsics.areEqual(obj13, bool) || obj13 == null) {
                mo85002b10 = null;
            } else {
                mo85002b10 = m81032m.mo85002b(obj13);
            }
            return new GN5(m18733w, m95969k, mo85002b3, c32748Ew1, c32982Fw1, (AbstractC44199kw1) null, str, m95969k2, mo85002b5, mo85002b6, mo85002b7, m18733w2, mo85002b9, mo85002b10, 32, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTi5;", "LR06;", "it", "", C17296a.f69688o, "(LTi5;LR06;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ui5$y */
    /* loaded from: classes.dex */
    public static final class C8425y extends Lambda implements Function2<InterfaceC36136Ti5, R06, Object> {

        /* renamed from: g */
        public static final C8425y f37878g = new C8425y();

        public C8425y() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(InterfaceC36136Ti5 Saver, R06 it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.m87431e());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "LR06;", "b", "(Ljava/lang/Object;)LR06;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ui5$z */
    /* loaded from: classes.dex */
    public static final class C8426z extends Lambda implements Function1<Object, R06> {

        /* renamed from: g */
        public static final C8426z f37879g = new C8426z();

        public C8426z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final R06 invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new R06(((Integer) it).intValue());
        }
    }

    /* renamed from: e */
    public static final InterfaceC35668Ri5<C1577Df, Object> m81040e() {
        return f37823a;
    }

    /* renamed from: f */
    public static final InterfaceC35668Ri5<DE3, Object> m81039f() {
        return f37828f;
    }

    /* renamed from: g */
    public static final InterfaceC35668Ri5<C3091HE, Object> m81038g(C3091HE.C3092a c3092a) {
        Intrinsics.checkNotNullParameter(c3092a, "<this>");
        return f37834l;
    }

    /* renamed from: h */
    public static final InterfaceC35668Ri5<C47063pm0, Object> m81037h(C47063pm0.C27386a c27386a) {
        Intrinsics.checkNotNullParameter(c27386a, "<this>");
        return f37837o;
    }

    /* renamed from: i */
    public static final InterfaceC35668Ri5<C33918Jw1, Object> m81036i(C33918Jw1.C4281a c4281a) {
        Intrinsics.checkNotNullParameter(c4281a, "<this>");
        return f37833k;
    }

    /* renamed from: j */
    public static final InterfaceC35668Ri5<C47748qv2, Object> m81035j(C47748qv2.C27736a c27736a) {
        Intrinsics.checkNotNullParameter(c27736a, "<this>");
        return f37841s;
    }

    /* renamed from: k */
    public static final InterfaceC35668Ri5<C50119uv2, Object> m81034k(C50119uv2.C29341a c29341a) {
        Intrinsics.checkNotNullParameter(c29341a, "<this>");
        return f37840r;
    }

    /* renamed from: l */
    public static final InterfaceC35668Ri5<C32120Ce3, Object> m81033l(C32120Ce3.C1110a c1110a) {
        Intrinsics.checkNotNullParameter(c1110a, "<this>");
        return f37839q;
    }

    /* renamed from: m */
    public static final InterfaceC35668Ri5<C35335Px5, Object> m81032m(C35335Px5.C6595a c6595a) {
        Intrinsics.checkNotNullParameter(c6595a, "<this>");
        return f37836n;
    }

    /* renamed from: n */
    public static final InterfaceC35668Ri5<R06, Object> m81031n(R06.C7050a c7050a) {
        Intrinsics.checkNotNullParameter(c7050a, "<this>");
        return f37830h;
    }

    /* renamed from: o */
    public static final InterfaceC35668Ri5<L16, Object> m81030o(L16.C4691a c4691a) {
        Intrinsics.checkNotNullParameter(c4691a, "<this>");
        return f37831i;
    }

    /* renamed from: p */
    public static final InterfaceC35668Ri5<N16, Object> m81029p(N16.C5461a c5461a) {
        Intrinsics.checkNotNullParameter(c5461a, "<this>");
        return f37832j;
    }

    /* renamed from: q */
    public static final InterfaceC35668Ri5<C48413s26, Object> m81028q(C48413s26.C28164a c28164a) {
        Intrinsics.checkNotNullParameter(c28164a, "<this>");
        return f37835m;
    }

    /* renamed from: r */
    public static final InterfaceC35668Ri5<M26, Object> m81027r(M26.C5158a c5158a) {
        Intrinsics.checkNotNullParameter(c5158a, "<this>");
        return f37838p;
    }

    /* renamed from: s */
    public static final InterfaceC35668Ri5<GN5, Object> m81026s() {
        return f37829g;
    }

    /* renamed from: t */
    public static final <T> T m81025t(T t) {
        return t;
    }

    /* renamed from: u */
    public static final <T extends InterfaceC35668Ri5<Original, Saveable>, Original, Saveable> Object m81024u(Original original, T saver, InterfaceC36136Ti5 scope) {
        Object mo85003a;
        Intrinsics.checkNotNullParameter(saver, "saver");
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (original == null || (mo85003a = saver.mo85003a(scope, original)) == null) {
            return Boolean.FALSE;
        }
        return mo85003a;
    }
}
