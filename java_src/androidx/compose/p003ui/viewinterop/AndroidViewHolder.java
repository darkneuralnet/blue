package androidx.compose.p003ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p003ui.draw.C11289a;
import androidx.compose.p003ui.platform.AndroidComposeView;
import androidx.compose.p003ui.platform.WindowRecomposer_androidKt;
import androidx.compose.p003ui.viewinterop.AndroidViewHolder;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import p000.InterfaceC41563gV2;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\u0012\b\u0010\u009e\u0001\u001a\u00030\u009d\u0001\u0012\n\u0010 \u0001\u001a\u0005\u0018\u00010\u009f\u0001\u0012\u0006\u0010C\u001a\u00020A¢\u0006\u0006\b¡\u0001\u0010¢\u0001J \u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0014J\u0006\u0010\u0010\u001a\u00020\tJ0\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0014J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J\b\u0010\u001a\u001a\u00020\tH\u0014J\b\u0010\u001b\u001a\u00020\tH\u0014J\u001e\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016J\u0018\u0010%\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0016J\u0010\u0010'\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u0004H\u0014J\u0012\u0010*\u001a\u00020\u00112\b\u0010)\u001a\u0004\u0018\u00010(H\u0016J\b\u0010+\u001a\u00020\u0011H\u0016J(\u0010.\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0004H\u0016J\b\u0010/\u001a\u00020\u0004H\u0016J(\u00100\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0004H\u0016J\u0018\u00101\u001a\u00020\t2\u0006\u0010$\u001a\u00020\"2\u0006\u0010-\u001a\u00020\u0004H\u0016J@\u00107\u001a\u00020\t2\u0006\u0010$\u001a\u00020\"2\u0006\u00102\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u001cH\u0016J8\u00107\u001a\u00020\t2\u0006\u0010$\u001a\u00020\"2\u0006\u00102\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0004H\u0016J0\u0010:\u001a\u00020\t2\u0006\u0010$\u001a\u00020\"2\u0006\u00108\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u0004H\u0016J(\u0010>\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\"2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020;2\u0006\u00106\u001a\u00020\u0011H\u0016J \u0010?\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\"2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020;H\u0016J\b\u0010@\u001a\u00020\u0011H\u0016R\u0014\u0010C\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010BR.\u0010K\u001a\u0004\u0018\u00010\"2\b\u0010D\u001a\u0004\u0018\u00010\"8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR6\u0010S\u001a\b\u0012\u0004\u0012\u00020\t0L2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\t0L8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0016\u0010V\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR6\u0010[\u001a\b\u0012\u0004\u0012\u00020\t0L2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\t0L8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010N\u001a\u0004\bY\u0010P\"\u0004\bZ\u0010RR6\u0010_\u001a\b\u0012\u0004\u0012\u00020\t0L2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\t0L8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010N\u001a\u0004\b]\u0010P\"\u0004\b^\u0010RR*\u0010g\u001a\u00020`2\u0006\u0010D\u001a\u00020`8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR0\u0010n\u001a\u0010\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\t\u0018\u00010h8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR*\u0010u\u001a\u00020o2\u0006\u0010D\u001a\u00020o8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR0\u0010x\u001a\u0010\u0012\u0004\u0012\u00020o\u0012\u0004\u0012\u00020\t\u0018\u00010h8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bG\u0010i\u001a\u0004\bv\u0010k\"\u0004\bw\u0010mR.\u0010\u007f\u001a\u0004\u0018\u00010y2\b\u0010D\u001a\u0004\u0018\u00010y8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R6\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0080\u00012\t\u0010D\u001a\u0005\u0018\u00010\u0080\u00018\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\b\b\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0017\u0010\u0089\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0010\u0010\u0088\u0001R!\u0010\u008a\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010iR\u001b\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020\t0L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010NR3\u0010\u008e\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010h8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\bQ\u0010i\u001a\u0005\b\u008c\u0001\u0010k\"\u0005\b\u008d\u0001\u0010mR\u0015\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010\u008f\u0001R\u0019\u0010\u0092\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0093\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0013\u0010\u0091\u0001R\u0018\u0010\u0097\u0001\u001a\u00030\u0094\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001c\u0010\u009c\u0001\u001a\u00030\u0098\u00018\u0006¢\u0006\u000f\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0005\ba\u0010\u009b\u0001¨\u0006£\u0001"}, m28432d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroid/view/ViewGroup;", "LL43;", "LAt0;", "", "min", "max", "preferred", "m", "", "l", "j", "b", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "n", "", "changed", "t", "r", "onLayout", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "disallowIntercept", "requestDisallowInterceptTouchEvent", "onAttachedToWindow", "onDetachedFromWindow", "", "location", "Landroid/graphics/Rect;", "dirty", "Landroid/view/ViewParent;", "invalidateChildInParent", "Landroid/view/View;", "child", "target", "onDescendantInvalidated", "visibility", "onWindowVisibilityChanged", "Landroid/graphics/Region;", "region", "gatherTransparentRegion", "shouldDelayChildPressedState", "axes", "type", "onStartNestedScroll", "getNestedScrollAxes", "onNestedScrollAccepted", "onStopNestedScroll", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "consumed", "onNestedScroll", "dx", "dy", "onNestedPreScroll", "", "velocityX", "velocityY", "onNestedFling", "onNestedPreFling", "isNestedScrollingEnabled", "LC43;", "LC43;", "dispatcher", "value", "c", "Landroid/view/View;", "k", "()Landroid/view/View;", "setView$ui_release", "(Landroid/view/View;)V", "view", "Lkotlin/Function0;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/jvm/functions/Function0;", "i", "()Lkotlin/jvm/functions/Function0;", "q", "(Lkotlin/jvm/functions/Function0;)V", "update", "e", "Z", "hasUpdateBlock", "<set-?>", "f", "getReset", "p", "reset", "g", "getRelease", "o", "release", "LgV2;", "h", "LgV2;", "getModifier", "()LgV2;", "setModifier", "(LgV2;)V", "modifier", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "getOnModifierChanged$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnModifierChanged$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "onModifierChanged", "Lg01;", "Lg01;", "getDensity", "()Lg01;", "setDensity", "(Lg01;)V", "density", "getOnDensityChanged$ui_release", "setOnDensityChanged$ui_release", "onDensityChanged", "LLifecycleOwner;", "LLifecycleOwner;", "getLifecycleOwner", "()LLifecycleOwner;", "setLifecycleOwner", "(LLifecycleOwner;)V", "lifecycleOwner", "LPi5;", "LPi5;", "getSavedStateRegistryOwner", "()LPi5;", "setSavedStateRegistryOwner", "(LPi5;)V", "savedStateRegistryOwner", "LQM5;", "LQM5;", "snapshotObserver", "onCommitAffectingUpdate", "runUpdate", "getOnRequestDisallowInterceptTouchEvent$ui_release", "setOnRequestDisallowInterceptTouchEvent$ui_release", "onRequestDisallowInterceptTouchEvent", "[I", "s", "I", "lastWidthMeasureSpec", "lastHeightMeasureSpec", "LM43;", "u", "LM43;", "nestedScrollingParentHelper", "LJm2;", "v", "LJm2;", "()LJm2;", "layoutNode", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LYt0;", "parentContext", "<init>", "(Landroid/content/Context;LYt0;LC43;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder */
/* loaded from: classes.dex */
public class AndroidViewHolder extends ViewGroup implements L43, InterfaceC31784At0 {

