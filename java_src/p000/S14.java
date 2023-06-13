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
@SourceDebugExtension({"SMAP\nPressInteraction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PressInteraction.kt\nandroidx/compose/foundation/interaction/PressInteractionKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,99:1\n25#2:100\n50#2:107\n49#2:108\n1114#3,6:101\n1114#3,6:109\n*S KotlinDebug\n*F\n+ 1 PressInteraction.kt\nandroidx/compose/foundation/interaction/PressInteractionKt\n*L\n85#1:100\n86#1:107\n86#1:108\n85#1:101,6\n86#1:109,6\n*E\n"})
/* renamed from: S14 */
/* loaded from: classes.dex */
public final class S14 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.foundation.interaction.PressInteractionKt$collectIsPressedAsState$1$1", m28418f = "PressInteraction.kt", m28417i = {}, m28416l = {88}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: S14$a */
    /* loaded from: classes.dex */
    public static final class C7313a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f33036h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC40148e62 f33037i;

        /* renamed from: j */
        public final /* synthetic */ EX2<Boolean> f33038j;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: S14$a$a */
        /* loaded from: classes.dex */
        public static final class C7314a implements InterfaceC33198Gu1<InterfaceC39556d62> {

            /* renamed from: b */
            public final /* synthetic */ List<Q14> f33039b;

            /* renamed from: c */
            public final /* synthetic */ EX2<Boolean> f33040c;

            public C7314a(List<Q14> list, EX2<Boolean> ex2) {
                this.f33039b = list;
                this.f33040c = ex2;
            }

            @Override // p000.InterfaceC33198Gu1
            /* renamed from: c */
            public final Object emit(InterfaceC39556d62 interfaceC39556d62, Continuation<? super Unit> continuation) {
                if (interfaceC39556d62 instanceof Q14) {
                    this.f33039b.add(interfaceC39556d62);
                } else if (interfaceC39556d62 instanceof R14) {
                    this.f33039b.remove(((R14) interfaceC39556d62).m87420a());
                } else if (interfaceC39556d62 instanceof P14) {
                    this.f33039b.remove(((P14) interfaceC39556d62).m91051a());
                }
                this.f33040c.setValue(Boxing.boxBoolean(!this.f33039b.isEmpty()));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7313a(InterfaceC40148e62 interfaceC40148e62, EX2<Boolean> ex2, Continuation<? super C7313a> continuation) {
            super(2, continuation);
            this.f33037i = interfaceC40148e62;
            this.f33038j = ex2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C7313a(this.f33037i, this.f33038j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C7313a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f33036h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                InterfaceC32730Eu1<InterfaceC39556d62> mo14089b = this.f33037i.mo14089b();
                C7314a c7314a = new C7314a(arrayList, this.f33038j);
                this.f33036h = 1;
                if (mo14089b.collect(c7314a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static final InterfaceC48627sP5<Boolean> m86094a(InterfaceC40148e62 interfaceC40148e62, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(interfaceC40148e62, "<this>");
        interfaceC32720Et0.mo89638F(-1692965168);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1692965168, i, -1, "androidx.compose.foundation.interaction.collectIsPressedAsState (PressInteraction.kt:83)");
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
            mo89635G2 = new C7313a(interfaceC40148e62, ex2, null);
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
