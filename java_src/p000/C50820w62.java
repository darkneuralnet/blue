package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\nJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, m28432d2 = {"Lw62;", "", "", C17296a.f69688o, "Ljava/lang/String;", "customUserAgent", "", "b", "()Z", "isUnityApp$annotations", "()V", "isUnityApp", "<init>", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: w62  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50820w62 {

    /* renamed from: a */
    public static volatile String f115374a;

    /* renamed from: b */
    public static final C50820w62 f115375b = new C50820w62();

    private C50820w62() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m7410a() {
        return f115374a;
    }

    /* renamed from: b */
    public static final boolean m7409b() {
        boolean startsWith$default;
        String str = f115374a;
        if (str != null) {
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str, "Unity.", false, 2, null);
            return startsWith$default;
        }
        return false;
    }
}
