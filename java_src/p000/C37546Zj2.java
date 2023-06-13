package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, m28432d2 = {"LZj2;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", C17296a.f69688o, "Ljava/lang/String;", "name", "<init>", "(Ljava/lang/String;)V", "b", "gson_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Zj2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C37546Zj2 {

    /* renamed from: b */
    public static final C10338a f49003b = new C10338a(null);

    /* renamed from: a */
    public final String f49004a;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, m28432d2 = {"LZj2$a;", "", "", "name", "LZj2;", C17296a.f69688o, "<init>", "()V", "gson_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Zj2$a */
    /* loaded from: classes4.dex */
    public static final class C10338a {
        public /* synthetic */ C10338a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C37546Zj2 m72645a(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = name.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            return new C37546Zj2(lowerCase, null);
        }

        private C10338a() {
        }
    }

    public /* synthetic */ C37546Zj2(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C37546Zj2)) {
            return false;
        }
        return Intrinsics.areEqual(this.f49004a, ((C37546Zj2) obj).f49004a);
    }

    public int hashCode() {
        return this.f49004a.hashCode();
    }

    public String toString() {
        return this.f49004a;
    }

    public C37546Zj2(String str) {
        this.f49004a = str;
    }
}
