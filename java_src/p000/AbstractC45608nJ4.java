package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;
import p000.AbstractC5384Mp;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m28432d2 = {"LnJ4;", "", "LMp;", "getAuthError", "()LMp;", "authError", "<init>", "()V", C17296a.f69688o, "b", "LnJ4$a;", "LnJ4$b;", "auth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: nJ4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC45608nJ4 {

    @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0017"}, m28432d2 = {"LnJ4$a;", "LnJ4;", "Lokhttp3/Response;", "response", "LMp$b;", "authError", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lokhttp3/Response;", "c", "()Lokhttp3/Response;", "b", "LMp$b;", "()LMp$b;", "<init>", "(Lokhttp3/Response;LMp$b;)V", "auth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: nJ4$a */
    /* loaded from: classes2.dex */
    public static final class C26457a extends AbstractC45608nJ4 {

        /* renamed from: a */
        public final Response f99742a;

        /* renamed from: b */
        public final AbstractC5384Mp.C5386b f99743b;

        public /* synthetic */ C26457a(Response response, AbstractC5384Mp.C5386b c5386b, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(response, (i & 2) != 0 ? null : c5386b);
        }

        public static /* synthetic */ C26457a copy$default(C26457a c26457a, Response response, AbstractC5384Mp.C5386b c5386b, int i, Object obj) {
            if ((i & 1) != 0) {
                response = c26457a.f99742a;
            }
            if ((i & 2) != 0) {
                c5386b = c26457a.f99743b;
            }
            return c26457a.m23980a(response, c5386b);
        }

        /* renamed from: a */
        public final C26457a m23980a(Response response, AbstractC5384Mp.C5386b c5386b) {
            Intrinsics.checkNotNullParameter(response, "response");
            return new C26457a(response, c5386b);
        }

        @Override // p000.AbstractC45608nJ4
        /* renamed from: b */
        public AbstractC5384Mp.C5386b getAuthError() {
            return this.f99743b;
        }

        /* renamed from: c */
        public final Response m23978c() {
            return this.f99742a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C26457a) {
                C26457a c26457a = (C26457a) obj;
                return Intrinsics.areEqual(this.f99742a, c26457a.f99742a) && Intrinsics.areEqual(this.f99743b, c26457a.f99743b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f99742a.hashCode() * 31;
            AbstractC5384Mp.C5386b c5386b = this.f99743b;
            return hashCode + (c5386b == null ? 0 : c5386b.hashCode());
        }

        public String toString() {
            Response response = this.f99742a;
            AbstractC5384Mp.C5386b c5386b = this.f99743b;
            return "Performed(response=" + response + ", authError=" + c5386b + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26457a(Response response, AbstractC5384Mp.C5386b c5386b) {
            super(null);
            Intrinsics.checkNotNullParameter(response, "response");
            this.f99742a = response;
            this.f99743b = c5386b;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m28432d2 = {"LnJ4$b;", "LnJ4;", "LMp$a;", "b", "LMp$a;", C17296a.f69688o, "()LMp$a;", "authError", "<init>", "()V", "auth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: nJ4$b */
    /* loaded from: classes2.dex */
    public static final class C26458b extends AbstractC45608nJ4 {

        /* renamed from: a */
        public static final C26458b f99744a = new C26458b();

        /* renamed from: b */
        public static final AbstractC5384Mp.C5385a f99745b = AbstractC5384Mp.C5385a.f23624a;

        private C26458b() {
            super(null);
        }

        @Override // p000.AbstractC45608nJ4
        /* renamed from: a */
        public AbstractC5384Mp.C5385a getAuthError() {
            return f99745b;
        }
    }

    public /* synthetic */ AbstractC45608nJ4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract AbstractC5384Mp getAuthError();

    private AbstractC45608nJ4() {
    }
}
