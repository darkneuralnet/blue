package p000;

import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32018Bt0;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"LgV2;", "modifier", "Lkotlin/Function0;", "", "content", C17296a.f69688o, "(LgV2;Lkotlin/jvm/functions/Function2;LEt0;II)V", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSimpleLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleLayout.kt\nandroidx/compose/foundation/text/selection/SimpleLayoutKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,53:1\n74#2:54\n75#2,11:56\n88#2:81\n76#3:55\n456#4,14:67\n*S KotlinDebug\n*F\n+ 1 SimpleLayout.kt\nandroidx/compose/foundation/text/selection/SimpleLayoutKt\n*L\n33#1:54\n33#1:56,11\n33#1:81\n33#1:55\n33#1:67,14\n*E\n"})
/* renamed from: QA5 */
/* loaded from: classes.dex */
public final class QA5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nSimpleLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleLayout.kt\nandroidx/compose/foundation/text/selection/SimpleLayoutKt$SimpleLayout$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n*L\n1#1,53:1\n151#2,3:54\n33#2,4:57\n154#2,2:61\n38#2:63\n156#2:64\n33#2,4:68\n38#2:74\n33#2,4:79\n38#2:85\n59#3,3:65\n62#3,2:72\n64#3:75\n59#3,3:76\n62#3,2:83\n64#3:86\n*S KotlinDebug\n*F\n+ 1 SimpleLayout.kt\nandroidx/compose/foundation/text/selection/SimpleLayoutKt$SimpleLayout$1\n*L\n34#1:54,3\n34#1:57,4\n34#1:61,2\n34#1:63\n34#1:64\n38#1:68,4\n38#1:74\n42#1:79,4\n42#1:85\n38#1:65,3\n38#1:72,2\n38#1:75\n42#1:76,3\n42#1:83,2\n42#1:86\n*E\n"})
    /* renamed from: QA5$a */
    /* loaded from: classes.dex */
    public static final class C6702a implements InterfaceC51579xO2 {

        /* renamed from: a */
        public static final C6702a f29941a = new C6702a();

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nSimpleLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleLayout.kt\nandroidx/compose/foundation/text/selection/SimpleLayoutKt$SimpleLayout$1$measure$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,53:1\n33#2,6:54\n*S KotlinDebug\n*F\n+ 1 SimpleLayout.kt\nandroidx/compose/foundation/text/selection/SimpleLayoutKt$SimpleLayout$1$measure$1\n*L\n47#1:54,6\n*E\n"})
        /* renamed from: QA5$a$a */
        /* loaded from: classes.dex */
        public static final class C6703a extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

            /* renamed from: g */
            public final /* synthetic */ List<OU3> f29942g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C6703a(List<? extends OU3> list) {
                super(1);
                this.f29942g = list;
            }

            /* renamed from: a */
            public final void m88806a(OU3.AbstractC6015a layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                List<OU3> list = this.f29942g;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    OU3.AbstractC6015a.m92209n(layout, list.get(i), 0, 0, 0.0f, 4, null);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
                m88806a(abstractC6015a);
                return Unit.INSTANCE;
            }
        }

        @Override // p000.InterfaceC51579xO2
        /* renamed from: a */
        public final InterfaceC52172yO2 mo3160a(InterfaceC52765zO2 Layout, List<? extends InterfaceC50393vO2> measurables, long j) {
            Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            ArrayList arrayList = new ArrayList(measurables.size());
            int size = measurables.size();
            Integer num = 0;
            for (int i = 0; i < size; i++) {
                arrayList.add(measurables.get(i).mo8763P0(j));
            }
            int size2 = arrayList.size();
            Integer num2 = num;
            for (int i2 = 0; i2 < size2; i2++) {
                num2 = Integer.valueOf(Math.max(num2.intValue(), ((OU3) arrayList.get(i2)).m92226i1()));
            }
            int intValue = num2.intValue();
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                num = Integer.valueOf(Math.max(num.intValue(), ((OU3) arrayList.get(i3)).m92229d1()));
            }
            return InterfaceC52765zO2.m1430Y(Layout, intValue, num.intValue(), null, new C6703a(arrayList), 4, null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: QA5$b */
    /* loaded from: classes.dex */
    public static final class C6704b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC41563gV2 f29943g;

        /* renamed from: h */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f29944h;

        /* renamed from: i */
        public final /* synthetic */ int f29945i;

        /* renamed from: j */
        public final /* synthetic */ int f29946j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6704b(InterfaceC41563gV2 interfaceC41563gV2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i, int i2) {
            super(2);
            this.f29943g = interfaceC41563gV2;
            this.f29944h = function2;
            this.f29945i = i;
            this.f29946j = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            QA5.m88807a(this.f29943g, this.f29944h, interfaceC32720Et0, C47127ps4.m18626a(this.f29945i | 1), this.f29946j);
        }
    }

    /* renamed from: a */
    public static final void m88807a(InterfaceC41563gV2 interfaceC41563gV2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-2105228848);
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
            if (mo89518u.mo89629I(content)) {
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
                C35528Qt0.m87816Z(-2105228848, i3, -1, "androidx.compose.foundation.text.selection.SimpleLayout (SimpleLayout.kt:31)");
            }
            C6702a c6702a = C6702a.f29941a;
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
            C38680bf6.m64191b(m64192a, c6702a, c0757a.m113412d());
            C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
            C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
            C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
            m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, Integer.valueOf((i8 >> 3) & 112));
            mo89518u.mo89638F(2058660585);
            content.invoke(mo89518u, Integer.valueOf((i8 >> 9) & 14));
            mo89518u.mo89605Q();
            mo89518u.mo89563f();
            mo89518u.mo89605Q();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C6704b(interfaceC41563gV2, content, i, i2));
        }
    }
}
