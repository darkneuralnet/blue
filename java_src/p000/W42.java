package p000;

import android.os.RemoteException;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.facebook.C17216a;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002R\u0014\u0010\u000b\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, m28432d2 = {"LW42;", "", "LW42$a;", "callback", "", DateTokenConverter.CONVERTER_KEY, "c", "e", "", "b", "()Z", "isUpdated", "<init>", "()V", C17296a.f69688o, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: W42 */
/* loaded from: classes5.dex */
public final class W42 {

    /* renamed from: a */
    public static final W42 f40371a = new W42();

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u0006"}, m28432d2 = {"LW42$a;", "", "", "s", "", C17296a.f69688o, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: W42$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC8930a {
        /* renamed from: a */
        void mo74438a(String str);
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, m28432d2 = {"W42$b", "Lcom/android/installreferrer/api/InstallReferrerStateListener;", "", "responseCode", "", C17296a.f69688o, "b", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: W42$b */
    /* loaded from: classes5.dex */
    public static final class C8931b implements InstallReferrerStateListener {

        /* renamed from: a */
        public final /* synthetic */ InstallReferrerClient f40372a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC8930a f40373b;

        public C8931b(InstallReferrerClient installReferrerClient, InterfaceC8930a interfaceC8930a) {
            this.f40372a = installReferrerClient;
            this.f40373b = interfaceC8930a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
            if (r0 != false) goto L20;
         */
        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo53509a(int i) {
            boolean contains$default;
            boolean contains$default2;
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                if (i != 0) {
                    if (i == 2) {
                        W42.f40371a.m78864e();
                        return;
                    }
                    return;
                }
                try {
                    InstallReferrerClient referrerClient = this.f40372a;
                    Intrinsics.checkNotNullExpressionValue(referrerClient, "referrerClient");
                    ReferrerDetails mo53513a = referrerClient.mo53513a();
                    Intrinsics.checkNotNullExpressionValue(mo53513a, "referrerClient.installReferrer");
                    String m53507a = mo53513a.m53507a();
                    if (m53507a != null) {
                        contains$default = StringsKt__StringsKt.contains$default((CharSequence) m53507a, (CharSequence) "fb", false, 2, (Object) null);
                        if (!contains$default) {
                            contains$default2 = StringsKt__StringsKt.contains$default((CharSequence) m53507a, (CharSequence) "facebook", false, 2, (Object) null);
                        }
                        this.f40373b.mo74438a(m53507a);
                    }
                    W42.f40371a.m78864e();
                } catch (RemoteException unused) {
                }
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        /* renamed from: b */
        public void mo53508b() {
        }
    }

    private W42() {
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m78865d(InterfaceC8930a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        W42 w42 = f40371a;
        if (!w42.m78867b()) {
            w42.m78866c(callback);
        }
    }

    /* renamed from: b */
    public final boolean m78867b() {
        return C17216a.m52741e().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false);
    }

    /* renamed from: c */
    public final void m78866c(InterfaceC8930a interfaceC8930a) {
        InstallReferrerClient m53510a = InstallReferrerClient.m53512b(C17216a.m52741e()).m53510a();
        try {
            m53510a.mo53511c(new C8931b(m53510a, interfaceC8930a));
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public final void m78864e() {
        C17216a.m52741e().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
    }
}
