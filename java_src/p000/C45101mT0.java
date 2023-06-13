package p000;

import com.facebook.share.internal.C17296a;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\n\u0010\u0007\u001a\u00020\u0002*\u00020\u0006R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"LmT0;", "", "", "date", "Lorg/joda/time/LocalDateTime;", C17296a.f69688o, "Lorg/joda/time/DateTime;", "b", "Ljava/text/SimpleDateFormat;", "Ljava/text/SimpleDateFormat;", "MONTH_DAY_TIME_FORMATTER", "", "c", "Ljava/util/List;", "DATE_PATTERNS", "<init>", "()V", "localization_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDateTimeFormatter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateTimeFormatter.kt\nco/bird/android/localization/wrapper/DateTimeFormatter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,32:1\n1855#2,2:33\n*S KotlinDebug\n*F\n+ 1 DateTimeFormatter.kt\nco/bird/android/localization/wrapper/DateTimeFormatter\n*L\n19#1:33,2\n*E\n"})
/* renamed from: mT0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45101mT0 {

    /* renamed from: a */
    public static final C45101mT0 f98056a = new C45101mT0();

    /* renamed from: b */
    public static final SimpleDateFormat f98057b = new SimpleDateFormat("MMM dd, HH:mm a", Locale.getDefault());

    /* renamed from: c */
    public static final List<String> f98058c;

    static {
        List<String> listOf;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"MMddyyyy", "dd.MM.yy", "dd.MM.yy.", "dd.MM.yyyy", "dd.MM.yyyy."});
        f98058c = listOf;
    }

    private C45101mT0() {
    }

    /* renamed from: a */
    public final LocalDateTime m25570a(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : f98058c) {
            try {
                return LocalDateTime.parse(str, DateTimeFormat.forPattern(str2));
            } catch (Exception e) {
                e.printStackTrace();
                C41318g46.m40159e(e);
            }
        }
        return null;
    }

    /* renamed from: b */
    public final String m25569b(DateTime dateTime) {
        Intrinsics.checkNotNullParameter(dateTime, "<this>");
        String format = f98057b.format(dateTime.toDate());
        Intrinsics.checkNotNullExpressionValue(format, "MONTH_DAY_TIME_FORMATTER.format(toDate())");
        return format;
    }
}
