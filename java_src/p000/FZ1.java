package p000;

import android.graphics.Bitmap;
import bo.app.InterfaceC13231y1;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import no.nordicsemi.android.ble.AbstractC26684u0;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001/B\t\b\u0014¢\u0006\u0004\b)\u0010\u001cB\u0019\b\u0016\u0012\u0006\u0010*\u001a\u00020\n\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b)\u0010-J\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u001d\u001a\u00020\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010$\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010(\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#¨\u00060"}, m28432d2 = {"LFZ1;", "LhZ1;", "LKO1;", "", "", "remotePathToLocalAssetMap", "", "c0", "", "f0", "Lorg/json/JSONObject;", "z", "Landroid/graphics/Bitmap;", "A", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "y", "(Landroid/graphics/Bitmap;)V", "bitmap", "", "B", "Z", AbstractC26684u0.f100690q, "()Z", "x", "(Z)V", "getImageDownloadSuccessful$annotations", "()V", "imageDownloadSuccessful", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Ljava/lang/String;", "e", "()Ljava/lang/String;", "b", "(Ljava/lang/String;)V", "localImageUrl", "D", "w", "v0", "remoteImageUrl", "<init>", "jsonObject", "Lbo/app/y1;", "brazeManager", "(Lorg/json/JSONObject;Lbo/app/y1;)V", "E", C17296a.f69688o, "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: FZ1 */
/* loaded from: classes2.dex */
public abstract class FZ1 extends AbstractC42191hZ1 implements KO1 {

    /* renamed from: E */
    public static final C2357a f9677E = new C2357a(null);

    /* renamed from: A */
    public Bitmap f9678A;

    /* renamed from: B */
    public boolean f9679B;

    /* renamed from: C */
    public String f9680C;

    /* renamed from: D */
    public String f9681D;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LFZ1$a;", "", "", "REMOTE_IMAGE_URL", "Ljava/lang/String;", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: FZ1$a */
    /* loaded from: classes2.dex */
    public static final class C2357a {
        public /* synthetic */ C2357a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2357a() {
        }
    }

    public FZ1() {
    }

    @Override // p000.KO1
    /* renamed from: b */
    public void mo98926b(String str) {
        this.f9680C = str;
    }

    @Override // p000.AbstractC42191hZ1, p000.InterfaceC50985wO1
    /* renamed from: c0 */
    public void mo6943c0(Map<String, String> remotePathToLocalAssetMap) {
        Intrinsics.checkNotNullParameter(remotePathToLocalAssetMap, "remotePathToLocalAssetMap");
        if (!remotePathToLocalAssetMap.isEmpty()) {
            Object[] array = remotePathToLocalAssetMap.values().toArray(new String[0]);
            if (array != null) {
                mo98926b(((String[]) array)[0]);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }

    @Override // p000.KO1
    /* renamed from: e */
    public String mo98925e() {
        return this.f9680C;
    }

    @Override // p000.AbstractC42191hZ1, p000.InterfaceC50985wO1
    /* renamed from: f0 */
    public List<String> mo6941f0() {
        boolean isBlank;
        ArrayList arrayList = new ArrayList();
        String mo98924w = mo98924w();
        if (mo98924w != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(mo98924w);
            if (!isBlank) {
                arrayList.add(mo98924w);
            }
        }
        return arrayList;
    }

    @Override // p000.KO1
    public Bitmap getBitmap() {
        return this.f9678A;
    }

    /* renamed from: u0 */
    public boolean m106949u0() {
        return this.f9679B;
    }

    /* renamed from: v0 */
    public void m106948v0(String str) {
        this.f9681D = str;
    }

    @Override // p000.KO1
    /* renamed from: w */
    public String mo98924w() {
        return this.f9681D;
    }

    @Override // p000.KO1
    /* renamed from: x */
    public void mo98923x(boolean z) {
        this.f9679B = z;
    }

    @Override // p000.KO1
    /* renamed from: y */
    public void mo98922y(Bitmap bitmap) {
        this.f9678A = bitmap;
    }

    @Override // p000.AbstractC42191hZ1, p000.InterfaceC37933aP1
    /* renamed from: z */
    public JSONObject forJsonPut() {
        JSONObject m36215C = m36215C();
        if (m36215C == null) {
            m36215C = super.forJsonPut();
            try {
                m36215C.putOpt("image_url", mo98924w());
            } catch (JSONException unused) {
            }
        }
        return m36215C;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FZ1(JSONObject jsonObject, InterfaceC13231y1 brazeManager) {
        super(jsonObject, brazeManager, false, false, 12, null);
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        m106948v0(jsonObject.optString("image_url"));
    }
}
