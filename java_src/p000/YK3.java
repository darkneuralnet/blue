package p000;

import com.facebook.share.internal.C17296a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0005¨\u0006\f"}, m28432d2 = {"LYK3;", "", "Lkotlin/text/Regex;", "b", "Lkotlin/text/Regex;", "()Lkotlin/text/Regex;", "SPACE", "c", C17296a.f69688o, "SENTENCE_CASE_REGEX", "<init>", "()V", "extension_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: YK3 */
/* loaded from: classes3.dex */
public final class YK3 {

    /* renamed from: a */
    public static final YK3 f44996a = new YK3();

    /* renamed from: b */
    public static final Regex f44997b = new Regex("\\s+");

    /* renamed from: c */
    public static final Regex f44998c;

    static {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%s|%s|%s", Arrays.copyOf(new Object[]{"(?<=[A-Z])(?=[A-Z][a-z])", "(?<=[^A-Z])(?=[A-Z])", "(?<=[A-Za-z])(?=[^A-Za-z])"}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        f44998c = new Regex(format);
    }

    private YK3() {
    }

    /* renamed from: a */
    public final Regex m75245a() {
        return f44998c;
    }

    /* renamed from: b */
    public final Regex m75244b() {
        return f44997b;
    }
}
