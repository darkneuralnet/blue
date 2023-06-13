package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087@\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0014\b\u0000\u0012\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0006\u001a\u0004\b\b\u0010\u0004\u0088\u0001\f\u0092\u0001\u00020\u000bø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m28432d2 = {"LZi5;", "", "", "b", "(J)F", "getScaleX$annotations", "()V", "scaleX", "c", "getScaleY$annotations", "scaleY", "", "packedValue", C17296a.f69688o, "(J)J", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@JvmInline
@SourceDebugExtension({"SMAP\nScaleFactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactor\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,197:1\n34#2:198\n41#2:199\n*S KotlinDebug\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactor\n*L\n51#1:198\n65#1:199\n*E\n"})
/* renamed from: Zi5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37540Zi5 {

    /* renamed from: a */
    public static final C10336a f48983a = new C10336a(null);

    /* renamed from: b */
    public static final long f48984b = C38126aj5.m70823a(Float.NaN, Float.NaN);

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"LZi5$a;", "", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Zi5$a */
    /* loaded from: classes.dex */
    public static final class C10336a {
        public /* synthetic */ C10336a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C10336a() {
        }
    }

    /* renamed from: a */
    public static long m72653a(long j) {
        return j;
    }

    /* renamed from: b */
    public static final float m72652b(long j) {
        boolean z;
        if (j != f48984b) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }

    /* renamed from: c */
    public static final float m72651c(long j) {
        boolean z;
        if (j != f48984b) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }
}
