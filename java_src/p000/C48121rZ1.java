package p000;

import bo.app.InterfaceC13231y1;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, m28432d2 = {"LrZ1;", "LGZ1;", "Lorg/json/JSONObject;", "z", "LzT2;", "h0", "()LzT2;", ChallengeRequestData.FIELD_MESSAGE_TYPE, "<init>", "()V", "jsonObject", "Lbo/app/y1;", "brazeManager", "(Lorg/json/JSONObject;Lbo/app/y1;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: rZ1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48121rZ1 extends GZ1 {
    public C48121rZ1() {
    }

    @Override // p000.InterfaceC50985wO1
    /* renamed from: h0 */
    public EnumC52810zT2 mo5008h0() {
        return EnumC52810zT2.HTML_FULL;
    }

    @Override // p000.GZ1, p000.AbstractC42191hZ1, p000.InterfaceC37933aP1
    /* renamed from: z */
    public JSONObject forJsonPut() {
        JSONObject m36215C = m36215C();
        if (m36215C == null) {
            m36215C = super.forJsonPut();
            try {
                m36215C.put("type", mo5008h0().name());
            } catch (JSONException unused) {
            }
        }
        return m36215C;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48121rZ1(JSONObject jsonObject, InterfaceC13231y1 brazeManager) {
        super(jsonObject, brazeManager);
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
    }
}
