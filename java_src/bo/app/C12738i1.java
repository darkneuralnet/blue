package bo.app;

import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\t"}, m28432d2 = {"Lbo/app/i1;", "", "Lorg/json/JSONArray;", "geofenceJson", "", "Ld20;", C17296a.f69688o, "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.i1 */
/* loaded from: classes.dex */
public final class C12738i1 {

    /* renamed from: a */
    public static final C12738i1 f58634a = new C12738i1();

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.i1$a */
    /* loaded from: classes.dex */
    public static final class C12739a extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12739a f58635b = new C12739a();

        public C12739a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Received null or blank geofence Json. Not parsing.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.i1$b */
    /* loaded from: classes.dex */
    public static final class C12740b extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ JSONObject f58636b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12740b(JSONObject jSONObject) {
            super(0);
            this.f58636b = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to deserialize geofence Json due to JSONException: ", this.f58636b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.i1$c */
    /* loaded from: classes.dex */
    public static final class C12741c extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ JSONObject f58637b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12741c(JSONObject jSONObject) {
            super(0);
            this.f58637b = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to deserialize geofence Json:", this.f58637b);
        }
    }

    private C12738i1() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final List<C39514d20> m63595a(JSONArray geofenceJson) {
        Intrinsics.checkNotNullParameter(geofenceJson, "geofenceJson");
        ArrayList arrayList = new ArrayList();
        int length = geofenceJson.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            JSONObject optJSONObject = geofenceJson.optJSONObject(i);
            if (optJSONObject == null) {
                try {
                    C43664k20.m29442e(C43664k20.f93782a, f58634a, C43664k20.EnumC25082a.W, null, false, C12739a.f58635b, 6, null);
                } catch (JSONException e) {
                    C43664k20.m29442e(C43664k20.f93782a, f58634a, C43664k20.EnumC25082a.W, e, false, new C12740b(optJSONObject), 4, null);
                } catch (Exception e2) {
                    C43664k20.m29442e(C43664k20.f93782a, f58634a, C43664k20.EnumC25082a.E, e2, false, new C12741c(optJSONObject), 4, null);
                }
            } else {
                arrayList.add(new C39514d20(optJSONObject));
            }
            i = i2;
        }
        return arrayList;
    }
}
