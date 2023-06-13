package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019¨\u0006 "}, m28432d2 = {"Lxh;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", DateTokenConverter.CONVERTER_KEY, "c", "title", "body", "b", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "e", "getBody", "f", "I", C17296a.f69688o, "()Ljava/lang/Integer;", "positiveText", "g", "getNegativeText", "negativeText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: xh */
/* loaded from: classes2.dex */
public final class C30268xh extends AbstractC5751Ny {

    /* renamed from: d */
    public final String f117972d;

    /* renamed from: e */
    public final String f117973e;

    /* renamed from: f */
    public final int f117974f;

    /* renamed from: g */
    public final int f117975g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30268xh(String title, String body) {
        super(null);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f117972d = title;
        this.f117973e = body;
        this.f117974f = C45871nl4.confirm_action;
        this.f117975g = C45871nl4.general_cancel_button;
    }

    public static /* synthetic */ C30268xh copy$default(C30268xh c30268xh, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c30268xh.f117972d;
        }
        if ((i & 2) != 0) {
            str2 = c30268xh.f117973e;
        }
        return c30268xh.m4883b(str, str2);
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: a */
    public Integer mo3215a() {
        return Integer.valueOf(this.f117974f);
    }

    /* renamed from: b */
    public final C30268xh m4883b(String title, String body) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        return new C30268xh(title, body);
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: c */
    public String message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f117973e;
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: d */
    public String title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f117972d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C30268xh) {
            C30268xh c30268xh = (C30268xh) obj;
            return Intrinsics.areEqual(this.f117972d, c30268xh.f117972d) && Intrinsics.areEqual(this.f117973e, c30268xh.f117973e);
        }
        return false;
    }

    @Override // p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return Integer.valueOf(this.f117975g);
    }

    public int hashCode() {
        return (this.f117972d.hashCode() * 31) + this.f117973e.hashCode();
    }

    public String toString() {
        String str = this.f117972d;
        String str2 = this.f117973e;
        return "ApiDialog(title=" + str + ", body=" + str2 + ")";
    }
}
