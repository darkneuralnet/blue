package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m28432d2 = {"LMp;", "", "<init>", "()V", C17296a.f69688o, "b", "LMp$a;", "LMp$b;", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Mp */
/* loaded from: classes2.dex */
public abstract class AbstractC5384Mp {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"LMp$a;", "LMp;", "<init>", "()V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Mp$a */
    /* loaded from: classes2.dex */
    public static final class C5385a extends AbstractC5384Mp {

        /* renamed from: a */
        public static final C5385a f23624a = new C5385a();

        private C5385a() {
            super(null);
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m28432d2 = {"LMp$b;", "LMp;", "Lokhttp3/Request;", "request", "", "shouldLogUserOut", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Lokhttp3/Request;", "b", "()Lokhttp3/Request;", "Z", "c", "()Z", "<init>", "(Lokhttp3/Request;Z)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Mp$b */
    /* loaded from: classes2.dex */
    public static final class C5386b extends AbstractC5384Mp {

        /* renamed from: a */
        public final Request f23625a;

        /* renamed from: b */
        public final boolean f23626b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5386b(Request request, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(request, "request");
            this.f23625a = request;
            this.f23626b = z;
        }

        public static /* synthetic */ C5386b copy$default(C5386b c5386b, Request request, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                request = c5386b.f23625a;
            }
            if ((i & 2) != 0) {
                z = c5386b.f23626b;
            }
            return c5386b.m94768a(request, z);
        }

        /* renamed from: a */
        public final C5386b m94768a(Request request, boolean z) {
            Intrinsics.checkNotNullParameter(request, "request");
            return new C5386b(request, z);
        }

        /* renamed from: b */
        public final Request m94767b() {
            return this.f23625a;
        }

        /* renamed from: c */
        public final boolean m94766c() {
            return this.f23626b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C5386b) {
                C5386b c5386b = (C5386b) obj;
                return Intrinsics.areEqual(this.f23625a, c5386b.f23625a) && this.f23626b == c5386b.f23626b;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f23625a.hashCode() * 31;
            boolean z = this.f23626b;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            Request request = this.f23625a;
            boolean z = this.f23626b;
            return "Response401(request=" + request + ", shouldLogUserOut=" + z + ")";
        }
    }

    public /* synthetic */ AbstractC5384Mp(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC5384Mp() {
    }
}
