package p000;

import ch.qos.logback.core.CoreConstants;
/* renamed from: gV0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C41561gV0 {
    private C41561gV0() {
    }

    /* renamed from: a */
    public static void m39267a(Object obj, StringBuilder sb) {
        int lastIndexOf;
        if (obj == null) {
            sb.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append(CoreConstants.CURLY_LEFT);
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }
}
