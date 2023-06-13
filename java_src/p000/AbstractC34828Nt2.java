package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m28432d2 = {"LNt2;", "", "<init>", "()V", C17296a.f69688o, "b", "c", "LNt2$a;", "LNt2$b;", "LNt2$c;", "web_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Nt2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC34828Nt2 {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"LNt2$a;", "LNt2;", "<init>", "()V", "web_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Nt2$a */
    /* loaded from: classes5.dex */
    public static final class C5733a extends AbstractC34828Nt2 {

        /* renamed from: a */
        public static final C5733a f25336a = new C5733a();

        private C5733a() {
            super(null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"LNt2$b;", "LNt2;", "<init>", "()V", "web_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Nt2$b */
    /* loaded from: classes5.dex */
    public static final class C5734b extends AbstractC34828Nt2 {

        /* renamed from: a */
        public static final C5734b f25337a = new C5734b();

        private C5734b() {
            super(null);
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LNt2$c;", "LNt2;", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "", C17296a.f69688o, "F", "getProgress", "()F", "progress", "<init>", "(F)V", "web_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Nt2$c */
    /* loaded from: classes5.dex */
    public static final class C5735c extends AbstractC34828Nt2 {

        /* renamed from: a */
        public final float f25338a;

        public C5735c(float f) {
            super(null);
            this.f25338a = f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C5735c) && Float.compare(this.f25338a, ((C5735c) obj).f25338a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f25338a);
        }

        public String toString() {
            return "Loading(progress=" + this.f25338a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public /* synthetic */ AbstractC34828Nt2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC34828Nt2() {
    }
}
