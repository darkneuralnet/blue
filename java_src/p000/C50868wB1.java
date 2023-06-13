package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0001\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0007HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010!\u001a\u0004\u0018\u00010\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, m28432d2 = {"LwB1;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "body", "b", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "e", "getBody", "f", "I", C17296a.f69688o, "()Ljava/lang/Integer;", "positiveText", "", "g", "Ljava/lang/Void;", "c", "()Ljava/lang/Void;", "negativeText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: wB1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C50868wB1 extends AbstractC5751Ny {

    /* renamed from: d */
    public final String f115450d;

    /* renamed from: e */
    public final String f115451e;

    /* renamed from: f */
    public final int f115452f;

    /* renamed from: g */
    public final Void f115453g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50868wB1(String title, String body) {
        super(null);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f115450d = title;
        this.f115451e = body;
        this.f115452f = C45871nl4.general_got_it;
    }

    public static /* synthetic */ C50868wB1 copy$default(C50868wB1 c50868wB1, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c50868wB1.f115450d;
        }
        if ((i & 2) != 0) {
            str2 = c50868wB1.f115451e;
        }
        return c50868wB1.m7310b(str, str2);
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: a */
    public Integer mo3215a() {
        return Integer.valueOf(this.f115452f);
    }

    /* renamed from: b */
    public final C50868wB1 m7310b(String title, String body) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        return new C50868wB1(title, body);
    }

    /* renamed from: c */
    public Void m7309c() {
        return this.f115453g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C50868wB1) {
            C50868wB1 c50868wB1 = (C50868wB1) obj;
            return Intrinsics.areEqual(this.f115450d, c50868wB1.f115450d) && Intrinsics.areEqual(this.f115451e, c50868wB1.f115451e);
        }
        return false;
    }

    @Override // p000.AbstractC5751Ny
    public /* bridge */ /* synthetic */ Integer getNegativeText() {
        return (Integer) m7309c();
    }

    public int hashCode() {
        return (this.f115450d.hashCode() * 31) + this.f115451e.hashCode();
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f115451e;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f115450d;
    }

    public String toString() {
        String str = this.f115450d;
        String str2 = this.f115451e;
        return "GenericGotItAlert(title=" + str + ", body=" + str2 + ")";
    }
}
