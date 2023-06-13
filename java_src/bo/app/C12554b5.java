package bo.app;

import android.content.Context;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, m28432d2 = {"Lbo/app/b5;", "Lbo/app/p2;", "", C17296a.f69688o, "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.b5 */
/* loaded from: classes.dex */
public final class C12554b5 implements InterfaceC13018p2 {

    /* renamed from: a */
    private final Context f58274a;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.b5$a */
    /* loaded from: classes.dex */
    public static final class C12555a extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12555a f58275b = new C12555a();

        public C12555a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Content Cards enabled in server config. Requesting Content Cards refresh.";
        }
    }

    public C12554b5(Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.f58274a = applicationContext;
    }

    @Override // bo.app.InterfaceC13018p2
    /* renamed from: a */
    public void mo63152a() {
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C12555a.f58275b, 7, null);
        P10.getInstance(this.f58274a).requestContentCardsRefresh(false);
    }
}
