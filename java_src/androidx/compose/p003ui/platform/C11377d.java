package androidx.compose.p003ui.platform;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¨\u0006\u000e"}, m28432d2 = {"Landroidx/compose/ui/platform/d;", "LO1;", "", "current", "", C17296a.f69688o, "b", "index", "", "j", "i", "<init>", "()V", "c", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.d */
/* loaded from: classes.dex */
public final class C11377d extends AbstractC5805O1 {

    /* renamed from: c */
    public static final C11378a f53256c = new C11378a(null);

    /* renamed from: d */
    public static C11377d f53257d;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m28432d2 = {"Landroidx/compose/ui/platform/d$a;", "", "Landroidx/compose/ui/platform/d;", C17296a.f69688o, "instance", "Landroidx/compose/ui/platform/d;", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.d$a */
    /* loaded from: classes.dex */
    public static final class C11378a {
        public /* synthetic */ C11378a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C11377d m68473a() {
            if (C11377d.f53257d == null) {
                C11377d.f53257d = new C11377d(null);
            }
            C11377d c11377d = C11377d.f53257d;
            Intrinsics.checkNotNull(c11377d, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
            return c11377d;
        }

        private C11378a() {
        }
    }

    public /* synthetic */ C11377d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        return null;
     */
    @Override // p000.InterfaceC6230P1
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int[] mo68472a(int i) {
        int length = m93013d().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && m93013d().charAt(i) == '\n' && !m68474j(i)) {
            i++;
        }
        int i2 = i + 1;
        while (i2 < length && !m68475i(i2)) {
            i2++;
        }
        return m93014c(i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        return null;
     */
    @Override // p000.InterfaceC6230P1
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int[] mo68471b(int i) {
        int length = m93013d().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && m93013d().charAt(i - 1) == '\n' && !m68475i(i)) {
            i--;
        }
        int i2 = i - 1;
        while (i2 > 0 && !m68474j(i2)) {
            i2--;
        }
        return m93014c(i2, i);
    }

    /* renamed from: i */
    public final boolean m68475i(int i) {
        if (i > 0 && m93013d().charAt(i - 1) != '\n' && (i == m93013d().length() || m93013d().charAt(i) == '\n')) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m68474j(int i) {
        if (m93013d().charAt(i) != '\n' && (i == 0 || m93013d().charAt(i - 1) == '\n')) {
            return true;
        }
        return false;
    }

    private C11377d() {
    }
}
