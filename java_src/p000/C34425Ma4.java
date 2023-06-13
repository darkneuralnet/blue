package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, m28432d2 = {"LMa4;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LZC6;", "workManager", "Ldd3;", C17296a.f69688o, "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@Module(includes = {C22711hj.class})
/* renamed from: Ma4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C34425Ma4 {
    @Provides
    /* renamed from: a */
    public final InterfaceC39861dd3 m95158a(Context context, ZC6 workManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workManager, "workManager");
        return new C40453ed3(context, workManager);
    }
}
