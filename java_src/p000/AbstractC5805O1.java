package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\r\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0004R\"\u0010\u0003\u001a\u00020\u00028\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"LO1;", "LP1;", "", Entry.TYPE_TEXT, "", "e", "", "start", "end", "", "c", C17296a.f69688o, "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "f", "(Ljava/lang/String;)V", "b", "[I", "segment", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: O1 */
/* loaded from: classes.dex */
public abstract class AbstractC5805O1 implements InterfaceC6230P1 {

    /* renamed from: a */
    public String f25511a;

    /* renamed from: b */
    public final int[] f25512b = new int[2];

    /* renamed from: c */
    public final int[] m93014c(int i, int i2) {
        if (i >= 0 && i2 >= 0 && i != i2) {
            int[] iArr = this.f25512b;
            iArr[0] = i;
            iArr[1] = i2;
            return iArr;
        }
        return null;
    }

    /* renamed from: d */
    public final String m93013d() {
        String str = this.f25511a;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Entry.TYPE_TEXT);
        return null;
    }

    /* renamed from: e */
    public void mo68470e(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        m93012f(text);
    }

    /* renamed from: f */
    public final void m93012f(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f25511a = str;
    }
}
