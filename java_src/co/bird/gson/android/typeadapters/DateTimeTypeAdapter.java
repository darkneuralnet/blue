package co.bird.gson.android.typeadapters;

import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\nB\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\"\u0010\r\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\fH\u0016¨\u0006\u0010"}, m28432d2 = {"Lco/bird/gson/android/typeadapters/DateTimeTypeAdapter;", "Lvi2;", "Lorg/joda/time/DateTime;", "Llj2;", "Lyi2;", "json", "Ljava/lang/reflect/Type;", "type", "Lui2;", CoreConstants.CONTEXT_SCOPE_VALUE, C17296a.f69688o, "src", "Lkj2;", "b", "<init>", "()V", "gson_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class DateTimeTypeAdapter implements InterfaceC50581vi2<DateTime>, InterfaceC44663lj2<DateTime> {

    /* renamed from: a */
    public static final C16711a f68237a = new C16711a(null);

    /* renamed from: b */
    public static final DateTimeFormatter f68238b;

    /* renamed from: c */
    public static final DateTimeFormatter f68239c;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lco/bird/gson/android/typeadapters/DateTimeTypeAdapter$a;", "", "<init>", "()V", "gson_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.gson.android.typeadapters.DateTimeTypeAdapter$a */
    /* loaded from: classes4.dex */
    public static final class C16711a {
        public /* synthetic */ C16711a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16711a() {
        }
    }

    static {
        DateTimeFormatter dateTime = ISODateTimeFormat.dateTime();
        Locale locale = Locale.ROOT;
        DateTimeFormatter withLocale = dateTime.withLocale(locale);
        Intrinsics.checkNotNullExpressionValue(withLocale, "dateTime().withLocale(Locale.ROOT)");
        f68238b = withLocale;
        DateTimeFormatter withLocale2 = ISODateTimeFormat.dateTimeParser().withOffsetParsed().withLocale(locale);
        Intrinsics.checkNotNullExpressionValue(withLocale2, "dateTimeParser().withOff…).withLocale(Locale.ROOT)");
        f68239c = withLocale2;
    }

    @Override // p000.InterfaceC50581vi2
    /* renamed from: a */
    public DateTime deserialize(AbstractC52360yi2 json, Type type, InterfaceC49989ui2 context) throws JsonParseException {
        boolean z;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(context, "context");
        String date = json.mo2882j();
        Intrinsics.checkNotNullExpressionValue(date, "date");
        if (date.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return DateTime.parse(date, f68239c).withZone(DateTimeZone.getDefault());
    }

    @Override // p000.InterfaceC44663lj2
    /* renamed from: b */
    public AbstractC52360yi2 serialize(DateTime dateTime, Type type, InterfaceC44070kj2 context) {
        String print;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(context, "context");
        if (dateTime == null) {
            print = "";
        } else {
            print = f68238b.print(dateTime);
        }
        return new C37537Zi2(print);
    }
}
