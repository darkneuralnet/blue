package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.http.HttpHeader;
import com.amazonaws.services.p026s3.Headers;
import com.facebook.share.internal.C17296a;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00142\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00020\u0003j\u0002`\u00040\u0001:\u00017B\u0007¢\u0006\u0004\b5\u00106J\b\u0010\u0006\u001a\u00020\u0005H\u0016J0\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00020\u0003j\u0002`\u0004H\u0016J\u001a\u0010\f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00022\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0003J\u0016\u0010\u000e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\rJ(\u0010\u0011\u001a\u00020\u00052\u001e\u0010\u0010\u001a\u001a\u0012\u0006\b\u0001\u0012\u00020\u0002\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00020\u0003j\u0002`\u00040\u000fH\u0016J\u001e\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u001a\u0010\u0015\u001a\u00020\u00132\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00020\u0003j\u0002`\u0004H\u0016J\u001b\u0010\u0016\u001a\f\u0012\u0004\u0012\u00020\u00020\u0003j\u0002`\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0002J\u0019\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0086\u0002J#\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00022\u0010\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\u00020\u0003j\u0002`\u0004H\u0086\u0002J\b\u0010\u0019\u001a\u00020\u0013H\u0016J|\u0010\u001f\u001a\u00020\u000528\u0010\u001d\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u001a2:\b\u0002\u0010\u001e\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u001aJ\b\u0010 \u001a\u00020\u0002H\u0016RB\u0010&\u001a.\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030!j\u0018\u0012\u0004\u0012\u00020\"\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00020\u0003j\u0002`\u0004`#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R0\u0010+\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00020\u0003j\u0002`\u00040(0'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*R$\u0010\u000b\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00020\u0003j\u0002`\u00040.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00104\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00068"}, m28432d2 = {"LLH1;", "", "", "", "Lcom/github/kittinunf/fuel/core/HeaderValues;", "", "clear", "key", "value", "m", "header", "values", "e", "", DateTokenConverter.CONVERTER_KEY, "", "from", "putAll", "n", "", "f", "g", "h", "o", "p", "isEmpty", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "set", "add", "q", "toString", "Ljava/util/HashMap;", "LEH1;", "Lkotlin/collections/HashMap;", "b", "Ljava/util/HashMap;", "contents", "", "", "i", "()Ljava/util/Set;", "entries", "j", UserMetadata.KEYDATA_FILENAME, "", "l", "()Ljava/util/Collection;", "", "k", "()I", "size", "<init>", "()V", C17296a.f69688o, "fuel"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: LH1 */
/* loaded from: classes5.dex */
public final class LH1 implements Map<String, Collection<? extends String>>, KMutableMap {

    /* renamed from: c */
    public static final Map<EH1, Boolean> f21031c;

    /* renamed from: d */
    public static final Map<EH1, Boolean> f21032d;

    /* renamed from: e */
    public static final Map<EH1, String> f21033e;

    /* renamed from: f */
    public static final C4792a f21034f = new C4792a(null);

    /* renamed from: b */
    public HashMap<EH1, Collection<String>> f21035b = new HashMap<>();

    @Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u001d\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b/\u00100J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J \u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bJ \u0010\u0010\u001a\u00020\u000f2\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\r0\u0007J\u001c\u0010\u0013\u001a\u00020\u000f2\u0014\u0010\u0012\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0011J9\u0010\u0015\u001a\u00020\u000f2*\u0010\u000e\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\r0\u0014\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u0014\u0010\u001e\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u0014\u0010#\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u0014\u0010$\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0018R\u0014\u0010%\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u0014\u0010&\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0018R\u0014\u0010'\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0018R\u0014\u0010(\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0018R\u0014\u0010)\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0018R\u0014\u0010*\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0018R\u0014\u0010+\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u0018R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010 R\u0014\u0010-\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\u0018R\u0014\u0010.\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\u0018¨\u00061"}, m28432d2 = {"LLH1$a;", "", "LEH1;", "header", "", "e", "f", "", "", "Lcom/github/kittinunf/fuel/core/HeaderValues;", "values", C17296a.f69688o, "g", "Lkotlin/Pair;", "pairs", "LLH1;", "b", "", Stripe3ds2AuthParams.FIELD_SOURCE, "c", "", DateTokenConverter.CONVERTER_KEY, "([Lkotlin/Pair;)LLH1;", "ACCEPT", "Ljava/lang/String;", "ACCEPT_ENCODING", "ACCEPT_LANGUAGE", "ACCEPT_TRANSFER_ENCODING", "AGE", "AUTHORIZATION", "CACHE_CONTROL", "COLLAPSE_SEPARATOR", "Ljava/util/Map;", "COLLAPSIBLE_HEADERS", "CONTENT_DISPOSITION", "CONTENT_ENCODING", "CONTENT_LENGTH", "CONTENT_LOCATION", "CONTENT_TYPE", "COOKIE", "EXPECT", "EXPIRES", "LOCATION", "SET_COOKIE", "SINGLE_VALUE_HEADERS", "TRANSFER_ENCODING", "USER_AGENT", "<init>", "()V", "fuel"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: LH1$a */
    /* loaded from: classes5.dex */
    public static final class C4792a {
        private C4792a() {
        }

        /* renamed from: a */
        public final String m97405a(EH1 header, Collection<String> values) {
            String joinToString$default;
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(values, "values");
            Collection<String> collection = values;
            String str = (String) LH1.f21033e.get(header);
            if (str == null) {
                str = ", ";
            }
            joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(collection, str, null, null, 0, null, null, 62, null);
            return joinToString$default;
        }

        /* renamed from: b */
        public final LH1 m97404b(Collection<? extends Pair<String, ? extends Object>> pairs) {
            boolean isBlank;
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(pairs, "pairs");
            LH1 lh1 = new LH1();
            Iterator<T> it = pairs.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                String str = (String) pair.getFirst();
                if (str == null) {
                    str = "";
                }
                isBlank = StringsKt__StringsJVMKt.isBlank(str);
                Collection collection = null;
                if (isBlank) {
                    str = null;
                }
                if (str != null) {
                    Object second = pair.getSecond();
                    if (second instanceof Collection) {
                        Collection collection2 = (Collection) second;
                        if (!collection2.isEmpty()) {
                            collection = collection2;
                        }
                        if (collection != null) {
                            Collection<Object> collection3 = collection;
                            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(collection3, 10);
                            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                            for (Object obj : collection3) {
                                arrayList.add(String.valueOf(obj));
                            }
                            lh1 = lh1.m97419e(str, arrayList);
                        }
                    } else {
                        lh1 = lh1.m97420d(str, second.toString());
                    }
                }
            }
            return lh1;
        }

        /* renamed from: c */
        public final LH1 m97403c(Map<? extends String, ? extends Object> source) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(source, "source");
            Set<Map.Entry<? extends String, ? extends Object>> entrySet = source.entrySet();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(entrySet, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                arrayList.add(new Pair(entry.getKey(), entry.getValue()));
            }
            return m97404b(arrayList);
        }

        /* renamed from: d */
        public final LH1 m97402d(Pair<String, ? extends Object>... pairs) {
            List list;
            Intrinsics.checkNotNullParameter(pairs, "pairs");
            list = ArraysKt___ArraysKt.toList(pairs);
            return m97404b(list);
        }

        /* renamed from: e */
        public final boolean m97401e(EH1 header) {
            Intrinsics.checkNotNullParameter(header, "header");
            Object obj = LH1.f21031c.get(header);
            if (obj == null) {
                obj = Boolean.valueOf(!LH1.f21034f.m97400f(header));
            }
            return ((Boolean) obj).booleanValue();
        }

        /* renamed from: f */
        public final boolean m97400f(EH1 header) {
            Intrinsics.checkNotNullParameter(header, "header");
            Boolean bool = (Boolean) LH1.f21032d.get(header);
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        /* renamed from: g */
        public final boolean m97399g(String header) {
            Intrinsics.checkNotNullParameter(header, "header");
            return m97400f(new EH1(header));
        }

        public /* synthetic */ C4792a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Map<EH1, Boolean> mapOf;
        Map<EH1, Boolean> mapOf2;
        Map<EH1, String> mapOf3;
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(new EH1("Set-Cookie"), Boolean.FALSE));
        f21031c = mapOf;
        EH1 eh1 = new EH1("Age");
        Boolean bool = Boolean.TRUE;
        mapOf2 = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(eh1, bool), TuplesKt.m28425to(new EH1(Headers.CONTENT_ENCODING), bool), TuplesKt.m28425to(new EH1("Content-Length"), bool), TuplesKt.m28425to(new EH1("Content-Location"), bool), TuplesKt.m28425to(new EH1("Content-Type"), bool), TuplesKt.m28425to(new EH1(HttpHeader.EXPECT), bool), TuplesKt.m28425to(new EH1(Headers.EXPIRES), bool), TuplesKt.m28425to(new EH1(HttpHeader.LOCATION), bool), TuplesKt.m28425to(new EH1("User-Agent"), bool));
        f21032d = mapOf2;
        mapOf3 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(new EH1(RequestHeadersFactory.FraudDetection.HEADER_COOKIE), "; "));
        f21033e = mapOf3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public static /* synthetic */ void m97406r(LH1 lh1, Function2 function2, Function2 function22, int i, Object obj) {
        if ((i & 2) != 0) {
            function22 = function2;
        }
        lh1.m97407q(function2, function22);
    }

    @Override // java.util.Map
    public void clear() {
        this.f21035b.clear();
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return m97418f((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Collection) {
            return m97417g((Collection) obj);
        }
        return false;
    }

    /* renamed from: d */
    public final LH1 m97420d(String header, Object value) {
        List plus;
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(value, "value");
        boolean m97399g = f21034f.m97399g(header);
        if (m97399g) {
            return m97409o(header, value.toString());
        }
        if (!m97399g) {
            plus = CollectionsKt___CollectionsKt.plus((Collection<? extends String>) ((Collection<? extends Object>) get(header)), value.toString());
            return m97408p(header, plus);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: e */
    public final LH1 m97419e(String header, Collection<?> values) {
        int collectionSizeOrDefault;
        List plus;
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(values, "values");
        Collection<? extends String> collection = get(header);
        Collection<?> collection2 = values;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(collection2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next()));
        }
        plus = CollectionsKt___CollectionsKt.plus((Collection) collection, (Iterable) arrayList);
        put(header, plus);
        return this;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, Collection<? extends String>>> entrySet() {
        return m97415i();
    }

    /* renamed from: f */
    public boolean m97418f(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f21035b.containsKey(new EH1(key));
    }

    /* renamed from: g */
    public boolean m97417g(Collection<String> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f21035b.containsValue(value);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<? extends String> get(Object obj) {
        if (obj instanceof String) {
            return m97416h((String) obj);
        }
        return null;
    }

    /* renamed from: h */
    public Collection<String> m97416h(String key) {
        Object lastOrNull;
        List listOfNotNull;
        List emptyList;
        Intrinsics.checkNotNullParameter(key, "key");
        EH1 eh1 = new EH1(key);
        List list = this.f21035b.get(eh1);
        if (list == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            list = emptyList;
        }
        boolean m97400f = f21034f.m97400f(eh1);
        if (m97400f) {
            lastOrNull = CollectionsKt___CollectionsKt.lastOrNull(list);
            listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(lastOrNull);
            return listOfNotNull;
        } else if (!m97400f) {
            return list;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: i */
    public Set<Map.Entry<String, Collection<String>>> m97415i() {
        int mapCapacity;
        Map mutableMap;
        HashMap<EH1, Collection<String>> hashMap = this.f21035b;
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(hashMap.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        Iterator<T> it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(((EH1) entry.getKey()).m109248a(), entry.getValue());
        }
        mutableMap = MapsKt__MapsKt.toMutableMap(linkedHashMap);
        return mutableMap.entrySet();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f21035b.isEmpty();
    }

    /* renamed from: j */
    public Set<String> m97414j() {
        int collectionSizeOrDefault;
        Set<String> mutableSet;
        Set<EH1> keySet = this.f21035b.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "contents.keys");
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(keySet, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (EH1 eh1 : keySet) {
            arrayList.add(eh1.m109248a());
        }
        mutableSet = CollectionsKt___CollectionsKt.toMutableSet(new HashSet(arrayList));
        return mutableSet;
    }

    /* renamed from: k */
    public int m97413k() {
        return this.f21035b.size();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return m97414j();
    }

    /* renamed from: l */
    public Collection<Collection<String>> m97412l() {
        Collection<Collection<String>> values = this.f21035b.values();
        Intrinsics.checkNotNullExpressionValue(values, "contents.values");
        return values;
    }

    @Override // java.util.Map
    /* renamed from: m */
    public Collection<String> put(String key, Collection<String> value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f21035b.put(new EH1(key), value);
    }

    /* renamed from: n */
    public Collection<String> m97410n(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f21035b.remove(new EH1(key));
    }

    /* renamed from: o */
    public final LH1 m97409o(String key, String value) {
        List listOf;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        listOf = CollectionsKt__CollectionsJVMKt.listOf(value);
        put(key, listOf);
        return this;
    }

    /* renamed from: p */
    public final LH1 m97408p(String key, Collection<String> values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        put(key, values);
        return this;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends Collection<? extends String>> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        for (Map.Entry<String, Collection<? extends String>> entry : f21034f.m97403c(from).entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public final void m97407q(Function2<? super String, ? super String, ? extends Object> set, Function2<? super String, ? super String, ? extends Object> add) {
        Object lastOrNull;
        Intrinsics.checkNotNullParameter(set, "set");
        Intrinsics.checkNotNullParameter(add, "add");
        for (Map.Entry<String, Collection<? extends String>> entry : entrySet()) {
            String key = entry.getKey();
            Collection<? extends String> value = entry.getValue();
            EH1 eh1 = new EH1(key);
            C4792a c4792a = f21034f;
            boolean m97401e = c4792a.m97401e(eh1);
            if (m97401e) {
                set.invoke(key, c4792a.m97405a(eh1, value));
            } else if (!m97401e) {
                boolean m97400f = c4792a.m97400f(eh1);
                if (m97400f) {
                    lastOrNull = CollectionsKt___CollectionsKt.lastOrNull(value);
                    String str = (String) lastOrNull;
                    if (str != null) {
                        set.invoke(key, str);
                    }
                } else if (!m97400f) {
                    for (String str2 : value) {
                        add.invoke(key, str2);
                    }
                }
            }
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<? extends String> remove(Object obj) {
        if (obj instanceof String) {
            return m97410n((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m97413k();
    }

    public String toString() {
        String obj = this.f21035b.toString();
        Intrinsics.checkNotNullExpressionValue(obj, "contents.toString()");
        return obj;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<Collection<? extends String>> values() {
        return m97412l();
    }
}
