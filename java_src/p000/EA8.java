package p000;

import java.util.Comparator;
import java.util.Map;
/* renamed from: EA8 */
/* loaded from: classes6.dex */
public final /* synthetic */ class EA8 implements Comparator {

    /* renamed from: b */
    public static final /* synthetic */ EA8 f7071b = new EA8();

    private /* synthetic */ EA8() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Integer) ((Map.Entry) obj).getValue()).compareTo((Integer) ((Map.Entry) obj2).getValue());
    }
}
