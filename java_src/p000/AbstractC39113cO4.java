package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m28432d2 = {"LcO4;", "Value", "", "<init>", "()V", C17296a.f69688o, "b", "LcO4$a;", "LcO4$b;", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: cO4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC39113cO4<Value> {

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m28432d2 = {"LcO4$a;", "Value", "LcO4;", "", MessageExtension.FIELD_DATA, C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/util/List;", "b", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: cO4$a */
    /* loaded from: classes4.dex */
    public static final class C13535a<Value> extends AbstractC39113cO4<Value> {

        /* renamed from: a */
        public final List<Value> f60514a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13535a(List<? extends Value> data) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.f60514a = data;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C13535a copy$default(C13535a c13535a, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = c13535a.f60514a;
            }
            return c13535a.m61459a(list);
        }

        /* renamed from: a */
        public final C13535a<Value> m61459a(List<? extends Value> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new C13535a<>(data);
        }

        /* renamed from: b */
        public final List<Value> m61458b() {
            return this.f60514a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13535a) && Intrinsics.areEqual(this.f60514a, ((C13535a) obj).f60514a);
        }

        public int hashCode() {
            return this.f60514a.hashCode();
        }

        public String toString() {
            List<Value> list = this.f60514a;
            return "Content(data=" + list + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0003HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"LcO4$b;", "Value", "LcO4;", "", "message", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: cO4$b */
    /* loaded from: classes4.dex */
    public static final class C13536b<Value> extends AbstractC39113cO4<Value> {

        /* renamed from: a */
        public final String f60515a;

        public C13536b() {
            this(null, 1, null);
        }

        public static /* synthetic */ C13536b copy$default(C13536b c13536b, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c13536b.f60515a;
            }
            return c13536b.m61457a(str);
        }

        /* renamed from: a */
        public final C13536b<Value> m61457a(String str) {
            return new C13536b<>(str);
        }

        /* renamed from: b */
        public final String m61456b() {
            return this.f60515a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13536b) && Intrinsics.areEqual(this.f60515a, ((C13536b) obj).f60515a);
        }

        public int hashCode() {
            String str = this.f60515a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.f60515a;
            return "Error(message=" + str + ")";
        }

        public /* synthetic */ C13536b(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public C13536b(String str) {
            super(null);
            this.f60515a = str;
        }
    }

    public /* synthetic */ AbstractC39113cO4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC39113cO4() {
    }
}
