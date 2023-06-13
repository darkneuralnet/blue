package p000;

import android.app.Application;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lbh;", "", "", C17296a.f69688o, "()Ljava/lang/String;", "processName", "<init>", "()V", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: bh */
/* loaded from: classes.dex */
public final class C12473bh {

    /* renamed from: a */
    public static final C12473bh f57871a = new C12473bh();

    private C12473bh() {
    }

    /* renamed from: a */
    public final String m64171a() {
        String processName;
        processName = Application.getProcessName();
        Intrinsics.checkNotNullExpressionValue(processName, "getProcessName()");
        return processName;
    }
}
