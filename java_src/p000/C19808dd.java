package p000;

import androidx.compose.p003ui.graphics.C11333f;
import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.ImageMetadata;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.InterfaceC32720Et0;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ab\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, m28432d2 = {"", "expanded", "Lkotlin/Function0;", "", "onDismissRequest", "LgV2;", "modifier", "Ln61;", "offset", "LAY3;", "properties", "Lkotlin/Function1;", "LPm0;", "Lkotlin/ExtensionFunctionType;", "content", C17296a.f69688o, "(ZLkotlin/jvm/functions/Function0;LgV2;JLAY3;Lkotlin/jvm/functions/Function3;LEt0;II)V", "material_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidMenu.android.kt\nandroidx/compose/material/AndroidMenu_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,145:1\n154#2:146\n25#3:147\n25#3:154\n36#3:162\n25#3:169\n1114#4,6:148\n1114#4,6:155\n1114#4,6:163\n1114#4,6:170\n76#5:161\n*S KotlinDebug\n*F\n+ 1 AndroidMenu.android.kt\nandroidx/compose/material/AndroidMenu_androidKt\n*L\n78#1:146\n82#1:147\n86#1:154\n91#1:162\n133#1:169\n82#1:148,6\n86#1:155,6\n91#1:163,6\n133#1:170,6\n87#1:161\n*E\n"})
/* renamed from: dd */
/* loaded from: classes.dex */
public final class C19808dd {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: dd$a */
    /* loaded from: classes.dex */
    public static final class C19809a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ KX2<Boolean> f76889g;

        /* renamed from: h */
        public final /* synthetic */ EX2<C11333f> f76890h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC41563gV2 f76891i;

        /* renamed from: j */
        public final /* synthetic */ Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> f76892j;

        /* renamed from: k */
        public final /* synthetic */ int f76893k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C19809a(KX2<Boolean> kx2, EX2<C11333f> ex2, InterfaceC41563gV2 interfaceC41563gV2, Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, int i) {
            super(2);
            this.f76889g = kx2;
            this.f76890h = ex2;
            this.f76891i = interfaceC41563gV2;
            this.f76892j = function3;
            this.f76893k = i;
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
                C35528Qt0.m87816Z(79632374, i, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:98)");
            }
            KX2<Boolean> kx2 = this.f76889g;
            EX2<C11333f> ex2 = this.f76890h;
            InterfaceC41563gV2 interfaceC41563gV2 = this.f76891i;
            Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> function3 = this.f76892j;
            int i2 = this.f76893k;
            C48041rQ2.m15986a(kx2, ex2, interfaceC41563gV2, function3, interfaceC32720Et0, KX2.f19719d | 48 | (i2 & 896) | ((i2 >> 6) & 7168), 0);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: dd$b */
    /* loaded from: classes.dex */
    public static final class C19810b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f76894g;

        /* renamed from: h */
        public final /* synthetic */ Function0<Unit> f76895h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC41563gV2 f76896i;

        /* renamed from: j */
        public final /* synthetic */ long f76897j;

        /* renamed from: k */
        public final /* synthetic */ AY3 f76898k;

        /* renamed from: l */
        public final /* synthetic */ Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> f76899l;

        /* renamed from: m */
        public final /* synthetic */ int f76900m;

