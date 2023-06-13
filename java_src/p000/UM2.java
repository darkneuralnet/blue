package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a;\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m28432d2 = {"LMm0;", "colors", "LGc6;", "typography", "LDy5;", "shapes", "Lkotlin/Function0;", "", "content", C17296a.f69688o, "(LMm0;LGc6;LDy5;Lkotlin/jvm/functions/Function2;LEt0;II)V", "material_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMaterialTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material/MaterialThemeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n25#2:140\n1114#3,6:141\n1#4:147\n*S KotlinDebug\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material/MaterialThemeKt\n*L\n65#1:140\n65#1:141,6\n*E\n"})
/* renamed from: UM2 */
/* loaded from: classes.dex */
public final class UM2 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: UM2$a */
    /* loaded from: classes.dex */
    public static final class C8265a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C33041Gc6 f37285g;

        /* renamed from: h */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f37286h;

        /* renamed from: i */
        public final /* synthetic */ int f37287i;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: UM2$a$a */
        /* loaded from: classes.dex */
        public static final class C8266a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

            /* renamed from: g */
            public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f37288g;

            /* renamed from: h */
            public final /* synthetic */ int f37289h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C8266a(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i) {
                super(2);
                this.f37288g = function2;
                this.f37289h = i;
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
                    C35528Qt0.m87816Z(181426554, i, -1, "androidx.compose.material.MaterialTheme.<anonymous>.<anonymous> (MaterialTheme.kt:80)");
                }
                WM2.m78534a(this.f37288g, interfaceC32720Et0, (this.f37289h >> 9) & 14);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8265a(C33041Gc6 c33041Gc6, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i) {
            super(2);
            this.f37285g = c33041Gc6;
            this.f37286h = function2;
            this.f37287i = i;
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
                C35528Qt0.m87816Z(-1740102967, i, -1, "androidx.compose.material.MaterialTheme.<anonymous> (MaterialTheme.kt:79)");
            }
            C38909c26.m62004a(this.f37285g.m104965c(), C43575jt0.m29791b(interfaceC32720Et0, 181426554, true, new C8266a(this.f37286h, this.f37287i)), interfaceC32720Et0, 48);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: UM2$b */
    /* loaded from: classes.dex */
    public static final class C8267b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C34529Mm0 f37290g;

        /* renamed from: h */
        public final /* synthetic */ C33041Gc6 f37291h;

        /* renamed from: i */
        public final /* synthetic */ C32536Dy5 f37292i;

        /* renamed from: j */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f37293j;

        /* renamed from: k */
        public final /* synthetic */ int f37294k;

        /* renamed from: l */
        public final /* synthetic */ int f37295l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8267b(C34529Mm0 c34529Mm0, C33041Gc6 c33041Gc6, C32536Dy5 c32536Dy5, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i, int i2) {
            super(2);
            this.f37290g = c34529Mm0;
            this.f37291h = c33041Gc6;
            this.f37292i = c32536Dy5;
            this.f37293j = function2;
            this.f37294k = i;
            this.f37295l = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            UM2.m81596a(this.f37290g, this.f37291h, this.f37292i, this.f37293j, interfaceC32720Et0, C47127ps4.m18626a(this.f37294k | 1), this.f37295l);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ae, code lost:
        if ((r50 & 4) != 0) goto L60;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m81596a(C34529Mm0 c34529Mm0, C33041Gc6 c33041Gc6, C32536Dy5 c32536Dy5, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        C34529Mm0 c34529Mm02;
        int i3;
        C33041Gc6 c33041Gc62;
        C32536Dy5 c32536Dy52;
        int i4;
        C32536Dy5 c32536Dy53;
        C33041Gc6 c33041Gc63;
        int i5;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-891417079);
        if ((i & 14) == 0) {
            if ((i2 & 1) == 0) {
                c34529Mm02 = c34529Mm0;
                if (mo89518u.mo89539n(c34529Mm02)) {
                    i7 = 4;
                    i3 = i7 | i;
                }
            } else {
                c34529Mm02 = c34529Mm0;
            }
            i7 = 2;
            i3 = i7 | i;
        } else {
            c34529Mm02 = c34529Mm0;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                c33041Gc62 = c33041Gc6;
                if (mo89518u.mo89539n(c33041Gc62)) {
                    i6 = 32;
                    i3 |= i6;
                }
            } else {
                c33041Gc62 = c33041Gc6;
            }
            i6 = 16;
            i3 |= i6;
        } else {
            c33041Gc62 = c33041Gc6;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                c32536Dy52 = c32536Dy5;
                if (mo89518u.mo89539n(c32536Dy52)) {
                    i5 = 256;
                    i3 |= i5;
                }
            } else {
                c32536Dy52 = c32536Dy5;
            }
            i5 = 128;
            i3 |= i5;
        } else {
            c32536Dy52 = c32536Dy5;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (mo89518u.mo89629I(content)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 5851) == 1170 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
            c33041Gc63 = c33041Gc62;
            c32536Dy53 = c32536Dy52;
        } else {
            mo89518u.mo89626J();
            if ((i & 1) != 0 && !mo89518u.mo89545l()) {
                mo89518u.mo89548k();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
            } else {
                if ((i2 & 1) != 0) {
                    c34529Mm02 = TM2.f35372a.m83731a(mo89518u, 6);
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    c33041Gc62 = TM2.f35372a.m83729c(mo89518u, 6);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    c32536Dy52 = TM2.f35372a.m83730b(mo89518u, 6);
                    i3 &= -897;
                }
                int i8 = i3;
                Object obj = c33041Gc62;
                Object obj2 = c32536Dy52;
                mo89518u.mo89650B();
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-891417079, i8, -1, "androidx.compose.material.MaterialTheme (MaterialTheme.kt:58)");
                }
                mo89518u.mo89638F(-492369756);
                Object mo89635G = mo89518u.mo89635G();
                if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                    mo89635G = r15.m94909a((r43 & 1) != 0 ? r15.m94900j() : 0L, (r43 & 2) != 0 ? r15.m94899k() : 0L, (r43 & 4) != 0 ? r15.m94898l() : 0L, (r43 & 8) != 0 ? r15.m94897m() : 0L, (r43 & 16) != 0 ? r15.m94907c() : 0L, (r43 & 32) != 0 ? r15.m94896n() : 0L, (r43 & 64) != 0 ? r15.m94906d() : 0L, (r43 & 128) != 0 ? r15.m94903g() : 0L, (r43 & 256) != 0 ? r15.m94902h() : 0L, (r43 & 512) != 0 ? r15.m94905e() : 0L, (r43 & 1024) != 0 ? r15.m94901i() : 0L, (r43 & 2048) != 0 ? r15.m94904f() : 0L, (r43 & 4096) != 0 ? c34529Mm02.m94895o() : false);
                    mo89518u.mo89503z(mo89635G);
                }
                mo89518u.mo89605Q();
                C34529Mm0 c34529Mm03 = (C34529Mm0) mo89635G;
                C34763Nm0.m93461i(c34529Mm03, c34529Mm02);
                c32536Dy53 = obj2;
                c33041Gc63 = obj;
                C41806gu0.m37353a(new W94[]{C34763Nm0.m93465e().m81907c(c34529Mm03), C37220Xz0.m75931a().m81907c(Float.valueOf(C36986Wz0.f42427a.m77587c(mo89518u, 6))), A12.m116198a().m81907c(C51107wb5.m6605e(false, 0.0f, 0L, mo89518u, 0, 7)), C52293yb5.m3198d().m81907c(OM2.f26430b), C32770Ey5.m108167a().m81907c(c32536Dy53), C26.m112949b().m81907c(SM2.m85696e(c34529Mm03, mo89518u, 0)), C33275Hc6.m103653b().m81907c(c33041Gc63)}, C43575jt0.m29791b(mo89518u, -1740102967, true, new C8265a(c33041Gc63, content, i8)), mo89518u, 56);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C8267b(c34529Mm02, c33041Gc63, c32536Dy53, content, i, i2));
        }
    }
}
