package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b\u001aH\u0010\u000b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0001\u001a}\u0010\u0018\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e28\u0010\u0017\u001a4\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0010H\u0001ø\u0001\u0000\u001aC\u0010\u001e\u001a(\u0012\u0004\u0012\u00020\u001b\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00160\u0010¢\u0006\u0002\b\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a9\u0010#\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160 2\b\b\u0002\u0010!\u001a\u00020\u00162\b\b\u0002\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010$\u001a'\u0010%\u001a\u0004\u0018\u00010\u0016\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160 H\u0002¢\u0006\u0004\b%\u0010&\u001a'\u0010'\u001a\u0004\u0018\u00010\u0016\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160 H\u0002¢\u0006\u0004\b'\u0010&\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006("}, m28432d2 = {"T", "LgV2;", "LtX5;", TransferTable.COLUMN_STATE, "LEy3;", "orientation", "", "enabled", "reverseDirection", "LrX2;", "interactionSource", "j", "", "possibleValues", "Leb;", "anchorChangeHandler", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "LG52;", "layoutSize", "", "calculateAnchor", "h", "Lk61;", "threshold", "Lg01;", "distance", "Lkotlin/ExtensionFunctionType;", "e", "(F)Lkotlin/jvm/functions/Function2;", "", "offset", "searchUpwards", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/Map;FZ)Ljava/lang/Object;", "g", "(Ljava/util/Map;)Ljava/lang/Float;", "f", "material_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSwipeableV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material/SwipeableV2Kt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,655:1\n135#2:656\n1#3:657\n*S KotlinDebug\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material/SwipeableV2Kt\n*L\n127#1:656\n*E\n"})
/* renamed from: sX5 */
/* loaded from: classes.dex */
public final class C48699sX5 {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lg01;", "", "it", C17296a.f69688o, "(Lg01;F)Ljava/lang/Float;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: sX5$a */
    /* loaded from: classes.dex */
    public static final class C28336a extends Lambda implements Function2<InterfaceC41273g01, Float, Float> {

        /* renamed from: g */
        public final /* synthetic */ float f108934g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28336a(float f) {
            super(2);
            this.f108934g = f;
        }

        /* renamed from: a */
        public final Float m14064a(InterfaceC41273g01 interfaceC41273g01, float f) {
            Intrinsics.checkNotNullParameter(interfaceC41273g01, "$this$null");
            return Float.valueOf(interfaceC41273g01.mo3411T0(this.f108934g));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Float invoke(InterfaceC41273g01 interfaceC41273g01, Float f) {
            return m14064a(interfaceC41273g01, f.floatValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 SwipeableV2.kt\nandroidx/compose/material/SwipeableV2Kt\n*L\n1#1,170:1\n128#2,6:171\n*E\n"})
    /* renamed from: sX5$b */
    /* loaded from: classes.dex */
    public static final class C28337b extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C49292tX5 f108935g;

        /* renamed from: h */
        public final /* synthetic */ Set f108936h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC20076eb f108937i;

        /* renamed from: j */
        public final /* synthetic */ Function2 f108938j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28337b(C49292tX5 c49292tX5, Set set, InterfaceC20076eb interfaceC20076eb, Function2 function2) {
            super(1);
            this.f108935g = c49292tX5;
            this.f108936h = set;
            this.f108937i = interfaceC20076eb;
            this.f108938j = function2;
        }

        /* renamed from: a */
        public final void m14063a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("swipeAnchors");
            s42.m86038a().m104824a(TransferTable.COLUMN_STATE, this.f108935g);
            s42.m86038a().m104824a("possibleValues", this.f108936h);
            s42.m86038a().m104824a("anchorChangeHandler", this.f108937i);
            s42.m86038a().m104824a("calculateAnchor", this.f108938j);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m14063a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "Lg01;", "it", "", C17296a.f69688o, "(Lg01;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: sX5$c */
    /* loaded from: classes.dex */
    public static final class C28338c extends Lambda implements Function1<InterfaceC41273g01, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C49292tX5<T> f108939g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28338c(C49292tX5<T> c49292tX5) {
            super(1);
            this.f108939g = c49292tX5;
        }

        /* renamed from: a */
        public final void m14062a(InterfaceC41273g01 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.f108939g.m12141B(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC41273g01 interfaceC41273g01) {
            m14062a(interfaceC41273g01);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "LG52;", "layoutSize", "", "invoke-ozmzZPI", "(J)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSwipeableV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material/SwipeableV2Kt$swipeAnchors$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,655:1\n1855#2,2:656\n*S KotlinDebug\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material/SwipeableV2Kt$swipeAnchors$2\n*L\n113#1:656,2\n*E\n"})
    /* renamed from: sX5$d */
    /* loaded from: classes.dex */
    public static final class C28339d extends Lambda implements Function1<G52, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C49292tX5<T> f108940g;

        /* renamed from: h */
        public final /* synthetic */ Set<T> f108941h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC20076eb<T> f108942i;

        /* renamed from: j */
        public final /* synthetic */ Function2<T, G52, Float> f108943j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C28339d(C49292tX5<T> c49292tX5, Set<? extends T> set, InterfaceC20076eb<T> interfaceC20076eb, Function2<? super T, ? super G52, Float> function2) {
            super(1);
            this.f108940g = c49292tX5;
            this.f108941h = set;
            this.f108942i = interfaceC20076eb;
            this.f108943j = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(G52 g52) {
            m118447invokeozmzZPI(g52.m105826j());
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-ozmzZPI */
        public final void m118447invokeozmzZPI(long j) {
            InterfaceC20076eb<T> interfaceC20076eb;
            Map m12126j = this.f108940g.m12126j();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Collection collection = this.f108941h;
            Function2<T, G52, Float> function2 = this.f108943j;
            for (Object obj : collection) {
                Float invoke = function2.invoke(obj, G52.m105834b(j));
                if (invoke != null) {
                    linkedHashMap.put(obj, invoke);
                }
            }
            if (!Intrinsics.areEqual(m12126j, linkedHashMap)) {
                Object m12116t = this.f108940g.m12116t();
                if (this.f108940g.m12136G(linkedHashMap) && (interfaceC20076eb = this.f108942i) != 0) {
                    interfaceC20076eb.mo42732a(m12116t, m12126j, linkedHashMap);
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, m28432d2 = {"T", "LZC0;", "", "velocity", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.material.SwipeableV2Kt$swipeableV2$1", m28418f = "SwipeableV2.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: sX5$e */
    /* loaded from: classes.dex */
    public static final class C28340e extends SuspendLambda implements Function3<ZC0, Float, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f108944h;

        /* renamed from: i */
        public /* synthetic */ Object f108945i;

        /* renamed from: j */
        public /* synthetic */ float f108946j;

        /* renamed from: k */
        public final /* synthetic */ C49292tX5<T> f108947k;

        @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m28432d2 = {"T", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "androidx.compose.material.SwipeableV2Kt$swipeableV2$1$1", m28418f = "SwipeableV2.kt", m28417i = {}, m28416l = {86}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: sX5$e$a */
        /* loaded from: classes.dex */
        public static final class C28341a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f108948h;

            /* renamed from: i */
            public final /* synthetic */ C49292tX5<T> f108949i;

            /* renamed from: j */
            public final /* synthetic */ float f108950j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28341a(C49292tX5<T> c49292tX5, float f, Continuation<? super C28341a> continuation) {
                super(2, continuation);
                this.f108949i = c49292tX5;
                this.f108950j = f;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C28341a(this.f108949i, this.f108950j, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C28341a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f108948h;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    C49292tX5<T> c49292tX5 = this.f108949i;
                    float f = this.f108950j;
                    this.f108948h = 1;
                    if (c49292tX5.m12138E(f, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28340e(C49292tX5<T> c49292tX5, Continuation<? super C28340e> continuation) {
            super(3, continuation);
            this.f108947k = c49292tX5;
        }

        /* renamed from: e */
        public final Object m14061e(ZC0 zc0, float f, Continuation<? super Unit> continuation) {
            C28340e c28340e = new C28340e(this.f108947k, continuation);
            c28340e.f108945i = zc0;
            c28340e.f108946j = f;
            return c28340e.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Float f, Continuation<? super Unit> continuation) {
            return m14061e(zc0, f.floatValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f108944h == 0) {
                ResultKt.throwOnFailure(obj);
                Z30.m73800d((ZC0) this.f108945i, null, null, new C28341a(this.f108947k, this.f108946j, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ Object m14075a(Map map, float f, boolean z) {
        return m14072d(map, f, z);
    }

    /* renamed from: b */
    public static final /* synthetic */ Float m14074b(Map map) {
        return m14070f(map);
    }

    /* renamed from: c */
    public static final /* synthetic */ Float m14073c(Map map) {
        return m14069g(map);
    }

    /* renamed from: d */
    public static final <T> T m14072d(Map<T, Float> map, float f, boolean z) {
        float f2;
        float f3;
        if (!map.isEmpty()) {
            Iterator<T> it = map.entrySet().iterator();
            if (it.hasNext()) {
                T next = it.next();
                if (it.hasNext()) {
                    float floatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                    if (z) {
                        f2 = floatValue - f;
                    } else {
                        f2 = f - floatValue;
                    }
                    if (f2 < 0.0f) {
                        f2 = Float.POSITIVE_INFINITY;
                    }
                    do {
                        T next2 = it.next();
                        float floatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                        if (z) {
                            f3 = floatValue2 - f;
                        } else {
                            f3 = f - floatValue2;
                        }
                        if (f3 < 0.0f) {
                            f3 = Float.POSITIVE_INFINITY;
                        }
                        if (Float.compare(f2, f3) > 0) {
                            next = next2;
                            f2 = f3;
                        }
                    } while (it.hasNext());
                    return (T) ((Map.Entry) next).getKey();
                }
                return (T) ((Map.Entry) next).getKey();
            }
            throw new NoSuchElementException();
        }
        throw new IllegalArgumentException("The anchors were empty when trying to find the closest anchor".toString());
    }

    /* renamed from: e */
    public static final Function2<InterfaceC41273g01, Float, Float> m14071e(float f) {
        return new C28336a(f);
    }

    /* renamed from: f */
    public static final <T> Float m14070f(Map<T, Float> map) {
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            float floatValue = ((Number) ((Map.Entry) it.next()).getValue()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, ((Number) ((Map.Entry) it.next()).getValue()).floatValue());
            }
            return Float.valueOf(floatValue);
        }
        return null;
    }

    /* renamed from: g */
    public static final <T> Float m14069g(Map<T, Float> map) {
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            float floatValue = ((Number) ((Map.Entry) it.next()).getValue()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, ((Number) ((Map.Entry) it.next()).getValue()).floatValue());
            }
            return Float.valueOf(floatValue);
        }
        return null;
    }

    /* renamed from: h */
    public static final <T> InterfaceC41563gV2 m14068h(InterfaceC41563gV2 interfaceC41563gV2, C49292tX5<T> state, Set<? extends T> possibleValues, InterfaceC20076eb<T> interfaceC20076eb, Function2<? super T, ? super G52, Float> calculateAnchor) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(possibleValues, "possibleValues");
        Intrinsics.checkNotNullParameter(calculateAnchor, "calculateAnchor");
        C28338c c28338c = new C28338c(state);
        C28339d c28339d = new C28339d(state, possibleValues, interfaceC20076eb, calculateAnchor);
        if (K32.m99301c()) {
            m99303a = new C28337b(state, possibleValues, interfaceC20076eb, calculateAnchor);
        } else {
            m99303a = K32.m99303a();
        }
        return interfaceC41563gV2.mo39266t0(new BW5(c28338c, c28339d, m99303a));
    }

    /* renamed from: i */
    public static /* synthetic */ InterfaceC41563gV2 m14067i(InterfaceC41563gV2 interfaceC41563gV2, C49292tX5 c49292tX5, Set set, InterfaceC20076eb interfaceC20076eb, Function2 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            interfaceC20076eb = null;
        }
        return m14068h(interfaceC41563gV2, c49292tX5, set, interfaceC20076eb, function2);
    }

    /* renamed from: j */
    public static final <T> InterfaceC41563gV2 m14066j(InterfaceC41563gV2 interfaceC41563gV2, C49292tX5<T> state, EnumC32768Ey3 orientation, boolean z, boolean z2, InterfaceC48104rX2 interfaceC48104rX2) {
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return C50819w61.m7431k(interfaceC41563gV2, state.m12121o(), orientation, z, interfaceC48104rX2, state.m12114v(), null, new C28340e(state, null), z2, 32, null);
    }

    /* renamed from: k */
    public static /* synthetic */ InterfaceC41563gV2 m14065k(InterfaceC41563gV2 interfaceC41563gV2, C49292tX5 c49292tX5, EnumC32768Ey3 enumC32768Ey3, boolean z, boolean z2, InterfaceC48104rX2 interfaceC48104rX2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = false;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            interfaceC48104rX2 = null;
        }
        return m14066j(interfaceC41563gV2, c49292tX5, enumC32768Ey3, z3, z4, interfaceC48104rX2);
    }
}
