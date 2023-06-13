package p000;

import android.view.View;
import androidx.compose.p003ui.platform.C11411h;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32018Bt0;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m28432d2 = {"Lkotlin/Function0;", "", "onDismissRequest", "LD31;", "properties", "content", C17296a.f69688o, "(Lkotlin/jvm/functions/Function0;LD31;Lkotlin/jvm/functions/Function2;LEt0;II)V", "LgV2;", "modifier", "c", "(LgV2;Lkotlin/jvm/functions/Function2;LEt0;II)V", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,456:1\n76#2:457\n76#2:458\n76#2:459\n76#2:469\n50#3:460\n49#3:461\n456#3,14:481\n1114#4,6:462\n74#5:468\n75#5,11:470\n88#5:495\n76#6:496\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt\n*L\n156#1:457\n157#1:458\n158#1:459\n444#1:469\n162#1:460\n162#1:461\n444#1:481,14\n162#1:462,6\n444#1:468\n444#1:470,11\n444#1:495\n160#1:496\n*E\n"})
/* renamed from: Dc */
/* loaded from: classes.dex */
public final class C1556Dc {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,456:1\n62#2,5:457\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$1\n*L\n186#1:457,5\n*E\n"})
    /* renamed from: Dc$a */
    /* loaded from: classes.dex */
    public static final class C1557a extends Lambda implements Function1<C44881m51, InterfaceC44288l51> {

        /* renamed from: g */
        public final /* synthetic */ J31 f6033g;

        @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"Dc$a$a", "Ll51;", "", "dispose", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$1\n*L\n1#1,484:1\n187#2,3:485\n*E\n"})
        /* renamed from: Dc$a$a */
        /* loaded from: classes.dex */
        public static final class C1558a implements InterfaceC44288l51 {

            /* renamed from: a */
            public final /* synthetic */ J31 f6034a;

            public C1558a(J31 j31) {
                this.f6034a = j31;
            }

            @Override // p000.InterfaceC44288l51
            public void dispose() {
                this.f6034a.dismiss();
                this.f6034a.m101245e();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1557a(J31 j31) {
            super(1);
            this.f6033g = j31;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC44288l51 invoke(C44881m51 DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            this.f6033g.show();
            return new C1558a(this.f6033g);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Dc$b */
    /* loaded from: classes.dex */
    public static final class C1559b extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ J31 f6035g;

        /* renamed from: h */
        public final /* synthetic */ Function0<Unit> f6036h;

        /* renamed from: i */
        public final /* synthetic */ D31 f6037i;

        /* renamed from: j */
        public final /* synthetic */ EnumC47065pm2 f6038j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1559b(J31 j31, Function0<Unit> function0, D31 d31, EnumC47065pm2 enumC47065pm2) {
            super(0);
            this.f6035g = j31;
            this.f6036h = function0;
            this.f6037i = d31;
            this.f6038j = enumC47065pm2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f6035g.m101241i(this.f6036h, this.f6037i, this.f6038j);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Dc$c */
    /* loaded from: classes.dex */
    public static final class C1560c extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function0<Unit> f6039g;

        /* renamed from: h */
        public final /* synthetic */ D31 f6040h;

        /* renamed from: i */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f6041i;

        /* renamed from: j */
        public final /* synthetic */ int f6042j;

        /* renamed from: k */
        public final /* synthetic */ int f6043k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1560c(Function0<Unit> function0, D31 d31, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i, int i2) {
            super(2);
            this.f6039g = function0;
            this.f6040h = d31;
            this.f6041i = function2;
            this.f6042j = i;
            this.f6043k = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C1556Dc.m110114a(this.f6039g, this.f6040h, this.f6041i, interfaceC32720Et0, C47127ps4.m18626a(this.f6042j | 1), this.f6043k);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Dc$d */
    /* loaded from: classes.dex */
    public static final class C1561d extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC48627sP5<Function2<InterfaceC32720Et0, Integer, Unit>> f6044g;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Dc$d$a */
        /* loaded from: classes.dex */
        public static final class C1562a extends Lambda implements Function1<InterfaceC48906ss5, Unit> {

            /* renamed from: g */
            public static final C1562a f6045g = new C1562a();

            public C1562a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48906ss5 interfaceC48906ss5) {
                invoke2(interfaceC48906ss5);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(InterfaceC48906ss5 semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                C47128ps5.m18592g(semantics);
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Dc$d$b */
        /* loaded from: classes.dex */
        public static final class C1563b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC48627sP5<Function2<InterfaceC32720Et0, Integer, Unit>> f6046g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1563b(InterfaceC48627sP5<? extends Function2<? super InterfaceC32720Et0, ? super Integer, Unit>> interfaceC48627sP5) {
                super(2);
                this.f6046g = interfaceC48627sP5;
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
                    C35528Qt0.m87816Z(-533674951, i, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:175)");
                }
                C1556Dc.m110113b(this.f6046g).invoke(interfaceC32720Et0, 0);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1561d(InterfaceC48627sP5<? extends Function2<? super InterfaceC32720Et0, ? super Integer, Unit>> interfaceC48627sP5) {
            super(2);
            this.f6044g = interfaceC48627sP5;
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
                C35528Qt0.m87816Z(488261145, i, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:170)");
            }
            C1556Dc.m110112c(C41198fs5.m40620b(InterfaceC41563gV2.f82354b0, false, C1562a.f6045g, 1, null), C43575jt0.m29791b(interfaceC32720Et0, -533674951, true, new C1563b(this.f6044g)), interfaceC32720Et0, 48, 0);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Dc$e */
    /* loaded from: classes.dex */
    public static final class C1564e extends Lambda implements Function0<UUID> {

        /* renamed from: g */
        public static final C1564e f6047g = new C1564e();

        public C1564e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$DialogLayout$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,456:1\n151#2,3:457\n33#2,4:460\n154#2,2:464\n38#2:466\n156#2:467\n171#2,13:468\n171#2,13:481\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$DialogLayout$1\n*L\n448#1:457,3\n448#1:460,4\n448#1:464,2\n448#1:466\n448#1:467\n449#1:468,13\n450#1:481,13\n*E\n"})
    /* renamed from: Dc$f */
    /* loaded from: classes.dex */
    public static final class C1565f implements InterfaceC51579xO2 {

        /* renamed from: a */
        public static final C1565f f6048a = new C1565f();

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$DialogLayout$1$measure$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,456:1\n33#2,6:457\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$DialogLayout$1$measure$1\n*L\n452#1:457,6\n*E\n"})
        /* renamed from: Dc$f$a */
        /* loaded from: classes.dex */
        public static final class C1566a extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

            /* renamed from: g */
            public final /* synthetic */ List<OU3> f6049g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1566a(List<? extends OU3> list) {
                super(1);
                this.f6049g = list;
            }

            /* renamed from: a */
            public final void m110108a(OU3.AbstractC6015a layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                List<OU3> list = this.f6049g;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    OU3.AbstractC6015a.m92205r(layout, list.get(i), 0, 0, 0.0f, 4, null);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
                m110108a(abstractC6015a);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v15 */
        /* JADX WARN: Type inference failed for: r13v17 */
        @Override // p000.InterfaceC51579xO2
        /* renamed from: a */
        public final InterfaceC52172yO2 mo3160a(InterfaceC52765zO2 Layout, List<? extends InterfaceC50393vO2> measurables, long j) {
            Object obj;
            int lastIndex;
            int m28061p;
            int m28062o;
            int lastIndex2;
            Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            ArrayList arrayList = new ArrayList(measurables.size());
            int size = measurables.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(measurables.get(i).mo8763P0(j));
            }
            OU3 ou3 = null;
            int i2 = 1;
            if (arrayList.isEmpty()) {
                obj = null;
            } else {
                obj = arrayList.get(0);
                int m92226i1 = ((OU3) obj).m92226i1();
                lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                if (1 <= lastIndex) {
                    int i3 = 1;
                    while (true) {
                        Object obj2 = arrayList.get(i3);
                        int m92226i12 = ((OU3) obj2).m92226i1();
                        if (m92226i1 < m92226i12) {
                            obj = obj2;
                            m92226i1 = m92226i12;
                        }
                        if (i3 == lastIndex) {
                            break;
                        }
                        i3++;
                    }
                }
            }
            OU3 ou32 = (OU3) obj;
            if (ou32 != null) {
                m28061p = ou32.m92226i1();
            } else {
                m28061p = C44228kz0.m28061p(j);
            }
            int i4 = m28061p;
            if (!arrayList.isEmpty()) {
                Object obj3 = arrayList.get(0);
                int m92229d1 = ((OU3) obj3).m92229d1();
                lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                Object obj4 = obj3;
                if (1 <= lastIndex2) {
                    while (true) {
                        Object obj5 = arrayList.get(i2);
                        int m92229d12 = ((OU3) obj5).m92229d1();
                        obj3 = obj4;
                        if (m92229d1 < m92229d12) {
                            obj3 = obj5;
                            m92229d1 = m92229d12;
                        }
                        if (i2 == lastIndex2) {
                            break;
                        }
                        i2++;
                        obj4 = obj3;
                    }
                }
                ou3 = obj3;
            }
            OU3 ou33 = ou3;
            if (ou33 != null) {
                m28062o = ou33.m92229d1();
            } else {
                m28062o = C44228kz0.m28062o(j);
            }
            return InterfaceC52765zO2.m1430Y(Layout, i4, m28062o, null, new C1566a(arrayList), 4, null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Dc$g */
    /* loaded from: classes.dex */
    public static final class C1567g extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC41563gV2 f6050g;

        /* renamed from: h */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f6051h;

        /* renamed from: i */
        public final /* synthetic */ int f6052i;

        /* renamed from: j */
        public final /* synthetic */ int f6053j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1567g(InterfaceC41563gV2 interfaceC41563gV2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i, int i2) {
            super(2);
            this.f6050g = interfaceC41563gV2;
            this.f6051h = function2;
            this.f6052i = i;
            this.f6053j = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C1556Dc.m110112c(this.f6050g, this.f6051h, interfaceC32720Et0, C47127ps4.m18626a(this.f6052i | 1), this.f6053j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m110114a(Function0<Unit> onDismissRequest, D31 d31, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        Object obj;
        int i5;
        int i6;
        D31 d312;
        EnumC47065pm2 enumC47065pm2;
        boolean mo89539n;
        EnumC47065pm2 enumC47065pm22;
        D31 d313;
        InterfaceC32720Et0 interfaceC32720Et02;
        J31 j31;
        D31 d314;
        InterfaceC32720Et0 interfaceC32720Et03;
        InterfaceC36874Wm5 mo89512w;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-2032877254);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89629I(onDismissRequest)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = d31;
            if (mo89518u.mo89539n(obj)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                if (mo89518u.mo89629I(content)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i3 |= i6;
            }
            if ((i3 & 731) != 146 && mo89518u.mo89575b()) {
                mo89518u.mo89548k();
                d314 = obj;
                interfaceC32720Et03 = mo89518u;
            } else {
                if (i7 == 0) {
                    d312 = new D31(false, false, (EnumC35038Oq5) null, 7, (DefaultConstructorMarker) null);
                } else {
                    d312 = obj;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-2032877254, i3, -1, "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:150)");
                }
                View view = (View) mo89518u.mo89572c(C11411h.m68320k());
                InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                AbstractC37400Yt0 m2334d = C52468yt0.m2334d(mo89518u, 0);
                InterfaceC48627sP5 m105193n = GM5.m105193n(content, mo89518u, (i3 >> 6) & 14);
                UUID dialogId = (UUID) C35550Qv4.m87571b(new Object[0], null, null, C1564e.f6047g, mo89518u, 3080, 6);
                mo89518u.mo89638F(511388516);
                mo89539n = mo89518u.mo89539n(view) | mo89518u.mo89539n(interfaceC41273g01);
                Object mo89635G = mo89518u.mo89635G();
                if (mo89539n && mo89635G != InterfaceC32720Et0.f8257a.m108267a()) {
                    enumC47065pm22 = enumC47065pm2;
                    d313 = d312;
                    interfaceC32720Et02 = mo89518u;
                    j31 = mo89635G;
                } else {
                    Intrinsics.checkNotNullExpressionValue(dialogId, "dialogId");
                    enumC47065pm22 = enumC47065pm2;
                    d313 = d312;
                    InterfaceC32720Et0 interfaceC32720Et04 = mo89518u;
                    J31 j312 = new J31(onDismissRequest, d312, view, enumC47065pm22, interfaceC41273g01, dialogId);
                    j312.m101244f(m2334d, C43575jt0.m29790c(488261145, true, new C1561d(m105193n)));
                    interfaceC32720Et04.mo89503z(j312);
                    j31 = j312;
                    interfaceC32720Et02 = interfaceC32720Et04;
                }
                interfaceC32720Et02.mo89605Q();
                J31 j313 = (J31) j31;
                Y91.m75536c(j313, new C1557a(j313), interfaceC32720Et02, 8);
                Y91.m75531h(new C1559b(j313, onDismissRequest, d313, enumC47065pm22), interfaceC32720Et02, 0);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
                d314 = d313;
                interfaceC32720Et03 = interfaceC32720Et02;
            }
            mo89512w = interfaceC32720Et03.mo89512w();
            if (mo89512w == null) {
                mo89512w.mo20405a(new C1560c(onDismissRequest, d314, content, i, i2));
                return;
            }
            return;
        }
        obj = d31;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 731) != 146) {
        }
        if (i7 == 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        View view2 = (View) mo89518u.mo89572c(C11411h.m68320k());
        InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        AbstractC37400Yt0 m2334d2 = C52468yt0.m2334d(mo89518u, 0);
        InterfaceC48627sP5 m105193n2 = GM5.m105193n(content, mo89518u, (i3 >> 6) & 14);
        UUID dialogId2 = (UUID) C35550Qv4.m87571b(new Object[0], null, null, C1564e.f6047g, mo89518u, 3080, 6);
        mo89518u.mo89638F(511388516);
        mo89539n = mo89518u.mo89539n(view2) | mo89518u.mo89539n(interfaceC41273g012);
        Object mo89635G2 = mo89518u.mo89635G();
        if (mo89539n) {
        }
        Intrinsics.checkNotNullExpressionValue(dialogId2, "dialogId");
        enumC47065pm22 = enumC47065pm2;
        d313 = d312;
        InterfaceC32720Et0 interfaceC32720Et042 = mo89518u;
        J31 j3122 = new J31(onDismissRequest, d312, view2, enumC47065pm22, interfaceC41273g012, dialogId2);
        j3122.m101244f(m2334d2, C43575jt0.m29790c(488261145, true, new C1561d(m105193n2)));
        interfaceC32720Et042.mo89503z(j3122);
        j31 = j3122;
        interfaceC32720Et02 = interfaceC32720Et042;
        interfaceC32720Et02.mo89605Q();
        J31 j3132 = (J31) j31;
        Y91.m75536c(j3132, new C1557a(j3132), interfaceC32720Et02, 8);
        Y91.m75531h(new C1559b(j3132, onDismissRequest, d313, enumC47065pm22), interfaceC32720Et02, 0);
        if (C35528Qt0.m87827O()) {
        }
        d314 = d313;
        interfaceC32720Et03 = interfaceC32720Et02;
        mo89512w = interfaceC32720Et03.mo89512w();
        if (mo89512w == null) {
        }
    }

    /* renamed from: b */
    public static final Function2<InterfaceC32720Et0, Integer, Unit> m110113b(InterfaceC48627sP5<? extends Function2<? super InterfaceC32720Et0, ? super Integer, Unit>> interfaceC48627sP5) {
        return (Function2) interfaceC48627sP5.getValue();
    }

    /* renamed from: c */
    public static final void m110112c(InterfaceC41563gV2 interfaceC41563gV2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        int i5;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1177876616);
        int i6 = i2 & 1;
        if (i6 != 0) {
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (mo89518u.mo89629I(function2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 91) == 18 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (i6 != 0) {
                interfaceC41563gV2 = InterfaceC41563gV2.f82354b0;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1177876616, i3, -1, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:439)");
            }
            C1565f c1565f = C1565f.f6048a;
            int i7 = ((i3 >> 3) & 14) | ((i3 << 3) & 112);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(interfaceC41563gV2);
            int i8 = ((i7 << 9) & 7168) | 6;
            if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                C52468yt0.m2335c();
            }
            mo89518u.mo89557h();
            if (mo89518u.mo89521t()) {
                mo89518u.mo89617M(m113415a);
            } else {
                mo89518u.mo89566e();
            }
            InterfaceC32720Et0 m64192a = C38680bf6.m64192a(mo89518u);
            C38680bf6.m64191b(m64192a, c1565f, c0757a.m113412d());
            C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
            C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
            C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
            m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, Integer.valueOf((i8 >> 3) & 112));
            mo89518u.mo89638F(2058660585);
            function2.invoke(mo89518u, Integer.valueOf((i8 >> 9) & 14));
            mo89518u.mo89605Q();
            mo89518u.mo89563f();
            mo89518u.mo89605Q();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C1567g(interfaceC41563gV2, function2, i, i2));
        }
    }
}
