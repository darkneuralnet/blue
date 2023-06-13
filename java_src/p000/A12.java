package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001c\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\u000b"}, m28432d2 = {"LgV2;", "Le62;", "interactionSource", "Ly12;", "indication", "b", "LU94;", C17296a.f69688o, "LU94;", "()LU94;", "LocalIndication", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIndication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/IndicationKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,186:1\n135#2:187\n*S KotlinDebug\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/IndicationKt\n*L\n115#1:187\n*E\n"})
/* renamed from: A12 */
/* loaded from: classes.dex */
public final class A12 {

    /* renamed from: a */
    public static final U94<InterfaceC51956y12> f13a = C41806gu0.m37350d(C0003a.f14g);

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Ly12;", "b", "()Ly12;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: A12$a */
    /* loaded from: classes.dex */
    public static final class C0003a extends Lambda implements Function0<InterfaceC51956y12> {

        /* renamed from: g */
        public static final C0003a f14g = new C0003a();

        public C0003a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final InterfaceC51956y12 invoke() {
            return UW0.f37485a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Indication.kt\nandroidx/compose/foundation/IndicationKt\n*L\n1#1,170:1\n116#2,4:171\n*E\n"})
    /* renamed from: A12$b */
    /* loaded from: classes.dex */
    public static final class C0004b extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC51956y12 f15g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC40148e62 f16h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0004b(InterfaceC51956y12 interfaceC51956y12, InterfaceC40148e62 interfaceC40148e62) {
            super(1);
            this.f15g = interfaceC51956y12;
            this.f16h = interfaceC40148e62;
        }

        /* renamed from: a */
        public final void m116195a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("indication");
            s42.m86038a().m104824a("indication", this.f15g);
            s42.m86038a().m104824a("interactionSource", this.f16h);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m116195a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LgV2;", C17296a.f69688o, "(LgV2;LEt0;I)LgV2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nIndication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/IndicationKt$indication$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,186:1\n36#2:187\n1114#3,6:188\n*S KotlinDebug\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/IndicationKt$indication$2\n*L\n111#1:187\n111#1:188,6\n*E\n"})
    /* renamed from: A12$c */
    /* loaded from: classes.dex */
    public static final class C0005c extends Lambda implements Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, InterfaceC41563gV2> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC51956y12 f17g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC40148e62 f18h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0005c(InterfaceC51956y12 interfaceC51956y12, InterfaceC40148e62 interfaceC40148e62) {
            super(3);
            this.f17g = interfaceC51956y12;
            this.f18h = interfaceC40148e62;
        }

        /* renamed from: a */
        public final InterfaceC41563gV2 m116194a(InterfaceC41563gV2 composed, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            interfaceC32720Et0.mo89638F(-353972293);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-353972293, i, -1, "androidx.compose.foundation.indication.<anonymous> (Indication.kt:107)");
            }
            InterfaceC51956y12 interfaceC51956y12 = this.f17g;
            if (interfaceC51956y12 == null) {
                interfaceC51956y12 = C46099o83.f101433a;
            }
            InterfaceC52549z12 mo4237a = interfaceC51956y12.mo4237a(this.f18h, interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89638F(1157296644);
            boolean mo89539n = interfaceC32720Et0.mo89539n(mo4237a);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new B12(mo4237a);
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            B12 b12 = (B12) mo89635G;
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return b12;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC41563gV2 invoke(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return m116194a(interfaceC41563gV2, interfaceC32720Et0, num.intValue());
        }
    }

    /* renamed from: a */
    public static final U94<InterfaceC51956y12> m116198a() {
        return f13a;
    }

    /* renamed from: b */
    public static final InterfaceC41563gV2 m116197b(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC40148e62 interactionSource, InterfaceC51956y12 interfaceC51956y12) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        if (K32.m99301c()) {
            m99303a = new C0004b(interfaceC51956y12, interactionSource);
        } else {
            m99303a = K32.m99303a();
        }
        return C32486Dt0.m109808a(interfaceC41563gV2, m99303a, new C0005c(interfaceC51956y12, interactionSource));
    }
}
