package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: S
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004'+1\u001bB#\b\u0001\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000&\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010*¢\u0006\u0004\b^\u0010_B\u001b\b\u0010\u0012\u0006\u0010\u000f\u001a\u00028\u0000\u0012\b\u0010/\u001a\u0004\u0018\u00010*¢\u0006\u0004\b^\u0010`J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u001f\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u00152\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\u00152\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0017J)\u0010\u001b\u001a\u00020\u00152\u0018\u0010\u001a\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0019R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001d\u001a\u00020\u00032\u0018\u0010\u001a\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0019R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u0000H\u0001¢\u0006\u0004\b!\u0010 J)\u0010$\u001a\u00020\u00032\u0018\u0010#\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030\"R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b$\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0019\u0010/\u001a\u0004\u0018\u00010*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R+\u0010\u0010\u001a\u00028\u00002\u0006\u00100\u001a\u00028\u00008F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R7\u0010<\u001a\b\u0012\u0004\u0012\u00028\u0000072\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u0000078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u00102\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R1\u0010\u0011\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00058F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b\u0016\u00102\u0012\u0004\b@\u0010\u000e\u001a\u0004\b=\u0010>\"\u0004\b?\u0010\fR+\u0010C\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b!\u00102\u001a\u0004\bA\u0010>\"\u0004\bB\u0010\fR+\u0010I\u001a\u00020\u00152\u0006\u00100\u001a\u00020\u00158@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bD\u00102\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR,\u0010L\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0019R\b\u0012\u0004\u0012\u00028\u00000\u00000J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010KR\u001e\u0010N\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010KR1\u0010R\u001a\u00020\u00152\u0006\u00100\u001a\u00020\u00158F@@X\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b=\u00102\u0012\u0004\bQ\u0010\u000e\u001a\u0004\bO\u0010F\"\u0004\bP\u0010HR\"\u0010U\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u0010S\u001a\u0004\bM\u0010>\"\u0004\bT\u0010\fR\u001b\u0010X\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bA\u0010V\u001a\u0004\bW\u0010>R$\u0010[\u001a\u00028\u00002\u0006\u0010Y\u001a\u00028\u00008F@@X\u0086\u000e¢\u0006\f\u001a\u0004\bD\u00104\"\u0004\bZ\u00106R\u0011\u0010]\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\\\u0010F¨\u0006a"}, m28432d2 = {"LF96;", "S", "", "", "r", "", "frameTimeNanos", "", "durationScale", "s", "(JF)V", "u", "(J)V", "t", "()V", "initialState", "targetState", "playTimeNanos", "y", "(Ljava/lang/Object;Ljava/lang/Object;J)V", "transition", "", "e", "(LF96;)Z", "x", "LF96$d;", "animation", DateTokenConverter.CONVERTER_KEY, "(LF96$d;)Z", "w", "(LF96$d;)V", "G", "(Ljava/lang/Object;LEt0;I)V", "f", "LF96$a;", "deferredAnimation", "v", "(LF96$a;)V", "LKX2;", C17296a.f69688o, "LKX2;", "transitionState", "", "b", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "label", "<set-?>", "c", "LEX2;", "m", "()Ljava/lang/Object;", "E", "(Ljava/lang/Object;)V", "LF96$b;", "k", "()LF96$b;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "(LF96$b;)V", "segment", "j", "()J", "A", "getPlayTimeNanos$annotations", "l", "D", "startTimeNanos", "g", "o", "()Z", "F", "(Z)V", "updateChildrenNeeded", "LMM5;", "LMM5;", "_animations", "i", "_transitions", "q", "B", "isSeeking$annotations", "isSeeking", "J", "setLastSeekedTimeNanos$animation_core_release", "lastSeekedTimeNanos", "LsP5;", "n", "totalDurationNanos", "value", "z", "currentState", "p", "isRunning", "<init>", "(LKX2;Ljava/lang/String;)V", "(Ljava/lang/Object;Ljava/lang/String;)V", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1155:1\n76#2:1156\n102#2,2:1157\n76#2:1159\n102#2,2:1160\n76#2:1162\n102#2,2:1163\n76#2:1165\n102#2,2:1166\n76#2:1168\n102#2,2:1169\n76#2:1171\n102#2,2:1172\n76#2:1174\n1855#3,2:1175\n1855#3,2:1177\n1855#3,2:1179\n1855#3,2:1181\n1855#3,2:1183\n1855#3,2:1192\n36#4:1185\n1057#5,6:1186\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition\n*L\n212#1:1156\n212#1:1157,2\n219#1:1159\n219#1:1160,2\n234#1:1162\n234#1:1163,2\n235#1:1165\n235#1:1166,2\n238#1:1168\n238#1:1169,2\n258#1:1171\n258#1:1172,2\n270#1:1174\n294#1:1175,2\n303#1:1177,2\n364#1:1179,2\n377#1:1181,2\n416#1:1183,2\n453#1:1192,2\n431#1:1185\n431#1:1186,6\n*E\n"})
/* renamed from: F96 */
/* loaded from: classes.dex */
public final class F96<S> {

