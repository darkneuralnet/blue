package p000;

import android.content.Context;
import android.content.res.Resources;
import ch.qos.logback.core.CoreConstants;
import com.appboy.support.PackageUtils;
import com.facebook.share.internal.C17296a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\f\b\u0017\u0018\u0000 02\u00020\u0001:\u000212B%\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\n\u0012\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\b.\u0010/J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0006J\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\u00022\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0006H\u0004J$\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0004J$\u0010\u0016\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0004J$\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0007J$\u0010\u0018\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0007J\u0018\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0006H\u0007R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R%\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00063"}, m28432d2 = {"Lh80;", "", "", "key", "Lh80$b;", "resourceType", "", "getResourceIdentifier", "getFallbackConfigKey", "primaryKey", "", "defaultValue", "getBooleanValue", "getStringValue", "getIntValue", "getColorValue", "(Ljava/lang/String;)Ljava/lang/Integer;", "", "getStringSetValue", "getDrawableValue", "type", "getRuntimeConfigurationValue", "getResourceConfigurationValue", "getConfigurationValue", "readResourceValue", "resourceId", "getValueFromResources", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "shouldUseConfigurationCache", "Z", "Lgd5;", "runtimeAppConfigurationProvider", "Lgd5;", "getRuntimeAppConfigurationProvider", "()Lgd5;", "setRuntimeAppConfigurationProvider", "(Lgd5;)V", "", "configurationCache", "Ljava/util/Map;", "getConfigurationCache", "()Ljava/util/Map;", "resourcePackageName", "Ljava/lang/String;", "<init>", "(Landroid/content/Context;ZLgd5;)V", "Companion", C17296a.f69688o, "b", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: h80  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C41945h80 {
    public static final C22554a Companion = new C22554a(null);
    private final Map<String, Object> configurationCache;
    private Context context;
    private final String resourcePackageName;
    private C41641gd5 runtimeAppConfigurationProvider;
    private boolean shouldUseConfigurationCache;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lh80$a;", "", "", "MISSING_RESOURCE_IDENTIFIER", "I", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: h80$a */
    /* loaded from: classes2.dex */
    public static final class C22554a {
        public /* synthetic */ C22554a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C22554a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, m28432d2 = {"Lh80$b;", "", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "type", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: h80$b */
    /* loaded from: classes2.dex */
    public enum EnumC22555b {
        INTEGER("integer"),
        COLOR("color"),
        BOOLEAN("bool"),
        STRING("string"),
        DRAWABLE_IDENTIFIER("drawable"),
        STRING_ARRAY("array");
        

        /* renamed from: b */
        public final String f84733b;

        EnumC22555b(String str) {
            this.f84733b = str;
        }

        /* renamed from: b */
        public final String m36834b() {
            return this.f84733b;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: h80$c */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C22556c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f84734a;

        static {
            int[] iArr = new int[EnumC22555b.values().length];
            iArr[EnumC22555b.BOOLEAN.ordinal()] = 1;
            iArr[EnumC22555b.STRING.ordinal()] = 2;
            iArr[EnumC22555b.STRING_ARRAY.ordinal()] = 3;
            iArr[EnumC22555b.INTEGER.ordinal()] = 4;
            iArr[EnumC22555b.COLOR.ordinal()] = 5;
            iArr[EnumC22555b.DRAWABLE_IDENTIFIER.ordinal()] = 6;
            f84734a = iArr;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: h80$d */
    /* loaded from: classes2.dex */
    public static final class C22557d extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f84735g;

        /* renamed from: h */
        public final /* synthetic */ Object f84736h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22557d(String str, Object obj) {
            super(0);
            this.f84735g = str;
            this.f84736h = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Using resources value for key: '" + this.f84735g + "' and value: '" + this.f84736h + CoreConstants.SINGLE_QUOTE_CHAR;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: h80$e */
    /* loaded from: classes2.dex */
    public static final class C22558e extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f84737g;

        /* renamed from: h */
        public final /* synthetic */ Object f84738h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22558e(String str, Object obj) {
            super(0);
            this.f84737g = str;
            this.f84738h = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Using runtime override value for key: '" + this.f84737g + "' and value: '" + this.f84738h + CoreConstants.SINGLE_QUOTE_CHAR;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: h80$f */
    /* loaded from: classes2.dex */
    public static final class C22559f extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f84739g;

        /* renamed from: h */
        public final /* synthetic */ Object f84740h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22559f(String str, Object obj) {
            super(0);
            this.f84739g = str;
            this.f84740h = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Primary key '" + this.f84739g + "' had no identifier. No secondary key to read resource value. Returning default value: '" + this.f84740h + CoreConstants.SINGLE_QUOTE_CHAR;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: h80$g */
    /* loaded from: classes2.dex */
    public static final class C22560g extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C22560g f84741g = new C22560g();

        public C22560g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Caught exception retrieving resource value";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: h80$h */
    /* loaded from: classes2.dex */
    public static final class C22561h extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ EnumC22555b f84742g;

        /* renamed from: h */
        public final /* synthetic */ String f84743h;

        /* renamed from: i */
        public final /* synthetic */ Object f84744i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22561h(EnumC22555b enumC22555b, String str, Object obj) {
            super(0);
            this.f84742g = enumC22555b;
            this.f84743h = str;
            this.f84744i = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Unable to find the xml " + this.f84742g + " configuration value with primary key '" + this.f84743h + "'.Using default value '" + this.f84744i + "'.";
        }
    }

    public C41945h80(Context context, boolean z, C41641gd5 runtimeAppConfigurationProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(runtimeAppConfigurationProvider, "runtimeAppConfigurationProvider");
        this.context = context;
        this.shouldUseConfigurationCache = z;
        this.runtimeAppConfigurationProvider = runtimeAppConfigurationProvider;
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new HashMap());
        Intrinsics.checkNotNullExpressionValue(synchronizedMap, "synchronizedMap(HashMap())");
        this.configurationCache = synchronizedMap;
        String resourcePackageName = PackageUtils.getResourcePackageName(this.context);
        Intrinsics.checkNotNullExpressionValue(resourcePackageName, "getResourcePackageName(context)");
        this.resourcePackageName = resourcePackageName;
    }

    private final String getFallbackConfigKey(String str) {
        boolean contains$default;
        String replace$default;
        contains$default = StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "braze", false, 2, (Object) null);
        if (contains$default) {
            replace$default = StringsKt__StringsJVMKt.replace$default(str, "braze", "appboy", false, 4, (Object) null);
            return replace$default;
        }
        return null;
    }

    private final int getResourceIdentifier(String str, EnumC22555b enumC22555b) {
        if (str == null) {
            return 0;
        }
        return this.context.getResources().getIdentifier(str, enumC22555b.m36834b(), this.resourcePackageName);
    }

    public final boolean getBooleanValue(String primaryKey, boolean z) {
        Intrinsics.checkNotNullParameter(primaryKey, "primaryKey");
        Object configurationValue = getConfigurationValue(EnumC22555b.BOOLEAN, primaryKey, Boolean.valueOf(z));
        if (configurationValue != null) {
            return ((Boolean) configurationValue).booleanValue();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
    }

    public final Integer getColorValue(String primaryKey) {
        Intrinsics.checkNotNullParameter(primaryKey, "primaryKey");
        return (Integer) getConfigurationValue(EnumC22555b.COLOR, primaryKey, null);
    }

    public final Map<String, Object> getConfigurationCache() {
        return this.configurationCache;
    }

    public final Object getConfigurationValue(EnumC22555b type, String key, Object obj) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.shouldUseConfigurationCache && this.configurationCache.containsKey(key)) {
            return this.configurationCache.get(key);
        }
        if (this.runtimeAppConfigurationProvider.m37967c(key)) {
            return getRuntimeConfigurationValue(type, key, obj);
        }
        return getResourceConfigurationValue(type, key, obj);
    }

    public final int getDrawableValue(String primaryKey, int i) {
        Intrinsics.checkNotNullParameter(primaryKey, "primaryKey");
        Object configurationValue = getConfigurationValue(EnumC22555b.DRAWABLE_IDENTIFIER, primaryKey, Integer.valueOf(i));
        if (configurationValue != null) {
            return ((Integer) configurationValue).intValue();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }

    public final int getIntValue(String primaryKey, int i) {
        Intrinsics.checkNotNullParameter(primaryKey, "primaryKey");
        Object configurationValue = getConfigurationValue(EnumC22555b.INTEGER, primaryKey, Integer.valueOf(i));
        if (configurationValue != null) {
            return ((Integer) configurationValue).intValue();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }

    public final Object getResourceConfigurationValue(EnumC22555b type, String key, Object obj) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(key, "key");
        Object readResourceValue = readResourceValue(type, key, obj);
        this.configurationCache.put(key, readResourceValue);
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C22557d(key, readResourceValue), 7, null);
        return readResourceValue;
    }

    public final C41641gd5 getRuntimeAppConfigurationProvider() {
        return this.runtimeAppConfigurationProvider;
    }

    public final Object getRuntimeConfigurationValue(EnumC22555b type, String key, Object obj) {
        Object valueOf;
        int m37964f;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(key, "key");
        switch (C22556c.f84734a[type.ordinal()]) {
            case 1:
                C41641gd5 c41641gd5 = this.runtimeAppConfigurationProvider;
                if (obj != null) {
                    valueOf = Boolean.valueOf(c41641gd5.m37966d(key, ((Boolean) obj).booleanValue()));
                    break;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
            case 2:
                valueOf = this.runtimeAppConfigurationProvider.m37962h(key, (String) obj);
                break;
            case 3:
                C41641gd5 c41641gd52 = this.runtimeAppConfigurationProvider;
                if (obj != null) {
                    valueOf = c41641gd52.m37963g(key, (Set) obj);
                    break;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<kotlin.String?>");
                }
            case 4:
            case 5:
                if (obj == null) {
                    m37964f = this.runtimeAppConfigurationProvider.m37964f(key, 0);
                } else {
                    m37964f = this.runtimeAppConfigurationProvider.m37964f(key, ((Integer) obj).intValue());
                }
                valueOf = Integer.valueOf(m37964f);
                break;
            case 6:
                valueOf = Integer.valueOf(getResourceIdentifier(this.runtimeAppConfigurationProvider.m37962h(key, ""), EnumC22555b.DRAWABLE_IDENTIFIER));
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.configurationCache.put(key, valueOf);
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C22558e(key, valueOf), 7, null);
        return valueOf;
    }

    public final Set<String> getStringSetValue(String primaryKey, Set<String> set) {
        Intrinsics.checkNotNullParameter(primaryKey, "primaryKey");
        Object configurationValue = getConfigurationValue(EnumC22555b.STRING_ARRAY, primaryKey, set);
        if (configurationValue == null) {
            return set;
        }
        return (Set) configurationValue;
    }

    public final String getStringValue(String primaryKey, String str) {
        Intrinsics.checkNotNullParameter(primaryKey, "primaryKey");
        return (String) getConfigurationValue(EnumC22555b.STRING, primaryKey, str);
    }

    public final Object getValueFromResources(EnumC22555b type, int i) {
        List listOf;
        Intrinsics.checkNotNullParameter(type, "type");
        Resources resources = this.context.getResources();
        switch (C22556c.f84734a[type.ordinal()]) {
            case 1:
                return Boolean.valueOf(resources.getBoolean(i));
            case 2:
                String string = resources.getString(i);
                Intrinsics.checkNotNullExpressionValue(string, "resources.getString(resourceId)");
                return string;
            case 3:
                String[] stringArray = resources.getStringArray(i);
                Intrinsics.checkNotNullExpressionValue(stringArray, "resources.getStringArray(resourceId)");
                listOf = CollectionsKt__CollectionsKt.listOf(Arrays.copyOf(stringArray, stringArray.length));
                return new HashSet(listOf);
            case 4:
                return Integer.valueOf(resources.getInteger(i));
            case 5:
                return Integer.valueOf(resources.getColor(i));
            case 6:
                return Integer.valueOf(i);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final Object readResourceValue(EnumC22555b type, String key, Object obj) {
        int resourceIdentifier;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            resourceIdentifier = getResourceIdentifier(key, type);
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C22560g.f84741g, 4, null);
        }
        if (resourceIdentifier != 0) {
            return getValueFromResources(type, resourceIdentifier);
        }
        String fallbackConfigKey = getFallbackConfigKey(key);
        if (fallbackConfigKey == null) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C22559f(key, obj), 7, null);
            return obj;
        }
        int resourceIdentifier2 = getResourceIdentifier(fallbackConfigKey, type);
        if (resourceIdentifier2 != 0) {
            return getValueFromResources(type, resourceIdentifier2);
        }
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C22561h(type, key, obj), 7, null);
        return obj;
    }

    public /* synthetic */ C41945h80(Context context, boolean z, C41641gd5 c41641gd5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? true : z, (i & 4) != 0 ? new C41641gd5(context) : c41641gd5);
    }
}
