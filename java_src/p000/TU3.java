package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\"\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R \u0010\u000e\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0010\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\n\u0010\rR \u0010\u0014\u001a\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u000f\u0010\u0013\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, m28432d2 = {"LTU3;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", "LM26;", C17296a.f69688o, "J", "c", "()J", "width", "b", "height", "LXU3;", "I", "()I", "placeholderVerticalAlign", "<init>", "(JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPlaceholder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeholder.kt\nandroidx/compose/ui/text/Placeholder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
/* renamed from: TU3 */
/* loaded from: classes.dex */
public final class TU3 {

    /* renamed from: a */
    public final long f35539a;

    /* renamed from: b */
    public final long f35540b;

    /* renamed from: c */
    public final int f35541c;

    public /* synthetic */ TU3(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, i);
    }

    /* renamed from: a */
    public final long m83577a() {
        return this.f35540b;
    }

    /* renamed from: b */
    public final int m83576b() {
        return this.f35541c;
    }

    /* renamed from: c */
    public final long m83575c() {
        return this.f35539a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TU3)) {
            return false;
        }
        TU3 tu3 = (TU3) obj;
        if (M26.m95975e(this.f35539a, tu3.f35539a) && M26.m95975e(this.f35540b, tu3.f35540b) && XU3.m76957i(this.f35541c, tu3.f35541c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((M26.m95971i(this.f35539a) * 31) + M26.m95971i(this.f35540b)) * 31) + XU3.m76956j(this.f35541c);
    }

    public String toString() {
        return "Placeholder(width=" + ((Object) M26.m95970j(this.f35539a)) + ", height=" + ((Object) M26.m95970j(this.f35540b)) + ", placeholderVerticalAlign=" + ((Object) XU3.m76955k(this.f35541c)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public TU3(long j, long j2, int i) {
        this.f35539a = j;
        this.f35540b = j2;
        this.f35541c = i;
        if (!N26.m94413g(j)) {
            if (!(!N26.m94413g(j2))) {
                throw new IllegalArgumentException("height cannot be TextUnit.Unspecified".toString());
            }
            return;
        }
        throw new IllegalArgumentException("width cannot be TextUnit.Unspecified".toString());
    }
}
