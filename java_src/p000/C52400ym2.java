package p000;

import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import com.stripe.android.financialconnections.domain.Entry;
import java.text.BreakIterator;
import java.util.Comparator;
import java.util.PriorityQueue;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a \u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002H\u0002¨\u0006\u000b"}, m28432d2 = {"", Entry.TYPE_TEXT, "Landroid/text/TextPaint;", "paint", "", "c", "desiredWidth", "charSequence", "textPaint", "", "e", "ui-text_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLayoutIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutIntrinsics.kt\nandroidx/compose/ui/text/android/LayoutIntrinsicsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,171:1\n1855#2,2:172\n*S KotlinDebug\n*F\n+ 1 LayoutIntrinsics.kt\nandroidx/compose/ui/text/android/LayoutIntrinsicsKt\n*L\n142#1:172,2\n*E\n"})
/* renamed from: ym2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52400ym2 {
    /* renamed from: c */
    public static final float m2627c(CharSequence text, TextPaint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BreakIterator lineInstance = BreakIterator.getLineInstance(paint.getTextLocale());
        int i = 0;
        lineInstance.setText(new C37292Yh0(text, 0, text.length()));
        PriorityQueue<Pair> priorityQueue = new PriorityQueue(10, new Comparator() { // from class: xm2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m2626d;
                m2626d = C52400ym2.m2626d((Pair) obj, (Pair) obj2);
                return m2626d;
            }
        });
        int next = lineInstance.next();
        while (true) {
            int i2 = i;
            i = next;
            if (i == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair(Integer.valueOf(i2), Integer.valueOf(i)));
            } else {
                Pair pair = (Pair) priorityQueue.peek();
                if (pair != null && ((Number) pair.getSecond()).intValue() - ((Number) pair.getFirst()).intValue() < i - i2) {
                    priorityQueue.poll();
                    priorityQueue.add(new Pair(Integer.valueOf(i2), Integer.valueOf(i)));
                }
            }
            next = lineInstance.next();
        }
        float f = 0.0f;
        for (Pair pair2 : priorityQueue) {
            f = Math.max(f, Layout.getDesiredWidth(text, ((Number) pair2.component1()).intValue(), ((Number) pair2.component2()).intValue(), paint));
        }
        return f;
    }

    /* renamed from: d */
    public static final int m2626d(Pair pair, Pair pair2) {
        return (((Number) pair.getSecond()).intValue() - ((Number) pair.getFirst()).intValue()) - (((Number) pair2.getSecond()).intValue() - ((Number) pair2.getFirst()).intValue());
    }

    /* renamed from: e */
    public static final boolean m2625e(float f, CharSequence charSequence, TextPaint textPaint) {
        boolean z;
        boolean z2;
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (KN5.m98943a(spanned, C46512oq2.class) || KN5.m98943a(spanned, C45919nq2.class)) {
                    return true;
                }
            }
            if (textPaint.getLetterSpacing() == 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return true;
            }
        }
        return false;
    }
}
