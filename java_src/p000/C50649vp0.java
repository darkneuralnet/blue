package p000;

import com.facebook.share.internal.C17296a;
import java.util.Locale;
import kotlin.Metadata;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\b\"\"\u0010\u0005\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004\"\"\u0010\u0007\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lorg/joda/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", C17296a.f69688o, "Lorg/joda/time/format/DateTimeFormatter;", "()Lorg/joda/time/format/DateTimeFormatter;", "DATE_TIME_FORMATTER", "b", "DATE_TIME_PARSER_FORMATTER", "jackson_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: vp0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50649vp0 {

    /* renamed from: a */
    public static final DateTimeFormatter f114736a;

    /* renamed from: b */
    public static final DateTimeFormatter f114737b;

    static {
        DateTimeFormatter dateTime = ISODateTimeFormat.dateTime();
        Locale locale = Locale.ROOT;
        f114736a = dateTime.withLocale(locale);
        f114737b = ISODateTimeFormat.dateTimeParser().withOffsetParsed().withLocale(locale);
    }

    /* renamed from: a */
    public static final DateTimeFormatter m7975a() {
        return f114736a;
    }

    /* renamed from: b */
    public static final DateTimeFormatter m7974b() {
        return f114737b;
    }
}
