package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m28432d2 = {"Lyh;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", DateTokenConverter.CONVERTER_KEY, "c", "title", "body", "b", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "e", "getBody", "f", "Ljava/lang/Integer;", "getNegativeText", "()Ljava/lang/Integer;", "negativeText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: yh */
/* loaded from: classes2.dex */
public final class C30680yh extends AbstractC5751Ny {

    /* renamed from: d */
    public final String f120014d;

    /* renamed from: e */
    public final String f120015e;

    /* renamed from: f */
    public final Integer f120016f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30680yh(String title, String body) {
        super(null);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f120014d = title;
        this.f120015e = body;
    }

    public static /* synthetic */ C30680yh copy$default(C30680yh c30680yh, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c30680yh.f120014d;
        }
        if ((i & 2) != 0) {
            str2 = c30680yh.f120015e;
        }
        return c30680yh.m2913b(str, str2);
    }

    /* renamed from: b */
    public final C30680yh m2913b(String title, String body) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        return new C30680yh(title, body);
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: c */
    public String message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f120015e;
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: d */
    public String title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f120014d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C30680yh) {
            C30680yh c30680yh = (C30680yh) obj;
            return Intrinsics.areEqual(this.f120014d, c30680yh.f120014d) && Intrinsics.areEqual(this.f120015e, c30680yh.f120015e);
        }
        return false;
    }

    @Override // p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return this.f120016f;
    }

    public int hashCode() {
        return (this.f120014d.hashCode() * 31) + this.f120015e.hashCode();
    }

    public String toString() {
        String str = this.f120014d;
        String str2 = this.f120015e;
        return "ApiErrorDialog(title=" + str + ", body=" + str2 + ")";
    }
}
