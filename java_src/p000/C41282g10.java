package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aF\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m28432d2 = {"LgV2;", "modifier", "LK9;", "contentAlignment", "", "propagateMinConstraints", "Lkotlin/Function1;", "Lh10;", "", "Lkotlin/ExtensionFunctionType;", "content", C17296a.f69688o, "(LgV2;LK9;ZLkotlin/jvm/functions/Function3;LEt0;II)V", "foundation-layout_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBoxWithConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,124:1\n50#2:125\n49#2:126\n1057#3,6:127\n*S KotlinDebug\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsKt\n*L\n67#1:125\n67#1:126\n67#1:127,6\n*E\n"})
/* renamed from: g10  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41282g10 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nBoxWithConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsKt$BoxWithConstraints$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"})
    /* renamed from: g10$a */
    /* loaded from: classes.dex */
    public static final class C20685a extends Lambda implements Function2<InterfaceC37973aT5, C44228kz0, InterfaceC52172yO2> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC51579xO2 f81316g;

        /* renamed from: h */
        public final /* synthetic */ Function3<InterfaceC41875h10, InterfaceC32720Et0, Integer, Unit> f81317h;

        /* renamed from: i */
        public final /* synthetic */ int f81318i;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: g10$a$a */
        /* loaded from: classes.dex */
        public static final class C20686a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

            /* renamed from: g */
            public final /* synthetic */ Function3<InterfaceC41875h10, InterfaceC32720Et0, Integer, Unit> f81319g;

            /* renamed from: h */
            public final /* synthetic */ C42468i10 f81320h;

            /* renamed from: i */
            public final /* synthetic */ int f81321i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C20686a(Function3<? super InterfaceC41875h10, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, C42468i10 c42468i10, int i) {
                super(2);
                this.f81319g = function3;
                this.f81320h = c42468i10;
                this.f81321i = i;
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
                    C35528Qt0.m87816Z(-1945019079, i, -1, "androidx.compose.foundation.layout.BoxWithConstraints.<anonymous>.<anonymous>.<anonymous> (BoxWithConstraints.kt:68)");
                }
                this.f81319g.invoke(this.f81320h, interfaceC32720Et0, Integer.valueOf((this.f81321i >> 6) & 112));
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C20685a(InterfaceC51579xO2 interfaceC51579xO2, Function3<? super InterfaceC41875h10, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, int i) {
            super(2);
            this.f81316g = interfaceC51579xO2;
            this.f81317h = function3;
            this.f81318i = i;
        }

        /* renamed from: a */
        public final InterfaceC52172yO2 m40326a(InterfaceC37973aT5 SubcomposeLayout, long j) {
            Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
            return this.f81316g.mo3160a(SubcomposeLayout, SubcomposeLayout.mo71334q0(Unit.INSTANCE, C43575jt0.m29790c(-1945019079, true, new C20686a(this.f81317h, new C42468i10(SubcomposeLayout, j, null), this.f81318i))), j);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ InterfaceC52172yO2 invoke(InterfaceC37973aT5 interfaceC37973aT5, C44228kz0 c44228kz0) {
            return m40326a(interfaceC37973aT5, c44228kz0.m28058s());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: g10$b */
    /* loaded from: classes.dex */
    public static final class C20687b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC41563gV2 f81322g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC4360K9 f81323h;

        /* renamed from: i */
        public final /* synthetic */ boolean f81324i;

        /* renamed from: j */
        public final /* synthetic */ Function3<InterfaceC41875h10, InterfaceC32720Et0, Integer, Unit> f81325j;

        /* renamed from: k */
        public final /* synthetic */ int f81326k;

        /* renamed from: l */
        public final /* synthetic */ int f81327l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C20687b(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC4360K9 interfaceC4360K9, boolean z, Function3<? super InterfaceC41875h10, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, int i, int i2) {
            super(2);
            this.f81322g = interfaceC41563gV2;
            this.f81323h = interfaceC4360K9;
            this.f81324i = z;
            this.f81325j = function3;
            this.f81326k = i;
            this.f81327l = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C41282g10.m40327a(this.f81322g, this.f81323h, this.f81324i, this.f81325j, interfaceC32720Et0, this.f81326k | 1, this.f81327l);
        }
    }

    /* renamed from: a */
    public static final void m40327a(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC4360K9 interfaceC4360K9, boolean z, Function3<? super InterfaceC41875h10, ? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1781813501);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89539n(interfaceC41563gV2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (mo89518u.mo89539n(interfaceC4360K9)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (mo89518u.mo89536o(z)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (mo89518u.mo89539n(content)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i3 & 5851) == 1170 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (i8 != 0) {
                interfaceC41563gV2 = InterfaceC41563gV2.f82354b0;
            }
            if (i9 != 0) {
                interfaceC4360K9 = InterfaceC4360K9.f19170a.m99132n();
            }
            if (i10 != 0) {
                z = false;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1781813501, i3, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:58)");
            }
            int i11 = i3 >> 3;
            InterfaceC51579xO2 m44729h = C39504d10.m44729h(interfaceC4360K9, z, mo89518u, (i11 & 112) | (i11 & 14));
            mo89518u.mo89638F(511388516);
            boolean mo89539n = mo89518u.mo89539n(content) | mo89518u.mo89539n(m44729h);
            Object mo89635G = mo89518u.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new C20685a(m44729h, content, i3);
                mo89518u.mo89503z(mo89635G);
            }
            mo89518u.mo89605Q();
            YS5.m75010a(interfaceC41563gV2, (Function2) mo89635G, mo89518u, i3 & 14, 0);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC41563gV2 interfaceC41563gV22 = interfaceC41563gV2;
        InterfaceC4360K9 interfaceC4360K92 = interfaceC4360K9;
        boolean z2 = z;
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C20687b(interfaceC41563gV22, interfaceC4360K92, z2, content, i, i2));
        }
    }
}
