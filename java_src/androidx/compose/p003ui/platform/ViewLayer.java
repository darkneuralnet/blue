package androidx.compose.p003ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.p003ui.graphics.C11325a;
import androidx.compose.p003ui.graphics.C11333f;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u0082\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u00012B;\u0012\u0006\u0010O\u001a\u00020K\u0012\u0006\u0010T\u001a\u00020P\u0012\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00040G\u0012\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040I¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J¯\u0001\u0010#\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\b\u0010%\u001a\u00020\u0016H\u0016J\u001d\u0010(\u001a\u00020\u00162\u0006\u0010'\u001a\u00020&H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)J\u001d\u0010,\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-J\u001d\u0010/\u001a\u00020\u00042\u0006\u0010'\u001a\u00020.H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u0010-J\u0010\u00102\u001a\u00020\u00042\u0006\u00101\u001a\u000200H\u0016J\u0010\u00104\u001a\u00020\u00042\u0006\u00101\u001a\u000203H\u0014J\b\u00105\u001a\u00020\u0004H\u0016J0\u0010<\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u00162\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u0002072\u0006\u0010;\u001a\u000207H\u0014J\b\u0010=\u001a\u00020\u0004H\u0016J\b\u0010>\u001a\u00020\u0004H\u0016J\b\u0010?\u001a\u00020\u0004H\u0016J%\u0010B\u001a\u00020&2\u0006\u0010@\u001a\u00020&2\u0006\u0010A\u001a\u00020\u0016H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bB\u0010CJ\u0018\u0010F\u001a\u00020\u00042\u0006\u0010E\u001a\u00020D2\u0006\u0010A\u001a\u00020\u0016H\u0016J*\u0010;\u001a\u00020\u00042\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00040G2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040IH\u0016R\u0017\u0010O\u001a\u00020K8\u0006¢\u0006\f\n\u0004\b;\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010T\u001a\u00020P8\u0006¢\u0006\f\n\u0004\b2\u0010Q\u001a\u0004\bR\u0010SR$\u0010H\u001a\u0010\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010UR\u001e\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010VR\u0014\u0010Y\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010XR\u0016\u0010[\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010ZR\u0018\u0010^\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010]R*\u0010c\u001a\u00020\u00162\u0006\u0010_\u001a\u00020\u00168\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010Z\u001a\u0004\b9\u0010`\"\u0004\ba\u0010bR\u0016\u0010e\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010ZR\u0014\u0010i\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00010j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010kR\u001f\u0010o\u001a\u00020\u00128\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010q\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010ZR\u001a\u0010v\u001a\u00020r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bs\u0010n\u001a\u0004\bt\u0010uR\u0016\u0010z\u001a\u0004\u0018\u00010w8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bx\u0010yR$\u0010\u007f\u001a\u00020\u00072\u0006\u0010_\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0083\u0001"}, m28432d2 = {"Landroidx/compose/ui/platform/ViewLayer;", "Landroid/view/View;", "LiD3;", "", "", "w", "u", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/f;", "transformOrigin", "Lhy5;", "shape", "", "clip", "Low4;", "renderEffect", "Lpm0;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/a;", "compositingStrategy", "Lpm2;", "layoutDirection", "Lg01;", "density", DateTokenConverter.CONVERTER_KEY, "(FFFFFFFFFFJLhy5;ZLow4;JJILpm2;Lg01;)V", "hasOverlappingRendering", "LCe3;", "position", "g", "(J)Z", "LG52;", "size", "f", "(J)V", "LA52;", "h", "Lme0;", "canvas", "c", "Landroid/graphics/Canvas;", "dispatchDraw", "invalidate", "changed", "", "l", "t", "r", "b", "onLayout", "destroy", "i", "forceLayout", "point", "inverse", "e", "(JZ)J", "LyX2;", "rect", C17296a.f69688o, "Lkotlin/Function1;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "Landroidx/compose/ui/platform/AndroidComposeView;", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Landroidx/compose/ui/platform/DrawChildContainer;", "Landroidx/compose/ui/platform/DrawChildContainer;", "getContainer", "()Landroidx/compose/ui/platform/DrawChildContainer;", "container", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "LOz3;", "LOz3;", "outlineResolver", "Z", "clipToBounds", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "clipBoundsCache", "value", "()Z", "v", "(Z)V", "isInvalidated", "j", "drawnWithZ", "Lqe0;", "k", "Lqe0;", "canvasHolder", "Lhm2;", "Lhm2;", "matrixCache", "m", "J", "mTransformOrigin", "n", "mHasOverlappingRendering", "", "o", "getLayerId", "()J", "layerId", "LcJ3;", "s", "()LcJ3;", "manualClipPath", "getCameraDistancePx", "()F", "setCameraDistancePx", "(F)V", "cameraDistancePx", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/ui/platform/DrawChildContainer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "p", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nViewLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,476:1\n47#2,5:477\n*S KotlinDebug\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer\n*L\n290#1:477,5\n*E\n"})
/* renamed from: androidx.compose.ui.platform.ViewLayer */
/* loaded from: classes.dex */
public final class ViewLayer extends View implements InterfaceC42588iD3 {

