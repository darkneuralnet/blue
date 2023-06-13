package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.MapsKt___MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010'\u001a\u00020%\u0012\u0006\u0010*\u001a\u00020(\u0012\u0006\u0010-\u001a\u00020+¢\u0006\u0004\b/\u00100J\"\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0006J)\u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00062\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\n\"\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0006J\u0016\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000eJ\u0016\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006J\u0016\u0010\u0014\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006J5\u0010\u0015\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\n\"\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0002J\u001f\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n2\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\b\u001a\u00020\u0006H\u0002J\n\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002J\b\u0010!\u001a\u00020 H\u0002J\u0014\u0010$\u001a\u00020#*\u00020\u00062\u0006\u0010\"\u001a\u00020\u001eH\u0002R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010,R\u0016\u0010.\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010)¨\u00061"}, m28432d2 = {"LyM4;", "", "", "name", "defType", "defPackage", "", C17296a.f69688o, "id", "g", "", "formatArgs", "h", "(I[Ljava/lang/Object;)Ljava/lang/String;", "", "l", "def", "m", "quantity", "f", "c", DateTokenConverter.CONVERTER_KEY, "(II[Ljava/lang/Object;)Ljava/lang/String;", "i", "(I)[Ljava/lang/String;", "n", "(I)[Ljava/lang/CharSequence;", "e", "j", "k", "Ljava/util/Locale;", "b", "", "o", "locale", "LDW3;", "p", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/res/Resources;", "Landroid/content/res/Resources;", "baseResources", "LbS5;", "LbS5;", "stringRepository", "res", "<init>", "(Landroid/content/Context;Landroid/content/res/Resources;LbS5;)V", "restring_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: yM4  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C52156yM4 {

    /* renamed from: a */
    public final Context f119443a;

    /* renamed from: b */
    public final Resources f119444b;

    /* renamed from: c */
    public final InterfaceC38557bS5 f119445c;

    /* renamed from: d */
    public Resources f119446d;

    public C52156yM4(Context context, Resources baseResources, InterfaceC38557bS5 stringRepository) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(baseResources, "baseResources");
        Intrinsics.checkNotNullParameter(stringRepository, "stringRepository");
        this.f119443a = context;
        this.f119444b = baseResources;
        this.f119445c = stringRepository;
        this.f119446d = baseResources;
    }

    /* renamed from: a */
    public final int m3572a(String name, String str, String str2) {
        List list;
        Object obj;
        Intrinsics.checkNotNullParameter(name, "name");
        int identifier = this.f119444b.getIdentifier(name, str, str2);
        if (Intrinsics.areEqual(str, "string") && identifier == 0) {
            Map<String, CharSequence> map = this.f119445c.mo29256c().get(UM4.m81595a());
            if (map != null && map.get(name) != null) {
                int hashCode = UUID.randomUUID().hashCode();
                list = MapsKt___MapsKt.toList(UM4.f37299a.m81593c());
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (Intrinsics.areEqual(((Pair) obj).getSecond(), name)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                Pair pair = (Pair) obj;
                if (pair != null) {
                    return ((Number) pair.getFirst()).intValue();
                }
                UM4.f37299a.m81593c().put(Integer.valueOf(hashCode), name);
                return hashCode;
            }
            return 0;
        }
        return identifier;
    }

    /* renamed from: b */
    public final Locale m3571b() {
        Object obj;
        Locale m81595a = UM4.m81595a();
        Set<Locale> mo29257b = this.f119445c.mo29257b();
        if (!mo29257b.contains(m81595a)) {
            Iterator<T> it = mo29257b.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.areEqual(((Locale) obj).getLanguage(), m81595a.getLanguage())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            return (Locale) obj;
        }
        return m81595a;
    }

    /* renamed from: c */
    public final String m3570c(int i, int i2) {
        String str;
        m3558o();
        CharSequence m3568e = m3568e(i, i2);
        if (m3568e != null) {
            str = m3568e.toString();
        } else {
            str = null;
        }
        if (str == null) {
            String quantityString = this.f119446d.getQuantityString(i, i2);
            Intrinsics.checkNotNullExpressionValue(quantityString, "res.getQuantityString(id, quantity)");
            return quantityString;
        }
        return str;
    }

    /* renamed from: d */
    public final String m3569d(int i, int i2, Object... formatArgs) {
        String str;
        String obj;
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        m3558o();
        CharSequence m3568e = m3568e(i, i2);
        if (m3568e != null && (obj = m3568e.toString()) != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Object[] copyOf = Arrays.copyOf(formatArgs, formatArgs.length);
            str = String.format(obj, Arrays.copyOf(copyOf, copyOf.length));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        } else {
            str = null;
        }
        if (str == null) {
            String quantityString = this.f119446d.getQuantityString(i, i2, Arrays.copyOf(formatArgs, formatArgs.length));
            Intrinsics.checkNotNullExpressionValue(quantityString, "res.getQuantityString(id, quantity, *formatArgs)");
            return quantityString;
        }
        return str;
    }

    /* renamed from: e */
    public final CharSequence m3568e(int i, int i2) {
        Map<DW3, CharSequence> map;
        Locale m3571b = m3571b();
        if (m3571b == null) {
            return null;
        }
        String resourceEntryName = this.f119444b.getResourceEntryName(i);
        Map<String, Map<DW3, CharSequence>> map2 = this.f119445c.mo29255d().get(m3571b);
        if (map2 != null) {
            map = map2.get(resourceEntryName);
        } else {
            map = null;
        }
        if (map == null) {
            return null;
        }
        return map.get(m3557p(i2, m3571b));
    }

    /* renamed from: f */
    public final CharSequence m3567f(int i, int i2) {
        m3558o();
        CharSequence m3568e = m3568e(i, i2);
        if (m3568e == null) {
            CharSequence quantityText = this.f119446d.getQuantityText(i, i2);
            Intrinsics.checkNotNullExpressionValue(quantityText, "res.getQuantityText(id, quantity)");
            return quantityText;
        }
        return m3568e;
    }

    /* renamed from: g */
    public final String m3566g(int i) {
        String obj;
        m3558o();
        CharSequence m3562k = m3562k(i);
        if (m3562k == null || (obj = m3562k.toString()) == null) {
            String string = this.f119446d.getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "res.getString(id)");
            return string;
        }
        return obj;
    }

    /* renamed from: h */
    public final String m3565h(int i, Object... formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        m3558o();
        CharSequence m3562k = m3562k(i);
        if (m3562k != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String obj = m3562k.toString();
            Object[] copyOf = Arrays.copyOf(formatArgs, formatArgs.length);
            String format = String.format(obj, Arrays.copyOf(copyOf, copyOf.length));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            return format;
        }
        String string = this.f119446d.getString(i, Arrays.copyOf(formatArgs, formatArgs.length));
        Intrinsics.checkNotNullExpressionValue(string, "res.getString(id, *formatArgs)");
        return string;
    }

    /* renamed from: i */
    public final String[] m3564i(int i) {
        m3558o();
        CharSequence[] m3563j = m3563j(i);
        if (m3563j != null) {
            ArrayList arrayList = new ArrayList(m3563j.length);
            for (CharSequence charSequence : m3563j) {
                arrayList.add(charSequence.toString());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            if (strArr != null) {
                return strArr;
            }
        }
        String[] stringArray = this.f119446d.getStringArray(i);
        Intrinsics.checkNotNullExpressionValue(stringArray, "res.getStringArray(id)");
        return stringArray;
    }

    /* renamed from: j */
    public final CharSequence[] m3563j(int i) {
        Locale m3571b = m3571b();
        if (m3571b == null) {
            return null;
        }
        String resourceEntryName = this.f119444b.getResourceEntryName(i);
        Map<String, CharSequence[]> map = this.f119445c.mo29258a().get(m3571b);
        if (map == null) {
            return null;
        }
        return map.get(resourceEntryName);
    }

    /* renamed from: k */
    public final CharSequence m3562k(int i) {
        Locale m3571b = m3571b();
        if (m3571b == null) {
            return null;
        }
        try {
            String resourceEntryName = this.f119444b.getResourceEntryName(i);
            Map<String, CharSequence> map = this.f119445c.mo29256c().get(m3571b);
            if (map == null) {
                return null;
            }
            return map.get(resourceEntryName);
        } catch (Resources.NotFoundException e) {
            String str = UM4.f37299a.m81593c().get(Integer.valueOf(i));
            if (str != null) {
                Map<String, CharSequence> map2 = this.f119445c.mo29256c().get(m3571b);
                if (map2 == null) {
                    return null;
                }
                return map2.get(str);
            }
            throw e;
        }
    }

    /* renamed from: l */
    public final CharSequence m3561l(int i) {
        m3558o();
        CharSequence m3562k = m3562k(i);
        if (m3562k == null) {
            CharSequence text = this.f119446d.getText(i);
            Intrinsics.checkNotNullExpressionValue(text, "res.getText(id)");
            return text;
        }
        return m3562k;
    }

    /* renamed from: m */
    public final CharSequence m3560m(int i, CharSequence def) {
        Object m116783constructorimpl;
        Intrinsics.checkNotNullParameter(def, "def");
        m3558o();
        try {
            Result.Companion companion = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(m3562k(i));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m116789isFailureimpl(m116783constructorimpl)) {
            m116783constructorimpl = null;
        }
        CharSequence charSequence = (CharSequence) m116783constructorimpl;
        if (charSequence == null) {
            CharSequence text = this.f119446d.getText(i, def);
            Intrinsics.checkNotNullExpressionValue(text, "res.getText(id, def)");
            return text;
        }
        return charSequence;
    }

    /* renamed from: n */
    public final CharSequence[] m3559n(int i) {
        m3558o();
        CharSequence[] m3563j = m3563j(i);
        if (m3563j == null) {
            CharSequence[] textArray = this.f119446d.getTextArray(i);
            Intrinsics.checkNotNullExpressionValue(textArray, "res.getTextArray(id)");
            return textArray;
        }
        return m3563j;
    }

    /* renamed from: o */
    public final void m3558o() {
        if (UM4.m81594b().mo78254b()) {
            return;
        }
        Configuration configuration = this.f119444b.getConfiguration();
        configuration.setLocale(UM4.m81595a());
        Resources resources = this.f119443a.createConfigurationContext(configuration).getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.createConfigurationContext(conf).resources");
        this.f119446d = resources;
    }

    /* renamed from: p */
    public final DW3 m3557p(int i, Locale locale) {
        return DW3.f5814b.m110307a(this.f119444b, locale, i);
    }
}
