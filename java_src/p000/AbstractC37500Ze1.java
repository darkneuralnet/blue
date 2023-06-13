package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\t\b\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0087\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8 X \u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0001\u0012¨\u0006\u0013"}, m28432d2 = {"LZe1;", "", "enter", "c", "", "toString", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "LH96;", "b", "()LH96;", MessageExtension.FIELD_DATA, "<init>", "()V", C17296a.f69688o, "Laf1;", "animation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ze1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC37500Ze1 {

    /* renamed from: a */
    public static final C10305a f48862a = new C10305a(null);

    /* renamed from: b */
    public static final AbstractC37500Ze1 f48863b = new C38082af1(new H96(null, null, null, null, 15, null));

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m28432d2 = {"LZe1$a;", "", "LZe1;", "None", "LZe1;", C17296a.f69688o, "()LZe1;", "<init>", "()V", "animation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Ze1$a */
    /* loaded from: classes.dex */
    public static final class C10305a {
        public /* synthetic */ C10305a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AbstractC37500Ze1 m72830a() {
            return AbstractC37500Ze1.f48863b;
        }

        private C10305a() {
        }
    }

    public /* synthetic */ AbstractC37500Ze1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: b */
    public abstract H96 mo70908b();

    /* renamed from: c */
    public final AbstractC37500Ze1 m72831c(AbstractC37500Ze1 enter) {
        Intrinsics.checkNotNullParameter(enter, "enter");
        C50590vj1 m104250b = mo70908b().m104250b();
        if (m104250b == null) {
            m104250b = enter.mo70908b().m104250b();
        }
        C39635dE5 m104248d = mo70908b().m104248d();
        if (m104248d == null) {
            m104248d = enter.mo70908b().m104248d();
        }
        C32612Eh0 m104251a = mo70908b().m104251a();
        if (m104251a == null) {
            m104251a = enter.mo70908b().m104251a();
        }
        C37306Yi5 m104249c = mo70908b().m104249c();
        if (m104249c == null) {
            m104249c = enter.mo70908b().m104249c();
        }
        return new C38082af1(new H96(m104250b, m104248d, m104251a, m104249c));
    }

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC37500Ze1) && Intrinsics.areEqual(((AbstractC37500Ze1) obj).mo70908b(), mo70908b());
    }

    public int hashCode() {
        return mo70908b().hashCode();
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        if (Intrinsics.areEqual(this, f48863b)) {
            return "EnterTransition.None";
        }
        H96 mo70908b = mo70908b();
        StringBuilder sb = new StringBuilder();
        sb.append("EnterTransition: \nFade - ");
        C50590vj1 m104250b = mo70908b.m104250b();
        String str4 = null;
        if (m104250b != null) {
            str = m104250b.toString();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(",\nSlide - ");
        C39635dE5 m104248d = mo70908b.m104248d();
        if (m104248d != null) {
            str2 = m104248d.toString();
        } else {
            str2 = null;
        }
        sb.append(str2);
        sb.append(",\nShrink - ");
        C32612Eh0 m104251a = mo70908b.m104251a();
        if (m104251a != null) {
            str3 = m104251a.toString();
        } else {
            str3 = null;
        }
        sb.append(str3);
        sb.append(",\nScale - ");
        C37306Yi5 m104249c = mo70908b.m104249c();
        if (m104249c != null) {
            str4 = m104249c.toString();
        }
        sb.append(str4);
        return sb.toString();
    }

    private AbstractC37500Ze1() {
    }
}
