package p000;

import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.compose.p003ui.platform.C11411h;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.DB6;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 Z2\u00020\u0001:\u0001\u000fB\u001b\b\u0002\u0012\b\u0010W\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\bX\u0010YJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\u001a\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012R\u0017\u0010\u001c\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u001f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010 \u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\"\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b!\u0010\u0012R\u0017\u0010%\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b#\u0010\u0010\u001a\u0004\b$\u0010\u0012R\u0017\u0010*\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010/\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u0017\u00102\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010.R\u0017\u00105\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b3\u0010,\u001a\u0004\b4\u0010.R\u0017\u00108\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b6\u0010'\u001a\u0004\b7\u0010)R\u0017\u0010;\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b9\u0010'\u001a\u0004\b:\u0010)R\u0017\u0010>\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b<\u0010'\u001a\u0004\b=\u0010)R\u0017\u0010A\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b?\u0010'\u001a\u0004\b@\u0010)R\u0017\u0010D\u001a\u00020&8\u0006¢\u0006\f\n\u0004\bB\u0010'\u001a\u0004\bC\u0010)R\u0017\u0010G\u001a\u00020&8\u0006¢\u0006\f\n\u0004\bE\u0010'\u001a\u0004\bF\u0010)R\u0017\u0010J\u001a\u00020&8\u0006¢\u0006\f\n\u0004\bH\u0010'\u001a\u0004\bI\u0010)R\u0017\u0010O\u001a\u00020K8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\b\u0016\u0010NR\u0016\u0010R\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006["}, m28432d2 = {"LnC6;", "", "Landroid/view/View;", "view", "", "g", "b", "LDB6;", "windowInsets", "", "types", "h", "j", "k", "Lke;", C17296a.f69688o, "Lke;", "getCaptionBar", "()Lke;", "captionBar", "getDisplayCutout", "displayCutout", "c", DateTokenConverter.CONVERTER_KEY, "ime", "getMandatorySystemGestures", "mandatorySystemGestures", "e", "navigationBars", "f", "getStatusBars", "statusBars", "systemBars", "getSystemGestures", "systemGestures", "i", "getTappableElement", "tappableElement", "LKj6;", "LKj6;", "getWaterfall", "()LKj6;", "waterfall", "LpB6;", "LpB6;", "getSafeDrawing", "()LpB6;", "safeDrawing", "l", "getSafeGestures", "safeGestures", "m", "getSafeContent", "safeContent", "n", "getCaptionBarIgnoringVisibility", "captionBarIgnoringVisibility", "o", "getNavigationBarsIgnoringVisibility", "navigationBarsIgnoringVisibility", "p", "getStatusBarsIgnoringVisibility", "statusBarsIgnoringVisibility", "q", "getSystemBarsIgnoringVisibility", "systemBarsIgnoringVisibility", "r", "getTappableElementIgnoringVisibility", "tappableElementIgnoringVisibility", "s", "getImeAnimationTarget", "imeAnimationTarget", "t", "getImeAnimationSource", "imeAnimationSource", "", "u", "Z", "()Z", "consumes", "v", "I", "accessCount", "LE32;", "w", "LE32;", "insetsListener", "insets", "<init>", "(LDB6;Landroid/view/View;)V", "x", "foundation-layout_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: nC6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45547nC6 {

    /* renamed from: x */
    public static final C26443a f99613x = new C26443a(null);

    /* renamed from: y */
    public static final WeakHashMap<View, C45547nC6> f99614y = new WeakHashMap<>();

    /* renamed from: z */
    public static boolean f99615z;

    /* renamed from: a */
    public final C25196ke f99616a;

    /* renamed from: b */
    public final C25196ke f99617b;

    /* renamed from: c */
    public final C25196ke f99618c;

    /* renamed from: d */
    public final C25196ke f99619d;

    /* renamed from: e */
    public final C25196ke f99620e;

    /* renamed from: f */
    public final C25196ke f99621f;

    /* renamed from: g */
    public final C25196ke f99622g;

    /* renamed from: h */
    public final C25196ke f99623h;

    /* renamed from: i */
    public final C25196ke f99624i;

    /* renamed from: j */
    public final C34040Kj6 f99625j;

    /* renamed from: k */
    public final InterfaceC46724pB6 f99626k;

    /* renamed from: l */
    public final InterfaceC46724pB6 f99627l;

    /* renamed from: m */
    public final InterfaceC46724pB6 f99628m;

    /* renamed from: n */
    public final C34040Kj6 f99629n;

    /* renamed from: o */
    public final C34040Kj6 f99630o;

    /* renamed from: p */
    public final C34040Kj6 f99631p;

    /* renamed from: q */
    public final C34040Kj6 f99632q;

    /* renamed from: r */
    public final C34040Kj6 f99633r;

    /* renamed from: s */
    public final C34040Kj6 f99634s;

    /* renamed from: t */
    public final C34040Kj6 f99635t;

    /* renamed from: u */
    public final boolean f99636u;

    /* renamed from: v */
    public int f99637v;

    /* renamed from: w */
    public final E32 f99638w;

    @Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\"\u0010\u000f\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002J\"\u0010\u0011\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m28432d2 = {"LnC6$a;", "", "LnC6;", "c", "(LEt0;I)LnC6;", "Landroid/view/View;", "view", DateTokenConverter.CONVERTER_KEY, "LDB6;", "windowInsets", "", "type", "", "name", "Lke;", "e", "LKj6;", "f", "", "testInsets", "Z", "Ljava/util/WeakHashMap;", "viewMap", "Ljava/util/WeakHashMap;", "<init>", "()V", "foundation-layout_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWindowInsets.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,767:1\n76#2:768\n361#3,7:769\n1#4:776\n*S KotlinDebug\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion\n*L\n610#1:768\n628#1:769,7\n*E\n"})
    /* renamed from: nC6$a */
    /* loaded from: classes.dex */
    public static final class C26443a {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nWindowInsets.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion$current$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,767:1\n62#2,5:768\n*S KotlinDebug\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion$current$1\n*L\n615#1:768,5\n*E\n"})
        /* renamed from: nC6$a$a */
        /* loaded from: classes.dex */
        public static final class C26444a extends Lambda implements Function1<C44881m51, InterfaceC44288l51> {

            /* renamed from: g */
            public final /* synthetic */ C45547nC6 f99639g;

            /* renamed from: h */
            public final /* synthetic */ View f99640h;

            @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"nC6$a$a$a", "Ll51;", "", "dispose", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion$current$1\n*L\n1#1,483:1\n616#2,2:484\n*E\n"})
            /* renamed from: nC6$a$a$a */
            /* loaded from: classes.dex */
            public static final class C26445a implements InterfaceC44288l51 {

                /* renamed from: a */
                public final /* synthetic */ C45547nC6 f99641a;

                /* renamed from: b */
                public final /* synthetic */ View f99642b;

                public C26445a(C45547nC6 c45547nC6, View view) {
                    this.f99641a = c45547nC6;
                    this.f99642b = view;
                }

                @Override // p000.InterfaceC44288l51
                public void dispose() {
                    this.f99641a.m24157b(this.f99642b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26444a(C45547nC6 c45547nC6, View view) {
                super(1);
                this.f99639g = c45547nC6;
                this.f99640h = view;
            }

            @Override // kotlin.jvm.functions.Function1
            public final InterfaceC44288l51 invoke(C44881m51 DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                this.f99639g.m24152g(this.f99640h);
                return new C26445a(this.f99639g, this.f99640h);
            }
        }

        public /* synthetic */ C26443a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public final C45547nC6 m24145c(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            interfaceC32720Et0.mo89638F(-1366542614);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1366542614, i, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:608)");
            }
            View view = (View) interfaceC32720Et0.mo89572c(C11411h.m68320k());
            C45547nC6 m24144d = m24144d(view);
            Y91.m75536c(m24144d, new C26444a(m24144d, view), interfaceC32720Et0, 8);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return m24144d;
        }

        /* renamed from: d */
        public final C45547nC6 m24144d(View view) {
            C45547nC6 c45547nC6;
            synchronized (C45547nC6.f99614y) {
                WeakHashMap weakHashMap = C45547nC6.f99614y;
                Object obj = weakHashMap.get(view);
                if (obj == null) {
                    obj = new C45547nC6(null, view, null);
                    weakHashMap.put(view, obj);
                }
                c45547nC6 = (C45547nC6) obj;
            }
            return c45547nC6;
        }

        /* renamed from: e */
        public final C25196ke m24143e(DB6 db6, int i, String str) {
            C25196ke c25196ke = new C25196ke(i, str);
            if (db6 != null) {
                c25196ke.m28709h(db6, i);
            }
            return c25196ke;
        }

        /* renamed from: f */
        public final C34040Kj6 m24142f(DB6 db6, int i, String str) {
            D32 d32;
            if (db6 == null || (d32 = db6.m110783g(i)) == null) {
                d32 = D32.f5125e;
            }
            Intrinsics.checkNotNullExpressionValue(d32, "windowInsets?.getInsetsI…e) ?: AndroidXInsets.NONE");
            return C47919rC6.m16262a(d32, str);
        }

        private C26443a() {
        }
    }

    public /* synthetic */ C45547nC6(DB6 db6, View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(db6, view);
    }

    /* renamed from: i */
    public static /* synthetic */ void m24150i(C45547nC6 c45547nC6, DB6 db6, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        c45547nC6.m24151h(db6, i);
    }

    /* renamed from: b */
    public final void m24157b(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int i = this.f99637v - 1;
        this.f99637v = i;
        if (i == 0) {
            C38790bq6.m62531L0(view, null);
            C38790bq6.m62491d1(view, null);
            view.removeOnAttachStateChangeListener(this.f99638w);
        }
    }

    /* renamed from: c */
    public final boolean m24156c() {
        return this.f99636u;
    }

    /* renamed from: d */
    public final C25196ke m24155d() {
        return this.f99618c;
    }

    /* renamed from: e */
    public final C25196ke m24154e() {
        return this.f99620e;
    }

    /* renamed from: f */
    public final C25196ke m24153f() {
        return this.f99622g;
    }

    /* renamed from: g */
    public final void m24152g(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.f99637v == 0) {
            C38790bq6.m62531L0(view, this.f99638w);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.f99638w);
            C38790bq6.m62491d1(view, this.f99638w);
        }
        this.f99637v++;
    }

    /* renamed from: h */
    public final void m24151h(DB6 windowInsets, int i) {
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        if (f99615z) {
            WindowInsets m110766x = windowInsets.m110766x();
            Intrinsics.checkNotNull(m110766x);
            windowInsets = DB6.m110765y(m110766x);
        }
        Intrinsics.checkNotNullExpressionValue(windowInsets, "if (testInsets) {\n      …   windowInsets\n        }");
        this.f99616a.m28709h(windowInsets, i);
        this.f99618c.m28709h(windowInsets, i);
        this.f99617b.m28709h(windowInsets, i);
        this.f99620e.m28709h(windowInsets, i);
        this.f99621f.m28709h(windowInsets, i);
        this.f99622g.m28709h(windowInsets, i);
        this.f99623h.m28709h(windowInsets, i);
        this.f99624i.m28709h(windowInsets, i);
        this.f99619d.m28709h(windowInsets, i);
        if (i == 0) {
            C34040Kj6 c34040Kj6 = this.f99629n;
            D32 m110783g = windowInsets.m110783g(DB6.C1428m.m110722a());
            Intrinsics.checkNotNullExpressionValue(m110783g, "insets.getInsetsIgnoring…aptionBar()\n            )");
            c34040Kj6.m98341f(C47919rC6.m16261b(m110783g));
            C34040Kj6 c34040Kj62 = this.f99630o;
            D32 m110783g2 = windowInsets.m110783g(DB6.C1428m.m110717f());
            Intrinsics.checkNotNullExpressionValue(m110783g2, "insets.getInsetsIgnoring…ationBars()\n            )");
            c34040Kj62.m98341f(C47919rC6.m16261b(m110783g2));
            C34040Kj6 c34040Kj63 = this.f99631p;
            D32 m110783g3 = windowInsets.m110783g(DB6.C1428m.m110716g());
            Intrinsics.checkNotNullExpressionValue(m110783g3, "insets.getInsetsIgnoring…tatusBars()\n            )");
            c34040Kj63.m98341f(C47919rC6.m16261b(m110783g3));
            C34040Kj6 c34040Kj64 = this.f99632q;
            D32 m110783g4 = windowInsets.m110783g(DB6.C1428m.m110715h());
            Intrinsics.checkNotNullExpressionValue(m110783g4, "insets.getInsetsIgnoring…ystemBars()\n            )");
            c34040Kj64.m98341f(C47919rC6.m16261b(m110783g4));
            C34040Kj6 c34040Kj65 = this.f99633r;
            D32 m110783g5 = windowInsets.m110783g(DB6.C1428m.m110713j());
            Intrinsics.checkNotNullExpressionValue(m110783g5, "insets.getInsetsIgnoring…leElement()\n            )");
            c34040Kj65.m98341f(C47919rC6.m16261b(m110783g5));
            C40730f51 m110785e = windowInsets.m110785e();
            if (m110785e != null) {
                D32 m42115e = m110785e.m42115e();
                Intrinsics.checkNotNullExpressionValue(m42115e, "cutout.waterfallInsets");
                this.f99625j.m98341f(C47919rC6.m16261b(m42115e));
            }
        }
        AbstractC48600sM5.f108670e.m14275g();
    }

    /* renamed from: j */
    public final void m24149j(DB6 windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        C34040Kj6 c34040Kj6 = this.f99635t;
        D32 m110784f = windowInsets.m110784f(DB6.C1428m.m110720c());
        Intrinsics.checkNotNullExpressionValue(m110784f, "windowInsets.getInsets(W…wInsetsCompat.Type.ime())");
        c34040Kj6.m98341f(C47919rC6.m16261b(m110784f));
    }

    /* renamed from: k */
    public final void m24148k(DB6 windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        C34040Kj6 c34040Kj6 = this.f99634s;
        D32 m110784f = windowInsets.m110784f(DB6.C1428m.m110720c());
        Intrinsics.checkNotNullExpressionValue(m110784f, "windowInsets.getInsets(W…wInsetsCompat.Type.ime())");
        c34040Kj6.m98341f(C47919rC6.m16261b(m110784f));
    }

    public C45547nC6(DB6 db6, View view) {
        C40730f51 m110785e;
        C26443a c26443a = f99613x;
        this.f99616a = c26443a.m24143e(db6, DB6.C1428m.m110722a(), "captionBar");
        C25196ke m24143e = c26443a.m24143e(db6, DB6.C1428m.m110721b(), "displayCutout");
        this.f99617b = m24143e;
        C25196ke m24143e2 = c26443a.m24143e(db6, DB6.C1428m.m110720c(), "ime");
        this.f99618c = m24143e2;
        C25196ke m24143e3 = c26443a.m24143e(db6, DB6.C1428m.m110718e(), "mandatorySystemGestures");
        this.f99619d = m24143e3;
        this.f99620e = c26443a.m24143e(db6, DB6.C1428m.m110717f(), "navigationBars");
        this.f99621f = c26443a.m24143e(db6, DB6.C1428m.m110716g(), "statusBars");
        C25196ke m24143e4 = c26443a.m24143e(db6, DB6.C1428m.m110715h(), "systemBars");
        this.f99622g = m24143e4;
        C25196ke m24143e5 = c26443a.m24143e(db6, DB6.C1428m.m110714i(), "systemGestures");
        this.f99623h = m24143e5;
        C25196ke m24143e6 = c26443a.m24143e(db6, DB6.C1428m.m110713j(), "tappableElement");
        this.f99624i = m24143e6;
        D32 d32 = (db6 == null || (m110785e = db6.m110785e()) == null || (d32 = m110785e.m42115e()) == null) ? D32.f5125e : d32;
        Intrinsics.checkNotNullExpressionValue(d32, "insets?.displayCutout?.w…ts ?: AndroidXInsets.NONE");
        C34040Kj6 m16262a = C47919rC6.m16262a(d32, "waterfall");
        this.f99625j = m16262a;
        InterfaceC46724pB6 m21632c = C46140oC6.m21632c(C46140oC6.m21632c(m24143e4, m24143e2), m24143e);
        this.f99626k = m21632c;
        InterfaceC46724pB6 m21632c2 = C46140oC6.m21632c(C46140oC6.m21632c(C46140oC6.m21632c(m24143e6, m24143e3), m24143e5), m16262a);
        this.f99627l = m21632c2;
        this.f99628m = C46140oC6.m21632c(m21632c, m21632c2);
        this.f99629n = c26443a.m24142f(db6, DB6.C1428m.m110722a(), "captionBarIgnoringVisibility");
        this.f99630o = c26443a.m24142f(db6, DB6.C1428m.m110717f(), "navigationBarsIgnoringVisibility");
        this.f99631p = c26443a.m24142f(db6, DB6.C1428m.m110716g(), "statusBarsIgnoringVisibility");
        this.f99632q = c26443a.m24142f(db6, DB6.C1428m.m110715h(), "systemBarsIgnoringVisibility");
        this.f99633r = c26443a.m24142f(db6, DB6.C1428m.m110713j(), "tappableElementIgnoringVisibility");
        this.f99634s = c26443a.m24142f(db6, DB6.C1428m.m110720c(), "imeAnimationTarget");
        this.f99635t = c26443a.m24142f(db6, DB6.C1428m.m110720c(), "imeAnimationSource");
        ViewParent parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(C46424oh4.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? tag : null;
        this.f99636u = bool != null ? bool.booleanValue() : true;
        this.f99638w = new E32(this);
    }
}
