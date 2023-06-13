package p000;

import bo.app.InterfaceC13231y1;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import no.nordicsemi.android.ble.AbstractC26684u0;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0016B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0010B\u0019\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u000f\u0010\u0014J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, m28432d2 = {"LGZ1;", "LqZ1;", "LLO1;", "", "", "f0", "Lorg/json/JSONObject;", "z", "D", "Ljava/lang/String;", "m0", "()Ljava/lang/String;", AbstractC26684u0.f100690q, "(Ljava/lang/String;)V", "assetsZipRemoteUrl", "<init>", "()V", "jsonObject", "Lbo/app/y1;", "brazeManager", "(Lorg/json/JSONObject;Lbo/app/y1;)V", "E", C17296a.f69688o, "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: GZ1 */
/* loaded from: classes2.dex */
public abstract class GZ1 extends AbstractC47528qZ1 implements LO1 {

    /* renamed from: E */
    public static final C2890a f12084E = new C2890a(null);

    /* renamed from: D */
    public String f12085D;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LGZ1$a;", "", "", "HTML_CONTENT_ZIPPED_ASSETS_REMOTE_URL", "Ljava/lang/String;", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: GZ1$a */
    /* loaded from: classes2.dex */
    public static final class C2890a {
        public /* synthetic */ C2890a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2890a() {
        }
    }

    public GZ1() {
    }

    @Override // p000.AbstractC42191hZ1, p000.InterfaceC50985wO1
    /* renamed from: f0 */
    public List<String> mo6941f0() {
        boolean isBlank;
        ArrayList arrayList = new ArrayList();
        String mo96971m0 = mo96971m0();
        if (mo96971m0 != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(mo96971m0);
            if (!isBlank) {
                arrayList.add(mo96971m0);
            }
        }
        return arrayList;
    }

    @Override // p000.LO1
    /* renamed from: m0 */
    public String mo96971m0() {
        return this.f12085D;
    }

    /* renamed from: u0 */
    public void m105005u0(String str) {
        this.f12085D = str;
    }

    @Override // p000.AbstractC42191hZ1, p000.InterfaceC37933aP1
    /* renamed from: z */
    public JSONObject forJsonPut() {
        JSONObject m36215C = m36215C();
        if (m36215C == null) {
            m36215C = super.forJsonPut();
            try {
                m36215C.putOpt("zipped_assets_url", mo96971m0());
            } catch (JSONException unused) {
            }
        }
        return m36215C;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GZ1(JSONObject jsonObject, InterfaceC13231y1 brazeManager) {
        super(jsonObject, brazeManager);
        boolean isBlank;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        String it = jsonObject.optString("zipped_assets_url");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        isBlank = StringsKt__StringsJVMKt.isBlank(it);
        if (!isBlank) {
            m105005u0(it);
        }
    }
}