    /* renamed from: a */
    public final KX2<S> f8923a;

    /* renamed from: b */
    public final String f8924b;

    /* renamed from: c */
    public final EX2 f8925c;

    /* renamed from: d */
    public final EX2 f8926d;

    /* renamed from: e */
    public final EX2 f8927e;

    /* renamed from: f */
    public final EX2 f8928f;

    /* renamed from: g */
    public final EX2 f8929g;

    /* renamed from: h */
    public final MM5<F96<S>.C2191d<?, ?>> f8930h;

    /* renamed from: i */
    public final MM5<F96<?>> f8931i;

    /* renamed from: j */
    public final EX2 f8932j;

    /* renamed from: k */
    public long f8933k;

    /* renamed from: l */
    public final InterfaceC48627sP5 f8934l;

    @Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\u00020\u0004:\u0001\u000fB%\b\u0000\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0013\u0012\u0006\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b&\u0010'JT\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e2#\u0010\t\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0005¢\u0006\u0002\b\b2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00028\u00010\u0005J\u000f\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR{\u0010%\u001a*\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u001eR\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000R\b\u0012\u0004\u0012\u00028\u00000\u001f2.\u0010 \u001a*\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u001eR\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000R\b\u0012\u0004\u0012\u00028\u00000\u001f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b\u0019\u0010#\"\u0004\b!\u0010$¨\u0006("}, m28432d2 = {"LF96$a;", "T", "Lvf;", "V", "", "Lkotlin/Function1;", "LF96$b;", "Ltm1;", "Lkotlin/ExtensionFunctionType;", "transitionSpec", "Lkotlin/ParameterName;", "name", TransferTable.COLUMN_STATE, "targetValueByState", "LsP5;", C17296a.f69688o, "", DateTokenConverter.CONVERTER_KEY, "()V", "Lwb6;", "Lwb6;", "getTypeConverter", "()Lwb6;", "typeConverter", "", "b", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "label", "LF96$a$a;", "LF96;", "<set-?>", "c", "LEX2;", "()LF96$a$a;", "(LF96$a$a;)V", MessageExtension.FIELD_DATA, "<init>", "(LF96;Lwb6;Ljava/lang/String;)V", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$DeferredAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1155:1\n76#2:1156\n102#2,2:1157\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$DeferredAnimation\n*L\n655#1:1156\n655#1:1157,2\n*E\n"})
    /* renamed from: F96$a */
    /* loaded from: classes.dex */
    public final class C2187a<T, V extends AbstractC29607vf> {

        /* renamed from: a */
        public final InterfaceC51108wb6<T, V> f8935a;

        /* renamed from: b */
        public final String f8936b;

        /* renamed from: c */
        public final EX2 f8937c;

        /* renamed from: d */
        public final /* synthetic */ F96<S> f8938d;

        @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\u0004\u0018\u0000*\u0004\b\u0003\u0010\u0001*\b\b\u0004\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00030\u0004Bm\u0012\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\tR\b\u0012\u0004\u0012\u00028\u00000\n\u0012#\u0010\u0018\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00110\u0010¢\u0006\u0002\b\u0012\u0012!\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00028\u00030\u0010¢\u0006\u0004\b#\u0010$J\u0014\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005R-\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\tR\b\u0012\u0004\u0012\u00028\u00000\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR?\u0010\u0018\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00110\u0010¢\u0006\u0002\b\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R=\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00028\u00030\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015\"\u0004\b\u001e\u0010\u0017R\u0014\u0010\"\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006%"}, m28432d2 = {"LF96$a$a;", "T", "Lvf;", "V", "LsP5;", "LF96$b;", "segment", "", "j", "LF96$d;", "LF96;", "b", "LF96$d;", "c", "()LF96$d;", "animation", "Lkotlin/Function1;", "Ltm1;", "Lkotlin/ExtensionFunctionType;", "Lkotlin/jvm/functions/Function1;", "f", "()Lkotlin/jvm/functions/Function1;", "i", "(Lkotlin/jvm/functions/Function1;)V", "transitionSpec", "Lkotlin/ParameterName;", "name", TransferTable.COLUMN_STATE, DateTokenConverter.CONVERTER_KEY, "e", "h", "targetValueByState", "getValue", "()Ljava/lang/Object;", "value", "<init>", "(LF96$a;LF96$d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: F96$a$a */
        /* loaded from: classes.dex */
        public final class C2188a<T, V extends AbstractC29607vf> implements InterfaceC48627sP5<T> {

            /* renamed from: b */
            public final F96<S>.C2191d<T, V> f8939b;

            /* renamed from: c */
            public Function1<? super InterfaceC2189b<S>, ? extends InterfaceC49435tm1<T>> f8940c;

            /* renamed from: d */
            public Function1<? super S, ? extends T> f8941d;

            /* renamed from: e */
            public final /* synthetic */ F96<S>.C2187a<T, V> f8942e;

