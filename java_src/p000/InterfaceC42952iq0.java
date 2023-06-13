package p000;

import android.content.Intent;
import co.bird.api.request.ComplaintSchemaType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\"\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000bH&¨\u0006\u000e"}, m28432d2 = {"Liq0;", "", "Landroid/content/Intent;", "intent", "", "b", "", "requestCode", "resultCode", MessageExtension.FIELD_DATA, "onActivityResult", "Lco/bird/api/request/ComplaintSchemaType;", "complaintSchemaType", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: iq0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC42952iq0 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: iq0$a */
    /* loaded from: classes2.dex */
    public static final class C24602a {
        public static /* synthetic */ void getComplaintsSchema$default(InterfaceC42952iq0 interfaceC42952iq0, ComplaintSchemaType complaintSchemaType, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getComplaintsSchema");
            }
            if ((i & 1) != 0) {
                complaintSchemaType = ComplaintSchemaType.COMMUNITY;
            }
            interfaceC42952iq0.mo16949a(complaintSchemaType);
        }
    }

    /* renamed from: a */
    void mo16949a(ComplaintSchemaType complaintSchemaType);

    /* renamed from: b */
    void mo16948b(Intent intent);

    void onActivityResult(int i, int i2, Intent intent);
}
