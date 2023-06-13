package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.ImageMetadata;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import net.danlew.android.joda.DateUtils;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC32720Et0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
@Metadata(m28433d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a@\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0007\u001aG\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\r\u001aC\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a;\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0082\u0001\u0010$\u001a\u00020\u00142\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0005¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020\u001e2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140\"H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%\u001a3\u0010)\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u001e2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00140\"2\u0006\u0010(\u001a\u00020\u0006H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*\u001a\u001c\u00100\u001a\u00020/2\n\u0010,\u001a\u0006\u0012\u0002\b\u00030+2\u0006\u0010.\u001a\u00020-H\u0002\u001aq\u00109\u001a\b\u0012\u0004\u0012\u00020\u0000082\u0006\u0010,\u001a\u00020\t26\u00106\u001a2\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(5\u0012\u0004\u0012\u00020\u0014012!\u00107\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020\u00140\u0005H\u0002\"+\u0010<\u001a\u0019\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000301¢\u0006\u0002\b\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010;\"\u0017\u0010>\u001a\u00020\u001c8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b9\u0010=\"\u0017\u0010?\u001a\u00020\u001c8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b$\u0010=\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006@"}, m28432d2 = {"LHU2;", "initialValue", "Llf;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmValueChange", "isSkipHalfExpanded", "LGU2;", DateTokenConverter.CONVERTER_KEY, "skipHalfExpanded", "o", "(LHU2;Llf;Lkotlin/jvm/functions/Function1;ZLEt0;II)LGU2;", "confirmStateChange", "p", "(LHU2;Llf;ZLkotlin/jvm/functions/Function1;LEt0;II)LGU2;", "n", "(LHU2;Llf;Lkotlin/jvm/functions/Function1;LEt0;II)LGU2;", "LPm0;", "", "Lkotlin/ExtensionFunctionType;", "sheetContent", "LgV2;", "modifier", "sheetState", "Lhy5;", "sheetShape", "Lk61;", "sheetElevation", "Lpm0;", "sheetBackgroundColor", "sheetContentColor", "scrimColor", "Lkotlin/Function0;", "content", "c", "(Lkotlin/jvm/functions/Function3;LgV2;LGU2;Lhy5;FJJJLkotlin/jvm/functions/Function2;LEt0;II)V", "color", "onDismiss", "visible", "e", "(JLkotlin/jvm/functions/Function0;ZLEt0;I)V", "LtX5;", TransferTable.COLUMN_STATE, "LEy3;", "orientation", "LB43;", C17296a.f69688o, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "target", "velocity", "animateTo", "snapTo", "Leb;", "b", "Lg01;", "Lkotlin/jvm/functions/Function2;", "PositionalThreshold", "F", "VelocityThreshold", "MaxModalBottomSheetWidth", "material_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,684:1\n474#2,4:685\n478#2,2:693\n482#2:699\n25#3:689\n50#3:700\n49#3:701\n36#3:709\n50#3:716\n49#3:717\n50#3:724\n49#3:725\n1114#4,3:690\n1117#4,3:696\n1114#4,6:702\n1114#4,6:710\n1114#4,6:718\n1114#4,6:726\n474#5:695\n646#6:708\n76#7:732\n154#8:733\n154#8:734\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt\n*L\n443#1:685,4\n443#1:693,2\n443#1:699\n443#1:689\n445#1:700\n445#1:701\n561#1:709\n562#1:716\n562#1:717\n574#1:724\n574#1:725\n443#1:690,3\n443#1:696,3\n445#1:702,6\n561#1:710,6\n562#1:718,6\n574#1:726,6\n443#1:695\n553#1:708\n554#1:732\n682#1:733\n683#1:734\n*E\n"})
/* renamed from: FU2 */
/* loaded from: classes.dex */
public final class FU2 {

    /* renamed from: a */
    public static final Function2<InterfaceC41273g01, Float, Float> f9418a = C2307g.f9491g;

    /* renamed from: b */
    public static final float f9419b = C43705k61.m29303g(125);

    /* renamed from: c */
    public static final float f9420c = C43705k61.m29303g(640);

    @Metadata(m28433d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ)\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0011\u001a\u00020\u0002*\u00020\u0010H\u0002ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u0010*\u00020\u000bH\u0003ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\u0010*\u00020\u0002H\u0003ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0014\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0016"}, m28432d2 = {"FU2$a", "LB43;", "LCe3;", "available", "LH43;", Stripe3ds2AuthParams.FIELD_SOURCE, "k", "(JI)J", "consumed", "h", "(JJI)J", "Lro6;", "j", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", C17296a.f69688o, "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", DateTokenConverter.CONVERTER_KEY, "(F)J", "e", "(J)F", "c", "material_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: FU2$a */
    /* loaded from: classes.dex */
    public static final class C2283a implements B43 {

        /* renamed from: b */
        public final /* synthetic */ C49292tX5<?> f9421b;

        /* renamed from: c */
        public final /* synthetic */ EnumC32768Ey3 f9422c;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", m28418f = "ModalBottomSheet.kt", m28417i = {0}, m28416l = {637}, m28415m = "onPostFling-RZ2iAVY", m28414n = {"available"}, m28413s = {"J$0"})
        /* renamed from: FU2$a$a */
        /* loaded from: classes.dex */
        public static final class C2284a extends ContinuationImpl {

            /* renamed from: h */
            public long f9423h;

            /* renamed from: i */
            public /* synthetic */ Object f9424i;

            /* renamed from: k */
            public int f9426k;

