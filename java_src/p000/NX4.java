package p000;

import android.content.Intent;
import co.bird.android.model.wire.WireRide;
import co.bird.api.request.StartRideBodyWithIntent;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH&¨\u0006\r"}, m28432d2 = {"LNX4;", "", "", "requestCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "", C17296a.f69688o, "Lco/bird/api/request/StartRideBodyWithIntent;", "body", "Lio/reactivex/F;", "Lco/bird/android/model/wire/WireRide;", "b", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: NX4 */
/* loaded from: classes2.dex */
public interface NX4 {
    /* renamed from: a */
    void mo79819a(int i, Intent intent);

    /* renamed from: b */
    AbstractC23442F<WireRide> mo79818b(StartRideBodyWithIntent startRideBodyWithIntent);
}
