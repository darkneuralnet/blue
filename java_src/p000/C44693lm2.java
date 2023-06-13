package p000;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000b¨\u0006\u000f"}, m28432d2 = {"Llm2;", "", "Landroid/text/Layout$Alignment;", "b", "Landroid/text/Layout$Alignment;", C17296a.f69688o, "()Landroid/text/Layout$Alignment;", "DEFAULT_LAYOUT_ALIGNMENT", "Landroid/text/TextDirectionHeuristic;", "c", "Landroid/text/TextDirectionHeuristic;", "()Landroid/text/TextDirectionHeuristic;", "DEFAULT_TEXT_DIRECTION_HEURISTIC", "<init>", "()V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: lm2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44693lm2 {

    /* renamed from: a */
    public static final C44693lm2 f96670a = new C44693lm2();

    /* renamed from: b */
    public static final Layout.Alignment f96671b = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: c */
    public static final TextDirectionHeuristic f96672c;

    /* renamed from: d */
    public static final int f96673d;

    static {
        TextDirectionHeuristic FIRSTSTRONG_LTR = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        Intrinsics.checkNotNullExpressionValue(FIRSTSTRONG_LTR, "FIRSTSTRONG_LTR");
        f96672c = FIRSTSTRONG_LTR;
        f96673d = 8;
    }

    private C44693lm2() {
    }

    /* renamed from: a */
    public final Layout.Alignment m26844a() {
        return f96671b;
    }

    /* renamed from: b */
    public final TextDirectionHeuristic m26843b() {
        return f96672c;
    }
}
