package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m28432d2 = {"LNp;", "", "<init>", "()V", C17296a.f69688o, "LH1;", "LNp$a;", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Np */
/* loaded from: classes2.dex */
public abstract class AbstractC5699Np {

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0005\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m28432d2 = {"LNp$a;", "LNp;", "", "header", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Np$a */
    /* loaded from: classes2.dex */
    public static final class C5700a extends AbstractC5699Np {

        /* renamed from: a */
        public final String f25216a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5700a(String header) {
            super(null);
            Intrinsics.checkNotNullParameter(header, "header");
            this.f25216a = header;
        }

        public static /* synthetic */ C5700a copy$default(C5700a c5700a, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c5700a.f25216a;
            }
            return c5700a.m93367a(str);
        }

        /* renamed from: a */
        public final C5700a m93367a(String header) {
            Intrinsics.checkNotNullParameter(header, "header");
            return new C5700a(header);
        }

        /* renamed from: b */
        public final String m93366b() {
            return this.f25216a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C5700a) && Intrinsics.areEqual(this.f25216a, ((C5700a) obj).f25216a);
        }

        public int hashCode() {
            return this.f25216a.hashCode();
        }

        public String toString() {
            String str = this.f25216a;
            return "AuthHeader(header=" + str + ")";
        }
    }

    public /* synthetic */ AbstractC5699Np(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC5699Np() {
    }
}