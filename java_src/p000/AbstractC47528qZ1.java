package p000;

import bo.app.C12519a3;
import bo.app.C12749j;
import bo.app.InterfaceC13160u1;
import bo.app.InterfaceC13231y1;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0014¢\u0006\u0004\b\u0018\u0010\u0019B\u0019\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u0018\u0010\u001eJ\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016R$\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\r¨\u0006\u001f"}, m28432d2 = {"LqZ1;", "LhZ1;", "LyO1;", "", "", "remotePathToLocalAssetMap", "", "c0", "buttonId", "", "d0", "q0", "A", "Ljava/lang/String;", "U", "()Ljava/lang/String;", "W", "(Ljava/lang/String;)V", "localAssetsDirectoryUrl", "B", "Z", "wasButtonClickLogged", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "buttonIdClicked", "<init>", "()V", "Lorg/json/JSONObject;", "jsonObject", "Lbo/app/y1;", "brazeManager", "(Lorg/json/JSONObject;Lbo/app/y1;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: qZ1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC47528qZ1 extends AbstractC42191hZ1 implements InterfaceC52171yO1 {

    /* renamed from: A */
    public String f105414A;

    /* renamed from: B */
    public boolean f105415B;

    /* renamed from: C */
    public String f105416C;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: qZ1$a */
    /* loaded from: classes2.dex */
    public static final class C27617a extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f105417g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27617a(String str) {
            super(0);
            this.f105417g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Trigger id not found (this is expected for test sends). Not logging html in-app message button click for id: ", this.f105417g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: qZ1$b */
    /* loaded from: classes2.dex */
    public static final class C27618b extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27618b f105418g = new C27618b();

        public C27618b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Button Id was null or blank for this html in-app message. Ignoring.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: qZ1$c */
    /* loaded from: classes2.dex */
    public static final class C27619c extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27619c f105419g = new C27619c();

        public C27619c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Button click already logged for this html in-app message. Ignoring.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: qZ1$d */
    /* loaded from: classes2.dex */
    public static final class C27620d extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27620d f105420g = new C27620d();

        public C27620d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Cannot log an html in-app message button click because the BrazeManager is null.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: qZ1$e */
    /* loaded from: classes2.dex */
    public static final class C27621e extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f105421g;

        /* renamed from: h */
        public final /* synthetic */ String f105422h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27621e(String str, String str2) {
            super(0);
            this.f105421g = str;
            this.f105422h = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Logged button click for button id: " + this.f105421g + " and trigger id: " + ((Object) this.f105422h);
        }
    }

    public AbstractC47528qZ1() {
        m36201s0(true);
    }

    @Override // p000.InterfaceC52171yO1
    /* renamed from: U */
    public String mo3530U() {
        return this.f105414A;
    }

    @Override // p000.InterfaceC52171yO1
    /* renamed from: W */
    public void mo3529W(String str) {
        this.f105414A = str;
    }

    @Override // p000.AbstractC42191hZ1, p000.InterfaceC50985wO1
    /* renamed from: c0 */
    public void mo6943c0(Map<String, String> remotePathToLocalAssetMap) {
        Intrinsics.checkNotNullParameter(remotePathToLocalAssetMap, "remotePathToLocalAssetMap");
        if (!remotePathToLocalAssetMap.isEmpty()) {
            Object[] array = remotePathToLocalAssetMap.values().toArray(new String[0]);
            if (array != null) {
                mo3529W(((String[]) array)[0]);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }

    @Override // p000.InterfaceC52171yO1
    /* renamed from: d0 */
    public boolean mo3528d0(String buttonId) {
        boolean z;
        boolean isBlank;
        Intrinsics.checkNotNullParameter(buttonId, "buttonId");
        String m36213G = m36213G();
        InterfaceC13231y1 m36217A = m36217A();
        if (m36213G != null && m36213G.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C27617a(buttonId), 7, null);
            return false;
        }
        isBlank = StringsKt__StringsJVMKt.isBlank(buttonId);
        if (isBlank) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, C27618b.f105418g, 6, null);
            return false;
        } else if (this.f105415B && mo5008h0() != EnumC52810zT2.HTML) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, C27619c.f105419g, 6, null);
            return false;
        } else if (m36217A == null) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C27620d.f105420g, 6, null);
            return false;
        } else {
            InterfaceC13160u1 m63551d = C12749j.f58647h.m63551d(m36213G, buttonId);
            if (m63551d != null) {
                m36217A.mo62756a(m63551d);
            }
            this.f105416C = buttonId;
            this.f105415B = true;
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C27621e(buttonId, m36213G), 7, null);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
        if (r0 != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // p000.AbstractC42191hZ1, p000.InterfaceC50985wO1
    /* renamed from: q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo6934q0() {
        boolean z;
        InterfaceC13231y1 m36217A;
        boolean isBlank;
        boolean isBlank2;
        super.mo6934q0();
        if (this.f105415B) {
            String m36213G = m36213G();
            boolean z2 = false;
            if (m36213G != null) {
                isBlank2 = StringsKt__StringsJVMKt.isBlank(m36213G);
                if (!isBlank2) {
                    z = false;
                    if (z) {
                        String str = this.f105416C;
                        if (str != null) {
                            isBlank = StringsKt__StringsJVMKt.isBlank(str);
                        }
                        z2 = true;
                        if (!z2 && (m36217A = m36217A()) != null) {
                            m36217A.mo62757a(new C12519a3(m36213G(), this.f105416C));
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            z = true;
            if (z) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC47528qZ1(JSONObject jsonObject, InterfaceC13231y1 brazeManager) {
        super(jsonObject, brazeManager, false, false, 12, null);
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        m36201s0(jsonObject.optBoolean("use_webview", true));
    }
}
