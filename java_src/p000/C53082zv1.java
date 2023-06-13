package p000;

import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32720Et0;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"Le62;", "LsP5;", "", C17296a.f69688o, "(Le62;LEt0;I)LsP5;", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFocusInteraction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusInteraction.kt\nandroidx/compose/foundation/interaction/FocusInteractionKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,79:1\n25#2:80\n50#2:87\n49#2:88\n1114#3,6:81\n1114#3,6:89\n*S KotlinDebug\n*F\n+ 1 FocusInteraction.kt\nandroidx/compose/foundation/interaction/FocusInteractionKt\n*L\n66#1:80\n67#1:87\n67#1:88\n66#1:81,6\n67#1:89,6\n*E\n"})
/* renamed from: zv1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C53082zv1 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.foundation.interaction.FocusInteractionKt$collectIsFocusedAsState$1$1", m28418f = "FocusInteraction.kt", m28417i = {}, m28416l = {69}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: zv1$a */
    /* loaded from: classes.dex */
    public static final class C31590a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f122480h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC40148e62 f122481i;

        /* renamed from: j */
        public final /* synthetic */ EX2<Boolean> f122482j;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: zv1$a$a */
        /* loaded from: classes.dex */
        public static final class C31591a implements InterfaceC33198Gu1<InterfaceC39556d62> {

            /* renamed from: b */
            public final /* synthetic */ List<C51896xv1> f122483b;

            /* renamed from: c */
            public final /* synthetic */ EX2<Boolean> f122484c;

            public C31591a(List<C51896xv1> list, EX2<Boolean> ex2) {
                this.f122483b = list;
                this.f122484c = ex2;
            }

            @Override // p000.InterfaceC33198Gu1
            /* renamed from: c */
            public final Object emit(InterfaceC39556d62 interfaceC39556d62, Continuation<? super Unit> continuation) {
                if (interfaceC39556d62 instanceof C51896xv1) {
                    this.f122483b.add(interfaceC39556d62);
                } else if (interfaceC39556d62 instanceof C52489yv1) {
                    this.f122483b.remove(((C52489yv1) interfaceC39556d62).m2262a());
                }
                this.f122484c.setValue(Boxing.boxBoolean(!this.f122483b.isEmpty()));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31590a(InterfaceC40148e62 interfaceC40148e62, EX2<Boolean> ex2, Continuation<? super C31590a> continuation) {
            super(2, continuation);
            this.f122481i = interfaceC40148e62;
            this.f122482j = ex2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C31590a(this.f122481i, this.f122482j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C31590a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f122480h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                InterfaceC32730Eu1<InterfaceC39556d62> mo14089b = this.f122481i.mo14089b();
                C31591a c31591a = new C31591a(arrayList, this.f122482j);
                this.f122480h = 1;
                if (mo14089b.collect(c31591a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static final InterfaceC48627sP5<Boolean> m116a(InterfaceC40148e62 interfaceC40148e62, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(interfaceC40148e62, "<this>");
        interfaceC32720Et0.mo89638F(-1805515472);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1805515472, i, -1, "androidx.compose.foundation.interaction.collectIsFocusedAsState (FocusInteraction.kt:64)");
        }
        interfaceC32720Et0.mo89638F(-492369756);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        InterfaceC32720Et0.C2012a c2012a = InterfaceC32720Et0.f8257a;
        if (mo89635G == c2012a.m108267a()) {
            mo89635G = LM5.m97025e(Boolean.FALSE, null, 2, null);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        EX2 ex2 = (EX2) mo89635G;
        int i2 = i & 14;
        interfaceC32720Et0.mo89638F(511388516);
        boolean mo89539n = interfaceC32720Et0.mo89539n(interfaceC40148e62) | interfaceC32720Et0.mo89539n(ex2);
        Object mo89635G2 = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G2 == c2012a.m108267a()) {
            mo89635G2 = new C31590a(interfaceC40148e62, ex2, null);
            interfaceC32720Et0.mo89503z(mo89635G2);
        }
        interfaceC32720Et0.mo89605Q();
        Y91.m75533f(interfaceC40148e62, (Function2) mo89635G2, interfaceC32720Et0, i2 | 64);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return ex2;
    }
}
