package p000;

import androidx.compose.p003ui.input.pointer.PointerEventTimeoutCancellationException;
import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a9\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0088\u0001\u0010\u0017\u001a\u00020\u0005*\u00020\f2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f26\u0010\u0006\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00050\u0012H\u0086@ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0088\u0001\u0010\u0019\u001a\u00020\u0005*\u00020\f2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f26\u0010\u0006\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00050\u0012H\u0086@ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0018\u001a\f\u0010\u001c\u001a\u00020\u001b*\u00020\u001aH\u0000\u001a'\u0010\u001d\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u000b\u001a!\u0010\u001f\u001a\u00020\u0007*\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001a!\u0010%\u001a\u00020$*\u00020!2\u0006\u0010#\u001a\u00020\"H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\"\u001a\u0010+\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u001a\u0010-\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b,\u0010*\"\u0017\u00100\u001a\u00020.8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001d\u0010/\"\u0017\u00101\u001a\u00020.8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0017\u0010/\"\u0014\u00102\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010/\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00063"}, m28432d2 = {"LWu;", "LiX3;", "pointerId", "Lkotlin/Function1;", "LjX3;", "", "onDrag", "", "f", "(LWu;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "(LWu;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LtX3;", "LCe3;", "onDragStart", "Lkotlin/Function0;", "onDragEnd", "onDragCancel", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "change", "dragAmount", DateTokenConverter.CONVERTER_KEY, "(LtX3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "LEy3;", "LXW3;", "j", "c", "LYW3;", "h", "(LYW3;J)Z", "LJq6;", "LyX3;", "pointerType", "", "i", "(LJq6;I)F", C17296a.f69688o, "LXW3;", "g", "()LXW3;", "HorizontalPointerDirectionConfig", "getVerticalPointerDirectionConfig", "VerticalPointerDirectionConfig", "Lk61;", "F", "mouseSlop", "defaultTouchSlop", "mouseToTouchSlopRatio", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,873:1\n665#1,11:874\n676#1,4:894\n680#1,58:905\n615#1,4:963\n619#1,2:976\n621#1,8:985\n658#1,18:993\n676#1,4:1020\n680#1,58:1031\n658#1,18:1089\n676#1,4:1116\n680#1,58:1127\n581#1,6:1185\n615#1,4:1191\n619#1,2:1204\n621#1,8:1213\n588#1,10:1221\n615#1,4:1231\n619#1,2:1244\n621#1,8:1253\n658#1,18:1261\n676#1,4:1288\n680#1,58:1299\n658#1,18:1357\n676#1,4:1384\n680#1,58:1395\n581#1,6:1453\n615#1,4:1459\n619#1,2:1472\n621#1,8:1481\n588#1,10:1489\n615#1,4:1499\n619#1,2:1512\n621#1,8:1521\n615#1,4:1529\n619#1,2:1542\n621#1,8:1551\n615#1,4:1559\n619#1,2:1572\n621#1,8:1581\n116#2,2:885\n33#2,6:887\n118#2:893\n33#2,6:898\n118#2:904\n116#2,2:967\n33#2,6:969\n118#2:975\n33#2,6:978\n118#2:984\n116#2,2:1011\n33#2,6:1013\n118#2:1019\n33#2,6:1024\n118#2:1030\n116#2,2:1107\n33#2,6:1109\n118#2:1115\n33#2,6:1120\n118#2:1126\n116#2,2:1195\n33#2,6:1197\n118#2:1203\n33#2,6:1206\n118#2:1212\n116#2,2:1235\n33#2,6:1237\n118#2:1243\n33#2,6:1246\n118#2:1252\n116#2,2:1279\n33#2,6:1281\n118#2:1287\n33#2,6:1292\n118#2:1298\n116#2,2:1375\n33#2,6:1377\n118#2:1383\n33#2,6:1388\n118#2:1394\n116#2,2:1463\n33#2,6:1465\n118#2:1471\n33#2,6:1474\n118#2:1480\n116#2,2:1503\n33#2,6:1505\n118#2:1511\n33#2,6:1514\n118#2:1520\n116#2,2:1533\n33#2,6:1535\n118#2:1541\n33#2,6:1544\n118#2:1550\n116#2,2:1563\n33#2,6:1565\n118#2:1571\n33#2,6:1574\n118#2:1580\n116#2,2:1589\n33#2,6:1591\n118#2:1597\n116#2,2:1598\n33#2,6:1600\n118#2:1606\n116#2,2:1607\n33#2,6:1609\n118#2:1615\n116#2,2:1616\n33#2,6:1618\n118#2:1624\n116#2,2:1625\n33#2,6:1627\n118#2:1633\n116#2,2:1634\n33#2,6:1636\n118#2:1642\n116#2,2:1643\n33#2,6:1645\n118#2:1651\n116#2,2:1652\n33#2,6:1654\n118#2:1660\n116#2,2:1661\n33#2,6:1663\n118#2:1669\n116#2,2:1670\n33#2,6:1672\n118#2:1678\n164#3:1679\n154#3:1680\n81#4:1681\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n*L\n78#1:874,11\n78#1:894,4\n78#1:905,58\n143#1:963,4\n143#1:976,2\n143#1:985,8\n288#1:993,18\n288#1:1020,4\n288#1:1031,58\n299#1:1089,18\n299#1:1116,4\n299#1:1127,58\n325#1:1185,6\n325#1:1191,4\n325#1:1204,2\n325#1:1213,8\n325#1:1221,10\n355#1:1231,4\n355#1:1244,2\n355#1:1253,8\n439#1:1261,18\n439#1:1288,4\n439#1:1299,58\n450#1:1357,18\n450#1:1384,4\n450#1:1395,58\n473#1:1453,6\n473#1:1459,4\n473#1:1472,2\n473#1:1481,8\n473#1:1489,10\n503#1:1499,4\n503#1:1512,2\n503#1:1521,8\n586#1:1529,4\n586#1:1542,2\n586#1:1551,8\n586#1:1559,4\n586#1:1572,2\n586#1:1581,8\n78#1:885,2\n78#1:887,6\n78#1:893\n78#1:898,6\n78#1:904\n143#1:967,2\n143#1:969,6\n143#1:975\n143#1:978,6\n143#1:984\n288#1:1011,2\n288#1:1013,6\n288#1:1019\n288#1:1024,6\n288#1:1030\n299#1:1107,2\n299#1:1109,6\n299#1:1115\n299#1:1120,6\n299#1:1126\n325#1:1195,2\n325#1:1197,6\n325#1:1203\n325#1:1206,6\n325#1:1212\n355#1:1235,2\n355#1:1237,6\n355#1:1243\n355#1:1246,6\n355#1:1252\n439#1:1279,2\n439#1:1281,6\n439#1:1287\n439#1:1292,6\n439#1:1298\n450#1:1375,2\n450#1:1377,6\n450#1:1383\n450#1:1388,6\n450#1:1394\n473#1:1463,2\n473#1:1465,6\n473#1:1471\n473#1:1474,6\n473#1:1480\n503#1:1503,2\n503#1:1505,6\n503#1:1511\n503#1:1514,6\n503#1:1520\n586#1:1533,2\n586#1:1535,6\n586#1:1541\n586#1:1544,6\n586#1:1550\n586#1:1563,2\n586#1:1565,6\n586#1:1571\n586#1:1574,6\n586#1:1580\n618#1:1589,2\n618#1:1591,6\n618#1:1597\n620#1:1598,2\n620#1:1600,6\n620#1:1606\n675#1:1607,2\n675#1:1609,6\n675#1:1615\n679#1:1616,2\n679#1:1618,6\n679#1:1624\n675#1:1625,2\n675#1:1627,6\n675#1:1633\n679#1:1634,2\n679#1:1636,6\n679#1:1642\n675#1:1643,2\n675#1:1645,6\n675#1:1651\n679#1:1652,2\n679#1:1654,6\n679#1:1660\n801#1:1661,2\n801#1:1663,6\n801#1:1669\n854#1:1670,2\n854#1:1672,6\n854#1:1678\n860#1:1679\n861#1:1680\n862#1:1681\n*E\n"})
/* renamed from: q61 */
/* loaded from: classes.dex */
public final class C47263q61 {

