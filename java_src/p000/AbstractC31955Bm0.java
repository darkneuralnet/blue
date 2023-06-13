package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u0000 .2\u00020\u0001:\u0001\u0019B$\b\u0000\u0012\u0006\u0010'\u001a\u00020\u001e\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u00100\u001a\u00020\u0002ø\u0001\u0002¢\u0006\u0004\b5\u00106J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&J'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J@\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0000H\u0010ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\u0013\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010#\u001a\u00020\u0002H\u0016R\u0017\u0010'\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u0019\u0010$\u001a\u0004\b%\u0010&R \u0010+\u001a\u00020(8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b\b\u0010*R\u001a\u00100\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0011\u00101\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b,\u0010/R\u0014\u00104\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00067"}, m28432d2 = {"LBm0;", "", "", "component", "", "f", "e", "r", "g", "b", "", "k", "v", "l", "v0", "v1", "v2", "", "j", "(FFF)J", "m", "(FFF)F", "x", "y", "z", C17296a.f69688o, "colorSpace", "Lpm0;", "n", "(FFFFLBm0;)J", "", "toString", LegacyRepairType.OTHER_KEY, "", "equals", "hashCode", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "name", "Lwm0;", "J", "()J", RequestHeadersFactory.MODEL, "c", "I", DateTokenConverter.CONVERTER_KEY, "()I", "id", "componentCount", "i", "()Z", "isSrgb", "<init>", "(Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nColorSpace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpace\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,796:1\n25#2,3:797\n*S KotlinDebug\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpace\n*L\n288#1:797,3\n*E\n"})
/* renamed from: Bm0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC31955Bm0 {

    /* renamed from: d */
    public static final C0729a f2859d = new C0729a(null);

    /* renamed from: a */
    public final String f2860a;

    /* renamed from: b */
    public final long f2861b;

    /* renamed from: c */
    public final int f2862c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"LBm0$a;", "", "", "MaxId", "I", "MinId", "<init>", "()V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Bm0$a */
    /* loaded from: classes.dex */
    public static final class C0729a {
        public /* synthetic */ C0729a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0729a() {
        }
    }

    public /* synthetic */ AbstractC31955Bm0(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, i);
    }

    /* renamed from: a */
    public final float[] m113512a(float f, float f2, float f3) {
        float[] fArr = new float[C51212wm0.m6386f(this.f2861b)];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        return mo73366b(fArr);
    }

    /* renamed from: b */
    public abstract float[] mo73366b(float[] fArr);

    /* renamed from: c */
    public final int m113511c() {
        return C51212wm0.m6386f(this.f2861b);
    }

    /* renamed from: d */
    public final int m113510d() {
        return this.f2862c;
    }

    /* renamed from: e */
    public abstract float mo73365e(int i);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC31955Bm0 abstractC31955Bm0 = (AbstractC31955Bm0) obj;
        if (this.f2862c != abstractC31955Bm0.f2862c || !Intrinsics.areEqual(this.f2860a, abstractC31955Bm0.f2860a)) {
            return false;
        }
        return C51212wm0.m6387e(this.f2861b, abstractC31955Bm0.f2861b);
    }

    /* renamed from: f */
    public abstract float mo73364f(int i);

    /* renamed from: g */
    public final long m113509g() {
        return this.f2861b;
    }

    /* renamed from: h */
    public final String m113508h() {
        return this.f2860a;
    }

    public int hashCode() {
        return (((this.f2860a.hashCode() * 31) + C51212wm0.m6385g(this.f2861b)) * 31) + this.f2862c;
    }

    /* renamed from: i */
    public boolean mo85553i() {
        return false;
    }

    /* renamed from: j */
    public long mo73363j(float f, float f2, float f3) {
        float[] m113507k = m113507k(f, f2, f3);
        return (Float.floatToIntBits(m113507k[0]) << 32) | (Float.floatToIntBits(m113507k[1]) & 4294967295L);
    }

    /* renamed from: k */
    public final float[] m113507k(float f, float f2, float f3) {
        return mo73362l(new float[]{f, f2, f3});
    }

    /* renamed from: l */
    public abstract float[] mo73362l(float[] fArr);

    /* renamed from: m */
    public float mo73361m(float f, float f2, float f3) {
        return m113507k(f, f2, f3)[2];
    }

    /* renamed from: n */
    public long mo73360n(float f, float f2, float f3, float f4, AbstractC31955Bm0 colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        float[] m113512a = m113512a(f, f2, f3);
        return C50619vm0.m8180a(m113512a[0], m113512a[1], m113512a[2], f4, colorSpace);
    }

    public String toString() {
        return this.f2860a + " (id=" + this.f2862c + ", model=" + ((Object) C51212wm0.m6384h(this.f2861b)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public AbstractC31955Bm0(String str, long j, int i) {
        this.f2860a = str;
        this.f2861b = j;
        this.f2862c = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }
}