    /* renamed from: b */
    public final C43 f53405b;

    /* renamed from: c */
    public View f53406c;

    /* renamed from: d */
    public Function0<Unit> f53407d;

    /* renamed from: e */
    public boolean f53408e;

    /* renamed from: f */
    public Function0<Unit> f53409f;

    /* renamed from: g */
    public Function0<Unit> f53410g;

    /* renamed from: h */
    public InterfaceC41563gV2 f53411h;

    /* renamed from: i */
    public Function1<? super InterfaceC41563gV2, Unit> f53412i;

    /* renamed from: j */
    public InterfaceC41273g01 f53413j;

    /* renamed from: k */
    public Function1<? super InterfaceC41273g01, Unit> f53414k;

    /* renamed from: l */
    public LifecycleOwner f53415l;

    /* renamed from: m */
    public InterfaceC35200Pi5 f53416m;

    /* renamed from: n */
    public final QM5 f53417n;

    /* renamed from: o */
    public final Function1<AndroidViewHolder, Unit> f53418o;

    /* renamed from: p */
    public final Function0<Unit> f53419p;

    /* renamed from: q */
    public Function1<? super Boolean, Unit> f53420q;

    /* renamed from: r */
    public final int[] f53421r;

    /* renamed from: s */
    public int f53422s;

    /* renamed from: t */
    public int f53423t;

    /* renamed from: u */
    public final M43 f53424u;

