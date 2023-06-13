package androidx.compose.p003ui.graphics;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0014\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0088\u0001\b\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m28432d2 = {"Landroidx/compose/ui/graphics/a;", "", "", "g", "(I)Ljava/lang/String;", "", "f", "(I)I", "value", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@JvmInline
/* renamed from: androidx.compose.ui.graphics.a */
/* loaded from: classes.dex */
public final class C11325a {

    /* renamed from: a */
    public static final C11326a f53022a = new C11326a(null);

    /* renamed from: b */
    public static final int f53023b = m68721d(0);

    /* renamed from: c */
    public static final int f53024c = m68721d(1);

    /* renamed from: d */
    public static final int f53025d = m68721d(2);

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, m28432d2 = {"Landroidx/compose/ui/graphics/a$a;", "", "Landroidx/compose/ui/graphics/a;", "Auto", "I", C17296a.f69688o, "()I", "Offscreen", "c", "ModulateAlpha", "b", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.a$a */
    /* loaded from: classes.dex */
    public static final class C11326a {
        public /* synthetic */ C11326a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m68717a() {
            return C11325a.f53023b;
        }

        /* renamed from: b */
        public final int m68716b() {
            return C11325a.f53025d;
        }

        /* renamed from: c */
        public final int m68715c() {
            return C11325a.f53024c;
        }

        private C11326a() {
        }
    }

    /* renamed from: d */
    public static int m68721d(int i) {
        return i;
    }

    /* renamed from: e */
    public static final boolean m68720e(int i, int i2) {
        return i == i2;
    }

    /* renamed from: f */
    public static int m68719f(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: g */
    public static String m68718g(int i) {
        return "CompositingStrategy(value=" + i + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
