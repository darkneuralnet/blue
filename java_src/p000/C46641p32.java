package p000;

import android.view.inputmethod.ExtractedText;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, m28432d2 = {"LF16;", "Landroid/view/inputmethod/ExtractedText;", C17296a.f69688o, "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: p32  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46641p32 {
    /* renamed from: a */
    public static final ExtractedText m20014a(F16 f16) {
        boolean contains$default;
        Intrinsics.checkNotNullParameter(f16, "<this>");
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = f16.m108102h();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = f16.m108102h().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = C48413s26.m14834l(f16.m108103g());
        extractedText.selectionEnd = C48413s26.m14835k(f16.m108103g());
        contains$default = StringsKt__StringsKt.contains$default((CharSequence) f16.m108102h(), '\n', false, 2, (Object) null);
        extractedText.flags = !contains$default ? 1 : 0;
        return extractedText;
    }
}
