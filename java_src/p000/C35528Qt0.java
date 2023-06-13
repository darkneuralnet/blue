package p000;

import androidx.compose.runtime.ComposeRuntimeError;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.FR3;
@Metadata(m28433d1 = {"\u0000´\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a@\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u0001j\u0002`\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000\u001aG\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u0001j\u0002`\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001ak\u0010\u000f\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u0001j\u0002`\u00052\u0012\u0010\r\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\f0\u000b2&\u0010\u000e\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u0001j\u0002`\u0005H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\b\u0010\u0011\u001a\u00020\u0007H\u0007\u001a(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0007\u001a\b\u0010\u0019\u001a\u00020\u0017H\u0007\u001a\u0014\u0010\u001d\u001a\u00020\u0017*\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001bH\u0000\u001aP\u0010$\u001a>\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010!j\b\u0012\u0004\u0012\u00028\u0001`\"0 j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010!j\b\u0012\u0004\u0012\u00028\u0001`\"`#\"\u0004\b\u0000\u0010\u001e\"\u0004\b\u0001\u0010\u001fH\u0002\u001aa\u0010&\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u001e\"\u0004\b\u0001\u0010\u001f*4\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010!0 j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010!j\b\u0012\u0004\u0012\u00028\u0001`\"`#2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010%\u001a\u00028\u0001H\u0002¢\u0006\u0004\b&\u0010'\u001ac\u0010\u0000\u001a\u0004\u0018\u00010\u0017\"\u0004\b\u0000\u0010\u001e\"\u0004\b\u0001\u0010\u001f*4\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010!0 j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010!j\b\u0012\u0004\u0012\u00028\u0001`\"`#2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010%\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0000\u0010(\u001a[\u0010)\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\u001e\"\u0004\b\u0001\u0010\u001f*4\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010!0 j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010!j\b\u0012\u0004\u0012\u00028\u0001`\"`#2\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b)\u0010*\u001a\u001a\u0010.\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010-\u001a\u00020\u0012H\u0002\u001a\u001a\u0010/\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010-\u001a\u00020\u0012H\u0002\u001a,\u00103\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010-\u001a\u00020\u00122\u0006\u00101\u001a\u0002002\b\u00102\u001a\u0004\u0018\u00010\u0003H\u0002\u001a$\u00106\u001a\u0004\u0018\u00010,*\b\u0012\u0004\u0012\u00020,0+2\u0006\u00104\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u0012H\u0002\u001a\u001c\u0010\u001f\u001a\u0004\u0018\u00010,*\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010-\u001a\u00020\u0012H\u0002\u001a\"\u00107\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020,0+2\u0006\u00104\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u0012H\u0002\u001a(\u00108\u001a\b\u0012\u0004\u0012\u00020,0+*\b\u0012\u0004\u0012\u00020,0+2\u0006\u00104\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u0012H\u0002\u001a\f\u00109\u001a\u00020\u0012*\u00020\u0007H\u0002\u001a\f\u0010:\u001a\u00020\u0007*\u00020\u0012H\u0002\u001a\u001c\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030>*\u00020;2\u0006\u0010=\u001a\u00020<H\u0002\u001a\u001c\u0010C\u001a\u00020\u0012*\u00020@2\u0006\u0010A\u001a\u00020\u00122\u0006\u0010B\u001a\u00020\u0012H\u0002\u001a$\u0010G\u001a\u00020\u0012*\u00020@2\u0006\u0010D\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u00122\u0006\u0010F\u001a\u00020\u0012H\u0002\u001a\u0010\u0010H\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u0007H\u0000\u001a\u0010\u0010K\u001a\u00020J2\u0006\u0010I\u001a\u00020\u0015H\u0000\"a\u0010T\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030M¢\u0006\f\bN\u0012\b\bO\u0012\u0004\b\b(P\u0012\u0013\u0012\u00110\u001a¢\u0006\f\bN\u0012\b\bO\u0012\u0004\b\b(Q\u0012\u0013\u0012\u00110\u001b¢\u0006\f\bN\u0012\b\bO\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170Lj\u0002`R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010S\"a\u0010U\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030M¢\u0006\f\bN\u0012\b\bO\u0012\u0004\b\b(P\u0012\u0013\u0012\u00110\u001a¢\u0006\f\bN\u0012\b\bO\u0012\u0004\b\b(Q\u0012\u0013\u0012\u00110\u001b¢\u0006\f\bN\u0012\b\bO\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170Lj\u0002`R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010S\"a\u0010W\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030M¢\u0006\f\bN\u0012\b\bO\u0012\u0004\b\b(P\u0012\u0013\u0012\u00110\u001a¢\u0006\f\bN\u0012\b\bO\u0012\u0004\b\b(Q\u0012\u0013\u0012\u00110\u001b¢\u0006\f\bN\u0012\b\bO\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170Lj\u0002`R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010S\"a\u0010Y\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030M¢\u0006\f\bN\u0012\b\bO\u0012\u0004\b\b(P\u0012\u0013\u0012\u00110\u001a¢\u0006\f\bN\u0012\b\bO\u0012\u0004\b\b(Q\u0012\u0013\u0012\u00110\u001b¢\u0006\f\bN\u0012\b\bO\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170Lj\u0002`R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010S\"a\u0010[\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030M¢\u0006\f\bN\u0012\b\bO\u0012\u0004\b\b(P\u0012\u0013\u0012\u00110\u001a¢\u0006\f\bN\u0012\b\bO\u0012\u0004\b\b(Q\u0012\u0013\u0012\u00110\u001b¢\u0006\f\bN\u0012\b\bO\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170Lj\u0002`R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010S\" \u0010b\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\\\u0010]\u0012\u0004\b`\u0010a\u001a\u0004\b^\u0010_\" \u0010f\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bc\u0010]\u0012\u0004\be\u0010a\u001a\u0004\bd\u0010_\" \u0010j\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bg\u0010]\u0012\u0004\bi\u0010a\u001a\u0004\bh\u0010_\" \u0010m\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bk\u0010]\u0012\u0004\bl\u0010a\u001a\u0004\b\u001e\u0010_\" \u0010q\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bn\u0010]\u0012\u0004\bp\u0010a\u001a\u0004\bo\u0010_\" \u0010u\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\br\u0010]\u0012\u0004\bt\u0010a\u001a\u0004\bs\u0010_\"\u0018\u0010y\u001a\u00020\u0003*\u00020v8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bw\u0010x*\u009e\u0001\b\u0000\u0010z\"K\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030M¢\u0006\f\bN\u0012\b\bO\u0012\u0004\b\b(P\u0012\u0013\u0012\u00110\u001a¢\u0006\f\bN\u0012\b\bO\u0012\u0004\b\b(Q\u0012\u0013\u0012\u00110\u001b¢\u0006\f\bN\u0012\b\bO\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170L2K\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030M¢\u0006\f\bN\u0012\b\bO\u0012\u0004\b\b(P\u0012\u0013\u0012\u00110\u001a¢\u0006\f\bN\u0012\b\bO\u0012\u0004\b\b(Q\u0012\u0013\u0012\u00110\u001b¢\u0006\f\bN\u0012\b\bO\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170L*D\b\u0000\u0010{\"\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u0001¨\u0006|"}, m28432d2 = {"T", "LFR3;", "Lfu0;", "", "LsP5;", "Landroidx/compose/runtime/CompositionLocalMap;", "key", "", "z", "M", "(LFR3;Lfu0;)Ljava/lang/Object;", "", "LW94;", "values", "parentScope", "y", "([LW94;LFR3;LEt0;I)LFR3;", "O", "", "dirty1", "dirty2", "", "info", "", "Z", "Y", "LqE5;", "LOv4;", "rememberManager", "U", "K", "V", "Ljava/util/HashMap;", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "Lkotlin/collections/HashMap;", "P", "value", "S", "(Ljava/util/HashMap;Ljava/lang/Object;Ljava/lang/Object;)Z", "(Ljava/util/HashMap;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Unit;", "R", "(Ljava/util/HashMap;Ljava/lang/Object;)Ljava/lang/Object;", "", "Lm72;", "location", "D", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Los4;", Action.SCOPE_ATTRIBUTE, "instance", "N", "start", "end", "E", "W", "B", "u", "t", "LnE5;", "Ldb;", "anchor", "", "v", "LmE5;", "index", "root", "A", C17296a.f69688o, "b", "common", "Q", "X", "message", "", "x", "Lkotlin/Function3;", "Llm;", "Lkotlin/ParameterName;", "name", "applier", "slots", "Landroidx/compose/runtime/Change;", "Lkotlin/jvm/functions/Function3;", "removeCurrentGroupInstance", "skipToGroupEndInstance", "c", "endGroupInstance", DateTokenConverter.CONVERTER_KEY, "startRootGroup", "e", "resetSlotsInstance", "f", "Ljava/lang/Object;", "G", "()Ljava/lang/Object;", "getInvocation$annotations", "()V", "invocation", "g", "I", "getProvider$annotations", "provider", "h", "F", "getCompositionLocalMap$annotations", "compositionLocalMap", "i", "getProviderValues$annotations", "providerValues", "j", "J", "getProviderMaps$annotations", "providerMaps", "k", "L", "getReference$annotations", "reference", "Lok2;", "H", "(Lok2;)Ljava/lang/Object;", "joinedKey", "Change", "CompositionLocalMap", "runtime_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,4528:1\n309#1:4529\n4513#1,5:4546\n1#2:4530\n361#3,7:4531\n146#4,8:4538\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n325#1:4529\n4519#1:4546,5\n4253#1:4531,7\n4367#1:4538,8\n*E\n"})
/* renamed from: Qt0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35528Qt0 {

    /* renamed from: a */
    public static final Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> f31044a = C6926b.f31056g;

    /* renamed from: b */
    public static final Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> f31045b = C6928d.f31058g;

    /* renamed from: c */
    public static final Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> f31046c = C6925a.f31055g;

    /* renamed from: d */
    public static final Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> f31047d = C6929e.f31059g;

    /* renamed from: e */
    public static final Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> f31048e = C6927c.f31057g;

    /* renamed from: f */
    public static final Object f31049f = new C33317Hh3("provider");

    /* renamed from: g */
    public static final Object f31050g = new C33317Hh3("provider");

    /* renamed from: h */
    public static final Object f31051h = new C33317Hh3("compositionLocalMap");

    /* renamed from: i */
    public static final Object f31052i = new C33317Hh3("providerValues");

    /* renamed from: j */
    public static final Object f31053j = new C33317Hh3("providers");

    /* renamed from: k */
    public static final Object f31054k = new C33317Hh3("reference");

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Llm;", "<anonymous parameter 0>", "LqE5;", "slots", "LOv4;", "<anonymous parameter 2>", "", C17296a.f69688o, "(Llm;LqE5;LOv4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qt0$a */
    /* loaded from: classes.dex */
    public static final class C6925a extends Lambda implements Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> {

        /* renamed from: g */
        public static final C6925a f31055g = new C6925a();

        public C6925a() {
            super(3);
        }

        /* renamed from: a */
        public final void m87789a(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 slots, InterfaceC35082Ov4 interfaceC35082Ov4) {
            Intrinsics.checkNotNullParameter(interfaceC25773lm, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(slots, "slots");
            Intrinsics.checkNotNullParameter(interfaceC35082Ov4, "<anonymous parameter 2>");
            slots.m17827N();
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            m87789a(interfaceC25773lm, c47343qE5, interfaceC35082Ov4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Llm;", "<anonymous parameter 0>", "LqE5;", "slots", "LOv4;", "rememberManager", "", C17296a.f69688o, "(Llm;LqE5;LOv4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qt0$b */
    /* loaded from: classes.dex */
    public static final class C6926b extends Lambda implements Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> {

        /* renamed from: g */
        public static final C6926b f31056g = new C6926b();

        public C6926b() {
            super(3);
        }

        /* renamed from: a */
        public final void m87788a(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 slots, InterfaceC35082Ov4 rememberManager) {
            Intrinsics.checkNotNullParameter(interfaceC25773lm, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(slots, "slots");
            Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
            C35528Qt0.m87821U(slots, rememberManager);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            m87788a(interfaceC25773lm, c47343qE5, interfaceC35082Ov4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Llm;", "<anonymous parameter 0>", "LqE5;", "slots", "LOv4;", "<anonymous parameter 2>", "", C17296a.f69688o, "(Llm;LqE5;LOv4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qt0$c */
    /* loaded from: classes.dex */
    public static final class C6927c extends Lambda implements Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> {

        /* renamed from: g */
        public static final C6927c f31057g = new C6927c();

        public C6927c() {
            super(3);
        }

        /* renamed from: a */
        public final void m87787a(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 slots, InterfaceC35082Ov4 interfaceC35082Ov4) {
            Intrinsics.checkNotNullParameter(interfaceC25773lm, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(slots, "slots");
            Intrinsics.checkNotNullParameter(interfaceC35082Ov4, "<anonymous parameter 2>");
            slots.m17838H0();
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            m87787a(interfaceC25773lm, c47343qE5, interfaceC35082Ov4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Llm;", "<anonymous parameter 0>", "LqE5;", "slots", "LOv4;", "<anonymous parameter 2>", "", C17296a.f69688o, "(Llm;LqE5;LOv4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qt0$d */
    /* loaded from: classes.dex */
    public static final class C6928d extends Lambda implements Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> {

        /* renamed from: g */
        public static final C6928d f31058g = new C6928d();

        public C6928d() {
            super(3);
        }

        /* renamed from: a */
        public final void m87786a(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 slots, InterfaceC35082Ov4 interfaceC35082Ov4) {
            Intrinsics.checkNotNullParameter(interfaceC25773lm, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(slots, "slots");
            Intrinsics.checkNotNullParameter(interfaceC35082Ov4, "<anonymous parameter 2>");
            slots.m17824O0();
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            m87786a(interfaceC25773lm, c47343qE5, interfaceC35082Ov4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Llm;", "<anonymous parameter 0>", "LqE5;", "slots", "LOv4;", "<anonymous parameter 2>", "", C17296a.f69688o, "(Llm;LqE5;LOv4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qt0$e */
    /* loaded from: classes.dex */
    public static final class C6929e extends Lambda implements Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> {

        /* renamed from: g */
        public static final C6929e f31059g = new C6929e();

        public C6929e() {
            super(3);
        }

        /* renamed from: a */
        public final void m87785a(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 slots, InterfaceC35082Ov4 interfaceC35082Ov4) {
            Intrinsics.checkNotNullParameter(interfaceC25773lm, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(slots, "slots");
            Intrinsics.checkNotNullParameter(interfaceC35082Ov4, "<anonymous parameter 2>");
            slots.m17823P(0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            m87785a(interfaceC25773lm, c47343qE5, interfaceC35082Ov4);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: A */
    public static final int m87841A(C44971mE5 c44971mE5, int i, int i2) {
        int i3 = 0;
        while (i > 0 && i != i2) {
            i = c44971mE5.m25904N(i);
            i3++;
        }
        return i3;
    }

    /* renamed from: B */
    public static final List<C44902m72> m87840B(List<C44902m72> list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        for (int m87839C = m87839C(list, i); m87839C < list.size(); m87839C++) {
            C44902m72 c44902m72 = list.get(m87839C);
            if (c44902m72.m26317b() >= i2) {
                break;
            }
            arrayList.add(c44902m72);
        }
        return arrayList;
    }

    /* renamed from: C */
    public static final int m87839C(List<C44902m72> list, int i) {
        int m87838D = m87838D(list, i);
        return m87838D < 0 ? -(m87838D + 1) : m87838D;
    }

    /* renamed from: D */
    public static final int m87838D(List<C44902m72> list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int compare = Intrinsics.compare(list.get(i3).m26317b(), i);
            if (compare < 0) {
                i2 = i3 + 1;
            } else if (compare > 0) {
                size = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: E */
    public static final C44902m72 m87837E(List<C44902m72> list, int i, int i2) {
        int m87839C = m87839C(list, i);
        if (m87839C < list.size()) {
            C44902m72 c44902m72 = list.get(m87839C);
            if (c44902m72.m26317b() < i2) {
                return c44902m72;
            }
            return null;
        }
        return null;
    }

    /* renamed from: F */
    public static final Object m87836F() {
        return f31051h;
    }

    /* renamed from: G */
    public static final Object m87835G() {
        return f31049f;
    }

    /* renamed from: H */
    public static final Object m87834H(C46452ok2 c46452ok2) {
        return c46452ok2.m20550d() != null ? new C36592Vh2(Integer.valueOf(c46452ok2.m20553a()), c46452ok2.m20550d()) : Integer.valueOf(c46452ok2.m20553a());
    }

    /* renamed from: I */
    public static final Object m87833I() {
        return f31050g;
    }

    /* renamed from: J */
    public static final Object m87832J() {
        return f31053j;
    }

    /* renamed from: K */
    public static final Object m87831K() {
        return f31052i;
    }

    /* renamed from: L */
    public static final Object m87830L() {
        return f31054k;
    }

    /* renamed from: M */
    public static final <T> T m87829M(FR3<AbstractC41213fu0<Object>, ? extends InterfaceC48627sP5<? extends Object>> fr3, AbstractC41213fu0<T> key) {
        Intrinsics.checkNotNullParameter(fr3, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        InterfaceC48627sP5<? extends Object> interfaceC48627sP5 = fr3.get(key);
        if (interfaceC48627sP5 != null) {
            return (T) interfaceC48627sP5.getValue();
        }
        return null;
    }

    /* renamed from: N */
    public static final void m87828N(List<C44902m72> list, int i, C46534os4 c46534os4, Object obj) {
        int m87838D = m87838D(list, i);
        C44536lW1 c44536lW1 = null;
        if (m87838D < 0) {
            int i2 = -(m87838D + 1);
            if (obj != null) {
                c44536lW1 = new C44536lW1();
                c44536lW1.add(obj);
            }
            list.add(i2, new C44902m72(c46534os4, i, c44536lW1));
        } else if (obj == null) {
            list.get(m87838D).m26314e(null);
        } else {
            C44536lW1<Object> m26318a = list.get(m87838D).m26318a();
            if (m26318a != null) {
                m26318a.add(obj);
            }
        }
    }

    /* renamed from: O */
    public static final boolean m87827O() {
        return false;
    }

    /* renamed from: P */
    public static final <K, V> HashMap<K, LinkedHashSet<V>> m87826P() {
        return new HashMap<>();
    }

    /* renamed from: Q */
    public static final int m87825Q(C44971mE5 c44971mE5, int i, int i2, int i3) {
        if (i == i2) {
            return i;
        }
        if (i != i3 && i2 != i3) {
            if (c44971mE5.m25904N(i) == i2) {
                return i2;
            }
            if (c44971mE5.m25904N(i2) == i) {
                return i;
            }
            if (c44971mE5.m25904N(i) == c44971mE5.m25904N(i2)) {
                return c44971mE5.m25904N(i);
            }
            int m87841A = m87841A(c44971mE5, i, i3);
            int m87841A2 = m87841A(c44971mE5, i2, i3);
            int i4 = m87841A - m87841A2;
            for (int i5 = 0; i5 < i4; i5++) {
                i = c44971mE5.m25904N(i);
            }
            int i6 = m87841A2 - m87841A;
            for (int i7 = 0; i7 < i6; i7++) {
                i2 = c44971mE5.m25904N(i2);
            }
            while (i != i2) {
                i = c44971mE5.m25904N(i);
                i2 = c44971mE5.m25904N(i2);
            }
            return i;
        }
        return i3;
    }

    /* renamed from: R */
    public static final <K, V> V m87824R(HashMap<K, LinkedHashSet<V>> hashMap, K k) {
        Object firstOrNull;
        LinkedHashSet<V> linkedHashSet = hashMap.get(k);
        if (linkedHashSet != null) {
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull(linkedHashSet);
            V v = (V) firstOrNull;
            if (v != null) {
                m87822T(hashMap, k, v);
                return v;
            }
        }
        return null;
    }

    /* renamed from: S */
    public static final <K, V> boolean m87823S(HashMap<K, LinkedHashSet<V>> hashMap, K k, V v) {
        LinkedHashSet<V> linkedHashSet = hashMap.get(k);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
            hashMap.put(k, linkedHashSet);
        }
        return linkedHashSet.add(v);
    }

    /* renamed from: T */
    public static final <K, V> Unit m87822T(HashMap<K, LinkedHashSet<V>> hashMap, K k, V v) {
        LinkedHashSet<V> linkedHashSet = hashMap.get(k);
        if (linkedHashSet != null) {
            linkedHashSet.remove(v);
            if (linkedHashSet.isEmpty()) {
                hashMap.remove(k);
            }
            return Unit.INSTANCE;
        }
        return null;
    }

    /* renamed from: U */
    public static final void m87821U(C47343qE5 c47343qE5, InterfaceC35082Ov4 rememberManager) {
        C46534os4 c46534os4;
        C39435cu0 m20394l;
        Intrinsics.checkNotNullParameter(c47343qE5, "<this>");
        Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
        Iterator<Object> m17791d0 = c47343qE5.m17791d0();
        while (m17791d0.hasNext()) {
            Object next = m17791d0.next();
            if (next instanceof InterfaceC31784At0) {
                rememberManager.mo44864d((InterfaceC31784At0) next);
            }
            if (next instanceof InterfaceC35316Pv4) {
                rememberManager.mo44863e((InterfaceC35316Pv4) next);
            }
            if ((next instanceof C46534os4) && (m20394l = (c46534os4 = (C46534os4) next).m20394l()) != null) {
                m20394l.m44880F(true);
                c46534os4.m20382x();
            }
        }
        c47343qE5.m17844E0();
    }

    /* renamed from: V */
    public static final C44902m72 m87820V(List<C44902m72> list, int i) {
        int m87838D = m87838D(list, i);
        if (m87838D >= 0) {
            return list.remove(m87838D);
        }
        return null;
    }

    /* renamed from: W */
    public static final void m87819W(List<C44902m72> list, int i, int i2) {
        int m87839C = m87839C(list, i);
        while (m87839C < list.size() && list.get(m87839C).m26317b() < i2) {
            list.remove(m87839C);
        }
    }

    /* renamed from: X */
    public static final void m87818X(boolean z) {
        if (z) {
            return;
        }
        m87792x("Check failed".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: Y */
    public static final void m87817Y() {
    }

    /* renamed from: Z */
    public static final void m87816Z(int i, int i2, int i3, String info) {
        Intrinsics.checkNotNullParameter(info, "info");
    }

    /* renamed from: t */
    public static final boolean m87796t(int i) {
        return i != 0;
    }

    /* renamed from: u */
    public static final int m87795u(boolean z) {
        return z ? 1 : 0;
    }

    /* renamed from: v */
    public static final List<Object> m87794v(C45564nE5 c45564nE5, C19797db c19797db) {
        ArrayList arrayList = new ArrayList();
        C44971mE5 m24114y = c45564nE5.m24114y();
        try {
            m87793w(m24114y, arrayList, c45564nE5.m24126b(c19797db));
            Unit unit = Unit.INSTANCE;
            return arrayList;
        } finally {
            m24114y.m25894d();
        }
    }

    /* renamed from: w */
    public static final void m87793w(C44971mE5 c44971mE5, List<Object> list, int i) {
        if (c44971mE5.m25910H(i)) {
            list.add(c44971mE5.m25908J(i));
            return;
        }
        int i2 = i + 1;
        int m25915C = i + c44971mE5.m25915C(i);
        while (i2 < m25915C) {
            m87793w(c44971mE5, list, i2);
            i2 += c44971mE5.m25915C(i2);
        }
    }

    /* renamed from: x */
    public static final Void m87792x(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + message + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    /* renamed from: y */
    public static final FR3<AbstractC41213fu0<Object>, InterfaceC48627sP5<Object>> m87791y(W94<?>[] w94Arr, FR3<AbstractC41213fu0<Object>, ? extends InterfaceC48627sP5<? extends Object>> fr3, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        interfaceC32720Et0.mo89638F(721128344);
        if (m87827O()) {
            m87816Z(721128344, i, -1, "androidx.compose.runtime.compositionLocalMapOf (Composer.kt:319)");
        }
        FR3.InterfaceC2276a builder = C34494Mi1.m95010a().builder();
        for (W94<?> w94 : w94Arr) {
            interfaceC32720Et0.mo89638F(680853375);
            if (w94.m78778a() || !m87790z(fr3, w94.m78777b())) {
                AbstractC41213fu0<?> m78777b = w94.m78777b();
                Intrinsics.checkNotNull(m78777b, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
                builder.put(m78777b, w94.m78777b().mo30640b(w94.m78776c(), interfaceC32720Et0, 8));
            }
            interfaceC32720Et0.mo89605Q();
        }
        FR3<AbstractC41213fu0<Object>, InterfaceC48627sP5<Object>> build = builder.build();
        if (m87827O()) {
            m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return build;
    }

    /* renamed from: z */
    public static final <T> boolean m87790z(FR3<AbstractC41213fu0<Object>, ? extends InterfaceC48627sP5<? extends Object>> fr3, AbstractC41213fu0<T> key) {
        Intrinsics.checkNotNullParameter(fr3, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return fr3.containsKey(key);
    }
}