    /* renamed from: p */
    public static final C11358c f53175p = new C11358c(null);

    /* renamed from: q */
    public static final Function2<View, Matrix, Unit> f53176q = C11357b.f53196g;

    /* renamed from: r */
    public static final ViewOutlineProvider f53177r = new C11356a();

    /* renamed from: s */
    public static Method f53178s;

    /* renamed from: t */
    public static Field f53179t;

    /* renamed from: u */
    public static boolean f53180u;

    /* renamed from: v */
    public static boolean f53181v;

    /* renamed from: b */
    public final AndroidComposeView f53182b;

    /* renamed from: c */
    public final DrawChildContainer f53183c;

    /* renamed from: d */
    public Function1<? super InterfaceC45204me0, Unit> f53184d;

    /* renamed from: e */
    public Function0<Unit> f53185e;

    /* renamed from: f */
    public final C35117Oz3 f53186f;

    /* renamed from: g */
    public boolean f53187g;

    /* renamed from: h */
    public Rect f53188h;

    /* renamed from: i */
    public boolean f53189i;

    /* renamed from: j */
    public boolean f53190j;

    /* renamed from: k */
    public final C47576qe0 f53191k;

    /* renamed from: l */
    public final C42321hm2<View> f53192l;

    /* renamed from: m */
    public long f53193m;

    /* renamed from: n */
    public boolean f53194n;

