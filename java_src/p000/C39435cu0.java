package p000;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001:\u0001CB*\u0012\u0006\u0010M\u001a\u00020K\u0012\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0010\u0012\u000b\b\u0002\u0010\u0089\u0001\u001a\u0004\u0018\u00010x¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u001e\u0010\n\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0006H\u0002Jc\u0010\u001a\u001a\u00020\u00022Y\u0010\u0019\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00020\u000fj\u0002`\u00180\u000eH\u0002J\b\u0010\u001b\u001a\u00020\u0002H\u0002J\"\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u0006H\u0002J\u001c\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010$0#H\u0002J\u001d\u0010(\u001a\u00020\u00022\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u001d\u0010*\u001a\u00020\u00022\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020&H\u0016¢\u0006\u0004\b*\u0010)J\b\u0010+\u001a\u00020\u0002H\u0016J\u0016\u0010,\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0016\u0010-\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0016\u0010/\u001a\u00020\u00022\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020&H\u0016J\u0010\u00100\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u00101\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0006H\u0016J\b\u00102\u001a\u00020\bH\u0016J$\u00107\u001a\u00020\u00022\u001a\u00106\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u000205\u0012\u0006\u0012\u0004\u0018\u0001050403H\u0016J\u0010\u0010:\u001a\u00020\u00022\u0006\u00109\u001a\u000208H\u0016J\b\u0010;\u001a\u00020\u0002H\u0016J\b\u0010<\u001a\u00020\u0002H\u0016J\b\u0010=\u001a\u00020\u0002H\u0016J\b\u0010>\u001a\u00020\u0002H\u0016J5\u0010C\u001a\u00028\u0000\"\u0004\b\u0000\u0010?2\b\u0010@\u001a\u0004\u0018\u00010\u00012\u0006\u0010B\u001a\u00020A2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\bC\u0010DJ\u0018\u0010E\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u0006J\u001f\u0010F\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\bF\u0010GJ\u001b\u0010I\u001a\u00020\u00022\n\u00109\u001a\u0006\u0012\u0002\b\u00030HH\u0000¢\u0006\u0004\bI\u0010JR\u0014\u0010M\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010LR\u0018\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010NR(\u0010R\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00060Oj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0006`P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010QR\u0014\u0010U\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR$\u0010Z\u001a\u0012\u0012\u0004\u0012\u00020W0Vj\b\u0012\u0004\u0012\u00020W`X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010YR\u001a\u0010_\u001a\u00020[8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\\\u001a\u0004\b]\u0010^R\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020\u001c0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR$\u0010d\u001a\u0012\u0012\u0004\u0012\u00020\u001c0Vj\b\u0012\u0004\u0012\u00020\u001c`X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010YR\u001e\u0010e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030H0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010bRg\u0010\u0019\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00020\u000fj\u0002`\u00180\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010fRg\u0010g\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00020\u000fj\u0002`\u00180\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010fR\u001a\u0010h\u001a\b\u0012\u0004\u0012\u00020\u001c0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010bR*\u0010j\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010$0#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010iR\"\u0010p\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\u0018\u0010r\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010qR\u0016\u0010t\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010sR\u0014\u0010w\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010vR\u0016\u0010z\u001a\u0004\u0018\u00010x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010yR\u0017\u0010{\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b;\u0010k\u001a\u0004\b{\u0010mR\u0016\u0010}\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010kR+\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b1\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0005\b\u0081\u0001\u0010)R\u0016\u0010\u0084\u0001\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010mR\u0015\u0010\u0085\u0001\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b|\u0010mR\u0015\u0010\u0086\u0001\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010mR\u0016\u0010\u0088\u0001\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010m¨\u0006\u008c\u0001"}, m28432d2 = {"Lcu0;", "LnB0;", "", "r", "y", "", "", "values", "", "forgetConditionalScopes", "g", "m", "value", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "", "Lkotlin/Function3;", "Llm;", "Lkotlin/ParameterName;", "name", "applier", "LqE5;", "slots", "LOv4;", "rememberManager", "Landroidx/compose/runtime/Change;", "changes", "i", "c", "Los4;", Action.SCOPE_ATTRIBUTE, "Ldb;", "anchor", "instance", "Lo72;", "B", "LkW1;", "LlW1;", "G", "Lkotlin/Function0;", "content", "f", "(Lkotlin/jvm/functions/Function2;)V", "j", "dispose", "s", "b", "block", "q", "p", "v", "o", "", "Lkotlin/Pair;", "LjW2;", "references", "l", "LiW2;", TransferTable.COLUMN_STATE, "n", "t", "k", DateTokenConverter.CONVERTER_KEY, "x", "R", "to", "", "groupIndex", C17296a.f69688o, "(LnB0;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "A", "E", "(Ljava/lang/Object;Los4;)V", "Lu01;", "D", "(Lu01;)V", "LYt0;", "LYt0;", "parent", "Llm;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "pendingModifications", "e", "Ljava/lang/Object;", "lock", "Ljava/util/HashSet;", "LPv4;", "Lkotlin/collections/HashSet;", "Ljava/util/HashSet;", "abandonSet", "LnE5;", "LnE5;", "getSlotTable$runtime_release", "()LnE5;", "slotTable", "LnW1;", "h", "LnW1;", "observations", "conditionallyInvalidatedScopes", "derivedStates", "Ljava/util/List;", "lateChanges", "observationsProcessed", "LkW1;", "invalidations", "Z", "getPendingInvalidScopes$runtime_release", "()Z", "F", "(Z)V", "pendingInvalidScopes", "Lcu0;", "invalidationDelegate", "I", "invalidationDelegateGroup", "LPt0;", "LPt0;", "composer", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "_recomposeContext", "isRoot", "u", "disposed", "Lkotlin/jvm/functions/Function2;", "getComposable", "()Lkotlin/jvm/functions/Function2;", "setComposable", "composable", "z", "areChildrenComposing", "isComposing", "isDisposed", "w", "hasInvalidations", "recomposeContext", "<init>", "(LYt0;Llm;Lkotlin/coroutines/CoroutineContext;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 6 IdentityScopeMap.kt\nandroidx/compose/runtime/collection/IdentityScopeMap\n+ 7 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 8 Composition.kt\nandroidx/compose/runtime/CompositionKt\n+ 9 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 10 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1257:1\n884#1,2:1271\n1025#1,3:1273\n874#1,6:1277\n1028#1,7:1283\n886#1,4:1290\n884#1,2:1467\n1025#1,3:1469\n874#1,6:1472\n1028#1,7:1478\n886#1,4:1485\n884#1,2:1498\n1025#1,10:1500\n886#1,4:1510\n884#1,2:1586\n1025#1,10:1588\n886#1,4:1598\n884#1,2:1603\n1025#1,10:1605\n886#1,4:1615\n884#1,2:1620\n1025#1,10:1622\n886#1,4:1632\n1025#1,10:1636\n70#2:1258\n70#2:1260\n70#2:1276\n70#2:1294\n70#2:1303\n70#2:1304\n70#2:1456\n70#2:1466\n70#2:1585\n70#2:1602\n70#2:1619\n70#2:1646\n70#2:1649\n70#2:1650\n1#3:1259\n1#3:1661\n93#4,2:1261\n33#4,4:1263\n95#4,2:1267\n38#4:1269\n97#4:1270\n110#4,2:1489\n33#4,6:1491\n112#4:1497\n33#4,6:1529\n33#4,6:1664\n162#5,8:1295\n162#5,8:1514\n162#5,4:1525\n167#5,3:1535\n89#6,3:1305\n93#6:1313\n220#6:1314\n236#6,5:1315\n221#6:1320\n222#6:1337\n241#6,17:1338\n223#6:1355\n220#6:1356\n236#6,5:1357\n221#6:1362\n222#6:1379\n241#6,17:1380\n223#6:1397\n220#6:1398\n236#6,5:1399\n221#6:1404\n222#6:1421\n241#6,17:1422\n223#6:1439\n89#6,3:1447\n93#6:1455\n89#6,3:1457\n93#6:1465\n220#6:1542\n236#6,5:1543\n221#6:1548\n222#6:1565\n241#6,17:1566\n223#6:1583\n89#6,3:1670\n93#6:1678\n105#7,5:1308\n146#7,16:1321\n146#7,16:1363\n146#7,16:1405\n105#7,5:1450\n105#7,5:1460\n146#7,16:1549\n105#7,5:1673\n1251#8,7:1440\n46#9,3:1522\n50#9:1538\n46#9,3:1539\n50#9:1584\n13579#10,2:1647\n11653#10,9:1651\n13579#10:1660\n13580#10:1662\n11662#10:1663\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n*L\n583#1:1271,2\n583#1:1273,3\n586#1:1277,6\n583#1:1283,7\n583#1:1290,4\n770#1:1467,2\n770#1:1469,3\n771#1:1472,6\n770#1:1478,7\n770#1:1485,4\n784#1:1498,2\n784#1:1500,10\n784#1:1510,4\n841#1:1586,2\n841#1:1588,10\n841#1:1598,4\n850#1:1603,2\n850#1:1605,10\n850#1:1615,4\n860#1:1620,2\n860#1:1622,10\n860#1:1632,4\n885#1:1636,10\n514#1:1258\n523#1:1260\n584#1:1276\n594#1:1294\n635#1:1303\n656#1:1304\n758#1:1456\n768#1:1466\n840#1:1585\n849#1:1602\n859#1:1619\n899#1:1646\n905#1:1649\n950#1:1650\n1012#1:1661\n530#1:1261,2\n530#1:1263,4\n530#1:1267,2\n530#1:1269\n530#1:1270\n783#1:1489,2\n783#1:1491,6\n783#1:1497\n809#1:1529,6\n1013#1:1664,6\n620#1:1295,8\n792#1:1514,8\n807#1:1525,4\n807#1:1535,3\n701#1:1305,3\n701#1:1313\n708#1:1314\n708#1:1315,5\n708#1:1320\n708#1:1337\n708#1:1338,17\n708#1:1355\n715#1:1356\n715#1:1357,5\n715#1:1362\n715#1:1379\n715#1:1380,17\n715#1:1397\n722#1:1398\n722#1:1399,5\n722#1:1404\n722#1:1421\n722#1:1422,17\n722#1:1439\n750#1:1447,3\n750#1:1455\n763#1:1457,3\n763#1:1465\n827#1:1542\n827#1:1543,5\n827#1:1548\n827#1:1565\n827#1:1566,17\n827#1:1583\n678#1:1670,3\n678#1:1678\n701#1:1308,5\n708#1:1321,16\n715#1:1363,16\n722#1:1405,16\n750#1:1450,5\n763#1:1460,5\n827#1:1549,16\n678#1:1673,5\n723#1:1440,7\n803#1:1522,3\n803#1:1538\n825#1:1539,3\n825#1:1584\n900#1:1647,2\n1012#1:1651,9\n1012#1:1660\n1012#1:1662\n1012#1:1663\n*E\n"})
/* renamed from: cu0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39435cu0 implements InterfaceC45532nB0 {

    /* renamed from: b */
    public final AbstractC37400Yt0 f75796b;

    /* renamed from: c */
    public final InterfaceC25773lm<?> f75797c;

    /* renamed from: d */
    public final AtomicReference<Object> f75798d;

    /* renamed from: e */
    public final Object f75799e;

    /* renamed from: f */
    public final HashSet<InterfaceC35316Pv4> f75800f;

    /* renamed from: g */
    public final C45564nE5 f75801g;

    /* renamed from: h */
    public final C45722nW1<C46534os4> f75802h;

    /* renamed from: i */
    public final HashSet<C46534os4> f75803i;

    /* renamed from: j */
    public final C45722nW1<InterfaceC49574u01<?>> f75804j;

    /* renamed from: k */
    public final List<Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit>> f75805k;

    /* renamed from: l */
    public final List<Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit>> f75806l;

    /* renamed from: m */
    public final C45722nW1<C46534os4> f75807m;

    /* renamed from: n */
    public C43943kW1<C46534os4, C44536lW1<Object>> f75808n;

    /* renamed from: o */
    public boolean f75809o;

    /* renamed from: p */
    public C39435cu0 f75810p;

    /* renamed from: q */
    public int f75811q;

    /* renamed from: r */
    public final C35294Pt0 f75812r;

    /* renamed from: s */
    public final CoroutineContext f75813s;

    /* renamed from: t */
    public final boolean f75814t;

    /* renamed from: u */
    public boolean f75815u;

    /* renamed from: v */
    public Function2<? super InterfaceC32720Et0, ? super Integer, Unit> f75816v;

    @Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0016J\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0004J\u0006\u0010\u0010\u001a\u00020\u0004R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015¨\u0006\u001d"}, m28432d2 = {"Lcu0$a;", "LOv4;", "LPv4;", "instance", "", "b", "e", "Lkotlin/Function0;", "effect", C17296a.f69688o, "LAt0;", "c", DateTokenConverter.CONVERTER_KEY, "h", "i", "f", "g", "", "Ljava/util/Set;", "abandoning", "", "Ljava/util/List;", "remembering", "forgetting", "sideEffects", "deactivating", "releasing", "<init>", "(Ljava/util/Set;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl$RememberEventDispatcher\n+ 2 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1257:1\n46#2,5:1258\n46#2,3:1263\n50#2:1272\n46#2,3:1273\n50#2:1282\n46#2,5:1283\n46#2,5:1288\n46#2,5:1293\n33#3,6:1266\n33#3,6:1276\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl$RememberEventDispatcher\n*L\n1090#1:1258,5\n1102#1:1263,3\n1102#1:1272\n1113#1:1273,3\n1113#1:1282\n1124#1:1283,5\n1138#1:1288,5\n1151#1:1293,5\n1103#1:1266,6\n1114#1:1276,6\n*E\n"})
    /* renamed from: cu0$a */
    /* loaded from: classes.dex */
    public static final class C19636a implements InterfaceC35082Ov4 {

        /* renamed from: a */
        public final Set<InterfaceC35316Pv4> f75817a;

        /* renamed from: b */
        public final List<InterfaceC35316Pv4> f75818b;

        /* renamed from: c */
        public final List<InterfaceC35316Pv4> f75819c;

        /* renamed from: d */
        public final List<Function0<Unit>> f75820d;

        /* renamed from: e */
        public List<InterfaceC31784At0> f75821e;

        /* renamed from: f */
        public List<InterfaceC31784At0> f75822f;

        public C19636a(Set<InterfaceC35316Pv4> abandoning) {
            Intrinsics.checkNotNullParameter(abandoning, "abandoning");
            this.f75817a = abandoning;
            this.f75818b = new ArrayList();
            this.f75819c = new ArrayList();
            this.f75820d = new ArrayList();
        }

        @Override // p000.InterfaceC35082Ov4
        /* renamed from: a */
        public void mo44867a(Function0<Unit> effect) {
            Intrinsics.checkNotNullParameter(effect, "effect");
            this.f75820d.add(effect);
        }

        @Override // p000.InterfaceC35082Ov4
        /* renamed from: b */
        public void mo44866b(InterfaceC35316Pv4 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            int lastIndexOf = this.f75819c.lastIndexOf(instance);
            if (lastIndexOf >= 0) {
                this.f75819c.remove(lastIndexOf);
                this.f75817a.remove(instance);
                return;
            }
            this.f75818b.add(instance);
        }

        @Override // p000.InterfaceC35082Ov4
        /* renamed from: c */
        public void mo44865c(InterfaceC31784At0 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            List list = this.f75821e;
            if (list == null) {
                list = new ArrayList();
                this.f75821e = list;
            }
            list.add(instance);
        }

        @Override // p000.InterfaceC35082Ov4
        /* renamed from: d */
        public void mo44864d(InterfaceC31784At0 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            List list = this.f75822f;
            if (list == null) {
                list = new ArrayList();
                this.f75822f = list;
            }
            list.add(instance);
        }

        @Override // p000.InterfaceC35082Ov4
        /* renamed from: e */
        public void mo44863e(InterfaceC35316Pv4 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            int lastIndexOf = this.f75818b.lastIndexOf(instance);
            if (lastIndexOf >= 0) {
                this.f75818b.remove(lastIndexOf);
                this.f75817a.remove(instance);
                return;
            }
            this.f75819c.add(instance);
        }

        /* renamed from: f */
        public final void m44862f() {
            if (!this.f75817a.isEmpty()) {
                Object m61928a = C38949c66.f60129a.m61928a("Compose:abandons");
                try {
                    Iterator<InterfaceC35316Pv4> it = this.f75817a.iterator();
                    while (it.hasNext()) {
                        it.remove();
                        it.next().onAbandoned();
                    }
                    Unit unit = Unit.INSTANCE;
                } finally {
                    C38949c66.f60129a.m61927b(m61928a);
                }
            }
        }

        /* renamed from: g */
        public final void m44861g() {
            boolean z;
            Object m61928a;
            List<InterfaceC31784At0> list = this.f75821e;
            List<InterfaceC31784At0> list2 = list;
            boolean z2 = false;
            if (list2 != null && !list2.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                m61928a = C38949c66.f60129a.m61928a("Compose:deactivations");
                try {
                    for (int size = list.size() - 1; -1 < size; size--) {
                        list.get(size).mo68273j();
                    }
                    Unit unit = Unit.INSTANCE;
                    C38949c66.f60129a.m61927b(m61928a);
                    list.clear();
                } finally {
                }
            }
            List<InterfaceC31784At0> list3 = this.f75822f;
            List<InterfaceC31784At0> list4 = list3;
            if (!((list4 == null || list4.isEmpty()) ? true : true)) {
                m61928a = C38949c66.f60129a.m61928a("Compose:releases");
                try {
                    for (int size2 = list3.size() - 1; -1 < size2; size2--) {
                        list3.get(size2).mo68281b();
                    }
                    Unit unit2 = Unit.INSTANCE;
                    C38949c66.f60129a.m61927b(m61928a);
                    list3.clear();
                } finally {
                }
            }
        }

        /* renamed from: h */
        public final void m44860h() {
            Object m61928a;
            if (!this.f75819c.isEmpty()) {
                m61928a = C38949c66.f60129a.m61928a("Compose:onForgotten");
                try {
                    for (int size = this.f75819c.size() - 1; -1 < size; size--) {
                        InterfaceC35316Pv4 interfaceC35316Pv4 = this.f75819c.get(size);
                        if (!this.f75817a.contains(interfaceC35316Pv4)) {
                            interfaceC35316Pv4.onForgotten();
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } finally {
                }
            }
            if (!this.f75818b.isEmpty()) {
                m61928a = C38949c66.f60129a.m61928a("Compose:onRemembered");
                try {
                    List<InterfaceC35316Pv4> list = this.f75818b;
                    int size2 = list.size();
                    for (int i = 0; i < size2; i++) {
                        InterfaceC35316Pv4 interfaceC35316Pv42 = list.get(i);
                        this.f75817a.remove(interfaceC35316Pv42);
                        interfaceC35316Pv42.onRemembered();
                    }
                    Unit unit2 = Unit.INSTANCE;
                } finally {
                }
            }
        }

        /* renamed from: i */
        public final void m44859i() {
            if (!this.f75820d.isEmpty()) {
                Object m61928a = C38949c66.f60129a.m61928a("Compose:sideeffects");
                try {
                    List<Function0<Unit>> list = this.f75820d;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        list.get(i).invoke();
                    }
                    this.f75820d.clear();
                    Unit unit = Unit.INSTANCE;
                } finally {
                    C38949c66.f60129a.m61927b(m61928a);
                }
            }
        }
    }

    public C39435cu0(AbstractC37400Yt0 parent, InterfaceC25773lm<?> applier, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(applier, "applier");
        this.f75796b = parent;
        this.f75797c = applier;
        this.f75798d = new AtomicReference<>(null);
        this.f75799e = new Object();
        HashSet<InterfaceC35316Pv4> hashSet = new HashSet<>();
        this.f75800f = hashSet;
        C45564nE5 c45564nE5 = new C45564nE5();
        this.f75801g = c45564nE5;
        this.f75802h = new C45722nW1<>();
        this.f75803i = new HashSet<>();
        this.f75804j = new C45722nW1<>();
        ArrayList arrayList = new ArrayList();
        this.f75805k = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f75806l = arrayList2;
        this.f75807m = new C45722nW1<>();
        this.f75808n = new C43943kW1<>(0, 1, null);
        C35294Pt0 c35294Pt0 = new C35294Pt0(applier, parent, c45564nE5, hashSet, arrayList, arrayList2, this);
        parent.mo74040m(c35294Pt0);
        this.f75812r = c35294Pt0;
        this.f75813s = coroutineContext;
        this.f75814t = parent instanceof C47720qs4;
        this.f75816v = C48319rt0.f107826a.m15138a();
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.HashSet, T] */
    /* renamed from: h */
    public static final void m44874h(C39435cu0 c39435cu0, boolean z, Ref.ObjectRef<HashSet<C46534os4>> objectRef, Object obj) {
        int m23577f;
        C44536lW1 m23568o;
        C45722nW1<C46534os4> c45722nW1 = c39435cu0.f75802h;
        m23577f = c45722nW1.m23577f(obj);
        if (m23577f >= 0) {
            m23568o = c45722nW1.m23568o(m23577f);
            int size = m23568o.size();
            for (int i = 0; i < size; i++) {
                C46534os4 c46534os4 = (C46534os4) m23568o.get(i);
                if (!c39435cu0.f75807m.m23570m(obj, c46534os4) && c46534os4.m20386t(obj) != EnumC46088o72.IGNORED) {
                    if (c46534os4.m20385u() && !z) {
                        c39435cu0.f75803i.add(c46534os4);
                    } else {
                        HashSet<C46534os4> hashSet = objectRef.element;
                        HashSet<C46534os4> hashSet2 = hashSet;
                        if (hashSet == null) {
                            ?? hashSet3 = new HashSet();
                            objectRef.element = hashSet3;
                            hashSet2 = hashSet3;
                        }
                        hashSet2.add(c46534os4);
                    }
                }
            }
        }
    }

    /* renamed from: A */
    public final EnumC46088o72 m44885A(C46534os4 scope, Object obj) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (scope.m20393m()) {
            scope.m20411C(true);
        }
        C19797db m20396j = scope.m20396j();
        if (m20396j != null && this.f75801g.m24129A(m20396j) && m20396j.m44094b()) {
            if (!m20396j.m44094b()) {
                return EnumC46088o72.IGNORED;
            }
            if (!scope.m20395k()) {
                return EnumC46088o72.IGNORED;
            }
            return m44884B(scope, m20396j, obj);
        }
        return EnumC46088o72.IGNORED;
    }

    /* renamed from: B */
    public final EnumC46088o72 m44884B(C46534os4 c46534os4, C19797db c19797db, Object obj) {
        synchronized (this.f75799e) {
            C39435cu0 c39435cu0 = this.f75810p;
            if (c39435cu0 == null || !this.f75801g.m24115x(this.f75811q, c19797db)) {
                c39435cu0 = null;
            }
            if (c39435cu0 == null) {
                if (mo24213u() && this.f75812r.m89618L1(c46534os4, obj)) {
                    return EnumC46088o72.IMMINENT;
                } else if (obj == null) {
                    this.f75808n.m28891k(c46534os4, null);
                } else {
                    C40027du0.m43530b(this.f75808n, c46534os4, obj);
                }
            }
            if (c39435cu0 != null) {
                return c39435cu0.m44884B(c46534os4, c19797db, obj);
            }
            this.f75796b.mo16855i(this);
            if (mo24213u()) {
                return EnumC46088o72.DEFERRED;
            }
            return EnumC46088o72.SCHEDULED;
        }
    }

    /* renamed from: C */
    public final void m44883C(Object obj) {
        int m23577f;
        C44536lW1 m23568o;
        C45722nW1<C46534os4> c45722nW1 = this.f75802h;
        m23577f = c45722nW1.m23577f(obj);
        if (m23577f >= 0) {
            m23568o = c45722nW1.m23568o(m23577f);
            int size = m23568o.size();
            for (int i = 0; i < size; i++) {
                C46534os4 c46534os4 = (C46534os4) m23568o.get(i);
                if (c46534os4.m20386t(obj) == EnumC46088o72.IMMINENT) {
                    this.f75807m.m23580c(obj, c46534os4);
                }
            }
        }
    }

    /* renamed from: D */
    public final void m44882D(InterfaceC49574u01<?> state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (!this.f75802h.m23578e(state)) {
            this.f75804j.m23569n(state);
        }
    }

    /* renamed from: E */
    public final void m44881E(Object instance, C46534os4 scope) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f75802h.m23570m(instance, scope);
    }

    /* renamed from: F */
    public final void m44880F(boolean z) {
        this.f75809o = z;
    }

    /* renamed from: G */
    public final C43943kW1<C46534os4, C44536lW1<Object>> m44879G() {
        C43943kW1<C46534os4, C44536lW1<Object>> c43943kW1 = this.f75808n;
        this.f75808n = new C43943kW1<>(0, 1, null);
        return c43943kW1;
    }

    @Override // p000.InterfaceC45532nB0
    /* renamed from: a */
    public <R> R mo24225a(InterfaceC45532nB0 interfaceC45532nB0, int i, Function0<? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (interfaceC45532nB0 != null && !Intrinsics.areEqual(interfaceC45532nB0, this) && i >= 0) {
            this.f75810p = (C39435cu0) interfaceC45532nB0;
            this.f75811q = i;
            try {
                return block.invoke();
            } finally {
                this.f75810p = null;
                this.f75811q = 0;
            }
        }
        return block.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000f  */
    @Override // p000.InterfaceC45532nB0
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo24224b(Set<? extends Object> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        for (Object obj : values) {
            if (this.f75802h.m23578e(obj) || this.f75804j.m23578e(obj)) {
                return true;
            }
            while (r3.hasNext()) {
            }
        }
        return false;
    }

    /* renamed from: c */
    public final void m44878c() {
        this.f75798d.set(null);
        this.f75805k.clear();
        this.f75806l.clear();
        this.f75800f.clear();
    }

    @Override // p000.InterfaceC45532nB0
    /* renamed from: d */
    public void mo24223d() {
        synchronized (this.f75799e) {
            try {
                this.f75812r.m89544l0();
                if (!this.f75800f.isEmpty()) {
                    new C19636a(this.f75800f).m44862f();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                try {
                    if (!this.f75800f.isEmpty()) {
                        new C19636a(this.f75800f).m44862f();
                    }
                    throw th;
                } catch (Exception e) {
                    m44878c();
                    throw e;
                }
            }
        }
    }

    @Override // p000.InterfaceC37166Xt0
    public void dispose() {
        boolean z;
        synchronized (this.f75799e) {
            if (!this.f75815u) {
                this.f75815u = true;
                this.f75816v = C48319rt0.f107826a.m15137b();
                List<Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit>> m89634G0 = this.f75812r.m89634G0();
                if (m89634G0 != null) {
                    m44873i(m89634G0);
                }
                if (this.f75801g.m24120o() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || (true ^ this.f75800f.isEmpty())) {
                    C19636a c19636a = new C19636a(this.f75800f);
                    if (z) {
                        C47343qE5 m24113z = this.f75801g.m24113z();
                        C35528Qt0.m87821U(m24113z, c19636a);
                        Unit unit = Unit.INSTANCE;
                        m24113z.m17843F();
                        this.f75797c.clear();
                        c19636a.m44860h();
                        c19636a.m44861g();
                    }
                    c19636a.m44862f();
                }
                this.f75812r.m89520t0();
            }
            Unit unit2 = Unit.INSTANCE;
        }
        this.f75796b.mo16845p(this);
    }

    @Override // p000.InterfaceC37166Xt0
    /* renamed from: e */
    public boolean mo44877e() {
        return this.f75815u;
    }

    @Override // p000.InterfaceC37166Xt0
    /* renamed from: f */
    public void mo44876f(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        if (!this.f75815u) {
            this.f75816v = content;
            this.f75796b.mo16869a(this, content);
            return;
        }
        throw new IllegalStateException("The composition is disposed".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00a8 A[SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m44875g(Set<? extends Object> set, boolean z) {
        boolean z2;
        boolean z3;
        int m23577f;
        C44536lW1 m23568o;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        for (Object obj : set) {
            if (obj instanceof C46534os4) {
                ((C46534os4) obj).m20386t(null);
            } else {
                m44874h(this, z, objectRef, obj);
                C45722nW1<InterfaceC49574u01<?>> c45722nW1 = this.f75804j;
                m23577f = c45722nW1.m23577f(obj);
                if (m23577f >= 0) {
                    m23568o = c45722nW1.m23568o(m23577f);
                    int size = m23568o.size();
                    for (int i = 0; i < size; i++) {
                        m44874h(this, z, objectRef, (InterfaceC49574u01) m23568o.get(i));
                    }
                }
            }
        }
        if (z && (!this.f75803i.isEmpty())) {
            C45722nW1<C46534os4> c45722nW12 = this.f75802h;
            int m23573j = c45722nW12.m23573j();
            int i2 = 0;
            for (int i3 = 0; i3 < m23573j; i3++) {
                int i4 = c45722nW12.m23572k()[i3];
                C44536lW1<C46534os4> c44536lW1 = c45722nW12.m23574i()[i4];
                Intrinsics.checkNotNull(c44536lW1);
                int size2 = c44536lW1.size();
                int i5 = 0;
                for (int i6 = 0; i6 < size2; i6++) {
                    Object obj2 = c44536lW1.m27194f()[i6];
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    C46534os4 c46534os4 = (C46534os4) obj2;
                    if (!this.f75803i.contains(c46534os4)) {
                        HashSet hashSet = (HashSet) objectRef.element;
                        if (hashSet != null && hashSet.contains(c46534os4)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            z2 = false;
                            if (!z2) {
                                if (i5 != i6) {
                                    c44536lW1.m27194f()[i5] = obj2;
                                }
                                i5++;
                            }
                        }
                    }
                    z2 = true;
                    if (!z2) {
                    }
                }
                int size3 = c44536lW1.size();
                for (int i7 = i5; i7 < size3; i7++) {
                    c44536lW1.m27194f()[i7] = null;
                }
                c44536lW1.m27192j(i5);
                if (c44536lW1.size() > 0) {
                    if (i2 != i3) {
                        int i8 = c45722nW12.m23572k()[i2];
                        c45722nW12.m23572k()[i2] = i4;
                        c45722nW12.m23572k()[i3] = i8;
                    }
                    i2++;
                }
            }
            int m23573j2 = c45722nW12.m23573j();
            for (int i9 = i2; i9 < m23573j2; i9++) {
                c45722nW12.m23571l()[c45722nW12.m23572k()[i9]] = null;
            }
            c45722nW12.m23567p(i2);
            m44872m();
            this.f75803i.clear();
            return;
        }
        HashSet hashSet2 = (HashSet) objectRef.element;
        if (hashSet2 != null) {
            C45722nW1<C46534os4> c45722nW13 = this.f75802h;
            int m23573j3 = c45722nW13.m23573j();
            int i10 = 0;
            for (int i11 = 0; i11 < m23573j3; i11++) {
                int i12 = c45722nW13.m23572k()[i11];
                C44536lW1<C46534os4> c44536lW12 = c45722nW13.m23574i()[i12];
                Intrinsics.checkNotNull(c44536lW12);
                int size4 = c44536lW12.size();
                int i13 = 0;
                for (int i14 = 0; i14 < size4; i14++) {
                    Object obj3 = c44536lW12.m27194f()[i14];
                    Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    if (!hashSet2.contains((C46534os4) obj3)) {
                        if (i13 != i14) {
                            c44536lW12.m27194f()[i13] = obj3;
                        }
                        i13++;
                    }
                }
                int size5 = c44536lW12.size();
                for (int i15 = i13; i15 < size5; i15++) {
                    c44536lW12.m27194f()[i15] = null;
                }
                c44536lW12.m27192j(i13);
                if (c44536lW12.size() > 0) {
                    if (i10 != i11) {
                        int i16 = c45722nW13.m23572k()[i10];
                        c45722nW13.m23572k()[i10] = i12;
                        c45722nW13.m23572k()[i11] = i16;
                    }
                    i10++;
                }
            }
            int m23573j4 = c45722nW13.m23573j();
            for (int i17 = i10; i17 < m23573j4; i17++) {
                c45722nW13.m23571l()[c45722nW13.m23572k()[i17]] = null;
            }
            c45722nW13.m23567p(i10);
            m44872m();
        }
    }

    /* renamed from: i */
    public final void m44873i(List<Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit>> list) {
        boolean isEmpty;
        C19636a c19636a = new C19636a(this.f75800f);
        try {
            if (list.isEmpty()) {
                if (isEmpty) {
                    return;
                }
                return;
            }
            Object m61928a = C38949c66.f60129a.m61928a("Compose:applyChanges");
            this.f75797c.m26852d();
            C47343qE5 m24113z = this.f75801g.m24113z();
            try {
                InterfaceC25773lm<?> interfaceC25773lm = this.f75797c;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).invoke(interfaceC25773lm, m24113z, c19636a);
                }
                list.clear();
                Unit unit = Unit.INSTANCE;
                m24113z.m17843F();
                this.f75797c.mo8334c();
                C38949c66 c38949c66 = C38949c66.f60129a;
                c38949c66.m61927b(m61928a);
                c19636a.m44860h();
                c19636a.m44861g();
                c19636a.m44859i();
                if (this.f75809o) {
                    Object m61928a2 = c38949c66.m61928a("Compose:unobserve");
                    this.f75809o = false;
                    C45722nW1<C46534os4> c45722nW1 = this.f75802h;
                    int m23573j = c45722nW1.m23573j();
                    int i2 = 0;
                    for (int i3 = 0; i3 < m23573j; i3++) {
                        int i4 = c45722nW1.m23572k()[i3];
                        C44536lW1<C46534os4> c44536lW1 = c45722nW1.m23574i()[i4];
                        Intrinsics.checkNotNull(c44536lW1);
                        int size2 = c44536lW1.size();
                        int i5 = 0;
                        for (int i6 = 0; i6 < size2; i6++) {
                            Object obj = c44536lW1.m27194f()[i6];
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            if (!(!((C46534os4) obj).m20387s())) {
                                if (i5 != i6) {
                                    c44536lW1.m27194f()[i5] = obj;
                                }
                                i5++;
                            }
                        }
                        int size3 = c44536lW1.size();
                        for (int i7 = i5; i7 < size3; i7++) {
                            c44536lW1.m27194f()[i7] = null;
                        }
                        c44536lW1.m27192j(i5);
                        if (c44536lW1.size() > 0) {
                            if (i2 != i3) {
                                int i8 = c45722nW1.m23572k()[i2];
                                c45722nW1.m23572k()[i2] = i4;
                                c45722nW1.m23572k()[i3] = i8;
                            }
                            i2++;
                        }
                    }
                    int m23573j2 = c45722nW1.m23573j();
                    for (int i9 = i2; i9 < m23573j2; i9++) {
                        c45722nW1.m23571l()[c45722nW1.m23572k()[i9]] = null;
                    }
                    c45722nW1.m23567p(i2);
                    m44872m();
                    Unit unit2 = Unit.INSTANCE;
                    C38949c66.f60129a.m61927b(m61928a2);
                }
                if (this.f75806l.isEmpty()) {
                    c19636a.m44862f();
                }
            } catch (Throwable th) {
                m24113z.m17843F();
                throw th;
            }
        } finally {
            if (this.f75806l.isEmpty()) {
                c19636a.m44862f();
            }
        }
    }

    @Override // p000.InterfaceC45532nB0
    /* renamed from: j */
    public void mo24222j(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        try {
            synchronized (this.f75799e) {
                m44871r();
                C43943kW1<C46534os4, C44536lW1<Object>> m44879G = m44879G();
                try {
                    this.f75812r.m89535o0(m44879G, content);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e) {
                    this.f75808n = m44879G;
                    throw e;
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.f75800f.isEmpty()) {
                    new C19636a(this.f75800f).m44862f();
                }
                throw th;
            } catch (Exception e2) {
                m44878c();
                throw e2;
            }
        }
    }

    @Override // p000.InterfaceC45532nB0
    /* renamed from: k */
    public void mo24221k() {
        synchronized (this.f75799e) {
            try {
                if (!this.f75806l.isEmpty()) {
                    m44873i(this.f75806l);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                try {
                    if (!this.f75800f.isEmpty()) {
                        new C19636a(this.f75800f).m44862f();
                    }
                    throw th;
                } catch (Exception e) {
                    m44878c();
                    throw e;
                }
            }
        }
    }

    @Override // p000.InterfaceC45532nB0
    /* renamed from: l */
    public void mo24220l(List<Pair<C43351jW2, C43351jW2>> references) {
        Intrinsics.checkNotNullParameter(references, "references");
        int size = references.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                if (!Intrinsics.areEqual(references.get(i).getFirst().m30396b(), this)) {
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        C35528Qt0.m87818X(z);
        try {
            this.f75812r.m89613N0(references);
            Unit unit = Unit.INSTANCE;
        } finally {
        }
    }

    /* renamed from: m */
    public final void m44872m() {
        C45722nW1<InterfaceC49574u01<?>> c45722nW1 = this.f75804j;
        int m23573j = c45722nW1.m23573j();
        int i = 0;
        for (int i2 = 0; i2 < m23573j; i2++) {
            int i3 = c45722nW1.m23572k()[i2];
            C44536lW1<InterfaceC49574u01<?>> c44536lW1 = c45722nW1.m23574i()[i3];
            Intrinsics.checkNotNull(c44536lW1);
            int size = c44536lW1.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                Object obj = c44536lW1.m27194f()[i5];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (!(!this.f75802h.m23578e((InterfaceC49574u01) obj))) {
                    if (i4 != i5) {
                        c44536lW1.m27194f()[i4] = obj;
                    }
                    i4++;
                }
            }
            int size2 = c44536lW1.size();
            for (int i6 = i4; i6 < size2; i6++) {
                c44536lW1.m27194f()[i6] = null;
            }
            c44536lW1.m27192j(i4);
            if (c44536lW1.size() > 0) {
                if (i != i2) {
                    int i7 = c45722nW1.m23572k()[i];
                    c45722nW1.m23572k()[i] = i3;
                    c45722nW1.m23572k()[i2] = i7;
                }
                i++;
            }
        }
        int m23573j2 = c45722nW1.m23573j();
        for (int i8 = i; i8 < m23573j2; i8++) {
            c45722nW1.m23571l()[c45722nW1.m23572k()[i8]] = null;
        }
        c45722nW1.m23567p(i);
        Iterator<C46534os4> it = this.f75803i.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator()");
        while (it.hasNext()) {
            if (!it.next().m20385u()) {
                it.remove();
            }
        }
    }

    @Override // p000.InterfaceC45532nB0
    /* renamed from: n */
    public void mo24219n(C42758iW2 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        C19636a c19636a = new C19636a(this.f75800f);
        C47343qE5 m24113z = state.m33850a().m24113z();
        try {
            C35528Qt0.m87821U(m24113z, c19636a);
            Unit unit = Unit.INSTANCE;
            m24113z.m17843F();
            c19636a.m44860h();
            c19636a.m44861g();
        } catch (Throwable th) {
            m24113z.m17843F();
            throw th;
        }
    }

    @Override // p000.InterfaceC45532nB0
    /* renamed from: o */
    public boolean mo24218o() {
        boolean m89573b1;
        synchronized (this.f75799e) {
            m44871r();
            C43943kW1<C46534os4, C44536lW1<Object>> m44879G = m44879G();
            try {
                m89573b1 = this.f75812r.m89573b1(m44879G);
                if (!m89573b1) {
                    m44869y();
                }
            } catch (Exception e) {
                this.f75808n = m44879G;
                throw e;
            }
        }
        return m89573b1;
    }

    @Override // p000.InterfaceC45532nB0
    /* renamed from: p */
    public void mo24217p(Object value) {
        C46534os4 m89637F0;
        Object[] mo11108g;
        Intrinsics.checkNotNullParameter(value, "value");
        if (!m44868z() && (m89637F0 = this.f75812r.m89637F0()) != null) {
            m89637F0.m20407G(true);
            this.f75802h.m23580c(value, m89637F0);
            if (value instanceof InterfaceC49574u01) {
                this.f75804j.m23569n(value);
                for (Object obj : ((InterfaceC49574u01) value).mo11108g()) {
                    if (obj == null) {
                        break;
                    }
                    this.f75804j.m23580c(obj, value);
                }
            }
            m89637F0.m20383w(value);
        }
    }

    @Override // p000.InterfaceC45532nB0
    /* renamed from: q */
    public void mo24216q(Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f75812r.m89592U0(block);
    }

    /* renamed from: r */
    public final void m44871r() {
        Object andSet = this.f75798d.getAndSet(C40027du0.m43529c());
        if (andSet != null) {
            if (!Intrinsics.areEqual(andSet, C40027du0.m43529c())) {
                if (andSet instanceof Set) {
                    m44875g((Set) andSet, true);
                    return;
                } else if (andSet instanceof Object[]) {
                    for (Set<? extends Object> set : (Set[]) andSet) {
                        m44875g(set, true);
                    }
                    return;
                } else {
                    C35528Qt0.m87792x("corrupt pendingModifications drain: " + this.f75798d);
                    throw new KotlinNothingValueException();
                }
            }
            C35528Qt0.m87792x("pending composition has not been applied");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Set[]] */
    @Override // p000.InterfaceC45532nB0
    /* renamed from: s */
    public void mo24215s(Set<? extends Object> values) {
        Object obj;
        boolean areEqual;
        ?? plus;
        Set<? extends Object> set;
        Intrinsics.checkNotNullParameter(values, "values");
        do {
            obj = this.f75798d.get();
            if (obj == null) {
                areEqual = true;
            } else {
                areEqual = Intrinsics.areEqual(obj, C40027du0.m43529c());
            }
            if (areEqual) {
                set = values;
            } else if (obj instanceof Set) {
                set = new Set[]{(Set) obj, values};
            } else if (obj instanceof Object[]) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                plus = ArraysKt___ArraysJvmKt.plus((Set<? extends Object>[]) obj, values);
                set = plus;
            } else {
                throw new IllegalStateException(("corrupt pendingModifications: " + this.f75798d).toString());
            }
        } while (!C42482i24.m35337a(this.f75798d, obj, set));
        if (obj == null) {
            synchronized (this.f75799e) {
                m44869y();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // p000.InterfaceC45532nB0
    /* renamed from: t */
    public void mo24214t() {
        synchronized (this.f75799e) {
            try {
                m44873i(this.f75805k);
                m44869y();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                try {
                    if (!this.f75800f.isEmpty()) {
                        new C19636a(this.f75800f).m44862f();
                    }
                    throw th;
                } catch (Exception e) {
                    m44878c();
                    throw e;
                }
            }
        }
    }

    @Override // p000.InterfaceC45532nB0
    /* renamed from: u */
    public boolean mo24213u() {
        return this.f75812r.m89604Q0();
    }

    @Override // p000.InterfaceC45532nB0
    /* renamed from: v */
    public void mo24212v(Object value) {
        int m23577f;
        C44536lW1 m23568o;
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.f75799e) {
            m44883C(value);
            C45722nW1<InterfaceC49574u01<?>> c45722nW1 = this.f75804j;
            m23577f = c45722nW1.m23577f(value);
            if (m23577f >= 0) {
                m23568o = c45722nW1.m23568o(m23577f);
                int size = m23568o.size();
                for (int i = 0; i < size; i++) {
                    m44883C((InterfaceC49574u01) m23568o.get(i));
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p000.InterfaceC37166Xt0
    /* renamed from: w */
    public boolean mo44870w() {
        boolean z;
        synchronized (this.f75799e) {
            if (this.f75808n.m28895g() > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // p000.InterfaceC45532nB0
    /* renamed from: x */
    public void mo24211x() {
        Object[] m24119s;
        C46534os4 c46534os4;
        synchronized (this.f75799e) {
            for (Object obj : this.f75801g.m24119s()) {
                if (obj instanceof C46534os4) {
                    c46534os4 = (C46534os4) obj;
                } else {
                    c46534os4 = null;
                }
                if (c46534os4 != null) {
                    c46534os4.invalidate();
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: y */
    public final void m44869y() {
        Object andSet = this.f75798d.getAndSet(null);
        if (!Intrinsics.areEqual(andSet, C40027du0.m43529c())) {
            if (andSet instanceof Set) {
                m44875g((Set) andSet, false);
            } else if (andSet instanceof Object[]) {
                for (Set<? extends Object> set : (Set[]) andSet) {
                    m44875g(set, false);
                }
            } else if (andSet == null) {
                C35528Qt0.m87792x("calling recordModificationsOf and applyChanges concurrently is not supported");
                throw new KotlinNothingValueException();
            } else {
                C35528Qt0.m87792x("corrupt pendingModifications drain: " + this.f75798d);
                throw new KotlinNothingValueException();
            }
        }
    }

    /* renamed from: z */
    public final boolean m44868z() {
        return this.f75812r.m89643D0();
    }

    public /* synthetic */ C39435cu0(AbstractC37400Yt0 abstractC37400Yt0, InterfaceC25773lm interfaceC25773lm, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC37400Yt0, interfaceC25773lm, (i & 4) != 0 ? null : coroutineContext);
    }
}
