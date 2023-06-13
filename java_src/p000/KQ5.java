package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.appboy.enums.Channel;
import com.facebook.share.internal.C17296a;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.json.JSONArray;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\r\b\u0080\b\u0018\u0000 \"2\u00020\u0001:\u0001\u0019B\u0019\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b+\u0010,J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u001c\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tJ\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u001d\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÆ\u0001J\t\u0010\u0016\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR!\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010(\u001a\u0004\u0018\u00010\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010'R\u001d\u0010*\u001a\u0004\u0018\u00010\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b)\u0010'¨\u0006-"}, m28432d2 = {"LKQ5;", "", "", "index", "e", "(I)Ljava/lang/Object;", "Ls20;", "b", "fixedArgCount", "Lkotlin/ranges/IntRange;", "rangedArgCount", "", "k", "n", "m", "", "toString", "Lorg/json/JSONObject;", "srcJson", "Lcom/appboy/enums/Channel;", "channel", "c", "hashCode", LegacyRepairType.OTHER_KEY, "equals", C17296a.f69688o, "Lorg/json/JSONObject;", "j", "()Lorg/json/JSONObject;", "Lcom/appboy/enums/Channel;", "g", "()Lcom/appboy/enums/Channel;", "", "Lkotlin/Lazy;", "f", "()Ljava/util/List;", "args", DateTokenConverter.CONVERTER_KEY, "h", "()Ljava/lang/Object;", "firstArg", "i", "secondArg", "<init>", "(Lorg/json/JSONObject;Lcom/appboy/enums/Channel;)V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: KQ5 */
/* loaded from: classes2.dex */
public final class KQ5 {

    /* renamed from: f */
    public static final C4423a f19558f = new C4423a(null);

    /* renamed from: a */
    public final JSONObject f19559a;

    /* renamed from: b */
    public final Channel f19560b;

    /* renamed from: c */
    public final Lazy f19561c;

    /* renamed from: d */
    public final Lazy f19562d;

    /* renamed from: e */
    public final Lazy f19563e;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LKQ5$a;", "", "", "ARGS", "Ljava/lang/String;", "<init>", "()V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: KQ5$a */
    /* loaded from: classes2.dex */
    public static final class C4423a {
        public /* synthetic */ C4423a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C4423a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: KQ5$b */
    /* loaded from: classes2.dex */
    public static final class C4424b extends Lambda implements Function0<List<? extends Object>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"T", "", "it", "", "b", "(I)Ljava/lang/Boolean;", "com/braze/support/JsonUtils$iterator$1"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: KQ5$b$a */
        /* loaded from: classes2.dex */
        public static final class C4425a extends Lambda implements Function1<Integer, Boolean> {

            /* renamed from: g */
            public final /* synthetic */ JSONArray f19565g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4425a(JSONArray jSONArray) {
                super(1);
                this.f19565g = jSONArray;
            }

            /* renamed from: b */
            public final Boolean m98891b(int i) {
                return Boolean.valueOf(this.f19565g.opt(i) instanceof Object);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                return m98891b(num.intValue());
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"<anonymous>", "T", "it", "", "invoke", "(I)Ljava/lang/Object;", "com/braze/support/JsonUtils$iterator$2"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: KQ5$b$b */
        /* loaded from: classes2.dex */
        public static final class C4426b extends Lambda implements Function1<Integer, Object> {

            /* renamed from: g */
            public final /* synthetic */ JSONArray f19566g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4426b(JSONArray jSONArray) {
                super(1);
                this.f19566g = jSONArray;
            }

            public final Object invoke(int i) {
                Object obj = this.f19566g.get(i);
                if (obj != null) {
                    return obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }
        }

        public C4424b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Object> invoke() {
            IntRange until;
            Sequence asSequence;
            Sequence filter;
            Sequence map;
            Iterator it;
            Sequence asSequence2;
            List<? extends Object> list;
            List emptyList;
            JSONArray optJSONArray = KQ5.this.m98896j().optJSONArray("args");
            if (optJSONArray == null) {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                it = emptyList.iterator();
            } else {
                until = RangesKt___RangesKt.until(0, optJSONArray.length());
                asSequence = CollectionsKt___CollectionsKt.asSequence(until);
                filter = SequencesKt___SequencesKt.filter(asSequence, new C4425a(optJSONArray));
                map = SequencesKt___SequencesKt.map(filter, new C4426b(optJSONArray));
                it = map.iterator();
            }
            asSequence2 = SequencesKt__SequencesKt.asSequence(it);
            list = SequencesKt___SequencesKt.toList(asSequence2);
            return list;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: KQ5$c */
    /* loaded from: classes2.dex */
    public static final class C4427c extends Lambda implements Function0<Object> {
        public C4427c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KQ5.this.m98901e(0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: KQ5$d */
    /* loaded from: classes2.dex */
    public static final class C4428d extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ int f19568g;

        /* renamed from: h */
        public final /* synthetic */ KQ5 f19569h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4428d(int i, KQ5 kq5) {
            super(0);
            this.f19568g = i;
            this.f19569h = kq5;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Expected " + this.f19568g + " arguments. Got: " + this.f19569h.m98900f();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: KQ5$e */
    /* loaded from: classes2.dex */
    public static final class C4429e extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ IntRange f19570g;

        /* renamed from: h */
        public final /* synthetic */ KQ5 f19571h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4429e(IntRange intRange, KQ5 kq5) {
            super(0);
            this.f19570g = intRange;
            this.f19571h = kq5;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Expected " + this.f19570g + " arguments. Got: " + this.f19571h.m98900f();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: KQ5$f */
    /* loaded from: classes2.dex */
    public static final class C4430f extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ int f19572g;

        /* renamed from: h */
        public final /* synthetic */ KQ5 f19573h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4430f(int i, KQ5 kq5) {
            super(0);
            this.f19572g = i;
            this.f19573h = kq5;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Argument [" + this.f19572g + "] is not a JSONObject. Source: " + this.f19573h.m98896j();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: KQ5$g */
    /* loaded from: classes2.dex */
    public static final class C4431g extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ int f19574g;

        /* renamed from: h */
        public final /* synthetic */ KQ5 f19575h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4431g(int i, KQ5 kq5) {
            super(0);
            this.f19574g = i;
            this.f19575h = kq5;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Argument [" + this.f19574g + "] is not a String. Source: " + this.f19575h.m98896j();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: KQ5$h */
    /* loaded from: classes2.dex */
    public static final class C4432h extends Lambda implements Function0<Object> {
        public C4432h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KQ5.this.m98901e(1);
        }
    }

    public KQ5(JSONObject srcJson, Channel channel) {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Intrinsics.checkNotNullParameter(srcJson, "srcJson");
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.f19559a = srcJson;
        this.f19560b = channel;
        lazy = LazyKt__LazyJVMKt.lazy(new C4424b());
        this.f19561c = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C4427c());
        this.f19562d = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C4432h());
        this.f19563e = lazy3;
    }

    /* renamed from: d */
    public static /* synthetic */ KQ5 m98902d(KQ5 kq5, JSONObject jSONObject, Channel channel, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = kq5.f19559a;
        }
        if ((i & 2) != 0) {
            channel = kq5.f19560b;
        }
        return kq5.m98903c(jSONObject, channel);
    }

    /* renamed from: l */
    public static /* synthetic */ boolean m98894l(KQ5 kq5, int i, IntRange intRange, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        if ((i2 & 2) != 0) {
            intRange = null;
        }
        return kq5.m98895k(i, intRange);
    }

    /* renamed from: b */
    public final C48407s20 m98904b(int i) {
        Object orNull;
        orNull = CollectionsKt___CollectionsKt.getOrNull(m98900f(), i);
        if (orNull != null && (orNull instanceof JSONObject)) {
            return new C48407s20((JSONObject) orNull);
        }
        return null;
    }

    /* renamed from: c */
    public final KQ5 m98903c(JSONObject srcJson, Channel channel) {
        Intrinsics.checkNotNullParameter(srcJson, "srcJson");
        Intrinsics.checkNotNullParameter(channel, "channel");
        return new KQ5(srcJson, channel);
    }

    /* renamed from: e */
    public final Object m98901e(int i) {
        Object orNull;
        orNull = CollectionsKt___CollectionsKt.getOrNull(m98900f(), i);
        return orNull;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KQ5) {
            KQ5 kq5 = (KQ5) obj;
            return Intrinsics.areEqual(this.f19559a, kq5.f19559a) && this.f19560b == kq5.f19560b;
        }
        return false;
    }

    /* renamed from: f */
    public final List<Object> m98900f() {
        return (List) this.f19561c.getValue();
    }

    /* renamed from: g */
    public final Channel m98899g() {
        return this.f19560b;
    }

    /* renamed from: h */
    public final Object m98898h() {
        return this.f19562d.getValue();
    }

    public int hashCode() {
        return (this.f19559a.hashCode() * 31) + this.f19560b.hashCode();
    }

    /* renamed from: i */
    public final Object m98897i() {
        return this.f19563e.getValue();
    }

    /* renamed from: j */
    public final JSONObject m98896j() {
        return this.f19559a;
    }

    /* renamed from: k */
    public final boolean m98895k(int i, IntRange intRange) {
        if (i != -1 && m98900f().size() != i) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C4428d(i, this), 7, null);
            return false;
        } else if (intRange != null && !intRange.contains(m98900f().size())) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C4429e(intRange, this), 7, null);
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: m */
    public final boolean m98893m(int i) {
        Object m98901e = m98901e(i);
        if (m98901e != null && !(m98901e instanceof JSONObject)) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C4430f(i, this), 7, null);
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public final boolean m98892n(int i) {
        if (m98901e(i) instanceof String) {
            return true;
        }
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C4431g(i, this), 7, null);
        return false;
    }

    public String toString() {
        return "Channel " + this.f19560b + " and json\n" + C31696Aj2.m115350i(this.f19559a);
    }

    public /* synthetic */ KQ5(JSONObject jSONObject, Channel channel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject, (i & 2) != 0 ? Channel.UNKNOWN : channel);
    }
}