            public C2284a(Continuation<? super C2284a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f9424i = obj;
                this.f9426k |= Integer.MIN_VALUE;
                return C2283a.this.mo72411a(0L, 0L, this);
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", m28418f = "ModalBottomSheet.kt", m28417i = {0}, m28416l = {628}, m28415m = "onPreFling-QWom1Mo", m28414n = {"available"}, m28413s = {"J$0"})
        /* renamed from: FU2$a$b */
        /* loaded from: classes.dex */
        public static final class C2285b extends ContinuationImpl {

            /* renamed from: h */
            public long f9427h;

            /* renamed from: i */
            public /* synthetic */ Object f9428i;

            /* renamed from: k */
            public int f9430k;

            public C2285b(Continuation<? super C2285b> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f9428i = obj;
                this.f9430k |= Integer.MIN_VALUE;
                return C2283a.this.mo107094j(0L, this);
            }
        }

        public C2283a(C49292tX5<?> c49292tX5, EnumC32768Ey3 enumC32768Ey3) {
            this.f9421b = c49292tX5;
            this.f9422c = enumC32768Ey3;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
        @Override // p000.B43
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo72411a(long j, long j2, Continuation<? super C48275ro6> continuation) {
            C2284a c2284a;
            Object coroutine_suspended;
            int i;
            if (continuation instanceof C2284a) {
                c2284a = (C2284a) continuation;
                int i2 = c2284a.f9426k;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c2284a.f9426k = i2 - Integer.MIN_VALUE;
                    Object obj = c2284a.f9424i;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c2284a.f9426k;
                    if (i == 0) {
                        if (i == 1) {
                            j2 = c2284a.f9423h;
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        C49292tX5<?> c49292tX5 = this.f9421b;
                        float m107095e = m107095e(j2);
                        c2284a.f9423h = j2;
                        c2284a.f9426k = 1;
                        if (c49292tX5.m12138E(m107095e, c2284a) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return C48275ro6.m15363b(j2);
                }
            }
            c2284a = new C2284a(continuation);
            Object obj2 = c2284a.f9424i;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c2284a.f9426k;
            if (i == 0) {
            }
            return C48275ro6.m15363b(j2);
        }

        @JvmName(name = "offsetToFloat")
        /* renamed from: c */
        public final float m107097c(long j) {
            return this.f9422c == EnumC32768Ey3.Horizontal ? C32120Ce3.m111944o(j) : C32120Ce3.m111943p(j);
        }

        /* renamed from: d */
        public final long m107096d(float f) {
            float f2;
            EnumC32768Ey3 enumC32768Ey3 = this.f9422c;
            if (enumC32768Ey3 == EnumC32768Ey3.Horizontal) {
                f2 = f;
            } else {
                f2 = 0.0f;
            }
            if (enumC32768Ey3 != EnumC32768Ey3.Vertical) {
                f = 0.0f;
            }
            return C33056Ge3.m104938a(f2, f);
        }

        @JvmName(name = "velocityToFloat")
        /* renamed from: e */
        public final float m107095e(long j) {
            return this.f9422c == EnumC32768Ey3.Horizontal ? C48275ro6.m15357h(j) : C48275ro6.m15356i(j);
        }

        @Override // p000.B43
        /* renamed from: h */
        public long mo72410h(long j, long j2, int i) {
            if (H43.m104445d(i, H43.f12808a.m104444a())) {
                return m107096d(this.f9421b.m12127i(m107097c(j2)));
            }
            return C32120Ce3.f4427b.m111932c();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
        @Override // p000.B43
        /* renamed from: j */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo107094j(long j, Continuation<? super C48275ro6> continuation) {
            C2285b c2285b;
            Object coroutine_suspended;
            int i;
            if (continuation instanceof C2285b) {
                c2285b = (C2285b) continuation;
                int i2 = c2285b.f9430k;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c2285b.f9430k = i2 - Integer.MIN_VALUE;
                    Object obj = c2285b.f9428i;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c2285b.f9430k;
                    if (i == 0) {
                        if (i == 1) {
                            j = c2285b.f9427h;
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        float m107095e = m107095e(j);
                        float m12112x = this.f9421b.m12112x();
                        if (m107095e < 0.0f && m12112x > this.f9421b.m12118r()) {
                            C49292tX5<?> c49292tX5 = this.f9421b;
                            c2285b.f9427h = j;
                            c2285b.f9430k = 1;
                            if (c49292tX5.m12138E(m107095e, c2285b) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            j = C48275ro6.f107663b.m15349a();
                        }
                    }
                    return C48275ro6.m15363b(j);
                }
            }
            c2285b = new C2285b(continuation);
            Object obj2 = c2285b.f9428i;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c2285b.f9430k;
            if (i == 0) {
            }
            return C48275ro6.m15363b(j);
        }

        @Override // p000.B43
        /* renamed from: k */
        public long mo72409k(long j, int i) {
            float m107097c = m107097c(j);
            if (m107097c < 0.0f && H43.m104445d(i, H43.f12808a.m104444a())) {
                return m107096d(this.f9421b.m12127i(m107097c));
            }
            return C32120Ce3.f4427b.m111932c();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m28432d2 = {"LHU2;", "previousTarget", "", "", "previousAnchors", "newAnchors", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: FU2$b */
    /* loaded from: classes.dex */
    public static final class C2286b implements InterfaceC20076eb<HU2> {

        /* renamed from: a */
        public final /* synthetic */ GU2 f9431a;

        /* renamed from: b */
        public final /* synthetic */ Function2<HU2, Float, Unit> f9432b;

        /* renamed from: c */
        public final /* synthetic */ Function1<HU2, Unit> f9433c;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: FU2$b$a */
        /* loaded from: classes.dex */
        public /* synthetic */ class C2287a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HU2.values().length];
                try {
                    iArr[HU2.Hidden.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[HU2.HalfExpanded.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[HU2.Expanded.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C2286b(GU2 gu2, Function2<? super HU2, ? super Float, Unit> function2, Function1<? super HU2, Unit> function1) {
            this.f9431a = gu2;
            this.f9432b = function2;
            this.f9433c = function1;
        }

        @Override // p000.InterfaceC20076eb
        /* renamed from: b */
        public final void mo42732a(HU2 previousTarget, Map<HU2, Float> previousAnchors, Map<HU2, Float> newAnchors) {
            HU2 hu2;
            Object value;
            Intrinsics.checkNotNullParameter(previousTarget, "previousTarget");
            Intrinsics.checkNotNullParameter(previousAnchors, "previousAnchors");
            Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
            Float f = previousAnchors.get(previousTarget);
            int i = C2287a.$EnumSwitchMapping$0[previousTarget.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                hu2 = HU2.HalfExpanded;
                if (!newAnchors.containsKey(hu2)) {
                    hu2 = HU2.Expanded;
                    if (!newAnchors.containsKey(hu2)) {
                        hu2 = HU2.Hidden;
                    }
                }
            } else {
                hu2 = HU2.Hidden;
            }
            value = MapsKt__MapsKt.getValue(newAnchors, hu2);
            if (!Intrinsics.areEqual(((Number) value).floatValue(), f)) {
                if (this.f9431a.m105060j()) {
                    this.f9432b.invoke(hu2, Float.valueOf(this.f9431a.m105064f()));
                } else {
                    this.f9433c.invoke(hu2);
                }
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt$ModalBottomSheetLayout$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,684:1\n67#2,6:685\n73#2:717\n77#2:722\n75#3:691\n76#3,11:693\n89#3:721\n76#4:692\n460#5,13:704\n473#5,3:718\n50#5:723\n49#5:724\n1114#6,6:725\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt$ModalBottomSheetLayout$1\n*L\n456#1:685,6\n456#1:717\n456#1:722\n456#1:691\n456#1:693,11\n456#1:721\n456#1:692\n456#1:704,13\n456#1:718,3\n474#1:723\n474#1:724\n474#1:725,6\n*E\n"})
    /* renamed from: FU2$c */
    /* loaded from: classes.dex */
    public static final class C2288c extends Lambda implements Function3<InterfaceC41875h10, InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ GU2 f9434g;

        /* renamed from: h */
        public final /* synthetic */ EnumC32768Ey3 f9435h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC20076eb<HU2> f9436i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC42444hy5 f9437j;

        /* renamed from: k */
        public final /* synthetic */ long f9438k;

        /* renamed from: l */
        public final /* synthetic */ long f9439l;

        /* renamed from: m */
        public final /* synthetic */ float f9440m;

        /* renamed from: n */
        public final /* synthetic */ int f9441n;

        /* renamed from: o */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f9442o;

        /* renamed from: p */
        public final /* synthetic */ long f9443p;

        /* renamed from: q */
        public final /* synthetic */ ZC0 f9444q;

        /* renamed from: r */
        public final /* synthetic */ Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> f9445r;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: FU2$c$a */
        /* loaded from: classes.dex */
        public static final class C2289a extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ GU2 f9446g;

            /* renamed from: h */
            public final /* synthetic */ ZC0 f9447h;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            @DebugMetadata(m28419c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1", m28418f = "ModalBottomSheet.kt", m28417i = {}, m28416l = {462}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
            /* renamed from: FU2$c$a$a */
            /* loaded from: classes.dex */
            public static final class C2290a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

                /* renamed from: h */
                public int f9448h;

                /* renamed from: i */
                public final /* synthetic */ GU2 f9449i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2290a(GU2 gu2, Continuation<? super C2290a> continuation) {
                    super(2, continuation);
                    this.f9449i = gu2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C2290a(this.f9449i, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                    return ((C2290a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f9448h;
                    if (i != 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        GU2 gu2 = this.f9449i;
                        this.f9448h = 1;
                        if (gu2.m105061i(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2289a(GU2 gu2, ZC0 zc0) {
                super(0);
                this.f9446g = gu2;
                this.f9447h = zc0;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (this.f9446g.m105063g().m12123m().invoke(HU2.Hidden).booleanValue()) {
                    Z30.m73800d(this.f9447h, null, null, new C2290a(this.f9446g, null), 3, null);
                }
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: FU2$c$b */
        /* loaded from: classes.dex */
        public static final class C2291b extends Lambda implements Function1<InterfaceC41273g01, A52> {

            /* renamed from: g */
            public final /* synthetic */ GU2 f9450g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2291b(GU2 gu2) {
                super(1);
                this.f9450g = gu2;
            }

            /* renamed from: a */
            public final long m107092a(InterfaceC41273g01 offset) {
                int roundToInt;
                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                roundToInt = MathKt__MathJVMKt.roundToInt(this.f9450g.m105063g().m12112x());
                return B52.m114704a(0, roundToInt);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ A52 invoke(InterfaceC41273g01 interfaceC41273g01) {
                return A52.m116119b(m107092a(interfaceC41273g01));
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: FU2$c$c */
        /* loaded from: classes.dex */
        public static final class C2292c extends Lambda implements Function2<HU2, G52, Float> {

            /* renamed from: g */
            public final /* synthetic */ float f9451g;

            /* renamed from: h */
            public final /* synthetic */ GU2 f9452h;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: FU2$c$c$a */
            /* loaded from: classes.dex */
            public /* synthetic */ class C2293a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[HU2.values().length];
                    try {
                        iArr[HU2.Hidden.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[HU2.HalfExpanded.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[HU2.Expanded.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2292c(float f, GU2 gu2) {
                super(2);
                this.f9451g = f;
                this.f9452h = gu2;
            }

            /* renamed from: a */
            public final Float m107091a(HU2 state, long j) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i = C2293a.$EnumSwitchMapping$0[state.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            if (G52.m105830f(j) == 0) {
                                return null;
                            }
                            return Float.valueOf(Math.max(0.0f, this.f9451g - G52.m105830f(j)));
                        }
                        throw new NoWhenBranchMatchedException();
                    } else if (G52.m105830f(j) < this.f9451g / 2.0f || this.f9452h.m105059k()) {
                        return null;
                    } else {
                        return Float.valueOf(this.f9451g / 2.0f);
                    }
                }
                return Float.valueOf(this.f9451g);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Float invoke(HU2 hu2, G52 g52) {
                return m107091a(hu2, g52.m105826j());
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: FU2$c$d */
        /* loaded from: classes.dex */
        public static final class C2294d extends Lambda implements Function1<InterfaceC48906ss5, Unit> {

            /* renamed from: g */
            public final /* synthetic */ GU2 f9453g;

            /* renamed from: h */
            public final /* synthetic */ ZC0 f9454h;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: FU2$c$d$a */
            /* loaded from: classes.dex */
            public static final class C2295a extends Lambda implements Function0<Boolean> {

                /* renamed from: g */
                public final /* synthetic */ GU2 f9455g;

                /* renamed from: h */
                public final /* synthetic */ ZC0 f9456h;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$1$1", m28418f = "ModalBottomSheet.kt", m28417i = {}, m28416l = {516}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
                /* renamed from: FU2$c$d$a$a */
                /* loaded from: classes.dex */
                public static final class C2296a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

                    /* renamed from: h */
                    public int f9457h;

                    /* renamed from: i */
                    public final /* synthetic */ GU2 f9458i;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C2296a(GU2 gu2, Continuation<? super C2296a> continuation) {
                        super(2, continuation);
                        this.f9458i = gu2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C2296a(this.f9458i, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                        return ((C2296a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.f9457h;
                        if (i != 0) {
                            if (i == 1) {
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            GU2 gu2 = this.f9458i;
                            this.f9457h = 1;
                            if (gu2.m105061i(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2295a(GU2 gu2, ZC0 zc0) {
                    super(0);
                    this.f9455g = gu2;
                    this.f9456h = zc0;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    if (this.f9455g.m105063g().m12123m().invoke(HU2.Hidden).booleanValue()) {
                        Z30.m73800d(this.f9456h, null, null, new C2296a(this.f9455g, null), 3, null);
                    }
                    return Boolean.TRUE;
                }
            }

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: FU2$c$d$b */
            /* loaded from: classes.dex */
            public static final class C2297b extends Lambda implements Function0<Boolean> {

                /* renamed from: g */
                public final /* synthetic */ GU2 f9459g;

                /* renamed from: h */
                public final /* synthetic */ ZC0 f9460h;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$2$1", m28418f = "ModalBottomSheet.kt", m28417i = {}, m28416l = {523}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
                /* renamed from: FU2$c$d$b$a */
                /* loaded from: classes.dex */
                public static final class C2298a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

                    /* renamed from: h */
                    public int f9461h;

                    /* renamed from: i */
                    public final /* synthetic */ GU2 f9462i;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C2298a(GU2 gu2, Continuation<? super C2298a> continuation) {
                        super(2, continuation);
                        this.f9462i = gu2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C2298a(this.f9462i, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                        return ((C2298a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.f9461h;
                        if (i != 0) {
                            if (i == 1) {
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            GU2 gu2 = this.f9462i;
                            this.f9461h = 1;
                            if (gu2.m105067c(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2297b(GU2 gu2, ZC0 zc0) {
                    super(0);
                    this.f9459g = gu2;
                    this.f9460h = zc0;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    if (this.f9459g.m105063g().m12123m().invoke(HU2.Expanded).booleanValue()) {
                        Z30.m73800d(this.f9460h, null, null, new C2298a(this.f9459g, null), 3, null);
                    }
                    return Boolean.TRUE;
                }
            }

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: FU2$c$d$c */
            /* loaded from: classes.dex */
            public static final class C2299c extends Lambda implements Function0<Boolean> {

                /* renamed from: g */
                public final /* synthetic */ GU2 f9463g;

                /* renamed from: h */
                public final /* synthetic */ ZC0 f9464h;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$3$1", m28418f = "ModalBottomSheet.kt", m28417i = {}, m28416l = {530}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
                /* renamed from: FU2$c$d$c$a */
                /* loaded from: classes.dex */
                public static final class C2300a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

                    /* renamed from: h */
                    public int f9465h;

                    /* renamed from: i */
                    public final /* synthetic */ GU2 f9466i;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C2300a(GU2 gu2, Continuation<? super C2300a> continuation) {
                        super(2, continuation);
                        this.f9466i = gu2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C2300a(this.f9466i, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                        return ((C2300a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.f9465h;
                        if (i != 0) {
                            if (i == 1) {
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            GU2 gu2 = this.f9466i;
                            this.f9465h = 1;
                            if (gu2.m105062h(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2299c(GU2 gu2, ZC0 zc0) {
                    super(0);
                    this.f9463g = gu2;
                    this.f9464h = zc0;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    if (this.f9463g.m105063g().m12123m().invoke(HU2.HalfExpanded).booleanValue()) {
                        Z30.m73800d(this.f9464h, null, null, new C2300a(this.f9463g, null), 3, null);
                    }
                    return Boolean.TRUE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2294d(GU2 gu2, ZC0 zc0) {
                super(1);
                this.f9453g = gu2;
                this.f9454h = zc0;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48906ss5 interfaceC48906ss5) {
                invoke2(interfaceC48906ss5);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(InterfaceC48906ss5 semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                if (this.f9453g.m105058l()) {
                    C47128ps5.m18589j(semantics, null, new C2295a(this.f9453g, this.f9454h), 1, null);
                    if (this.f9453g.m105063g().m12122n() == HU2.HalfExpanded) {
                        C47128ps5.m18586m(semantics, null, new C2297b(this.f9453g, this.f9454h), 1, null);
                    } else if (this.f9453g.m105065e()) {
                        C47128ps5.m18597b(semantics, null, new C2299c(this.f9453g, this.f9454h), 1, null);
                    }
                }
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt$ModalBottomSheetLayout$1$6\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,684:1\n73#2,7:685\n80#2:718\n84#2:723\n75#3:692\n76#3,11:694\n89#3:722\n76#4:693\n460#5,13:705\n473#5,3:719\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt$ModalBottomSheetLayout$1$6\n*L\n542#1:685,7\n542#1:718\n542#1:723\n542#1:692\n542#1:694,11\n542#1:722\n542#1:693\n542#1:705,13\n542#1:719,3\n*E\n"})
        /* renamed from: FU2$c$e */
        /* loaded from: classes.dex */
        public static final class C2301e extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

            /* renamed from: g */
            public final /* synthetic */ Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> f9467g;

            /* renamed from: h */
            public final /* synthetic */ int f9468h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C2301e(Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, int i) {
                super(2);
                this.f9467g = function3;
                this.f9468h = i;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                invoke(interfaceC32720Et0, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
                if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                    interfaceC32720Et0.mo89548k();
                    return;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-1793508390, i, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous>.<anonymous> (ModalBottomSheet.kt:540)");
                }
                Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> function3 = this.f9467g;
                int i2 = (this.f9468h << 9) & 7168;
                interfaceC32720Et0.mo89638F(-483455358);
                InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
                int i3 = i2 >> 3;
                InterfaceC51579xO2 m91546a = C34997Om0.m91546a(C25777lo.f96729a.m26802g(), InterfaceC4360K9.f19170a.m99136j(), interfaceC32720Et0, (i3 & 112) | (i3 & 14));
                interfaceC32720Et0.mo89638F(-1323940314);
                InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
                InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
                Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(c20912a);
                int i4 = ((((i2 << 3) & 112) << 9) & 7168) | 6;
                if (!(interfaceC32720Et0.mo89515v() instanceof InterfaceC25773lm)) {
                    C52468yt0.m2335c();
                }
                interfaceC32720Et0.mo89557h();
                if (interfaceC32720Et0.mo89521t()) {
                    interfaceC32720Et0.mo89617M(m113415a);
                } else {
                    interfaceC32720Et0.mo89566e();
                }
                interfaceC32720Et0.mo89620L();
                InterfaceC32720Et0 m64192a = C38680bf6.m64192a(interfaceC32720Et0);
                C38680bf6.m64191b(m64192a, m91546a, c0757a.m113412d());
                C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
                C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
                C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
                interfaceC32720Et0.mo89530q();
                m115273a.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, Integer.valueOf((i4 >> 3) & 112));
                interfaceC32720Et0.mo89638F(2058660585);
                function3.invoke(C35465Qm0.f30887a, interfaceC32720Et0, Integer.valueOf(((i2 >> 6) & 112) | 6));
                interfaceC32720Et0.mo89605Q();
                interfaceC32720Et0.mo89563f();
                interfaceC32720Et0.mo89605Q();
                interfaceC32720Et0.mo89605Q();
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C2288c(GU2 gu2, EnumC32768Ey3 enumC32768Ey3, InterfaceC20076eb<HU2> interfaceC20076eb, InterfaceC42444hy5 interfaceC42444hy5, long j, long j2, float f, int i, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, long j3, ZC0 zc0, Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> function3) {
            super(3);
            this.f9434g = gu2;
            this.f9435h = enumC32768Ey3;
            this.f9436i = interfaceC20076eb;
            this.f9437j = interfaceC42444hy5;
            this.f9438k = j;
            this.f9439l = j2;
            this.f9440m = f;
            this.f9441n = i;
            this.f9442o = function2;
            this.f9443p = j3;
            this.f9444q = zc0;
            this.f9445r = function3;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC41875h10 interfaceC41875h10, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC41875h10, interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC41875h10 BoxWithConstraints, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            int i2;
            Set of;
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i & 14) == 0) {
                i2 = (interfaceC32720Et0.mo89539n(BoxWithConstraints) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 91) == 18 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1607356310, i, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous> (ModalBottomSheet.kt:453)");
            }
            float m28064m = C44228kz0.m28064m(BoxWithConstraints.mo35389b());
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            InterfaceC41563gV2 m114257l = BB5.m114257l(c20912a, 0.0f, 1, null);
            Function2<InterfaceC32720Et0, Integer, Unit> function2 = this.f9442o;
            int i3 = this.f9441n;
            long j = this.f9443p;
            GU2 gu2 = this.f9434g;
            ZC0 zc0 = this.f9444q;
            interfaceC32720Et0.mo89638F(733328855);
            InterfaceC4360K9.C4361a c4361a = InterfaceC4360K9.f19170a;
            InterfaceC51579xO2 m44729h = C39504d10.m44729h(c4361a.m99132n(), false, interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m114257l);
            if (!(interfaceC32720Et0.mo89515v() instanceof InterfaceC25773lm)) {
                C52468yt0.m2335c();
            }
            interfaceC32720Et0.mo89557h();
            if (interfaceC32720Et0.mo89521t()) {
                interfaceC32720Et0.mo89617M(m113415a);
            } else {
                interfaceC32720Et0.mo89566e();
            }
            interfaceC32720Et0.mo89620L();
            InterfaceC32720Et0 m64192a = C38680bf6.m64192a(interfaceC32720Et0);
            C38680bf6.m64191b(m64192a, m44729h, c0757a.m113412d());
            C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
            C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
            C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
            interfaceC32720Et0.mo89530q();
            m115273a.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89638F(2058660585);
            C40689f10 c40689f10 = C40689f10.f79291a;
            function2.invoke(interfaceC32720Et0, Integer.valueOf((i3 >> 24) & 14));
            C2289a c2289a = new C2289a(gu2, zc0);
            HU2 m12116t = gu2.m105063g().m12116t();
            HU2 hu2 = HU2.Hidden;
            FU2.m107109e(j, c2289a, m12116t != hu2, interfaceC32720Et0, (i3 >> 21) & 14);
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89563f();
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89605Q();
            InterfaceC41563gV2 m114255n = BB5.m114255n(BB5.m114271C(BoxWithConstraints.mo35388c(c20912a, c4361a.m99134l()), 0.0f, FU2.f9420c, 1, null), 0.0f, 1, null);
            Object m105063g = this.f9434g.m105063g();
            EnumC32768Ey3 enumC32768Ey3 = this.f9435h;
            GU2 gu22 = this.f9434g;
            interfaceC32720Et0.mo89638F(511388516);
            boolean mo89539n = interfaceC32720Et0.mo89539n(m105063g) | interfaceC32720Et0.mo89539n(enumC32768Ey3);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = FU2.m107113a(gu22.m105063g(), enumC32768Ey3);
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            InterfaceC41563gV2 m14065k = C48699sX5.m14065k(C32822Fe3.m106817a(E43.m109418b(m114255n, (B43) mo89635G, null, 2, null), new C2291b(this.f9434g)), this.f9434g.m105063g(), this.f9435h, this.f9434g.m105063g().m12122n() != hu2, false, null, 24, null);
            C49292tX5<HU2> m105063g2 = this.f9434g.m105063g();
            of = SetsKt__SetsKt.setOf((Object[]) new HU2[]{hu2, HU2.HalfExpanded, HU2.Expanded});
            InterfaceC41563gV2 m40620b = C41198fs5.m40620b(C48699sX5.m14068h(m14065k, m105063g2, of, this.f9436i, new C2292c(m28064m, this.f9434g)), false, new C2294d(this.f9434g, this.f9444q), 1, null);
            InterfaceC42444hy5 interfaceC42444hy5 = this.f9437j;
            long j2 = this.f9438k;
            long j3 = this.f9439l;
            float f = this.f9440m;
            InterfaceC42389ht0 m29791b = C43575jt0.m29791b(interfaceC32720Et0, -1793508390, true, new C2301e(this.f9445r, this.f9441n));
            int i4 = this.f9441n;
            NV5.m93838a(m40620b, interfaceC42444hy5, j2, j3, null, f, m29791b, interfaceC32720Et0, ((i4 >> 6) & 112) | 1572864 | ((i4 >> 9) & 896) | ((i4 >> 9) & 7168) | ((i4 << 3) & ImageMetadata.JPEG_GPS_COORDINATES), 16);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: FU2$d */
    /* loaded from: classes.dex */
    public static final class C2302d extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> f9469g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC41563gV2 f9470h;

        /* renamed from: i */
        public final /* synthetic */ GU2 f9471i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC42444hy5 f9472j;

        /* renamed from: k */
        public final /* synthetic */ float f9473k;

        /* renamed from: l */
        public final /* synthetic */ long f9474l;

        /* renamed from: m */
        public final /* synthetic */ long f9475m;

        /* renamed from: n */
        public final /* synthetic */ long f9476n;

        /* renamed from: o */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f9477o;

        /* renamed from: p */
        public final /* synthetic */ int f9478p;

        /* renamed from: q */
        public final /* synthetic */ int f9479q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C2302d(Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, InterfaceC41563gV2 interfaceC41563gV2, GU2 gu2, InterfaceC42444hy5 interfaceC42444hy5, float f, long j, long j2, long j3, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i, int i2) {
            super(2);
            this.f9469g = function3;
            this.f9470h = interfaceC41563gV2;
            this.f9471i = gu2;
            this.f9472j = interfaceC42444hy5;
            this.f9473k = f;
            this.f9474l = j;
            this.f9475m = j2;
            this.f9476n = j3;
            this.f9477o = function2;
            this.f9478p = i;
            this.f9479q = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            FU2.m107111c(this.f9469g, this.f9470h, this.f9471i, this.f9472j, this.f9473k, this.f9474l, this.f9475m, this.f9476n, this.f9477o, interfaceC32720Et0, C47127ps4.m18626a(this.f9478p | 1), this.f9479q);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: FU2$e */
    /* loaded from: classes.dex */
    public static final class C2303e extends Lambda implements Function2<HU2, Float, Unit> {

        /* renamed from: g */
        public final /* synthetic */ ZC0 f9480g;

        /* renamed from: h */
        public final /* synthetic */ GU2 f9481h;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1$1", m28418f = "ModalBottomSheet.kt", m28417i = {}, m28416l = {449}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: FU2$e$a */
        /* loaded from: classes.dex */
        public static final class C2304a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f9482h;

            /* renamed from: i */
            public final /* synthetic */ GU2 f9483i;

            /* renamed from: j */
            public final /* synthetic */ HU2 f9484j;

            /* renamed from: k */
            public final /* synthetic */ float f9485k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2304a(GU2 gu2, HU2 hu2, float f, Continuation<? super C2304a> continuation) {
                super(2, continuation);
                this.f9483i = gu2;
                this.f9484j = hu2;
                this.f9485k = f;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2304a(this.f9483i, this.f9484j, this.f9485k, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C2304a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f9482h;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    GU2 gu2 = this.f9483i;
                    HU2 hu2 = this.f9484j;
                    float f = this.f9485k;
                    this.f9482h = 1;
                    if (gu2.m105069a(hu2, f, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2303e(ZC0 zc0, GU2 gu2) {
            super(2);
            this.f9480g = zc0;
            this.f9481h = gu2;
        }

        /* renamed from: a */
        public final void m107090a(HU2 target, float f) {
            Intrinsics.checkNotNullParameter(target, "target");
            Z30.m73800d(this.f9480g, null, null, new C2304a(this.f9481h, target, f, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(HU2 hu2, Float f) {
            m107090a(hu2, f.floatValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: FU2$f */
    /* loaded from: classes.dex */
    public static final class C2305f extends Lambda implements Function1<HU2, Unit> {

        /* renamed from: g */
        public final /* synthetic */ ZC0 f9486g;

        /* renamed from: h */
        public final /* synthetic */ GU2 f9487h;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2$1", m28418f = "ModalBottomSheet.kt", m28417i = {}, m28416l = {451}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: FU2$f$a */
        /* loaded from: classes.dex */
        public static final class C2306a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f9488h;

            /* renamed from: i */
            public final /* synthetic */ GU2 f9489i;

            /* renamed from: j */
            public final /* synthetic */ HU2 f9490j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2306a(GU2 gu2, HU2 hu2, Continuation<? super C2306a> continuation) {
                super(2, continuation);
                this.f9489i = gu2;
                this.f9490j = hu2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2306a(this.f9489i, this.f9490j, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C2306a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f9488h;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    GU2 gu2 = this.f9489i;
                    HU2 hu2 = this.f9490j;
                    this.f9488h = 1;
                    if (gu2.m105056n(hu2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2305f(ZC0 zc0, GU2 gu2) {
            super(1);
            this.f9486g = zc0;
            this.f9487h = gu2;
        }

        /* renamed from: a */
        public final void m107089a(HU2 target) {
            Intrinsics.checkNotNullParameter(target, "target");
            Z30.m73800d(this.f9486g, null, null, new C2306a(this.f9487h, target, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HU2 hu2) {
            m107089a(hu2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lg01;", "", "it", C17296a.f69688o, "(Lg01;F)Ljava/lang/Float;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt$PositionalThreshold$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,684:1\n154#2:685\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt$PositionalThreshold$1\n*L\n681#1:685\n*E\n"})
    /* renamed from: FU2$g */
    /* loaded from: classes.dex */
    public static final class C2307g extends Lambda implements Function2<InterfaceC41273g01, Float, Float> {

        /* renamed from: g */
        public static final C2307g f9491g = new C2307g();

        public C2307g() {
            super(2);
        }

        /* renamed from: a */
        public final Float m107088a(InterfaceC41273g01 interfaceC41273g01, float f) {
            Intrinsics.checkNotNullParameter(interfaceC41273g01, "$this$null");
            return Float.valueOf(interfaceC41273g01.mo3411T0(C43705k61.m29303g(56)));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Float invoke(InterfaceC41273g01 interfaceC41273g01, Float f) {
            return m107088a(interfaceC41273g01, f.floatValue());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: FU2$h */
    /* loaded from: classes.dex */
    public static final class C2308h extends Lambda implements Function1<I61, Unit> {

        /* renamed from: g */
        public final /* synthetic */ long f9492g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC48627sP5<Float> f9493h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2308h(long j, InterfaceC48627sP5<Float> interfaceC48627sP5) {
            super(1);
            this.f9492g = j;
            this.f9493h = interfaceC48627sP5;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(I61 i61) {
            invoke2(i61);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(I61 Canvas) {
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            I61.m102945z0(Canvas, this.f9492g, 0L, 0L, FU2.m107108f(this.f9493h), null, null, 0, 118, null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: FU2$i */
    /* loaded from: classes.dex */
    public static final class C2309i extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ long f9494g;

        /* renamed from: h */
        public final /* synthetic */ Function0<Unit> f9495h;

        /* renamed from: i */
        public final /* synthetic */ boolean f9496i;

        /* renamed from: j */
        public final /* synthetic */ int f9497j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2309i(long j, Function0<Unit> function0, boolean z, int i) {
            super(2);
            this.f9494g = j;
            this.f9495h = function0;
            this.f9496i = z;
            this.f9497j = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            FU2.m107109e(this.f9494g, this.f9495h, this.f9496i, interfaceC32720Et0, C47127ps4.m18626a(this.f9497j | 1));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$1$1", m28418f = "ModalBottomSheet.kt", m28417i = {}, m28416l = {561}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: FU2$j */
    /* loaded from: classes.dex */
    public static final class C2310j extends SuspendLambda implements Function2<InterfaceC49290tX3, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f9498h;

        /* renamed from: i */
        public /* synthetic */ Object f9499i;

        /* renamed from: j */
        public final /* synthetic */ Function0<Unit> f9500j;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: FU2$j$a */
        /* loaded from: classes.dex */
        public static final class C2311a extends Lambda implements Function1<C32120Ce3, Unit> {

            /* renamed from: g */
            public final /* synthetic */ Function0<Unit> f9501g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2311a(Function0<Unit> function0) {
                super(1);
                this.f9501g = function0;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C32120Ce3 c32120Ce3) {
                m116222invokek4lQ0M(c32120Ce3.m111935x());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
            public final void m116222invokek4lQ0M(long j) {
                this.f9501g.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2310j(Function0<Unit> function0, Continuation<? super C2310j> continuation) {
            super(2, continuation);
            this.f9500j = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C2310j c2310j = new C2310j(this.f9500j, continuation);
            c2310j.f9499i = obj;
            return c2310j;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC49290tX3 interfaceC49290tX3, Continuation<? super Unit> continuation) {
            return ((C2310j) create(interfaceC49290tX3, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f9498h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC49290tX3 interfaceC49290tX3 = (InterfaceC49290tX3) this.f9499i;
                C2311a c2311a = new C2311a(this.f9500j);
                this.f9498h = 1;
                if (KY5.m98768j(interfaceC49290tX3, null, null, null, c2311a, this, 7, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: FU2$k */
    /* loaded from: classes.dex */
    public static final class C2312k extends Lambda implements Function1<InterfaceC48906ss5, Unit> {

        /* renamed from: g */
        public final /* synthetic */ String f9502g;

        /* renamed from: h */
        public final /* synthetic */ Function0<Unit> f9503h;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: FU2$k$a */
        /* loaded from: classes.dex */
        public static final class C2313a extends Lambda implements Function0<Boolean> {

            /* renamed from: g */
            public final /* synthetic */ Function0<Unit> f9504g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2313a(Function0<Unit> function0) {
                super(0);
                this.f9504g = function0;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                this.f9504g.invoke();
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2312k(String str, Function0<Unit> function0) {
            super(1);
            this.f9502g = str;
            this.f9503h = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48906ss5 interfaceC48906ss5) {
            invoke2(interfaceC48906ss5);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC48906ss5 semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            C47128ps5.m18618H(semantics, this.f9502g);
            C47128ps5.m18580s(semantics, null, new C2313a(this.f9503h), 1, null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: FU2$l */
    /* loaded from: classes.dex */
    public static final class C2314l extends Lambda implements Function1<HU2, Boolean> {

        /* renamed from: g */
        public static final C2314l f9505g = new C2314l();

        public C2314l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(HU2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: FU2$m */
    /* loaded from: classes.dex */
    public static final class C2315m extends Lambda implements Function0<GU2> {

        /* renamed from: g */
        public final /* synthetic */ HU2 f9506g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC25753lf<Float> f9507h;

        /* renamed from: i */
        public final /* synthetic */ Function1<HU2, Boolean> f9508i;

        /* renamed from: j */
        public final /* synthetic */ boolean f9509j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C2315m(HU2 hu2, InterfaceC25753lf<Float> interfaceC25753lf, Function1<? super HU2, Boolean> function1, boolean z) {
            super(0);
            this.f9506g = hu2;
            this.f9507h = interfaceC25753lf;
            this.f9508i = function1;
            this.f9509j = z;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final GU2 invoke() {
            return FU2.m107110d(this.f9506g, this.f9507h, this.f9508i, this.f9509j);
        }
    }

    /* renamed from: a */
    public static final B43 m107113a(C49292tX5<?> c49292tX5, EnumC32768Ey3 enumC32768Ey3) {
        return new C2283a(c49292tX5, enumC32768Ey3);
    }

    /* renamed from: b */
    public static final InterfaceC20076eb<HU2> m107112b(GU2 gu2, Function2<? super HU2, ? super Float, Unit> function2, Function1<? super HU2, Unit> function1) {
        return new C2286b(gu2, function2, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012b  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m107111c(Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> sheetContent, InterfaceC41563gV2 interfaceC41563gV2, GU2 gu2, InterfaceC42444hy5 interfaceC42444hy5, float f, long j, long j2, long j3, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        int i5;
        float f2;
        long j4;
        int i6;
        InterfaceC41563gV2.C20912a c20912a;
        GU2 gu22;
        KC0 kc0;
        long j5;
        long j6;
        long j7;
        InterfaceC42444hy5 interfaceC42444hy52;
        GU2 gu23;
        float f3;
        long j8;
        int i7;
        long j9;
        Object mo89635G;
        InterfaceC32720Et0.C2012a c2012a;
        boolean mo89539n;
        Object mo89635G2;
        InterfaceC32720Et0 interfaceC32720Et02;
        InterfaceC42444hy5 interfaceC42444hy53;
        float f4;
        long j10;
        long j11;
        long j12;
        GU2 gu24;
        InterfaceC36874Wm5 mo89512w;
        int i8;
        Intrinsics.checkNotNullParameter(sheetContent, "sheetContent");
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1633763156);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (mo89518u.mo89629I(sheetContent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = interfaceC41563gV2;
            i3 |= mo89518u.mo89539n(obj) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 != 0) {
                i3 |= 128;
            }
            if ((i & 7168) == 0) {
                i3 |= ((i2 & 8) == 0 && mo89518u.mo89539n(interfaceC42444hy5)) ? 2048 : 1024;
            }
            i5 = i2 & 16;
            if (i5 == 0) {
                i3 |= 24576;
                f2 = f;
            } else {
                f2 = f;
                if ((57344 & i) == 0) {
                    i3 |= mo89518u.mo89533p(f2) ? 16384 : 8192;
                }
            }
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0 && mo89518u.mo89524s(j)) {
                    i8 = DateUtils.FORMAT_NUMERIC_DATE;
                    i3 |= i8;
                }
                i8 = 65536;
                i3 |= i8;
            }
            if ((i & 3670016) == 0) {
                i3 |= ((i2 & 64) == 0 && mo89518u.mo89524s(j2)) ? 1048576 : 524288;
            }
            if ((29360128 & i) != 0) {
                j4 = j3;
                i3 |= ((i2 & 128) == 0 && mo89518u.mo89524s(j4)) ? 8388608 : 4194304;
            } else {
                j4 = j3;
            }
            if ((i2 & 256) != 0) {
                if ((234881024 & i) == 0) {
                    i6 = mo89518u.mo89629I(content) ? 67108864 : 33554432;
                }
                int i10 = i3;
                if (i4 != 4 && (191739611 & i10) == 38347922 && mo89518u.mo89575b()) {
                    mo89518u.mo89548k();
                    gu24 = gu2;
                    c20912a = obj;
                    f4 = f2;
                    interfaceC32720Et02 = mo89518u;
                    interfaceC42444hy53 = interfaceC42444hy5;
                    j12 = j4;
                    j10 = j;
                    j11 = j2;
                } else {
                    mo89518u.mo89626J();
                    if ((i & 1) == 0 && !mo89518u.mo89545l()) {
                        mo89518u.mo89548k();
                        if (i4 != 0) {
                            i10 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i10 &= -7169;
                        }
                        if ((i2 & 32) != 0) {
                            i10 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i10 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            i10 &= -29360129;
                        }
                        interfaceC42444hy52 = interfaceC42444hy5;
                        j8 = j;
                        j9 = j2;
                        c20912a = obj;
                        i7 = i10;
                        j7 = j4;
                        f3 = f2;
                        gu23 = gu2;
                    } else {
                        c20912a = i9 != 0 ? InterfaceC41563gV2.f82354b0 : obj;
                        if (i4 != 0) {
                            gu22 = m107099o(HU2.Hidden, null, null, false, mo89518u, 6, 14);
                            i10 &= -897;
                        } else {
                            gu22 = gu2;
                        }
                        if ((i2 & 8) != 0) {
                            kc0 = TM2.f35372a.m83730b(mo89518u, 6).m109566c();
                            i10 &= -7169;
                        } else {
                            kc0 = interfaceC42444hy5;
                        }
                        float m108929a = i5 != 0 ? EU2.f7535a.m108929a() : f2;
                        if ((i2 & 32) != 0) {
                            j5 = TM2.f35372a.m83731a(mo89518u, 6).m94896n();
                            i10 &= -458753;
                        } else {
                            j5 = j;
                        }
                        if ((i2 & 64) != 0) {
                            j6 = C34763Nm0.m93468b(j5, mo89518u, (i10 >> 15) & 14);
                            i10 &= -3670017;
                        } else {
                            j6 = j2;
                        }
                        if ((i2 & 128) != 0) {
                            interfaceC42444hy52 = kc0;
                            f3 = m108929a;
                            j8 = j5;
                            j9 = j6;
                            j7 = EU2.f7535a.m108928b(mo89518u, 6);
                            gu23 = gu22;
                            i7 = i10 & (-29360129);
                        } else {
                            j7 = j3;
                            interfaceC42444hy52 = kc0;
                            gu23 = gu22;
                            f3 = m108929a;
                            j8 = j5;
                            i7 = i10;
                            j9 = j6;
                        }
                    }
                    mo89518u.mo89650B();
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87816Z(-1633763156, i7, -1, "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:430)");
                    }
                    mo89518u.mo89638F(773894976);
                    mo89518u.mo89638F(-492369756);
                    mo89635G = mo89518u.mo89635G();
                    c2012a = InterfaceC32720Et0.f8257a;
                    if (mo89635G == c2012a.m108267a()) {
                        C42992iu0 c42992iu0 = new C42992iu0(Y91.m75529j(EmptyCoroutineContext.INSTANCE, mo89518u));
                        mo89518u.mo89503z(c42992iu0);
                        mo89635G = c42992iu0;
                    }
                    mo89518u.mo89605Q();
                    ZC0 m31665a = ((C42992iu0) mo89635G).m31665a();
                    mo89518u.mo89605Q();
                    EnumC32768Ey3 enumC32768Ey3 = EnumC32768Ey3.Vertical;
                    mo89518u.mo89638F(511388516);
                    mo89539n = mo89518u.mo89539n(gu23) | mo89518u.mo89539n(m31665a);
                    mo89635G2 = mo89518u.mo89635G();
                    if (!mo89539n || mo89635G2 == c2012a.m108267a()) {
                        mo89635G2 = m107112b(gu23, new C2303e(m31665a, gu23), new C2305f(m31665a, gu23));
                        mo89518u.mo89503z(mo89635G2);
                    }
                    mo89518u.mo89605Q();
                    int i11 = i7;
                    GU2 gu25 = gu23;
                    C2288c c2288c = new C2288c(gu23, enumC32768Ey3, (InterfaceC20076eb) mo89635G2, interfaceC42444hy52, j8, j9, f3, i11, content, j7, m31665a, sheetContent);
                    interfaceC32720Et02 = mo89518u;
                    C41282g10.m40327a(c20912a, null, false, C43575jt0.m29791b(interfaceC32720Et02, 1607356310, true, c2288c), interfaceC32720Et02, ((i11 >> 3) & 14) | 3072, 6);
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87817Y();
                    }
                    interfaceC42444hy53 = interfaceC42444hy52;
                    f4 = f3;
                    j10 = j8;
                    j11 = j9;
                    j12 = j7;
                    gu24 = gu25;
                }
                mo89512w = interfaceC32720Et02.mo89512w();
                if (mo89512w == null) {
                    return;
                }
                mo89512w.mo20405a(new C2302d(sheetContent, c20912a, gu24, interfaceC42444hy53, f4, j10, j11, j12, content, i, i2));
                return;
            }
            i6 = 100663296;
            i3 |= i6;
            int i102 = i3;
            if (i4 != 4) {
            }
            mo89518u.mo89626J();
            if ((i & 1) == 0) {
            }
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            mo89518u.mo89650B();
            if (C35528Qt0.m87827O()) {
            }
            mo89518u.mo89638F(773894976);
            mo89518u.mo89638F(-492369756);
            mo89635G = mo89518u.mo89635G();
            c2012a = InterfaceC32720Et0.f8257a;
            if (mo89635G == c2012a.m108267a()) {
            }
            mo89518u.mo89605Q();
            ZC0 m31665a2 = ((C42992iu0) mo89635G).m31665a();
            mo89518u.mo89605Q();
            EnumC32768Ey3 enumC32768Ey32 = EnumC32768Ey3.Vertical;
            mo89518u.mo89638F(511388516);
            mo89539n = mo89518u.mo89539n(gu23) | mo89518u.mo89539n(m31665a2);
            mo89635G2 = mo89518u.mo89635G();
            if (!mo89539n) {
            }
            mo89635G2 = m107112b(gu23, new C2303e(m31665a2, gu23), new C2305f(m31665a2, gu23));
            mo89518u.mo89503z(mo89635G2);
            mo89518u.mo89605Q();
            int i112 = i7;
            GU2 gu252 = gu23;
            C2288c c2288c2 = new C2288c(gu23, enumC32768Ey32, (InterfaceC20076eb) mo89635G2, interfaceC42444hy52, j8, j9, f3, i112, content, j7, m31665a2, sheetContent);
            interfaceC32720Et02 = mo89518u;
            C41282g10.m40327a(c20912a, null, false, C43575jt0.m29791b(interfaceC32720Et02, 1607356310, true, c2288c2), interfaceC32720Et02, ((i112 >> 3) & 14) | 3072, 6);
            if (C35528Qt0.m87827O()) {
            }
            interfaceC42444hy53 = interfaceC42444hy52;
            f4 = f3;
            j10 = j8;
            j11 = j9;
            j12 = j7;
            gu24 = gu252;
            mo89512w = interfaceC32720Et02.mo89512w();
            if (mo89512w == null) {
            }
        }
        obj = interfaceC41563gV2;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        if ((i & 7168) == 0) {
        }
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        if ((458752 & i) == 0) {
        }
        if ((i & 3670016) == 0) {
        }
        if ((29360128 & i) != 0) {
        }
        if ((i2 & 256) != 0) {
        }
        i3 |= i6;
        int i1022 = i3;
        if (i4 != 4) {
        }
        mo89518u.mo89626J();
        if ((i & 1) == 0) {
        }
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        mo89518u.mo89650B();
        if (C35528Qt0.m87827O()) {
        }
        mo89518u.mo89638F(773894976);
        mo89518u.mo89638F(-492369756);
        mo89635G = mo89518u.mo89635G();
        c2012a = InterfaceC32720Et0.f8257a;
        if (mo89635G == c2012a.m108267a()) {
        }
        mo89518u.mo89605Q();
        ZC0 m31665a22 = ((C42992iu0) mo89635G).m31665a();
        mo89518u.mo89605Q();
        EnumC32768Ey3 enumC32768Ey322 = EnumC32768Ey3.Vertical;
        mo89518u.mo89638F(511388516);
        mo89539n = mo89518u.mo89539n(gu23) | mo89518u.mo89539n(m31665a22);
        mo89635G2 = mo89518u.mo89635G();
        if (!mo89539n) {
        }
        mo89635G2 = m107112b(gu23, new C2303e(m31665a22, gu23), new C2305f(m31665a22, gu23));
        mo89518u.mo89503z(mo89635G2);
        mo89518u.mo89605Q();
        int i1122 = i7;
        GU2 gu2522 = gu23;
        C2288c c2288c22 = new C2288c(gu23, enumC32768Ey322, (InterfaceC20076eb) mo89635G2, interfaceC42444hy52, j8, j9, f3, i1122, content, j7, m31665a22, sheetContent);
        interfaceC32720Et02 = mo89518u;
        C41282g10.m40327a(c20912a, null, false, C43575jt0.m29791b(interfaceC32720Et02, 1607356310, true, c2288c22), interfaceC32720Et02, ((i1122 >> 3) & 14) | 3072, 6);
        if (C35528Qt0.m87827O()) {
        }
        interfaceC42444hy53 = interfaceC42444hy52;
        f4 = f3;
        j10 = j8;
        j11 = j9;
        j12 = j7;
        gu24 = gu2522;
        mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w == null) {
        }
    }

    /* renamed from: d */
    public static final GU2 m107110d(HU2 initialValue, InterfaceC25753lf<Float> animationSpec, Function1<? super HU2, Boolean> confirmValueChange, boolean z) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
        return new GU2(initialValue, animationSpec, z, confirmValueChange);
    }

    /* renamed from: e */
    public static final void m107109e(long j, Function0<Unit> function0, boolean z, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        boolean z2;
        float f;
        InterfaceC41563gV2 interfaceC41563gV2;
        int i3;
        int i4;
        int i5;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-526532668);
        if ((i & 14) == 0) {
            if (mo89518u.mo89524s(j)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89629I(function0)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (mo89518u.mo89536o(z)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-526532668, i2, -1, "androidx.compose.material.Scrim (ModalBottomSheet.kt:547)");
            }
            if (j != C47063pm0.f104050b.m18726g()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                InterfaceC48627sP5 m100063f = C4171Je.m100063f(f, new C49330tb6(0, 0, null, 7, null), 0.0f, null, mo89518u, 48, 12);
                String m17501a = C47469qS5.m17501a(C45690nS5.f99991a.m23663b(), mo89518u, 6);
                mo89518u.mo89638F(1010553415);
                if (z) {
                    InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
                    mo89518u.mo89638F(1157296644);
                    boolean mo89539n = mo89518u.mo89539n(function0);
                    Object mo89635G = mo89518u.mo89635G();
                    if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                        mo89635G = new C2310j(function0, null);
                        mo89518u.mo89503z(mo89635G);
                    }
                    mo89518u.mo89605Q();
                    InterfaceC41563gV2 m1270c = C52840zW5.m1270c(c20912a, function0, (Function2) mo89635G);
                    mo89518u.mo89638F(511388516);
                    boolean mo89539n2 = mo89518u.mo89539n(m17501a) | mo89518u.mo89539n(function0);
                    Object mo89635G2 = mo89518u.mo89635G();
                    if (mo89539n2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
                        mo89635G2 = new C2312k(m17501a, function0);
                        mo89518u.mo89503z(mo89635G2);
                    }
                    mo89518u.mo89605Q();
                    interfaceC41563gV2 = C41198fs5.m40621a(m1270c, true, (Function1) mo89635G2);
                } else {
                    interfaceC41563gV2 = InterfaceC41563gV2.f82354b0;
                }
                mo89518u.mo89605Q();
                InterfaceC41563gV2 mo39266t0 = BB5.m114257l(InterfaceC41563gV2.f82354b0, 0.0f, 1, null).mo39266t0(interfaceC41563gV2);
                C47063pm0 m18747i = C47063pm0.m18747i(j);
                mo89518u.mo89638F(511388516);
                boolean mo89539n3 = mo89518u.mo89539n(m18747i) | mo89518u.mo89539n(m100063f);
                Object mo89635G3 = mo89518u.mo89635G();
                if (mo89539n3 || mo89635G3 == InterfaceC32720Et0.f8257a.m108267a()) {
                    mo89635G3 = new C2308h(j, m100063f);
                    mo89518u.mo89503z(mo89635G3);
                }
                mo89518u.mo89605Q();
                C48169re0.m15656a(mo39266t0, (Function1) mo89635G3, mo89518u, 0);
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C2309i(j, function0, z, i));
        }
    }

    /* renamed from: f */
    public static final float m107108f(InterfaceC48627sP5<Float> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().floatValue();
    }

    @Deprecated(message = "This function is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @ReplaceWith(expression = "rememberModalBottomSheetState(initialValue, animationSpec, confirmValueChange = confirmStateChange)", imports = {}))
    /* renamed from: n */
    public static final GU2 m107100n(HU2 initialValue, InterfaceC25753lf<Float> interfaceC25753lf, Function1<? super HU2, Boolean> confirmStateChange, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        interfaceC32720Et0.mo89638F(-1928569212);
        if ((i2 & 2) != 0) {
            interfaceC25753lf = C47514qX5.f105380a.m17469a();
        }
        InterfaceC25753lf<Float> interfaceC25753lf2 = interfaceC25753lf;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1928569212, i, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:389)");
        }
        GU2 m107099o = m107099o(initialValue, interfaceC25753lf2, confirmStateChange, false, interfaceC32720Et0, (i & 14) | 3136 | (i & 896), 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m107099o;
    }

    /* renamed from: o */
    public static final GU2 m107099o(HU2 initialValue, InterfaceC25753lf<Float> interfaceC25753lf, Function1<? super HU2, Boolean> function1, boolean z, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        interfaceC32720Et0.mo89638F(-126412120);
        if ((i2 & 2) != 0) {
            interfaceC25753lf = C47514qX5.f105380a.m17469a();
        }
        if ((i2 & 4) != 0) {
            function1 = C2314l.f9505g;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-126412120, i, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:313)");
        }
        interfaceC32720Et0.mo89623K(170046719, initialValue);
        GU2 gu2 = (GU2) C35550Qv4.m87571b(new Object[]{initialValue, interfaceC25753lf, Boolean.valueOf(z), function1}, GU2.f11967d.m105055a(interfaceC25753lf, function1, z), null, new C2315m(initialValue, interfaceC25753lf, function1, z), interfaceC32720Et0, 72, 4);
        interfaceC32720Et0.mo89608P();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return gu2;
    }

    @Deprecated(message = "This function is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @ReplaceWith(expression = "rememberModalBottomSheetState(initialValue, animationSpec, confirmStateChange, false)", imports = {}))
    /* renamed from: p */
    public static final GU2 m107098p(HU2 initialValue, InterfaceC25753lf<Float> interfaceC25753lf, boolean z, Function1<? super HU2, Boolean> confirmStateChange, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        interfaceC32720Et0.mo89638F(-409288536);
        if ((i2 & 2) != 0) {
            interfaceC25753lf = C47514qX5.f105380a.m17469a();
        }
        InterfaceC25753lf<Float> interfaceC25753lf2 = interfaceC25753lf;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-409288536, i, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:362)");
        }
        GU2 m107099o = m107099o(initialValue, interfaceC25753lf2, confirmStateChange, z, interfaceC32720Et0, (i & 14) | 64 | ((i >> 3) & 896) | ((i << 3) & 7168), 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m107099o;
    }
}
