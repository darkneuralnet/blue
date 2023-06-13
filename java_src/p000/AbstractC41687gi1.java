package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\t\b\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0087\u0002J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8 X \u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0001\u0012¨\u0006\u0013"}, m28432d2 = {"Lgi1;", "", "exit", "c", LegacyRepairType.OTHER_KEY, "", "equals", "", "toString", "", "hashCode", "LH96;", "b", "()LH96;", MessageExtension.FIELD_DATA, "<init>", "()V", C17296a.f69688o, "Lhi1;", "animation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: gi1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC41687gi1 {

    /* renamed from: a */
    public static final C22414a f84046a = new C22414a(null);

    /* renamed from: b */
    public static final AbstractC41687gi1 f84047b = new C42280hi1(new H96(null, null, null, null, 15, null));

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m28432d2 = {"Lgi1$a;", "", "Lgi1;", "None", "Lgi1;", C17296a.f69688o, "()Lgi1;", "<init>", "()V", "animation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: gi1$a */
    /* loaded from: classes.dex */
    public static final class C22414a {
        public /* synthetic */ C22414a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AbstractC41687gi1 m37886a() {
            return AbstractC41687gi1.f84047b;
        }

        private C22414a() {
        }
    }

    public /* synthetic */ AbstractC41687gi1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: b */
    public abstract H96 mo36086b();

    /* renamed from: c */
    public final AbstractC41687gi1 m37887c(AbstractC41687gi1 exit) {
        Intrinsics.checkNotNullParameter(exit, "exit");
        C50590vj1 m104250b = mo36086b().m104250b();
        if (m104250b == null) {
            m104250b = exit.mo36086b().m104250b();
        }
        C39635dE5 m104248d = mo36086b().m104248d();
        if (m104248d == null) {
            m104248d = exit.mo36086b().m104248d();
        }
        C32612Eh0 m104251a = mo36086b().m104251a();
        if (m104251a == null) {
            m104251a = exit.mo36086b().m104251a();
        }
        C37306Yi5 m104249c = mo36086b().m104249c();
        if (m104249c == null) {
            m104249c = exit.mo36086b().m104249c();
        }
        return new C42280hi1(new H96(m104250b, m104248d, m104251a, m104249c));
    }

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC41687gi1) && Intrinsics.areEqual(((AbstractC41687gi1) obj).mo36086b(), mo36086b());
    }

    public int hashCode() {
        return mo36086b().hashCode();
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        if (Intrinsics.areEqual(this, f84047b)) {
            return "ExitTransition.None";
        }
        H96 mo36086b = mo36086b();
        StringBuilder sb = new StringBuilder();
        sb.append("ExitTransition: \nFade - ");
        C50590vj1 m104250b = mo36086b.m104250b();
        String str4 = null;
        if (m104250b != null) {
            str = m104250b.toString();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(",\nSlide - ");
        C39635dE5 m104248d = mo36086b.m104248d();
        if (m104248d != null) {
            str2 = m104248d.toString();
        } else {
            str2 = null;
        }
        sb.append(str2);
        sb.append(",\nShrink - ");
        C32612Eh0 m104251a = mo36086b.m104251a();
        if (m104251a != null) {
            str3 = m104251a.toString();
        } else {
            str3 = null;
        }
        sb.append(str3);
        sb.append(",\nScale - ");
        C37306Yi5 m104249c = mo36086b.m104249c();
        if (m104249c != null) {
            str4 = m104249c.toString();
        }
        sb.append(str4);
        return sb.toString();
    }

    private AbstractC41687gi1() {
    }
}
