package p000;

import com.facebook.share.internal.C17296a;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\t"}, m28432d2 = {"LrT0;", "", "", "date", "format", "", C17296a.f69688o, "<init>", "()V", "components-core_release"}, m28431k = 1, m28430mv = {1, 5, 1})
/* renamed from: rT0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48066rT0 {

    /* renamed from: a */
    public static final C48066rT0 f107119a = new C48066rT0();

    private C48066rT0() {
    }

    /* renamed from: a */
    public final boolean m15926a(String date, String format) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(format, "format");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format, Locale.US);
        simpleDateFormat.setLenient(false);
        try {
            simpleDateFormat.parse(date);
            return true;
        } catch (ParseException unused) {
            C32290Cx2.m111212c("DateUtil", "Provided date " + date + " does not match the given format " + format);
            return false;
        }
    }
}
