package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0016\u0012\n\u0010\u000f\u001a\u00060\u0005j\u0002`\fø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u000f\u001a\u00060\u0005j\u0002`\f8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0088\u0001\u000f\u0092\u0001\u00060\u0005j\u0002`\fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, m28432d2 = {"LxX3;", "", "", "e", "(I)Ljava/lang/String;", "", DateTokenConverter.CONVERTER_KEY, "(I)I", LegacyRepairType.OTHER_KEY, "", "c", "(ILjava/lang/Object;)Z", "Landroidx/compose/ui/input/pointer/NativePointerKeyboardModifiers;", C17296a.f69688o, "I", "packedValue", "b", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@JvmInline
/* renamed from: xX3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51661xX3 {

    /* renamed from: a */
    public final int f117771a;

    public /* synthetic */ C51661xX3(int i) {
        this.f117771a = i;
    }

    /* renamed from: a */
    public static final /* synthetic */ C51661xX3 m5064a(int i) {
        return new C51661xX3(i);
    }

    /* renamed from: b */
    public static int m5063b(int i) {
        return i;
    }

    /* renamed from: c */
    public static boolean m5062c(int i, Object obj) {
        return (obj instanceof C51661xX3) && i == ((C51661xX3) obj).m5059f();
    }

    /* renamed from: d */
    public static int m5061d(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: e */
    public static String m5060e(int i) {
        return "PointerKeyboardModifiers(packedValue=" + i + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return m5062c(this.f117771a, obj);
    }

    /* renamed from: f */
    public final /* synthetic */ int m5059f() {
        return this.f117771a;
    }

    public int hashCode() {
        return m5061d(this.f117771a);
    }

    public String toString() {
        return m5060e(this.f117771a);
    }
}
