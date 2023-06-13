package p000;

import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.ImageMetadata;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0014\u0010\t\u001a\u00020\u0000*\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a%\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, m28432d2 = {"", "isStartHandle", "LUL4;", "direction", "Lx16;", "manager", "", C17296a.f69688o, "(ZLUL4;Lx16;LEt0;I)V", "c", "LG52;", "magnifierSize", "LCe3;", "b", "(Lx16;J)J", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextFieldSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManagerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,906:1\n50#2:907\n49#2:908\n1114#3,6:909\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManagerKt\n*L\n809#1:907\n809#1:908\n809#1:909,6\n*E\n"})
/* renamed from: y16  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51960y16 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$1", m28418f = "TextFieldSelectionManager.kt", m28417i = {}, m28416l = {820}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: y16$a */
    /* loaded from: classes.dex */
    public static final class C30406a extends SuspendLambda implements Function2<InterfaceC49290tX3, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f118625h;

        /* renamed from: i */
        public /* synthetic */ Object f118626i;

        /* renamed from: j */
        public final /* synthetic */ Z06 f118627j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30406a(Z06 z06, Continuation<? super C30406a> continuation) {
            super(2, continuation);
            this.f118627j = z06;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C30406a c30406a = new C30406a(this.f118627j, continuation);
            c30406a.f118626i = obj;
            return c30406a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC49290tX3 interfaceC49290tX3, Continuation<? super Unit> continuation) {
            return ((C30406a) create(interfaceC49290tX3, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f118625h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Z06 z06 = this.f118627j;
                this.f118625h = 1;
                if (C44230kz2.m28050c((InterfaceC49290tX3) this.f118626i, z06, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: y16$b */
    /* loaded from: classes.dex */
    public static final class C30407b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f118628g;

        /* renamed from: h */
        public final /* synthetic */ UL4 f118629h;

        /* renamed from: i */
        public final /* synthetic */ C51367x16 f118630i;

        /* renamed from: j */
        public final /* synthetic */ int f118631j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30407b(boolean z, UL4 ul4, C51367x16 c51367x16, int i) {
            super(2);
            this.f118628g = z;
            this.f118629h = ul4;
            this.f118630i = c51367x16;
            this.f118631j = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C51960y16.m4235a(this.f118628g, this.f118629h, this.f118630i, interfaceC32720Et0, C47127ps4.m18626a(this.f118631j | 1));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: y16$c */
    /* loaded from: classes.dex */
    public /* synthetic */ class C30408c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HE1.values().length];
            try {
                iArr[HE1.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HE1.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HE1.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final void m4235a(boolean z, UL4 direction, C51367x16 manager, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(manager, "manager");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1344558920);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1344558920, i, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:803)");
        }
        Boolean valueOf = Boolean.valueOf(z);
        mo89518u.mo89638F(511388516);
        boolean mo89539n = mo89518u.mo89539n(valueOf) | mo89518u.mo89539n(manager);
        Object mo89635G = mo89518u.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = manager.m5972I(z);
            mo89518u.mo89503z(mo89635G);
        }
        mo89518u.mo89605Q();
        Z06 z06 = (Z06) mo89635G;
        int i2 = i << 3;
        C5037Ld.m96548c(manager.m5927z(z), z, direction, C48413s26.m14833m(manager.m5973H().m108103g()), C52840zW5.m1270c(InterfaceC41563gV2.f82354b0, z06, new C30406a(z06, null)), null, mo89518u, (i2 & 112) | ImageMetadata.EDGE_MODE | (i2 & 896));
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C30407b(z, direction, manager, i));
        }
    }

    /* renamed from: b */
    public static final long m4234b(C51367x16 manager, long j) {
        boolean z;
        int i;
        int m14832n;
        C43077j26 m112989g;
        C42484i26 m31225i;
        T06 m112978r;
        C1577Df m84434l;
        IntRange indices;
        int coerceIn;
        InterfaceC45879nm2 m112990f;
        C43077j26 m112989g2;
        InterfaceC45879nm2 m31231c;
        boolean z2;
        float coerceIn2;
        Intrinsics.checkNotNullParameter(manager, "manager");
        if (manager.m5973H().m108102h().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C32120Ce3.f4427b.m111933b();
        }
        HE1 m5930w = manager.m5930w();
        if (m5930w == null) {
            i = -1;
        } else {
            i = C30408c.$EnumSwitchMapping$0[m5930w.ordinal()];
        }
        if (i != -1) {
            if (i != 1 && i != 2) {
                if (i == 3) {
                    m14832n = C48413s26.m14837i(manager.m5973H().m108103g());
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                m14832n = C48413s26.m14832n(manager.m5973H().m108103g());
            }
            int originalToTransformed = manager.m5978C().originalToTransformed(m14832n);
            C16 m5976E = manager.m5976E();
            if (m5976E != null && (m112989g = m5976E.m112989g()) != null && (m31225i = m112989g.m31225i()) != null) {
                C16 m5976E2 = manager.m5976E();
                if (m5976E2 != null && (m112978r = m5976E2.m112978r()) != null && (m84434l = m112978r.m84434l()) != null) {
                    indices = StringsKt__StringsKt.getIndices(m84434l);
                    coerceIn = RangesKt___RangesKt.coerceIn(originalToTransformed, (ClosedRange<Integer>) indices);
                    long m91260g = m31225i.m34605c(coerceIn).m91260g();
                    C16 m5976E3 = manager.m5976E();
                    if (m5976E3 != null && (m112990f = m5976E3.m112990f()) != null) {
                        C16 m5976E4 = manager.m5976E();
                        if (m5976E4 != null && (m112989g2 = m5976E4.m112989g()) != null && (m31231c = m112989g2.m31231c()) != null) {
                            C32120Ce3 m5932u = manager.m5932u();
                            if (m5932u != null) {
                                float m111944o = C32120Ce3.m111944o(m31231c.mo23187X(m112990f, m5932u.m111935x()));
                                int m34592p = m31225i.m34592p(coerceIn);
                                int m34588t = m31225i.m34588t(m34592p);
                                int m34594n = m31225i.m34594n(m34592p, true);
                                if (C48413s26.m14832n(manager.m5973H().m108103g()) > C48413s26.m14837i(manager.m5973H().m108103g())) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                float m111021a = D26.m111021a(m31225i, m34588t, true, z2);
                                float m111021a2 = D26.m111021a(m31225i, m34594n, false, z2);
                                coerceIn2 = RangesKt___RangesKt.coerceIn(m111944o, Math.min(m111021a, m111021a2), Math.max(m111021a, m111021a2));
                                if (Math.abs(m111944o - coerceIn2) > G52.m105829g(j) / 2) {
                                    return C32120Ce3.f4427b.m111933b();
                                }
                                return m112990f.mo23187X(m31231c, C33056Ge3.m104938a(coerceIn2, C32120Ce3.m111943p(m91260g)));
                            }
                            return C32120Ce3.f4427b.m111933b();
                        }
                        return C32120Ce3.f4427b.m111933b();
                    }
                    return C32120Ce3.f4427b.m111933b();
                }
                return C32120Ce3.f4427b.m111933b();
            }
            return C32120Ce3.f4427b.m111933b();
        }
        return C32120Ce3.f4427b.m111933b();
    }

    /* renamed from: c */
    public static final boolean m4233c(C51367x16 c51367x16, boolean z) {
        InterfaceC45879nm2 m112990f;
        C35055Os4 m80741b;
        Intrinsics.checkNotNullParameter(c51367x16, "<this>");
        C16 m5976E = c51367x16.m5976E();
        if (m5976E != null && (m112990f = m5976E.m112990f()) != null && (m80741b = C36451Ur5.m80741b(m112990f)) != null) {
            return C36451Ur5.m80742a(m80741b, c51367x16.m5927z(z));
        }
        return false;
    }
}
