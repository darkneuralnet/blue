package p000;

import androidx.compose.runtime.ComposeRuntimeError;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.AbstractC48600sM5;
import p000.AbstractC49193tM5;
import p000.InterfaceC36779Wc0;
import p000.InterfaceC52943zh2;
@Metadata(m28433d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u0099\u00012\u00020\u0001:\u00044AQTB\u0013\u0012\b\u0010\u0085\u0001\u001a\u00030\u0081\u0001¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J*\u0010\u0010\u001a\u00020\u00032\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002J\u0013\u0010\u0011\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012JQ\u0010\u001d\u001a\u00020\u00032<\u0010\u001c\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0014\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0013¢\u0006\u0002\b\u001bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\fH\u0002J\"\u0010#\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001f\u001a\u00020\f2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010!H\u0002J,\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0$2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010!H\u0002J\b\u0010(\u001a\u00020\u0003H\u0002J\u001c\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00030)2\u0006\u0010\u001f\u001a\u00020\fH\u0002J,\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00030)2\u0006\u0010\u001f\u001a\u00020\f2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010!H\u0002J\u0010\u0010.\u001a\u00020\u00032\u0006\u0010-\u001a\u00020,H\u0002J\u0013\u0010/\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0012J\u0006\u00100\u001a\u00020\u0003J\u0013\u00101\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0012J%\u00104\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\f2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000302H\u0010¢\u0006\u0004\b4\u00105J\u001d\u00109\u001a\u00020\u00032\f\u00108\u001a\b\u0012\u0004\u0012\u00020706H\u0010¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\fH\u0010¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\fH\u0010¢\u0006\u0004\b=\u0010<J\u0017\u0010?\u001a\u00020\u00032\u0006\u0010>\u001a\u00020%H\u0010¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u00032\u0006\u0010>\u001a\u00020%H\u0010¢\u0006\u0004\bA\u0010@J\u001f\u0010D\u001a\u00020\u00032\u0006\u0010>\u001a\u00020%2\u0006\u0010C\u001a\u00020BH\u0010¢\u0006\u0004\bD\u0010EJ\u0019\u0010F\u001a\u0004\u0018\u00010B2\u0006\u0010>\u001a\u00020%H\u0010¢\u0006\u0004\bF\u0010GR$\u0010M\u001a\u00020H2\u0006\u0010I\u001a\u00020H8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b4\u0010J\u001a\u0004\bK\u0010LR\u0014\u0010P\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010OR\u0014\u0010S\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010V\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010Y\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010XR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020\f0Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u001c\u0010`\u001a\b\u0012\u0004\u0012\u00020\u001a068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020\f0Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010\\R\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020\f0Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010\\R\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020%0Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010\\R.\u0010g\u001a\u001c\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0Z0d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010fR \u0010h\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020B0d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010fR\u001e\u0010j\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010\\R\u001e\u0010m\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010q\u001a\u00020n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010s\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010rR\u0018\u0010w\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u001a\u0010|\u001a\b\u0012\u0004\u0012\u00020y0x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0015\u0010\u0080\u0001\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001f\u0010\u0085\u0001\u001a\u00030\u0081\u00018\u0010X\u0090\u0004¢\u0006\u000f\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0005\b^\u0010\u0084\u0001R\u001c\u0010\u0089\u0001\u001a\u00070\u0086\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0017\u0010\u008c\u0001\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0016\u0010\u008d\u0001\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\br\u0010\u008b\u0001R\u0017\u0010\u008f\u0001\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008b\u0001R\u001b\u0010\u0093\u0001\u001a\t\u0012\u0004\u0012\u00020y0\u0090\u00018F¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0016\u0010\u0095\u0001\u001a\u00020n8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b[\u0010\u0094\u0001R\u0016\u0010\u0096\u0001\u001a\u00020\u000e8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bT\u0010\u008b\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u009a\u0001"}, m28432d2 = {"Lqs4;", "LYt0;", "LWc0;", "", "U", "k0", "Lzh2;", "callingJob", "l0", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "LnB0;", "failedInitialComposition", "", "recoverable", "g0", "S", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function3;", "LZC0;", "LIV2;", "Lkotlin/ParameterName;", "name", "parentFrameClock", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "j0", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "composition", "c0", "LlW1;", "modifiedValues", "f0", "", "LjW2;", "references", "e0", "V", "Lkotlin/Function1;", "i0", "n0", "LCX2;", "snapshot", "R", "m0", "T", "b0", "Lkotlin/Function0;", "content", C17296a.f69688o, "(LnB0;Lkotlin/jvm/functions/Function2;)V", "", "Lau0;", "table", "l", "(Ljava/util/Set;)V", "p", "(LnB0;)V", "i", "reference", "h", "(LjW2;)V", "b", "LiW2;", MessageExtension.FIELD_DATA, "j", "(LjW2;LiW2;)V", "k", "(LjW2;)LiW2;", "", "<set-?>", "J", "W", "()J", "changeCount", "LM20;", "LM20;", "broadcastFrameClock", "c", "Ljava/lang/Object;", "stateLock", DateTokenConverter.CONVERTER_KEY, "Lzh2;", "runnerJob", "", "Ljava/lang/Throwable;", "closeCause", "", "f", "Ljava/util/List;", "knownCompositions", "g", "Ljava/util/Set;", "snapshotInvalidations", "compositionInvalidations", "compositionsAwaitingApply", "compositionValuesAwaitingInsert", "", "LhW2;", "Ljava/util/Map;", "compositionValuesRemoved", "compositionValueStatesAvailable", "m", "failedCompositions", "n", "LWc0;", "workContinuation", "", "o", "I", "concurrentCompositionsOutstanding", "Z", "isClosed", "Lqs4$b;", "q", "Lqs4$b;", "errorState", "LGX2;", "Lqs4$d;", "r", "LGX2;", "_state", "Lms0;", "s", "Lms0;", "effectJob", "Lkotlin/coroutines/CoroutineContext;", "t", "Lkotlin/coroutines/CoroutineContext;", "()Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "Lqs4$c;", "u", "Lqs4$c;", "recomposerInfo", "a0", "()Z", "shouldKeepRecomposing", "hasSchedulingWork", "Y", "hasFrameWorkLocked", "LtP5;", "X", "()LtP5;", "currentState", "()I", "compoundHashKey", "collectingParameterInformation", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "v", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 8 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1408:1\n1112#1,5:1450\n1118#1:1460\n1112#1,5:1473\n1118#1:1483\n1112#1,5:1504\n1118#1:1525\n70#2:1409\n70#2:1430\n70#2:1432\n70#2:1433\n70#2:1434\n70#2:1435\n70#2:1445\n70#2:1448\n70#2:1449\n70#2:1461\n70#2:1462\n70#2:1512\n70#2:1526\n70#2:1549\n70#2:1550\n70#2:1551\n70#2:1552\n70#2:1553\n70#2:1554\n70#2:1555\n70#2:1556\n70#2:1557\n1229#3,2:1410\n33#4,6:1412\n33#4,6:1418\n33#4,6:1424\n93#4,2:1463\n33#4,4:1465\n95#4,2:1469\n38#4:1471\n97#4:1472\n120#4,3:1484\n33#4,4:1487\n123#4,2:1491\n125#4,2:1500\n38#4:1502\n127#4:1503\n82#4,3:1513\n33#4,4:1516\n85#4,2:1520\n38#4:1522\n87#4:1523\n82#4,3:1527\n33#4,4:1530\n85#4,2:1534\n38#4:1536\n87#4:1537\n33#4,6:1538\n1#5:1431\n314#6,9:1436\n323#6,2:1446\n122#7,5:1455\n122#7,5:1478\n122#7,3:1509\n126#7:1524\n122#7,5:1544\n361#8,7:1493\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n*L\n965#1:1450,5\n965#1:1460\n1039#1:1473,5\n1039#1:1483\n1059#1:1504,5\n1059#1:1525\n324#1:1409\n448#1:1430\n655#1:1432\n691#1:1433\n703#1:1434\n846#1:1435\n855#1:1445\n930#1:1448\n946#1:1449\n978#1:1461\n1009#1:1462\n1062#1:1512\n1075#1:1526\n1142#1:1549\n1186#1:1550\n1194#1:1551\n1203#1:1552\n1210#1:1553\n1217#1:1554\n1226#1:1555\n1234#1:1556\n1015#1:1557\n325#1:1410,2\n415#1:1412,6\n435#1:1418,6\n440#1:1424,6\n1010#1:1463,2\n1010#1:1465,4\n1010#1:1469,2\n1010#1:1471\n1010#1:1472\n1056#1:1484,3\n1056#1:1487,4\n1056#1:1491,2\n1056#1:1500,2\n1056#1:1502\n1056#1:1503\n1063#1:1513,3\n1063#1:1516,4\n1063#1:1520,2\n1063#1:1522\n1063#1:1523\n1079#1:1527,3\n1079#1:1530,4\n1079#1:1534,2\n1079#1:1536\n1079#1:1537\n1086#1:1538,6\n854#1:1436,9\n854#1:1446,2\n965#1:1455,5\n1039#1:1478,5\n1059#1:1509,3\n1059#1:1524\n1116#1:1544,5\n1056#1:1493,7\n*E\n"})
/* renamed from: qs4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47720qs4 extends AbstractC37400Yt0 {

    /* renamed from: v */
    public static final C27713a f105949v = new C27713a(null);

    /* renamed from: w */
    public static final int f105950w = 8;

    /* renamed from: x */
    public static final GX2<KR3<C27715c>> f105951x = C50405vP5.m8742a(C34494Mi1.m95008c());

    /* renamed from: y */
    public static final AtomicReference<Boolean> f105952y = new AtomicReference<>(Boolean.FALSE);

    /* renamed from: a */
    public long f105953a;

    /* renamed from: b */
    public final M20 f105954b;

    /* renamed from: c */
    public final Object f105955c;

    /* renamed from: d */
    public InterfaceC52943zh2 f105956d;

    /* renamed from: e */
    public Throwable f105957e;

    /* renamed from: f */
    public final List<InterfaceC45532nB0> f105958f;

    /* renamed from: g */
    public Set<Object> f105959g;

    /* renamed from: h */
    public final List<InterfaceC45532nB0> f105960h;

    /* renamed from: i */
    public final List<InterfaceC45532nB0> f105961i;

    /* renamed from: j */
    public final List<C43351jW2> f105962j;

    /* renamed from: k */
    public final Map<C42165hW2<Object>, List<C43351jW2>> f105963k;

    /* renamed from: l */
    public final Map<C43351jW2, C42758iW2> f105964l;

    /* renamed from: m */
    public List<InterfaceC45532nB0> f105965m;

    /* renamed from: n */
    public InterfaceC36779Wc0<? super Unit> f105966n;

    /* renamed from: o */
    public int f105967o;

    /* renamed from: p */
    public boolean f105968p;

    /* renamed from: q */
    public C27714b f105969q;

    /* renamed from: r */
    public final GX2<EnumC27716d> f105970r;

    /* renamed from: s */
    public final InterfaceC45344ms0 f105971s;

    /* renamed from: t */
    public final CoroutineContext f105972t;

    /* renamed from: u */
    public final C27715c f105973u;

    @Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003H\u0002J\u0014\u0010\u0007\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003H\u0002R4\u0010\f\u001a\"\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bj\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR$\u0010\u0010\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m28432d2 = {"Lqs4$a;", "", "Lqs4$c;", "Lqs4;", "info", "", "c", DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/atomic/AtomicReference;", "", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/AtomicReference;", "_hotReloadEnabled", "Ljava/util/concurrent/atomic/AtomicReference;", "LGX2;", "LKR3;", "_runningRecomposers", "LGX2;", "<init>", "()V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1408:1\n1360#2:1409\n1446#2,5:1410\n1855#2,2:1415\n1855#2,2:1429\n1855#2,2:1431\n1603#2,9:1433\n1855#2:1442\n1856#2:1444\n1612#2:1445\n1603#2,9:1446\n1855#2:1455\n1856#2:1457\n1612#2:1458\n33#3,6:1417\n33#3,6:1423\n1#4:1443\n1#4:1456\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$Companion\n*L\n1285#1:1409\n1285#1:1410,5\n1293#1:1415,2\n1302#1:1429,2\n1309#1:1431,2\n1323#1:1433,9\n1323#1:1442\n1323#1:1444\n1323#1:1445\n1328#1:1446,9\n1328#1:1455\n1328#1:1457\n1328#1:1458\n1299#1:1417,6\n1300#1:1423,6\n1323#1:1443\n1328#1:1456\n*E\n"})
    /* renamed from: qs4$a */
    /* loaded from: classes.dex */
    public static final class C27713a {
        public /* synthetic */ C27713a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public final void m16832c(C27715c c27715c) {
            KR3 kr3;
            KR3 add;
            do {
                kr3 = (KR3) C47720qs4.f105951x.getValue();
                add = kr3.add((KR3) c27715c);
                if (kr3 == add) {
                    return;
                }
            } while (!C47720qs4.f105951x.compareAndSet(kr3, add));
        }

        /* renamed from: d */
        public final void m16831d(C27715c c27715c) {
            KR3 kr3;
            KR3 remove;
            do {
                kr3 = (KR3) C47720qs4.f105951x.getValue();
                remove = kr3.remove((KR3) c27715c);
                if (kr3 == remove) {
                    return;
                }
            } while (!C47720qs4.f105951x.compareAndSet(kr3, remove));
        }

        private C27713a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\u0010\u000e\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u000e\u001a\u00060\bj\u0002`\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"Lqs4$b;", "", "", C17296a.f69688o, "Z", "getRecoverable", "()Z", "recoverable", "Ljava/lang/Exception;", "Lkotlin/Exception;", "b", "Ljava/lang/Exception;", "getCause", "()Ljava/lang/Exception;", "cause", "<init>", "(ZLjava/lang/Exception;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: qs4$b */
    /* loaded from: classes.dex */
    public static final class C27714b {

        /* renamed from: a */
        public final boolean f105974a;

        /* renamed from: b */
        public final Exception f105975b;

        public C27714b(boolean z, Exception cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.f105974a = z;
            this.f105975b = cause;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lqs4$c;", "", "<init>", "(Lqs4;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$RecomposerInfoImpl\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1408:1\n70#2:1409\n70#2:1410\n70#2:1429\n211#3,3:1411\n33#3,4:1414\n214#3:1418\n215#3:1420\n38#3:1421\n216#3:1422\n33#3,6:1423\n211#3,3:1430\n33#3,4:1433\n214#3:1437\n215#3:1439\n38#3:1440\n216#3:1441\n82#3,3:1442\n33#3,4:1445\n85#3:1449\n86#3:1451\n38#3:1452\n87#3:1453\n1#4:1419\n1#4:1438\n1#4:1450\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$RecomposerInfoImpl\n*L\n350#1:1409\n355#1:1410\n363#1:1429\n359#1:1411,3\n359#1:1414,4\n359#1:1418\n359#1:1420\n359#1:1421\n359#1:1422\n360#1:1423,6\n367#1:1430,3\n367#1:1433,4\n367#1:1437\n367#1:1439\n367#1:1440\n367#1:1441\n368#1:1442,3\n368#1:1445,4\n368#1:1449\n368#1:1451\n368#1:1452\n368#1:1453\n359#1:1419\n367#1:1438\n*E\n"})
    /* renamed from: qs4$c */
    /* loaded from: classes.dex */
    public final class C27715c {
        public C27715c() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m28432d2 = {"Lqs4$d;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: qs4$d */
    /* loaded from: classes.dex */
    public enum EnumC27716d {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$broadcastFrameClock$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,1408:1\n70#2:1409\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$broadcastFrameClock$1\n*L\n138#1:1409\n*E\n"})
    /* renamed from: qs4$e */
    /* loaded from: classes.dex */
    public static final class C27717e extends Lambda implements Function0<Unit> {
        public C27717e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            InterfaceC36779Wc0 m16875U;
            Object obj = C47720qs4.this.f105955c;
            C47720qs4 c47720qs4 = C47720qs4.this;
            synchronized (obj) {
                m16875U = c47720qs4.m16875U();
                if (((EnumC27716d) c47720qs4.f105970r.getValue()).compareTo(EnumC27716d.ShuttingDown) <= 0) {
                    throw C42270hh1.m36097a("Recomposer shutdown; frame clock awaiter will never resume", c47720qs4.f105957e);
                }
            }
            if (m16875U != null) {
                Result.Companion companion = Result.Companion;
                m16875U.resumeWith(Result.m116783constructorimpl(Unit.INSTANCE));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$effectJob$1$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,1408:1\n70#2:1409\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$effectJob$1$1\n*L\n234#1:1409\n*E\n"})
    /* renamed from: qs4$f */
    /* loaded from: classes.dex */
    public static final class C27718f extends Lambda implements Function1<Throwable, Unit> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "runnerJobCause", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$effectJob$1$1$1$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1408:1\n70#2:1409\n1#3:1410\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$effectJob$1$1$1$1\n*L\n249#1:1409\n*E\n"})
        /* renamed from: qs4$f$a */
        /* loaded from: classes.dex */
        public static final class C27719a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C47720qs4 f105986g;

            /* renamed from: h */
            public final /* synthetic */ Throwable f105987h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27719a(C47720qs4 c47720qs4, Throwable th) {
                super(1);
                this.f105986g = c47720qs4;
                this.f105987h = th;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                Object obj = this.f105986g.f105955c;
                C47720qs4 c47720qs4 = this.f105986g;
                Throwable th2 = this.f105987h;
                synchronized (obj) {
                    if (th2 == null) {
                        th2 = null;
                    } else if (th != null) {
                        if (!(!(th instanceof CancellationException))) {
                            th = null;
                        }
                        if (th != null) {
                            ExceptionsKt__ExceptionsKt.addSuppressed(th2, th);
                        }
                    }
                    c47720qs4.f105957e = th2;
                    c47720qs4.f105970r.setValue(EnumC27716d.ShutDown);
                    Unit unit = Unit.INSTANCE;
                }
            }
        }

        public C27718f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            InterfaceC36779Wc0 interfaceC36779Wc0;
            InterfaceC36779Wc0 interfaceC36779Wc02;
            CancellationException m36097a = C42270hh1.m36097a("Recomposer effect job completed", th);
            Object obj = C47720qs4.this.f105955c;
            C47720qs4 c47720qs4 = C47720qs4.this;
            synchronized (obj) {
                InterfaceC52943zh2 interfaceC52943zh2 = c47720qs4.f105956d;
                interfaceC36779Wc0 = null;
                if (interfaceC52943zh2 != null) {
                    c47720qs4.f105970r.setValue(EnumC27716d.ShuttingDown);
                    if (!c47720qs4.f105968p) {
                        interfaceC52943zh2.mo552f(m36097a);
                    } else if (c47720qs4.f105966n != null) {
                        interfaceC36779Wc02 = c47720qs4.f105966n;
                        c47720qs4.f105966n = null;
                        interfaceC52943zh2.mo551n(new C27719a(c47720qs4, th));
                        interfaceC36779Wc0 = interfaceC36779Wc02;
                    }
                    interfaceC36779Wc02 = null;
                    c47720qs4.f105966n = null;
                    interfaceC52943zh2.mo551n(new C27719a(c47720qs4, th));
                    interfaceC36779Wc0 = interfaceC36779Wc02;
                } else {
                    c47720qs4.f105957e = m36097a;
                    c47720qs4.f105970r.setValue(EnumC27716d.ShutDown);
                    Unit unit = Unit.INSTANCE;
                }
            }
            if (interfaceC36779Wc0 != null) {
                Result.Companion companion = Result.Companion;
                interfaceC36779Wc0.resumeWith(Result.m116783constructorimpl(Unit.INSTANCE));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"Lqs4$d;", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.runtime.Recomposer$join$2", m28418f = "Recomposer.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: qs4$g */
    /* loaded from: classes.dex */
    public static final class C27720g extends SuspendLambda implements Function2<EnumC27716d, Continuation<? super Boolean>, Object> {

        /* renamed from: h */
        public int f105988h;

        /* renamed from: i */
        public /* synthetic */ Object f105989i;

        public C27720g(Continuation<? super C27720g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C27720g c27720g = new C27720g(continuation);
            c27720g.f105989i = obj;
            return c27720g;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(EnumC27716d enumC27716d, Continuation<? super Boolean> continuation) {
            return ((C27720g) create(enumC27716d, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f105988h == 0) {
                ResultKt.throwOnFailure(obj);
                if (((EnumC27716d) this.f105989i) == EnumC27716d.ShutDown) {
                    z = true;
                } else {
                    z = false;
                }
                return Boxing.boxBoolean(z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$performRecompose$1$1\n+ 2 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n*L\n1#1,1408:1\n105#2,5:1409\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$performRecompose$1$1\n*L\n1044#1:1409,5\n*E\n"})
    /* renamed from: qs4$h */
    /* loaded from: classes.dex */
    public static final class C27721h extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ C44536lW1<Object> f105990g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC45532nB0 f105991h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27721h(C44536lW1<Object> c44536lW1, InterfaceC45532nB0 interfaceC45532nB0) {
            super(0);
            this.f105990g = c44536lW1;
            this.f105991h = interfaceC45532nB0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C44536lW1<Object> c44536lW1 = this.f105990g;
            InterfaceC45532nB0 interfaceC45532nB0 = this.f105991h;
            int size = c44536lW1.size();
            for (int i = 0; i < size; i++) {
                interfaceC45532nB0.mo24212v(c44536lW1.get(i));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "value", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: qs4$i */
    /* loaded from: classes.dex */
    public static final class C27722i extends Lambda implements Function1<Object, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC45532nB0 f105992g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27722i(InterfaceC45532nB0 interfaceC45532nB0) {
            super(1);
            this.f105992g = interfaceC45532nB0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Object value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f105992g.mo24217p(value);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", m28418f = "Recomposer.kt", m28417i = {0, 0}, m28416l = {898}, m28415m = "invokeSuspend", m28414n = {"callingJob", "unregisterApplyObserver"}, m28413s = {"L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1408:1\n70#2:1409\n70#2:1416\n33#3,6:1410\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2\n*L\n893#1:1409\n903#1:1416\n894#1:1410,6\n*E\n"})
    /* renamed from: qs4$j */
    /* loaded from: classes.dex */
    public static final class C27723j extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public Object f105993h;

        /* renamed from: i */
        public int f105994i;

        /* renamed from: j */
        public /* synthetic */ Object f105995j;

        /* renamed from: l */
        public final /* synthetic */ Function3<ZC0, IV2, Continuation<? super Unit>, Object> f105997l;

        /* renamed from: m */
        public final /* synthetic */ IV2 f105998m;

        @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", m28418f = "Recomposer.kt", m28417i = {}, m28416l = {899}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: qs4$j$a */
        /* loaded from: classes.dex */
        public static final class C27724a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f105999h;

            /* renamed from: i */
            public /* synthetic */ Object f106000i;

            /* renamed from: j */
            public final /* synthetic */ Function3<ZC0, IV2, Continuation<? super Unit>, Object> f106001j;

            /* renamed from: k */
            public final /* synthetic */ IV2 f106002k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C27724a(Function3<? super ZC0, ? super IV2, ? super Continuation<? super Unit>, ? extends Object> function3, IV2 iv2, Continuation<? super C27724a> continuation) {
                super(2, continuation);
                this.f106001j = function3;
                this.f106002k = iv2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C27724a c27724a = new C27724a(this.f106001j, this.f106002k, continuation);
                c27724a.f106000i = obj;
                return c27724a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C27724a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f105999h;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Function3<ZC0, IV2, Continuation<? super Unit>, Object> function3 = this.f106001j;
                    IV2 iv2 = this.f106002k;
                    this.f105999h = 1;
                    if (function3.invoke((ZC0) this.f106000i, iv2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "", "changed", "LsM5;", "<anonymous parameter 1>", "", C17296a.f69688o, "(Ljava/util/Set;LsM5;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2$unregisterApplyObserver$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,1408:1\n70#2:1409\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2$unregisterApplyObserver$1\n*L\n880#1:1409\n*E\n"})
        /* renamed from: qs4$j$b */
        /* loaded from: classes.dex */
        public static final class C27725b extends Lambda implements Function2<Set<? extends Object>, AbstractC48600sM5, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C47720qs4 f106003g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27725b(C47720qs4 c47720qs4) {
                super(2);
                this.f106003g = c47720qs4;
            }

            /* renamed from: a */
            public final void m16828a(Set<? extends Object> changed, AbstractC48600sM5 abstractC48600sM5) {
                InterfaceC36779Wc0 interfaceC36779Wc0;
                Intrinsics.checkNotNullParameter(changed, "changed");
                Intrinsics.checkNotNullParameter(abstractC48600sM5, "<anonymous parameter 1>");
                Object obj = this.f106003g.f105955c;
                C47720qs4 c47720qs4 = this.f106003g;
                synchronized (obj) {
                    if (((EnumC27716d) c47720qs4.f105970r.getValue()).compareTo(EnumC27716d.Idle) >= 0) {
                        c47720qs4.f105959g.addAll(changed);
                        interfaceC36779Wc0 = c47720qs4.m16875U();
                    } else {
                        interfaceC36779Wc0 = null;
                    }
                }
                if (interfaceC36779Wc0 != null) {
                    Result.Companion companion = Result.Companion;
                    interfaceC36779Wc0.resumeWith(Result.m116783constructorimpl(Unit.INSTANCE));
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Set<? extends Object> set, AbstractC48600sM5 abstractC48600sM5) {
                m16828a(set, abstractC48600sM5);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C27723j(Function3<? super ZC0, ? super IV2, ? super Continuation<? super Unit>, ? extends Object> function3, IV2 iv2, Continuation<? super C27723j> continuation) {
            super(2, continuation);
            this.f105997l = function3;
            this.f105998m = iv2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C27723j c27723j = new C27723j(this.f105997l, this.f105998m, continuation);
            c27723j.f105995j = obj;
            return c27723j;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C27723j) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:59:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            InterfaceC52943zh2 m98498n;
            InterfaceC41649ge3 interfaceC41649ge3;
            Throwable th;
            Object obj2;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f105994i;
            if (i != 0) {
                if (i == 1) {
                    interfaceC41649ge3 = (InterfaceC41649ge3) this.f105993h;
                    m98498n = (InterfaceC52943zh2) this.f105995j;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        interfaceC41649ge3.dispose();
                        obj2 = C47720qs4.this.f105955c;
                        C47720qs4 c47720qs4 = C47720qs4.this;
                        synchronized (obj2) {
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                m98498n = C34018Kh2.m98498n(((ZC0) this.f105995j).mo18342K());
                C47720qs4.this.m16848l0(m98498n);
                InterfaceC41649ge3 m14277e = AbstractC48600sM5.f108670e.m14277e(new C27725b(C47720qs4.this));
                C47720qs4.f105949v.m16832c(C47720qs4.this.f105973u);
                try {
                    Object obj3 = C47720qs4.this.f105955c;
                    C47720qs4 c47720qs42 = C47720qs4.this;
                    synchronized (obj3) {
                        List list = c47720qs42.f105958f;
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ((InterfaceC45532nB0) list.get(i2)).mo24211x();
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                    C27724a c27724a = new C27724a(this.f105997l, this.f105998m, null);
                    this.f105995j = m98498n;
                    this.f105993h = m14277e;
                    this.f105994i = 1;
                    if (C37824aD0.m71786e(c27724a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    interfaceC41649ge3 = m14277e;
                } catch (Throwable th3) {
                    interfaceC41649ge3 = m14277e;
                    th = th3;
                    interfaceC41649ge3.dispose();
                    obj2 = C47720qs4.this.f105955c;
                    C47720qs4 c47720qs43 = C47720qs4.this;
                    synchronized (obj2) {
                        if (c47720qs43.f105956d == m98498n) {
                            c47720qs43.f105956d = null;
                        }
                        c47720qs43.m16875U();
                    }
                    C47720qs4.f105949v.m16831d(C47720qs4.this.f105973u);
                    throw th;
                }
            }
            interfaceC41649ge3.dispose();
            Object obj4 = C47720qs4.this.f105955c;
            C47720qs4 c47720qs44 = C47720qs4.this;
            synchronized (obj4) {
                if (c47720qs44.f105956d == m98498n) {
                    c47720qs44.f105956d = null;
                }
                c47720qs44.m16875U();
            }
            C47720qs4.f105949v.m16831d(C47720qs4.this.f105973u);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m28432d2 = {"LZC0;", "LIV2;", "parentFrameClock", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", m28418f = "Recomposer.kt", m28417i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, m28416l = {492, 510}, m28415m = "invokeSuspend", m28414n = {"parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete"}, m28413s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1408:1\n70#2:1409\n70#2:1410\n33#3,6:1411\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2\n*L\n496#1:1409\n485#1:1410\n486#1:1411,6\n*E\n"})
    /* renamed from: qs4$k */
    /* loaded from: classes.dex */
    public static final class C27726k extends SuspendLambda implements Function3<ZC0, IV2, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public Object f106004h;

        /* renamed from: i */
        public Object f106005i;

        /* renamed from: j */
        public Object f106006j;

        /* renamed from: k */
        public Object f106007k;

        /* renamed from: l */
        public Object f106008l;

        /* renamed from: m */
        public int f106009m;

        /* renamed from: n */
        public /* synthetic */ Object f106010n;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "frameTime", "", C17296a.f69688o, "(J)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$2\n+ 2 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1408:1\n46#2,5:1409\n46#2,3:1414\n50#2:1430\n70#3:1417\n70#3:1431\n70#3:1448\n33#4,6:1418\n33#4,6:1424\n33#4,6:1432\n33#4,6:1438\n1855#5,2:1444\n1855#5,2:1446\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$2\n*L\n514#1:1409,5\n524#1:1414,3\n524#1:1430\n527#1:1417\n558#1:1431\n632#1:1448\n530#1:1418,6\n539#1:1424,6\n559#1:1432,6\n591#1:1438,6\n606#1:1444,2\n620#1:1446,2\n*E\n"})
        /* renamed from: qs4$k$a */
        /* loaded from: classes.dex */
        public static final class C27727a extends Lambda implements Function1<Long, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C47720qs4 f106012g;

            /* renamed from: h */
            public final /* synthetic */ List<InterfaceC45532nB0> f106013h;

            /* renamed from: i */
            public final /* synthetic */ List<C43351jW2> f106014i;

            /* renamed from: j */
            public final /* synthetic */ Set<InterfaceC45532nB0> f106015j;

            /* renamed from: k */
            public final /* synthetic */ List<InterfaceC45532nB0> f106016k;

            /* renamed from: l */
            public final /* synthetic */ Set<InterfaceC45532nB0> f106017l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27727a(C47720qs4 c47720qs4, List<InterfaceC45532nB0> list, List<C43351jW2> list2, Set<InterfaceC45532nB0> set, List<InterfaceC45532nB0> list3, Set<InterfaceC45532nB0> set2) {
                super(1);
                this.f106012g = c47720qs4;
                this.f106013h = list;
                this.f106014i = list2;
                this.f106015j = set;
                this.f106016k = list3;
                this.f106017l = set2;
            }

            /* renamed from: a */
            public final void m16822a(long j) {
                Object m61928a;
                if (this.f106012g.f105954b.m95992t()) {
                    C47720qs4 c47720qs4 = this.f106012g;
                    C38949c66 c38949c66 = C38949c66.f60129a;
                    m61928a = c38949c66.m61928a("Recomposer:animation");
                    try {
                        c47720qs4.f105954b.m95991v(j);
                        AbstractC48600sM5.f108670e.m14275g();
                        Unit unit = Unit.INSTANCE;
                        c38949c66.m61927b(m61928a);
                    } finally {
                    }
                }
                C47720qs4 c47720qs42 = this.f106012g;
                List<InterfaceC45532nB0> list = this.f106013h;
                List<C43351jW2> list2 = this.f106014i;
                Set<InterfaceC45532nB0> set = this.f106015j;
                List<InterfaceC45532nB0> list3 = this.f106016k;
                Set<InterfaceC45532nB0> set2 = this.f106017l;
                m61928a = C38949c66.f60129a.m61928a("Recomposer:recompose");
                try {
                    synchronized (c47720qs42.f105955c) {
                        c47720qs42.m16850k0();
                        List list4 = c47720qs42.f105960h;
                        int size = list4.size();
                        for (int i = 0; i < size; i++) {
                            list.add((InterfaceC45532nB0) list4.get(i));
                        }
                        c47720qs42.f105960h.clear();
                        Unit unit2 = Unit.INSTANCE;
                    }
                    C44536lW1 c44536lW1 = new C44536lW1();
                    C44536lW1 c44536lW12 = new C44536lW1();
                    while (true) {
                        if (!(!list.isEmpty()) && !(!list2.isEmpty())) {
                            break;
                        }
                        try {
                            int size2 = list.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                InterfaceC45532nB0 interfaceC45532nB0 = list.get(i2);
                                c44536lW12.add(interfaceC45532nB0);
                                InterfaceC45532nB0 m16860f0 = c47720qs42.m16860f0(interfaceC45532nB0, c44536lW1);
                                if (m16860f0 != null) {
                                    list3.add(m16860f0);
                                }
                            }
                            list.clear();
                            if (c44536lW1.m27193h()) {
                                synchronized (c47720qs42.f105955c) {
                                    List list5 = c47720qs42.f105958f;
                                    int size3 = list5.size();
                                    for (int i3 = 0; i3 < size3; i3++) {
                                        InterfaceC45532nB0 interfaceC45532nB02 = (InterfaceC45532nB0) list5.get(i3);
                                        if (!c44536lW12.contains(interfaceC45532nB02) && interfaceC45532nB02.mo24224b(c44536lW1)) {
                                            list.add(interfaceC45532nB02);
                                        }
                                    }
                                    Unit unit3 = Unit.INSTANCE;
                                }
                            }
                            if (list.isEmpty()) {
                                try {
                                    C27726k.m16823i(list2, c47720qs42);
                                    while (!list2.isEmpty()) {
                                        CollectionsKt__MutableCollectionsKt.addAll(set, c47720qs42.m16862e0(list2, c44536lW1));
                                        C27726k.m16823i(list2, c47720qs42);
                                    }
                                } catch (Exception e) {
                                    C47720qs4.m16856h0(c47720qs42, e, null, true, 2, null);
                                    C27726k.m16824h(list, list2, list3, set, set2);
                                    return;
                                }
                            }
                        } catch (Exception e2) {
                            C47720qs4.m16856h0(c47720qs42, e2, null, true, 2, null);
                            C27726k.m16824h(list, list2, list3, set, set2);
                            list.clear();
                        }
                    }
                    if (!list3.isEmpty()) {
                        c47720qs42.f105953a = c47720qs42.m16873W() + 1;
                        try {
                            CollectionsKt__MutableCollectionsKt.addAll(set2, list3);
                            int size4 = list3.size();
                            for (int i4 = 0; i4 < size4; i4++) {
                                list3.get(i4).mo24214t();
                            }
                            list3.clear();
                        } catch (Exception e3) {
                            C47720qs4.m16856h0(c47720qs42, e3, null, false, 6, null);
                            C27726k.m16824h(list, list2, list3, set, set2);
                            list3.clear();
                            return;
                        }
                    }
                    if (!set.isEmpty()) {
                        try {
                            CollectionsKt__MutableCollectionsKt.addAll(set2, set);
                            for (InterfaceC45532nB0 interfaceC45532nB03 : set) {
                                interfaceC45532nB03.mo24221k();
                            }
                            set.clear();
                        } catch (Exception e4) {
                            C47720qs4.m16856h0(c47720qs42, e4, null, false, 6, null);
                            C27726k.m16824h(list, list2, list3, set, set2);
                            set.clear();
                            return;
                        }
                    }
                    if (!set2.isEmpty()) {
                        try {
                            for (InterfaceC45532nB0 interfaceC45532nB04 : set2) {
                                interfaceC45532nB04.mo24223d();
                            }
                            set2.clear();
                        } catch (Exception e5) {
                            C47720qs4.m16856h0(c47720qs42, e5, null, false, 6, null);
                            C27726k.m16824h(list, list2, list3, set, set2);
                            set2.clear();
                            return;
                        }
                    }
                    synchronized (c47720qs42.f105955c) {
                        c47720qs42.m16875U();
                    }
                    AbstractC48600sM5.f108670e.m14279c();
                    Unit unit4 = Unit.INSTANCE;
                } finally {
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                m16822a(l.longValue());
                return Unit.INSTANCE;
            }
        }

        public C27726k(Continuation<? super C27726k> continuation) {
            super(3, continuation);
        }

        /* renamed from: h */
        public static final void m16824h(List<InterfaceC45532nB0> list, List<C43351jW2> list2, List<InterfaceC45532nB0> list3, Set<InterfaceC45532nB0> set, Set<InterfaceC45532nB0> set2) {
            list.clear();
            list2.clear();
            list3.clear();
            set.clear();
            set2.clear();
        }

        /* renamed from: i */
        public static final void m16823i(List<C43351jW2> list, C47720qs4 c47720qs4) {
            list.clear();
            synchronized (c47720qs4.f105955c) {
                List list2 = c47720qs4.f105962j;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    list.add((C43351jW2) list2.get(i));
                }
                c47720qs4.f105962j.clear();
                Unit unit = Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: g */
        public final Object invoke(ZC0 zc0, IV2 iv2, Continuation<? super Unit> continuation) {
            C27726k c27726k = new C27726k(continuation);
            c27726k.f106010n = iv2;
            return c27726k.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r2v11, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r2v7, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r5v11, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r5v9, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r6v10, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r6v12, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r7v11, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r7v9, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r8v12, types: [java.util.List] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00c8 -> B:11:0x0086). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00f9 -> B:31:0x00fd). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            IV2 iv2;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            LinkedHashSet linkedHashSet;
            LinkedHashSet linkedHashSet2;
            C27726k c27726k;
            LinkedHashSet linkedHashSet3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            C27726k c27726k2;
            LinkedHashSet linkedHashSet4;
            Object obj2;
            int i;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f106009m;
            int i3 = 1;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ?? r8 = (List) this.f106004h;
                        IV2 iv22 = (IV2) this.f106010n;
                        ResultKt.throwOnFailure(obj);
                        c27726k = this;
                        arrayList4 = (List) this.f106006j;
                        char c = 2;
                        linkedHashSet2 = (Set) this.f106008l;
                        iv2 = iv22;
                        linkedHashSet = (Set) this.f106007k;
                        arrayList = r8;
                        ArrayList arrayList7 = (List) this.f106005i;
                        C47720qs4.this.m16874V();
                        arrayList2 = arrayList7;
                        arrayList3 = arrayList4;
                        i3 = 1;
                        if (!C47720qs4.this.m16868a0()) {
                            C47720qs4 c47720qs4 = C47720qs4.this;
                            c27726k.f106010n = iv2;
                            c27726k.f106004h = arrayList;
                            c27726k.f106005i = arrayList2;
                            c27726k.f106006j = arrayList3;
                            c27726k.f106007k = linkedHashSet;
                            c27726k.f106008l = linkedHashSet2;
                            c27726k.f106009m = i3;
                            if (c47720qs4.m16877S(c27726k) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            arrayList6 = arrayList;
                            arrayList5 = arrayList2;
                            arrayList4 = arrayList3;
                            linkedHashSet3 = linkedHashSet;
                            c27726k2 = c27726k;
                            linkedHashSet4 = linkedHashSet2;
                            obj2 = C47720qs4.this.f105955c;
                            C47720qs4 c47720qs42 = C47720qs4.this;
                            synchronized (obj2) {
                                i = 0;
                                if (!c47720qs42.m16871Y()) {
                                    c47720qs42.m16850k0();
                                    if (!c47720qs42.m16871Y()) {
                                        i = i3;
                                    }
                                }
                            }
                            if (i != 0) {
                                linkedHashSet2 = linkedHashSet4;
                                c27726k = c27726k2;
                                arrayList = arrayList6;
                                arrayList2 = arrayList5;
                                arrayList3 = arrayList4;
                                linkedHashSet = linkedHashSet3;
                                if (!C47720qs4.this.m16868a0()) {
                                    return Unit.INSTANCE;
                                }
                            } else {
                                LinkedHashSet linkedHashSet5 = linkedHashSet4;
                                C27726k c27726k3 = c27726k2;
                                C27727a c27727a = new C27727a(C47720qs4.this, arrayList6, arrayList5, linkedHashSet3, arrayList4, linkedHashSet5);
                                c27726k3.f106010n = iv2;
                                c27726k3.f106004h = arrayList6;
                                c27726k3.f106005i = arrayList5;
                                c27726k3.f106006j = arrayList4;
                                c27726k3.f106007k = linkedHashSet3;
                                linkedHashSet2 = linkedHashSet5;
                                c27726k3.f106008l = linkedHashSet2;
                                c = 2;
                                c27726k3.f106009m = 2;
                                if (iv2.mo40754m(c27727a, c27726k3) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                c27726k = c27726k3;
                                arrayList = arrayList6;
                                arrayList7 = arrayList5;
                                linkedHashSet = linkedHashSet3;
                                C47720qs4.this.m16874V();
                                arrayList2 = arrayList7;
                                arrayList3 = arrayList4;
                                i3 = 1;
                                if (!C47720qs4.this.m16868a0()) {
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    c27726k2 = this;
                    linkedHashSet4 = (Set) this.f106008l;
                    linkedHashSet3 = (Set) this.f106007k;
                    arrayList4 = (List) this.f106006j;
                    arrayList5 = (List) this.f106005i;
                    arrayList6 = (List) this.f106004h;
                    iv2 = (IV2) this.f106010n;
                    obj2 = C47720qs4.this.f105955c;
                    C47720qs4 c47720qs422 = C47720qs4.this;
                    synchronized (obj2) {
                    }
                }
            } else {
                ResultKt.throwOnFailure(obj);
                iv2 = (IV2) this.f106010n;
                arrayList = new ArrayList();
                arrayList2 = new ArrayList();
                arrayList3 = new ArrayList();
                linkedHashSet = new LinkedHashSet();
                linkedHashSet2 = new LinkedHashSet();
                c27726k = this;
                if (!C47720qs4.this.m16868a0()) {
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "value", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: qs4$l */
    /* loaded from: classes.dex */
    public static final class C27728l extends Lambda implements Function1<Object, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC45532nB0 f106018g;

        /* renamed from: h */
        public final /* synthetic */ C44536lW1<Object> f106019h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27728l(InterfaceC45532nB0 interfaceC45532nB0, C44536lW1<Object> c44536lW1) {
            super(1);
            this.f106018g = interfaceC45532nB0;
            this.f106019h = c44536lW1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Object value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f106018g.mo24212v(value);
            C44536lW1<Object> c44536lW1 = this.f106019h;
            if (c44536lW1 != null) {
                c44536lW1.add(value);
            }
        }
    }

    public C47720qs4(CoroutineContext effectCoroutineContext) {
        Intrinsics.checkNotNullParameter(effectCoroutineContext, "effectCoroutineContext");
        M20 m20 = new M20(new C27717e());
        this.f105954b = m20;
        this.f105955c = new Object();
        this.f105958f = new ArrayList();
        this.f105959g = new LinkedHashSet();
        this.f105960h = new ArrayList();
        this.f105961i = new ArrayList();
        this.f105962j = new ArrayList();
        this.f105963k = new LinkedHashMap();
        this.f105964l = new LinkedHashMap();
        this.f105970r = C50405vP5.m8742a(EnumC27716d.Inactive);
        InterfaceC45344ms0 m98511a = C34018Kh2.m98511a((InterfaceC52943zh2) effectCoroutineContext.get(InterfaceC52943zh2.f122077a0));
        m98511a.mo551n(new C27718f());
        this.f105971s = m98511a;
        this.f105972t = effectCoroutineContext.plus(m20).plus(m98511a);
        this.f105973u = new C27715c();
    }

    /* renamed from: d0 */
    public static final void m16863d0(List<C43351jW2> list, C47720qs4 c47720qs4, InterfaceC45532nB0 interfaceC45532nB0) {
        list.clear();
        synchronized (c47720qs4.f105955c) {
            Iterator<C43351jW2> it = c47720qs4.f105962j.iterator();
            while (it.hasNext()) {
                C43351jW2 next = it.next();
                if (Intrinsics.areEqual(next.m30396b(), interfaceC45532nB0)) {
                    list.add(next);
                    it.remove();
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: h0 */
    public static /* synthetic */ void m16856h0(C47720qs4 c47720qs4, Exception exc, InterfaceC45532nB0 interfaceC45532nB0, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC45532nB0 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        c47720qs4.m16858g0(exc, interfaceC45532nB0, z);
    }

    /* renamed from: R */
    public final void m16878R(CX2 cx2) {
        try {
            if (!(cx2.mo1850A() instanceof AbstractC49193tM5.C28681a)) {
                return;
            }
            throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
        } finally {
            cx2.mo1848d();
        }
    }

    /* renamed from: S */
    public final Object m16877S(Continuation<? super Unit> continuation) {
        Continuation intercepted;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        if (!m16870Z()) {
            intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
            C37013Xc0 c37013Xc0 = new C37013Xc0(intercepted, 1);
            c37013Xc0.m76766u();
            synchronized (this.f105955c) {
                if (m16870Z()) {
                    Result.Companion companion = Result.Companion;
                    c37013Xc0.resumeWith(Result.m116783constructorimpl(Unit.INSTANCE));
                } else {
                    this.f105966n = c37013Xc0;
                }
                Unit unit = Unit.INSTANCE;
            }
            Object m76770q = c37013Xc0.m76770q();
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (m76770q == coroutine_suspended) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (m76770q == coroutine_suspended2) {
                return m76770q;
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: T */
    public final void m16876T() {
        synchronized (this.f105955c) {
            if (this.f105970r.getValue().compareTo(EnumC27716d.Idle) >= 0) {
                this.f105970r.setValue(EnumC27716d.ShuttingDown);
            }
            Unit unit = Unit.INSTANCE;
        }
        InterfaceC52943zh2.C31478a.m550a(this.f105971s, null, 1, null);
    }

    /* renamed from: U */
    public final InterfaceC36779Wc0<Unit> m16875U() {
        EnumC27716d enumC27716d;
        if (this.f105970r.getValue().compareTo(EnumC27716d.ShuttingDown) <= 0) {
            this.f105958f.clear();
            this.f105959g = new LinkedHashSet();
            this.f105960h.clear();
            this.f105961i.clear();
            this.f105962j.clear();
            this.f105965m = null;
            InterfaceC36779Wc0<? super Unit> interfaceC36779Wc0 = this.f105966n;
            if (interfaceC36779Wc0 != null) {
                InterfaceC36779Wc0.C9110a.m78140a(interfaceC36779Wc0, null, 1, null);
            }
            this.f105966n = null;
            this.f105969q = null;
            return null;
        }
        if (this.f105969q != null) {
            enumC27716d = EnumC27716d.Inactive;
        } else if (this.f105956d == null) {
            this.f105959g = new LinkedHashSet();
            this.f105960h.clear();
            if (this.f105954b.m95992t()) {
                enumC27716d = EnumC27716d.InactivePendingWork;
            } else {
                enumC27716d = EnumC27716d.Inactive;
            }
        } else if (!(!this.f105960h.isEmpty()) && !(!this.f105959g.isEmpty()) && !(!this.f105961i.isEmpty()) && !(!this.f105962j.isEmpty()) && this.f105967o <= 0 && !this.f105954b.m95992t()) {
            enumC27716d = EnumC27716d.Idle;
        } else {
            enumC27716d = EnumC27716d.PendingWork;
        }
        this.f105970r.setValue(enumC27716d);
        if (enumC27716d != EnumC27716d.PendingWork) {
            return null;
        }
        InterfaceC36779Wc0 interfaceC36779Wc02 = this.f105966n;
        this.f105966n = null;
        return interfaceC36779Wc02;
    }

    /* renamed from: V */
    public final void m16874V() {
        int i;
        List emptyList;
        List flatten;
        synchronized (this.f105955c) {
            if (!this.f105963k.isEmpty()) {
                flatten = CollectionsKt__IterablesKt.flatten(this.f105963k.values());
                this.f105963k.clear();
                emptyList = new ArrayList(flatten.size());
                int size = flatten.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C43351jW2 c43351jW2 = (C43351jW2) flatten.get(i2);
                    emptyList.add(TuplesKt.m28425to(c43351jW2, this.f105964l.get(c43351jW2)));
                }
                this.f105964l.clear();
            } else {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
            }
        }
        int size2 = emptyList.size();
        for (i = 0; i < size2; i++) {
            Pair pair = (Pair) emptyList.get(i);
            C43351jW2 c43351jW22 = (C43351jW2) pair.component1();
            C42758iW2 c42758iW2 = (C42758iW2) pair.component2();
            if (c42758iW2 != null) {
                c43351jW22.m30396b().mo24219n(c42758iW2);
            }
        }
    }

    /* renamed from: W */
    public final long m16873W() {
        return this.f105953a;
    }

    /* renamed from: X */
    public final InterfaceC49220tP5<EnumC27716d> m16872X() {
        return this.f105970r;
    }

    /* renamed from: Y */
    public final boolean m16871Y() {
        return (this.f105960h.isEmpty() ^ true) || this.f105954b.m95992t();
    }

    /* renamed from: Z */
    public final boolean m16870Z() {
        boolean z;
        synchronized (this.f105955c) {
            z = true;
            if (!(!this.f105959g.isEmpty()) && !(!this.f105960h.isEmpty())) {
                if (!this.f105954b.m95992t()) {
                    z = false;
                }
            }
        }
        return z;
    }

    @Override // p000.AbstractC37400Yt0
    /* renamed from: a */
    public void mo16869a(InterfaceC45532nB0 composition, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        Intrinsics.checkNotNullParameter(content, "content");
        boolean mo24213u = composition.mo24213u();
        try {
            AbstractC48600sM5.C28290a c28290a = AbstractC48600sM5.f108670e;
            CX2 m14274h = c28290a.m14274h(m16854i0(composition), m16846n0(composition, null));
            AbstractC48600sM5 m14295k = m14274h.m14295k();
            composition.mo24222j(content);
            Unit unit = Unit.INSTANCE;
            m14274h.m14288r(m14295k);
            m16878R(m14274h);
            if (!mo24213u) {
                c28290a.m14279c();
            }
            synchronized (this.f105955c) {
                if (this.f105970r.getValue().compareTo(EnumC27716d.ShuttingDown) > 0 && !this.f105958f.contains(composition)) {
                    this.f105958f.add(composition);
                }
            }
            try {
                m16865c0(composition);
                try {
                    composition.mo24214t();
                    composition.mo24221k();
                    if (!mo24213u) {
                        c28290a.m14279c();
                    }
                } catch (Exception e) {
                    m16856h0(this, e, null, false, 6, null);
                }
            } catch (Exception e2) {
                m16858g0(e2, composition, true);
            }
        } catch (Exception e3) {
            m16858g0(e3, composition, true);
        }
    }

    /* renamed from: a0 */
    public final boolean m16868a0() {
        boolean z;
        boolean z2;
        synchronized (this.f105955c) {
            z = !this.f105968p;
        }
        if (z) {
            return true;
        }
        Iterator<InterfaceC52943zh2> it = this.f105971s.mo553d().iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().mo555b()) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (z2) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC37400Yt0
    /* renamed from: b */
    public void mo16867b(C43351jW2 reference) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        synchronized (this.f105955c) {
            C48313rs4.m15150a(this.f105963k, reference.m30395c(), reference);
        }
    }

    /* renamed from: b0 */
    public final Object m16866b0(Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m79247x = C36708Vu1.m79247x(m16872X(), new C27720g(null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m79247x == coroutine_suspended ? m79247x : Unit.INSTANCE;
    }

    /* renamed from: c0 */
    public final void m16865c0(InterfaceC45532nB0 interfaceC45532nB0) {
        synchronized (this.f105955c) {
            List<C43351jW2> list = this.f105962j;
            int size = list.size();
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (Intrinsics.areEqual(list.get(i).m30396b(), interfaceC45532nB0)) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                return;
            }
            Unit unit = Unit.INSTANCE;
            ArrayList arrayList = new ArrayList();
            m16863d0(arrayList, this, interfaceC45532nB0);
            while (!arrayList.isEmpty()) {
                m16862e0(arrayList, null);
                m16863d0(arrayList, this, interfaceC45532nB0);
            }
        }
    }

    @Override // p000.AbstractC37400Yt0
    /* renamed from: d */
    public boolean mo16864d() {
        return false;
    }

    /* renamed from: e0 */
    public final List<InterfaceC45532nB0> m16862e0(List<C43351jW2> list, C44536lW1<Object> c44536lW1) {
        List<InterfaceC45532nB0> list2;
        ArrayList arrayList;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C43351jW2 c43351jW2 = list.get(i);
            InterfaceC45532nB0 m30396b = c43351jW2.m30396b();
            Object obj = hashMap.get(m30396b);
            if (obj == null) {
                obj = new ArrayList();
                hashMap.put(m30396b, obj);
            }
            ((ArrayList) obj).add(c43351jW2);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            InterfaceC45532nB0 interfaceC45532nB0 = (InterfaceC45532nB0) entry.getKey();
            List list3 = (List) entry.getValue();
            C35528Qt0.m87818X(!interfaceC45532nB0.mo24213u());
            CX2 m14274h = AbstractC48600sM5.f108670e.m14274h(m16854i0(interfaceC45532nB0), m16846n0(interfaceC45532nB0, c44536lW1));
            try {
                AbstractC48600sM5 m14295k = m14274h.m14295k();
                synchronized (this.f105955c) {
                    arrayList = new ArrayList(list3.size());
                    int size2 = list3.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        C43351jW2 c43351jW22 = (C43351jW2) list3.get(i2);
                        arrayList.add(TuplesKt.m28425to(c43351jW22, C48313rs4.m15149b(this.f105963k, c43351jW22.m30395c())));
                    }
                }
                interfaceC45532nB0.mo24220l(arrayList);
                Unit unit = Unit.INSTANCE;
                m14274h.m14288r(m14295k);
            } finally {
                m16878R(m14274h);
            }
        }
        list2 = CollectionsKt___CollectionsKt.toList(hashMap.keySet());
        return list2;
    }

    @Override // p000.AbstractC37400Yt0
    /* renamed from: f */
    public int mo16861f() {
        return 1000;
    }

    /* renamed from: f0 */
    public final InterfaceC45532nB0 m16860f0(InterfaceC45532nB0 interfaceC45532nB0, C44536lW1<Object> c44536lW1) {
        if (interfaceC45532nB0.mo24213u() || interfaceC45532nB0.mo44877e()) {
            return null;
        }
        CX2 m14274h = AbstractC48600sM5.f108670e.m14274h(m16854i0(interfaceC45532nB0), m16846n0(interfaceC45532nB0, c44536lW1));
        try {
            AbstractC48600sM5 m14295k = m14274h.m14295k();
            boolean z = false;
            if (c44536lW1 != null && c44536lW1.m27193h()) {
                z = true;
            }
            if (z) {
                interfaceC45532nB0.mo24216q(new C27721h(c44536lW1, interfaceC45532nB0));
            }
            boolean mo24218o = interfaceC45532nB0.mo24218o();
            m14274h.m14288r(m14295k);
            if (!mo24218o) {
                return null;
            }
            return interfaceC45532nB0;
        } finally {
            m16878R(m14274h);
        }
    }

    @Override // p000.AbstractC37400Yt0
    /* renamed from: g */
    public CoroutineContext mo16859g() {
        return this.f105972t;
    }

    /* renamed from: g0 */
    public final void m16858g0(Exception exc, InterfaceC45532nB0 interfaceC45532nB0, boolean z) {
        Boolean bool = f105952y.get();
        Intrinsics.checkNotNullExpressionValue(bool, "_hotReloadEnabled.get()");
        if (bool.booleanValue() && !(exc instanceof ComposeRuntimeError)) {
            synchronized (this.f105955c) {
                C0030A6.m116099b("Error was captured in composition while live edit was enabled.", exc);
                this.f105961i.clear();
                this.f105960h.clear();
                this.f105959g = new LinkedHashSet();
                this.f105962j.clear();
                this.f105963k.clear();
                this.f105964l.clear();
                this.f105969q = new C27714b(z, exc);
                if (interfaceC45532nB0 != null) {
                    List list = this.f105965m;
                    if (list == null) {
                        list = new ArrayList();
                        this.f105965m = list;
                    }
                    if (!list.contains(interfaceC45532nB0)) {
                        list.add(interfaceC45532nB0);
                    }
                    this.f105958f.remove(interfaceC45532nB0);
                }
                m16875U();
            }
            return;
        }
        throw exc;
    }

    @Override // p000.AbstractC37400Yt0
    /* renamed from: h */
    public void mo16857h(C43351jW2 reference) {
        InterfaceC36779Wc0<Unit> m16875U;
        Intrinsics.checkNotNullParameter(reference, "reference");
        synchronized (this.f105955c) {
            this.f105962j.add(reference);
            m16875U = m16875U();
        }
        if (m16875U != null) {
            Result.Companion companion = Result.Companion;
            m16875U.resumeWith(Result.m116783constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // p000.AbstractC37400Yt0
    /* renamed from: i */
    public void mo16855i(InterfaceC45532nB0 composition) {
        InterfaceC36779Wc0<Unit> interfaceC36779Wc0;
        Intrinsics.checkNotNullParameter(composition, "composition");
        synchronized (this.f105955c) {
            if (!this.f105960h.contains(composition)) {
                this.f105960h.add(composition);
                interfaceC36779Wc0 = m16875U();
            } else {
                interfaceC36779Wc0 = null;
            }
        }
        if (interfaceC36779Wc0 != null) {
            Result.Companion companion = Result.Companion;
            interfaceC36779Wc0.resumeWith(Result.m116783constructorimpl(Unit.INSTANCE));
        }
    }

    /* renamed from: i0 */
    public final Function1<Object, Unit> m16854i0(InterfaceC45532nB0 interfaceC45532nB0) {
        return new C27722i(interfaceC45532nB0);
    }

    @Override // p000.AbstractC37400Yt0
    /* renamed from: j */
    public void mo16853j(C43351jW2 reference, C42758iW2 data) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(data, "data");
        synchronized (this.f105955c) {
            this.f105964l.put(reference, data);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: j0 */
    public final Object m16852j0(Function3<? super ZC0, ? super IV2, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m77504g = X30.m77504g(this.f105954b, new C27723j(function3, JV2.m100319a(continuation.getContext()), null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m77504g == coroutine_suspended) {
            return m77504g;
        }
        return Unit.INSTANCE;
    }

    @Override // p000.AbstractC37400Yt0
    /* renamed from: k */
    public C42758iW2 mo16851k(C43351jW2 reference) {
        C42758iW2 remove;
        Intrinsics.checkNotNullParameter(reference, "reference");
        synchronized (this.f105955c) {
            remove = this.f105964l.remove(reference);
        }
        return remove;
    }

    /* renamed from: k0 */
    public final void m16850k0() {
        Set<? extends Object> set = this.f105959g;
        if (!set.isEmpty()) {
            List<InterfaceC45532nB0> list = this.f105958f;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).mo24215s(set);
                if (this.f105970r.getValue().compareTo(EnumC27716d.ShuttingDown) <= 0) {
                    break;
                }
            }
            this.f105959g = new LinkedHashSet();
            if (m16875U() != null) {
                throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
            }
        }
    }

    @Override // p000.AbstractC37400Yt0
    /* renamed from: l */
    public void mo16849l(Set<InterfaceC38231au0> table) {
        Intrinsics.checkNotNullParameter(table, "table");
    }

    /* renamed from: l0 */
    public final void m16848l0(InterfaceC52943zh2 interfaceC52943zh2) {
        synchronized (this.f105955c) {
            Throwable th = this.f105957e;
            if (th == null) {
                if (this.f105970r.getValue().compareTo(EnumC27716d.ShuttingDown) > 0) {
                    if (this.f105956d == null) {
                        this.f105956d = interfaceC52943zh2;
                        m16875U();
                    } else {
                        throw new IllegalStateException("Recomposer already running".toString());
                    }
                } else {
                    throw new IllegalStateException("Recomposer shut down".toString());
                }
            } else {
                throw th;
            }
        }
    }

    /* renamed from: m0 */
    public final Object m16847m0(Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m16852j0 = m16852j0(new C27726k(null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m16852j0 == coroutine_suspended ? m16852j0 : Unit.INSTANCE;
    }

    /* renamed from: n0 */
    public final Function1<Object, Unit> m16846n0(InterfaceC45532nB0 interfaceC45532nB0, C44536lW1<Object> c44536lW1) {
        return new C27728l(interfaceC45532nB0, c44536lW1);
    }

    @Override // p000.AbstractC37400Yt0
    /* renamed from: p */
    public void mo16845p(InterfaceC45532nB0 composition) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        synchronized (this.f105955c) {
            this.f105958f.remove(composition);
            this.f105960h.remove(composition);
            this.f105961i.remove(composition);
            Unit unit = Unit.INSTANCE;
        }
    }
}
