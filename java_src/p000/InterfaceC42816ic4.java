package p000;

import android.content.Intent;
import co.bird.android.model.QCAutoCheck;
import co.bird.android.model.QCInspection;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H&J\"\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&J\b\u0010\u0011\u001a\u00020\tH&¨\u0006\u0012"}, m28432d2 = {"Lic4;", "", "Lco/bird/android/model/wire/WireBird;", "bird", "", "Lco/bird/android/model/QCInspection;", "qcInspections", "Lco/bird/android/model/QCAutoCheck;", "qcAutoChecks", "", C17296a.f69688o, "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "onBackPressed", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ic4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC42816ic4 {
    /* renamed from: a */
    void mo33751a(WireBird wireBird, List<QCInspection> list, List<QCAutoCheck> list2);

    void onActivityResult(int i, int i2, Intent intent);

    void onBackPressed();
}
