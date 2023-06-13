package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0001\tB'\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR \u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u0012\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0011\u0010\fR \u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\n\u0012\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0014\u0010\fR \u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\n\u0012\u0004\b\u0017\u0010\u000e\u001a\u0004\b\t\u0010\fR\u001a\u0010\u001b\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u0019\u0010\fR\u001a\u0010\u001d\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u0010\u0010\f¨\u0006 "}, m28432d2 = {"LD52;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "I", "c", "()I", "getLeft$annotations", "()V", "left", "b", "e", "getTop$annotations", "top", DateTokenConverter.CONVERTER_KEY, "getRight$annotations", "right", "getBottom$annotations", "bottom", "f", "getWidth$annotations", "width", "getHeight$annotations", "height", "<init>", "(IIII)V", "ui-unit_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: D52 */
/* loaded from: classes.dex */
public final class D52 {

    /* renamed from: e */
    public static final C1380a f5220e = new C1380a(null);

    /* renamed from: f */
    public static final D52 f5221f = new D52(0, 0, 0, 0);

    /* renamed from: a */
    public final int f5222a;

    /* renamed from: b */
    public final int f5223b;

    /* renamed from: c */
    public final int f5224c;

    /* renamed from: d */
    public final int f5225d;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"LD52$a;", "", "<init>", "()V", "ui-unit_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: D52$a */
    /* loaded from: classes.dex */
    public static final class C1380a {
        public /* synthetic */ C1380a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1380a() {
        }
    }

    public D52(int i, int i2, int i3, int i4) {
        this.f5222a = i;
        this.f5223b = i2;
        this.f5224c = i3;
        this.f5225d = i4;
    }

    /* renamed from: a */
    public final int m110924a() {
        return this.f5225d;
    }

    /* renamed from: b */
    public final int m110923b() {
        return this.f5225d - this.f5223b;
    }

    /* renamed from: c */
    public final int m110922c() {
        return this.f5222a;
    }

    /* renamed from: d */
    public final int m110921d() {
        return this.f5224c;
    }

    /* renamed from: e */
    public final int m110920e() {
        return this.f5223b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof D52) {
            D52 d52 = (D52) obj;
            return this.f5222a == d52.f5222a && this.f5223b == d52.f5223b && this.f5224c == d52.f5224c && this.f5225d == d52.f5225d;
        }
        return false;
    }

    /* renamed from: f */
    public final int m110919f() {
        return this.f5224c - this.f5222a;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f5222a) * 31) + Integer.hashCode(this.f5223b)) * 31) + Integer.hashCode(this.f5224c)) * 31) + Integer.hashCode(this.f5225d);
    }

    public String toString() {
        return "IntRect.fromLTRB(" + this.f5222a + ", " + this.f5223b + ", " + this.f5224c + ", " + this.f5225d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
