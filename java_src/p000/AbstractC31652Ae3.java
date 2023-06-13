package p000;

import com.facebook.share.internal.C17296a;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¨\u0006\t"}, m28432d2 = {"LAe3;", "", "Lye3;", "impl", "Lue3;", "b", "<init>", "()V", C17296a.f69688o, "co.bird.android.manager.offer"}, m28431k = 1, m28430mv = {1, 8, 0})
@Module
/* renamed from: Ae3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC31652Ae3 {

    /* renamed from: a */
    public static final C0166a f900a = new C0166a(null);

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, m28432d2 = {"LAe3$a;", "", "LMN4;", "retrofit", "Lpe3;", C17296a.f69688o, "<init>", "()V", "co.bird.android.manager.offer"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: Ae3$a */
    /* loaded from: classes4.dex */
    public static final class C0166a {
        public /* synthetic */ C0166a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Provides
        @JvmStatic
        /* renamed from: a */
        public final InterfaceC46986pe3 m115416a(MN4 retrofit) {
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Object m95385b = retrofit.m95385b(InterfaceC46986pe3.class);
            Intrinsics.checkNotNullExpressionValue(m95385b, "retrofit.create(\n      OfferApi::class.java\n    )");
            return (InterfaceC46986pe3) m95385b;
        }

        private C0166a() {
        }
    }

    @Provides
    @JvmStatic
    /* renamed from: a */
    public static final InterfaceC46986pe3 m115418a(MN4 mn4) {
        return f900a.m115416a(mn4);
    }

    @Binds
    /* renamed from: b */
    public abstract InterfaceC49950ue3 m115417b(C52321ye3 c52321ye3);
}
