package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0010\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0011J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0088\u0001\u0010\u0092\u0001\u00020\tø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m28432d2 = {"Lqa1;", "", "", DateTokenConverter.CONVERTER_KEY, "(Z)Ljava/lang/String;", "", "c", "(Z)I", LegacyRepairType.OTHER_KEY, "", "b", "(ZLjava/lang/Object;)Z", C17296a.f69688o, "Z", "getValidationRequired", "()Z", "validationRequired", "(Z)Z", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@JvmInline
/* renamed from: qa1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C47537qa1 {

    /* renamed from: a */
    public final boolean f105438a;

    public /* synthetic */ C47537qa1(boolean z) {
        this.f105438a = z;
    }

    /* renamed from: a */
    public static boolean m17434a(boolean z) {
        return z;
    }

    /* renamed from: b */
    public static boolean m17433b(boolean z, Object obj) {
        return (obj instanceof C47537qa1) && z == ((C47537qa1) obj).m118446unboximpl();
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ C47537qa1 m118445boximpl(boolean z) {
        return new C47537qa1(z);
    }

    /* renamed from: c */
    public static int m17432c(boolean z) {
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    /* renamed from: d */
    public static String m17431d(boolean z) {
        return "EmailLoginResult(validationRequired=" + z + ")";
    }

    public boolean equals(Object obj) {
        return m17433b(this.f105438a, obj);
    }

    public int hashCode() {
        return m17432c(this.f105438a);
    }

    public String toString() {
        return m17431d(this.f105438a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ boolean m118446unboximpl() {
        return this.f105438a;
    }
}