            public C2188a(C2187a c2187a, F96<S>.C2191d<T, V> animation, Function1<? super InterfaceC2189b<S>, ? extends InterfaceC49435tm1<T>> transitionSpec, Function1<? super S, ? extends T> targetValueByState) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                Intrinsics.checkNotNullParameter(transitionSpec, "transitionSpec");
                Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState");
                this.f8942e = c2187a;
                this.f8939b = animation;
                this.f8940c = transitionSpec;
                this.f8941d = targetValueByState;
            }

            /* renamed from: c */
            public final F96<S>.C2191d<T, V> m107511c() {
                return this.f8939b;
            }

            /* renamed from: e */
            public final Function1<S, T> m107510e() {
                return (Function1<? super S, ? extends T>) this.f8941d;
            }

            /* renamed from: f */
            public final Function1<InterfaceC2189b<S>, InterfaceC49435tm1<T>> m107509f() {
                return (Function1<? super InterfaceC2189b<S>, ? extends InterfaceC49435tm1<T>>) this.f8940c;
            }

            @Override // p000.InterfaceC48627sP5
            public T getValue() {
                m107506j(this.f8942e.f8938d.m107531k());
                return this.f8939b.getValue();
            }

            /* renamed from: h */
            public final void m107508h(Function1<? super S, ? extends T> function1) {
                Intrinsics.checkNotNullParameter(function1, "<set-?>");
                this.f8941d = function1;
            }

            /* renamed from: i */
            public final void m107507i(Function1<? super InterfaceC2189b<S>, ? extends InterfaceC49435tm1<T>> function1) {
                Intrinsics.checkNotNullParameter(function1, "<set-?>");
                this.f8940c = function1;
            }

            /* renamed from: j */
            public final void m107506j(InterfaceC2189b<S> segment) {
                Intrinsics.checkNotNullParameter(segment, "segment");
                T invoke = this.f8941d.invoke(segment.mo91780b());
                if (this.f8942e.f8938d.m107525q()) {
                    this.f8939b.m107485x(this.f8941d.invoke(segment.getInitialState()), invoke, this.f8940c.invoke(segment));
                    return;
                }
                this.f8939b.m107484y(invoke, this.f8940c.invoke(segment));
            }
        }

        public C2187a(F96 f96, InterfaceC51108wb6<T, V> typeConverter, String label) {
            EX2 m97025e;
            Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
            Intrinsics.checkNotNullParameter(label, "label");
            this.f8938d = f96;
            this.f8935a = typeConverter;
            this.f8936b = label;
            m97025e = LM5.m97025e(null, null, 2, null);
            this.f8937c = m97025e;
        }

        /* renamed from: a */
        public final InterfaceC48627sP5<T> m107515a(Function1<? super InterfaceC2189b<S>, ? extends InterfaceC49435tm1<T>> transitionSpec, Function1<? super S, ? extends T> targetValueByState) {
            Intrinsics.checkNotNullParameter(transitionSpec, "transitionSpec");
            Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState");
            F96<S>.C2188a<T, V>.a<T, V> m107514b = m107514b();
            if (m107514b == null) {
                F96<S> f96 = this.f8938d;
                m107514b = new C2188a<>(this, new C2191d(f96, targetValueByState.invoke((S) f96.m107535g()), C27022of.m20693g(this.f8935a, targetValueByState.invoke((S) this.f8938d.m107535g())), this.f8935a, this.f8936b), transitionSpec, targetValueByState);
                F96<S> f962 = this.f8938d;
                m107513c(m107514b);
                f962.m107538d(m107514b.m107511c());
            }
            F96<S> f963 = this.f8938d;
            m107514b.m107508h(targetValueByState);
            m107514b.m107507i(transitionSpec);
            m107514b.m107506j(f963.m107531k());
            return m107514b;
        }

        /* renamed from: b */
        public final F96<S>.C2188a<T, V>.a<T, V> m107514b() {
            return (C2188a) this.f8937c.getValue();
        }

        /* renamed from: c */
        public final void m107513c(F96<S>.C2188a<T, V>.a<T, V> c2188a) {
            this.f8937c.setValue(c2188a);
        }

