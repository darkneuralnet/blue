package p000;

import android.annotation.SuppressLint;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32720Et0;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0014\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\"\u0018\u0010\b\u001a\u00020\u0005*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m28432d2 = {"LgV2;", "Lx16;", "manager", "b", "LYW3;", "", C17296a.f69688o, "(LYW3;)Z", "isShiftPressed", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: z16  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52553z16 {

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LgV2;", "c", "(LgV2;LEt0;I)LgV2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTextFieldSelectionManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.android.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager_androidKt$textFieldMagnifier$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,68:1\n76#2:69\n25#3:70\n50#3:77\n49#3:78\n1114#4,6:71\n1114#4,6:79\n76#5:85\n102#5,2:86\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.android.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager_androidKt$textFieldMagnifier$1\n*L\n47#1:69\n48#1:70\n53#1:77\n53#1:78\n48#1:71,6\n53#1:79,6\n48#1:85\n48#1:86,2\n*E\n"})
    /* renamed from: z16$a */
    /* loaded from: classes.dex */
    public static final class C30869a extends Lambda implements Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, InterfaceC41563gV2> {

        /* renamed from: g */
        public final /* synthetic */ C51367x16 f120620g;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: z16$a$a */
        /* loaded from: classes.dex */
        public static final class C30870a extends Lambda implements Function0<C32120Ce3> {

            /* renamed from: g */
            public final /* synthetic */ C51367x16 f120621g;

            /* renamed from: h */
            public final /* synthetic */ EX2<G52> f120622h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30870a(C51367x16 c51367x16, EX2<G52> ex2) {
                super(0);
                this.f120621g = c51367x16;
                this.f120622h = ex2;
            }

            /* renamed from: b */
            public final long m2006b() {
                return C51960y16.m4234b(this.f120621g, C30869a.m2008d(this.f120622h));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ C32120Ce3 invoke() {
                return C32120Ce3.m111955d(m2006b());
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: z16$a$b */
        /* loaded from: classes.dex */
        public static final class C30871b extends Lambda implements Function1<Function0<? extends C32120Ce3>, InterfaceC41563gV2> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC41273g01 f120623g;

            /* renamed from: h */
            public final /* synthetic */ EX2<G52> f120624h;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: z16$a$b$a */
            /* loaded from: classes.dex */
            public static final class C30872a extends Lambda implements Function1<InterfaceC41273g01, C32120Ce3> {

                /* renamed from: g */
                public final /* synthetic */ Function0<C32120Ce3> f120625g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C30872a(Function0<C32120Ce3> function0) {
                    super(1);
                    this.f120625g = function0;
                }

                /* renamed from: a */
                public final long m2004a(InterfaceC41273g01 magnifier) {
                    Intrinsics.checkNotNullParameter(magnifier, "$this$magnifier");
                    return this.f120625g.invoke().m111935x();
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ C32120Ce3 invoke(InterfaceC41273g01 interfaceC41273g01) {
                    return C32120Ce3.m111955d(m2004a(interfaceC41273g01));
                }
            }

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: z16$a$b$b */
            /* loaded from: classes.dex */
            public static final class C30873b extends Lambda implements Function1<C46077o61, Unit> {

                /* renamed from: g */
                public final /* synthetic */ InterfaceC41273g01 f120626g;

                /* renamed from: h */
                public final /* synthetic */ EX2<G52> f120627h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C30873b(InterfaceC41273g01 interfaceC41273g01, EX2<G52> ex2) {
                    super(1);
                    this.f120626g = interfaceC41273g01;
                    this.f120627h = ex2;
                }

                /* renamed from: a */
                public final void m2003a(long j) {
                    EX2<G52> ex2 = this.f120627h;
                    InterfaceC41273g01 interfaceC41273g01 = this.f120626g;
                    C30869a.m2007e(ex2, H52.m104430a(interfaceC41273g01.mo3416F0(C46077o61.m21788h(j)), interfaceC41273g01.mo3416F0(C46077o61.m21789g(j))));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C46077o61 c46077o61) {
                    m2003a(c46077o61.m21785k());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30871b(InterfaceC41273g01 interfaceC41273g01, EX2<G52> ex2) {
                super(1);
                this.f120623g = interfaceC41273g01;
                this.f120624h = ex2;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC41563gV2 invoke(Function0<C32120Ce3> center) {
                Intrinsics.checkNotNullParameter(center, "center");
                return ZF2.m73512f(InterfaceC41563gV2.f82354b0, new C30872a(center), null, 0.0f, C37853aG2.f50192g.m71723b(), new C30873b(this.f120623g, this.f120624h), 6, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30869a(C51367x16 c51367x16) {
            super(3);
            this.f120620g = c51367x16;
        }

        /* renamed from: d */
        public static final long m2008d(EX2<G52> ex2) {
            return ex2.getValue().m105826j();
        }

        /* renamed from: e */
        public static final void m2007e(EX2<G52> ex2, long j) {
            ex2.setValue(G52.m105834b(j));
        }

        /* renamed from: c */
        public final InterfaceC41563gV2 m2009c(InterfaceC41563gV2 composed, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            interfaceC32720Et0.mo89638F(1980580247);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1980580247, i, -1, "androidx.compose.foundation.text.selection.textFieldMagnifier.<anonymous> (TextFieldSelectionManager.android.kt:45)");
            }
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            InterfaceC32720Et0.C2012a c2012a = InterfaceC32720Et0.f8257a;
            if (mo89635G == c2012a.m108267a()) {
                mo89635G = LM5.m97025e(G52.m105834b(G52.f10893b.m105825a()), null, 2, null);
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            EX2 ex2 = (EX2) mo89635G;
            C30870a c30870a = new C30870a(this.f120620g, ex2);
            interfaceC32720Et0.mo89638F(511388516);
            boolean mo89539n = interfaceC32720Et0.mo89539n(ex2) | interfaceC32720Et0.mo89539n(interfaceC41273g01);
            Object mo89635G2 = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G2 == c2012a.m108267a()) {
                mo89635G2 = new C30871b(interfaceC41273g01, ex2);
                interfaceC32720Et0.mo89503z(mo89635G2);
            }
            interfaceC32720Et0.mo89605Q();
            InterfaceC41563gV2 m82344g = C36217Tr5.m82344g(composed, c30870a, (Function1) mo89635G2);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return m82344g;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC41563gV2 invoke(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return m2009c(interfaceC41563gV2, interfaceC32720Et0, num.intValue());
        }
    }

    /* renamed from: a */
    public static final boolean m2013a(YW3 yw3) {
        Intrinsics.checkNotNullParameter(yw3, "<this>");
        return false;
    }

    @SuppressLint({"ModifierInspectorInfo"})
    /* renamed from: b */
    public static final InterfaceC41563gV2 m2012b(InterfaceC41563gV2 interfaceC41563gV2, C51367x16 manager) {
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(manager, "manager");
        if (!C37853aG2.f50192g.m71723b().m71725i()) {
            return interfaceC41563gV2;
        }
        return C32486Dt0.m109807b(interfaceC41563gV2, null, new C30869a(manager), 1, null);
    }
}
