package p000;

import android.util.ArrayMap;
import java.util.Map;
import java.util.Set;
/* renamed from: xY5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C51672xY5 {

    /* renamed from: b */
    public static final C51672xY5 f117800b = new C51672xY5(new ArrayMap());

    /* renamed from: a */
    public final Map<String, Object> f117801a;

    public C51672xY5(Map<String, Object> map) {
        this.f117801a = map;
    }

    /* renamed from: a */
    public static C51672xY5 m5018a() {
        return f117800b;
    }

    /* renamed from: b */
    public static C51672xY5 m5017b(C51672xY5 c51672xY5) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : c51672xY5.m5015d()) {
            arrayMap.put(str, c51672xY5.m5016c(str));
        }
        return new C51672xY5(arrayMap);
    }

    /* renamed from: c */
    public Object m5016c(String str) {
        return this.f117801a.get(str);
    }

    /* renamed from: d */
    public Set<String> m5015d() {
        return this.f117801a.keySet();
    }

    public final String toString() {
        return "android.hardware.camera2.CaptureRequest.setTag.CX";
    }
}
