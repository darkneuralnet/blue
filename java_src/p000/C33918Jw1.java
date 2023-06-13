package p000;

import androidx.recyclerview.widget.C11925l;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m28432d2 = {"LJw1;", "", LegacyRepairType.OTHER_KEY, "", "j", "", "", "equals", "hashCode", "", "toString", "b", "I", "k", "()I", "weight", "<init>", "(I)V", "c", C17296a.f69688o, "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Jw1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33918Jw1 implements Comparable<C33918Jw1> {

    /* renamed from: c */
    public static final C4281a f18784c = new C4281a(null);

    /* renamed from: d */
    public static final C33918Jw1 f18785d;

    /* renamed from: e */
    public static final C33918Jw1 f18786e;

    /* renamed from: f */
    public static final C33918Jw1 f18787f;

    /* renamed from: g */
    public static final C33918Jw1 f18788g;

    /* renamed from: h */
    public static final C33918Jw1 f18789h;

    /* renamed from: i */
    public static final C33918Jw1 f18790i;

    /* renamed from: j */
    public static final C33918Jw1 f18791j;

    /* renamed from: k */
    public static final C33918Jw1 f18792k;

    /* renamed from: l */
    public static final C33918Jw1 f18793l;

    /* renamed from: m */
    public static final C33918Jw1 f18794m;

    /* renamed from: n */
    public static final C33918Jw1 f18795n;

    /* renamed from: o */
    public static final C33918Jw1 f18796o;

    /* renamed from: p */
    public static final C33918Jw1 f18797p;

    /* renamed from: q */
    public static final C33918Jw1 f18798q;

    /* renamed from: r */
    public static final C33918Jw1 f18799r;

    /* renamed from: s */
    public static final C33918Jw1 f18800s;

    /* renamed from: t */
    public static final C33918Jw1 f18801t;

    /* renamed from: u */
    public static final C33918Jw1 f18802u;

    /* renamed from: v */
    public static final List<C33918Jw1> f18803v;

    /* renamed from: b */
    public final int f18804b;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u0012\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006R \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u0012\u0004\b\u0011\u0010\b\u001a\u0004\b\u0010\u0010\u0006R \u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u0012\u0004\b\u0014\u0010\b\u001a\u0004\b\u0013\u0010\u0006R \u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u0012\u0004\b\u0017\u0010\b\u001a\u0004\b\u0016\u0010\u0006R \u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0004\u0012\u0004\b\u001a\u0010\b\u001a\u0004\b\u0019\u0010\u0006R \u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u0004\u0012\u0004\b\u001d\u0010\b\u001a\u0004\b\u001c\u0010\u0006R \u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u0004\u0012\u0004\b \u0010\b\u001a\u0004\b\u001f\u0010\u0006¨\u0006\""}, m28432d2 = {"LJw1$a;", "", "LJw1;", "W400", "LJw1;", "f", "()LJw1;", "getW400$annotations", "()V", "W500", "g", "getW500$annotations", "W600", "h", "getW600$annotations", "W700", "i", "getW700$annotations", "Light", "b", "getLight$annotations", "Normal", DateTokenConverter.CONVERTER_KEY, "getNormal$annotations", "Medium", "c", "getMedium$annotations", "SemiBold", "e", "getSemiBold$annotations", "Bold", C17296a.f69688o, "getBold$annotations", "<init>", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Jw1$a */
    /* loaded from: classes.dex */
    public static final class C4281a {
        public /* synthetic */ C4281a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C33918Jw1 m99543a() {
            return C33918Jw1.f18800s;
        }

        /* renamed from: b */
        public final C33918Jw1 m99542b() {
            return C33918Jw1.f18796o;
        }

        /* renamed from: c */
        public final C33918Jw1 m99541c() {
            return C33918Jw1.f18798q;
        }

        /* renamed from: d */
        public final C33918Jw1 m99540d() {
            return C33918Jw1.f18797p;
        }

        /* renamed from: e */
        public final C33918Jw1 m99539e() {
            return C33918Jw1.f18799r;
        }

        /* renamed from: f */
        public final C33918Jw1 m99538f() {
            return C33918Jw1.f18788g;
        }

        /* renamed from: g */
        public final C33918Jw1 m99537g() {
            return C33918Jw1.f18789h;
        }

        /* renamed from: h */
        public final C33918Jw1 m99536h() {
            return C33918Jw1.f18790i;
        }

        /* renamed from: i */
        public final C33918Jw1 m99535i() {
            return C33918Jw1.f18791j;
        }

        private C4281a() {
        }
    }

    static {
        C33918Jw1 c33918Jw1 = new C33918Jw1(100);
        f18785d = c33918Jw1;
        C33918Jw1 c33918Jw12 = new C33918Jw1(C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION);
        f18786e = c33918Jw12;
        C33918Jw1 c33918Jw13 = new C33918Jw1(300);
        f18787f = c33918Jw13;
        C33918Jw1 c33918Jw14 = new C33918Jw1(400);
        f18788g = c33918Jw14;
        C33918Jw1 c33918Jw15 = new C33918Jw1(500);
        f18789h = c33918Jw15;
        C33918Jw1 c33918Jw16 = new C33918Jw1(600);
        f18790i = c33918Jw16;
        C33918Jw1 c33918Jw17 = new C33918Jw1(700);
        f18791j = c33918Jw17;
        C33918Jw1 c33918Jw18 = new C33918Jw1(800);
        f18792k = c33918Jw18;
        C33918Jw1 c33918Jw19 = new C33918Jw1(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS);
        f18793l = c33918Jw19;
        f18794m = c33918Jw1;
        f18795n = c33918Jw12;
        f18796o = c33918Jw13;
        f18797p = c33918Jw14;
        f18798q = c33918Jw15;
        f18799r = c33918Jw16;
        f18800s = c33918Jw17;
        f18801t = c33918Jw18;
        f18802u = c33918Jw19;
        f18803v = CollectionsKt.listOf((Object[]) new C33918Jw1[]{c33918Jw1, c33918Jw12, c33918Jw13, c33918Jw14, c33918Jw15, c33918Jw16, c33918Jw17, c33918Jw18, c33918Jw19});
    }

    public C33918Jw1(int i) {
        this.f18804b = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(("Font weight can be in range [1, 1000]. Current value: " + i).toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C33918Jw1) && this.f18804b == ((C33918Jw1) obj).f18804b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f18804b;
    }

    @Override // java.lang.Comparable
    /* renamed from: j */
    public int compareTo(C33918Jw1 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.compare(this.f18804b, other.f18804b);
    }

    /* renamed from: k */
    public final int m99544k() {
        return this.f18804b;
    }

    public String toString() {
        return "FontWeight(weight=" + this.f18804b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
