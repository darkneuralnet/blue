package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m28432d2 = {"LbO4;", "Value", "", "<init>", "()V", C17296a.f69688o, "b", "c", "LbO4$a;", "LbO4$b;", "LbO4$c;", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: bO4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC38520bO4<Value> {

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m28432d2 = {"LbO4$a;", "Value", "LbO4;", "", MessageExtension.FIELD_DATA, C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/util/List;", "b", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: bO4$a */
    /* loaded from: classes4.dex */
    public static final class C12378a<Value> extends AbstractC38520bO4<Value> {

        /* renamed from: a */
        public final List<Value> f57371a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12378a(List<? extends Value> data) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.f57371a = data;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C12378a copy$default(C12378a c12378a, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = c12378a.f57371a;
            }
            return c12378a.m64606a(list);
        }

        /* renamed from: a */
        public final C12378a<Value> m64606a(List<? extends Value> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new C12378a<>(data);
        }

        /* renamed from: b */
        public final List<Value> m64605b() {
            return this.f57371a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12378a) && Intrinsics.areEqual(this.f57371a, ((C12378a) obj).f57371a);
        }

        public int hashCode() {
            return this.f57371a.hashCode();
        }

        public String toString() {
            List<Value> list = this.f57371a;
            return "Content(data=" + list + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0019"}, m28432d2 = {"LbO4$b;", "Value", "LbO4;", "", MessageExtension.FIELD_DATA, "", "position", "totalCount", C17296a.f69688o, "", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/util/List;", "b", "()Ljava/util/List;", "I", "c", "()I", DateTokenConverter.CONVERTER_KEY, "<init>", "(Ljava/util/List;II)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: bO4$b */
    /* loaded from: classes4.dex */
    public static final class C12379b<Value> extends AbstractC38520bO4<Value> {

        /* renamed from: a */
        public final List<Value> f57372a;

        /* renamed from: b */
        public final int f57373b;

        /* renamed from: c */
        public final int f57374c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12379b(List<? extends Value> data, int i, int i2) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.f57372a = data;
            this.f57373b = i;
            this.f57374c = i2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C12379b copy$default(C12379b c12379b, List list, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                list = c12379b.f57372a;
            }
            if ((i3 & 2) != 0) {
                i = c12379b.f57373b;
            }
            if ((i3 & 4) != 0) {
                i2 = c12379b.f57374c;
            }
            return c12379b.m64604a(list, i, i2);
        }

        /* renamed from: a */
        public final C12379b<Value> m64604a(List<? extends Value> data, int i, int i2) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new C12379b<>(data, i, i2);
        }

        /* renamed from: b */
        public final List<Value> m64603b() {
            return this.f57372a;
        }

        /* renamed from: c */
        public final int m64602c() {
            return this.f57373b;
        }

        /* renamed from: d */
        public final int m64601d() {
            return this.f57374c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C12379b) {
                C12379b c12379b = (C12379b) obj;
                return Intrinsics.areEqual(this.f57372a, c12379b.f57372a) && this.f57373b == c12379b.f57373b && this.f57374c == c12379b.f57374c;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f57372a.hashCode() * 31) + Integer.hashCode(this.f57373b)) * 31) + Integer.hashCode(this.f57374c);
        }

        public String toString() {
            List<Value> list = this.f57372a;
            int i = this.f57373b;
            int i2 = this.f57374c;
            return "ContentWithPlaceholders(data=" + list + ", position=" + i + ", totalCount=" + i2 + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0003HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"LbO4$c;", "Value", "LbO4;", "", "message", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: bO4$c */
    /* loaded from: classes4.dex */
    public static final class C12380c<Value> extends AbstractC38520bO4<Value> {

        /* renamed from: a */
        public final String f57375a;

        public C12380c() {
            this(null, 1, null);
        }

        public static /* synthetic */ C12380c copy$default(C12380c c12380c, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c12380c.f57375a;
            }
            return c12380c.m64600a(str);
        }

        /* renamed from: a */
        public final C12380c<Value> m64600a(String str) {
            return new C12380c<>(str);
        }

        /* renamed from: b */
        public final String m64599b() {
            return this.f57375a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12380c) && Intrinsics.areEqual(this.f57375a, ((C12380c) obj).f57375a);
        }

        public int hashCode() {
            String str = this.f57375a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.f57375a;
            return "Error(message=" + str + ")";
        }

        public /* synthetic */ C12380c(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public C12380c(String str) {
            super(null);
            this.f57375a = str;
        }
    }

    public /* synthetic */ AbstractC38520bO4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC38520bO4() {
    }
}
