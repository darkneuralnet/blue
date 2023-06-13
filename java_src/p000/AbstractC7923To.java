package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: To */
/* loaded from: classes6.dex */
public abstract class AbstractC7923To {
    /* renamed from: a */
    public static AbstractC7923To m82975a(long j, Map<String, AbstractC7546So> map) {
        return new C40291eL6(j, map);
    }

    /* renamed from: b */
    public static AbstractC7923To m82974b(Bundle bundle, C51556xL6 c51556xL6) {
        return m82973c(bundle, c51556xL6, new ArrayList());
    }

    /* renamed from: c */
    public static AbstractC7923To m82973c(Bundle bundle, C51556xL6 c51556xL6, List<String> list) {
        return m82972d(bundle, c51556xL6, list, FK6.f9199b);
    }

    /* renamed from: d */
    public static AbstractC7923To m82972d(Bundle bundle, C51556xL6 c51556xL6, List<String> list, DK6 dk6) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        HashMap hashMap = new HashMap();
        int size = stringArrayList.size();
        for (int i = 0; i < size; i++) {
            String str = stringArrayList.get(i);
            hashMap.put(str, AbstractC7546So.m84819e(bundle, str, c51556xL6, dk6));
        }
        for (String str2 : list) {
            hashMap.put(str2, AbstractC7546So.m84820d(str2, 4, 0, 0L, 0L, 0.0d, 1, ""));
        }
        return m82975a(bundle.getLong("total_bytes_to_download"), hashMap);
    }

    /* renamed from: e */
    public abstract Map<String, AbstractC7546So> mo43013e();

    /* renamed from: f */
    public abstract long mo43012f();
}
