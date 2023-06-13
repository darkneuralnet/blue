package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import no.nordicsemi.android.ble.AbstractC26684u0;
import p000.InterfaceC32720Et0;
@Metadata(m28433d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0015\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0000\u0018\u0000 ·\u00012\u00020\u0001:\u0001xB\u0011\u0012\u0006\u0010p\u001a\u00020o¢\u0006\u0006\bµ\u0001\u0010¶\u0001J,\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\bH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u0013\u001a\u00020\bH\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0002J \u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0002J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0018\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002J\u0018\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0018\u0010!\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0002H\u0002J \u0010\"\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u001a\u0010$\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0002J\u0018\u0010'\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0002H\u0002J\u0018\u0010)\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0002J \u0010,\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0002J\u0010\u0010-\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0010\u0010/\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0002H\u0002J\u0014\u00101\u001a\u00020\u0002*\u0002002\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0010\u00102\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0014\u00104\u001a\u00020\u0002*\u0002002\u0006\u00103\u001a\u00020\u0002H\u0002J\u0014\u00105\u001a\u00020\u0002*\u0002002\u0006\u00103\u001a\u00020\u0002H\u0002J\u001c\u00106\u001a\u00020\b*\u0002002\u0006\u00103\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0002H\u0002J\u0014\u00107\u001a\u00020\u0002*\u0002002\u0006\u00103\u001a\u00020\u0002H\u0002J\u0014\u00108\u001a\u00020\u0002*\u0002002\u0006\u00103\u001a\u00020\u0002H\u0002J(\u0010;\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u0002H\u0002J \u0010=\u001a\u00020\u00022\u0006\u0010<\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u0002H\u0002J\u0018\u0010>\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0002H\u0002J\u0010\u0010?\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u000e\u0010@\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010A\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010B\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002J\u0010\u0010C\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010D\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002J\u0010\u0010E\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010F\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010G\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0002J\u0016\u0010H\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002J\u0010\u0010I\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u0002J\u0010\u0010K\u001a\u0004\u0018\u00010\u00012\u0006\u0010<\u001a\u00020JJ\u000e\u0010L\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002J\u0006\u0010M\u001a\u00020\bJ\u0006\u0010N\u001a\u00020\bJ\u0012\u0010O\u001a\u0004\u0018\u00010\u00012\b\u0010#\u001a\u0004\u0018\u00010\u0001J\u0010\u0010P\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u0001J\u0010\u0010Q\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u0001J\u0018\u0010R\u001a\u00020\b2\u0006\u0010<\u001a\u00020J2\b\u0010#\u001a\u0004\u0018\u00010\u0001J\u0010\u0010S\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u0001J\u001a\u0010T\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0001J\b\u0010U\u001a\u0004\u0018\u00010\u0001J\u0018\u0010V\u001a\u0004\u0018\u00010\u00012\u0006\u0010<\u001a\u00020J2\u0006\u0010\u0019\u001a\u00020\u0002J\u0018\u0010X\u001a\u0004\u0018\u00010\u00012\u0006\u0010W\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010Z\u001a\u00020\b2\u0006\u0010Y\u001a\u00020\u0002J\u0006\u0010[\u001a\u00020\bJ\u0006\u0010\\\u001a\u00020\bJ\u0006\u0010]\u001a\u00020\bJ\u0006\u0010^\u001a\u00020\bJ\u0018\u0010`\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010_\u001a\u0004\u0018\u00010\u0001J\u0018\u0010a\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001J\"\u0010b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001J\u0006\u0010c\u001a\u00020\u0002J\u000e\u0010d\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010e\u001a\u00020\b2\u0006\u0010<\u001a\u00020JJ\u0006\u0010f\u001a\u00020\u0002J\u0006\u0010g\u001a\u00020\u0005J\u000e\u0010i\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010hJ\u000e\u0010k\u001a\u00020\b2\u0006\u0010j\u001a\u00020\u0002J$\u0010n\u001a\b\u0012\u0004\u0012\u00020J0m2\u0006\u0010<\u001a\u00020J2\u0006\u0010j\u001a\u00020\u00022\u0006\u0010l\u001a\u00020\u0000J\u001c\u0010q\u001a\b\u0012\u0004\u0012\u00020J0m2\u0006\u0010p\u001a\u00020o2\u0006\u0010\u0019\u001a\u00020\u0002J$\u0010r\u001a\b\u0012\u0004\u0012\u00020J0m2\u0006\u0010j\u001a\u00020\u00022\u0006\u0010p\u001a\u00020o2\u0006\u0010\u0019\u001a\u00020\u0002J\u0010\u0010s\u001a\u00020J2\b\b\u0002\u0010\u0019\u001a\u00020\u0002J\u0010\u0010t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0002J\u000e\u0010u\u001a\u00020\u00022\u0006\u0010<\u001a\u00020JJ\b\u0010w\u001a\u00020vH\u0016R\u001a\u0010p\u001a\u00020o8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R\u0016\u0010~\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R!\u0010\u0082\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R+\u0010\u0087\u0001\u001a\u0014\u0012\u0004\u0012\u00020J0\u0083\u0001j\t\u0012\u0004\u0012\u00020J`\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u0089\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010=R\u0018\u0010\u008b\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010=R\u0018\u0010\u008d\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010=R\u0018\u0010\u008f\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010=R\u0018\u0010\u0091\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010=R\u0018\u0010\u0093\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0092\u0001\u0010=R\u0018\u0010\u0095\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010=R\u0018\u0010\u0097\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010=R\u0018\u0010\u0099\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010=R\u0018\u0010\u009b\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010=R\u0018\u0010\u009f\u0001\u001a\u00030\u009c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0018\u0010¡\u0001\u001a\u00030\u009c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0001\u0010\u009e\u0001R\u0018\u0010£\u0001\u001a\u00030\u009c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010\u009e\u0001R)\u0010¨\u0001\u001a\u00020\u00022\u0007\u0010¤\u0001\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b¥\u0001\u0010=\u001a\u0006\b¦\u0001\u0010§\u0001R(\u0010\u0015\u001a\u00020\u00022\u0007\u0010¤\u0001\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b©\u0001\u0010=\u001a\u0006\bª\u0001\u0010§\u0001R)\u0010®\u0001\u001a\u00020\u00052\u0007\u0010¤\u0001\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b«\u0001\u0010-\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u001b\u0010±\u0001\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u0016\u0010:\u001a\u00020\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b²\u0001\u0010§\u0001R\u0013\u0010\u0006\u001a\u00020\u00058F¢\u0006\b\u001a\u0006\b³\u0001\u0010\u00ad\u0001R\u0016\u0010\u001c\u001a\u00020\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b´\u0001\u0010§\u0001¨\u0006¸\u0001"}, m28432d2 = {"LqE5;", "", "", "key", "objectKey", "", "isNode", "aux", "", "V0", "group", "H", "G", "C0", "a1", "LS24;", "set", "b1", "E", "J0", "I0", "parent", "endGroup", "firstChild", "R", "index", "q0", "s0", "size", "h0", "i0", "start", "len", "F0", "G0", "value", "f1", "previousGapStart", "newGapStart", "Y0", "gapStart", "D0", "originalLocation", "newLocation", "n0", "Z", "dataIndex", "L", "", "z0", "J", PaymentMethod.BillingDetails.PARAM_ADDRESS, "K", "R0", "c1", "x0", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "gapLen", "capacity", "M", "anchor", "I", "B0", "A0", "k0", "w0", "a0", "b0", "c0", "Y", "g0", "e0", "f0", AbstractC26684u0.f100690q, "Ldb;", "v0", "y0", "F", "H0", "X0", "Z0", "e1", "d1", "L0", "K0", "M0", "Q0", "groupIndex", "P0", "amount", "z", "O0", "D", "O", "T0", "dataKey", "U0", "W0", "S0", "N", "P", "Q", "N0", "E0", "", "d0", "offset", "p0", "writer", "", "t0", "LnE5;", "table", "o0", "r0", "A", "l0", "B", "", "toString", C17296a.f69688o, "LnE5;", "X", "()LnE5;", "b", "[I", "groups", "", "c", "[Ljava/lang/Object;", "slots", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/ArrayList;", "anchors", "e", "groupGapStart", "f", "groupGapLen", "g", "currentGroupEnd", "h", "currentSlot", "i", "currentSlotEnd", "j", "slotsGapStart", "k", "slotsGapLen", "l", "slotsGapOwner", "m", "insertCount", "n", "nodeCount", "LJ52;", "o", "LJ52;", "startStack", "p", "endStack", "q", "nodeCountStack", "<set-?>", "r", "U", "()I", "currentGroup", "s", "V", "t", "T", "()Z", "closed", "u", "LS24;", "pendingRecalculateMarks", "S", "j0", "W", "<init>", "(LnE5;)V", "v", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 6 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,3443:1\n4513#2,5:3444\n4513#2,5:3449\n4513#2,5:3454\n4513#2,5:3459\n4513#2,5:3465\n4513#2,5:3470\n4513#2,5:3475\n4513#2,5:3480\n4513#2,5:3485\n4513#2,5:3490\n4513#2,5:3495\n4513#2,5:3500\n4513#2,5:3505\n4513#2,5:3510\n4513#2,5:3515\n4513#2,5:3520\n4513#2,5:3525\n4513#2,5:3530\n4513#2,5:3543\n4513#2,5:3562\n4513#2,5:3567\n4513#2,5:3572\n1#3:3464\n162#4,8:3535\n162#4,8:3548\n3323#5,6:3556\n33#6,6:3577\n82#6,3:3583\n33#6,4:3586\n85#6,2:3590\n38#6:3592\n87#6:3593\n231#6,3:3594\n64#6,4:3597\n234#6,2:3601\n69#6:3603\n236#6:3604\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n*L\n1346#1:3444,5\n1370#1:3449,5\n1383#1:3454,5\n1386#1:3459,5\n1426#1:3465,5\n1441#1:3470,5\n1488#1:3475,5\n1493#1:3480,5\n1533#1:3485,5\n1544#1:3490,5\n1671#1:3495,5\n1747#1:3500,5\n1752#1:3505,5\n1784#1:3510,5\n1827#1:3515,5\n1828#1:3520,5\n1841#1:3525,5\n1935#1:3530,5\n2210#1:3543,5\n2500#1:3562,5\n2512#1:3567,5\n2703#1:3572,5\n2193#1:3535,8\n2282#1:3548,8\n2302#1:3556,6\n2799#1:3577,6\n2969#1:3583,3\n2969#1:3586,4\n2969#1:3590,2\n2969#1:3592\n2969#1:3593\n2972#1:3594,3\n2972#1:3597,4\n2972#1:3601,2\n2972#1:3603\n2972#1:3604\n*E\n"})
/* renamed from: qE5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47343qE5 {

    /* renamed from: v */
    public static final C27559a f104962v = new C27559a(null);

    /* renamed from: a */
    public final C45564nE5 f104963a;

    /* renamed from: b */
    public int[] f104964b;

    /* renamed from: c */
    public Object[] f104965c;

    /* renamed from: d */
    public ArrayList<C19797db> f104966d;

    /* renamed from: e */
    public int f104967e;

    /* renamed from: f */
    public int f104968f;

    /* renamed from: g */
    public int f104969g;

    /* renamed from: h */
    public int f104970h;

    /* renamed from: i */
    public int f104971i;

    /* renamed from: j */
    public int f104972j;

    /* renamed from: k */
    public int f104973k;

    /* renamed from: l */
    public int f104974l;

    /* renamed from: m */
    public int f104975m;

    /* renamed from: n */
    public int f104976n;

    /* renamed from: o */
    public final J52 f104977o;

    /* renamed from: p */
    public final J52 f104978p;

    /* renamed from: q */
    public final J52 f104979q;

    /* renamed from: r */
    public int f104980r;

    /* renamed from: s */
    public int f104981s;

    /* renamed from: t */
    public boolean f104982t;

    /* renamed from: u */
    public S24 f104983u;

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ6\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¨\u0006\u000f"}, m28432d2 = {"LqE5$a;", "", "LqE5;", "fromWriter", "", "fromIndex", "toWriter", "", "updateFromCursor", "updateToCursor", "", "Ldb;", "b", "<init>", "()V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,3443:1\n1#2:3444\n4513#3,5:3445\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n*L\n2089#1:3445,5\n*E\n"})
    /* renamed from: qE5$a */
    /* loaded from: classes.dex */
    public static final class C27559a {
        public /* synthetic */ C27559a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final List<C19797db> m17742b(C47343qE5 c47343qE5, int i, C47343qE5 c47343qE52, boolean z, boolean z2) {
            int i2;
            int m19779N;
            int m19779N2;
            List<C19797db> emptyList;
            ArrayList arrayList;
            boolean z3;
            boolean m19781L;
            int m19779N3;
            int i3;
            int m19775R;
            int m17794c0 = c47343qE5.m17794c0(i);
            int i4 = i + m17794c0;
            int m17835J = c47343qE5.m17835J(i);
            int m17835J2 = c47343qE5.m17835J(i4);
            int i5 = m17835J2 - m17835J;
            boolean m17841G = c47343qE5.m17841G(i);
            c47343qE52.m17780h0(m17794c0);
            c47343qE52.m17778i0(i5, c47343qE52.m17813U());
            if (c47343qE5.f104967e < i4) {
                c47343qE5.m17762q0(i4);
            }
            if (c47343qE5.f104972j < m17835J2) {
                c47343qE5.m17758s0(m17835J2, i4);
            }
            int[] iArr = c47343qE52.f104964b;
            int m17813U = c47343qE52.m17813U();
            ArraysKt___ArraysJvmKt.copyInto(c47343qE5.f104964b, iArr, m17813U * 5, i * 5, i4 * 5);
            Object[] objArr = c47343qE52.f104965c;
            int i6 = c47343qE52.f104970h;
            ArraysKt___ArraysJvmKt.copyInto(c47343qE5.f104965c, objArr, i6, m17835J, m17835J2);
            int m17811V = c47343qE52.m17811V();
            C46750pE5.m19767Z(iArr, m17813U, m17811V);
            int i7 = m17813U - i;
            int i8 = m17813U + m17794c0;
            int m17833K = i6 - c47343qE52.m17833K(iArr, m17813U);
            int i9 = c47343qE52.f104974l;
            int i10 = c47343qE52.f104973k;
            int length = objArr.length;
            int i11 = i9;
            int i12 = m17813U;
            while (true) {
                i2 = 0;
                if (i12 >= i8) {
                    break;
                }
                if (i12 != m17813U) {
                    m19775R = C46750pE5.m19775R(iArr, i12);
                    i3 = i8;
                    C46750pE5.m19767Z(iArr, i12, m19775R + i7);
                } else {
                    i3 = i8;
                }
                int m17833K2 = c47343qE52.m17833K(iArr, i12) + m17833K;
                if (i11 >= i12) {
                    i2 = c47343qE52.f104972j;
                }
                int i13 = m17833K;
                C46750pE5.m19771V(iArr, i12, c47343qE52.m17829M(m17833K2, i2, i10, length));
                if (i12 == i11) {
                    i11++;
                }
                i12++;
                m17833K = i13;
                i8 = i3;
            }
            int i14 = i8;
            c47343qE52.f104974l = i11;
            m19779N = C46750pE5.m19779N(c47343qE5.f104966d, i, c47343qE5.m17809W());
            m19779N2 = C46750pE5.m19779N(c47343qE5.f104966d, i4, c47343qE5.m17809W());
            if (m19779N < m19779N2) {
                ArrayList arrayList2 = c47343qE5.f104966d;
                ArrayList arrayList3 = new ArrayList(m19779N2 - m19779N);
                for (int i15 = m19779N; i15 < m19779N2; i15++) {
                    Object obj = arrayList2.get(i15);
                    Intrinsics.checkNotNullExpressionValue(obj, "sourceAnchors[anchorIndex]");
                    C19797db c19797db = (C19797db) obj;
                    c19797db.m44093c(c19797db.m44095a() + i7);
                    arrayList3.add(c19797db);
                }
                m19779N3 = C46750pE5.m19779N(c47343qE52.f104966d, c47343qE52.m17813U(), c47343qE52.m17809W());
                c47343qE52.f104966d.addAll(m19779N3, arrayList3);
                arrayList2.subList(m19779N, m19779N2).clear();
                arrayList = arrayList3;
            } else {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                arrayList = emptyList;
            }
            int m17746y0 = c47343qE5.m17746y0(i);
            int i16 = 1;
            if (z) {
                if (m17746y0 >= 0) {
                    i2 = 1;
                }
                if (i2 != 0) {
                    c47343qE5.m17814T0();
                    c47343qE5.m17745z(m17746y0 - c47343qE5.m17813U());
                    c47343qE5.m17814T0();
                }
                c47343qE5.m17745z(i - c47343qE5.m17813U());
                z3 = c47343qE5.m17844E0();
                if (i2 != 0) {
                    c47343qE5.m17824O0();
                    c47343qE5.m17827N();
                    c47343qE5.m17824O0();
                    c47343qE5.m17827N();
                }
            } else {
                boolean m17842F0 = c47343qE5.m17842F0(i, m17794c0);
                c47343qE5.m17840G0(m17835J, i5, i - 1);
                z3 = m17842F0;
            }
            if (!z3) {
                int i17 = c47343qE52.f104976n;
                m19781L = C46750pE5.m19781L(iArr, m17813U);
                if (!m19781L) {
                    i16 = C46750pE5.m19778O(iArr, m17813U);
                }
                c47343qE52.f104976n = i17 + i16;
                if (z2) {
                    c47343qE52.f104980r = i14;
                    c47343qE52.f104970h = i6 + i5;
                }
                if (m17841G) {
                    c47343qE52.m17799a1(m17811V);
                }
                return arrayList;
            }
            C35528Qt0.m87792x("Unexpectedly removed anchors".toString());
            throw new KotlinNothingValueException();
        }

        private C27559a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m28432d2 = {"qE5$b", "", "", "", "hasNext", "next", "", "b", "I", "getCurrent", "()I", "setCurrent", "(I)V", "current", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: qE5$b */
    /* loaded from: classes.dex */
    public static final class C27560b implements Iterator<Object>, KMappedMarker {

        /* renamed from: b */
        public int f104984b;

        /* renamed from: c */
        public final /* synthetic */ int f104985c;

        /* renamed from: d */
        public final /* synthetic */ C47343qE5 f104986d;

        public C27560b(int i, int i2, C47343qE5 c47343qE5) {
            this.f104985c = i2;
            this.f104986d = c47343qE5;
            this.f104984b = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f104984b < this.f104985c;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext()) {
                Object[] objArr = this.f104986d.f104965c;
                C47343qE5 c47343qE5 = this.f104986d;
                int i = this.f104984b;
                this.f104984b = i + 1;
                return objArr[c47343qE5.m17831L(i)];
            }
            return null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C47343qE5(C45564nE5 table) {
        Intrinsics.checkNotNullParameter(table, "table");
        this.f104963a = table;
        this.f104964b = table.m24121j();
        this.f104965c = table.m24119s();
        this.f104966d = table.m24122h();
        this.f104967e = table.m24120o();
        this.f104968f = (this.f104964b.length / 5) - table.m24120o();
        this.f104969g = table.m24120o();
        this.f104972j = table.m24118u();
        this.f104973k = this.f104965c.length - table.m24118u();
        this.f104974l = table.m24120o();
        this.f104977o = new J52();
        this.f104978p = new J52();
        this.f104979q = new J52();
        this.f104981s = -1;
    }

    /* renamed from: m0 */
    public static /* synthetic */ void m17770m0(C47343qE5 c47343qE5, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c47343qE5.f104981s;
        }
        c47343qE5.m17772l0(i);
    }

    /* renamed from: A */
    public final C19797db m17853A(int i) {
        int m19774S;
        ArrayList<C19797db> arrayList = this.f104966d;
        m19774S = C46750pE5.m19774S(arrayList, i, m17809W());
        if (m19774S < 0) {
            if (i > this.f104967e) {
                i = -(m17809W() - i);
            }
            C19797db c19797db = new C19797db(i);
            arrayList.add(-(m19774S + 1), c19797db);
            return c19797db;
        }
        C19797db c19797db2 = arrayList.get(m19774S);
        Intrinsics.checkNotNullExpressionValue(c19797db2, "get(location)");
        return c19797db2;
    }

    /* renamed from: A0 */
    public final int m17852A0(int i) {
        return i > -2 ? i : m17809W() + i + 2;
    }

    /* renamed from: B */
    public final int m17851B(C19797db anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        int m44095a = anchor.m44095a();
        if (m44095a < 0) {
            return m44095a + m17809W();
        }
        return m44095a;
    }

    /* renamed from: B0 */
    public final int m17850B0(int i, int i2) {
        return i < i2 ? i : -((m17809W() - i) + 2);
    }

    /* renamed from: C */
    public final int m17849C(int[] iArr, int i) {
        int m19787F;
        int m19789D;
        int m17833K = m17833K(iArr, i);
        m19787F = C46750pE5.m19787F(iArr, i);
        m19789D = C46750pE5.m19789D(m19787F >> 29);
        return m17833K + m19789D;
    }

    /* renamed from: C0 */
    public final void m17848C0() {
        S24 s24 = this.f104983u;
        if (s24 != null) {
            while (s24.m86071b()) {
                m17796b1(s24.m86069d(), s24);
            }
        }
    }

    /* renamed from: D */
    public final void m17847D() {
        int i = this.f104975m;
        this.f104975m = i + 1;
        if (i == 0) {
            m17834J0();
        }
    }

    /* renamed from: D0 */
    public final boolean m17846D0(int i, int i2) {
        int m19779N;
        int i3 = i2 + i;
        m19779N = C46750pE5.m19779N(this.f104966d, i3, m17817S() - this.f104968f);
        if (m19779N >= this.f104966d.size()) {
            m19779N--;
        }
        int i4 = m19779N + 1;
        boolean z = false;
        int i5 = 0;
        while (m19779N >= 0) {
            C19797db c19797db = this.f104966d.get(m19779N);
            Intrinsics.checkNotNullExpressionValue(c19797db, "anchors[index]");
            C19797db c19797db2 = c19797db;
            int m17851B = m17851B(c19797db2);
            if (m17851B < i) {
                break;
            }
            if (m17851B < i3) {
                c19797db2.m44093c(Integer.MIN_VALUE);
                if (i5 == 0) {
                    i5 = m19779N + 1;
                }
                i4 = m19779N;
            }
            m19779N--;
        }
        if (i4 < i5) {
            z = true;
        }
        if (z) {
            this.f104966d.subList(i4, i5).clear();
        }
        return z;
    }

    /* renamed from: E */
    public final boolean m17845E(int i) {
        boolean m19791B;
        int i2 = i + 1;
        int m17794c0 = i + m17794c0(i);
        while (i2 < m17794c0) {
            m19791B = C46750pE5.m19791B(this.f104964b, m17803Z(i2));
            if (m19791B) {
                return true;
            }
            i2 += m17794c0(i2);
        }
        return false;
    }

    /* renamed from: E0 */
    public final boolean m17844E0() {
        boolean z;
        if (this.f104975m == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = this.f104980r;
            int i2 = this.f104970h;
            int m17826N0 = m17826N0();
            S24 s24 = this.f104983u;
            if (s24 != null) {
                while (s24.m86071b() && s24.m86070c() >= i) {
                    s24.m86069d();
                }
            }
            boolean m17842F0 = m17842F0(i, this.f104980r - i);
            m17840G0(i2, this.f104970h - i2, i - 1);
            this.f104980r = i;
            this.f104970h = i2;
            this.f104976n -= m17826N0;
            return m17842F0;
        }
        C35528Qt0.m87792x("Cannot remove group while inserting".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: F */
    public final void m17843F() {
        this.f104982t = true;
        if (this.f104977o.m101185d()) {
            m17762q0(m17809W());
            m17758s0(this.f104965c.length - this.f104973k, this.f104967e);
            m17848C0();
        }
        this.f104963a.m24124e(this, this.f104964b, this.f104967e, this.f104965c, this.f104972j, this.f104966d);
    }

    /* renamed from: F0 */
    public final boolean m17842F0(int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList<C19797db> arrayList = this.f104966d;
            m17762q0(i);
            if (!arrayList.isEmpty()) {
                z = m17846D0(i, i2);
            }
            this.f104967e = i;
            this.f104968f += i2;
            int i3 = this.f104974l;
            if (i3 > i) {
                this.f104974l = Math.max(i, i3 - i2);
            }
            int i4 = this.f104969g;
            if (i4 >= this.f104967e) {
                this.f104969g = i4 - i2;
            }
            if (m17839H(this.f104981s)) {
                m17799a1(this.f104981s);
            }
        }
        return z;
    }

    /* renamed from: G */
    public final boolean m17841G(int i) {
        boolean m19791B;
        if (i >= 0) {
            m19791B = C46750pE5.m19791B(this.f104964b, m17803Z(i));
            if (m19791B) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: G0 */
    public final void m17840G0(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.f104973k;
            int i5 = i + i2;
            m17758s0(i5, i3);
            this.f104972j = i;
            this.f104973k = i4 + i2;
            ArraysKt___ArraysJvmKt.fill(this.f104965c, (Object) null, i, i5);
            int i6 = this.f104971i;
            if (i6 >= i) {
                this.f104971i = i6 - i2;
            }
        }
    }

    /* renamed from: H */
    public final boolean m17839H(int i) {
        boolean m19790C;
        if (i >= 0) {
            m19790C = C46750pE5.m19790C(this.f104964b, m17803Z(i));
            if (m19790C) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: H0 */
    public final void m17838H0() {
        boolean z;
        if (this.f104975m == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m17848C0();
            this.f104980r = 0;
            this.f104969g = m17817S() - this.f104968f;
            this.f104970h = 0;
            this.f104971i = 0;
            this.f104976n = 0;
            return;
        }
        C35528Qt0.m87792x("Cannot reset when inserting".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: I */
    public final int m17837I(int i, int i2, int i3) {
        return i < 0 ? (i3 - i2) + i + 1 : i;
    }

    /* renamed from: I0 */
    public final int m17836I0() {
        int m17817S = (m17817S() - this.f104968f) - this.f104978p.m101181h();
        this.f104969g = m17817S;
        return m17817S;
    }

    /* renamed from: J */
    public final int m17835J(int i) {
        return m17833K(this.f104964b, m17803Z(i));
    }

    /* renamed from: J0 */
    public final void m17834J0() {
        this.f104978p.m101180i((m17817S() - this.f104968f) - this.f104969g);
    }

    /* renamed from: K */
    public final int m17833K(int[] iArr, int i) {
        int m19788E;
        if (i >= m17817S()) {
            return this.f104965c.length - this.f104973k;
        }
        m19788E = C46750pE5.m19788E(iArr, i);
        return m17837I(m19788E, this.f104973k, this.f104965c.length);
    }

    /* renamed from: K0 */
    public final Object m17832K0(int i, Object obj) {
        int m17818R0 = m17818R0(this.f104964b, m17803Z(this.f104980r));
        boolean z = true;
        int i2 = m17818R0 + i;
        if ((i2 < m17818R0 || i2 >= m17833K(this.f104964b, m17803Z(this.f104980r + 1))) ? false : false) {
            int m17831L = m17831L(i2);
            Object[] objArr = this.f104965c;
            Object obj2 = objArr[m17831L];
            objArr[m17831L] = obj;
            return obj2;
        }
        C35528Qt0.m87792x(("Write to an invalid slot index " + i + " for group " + this.f104980r).toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: L */
    public final int m17831L(int i) {
        return i < this.f104972j ? i : i + this.f104973k;
    }

    /* renamed from: L0 */
    public final void m17830L0(Object obj) {
        boolean z;
        int i = this.f104970h;
        if (i <= this.f104971i) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f104965c[m17831L(i - 1)] = obj;
        } else {
            C35528Qt0.m87792x("Writing to an invalid slot".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: M */
    public final int m17829M(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    /* renamed from: M0 */
    public final Object m17828M0() {
        if (this.f104975m > 0) {
            m17778i0(1, this.f104981s);
        }
        Object[] objArr = this.f104965c;
        int i = this.f104970h;
        this.f104970h = i + 1;
        return objArr[m17831L(i)];
    }

    /* renamed from: N */
    public final int m17827N() {
        boolean z;
        boolean m19781L;
        int m19786G;
        int m19778O;
        int i;
        boolean m19781L2;
        int m19778O2;
        int m19786G2;
        int i2 = 1;
        int i3 = 0;
        if (this.f104975m > 0) {
            z = true;
        } else {
            z = false;
        }
        int i4 = this.f104980r;
        int i5 = this.f104969g;
        int i6 = this.f104981s;
        int m17803Z = m17803Z(i6);
        int i7 = this.f104976n;
        int i8 = i4 - i6;
        m19781L = C46750pE5.m19781L(this.f104964b, m17803Z);
        if (z) {
            C46750pE5.m19770W(this.f104964b, m17803Z, i8);
            C46750pE5.m19768Y(this.f104964b, m17803Z, i7);
            int m101181h = this.f104979q.m101181h();
            if (!m19781L) {
                i2 = i7;
            }
            this.f104976n = m101181h + i2;
            this.f104981s = m17744z0(this.f104964b, i6);
        } else {
            if (i4 != i5) {
                i2 = 0;
            }
            if (i2 != 0) {
                m19786G = C46750pE5.m19786G(this.f104964b, m17803Z);
                m19778O = C46750pE5.m19778O(this.f104964b, m17803Z);
                C46750pE5.m19770W(this.f104964b, m17803Z, i8);
                C46750pE5.m19768Y(this.f104964b, m17803Z, i7);
                int m101181h2 = this.f104977o.m101181h();
                m17836I0();
                this.f104981s = m101181h2;
                int m17744z0 = m17744z0(this.f104964b, i6);
                int m101181h3 = this.f104979q.m101181h();
                this.f104976n = m101181h3;
                if (m17744z0 == m101181h2) {
                    if (!m19781L) {
                        i3 = i7 - m19778O;
                    }
                    this.f104976n = m101181h3 + i3;
                } else {
                    int i9 = i8 - m19786G;
                    if (m19781L) {
                        i = 0;
                    } else {
                        i = i7 - m19778O;
                    }
                    if (i9 != 0 || i != 0) {
                        while (m17744z0 != 0 && m17744z0 != m101181h2 && (i != 0 || i9 != 0)) {
                            int m17803Z2 = m17803Z(m17744z0);
                            if (i9 != 0) {
                                m19786G2 = C46750pE5.m19786G(this.f104964b, m17803Z2);
                                C46750pE5.m19770W(this.f104964b, m17803Z2, m19786G2 + i9);
                            }
                            if (i != 0) {
                                int[] iArr = this.f104964b;
                                m19778O2 = C46750pE5.m19778O(iArr, m17803Z2);
                                C46750pE5.m19768Y(iArr, m17803Z2, m19778O2 + i);
                            }
                            m19781L2 = C46750pE5.m19781L(this.f104964b, m17803Z2);
                            if (m19781L2) {
                                i = 0;
                            }
                            m17744z0 = m17744z0(this.f104964b, m17744z0);
                        }
                    }
                    this.f104976n += i;
                }
            } else {
                C35528Qt0.m87792x("Expected to be at the end of a group".toString());
                throw new KotlinNothingValueException();
            }
        }
        return i7;
    }

    /* renamed from: N0 */
    public final int m17826N0() {
        int m19786G;
        boolean m19781L;
        int m19778O;
        int m17803Z = m17803Z(this.f104980r);
        int i = this.f104980r;
        m19786G = C46750pE5.m19786G(this.f104964b, m17803Z);
        int i2 = i + m19786G;
        this.f104980r = i2;
        this.f104970h = m17833K(this.f104964b, m17803Z(i2));
        m19781L = C46750pE5.m19781L(this.f104964b, m17803Z);
        if (m19781L) {
            return 1;
        }
        m19778O = C46750pE5.m19778O(this.f104964b, m17803Z);
        return m19778O;
    }

    /* renamed from: O */
    public final void m17825O() {
        boolean z;
        int i = this.f104975m;
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = i - 1;
            this.f104975m = i2;
            if (i2 == 0) {
                if (this.f104979q.m101187b() != this.f104977o.m101187b()) {
                    z2 = false;
                }
                if (z2) {
                    m17836I0();
                    return;
                } else {
                    C35528Qt0.m87792x("startGroup/endGroup mismatch while inserting".toString());
                    throw new KotlinNothingValueException();
                }
            }
            return;
        }
        throw new IllegalStateException("Unbalanced begin/end insert".toString());
    }

    /* renamed from: O0 */
    public final void m17824O0() {
        int i = this.f104969g;
        this.f104980r = i;
        this.f104970h = m17833K(this.f104964b, m17803Z(i));
    }

    /* renamed from: P */
    public final void m17823P(int i) {
        boolean z;
        boolean z2 = true;
        if (this.f104975m <= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = this.f104981s;
            if (i2 != i) {
                if (i < i2 || i >= this.f104969g) {
                    z2 = false;
                }
                if (z2) {
                    int i3 = this.f104980r;
                    int i4 = this.f104970h;
                    int i5 = this.f104971i;
                    this.f104980r = i;
                    m17814T0();
                    this.f104980r = i3;
                    this.f104970h = i4;
                    this.f104971i = i5;
                    return;
                }
                C35528Qt0.m87792x(("Started group at " + i + " must be a subgroup of the group at " + i2).toString());
                throw new KotlinNothingValueException();
            }
            return;
        }
        C35528Qt0.m87792x("Cannot call ensureStarted() while inserting".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: P0 */
    public final Object m17822P0(int i, int i2) {
        int m17818R0 = m17818R0(this.f104964b, m17803Z(i));
        boolean z = true;
        int m17833K = m17833K(this.f104964b, m17803Z(i + 1));
        int i3 = i2 + m17818R0;
        if (m17818R0 > i3 || i3 >= m17833K) {
            z = false;
        }
        if (!z) {
            return InterfaceC32720Et0.f8257a.m108267a();
        }
        return this.f104965c[m17831L(i3)];
    }

    /* renamed from: Q */
    public final void m17821Q(C19797db anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        m17823P(anchor.m44091e(this));
    }

    /* renamed from: Q0 */
    public final Object m17820Q0(C19797db anchor, int i) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        return m17822P0(m17851B(anchor), i);
    }

    /* renamed from: R */
    public final void m17819R(int i, int i2, int i3) {
        int m19786G;
        int m17850B0 = m17850B0(i, this.f104967e);
        while (i3 < i2) {
            C46750pE5.m19767Z(this.f104964b, m17803Z(i3), m17850B0);
            m19786G = C46750pE5.m19786G(this.f104964b, m17803Z(i3));
            int i4 = m19786G + i3;
            m17819R(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    /* renamed from: R0 */
    public final int m17818R0(int[] iArr, int i) {
        int m19773T;
        if (i >= m17817S()) {
            return this.f104965c.length - this.f104973k;
        }
        m19773T = C46750pE5.m19773T(iArr, i);
        return m17837I(m19773T, this.f104973k, this.f104965c.length);
    }

    /* renamed from: S */
    public final int m17817S() {
        return this.f104964b.length / 5;
    }

    /* renamed from: S0 */
    public final void m17816S0(int i, Object obj, Object obj2) {
        m17810V0(i, obj, false, obj2);
    }

    /* renamed from: T */
    public final boolean m17815T() {
        return this.f104982t;
    }

    /* renamed from: T0 */
    public final void m17814T0() {
        boolean z;
        if (this.f104975m == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            InterfaceC32720Et0.C2012a c2012a = InterfaceC32720Et0.f8257a;
            m17810V0(0, c2012a.m108267a(), false, c2012a.m108267a());
            return;
        }
        C35528Qt0.m87792x("Key must be supplied when inserting".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: U */
    public final int m17813U() {
        return this.f104980r;
    }

    /* renamed from: U0 */
    public final void m17812U0(int i, Object obj) {
        m17810V0(i, obj, false, InterfaceC32720Et0.f8257a.m108267a());
    }

    /* renamed from: V */
    public final int m17811V() {
        return this.f104981s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: V0 */
    public final void m17810V0(int i, Object obj, boolean z, Object obj2) {
        Object[] objArr;
        int m19778O;
        int m19786G;
        int i2;
        int i3;
        int i4;
        if (this.f104975m > 0) {
            objArr = 1;
        } else {
            objArr = null;
        }
        this.f104979q.m101180i(this.f104976n);
        if (objArr != null) {
            m17780h0(1);
            int i5 = this.f104980r;
            int m17803Z = m17803Z(i5);
            InterfaceC32720Et0.C2012a c2012a = InterfaceC32720Et0.f8257a;
            if (obj != c2012a.m108267a()) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (!z && obj2 != c2012a.m108267a()) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            C46750pE5.m19782K(this.f104964b, m17803Z, i, z, i3, i4, this.f104981s, this.f104970h);
            this.f104971i = this.f104970h;
            int i6 = (z ? 1 : 0) + i3 + i4;
            if (i6 > 0) {
                m17778i0(i6, i5);
                Object[] objArr2 = this.f104965c;
                int i7 = this.f104970h;
                if (z) {
                    objArr2[i7] = obj2;
                    i7++;
                }
                if (i3 != 0) {
                    objArr2[i7] = obj;
                    i7++;
                }
                if (i4 != 0) {
                    objArr2[i7] = obj2;
                    i7++;
                }
                this.f104970h = i7;
            }
            this.f104976n = 0;
            i2 = i5 + 1;
            this.f104981s = i5;
            this.f104980r = i2;
        } else {
            this.f104977o.m101180i(this.f104981s);
            m17834J0();
            int i8 = this.f104980r;
            int m17803Z2 = m17803Z(i8);
            if (!Intrinsics.areEqual(obj2, InterfaceC32720Et0.f8257a.m108267a())) {
                if (z) {
                    m17787e1(obj2);
                } else {
                    m17802Z0(obj2);
                }
            }
            this.f104970h = m17818R0(this.f104964b, m17803Z2);
            this.f104971i = m17833K(this.f104964b, m17803Z(this.f104980r + 1));
            m19778O = C46750pE5.m19778O(this.f104964b, m17803Z2);
            this.f104976n = m19778O;
            this.f104981s = i8;
            this.f104980r = i8 + 1;
            m19786G = C46750pE5.m19786G(this.f104964b, m17803Z2);
            i2 = i8 + m19786G;
        }
        this.f104969g = i2;
    }

    /* renamed from: W */
    public final int m17809W() {
        return m17817S() - this.f104968f;
    }

    /* renamed from: W0 */
    public final void m17808W0(int i, Object obj) {
        m17810V0(i, obj, true, InterfaceC32720Et0.f8257a.m108267a());
    }

    /* renamed from: X */
    public final C45564nE5 m17807X() {
        return this.f104963a;
    }

    /* renamed from: X0 */
    public final Object m17806X0(Object obj) {
        Object m17828M0 = m17828M0();
        m17830L0(obj);
        return m17828M0;
    }

    /* renamed from: Y */
    public final Object m17805Y(int i) {
        boolean m19785H;
        int m17803Z = m17803Z(i);
        m19785H = C46750pE5.m19785H(this.f104964b, m17803Z);
        if (m19785H) {
            return this.f104965c[m17849C(this.f104964b, m17803Z)];
        }
        return InterfaceC32720Et0.f8257a.m108267a();
    }

    /* renamed from: Y0 */
    public final void m17804Y0(int i, int i2) {
        int m19779N;
        int m19779N2;
        int i3;
        int m17817S = m17817S() - this.f104968f;
        if (i < i2) {
            for (m19779N2 = C46750pE5.m19779N(this.f104966d, i, m17817S); m19779N2 < this.f104966d.size(); m19779N2++) {
                C19797db c19797db = this.f104966d.get(m19779N2);
                Intrinsics.checkNotNullExpressionValue(c19797db, "anchors[index]");
                C19797db c19797db2 = c19797db;
                int m44095a = c19797db2.m44095a();
                if (m44095a < 0 && (i3 = m44095a + m17817S) < i2) {
                    c19797db2.m44093c(i3);
                } else {
                    return;
                }
            }
            return;
        }
        for (m19779N = C46750pE5.m19779N(this.f104966d, i2, m17817S); m19779N < this.f104966d.size(); m19779N++) {
            C19797db c19797db3 = this.f104966d.get(m19779N);
            Intrinsics.checkNotNullExpressionValue(c19797db3, "anchors[index]");
            C19797db c19797db4 = c19797db3;
            int m44095a2 = c19797db4.m44095a();
            if (m44095a2 >= 0) {
                c19797db4.m44093c(-(m17817S - m44095a2));
            } else {
                return;
            }
        }
    }

    /* renamed from: Z */
    public final int m17803Z(int i) {
        return i < this.f104967e ? i : i + this.f104968f;
    }

    /* renamed from: Z0 */
    public final void m17802Z0(Object obj) {
        boolean m19785H;
        int m17803Z = m17803Z(this.f104980r);
        m19785H = C46750pE5.m19785H(this.f104964b, m17803Z);
        if (m19785H) {
            this.f104965c[m17831L(m17849C(this.f104964b, m17803Z))] = obj;
        } else {
            C35528Qt0.m87792x("Updating the data of a group that was not created with a data slot".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: a0 */
    public final int m17800a0(int i) {
        int m19780M;
        m19780M = C46750pE5.m19780M(this.f104964b, m17803Z(i));
        return m19780M;
    }

    /* renamed from: a1 */
    public final void m17799a1(int i) {
        if (i >= 0) {
            S24 s24 = this.f104983u;
            if (s24 == null) {
                s24 = new S24(null, 1, null);
                this.f104983u = s24;
            }
            s24.m86072a(i);
        }
    }

    /* renamed from: b0 */
    public final Object m17797b0(int i) {
        boolean m19783J;
        int m19776Q;
        int m17803Z = m17803Z(i);
        m19783J = C46750pE5.m19783J(this.f104964b, m17803Z);
        if (m19783J) {
            Object[] objArr = this.f104965c;
            m19776Q = C46750pE5.m19776Q(this.f104964b, m17803Z);
            return objArr[m19776Q];
        }
        return null;
    }

    /* renamed from: b1 */
    public final void m17796b1(int i, S24 s24) {
        boolean m19790C;
        boolean z;
        int m17803Z = m17803Z(i);
        boolean m17845E = m17845E(i);
        m19790C = C46750pE5.m19790C(this.f104964b, m17803Z);
        if (m19790C != m17845E) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C46750pE5.m19772U(this.f104964b, m17803Z, m17845E);
            int m17746y0 = m17746y0(i);
            if (m17746y0 >= 0) {
                s24.m86072a(m17746y0);
            }
        }
    }

    /* renamed from: c0 */
    public final int m17794c0(int i) {
        int m19786G;
        m19786G = C46750pE5.m19786G(this.f104964b, m17803Z(i));
        return m19786G;
    }

    /* renamed from: c1 */
    public final void m17793c1(int[] iArr, int i, int i2) {
        C46750pE5.m19771V(iArr, i, m17829M(i2, this.f104972j, this.f104973k, this.f104965c.length));
    }

    /* renamed from: d0 */
    public final Iterator<Object> m17791d0() {
        int m17833K = m17833K(this.f104964b, m17803Z(this.f104980r));
        int[] iArr = this.f104964b;
        int i = this.f104980r;
        return new C27560b(m17833K, m17833K(iArr, m17803Z(i + m17794c0(i))), this);
    }

    /* renamed from: d1 */
    public final void m17790d1(C19797db anchor, Object obj) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        m17784f1(anchor.m44091e(this), obj);
    }

    /* renamed from: e0 */
    public final boolean m17788e0(int i) {
        return m17785f0(i, this.f104980r);
    }

    /* renamed from: e1 */
    public final void m17787e1(Object obj) {
        m17784f1(this.f104980r, obj);
    }

    /* renamed from: f0 */
    public final boolean m17785f0(int i, int i2) {
        int m17817S;
        int m17794c0;
        if (i2 == this.f104981s) {
            m17817S = this.f104969g;
        } else {
            if (i2 > this.f104977o.m101182g(0)) {
                m17794c0 = m17794c0(i2);
            } else {
                int m101186c = this.f104977o.m101186c(i2);
                if (m101186c < 0) {
                    m17794c0 = m17794c0(i2);
                } else {
                    m17817S = (m17817S() - this.f104968f) - this.f104978p.m101183f(m101186c);
                }
            }
            m17817S = m17794c0 + i2;
        }
        if (i <= i2 || i >= m17817S) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /* renamed from: f1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m17784f1(int i, Object obj) {
        boolean z;
        boolean m19781L;
        int m17803Z = m17803Z(i);
        int[] iArr = this.f104964b;
        if (m17803Z < iArr.length) {
            m19781L = C46750pE5.m19781L(iArr, m17803Z);
            if (m19781L) {
                z = true;
                if (!z) {
                    this.f104965c[m17831L(m17748x0(this.f104964b, m17803Z))] = obj;
                    return;
                }
                C35528Qt0.m87792x(("Updating the node of a group at " + i + " that was not created with as a node group").toString());
                throw new KotlinNothingValueException();
            }
        }
        z = false;
        if (!z) {
        }
    }

    /* renamed from: g0 */
    public final boolean m17782g0(int i) {
        int i2 = this.f104981s;
        return (i > i2 && i < this.f104969g) || (i2 == 0 && i == 0);
    }

    /* renamed from: h0 */
    public final void m17780h0(int i) {
        int i2;
        if (i > 0) {
            int i3 = this.f104980r;
            m17762q0(i3);
            int i4 = this.f104967e;
            int i5 = this.f104968f;
            int[] iArr = this.f104964b;
            int length = iArr.length / 5;
            int i6 = length - i5;
            int i7 = 0;
            if (i5 < i) {
                int max = Math.max(Math.max(length * 2, i6 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i8 = max - i6;
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, 0, 0, i4 * 5);
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, (i4 + i8) * 5, (i5 + i4) * 5, length * 5);
                this.f104964b = iArr2;
                i5 = i8;
            }
            int i9 = this.f104969g;
            if (i9 >= i4) {
                this.f104969g = i9 + i;
            }
            int i10 = i4 + i;
            this.f104967e = i10;
            this.f104968f = i5 - i;
            if (i6 > 0) {
                i2 = m17835J(i3 + i);
            } else {
                i2 = 0;
            }
            if (this.f104974l >= i4) {
                i7 = this.f104972j;
            }
            int m17829M = m17829M(i2, i7, this.f104973k, this.f104965c.length);
            for (int i11 = i4; i11 < i10; i11++) {
                C46750pE5.m19771V(this.f104964b, i11, m17829M);
            }
            int i12 = this.f104974l;
            if (i12 >= i4) {
                this.f104974l = i12 + i;
            }
        }
    }

    /* renamed from: i0 */
    public final void m17778i0(int i, int i2) {
        if (i > 0) {
            m17758s0(this.f104970h, i2);
            int i3 = this.f104972j;
            int i4 = this.f104973k;
            if (i4 < i) {
                Object[] objArr = this.f104965c;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                int i8 = i4 + i3;
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr2, 0, 0, i3);
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr2, i3 + i7, i8, length);
                this.f104965c = objArr2;
                i4 = i7;
            }
            int i9 = this.f104971i;
            if (i9 >= i3) {
                this.f104971i = i9 + i;
            }
            this.f104972j = i3 + i;
            this.f104973k = i4 - i;
        }
    }

    /* renamed from: j0 */
    public final boolean m17776j0() {
        boolean m19781L;
        int i = this.f104980r;
        if (i < this.f104969g) {
            m19781L = C46750pE5.m19781L(this.f104964b, m17803Z(i));
            if (m19781L) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k0 */
    public final boolean m17774k0(int i) {
        boolean m19781L;
        m19781L = C46750pE5.m19781L(this.f104964b, m17803Z(i));
        return m19781L;
    }

    /* renamed from: l0 */
    public final void m17772l0(int i) {
        boolean m19784I;
        boolean m19790C;
        int m17803Z = m17803Z(i);
        m19784I = C46750pE5.m19784I(this.f104964b, m17803Z);
        if (!m19784I) {
            C46750pE5.m19769X(this.f104964b, m17803Z, true);
            m19790C = C46750pE5.m19790C(this.f104964b, m17803Z);
            if (!m19790C) {
                m17799a1(m17746y0(i));
            }
        }
    }

    /* renamed from: n0 */
    public final void m17768n0(int i, int i2, int i3) {
        int m19779N;
        int m19779N2;
        int i4 = i3 + i;
        int m17809W = m17809W();
        m19779N = C46750pE5.m19779N(this.f104966d, i, m17809W);
        ArrayList arrayList = new ArrayList();
        if (m19779N >= 0) {
            while (m19779N < this.f104966d.size()) {
                C19797db c19797db = this.f104966d.get(m19779N);
                Intrinsics.checkNotNullExpressionValue(c19797db, "anchors[index]");
                C19797db c19797db2 = c19797db;
                int m17851B = m17851B(c19797db2);
                if (m17851B < i || m17851B >= i4) {
                    break;
                }
                arrayList.add(c19797db2);
                this.f104966d.remove(m19779N);
            }
        }
        int i5 = i2 - i;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            C19797db c19797db3 = (C19797db) arrayList.get(i6);
            int m17851B2 = m17851B(c19797db3) + i5;
            if (m17851B2 >= this.f104967e) {
                c19797db3.m44093c(-(m17809W - m17851B2));
            } else {
                c19797db3.m44093c(m17851B2);
            }
            m19779N2 = C46750pE5.m19779N(this.f104966d, m17851B2, m17809W);
            this.f104966d.add(m19779N2, c19797db3);
        }
    }

    /* renamed from: o0 */
    public final List<C19797db> m17766o0(C45564nE5 table, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(table, "table");
        if (this.f104975m > 0) {
            z = true;
        } else {
            z = false;
        }
        C35528Qt0.m87818X(z);
        if (i == 0 && this.f104980r == 0 && this.f104963a.m24120o() == 0) {
            int[] iArr = this.f104964b;
            Object[] objArr = this.f104965c;
            ArrayList<C19797db> arrayList = this.f104966d;
            int[] m24121j = table.m24121j();
            int m24120o = table.m24120o();
            Object[] m24119s = table.m24119s();
            int m24118u = table.m24118u();
            this.f104964b = m24121j;
            this.f104965c = m24119s;
            this.f104966d = table.m24122h();
            this.f104967e = m24120o;
            this.f104968f = (m24121j.length / 5) - m24120o;
            this.f104972j = m24118u;
            this.f104973k = m24119s.length - m24118u;
            this.f104974l = m24120o;
            table.m24128C(iArr, 0, objArr, 0, arrayList);
            return this.f104966d;
        }
        C47343qE5 m24113z = table.m24113z();
        try {
            return f104962v.m17742b(m24113z, i, this, true, true);
        } finally {
            m24113z.m17843F();
        }
    }

    /* renamed from: p0 */
    public final void m17764p0(int i) {
        boolean z;
        boolean z2;
        int m19786G;
        int i2;
        int m19786G2;
        boolean z3;
        if (this.f104975m == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i == 0) {
                    return;
                }
                int i3 = this.f104980r;
                int i4 = this.f104981s;
                int i5 = this.f104969g;
                int i6 = i3;
                for (int i7 = i; i7 > 0; i7--) {
                    m19786G2 = C46750pE5.m19786G(this.f104964b, m17803Z(i6));
                    i6 += m19786G2;
                    if (i6 <= i5) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        C35528Qt0.m87792x("Parameter offset is out of bounds".toString());
                        throw new KotlinNothingValueException();
                    }
                }
                m19786G = C46750pE5.m19786G(this.f104964b, m17803Z(i6));
                int i8 = this.f104970h;
                int m17833K = m17833K(this.f104964b, m17803Z(i6));
                int i9 = i6 + m19786G;
                int m17833K2 = m17833K(this.f104964b, m17803Z(i9));
                int i10 = m17833K2 - m17833K;
                m17778i0(i10, Math.max(this.f104980r - 1, 0));
                m17780h0(m19786G);
                int[] iArr = this.f104964b;
                int m17803Z = m17803Z(i9) * 5;
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, m17803Z(i3) * 5, m17803Z, (m19786G * 5) + m17803Z);
                if (i10 > 0) {
                    Object[] objArr = this.f104965c;
                    ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i8, m17831L(m17833K + i10), m17831L(m17833K2 + i10));
                }
                int i11 = m17833K + i10;
                int i12 = i11 - i8;
                int i13 = this.f104972j;
                int i14 = this.f104973k;
                int length = this.f104965c.length;
                int i15 = this.f104974l;
                int i16 = i3 + m19786G;
                int i17 = i3;
                while (i17 < i16) {
                    int m17803Z2 = m17803Z(i17);
                    int i18 = i13;
                    int m17833K3 = m17833K(iArr, m17803Z2) - i12;
                    int i19 = i12;
                    if (i15 < m17803Z2) {
                        i2 = 0;
                    } else {
                        i2 = i18;
                    }
                    m17793c1(iArr, m17803Z2, m17829M(m17833K3, i2, i14, length));
                    i17++;
                    i13 = i18;
                    i12 = i19;
                }
                m17768n0(i9, i3, m19786G);
                if (!m17842F0(i9, m19786G)) {
                    m17819R(i4, this.f104969g, i3);
                    if (i10 > 0) {
                        m17840G0(i11, i10, i9 - 1);
                        return;
                    }
                    return;
                }
                C35528Qt0.m87792x("Unexpectedly removed anchors".toString());
                throw new KotlinNothingValueException();
            }
            C35528Qt0.m87792x("Parameter offset is out of bounds".toString());
            throw new KotlinNothingValueException();
        }
        C35528Qt0.m87792x("Cannot move a group while inserting".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: q0 */
    public final void m17762q0(int i) {
        int m19775R;
        int i2 = this.f104968f;
        int i3 = this.f104967e;
        if (i3 != i) {
            boolean z = true;
            if (!this.f104966d.isEmpty()) {
                m17804Y0(i3, i);
            }
            if (i2 > 0) {
                int[] iArr = this.f104964b;
                int i4 = i * 5;
                int i5 = i2 * 5;
                int i6 = i3 * 5;
                if (i < i3) {
                    ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, i5 + i4, i4, i6);
                } else {
                    ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, i6, i6 + i5, i4 + i5);
                }
            }
            if (i < i3) {
                i3 = i + i2;
            }
            int m17817S = m17817S();
            if (i3 >= m17817S) {
                z = false;
            }
            C35528Qt0.m87818X(z);
            while (i3 < m17817S) {
                m19775R = C46750pE5.m19775R(this.f104964b, i3);
                int m17850B0 = m17850B0(m17852A0(m19775R), i);
                if (m17850B0 != m19775R) {
                    C46750pE5.m19767Z(this.f104964b, i3, m17850B0);
                }
                i3++;
                if (i3 == i) {
                    i3 += i2;
                }
            }
        }
        this.f104967e = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (m17794c0(r9.f104980r + r10) == 1) goto L5;
     */
    /* renamed from: r0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<C19797db> m17760r0(int i, C45564nE5 table, int i2) {
        boolean z;
        Intrinsics.checkNotNullParameter(table, "table");
        if (this.f104975m <= 0) {
            z = true;
        }
        z = false;
        C35528Qt0.m87818X(z);
        int i3 = this.f104980r;
        int i4 = this.f104970h;
        int i5 = this.f104971i;
        m17745z(i);
        m17814T0();
        m17847D();
        C47343qE5 m24113z = table.m24113z();
        try {
            List<C19797db> m17742b = f104962v.m17742b(m24113z, i2, this, false, true);
            m24113z.m17843F();
            m17825O();
            m17827N();
            this.f104980r = i3;
            this.f104970h = i4;
            this.f104971i = i5;
            return m17742b;
        } catch (Throwable th) {
            m24113z.m17843F();
            throw th;
        }
    }

    /* renamed from: s0 */
    public final void m17758s0(int i, int i2) {
        int m19788E;
        boolean z;
        int m19788E2;
        boolean z2;
        int i3 = this.f104973k;
        int i4 = this.f104972j;
        int i5 = this.f104974l;
        if (i4 != i) {
            Object[] objArr = this.f104965c;
            if (i < i4) {
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i + i3, i, i4);
            } else {
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i4, i4 + i3, i + i3);
            }
            ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, i, i + i3);
        }
        int min = Math.min(i2 + 1, m17809W());
        if (i5 != min) {
            int length = this.f104965c.length - i3;
            if (min < i5) {
                int m17803Z = m17803Z(min);
                int m17803Z2 = m17803Z(i5);
                int i6 = this.f104967e;
                while (m17803Z < m17803Z2) {
                    m19788E2 = C46750pE5.m19788E(this.f104964b, m17803Z);
                    if (m19788E2 >= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        C46750pE5.m19771V(this.f104964b, m17803Z, -((length - m19788E2) + 1));
                        m17803Z++;
                        if (m17803Z == i6) {
                            m17803Z += this.f104968f;
                        }
                    } else {
                        C35528Qt0.m87792x("Unexpected anchor value, expected a positive anchor".toString());
                        throw new KotlinNothingValueException();
                    }
                }
            } else {
                int m17803Z3 = m17803Z(i5);
                int m17803Z4 = m17803Z(min);
                while (m17803Z3 < m17803Z4) {
                    m19788E = C46750pE5.m19788E(this.f104964b, m17803Z3);
                    if (m19788E < 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        C46750pE5.m19771V(this.f104964b, m17803Z3, m19788E + length + 1);
                        m17803Z3++;
                        if (m17803Z3 == this.f104967e) {
                            m17803Z3 += this.f104968f;
                        }
                    } else {
                        C35528Qt0.m87792x("Unexpected anchor value, expected a negative anchor".toString());
                        throw new KotlinNothingValueException();
                    }
                }
            }
            this.f104974l = min;
        }
        this.f104972j = i;
    }

    /* renamed from: t0 */
    public final List<C19797db> m17756t0(C19797db anchor, int i, C47343qE5 writer) {
        boolean z;
        boolean z2;
        boolean z3;
        int m17750w0;
        boolean z4;
        int m19786G;
        boolean m19781L;
        int m19778O;
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        Intrinsics.checkNotNullParameter(writer, "writer");
        boolean z5 = true;
        if (writer.f104975m > 0) {
            z = true;
        } else {
            z = false;
        }
        C35528Qt0.m87818X(z);
        if (this.f104975m == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C35528Qt0.m87818X(z2);
        C35528Qt0.m87818X(anchor.m44094b());
        int m17851B = m17851B(anchor) + i;
        int i2 = this.f104980r;
        if (i2 <= m17851B && m17851B < this.f104969g) {
            z3 = true;
        } else {
            z3 = false;
        }
        C35528Qt0.m87818X(z3);
        int m17746y0 = m17746y0(m17851B);
        int m17794c0 = m17794c0(m17851B);
        if (m17774k0(m17851B)) {
            m17750w0 = 1;
        } else {
            m17750w0 = m17750w0(m17851B);
        }
        List<C19797db> m17742b = f104962v.m17742b(this, m17851B, writer, false, false);
        m17799a1(m17746y0);
        if (m17750w0 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        while (m17746y0 >= i2) {
            int m17803Z = m17803Z(m17746y0);
            int[] iArr = this.f104964b;
            m19786G = C46750pE5.m19786G(iArr, m17803Z);
            C46750pE5.m19770W(iArr, m17803Z, m19786G - m17794c0);
            if (z4) {
                m19781L = C46750pE5.m19781L(this.f104964b, m17803Z);
                if (m19781L) {
                    z4 = false;
                } else {
                    int[] iArr2 = this.f104964b;
                    m19778O = C46750pE5.m19778O(iArr2, m17803Z);
                    C46750pE5.m19768Y(iArr2, m17803Z, m19778O - m17750w0);
                }
            }
            m17746y0 = m17746y0(m17746y0);
        }
        if (z4) {
            if (this.f104976n < m17750w0) {
                z5 = false;
            }
            C35528Qt0.m87818X(z5);
            this.f104976n -= m17750w0;
        }
        return m17742b;
    }

    public String toString() {
        return "SlotWriter(current = " + this.f104980r + " end=" + this.f104969g + " size = " + m17809W() + " gap=" + this.f104967e + CoreConstants.DASH_CHAR + (this.f104967e + this.f104968f) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* renamed from: u0 */
    public final Object m17754u0(int i) {
        boolean m19781L;
        int m17803Z = m17803Z(i);
        m19781L = C46750pE5.m19781L(this.f104964b, m17803Z);
        if (m19781L) {
            return this.f104965c[m17831L(m17748x0(this.f104964b, m17803Z))];
        }
        return null;
    }

    /* renamed from: v0 */
    public final Object m17752v0(C19797db anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        return m17754u0(anchor.m44091e(this));
    }

    /* renamed from: w0 */
    public final int m17750w0(int i) {
        int m19778O;
        m19778O = C46750pE5.m19778O(this.f104964b, m17803Z(i));
        return m19778O;
    }

    /* renamed from: x0 */
    public final int m17748x0(int[] iArr, int i) {
        return m17833K(iArr, i);
    }

    /* renamed from: y0 */
    public final int m17746y0(int i) {
        return m17744z0(this.f104964b, i);
    }

    /* renamed from: z */
    public final void m17745z(int i) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f104975m <= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i == 0) {
                    return;
                }
                int i2 = this.f104980r + i;
                if (i2 < this.f104981s || i2 > this.f104969g) {
                    z3 = false;
                }
                if (z3) {
                    this.f104980r = i2;
                    int m17833K = m17833K(this.f104964b, m17803Z(i2));
                    this.f104970h = m17833K;
                    this.f104971i = m17833K;
                    return;
                }
                C35528Qt0.m87792x(("Cannot seek outside the current group (" + this.f104981s + CoreConstants.DASH_CHAR + this.f104969g + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
                throw new KotlinNothingValueException();
            }
            throw new IllegalStateException("Cannot call seek() while inserting".toString());
        }
        C35528Qt0.m87792x("Cannot seek backwards".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: z0 */
    public final int m17744z0(int[] iArr, int i) {
        int m19775R;
        m19775R = C46750pE5.m19775R(iArr, m17803Z(i));
        return m17852A0(m19775R);
    }
}
