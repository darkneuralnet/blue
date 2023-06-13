package p000;

import android.content.Intent;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m28432d2 = {"LxD1;", "", "", C17296a.f69688o, "Landroid/content/Intent;", "b", "resultCode", MessageExtension.FIELD_DATA, "c", "", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "I", "getResultCode", "()I", "Landroid/content/Intent;", "getData", "()Landroid/content/Intent;", "<init>", "(ILandroid/content/Intent;)V", "purchase-payment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: xD1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51479xD1 {

    /* renamed from: a */
    public final int f117222a;

    /* renamed from: b */
    public final Intent f117223b;

    public C51479xD1(int i, Intent intent) {
        this.f117222a = i;
        this.f117223b = intent;
    }

    public static /* synthetic */ C51479xD1 copy$default(C51479xD1 c51479xD1, int i, Intent intent, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c51479xD1.f117222a;
        }
        if ((i2 & 2) != 0) {
            intent = c51479xD1.f117223b;
        }
        return c51479xD1.m5656c(i, intent);
    }

    /* renamed from: a */
    public final int m5658a() {
        return this.f117222a;
    }

    /* renamed from: b */
    public final Intent m5657b() {
        return this.f117223b;
    }

    /* renamed from: c */
    public final C51479xD1 m5656c(int i, Intent intent) {
        return new C51479xD1(i, intent);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C51479xD1) {
            C51479xD1 c51479xD1 = (C51479xD1) obj;
            return this.f117222a == c51479xD1.f117222a && Intrinsics.areEqual(this.f117223b, c51479xD1.f117223b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f117222a) * 31;
        Intent intent = this.f117223b;
        return hashCode + (intent == null ? 0 : intent.hashCode());
    }

    public String toString() {
        int i = this.f117222a;
        Intent intent = this.f117223b;
        return "GooglePayResult(resultCode=" + i + ", data=" + intent + ")";
    }
}
