package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\t\u0010\f\u001a\u00020\u0007HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010 \u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010#\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001f¨\u0006&"}, m28432d2 = {"LcM1;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "birdCode", "", "forceSleep", "b", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getBirdCode", "()Ljava/lang/String;", "e", "getMessage", "f", "Z", "getForceSleep", "()Z", "g", "Ljava/lang/Integer;", C17296a.f69688o, "()Ljava/lang/Integer;", "positiveText", "h", "getNegativeText", "negativeText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: cM1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C39092cM1 extends AbstractC5751Ny {

    /* renamed from: d */
    public final String f60437d;

    /* renamed from: e */
    public final String f60438e;

    /* renamed from: f */
    public final boolean f60439f;

    /* renamed from: g */
    public final Integer f60440g;

    /* renamed from: h */
    public final Integer f60441h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39092cM1(String birdCode, String message, boolean z) {
        super(null);
        int i;
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f60437d = birdCode;
        this.f60438e = message;
        this.f60439f = z;
        this.f60440g = Integer.valueOf(C45871nl4.hibernation_retry_alert_retry);
        if (z) {
            i = Integer.valueOf(C45871nl4.hibernation_retry_alert_force_sleep);
        } else {
            i = 17039369;
        }
        this.f60441h = i;
    }

    public static /* synthetic */ C39092cM1 copy$default(C39092cM1 c39092cM1, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c39092cM1.f60437d;
        }
        if ((i & 2) != 0) {
            str2 = c39092cM1.f60438e;
        }
        if ((i & 4) != 0) {
            z = c39092cM1.f60439f;
        }
        return c39092cM1.m61544b(str, str2, z);
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: a */
    public Integer mo3215a() {
        return this.f60440g;
    }

    /* renamed from: b */
    public final C39092cM1 m61544b(String birdCode, String message, boolean z) {
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        Intrinsics.checkNotNullParameter(message, "message");
        return new C39092cM1(birdCode, message, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C39092cM1) {
            C39092cM1 c39092cM1 = (C39092cM1) obj;
            return Intrinsics.areEqual(this.f60437d, c39092cM1.f60437d) && Intrinsics.areEqual(this.f60438e, c39092cM1.f60438e) && this.f60439f == c39092cM1.f60439f;
        }
        return false;
    }

    @Override // p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return this.f60441h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f60437d.hashCode() * 31) + this.f60438e.hashCode()) * 31;
        boolean z = this.f60439f;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f60438e;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.hibernation_retry_alert_title, this.f60437d);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…ry_alert_title, birdCode)");
        return string;
    }

    public String toString() {
        String str = this.f60437d;
        String str2 = this.f60438e;
        boolean z = this.f60439f;
        return "HibernationRetry(birdCode=" + str + ", message=" + str2 + ", forceSleep=" + z + ")";
    }
}
