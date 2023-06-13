package p000;

import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.services.p026s3.internal.Constants;
import com.facebook.share.internal.C17296a;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.HttpUrl;
import p000.InterfaceC46785pI4;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u000022\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00030\u0001j\u0002`\u0004B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00032\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u0003H\u0096\u0002J(\u0010\r\u001a\u00020\t2\u001e\u0010\f\u001a\u001a\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b0\u0007j\u0002`\u000bH\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J,\u0010\u0013\u001a\u00020\u0012*\u00020\u00122\u001e\u0010\f\u001a\u001a\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b0\u0007j\u0002`\u000bH\u0002¨\u0006\u0016"}, m28432d2 = {"LHE3;", "Lkotlin/Function1;", "LpI4;", "Lcom/github/kittinunf/fuel/core/RequestTransformer;", "Lcom/github/kittinunf/fuel/core/FoldableRequestInterceptor;", "next", "f", "", "Lkotlin/Pair;", "", "", "Lcom/github/kittinunf/fuel/core/Parameters;", "parameters", "e", "LWT2;", "method", "", DateTokenConverter.CONVERTER_KEY, "Ljava/net/URL;", "g", "<init>", "()V", "fuel"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: HE3 */
/* loaded from: classes5.dex */
public final class HE3 implements Function1<Function1<? super InterfaceC46785pI4, ? extends InterfaceC46785pI4>, Function1<? super InterfaceC46785pI4, ? extends InterfaceC46785pI4>> {

    /* renamed from: b */
    public static final HE3 f13115b = new HE3();

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: HE3$a */
    /* loaded from: classes5.dex */
    public static final class C3093a extends Lambda implements Function1<Pair<? extends String, ? extends String>, CharSequence> {

        /* renamed from: g */
        public static final C3093a f13116g = new C3093a();

        public C3093a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ CharSequence invoke(Pair<? extends String, ? extends String> pair) {
            return invoke2((Pair<String, String>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final CharSequence invoke2(Pair<String, String> pair) {
            boolean isBlank;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            String component1 = pair.component1();
            String value = pair.component2();
            Intrinsics.checkNotNullExpressionValue(value, "value");
            isBlank = StringsKt__StringsJVMKt.isBlank(value);
            if (isBlank) {
                return component1;
            }
            return component1 + '=' + value;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LpI4;", "request", C17296a.f69688o, "(LpI4;)LpI4;"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: HE3$b */
    /* loaded from: classes5.dex */
    public static final class C3094b extends Lambda implements Function1<InterfaceC46785pI4, InterfaceC46785pI4> {

        /* renamed from: g */
        public final /* synthetic */ Function1 f13117g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3094b(Function1 function1) {
            super(1);
            this.f13117g = function1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
            if (r1 != false) goto L20;
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final InterfaceC46785pI4 invoke(InterfaceC46785pI4 request) {
            Object lastOrNull;
            List<? extends Pair<String, ? extends Object>> emptyList;
            List<? extends Pair<String, ? extends Object>> emptyList2;
            boolean startsWith$default;
            boolean isBlank;
            boolean startsWith$default2;
            Intrinsics.checkNotNullParameter(request, "request");
            lastOrNull = CollectionsKt___CollectionsKt.lastOrNull(request.get("Content-Type"));
            String str = (String) lastOrNull;
            boolean z = true;
            if (str != null) {
                startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(str, "multipart/form-data", false, 2, null);
                if (startsWith$default2) {
                    return (InterfaceC46785pI4) this.f13117g.invoke(request);
                }
            }
            if (request.mo8554n().isEmpty()) {
                HE3 he3 = HE3.f13115b;
                if (he3.m104148d(request.mo8555m())) {
                    if (str != null) {
                        isBlank = StringsKt__StringsJVMKt.isBlank(str);
                        if (!isBlank) {
                            z = false;
                        }
                    }
                    if (!z) {
                        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str, "application/x-www-form-urlencoded", false, 2, null);
                    }
                    Function1 function1 = this.f13117g;
                    InterfaceC46785pI4 m19560a = InterfaceC46785pI4.C27245a.m19560a(request.mo8559i("Content-Type", "application/x-www-form-urlencoded"), he3.m104147e(request.getParameters()), null, 2, null);
                    emptyList2 = CollectionsKt__CollectionsKt.emptyList();
                    m19560a.mo8562f(emptyList2);
                    Unit unit = Unit.INSTANCE;
                    return (InterfaceC46785pI4) function1.invoke(m19560a);
                }
            }
            Function1 function12 = this.f13117g;
            request.mo8566b(HE3.f13115b.m104145g(request.mo8567a(), request.getParameters()));
            Unit unit2 = Unit.INSTANCE;
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            request.mo8562f(emptyList);
            return (InterfaceC46785pI4) function12.invoke(request);
        }
    }

    private HE3() {
    }

    /* renamed from: d */
    public final boolean m104148d(WT2 wt2) {
        int i = GE3.$EnumSwitchMapping$0[wt2.ordinal()];
        return i == 1 || i == 2 || i == 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
        r2 = kotlin.collections.CollectionsKt___CollectionsKt.toList(r2);
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m104147e(List<? extends Pair<String, ? extends Object>> list) {
        String joinToString$default;
        Object obj;
        Object obj2;
        Collection listOf;
        int collectionSizeOrDefault;
        List list2;
        boolean z;
        ArrayList<Pair> arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (((Pair) obj3).component2() == null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            List list3 = null;
            if (!(component2 instanceof Iterable)) {
                obj = null;
            } else {
                obj = component2;
            }
            Iterable iterable = (Iterable) obj;
            if (iterable != null && list2 != null) {
                list3 = list2;
            } else {
                if (!(component2 instanceof Object[])) {
                    obj2 = null;
                } else {
                    obj2 = component2;
                }
                Object[] objArr = (Object[]) obj2;
                if (objArr != null) {
                    list3 = ArraysKt___ArraysKt.toList(objArr);
                }
            }
            if (list3 == null) {
                listOf = CollectionsKt__CollectionsJVMKt.listOf(TuplesKt.m28425to(URLEncoder.encode(str, Constants.DEFAULT_ENCODING), URLEncoder.encode(String.valueOf(component2), Constants.DEFAULT_ENCODING)));
            } else {
                String str2 = URLEncoder.encode(str, Constants.DEFAULT_ENCODING) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
                List<Object> list4 = list3;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10);
                listOf = new ArrayList(collectionSizeOrDefault);
                for (Object obj4 : list4) {
                    listOf.add(TuplesKt.m28425to(str2, URLEncoder.encode(String.valueOf(obj4), Constants.DEFAULT_ENCODING)));
                }
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList2, listOf);
        }
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList2, "&", null, null, 0, null, C3093a.f13116g, 30, null);
        return joinToString$default;
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: f */
    public Function1<InterfaceC46785pI4, InterfaceC46785pI4> invoke(Function1<? super InterfaceC46785pI4, ? extends InterfaceC46785pI4> next) {
        Intrinsics.checkNotNullParameter(next, "next");
        return new C3094b(next);
    }

    /* renamed from: g */
    public final URL m104145g(URL url, List<? extends Pair<String, ? extends Object>> list) {
        boolean z;
        boolean contains$default;
        String str;
        String m104147e = f13115b.m104147e(list);
        boolean z2 = true;
        if (m104147e.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return url;
        }
        String externalForm = url.toExternalForm();
        Intrinsics.checkNotNullExpressionValue(externalForm, "toExternalForm()");
        contains$default = StringsKt__StringsKt.contains$default((CharSequence) externalForm, '?', false, 2, (Object) null);
        if (contains$default) {
            String query = url.getQuery();
            Intrinsics.checkNotNullExpressionValue(query, "query");
            if (query.length() <= 0) {
                z2 = false;
            }
            if (z2) {
                str = "&";
            } else {
                str = "";
            }
        } else {
            str = CallerData.f61059NA;
        }
        return new URL(url.toExternalForm() + str + m104147e);
    }
}
