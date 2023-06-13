package p000;

import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u001e\u0010\u0005\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u001e\u0010\b\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u001e\u0010\n\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0000¨\u0006\u000b"}, m28432d2 = {"", "LyE3;", "paragraphInfoList", "", "index", C17296a.f69688o, "", "y", "c", "lineIndex", "b", "ui-text_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMultiParagraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraphKt\n*L\n1#1,980:1\n850#1,16:981\n850#1,16:997\n850#1,16:1013\n*S KotlinDebug\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraphKt\n*L\n800#1:981,16\n820#1:997,16\n840#1:1013,16\n*E\n"})
/* renamed from: UW2 */
/* loaded from: classes.dex */
public final class UW2 {
    /* renamed from: a */
    public static final int m81401a(List<C52083yE3> paragraphInfoList, int i) {
        char c;
        Intrinsics.checkNotNullParameter(paragraphInfoList, "paragraphInfoList");
        int size = paragraphInfoList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            C52083yE3 c52083yE3 = paragraphInfoList.get(i3);
            if (c52083yE3.m3783f() > i) {
                c = 1;
            } else if (c52083yE3.m3787b() <= i) {
                c = 65535;
            } else {
                c = 0;
            }
            if (c < 0) {
                i2 = i3 + 1;
            } else if (c > 0) {
                size = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: b */
    public static final int m81400b(List<C52083yE3> paragraphInfoList, int i) {
        char c;
        Intrinsics.checkNotNullParameter(paragraphInfoList, "paragraphInfoList");
        int size = paragraphInfoList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            C52083yE3 c52083yE3 = paragraphInfoList.get(i3);
            if (c52083yE3.m3782g() > i) {
                c = 1;
            } else if (c52083yE3.m3786c() <= i) {
                c = 65535;
            } else {
                c = 0;
            }
            if (c < 0) {
                i2 = i3 + 1;
            } else if (c > 0) {
                size = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: c */
    public static final int m81399c(List<C52083yE3> paragraphInfoList, float f) {
        char c;
        Intrinsics.checkNotNullParameter(paragraphInfoList, "paragraphInfoList");
        int size = paragraphInfoList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            C52083yE3 c52083yE3 = paragraphInfoList.get(i2);
            if (c52083yE3.m3781h() > f) {
                c = 1;
            } else if (c52083yE3.m3788a() <= f) {
                c = 65535;
            } else {
                c = 0;
            }
            if (c < 0) {
                i = i2 + 1;
            } else if (c > 0) {
                size = i2 - 1;
            } else {
                return i2;
            }
        }
        return -(i + 1);
    }
}
