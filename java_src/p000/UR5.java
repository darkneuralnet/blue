package p000;

import androidx.emoji2.text.C11581c;
import com.facebook.share.internal.C17296a;
import java.text.BreakIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¨\u0006\u0007"}, m28432d2 = {"", "", "index", "b", C17296a.f69688o, "Landroidx/emoji2/text/c;", "c", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStringHelpers.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringHelpers.android.kt\nandroidx/compose/foundation/text/StringHelpers_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n1#2:45\n*E\n"})
/* renamed from: UR5 */
/* loaded from: classes.dex */
public final class UR5 {
    /* renamed from: a */
    public static final int m81544a(String str, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "<this>");
        C11581c m81542c = m81542c();
        Integer num = null;
        if (m81542c != null) {
            Integer valueOf = Integer.valueOf(m81542c.m67528d(str, i));
            if (valueOf.intValue() == -1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i);
    }

    /* renamed from: b */
    public static final int m81543b(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        C11581c m81542c = m81542c();
        Integer num = null;
        if (m81542c != null) {
            boolean z = false;
            Integer valueOf = Integer.valueOf(m81542c.m67526f(str, Math.max(0, i - 1)));
            if (valueOf.intValue() == -1) {
                z = true;
            }
            if (!z) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    /* renamed from: c */
    public static final C11581c m81542c() {
        if (!C11581c.m67521k()) {
            return null;
        }
        C11581c m67529c = C11581c.m67529c();
        boolean z = true;
        if (m67529c.m67525g() != 1) {
            z = false;
        }
        if (!z) {
            return null;
        }
        return m67529c;
    }
}
