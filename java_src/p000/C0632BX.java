package p000;

import android.util.SparseArray;
import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
/* renamed from: BX */
/* loaded from: classes8.dex */
public class C0632BX {
    /* renamed from: a */
    public static String m113905a(SparseArray<byte[]> sparseArray) {
        if (sparseArray == null) {
            return "null";
        }
        if (sparseArray.size() == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(CoreConstants.CURLY_LEFT);
        for (int i = 0; i < sparseArray.size(); i++) {
            sb.append(sparseArray.keyAt(i));
            sb.append("=");
            sb.append(Arrays.toString(sparseArray.valueAt(i)));
        }
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }

    /* renamed from: b */
    public static <T> String m113904b(Map<T, byte[]> map) {
        if (map == null) {
            return "null";
        }
        if (map.isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(CoreConstants.CURLY_LEFT);
        Iterator<Map.Entry<T, byte[]>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            T key = it.next().getKey();
            sb.append(key);
            sb.append("=");
            sb.append(Arrays.toString(map.get(key)));
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }
}
