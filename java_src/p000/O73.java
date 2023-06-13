package p000;

import androidx.recyclerview.widget.C11925l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* renamed from: O73 */
/* loaded from: classes.dex */
public class O73 {

    /* renamed from: a */
    public final int f25918a;

    /* renamed from: b */
    public final byte[] f25919b;

    /* renamed from: c */
    public final Map<String, String> f25920c;

    /* renamed from: d */
    public final List<AH1> f25921d;

    /* renamed from: e */
    public final boolean f25922e;

    /* renamed from: f */
    public final long f25923f;

    @Deprecated
    public O73(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        this(i, bArr, map, m92878a(map), z, j);
    }

    /* renamed from: a */
    public static List<AH1> m92878a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new AH1(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static Map<String, String> m92877b(List<AH1> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (AH1 ah1 : list) {
            treeMap.put(ah1.m115938a(), ah1.m115937b());
        }
        return treeMap;
    }

    public O73(int i, byte[] bArr, boolean z, long j, List<AH1> list) {
        this(i, bArr, m92877b(list), list, z, j);
    }

    @Deprecated
    public O73(byte[] bArr, Map<String, String> map) {
        this((int) C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION, bArr, map, false, 0L);
    }

    public O73(int i, byte[] bArr, Map<String, String> map, List<AH1> list, boolean z, long j) {
        this.f25918a = i;
        this.f25919b = bArr;
        this.f25920c = map;
        if (list == null) {
            this.f25921d = null;
        } else {
            this.f25921d = Collections.unmodifiableList(list);
        }
        this.f25922e = z;
        this.f25923f = j;
    }
}
