package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"LA66;", "LFy5;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LAN5;", C17296a.f69688o, "", "Ljava/lang/String;", "content", "<init>", "(Ljava/lang/String;)V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: A66 */
/* loaded from: classes5.dex */
public final class A66 implements InterfaceC33004Fy5 {

    /* renamed from: a */
    public final String f167a;

    public A66(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f167a = content;
    }

    @Override // p000.InterfaceC33004Fy5
    /* renamed from: a */
    public AN5 mo5832a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C42488i30 c42488i30 = new C42488i30();
        String str = this.f167a;
        return c42488i30.mo24530a2(str + "\n");
    }
}