        /* renamed from: n */
        public final /* synthetic */ int f76901n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C19810b(boolean z, Function0<Unit> function0, InterfaceC41563gV2 interfaceC41563gV2, long j, AY3 ay3, Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, int i, int i2) {
            super(2);
            this.f76894g = z;
            this.f76895h = function0;
            this.f76896i = interfaceC41563gV2;
            this.f76897j = j;
            this.f76898k = ay3;
            this.f76899l = function3;
            this.f76900m = i;
            this.f76901n = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C19808dd.m44013a(this.f76894g, this.f76895h, this.f76896i, this.f76897j, this.f76898k, this.f76899l, interfaceC32720Et0, C47127ps4.m18626a(this.f76900m | 1), this.f76901n);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: dd$c */
    /* loaded from: classes.dex */
    public static final class C19811c extends Lambda implements Function2<D52, D52, Unit> {

        /* renamed from: g */
        public final /* synthetic */ EX2<C11333f> f76902g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19811c(EX2<C11333f> ex2) {
            super(2);
            this.f76902g = ex2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(D52 d52, D52 d522) {
            invoke2(d52, d522);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(D52 parentBounds, D52 menuBounds) {
            Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
            Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
            this.f76902g.setValue(C11333f.m68635b(C48041rQ2.m15981f(parentBounds, menuBounds)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e3  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m44013a(boolean z, Function0<Unit> onDismissRequest, InterfaceC41563gV2 interfaceC41563gV2, long j, AY3 ay3, Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Object obj;
        int i6;
        int i7;
        long j2;
        int i8;
        int i9;
        Object obj2;
        int i10;
        int i11;
        int i12;
        InterfaceC41563gV2.C20912a c20912a;
        Object mo89635G;
        InterfaceC32720Et0.C2012a c2012a;
        KX2 kx2;
        Object mo89635G2;
        boolean mo89539n;
        Object mo89635G3;
        long j3;
        AY3 ay32;
        InterfaceC41563gV2 interfaceC41563gV22;
        InterfaceC36874Wm5 mo89512w;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-840283139);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89536o(z)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (mo89518u.mo89629I(onDismissRequest)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i13 = i2 & 4;
        if (i13 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = interfaceC41563gV2;
            if (mo89518u.mo89539n(obj)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
            i7 = i2 & 8;
            if (i7 == 0) {
                i3 |= 3072;
                j2 = j;
            } else {
                j2 = j;
                if ((i & 7168) == 0) {
                    if (mo89518u.mo89524s(j2)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i3 |= i8;
                }
            }
            i9 = i2 & 16;
            if (i9 == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                obj2 = ay3;
                if (mo89518u.mo89539n(obj2)) {
                    i10 = 16384;
                } else {
                    i10 = 8192;
                }
                i3 |= i10;
                if ((i2 & 32) != 0) {
                    i11 = ImageMetadata.EDGE_MODE;
                } else {
                    if ((458752 & i) == 0) {
                        if (mo89518u.mo89629I(content)) {
                            i11 = DateUtils.FORMAT_NUMERIC_DATE;
                        } else {
                            i11 = 65536;
                        }
                    }
                    i12 = i3;
                    if ((374491 & i12) != 74898 && mo89518u.mo89575b()) {
                        mo89518u.mo89548k();
                        interfaceC41563gV22 = obj;
                        j3 = j2;
                        ay32 = obj2;
                    } else {
                        if (i13 == 0) {
                            c20912a = InterfaceC41563gV2.f82354b0;
                        } else {
                            c20912a = obj;
                        }
                        if (i7 != 0) {
                            float f = 0;
                            j2 = C44891m61.m26346a(C43705k61.m29303g(f), C43705k61.m29303g(f));
                        }
                        if (i9 != 0) {
                            obj2 = new AY3(true, false, false, null, false, false, 62, null);
                        }
                        if (C35528Qt0.m87827O()) {
                            C35528Qt0.m87816Z(-840283139, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:73)");
                        }
                        mo89518u.mo89638F(-492369756);
                        mo89635G = mo89518u.mo89635G();
                        c2012a = InterfaceC32720Et0.f8257a;
                        if (mo89635G == c2012a.m108267a()) {
                            mo89635G = new KX2(Boolean.FALSE);
                            mo89518u.mo89503z(mo89635G);
                        }
                        mo89518u.mo89605Q();
                        kx2 = (KX2) mo89635G;
                        kx2.m98795e(Boolean.valueOf(z));
                        if (!((Boolean) kx2.m98799a()).booleanValue() || ((Boolean) kx2.m98798b()).booleanValue()) {
                            mo89518u.mo89638F(-492369756);
                            mo89635G2 = mo89518u.mo89635G();
                            if (mo89635G2 == c2012a.m108267a()) {
                                mo89635G2 = LM5.m97025e(C11333f.m68635b(C11333f.f53066b.m68626a()), null, 2, null);
                                mo89518u.mo89503z(mo89635G2);
                            }
                            mo89518u.mo89605Q();
                            EX2 ex2 = (EX2) mo89635G2;
                            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                            mo89518u.mo89638F(1157296644);
                            mo89539n = mo89518u.mo89539n(ex2);
                            mo89635G3 = mo89518u.mo89635G();
                            if (!mo89539n || mo89635G3 == c2012a.m108267a()) {
                                mo89635G3 = new C19811c(ex2);
                                mo89518u.mo89503z(mo89635G3);
                            }
                            mo89518u.mo89605Q();
                            C30242xd.m4931a(new C40760f81(j2, interfaceC41273g01, (Function2) mo89635G3, null), onDismissRequest, obj2, C43575jt0.m29791b(mo89518u, 79632374, true, new C19809a(kx2, ex2, c20912a, content, i12)), mo89518u, (i12 & 112) | 3072 | ((i12 >> 6) & 896), 0);
                        }
                        if (C35528Qt0.m87827O()) {
                            C35528Qt0.m87817Y();
                        }
                        j3 = j2;
                        ay32 = obj2;
                        interfaceC41563gV22 = c20912a;
                    }
                    mo89512w = mo89518u.mo89512w();
                    if (mo89512w == null) {
                        mo89512w.mo20405a(new C19810b(z, onDismissRequest, interfaceC41563gV22, j3, ay32, content, i, i2));
                        return;
                    }
                    return;
                }
                i3 |= i11;
                i12 = i3;
                if ((374491 & i12) != 74898) {
                }
                if (i13 == 0) {
                }
                if (i7 != 0) {
                }
                if (i9 != 0) {
                }
                if (C35528Qt0.m87827O()) {
                }
                mo89518u.mo89638F(-492369756);
                mo89635G = mo89518u.mo89635G();
                c2012a = InterfaceC32720Et0.f8257a;
                if (mo89635G == c2012a.m108267a()) {
                }
                mo89518u.mo89605Q();
                kx2 = (KX2) mo89635G;
                kx2.m98795e(Boolean.valueOf(z));
                if (!((Boolean) kx2.m98799a()).booleanValue()) {
                }
                mo89518u.mo89638F(-492369756);
                mo89635G2 = mo89518u.mo89635G();
                if (mo89635G2 == c2012a.m108267a()) {
                }
                mo89518u.mo89605Q();
                EX2 ex22 = (EX2) mo89635G2;
                InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                mo89518u.mo89638F(1157296644);
                mo89539n = mo89518u.mo89539n(ex22);
                mo89635G3 = mo89518u.mo89635G();
                if (!mo89539n) {
                }
                mo89635G3 = new C19811c(ex22);
                mo89518u.mo89503z(mo89635G3);
                mo89518u.mo89605Q();
                C30242xd.m4931a(new C40760f81(j2, interfaceC41273g012, (Function2) mo89635G3, null), onDismissRequest, obj2, C43575jt0.m29791b(mo89518u, 79632374, true, new C19809a(kx2, ex22, c20912a, content, i12)), mo89518u, (i12 & 112) | 3072 | ((i12 >> 6) & 896), 0);
                if (C35528Qt0.m87827O()) {
                }
                j3 = j2;
                ay32 = obj2;
                interfaceC41563gV22 = c20912a;
                mo89512w = mo89518u.mo89512w();
                if (mo89512w == null) {
                }
            }
            obj2 = ay3;
            if ((i2 & 32) != 0) {
            }
            i3 |= i11;
            i12 = i3;
            if ((374491 & i12) != 74898) {
            }
            if (i13 == 0) {
            }
            if (i7 != 0) {
            }
            if (i9 != 0) {
            }
            if (C35528Qt0.m87827O()) {
            }
            mo89518u.mo89638F(-492369756);
            mo89635G = mo89518u.mo89635G();
            c2012a = InterfaceC32720Et0.f8257a;
            if (mo89635G == c2012a.m108267a()) {
            }
            mo89518u.mo89605Q();
            kx2 = (KX2) mo89635G;
            kx2.m98795e(Boolean.valueOf(z));
            if (!((Boolean) kx2.m98799a()).booleanValue()) {
            }
            mo89518u.mo89638F(-492369756);
            mo89635G2 = mo89518u.mo89635G();
            if (mo89635G2 == c2012a.m108267a()) {
            }
            mo89518u.mo89605Q();
            EX2 ex222 = (EX2) mo89635G2;
            InterfaceC41273g01 interfaceC41273g0122 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            mo89518u.mo89638F(1157296644);
            mo89539n = mo89518u.mo89539n(ex222);
            mo89635G3 = mo89518u.mo89635G();
            if (!mo89539n) {
            }
            mo89635G3 = new C19811c(ex222);
            mo89518u.mo89503z(mo89635G3);
            mo89518u.mo89605Q();
            C30242xd.m4931a(new C40760f81(j2, interfaceC41273g0122, (Function2) mo89635G3, null), onDismissRequest, obj2, C43575jt0.m29791b(mo89518u, 79632374, true, new C19809a(kx2, ex222, c20912a, content, i12)), mo89518u, (i12 & 112) | 3072 | ((i12 >> 6) & 896), 0);
            if (C35528Qt0.m87827O()) {
            }
            j3 = j2;
            ay32 = obj2;
            interfaceC41563gV22 = c20912a;
            mo89512w = mo89518u.mo89512w();
            if (mo89512w == null) {
            }
        }
        obj = interfaceC41563gV2;
        i7 = i2 & 8;
        if (i7 == 0) {
        }
        i9 = i2 & 16;
        if (i9 == 0) {
        }
        obj2 = ay3;
        if ((i2 & 32) != 0) {
        }
        i3 |= i11;
        i12 = i3;
        if ((374491 & i12) != 74898) {
        }
        if (i13 == 0) {
        }
        if (i7 != 0) {
        }
        if (i9 != 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        mo89518u.mo89638F(-492369756);
        mo89635G = mo89518u.mo89635G();
        c2012a = InterfaceC32720Et0.f8257a;
        if (mo89635G == c2012a.m108267a()) {
        }
        mo89518u.mo89605Q();
        kx2 = (KX2) mo89635G;
        kx2.m98795e(Boolean.valueOf(z));
        if (!((Boolean) kx2.m98799a()).booleanValue()) {
        }
        mo89518u.mo89638F(-492369756);
        mo89635G2 = mo89518u.mo89635G();
        if (mo89635G2 == c2012a.m108267a()) {
        }
        mo89518u.mo89605Q();
        EX2 ex2222 = (EX2) mo89635G2;
        InterfaceC41273g01 interfaceC41273g01222 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        mo89518u.mo89638F(1157296644);
        mo89539n = mo89518u.mo89539n(ex2222);
        mo89635G3 = mo89518u.mo89635G();
        if (!mo89539n) {
        }
        mo89635G3 = new C19811c(ex2222);
        mo89518u.mo89503z(mo89635G3);
        mo89518u.mo89605Q();
        C30242xd.m4931a(new C40760f81(j2, interfaceC41273g01222, (Function2) mo89635G3, null), onDismissRequest, obj2, C43575jt0.m29791b(mo89518u, 79632374, true, new C19809a(kx2, ex2222, c20912a, content, i12)), mo89518u, (i12 & 112) | 3072 | ((i12 >> 6) & 896), 0);
        if (C35528Qt0.m87827O()) {
        }
        j3 = j2;
        ay32 = obj2;
        interfaceC41563gV22 = c20912a;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
        }
    }
}
