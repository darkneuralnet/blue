package co.bird.android.model;

import kotlin.Metadata;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¨\u0006\u0003"}, m28432d2 = {"Lne5;", "", "isB4Model", "model_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class BirdVehicleConnectionKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isB4Model(InterfaceC45802ne5 interfaceC45802ne5) {
        boolean startsWith;
        String name = interfaceC45802ne5.getName();
        if (name != null) {
            startsWith = StringsKt__StringsJVMKt.startsWith(name, "B7", true);
            return startsWith;
        }
        return false;
    }
}
