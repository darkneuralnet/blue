package p000;

import co.bird.android.feature.servicecenter.idtools.identify.associate.InterfaceC15608a;
import co.bird.android.feature.servicecenter.idtools.identify.dissociate.InterfaceC15611a;
import com.facebook.share.internal.C17296a;
import dagger.Module;
import dagger.Provides;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, m28432d2 = {"LxS1;", "", "", C17296a.f69688o, "<init>", "()V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@Module(subcomponents = {InterfaceC15608a.class, InterfaceC15611a.class})
/* renamed from: xS1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51614xS1 {

    /* renamed from: a */
    public static final C51614xS1 f117624a = new C51614xS1();

    private C51614xS1() {
    }

    @Provides
    @JvmStatic
    /* renamed from: a */
    public static final String m5249a() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        return uuid;
    }
}
