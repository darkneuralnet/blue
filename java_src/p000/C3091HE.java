package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\rB\u0012\u0012\u0006\u0010\u0011\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0088\u0001\u0011\u0092\u0001\u00020\fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, m28432d2 = {"LHE;", "", "", "g", "(F)Ljava/lang/String;", "", "f", "(F)I", LegacyRepairType.OTHER_KEY, "", DateTokenConverter.CONVERTER_KEY, "(FLjava/lang/Object;)Z", "", C17296a.f69688o, "F", "getMultiplier", "()F", "multiplier", "c", "(F)F", "b", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@JvmInline
/* renamed from: HE */
/* loaded from: classes.dex */
public final class C3091HE {

    /* renamed from: b */
    public static final C3092a f13105b = new C3092a(null);

    /* renamed from: c */
    public static final float f13106c = m104160c(0.5f);

    /* renamed from: d */
    public static final float f13107d = m104160c(-0.5f);

    /* renamed from: e */
    public static final float f13108e = m104160c(0.0f);

    /* renamed from: a */
    public final float f13109a;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bR)\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, m28432d2 = {"LHE$a;", "", "LHE;", "None", "F", C17296a.f69688o, "()F", "getNone-y9eOQZs$annotations", "()V", "<init>", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: HE$a */
    /* loaded from: classes.dex */
    public static final class C3092a {
        public /* synthetic */ C3092a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final float m104154a() {
            return C3091HE.f13108e;
        }

        private C3092a() {
        }
    }

    public /* synthetic */ C3091HE(float f) {
        this.f13109a = f;
    }

    /* renamed from: b */
    public static final /* synthetic */ C3091HE m104161b(float f) {
        return new C3091HE(f);
    }

    /* renamed from: c */
    public static float m104160c(float f) {
        return f;
    }

    /* renamed from: d */
    public static boolean m104159d(float f, Object obj) {
        return (obj instanceof C3091HE) && Float.compare(f, ((C3091HE) obj).m104155h()) == 0;
    }

    /* renamed from: e */
    public static final boolean m104158e(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    /* renamed from: f */
    public static int m104157f(float f) {
        return Float.hashCode(f);
    }

    /* renamed from: g */
    public static String m104156g(float f) {
        return "BaselineShift(multiplier=" + f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return m104159d(this.f13109a, obj);
    }

    /* renamed from: h */
    public final /* synthetic */ float m104155h() {
        return this.f13109a;
    }

    public int hashCode() {
        return m104157f(this.f13109a);
    }

    public String toString() {
        return m104156g(this.f13109a);
    }
}
