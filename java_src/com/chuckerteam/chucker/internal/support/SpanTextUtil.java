package com.chuckerteam.chucker.internal.support;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.common.ConstantsKt;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt__CharKt;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00052\u00020\u0001:\u0003\u001f\n\u000bB\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\"\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b*\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002J\u0016\u0010\u000b\u001a\u00020\u0006*\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002J$\u0010\u000f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u0014\u0010\u0011\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J)\u0010\u0013\u001a\u0004\u0018\u00010\u0006*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015¨\u0006 "}, m28432d2 = {"Lcom/chuckerteam/chucker/internal/support/SpanTextUtil;", "", "", "input", "Landroid/text/SpannableStringBuilder;", "f", "", "startIndex", "Lkotlin/Pair;", "Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;", C17296a.f69688o, "b", "start", "end", "color", DateTokenConverter.CONVERTER_KEY, "tokenIndex", "c", "lastTokenType", "e", "(Landroid/text/SpannableStringBuilder;ILcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;)Ljava/lang/Integer;", "I", "jsonKeyColor", "jsonValueColor", "jsonDigitsAndNullValueColor", "jsonSignElementsColor", "jsonBooleanColor", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "ChuckerForegroundColorSpan", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class SpanTextUtil {

    /* renamed from: f */
    public static final C17152a f69228f = new C17152a(null);

    /* renamed from: a */
    public final int f69229a;

    /* renamed from: b */
    public final int f69230b;

    /* renamed from: c */
    public final int f69231c;

    /* renamed from: d */
    public final int f69232d;

    /* renamed from: e */
    public final int f69233e;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$ChuckerForegroundColorSpan;", "Landroid/text/style/ForegroundColorSpan;", "color", "", "(I)V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes5.dex */
    public static final class ChuckerForegroundColorSpan extends ForegroundColorSpan {
        public ChuckerForegroundColorSpan(int i) {
            super(i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$a;", "", "", "BOOLEAN_FALSE_INDEX_OFFSET", "I", "BOOLEAN_TRUE_INDEX_OFFSET", "<init>", "()V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.chuckerteam.chucker.internal.support.SpanTextUtil$a */
    /* loaded from: classes5.dex */
    public static final class C17152a {
        public /* synthetic */ C17152a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C17152a() {
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum e uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0082\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0017\b\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m28432d2 = {"Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;", "", "", "", "b", "Ljava/util/Set;", "c", "()Ljava/util/Set;", "delimiters", "<init>", "(Ljava/lang/String;ILjava/util/Set;)V", C17296a.f69688o, "e", "f", "g", "h", "i", "j", "k", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSpanTextUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpanTextUtil.kt\ncom/chuckerteam/chucker/internal/support/SpanTextUtil$TokenType\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,188:1\n11335#2:189\n11670#2,3:190\n*S KotlinDebug\n*F\n+ 1 SpanTextUtil.kt\ncom/chuckerteam/chucker/internal/support/SpanTextUtil$TokenType\n*L\n44#1:189\n44#1:190,3\n*E\n"})
    /* renamed from: com.chuckerteam.chucker.internal.support.SpanTextUtil$b */
    /* loaded from: classes5.dex */
    public static final class EnumC17153b {

        /* renamed from: c */
        public static final C17154a f69234c;

        /* renamed from: d */
        public static final Set<String> f69235d;

        /* renamed from: e */
        public static final EnumC17153b f69236e;

        /* renamed from: f */
        public static final EnumC17153b f69237f;

        /* renamed from: g */
        public static final EnumC17153b f69238g;

        /* renamed from: h */
        public static final EnumC17153b f69239h;

        /* renamed from: i */
        public static final EnumC17153b f69240i;

        /* renamed from: j */
        public static final EnumC17153b f69241j;

        /* renamed from: k */
        public static final EnumC17153b f69242k;

        /* renamed from: l */
        public static final /* synthetic */ EnumC17153b[] f69243l;

        /* renamed from: b */
        public final Set<String> f69244b;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b$a;", "", "", "", "allPossibleTokens", "Ljava/util/Set;", C17296a.f69688o, "()Ljava/util/Set;", "<init>", "()V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: com.chuckerteam.chucker.internal.support.SpanTextUtil$b$a */
        /* loaded from: classes5.dex */
        public static final class C17154a {
            public /* synthetic */ C17154a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final Set<String> m52974a() {
                return EnumC17153b.f69235d;
            }

            private C17154a() {
            }
        }

        static {
            Set of;
            Set of2;
            Set of3;
            Set of4;
            Set of5;
            Set of6;
            Set emptySet;
            List flatten;
            Set<String> set;
            of = SetsKt__SetsJVMKt.setOf("\"");
            f69236e = new EnumC17153b("STRING", 0, of);
            of2 = SetsKt__SetsKt.setOf((Object[]) new String[]{"[", "]"});
            f69237f = new EnumC17153b("ARRAY", 1, of2);
            of3 = SetsKt__SetsKt.setOf((Object[]) new String[]{"{", "}"});
            f69238g = new EnumC17153b("OBJECT", 2, of3);
            of4 = SetsKt__SetsJVMKt.setOf(":");
            f69239h = new EnumC17153b("KEY_SEPARATOR", 3, of4);
            of5 = SetsKt__SetsJVMKt.setOf(",");
            f69240i = new EnumC17153b("VALUE_SEPARATOR", 4, of5);
            of6 = SetsKt__SetsKt.setOf((Object[]) new String[]{"true", "false"});
            f69241j = new EnumC17153b("BOOLEAN", 5, of6);
            emptySet = SetsKt__SetsKt.emptySet();
            f69242k = new EnumC17153b(ConstantsKt.NONE, 6, emptySet);
            f69243l = m52977a();
            f69234c = new C17154a(null);
            EnumC17153b[] values = values();
            ArrayList arrayList = new ArrayList(values.length);
            for (EnumC17153b enumC17153b : values) {
                arrayList.add(enumC17153b.f69244b);
            }
            flatten = CollectionsKt__IterablesKt.flatten(arrayList);
            set = CollectionsKt___CollectionsKt.toSet(flatten);
            f69235d = set;
        }

        public EnumC17153b(String str, int i, Set set) {
            this.f69244b = set;
        }

        /* renamed from: a */
        public static final /* synthetic */ EnumC17153b[] m52977a() {
            return new EnumC17153b[]{f69236e, f69237f, f69238g, f69239h, f69240i, f69241j, f69242k};
        }

        public static EnumC17153b valueOf(String str) {
            return (EnumC17153b) Enum.valueOf(EnumC17153b.class, str);
        }

        public static EnumC17153b[] values() {
            return (EnumC17153b[]) f69243l.clone();
        }

        /* renamed from: c */
        public final Set<String> m52975c() {
            return this.f69244b;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.chuckerteam.chucker.internal.support.SpanTextUtil$c */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C17155c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC17153b.values().length];
            try {
                iArr[EnumC17153b.f69241j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17153b.f69237f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC17153b.f69238g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC17153b.f69239h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC17153b.f69240i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC17153b.f69236e.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC17153b.f69242k.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SpanTextUtil(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f69229a = NA0.m94301c(context, C33066Gf4.chucker_json_key_color);
        this.f69230b = NA0.m94301c(context, C33066Gf4.chucker_json_value_color);
        this.f69231c = NA0.m94301c(context, C33066Gf4.chucker_json_digit_and_null_value_color);
        this.f69232d = NA0.m94301c(context, C33066Gf4.chucker_json_elements_color);
        this.f69233e = NA0.m94301c(context, C33066Gf4.chucker_json_boolean_color);
    }

    /* renamed from: a */
    public final Pair<Integer, EnumC17153b> m52983a(CharSequence charSequence, int i) {
        Pair findAnyOf;
        findAnyOf = StringsKt__StringsKt.findAnyOf(charSequence, EnumC17153b.f69234c.m52974a(), i, true);
        if (findAnyOf == null) {
            return TuplesKt.m28425to(-1, EnumC17153b.f69242k);
        }
        int intValue = ((Number) findAnyOf.component1()).intValue();
        String str = (String) findAnyOf.component2();
        EnumC17153b enumC17153b = EnumC17153b.f69237f;
        if (!enumC17153b.m52975c().contains(str)) {
            enumC17153b = EnumC17153b.f69238g;
            if (!enumC17153b.m52975c().contains(str)) {
                enumC17153b = EnumC17153b.f69239h;
                if (!enumC17153b.m52975c().contains(str)) {
                    enumC17153b = EnumC17153b.f69240i;
                    if (!enumC17153b.m52975c().contains(str)) {
                        enumC17153b = EnumC17153b.f69236e;
                        if (!enumC17153b.m52975c().contains(str)) {
                            enumC17153b = EnumC17153b.f69241j;
                            if (!enumC17153b.m52975c().contains(str)) {
                                enumC17153b = null;
                            }
                        }
                    }
                }
            }
        }
        if (enumC17153b != null) {
            return TuplesKt.m28425to(Integer.valueOf(intValue), enumC17153b);
        }
        return TuplesKt.m28425to(-1, EnumC17153b.f69242k);
    }

    /* renamed from: b */
    public final int m52982b(CharSequence charSequence, int i) {
        int indexOf$default;
        indexOf$default = StringsKt__StringsKt.indexOf$default(charSequence, '\"', i, false, 4, (Object) null);
        while (indexOf$default < charSequence.length()) {
            if (charSequence.charAt(indexOf$default) != '\"' || (indexOf$default != 0 && charSequence.charAt(indexOf$default - 1) == '\\')) {
                indexOf$default = StringsKt__StringsKt.indexOf$default(charSequence, '\"', indexOf$default + 1, false, 4, (Object) null);
            } else {
                return indexOf$default;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public final int m52981c(SpannableStringBuilder spannableStringBuilder, int i) {
        boolean equals;
        int i2;
        equals = CharsKt__CharKt.equals(spannableStringBuilder.charAt(i), 't', true);
        if (equals) {
            i2 = i + 4;
        } else {
            i2 = i + 5;
        }
        m52980d(spannableStringBuilder, i, i2, this.f69233e);
        return i2;
    }

    /* renamed from: d */
    public final SpannableStringBuilder m52980d(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        spannableStringBuilder.setSpan(new ChuckerForegroundColorSpan(i3), i, i2, 18);
        return spannableStringBuilder;
    }

    /* renamed from: e */
    public final Integer m52979e(SpannableStringBuilder spannableStringBuilder, int i, EnumC17153b enumC17153b) {
        int i2;
        int i3;
        int i4 = -1;
        if (enumC17153b == null) {
            i2 = -1;
        } else {
            i2 = C17155c.$EnumSwitchMapping$0[enumC17153b.ordinal()];
        }
        if (i2 != -1 && i2 != 5 && i2 != 7 && i2 != 2 && i2 != 3) {
            i3 = this.f69230b;
        } else {
            i3 = this.f69229a;
        }
        try {
            i4 = m52982b(spannableStringBuilder, i + 1);
        } catch (Exception unused) {
        }
        if (i4 < i) {
            return null;
        }
        m52980d(spannableStringBuilder, i, i4 + 1, i3);
        return Integer.valueOf(i4);
    }

    /* renamed from: f */
    public final SpannableStringBuilder m52978f(CharSequence input) {
        int m52981c;
        Intrinsics.checkNotNullParameter(input, "input");
        String m7720c = C50730vx1.f114933a.m7720c(input.toString());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m7720c);
        int i = 0;
        m52980d(spannableStringBuilder, 0, m7720c.length(), this.f69231c);
        EnumC17153b enumC17153b = null;
        while (i < m7720c.length()) {
            Pair<Integer, EnumC17153b> m52983a = m52983a(m7720c, i);
            int intValue = m52983a.component1().intValue();
            EnumC17153b component2 = m52983a.component2();
            switch (C17155c.$EnumSwitchMapping$0[component2.ordinal()]) {
                case 1:
                    m52981c = m52981c(spannableStringBuilder, intValue);
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                    m52981c = intValue + 1;
                    m52980d(spannableStringBuilder, intValue, m52981c, this.f69232d);
                    break;
                case 6:
                    Integer m52979e = m52979e(spannableStringBuilder, intValue, enumC17153b);
                    if (m52979e != null) {
                        i = m52979e.intValue() + 1;
                        m52979e.intValue();
                        continue;
                        enumC17153b = component2;
                    } else {
                        return spannableStringBuilder;
                    }
                case 7:
                    return spannableStringBuilder;
                default:
                    enumC17153b = component2;
            }
            i = m52981c;
            enumC17153b = component2;
        }
        return spannableStringBuilder;
    }
}
