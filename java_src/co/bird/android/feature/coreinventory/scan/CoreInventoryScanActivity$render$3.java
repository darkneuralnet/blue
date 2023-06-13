package co.bird.android.feature.coreinventory.scan;

import co.bird.android.model.DialogResponse;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class CoreInventoryScanActivity$render$3 extends Lambda implements Function1<DialogResponse, Boolean> {

    /* renamed from: g */
    public static final CoreInventoryScanActivity$render$3 f63824g = new CoreInventoryScanActivity$render$3();

    public CoreInventoryScanActivity$render$3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: a */
    public final Boolean invoke(DialogResponse response) {
        boolean z;
        Intrinsics.checkNotNullParameter(response, "response");
        if (response == DialogResponse.OK) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
