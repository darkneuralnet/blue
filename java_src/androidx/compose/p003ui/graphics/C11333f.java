package androidx.compose.p003ui.graphics;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t\b\u0087@\u0018\u0000 \u001a2\u00020\u0001:\u0001\rB\u0014\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014\u0088\u0001\u0011\u0092\u0001\u00020\fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, m28432d2 = {"Landroidx/compose/ui/graphics/f;", "", "", "i", "(J)Ljava/lang/String;", "", "h", "(J)I", LegacyRepairType.OTHER_KEY, "", DateTokenConverter.CONVERTER_KEY, "(JLjava/lang/Object;)Z", "", C17296a.f69688o, "J", "getPackedValue$annotations", "()V", "packedValue", "", "f", "(J)F", "pivotFractionX", "g", "pivotFractionY", "c", "(J)J", "b", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@JvmInline
@SourceDebugExtension({"SMAP\nTransformOrigin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformOrigin.kt\nandroidx/compose/ui/graphics/TransformOrigin\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,83:1\n34#2:84\n41#2:85\n*S KotlinDebug\n*F\n+ 1 TransformOrigin.kt\nandroidx/compose/ui/graphics/TransformOrigin\n*L\n46#1:84\n55#1:85\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.f */
/* loaded from: classes.dex */
public final class C11333f {

    /* renamed from: b */
    public static final C11334a f53066b = new C11334a(null);

    /* renamed from: c */
    public static final long f53067c = C45519n96.m24273a(0.5f, 0.5f);

    /* renamed from: a */
    public final long f53068a;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, m28432d2 = {"Landroidx/compose/ui/graphics/f$a;", "", "Landroidx/compose/ui/graphics/f;", "Center", "J", C17296a.f69688o, "()J", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.f$a */
    /* loaded from: classes.dex */
    public static final class C11334a {
        public /* synthetic */ C11334a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long m68626a() {
            return C11333f.f53067c;
        }

        private C11334a() {
        }
    }

    public /* synthetic */ C11333f(long j) {
        this.f53068a = j;
    }

    /* renamed from: b */
    public static final /* synthetic */ C11333f m68635b(long j) {
        return new C11333f(j);
    }

    /* renamed from: c */
    public static long m68634c(long j) {
        return j;
    }

    /* renamed from: d */
    public static boolean m68633d(long j, Object obj) {
        return (obj instanceof C11333f) && j == ((C11333f) obj).m68627j();
    }

    /* renamed from: e */
    public static final boolean m68632e(long j, long j2) {
        return j == j2;
    }

    /* renamed from: f */
    public static final float m68631f(long j) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: g */
    public static final float m68630g(long j) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: h */
    public static int m68629h(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: i */
    public static String m68628i(long j) {
        return "TransformOrigin(packedValue=" + j + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return m68633d(this.f53068a, obj);
    }

    public int hashCode() {
        return m68629h(this.f53068a);
    }

    /* renamed from: j */
    public final /* synthetic */ long m68627j() {
        return this.f53068a;
    }

    public String toString() {
        return m68628i(this.f53068a);
    }
}
