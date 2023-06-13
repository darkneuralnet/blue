package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\nB\u001e\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R \u0010\u000e\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0010\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, m28432d2 = {"LN16;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", "LM26;", C17296a.f69688o, "J", "b", "()J", "firstLine", "c", "restLine", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: N16 */
/* loaded from: classes.dex */
public final class N16 {

    /* renamed from: c */
    public static final C5461a f23977c = new C5461a(null);

    /* renamed from: d */
    public static final N16 f23978d = new N16(0, 0, 3, null);

    /* renamed from: a */
    public final long f23979a;

    /* renamed from: b */
    public final long f23980b;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m28432d2 = {"LN16$a;", "", "LN16;", "None", "LN16;", C17296a.f69688o, "()LN16;", "getNone$annotations", "()V", "<init>", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: N16$a */
    /* loaded from: classes.dex */
    public static final class C5461a {
        public /* synthetic */ C5461a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final N16 m94448a() {
            return N16.f23978d;
        }

        private C5461a() {
        }
    }

    public /* synthetic */ N16(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    /* renamed from: b */
    public final long m94450b() {
        return this.f23979a;
    }

    /* renamed from: c */
    public final long m94449c() {
        return this.f23980b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N16)) {
            return false;
        }
        N16 n16 = (N16) obj;
        if (M26.m95975e(this.f23979a, n16.f23979a) && M26.m95975e(this.f23980b, n16.f23980b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (M26.m95971i(this.f23979a) * 31) + M26.m95971i(this.f23980b);
    }

    public String toString() {
        return "TextIndent(firstLine=" + ((Object) M26.m95970j(this.f23979a)) + ", restLine=" + ((Object) M26.m95970j(this.f23980b)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public N16(long j, long j2) {
        this.f23979a = j;
        this.f23980b = j2;
    }

    public /* synthetic */ N16(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? N26.m94414f(0) : j, (i & 2) != 0 ? N26.m94414f(0) : j2, null);
    }
}
