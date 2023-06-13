package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.C25777lo;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0007\u001a\u0080\u0001\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001aG\u0010\u001d\u001a\u001f\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u0018¢\u0006\u0002\b\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a&\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001cH\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, m28432d2 = {"LcE1;", "columns", "LgV2;", "modifier", "LGn2;", TransferTable.COLUMN_STATE, "LPD3;", "contentPadding", "", "reverseLayout", "Llo$l;", "verticalArrangement", "Llo$d;", "horizontalArrangement", "Lcu1;", "flingBehavior", "userScrollEnabled", "Lkotlin/Function1;", "LBn2;", "", "Lkotlin/ExtensionFunctionType;", "content", C17296a.f69688o, "(LcE1;LgV2;LGn2;LPD3;ZLlo$l;Llo$d;Lcu1;ZLkotlin/jvm/functions/Function1;LEt0;II)V", "Lkotlin/Function2;", "Lg01;", "Lkz0;", "", "", DateTokenConverter.CONVERTER_KEY, "(LcE1;Llo$d;LPD3;LEt0;I)Lkotlin/jvm/functions/Function2;", "gridSize", "slotCount", "spacing", "c", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,493:1\n154#2:494\n154#2:495\n67#3,3:496\n66#3:499\n67#3,3:506\n66#3:509\n1114#4,6:500\n1114#4,6:510\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt\n*L\n67#1:494\n121#1:495\n153#1:496,3\n153#1:499\n185#1:506,3\n185#1:509\n153#1:500,6\n185#1:510,6\n*E\n"})
/* renamed from: jn2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43517jn2 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jn2$a */
    /* loaded from: classes.dex */
    public static final class C25016a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC39020cE1 f93323g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC41563gV2 f93324h;

        /* renamed from: i */
        public final /* synthetic */ C33136Gn2 f93325i;

        /* renamed from: j */
        public final /* synthetic */ PD3 f93326j;

        /* renamed from: k */
        public final /* synthetic */ boolean f93327k;

        /* renamed from: l */
        public final /* synthetic */ C25777lo.InterfaceC25789l f93328l;

        /* renamed from: m */
        public final /* synthetic */ C25777lo.InterfaceC25781d f93329m;

        /* renamed from: n */
        public final /* synthetic */ InterfaceC39436cu1 f93330n;

        /* renamed from: o */
        public final /* synthetic */ boolean f93331o;

        /* renamed from: p */
        public final /* synthetic */ Function1<InterfaceC31966Bn2, Unit> f93332p;

        /* renamed from: q */
        public final /* synthetic */ int f93333q;

        /* renamed from: r */
        public final /* synthetic */ int f93334r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C25016a(InterfaceC39020cE1 interfaceC39020cE1, InterfaceC41563gV2 interfaceC41563gV2, C33136Gn2 c33136Gn2, PD3 pd3, boolean z, C25777lo.InterfaceC25789l interfaceC25789l, C25777lo.InterfaceC25781d interfaceC25781d, InterfaceC39436cu1 interfaceC39436cu1, boolean z2, Function1<? super InterfaceC31966Bn2, Unit> function1, int i, int i2) {
            super(2);
            this.f93323g = interfaceC39020cE1;
            this.f93324h = interfaceC41563gV2;
            this.f93325i = c33136Gn2;
            this.f93326j = pd3;
            this.f93327k = z;
            this.f93328l = interfaceC25789l;
            this.f93329m = interfaceC25781d;
            this.f93330n = interfaceC39436cu1;
            this.f93331o = z2;
            this.f93332p = function1;
            this.f93333q = i;
            this.f93334r = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C43517jn2.m29929a(this.f93323g, this.f93324h, this.f93325i, this.f93326j, this.f93327k, this.f93328l, this.f93329m, this.f93330n, this.f93331o, this.f93332p, interfaceC32720Et0, C47127ps4.m18626a(this.f93333q | 1), this.f93334r);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$rememberColumnWidthSums$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,493:1\n51#2:494\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$rememberColumnWidthSums$1$1\n*L\n162#1:494\n*E\n"})
    /* renamed from: jn2$b */
    /* loaded from: classes.dex */
    public static final class C25017b extends Lambda implements Function2<InterfaceC41273g01, C44228kz0, List<Integer>> {

        /* renamed from: g */
        public final /* synthetic */ PD3 f93335g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC39020cE1 f93336h;

        /* renamed from: i */
        public final /* synthetic */ C25777lo.InterfaceC25781d f93337i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25017b(PD3 pd3, InterfaceC39020cE1 interfaceC39020cE1, C25777lo.InterfaceC25781d interfaceC25781d) {
            super(2);
            this.f93335g = pd3;
            this.f93336h = interfaceC39020cE1;
            this.f93337i = interfaceC25781d;
        }

        /* renamed from: a */
        public final List<Integer> m29925a(InterfaceC41273g01 interfaceC41273g01, long j) {
            boolean z;
            List<Integer> mutableList;
            Intrinsics.checkNotNullParameter(interfaceC41273g01, "$this$null");
            if (C44228kz0.m28063n(j) != Integer.MAX_VALUE) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                PD3 pd3 = this.f93335g;
                EnumC47065pm2 enumC47065pm2 = EnumC47065pm2.Ltr;
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) this.f93336h.mo61652a(interfaceC41273g01, C44228kz0.m28063n(j) - interfaceC41273g01.mo3416F0(C43705k61.m29303g(ND3.m94186g(pd3, enumC47065pm2) + ND3.m94187f(this.f93335g, enumC47065pm2))), interfaceC41273g01.mo3416F0(this.f93337i.mo26793a())));
                int size = mutableList.size();
                for (int i = 1; i < size; i++) {
                    mutableList.set(i, Integer.valueOf(mutableList.get(i).intValue() + mutableList.get(i - 1).intValue()));
                }
                return mutableList;
            }
            throw new IllegalArgumentException("LazyVerticalGrid's width should be bound by parent.".toString());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ List<Integer> invoke(InterfaceC41273g01 interfaceC41273g01, C44228kz0 c44228kz0) {
            return m29925a(interfaceC41273g01, c44228kz0.m28058s());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m29929a(InterfaceC39020cE1 columns, InterfaceC41563gV2 interfaceC41563gV2, C33136Gn2 c33136Gn2, PD3 pd3, boolean z, C25777lo.InterfaceC25789l interfaceC25789l, C25777lo.InterfaceC25781d interfaceC25781d, InterfaceC39436cu1 interfaceC39436cu1, boolean z2, Function1<? super InterfaceC31966Bn2, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        Object obj2;
        int i5;
        boolean z3;
        Object obj3;
        int i6;
        Object obj4;
        int i7;
        int i8;
        InterfaceC41563gV2 interfaceC41563gV22;
        C33136Gn2 c33136Gn22;
        C25777lo.InterfaceC25789l interfaceC25789l2;
        InterfaceC39436cu1 interfaceC39436cu12;
        boolean z4;
        Object obj5;
        boolean z5;
        PD3 pd32;
        Object obj6;
        C25777lo.InterfaceC25781d interfaceC25781d2;
        InterfaceC39436cu1 interfaceC39436cu13;
        InterfaceC32720Et0 interfaceC32720Et02;
        InterfaceC41563gV2 interfaceC41563gV23;
        C25777lo.InterfaceC25781d interfaceC25781d3;
        PD3 pd33;
        C33136Gn2 c33136Gn23;
        boolean z6;
        C25777lo.InterfaceC25789l interfaceC25789l3;
        InterfaceC39436cu1 interfaceC39436cu14;
        boolean z7;
        InterfaceC36874Wm5 mo89512w;
        int i9;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1485410512);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (mo89518u.mo89539n(columns) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= mo89518u.mo89539n(interfaceC41563gV2) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    obj = c33136Gn2;
                    if (mo89518u.mo89539n(obj)) {
                        i11 = 256;
                        i3 |= i11;
                    }
                } else {
                    obj = c33136Gn2;
                }
                i11 = 128;
                i3 |= i11;
            } else {
                obj = c33136Gn2;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                obj2 = pd3;
                i3 |= mo89518u.mo89539n(obj2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    z3 = z;
                    i3 |= mo89518u.mo89536o(z3) ? 16384 : 8192;
                    if ((458752 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            obj3 = interfaceC25789l;
                            if (mo89518u.mo89539n(obj3)) {
                                i10 = DateUtils.FORMAT_NUMERIC_DATE;
                                i3 |= i10;
                            }
                        } else {
                            obj3 = interfaceC25789l;
                        }
                        i10 = 65536;
                        i3 |= i10;
                    } else {
                        obj3 = interfaceC25789l;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        obj4 = interfaceC25781d;
                    } else {
                        obj4 = interfaceC25781d;
                        if ((i & 3670016) == 0) {
                            i3 |= mo89518u.mo89539n(obj4) ? 1048576 : 524288;
                        }
                    }
                    if ((i & 29360128) == 0) {
                        if ((i2 & 128) == 0 && mo89518u.mo89539n(interfaceC39436cu1)) {
                            i9 = 8388608;
                            i3 |= i9;
                        }
                        i9 = 4194304;
                        i3 |= i9;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i3 |= mo89518u.mo89536o(z2) ? 67108864 : 33554432;
                    }
                    if ((i2 & 512) != 0) {
                        if ((i & 1879048192) == 0) {
                            i8 = mo89518u.mo89629I(content) ? 536870912 : 268435456;
                        }
                        if ((1533916891 & i3) != 306783378 && mo89518u.mo89575b()) {
                            mo89518u.mo89548k();
                            interfaceC41563gV23 = interfaceC41563gV2;
                            z7 = z2;
                            c33136Gn23 = obj;
                            pd33 = obj2;
                            interfaceC25781d3 = obj4;
                            z6 = z3;
                            interfaceC25789l3 = obj3;
                            interfaceC32720Et02 = mo89518u;
                            interfaceC39436cu14 = interfaceC39436cu1;
                        } else {
                            mo89518u.mo89626J();
                            if ((i & 1) == 0 && !mo89518u.mo89545l()) {
                                mo89518u.mo89548k();
                                if ((i2 & 4) != 0) {
                                    i3 &= -897;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                interfaceC41563gV22 = interfaceC41563gV2;
                                interfaceC39436cu13 = interfaceC39436cu1;
                                z4 = z2;
                                obj5 = obj;
                                z5 = z3;
                                obj6 = obj3;
                                pd32 = obj2;
                                interfaceC25781d2 = obj4;
                            } else {
                                interfaceC41563gV22 = i12 != 0 ? InterfaceC41563gV2.f82354b0 : interfaceC41563gV2;
                                if ((i2 & 4) != 0) {
                                    c33136Gn22 = C33370Hn2.m103430a(0, 0, mo89518u, 0, 3);
                                    i3 &= -897;
                                } else {
                                    c33136Gn22 = obj;
                                }
                                PD3 m94192a = i4 != 0 ? ND3.m94192a(C43705k61.m29303g(0)) : obj2;
                                boolean z8 = i5 == 0 ? z3 : false;
                                if ((i2 & 32) != 0) {
                                    C25777lo c25777lo = C25777lo.f96729a;
                                    interfaceC25789l2 = !z8 ? c25777lo.m26802g() : c25777lo.m26808a();
                                    i3 &= -458753;
                                } else {
                                    interfaceC25789l2 = obj3;
                                }
                                C25777lo.InterfaceC25781d m26803f = i6 != 0 ? C25777lo.f96729a.m26803f() : obj4;
                                if ((i2 & 128) != 0) {
                                    interfaceC39436cu12 = C37369Yp5.f47422a.m74177a(mo89518u, 6);
                                    i3 &= -29360129;
                                } else {
                                    interfaceC39436cu12 = interfaceC39436cu1;
                                }
                                z4 = i7 != 0 ? true : z2;
                                obj5 = c33136Gn22;
                                z5 = z8;
                                pd32 = m94192a;
                                obj6 = interfaceC25789l2;
                                interfaceC25781d2 = m26803f;
                                interfaceC39436cu13 = interfaceC39436cu12;
                            }
                            mo89518u.mo89650B();
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87816Z(1485410512, i3, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:62)");
                            }
                            int i13 = i3 >> 3;
                            Function2<InterfaceC41273g01, C44228kz0, List<Integer>> m29926d = m29926d(columns, interfaceC25781d2, pd32, mo89518u, (i3 & 14) | ((i3 >> 15) & 112) | (i13 & 896));
                            int i14 = (i13 & 14) | ImageMetadata.EDGE_MODE | (i13 & 112) | (i3 & 7168) | (57344 & i3) | (i13 & 3670016) | (i13 & 29360128);
                            int i15 = i3 << 9;
                            C25777lo.InterfaceC25781d interfaceC25781d4 = interfaceC25781d2;
                            PD3 pd34 = pd32;
                            interfaceC32720Et02 = mo89518u;
                            C50039un2.m9777a(interfaceC41563gV22, obj5, m29926d, pd32, z5, true, interfaceC39436cu13, z4, obj6, interfaceC25781d2, content, mo89518u, i14 | (i15 & 234881024) | (i15 & 1879048192), (i3 >> 27) & 14, 0);
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87817Y();
                            }
                            interfaceC41563gV23 = interfaceC41563gV22;
                            interfaceC25781d3 = interfaceC25781d4;
                            pd33 = pd34;
                            c33136Gn23 = obj5;
                            z6 = z5;
                            interfaceC25789l3 = obj6;
                            interfaceC39436cu14 = interfaceC39436cu13;
                            z7 = z4;
                        }
                        mo89512w = interfaceC32720Et02.mo89512w();
                        if (mo89512w == null) {
                            return;
                        }
                        mo89512w.mo20405a(new C25016a(columns, interfaceC41563gV23, c33136Gn23, pd33, z6, interfaceC25789l3, interfaceC25781d3, interfaceC39436cu14, z7, content, i, i2));
                        return;
                    }
                    i8 = 805306368;
                    i3 |= i8;
                    if ((1533916891 & i3) != 306783378) {
                    }
                    mo89518u.mo89626J();
                    if ((i & 1) == 0) {
                    }
                    if (i12 != 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    obj5 = c33136Gn22;
                    z5 = z8;
                    pd32 = m94192a;
                    obj6 = interfaceC25789l2;
                    interfaceC25781d2 = m26803f;
                    interfaceC39436cu13 = interfaceC39436cu12;
                    mo89518u.mo89650B();
                    if (C35528Qt0.m87827O()) {
                    }
                    int i132 = i3 >> 3;
                    Function2<InterfaceC41273g01, C44228kz0, List<Integer>> m29926d2 = m29926d(columns, interfaceC25781d2, pd32, mo89518u, (i3 & 14) | ((i3 >> 15) & 112) | (i132 & 896));
                    int i142 = (i132 & 14) | ImageMetadata.EDGE_MODE | (i132 & 112) | (i3 & 7168) | (57344 & i3) | (i132 & 3670016) | (i132 & 29360128);
                    int i152 = i3 << 9;
                    C25777lo.InterfaceC25781d interfaceC25781d42 = interfaceC25781d2;
                    PD3 pd342 = pd32;
                    interfaceC32720Et02 = mo89518u;
                    C50039un2.m9777a(interfaceC41563gV22, obj5, m29926d2, pd32, z5, true, interfaceC39436cu13, z4, obj6, interfaceC25781d2, content, mo89518u, i142 | (i152 & 234881024) | (i152 & 1879048192), (i3 >> 27) & 14, 0);
                    if (C35528Qt0.m87827O()) {
                    }
                    interfaceC41563gV23 = interfaceC41563gV22;
                    interfaceC25781d3 = interfaceC25781d42;
                    pd33 = pd342;
                    c33136Gn23 = obj5;
                    z6 = z5;
                    interfaceC25789l3 = obj6;
                    interfaceC39436cu14 = interfaceC39436cu13;
                    z7 = z4;
                    mo89512w = interfaceC32720Et02.mo89512w();
                    if (mo89512w == null) {
                    }
                }
                z3 = z;
                if ((458752 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i & 29360128) == 0) {
                }
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                if ((i2 & 512) != 0) {
                }
                i3 |= i8;
                if ((1533916891 & i3) != 306783378) {
                }
                mo89518u.mo89626J();
                if ((i & 1) == 0) {
                }
                if (i12 != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i6 != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                if (i7 != 0) {
                }
                obj5 = c33136Gn22;
                z5 = z8;
                pd32 = m94192a;
                obj6 = interfaceC25789l2;
                interfaceC25781d2 = m26803f;
                interfaceC39436cu13 = interfaceC39436cu12;
                mo89518u.mo89650B();
                if (C35528Qt0.m87827O()) {
                }
                int i1322 = i3 >> 3;
                Function2<InterfaceC41273g01, C44228kz0, List<Integer>> m29926d22 = m29926d(columns, interfaceC25781d2, pd32, mo89518u, (i3 & 14) | ((i3 >> 15) & 112) | (i1322 & 896));
                int i1422 = (i1322 & 14) | ImageMetadata.EDGE_MODE | (i1322 & 112) | (i3 & 7168) | (57344 & i3) | (i1322 & 3670016) | (i1322 & 29360128);
                int i1522 = i3 << 9;
                C25777lo.InterfaceC25781d interfaceC25781d422 = interfaceC25781d2;
                PD3 pd3422 = pd32;
                interfaceC32720Et02 = mo89518u;
                C50039un2.m9777a(interfaceC41563gV22, obj5, m29926d22, pd32, z5, true, interfaceC39436cu13, z4, obj6, interfaceC25781d2, content, mo89518u, i1422 | (i1522 & 234881024) | (i1522 & 1879048192), (i3 >> 27) & 14, 0);
                if (C35528Qt0.m87827O()) {
                }
                interfaceC41563gV23 = interfaceC41563gV22;
                interfaceC25781d3 = interfaceC25781d422;
                pd33 = pd3422;
                c33136Gn23 = obj5;
                z6 = z5;
                interfaceC25789l3 = obj6;
                interfaceC39436cu14 = interfaceC39436cu13;
                z7 = z4;
                mo89512w = interfaceC32720Et02.mo89512w();
                if (mo89512w == null) {
                }
            }
            obj2 = pd3;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z3 = z;
            if ((458752 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i & 29360128) == 0) {
            }
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            if ((i2 & 512) != 0) {
            }
            i3 |= i8;
            if ((1533916891 & i3) != 306783378) {
            }
            mo89518u.mo89626J();
            if ((i & 1) == 0) {
            }
            if (i12 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if (i7 != 0) {
            }
            obj5 = c33136Gn22;
            z5 = z8;
            pd32 = m94192a;
            obj6 = interfaceC25789l2;
            interfaceC25781d2 = m26803f;
            interfaceC39436cu13 = interfaceC39436cu12;
            mo89518u.mo89650B();
            if (C35528Qt0.m87827O()) {
            }
            int i13222 = i3 >> 3;
            Function2<InterfaceC41273g01, C44228kz0, List<Integer>> m29926d222 = m29926d(columns, interfaceC25781d2, pd32, mo89518u, (i3 & 14) | ((i3 >> 15) & 112) | (i13222 & 896));
            int i14222 = (i13222 & 14) | ImageMetadata.EDGE_MODE | (i13222 & 112) | (i3 & 7168) | (57344 & i3) | (i13222 & 3670016) | (i13222 & 29360128);
            int i15222 = i3 << 9;
            C25777lo.InterfaceC25781d interfaceC25781d4222 = interfaceC25781d2;
            PD3 pd34222 = pd32;
            interfaceC32720Et02 = mo89518u;
            C50039un2.m9777a(interfaceC41563gV22, obj5, m29926d222, pd32, z5, true, interfaceC39436cu13, z4, obj6, interfaceC25781d2, content, mo89518u, i14222 | (i15222 & 234881024) | (i15222 & 1879048192), (i3 >> 27) & 14, 0);
            if (C35528Qt0.m87827O()) {
            }
            interfaceC41563gV23 = interfaceC41563gV22;
            interfaceC25781d3 = interfaceC25781d4222;
            pd33 = pd34222;
            c33136Gn23 = obj5;
            z6 = z5;
            interfaceC25789l3 = obj6;
            interfaceC39436cu14 = interfaceC39436cu13;
            z7 = z4;
            mo89512w = interfaceC32720Et02.mo89512w();
            if (mo89512w == null) {
            }
        }
        if ((i & 896) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        obj2 = pd3;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z3 = z;
        if ((458752 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i & 29360128) == 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        if ((i2 & 512) != 0) {
        }
        i3 |= i8;
        if ((1533916891 & i3) != 306783378) {
        }
        mo89518u.mo89626J();
        if ((i & 1) == 0) {
        }
        if (i12 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if (i7 != 0) {
        }
        obj5 = c33136Gn22;
        z5 = z8;
        pd32 = m94192a;
        obj6 = interfaceC25789l2;
        interfaceC25781d2 = m26803f;
        interfaceC39436cu13 = interfaceC39436cu12;
        mo89518u.mo89650B();
        if (C35528Qt0.m87827O()) {
        }
        int i132222 = i3 >> 3;
        Function2<InterfaceC41273g01, C44228kz0, List<Integer>> m29926d2222 = m29926d(columns, interfaceC25781d2, pd32, mo89518u, (i3 & 14) | ((i3 >> 15) & 112) | (i132222 & 896));
        int i142222 = (i132222 & 14) | ImageMetadata.EDGE_MODE | (i132222 & 112) | (i3 & 7168) | (57344 & i3) | (i132222 & 3670016) | (i132222 & 29360128);
        int i152222 = i3 << 9;
        C25777lo.InterfaceC25781d interfaceC25781d42222 = interfaceC25781d2;
        PD3 pd342222 = pd32;
        interfaceC32720Et02 = mo89518u;
        C50039un2.m9777a(interfaceC41563gV22, obj5, m29926d2222, pd32, z5, true, interfaceC39436cu13, z4, obj6, interfaceC25781d2, content, mo89518u, i142222 | (i152222 & 234881024) | (i152222 & 1879048192), (i3 >> 27) & 14, 0);
        if (C35528Qt0.m87827O()) {
        }
        interfaceC41563gV23 = interfaceC41563gV22;
        interfaceC25781d3 = interfaceC25781d42222;
        pd33 = pd342222;
        c33136Gn23 = obj5;
        z6 = z5;
        interfaceC25789l3 = obj6;
        interfaceC39436cu14 = interfaceC39436cu13;
        z7 = z4;
        mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w == null) {
        }
    }

    /* renamed from: c */
    public static final List<Integer> m29927c(int i, int i2, int i3) {
        int i4;
        int i5 = i - (i3 * (i2 - 1));
        int i6 = i5 / i2;
        int i7 = i5 % i2;
        ArrayList arrayList = new ArrayList(i2);
        for (int i8 = 0; i8 < i2; i8++) {
            if (i8 < i7) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            arrayList.add(Integer.valueOf(i4 + i6));
        }
        return arrayList;
    }

    /* renamed from: d */
    public static final Function2<InterfaceC41273g01, C44228kz0, List<Integer>> m29926d(InterfaceC39020cE1 interfaceC39020cE1, C25777lo.InterfaceC25781d interfaceC25781d, PD3 pd3, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        interfaceC32720Et0.mo89638F(-1355301804);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1355301804, i, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:148)");
        }
        interfaceC32720Et0.mo89638F(1618982084);
        boolean mo89539n = interfaceC32720Et0.mo89539n(interfaceC39020cE1) | interfaceC32720Et0.mo89539n(interfaceC25781d) | interfaceC32720Et0.mo89539n(pd3);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new C25017b(pd3, interfaceC39020cE1, interfaceC25781d);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        Function2<InterfaceC41273g01, C44228kz0, List<Integer>> function2 = (Function2) mo89635G;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return function2;
    }
}
