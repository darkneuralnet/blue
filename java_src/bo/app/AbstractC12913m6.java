package bo.app;

import com.facebook.share.internal.C17296a;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0011\b\u0014\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lbo/app/m6;", "Lbo/app/k6;", "", "", "remoteAssetToLocalAssetPaths", "", C17296a.f69688o, "y", "()Ljava/util/Map;", "remoteAssetToLocalAssetMap", "Lorg/json/JSONObject;", "json", "<init>", "(Lorg/json/JSONObject;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.m6 */
/* loaded from: classes.dex */
public abstract class AbstractC12913m6 extends AbstractC12829k6 {

    /* renamed from: h */
    private Map<String, String> f58923h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12913m6(JSONObject json) {
        super(json);
        Intrinsics.checkNotNullParameter(json, "json");
        this.f58923h = new LinkedHashMap();
    }

    @Override // bo.app.InterfaceC13232y2
    /* renamed from: a */
    public void mo62743a(Map<String, String> remoteAssetToLocalAssetPaths) {
        Intrinsics.checkNotNullParameter(remoteAssetToLocalAssetPaths, "remoteAssetToLocalAssetPaths");
        this.f58923h = new HashMap(remoteAssetToLocalAssetPaths);
    }

    /* renamed from: y */
    public Map<String, String> m63306y() {
        Map<String, String> map;
        map = MapsKt__MapsKt.toMap(this.f58923h);
        return map;
    }
}
