package p000;

import com.facebook.share.internal.C17296a;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\f"}, m28432d2 = {"Lhn0;", "", "LEa;", "analyticsManager", "LGt5;", "serviceCenterManager", "LOh;", "appBuildConfig", "Len0;", C17296a.f69688o, "<init>", "()V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
@Module
/* renamed from: hn0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42329hn0 {
    @Provides
    /* renamed from: a */
    public final InterfaceC40550en0 m35873a(InterfaceC1880Ea analyticsManager, InterfaceC33193Gt5 serviceCenterManager, InterfaceC6097Oh appBuildConfig) {
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(serviceCenterManager, "serviceCenterManager");
        Intrinsics.checkNotNullParameter(appBuildConfig, "appBuildConfig");
        return new C41736gn0(analyticsManager, serviceCenterManager, appBuildConfig);
    }
}
