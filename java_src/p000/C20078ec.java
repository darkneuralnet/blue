package p000;

import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C1577Df;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0000*\u00020\u0001H\u0000¨\u0006\u0004"}, m28432d2 = {"", "LDf;", C17296a.f69688o, "b", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidClipboardManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidClipboardManager.android.kt\nandroidx/compose/ui/platform/AndroidClipboardManager_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,550:1\n33#2,6:551\n*S KotlinDebug\n*F\n+ 1 AndroidClipboardManager.android.kt\nandroidx/compose/ui/platform/AndroidClipboardManager_androidKt\n*L\n110#1:551,6\n*E\n"})
/* renamed from: ec */
/* loaded from: classes.dex */
public final class C20078ec {
    /* renamed from: a */
    public static final C1577Df m42728a(CharSequence charSequence) {
        int lastIndex;
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new C1577Df(charSequence.toString(), null, null, 6, null);
        }
        Spanned spanned = (Spanned) charSequence;
        int i = 0;
        Annotation[] annotations = (Annotation[]) spanned.getSpans(0, charSequence.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkNotNullExpressionValue(annotations, "annotations");
        lastIndex = ArraysKt___ArraysKt.getLastIndex(annotations);
        if (lastIndex >= 0) {
            while (true) {
                Annotation annotation = annotations[i];
                if (Intrinsics.areEqual(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    int spanStart = spanned.getSpanStart(annotation);
                    int spanEnd = spanned.getSpanEnd(annotation);
                    String value = annotation.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "span.value");
                    arrayList.add(new C1577Df.C1580b(new C46898pV0(value).m19182k(), spanStart, spanEnd));
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return new C1577Df(charSequence.toString(), arrayList, null, 4, null);
    }

    /* renamed from: b */
    public static final CharSequence m42727b(C1577Df c1577Df) {
        Intrinsics.checkNotNullParameter(c1577Df, "<this>");
        if (c1577Df.m110056f().isEmpty()) {
            return c1577Df.m110052j();
        }
        SpannableString spannableString = new SpannableString(c1577Df.m110052j());
        C39839db1 c39839db1 = new C39839db1();
        List<C1577Df.C1580b<GN5>> m110056f = c1577Df.m110056f();
        int size = m110056f.size();
        for (int i = 0; i < size; i++) {
            C1577Df.C1580b<GN5> c1580b = m110056f.get(i);
            int m110031b = c1580b.m110031b();
            int m110030c = c1580b.m110030c();
            c39839db1.m44074q();
            c39839db1.m44085f(c1580b.m110032a());
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", c39839db1.m44075p()), m110031b, m110030c, 33);
        }
        return spannableString;
    }
}
