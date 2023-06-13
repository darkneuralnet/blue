package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001e\u0010\u001fJ5\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006 "}, m28432d2 = {"LM12;", "", "Landroid/view/View;", "view", "", "name", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Landroid/view/View;", DateTokenConverter.CONVERTER_KEY, "()Landroid/view/View;", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "c", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/util/AttributeSet;", "()Landroid/util/AttributeSet;", "<init>", "(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)V", "viewpump_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: M12 */
/* loaded from: classes7.dex */
public final class M12 {

    /* renamed from: a */
    public final View f22442a;

    /* renamed from: b */
    public final String f22443b;

    /* renamed from: c */
    public final Context f22444c;

    /* renamed from: d */
    public final AttributeSet f22445d;

    public M12(View view, String name, Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f22442a = view;
        this.f22443b = name;
        this.f22444c = context;
        this.f22445d = attributeSet;
    }

    /* renamed from: b */
    public static /* synthetic */ M12 m96010b(M12 m12, View view, String str, Context context, AttributeSet attributeSet, int i, Object obj) {
        if ((i & 1) != 0) {
            view = m12.f22442a;
        }
        if ((i & 2) != 0) {
            str = m12.f22443b;
        }
        if ((i & 4) != 0) {
            context = m12.f22444c;
        }
        if ((i & 8) != 0) {
            attributeSet = m12.f22445d;
        }
        return m12.m96011a(view, str, context, attributeSet);
    }

    /* renamed from: a */
    public final M12 m96011a(View view, String name, Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(context, "context");
        return new M12(view, name, context, attributeSet);
    }

    /* renamed from: c */
    public final AttributeSet m96009c() {
        return this.f22445d;
    }

    /* renamed from: d */
    public final View m96008d() {
        return this.f22442a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof M12) {
            M12 m12 = (M12) obj;
            return Intrinsics.areEqual(this.f22442a, m12.f22442a) && Intrinsics.areEqual(this.f22443b, m12.f22443b) && Intrinsics.areEqual(this.f22444c, m12.f22444c) && Intrinsics.areEqual(this.f22445d, m12.f22445d);
        }
        return false;
    }

    public int hashCode() {
        View view = this.f22442a;
        int hashCode = (((((view == null ? 0 : view.hashCode()) * 31) + this.f22443b.hashCode()) * 31) + this.f22444c.hashCode()) * 31;
        AttributeSet attributeSet = this.f22445d;
        return hashCode + (attributeSet != null ? attributeSet.hashCode() : 0);
    }

    public String toString() {
        return "InflateResult(view=" + this.f22442a + ", name=" + this.f22443b + ", context=" + this.f22444c + ", attrs=" + this.f22445d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
