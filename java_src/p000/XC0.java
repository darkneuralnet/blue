package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"LXC0;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "b", "Ljava/lang/String;", "y", "()Ljava/lang/String;", "name", "c", C17296a.f69688o, "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: XC0 */
/* loaded from: classes8.dex */
public final class XC0 extends AbstractCoroutineContextElement {

    /* renamed from: c */
    public static final C9380a f42869c = new C9380a(null);

    /* renamed from: b */
    public final String f42870b;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"LXC0$a;", "Lkotlin/coroutines/CoroutineContext$Key;", "LXC0;", "<init>", "()V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: XC0$a */
    /* loaded from: classes8.dex */
    public static final class C9380a implements CoroutineContext.Key<XC0> {
        public /* synthetic */ C9380a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C9380a() {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof XC0) && Intrinsics.areEqual(this.f42870b, ((XC0) obj).f42870b);
    }

    public int hashCode() {
        return this.f42870b.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f42870b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* renamed from: y */
    public final String m77190y() {
        return this.f42870b;
    }
}
