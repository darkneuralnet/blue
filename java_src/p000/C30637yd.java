package p000;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.OU3;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,824:1\n151#2,3:825\n33#2,4:828\n154#2,2:832\n38#2:834\n156#2:835\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1\n*L\n351#1:825,3\n351#1:828,4\n351#1:832,2\n351#1:834\n351#1:835\n*E\n"})
/* renamed from: yd */
/* loaded from: classes.dex */
public final class C30637yd implements InterfaceC51579xO2 {

    /* renamed from: a */
    public static final C30637yd f119855a = new C30637yd();

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1$measure$1\n*L\n1#1,824:1\n*E\n"})
    /* renamed from: yd$a */
    /* loaded from: classes.dex */
    public static final class C30638a extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

        /* renamed from: g */
        public static final C30638a f119856g = new C30638a();

        public C30638a() {
            super(1);
        }

        /* renamed from: a */
        public final void m3159a(OU3.AbstractC6015a layout) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
            m3159a(abstractC6015a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1$measure$2\n*L\n1#1,824:1\n*E\n"})
    /* renamed from: yd$b */
    /* loaded from: classes.dex */
    public static final class C30639b extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

        /* renamed from: g */
        public final /* synthetic */ OU3 f119857g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30639b(OU3 ou3) {
            super(1);
            this.f119857g = ou3;
        }

        /* renamed from: a */
        public final void m3158a(OU3.AbstractC6015a layout) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            OU3.AbstractC6015a.m92205r(layout, this.f119857g, 0, 0, 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
            m3158a(abstractC6015a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1$measure$3\n*L\n1#1,824:1\n*E\n"})
    /* renamed from: yd$c */
    /* loaded from: classes.dex */
    public static final class C30640c extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

        /* renamed from: g */
        public final /* synthetic */ List<OU3> f119858g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C30640c(List<? extends OU3> list) {
            super(1);
            this.f119858g = list;
        }

        /* renamed from: a */
        public final void m3157a(OU3.AbstractC6015a layout) {
            int lastIndex;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this.f119858g);
            if (lastIndex >= 0) {
                int i = 0;
                while (true) {
                    OU3.AbstractC6015a.m92205r(layout, this.f119858g.get(i), 0, 0, 0.0f, 4, null);
                    if (i != lastIndex) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
            m3157a(abstractC6015a);
            return Unit.INSTANCE;
        }
    }

    @Override // p000.InterfaceC51579xO2
    /* renamed from: a */
    public final InterfaceC52172yO2 mo3160a(InterfaceC52765zO2 Layout, List<? extends InterfaceC50393vO2> measurables, long j) {
        int lastIndex;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        int size = measurables.size();
        if (size != 0) {
            int i3 = 0;
            if (size != 1) {
                ArrayList arrayList = new ArrayList(measurables.size());
                int size2 = measurables.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    arrayList.add(measurables.get(i4).mo8763P0(j));
                }
                lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                if (lastIndex >= 0) {
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        OU3 ou3 = (OU3) arrayList.get(i3);
                        i5 = Math.max(i5, ou3.m92226i1());
                        i6 = Math.max(i6, ou3.m92229d1());
                        if (i3 == lastIndex) {
                            break;
                        }
                        i3++;
                    }
                    i = i5;
                    i2 = i6;
                } else {
                    i = 0;
                    i2 = 0;
                }
                return InterfaceC52765zO2.m1430Y(Layout, i, i2, null, new C30640c(arrayList), 4, null);
            }
            OU3 mo8763P0 = measurables.get(0).mo8763P0(j);
            return InterfaceC52765zO2.m1430Y(Layout, mo8763P0.m92226i1(), mo8763P0.m92229d1(), null, new C30639b(mo8763P0), 4, null);
        }
        return InterfaceC52765zO2.m1430Y(Layout, 0, 0, null, C30638a.f119856g, 4, null);
    }
}
