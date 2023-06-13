package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m28432d2 = {"Lot2;", "", "", C17296a.f69688o, "Z", "()Z", "endOfPaginationReached", "<init>", "(Z)V", "b", "c", "Lot2$a;", "Lot2$b;", "Lot2$c;", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: ot2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC46542ot2 {

    /* renamed from: a */
    public final boolean f102706a;

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"Lot2$a;", "Lot2;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", "", "b", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "error", "<init>", "(Ljava/lang/Throwable;)V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: ot2$a */
    /* loaded from: classes.dex */
    public static final class C27092a extends AbstractC46542ot2 {

        /* renamed from: b */
        public final Throwable f102707b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27092a(Throwable error) {
            super(false, null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.f102707b = error;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C27092a) {
                C27092a c27092a = (C27092a) obj;
                if (m20367a() == c27092a.m20367a() && Intrinsics.areEqual(this.f102707b, c27092a.f102707b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Boolean.hashCode(m20367a()) + this.f102707b.hashCode();
        }

        public String toString() {
            return "Error(endOfPaginationReached=" + m20367a() + ", error=" + this.f102707b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\f"}, m28432d2 = {"Lot2$b;", "Lot2;", "", "toString", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "<init>", "()V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: ot2$b */
    /* loaded from: classes.dex */
    public static final class C27093b extends AbstractC46542ot2 {

        /* renamed from: b */
        public static final C27093b f102708b = new C27093b();

        private C27093b() {
            super(false, null);
        }

        public boolean equals(Object obj) {
            if ((obj instanceof C27093b) && m20367a() == ((C27093b) obj).m20367a()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Boolean.hashCode(m20367a());
        }

        public String toString() {
            return "Loading(endOfPaginationReached=" + m20367a() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000f"}, m28432d2 = {"Lot2$c;", "Lot2;", "", "toString", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "endOfPaginationReached", "<init>", "(Z)V", "b", C17296a.f69688o, "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: ot2$c */
    /* loaded from: classes.dex */
    public static final class C27094c extends AbstractC46542ot2 {

        /* renamed from: b */
        public static final C27095a f102709b = new C27095a(null);

        /* renamed from: c */
        public static final C27094c f102710c = new C27094c(true);

        /* renamed from: d */
        public static final C27094c f102711d = new C27094c(false);

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\u000b"}, m28432d2 = {"Lot2$c$a;", "", "Lot2$c;", "Complete", "Lot2$c;", C17296a.f69688o, "()Lot2$c;", "Incomplete", "b", "<init>", "()V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
        /* renamed from: ot2$c$a */
        /* loaded from: classes.dex */
        public static final class C27095a {
            public /* synthetic */ C27095a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C27094c m20364a() {
                return C27094c.f102710c;
            }

            /* renamed from: b */
            public final C27094c m20363b() {
                return C27094c.f102711d;
            }

            private C27095a() {
            }
        }

        public C27094c(boolean z) {
            super(z, null);
        }

        public boolean equals(Object obj) {
            if ((obj instanceof C27094c) && m20367a() == ((C27094c) obj).m20367a()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Boolean.hashCode(m20367a());
        }

        public String toString() {
            return "NotLoading(endOfPaginationReached=" + m20367a() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public /* synthetic */ AbstractC46542ot2(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    /* renamed from: a */
    public final boolean m20367a() {
        return this.f102706a;
    }

    public AbstractC46542ot2(boolean z) {
        this.f102706a = z;
    }
}
