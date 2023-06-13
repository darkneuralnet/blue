package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000bB\u0011\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015B\u0011\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016R\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0018"}, m28432d2 = {"Lqv2;", "", "", DateTokenConverter.CONVERTER_KEY, LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "toString", "LBV3;", C17296a.f69688o, "LBV3;", "b", "()LBV3;", "platformLocale", "()Ljava/lang/String;", "language", "c", "region", "<init>", "(LBV3;)V", "languageTag", "(Ljava/lang/String;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: qv2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47748qv2 {

    /* renamed from: b */
    public static final C27736a f106064b = new C27736a(null);

    /* renamed from: a */
    public final BV3 f106065a;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lqv2$a;", "", "Lqv2;", C17296a.f69688o, "()Lqv2;", "current", "<init>", "()V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: qv2$a */
    /* loaded from: classes.dex */
    public static final class C27736a {
        public /* synthetic */ C27736a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C47748qv2 m16784a() {
            return DV3.m110351a().mo72857a().m9495b(0);
        }

        private C27736a() {
        }
    }

    public C47748qv2(BV3 platformLocale) {
        Intrinsics.checkNotNullParameter(platformLocale, "platformLocale");
        this.f106065a = platformLocale;
    }

    /* renamed from: a */
    public final String m16788a() {
        return this.f106065a.mo74816b();
    }

    /* renamed from: b */
    public final BV3 m16787b() {
        return this.f106065a;
    }

    /* renamed from: c */
    public final String m16786c() {
        return this.f106065a.getRegion();
    }

    /* renamed from: d */
    public final String m16785d() {
        return this.f106065a.mo74817a();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C47748qv2)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return Intrinsics.areEqual(m16785d(), ((C47748qv2) obj).m16785d());
    }

    public int hashCode() {
        return m16785d().hashCode();
    }

    public String toString() {
        return m16785d();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C47748qv2(String languageTag) {
        this(DV3.m110351a().mo72856b(languageTag));
        Intrinsics.checkNotNullParameter(languageTag, "languageTag");
    }
}
