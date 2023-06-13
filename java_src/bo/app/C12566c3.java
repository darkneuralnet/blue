package bo.app;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u0016"}, m28432d2 = {"Lbo/app/c3;", "", "", "toString", "Lbo/app/t2;", C17296a.f69688o, "Lbo/app/y2;", "b", "LwO1;", "c", DateTokenConverter.CONVERTER_KEY, "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "triggerEvent", "triggeredAction", "inAppMessage", "userId", "<init>", "(Lbo/app/t2;Lbo/app/y2;LwO1;Ljava/lang/String;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.c3 */
/* loaded from: classes.dex */
public final class C12566c3 {

    /* renamed from: a */
    private final InterfaceC13145t2 f58285a;

    /* renamed from: b */
    private final InterfaceC13232y2 f58286b;

    /* renamed from: c */
    private final InterfaceC50985wO1 f58287c;

    /* renamed from: d */
    private final String f58288d;

    public C12566c3(InterfaceC13145t2 triggerEvent, InterfaceC13232y2 triggeredAction, InterfaceC50985wO1 inAppMessage, String str) {
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        Intrinsics.checkNotNullParameter(triggeredAction, "triggeredAction");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        this.f58285a = triggerEvent;
        this.f58286b = triggeredAction;
        this.f58287c = inAppMessage;
        this.f58288d = str;
    }

    /* renamed from: a */
    public final InterfaceC13145t2 m63874a() {
        return this.f58285a;
    }

    /* renamed from: b */
    public final InterfaceC13232y2 m63873b() {
        return this.f58286b;
    }

    /* renamed from: c */
    public final InterfaceC50985wO1 m63872c() {
        return this.f58287c;
    }

    /* renamed from: d */
    public final String m63871d() {
        return this.f58288d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12566c3) {
            C12566c3 c12566c3 = (C12566c3) obj;
            return Intrinsics.areEqual(this.f58285a, c12566c3.f58285a) && Intrinsics.areEqual(this.f58286b, c12566c3.f58286b) && Intrinsics.areEqual(this.f58287c, c12566c3.f58287c) && Intrinsics.areEqual(this.f58288d, c12566c3.f58288d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f58285a.hashCode() * 31) + this.f58286b.hashCode()) * 31) + this.f58287c.hashCode()) * 31;
        String str = this.f58288d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String trimIndent;
        trimIndent = StringsKt__IndentKt.trimIndent("\n             " + C31696Aj2.m115350i(this.f58287c.forJsonPut()) + "\n             Triggered Action Id: " + this.f58286b.getId() + "\n             Trigger Event: " + this.f58285a + "\n             User Id: " + ((Object) this.f58288d) + "\n        ");
        return trimIndent;
    }
}
