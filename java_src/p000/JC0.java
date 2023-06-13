package p000;

import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.AbstractC44199kw1;
import p000.C1577Df;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a;\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\"\u0010\b\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003j\u0002`\u00070\u0002H\u0001¢\u0006\u0004\b\t\u0010\n\u001ay\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00030\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001ae\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0017H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\\\u0010%\u001a:\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u001a0\u0003j\u0002`$0\u0002\u0012 \u0012\u001e\u0012\u001a\u0012\u0018\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003j\u0002`\u00070\u00020#2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!0 H\u0000\"L\u0010'\u001a:\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u001a0\u0003j\u0002`$0\u0002\u0012 \u0012\u001e\u0012\u001a\u0012\u0018\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003j\u0002`\u00070\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&*0\b\u0002\u0010(\"\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003*\u0018\b\u0002\u0010)\"\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\u0012\u0004\u0012\u00020\u001a0\u0003\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006*"}, m28432d2 = {"LDf;", Entry.TYPE_TEXT, "", "LDf$b;", "Lkotlin/Function1;", "", "", "Landroidx/compose/foundation/text/InlineContentRange;", "inlineContents", C17296a.f69688o, "(LDf;Ljava/util/List;LEt0;I)V", "LT06;", "current", "LG26;", "style", "Lg01;", "density", "Lkw1$b;", "fontFamilyResolver", "", "softWrap", "Ln26;", "overflow", "", "maxLines", "minLines", "LTU3;", "placeholders", "c", "(LT06;LDf;LG26;Lg01;Lkw1$b;ZIIILjava/util/List;)LT06;", "e", "(LT06;Ljava/lang/String;LG26;Lg01;Lkw1$b;ZIII)LT06;", "", "LL22;", "inlineContent", "Lkotlin/Pair;", "Landroidx/compose/foundation/text/PlaceholderRange;", "b", "Lkotlin/Pair;", "EmptyInlineContent", "InlineContentRange", "PlaceholderRange", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCoreText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/CoreTextKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,702:1\n33#2,4:703\n38#2:738\n33#2,6:739\n71#3,4:707\n75#3,11:712\n88#3:737\n76#4:711\n456#5,14:723\n*S KotlinDebug\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/CoreTextKt\n*L\n81#1:703,4\n81#1:738\n682#1:739,6\n82#1:707,4\n82#1:712,11\n82#1:737\n82#1:711\n82#1:723,14\n*E\n"})
/* renamed from: JC0 */
/* loaded from: classes.dex */
public final class JC0 {

    /* renamed from: a */
    public static final Pair<List<C1577Df.C1580b<TU3>>, List<C1577Df.C1580b<Function3<String, InterfaceC32720Et0, Integer, Unit>>>> f16986a;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nCoreText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/CoreTextKt$InlineChildren$1$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,702:1\n151#2,3:703\n33#2,4:706\n154#2,2:710\n38#2:712\n156#2:713\n*S KotlinDebug\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/CoreTextKt$InlineChildren$1$2\n*L\n85#1:703,3\n85#1:706,4\n85#1:710,2\n85#1:712\n85#1:713\n*E\n"})
    /* renamed from: JC0$a */
    /* loaded from: classes.dex */
    public static final class C3919a implements InterfaceC51579xO2 {

        /* renamed from: a */
        public static final C3919a f16987a = new C3919a();

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nCoreText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/CoreTextKt$InlineChildren$1$2$measure$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,702:1\n33#2,6:703\n*S KotlinDebug\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/CoreTextKt$InlineChildren$1$2$measure$1\n*L\n87#1:703,6\n*E\n"})
        /* renamed from: JC0$a$a */
        /* loaded from: classes.dex */
        public static final class C3920a extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

            /* renamed from: g */
            public final /* synthetic */ List<OU3> f16988g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C3920a(List<? extends OU3> list) {
                super(1);
                this.f16988g = list;
            }

            /* renamed from: a */
            public final void m101025a(OU3.AbstractC6015a layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                List<OU3> list = this.f16988g;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    OU3.AbstractC6015a.m92205r(layout, list.get(i), 0, 0, 0.0f, 4, null);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
                m101025a(abstractC6015a);
                return Unit.INSTANCE;
            }
        }

        @Override // p000.InterfaceC51579xO2
        /* renamed from: a */
        public final InterfaceC52172yO2 mo3160a(InterfaceC52765zO2 Layout, List<? extends InterfaceC50393vO2> children, long j) {
            Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
            Intrinsics.checkNotNullParameter(children, "children");
            ArrayList arrayList = new ArrayList(children.size());
            int size = children.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(children.get(i).mo8763P0(j));
            }
            return InterfaceC52765zO2.m1430Y(Layout, C44228kz0.m28063n(j), C44228kz0.m28064m(j), null, new C3920a(arrayList), 4, null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: JC0$b */
    /* loaded from: classes.dex */
    public static final class C3921b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C1577Df f16989g;

        /* renamed from: h */
        public final /* synthetic */ List<C1577Df.C1580b<Function3<String, InterfaceC32720Et0, Integer, Unit>>> f16990h;

        /* renamed from: i */
        public final /* synthetic */ int f16991i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3921b(C1577Df c1577Df, List<C1577Df.C1580b<Function3<String, InterfaceC32720Et0, Integer, Unit>>> list, int i) {
            super(2);
            this.f16989g = c1577Df;
            this.f16990h = list;
            this.f16991i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            JC0.m101030a(this.f16989g, this.f16990h, interfaceC32720Et0, C47127ps4.m18626a(this.f16991i | 1));
        }
    }

    static {
        List emptyList;
        List emptyList2;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        emptyList2 = CollectionsKt__CollectionsKt.emptyList();
        f16986a = new Pair<>(emptyList, emptyList2);
    }

    /* renamed from: a */
    public static final void m101030a(C1577Df text, List<C1577Df.C1580b<Function3<String, InterfaceC32720Et0, Integer, Unit>>> inlineContents, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(inlineContents, "inlineContents");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-110905764);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-110905764, i, -1, "androidx.compose.foundation.text.InlineChildren (CoreText.kt:76)");
        }
        int size = inlineContents.size();
        int i2 = 0;
        while (i2 < size) {
            C1577Df.C1580b<Function3<String, InterfaceC32720Et0, Integer, Unit>> c1580b = inlineContents.get(i2);
            Function3<String, InterfaceC32720Et0, Integer, Unit> m110032a = c1580b.m110032a();
            int m110031b = c1580b.m110031b();
            int m110030c = c1580b.m110030c();
            C3919a c3919a = C3919a.f16987a;
            mo89518u.mo89638F(-1323940314);
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(c20912a);
            int i3 = size;
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
            C38680bf6.m64191b(m64192a, c3919a, c0757a.m113412d());
            C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
            C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
            C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
            m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
            mo89518u.mo89638F(2058660585);
            m110032a.invoke(text.subSequence(m110031b, m110030c).m110052j(), mo89518u, 0);
            mo89518u.mo89605Q();
            mo89518u.mo89563f();
            mo89518u.mo89605Q();
            i2++;
            size = i3;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C3921b(text, inlineContents, i));
        }
    }

    /* renamed from: b */
    public static final Pair<List<C1577Df.C1580b<TU3>>, List<C1577Df.C1580b<Function3<String, InterfaceC32720Et0, Integer, Unit>>>> m101029b(C1577Df text, Map<String, L22> inlineContent) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(inlineContent, "inlineContent");
        if (inlineContent.isEmpty()) {
            return f16986a;
        }
        List<C1577Df.C1580b<String>> m110053i = text.m110053i("androidx.compose.foundation.text.inlineContent", 0, text.length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = m110053i.size();
        for (int i = 0; i < size; i++) {
            C1577Df.C1580b<String> c1580b = m110053i.get(i);
            L22 l22 = inlineContent.get(c1580b.m110028e());
            if (l22 != null) {
                arrayList.add(new C1577Df.C1580b(l22.m97907b(), c1580b.m110027f(), c1580b.m110029d()));
                arrayList2.add(new C1577Df.C1580b(l22.m97908a(), c1580b.m110027f(), c1580b.m110029d()));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    /* renamed from: c */
    public static final T06 m101028c(T06 current, C1577Df text, G26 style, InterfaceC41273g01 density, AbstractC44199kw1.InterfaceC25559b fontFamilyResolver, boolean z, int i, int i2, int i3, List<C1577Df.C1580b<TU3>> placeholders) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        if (Intrinsics.areEqual(current.m84434l(), text) && Intrinsics.areEqual(current.m84435k(), style)) {
            if (current.m84436j() == z) {
                if (C45449n26.m24543e(current.m84438h(), i)) {
                    if (current.m84442d() == i2) {
                        if (current.m84440f() == i3 && Intrinsics.areEqual(current.m84445a(), density) && Intrinsics.areEqual(current.m84437i(), placeholders) && current.m84444b() == fontFamilyResolver) {
                            return current;
                        }
                        return new T06(text, style, i2, i3, z, i, density, fontFamilyResolver, placeholders, null);
                    }
                    return new T06(text, style, i2, i3, z, i, density, fontFamilyResolver, placeholders, null);
                }
                return new T06(text, style, i2, i3, z, i, density, fontFamilyResolver, placeholders, null);
            }
        }
        return new T06(text, style, i2, i3, z, i, density, fontFamilyResolver, placeholders, null);
    }

    /* renamed from: d */
    public static /* synthetic */ T06 m101027d(T06 t06, C1577Df c1577Df, G26 g26, InterfaceC41273g01 interfaceC41273g01, AbstractC44199kw1.InterfaceC25559b interfaceC25559b, boolean z, int i, int i2, int i3, List list, int i4, Object obj) {
        boolean z2;
        int i5;
        int i6;
        int i7;
        if ((i4 & 32) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i4 & 64) != 0) {
            i5 = C45449n26.f99264a.m24540a();
        } else {
            i5 = i;
        }
        if ((i4 & 128) != 0) {
            i6 = Integer.MAX_VALUE;
        } else {
            i6 = i2;
        }
        if ((i4 & 256) != 0) {
            i7 = 1;
        } else {
            i7 = i3;
        }
        return m101028c(t06, c1577Df, g26, interfaceC41273g01, interfaceC25559b, z2, i5, i6, i7, list);
    }

    /* renamed from: e */
    public static final T06 m101026e(T06 current, String text, G26 style, InterfaceC41273g01 density, AbstractC44199kw1.InterfaceC25559b fontFamilyResolver, boolean z, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        if (Intrinsics.areEqual(current.m84434l().m110052j(), text) && Intrinsics.areEqual(current.m84435k(), style)) {
            if (current.m84436j() == z) {
                if (C45449n26.m24543e(current.m84438h(), i)) {
                    if (current.m84442d() == i2) {
                        if (current.m84440f() == i3 && Intrinsics.areEqual(current.m84445a(), density) && current.m84444b() == fontFamilyResolver) {
                            return current;
                        }
                        return new T06(new C1577Df(text, null, null, 6, null), style, i2, i3, z, i, density, fontFamilyResolver, null, 256, null);
                    }
                    return new T06(new C1577Df(text, null, null, 6, null), style, i2, i3, z, i, density, fontFamilyResolver, null, 256, null);
                }
                return new T06(new C1577Df(text, null, null, 6, null), style, i2, i3, z, i, density, fontFamilyResolver, null, 256, null);
            }
        }
        return new T06(new C1577Df(text, null, null, 6, null), style, i2, i3, z, i, density, fontFamilyResolver, null, 256, null);
    }
}
