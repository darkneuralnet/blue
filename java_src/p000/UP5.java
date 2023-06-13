package p000;

import android.text.StaticLayout;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, m28432d2 = {"LUP5;", "", "Landroid/text/StaticLayout$Builder;", "builder", "", "useFallbackLineSpacing", "", C17296a.f69688o, "<init>", "()V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: UP5 */
/* loaded from: classes.dex */
public final class UP5 {

    /* renamed from: a */
    public static final UP5 f37356a = new UP5();

    private UP5() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m81552a(StaticLayout.Builder builder, boolean z) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.setUseLineSpacingFromFallbacks(z);
    }
}
