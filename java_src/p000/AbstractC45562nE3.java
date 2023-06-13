package p000;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002J\f\u0010\u000f\u001a\u00020\u0006*\u00020\u000eH$J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0014J\u0012\u0010\u0012\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000bH\u0014J5\u0010\u0019\u001a\u00020\u0006*\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0016\u0010\u0013\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010 R%\u0010#\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060!¢\u0006\u0002\b\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001d\u0010'\u001a\u00020\u00158&X¦\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b%\u0010&\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006*"}, m28432d2 = {"LnE3;", "", "LkE3;", "obtainPaint", "Lsm0;", "colorFilter", "", "configureColorFilter", "", "alpha", "configureAlpha", "Lpm2;", "rtl", "configureLayoutDirection", "LI61;", "onDraw", "", "applyAlpha", "applyColorFilter", "layoutDirection", "applyLayoutDirection", "LxB5;", "size", "draw-x_KDEd0", "(LI61;JFLsm0;)V", "draw", "layerPaint", "LkE3;", "useLayer", "Z", "Lsm0;", "F", "Lpm2;", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "drawLambda", "Lkotlin/jvm/functions/Function1;", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "<init>", "()V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Painter.kt\nandroidx/compose/ui/graphics/painter/Painter\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Canvas.kt\nandroidx/compose/ui/graphics/CanvasKt\n*L\n1#1,217:1\n66#2,2:218\n245#2:220\n68#2,2:228\n111#3,7:221\n*S KotlinDebug\n*F\n+ 1 Painter.kt\nandroidx/compose/ui/graphics/painter/Painter\n*L\n195#1:218,2\n206#1:220\n195#1:228,2\n207#1:221,7\n*E\n"})
/* renamed from: nE3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC45562nE3 {
    private C48841sm0 colorFilter;
    private InterfaceC43783kE3 layerPaint;
    private boolean useLayer;
    private float alpha = 1.0f;
    private EnumC47065pm2 layoutDirection = EnumC47065pm2.Ltr;
    private final Function1<I61, Unit> drawLambda = new C26448a();

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LI61;", "", "invoke", "(LI61;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: nE3$a */
    /* loaded from: classes.dex */
    public static final class C26448a extends Lambda implements Function1<I61, Unit> {
        public C26448a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(I61 i61) {
            invoke2(i61);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(I61 i61) {
            Intrinsics.checkNotNullParameter(i61, "$this$null");
            AbstractC45562nE3.this.onDraw(i61);
        }
    }

    private final void configureAlpha(float f) {
        boolean z;
        boolean z2;
        if (this.alpha == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (!applyAlpha(f)) {
                if (f == 1.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    InterfaceC43783kE3 interfaceC43783kE3 = this.layerPaint;
                    if (interfaceC43783kE3 != null) {
                        interfaceC43783kE3.mo29178g(f);
                    }
                    this.useLayer = false;
                } else {
                    obtainPaint().mo29178g(f);
                    this.useLayer = true;
                }
            }
            this.alpha = f;
        }
    }

    private final void configureColorFilter(C48841sm0 c48841sm0) {
        if (!Intrinsics.areEqual(this.colorFilter, c48841sm0)) {
            if (!applyColorFilter(c48841sm0)) {
                if (c48841sm0 == null) {
                    InterfaceC43783kE3 interfaceC43783kE3 = this.layerPaint;
                    if (interfaceC43783kE3 != null) {
                        interfaceC43783kE3.mo29171n(null);
                    }
                    this.useLayer = false;
                } else {
                    obtainPaint().mo29171n(c48841sm0);
                    this.useLayer = true;
                }
            }
            this.colorFilter = c48841sm0;
        }
    }

    private final void configureLayoutDirection(EnumC47065pm2 enumC47065pm2) {
        if (this.layoutDirection != enumC47065pm2) {
            applyLayoutDirection(enumC47065pm2);
            this.layoutDirection = enumC47065pm2;
        }
    }

    /* renamed from: draw-x_KDEd0$default  reason: not valid java name */
    public static /* synthetic */ void m118305drawx_KDEd0$default(AbstractC45562nE3 abstractC45562nE3, I61 i61, long j, float f, C48841sm0 c48841sm0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
        }
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 4) != 0) {
            c48841sm0 = null;
        }
        abstractC45562nE3.m118306drawx_KDEd0(i61, j, f2, c48841sm0);
    }

    private final InterfaceC43783kE3 obtainPaint() {
        InterfaceC43783kE3 interfaceC43783kE3 = this.layerPaint;
        if (interfaceC43783kE3 == null) {
            InterfaceC43783kE3 m36156a = C22702hd.m36156a();
            this.layerPaint = m36156a;
            return m36156a;
        }
        return interfaceC43783kE3;
    }

    public boolean applyAlpha(float f) {
        return false;
    }

    public boolean applyColorFilter(C48841sm0 c48841sm0) {
        return false;
    }

    public boolean applyLayoutDirection(EnumC47065pm2 layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return false;
    }

    /* renamed from: draw-x_KDEd0  reason: not valid java name */
    public final void m118306drawx_KDEd0(I61 draw, long j, float f, C48841sm0 c48841sm0) {
        Intrinsics.checkNotNullParameter(draw, "$this$draw");
        configureAlpha(f);
        configureColorFilter(c48841sm0);
        configureLayoutDirection(draw.getLayoutDirection());
        float m5730i = C51465xB5.m5730i(draw.mo96360h()) - C51465xB5.m5730i(j);
        float m5732g = C51465xB5.m5732g(draw.mo96360h()) - C51465xB5.m5732g(j);
        draw.mo20750d0().mo20722c().mo19023g(0.0f, 0.0f, m5730i, m5732g);
        if (f > 0.0f && C51465xB5.m5730i(j) > 0.0f && C51465xB5.m5732g(j) > 0.0f) {
            if (this.useLayer) {
                C35055Os4 m84692b = C35991Ss4.m84692b(C32120Ce3.f4427b.m111932c(), CB5.m112663a(C51465xB5.m5730i(j), C51465xB5.m5732g(j)));
                InterfaceC45204me0 mo20724a = draw.mo20750d0().mo20724a();
                try {
                    mo20724a.mo25243x(m84692b, obtainPaint());
                    onDraw(draw);
                } finally {
                    mo20724a.mo25251p();
                }
            } else {
                onDraw(draw);
            }
        }
        draw.mo20750d0().mo20722c().mo19023g(-0.0f, -0.0f, -m5730i, -m5732g);
    }

    /* renamed from: getIntrinsicSize-NH-jbRc */
    public abstract long mo116236getIntrinsicSizeNHjbRc();

    public abstract void onDraw(I61 i61);
}
