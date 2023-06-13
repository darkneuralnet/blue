package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0018\u0012\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u001d¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\t\u0010\u0016R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0014\u0010 ¨\u0006$"}, m28432d2 = {"LL12;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "name", "Landroid/content/Context;", "b", "Landroid/content/Context;", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "c", "Landroid/util/AttributeSet;", "()Landroid/util/AttributeSet;", "attrs", "Landroid/view/View;", "Landroid/view/View;", "getParent", "()Landroid/view/View;", "parent", "Lkotlin/Function0;", "e", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "fallbackViewCreator", "<init>", "(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "viewpump_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: L12 */
/* loaded from: classes7.dex */
public final class L12 {

    /* renamed from: a */
    public final String f20601a;

    /* renamed from: b */
    public final Context f20602b;

    /* renamed from: c */
    public final AttributeSet f20603c;

    /* renamed from: d */
    public final View f20604d;

    /* renamed from: e */
    public final Function0<View> f20605e;

    /* JADX WARN: Multi-variable type inference failed */
    public L12(String name, Context context, AttributeSet attributeSet, View view, Function0<? extends View> fallbackViewCreator) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fallbackViewCreator, "fallbackViewCreator");
        this.f20601a = name;
        this.f20602b = context;
        this.f20603c = attributeSet;
        this.f20604d = view;
        this.f20605e = fallbackViewCreator;
    }

    /* renamed from: a */
    public final AttributeSet m97928a() {
        return this.f20603c;
    }

    /* renamed from: b */
    public final Context m97927b() {
        return this.f20602b;
    }

    /* renamed from: c */
    public final Function0<View> m97926c() {
        return this.f20605e;
    }

    /* renamed from: d */
    public final String m97925d() {
        return this.f20601a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof L12) {
            L12 l12 = (L12) obj;
            return Intrinsics.areEqual(this.f20601a, l12.f20601a) && Intrinsics.areEqual(this.f20602b, l12.f20602b) && Intrinsics.areEqual(this.f20603c, l12.f20603c) && Intrinsics.areEqual(this.f20604d, l12.f20604d) && Intrinsics.areEqual(this.f20605e, l12.f20605e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.f20601a.hashCode() * 31) + this.f20602b.hashCode()) * 31;
        AttributeSet attributeSet = this.f20603c;
        int hashCode2 = (hashCode + (attributeSet == null ? 0 : attributeSet.hashCode())) * 31;
        View view = this.f20604d;
        return ((hashCode2 + (view != null ? view.hashCode() : 0)) * 31) + this.f20605e.hashCode();
    }

    public String toString() {
        return "InflateRequest(name=" + this.f20601a + ", context=" + this.f20602b + ", attrs=" + this.f20603c + ", parent=" + this.f20604d + ", fallbackViewCreator=" + this.f20605e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