    /* renamed from: o */
    public final long f53195o;

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, m28432d2 = {"androidx/compose/ui/platform/ViewLayer$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "", "getOutline", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.ViewLayer$a */
    /* loaded from: classes.dex */
    public static final class C11356a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(outline, "outline");
            Outline m91129c = ((ViewLayer) view).f53186f.m91129c();
            Intrinsics.checkNotNull(m91129c);
            outline.set(m91129c);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/view/View;", "view", "Landroid/graphics/Matrix;", "matrix", "", C17296a.f69688o, "(Landroid/view/View;Landroid/graphics/Matrix;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.ViewLayer$b */
    /* loaded from: classes.dex */
    public static final class C11357b extends Lambda implements Function2<View, Matrix, Unit> {

        /* renamed from: g */
        public static final C11357b f53196g = new C11357b();

        public C11357b() {
            super(2);
        }

        /* renamed from: a */
        public final void m68513a(View view, Matrix matrix) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(matrix, "matrix");
            matrix.set(view.getMatrix());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(View view, Matrix matrix) {
            m68513a(view, matrix);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR*\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b\"\u0004\b\u000e\u0010\u000fR&\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m28432d2 = {"Landroidx/compose/ui/platform/ViewLayer$c;", "", "Landroid/view/View;", "view", "", DateTokenConverter.CONVERTER_KEY, "", "<set-?>", "hasRetrievedMethod", "Z", C17296a.f69688o, "()Z", "shouldUseDispatchDraw", "b", "c", "(Z)V", "Lkotlin/Function2;", "Landroid/graphics/Matrix;", "getMatrix", "Lkotlin/jvm/functions/Function2;", "Ljava/lang/reflect/Field;", "recreateDisplayList", "Ljava/lang/reflect/Field;", "Ljava/lang/reflect/Method;", "updateDisplayListIfDirtyMethod", "Ljava/lang/reflect/Method;", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nViewLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer$Companion\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,476:1\n26#2:477\n*S KotlinDebug\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer$Companion\n*L\n431#1:477\n*E\n"})
    /* renamed from: androidx.compose.ui.platform.ViewLayer$c */
    /* loaded from: classes.dex */
    public static final class C11358c {
        public /* synthetic */ C11358c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean m68512a() {
            return ViewLayer.f53180u;
        }

        /* renamed from: b */
        public final boolean m68511b() {
            return ViewLayer.f53181v;
        }

        /* renamed from: c */
        public final void m68510c(boolean z) {
            ViewLayer.f53181v = z;
        }

        @SuppressLint({"BanUncheckedReflection"})
        /* renamed from: d */
        public final void m68509d(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            try {
                if (!m68512a()) {
                    ViewLayer.f53180u = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        ViewLayer.f53178s = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.f53179t = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        ViewLayer.f53178s = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.f53179t = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = ViewLayer.f53178s;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = ViewLayer.f53179t;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = ViewLayer.f53179t;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = ViewLayer.f53178s;
                if (method2 != null) {
                    method2.invoke(view, new Object[0]);
                }
            } catch (Throwable unused) {
                m68510c(true);
            }
        }

        private C11358c() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewLayer(AndroidComposeView ownerView, DrawChildContainer container, Function1<? super InterfaceC45204me0, Unit> drawBlock, Function0<Unit> invalidateParentLayer) {
        super(ownerView.getContext());
        Intrinsics.checkNotNullParameter(ownerView, "ownerView");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        Intrinsics.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        this.f53182b = ownerView;
        this.f53183c = container;
        this.f53184d = drawBlock;
        this.f53185e = invalidateParentLayer;
        this.f53186f = new C35117Oz3(ownerView.mo30995b());
        this.f53191k = new C47576qe0();
        this.f53192l = new C42321hm2<>(f53176q);
        this.f53193m = C11333f.f53066b.m68626a();
        this.f53194n = true;
        setWillNotDraw(false);
        container.addView(this);
        this.f53195o = View.generateViewId();
    }

    @Override // p000.InterfaceC42588iD3
    /* renamed from: a */
    public void mo29672a(C52253yX2 rect, boolean z) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        if (z) {
            float[] m35880a = this.f53192l.m35880a(this);
            if (m35880a != null) {
                C42084hN2.m36490g(m35880a, rect);
                return;
            } else {
                rect.m3366g(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
        }
        C42084hN2.m36490g(this.f53192l.m35879b(this), rect);
    }

    @Override // p000.InterfaceC42588iD3
    /* renamed from: b */
    public void mo29671b(Function1<? super InterfaceC45204me0, Unit> drawBlock, Function0<Unit> invalidateParentLayer) {
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        Intrinsics.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        this.f53183c.addView(this);
        this.f53187g = false;
        this.f53190j = false;
        this.f53193m = C11333f.f53066b.m68626a();
        this.f53184d = drawBlock;
        this.f53185e = invalidateParentLayer;
    }

    @Override // p000.InterfaceC42588iD3
    /* renamed from: c */
    public void mo29670c(InterfaceC45204me0 canvas) {
        boolean z;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (getElevation() > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        this.f53190j = z;
        if (z) {
            canvas.mo25249r();
        }
        this.f53183c.m68530a(canvas, this, getDrawingTime());
        if (this.f53190j) {
            canvas.mo25258i();
        }
    }

    @Override // p000.InterfaceC42588iD3
    /* renamed from: d */
    public void mo29669d(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, InterfaceC42444hy5 shape, boolean z, AbstractC46574ow4 abstractC46574ow4, long j2, long j3, int i, EnumC47065pm2 layoutDirection, InterfaceC41273g01 density) {
        Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        this.f53193m = j;
        setScaleX(f);
        setScaleY(f2);
        setAlpha(f3);
        setTranslationX(f4);
        setTranslationY(f5);
        setElevation(f6);
        setRotation(f9);
        setRotationX(f7);
        setRotationY(f8);
        setPivotX(C11333f.m68631f(this.f53193m) * getWidth());
        setPivotY(C11333f.m68630g(this.f53193m) * getHeight());
        setCameraDistancePx(f10);
        boolean z2 = true;
        this.f53187g = z && shape == C37629Zs4.m72365a();
        m68516u();
        boolean z3 = m68518s() != null;
        setClipToOutline(z && shape != C37629Zs4.m72365a());
        boolean m91125g = this.f53186f.m91125g(shape, getAlpha(), getClipToOutline(), getElevation(), layoutDirection, density);
        m68514w();
        boolean z4 = m68518s() != null;
        if (z3 != z4 || (z4 && m91125g)) {
            invalidate();
        }
        if (!this.f53190j && getElevation() > 0.0f && (function0 = this.f53185e) != null) {
            function0.invoke();
        }
        this.f53192l.m35878c();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            C33176Gr6 c33176Gr6 = C33176Gr6.f12555a;
            c33176Gr6.m104670a(this, C50619vm0.m8173h(j2));
            c33176Gr6.m104669b(this, C50619vm0.m8173h(j3));
        }
        if (i2 >= 31) {
            C33644Ir6.f16338a.m101581a(this, abstractC46574ow4);
        }
        C11325a.C11326a c11326a = C11325a.f53022a;
        if (C11325a.m68720e(i, c11326a.m68715c())) {
            setLayerType(2, null);
        } else if (C11325a.m68720e(i, c11326a.m68716b())) {
            setLayerType(0, null);
            z2 = false;
        } else {
            setLayerType(0, null);
        }
        this.f53194n = z2;
    }

    @Override // p000.InterfaceC42588iD3
    public void destroy() {
        m68515v(false);
        this.f53182b.m68591U0();
        this.f53184d = null;
        this.f53185e = null;
        this.f53182b.m68593S0(this);
        this.f53183c.removeViewInLayout(this);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        boolean z = false;
        m68515v(false);
        C47576qe0 c47576qe0 = this.f53191k;
        Canvas m71102y = c47576qe0.m17308a().m71102y();
        c47576qe0.m17308a().m71101z(canvas);
        C10761ac m17308a = c47576qe0.m17308a();
        if (m68518s() != null || !canvas.isHardwareAccelerated()) {
            m17308a.mo25245v();
            this.f53186f.m91131a(m17308a);
            z = true;
        }
        Function1<? super InterfaceC45204me0, Unit> function1 = this.f53184d;
        if (function1 != null) {
            function1.invoke(m17308a);
        }
        if (z) {
            m17308a.mo25251p();
        }
        c47576qe0.m17308a().m71101z(m71102y);
    }

    @Override // p000.InterfaceC42588iD3
    /* renamed from: e */
    public long mo29668e(long j, boolean z) {
        if (z) {
            float[] m35880a = this.f53192l.m35880a(this);
            if (m35880a != null) {
                return C42084hN2.m36491f(m35880a, j);
            }
            return C32120Ce3.f4427b.m111934a();
        }
        return C42084hN2.m36491f(this.f53192l.m35879b(this), j);
    }

    @Override // p000.InterfaceC42588iD3
    /* renamed from: f */
    public void mo29667f(long j) {
        int m105829g = G52.m105829g(j);
        int m105830f = G52.m105830f(j);
        if (m105829g != getWidth() || m105830f != getHeight()) {
            float f = m105829g;
            setPivotX(C11333f.m68631f(this.f53193m) * f);
            float f2 = m105830f;
            setPivotY(C11333f.m68630g(this.f53193m) * f2);
            this.f53186f.m91124h(CB5.m112663a(f, f2));
            m68514w();
            layout(getLeft(), getTop(), getLeft() + m105829g, getTop() + m105830f);
            m68516u();
            this.f53192l.m35878c();
        }
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // p000.InterfaceC42588iD3
    /* renamed from: g */
    public boolean mo29666g(long j) {
        float m111944o = C32120Ce3.m111944o(j);
        float m111943p = C32120Ce3.m111943p(j);
        if (this.f53187g) {
            if (0.0f <= m111944o && m111944o < getWidth() && 0.0f <= m111943p && m111943p < getHeight()) {
                return true;
            }
            return false;
        } else if (!getClipToOutline()) {
            return true;
        } else {
            return this.f53186f.m91127e(j);
        }
    }

    @Override // p000.InterfaceC42588iD3
    /* renamed from: h */
    public void mo29665h(long j) {
        int m116111j = A52.m116111j(j);
        if (m116111j != getLeft()) {
            offsetLeftAndRight(m116111j - getLeft());
            this.f53192l.m35878c();
        }
        int m116110k = A52.m116110k(j);
        if (m116110k != getTop()) {
            offsetTopAndBottom(m116110k - getTop());
            this.f53192l.m35878c();
        }
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.f53194n;
    }

    @Override // p000.InterfaceC42588iD3
    /* renamed from: i */
    public void mo29664i() {
        if (this.f53189i && !f53181v) {
            m68515v(false);
            f53175p.m68509d(this);
        }
    }

    @Override // android.view.View, p000.InterfaceC42588iD3
    public void invalidate() {
        if (!this.f53189i) {
            m68515v(true);
            super.invalidate();
            this.f53182b.invalidate();
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* renamed from: s */
    public final InterfaceC39067cJ3 m68518s() {
        if (getClipToOutline() && !this.f53186f.m91128d()) {
            return this.f53186f.m91130b();
        }
        return null;
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * getResources().getDisplayMetrics().densityDpi);
    }

    /* renamed from: t */
    public final boolean m68517t() {
        return this.f53189i;
    }

    /* renamed from: u */
    public final void m68516u() {
        Rect rect;
        if (this.f53187g) {
            Rect rect2 = this.f53188h;
            if (rect2 == null) {
                this.f53188h = new Rect(0, 0, getWidth(), getHeight());
            } else {
                Intrinsics.checkNotNull(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f53188h;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    /* renamed from: v */
    public final void m68515v(boolean z) {
        if (z != this.f53189i) {
            this.f53189i = z;
            this.f53182b.m68598O0(this, z);
        }
    }

    /* renamed from: w */
    public final void m68514w() {
        ViewOutlineProvider viewOutlineProvider;
        if (this.f53186f.m91129c() != null) {
            viewOutlineProvider = f53177r;
        } else {
            viewOutlineProvider = null;
        }
        setOutlineProvider(viewOutlineProvider);
    }
}
