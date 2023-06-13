package p000;

import android.content.Intent;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m28432d2 = {"LJa4;", "", "", C17296a.f69688o, "Landroid/content/Intent;", "b", "resultOk", MessageExtension.FIELD_DATA, "c", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Z", "getResultOk", "()Z", "Landroid/content/Intent;", "getData", "()Landroid/content/Intent;", "<init>", "(ZLandroid/content/Intent;)V", "purchase-payment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ja4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33723Ja4 {

    /* renamed from: a */
    public final boolean f17858a;

    /* renamed from: b */
    public final Intent f17859b;

    public C33723Ja4(boolean z, Intent intent) {
        this.f17858a = z;
        this.f17859b = intent;
    }

    public static /* synthetic */ C33723Ja4 copy$default(C33723Ja4 c33723Ja4, boolean z, Intent intent, int i, Object obj) {
        if ((i & 1) != 0) {
            z = c33723Ja4.f17858a;
        }
        if ((i & 2) != 0) {
            intent = c33723Ja4.f17859b;
        }
        return c33723Ja4.m100180c(z, intent);
    }

    /* renamed from: a */
    public final boolean m100182a() {
        return this.f17858a;
    }

    /* renamed from: b */
    public final Intent m100181b() {
        return this.f17859b;
    }

    /* renamed from: c */
    public final C33723Ja4 m100180c(boolean z, Intent intent) {
        return new C33723Ja4(z, intent);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C33723Ja4) {
            C33723Ja4 c33723Ja4 = (C33723Ja4) obj;
            return this.f17858a == c33723Ja4.f17858a && Intrinsics.areEqual(this.f17859b, c33723Ja4.f17859b);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.f17858a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Intent intent = this.f17859b;
        return i + (intent == null ? 0 : intent.hashCode());
    }

    public String toString() {
        boolean z = this.f17858a;
        Intent intent = this.f17859b;
        return "PurchasePaymentResult(resultOk=" + z + ", data=" + intent + ")";
    }

    public /* synthetic */ C33723Ja4(boolean z, Intent intent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : intent);
    }
}
