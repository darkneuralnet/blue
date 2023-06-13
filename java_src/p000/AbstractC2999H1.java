package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m28432d2 = {"LH1;", "LNp;", "<init>", "()V", C17296a.f69688o, "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "LH1$a;", "LH1$b;", "LH1$c;", "LH1$d;", "LH1$e;", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: H1 */
/* loaded from: classes2.dex */
public abstract class AbstractC2999H1 extends AbstractC5699Np {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"LH1$a;", "LH1;", "<init>", "()V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: H1$a */
    /* loaded from: classes2.dex */
    public static final class C3000a extends AbstractC2999H1 {

        /* renamed from: a */
        public static final C3000a f12722a = new C3000a();

        private C3000a() {
            super(null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, m28432d2 = {"LH1$b;", "LH1;", "", C17296a.f69688o, "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "error", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: H1$b */
    /* loaded from: classes2.dex */
    public static final class C3001b extends AbstractC2999H1 {

        /* renamed from: a */
        public final Throwable f12723a;

        /* renamed from: a */
        public final Throwable m104502a() {
            return this.f12723a;
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"LH1$c;", "LH1;", "Lokhttp3/Response;", "response", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lokhttp3/Response;", "b", "()Lokhttp3/Response;", "<init>", "(Lokhttp3/Response;)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: H1$c */
    /* loaded from: classes2.dex */
    public static final class C3002c extends AbstractC2999H1 {

        /* renamed from: a */
        public final Response f12724a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3002c(Response response) {
            super(null);
            Intrinsics.checkNotNullParameter(response, "response");
            this.f12724a = response;
        }

        public static /* synthetic */ C3002c copy$default(C3002c c3002c, Response response, int i, Object obj) {
            if ((i & 1) != 0) {
                response = c3002c.f12724a;
            }
            return c3002c.m104501a(response);
        }

        /* renamed from: a */
        public final C3002c m104501a(Response response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return new C3002c(response);
        }

        /* renamed from: b */
        public final Response m104500b() {
            return this.f12724a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3002c) && Intrinsics.areEqual(this.f12724a, ((C3002c) obj).f12724a);
        }

        public int hashCode() {
            return this.f12724a.hashCode();
        }

        public String toString() {
            Response response = this.f12724a;
            return "NonRejectionHttpError(response=" + response + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"LH1$d;", "LH1;", "<init>", "()V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: H1$d */
    /* loaded from: classes2.dex */
    public static final class C3003d extends AbstractC2999H1 {

        /* renamed from: a */
        public static final C3003d f12725a = new C3003d();

        private C3003d() {
            super(null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"LH1$e;", "LH1;", "<init>", "()V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: H1$e */
    /* loaded from: classes2.dex */
    public static final class C3004e extends AbstractC2999H1 {

        /* renamed from: a */
        public static final C3004e f12726a = new C3004e();

        private C3004e() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC2999H1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC2999H1() {
        super(null);
    }
}