    /* renamed from: v */
    public final C33829Jm2 f53425v;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LgV2;", "it", "", C17296a.f69688o, "(LgV2;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$a */
    /* loaded from: classes.dex */
    public static final class C11448a extends Lambda implements Function1<InterfaceC41563gV2, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C33829Jm2 f53426g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC41563gV2 f53427h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11448a(C33829Jm2 c33829Jm2, InterfaceC41563gV2 interfaceC41563gV2) {
            super(1);
            this.f53426g = c33829Jm2;
            this.f53427h = interfaceC41563gV2;
        }

        /* renamed from: a */
        public final void m68265a(InterfaceC41563gV2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.f53426g.mo99757p(it.mo39266t0(this.f53427h));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC41563gV2 interfaceC41563gV2) {
            m68265a(interfaceC41563gV2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lg01;", "it", "", C17296a.f69688o, "(Lg01;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$b */
    /* loaded from: classes.dex */
    public static final class C11449b extends Lambda implements Function1<InterfaceC41273g01, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C33829Jm2 f53428g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11449b(C33829Jm2 c33829Jm2) {
            super(1);
            this.f53428g = c33829Jm2;
        }

        /* renamed from: a */
        public final void m68264a(InterfaceC41273g01 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.f53428g.mo99769k(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC41273g01 interfaceC41273g01) {
            m68264a(interfaceC41273g01);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LjD3;", "owner", "", C17296a.f69688o, "(LjD3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$c */
    /* loaded from: classes.dex */
    public static final class C11450c extends Lambda implements Function1<InterfaceC43181jD3, Unit> {

        /* renamed from: h */
        public final /* synthetic */ C33829Jm2 f53430h;

        /* renamed from: i */
        public final /* synthetic */ Ref.ObjectRef<View> f53431i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11450c(C33829Jm2 c33829Jm2, Ref.ObjectRef<View> objectRef) {
            super(1);
            this.f53430h = c33829Jm2;
            this.f53431i = objectRef;
        }

        /* renamed from: a */
        public final void m68263a(InterfaceC43181jD3 owner) {
            AndroidComposeView androidComposeView;
            Intrinsics.checkNotNullParameter(owner, "owner");
            if (owner instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) owner;
            } else {
                androidComposeView = null;
            }
            if (androidComposeView != null) {
                androidComposeView.m68563l0(AndroidViewHolder.this, this.f53430h);
            }
            View view = this.f53431i.element;
            if (view != null) {
                AndroidViewHolder.this.setView$ui_release(view);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC43181jD3 interfaceC43181jD3) {
            m68263a(interfaceC43181jD3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LjD3;", "owner", "", C17296a.f69688o, "(LjD3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$d */
    /* loaded from: classes.dex */
    public static final class C11451d extends Lambda implements Function1<InterfaceC43181jD3, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Ref.ObjectRef<View> f53433h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11451d(Ref.ObjectRef<View> objectRef) {
            super(1);
            this.f53433h = objectRef;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [T, android.view.View] */
        /* renamed from: a */
        public final void m68262a(InterfaceC43181jD3 owner) {
            AndroidComposeView androidComposeView;
            Intrinsics.checkNotNullParameter(owner, "owner");
            if (owner instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) owner;
            } else {
                androidComposeView = null;
            }
            if (androidComposeView != null) {
                androidComposeView.m68592T0(AndroidViewHolder.this);
            }
            this.f53433h.element = AndroidViewHolder.this.m68272k();
            AndroidViewHolder.this.setView$ui_release(null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC43181jD3 interfaceC43181jD3) {
            m68262a(interfaceC43181jD3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000f\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\"\u0010\u0010\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\"\u0010\u0012\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0016J\"\u0010\u0013\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, m28432d2 = {"androidx/compose/ui/viewinterop/AndroidViewHolder$e", "LxO2;", "LzO2;", "", "LvO2;", "measurables", "Lkz0;", "constraints", "LyO2;", C17296a.f69688o, "(LzO2;Ljava/util/List;J)LyO2;", "LZ62;", "LX62;", "", "height", "c", "b", "width", "e", DateTokenConverter.CONVERTER_KEY, "g", "f", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$e */
    /* loaded from: classes.dex */
    public static final class C11452e implements InterfaceC51579xO2 {

        /* renamed from: b */
        public final /* synthetic */ C33829Jm2 f53435b;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU3$a;", "", C17296a.f69688o, "(LOU3$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$e$a */
        /* loaded from: classes.dex */
        public static final class C11453a extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

            /* renamed from: g */
            public static final C11453a f53436g = new C11453a();

            public C11453a() {
                super(1);
            }

            /* renamed from: a */
            public final void m68259a(OU3.AbstractC6015a layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
                m68259a(abstractC6015a);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU3$a;", "", C17296a.f69688o, "(LOU3$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$e$b */
        /* loaded from: classes.dex */
        public static final class C11454b extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

            /* renamed from: g */
            public final /* synthetic */ AndroidViewHolder f53437g;

            /* renamed from: h */
            public final /* synthetic */ C33829Jm2 f53438h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11454b(AndroidViewHolder androidViewHolder, C33829Jm2 c33829Jm2) {
                super(1);
                this.f53437g = androidViewHolder;
                this.f53438h = c33829Jm2;
            }

            /* renamed from: a */
            public final void m68258a(OU3.AbstractC6015a layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                C22704he.m36124e(this.f53437g, this.f53438h);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
                m68258a(abstractC6015a);
                return Unit.INSTANCE;
            }
        }

        public C11452e(C33829Jm2 c33829Jm2) {
            this.f53435b = c33829Jm2;
        }

        @Override // p000.InterfaceC51579xO2
        /* renamed from: a */
        public InterfaceC52172yO2 mo3160a(InterfaceC52765zO2 measure, List<? extends InterfaceC50393vO2> measurables, long j) {
            Intrinsics.checkNotNullParameter(measure, "$this$measure");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            if (AndroidViewHolder.this.getChildCount() == 0) {
                return InterfaceC52765zO2.m1430Y(measure, C44228kz0.m28061p(j), C44228kz0.m28062o(j), null, C11453a.f53436g, 4, null);
            }
            if (C44228kz0.m28061p(j) != 0) {
                AndroidViewHolder.this.getChildAt(0).setMinimumWidth(C44228kz0.m28061p(j));
            }
            if (C44228kz0.m28062o(j) != 0) {
                AndroidViewHolder.this.getChildAt(0).setMinimumHeight(C44228kz0.m28062o(j));
            }
            AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
            int m28061p = C44228kz0.m28061p(j);
            int m28063n = C44228kz0.m28063n(j);
            ViewGroup.LayoutParams layoutParams = AndroidViewHolder.this.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams);
            int m68270m = androidViewHolder.m68270m(m28061p, m28063n, layoutParams.width);
            AndroidViewHolder androidViewHolder2 = AndroidViewHolder.this;
            int m28062o = C44228kz0.m28062o(j);
            int m28064m = C44228kz0.m28064m(j);
            ViewGroup.LayoutParams layoutParams2 = AndroidViewHolder.this.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams2);
            androidViewHolder.measure(m68270m, androidViewHolder2.m68270m(m28062o, m28064m, layoutParams2.height));
            return InterfaceC52765zO2.m1430Y(measure, AndroidViewHolder.this.getMeasuredWidth(), AndroidViewHolder.this.getMeasuredHeight(), null, new C11454b(AndroidViewHolder.this, this.f53435b), 4, null);
        }

        @Override // p000.InterfaceC51579xO2
        /* renamed from: b */
        public int mo5313b(Z62 z62, List<? extends X62> measurables, int i) {
            Intrinsics.checkNotNullParameter(z62, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            return m68260g(i);
        }

        @Override // p000.InterfaceC51579xO2
        /* renamed from: c */
        public int mo5312c(Z62 z62, List<? extends X62> measurables, int i) {
            Intrinsics.checkNotNullParameter(z62, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            return m68260g(i);
        }

        @Override // p000.InterfaceC51579xO2
        /* renamed from: d */
        public int mo5311d(Z62 z62, List<? extends X62> measurables, int i) {
            Intrinsics.checkNotNullParameter(z62, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            return m68261f(i);
        }

        @Override // p000.InterfaceC51579xO2
        /* renamed from: e */
        public int mo5310e(Z62 z62, List<? extends X62> measurables, int i) {
            Intrinsics.checkNotNullParameter(z62, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            return m68261f(i);
        }

        /* renamed from: f */
        public final int m68261f(int i) {
            AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
            ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams);
            androidViewHolder.measure(androidViewHolder.m68270m(0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return AndroidViewHolder.this.getMeasuredHeight();
        }

        /* renamed from: g */
        public final int m68260g(int i) {
            AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            AndroidViewHolder androidViewHolder2 = AndroidViewHolder.this;
            ViewGroup.LayoutParams layoutParams = androidViewHolder2.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams);
            androidViewHolder.measure(makeMeasureSpec, androidViewHolder2.m68270m(0, i, layoutParams.height));
            return AndroidViewHolder.this.getMeasuredWidth();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lss5;", "", "invoke", "(Lss5;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$f */
    /* loaded from: classes.dex */
    public static final class C11455f extends Lambda implements Function1<InterfaceC48906ss5, Unit> {

        /* renamed from: g */
        public static final C11455f f53439g = new C11455f();

        public C11455f() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC48906ss5 semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48906ss5 interfaceC48906ss5) {
            invoke2(interfaceC48906ss5);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LI61;", "", "invoke", "(LI61;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAndroidViewHolder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidViewHolder.android.kt\nandroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$coreModifier$2\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,567:1\n245#2:568\n*S KotlinDebug\n*F\n+ 1 AndroidViewHolder.android.kt\nandroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$coreModifier$2\n*L\n318#1:568\n*E\n"})
    /* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$g */
    /* loaded from: classes.dex */
    public static final class C11456g extends Lambda implements Function1<I61, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C33829Jm2 f53440g;

        /* renamed from: h */
        public final /* synthetic */ AndroidViewHolder f53441h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11456g(C33829Jm2 c33829Jm2, AndroidViewHolder androidViewHolder) {
            super(1);
            this.f53440g = c33829Jm2;
            this.f53441h = androidViewHolder;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(I61 i61) {
            invoke2(i61);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(I61 drawBehind) {
            Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
            C33829Jm2 c33829Jm2 = this.f53440g;
            AndroidViewHolder androidViewHolder = this.f53441h;
            InterfaceC45204me0 mo20724a = drawBehind.mo20750d0().mo20724a();
            InterfaceC43181jD3 m99759o0 = c33829Jm2.m99759o0();
            AndroidComposeView androidComposeView = m99759o0 instanceof AndroidComposeView ? (AndroidComposeView) m99759o0 : null;
            if (androidComposeView != null) {
                androidComposeView.m68556r0(androidViewHolder, C12455bc.m64279c(mo20724a));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lnm2;", "it", "", "invoke", "(Lnm2;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$h */
    /* loaded from: classes.dex */
    public static final class C11457h extends Lambda implements Function1<InterfaceC45879nm2, Unit> {

        /* renamed from: h */
        public final /* synthetic */ C33829Jm2 f53443h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11457h(C33829Jm2 c33829Jm2) {
            super(1);
            this.f53443h = c33829Jm2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC45879nm2 interfaceC45879nm2) {
            invoke2(interfaceC45879nm2);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC45879nm2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C22704he.m36124e(AndroidViewHolder.this, this.f53443h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "it", "", "b", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$i */
    /* loaded from: classes.dex */
    public static final class C11458i extends Lambda implements Function1<AndroidViewHolder, Unit> {
        public C11458i() {
            super(1);
        }

        /* renamed from: c */
        public static final void m68255c(Function0 tmp0) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke();
        }

        /* renamed from: b */
        public final void m68256b(AndroidViewHolder it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Handler handler = AndroidViewHolder.this.getHandler();
            final Function0 function0 = AndroidViewHolder.this.f53419p;
            handler.post(new Runnable() { // from class: fe
                @Override // java.lang.Runnable
                public final void run() {
                    AndroidViewHolder.C11458i.m68255c(Function0.this);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AndroidViewHolder androidViewHolder) {
            m68256b(androidViewHolder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", m28418f = "AndroidViewHolder.android.kt", m28417i = {}, m28416l = {523, 528}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$j */
    /* loaded from: classes.dex */
    public static final class C11459j extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f53445h;

        /* renamed from: i */
        public final /* synthetic */ boolean f53446i;

        /* renamed from: j */
        public final /* synthetic */ AndroidViewHolder f53447j;

        /* renamed from: k */
        public final /* synthetic */ long f53448k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11459j(boolean z, AndroidViewHolder androidViewHolder, long j, Continuation<? super C11459j> continuation) {
            super(2, continuation);
            this.f53446i = z;
            this.f53447j = androidViewHolder;
            this.f53448k = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C11459j(this.f53446i, this.f53447j, this.f53448k, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C11459j) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f53445h;
            if (i != 0) {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                if (!this.f53446i) {
                    C43 c43 = this.f53447j.f53405b;
                    long m15349a = C48275ro6.f107663b.m15349a();
                    long j = this.f53448k;
                    this.f53445h = 1;
                    if (c43.m112920a(m15349a, j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    C43 c432 = this.f53447j.f53405b;
                    long j2 = this.f53448k;
                    long m15349a2 = C48275ro6.f107663b.m15349a();
                    this.f53445h = 2;
                    if (c432.m112920a(j2, m15349a2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", m28418f = "AndroidViewHolder.android.kt", m28417i = {}, m28416l = {541}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$k */
    /* loaded from: classes.dex */
    public static final class C11460k extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f53449h;

        /* renamed from: j */
        public final /* synthetic */ long f53451j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11460k(long j, Continuation<? super C11460k> continuation) {
            super(2, continuation);
            this.f53451j = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C11460k(this.f53451j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C11460k) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f53449h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C43 c43 = AndroidViewHolder.this.f53405b;
                long j = this.f53451j;
                this.f53449h = 1;
                if (c43.m112918c(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$l */
    /* loaded from: classes.dex */
    public static final class C11461l extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public static final C11461l f53452g = new C11461l();

        public C11461l() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$m */
    /* loaded from: classes.dex */
    public static final class C11462m extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public static final C11462m f53453g = new C11462m();

        public C11462m() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$n */
    /* loaded from: classes.dex */
    public static final class C11463n extends Lambda implements Function0<Unit> {
        public C11463n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (AndroidViewHolder.this.f53408e) {
                QM5 qm5 = AndroidViewHolder.this.f53417n;
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                qm5.m88622o(androidViewHolder, androidViewHolder.f53418o, AndroidViewHolder.this.m68274i());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lkotlin/Function0;", "", "command", "b", "(Lkotlin/jvm/functions/Function0;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$o */
    /* loaded from: classes.dex */
    public static final class C11464o extends Lambda implements Function1<Function0<? extends Unit>, Unit> {
        public C11464o() {
            super(1);
        }

        /* renamed from: c */
        public static final void m68252c(Function0 tmp0) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke();
        }

        /* renamed from: b */
        public final void m68253b(final Function0<Unit> command) {
            Intrinsics.checkNotNullParameter(command, "command");
            if (AndroidViewHolder.this.getHandler().getLooper() == Looper.myLooper()) {
                command.invoke();
            } else {
                AndroidViewHolder.this.getHandler().post(new Runnable() { // from class: ge
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidViewHolder.C11464o.m68252c(Function0.this);
                    }
                });
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Unit> function0) {
            m68253b(function0);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$p */
    /* loaded from: classes.dex */
    public static final class C11465p extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public static final C11465p f53456g = new C11465p();

        public C11465p() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder(Context context, AbstractC37400Yt0 abstractC37400Yt0, C43 dispatcher) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f53405b = dispatcher;
        if (abstractC37400Yt0 != null) {
            WindowRecomposer_androidKt.m68500i(this, abstractC37400Yt0);
        }
        setSaveFromParentEnabled(false);
        this.f53407d = C11465p.f53456g;
        this.f53409f = C11462m.f53453g;
        this.f53410g = C11461l.f53452g;
        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
        this.f53411h = c20912a;
        this.f53413j = C42459i01.m35404b(1.0f, 0.0f, 2, null);
        this.f53417n = new QM5(new C11464o());
        this.f53418o = new C11458i();
        this.f53419p = new C11463n();
        this.f53421r = new int[2];
        this.f53422s = Integer.MIN_VALUE;
        this.f53423t = Integer.MIN_VALUE;
        this.f53424u = new M43(this);
        C33829Jm2 c33829Jm2 = new C33829Jm2(false, 0, 3, null);
        c33829Jm2.m99743t1(this);
        InterfaceC41563gV2 m83186a = C36116Tg3.m83186a(C11289a.m68867a(C50475vX3.m8527a(C41198fs5.m40621a(c20912a, true, C11455f.f53439g), this), new C11456g(c33829Jm2, this)), new C11457h(c33829Jm2));
        c33829Jm2.mo99757p(this.f53411h.mo39266t0(m83186a));
        this.f53412i = new C11448a(c33829Jm2, m83186a);
        c33829Jm2.mo99769k(this.f53413j);
        this.f53414k = new C11449b(c33829Jm2);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        c33829Jm2.m99726z1(new C11450c(c33829Jm2, objectRef));
        c33829Jm2.m99842A1(new C11451d(objectRef));
        c33829Jm2.mo99760o(new C11452e(c33829Jm2));
        this.f53425v = c33829Jm2;
    }

    @Override // p000.InterfaceC31784At0
    /* renamed from: b */
    public void mo68281b() {
        this.f53410g.invoke();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.f53421r);
        int[] iArr = this.f53421r;
        int i = iArr[0];
        region.op(i, iArr[1], i + getWidth(), this.f53421r[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.f53406c;
        if (view == null || (layoutParams = view.getLayoutParams()) == null) {
            return new ViewGroup.LayoutParams(-1, -1);
        }
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f53424u.m95845a();
    }

    /* renamed from: h */
    public final C33829Jm2 m68275h() {
        return this.f53425v;
    }

    /* renamed from: i */
    public final Function0<Unit> m68274i() {
        return this.f53407d;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        this.f53425v.m99832E0();
        return null;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        View view = this.f53406c;
        return view != null ? view.isNestedScrollingEnabled() : super.isNestedScrollingEnabled();
    }

    @Override // p000.InterfaceC31784At0
    /* renamed from: j */
    public void mo68273j() {
        this.f53409f.invoke();
        removeAllViewsInLayout();
    }

    /* renamed from: k */
    public final View m68272k() {
        return this.f53406c;
    }

    @Override // p000.InterfaceC31784At0
    /* renamed from: l */
    public void mo68271l() {
        View view = this.f53406c;
        Intrinsics.checkNotNull(view);
        if (view.getParent() != this) {
            addView(this.f53406c);
        } else {
            this.f53409f.invoke();
        }
    }

    /* renamed from: m */
    public final int m68270m(int i, int i2, int i3) {
        int coerceIn;
        if (i3 >= 0 || i == i2) {
            coerceIn = RangesKt___RangesKt.coerceIn(i3, i, i2);
            return View.MeasureSpec.makeMeasureSpec(coerceIn, 1073741824);
        } else if (i3 == -2 && i2 != Integer.MAX_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
        } else {
            if (i3 == -1 && i2 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
            }
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
    }

    /* renamed from: n */
    public final void m68269n() {
        int i;
        int i2 = this.f53422s;
        if (i2 != Integer.MIN_VALUE && (i = this.f53423t) != Integer.MIN_VALUE) {
            measure(i2, i);
        }
    }

    /* renamed from: o */
    public final void m68268o(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f53410g = function0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f53417n.m88618s();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View child, View target) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        super.onDescendantInvalidated(child, target);
        this.f53425v.m99832E0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f53417n.m88617t();
        this.f53417n.m88626k();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.f53406c;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        ViewParent viewParent;
        int i3;
        View view = this.f53406c;
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        View view2 = this.f53406c;
        if (view2 != null) {
            view2.measure(i, i2);
        }
        View view3 = this.f53406c;
        int i4 = 0;
        if (view3 != null) {
            i3 = view3.getMeasuredWidth();
        } else {
            i3 = 0;
        }
        View view4 = this.f53406c;
        if (view4 != null) {
            i4 = view4.getMeasuredHeight();
        }
        setMeasuredDimension(i3, i4);
        this.f53422s = i;
        this.f53423t = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View target, float f, float f2, boolean z) {
        float m36122g;
        float m36122g2;
        Intrinsics.checkNotNullParameter(target, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        m36122g = C22704he.m36122g(f);
        m36122g2 = C22704he.m36122g(f2);
        Z30.m73800d(this.f53405b.m112916e(), null, null, new C11459j(z, this, C48867so6.m13616a(m36122g, m36122g2), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View target, float f, float f2) {
        float m36122g;
        float m36122g2;
        Intrinsics.checkNotNullParameter(target, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        m36122g = C22704he.m36122g(f);
        m36122g2 = C22704he.m36122g(f2);
        Z30.m73800d(this.f53405b.m112916e(), null, null, new C11460k(C48867so6.m13616a(m36122g, m36122g2), null), 3, null);
        return false;
    }

    @Override // p000.K43
    public void onNestedPreScroll(View target, int i, int i2, int[] consumed, int i3) {
        float m36123f;
        float m36123f2;
        int m36121h;
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        if (!isNestedScrollingEnabled()) {
            return;
        }
        C43 c43 = this.f53405b;
        m36123f = C22704he.m36123f(i);
        m36123f2 = C22704he.m36123f(i2);
        long m104938a = C33056Ge3.m104938a(m36123f, m36123f2);
        m36121h = C22704he.m36121h(i3);
        long m112917d = c43.m112917d(m104938a, m36121h);
        consumed[0] = D43.m110966b(C32120Ce3.m111944o(m112917d));
        consumed[1] = D43.m110966b(C32120Ce3.m111943p(m112917d));
    }

    @Override // p000.L43
    public void onNestedScroll(View target, int i, int i2, int i3, int i4, int i5, int[] consumed) {
        float m36123f;
        float m36123f2;
        float m36123f3;
        float m36123f4;
        int m36121h;
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        if (isNestedScrollingEnabled()) {
            C43 c43 = this.f53405b;
            m36123f = C22704he.m36123f(i);
            m36123f2 = C22704he.m36123f(i2);
            long m104938a = C33056Ge3.m104938a(m36123f, m36123f2);
            m36123f3 = C22704he.m36123f(i3);
            m36123f4 = C22704he.m36123f(i4);
            long m104938a2 = C33056Ge3.m104938a(m36123f3, m36123f4);
            m36121h = C22704he.m36121h(i5);
            long m112919b = c43.m112919b(m104938a, m104938a2, m36121h);
            consumed[0] = D43.m110966b(C32120Ce3.m111944o(m112919b));
            consumed[1] = D43.m110966b(C32120Ce3.m111943p(m112919b));
        }
    }

    @Override // p000.K43
    public void onNestedScrollAccepted(View child, View target, int i, int i2) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        this.f53424u.m95843c(child, target, i, i2);
    }

    @Override // p000.K43
    public boolean onStartNestedScroll(View child, View target, int i, int i2) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // p000.K43
    public void onStopNestedScroll(View target, int i) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.f53424u.m95841e(target, i);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    /* renamed from: p */
    public final void m68267p(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f53409f = function0;
    }

    /* renamed from: q */
    public final void m68266q(Function0<Unit> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f53407d = value;
        this.f53408e = true;
        this.f53419p.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        Function1<? super Boolean, Unit> function1 = this.f53420q;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(InterfaceC41273g01 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value != this.f53413j) {
            this.f53413j = value;
            Function1<? super InterfaceC41273g01, Unit> function1 = this.f53414k;
            if (function1 != null) {
                function1.invoke(value);
            }
        }
    }

    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != this.f53415l) {
            this.f53415l = lifecycleOwner;
            C35534Qt6.m87652b(this, lifecycleOwner);
        }
    }

    public final void setModifier(InterfaceC41563gV2 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value != this.f53411h) {
            this.f53411h = value;
            Function1<? super InterfaceC41563gV2, Unit> function1 = this.f53412i;
            if (function1 != null) {
                function1.invoke(value);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(Function1<? super InterfaceC41273g01, Unit> function1) {
        this.f53414k = function1;
    }

    public final void setOnModifierChanged$ui_release(Function1<? super InterfaceC41563gV2, Unit> function1) {
        this.f53412i = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(Function1<? super Boolean, Unit> function1) {
        this.f53420q = function1;
    }

    public final void setSavedStateRegistryOwner(InterfaceC35200Pi5 interfaceC35200Pi5) {
        if (interfaceC35200Pi5 != this.f53416m) {
            this.f53416m = interfaceC35200Pi5;
            C36236Tt6.m82296b(this, interfaceC35200Pi5);
        }
    }

    public final void setView$ui_release(View view) {
        if (view != this.f53406c) {
            this.f53406c = view;
            removeAllViewsInLayout();
            if (view != null) {
                addView(view);
                this.f53419p.invoke();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // p000.K43
    public void onNestedScroll(View target, int i, int i2, int i3, int i4, int i5) {
        float m36123f;
        float m36123f2;
        float m36123f3;
        float m36123f4;
        int m36121h;
        Intrinsics.checkNotNullParameter(target, "target");
        if (isNestedScrollingEnabled()) {
            C43 c43 = this.f53405b;
            m36123f = C22704he.m36123f(i);
            m36123f2 = C22704he.m36123f(i2);
            long m104938a = C33056Ge3.m104938a(m36123f, m36123f2);
            m36123f3 = C22704he.m36123f(i3);
            m36123f4 = C22704he.m36123f(i4);
            long m104938a2 = C33056Ge3.m104938a(m36123f3, m36123f4);
            m36121h = C22704he.m36121h(i5);
            c43.m112919b(m104938a, m104938a2, m36121h);
        }
    }
}