        /* renamed from: d */
        public final void m107512d() {
            F96<S>.C2188a<T, V>.a<T, V> m107514b = m107514b();
            if (m107514b != null) {
                F96<S> f96 = this.f8938d;
                m107514b.m107511c().m107485x(m107514b.m107510e().invoke(f96.m107531k().getInitialState()), m107514b.m107510e().invoke(f96.m107531k().mo91780b()), m107514b.m107509f().invoke(f96.m107531k()));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u001c\u0010\u0005\u001a\u00020\u0004*\u00028\u00012\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00028\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00028\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0003"}, m28432d2 = {"LF96$b;", "S", "", "targetState", "", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Z", "getInitialState", "()Ljava/lang/Object;", "initialState", "b", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: F96$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2189b<S> {
        /* renamed from: a */
        default boolean m107505a(S s, S s2) {
            return Intrinsics.areEqual(s, getInitialState()) && Intrinsics.areEqual(s2, mo91780b());
        }

        /* renamed from: b */
        S mo91780b();

        S getInitialState();
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0017\u0012\u0006\u0010\r\u001a\u00028\u0001\u0012\u0006\u0010\u000f\u001a\u00028\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\r\u001a\u00028\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00028\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006\u0012"}, m28432d2 = {"LF96$c;", "S", "LF96$b;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", C17296a.f69688o, "Ljava/lang/Object;", "getInitialState", "()Ljava/lang/Object;", "initialState", "b", "targetState", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: F96$c */
    /* loaded from: classes.dex */
    public static final class C2190c<S> implements InterfaceC2189b<S> {

        /* renamed from: a */
        public final S f8943a;

        /* renamed from: b */
        public final S f8944b;

        public C2190c(S s, S s2) {
            this.f8943a = s;
            this.f8944b = s2;
        }

        @Override // p000.F96.InterfaceC2189b
        /* renamed from: b */
        public S mo91780b() {
            return this.f8944b;
        }

        public boolean equals(Object obj) {
            if (obj instanceof InterfaceC2189b) {
                InterfaceC2189b interfaceC2189b = (InterfaceC2189b) obj;
                if (Intrinsics.areEqual(getInitialState(), interfaceC2189b.getInitialState()) && Intrinsics.areEqual(mo91780b(), interfaceC2189b.mo91780b())) {
                    return true;
                }
            }
            return false;
        }

        @Override // p000.F96.InterfaceC2189b
        public S getInitialState() {
            return this.f8943a;
        }

        public int hashCode() {
            S initialState = getInitialState();
            int hashCode = (initialState != null ? initialState.hashCode() : 0) * 31;
            S mo91780b = mo91780b();
            return hashCode + (mo91780b != null ? mo91780b.hashCode() : 0);
        }
    }

    @Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B5\b\u0000\u0012\u0006\u0010\u0015\u001a\u00028\u0001\u0012\u0006\u0010N\u001a\u00028\u0002\u0012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001c\u0012\u0006\u0010'\u001a\u00020\"¢\u0006\u0004\bO\u0010PJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00028\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00028\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00028\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR#\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010'\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R+\u0010\u0010\u001a\u00028\u00012\u0006\u0010(\u001a\u00028\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R7\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u00112\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010\u00118F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010*\u001a\u0004\b/\u00100\"\u0004\b1\u00102RC\u00108\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002032\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002038F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010*\u001a\u0004\b#\u00105\"\u0004\b6\u00107R+\u0010>\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u00188@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010*\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R+\u0010C\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010*\u001a\u0004\b@\u0010A\"\u0004\bB\u0010\rR+\u0010E\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u00188B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010*\u001a\u0004\b?\u0010;\"\u0004\bD\u0010=R+\u0010H\u001a\u00028\u00012\u0006\u0010(\u001a\u00028\u00018V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010*\u001a\u0004\bF\u0010,\"\u0004\bG\u0010.R\u0016\u0010J\u001a\u00028\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010IR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010KR\u0014\u0010M\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u0010A¨\u0006Q"}, m28432d2 = {"LF96$d;", "T", "Lvf;", "V", "LsP5;", "", "playTimeNanos", "", "durationScale", "", "l", "(JF)V", "n", "(J)V", "m", "()V", "targetValue", "Ltm1;", "animationSpec", "y", "(Ljava/lang/Object;Ltm1;)V", "initialValue", "x", "(Ljava/lang/Object;Ljava/lang/Object;Ltm1;)V", "", "isInterrupted", "v", "(Ljava/lang/Object;Z)V", "Lwb6;", "b", "Lwb6;", "getTypeConverter", "()Lwb6;", "typeConverter", "", "c", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "label", "<set-?>", DateTokenConverter.CONVERTER_KEY, "LEX2;", "j", "()Ljava/lang/Object;", "t", "(Ljava/lang/Object;)V", "e", "()Ltm1;", "p", "(Ltm1;)V", "LQY5;", "f", "()LQY5;", "o", "(LQY5;)V", "animation", "g", "k", "()Z", "q", "(Z)V", "isFinished", "h", "i", "()J", "s", "offsetTimeNanos", "r", "needsReset", "getValue", "u", "value", "Lvf;", "velocityVector", "Ltm1;", "interruptionSpec", "durationNanos", "initialVelocityVector", "<init>", "(LF96;Ljava/lang/Object;Lvf;Lwb6;Ljava/lang/String;)V", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$TransitionAnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1155:1\n76#2:1156\n102#2,2:1157\n76#2:1159\n102#2,2:1160\n76#2:1162\n102#2,2:1163\n76#2:1165\n102#2,2:1166\n76#2:1168\n102#2,2:1169\n76#2:1171\n102#2,2:1172\n76#2:1174\n102#2,2:1175\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$TransitionAnimationState\n*L\n476#1:1156\n476#1:1157,2\n482#1:1159\n482#1:1160,2\n489#1:1162\n489#1:1163,2\n497#1:1165\n497#1:1166,2\n498#1:1168\n498#1:1169,2\n499#1:1171\n499#1:1172,2\n502#1:1174\n502#1:1175,2\n*E\n"})
    /* renamed from: F96$d */
    /* loaded from: classes.dex */
    public final class C2191d<T, V extends AbstractC29607vf> implements InterfaceC48627sP5<T> {

        /* renamed from: b */
        public final InterfaceC51108wb6<T, V> f8945b;

        /* renamed from: c */
        public final String f8946c;

        /* renamed from: d */
        public final EX2 f8947d;

        /* renamed from: e */
        public final EX2 f8948e;

        /* renamed from: f */
        public final EX2 f8949f;

        /* renamed from: g */
        public final EX2 f8950g;

        /* renamed from: h */
        public final EX2 f8951h;

        /* renamed from: i */
        public final EX2 f8952i;

        /* renamed from: j */
        public final EX2 f8953j;

        /* renamed from: k */
        public V f8954k;

        /* renamed from: l */
        public final InterfaceC49435tm1<T> f8955l;

        /* renamed from: m */
        public final /* synthetic */ F96<S> f8956m;

        public C2191d(F96 f96, T t, V initialVelocityVector, InterfaceC51108wb6<T, V> typeConverter, String label) {
            EX2 m97025e;
            EX2 m97025e2;
            EX2 m97025e3;
            EX2 m97025e4;
            EX2 m97025e5;
            EX2 m97025e6;
            EX2 m97025e7;
            T t2;
            Intrinsics.checkNotNullParameter(initialVelocityVector, "initialVelocityVector");
            Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
            Intrinsics.checkNotNullParameter(label, "label");
            this.f8956m = f96;
            this.f8945b = typeConverter;
            this.f8946c = label;
            m97025e = LM5.m97025e(t, null, 2, null);
            this.f8947d = m97025e;
            m97025e2 = LM5.m97025e(C26160mf.m25221i(0.0f, 0.0f, null, 7, null), null, 2, null);
            this.f8948e = m97025e2;
            m97025e3 = LM5.m97025e(new QY5(m107503e(), typeConverter, t, m107499j(), initialVelocityVector), null, 2, null);
            this.f8949f = m97025e3;
            m97025e4 = LM5.m97025e(Boolean.TRUE, null, 2, null);
            this.f8950g = m97025e4;
            m97025e5 = LM5.m97025e(0L, null, 2, null);
            this.f8951h = m97025e5;
            m97025e6 = LM5.m97025e(Boolean.FALSE, null, 2, null);
            this.f8952i = m97025e6;
            m97025e7 = LM5.m97025e(t, null, 2, null);
            this.f8953j = m97025e7;
            this.f8954k = initialVelocityVector;
            Float f = C32501Du6.m109705h().get(typeConverter);
            if (f != null) {
                float floatValue = f.floatValue();
                V invoke = typeConverter.mo4960a().invoke(t);
                int mo8295b = invoke.mo8295b();
                for (int i = 0; i < mo8295b; i++) {
                    invoke.mo8292e(i, floatValue);
                }
                t2 = this.f8945b.mo4959b().invoke(invoke);
            } else {
                t2 = null;
            }
            this.f8955l = C26160mf.m25221i(0.0f, 0.0f, t2, 3, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: w */
        public static /* synthetic */ void m107486w(C2191d c2191d, Object obj, boolean z, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = c2191d.getValue();
            }
            if ((i & 2) != 0) {
                z = false;
            }
            c2191d.m107487v(obj, z);
        }

        /* renamed from: c */
        public final QY5<T, V> m107504c() {
            return (QY5) this.f8949f.getValue();
        }

        /* renamed from: e */
        public final InterfaceC49435tm1<T> m107503e() {
            return (InterfaceC49435tm1) this.f8948e.getValue();
        }

        /* renamed from: f */
        public final long m107502f() {
            return m107504c().mo33859c();
        }

        @Override // p000.InterfaceC48627sP5
        public T getValue() {
            return this.f8953j.getValue();
        }

        /* renamed from: h */
        public final boolean m107501h() {
            return ((Boolean) this.f8952i.getValue()).booleanValue();
        }

        /* renamed from: i */
        public final long m107500i() {
            return ((Number) this.f8951h.getValue()).longValue();
        }

        /* renamed from: j */
        public final T m107499j() {
            return this.f8947d.getValue();
        }

        /* renamed from: k */
        public final boolean m107498k() {
            return ((Boolean) this.f8950g.getValue()).booleanValue();
        }

        /* renamed from: l */
        public final void m107497l(long j, float f) {
            long mo33859c;
            if (f > 0.0f) {
                float m107500i = ((float) (j - m107500i())) / f;
                if (!Float.isNaN(m107500i)) {
                    mo33859c = m107500i;
                } else {
                    throw new IllegalStateException(("Duration scale adjusted time is NaN. Duration scale: " + f + ",playTimeNanos: " + j + ", offsetTimeNanos: " + m107500i()).toString());
                }
            } else {
                mo33859c = m107504c().mo33859c();
            }
            m107488u(m107504c().mo33857e(mo33859c));
            this.f8954k = m107504c().mo33855g(mo33859c);
            if (m107504c().m42661b(mo33859c)) {
                m107492q(true);
                m107490s(0L);
            }
        }

        /* renamed from: m */
        public final void m107496m() {
            m107491r(true);
        }

        /* renamed from: n */
        public final void m107495n(long j) {
            m107488u(m107504c().mo33857e(j));
            this.f8954k = m107504c().mo33855g(j);
        }

        /* renamed from: o */
        public final void m107494o(QY5<T, V> qy5) {
            this.f8949f.setValue(qy5);
        }

        /* renamed from: p */
        public final void m107493p(InterfaceC49435tm1<T> interfaceC49435tm1) {
            this.f8948e.setValue(interfaceC49435tm1);
        }

        /* renamed from: q */
        public final void m107492q(boolean z) {
            this.f8950g.setValue(Boolean.valueOf(z));
        }

        /* renamed from: r */
        public final void m107491r(boolean z) {
            this.f8952i.setValue(Boolean.valueOf(z));
        }

        /* renamed from: s */
        public final void m107490s(long j) {
            this.f8951h.setValue(Long.valueOf(j));
        }

        /* renamed from: t */
        public final void m107489t(T t) {
            this.f8947d.setValue(t);
        }

        /* renamed from: u */
        public void m107488u(T t) {
            this.f8953j.setValue(t);
        }

        /* renamed from: v */
        public final void m107487v(T t, boolean z) {
            InterfaceC49435tm1<T> m107503e;
            if (z) {
                if (m107503e() instanceof C43282jO5) {
                    m107503e = m107503e();
                } else {
                    m107503e = this.f8955l;
                }
            } else {
                m107503e = m107503e();
            }
            m107494o(new QY5<>(m107503e, this.f8945b, t, m107499j(), this.f8954k));
            this.f8956m.m107524r();
        }

        /* renamed from: x */
        public final void m107485x(T t, T t2, InterfaceC49435tm1<T> animationSpec) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            m107489t(t2);
            m107493p(animationSpec);
            if (Intrinsics.areEqual(m107504c().m88408h(), t) && Intrinsics.areEqual(m107504c().mo33856f(), t2)) {
                return;
            }
            m107486w(this, t, false, 2, null);
        }

        /* renamed from: y */
        public final void m107484y(T t, InterfaceC49435tm1<T> animationSpec) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            if (!Intrinsics.areEqual(m107499j(), t) || m107501h()) {
                m107489t(t);
                m107493p(animationSpec);
                m107486w(this, null, !m107498k(), 1, null);
                m107492q(false);
                m107490s(this.f8956m.m107532j());
                m107491r(false);
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.animation.core.Transition$animateTo$1$1", m28418f = "Transition.kt", m28417i = {0}, m28416l = {434}, m28415m = "invokeSuspend", m28414n = {"$this$LaunchedEffect"}, m28413s = {"L$0"})
    /* renamed from: F96$e */
    /* loaded from: classes.dex */
    public static final class C2192e extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f8957h;

        /* renamed from: i */
        public /* synthetic */ Object f8958i;

        /* renamed from: j */
        public final /* synthetic */ F96<S> f8959j;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: F96$e$a */
        /* loaded from: classes.dex */
        public static final class C2193a extends Lambda implements Function1<Long, Unit> {

            /* renamed from: g */
            public final /* synthetic */ F96<S> f8960g;

            /* renamed from: h */
            public final /* synthetic */ float f8961h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2193a(F96<S> f96, float f) {
                super(1);
                this.f8960g = f96;
                this.f8961h = f;
            }

            /* renamed from: a */
            public final void m107483a(long j) {
                if (!this.f8960g.m107525q()) {
                    this.f8960g.m107523s(j / 1, this.f8961h);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                m107483a(l.longValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2192e(F96<S> f96, Continuation<? super C2192e> continuation) {
            super(2, continuation);
            this.f8959j = f96;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C2192e c2192e = new C2192e(this.f8959j, continuation);
            c2192e.f8958i = obj;
            return c2192e;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C2192e) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            ZC0 zc0;
            C2193a c2193a;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f8957h;
            if (i != 0) {
                if (i == 1) {
                    zc0 = (ZC0) this.f8958i;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                zc0 = (ZC0) this.f8958i;
            }
            do {
                c2193a = new C2193a(this.f8959j, C49876uW5.m10128n(zc0.mo18342K()));
                this.f8958i = zc0;
                this.f8957h = 1;
            } while (JV2.m100318b(c2193a, this) != coroutine_suspended);
            return coroutine_suspended;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: F96$f */
    /* loaded from: classes.dex */
    public static final class C2194f extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ F96<S> f8962g;

        /* renamed from: h */
        public final /* synthetic */ S f8963h;

        /* renamed from: i */
        public final /* synthetic */ int f8964i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2194f(F96<S> f96, S s, int i) {
            super(2);
            this.f8962g = f96;
            this.f8963h = s;
            this.f8964i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            this.f8962g.m107536f(this.f8963h, interfaceC32720Et0, this.f8964i | 1);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "S", "invoke", "()Ljava/lang/Long;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$totalDurationNanos$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1155:1\n1855#2,2:1156\n1855#2,2:1158\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$totalDurationNanos$2\n*L\n272#1:1156,2\n275#1:1158,2\n*E\n"})
    /* renamed from: F96$g */
    /* loaded from: classes.dex */
    public static final class C2195g extends Lambda implements Function0<Long> {

        /* renamed from: g */
        public final /* synthetic */ F96<S> f8965g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2195g(F96<S> f96) {
            super(0);
            this.f8965g = f96;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Long invoke() {
            return invoke();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            long j = 0;
            for (C2191d c2191d : this.f8965g.f8930h) {
                j = Math.max(j, c2191d.m107502f());
            }
            for (F96 f96 : this.f8965g.f8931i) {
                j = Math.max(j, f96.m107528n());
            }
            return Long.valueOf(j);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: F96$h */
    /* loaded from: classes.dex */
    public static final class C2196h extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ F96<S> f8966g;

        /* renamed from: h */
        public final /* synthetic */ S f8967h;

        /* renamed from: i */
        public final /* synthetic */ int f8968i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2196h(F96<S> f96, S s, int i) {
            super(2);
            this.f8966g = f96;
            this.f8967h = s;
            this.f8968i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            this.f8966g.m107542G(this.f8967h, interfaceC32720Et0, this.f8968i | 1);
        }
    }

    static {
    }

    @PublishedApi
    public F96(KX2<S> transitionState, String str) {
        EX2 m97025e;
        EX2 m97025e2;
        EX2 m97025e3;
        EX2 m97025e4;
        EX2 m97025e5;
        EX2 m97025e6;
        Intrinsics.checkNotNullParameter(transitionState, "transitionState");
        this.f8923a = transitionState;
        this.f8924b = str;
        m97025e = LM5.m97025e(m107535g(), null, 2, null);
        this.f8925c = m97025e;
        m97025e2 = LM5.m97025e(new C2190c(m107535g(), m107535g()), null, 2, null);
        this.f8926d = m97025e2;
        m97025e3 = LM5.m97025e(0L, null, 2, null);
        this.f8927e = m97025e3;
        m97025e4 = LM5.m97025e(Long.MIN_VALUE, null, 2, null);
        this.f8928f = m97025e4;
        m97025e5 = LM5.m97025e(Boolean.TRUE, null, 2, null);
        this.f8929g = m97025e5;
        this.f8930h = GM5.m105203d();
        this.f8931i = GM5.m105203d();
        m97025e6 = LM5.m97025e(Boolean.FALSE, null, 2, null);
        this.f8932j = m97025e6;
        this.f8934l = GM5.m105204c(new C2195g(this));
    }

    /* renamed from: A */
    public final void m107548A(long j) {
        this.f8927e.setValue(Long.valueOf(j));
    }

    /* renamed from: B */
    public final void m107547B(boolean z) {
        this.f8932j.setValue(Boolean.valueOf(z));
    }

    /* renamed from: C */
    public final void m107546C(InterfaceC2189b<S> interfaceC2189b) {
        this.f8926d.setValue(interfaceC2189b);
    }

    /* renamed from: D */
    public final void m107545D(long j) {
        this.f8928f.setValue(Long.valueOf(j));
    }

    /* renamed from: E */
    public final void m107544E(S s) {
        this.f8925c.setValue(s);
    }

    /* renamed from: F */
    public final void m107543F(boolean z) {
        this.f8929g.setValue(Boolean.valueOf(z));
    }

    /* renamed from: G */
    public final void m107542G(S s, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        int i3;
        int i4;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-583974681);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(s)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89539n(this)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-583974681, i, -1, "androidx.compose.animation.core.Transition.updateTarget (Transition.kt:399)");
            }
            if (!m107525q() && !Intrinsics.areEqual(m107529m(), s)) {
                m107546C(new C2190c(m107529m(), s));
                m107516z(m107529m());
                m107544E(s);
                if (!m107526p()) {
                    m107543F(true);
                }
                for (F96<S>.C2191d<?, ?> c2191d : this.f8930h) {
                    c2191d.m107496m();
                }
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C2196h(this, s, i));
        }
    }

    /* renamed from: d */
    public final boolean m107538d(F96<S>.C2191d<?, ?> animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        return this.f8930h.add(animation);
    }

    /* renamed from: e */
    public final boolean m107537e(F96<?> transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        return this.f8931i.add(transition);
    }

    /* renamed from: f */
    public final void m107536f(S s, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        int i3;
        int i4;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1493585151);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(s)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89539n(this)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1493585151, i2, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:424)");
            }
            if (!m107525q()) {
                m107542G(s, mo89518u, (i2 & 14) | (i2 & 112));
                if (!Intrinsics.areEqual(s, m107535g()) || m107526p() || m107527o()) {
                    int i5 = (i2 >> 3) & 14;
                    mo89518u.mo89638F(1157296644);
                    boolean mo89539n = mo89518u.mo89539n(this);
                    Object mo89635G = mo89518u.mo89635G();
                    if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                        mo89635G = new C2192e(this, null);
                        mo89518u.mo89503z(mo89635G);
                    }
                    mo89518u.mo89605Q();
                    Y91.m75533f(this, (Function2) mo89635G, mo89518u, i5 | 64);
                }
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C2194f(this, s, i));
        }
    }

    /* renamed from: g */
    public final S m107535g() {
        return this.f8923a.m98799a();
    }

    /* renamed from: h */
    public final String m107534h() {
        return this.f8924b;
    }

    /* renamed from: i */
    public final long m107533i() {
        return this.f8933k;
    }

    /* renamed from: j */
    public final long m107532j() {
        return ((Number) this.f8927e.getValue()).longValue();
    }

    /* renamed from: k */
    public final InterfaceC2189b<S> m107531k() {
        return (InterfaceC2189b) this.f8926d.getValue();
    }

    /* renamed from: l */
    public final long m107530l() {
        return ((Number) this.f8928f.getValue()).longValue();
    }

    /* renamed from: m */
    public final S m107529m() {
        return (S) this.f8925c.getValue();
    }

    /* renamed from: n */
    public final long m107528n() {
        return ((Number) this.f8934l.getValue()).longValue();
    }

    /* renamed from: o */
    public final boolean m107527o() {
        return ((Boolean) this.f8929g.getValue()).booleanValue();
    }

    /* renamed from: p */
    public final boolean m107526p() {
        return m107530l() != Long.MIN_VALUE;
    }

    /* renamed from: q */
    public final boolean m107525q() {
        return ((Boolean) this.f8932j.getValue()).booleanValue();
    }

    /* renamed from: r */
    public final void m107524r() {
        m107543F(true);
        if (m107525q()) {
            long j = 0;
            for (F96<S>.C2191d<?, ?> c2191d : this.f8930h) {
                j = Math.max(j, c2191d.m107502f());
                c2191d.m107495n(this.f8933k);
            }
            m107543F(false);
        }
    }

    /* renamed from: s */
    public final void m107523s(long j, float f) {
        if (m107530l() == Long.MIN_VALUE) {
            m107521u(j);
        }
        m107543F(false);
        m107548A(j - m107530l());
        boolean z = true;
        for (F96<S>.C2191d<?, ?> c2191d : this.f8930h) {
            if (!c2191d.m107498k()) {
                c2191d.m107497l(m107532j(), f);
            }
            if (!c2191d.m107498k()) {
                z = false;
            }
        }
        for (F96<?> f96 : this.f8931i) {
            if (!Intrinsics.areEqual(f96.m107529m(), f96.m107535g())) {
                f96.m107523s(m107532j(), f);
            }
            if (!Intrinsics.areEqual(f96.m107529m(), f96.m107535g())) {
                z = false;
            }
        }
        if (z) {
            m107522t();
        }
    }

    /* renamed from: t */
    public final void m107522t() {
        m107545D(Long.MIN_VALUE);
        m107516z(m107529m());
        m107548A(0L);
        this.f8923a.m98796d(false);
    }

    /* renamed from: u */
    public final void m107521u(long j) {
        m107545D(j);
        this.f8923a.m98796d(true);
    }

    /* renamed from: v */
    public final void m107520v(F96<S>.C2187a<?, ?> deferredAnimation) {
        F96<S>.C2191d<?, ?> m107511c;
        Intrinsics.checkNotNullParameter(deferredAnimation, "deferredAnimation");
        F96<S>.C2188a<?, V>.a<?, ?> m107514b = deferredAnimation.m107514b();
        if (m107514b != null && (m107511c = m107514b.m107511c()) != null) {
            m107519w(m107511c);
        }
    }

    /* renamed from: w */
    public final void m107519w(F96<S>.C2191d<?, ?> animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f8930h.remove(animation);
    }

    /* renamed from: x */
    public final boolean m107518x(F96<?> transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        return this.f8931i.remove(transition);
    }

    @JvmName(name = "seek")
    /* renamed from: y */
    public final void m107517y(S s, S s2, long j) {
        m107545D(Long.MIN_VALUE);
        this.f8923a.m98796d(false);
        if (!m107525q() || !Intrinsics.areEqual(m107535g(), s) || !Intrinsics.areEqual(m107529m(), s2)) {
            m107516z(s);
            m107544E(s2);
            m107547B(true);
            m107546C(new C2190c(s, s2));
        }
        for (F96<?> f96 : this.f8931i) {
            Intrinsics.checkNotNull(f96, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (f96.m107525q()) {
                f96.m107517y(f96.m107535g(), f96.m107529m(), j);
            }
        }
        for (F96<S>.C2191d<?, ?> c2191d : this.f8930h) {
            c2191d.m107495n(j);
        }
        this.f8933k = j;
    }

    /* renamed from: z */
    public final void m107516z(S s) {
        this.f8923a.m98797c(s);
    }

    public F96(S s, String str) {
        this(new KX2(s), str);
    }
}
