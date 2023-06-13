package p000;

import androidx.compose.p003ui.input.pointer.PointerEventTimeoutCancellationException;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC52943zh2;
@Metadata(m28433d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001bB\u0019\u0012\u0006\u00104\u001a\u00020/\u0012\b\b\u0002\u0010W\u001a\u00020\u0004¢\u0006\u0004\b`\u0010aJ\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001a\u0010\r\u001a\u00020\f*\u00020\u000bH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u000b*\u00020\u0012H\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\u000b*\u00020\fH\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\u0012*\u00020\u000bH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0014J\u001a\u0010\u001c\u001a\u00020\u0012*\u00020\u000fH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001e\u001a\u00020\u0017*\u00020\u0018H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ\u001a\u0010\u001f\u001a\u00020\u000f*\u00020\u000bH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J-\u0010#\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\b\u0010%\u001a\u00020\tH\u0016JB\u0010-\u001a\u00028\u0000\"\u0004\b\u0000\u0010&2'\u0010,\u001a#\b\u0001\u0012\u0004\u0012\u00020(\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000)\u0012\u0006\u0012\u0004\u0018\u00010*0'¢\u0006\u0002\b+H\u0096@ø\u0001\u0001¢\u0006\u0004\b-\u0010.R\u001a\u00104\u001a\u00020/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0016\u00107\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\"\u0010<\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u000309R\u00020\u0000088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\"\u0010>\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u000309R\u00020\u0000088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00106R\u001f\u0010C\u001a\u00020!8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\bA\u0010BR(\u0010L\u001a\u00020D8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b\u0019\u0010E\u0012\u0004\bJ\u0010K\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010T\u001a\u00020M8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u0014\u0010W\u001a\u00020\u00128\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010Y\u001a\u00020\u00128\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bX\u0010VR\u0014\u0010\\\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u001d\u0010_\u001a\u00020\u00178VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b]\u0010^\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006c"}, m28432d2 = {"LyW5;", "LpX3;", "LqX3;", "LtX3;", "Lg01;", "LYW3;", "pointerEvent", "LaX3;", "pass", "", "j1", "Lk61;", "", "F0", "(F)I", "LM26;", "V0", "(J)I", "", "x", "(F)F", "w", "(I)F", "LxB5;", "Lo61;", "j", "(J)J", "T0", "I0", "(J)F", "z", "s0", "(F)J", "LG52;", "bounds", "e1", "(LYW3;LaX3;J)V", "d1", "R", "Lkotlin/Function2;", "LWu;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "v0", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LJq6;", "c", "LJq6;", "s", "()LJq6;", "viewConfiguration", "e", "LYW3;", "currentEvent", "LLX2;", "LyW5$a;", "f", "LLX2;", "pointerHandlers", "g", "dispatchingPointerHandlers", "h", "lastPointerEvent", "i", "J", "boundsSize", "LZC0;", "LZC0;", "k1", "()LZC0;", "l1", "(LZC0;)V", "getCoroutineScope$annotations", "()V", "coroutineScope", "", "k", "Z", "a1", "()Z", "setInterceptOutOfBoundsChildEvents", "(Z)V", "interceptOutOfBoundsChildEvents", "b", "()F", "density", "R0", "fontScale", "P0", "()LpX3;", "pointerInputFilter", "C0", "()J", "extendedTouchPadding", "<init>", "(LJq6;Lg01;)V", C17296a.f69688o, "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilter\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 TempListUtils.kt\nandroidx/compose/ui/TempListUtilsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,643:1\n432#1:674\n433#1:676\n435#1,4:678\n440#1:693\n443#1,3:705\n1182#2:644\n1161#2,2:645\n1182#2:647\n1161#2,2:648\n34#3:650\n34#3:675\n34#3:747\n146#4:651\n460#4,11:652\n492#4,11:663\n146#4:677\n460#4,11:682\n492#4,11:694\n728#4,2:748\n86#5,2:708\n33#5,6:710\n88#5:716\n86#5,2:717\n33#5,6:719\n88#5:725\n33#5,4:729\n38#5:736\n135#6,3:726\n138#6:733\n139#6:735\n140#6:737\n1#7:734\n314#8,9:738\n323#8,2:750\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilter\n*L\n455#1:674\n455#1:676\n455#1:678,4\n455#1:693\n455#1:705,3\n376#1:644\n376#1:645,2\n384#1:647\n384#1:648,2\n432#1:650\n455#1:675\n515#1:747\n433#1:651\n438#1:652,11\n440#1:663,11\n455#1:677\n455#1:682,11\n455#1:694,11\n516#1:748,2\n472#1:708,2\n472#1:710,6\n472#1:716\n483#1:717,2\n483#1:719,6\n483#1:725\n486#1:729,4\n486#1:736\n486#1:726,3\n486#1:733\n486#1:735\n486#1:737\n486#1:734\n513#1:738,9\n513#1:750,2\n*E\n"})
/* renamed from: yW5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52247yW5 extends AbstractC46919pX3 implements InterfaceC47512qX3, InterfaceC49290tX3, InterfaceC41273g01 {

    /* renamed from: c */
    public final InterfaceC33869Jq6 f119631c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC41273g01 f119632d;

    /* renamed from: e */
    public YW3 f119633e;

    /* renamed from: f */
    public final LX2<C30606a<?>> f119634f;

    /* renamed from: g */
    public final LX2<C30606a<?>> f119635g;

    /* renamed from: h */
    public YW3 f119636h;

    /* renamed from: i */
    public long f119637i;

    /* renamed from: j */
    public ZC0 f119638j;

    /* renamed from: k */
    public boolean f119639k;

    @Metadata(m28433d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0015\u0012\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\bU\u0010VJ\u001a\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u0006*\u00020\tH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\u0005*\u00020\fH\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u0005*\u00020\u0006H\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\f*\u00020\u0005H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\f*\u00020\tH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u0011*\u00020\u0012H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0014J\u001a\u0010\u0019\u001a\u00020\t*\u00020\u0005H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dJ\u0010\u0010#\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!J \u0010&\u001a\u00020\u001f2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0016ø\u0001\u0001¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096@ø\u0001\u0001¢\u0006\u0004\b(\u0010)JL\u00101\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0001\u0010*2\u0006\u0010,\u001a\u00020+2'\u00100\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010.0-¢\u0006\u0002\b/H\u0096@ø\u0001\u0001¢\u0006\u0004\b1\u00102JJ\u00103\u001a\u00028\u0001\"\u0004\b\u0001\u0010*2\u0006\u0010,\u001a\u00020+2'\u00100\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010.0-¢\u0006\u0002\b/H\u0096@ø\u0001\u0001¢\u0006\u0004\b3\u00102R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010=\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010C\u001a\u00020>8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020\f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b4\u0010DR\u0014\u0010G\u001a\u00020\f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bF\u0010DR\u0014\u0010J\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u001d\u0010N\u001a\u00020K8VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u001d\u0010T\u001a\u00020\u00118VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bS\u0010M\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006W"}, m28432d2 = {"LyW5$a;", "R", "LWu;", "Lg01;", "Lkotlin/coroutines/Continuation;", "Lk61;", "", "F0", "(F)I", "LM26;", "V0", "(J)I", "", "x", "(F)F", "w", "(I)F", "LxB5;", "Lo61;", "j", "(J)J", "T0", "I0", "(J)F", "z", "s0", "(F)J", "LYW3;", "event", "LaX3;", "pass", "", "n", "", "cause", "i", "Lkotlin/Result;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "resumeWith", "(Ljava/lang/Object;)V", "r0", "(LaX3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "", "timeMillis", "Lkotlin/Function2;", "", "Lkotlin/ExtensionFunctionType;", "block", "x0", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Q", "b", "Lkotlin/coroutines/Continuation;", "completion", "LWc0;", DateTokenConverter.CONVERTER_KEY, "LWc0;", "pointerAwaiter", "e", "LaX3;", "awaitPass", "Lkotlin/coroutines/CoroutineContext;", "f", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "()F", "density", "R0", "fontScale", "M0", "()LYW3;", "currentEvent", "LG52;", C17296a.f69688o, "()J", "size", "LJq6;", "s", "()LJq6;", "viewConfiguration", "C0", "extendedTouchPadding", "<init>", "(LyW5;Lkotlin/coroutines/Continuation;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilter$PointerEventHandlerCoroutine\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,643:1\n34#2:644\n735#3,2:645\n314#4,11:647\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilter$PointerEventHandlerCoroutine\n*L\n582#1:644\n583#1:645,2\n590#1:647,11\n*E\n"})
    /* renamed from: yW5$a */
    /* loaded from: classes.dex */
    public final class C30606a<R> implements InterfaceC9204Wu, InterfaceC41273g01, Continuation<R> {

        /* renamed from: b */
        public final Continuation<R> f119640b;

        /* renamed from: c */
        public final /* synthetic */ C52247yW5 f119641c;

        /* renamed from: d */
        public InterfaceC36779Wc0<? super YW3> f119642d;

        /* renamed from: e */
        public EnumC38007aX3 f119643e;

        /* renamed from: f */
        public final CoroutineContext f119644f;

        /* renamed from: g */
        public final /* synthetic */ C52247yW5 f119645g;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine", m28418f = "SuspendingPointerInputFilter.kt", m28417i = {0}, m28416l = {628}, m28415m = "withTimeout", m28414n = {"job"}, m28413s = {"L$0"})
        /* renamed from: yW5$a$a */
        /* loaded from: classes.dex */
        public static final class C30607a<T> extends ContinuationImpl {

            /* renamed from: h */
            public Object f119646h;

            /* renamed from: i */
            public /* synthetic */ Object f119647i;

            /* renamed from: j */
            public final /* synthetic */ C30606a<R> f119648j;

            /* renamed from: k */
            public int f119649k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30607a(C30606a<R> c30606a, Continuation<? super C30607a> continuation) {
                super(continuation);
                this.f119648j = c30606a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f119647i = obj;
                this.f119649k |= Integer.MIN_VALUE;
                return this.f119648j.mo3413Q(0L, null, this);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, m28432d2 = {"T", "R", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1", m28418f = "SuspendingPointerInputFilter.kt", m28417i = {}, m28416l = {620, 621}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: yW5$a$b */
        /* loaded from: classes.dex */
        public static final class C30608b extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f119650h;

            /* renamed from: i */
            public final /* synthetic */ long f119651i;

            /* renamed from: j */
            public final /* synthetic */ C30606a<R> f119652j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30608b(long j, C30606a<R> c30606a, Continuation<? super C30608b> continuation) {
                super(2, continuation);
                this.f119651i = j;
                this.f119652j = c30606a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C30608b(this.f119651i, this.f119652j, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C30608b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                InterfaceC36779Wc0 interfaceC36779Wc0;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f119650h;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            interfaceC36779Wc0 = this.f119652j.f119642d;
                            if (interfaceC36779Wc0 != null) {
                                Result.Companion companion = Result.Companion;
                                interfaceC36779Wc0.resumeWith(Result.m116783constructorimpl(ResultKt.createFailure(new PointerEventTimeoutCancellationException(this.f119651i))));
                            }
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    this.f119650h = 1;
                    if (C48120rZ0.m15768a(this.f119651i - 1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.f119650h = 2;
                if (C48120rZ0.m15768a(1L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC36779Wc0 = this.f119652j.f119642d;
                if (interfaceC36779Wc0 != null) {
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine", m28418f = "SuspendingPointerInputFilter.kt", m28417i = {}, m28416l = {600}, m28415m = "withTimeoutOrNull", m28414n = {}, m28413s = {})
        /* renamed from: yW5$a$c */
        /* loaded from: classes.dex */
        public static final class C30609c<T> extends ContinuationImpl {

            /* renamed from: h */
            public /* synthetic */ Object f119653h;

            /* renamed from: i */
            public final /* synthetic */ C30606a<R> f119654i;

            /* renamed from: j */
            public int f119655j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30609c(C30606a<R> c30606a, Continuation<? super C30609c> continuation) {
                super(continuation);
                this.f119654i = c30606a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f119653h = obj;
                this.f119655j |= Integer.MIN_VALUE;
                return this.f119654i.mo3396x0(0L, null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C30606a(C52247yW5 c52247yW5, Continuation<? super R> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            this.f119645g = c52247yW5;
            this.f119640b = completion;
            this.f119641c = c52247yW5;
            this.f119643e = EnumC38007aX3.Main;
            this.f119644f = EmptyCoroutineContext.INSTANCE;
        }

        @Override // p000.InterfaceC9204Wu
        /* renamed from: C0 */
        public long mo3417C0() {
            return this.f119645g.m3430C0();
        }

        @Override // p000.InterfaceC41273g01
        /* renamed from: F0 */
        public int mo3416F0(float f) {
            return this.f119641c.mo3416F0(f);
        }

        @Override // p000.InterfaceC41273g01
        /* renamed from: I0 */
        public float mo3415I0(long j) {
            return this.f119641c.mo3415I0(j);
        }

        @Override // p000.InterfaceC9204Wu
        /* renamed from: M0 */
        public YW3 mo3414M0() {
            return this.f119645g.f119633e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
        /* JADX WARN: Type inference failed for: r12v0, types: [long] */
        /* JADX WARN: Type inference failed for: r12v1, types: [zh2] */
        /* JADX WARN: Type inference failed for: r12v3, types: [zh2] */
        /* JADX WARN: Type inference failed for: r12v7 */
        /* JADX WARN: Type inference failed for: r12v8 */
        @Override // p000.InterfaceC9204Wu
        /* renamed from: Q */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public <T> Object mo3413Q(long j, Function2<? super InterfaceC9204Wu, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
            C30607a c30607a;
            Object coroutine_suspended;
            int i;
            InterfaceC52943zh2 m73800d;
            InterfaceC36779Wc0<? super YW3> interfaceC36779Wc0;
            try {
                if (continuation instanceof C30607a) {
                    c30607a = (C30607a) continuation;
                    int i2 = c30607a.f119649k;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c30607a.f119649k = i2 - Integer.MIN_VALUE;
                        Object obj = c30607a.f119647i;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c30607a.f119649k;
                        if (i == 0) {
                            if (i == 1) {
                                InterfaceC52943zh2 interfaceC52943zh2 = (InterfaceC52943zh2) c30607a.f119646h;
                                ResultKt.throwOnFailure(obj);
                                j = interfaceC52943zh2;
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            if (j <= 0 && (interfaceC36779Wc0 = this.f119642d) != null) {
                                Result.Companion companion = Result.Companion;
                                interfaceC36779Wc0.resumeWith(Result.m116783constructorimpl(ResultKt.createFailure(new PointerEventTimeoutCancellationException(j))));
                            }
                            m73800d = Z30.m73800d(this.f119645g.m3421k1(), null, null, new C30608b(j, this, null), 3, null);
                            c30607a.f119646h = m73800d;
                            c30607a.f119649k = 1;
                            obj = function2.invoke(this, c30607a);
                            j = m73800d;
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return obj;
                    }
                }
                if (i == 0) {
                }
                return obj;
            } finally {
                InterfaceC52943zh2.C31478a.m550a(j, null, 1, null);
            }
            c30607a = new C30607a(this, continuation);
            Object obj2 = c30607a.f119647i;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c30607a.f119649k;
        }

        @Override // p000.InterfaceC41273g01
        /* renamed from: R0 */
        public float mo3412R0() {
            return this.f119641c.mo3412R0();
        }

        @Override // p000.InterfaceC41273g01
        /* renamed from: T0 */
        public float mo3411T0(float f) {
            return this.f119641c.mo3411T0(f);
        }

        @Override // p000.InterfaceC41273g01
        /* renamed from: V0 */
        public int mo3410V0(long j) {
            return this.f119641c.mo3410V0(j);
        }

        @Override // p000.InterfaceC9204Wu
        /* renamed from: a */
        public long mo3409a() {
            return this.f119645g.f119637i;
        }

        @Override // p000.InterfaceC41273g01
        /* renamed from: b */
        public float mo3408b() {
            return this.f119641c.mo3408b();
        }

        @Override // kotlin.coroutines.Continuation
        public CoroutineContext getContext() {
            return this.f119644f;
        }

        /* renamed from: i */
        public final void m3404i(Throwable th) {
            InterfaceC36779Wc0<? super YW3> interfaceC36779Wc0 = this.f119642d;
            if (interfaceC36779Wc0 != null) {
                interfaceC36779Wc0.mo76765v(th);
            }
            this.f119642d = null;
        }

        @Override // p000.InterfaceC41273g01
        /* renamed from: j */
        public long mo3403j(long j) {
            return this.f119641c.mo3403j(j);
        }

        /* renamed from: n */
        public final void m3402n(YW3 event, EnumC38007aX3 pass) {
            InterfaceC36779Wc0<? super YW3> interfaceC36779Wc0;
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(pass, "pass");
            if (pass == this.f119643e && (interfaceC36779Wc0 = this.f119642d) != null) {
                this.f119642d = null;
                interfaceC36779Wc0.resumeWith(Result.m116783constructorimpl(event));
            }
        }

        @Override // p000.InterfaceC9204Wu
        /* renamed from: r0 */
        public Object mo3401r0(EnumC38007aX3 enumC38007aX3, Continuation<? super YW3> continuation) {
            Continuation intercepted;
            Object coroutine_suspended;
            intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
            C37013Xc0 c37013Xc0 = new C37013Xc0(intercepted, 1);
            c37013Xc0.m76766u();
            this.f119643e = enumC38007aX3;
            this.f119642d = c37013Xc0;
            Object m76770q = c37013Xc0.m76770q();
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (m76770q == coroutine_suspended) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return m76770q;
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(Object obj) {
            LX2 lx2 = this.f119645g.f119634f;
            C52247yW5 c52247yW5 = this.f119645g;
            synchronized (lx2) {
                c52247yW5.f119634f.m96709A(this);
                Unit unit = Unit.INSTANCE;
            }
            this.f119640b.resumeWith(obj);
        }

        @Override // p000.InterfaceC9204Wu
        /* renamed from: s */
        public InterfaceC33869Jq6 mo3400s() {
            return this.f119645g.m3419s();
        }

        @Override // p000.InterfaceC41273g01
        /* renamed from: s0 */
        public long mo3399s0(float f) {
            return this.f119641c.mo3399s0(f);
        }

        @Override // p000.InterfaceC41273g01
        /* renamed from: w */
        public float mo3398w(int i) {
            return this.f119641c.mo3398w(i);
        }

        @Override // p000.InterfaceC41273g01
        /* renamed from: x */
        public float mo3397x(float f) {
            return this.f119641c.mo3397x(f);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        @Override // p000.InterfaceC9204Wu
        /* renamed from: x0 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public <T> Object mo3396x0(long j, Function2<? super InterfaceC9204Wu, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
            C30609c c30609c;
            Object coroutine_suspended;
            int i;
            try {
                if (continuation instanceof C30609c) {
                    c30609c = (C30609c) continuation;
                    int i2 = c30609c.f119655j;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c30609c.f119655j = i2 - Integer.MIN_VALUE;
                        Object obj = c30609c.f119653h;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c30609c.f119655j;
                        if (i == 0) {
                            if (i == 1) {
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            c30609c.f119655j = 1;
                            obj = mo3413Q(j, function2, c30609c);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return obj;
                    }
                }
                if (i == 0) {
                }
                return obj;
            } catch (PointerEventTimeoutCancellationException unused) {
                return null;
            }
            c30609c = new C30609c(this, continuation);
            Object obj2 = c30609c.f119653h;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c30609c.f119655j;
        }

        @Override // p000.InterfaceC41273g01
        /* renamed from: z */
        public long mo3395z(long j) {
            return this.f119641c.mo3395z(j);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yW5$b */
    /* loaded from: classes.dex */
    public /* synthetic */ class C30610b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC38007aX3.values().length];
            try {
                iArr[EnumC38007aX3.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC38007aX3.Final.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC38007aX3.Main.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "R", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yW5$c */
    /* loaded from: classes.dex */
    public static final class C30611c extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C30606a<R> f119656g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30611c(C30606a<R> c30606a) {
            super(1);
            this.f119656g = c30606a;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            this.f119656g.m3404i(th);
        }
    }

    public C52247yW5(InterfaceC33869Jq6 viewConfiguration, InterfaceC41273g01 density) {
        YW3 yw3;
        Intrinsics.checkNotNullParameter(viewConfiguration, "viewConfiguration");
        Intrinsics.checkNotNullParameter(density, "density");
        this.f119631c = viewConfiguration;
        this.f119632d = density;
        yw3 = C52840zW5.f121459a;
        this.f119633e = yw3;
        this.f119634f = new LX2<>(new C30606a[16], 0);
        this.f119635g = new LX2<>(new C30606a[16], 0);
        this.f119637i = G52.f10893b.m105825a();
        this.f119638j = VC1.f38731b;
    }

    /* renamed from: C0 */
    public long m3430C0() {
        long mo3395z = mo3395z(m3419s().mo99626e());
        long m19134a = m19134a();
        return CB5.m112663a(Math.max(0.0f, C51465xB5.m5730i(mo3395z) - G52.m105829g(m19134a)) / 2.0f, Math.max(0.0f, C51465xB5.m5732g(mo3395z) - G52.m105830f(m19134a)) / 2.0f);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: F0 */
    public int mo3416F0(float f) {
        return this.f119632d.mo3416F0(f);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: I0 */
    public float mo3415I0(long j) {
        return this.f119632d.mo3415I0(j);
    }

    @Override // p000.InterfaceC47512qX3
    /* renamed from: P0 */
    public AbstractC46919pX3 mo3429P0() {
        return this;
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: R0 */
    public float mo3412R0() {
        return this.f119632d.mo3412R0();
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: T0 */
    public float mo3411T0(float f) {
        return this.f119632d.mo3411T0(f);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: V0 */
    public int mo3410V0(long j) {
        return this.f119632d.mo3410V0(j);
    }

    @Override // p000.AbstractC46919pX3
    /* renamed from: a1 */
    public boolean mo3428a1() {
        return this.f119639k;
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: b */
    public float mo3408b() {
        return this.f119632d.mo3408b();
    }

    @Override // p000.AbstractC46919pX3
    /* renamed from: d1 */
    public void mo3427d1() {
        boolean z;
        YW3 yw3 = this.f119636h;
        if (yw3 == null) {
            return;
        }
        List<C43361jX3> m74945c = yw3.m74945c();
        int size = m74945c.size();
        int i = 0;
        while (true) {
            z = true;
            if (i >= size) {
                break;
            } else if (!(true ^ m74945c.get(i).m30358g())) {
                z = false;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            return;
        }
        List<C43361jX3> m74945c2 = yw3.m74945c();
        ArrayList arrayList = new ArrayList(m74945c2.size());
        int size2 = m74945c2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C43361jX3 c43361jX3 = m74945c2.get(i2);
            arrayList.add(new C43361jX3(c43361jX3.m30360e(), c43361jX3.m30352m(), c43361jX3.m30359f(), false, c43361jX3.m30357h(), c43361jX3.m30352m(), c43361jX3.m30359f(), c43361jX3.m30358g(), c43361jX3.m30358g(), 0, 0L, 1536, (DefaultConstructorMarker) null));
        }
        YW3 yw32 = new YW3(arrayList);
        this.f119633e = yw32;
        m3422j1(yw32, EnumC38007aX3.Initial);
        m3422j1(yw32, EnumC38007aX3.Main);
        m3422j1(yw32, EnumC38007aX3.Final);
        this.f119636h = null;
    }

    @Override // p000.AbstractC46919pX3
    /* renamed from: e1 */
    public void mo3426e1(YW3 pointerEvent, EnumC38007aX3 pass, long j) {
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(pass, "pass");
        this.f119637i = j;
        if (pass == EnumC38007aX3.Initial) {
            this.f119633e = pointerEvent;
        }
        m3422j1(pointerEvent, pass);
        List<C43361jX3> m74945c = pointerEvent.m74945c();
        int size = m74945c.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                if (!ZW3.m72995d(m74945c.get(i))) {
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        if (!(!z)) {
            pointerEvent = null;
        }
        this.f119636h = pointerEvent;
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: j */
    public long mo3403j(long j) {
        return this.f119632d.mo3403j(j);
    }

    /* renamed from: j1 */
    public final void m3422j1(YW3 yw3, EnumC38007aX3 enumC38007aX3) {
        LX2<C30606a<?>> lx2;
        int m96690u;
        synchronized (this.f119634f) {
            LX2<C30606a<?>> lx22 = this.f119635g;
            lx22.m96700c(lx22.m96690u(), this.f119634f);
        }
        try {
            int i = C30610b.$EnumSwitchMapping$0[enumC38007aX3.ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3 && (m96690u = (lx2 = this.f119635g).m96690u()) > 0) {
                    int i2 = m96690u - 1;
                    C30606a<?>[] m96691s = lx2.m96691s();
                    do {
                        m96691s[i2].m3402n(yw3, enumC38007aX3);
                        i2--;
                    } while (i2 >= 0);
                }
            } else {
                LX2<C30606a<?>> lx23 = this.f119635g;
                int m96690u2 = lx23.m96690u();
                if (m96690u2 > 0) {
                    C30606a<?>[] m96691s2 = lx23.m96691s();
                    int i3 = 0;
                    do {
                        m96691s2[i3].m3402n(yw3, enumC38007aX3);
                        i3++;
                    } while (i3 < m96690u2);
                }
            }
        } finally {
            this.f119635g.m96696h();
        }
    }

    /* renamed from: k1 */
    public final ZC0 m3421k1() {
        return this.f119638j;
    }

    /* renamed from: l1 */
    public final void m3420l1(ZC0 zc0) {
        Intrinsics.checkNotNullParameter(zc0, "<set-?>");
        this.f119638j = zc0;
    }

    /* renamed from: s */
    public InterfaceC33869Jq6 m3419s() {
        return this.f119631c;
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: s0 */
    public long mo3399s0(float f) {
        return this.f119632d.mo3399s0(f);
    }

    @Override // p000.InterfaceC49290tX3
    /* renamed from: v0 */
    public <R> Object mo3418v0(Function2<? super InterfaceC9204Wu, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        Continuation intercepted;
        Object coroutine_suspended;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        C37013Xc0 c37013Xc0 = new C37013Xc0(intercepted, 1);
        c37013Xc0.m76766u();
        C30606a c30606a = new C30606a(this, c37013Xc0);
        synchronized (this.f119634f) {
            this.f119634f.m96701b(c30606a);
            Continuation<Unit> createCoroutine = ContinuationKt.createCoroutine(function2, c30606a, c30606a);
            Result.Companion companion = Result.Companion;
            createCoroutine.resumeWith(Result.m116783constructorimpl(Unit.INSTANCE));
        }
        c37013Xc0.mo76794H(new C30611c(c30606a));
        Object m76770q = c37013Xc0.m76770q();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m76770q == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return m76770q;
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: w */
    public float mo3398w(int i) {
        return this.f119632d.mo3398w(i);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: x */
    public float mo3397x(float f) {
        return this.f119632d.mo3397x(f);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: z */
    public long mo3395z(long j) {
        return this.f119632d.mo3395z(j);
    }
}
