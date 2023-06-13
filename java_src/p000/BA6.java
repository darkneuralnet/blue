package p000;

import android.graphics.Bitmap;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC34828Nt2;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b#\u0010\bR+\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR+\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR/\u0010\u0016\u001a\u0004\u0018\u00010\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u00118F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\u0005\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R/\u0010\u001c\u001a\u0004\u0018\u00010\u00172\b\u0010\u0003\u001a\u0004\u0018\u00010\u00178F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\u0005\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b\u000b\u0010 ¨\u0006$"}, m28432d2 = {"LBA6;", "", "LVz6;", "<set-?>", C17296a.f69688o, "LEX2;", "()LVz6;", DateTokenConverter.CONVERTER_KEY, "(LVz6;)V", "content", "LNt2;", "b", "c", "()LNt2;", "e", "(LNt2;)V", "loadingState", "", "getPageTitle", "()Ljava/lang/String;", "g", "(Ljava/lang/String;)V", "pageTitle", "Landroid/graphics/Bitmap;", "getPageIcon", "()Landroid/graphics/Bitmap;", "f", "(Landroid/graphics/Bitmap;)V", "pageIcon", "LMM5;", "LpA6;", "LMM5;", "()LMM5;", "errorsForCurrentRequest", "webContent", "<init>", "web_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: BA6 */
/* loaded from: classes5.dex */
public final class BA6 {

    /* renamed from: a */
    public final EX2 f1943a;

    /* renamed from: b */
    public final EX2 f1944b;

    /* renamed from: c */
    public final EX2 f1945c;

    /* renamed from: d */
    public final EX2 f1946d;

    /* renamed from: e */
    public final MM5<C46715pA6> f1947e;

    public BA6(AbstractC36758Vz6 webContent) {
        EX2 m97025e;
        EX2 m97025e2;
        EX2 m97025e3;
        EX2 m97025e4;
        Intrinsics.checkNotNullParameter(webContent, "webContent");
        m97025e = LM5.m97025e(webContent, null, 2, null);
        this.f1943a = m97025e;
        m97025e2 = LM5.m97025e(AbstractC34828Nt2.C5734b.f25337a, null, 2, null);
        this.f1944b = m97025e2;
        m97025e3 = LM5.m97025e(null, null, 2, null);
        this.f1945c = m97025e3;
        m97025e4 = LM5.m97025e(null, null, 2, null);
        this.f1946d = m97025e4;
        this.f1947e = GM5.m105203d();
    }

    /* renamed from: a */
    public final AbstractC36758Vz6 m114311a() {
        return (AbstractC36758Vz6) this.f1943a.getValue();
    }

    /* renamed from: b */
    public final MM5<C46715pA6> m114310b() {
        return this.f1947e;
    }

    /* renamed from: c */
    public final AbstractC34828Nt2 m114309c() {
        return (AbstractC34828Nt2) this.f1944b.getValue();
    }

    /* renamed from: d */
    public final void m114308d(AbstractC36758Vz6 abstractC36758Vz6) {
        Intrinsics.checkNotNullParameter(abstractC36758Vz6, "<set-?>");
        this.f1943a.setValue(abstractC36758Vz6);
    }

    /* renamed from: e */
    public final void m114307e(AbstractC34828Nt2 abstractC34828Nt2) {
        Intrinsics.checkNotNullParameter(abstractC34828Nt2, "<set-?>");
        this.f1944b.setValue(abstractC34828Nt2);
    }

    /* renamed from: f */
    public final void m114306f(Bitmap bitmap) {
        this.f1946d.setValue(bitmap);
    }

    /* renamed from: g */
    public final void m114305g(String str) {
        this.f1945c.setValue(str);
    }
}
