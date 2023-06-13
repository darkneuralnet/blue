package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0012\u0012\u0006\u0010\u0012\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011\u0088\u0001\u0012\u0092\u0001\u00020\rø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, m28432d2 = {"LMB5;", "T", "", "", "e", "(LEt0;)Ljava/lang/String;", "", DateTokenConverter.CONVERTER_KEY, "(LEt0;)I", LegacyRepairType.OTHER_KEY, "", "c", "(LEt0;Ljava/lang/Object;)Z", "LEt0;", C17296a.f69688o, "LEt0;", "getComposer$annotations", "()V", "composer", "b", "(LEt0;)LEt0;", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@JvmInline
/* renamed from: MB5 */
/* loaded from: classes.dex */
public final class MB5<T> {

    /* renamed from: a */
    public final InterfaceC32720Et0 f22788a;

    public /* synthetic */ MB5(InterfaceC32720Et0 interfaceC32720Et0) {
        this.f22788a = interfaceC32720Et0;
    }

    /* renamed from: a */
    public static final /* synthetic */ MB5 m95606a(InterfaceC32720Et0 interfaceC32720Et0) {
        return new MB5(interfaceC32720Et0);
    }

    /* renamed from: b */
    public static <T> InterfaceC32720Et0 m95605b(InterfaceC32720Et0 composer) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        return composer;
    }

    /* renamed from: c */
    public static boolean m95604c(InterfaceC32720Et0 interfaceC32720Et0, Object obj) {
        return (obj instanceof MB5) && Intrinsics.areEqual(interfaceC32720Et0, ((MB5) obj).m95601f());
    }

    /* renamed from: d */
    public static int m95603d(InterfaceC32720Et0 interfaceC32720Et0) {
        return interfaceC32720Et0.hashCode();
    }

    /* renamed from: e */
    public static String m95602e(InterfaceC32720Et0 interfaceC32720Et0) {
        return "SkippableUpdater(composer=" + interfaceC32720Et0 + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return m95604c(this.f22788a, obj);
    }

    /* renamed from: f */
    public final /* synthetic */ InterfaceC32720Et0 m95601f() {
        return this.f22788a;
    }

    public int hashCode() {
        return m95603d(this.f22788a);
    }

    public String toString() {
        return m95602e(this.f22788a);
    }
}
