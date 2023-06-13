package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.json.JSONArray;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, m28432d2 = {"LTz0;", "Llz;", "LKQ5;", MessageExtension.FIELD_DATA, "", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "b", "", "Lorg/json/JSONObject;", "c", "(LKQ5;)Ljava/util/Iterator;", "<init>", "()V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Tz0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C36284Tz0 extends AbstractC25837lz {

    /* renamed from: b */
    public static final C36284Tz0 f36576b = new C36284Tz0();

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"T", "", "it", "", "b", "(I)Ljava/lang/Boolean;", "com/braze/support/JsonUtils$iterator$1"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: Tz0$a */
    /* loaded from: classes2.dex */
    public static final class C8163a extends Lambda implements Function1<Integer, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ JSONArray f36577g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8163a(JSONArray jSONArray) {
            super(1);
            this.f36577g = jSONArray;
        }

        /* renamed from: b */
        public final Boolean m82205b(int i) {
            return Boolean.valueOf(this.f36577g.opt(i) instanceof JSONObject);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return m82205b(num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"<anonymous>", "T", "it", "", "invoke", "(I)Ljava/lang/Object;", "com/braze/support/JsonUtils$iterator$2"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Tz0$b */
    /* loaded from: classes2.dex */
    public static final class C8164b extends Lambda implements Function1<Integer, JSONObject> {

        /* renamed from: g */
        public final /* synthetic */ JSONArray f36578g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8164b(JSONArray jSONArray) {
            super(1);
            this.f36578g = jSONArray;
        }

        public final JSONObject invoke(int i) {
            Object obj = this.f36578g.get(i);
            if (obj != null) {
                return (JSONObject) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [org.json.JSONObject, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ JSONObject invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    private C36284Tz0() {
        super(null);
    }

    @Override // p000.InterfaceC39110cO1
    /* renamed from: a */
    public boolean mo5819a(KQ5 data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data.m98896j().has("steps");
    }

    @Override // p000.InterfaceC39110cO1
    /* renamed from: b */
    public void mo5818b(Context context, KQ5 data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Iterator m82206c = m82206c(data);
        while (m82206c.hasNext()) {
            Q10.f29655a.m89130e(context, KQ5.m98902d(data, (JSONObject) m82206c.next(), null, 2, null));
        }
    }

    /* renamed from: c */
    public final /* synthetic */ Iterator m82206c(KQ5 data) {
        IntRange until;
        Sequence asSequence;
        Sequence filter;
        Sequence map;
        List emptyList;
        Intrinsics.checkNotNullParameter(data, "data");
        JSONArray jSONArray = data.m98896j().getJSONArray("steps");
        if (jSONArray == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList.iterator();
        }
        until = RangesKt___RangesKt.until(0, jSONArray.length());
        asSequence = CollectionsKt___CollectionsKt.asSequence(until);
        filter = SequencesKt___SequencesKt.filter(asSequence, new C8163a(jSONArray));
        map = SequencesKt___SequencesKt.map(filter, new C8164b(jSONArray));
        return map.iterator();
    }
}
