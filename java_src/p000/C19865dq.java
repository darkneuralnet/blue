package p000;

import com.facebook.share.internal.C17296a;
import dagger.Module;
import dagger.Provides;
import dagger.Reusable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u001a\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007J\u0012\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007¨\u0006\u0012"}, m28432d2 = {"Ldq;", "", "Lgl;", "appPreference", "LRh6;", "userStream", "LLp;", "authClient", "Lhq;", "b", "preference", "LMN4;", "retrofit", C17296a.f69688o, "LVo2;", "c", "<init>", "()V", "auth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@Module(includes = {AbstractC4601Kp.class})
/* renamed from: dq */
/* loaded from: classes2.dex */
public final class C19865dq {
    @Provides
    @Reusable
    /* renamed from: a */
    public final InterfaceC5093Lp m43673a(C22454gl preference, MN4 retrofit) {
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object m95385b = retrofit.m95383d().m95373c(C31659Af1.m115411a(preference.m37699O())).m95371e().m95385b(InterfaceC5093Lp.class);
        Intrinsics.checkNotNullExpressionValue(m95385b, "retrofit.newBuilder()\n  …e(AuthClient::class.java)");
        return (InterfaceC5093Lp) m95385b;
    }

    @Provides
    /* renamed from: b */
    public final InterfaceC22767hq m43672b(C22454gl appPreference, InterfaceC35660Rh6 userStream, InterfaceC5093Lp authClient) {
        Intrinsics.checkNotNullParameter(appPreference, "appPreference");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(authClient, "authClient");
        return new C28021rq(appPreference, userStream, authClient);
    }

    @Provides
    @Reusable
    /* renamed from: c */
    public final InterfaceC36655Vo2 m43671c(MN4 retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object m95385b = retrofit.m95385b(InterfaceC36655Vo2.class);
        Intrinsics.checkNotNullExpressionValue(m95385b, "retrofit.create(LegacyAuthClient::class.java)");
        return (InterfaceC36655Vo2) m95385b;
    }
}
