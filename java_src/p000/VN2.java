package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty1;
@Metadata(m28433d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\u001ah\u0010\u000e\u001a\u00020\r\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002*\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0082\u0001\u0010\u0013\u001a\u00020\r\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002\"\u0004\b\u0002\u0010\u0010*\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00112\b\b\u0002\u0010\u0007\u001a\u00020\u00062\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a¢\u0001\u0010\u0018\u001a\u00020\r\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002\"\u0004\b\u0002\u0010\u0010\"\u0004\b\u0003\u0010\u0015*\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00030\u00112\b\b\u0002\u0010\u0007\u001a\u00020\u00062(\u0010\f\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001aÂ\u0001\u0010\u001d\u001a\u00020\r\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002\"\u0004\b\u0002\u0010\u0010\"\u0004\b\u0003\u0010\u0015\"\u0004\b\u0004\u0010\u001a*\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00030\u00112\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00040\u00112\b\b\u0002\u0010\u0007\u001a\u00020\u00062.\u0010\f\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001cH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001aâ\u0001\u0010\"\u001a\u00020\r\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002\"\u0004\b\u0002\u0010\u0010\"\u0004\b\u0003\u0010\u0015\"\u0004\b\u0004\u0010\u001a\"\u0004\b\u0005\u0010\u001f*\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00030\u00112\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00040\u00112\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00050\u00112\b\b\u0002\u0010\u0007\u001a\u00020\u000624\u0010\f\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0!H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0082\u0002\u0010'\u001a\u00020\r\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002\"\u0004\b\u0002\u0010\u0010\"\u0004\b\u0003\u0010\u0015\"\u0004\b\u0004\u0010\u001a\"\u0004\b\u0005\u0010\u001f\"\u0004\b\u0006\u0010$*\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00030\u00112\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00040\u00112\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00050\u00112\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00060\u00112\b\b\u0002\u0010\u0007\u001a\u00020\u00062:\u0010\f\u001a6\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0&H\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a¢\u0002\u0010,\u001a\u00020\r\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002\"\u0004\b\u0002\u0010\u0010\"\u0004\b\u0003\u0010\u0015\"\u0004\b\u0004\u0010\u001a\"\u0004\b\u0005\u0010\u001f\"\u0004\b\u0006\u0010$\"\u0004\b\u0007\u0010)*\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00030\u00112\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00040\u00112\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00050\u00112\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00060\u00112\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00070\u00112\b\b\u0002\u0010\u0007\u001a\u00020\u00062@\u0010\f\u001a<\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0+H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001aÂ\u0002\u00101\u001a\u00020\r\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002\"\u0004\b\u0002\u0010\u0010\"\u0004\b\u0003\u0010\u0015\"\u0004\b\u0004\u0010\u001a\"\u0004\b\u0005\u0010\u001f\"\u0004\b\u0006\u0010$\"\u0004\b\u0007\u0010)\"\u0004\b\b\u0010.*\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00030\u00112\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00040\u00112\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00050\u00112\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00060\u00112\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00070\u00112\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\b0\u00112\b\b\u0002\u0010\u0007\u001a\u00020\u00062F\u0010\f\u001aB\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b00H\u0007ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a´\u0001\u00109\u001a\u00020\r\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002\"\u0004\b\u0002\u00103*\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0018\u00105\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0002040\u00112\b\b\u0002\u0010\u0007\u001a\u00020\u00062&\b\u0002\u00107\u001a \b\u0001\u0012\u0004\u0012\u000206\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\b2&\b\u0002\u00108\u001a \b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\bH\u0007ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006;"}, m28432d2 = {"LRN2;", "VM", "LAN2;", "S", "LLifecycleOwner;", "owner", "La01;", "deliveryMode", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "action", "Lzh2;", C17296a.f69688o, "(LRN2;LLifecycleOwner;La01;Lkotlin/jvm/functions/Function2;)Lzh2;", "A", "Lkotlin/reflect/KProperty1;", "prop1", "b", "(LRN2;LLifecycleOwner;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function2;)Lzh2;", "B", "prop2", "Lkotlin/Function3;", "c", "(LRN2;LLifecycleOwner;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function3;)Lzh2;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "prop3", "Lkotlin/Function4;", DateTokenConverter.CONVERTER_KEY, "(LRN2;LLifecycleOwner;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function4;)Lzh2;", "D", "prop4", "Lkotlin/Function5;", "e", "(LRN2;LLifecycleOwner;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function5;)Lzh2;", "E", "prop5", "Lkotlin/Function6;", "f", "(LRN2;LLifecycleOwner;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function6;)Lzh2;", "F", "prop6", "Lkotlin/Function7;", "g", "(LRN2;LLifecycleOwner;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function7;)Lzh2;", "G", "prop7", "Lkotlin/Function8;", "h", "(LRN2;LLifecycleOwner;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function8;)Lzh2;", "T", "Ldp;", "asyncProp", "", "onFail", "onSuccess", "i", "(LRN2;LLifecycleOwner;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Lzh2;", "mvrx_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: VN2 */
/* loaded from: classes2.dex */
public final class VN2 {

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LEu1;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: VN2$a */
    /* loaded from: classes2.dex */
    public static final class C8613a implements InterfaceC32730Eu1<GN2<A>> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC32730Eu1 f38914b;

        /* renamed from: c */
        public final /* synthetic */ KProperty1 f38915c;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: VN2$a$a */
        /* loaded from: classes2.dex */
        public static final class C8614a<T> implements InterfaceC33198Gu1 {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC33198Gu1 f38916b;

            /* renamed from: c */
            public final /* synthetic */ KProperty1 f38917c;

            @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
            @DebugMetadata(m28419c = "com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal1$$inlined$map$1$2", m28418f = "MavericksViewModelExtensions.kt", m28417i = {}, m28416l = {224}, m28415m = "emit", m28414n = {}, m28413s = {})
            /* renamed from: VN2$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C8615a extends ContinuationImpl {

                /* renamed from: h */
                public /* synthetic */ Object f38918h;

                /* renamed from: i */
                public int f38919i;

                public C8615a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f38918h = obj;
                    this.f38919i |= Integer.MIN_VALUE;
                    return C8614a.this.emit(null, this);
                }
            }

            public C8614a(InterfaceC33198Gu1 interfaceC33198Gu1, KProperty1 kProperty1) {
                this.f38916b = interfaceC33198Gu1;
                this.f38917c = kProperty1;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // p000.InterfaceC33198Gu1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C8615a c8615a;
                Object coroutine_suspended;
                int i;
                if (continuation instanceof C8615a) {
                    c8615a = (C8615a) continuation;
                    int i2 = c8615a.f38919i;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c8615a.f38919i = i2 - Integer.MIN_VALUE;
                        Object obj2 = c8615a.f38918h;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c8615a.f38919i;
                        if (i == 0) {
                            if (i == 1) {
                                ResultKt.throwOnFailure(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC33198Gu1 interfaceC33198Gu1 = this.f38916b;
                            GN2 gn2 = new GN2(this.f38917c.get((AN2) obj));
                            c8615a.f38919i = 1;
                            if (interfaceC33198Gu1.emit(gn2, c8615a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                c8615a = new C8615a(continuation);
                Object obj22 = c8615a.f38918h;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c8615a.f38919i;
                if (i == 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public C8613a(InterfaceC32730Eu1 interfaceC32730Eu1, KProperty1 kProperty1) {
            this.f38914b = interfaceC32730Eu1;
            this.f38915c = kProperty1;
        }

        @Override // p000.InterfaceC32730Eu1
        public Object collect(InterfaceC33198Gu1 interfaceC33198Gu1, Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f38914b.collect(new C8614a(interfaceC33198Gu1, this.f38915c), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (collect == coroutine_suspended) {
                return collect;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002\"\u0004\b\u0002\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005H\u008a@"}, m28432d2 = {"LRN2;", "VM", "LAN2;", "S", "A", "LGN2;", "<name for destructuring parameter 0>", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal1$2", m28418f = "MavericksViewModelExtensions.kt", m28417i = {}, m28416l = {27}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: VN2$b */
    /* loaded from: classes2.dex */
    public static final class C8616b extends SuspendLambda implements Function2<GN2<A>, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f38921h;

        /* renamed from: i */
        public /* synthetic */ Object f38922i;

        /* renamed from: j */
        public final /* synthetic */ Function2<A, Continuation<? super Unit>, Object> f38923j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8616b(Function2<? super A, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C8616b> continuation) {
            super(2, continuation);
            this.f38923j = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C8616b c8616b = new C8616b(this.f38923j, continuation);
            c8616b.f38922i = obj;
            return c8616b;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(GN2<A> gn2, Continuation<? super Unit> continuation) {
            return ((C8616b) create(gn2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f38921h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Object m105186a = ((GN2) this.f38922i).m105186a();
                Function2<A, Continuation<? super Unit>, Object> function2 = this.f38923j;
                this.f38921h = 1;
                if (function2.invoke(m105186a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LEu1;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: VN2$c */
    /* loaded from: classes2.dex */
    public static final class C8617c implements InterfaceC32730Eu1<HN2<A, B>> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC32730Eu1 f38924b;

        /* renamed from: c */
        public final /* synthetic */ KProperty1 f38925c;

        /* renamed from: d */
        public final /* synthetic */ KProperty1 f38926d;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: VN2$c$a */
        /* loaded from: classes2.dex */
        public static final class C8618a<T> implements InterfaceC33198Gu1 {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC33198Gu1 f38927b;

            /* renamed from: c */
            public final /* synthetic */ KProperty1 f38928c;

            /* renamed from: d */
            public final /* synthetic */ KProperty1 f38929d;

            @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
            @DebugMetadata(m28419c = "com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal2$$inlined$map$1$2", m28418f = "MavericksViewModelExtensions.kt", m28417i = {}, m28416l = {224}, m28415m = "emit", m28414n = {}, m28413s = {})
            /* renamed from: VN2$c$a$a */
            /* loaded from: classes2.dex */
            public static final class C8619a extends ContinuationImpl {

                /* renamed from: h */
                public /* synthetic */ Object f38930h;

                /* renamed from: i */
                public int f38931i;

                public C8619a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f38930h = obj;
                    this.f38931i |= Integer.MIN_VALUE;
                    return C8618a.this.emit(null, this);
                }
            }

            public C8618a(InterfaceC33198Gu1 interfaceC33198Gu1, KProperty1 kProperty1, KProperty1 kProperty12) {
                this.f38927b = interfaceC33198Gu1;
                this.f38928c = kProperty1;
                this.f38929d = kProperty12;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // p000.InterfaceC33198Gu1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C8619a c8619a;
                Object coroutine_suspended;
                int i;
                if (continuation instanceof C8619a) {
                    c8619a = (C8619a) continuation;
                    int i2 = c8619a.f38931i;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c8619a.f38931i = i2 - Integer.MIN_VALUE;
                        Object obj2 = c8619a.f38930h;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c8619a.f38931i;
                        if (i == 0) {
                            if (i == 1) {
                                ResultKt.throwOnFailure(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC33198Gu1 interfaceC33198Gu1 = this.f38927b;
                            AN2 an2 = (AN2) obj;
                            HN2 hn2 = new HN2(this.f38928c.get(an2), this.f38929d.get(an2));
                            c8619a.f38931i = 1;
                            if (interfaceC33198Gu1.emit(hn2, c8619a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                c8619a = new C8619a(continuation);
                Object obj22 = c8619a.f38930h;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c8619a.f38931i;
                if (i == 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public C8617c(InterfaceC32730Eu1 interfaceC32730Eu1, KProperty1 kProperty1, KProperty1 kProperty12) {
            this.f38924b = interfaceC32730Eu1;
            this.f38925c = kProperty1;
            this.f38926d = kProperty12;
        }

        @Override // p000.InterfaceC32730Eu1
        public Object collect(InterfaceC33198Gu1 interfaceC33198Gu1, Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f38924b.collect(new C8618a(interfaceC33198Gu1, this.f38925c, this.f38926d), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (collect == coroutine_suspended) {
                return collect;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\t\u001a\u00020\b\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006H\u008a@"}, m28432d2 = {"LRN2;", "VM", "LAN2;", "S", "A", "B", "LHN2;", "<name for destructuring parameter 0>", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal2$2", m28418f = "MavericksViewModelExtensions.kt", m28417i = {}, m28416l = {41}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: VN2$d */
    /* loaded from: classes2.dex */
    public static final class C8620d extends SuspendLambda implements Function2<HN2<A, B>, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f38933h;

        /* renamed from: i */
        public /* synthetic */ Object f38934i;

        /* renamed from: j */
        public final /* synthetic */ Function3<A, B, Continuation<? super Unit>, Object> f38935j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8620d(Function3<? super A, ? super B, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super C8620d> continuation) {
            super(2, continuation);
            this.f38935j = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C8620d c8620d = new C8620d(this.f38935j, continuation);
            c8620d.f38934i = obj;
            return c8620d;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(HN2<A, B> hn2, Continuation<? super Unit> continuation) {
            return ((C8620d) create(hn2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f38933h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                HN2 hn2 = (HN2) this.f38934i;
                Object m103929a = hn2.m103929a();
                Object m103928b = hn2.m103928b();
                Function3<A, B, Continuation<? super Unit>, Object> function3 = this.f38935j;
                this.f38933h = 1;
                if (function3.invoke(m103929a, m103928b, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LEu1;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: VN2$e */
    /* loaded from: classes2.dex */
    public static final class C8621e implements InterfaceC32730Eu1<IN2<A, B, C>> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC32730Eu1 f38936b;

        /* renamed from: c */
        public final /* synthetic */ KProperty1 f38937c;

        /* renamed from: d */
        public final /* synthetic */ KProperty1 f38938d;

        /* renamed from: e */
        public final /* synthetic */ KProperty1 f38939e;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: VN2$e$a */
        /* loaded from: classes2.dex */
        public static final class C8622a<T> implements InterfaceC33198Gu1 {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC33198Gu1 f38940b;

            /* renamed from: c */
            public final /* synthetic */ KProperty1 f38941c;

            /* renamed from: d */
            public final /* synthetic */ KProperty1 f38942d;

            /* renamed from: e */
            public final /* synthetic */ KProperty1 f38943e;

            @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
            @DebugMetadata(m28419c = "com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal3$$inlined$map$1$2", m28418f = "MavericksViewModelExtensions.kt", m28417i = {}, m28416l = {224}, m28415m = "emit", m28414n = {}, m28413s = {})
            /* renamed from: VN2$e$a$a */
            /* loaded from: classes2.dex */
            public static final class C8623a extends ContinuationImpl {

                /* renamed from: h */
                public /* synthetic */ Object f38944h;

                /* renamed from: i */
                public int f38945i;

                public C8623a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f38944h = obj;
                    this.f38945i |= Integer.MIN_VALUE;
                    return C8622a.this.emit(null, this);
                }
            }

            public C8622a(InterfaceC33198Gu1 interfaceC33198Gu1, KProperty1 kProperty1, KProperty1 kProperty12, KProperty1 kProperty13) {
                this.f38940b = interfaceC33198Gu1;
                this.f38941c = kProperty1;
                this.f38942d = kProperty12;
                this.f38943e = kProperty13;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // p000.InterfaceC33198Gu1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C8623a c8623a;
                Object coroutine_suspended;
                int i;
                if (continuation instanceof C8623a) {
                    c8623a = (C8623a) continuation;
                    int i2 = c8623a.f38945i;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c8623a.f38945i = i2 - Integer.MIN_VALUE;
                        Object obj2 = c8623a.f38944h;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c8623a.f38945i;
                        if (i == 0) {
                            if (i == 1) {
                                ResultKt.throwOnFailure(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC33198Gu1 interfaceC33198Gu1 = this.f38940b;
                            AN2 an2 = (AN2) obj;
                            IN2 in2 = new IN2(this.f38941c.get(an2), this.f38942d.get(an2), this.f38943e.get(an2));
                            c8623a.f38945i = 1;
                            if (interfaceC33198Gu1.emit(in2, c8623a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                c8623a = new C8623a(continuation);
                Object obj22 = c8623a.f38944h;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c8623a.f38945i;
                if (i == 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public C8621e(InterfaceC32730Eu1 interfaceC32730Eu1, KProperty1 kProperty1, KProperty1 kProperty12, KProperty1 kProperty13) {
            this.f38936b = interfaceC32730Eu1;
            this.f38937c = kProperty1;
            this.f38938d = kProperty12;
            this.f38939e = kProperty13;
        }

        @Override // p000.InterfaceC32730Eu1
        public Object collect(InterfaceC33198Gu1 interfaceC33198Gu1, Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f38936b.collect(new C8622a(interfaceC33198Gu1, this.f38937c, this.f38938d, this.f38939e), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (collect == coroutine_suspended) {
                return collect;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\n\u001a\u00020\t\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005\"\u0004\b\u0004\u0010\u00062\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0007H\u008a@"}, m28432d2 = {"LRN2;", "VM", "LAN2;", "S", "A", "B", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LIN2;", "<name for destructuring parameter 0>", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal3$2", m28418f = "MavericksViewModelExtensions.kt", m28417i = {}, m28416l = {56}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: VN2$f */
    /* loaded from: classes2.dex */
    public static final class C8624f extends SuspendLambda implements Function2<IN2<A, B, C>, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f38947h;

        /* renamed from: i */
        public /* synthetic */ Object f38948i;

        /* renamed from: j */
        public final /* synthetic */ Function4<A, B, C, Continuation<? super Unit>, Object> f38949j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8624f(Function4<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends Object> function4, Continuation<? super C8624f> continuation) {
            super(2, continuation);
            this.f38949j = function4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C8624f c8624f = new C8624f(this.f38949j, continuation);
            c8624f.f38948i = obj;
            return c8624f;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(IN2<A, B, C> in2, Continuation<? super Unit> continuation) {
            return ((C8624f) create(in2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f38947h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                IN2 in2 = (IN2) this.f38948i;
                Object m102447a = in2.m102447a();
                Object m102446b = in2.m102446b();
                Object m102445c = in2.m102445c();
                Function4<A, B, C, Continuation<? super Unit>, Object> function4 = this.f38949j;
                this.f38947h = 1;
                if (function4.invoke(m102447a, m102446b, m102445c, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LEu1;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: VN2$g */
    /* loaded from: classes2.dex */
    public static final class C8625g implements InterfaceC32730Eu1<JN2<A, B, C, D>> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC32730Eu1 f38950b;

        /* renamed from: c */
        public final /* synthetic */ KProperty1 f38951c;

        /* renamed from: d */
        public final /* synthetic */ KProperty1 f38952d;

        /* renamed from: e */
        public final /* synthetic */ KProperty1 f38953e;

        /* renamed from: f */
        public final /* synthetic */ KProperty1 f38954f;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: VN2$g$a */
        /* loaded from: classes2.dex */
        public static final class C8626a<T> implements InterfaceC33198Gu1 {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC33198Gu1 f38955b;

            /* renamed from: c */
            public final /* synthetic */ KProperty1 f38956c;

            /* renamed from: d */
            public final /* synthetic */ KProperty1 f38957d;

            /* renamed from: e */
            public final /* synthetic */ KProperty1 f38958e;

            /* renamed from: f */
            public final /* synthetic */ KProperty1 f38959f;

            @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
            @DebugMetadata(m28419c = "com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal4$$inlined$map$1$2", m28418f = "MavericksViewModelExtensions.kt", m28417i = {}, m28416l = {224}, m28415m = "emit", m28414n = {}, m28413s = {})
            /* renamed from: VN2$g$a$a */
            /* loaded from: classes2.dex */
            public static final class C8627a extends ContinuationImpl {

                /* renamed from: h */
                public /* synthetic */ Object f38960h;

                /* renamed from: i */
                public int f38961i;

                public C8627a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f38960h = obj;
                    this.f38961i |= Integer.MIN_VALUE;
                    return C8626a.this.emit(null, this);
                }
            }

            public C8626a(InterfaceC33198Gu1 interfaceC33198Gu1, KProperty1 kProperty1, KProperty1 kProperty12, KProperty1 kProperty13, KProperty1 kProperty14) {
                this.f38955b = interfaceC33198Gu1;
                this.f38956c = kProperty1;
                this.f38957d = kProperty12;
                this.f38958e = kProperty13;
                this.f38959f = kProperty14;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // p000.InterfaceC33198Gu1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C8627a c8627a;
                Object coroutine_suspended;
                int i;
                if (continuation instanceof C8627a) {
                    c8627a = (C8627a) continuation;
                    int i2 = c8627a.f38961i;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c8627a.f38961i = i2 - Integer.MIN_VALUE;
                        Object obj2 = c8627a.f38960h;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c8627a.f38961i;
                        if (i == 0) {
                            if (i == 1) {
                                ResultKt.throwOnFailure(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC33198Gu1 interfaceC33198Gu1 = this.f38955b;
                            AN2 an2 = (AN2) obj;
                            JN2 jn2 = new JN2(this.f38956c.get(an2), this.f38957d.get(an2), this.f38958e.get(an2), this.f38959f.get(an2));
                            c8627a.f38961i = 1;
                            if (interfaceC33198Gu1.emit(jn2, c8627a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                c8627a = new C8627a(continuation);
                Object obj22 = c8627a.f38960h;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c8627a.f38961i;
                if (i == 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public C8625g(InterfaceC32730Eu1 interfaceC32730Eu1, KProperty1 kProperty1, KProperty1 kProperty12, KProperty1 kProperty13, KProperty1 kProperty14) {
            this.f38950b = interfaceC32730Eu1;
            this.f38951c = kProperty1;
            this.f38952d = kProperty12;
            this.f38953e = kProperty13;
            this.f38954f = kProperty14;
        }

        @Override // p000.InterfaceC32730Eu1
        public Object collect(InterfaceC33198Gu1 interfaceC33198Gu1, Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f38950b.collect(new C8626a(interfaceC33198Gu1, this.f38951c, this.f38952d, this.f38953e, this.f38954f), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (collect == coroutine_suspended) {
                return collect;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u000b\u001a\u00020\n\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005\"\u0004\b\u0004\u0010\u0006\"\u0004\b\u0005\u0010\u00072\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\bH\u008a@"}, m28432d2 = {"LRN2;", "VM", "LAN2;", "S", "A", "B", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "D", "LJN2;", "<name for destructuring parameter 0>", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal4$2", m28418f = "MavericksViewModelExtensions.kt", m28417i = {}, m28416l = {72}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: VN2$h */
    /* loaded from: classes2.dex */
    public static final class C8628h extends SuspendLambda implements Function2<JN2<A, B, C, D>, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f38963h;

        /* renamed from: i */
        public /* synthetic */ Object f38964i;

        /* renamed from: j */
        public final /* synthetic */ Function5<A, B, C, D, Continuation<? super Unit>, Object> f38965j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8628h(Function5<? super A, ? super B, ? super C, ? super D, ? super Continuation<? super Unit>, ? extends Object> function5, Continuation<? super C8628h> continuation) {
            super(2, continuation);
            this.f38965j = function5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C8628h c8628h = new C8628h(this.f38965j, continuation);
            c8628h.f38964i = obj;
            return c8628h;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(JN2<A, B, C, D> jn2, Continuation<? super Unit> continuation) {
            return ((C8628h) create(jn2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f38963h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                JN2 jn2 = (JN2) this.f38964i;
                Object m100638a = jn2.m100638a();
                Object m100637b = jn2.m100637b();
                Object m100636c = jn2.m100636c();
                Object m100635d = jn2.m100635d();
                Function5<A, B, C, D, Continuation<? super Unit>, Object> function5 = this.f38965j;
                this.f38963h = 1;
                if (function5.invoke(m100638a, m100637b, m100636c, m100635d, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LEu1;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: VN2$i */
    /* loaded from: classes2.dex */
    public static final class C8629i implements InterfaceC32730Eu1<KN2<A, B, C, D, E>> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC32730Eu1 f38966b;

        /* renamed from: c */
        public final /* synthetic */ KProperty1 f38967c;

        /* renamed from: d */
        public final /* synthetic */ KProperty1 f38968d;

        /* renamed from: e */
        public final /* synthetic */ KProperty1 f38969e;

        /* renamed from: f */
        public final /* synthetic */ KProperty1 f38970f;

        /* renamed from: g */
        public final /* synthetic */ KProperty1 f38971g;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: VN2$i$a */
        /* loaded from: classes2.dex */
        public static final class C8630a<T> implements InterfaceC33198Gu1 {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC33198Gu1 f38972b;

            /* renamed from: c */
            public final /* synthetic */ KProperty1 f38973c;

            /* renamed from: d */
            public final /* synthetic */ KProperty1 f38974d;

            /* renamed from: e */
            public final /* synthetic */ KProperty1 f38975e;

            /* renamed from: f */
            public final /* synthetic */ KProperty1 f38976f;

            /* renamed from: g */
            public final /* synthetic */ KProperty1 f38977g;

            @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
            @DebugMetadata(m28419c = "com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal5$$inlined$map$1$2", m28418f = "MavericksViewModelExtensions.kt", m28417i = {}, m28416l = {224}, m28415m = "emit", m28414n = {}, m28413s = {})
            /* renamed from: VN2$i$a$a */
            /* loaded from: classes2.dex */
            public static final class C8631a extends ContinuationImpl {

                /* renamed from: h */
                public /* synthetic */ Object f38978h;

                /* renamed from: i */
                public int f38979i;

                public C8631a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f38978h = obj;
                    this.f38979i |= Integer.MIN_VALUE;
                    return C8630a.this.emit(null, this);
                }
            }

            public C8630a(InterfaceC33198Gu1 interfaceC33198Gu1, KProperty1 kProperty1, KProperty1 kProperty12, KProperty1 kProperty13, KProperty1 kProperty14, KProperty1 kProperty15) {
                this.f38972b = interfaceC33198Gu1;
                this.f38973c = kProperty1;
                this.f38974d = kProperty12;
                this.f38975e = kProperty13;
                this.f38976f = kProperty14;
                this.f38977g = kProperty15;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // p000.InterfaceC33198Gu1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C8631a c8631a;
                Object coroutine_suspended;
                int i;
                if (continuation instanceof C8631a) {
                    c8631a = (C8631a) continuation;
                    int i2 = c8631a.f38979i;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c8631a.f38979i = i2 - Integer.MIN_VALUE;
                        Object obj2 = c8631a.f38978h;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c8631a.f38979i;
                        if (i == 0) {
                            if (i == 1) {
                                ResultKt.throwOnFailure(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC33198Gu1 interfaceC33198Gu1 = this.f38972b;
                            AN2 an2 = (AN2) obj;
                            KN2 kn2 = new KN2(this.f38973c.get(an2), this.f38974d.get(an2), this.f38975e.get(an2), this.f38976f.get(an2), this.f38977g.get(an2));
                            c8631a.f38979i = 1;
                            if (interfaceC33198Gu1.emit(kn2, c8631a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                c8631a = new C8631a(continuation);
                Object obj22 = c8631a.f38978h;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c8631a.f38979i;
                if (i == 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public C8629i(InterfaceC32730Eu1 interfaceC32730Eu1, KProperty1 kProperty1, KProperty1 kProperty12, KProperty1 kProperty13, KProperty1 kProperty14, KProperty1 kProperty15) {
            this.f38966b = interfaceC32730Eu1;
            this.f38967c = kProperty1;
            this.f38968d = kProperty12;
            this.f38969e = kProperty13;
            this.f38970f = kProperty14;
            this.f38971g = kProperty15;
        }

        @Override // p000.InterfaceC32730Eu1
        public Object collect(InterfaceC33198Gu1 interfaceC33198Gu1, Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f38966b.collect(new C8630a(interfaceC33198Gu1, this.f38967c, this.f38968d, this.f38969e, this.f38970f, this.f38971g), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (collect == coroutine_suspended) {
                return collect;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\f\u001a\u00020\u000b\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005\"\u0004\b\u0004\u0010\u0006\"\u0004\b\u0005\u0010\u0007\"\u0004\b\u0006\u0010\b2$\u0010\n\u001a \u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00060\tH\u008a@"}, m28432d2 = {"LRN2;", "VM", "LAN2;", "S", "A", "B", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "D", "E", "LKN2;", "<name for destructuring parameter 0>", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal5$2", m28418f = "MavericksViewModelExtensions.kt", m28417i = {}, m28416l = {89}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: VN2$j */
    /* loaded from: classes2.dex */
    public static final class C8632j extends SuspendLambda implements Function2<KN2<A, B, C, D, E>, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f38981h;

        /* renamed from: i */
        public /* synthetic */ Object f38982i;

        /* renamed from: j */
        public final /* synthetic */ Function6<A, B, C, D, E, Continuation<? super Unit>, Object> f38983j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8632j(Function6<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends Object> function6, Continuation<? super C8632j> continuation) {
            super(2, continuation);
            this.f38983j = function6;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C8632j c8632j = new C8632j(this.f38983j, continuation);
            c8632j.f38982i = obj;
            return c8632j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(KN2<A, B, C, D, E> kn2, Continuation<? super Unit> continuation) {
            return ((C8632j) create(kn2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f38981h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                KN2 kn2 = (KN2) this.f38982i;
                Object m98957a = kn2.m98957a();
                Object m98956b = kn2.m98956b();
                Object m98955c = kn2.m98955c();
                Object m98954d = kn2.m98954d();
                Object m98953e = kn2.m98953e();
                Function6<A, B, C, D, E, Continuation<? super Unit>, Object> function6 = this.f38983j;
                this.f38981h = 1;
                if (function6.invoke(m98957a, m98956b, m98955c, m98954d, m98953e, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LEu1;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: VN2$k */
    /* loaded from: classes2.dex */
    public static final class C8633k implements InterfaceC32730Eu1<LN2<A, B, C, D, E, F>> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC32730Eu1 f38984b;

        /* renamed from: c */
        public final /* synthetic */ KProperty1 f38985c;

        /* renamed from: d */
        public final /* synthetic */ KProperty1 f38986d;

        /* renamed from: e */
        public final /* synthetic */ KProperty1 f38987e;

        /* renamed from: f */
        public final /* synthetic */ KProperty1 f38988f;

        /* renamed from: g */
        public final /* synthetic */ KProperty1 f38989g;

        /* renamed from: h */
        public final /* synthetic */ KProperty1 f38990h;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: VN2$k$a */
        /* loaded from: classes2.dex */
        public static final class C8634a<T> implements InterfaceC33198Gu1 {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC33198Gu1 f38991b;

            /* renamed from: c */
            public final /* synthetic */ KProperty1 f38992c;

            /* renamed from: d */
            public final /* synthetic */ KProperty1 f38993d;

            /* renamed from: e */
            public final /* synthetic */ KProperty1 f38994e;

            /* renamed from: f */
            public final /* synthetic */ KProperty1 f38995f;

            /* renamed from: g */
            public final /* synthetic */ KProperty1 f38996g;

            /* renamed from: h */
            public final /* synthetic */ KProperty1 f38997h;

            @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
            @DebugMetadata(m28419c = "com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal6$$inlined$map$1$2", m28418f = "MavericksViewModelExtensions.kt", m28417i = {}, m28416l = {224}, m28415m = "emit", m28414n = {}, m28413s = {})
            /* renamed from: VN2$k$a$a */
            /* loaded from: classes2.dex */
            public static final class C8635a extends ContinuationImpl {

                /* renamed from: h */
                public /* synthetic */ Object f38998h;

                /* renamed from: i */
                public int f38999i;

                public C8635a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f38998h = obj;
                    this.f38999i |= Integer.MIN_VALUE;
                    return C8634a.this.emit(null, this);
                }
            }

            public C8634a(InterfaceC33198Gu1 interfaceC33198Gu1, KProperty1 kProperty1, KProperty1 kProperty12, KProperty1 kProperty13, KProperty1 kProperty14, KProperty1 kProperty15, KProperty1 kProperty16) {
                this.f38991b = interfaceC33198Gu1;
                this.f38992c = kProperty1;
                this.f38993d = kProperty12;
                this.f38994e = kProperty13;
                this.f38995f = kProperty14;
                this.f38996g = kProperty15;
                this.f38997h = kProperty16;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // p000.InterfaceC33198Gu1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C8635a c8635a;
                Object coroutine_suspended;
                int i;
                if (continuation instanceof C8635a) {
                    c8635a = (C8635a) continuation;
                    int i2 = c8635a.f38999i;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c8635a.f38999i = i2 - Integer.MIN_VALUE;
                        Object obj2 = c8635a.f38998h;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c8635a.f38999i;
                        if (i == 0) {
                            if (i == 1) {
                                ResultKt.throwOnFailure(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC33198Gu1 interfaceC33198Gu1 = this.f38991b;
                            AN2 an2 = (AN2) obj;
                            LN2 ln2 = new LN2(this.f38992c.get(an2), this.f38993d.get(an2), this.f38994e.get(an2), this.f38995f.get(an2), this.f38996g.get(an2), this.f38997h.get(an2));
                            c8635a.f38999i = 1;
                            if (interfaceC33198Gu1.emit(ln2, c8635a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                c8635a = new C8635a(continuation);
                Object obj22 = c8635a.f38998h;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c8635a.f38999i;
                if (i == 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public C8633k(InterfaceC32730Eu1 interfaceC32730Eu1, KProperty1 kProperty1, KProperty1 kProperty12, KProperty1 kProperty13, KProperty1 kProperty14, KProperty1 kProperty15, KProperty1 kProperty16) {
            this.f38984b = interfaceC32730Eu1;
            this.f38985c = kProperty1;
            this.f38986d = kProperty12;
            this.f38987e = kProperty13;
            this.f38988f = kProperty14;
            this.f38989g = kProperty15;
            this.f38990h = kProperty16;
        }

        @Override // p000.InterfaceC32730Eu1
        public Object collect(InterfaceC33198Gu1 interfaceC33198Gu1, Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f38984b.collect(new C8634a(interfaceC33198Gu1, this.f38985c, this.f38986d, this.f38987e, this.f38988f, this.f38989g, this.f38990h), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (collect == coroutine_suspended) {
                return collect;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\r\u001a\u00020\f\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005\"\u0004\b\u0004\u0010\u0006\"\u0004\b\u0005\u0010\u0007\"\u0004\b\u0006\u0010\b\"\u0004\b\u0007\u0010\t2*\u0010\u000b\u001a&\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\nH\u008a@"}, m28432d2 = {"LRN2;", "VM", "LAN2;", "S", "A", "B", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "D", "E", "F", "LLN2;", "<name for destructuring parameter 0>", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal6$2", m28418f = "MavericksViewModelExtensions.kt", m28417i = {}, m28416l = {107}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: VN2$l */
    /* loaded from: classes2.dex */
    public static final class C8636l extends SuspendLambda implements Function2<LN2<A, B, C, D, E, F>, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f39001h;

        /* renamed from: i */
        public /* synthetic */ Object f39002i;

        /* renamed from: j */
        public final /* synthetic */ Function7<A, B, C, D, E, F, Continuation<? super Unit>, Object> f39003j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8636l(Function7<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super Continuation<? super Unit>, ? extends Object> function7, Continuation<? super C8636l> continuation) {
            super(2, continuation);
            this.f39003j = function7;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C8636l c8636l = new C8636l(this.f39003j, continuation);
            c8636l.f39002i = obj;
            return c8636l;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(LN2<A, B, C, D, E, F> ln2, Continuation<? super Unit> continuation) {
            return ((C8636l) create(ln2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f39001h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                LN2 ln2 = (LN2) this.f39002i;
                Object m96996a = ln2.m96996a();
                Object m96995b = ln2.m96995b();
                Object m96994c = ln2.m96994c();
                Object m96993d = ln2.m96993d();
                Object m96992e = ln2.m96992e();
                Object m96991f = ln2.m96991f();
                Function7<A, B, C, D, E, F, Continuation<? super Unit>, Object> function7 = this.f39003j;
                this.f39001h = 1;
                if (function7.invoke(m96996a, m96995b, m96994c, m96993d, m96992e, m96991f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LEu1;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: VN2$m */
    /* loaded from: classes2.dex */
    public static final class C8637m implements InterfaceC32730Eu1<MN2<A, B, C, D, E, F, G>> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC32730Eu1 f39004b;

        /* renamed from: c */
        public final /* synthetic */ KProperty1 f39005c;

        /* renamed from: d */
        public final /* synthetic */ KProperty1 f39006d;

        /* renamed from: e */
        public final /* synthetic */ KProperty1 f39007e;

        /* renamed from: f */
        public final /* synthetic */ KProperty1 f39008f;

        /* renamed from: g */
        public final /* synthetic */ KProperty1 f39009g;

        /* renamed from: h */
        public final /* synthetic */ KProperty1 f39010h;

        /* renamed from: i */
        public final /* synthetic */ KProperty1 f39011i;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: VN2$m$a */
        /* loaded from: classes2.dex */
        public static final class C8638a<T> implements InterfaceC33198Gu1 {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC33198Gu1 f39012b;

            /* renamed from: c */
            public final /* synthetic */ KProperty1 f39013c;

            /* renamed from: d */
            public final /* synthetic */ KProperty1 f39014d;

            /* renamed from: e */
            public final /* synthetic */ KProperty1 f39015e;

            /* renamed from: f */
            public final /* synthetic */ KProperty1 f39016f;

            /* renamed from: g */
            public final /* synthetic */ KProperty1 f39017g;

            /* renamed from: h */
            public final /* synthetic */ KProperty1 f39018h;

            /* renamed from: i */
            public final /* synthetic */ KProperty1 f39019i;

            @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
            @DebugMetadata(m28419c = "com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal7$$inlined$map$1$2", m28418f = "MavericksViewModelExtensions.kt", m28417i = {}, m28416l = {224}, m28415m = "emit", m28414n = {}, m28413s = {})
            /* renamed from: VN2$m$a$a */
            /* loaded from: classes2.dex */
            public static final class C8639a extends ContinuationImpl {

                /* renamed from: h */
                public /* synthetic */ Object f39020h;

                /* renamed from: i */
                public int f39021i;

                public C8639a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f39020h = obj;
                    this.f39021i |= Integer.MIN_VALUE;
                    return C8638a.this.emit(null, this);
                }
            }

            public C8638a(InterfaceC33198Gu1 interfaceC33198Gu1, KProperty1 kProperty1, KProperty1 kProperty12, KProperty1 kProperty13, KProperty1 kProperty14, KProperty1 kProperty15, KProperty1 kProperty16, KProperty1 kProperty17) {
                this.f39012b = interfaceC33198Gu1;
                this.f39013c = kProperty1;
                this.f39014d = kProperty12;
                this.f39015e = kProperty13;
                this.f39016f = kProperty14;
                this.f39017g = kProperty15;
                this.f39018h = kProperty16;
                this.f39019i = kProperty17;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // p000.InterfaceC33198Gu1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C8639a c8639a;
                Object coroutine_suspended;
                int i;
                if (continuation instanceof C8639a) {
                    c8639a = (C8639a) continuation;
                    int i2 = c8639a.f39021i;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c8639a.f39021i = i2 - Integer.MIN_VALUE;
                        Object obj2 = c8639a.f39020h;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c8639a.f39021i;
                        if (i == 0) {
                            if (i == 1) {
                                ResultKt.throwOnFailure(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC33198Gu1 interfaceC33198Gu1 = this.f39012b;
                            AN2 an2 = (AN2) obj;
                            MN2 mn2 = new MN2(this.f39013c.get(an2), this.f39014d.get(an2), this.f39015e.get(an2), this.f39016f.get(an2), this.f39017g.get(an2), this.f39018h.get(an2), this.f39019i.get(an2));
                            c8639a.f39021i = 1;
                            if (interfaceC33198Gu1.emit(mn2, c8639a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                c8639a = new C8639a(continuation);
                Object obj22 = c8639a.f39020h;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c8639a.f39021i;
                if (i == 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public C8637m(InterfaceC32730Eu1 interfaceC32730Eu1, KProperty1 kProperty1, KProperty1 kProperty12, KProperty1 kProperty13, KProperty1 kProperty14, KProperty1 kProperty15, KProperty1 kProperty16, KProperty1 kProperty17) {
            this.f39004b = interfaceC32730Eu1;
            this.f39005c = kProperty1;
            this.f39006d = kProperty12;
            this.f39007e = kProperty13;
            this.f39008f = kProperty14;
            this.f39009g = kProperty15;
            this.f39010h = kProperty16;
            this.f39011i = kProperty17;
        }

        @Override // p000.InterfaceC32730Eu1
        public Object collect(InterfaceC33198Gu1 interfaceC33198Gu1, Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f39004b.collect(new C8638a(interfaceC33198Gu1, this.f39005c, this.f39006d, this.f39007e, this.f39008f, this.f39009g, this.f39010h, this.f39011i), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (collect == coroutine_suspended) {
                return collect;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u000e\u001a\u00020\r\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005\"\u0004\b\u0004\u0010\u0006\"\u0004\b\u0005\u0010\u0007\"\u0004\b\u0006\u0010\b\"\u0004\b\u0007\u0010\t\"\u0004\b\b\u0010\n20\u0010\f\u001a,\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b0\u000bH\u008a@"}, m28432d2 = {"LRN2;", "VM", "LAN2;", "S", "A", "B", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "D", "E", "F", "G", "LMN2;", "<name for destructuring parameter 0>", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal7$2", m28418f = "MavericksViewModelExtensions.kt", m28417i = {}, m28416l = {126}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: VN2$n */
    /* loaded from: classes2.dex */
    public static final class C8640n extends SuspendLambda implements Function2<MN2<A, B, C, D, E, F, G>, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f39023h;

        /* renamed from: i */
        public /* synthetic */ Object f39024i;

        /* renamed from: j */
        public final /* synthetic */ Function8<A, B, C, D, E, F, G, Continuation<? super Unit>, Object> f39025j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8640n(Function8<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super G, ? super Continuation<? super Unit>, ? extends Object> function8, Continuation<? super C8640n> continuation) {
            super(2, continuation);
            this.f39025j = function8;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C8640n c8640n = new C8640n(this.f39025j, continuation);
            c8640n.f39024i = obj;
            return c8640n;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(MN2<A, B, C, D, E, F, G> mn2, Continuation<? super Unit> continuation) {
            return ((C8640n) create(mn2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f39023h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                MN2 mn2 = (MN2) this.f39024i;
                Object m95393a = mn2.m95393a();
                Object m95392b = mn2.m95392b();
                Object m95391c = mn2.m95391c();
                Object m95390d = mn2.m95390d();
                Object m95389e = mn2.m95389e();
                Object m95388f = mn2.m95388f();
                Object m95387g = mn2.m95387g();
                Function8<A, B, C, D, E, F, G, Continuation<? super Unit>, Object> function8 = this.f39025j;
                this.f39023h = 1;
                if (function8.invoke(m95393a, m95392b, m95391c, m95390d, m95389e, m95388f, m95387g, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002\"\u0004\b\u0002\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005H\u008a@"}, m28432d2 = {"LRN2;", "VM", "LAN2;", "S", "T", "Ldp;", "asyncValue", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internalSF$1", m28418f = "MavericksViewModelExtensions.kt", m28417i = {}, m28416l = {138, 140}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: VN2$o */
    /* loaded from: classes2.dex */
    public static final class C8641o extends SuspendLambda implements Function2<AbstractC19862dp<? extends T>, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f39026h;

        /* renamed from: i */
        public /* synthetic */ Object f39027i;

        /* renamed from: j */
        public final /* synthetic */ Function2<T, Continuation<? super Unit>, Object> f39028j;

        /* renamed from: k */
        public final /* synthetic */ Function2<Throwable, Continuation<? super Unit>, Object> f39029k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8641o(Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, Function2<? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function22, Continuation<? super C8641o> continuation) {
            super(2, continuation);
            this.f39028j = function2;
            this.f39029k = function22;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C8641o c8641o = new C8641o(this.f39028j, this.f39029k, continuation);
            c8641o.f39027i = obj;
            return c8641o;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(AbstractC19862dp<? extends T> abstractC19862dp, Continuation<? super Unit> continuation) {
            return ((C8641o) create(abstractC19862dp, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f39026h;
            if (i != 0) {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                AbstractC19862dp abstractC19862dp = (AbstractC19862dp) this.f39027i;
                Function2<T, Continuation<? super Unit>, Object> function2 = this.f39028j;
                if (function2 != 0 && (abstractC19862dp instanceof C51034wT5)) {
                    Object mo6788a = ((C51034wT5) abstractC19862dp).mo6788a();
                    this.f39026h = 1;
                    if (function2.invoke(mo6788a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    Function2<Throwable, Continuation<? super Unit>, Object> function22 = this.f39029k;
                    if (function22 != null && (abstractC19862dp instanceof C32163Cj1)) {
                        Throwable m111793b = ((C32163Cj1) abstractC19862dp).m111793b();
                        this.f39026h = 2;
                        if (function22.invoke(m111793b, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static final <VM extends RN2<S>, S extends AN2> InterfaceC52943zh2 m79926a(VM vm, LifecycleOwner lifecycleOwner, AbstractC37698a01 deliveryMode, Function2<? super S, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(vm, "<this>");
        Intrinsics.checkNotNullParameter(deliveryMode, "deliveryMode");
        Intrinsics.checkNotNullParameter(action, "action");
        return vm.resolveSubscription$mvrx_release(vm.getStateFlow(), lifecycleOwner, deliveryMode, action);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static final <VM extends RN2<S>, S extends AN2, A> InterfaceC52943zh2 m79925b(VM vm, LifecycleOwner lifecycleOwner, KProperty1<S, ? extends A> prop1, AbstractC37698a01 deliveryMode, Function2<? super A, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(vm, "<this>");
        Intrinsics.checkNotNullParameter(prop1, "prop1");
        Intrinsics.checkNotNullParameter(deliveryMode, "deliveryMode");
        Intrinsics.checkNotNullParameter(action, "action");
        return vm.resolveSubscription$mvrx_release(C36708Vu1.m79255p(new C8613a(vm.getStateFlow(), prop1)), lifecycleOwner, deliveryMode.m72134a(prop1), new C8616b(action, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static final <VM extends RN2<S>, S extends AN2, A, B> InterfaceC52943zh2 m79924c(VM vm, LifecycleOwner lifecycleOwner, KProperty1<S, ? extends A> prop1, KProperty1<S, ? extends B> prop2, AbstractC37698a01 deliveryMode, Function3<? super A, ? super B, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(vm, "<this>");
        Intrinsics.checkNotNullParameter(prop1, "prop1");
        Intrinsics.checkNotNullParameter(prop2, "prop2");
        Intrinsics.checkNotNullParameter(deliveryMode, "deliveryMode");
        Intrinsics.checkNotNullParameter(action, "action");
        return vm.resolveSubscription$mvrx_release(C36708Vu1.m79255p(new C8617c(vm.getStateFlow(), prop1, prop2)), lifecycleOwner, deliveryMode.m72134a(prop1, prop2), new C8620d(action, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static final <VM extends RN2<S>, S extends AN2, A, B, C> InterfaceC52943zh2 m79923d(VM vm, LifecycleOwner lifecycleOwner, KProperty1<S, ? extends A> prop1, KProperty1<S, ? extends B> prop2, KProperty1<S, ? extends C> prop3, AbstractC37698a01 deliveryMode, Function4<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(vm, "<this>");
        Intrinsics.checkNotNullParameter(prop1, "prop1");
        Intrinsics.checkNotNullParameter(prop2, "prop2");
        Intrinsics.checkNotNullParameter(prop3, "prop3");
        Intrinsics.checkNotNullParameter(deliveryMode, "deliveryMode");
        Intrinsics.checkNotNullParameter(action, "action");
        return vm.resolveSubscription$mvrx_release(C36708Vu1.m79255p(new C8621e(vm.getStateFlow(), prop1, prop2, prop3)), lifecycleOwner, deliveryMode.m72134a(prop1, prop2, prop3), new C8624f(action, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public static final <VM extends RN2<S>, S extends AN2, A, B, C, D> InterfaceC52943zh2 m79922e(VM vm, LifecycleOwner lifecycleOwner, KProperty1<S, ? extends A> prop1, KProperty1<S, ? extends B> prop2, KProperty1<S, ? extends C> prop3, KProperty1<S, ? extends D> prop4, AbstractC37698a01 deliveryMode, Function5<? super A, ? super B, ? super C, ? super D, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(vm, "<this>");
        Intrinsics.checkNotNullParameter(prop1, "prop1");
        Intrinsics.checkNotNullParameter(prop2, "prop2");
        Intrinsics.checkNotNullParameter(prop3, "prop3");
        Intrinsics.checkNotNullParameter(prop4, "prop4");
        Intrinsics.checkNotNullParameter(deliveryMode, "deliveryMode");
        Intrinsics.checkNotNullParameter(action, "action");
        return vm.resolveSubscription$mvrx_release(C36708Vu1.m79255p(new C8625g(vm.getStateFlow(), prop1, prop2, prop3, prop4)), lifecycleOwner, deliveryMode.m72134a(prop1, prop2, prop3, prop4), new C8628h(action, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public static final <VM extends RN2<S>, S extends AN2, A, B, C, D, E> InterfaceC52943zh2 m79921f(VM vm, LifecycleOwner lifecycleOwner, KProperty1<S, ? extends A> prop1, KProperty1<S, ? extends B> prop2, KProperty1<S, ? extends C> prop3, KProperty1<S, ? extends D> prop4, KProperty1<S, ? extends E> prop5, AbstractC37698a01 deliveryMode, Function6<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(vm, "<this>");
        Intrinsics.checkNotNullParameter(prop1, "prop1");
        Intrinsics.checkNotNullParameter(prop2, "prop2");
        Intrinsics.checkNotNullParameter(prop3, "prop3");
        Intrinsics.checkNotNullParameter(prop4, "prop4");
        Intrinsics.checkNotNullParameter(prop5, "prop5");
        Intrinsics.checkNotNullParameter(deliveryMode, "deliveryMode");
        Intrinsics.checkNotNullParameter(action, "action");
        return vm.resolveSubscription$mvrx_release(C36708Vu1.m79255p(new C8629i(vm.getStateFlow(), prop1, prop2, prop3, prop4, prop5)), lifecycleOwner, deliveryMode.m72134a(prop1, prop2, prop3, prop4, prop5), new C8632j(action, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public static final <VM extends RN2<S>, S extends AN2, A, B, C, D, E, F> InterfaceC52943zh2 m79920g(VM vm, LifecycleOwner lifecycleOwner, KProperty1<S, ? extends A> prop1, KProperty1<S, ? extends B> prop2, KProperty1<S, ? extends C> prop3, KProperty1<S, ? extends D> prop4, KProperty1<S, ? extends E> prop5, KProperty1<S, ? extends F> prop6, AbstractC37698a01 deliveryMode, Function7<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(vm, "<this>");
        Intrinsics.checkNotNullParameter(prop1, "prop1");
        Intrinsics.checkNotNullParameter(prop2, "prop2");
        Intrinsics.checkNotNullParameter(prop3, "prop3");
        Intrinsics.checkNotNullParameter(prop4, "prop4");
        Intrinsics.checkNotNullParameter(prop5, "prop5");
        Intrinsics.checkNotNullParameter(prop6, "prop6");
        Intrinsics.checkNotNullParameter(deliveryMode, "deliveryMode");
        Intrinsics.checkNotNullParameter(action, "action");
        return vm.resolveSubscription$mvrx_release(C36708Vu1.m79255p(new C8633k(vm.getStateFlow(), prop1, prop2, prop3, prop4, prop5, prop6)), lifecycleOwner, deliveryMode.m72134a(prop1, prop2, prop3, prop4, prop5, prop6), new C8636l(action, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public static final <VM extends RN2<S>, S extends AN2, A, B, C, D, E, F, G> InterfaceC52943zh2 m79919h(VM vm, LifecycleOwner lifecycleOwner, KProperty1<S, ? extends A> prop1, KProperty1<S, ? extends B> prop2, KProperty1<S, ? extends C> prop3, KProperty1<S, ? extends D> prop4, KProperty1<S, ? extends E> prop5, KProperty1<S, ? extends F> prop6, KProperty1<S, ? extends G> prop7, AbstractC37698a01 deliveryMode, Function8<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super G, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(vm, "<this>");
        Intrinsics.checkNotNullParameter(prop1, "prop1");
        Intrinsics.checkNotNullParameter(prop2, "prop2");
        Intrinsics.checkNotNullParameter(prop3, "prop3");
        Intrinsics.checkNotNullParameter(prop4, "prop4");
        Intrinsics.checkNotNullParameter(prop5, "prop5");
        Intrinsics.checkNotNullParameter(prop6, "prop6");
        Intrinsics.checkNotNullParameter(prop7, "prop7");
        Intrinsics.checkNotNullParameter(deliveryMode, "deliveryMode");
        Intrinsics.checkNotNullParameter(action, "action");
        return vm.resolveSubscription$mvrx_release(C36708Vu1.m79255p(new C8637m(vm.getStateFlow(), prop1, prop2, prop3, prop4, prop5, prop6, prop7)), lifecycleOwner, deliveryMode.m72134a(prop1, prop2, prop3, prop4, prop5, prop6, prop7), new C8640n(action, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public static final <VM extends RN2<S>, S extends AN2, T> InterfaceC52943zh2 m79918i(VM vm, LifecycleOwner lifecycleOwner, KProperty1<S, ? extends AbstractC19862dp<? extends T>> asyncProp, AbstractC37698a01 deliveryMode, Function2<? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function2, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function22) {
        Intrinsics.checkNotNullParameter(vm, "<this>");
        Intrinsics.checkNotNullParameter(asyncProp, "asyncProp");
        Intrinsics.checkNotNullParameter(deliveryMode, "deliveryMode");
        return m79925b(vm, lifecycleOwner, asyncProp, deliveryMode.m72134a(asyncProp), new C8641o(function22, function2, null));
    }
}
