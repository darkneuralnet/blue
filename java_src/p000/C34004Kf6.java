package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\u000f"}, m28432d2 = {"LKf6;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", C17296a.f69688o, "Ljava/lang/String;", "()Ljava/lang/String;", "url", "<init>", "(Ljava/lang/String;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Kf6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34004Kf6 {

    /* renamed from: a */
    public final String f20003a;

    public C34004Kf6(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f20003a = url;
    }

    /* renamed from: a */
    public final String m98577a() {
        return this.f20003a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C34004Kf6) && Intrinsics.areEqual(this.f20003a, ((C34004Kf6) obj).f20003a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f20003a.hashCode();
    }

    public String toString() {
        return "UrlAnnotation(url=" + this.f20003a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
