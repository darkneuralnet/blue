package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\nB\t\b\u0016¢\u0006\u0004\b\u0016\u0010\u000fB \b\u0017\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000R \u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR \u0010\u0015\u001a\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, m28432d2 = {"LZV3;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "Z", "c", "()Z", "getIncludeFontPadding$annotations", "()V", "includeFontPadding", "LHa1;", "b", "I", "()I", "emojiSupportMatch", "<init>", "(IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ZV3 */
/* loaded from: classes.dex */
public final class ZV3 {

    /* renamed from: c */
    public static final C10284a f48693c = new C10284a(null);

    /* renamed from: d */
    public static final ZV3 f48694d = new ZV3();

    /* renamed from: a */
    public final boolean f48695a;

    /* renamed from: b */
    public final int f48696b;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m28432d2 = {"LZV3$a;", "", "LZV3;", "Default", "LZV3;", C17296a.f69688o, "()LZV3;", "<init>", "()V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: ZV3$a */
    /* loaded from: classes.dex */
    public static final class C10284a {
        public /* synthetic */ C10284a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ZV3 m72999a() {
            return ZV3.f48694d;
        }

        private C10284a() {
        }
    }

    @Deprecated(message = "Provides configuration options for behavior compatibility.")
    public /* synthetic */ ZV3(int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z);
    }

    /* renamed from: b */
    public final int m73002b() {
        return this.f48696b;
    }

    /* renamed from: c */
    public final boolean m73001c() {
        return this.f48695a;
    }

    /* renamed from: d */
    public final ZV3 m73000d(ZV3 zv3) {
        return zv3 == null ? this : zv3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZV3)) {
            return false;
        }
        ZV3 zv3 = (ZV3) obj;
        if (this.f48695a == zv3.f48695a && C33252Ha1.m103711f(this.f48696b, zv3.f48696b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f48695a) * 31) + C33252Ha1.m103710g(this.f48696b);
    }

    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f48695a + ", emojiSupportMatch=" + ((Object) C33252Ha1.m103709h(this.f48696b)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public ZV3(int i, boolean z) {
        this.f48695a = z;
        this.f48696b = i;
    }

    public ZV3() {
        this(C33252Ha1.f13558b.m103707a(), true, null);
    }
}
