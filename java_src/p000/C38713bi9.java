package p000;

import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
/* renamed from: bi9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C38713bi9 implements Iterable {

    /* renamed from: b */
    public final /* synthetic */ JSONObject f57999b;

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        JSONObject jSONObject = this.f57999b;
        ExecutorService executorService = Gi9.f12294m;
        return jSONObject.keys();
    }
}