    /* renamed from: a */
    public static final XW3 f104654a = new C27490a();

    /* renamed from: b */
    public static final XW3 f104655b = new C27491b();

    /* renamed from: c */
    public static final float f104656c;

    /* renamed from: d */
    public static final float f104657d;

    /* renamed from: e */
    public static final float f104658e;

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\u0006J(\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\f"}, m28432d2 = {"q61$a", "LXW3;", "LCe3;", "offset", "", C17296a.f69688o, "(J)F", "c", "mainChange", "crossChange", "b", "(FF)J", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: q61$a */
    /* loaded from: classes.dex */
    public static final class C27490a implements XW3 {
        @Override // p000.XW3
        /* renamed from: a */
        public float mo18176a(long j) {
            return C32120Ce3.m111944o(j);
        }

        @Override // p000.XW3
        /* renamed from: b */
        public long mo18175b(float f, float f2) {
            return C33056Ge3.m104938a(f, f2);
        }

        @Override // p000.XW3
        /* renamed from: c */
        public float mo18174c(long j) {
            return C32120Ce3.m111943p(j);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\u0006J(\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\f"}, m28432d2 = {"q61$b", "LXW3;", "LCe3;", "offset", "", C17296a.f69688o, "(J)F", "c", "mainChange", "crossChange", "b", "(FF)J", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: q61$b */
    /* loaded from: classes.dex */
    public static final class C27491b implements XW3 {
        @Override // p000.XW3
        /* renamed from: a */
        public float mo18176a(long j) {
            return C32120Ce3.m111943p(j);
        }

        @Override // p000.XW3
        /* renamed from: b */
        public long mo18175b(float f, float f2) {
            return C33056Ge3.m104938a(f2, f);
        }

        @Override // p000.XW3
        /* renamed from: c */
        public float mo18174c(long j) {
            return C32120Ce3.m111944o(j);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m28418f = "DragGestureDetector.kt", m28417i = {0, 0}, m28416l = {876}, m28415m = "awaitDragOrCancellation-rnUCldI", m28414n = {"$this$awaitDragOrUp_u2djO51t88$iv", "pointer$iv"}, m28413s = {"L$0", "L$1"})
    /* renamed from: q61$c */
    /* loaded from: classes.dex */
    public static final class C27492c extends ContinuationImpl {

        /* renamed from: h */
        public Object f104659h;

        /* renamed from: i */
        public Object f104660i;

        /* renamed from: j */
        public /* synthetic */ Object f104661j;

        /* renamed from: k */
        public int f104662k;

        public C27492c(Continuation<? super C27492c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f104661j = obj;
            this.f104662k |= Integer.MIN_VALUE;
            return C47263q61.m18185b(null, 0L, this);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m28418f = "DragGestureDetector.kt", m28417i = {0, 0}, m28416l = {808}, m28415m = "awaitLongPressOrCancellation-rnUCldI", m28414n = {"initialDown", "longPress"}, m28413s = {"L$0", "L$1"})
    /* renamed from: q61$d */
    /* loaded from: classes.dex */
    public static final class C27493d extends ContinuationImpl {

        /* renamed from: h */
        public Object f104663h;

        /* renamed from: i */
        public Object f104664i;

        /* renamed from: j */
        public /* synthetic */ Object f104665j;

        /* renamed from: k */
        public int f104666k;

        public C27493d(Continuation<? super C27493d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f104665j = obj;
            this.f104666k |= Integer.MIN_VALUE;
            return C47263q61.m18184c(null, 0L, this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LWu;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", m28418f = "DragGestureDetector.kt", m28417i = {0, 0, 1, 1, 1}, m28416l = {811, 828}, m28415m = "invokeSuspend", m28414n = {"$this$withTimeout", "finished", "$this$withTimeout", "event", "finished"}, m28413s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
    @SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,873:1\n86#2,2:874\n33#2,6:876\n88#2:882\n101#2,2:883\n33#2,6:885\n103#2:891\n101#2,2:892\n33#2,6:894\n103#2:900\n116#2,2:901\n33#2,6:903\n118#2:909\n116#2,2:910\n33#2,6:912\n118#2:918\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$2\n*L\n812#1:874,2\n812#1:876,6\n812#1:882\n818#1:883,2\n818#1:885,6\n818#1:891\n829#1:892,2\n829#1:894,6\n829#1:900\n833#1:901,2\n833#1:903,6\n833#1:909\n843#1:910,2\n843#1:912,6\n843#1:918\n*E\n"})
    /* renamed from: q61$e */
    /* loaded from: classes.dex */
    public static final class C27494e extends RestrictedSuspendLambda implements Function2<InterfaceC9204Wu, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public Object f104667h;

        /* renamed from: i */
        public int f104668i;

        /* renamed from: j */
        public int f104669j;

        /* renamed from: k */
        public /* synthetic */ Object f104670k;

        /* renamed from: l */
        public final /* synthetic */ Ref.ObjectRef<C43361jX3> f104671l;

        /* renamed from: m */
        public final /* synthetic */ Ref.ObjectRef<C43361jX3> f104672m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27494e(Ref.ObjectRef<C43361jX3> objectRef, Ref.ObjectRef<C43361jX3> objectRef2, Continuation<? super C27494e> continuation) {
            super(2, continuation);
            this.f104671l = objectRef;
            this.f104672m = objectRef2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C27494e c27494e = new C27494e(this.f104671l, this.f104672m, continuation);
            c27494e.f104670k = obj;
            return c27494e;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(InterfaceC9204Wu interfaceC9204Wu, Continuation<? super Unit> continuation) {
            return ((C27494e) create(interfaceC9204Wu, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:100:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x00c2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:131:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x00f7  */
        /* JADX WARN: Removed duplicated region for block: B:154:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:164:0x015f  */
        /* JADX WARN: Removed duplicated region for block: B:166:0x00e3 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:171:0x0079 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:172:0x00ae A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r10v10, types: [jX3, T] */
        /* JADX WARN: Type inference failed for: r12v6 */
        /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:131:0x00c3 -> B:132:0x00c5). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            C27494e c27494e;
            InterfaceC9204Wu interfaceC9204Wu;
            int i;
            Object obj2;
            InterfaceC9204Wu interfaceC9204Wu2;
            C27494e c27494e2;
            int size;
            int i2;
            int i3;
            int size2;
            int i4;
            int i5;
            Object mo3401r0;
            int i6;
            int i7;
            T t;
            C43361jX3 c43361jX3;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i8 = this.f104669j;
            Object obj3 = null;
            int i9 = 1;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        i = this.f104668i;
                        YW3 yw3 = (YW3) this.f104667h;
                        interfaceC9204Wu2 = (InterfaceC9204Wu) this.f104670k;
                        ResultKt.throwOnFailure(obj);
                        mo3401r0 = obj;
                        C27494e c27494e3 = this;
                        List<C43361jX3> m74945c = ((YW3) mo3401r0).m74945c();
                        int size3 = m74945c.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size3) {
                                if (m74945c.get(i10).m30351n()) {
                                    i7 = i9;
                                    break;
                                }
                                i10++;
                            } else {
                                i7 = 0;
                                break;
                            }
                        }
                        if (i7 != 0) {
                            i = i9;
                        }
                        if (!C47263q61.m18179h(yw3, c27494e3.f104671l.element.m30360e())) {
                            List<C43361jX3> m74945c2 = yw3.m74945c();
                            int size4 = m74945c2.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 < size4) {
                                    c43361jX3 = m74945c2.get(i11);
                                    if (c43361jX3.m30358g()) {
                                        break;
                                    }
                                    i11++;
                                } else {
                                    c43361jX3 = null;
                                    break;
                                }
                            }
                            C43361jX3 c43361jX32 = c43361jX3;
                            if (c43361jX32 != 0) {
                                c27494e3.f104671l.element = c43361jX32;
                                c27494e3.f104672m.element = c43361jX32;
                            } else {
                                i = i9;
                                interfaceC9204Wu = interfaceC9204Wu2;
                                obj3 = null;
                                c27494e = c27494e3;
                                if (i == 0) {
                                    EnumC38007aX3 enumC38007aX3 = EnumC38007aX3.Main;
                                    c27494e.f104670k = interfaceC9204Wu;
                                    c27494e.f104667h = obj3;
                                    c27494e.f104668i = i;
                                    c27494e.f104669j = i9;
                                    obj2 = interfaceC9204Wu.mo3401r0(enumC38007aX3, c27494e);
                                    if (obj2 == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    C27494e c27494e4 = c27494e;
                                    interfaceC9204Wu2 = interfaceC9204Wu;
                                    c27494e2 = c27494e4;
                                    YW3 yw32 = (YW3) obj2;
                                    List<C43361jX3> m74945c3 = yw32.m74945c();
                                    size = m74945c3.size();
                                    i2 = 0;
                                    while (true) {
                                        if (i2 < size) {
                                            if (!ZW3.m72995d(m74945c3.get(i2))) {
                                                i3 = 0;
                                                break;
                                            }
                                            i2++;
                                        } else {
                                            i3 = i9;
                                            break;
                                        }
                                    }
                                    if (i3 != 0) {
                                        i = i9;
                                    }
                                    List<C43361jX3> m74945c4 = yw32.m74945c();
                                    size2 = m74945c4.size();
                                    i4 = 0;
                                    while (true) {
                                        if (i4 >= size2) {
                                            C43361jX3 c43361jX33 = m74945c4.get(i4);
                                            if (!c43361jX33.m30351n() && !ZW3.m72993f(c43361jX33, interfaceC9204Wu2.mo3409a(), interfaceC9204Wu2.mo3417C0())) {
                                                i6 = 0;
                                            } else {
                                                i6 = i9;
                                            }
                                            if (i6 != 0) {
                                                i5 = i9;
                                                break;
                                            }
                                            i4++;
                                        } else {
                                            i5 = 0;
                                            break;
                                        }
                                    }
                                    if (i5 != 0) {
                                        i = i9;
                                    }
                                    EnumC38007aX3 enumC38007aX32 = EnumC38007aX3.Final;
                                    c27494e2.f104670k = interfaceC9204Wu2;
                                    c27494e2.f104667h = yw32;
                                    c27494e2.f104668i = i;
                                    c27494e2.f104669j = 2;
                                    mo3401r0 = interfaceC9204Wu2.mo3401r0(enumC38007aX32, c27494e2);
                                    if (mo3401r0 != coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    c27494e3 = c27494e2;
                                    yw3 = yw32;
                                    List<C43361jX3> m74945c5 = ((YW3) mo3401r0).m74945c();
                                    int size32 = m74945c5.size();
                                    int i102 = 0;
                                    while (true) {
                                        if (i102 < size32) {
                                        }
                                        i102++;
                                    }
                                    if (i7 != 0) {
                                    }
                                    if (!C47263q61.m18179h(yw3, c27494e3.f104671l.element.m30360e())) {
                                        Ref.ObjectRef<C43361jX3> objectRef = c27494e3.f104672m;
                                        List<C43361jX3> m74945c6 = yw3.m74945c();
                                        Ref.ObjectRef<C43361jX3> objectRef2 = c27494e3.f104671l;
                                        int size5 = m74945c6.size();
                                        int i12 = 0;
                                        while (true) {
                                            if (i12 < size5) {
                                                t = m74945c6.get(i12);
                                                List<C43361jX3> list = m74945c6;
                                                if (C42768iX3.m33834d(((C43361jX3) t).m30360e(), objectRef2.element.m30360e())) {
                                                    break;
                                                }
                                                i12++;
                                                m74945c6 = list;
                                            } else {
                                                t = 0;
                                                break;
                                            }
                                        }
                                        objectRef.element = t;
                                    }
                                } else {
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                        interfaceC9204Wu = interfaceC9204Wu2;
                        obj3 = null;
                        i9 = 1;
                        c27494e = c27494e3;
                        if (i == 0) {
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    i = this.f104668i;
                    ResultKt.throwOnFailure(obj);
                    obj2 = obj;
                    interfaceC9204Wu2 = (InterfaceC9204Wu) this.f104670k;
                    c27494e2 = this;
                    YW3 yw322 = (YW3) obj2;
                    List<C43361jX3> m74945c32 = yw322.m74945c();
                    size = m74945c32.size();
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                        }
                        i2++;
                    }
                    if (i3 != 0) {
                    }
                    List<C43361jX3> m74945c42 = yw322.m74945c();
                    size2 = m74945c42.size();
                    i4 = 0;
                    while (true) {
                        if (i4 >= size2) {
                        }
                        i4++;
                    }
                    if (i5 != 0) {
                    }
                    EnumC38007aX3 enumC38007aX322 = EnumC38007aX3.Final;
                    c27494e2.f104670k = interfaceC9204Wu2;
                    c27494e2.f104667h = yw322;
                    c27494e2.f104668i = i;
                    c27494e2.f104669j = 2;
                    mo3401r0 = interfaceC9204Wu2.mo3401r0(enumC38007aX322, c27494e2);
                    if (mo3401r0 != coroutine_suspended) {
                    }
                }
            } else {
                ResultKt.throwOnFailure(obj);
                c27494e = this;
                interfaceC9204Wu = (InterfaceC9204Wu) this.f104670k;
                i = 0;
                if (i == 0) {
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LWu;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5", m28418f = "DragGestureDetector.kt", m28417i = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, m28416l = {SyslogConstants.LOG_LOCAL6, 890, 940, 193}, m28415m = "invokeSuspend", m28414n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down", "overSlop", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU_u24default$iv", "pointerDirectionConfig$iv", "pointer$iv", "triggerOnMainAxisSlop$iv", "touchSlop$iv", "totalMainPositionChange$iv", "totalCrossPositionChange$iv", "$this$awaitEachGesture", "down", "overSlop", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU_u24default$iv", "pointerDirectionConfig$iv", "pointer$iv", "dragEvent$iv", "triggerOnMainAxisSlop$iv", "touchSlop$iv", "totalMainPositionChange$iv", "totalCrossPositionChange$iv"}, m28413s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "F$0", "F$1", "F$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "F$0", "F$1", "F$2"})
    @SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5\n+ 2 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,873:1\n658#2,18:874\n676#2,4:901\n680#2,58:912\n116#3,2:892\n33#3,6:894\n118#3:900\n33#3,6:905\n118#3:911\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5\n*L\n180#1:874,18\n180#1:901,4\n180#1:912,58\n180#1:892,2\n180#1:894,6\n180#1:900\n180#1:905,6\n180#1:911\n*E\n"})
    /* renamed from: q61$f */
    /* loaded from: classes.dex */
    public static final class C27495f extends RestrictedSuspendLambda implements Function2<InterfaceC9204Wu, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public Object f104673h;

        /* renamed from: i */
        public Object f104674i;

        /* renamed from: j */
        public Object f104675j;

        /* renamed from: k */
        public Object f104676k;

        /* renamed from: l */
        public Object f104677l;

        /* renamed from: m */
        public Object f104678m;

        /* renamed from: n */
        public int f104679n;

        /* renamed from: o */
        public float f104680o;

        /* renamed from: p */
        public float f104681p;

        /* renamed from: q */
        public float f104682q;

        /* renamed from: r */
        public int f104683r;

        /* renamed from: s */
        public /* synthetic */ Object f104684s;

        /* renamed from: t */
        public final /* synthetic */ Function1<C32120Ce3, Unit> f104685t;

        /* renamed from: u */
        public final /* synthetic */ Function2<C43361jX3, C32120Ce3, Unit> f104686u;

        /* renamed from: v */
        public final /* synthetic */ Function0<Unit> f104687v;

        /* renamed from: w */
        public final /* synthetic */ Function0<Unit> f104688w;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LjX3;", "it", "", C17296a.f69688o, "(LjX3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: q61$f$a */
        /* loaded from: classes.dex */
        public static final class C27496a extends Lambda implements Function1<C43361jX3, Unit> {

            /* renamed from: g */
            public final /* synthetic */ Function2<C43361jX3, C32120Ce3, Unit> f104689g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C27496a(Function2<? super C43361jX3, ? super C32120Ce3, Unit> function2) {
                super(1);
                this.f104689g = function2;
            }

            /* renamed from: a */
            public final void m18171a(C43361jX3 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.f104689g.invoke(it, C32120Ce3.m111955d(ZW3.m72992g(it)));
                it.m30364a();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C43361jX3 c43361jX3) {
                m18171a(c43361jX3);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C27495f(Function1<? super C32120Ce3, Unit> function1, Function2<? super C43361jX3, ? super C32120Ce3, Unit> function2, Function0<Unit> function0, Function0<Unit> function02, Continuation<? super C27495f> continuation) {
            super(2, continuation);
            this.f104685t = function1;
            this.f104686u = function2;
            this.f104687v = function0;
            this.f104688w = function02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C27495f c27495f = new C27495f(this.f104685t, this.f104686u, this.f104687v, this.f104688w, continuation);
            c27495f.f104684s = obj;
            return c27495f;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(InterfaceC9204Wu interfaceC9204Wu, Continuation<? super Unit> continuation) {
            return ((C27495f) create(interfaceC9204Wu, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:114:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x0114 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:121:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x015d  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x016a  */
        /* JADX WARN: Removed duplicated region for block: B:146:0x019d  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x01ff  */
        /* JADX WARN: Removed duplicated region for block: B:160:0x0204  */
        /* JADX WARN: Removed duplicated region for block: B:169:0x0246  */
        /* JADX WARN: Removed duplicated region for block: B:174:0x0256  */
        /* JADX WARN: Removed duplicated region for block: B:179:0x029a  */
        /* JADX WARN: Removed duplicated region for block: B:180:0x02a0  */
        /* JADX WARN: Removed duplicated region for block: B:184:0x014a A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x00dc -> B:168:0x0244). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x0156 -> B:159:0x0202). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:145:0x0198 -> B:116:0x00f6). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:155:0x01f3 -> B:156:0x01f9). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:167:0x023f -> B:168:0x0244). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            InterfaceC9204Wu interfaceC9204Wu;
            Object m98773e;
            C43361jX3 c43361jX3;
            Ref.LongRef longRef;
            C27495f c27495f;
            int i;
            Ref.LongRef longRef2;
            XW3 xw3;
            Object obj2;
            InterfaceC9204Wu interfaceC9204Wu2;
            float f;
            C27495f c27495f2;
            float f2;
            Ref.LongRef longRef3;
            float f3;
            List<C43361jX3> m74945c;
            int size;
            int i2;
            Object obj3;
            InterfaceC9204Wu interfaceC9204Wu3;
            C43361jX3 c43361jX32;
            C43361jX3 c43361jX33;
            float m111946m;
            C43361jX3 c43361jX34;
            XW3 xw32;
            long m111940s;
            C43361jX3 c43361jX35;
            List<C43361jX3> list;
            int i3;
            long m30360e;
            Object m18181f;
            C27495f c27495f3 = this;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = c27495f3.f104683r;
            int i5 = 2;
            int i6 = 1;
            C43361jX3 c43361jX36 = null;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 4) {
                                ResultKt.throwOnFailure(obj);
                                m18181f = obj;
                                c27495f = c27495f3;
                                if (((Boolean) m18181f).booleanValue()) {
                                    c27495f.f104687v.invoke();
                                } else {
                                    c27495f.f104688w.invoke();
                                }
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        float f4 = c27495f3.f104682q;
                        float f5 = c27495f3.f104681p;
                        float f6 = c27495f3.f104680o;
                        int i7 = c27495f3.f104679n;
                        C43361jX3 c43361jX37 = (C43361jX3) c27495f3.f104678m;
                        Ref.LongRef longRef4 = (Ref.LongRef) c27495f3.f104677l;
                        interfaceC9204Wu2 = (InterfaceC9204Wu) c27495f3.f104684s;
                        ResultKt.throwOnFailure(obj);
                        f3 = f4;
                        c43361jX3 = (C43361jX3) c27495f3.f104673h;
                        interfaceC9204Wu = (InterfaceC9204Wu) c27495f3.f104675j;
                        xw3 = (XW3) c27495f3.f104676k;
                        i = i7;
                        f2 = f5;
                        f = f6;
                        longRef3 = (Ref.LongRef) c27495f3.f104674i;
                        longRef2 = longRef4;
                        if (!c43361jX37.m30351n()) {
                            longRef = longRef3;
                            c27495f = c27495f3;
                            interfaceC9204Wu = interfaceC9204Wu2;
                            c43361jX33 = null;
                            if (c43361jX33 == null && !c43361jX33.m30351n()) {
                                i5 = 2;
                                i6 = 1;
                                c43361jX36 = null;
                                m30360e = c43361jX3.m30360e();
                                int m30353l = c43361jX3.m30353l();
                                XW3 m18180g = C47263q61.m18180g();
                                if (!C47263q61.m18179h(interfaceC9204Wu.mo3414M0(), m30360e)) {
                                    c43361jX33 = c43361jX36;
                                    if (c43361jX33 == null) {
                                    }
                                    if (c43361jX33 != null) {
                                    }
                                    return Unit.INSTANCE;
                                }
                                f = C47263q61.m18178i(interfaceC9204Wu.mo3400s(), m30353l);
                                Ref.LongRef longRef5 = new Ref.LongRef();
                                longRef5.element = m30360e;
                                c27495f2 = c27495f;
                                longRef2 = longRef5;
                                f2 = 0.0f;
                                i = 0;
                                longRef3 = longRef;
                                xw3 = m18180g;
                                f3 = 0.0f;
                                interfaceC9204Wu2 = interfaceC9204Wu;
                                EnumC38007aX3 enumC38007aX3 = c43361jX36;
                                c27495f2.f104684s = interfaceC9204Wu2;
                                c27495f2.f104673h = c43361jX3;
                                c27495f2.f104674i = longRef3;
                                c27495f2.f104675j = interfaceC9204Wu;
                                c27495f2.f104676k = xw3;
                                c27495f2.f104677l = longRef2;
                                c27495f2.f104678m = enumC38007aX3;
                                c27495f2.f104679n = i;
                                c27495f2.f104680o = f;
                                c27495f2.f104681p = f2;
                                c27495f2.f104682q = f3;
                                c27495f2.f104683r = i5;
                                obj2 = InterfaceC9204Wu.m77725U(interfaceC9204Wu, enumC38007aX3, c27495f2, i6, enumC38007aX3);
                                if (obj2 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                YW3 yw3 = (YW3) obj2;
                                m74945c = yw3.m74945c();
                                size = m74945c.size();
                                i2 = 0;
                                while (true) {
                                    if (i2 >= size) {
                                        c43361jX32 = m74945c.get(i2);
                                        list = m74945c;
                                        i3 = size;
                                        obj3 = coroutine_suspended;
                                        interfaceC9204Wu3 = interfaceC9204Wu;
                                        if (C42768iX3.m33834d(c43361jX32.m30360e(), longRef2.element)) {
                                            break;
                                        }
                                        i2++;
                                        m74945c = list;
                                        coroutine_suspended = obj3;
                                        size = i3;
                                        interfaceC9204Wu = interfaceC9204Wu3;
                                    } else {
                                        obj3 = coroutine_suspended;
                                        interfaceC9204Wu3 = interfaceC9204Wu;
                                        c43361jX32 = null;
                                        break;
                                    }
                                }
                                c43361jX33 = c43361jX32;
                                if (c43361jX33 != null && !c43361jX33.m30351n()) {
                                    if (!ZW3.m72995d(c43361jX33)) {
                                        List<C43361jX3> m74945c2 = yw3.m74945c();
                                        int size2 = m74945c2.size();
                                        int i8 = 0;
                                        while (true) {
                                            if (i8 < size2) {
                                                c43361jX35 = m74945c2.get(i8);
                                                if (c43361jX35.m30358g()) {
                                                    break;
                                                }
                                                i8++;
                                            } else {
                                                c43361jX35 = null;
                                                break;
                                            }
                                        }
                                        C43361jX3 c43361jX38 = c43361jX35;
                                        if (c43361jX38 != null) {
                                            longRef2.element = c43361jX38.m30360e();
                                            coroutine_suspended = obj3;
                                            interfaceC9204Wu = interfaceC9204Wu3;
                                        }
                                    } else {
                                        long m30359f = c43361jX33.m30359f();
                                        long m30356i = c43361jX33.m30356i();
                                        f2 += xw3.mo18176a(m30359f) - xw3.mo18176a(m30356i);
                                        f3 += xw3.mo18174c(m30359f) - xw3.mo18174c(m30356i);
                                        if (i != 0) {
                                            m111946m = Math.abs(f2);
                                        } else {
                                            m111946m = C32120Ce3.m111946m(xw3.mo18175b(f2, f3));
                                        }
                                        if (m111946m < f) {
                                            EnumC38007aX3 enumC38007aX32 = EnumC38007aX3.Final;
                                            c27495f2.f104684s = interfaceC9204Wu2;
                                            c27495f2.f104673h = c43361jX3;
                                            c27495f2.f104674i = longRef3;
                                            interfaceC9204Wu = interfaceC9204Wu3;
                                            c27495f2.f104675j = interfaceC9204Wu;
                                            c27495f2.f104676k = xw3;
                                            c27495f2.f104677l = longRef2;
                                            c27495f2.f104678m = c43361jX33;
                                            c27495f2.f104679n = i;
                                            c27495f2.f104680o = f;
                                            c27495f2.f104681p = f2;
                                            c27495f2.f104682q = f3;
                                            c27495f2.f104683r = 3;
                                            Object obj4 = obj3;
                                            if (interfaceC9204Wu.mo3401r0(enumC38007aX32, c27495f2) == obj4) {
                                                return obj4;
                                            }
                                            coroutine_suspended = obj4;
                                            c27495f3 = c27495f2;
                                            c43361jX37 = c43361jX33;
                                            if (!c43361jX37.m30351n()) {
                                                c27495f2 = c27495f3;
                                                i5 = 2;
                                                i6 = 1;
                                                enumC38007aX3 = 0;
                                                c27495f2.f104684s = interfaceC9204Wu2;
                                                c27495f2.f104673h = c43361jX3;
                                                c27495f2.f104674i = longRef3;
                                                c27495f2.f104675j = interfaceC9204Wu;
                                                c27495f2.f104676k = xw3;
                                                c27495f2.f104677l = longRef2;
                                                c27495f2.f104678m = enumC38007aX3;
                                                c27495f2.f104679n = i;
                                                c27495f2.f104680o = f;
                                                c27495f2.f104681p = f2;
                                                c27495f2.f104682q = f3;
                                                c27495f2.f104683r = i5;
                                                obj2 = InterfaceC9204Wu.m77725U(interfaceC9204Wu, enumC38007aX3, c27495f2, i6, enumC38007aX3);
                                                if (obj2 == coroutine_suspended) {
                                                }
                                                YW3 yw32 = (YW3) obj2;
                                                m74945c = yw32.m74945c();
                                                size = m74945c.size();
                                                i2 = 0;
                                                while (true) {
                                                    if (i2 >= size) {
                                                    }
                                                    i2++;
                                                    m74945c = list;
                                                    coroutine_suspended = obj3;
                                                    size = i3;
                                                    interfaceC9204Wu = interfaceC9204Wu3;
                                                }
                                                c43361jX33 = c43361jX32;
                                                if (c43361jX33 != null) {
                                                    if (!ZW3.m72995d(c43361jX33)) {
                                                    }
                                                }
                                            }
                                        } else {
                                            Object obj5 = obj3;
                                            interfaceC9204Wu = interfaceC9204Wu3;
                                            if (i != 0) {
                                                m111940s = xw3.mo18175b(f2 - (Math.signum(f2) * f), f3);
                                                c43361jX34 = c43361jX3;
                                                xw32 = xw3;
                                            } else {
                                                c43361jX34 = c43361jX3;
                                                long mo18175b = xw3.mo18175b(f2, f3);
                                                xw32 = xw3;
                                                m111940s = C32120Ce3.m111940s(mo18175b, C32120Ce3.m111938u(C32120Ce3.m111949j(mo18175b, m111946m), f));
                                            }
                                            c43361jX33.m30364a();
                                            longRef3.element = m111940s;
                                            if (c43361jX33.m30351n()) {
                                                longRef = longRef3;
                                                c27495f = c27495f2;
                                                interfaceC9204Wu = interfaceC9204Wu2;
                                                coroutine_suspended = obj5;
                                                c43361jX3 = c43361jX34;
                                                if (c43361jX33 == null) {
                                                }
                                                if (c43361jX33 != null) {
                                                }
                                                return Unit.INSTANCE;
                                            }
                                            xw3 = xw32;
                                            coroutine_suspended = obj5;
                                            c43361jX3 = c43361jX34;
                                            f3 = 0.0f;
                                            f2 = 0.0f;
                                        }
                                    }
                                    i5 = 2;
                                    i6 = 1;
                                    enumC38007aX3 = 0;
                                    c27495f2.f104684s = interfaceC9204Wu2;
                                    c27495f2.f104673h = c43361jX3;
                                    c27495f2.f104674i = longRef3;
                                    c27495f2.f104675j = interfaceC9204Wu;
                                    c27495f2.f104676k = xw3;
                                    c27495f2.f104677l = longRef2;
                                    c27495f2.f104678m = enumC38007aX3;
                                    c27495f2.f104679n = i;
                                    c27495f2.f104680o = f;
                                    c27495f2.f104681p = f2;
                                    c27495f2.f104682q = f3;
                                    c27495f2.f104683r = i5;
                                    obj2 = InterfaceC9204Wu.m77725U(interfaceC9204Wu, enumC38007aX3, c27495f2, i6, enumC38007aX3);
                                    if (obj2 == coroutine_suspended) {
                                    }
                                    YW3 yw322 = (YW3) obj2;
                                    m74945c = yw322.m74945c();
                                    size = m74945c.size();
                                    i2 = 0;
                                    while (true) {
                                        if (i2 >= size) {
                                        }
                                        i2++;
                                        m74945c = list;
                                        coroutine_suspended = obj3;
                                        size = i3;
                                        interfaceC9204Wu = interfaceC9204Wu3;
                                    }
                                    c43361jX33 = c43361jX32;
                                    if (c43361jX33 != null) {
                                    }
                                }
                                longRef = longRef3;
                                c27495f = c27495f2;
                                interfaceC9204Wu = interfaceC9204Wu2;
                                coroutine_suspended = obj3;
                                c43361jX33 = null;
                                if (c43361jX33 == null) {
                                }
                                if (c43361jX33 != null) {
                                }
                                return Unit.INSTANCE;
                            }
                            if (c43361jX33 != null) {
                                c27495f.f104685t.invoke(C32120Ce3.m111955d(c43361jX33.m30359f()));
                                c27495f.f104686u.invoke(c43361jX33, C32120Ce3.m111955d(longRef.element));
                                long m30360e2 = c43361jX33.m30360e();
                                C27496a c27496a = new C27496a(c27495f.f104686u);
                                c27495f.f104684s = null;
                                c27495f.f104673h = null;
                                c27495f.f104674i = null;
                                c27495f.f104675j = null;
                                c27495f.f104676k = null;
                                c27495f.f104677l = null;
                                c27495f.f104678m = null;
                                c27495f.f104683r = 4;
                                m18181f = C47263q61.m18181f(interfaceC9204Wu, m30360e2, c27496a, c27495f);
                                if (m18181f == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                if (((Boolean) m18181f).booleanValue()) {
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    } else {
                        float f7 = c27495f3.f104682q;
                        float f8 = c27495f3.f104681p;
                        float f9 = c27495f3.f104680o;
                        int i9 = c27495f3.f104679n;
                        interfaceC9204Wu = (InterfaceC9204Wu) c27495f3.f104675j;
                        ResultKt.throwOnFailure(obj);
                        obj2 = obj;
                        i = i9;
                        f2 = f8;
                        f3 = f7;
                        c43361jX3 = (C43361jX3) c27495f3.f104673h;
                        xw3 = (XW3) c27495f3.f104676k;
                        f = f9;
                        longRef3 = (Ref.LongRef) c27495f3.f104674i;
                        interfaceC9204Wu2 = (InterfaceC9204Wu) c27495f3.f104684s;
                        longRef2 = (Ref.LongRef) c27495f3.f104677l;
                        c27495f2 = c27495f3;
                        YW3 yw3222 = (YW3) obj2;
                        m74945c = yw3222.m74945c();
                        size = m74945c.size();
                        i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                            }
                            i2++;
                            m74945c = list;
                            coroutine_suspended = obj3;
                            size = i3;
                            interfaceC9204Wu = interfaceC9204Wu3;
                        }
                        c43361jX33 = c43361jX32;
                        if (c43361jX33 != null) {
                        }
                        longRef = longRef3;
                        c27495f = c27495f2;
                        interfaceC9204Wu = interfaceC9204Wu2;
                        coroutine_suspended = obj3;
                        c43361jX33 = null;
                        if (c43361jX33 == null) {
                        }
                        if (c43361jX33 != null) {
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    interfaceC9204Wu = (InterfaceC9204Wu) c27495f3.f104684s;
                    m98773e = obj;
                }
            } else {
                ResultKt.throwOnFailure(obj);
                interfaceC9204Wu = (InterfaceC9204Wu) c27495f3.f104684s;
                c27495f3.f104684s = interfaceC9204Wu;
                c27495f3.f104683r = 1;
                m98773e = KY5.m98773e(interfaceC9204Wu, false, null, this, 2, null);
                if (m98773e == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            c43361jX3 = (C43361jX3) m98773e;
            longRef = new Ref.LongRef();
            longRef.element = C32120Ce3.f4427b.m111932c();
            c27495f = c27495f3;
            m30360e = c43361jX3.m30360e();
            int m30353l2 = c43361jX3.m30353l();
            XW3 m18180g2 = C47263q61.m18180g();
            if (!C47263q61.m18179h(interfaceC9204Wu.mo3414M0(), m30360e)) {
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LWu;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", m28418f = "DragGestureDetector.kt", m28417i = {0, 1, 2}, m28416l = {235, 236, 241}, m28415m = "invokeSuspend", m28414n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "$this$awaitEachGesture"}, m28413s = {"L$0", "L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,873:1\n33#2,6:874\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5\n*L\n247#1:874,6\n*E\n"})
    /* renamed from: q61$g */
    /* loaded from: classes.dex */
    public static final class C27497g extends RestrictedSuspendLambda implements Function2<InterfaceC9204Wu, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f104690h;

        /* renamed from: i */
        public /* synthetic */ Object f104691i;

        /* renamed from: j */
        public final /* synthetic */ Function1<C32120Ce3, Unit> f104692j;

        /* renamed from: k */
        public final /* synthetic */ Function0<Unit> f104693k;

        /* renamed from: l */
        public final /* synthetic */ Function0<Unit> f104694l;

        /* renamed from: m */
        public final /* synthetic */ Function2<C43361jX3, C32120Ce3, Unit> f104695m;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LjX3;", "it", "", C17296a.f69688o, "(LjX3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: q61$g$a */
        /* loaded from: classes.dex */
        public static final class C27498a extends Lambda implements Function1<C43361jX3, Unit> {

            /* renamed from: g */
            public final /* synthetic */ Function2<C43361jX3, C32120Ce3, Unit> f104696g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C27498a(Function2<? super C43361jX3, ? super C32120Ce3, Unit> function2) {
                super(1);
                this.f104696g = function2;
            }

            /* renamed from: a */
            public final void m18169a(C43361jX3 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.f104696g.invoke(it, C32120Ce3.m111955d(ZW3.m72992g(it)));
                it.m30364a();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C43361jX3 c43361jX3) {
                m18169a(c43361jX3);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C27497g(Function1<? super C32120Ce3, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super C43361jX3, ? super C32120Ce3, Unit> function2, Continuation<? super C27497g> continuation) {
            super(2, continuation);
            this.f104692j = function1;
            this.f104693k = function0;
            this.f104694l = function02;
            this.f104695m = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C27497g c27497g = new C27497g(this.f104692j, this.f104693k, this.f104694l, this.f104695m, continuation);
            c27497g.f104691i = obj;
            return c27497g;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(InterfaceC9204Wu interfaceC9204Wu, Continuation<? super Unit> continuation) {
            return ((C27497g) create(interfaceC9204Wu, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:80:0x0062 A[Catch: CancellationException -> 0x0031, TryCatch #0 {CancellationException -> 0x0031, blocks: (B:59:0x0015, B:84:0x0086, B:86:0x008e, B:88:0x009d, B:90:0x00a9, B:91:0x00ac, B:92:0x00af, B:93:0x00b5, B:64:0x0025, B:78:0x005e, B:80:0x0062, B:67:0x002d, B:75:0x004d, B:72:0x0040), top: B:98:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x008e A[Catch: CancellationException -> 0x0031, TryCatch #0 {CancellationException -> 0x0031, blocks: (B:59:0x0015, B:84:0x0086, B:86:0x008e, B:88:0x009d, B:90:0x00a9, B:91:0x00ac, B:92:0x00af, B:93:0x00b5, B:64:0x0025, B:78:0x005e, B:80:0x0062, B:67:0x002d, B:75:0x004d, B:72:0x0040), top: B:98:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:93:0x00b5 A[Catch: CancellationException -> 0x0031, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0031, blocks: (B:59:0x0015, B:84:0x0086, B:86:0x008e, B:88:0x009d, B:90:0x00a9, B:91:0x00ac, B:92:0x00af, B:93:0x00b5, B:64:0x0025, B:78:0x005e, B:80:0x0062, B:67:0x002d, B:75:0x004d, B:72:0x0040), top: B:98:0x0009 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            InterfaceC9204Wu interfaceC9204Wu;
            C43361jX3 c43361jX3;
            InterfaceC9204Wu interfaceC9204Wu2;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f104690h;
            try {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                interfaceC9204Wu2 = (InterfaceC9204Wu) this.f104691i;
                                ResultKt.throwOnFailure(obj);
                                if (!((Boolean) obj).booleanValue()) {
                                    List<C43361jX3> m74945c = interfaceC9204Wu2.mo3414M0().m74945c();
                                    int size = m74945c.size();
                                    for (int i2 = 0; i2 < size; i2++) {
                                        C43361jX3 c43361jX32 = m74945c.get(i2);
                                        if (ZW3.m72996c(c43361jX32)) {
                                            c43361jX32.m30364a();
                                        }
                                    }
                                    this.f104693k.invoke();
                                } else {
                                    this.f104694l.invoke();
                                }
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC9204Wu = (InterfaceC9204Wu) this.f104691i;
                        ResultKt.throwOnFailure(obj);
                        c43361jX3 = (C43361jX3) obj;
                        if (c43361jX3 != null) {
                            this.f104692j.invoke(C32120Ce3.m111955d(c43361jX3.m30359f()));
                            long m30360e = c43361jX3.m30360e();
                            C27498a c27498a = new C27498a(this.f104695m);
                            this.f104691i = interfaceC9204Wu;
                            this.f104690h = 3;
                            obj = C47263q61.m18181f(interfaceC9204Wu, m30360e, c27498a, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            interfaceC9204Wu2 = interfaceC9204Wu;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    interfaceC9204Wu = (InterfaceC9204Wu) this.f104691i;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    interfaceC9204Wu = (InterfaceC9204Wu) this.f104691i;
                    this.f104691i = interfaceC9204Wu;
                    this.f104690h = 1;
                    obj = KY5.m98773e(interfaceC9204Wu, false, null, this, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                long m30360e2 = ((C43361jX3) obj).m30360e();
                this.f104691i = interfaceC9204Wu;
                this.f104690h = 2;
                obj = C47263q61.m18184c(interfaceC9204Wu, m30360e2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c43361jX3 = (C43361jX3) obj;
                if (c43361jX3 != null) {
                }
                return Unit.INSTANCE;
            } catch (CancellationException e) {
                this.f104694l.invoke();
                throw e;
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m28418f = "DragGestureDetector.kt", m28417i = {0, 0}, m28416l = {109}, m28415m = "drag-jO51t88", m28414n = {"$this$drag_u2djO51t88", "onDrag"}, m28413s = {"L$0", "L$1"})
    /* renamed from: q61$h */
    /* loaded from: classes.dex */
    public static final class C27499h extends ContinuationImpl {

        /* renamed from: h */
        public Object f104697h;

        /* renamed from: i */
        public Object f104698i;

        /* renamed from: j */
        public /* synthetic */ Object f104699j;

        /* renamed from: k */
        public int f104700k;

        public C27499h(Continuation<? super C27499h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f104699j = obj;
            this.f104700k |= Integer.MIN_VALUE;
            return C47263q61.m18181f(null, 0L, null, this);
        }
    }

    static {
        float m29303g = C43705k61.m29303g((float) 0.125d);
        f104656c = m29303g;
        float m29303g2 = C43705k61.m29303g(18);
        f104657d = m29303g2;
        f104658e = m29303g / m29303g2;
    }

    /* renamed from: a */
    public static final /* synthetic */ boolean m18186a(YW3 yw3, long j) {
        return m18179h(yw3, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x00cb, code lost:
        if (p000.ZW3.m72989j(r11) != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0098  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0067 -> B:83:0x006c). Please submit an issue!!! */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m18185b(InterfaceC9204Wu interfaceC9204Wu, long j, Continuation<? super C43361jX3> continuation) {
        C27492c c27492c;
        Object coroutine_suspended;
        int i;
        Ref.LongRef longRef;
        InterfaceC9204Wu interfaceC9204Wu2;
        Object m77725U;
        C43361jX3 c43361jX3;
        C43361jX3 c43361jX32;
        if (continuation instanceof C27492c) {
            c27492c = (C27492c) continuation;
            int i2 = c27492c.f104662k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c27492c.f104662k = i2 - Integer.MIN_VALUE;
                Object obj = c27492c.f104661j;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c27492c.f104662k;
                boolean z = true;
                if (i == 0) {
                    if (i == 1) {
                        InterfaceC9204Wu interfaceC9204Wu3 = (InterfaceC9204Wu) c27492c.f104659h;
                        ResultKt.throwOnFailure(obj);
                        Ref.LongRef longRef2 = (Ref.LongRef) c27492c.f104660i;
                        interfaceC9204Wu2 = interfaceC9204Wu3;
                        YW3 yw3 = (YW3) obj;
                        List<C43361jX3> m74945c = yw3.m74945c();
                        int size = m74945c.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size) {
                                c43361jX3 = m74945c.get(i3);
                                if (C42768iX3.m33834d(c43361jX3.m30360e(), longRef2.element)) {
                                    break;
                                }
                                i3++;
                            } else {
                                c43361jX3 = null;
                                break;
                            }
                        }
                        C43361jX3 c43361jX33 = c43361jX3;
                        if (c43361jX33 == null) {
                            if (ZW3.m72995d(c43361jX33)) {
                                List<C43361jX3> m74945c2 = yw3.m74945c();
                                int size2 = m74945c2.size();
                                int i4 = 0;
                                while (true) {
                                    if (i4 < size2) {
                                        c43361jX32 = m74945c2.get(i4);
                                        if (c43361jX32.m30358g()) {
                                            break;
                                        }
                                        i4++;
                                    } else {
                                        c43361jX32 = null;
                                        break;
                                    }
                                }
                                C43361jX3 c43361jX34 = c43361jX32;
                                if (c43361jX34 != null) {
                                    longRef2.element = c43361jX34.m30360e();
                                    longRef = longRef2;
                                }
                            }
                            c27492c.f104659h = interfaceC9204Wu2;
                            c27492c.f104660i = longRef;
                            c27492c.f104662k = 1;
                            m77725U = InterfaceC9204Wu.m77725U(interfaceC9204Wu2, null, c27492c, 1, null);
                            if (m77725U != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Ref.LongRef longRef3 = longRef;
                            obj = m77725U;
                            longRef2 = longRef3;
                            YW3 yw32 = (YW3) obj;
                            List<C43361jX3> m74945c3 = yw32.m74945c();
                            int size3 = m74945c3.size();
                            int i32 = 0;
                            while (true) {
                                if (i32 >= size3) {
                                }
                                i32++;
                            }
                            C43361jX3 c43361jX332 = c43361jX3;
                            if (c43361jX332 == null) {
                                c43361jX332 = null;
                            }
                        }
                        if (c43361jX332 == null || c43361jX332.m30351n()) {
                            z = false;
                        }
                        if (!z) {
                            return null;
                        }
                        return c43361jX332;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (m18179h(interfaceC9204Wu.mo3414M0(), j)) {
                    return null;
                }
                longRef = new Ref.LongRef();
                longRef.element = j;
                interfaceC9204Wu2 = interfaceC9204Wu;
                c27492c.f104659h = interfaceC9204Wu2;
                c27492c.f104660i = longRef;
                c27492c.f104662k = 1;
                m77725U = InterfaceC9204Wu.m77725U(interfaceC9204Wu2, null, c27492c, 1, null);
                if (m77725U != coroutine_suspended) {
                }
            }
        }
        c27492c = new C27492c(continuation);
        Object obj2 = c27492c.f104661j;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c27492c.f104662k;
        boolean z2 = true;
        if (i == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00a3  */
    /* JADX WARN: Type inference failed for: r10v2, types: [jX3, T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v6, types: [jX3] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m18184c(InterfaceC9204Wu interfaceC9204Wu, long j, Continuation<? super C43361jX3> continuation) {
        C27493d c27493d;
        Object coroutine_suspended;
        int i;
        C43361jX3 c43361jX3;
        C43361jX3 c43361jX32;
        Ref.ObjectRef objectRef;
        C43361jX3 c43361jX33;
        if (continuation instanceof C27493d) {
            c27493d = (C27493d) continuation;
            int i2 = c27493d.f104666k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c27493d.f104666k = i2 - Integer.MIN_VALUE;
                Object obj = c27493d.f104665j;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c27493d.f104666k;
                if (i == 0) {
                    if (i == 1) {
                        objectRef = (Ref.ObjectRef) c27493d.f104664i;
                        c43361jX32 = (C43361jX3) c27493d.f104663h;
                        try {
                            ResultKt.throwOnFailure(obj);
                            return null;
                        } catch (PointerEventTimeoutCancellationException unused) {
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    if (m18179h(interfaceC9204Wu.mo3414M0(), j)) {
                        return null;
                    }
                    List<C43361jX3> m74945c = interfaceC9204Wu.mo3414M0().m74945c();
                    int size = m74945c.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            c43361jX3 = m74945c.get(i3);
                            if (C42768iX3.m33834d(c43361jX3.m30360e(), j)) {
                                break;
                            }
                            i3++;
                        } else {
                            c43361jX3 = null;
                            break;
                        }
                    }
                    c43361jX32 = c43361jX3;
                    if (c43361jX32 == 0) {
                        return null;
                    }
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                    objectRef3.element = c43361jX32;
                    long mo42673d = interfaceC9204Wu.mo3400s().mo42673d();
                    try {
                        C27494e c27494e = new C27494e(objectRef3, objectRef2, null);
                        c27493d.f104663h = c43361jX32;
                        c27493d.f104664i = objectRef2;
                        c27493d.f104666k = 1;
                        if (interfaceC9204Wu.mo3413Q(mo42673d, c27494e, c27493d) != coroutine_suspended) {
                            return null;
                        }
                        return coroutine_suspended;
                    } catch (PointerEventTimeoutCancellationException unused2) {
                        objectRef = objectRef2;
                    }
                }
                c43361jX33 = (C43361jX3) objectRef.element;
                if (c43361jX33 != null) {
                    return c43361jX32;
                }
                return c43361jX33;
            }
        }
        c27493d = new C27493d(continuation);
        Object obj2 = c27493d.f104665j;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c27493d.f104666k;
        if (i == 0) {
        }
        c43361jX33 = (C43361jX3) objectRef.element;
        if (c43361jX33 != null) {
        }
    }

    /* renamed from: d */
    public static final Object m18183d(InterfaceC49290tX3 interfaceC49290tX3, Function1<? super C32120Ce3, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super C43361jX3, ? super C32120Ce3, Unit> function2, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m94550c = C34620Mw1.m94550c(interfaceC49290tX3, new C27495f(function1, function2, function02, function0, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m94550c == coroutine_suspended ? m94550c : Unit.INSTANCE;
    }

    /* renamed from: e */
    public static final Object m18182e(InterfaceC49290tX3 interfaceC49290tX3, Function1<? super C32120Ce3, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super C43361jX3, ? super C32120Ce3, Unit> function2, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m94550c = C34620Mw1.m94550c(interfaceC49290tX3, new C27497g(function1, function0, function02, function2, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m94550c == coroutine_suspended ? m94550c : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0055  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0048 -> B:45:0x004b). Please submit an issue!!! */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m18181f(InterfaceC9204Wu interfaceC9204Wu, long j, Function1<? super C43361jX3, Unit> function1, Continuation<? super Boolean> continuation) {
        C27499h c27499h;
        Object coroutine_suspended;
        int i;
        C43361jX3 c43361jX3;
        if (continuation instanceof C27499h) {
            c27499h = (C27499h) continuation;
            int i2 = c27499h.f104700k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c27499h.f104700k = i2 - Integer.MIN_VALUE;
                Object obj = c27499h.f104699j;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c27499h.f104700k;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        function1 = (Function1) c27499h.f104698i;
                        interfaceC9204Wu = (InterfaceC9204Wu) c27499h.f104697h;
                        c43361jX3 = (C43361jX3) obj;
                        if (c43361jX3 == null) {
                            if (ZW3.m72995d(c43361jX3)) {
                                return Boxing.boxBoolean(true);
                            }
                            function1.invoke(c43361jX3);
                            j = c43361jX3.m30360e();
                            c27499h.f104697h = interfaceC9204Wu;
                            c27499h.f104698i = function1;
                            c27499h.f104700k = 1;
                            obj = m18185b(interfaceC9204Wu, j, c27499h);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            c43361jX3 = (C43361jX3) obj;
                            if (c43361jX3 == null) {
                                return Boxing.boxBoolean(false);
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    c27499h.f104697h = interfaceC9204Wu;
                    c27499h.f104698i = function1;
                    c27499h.f104700k = 1;
                    obj = m18185b(interfaceC9204Wu, j, c27499h);
                    if (obj == coroutine_suspended) {
                    }
                    c43361jX3 = (C43361jX3) obj;
                    if (c43361jX3 == null) {
                    }
                }
            }
        }
        c27499h = new C27499h(continuation);
        Object obj2 = c27499h.f104699j;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c27499h.f104700k;
        if (i == 0) {
        }
    }

    /* renamed from: g */
    public static final XW3 m18180g() {
        return f104654a;
    }

    /* renamed from: h */
    public static final boolean m18179h(YW3 yw3, long j) {
        C43361jX3 c43361jX3;
        List<C43361jX3> m74945c = yw3.m74945c();
        int size = m74945c.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                c43361jX3 = m74945c.get(i);
                if (C42768iX3.m33834d(c43361jX3.m30360e(), j)) {
                    break;
                }
                i++;
            } else {
                c43361jX3 = null;
                break;
            }
        }
        C43361jX3 c43361jX32 = c43361jX3;
        if (c43361jX32 != null && c43361jX32.m30358g()) {
            z = true;
        }
        return true ^ z;
    }

    /* renamed from: i */
    public static final float m18178i(InterfaceC33869Jq6 pointerSlop, int i) {
        Intrinsics.checkNotNullParameter(pointerSlop, "$this$pointerSlop");
        if (C52254yX3.m3355g(i, C52254yX3.f119686a.m3351b())) {
            return pointerSlop.mo42675b() * f104658e;
        }
        return pointerSlop.mo42675b();
    }

    /* renamed from: j */
    public static final XW3 m18177j(EnumC32768Ey3 enumC32768Ey3) {
        Intrinsics.checkNotNullParameter(enumC32768Ey3, "<this>");
        if (enumC32768Ey3 == EnumC32768Ey3.Vertical) {
            return f104655b;
        }
        return f104654a;
    }
}
