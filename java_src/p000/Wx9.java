package p000;

import ch.qos.logback.core.joran.action.ActionConst;
/* renamed from: Wx9 */
/* loaded from: classes5.dex */
public final class Wx9 {
    /* renamed from: a */
    public static /* synthetic */ String m77600a(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return ActionConst.NULL;
            default:
                return "END_DOCUMENT";
        }
    }
}
