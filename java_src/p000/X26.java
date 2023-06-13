package p000;

import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\n\u0010\u0017R\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u0010\u0010\u0017¨\u0006\u001f"}, m28432d2 = {"LX26;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Landroid/widget/TextView;", C17296a.f69688o, "Landroid/widget/TextView;", "getView", "()Landroid/widget/TextView;", "view", "", "b", "Ljava/lang/CharSequence;", "c", "()Ljava/lang/CharSequence;", Entry.TYPE_TEXT, "I", "getStart", "()I", "start", DateTokenConverter.CONVERTER_KEY, "before", "e", "count", "<init>", "(Landroid/widget/TextView;Ljava/lang/CharSequence;III)V", "rxbinding_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: X26 */
/* loaded from: classes6.dex */
public final class X26 {

    /* renamed from: a */
    public final TextView f42564a;

    /* renamed from: b */
    public final CharSequence f42565b;

    /* renamed from: c */
    public final int f42566c;

    /* renamed from: d */
    public final int f42567d;

    /* renamed from: e */
    public final int f42568e;

    public X26(TextView textView, CharSequence charSequence, int i, int i2, int i3) {
        this.f42564a = textView;
        this.f42565b = charSequence;
        this.f42566c = i;
        this.f42567d = i2;
        this.f42568e = i3;
    }

    /* renamed from: a */
    public final int m77520a() {
        return this.f42567d;
    }

    /* renamed from: b */
    public final int m77519b() {
        return this.f42568e;
    }

    /* renamed from: c */
    public final CharSequence m77518c() {
        return this.f42565b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof X26) {
                X26 x26 = (X26) obj;
                if (Intrinsics.areEqual(this.f42564a, x26.f42564a) && Intrinsics.areEqual(this.f42565b, x26.f42565b)) {
                    if (this.f42566c == x26.f42566c) {
                        if (this.f42567d == x26.f42567d) {
                            if (this.f42568e == x26.f42568e) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        TextView textView = this.f42564a;
        int hashCode = (textView != null ? textView.hashCode() : 0) * 31;
        CharSequence charSequence = this.f42565b;
        return ((((((hashCode + (charSequence != null ? charSequence.hashCode() : 0)) * 31) + this.f42566c) * 31) + this.f42567d) * 31) + this.f42568e;
    }

    public String toString() {
        return "TextViewTextChangeEvent(view=" + this.f42564a + ", text=" + this.f42565b + ", start=" + this.f42566c + ", before=" + this.f42567d + ", count=" + this.f42568e + ")";
    }
}
