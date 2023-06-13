package p000;

import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\u001a$\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a6\u0010\f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¨\u0006\r"}, m28432d2 = {"Landroid/text/SpannableStringBuilder;", "", "search", "", "backgroundColor", "foregroundColor", "b", Entry.TYPE_TEXT, "", "c", "indexes", "length", C17296a.f69688o, "com.github.ChuckerTeam.Chucker.library"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSearchHighlightUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchHighlightUtil.kt\ncom/chuckerteam/chucker/internal/support/SearchHighlightUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n1789#2,3:64\n*S KotlinDebug\n*F\n+ 1 SearchHighlightUtil.kt\ncom/chuckerteam/chucker/internal/support/SearchHighlightUtilKt\n*L\n41#1:64,3\n*E\n"})
/* renamed from: pq5  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47108pq5 {
    /* renamed from: a */
    public static final SpannableStringBuilder m18643a(SpannableStringBuilder spannableStringBuilder, List<Integer> list, int i, int i2, int i3) {
        for (Number number : list) {
            int intValue = number.intValue();
            int i4 = intValue + i;
            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, i4, 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), intValue, i4, 33);
            spannableStringBuilder.setSpan(new BackgroundColorSpan(i2), intValue, i4, 33);
        }
        return spannableStringBuilder;
    }

    /* renamed from: b */
    public static final SpannableStringBuilder m18642b(SpannableStringBuilder spannableStringBuilder, String search, int i, int i2) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        Intrinsics.checkNotNullParameter(search, "search");
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilder2, "this.toString()");
        return m18643a(spannableStringBuilder, m18641c(spannableStringBuilder2, search), search.length(), i, i2);
    }

    /* renamed from: c */
    public static final List<Integer> m18641c(String str, String str2) {
        int indexOf;
        ArrayList arrayList = new ArrayList();
        indexOf = StringsKt__StringsKt.indexOf((CharSequence) str, str2, 0, true);
        while (indexOf >= 0) {
            arrayList.add(Integer.valueOf(indexOf));
            indexOf = StringsKt__StringsKt.indexOf((CharSequence) str, str2, indexOf + 1, true);
        }
        return arrayList;
    }
}
