package okhttp3;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.Util;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000 !2\u00020\u0001:\u0002 !Bq\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\r\u0010\u000f\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0015J\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0016J\r\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0017J\r\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0018J\r\u0010\n\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0019J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001aJ\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001bJ\r\u0010\u000e\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001cJ\r\u0010\r\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001dJ\r\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u001eJ\b\u0010\u001f\u001a\u00020\u0011H\u0016R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u000f\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0013\u0010\u0005\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0014R\u0013\u0010\u000b\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0014R\u0013\u0010\f\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0014R\u0013\u0010\n\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0013R\u0013\u0010\u000e\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0013R\u0013\u0010\r\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0013R\u0013\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0014¨\u0006\""}, m28432d2 = {"Lokhttp3/CacheControl;", "", "noCache", "", "noStore", "maxAgeSeconds", "", "sMaxAgeSeconds", "isPrivate", "isPublic", "mustRevalidate", "maxStaleSeconds", "minFreshSeconds", "onlyIfCached", "noTransform", "immutable", "headerValue", "", "(ZZIIZZZIIZZZLjava/lang/String;)V", "()Z", "()I", "-deprecated_immutable", "-deprecated_maxAgeSeconds", "-deprecated_maxStaleSeconds", "-deprecated_minFreshSeconds", "-deprecated_mustRevalidate", "-deprecated_noCache", "-deprecated_noStore", "-deprecated_noTransform", "-deprecated_onlyIfCached", "-deprecated_sMaxAgeSeconds", "toString", "Builder", "Companion", "okhttp"}, m28431k = 1, m28430mv = {1, 6, 0}, m28428xi = 48)
/* loaded from: classes8.dex */
public final class CacheControl {
    private String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;
    public static final Companion Companion = new Companion(null);
    @JvmField
    public static final CacheControl FORCE_NETWORK = new Builder().noCache().build();
    @JvmField
    public static final CacheControl FORCE_CACHE = new Builder().onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS).build();

    @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u0003\u001a\u00020\u0000J\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\t\u001a\u00020\u0000J\u0006\u0010\n\u001a\u00020\u0000J\u0006\u0010\u000b\u001a\u00020\u0000J\u0006\u0010\f\u001a\u00020\u0000J\f\u0010\u0014\u001a\u00020\u0006*\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m28432d2 = {"Lokhttp3/CacheControl$Builder;", "", "()V", "immutable", "", "maxAgeSeconds", "", "maxStaleSeconds", "minFreshSeconds", "noCache", "noStore", "noTransform", "onlyIfCached", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lokhttp3/CacheControl;", "maxAge", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "maxStale", "minFresh", "clampToInt", "", "okhttp"}, m28431k = 1, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds = -1;
        private int maxStaleSeconds = -1;
        private int minFreshSeconds = -1;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        private final int clampToInt(long j) {
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j;
        }

        public final CacheControl build() {
            return new CacheControl(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, null, null);
        }

        public final Builder immutable() {
            this.immutable = true;
            return this;
        }

        public final Builder maxAge(int i, TimeUnit timeUnit) {
            boolean z;
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.maxAgeSeconds = clampToInt(timeUnit.toSeconds(i));
                return this;
            }
            throw new IllegalArgumentException(Intrinsics.stringPlus("maxAge < 0: ", Integer.valueOf(i)).toString());
        }

        public final Builder maxStale(int i, TimeUnit timeUnit) {
            boolean z;
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.maxStaleSeconds = clampToInt(timeUnit.toSeconds(i));
                return this;
            }
            throw new IllegalArgumentException(Intrinsics.stringPlus("maxStale < 0: ", Integer.valueOf(i)).toString());
        }

        public final Builder minFresh(int i, TimeUnit timeUnit) {
            boolean z;
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.minFreshSeconds = clampToInt(timeUnit.toSeconds(i));
                return this;
            }
            throw new IllegalArgumentException(Intrinsics.stringPlus("minFresh < 0: ", Integer.valueOf(i)).toString());
        }

        public final Builder noCache() {
            this.noCache = true;
            return this;
        }

        public final Builder noStore() {
            this.noStore = true;
            return this;
        }

        public final Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        public final Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001e\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\nH\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m28432d2 = {"Lokhttp3/CacheControl$Companion;", "", "()V", "FORCE_CACHE", "Lokhttp3/CacheControl;", "FORCE_NETWORK", "parse", "headers", "Lokhttp3/Headers;", "indexOfElement", "", "", "characters", "startIndex", "okhttp"}, m28431k = 1, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int indexOfElement(String str, String str2, int i) {
            boolean contains$default;
            int length = str.length();
            while (i < length) {
                int i2 = i + 1;
                contains$default = StringsKt__StringsKt.contains$default((CharSequence) str2, str.charAt(i), false, 2, (Object) null);
                if (contains$default) {
                    return i;
                }
                i = i2;
            }
            return str.length();
        }

        public static /* synthetic */ int indexOfElement$default(Companion companion, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return companion.indexOfElement(str, str2, i);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final CacheControl parse(Headers headers) {
            String str;
            boolean equals;
            boolean equals2;
            int i;
            CharSequence trim;
            int i2;
            String str2;
            boolean equals3;
            boolean equals4;
            boolean equals5;
            boolean equals6;
            boolean equals7;
            boolean equals8;
            boolean equals9;
            boolean equals10;
            boolean equals11;
            boolean equals12;
            boolean equals13;
            boolean equals14;
            CharSequence trim2;
            int indexOf$default;
            Headers headers2 = headers;
            Intrinsics.checkNotNullParameter(headers2, "headers");
            int size = headers.size();
            boolean z = true;
            boolean z2 = true;
            int i3 = 0;
            String str3 = null;
            boolean z3 = false;
            boolean z4 = false;
            int i4 = -1;
            int i5 = -1;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            int i6 = -1;
            int i7 = -1;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            while (i3 < size) {
                int i8 = i3 + 1;
                String name = headers2.name(i3);
                String value = headers2.value(i3);
                equals = StringsKt__StringsJVMKt.equals(name, com.amazonaws.services.p026s3.Headers.CACHE_CONTROL, z);
                if (equals) {
                    if (str3 == null) {
                        str3 = value;
                        i = 0;
                        while (i < value.length()) {
                            int indexOfElement = indexOfElement(value, "=,;", i);
                            String substring = value.substring(i, indexOfElement);
                            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            trim = StringsKt__StringsKt.trim((CharSequence) substring);
                            String obj = trim.toString();
                            if (indexOfElement != value.length() && value.charAt(indexOfElement) != ',' && value.charAt(indexOfElement) != ';') {
                                int indexOfNonWhitespace = Util.indexOfNonWhitespace(value, indexOfElement + 1);
                                if (indexOfNonWhitespace < value.length() && value.charAt(indexOfNonWhitespace) == '\"') {
                                    int i9 = indexOfNonWhitespace + 1;
                                    indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) value, '\"', i9, false, 4, (Object) null);
                                    str2 = value.substring(i9, indexOf$default);
                                    Intrinsics.checkNotNullExpressionValue(str2, "this as java.lang.String…ing(startIndex, endIndex)");
                                    i2 = indexOf$default + 1;
                                } else {
                                    i2 = indexOfElement(value, ",;", indexOfNonWhitespace);
                                    String substring2 = value.substring(indexOfNonWhitespace, i2);
                                    Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                    trim2 = StringsKt__StringsKt.trim((CharSequence) substring2);
                                    str2 = trim2.toString();
                                }
                            } else {
                                i2 = indexOfElement + 1;
                                str2 = null;
                            }
                            equals3 = StringsKt__StringsJVMKt.equals("no-cache", obj, true);
                            if (equals3) {
                                i = i2;
                                z = true;
                                z3 = true;
                            } else {
                                equals4 = StringsKt__StringsJVMKt.equals("no-store", obj, true);
                                if (equals4) {
                                    i = i2;
                                    z = true;
                                    z4 = true;
                                } else {
                                    equals5 = StringsKt__StringsJVMKt.equals("max-age", obj, true);
                                    if (equals5) {
                                        i4 = Util.toNonNegativeInt(str2, -1);
                                    } else {
                                        equals6 = StringsKt__StringsJVMKt.equals("s-maxage", obj, true);
                                        if (equals6) {
                                            i5 = Util.toNonNegativeInt(str2, -1);
                                        } else {
                                            equals7 = StringsKt__StringsJVMKt.equals("private", obj, true);
                                            if (equals7) {
                                                i = i2;
                                                z = true;
                                                z5 = true;
                                            } else {
                                                equals8 = StringsKt__StringsJVMKt.equals("public", obj, true);
                                                if (equals8) {
                                                    i = i2;
                                                    z = true;
                                                    z6 = true;
                                                } else {
                                                    equals9 = StringsKt__StringsJVMKt.equals("must-revalidate", obj, true);
                                                    if (equals9) {
                                                        i = i2;
                                                        z = true;
                                                        z7 = true;
                                                    } else {
                                                        equals10 = StringsKt__StringsJVMKt.equals("max-stale", obj, true);
                                                        if (equals10) {
                                                            i6 = Util.toNonNegativeInt(str2, Integer.MAX_VALUE);
                                                        } else {
                                                            equals11 = StringsKt__StringsJVMKt.equals("min-fresh", obj, true);
                                                            if (equals11) {
                                                                i7 = Util.toNonNegativeInt(str2, -1);
                                                            } else {
                                                                equals12 = StringsKt__StringsJVMKt.equals("only-if-cached", obj, true);
                                                                if (equals12) {
                                                                    i = i2;
                                                                    z = true;
                                                                    z8 = true;
                                                                } else {
                                                                    equals13 = StringsKt__StringsJVMKt.equals("no-transform", obj, true);
                                                                    if (equals13) {
                                                                        i = i2;
                                                                        z = true;
                                                                        z9 = true;
                                                                    } else {
                                                                        equals14 = StringsKt__StringsJVMKt.equals("immutable", obj, true);
                                                                        if (equals14) {
                                                                            i = i2;
                                                                            z = true;
                                                                            z10 = true;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i2;
                                    z = true;
                                }
                            }
                        }
                        headers2 = headers;
                        i3 = i8;
                    }
                } else {
                    equals2 = StringsKt__StringsJVMKt.equals(name, "Pragma", z);
                    if (!equals2) {
                        headers2 = headers;
                        i3 = i8;
                    }
                }
                z2 = false;
                i = 0;
                while (i < value.length()) {
                }
                headers2 = headers;
                i3 = i8;
            }
            if (!z2) {
                str = null;
            } else {
                str = str3;
            }
            return new CacheControl(z3, z4, i4, i5, z5, z6, z7, i6, i7, z8, z9, z10, str, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, str);
    }

    @JvmStatic
    public static final CacheControl parse(Headers headers) {
        return Companion.parse(headers);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "immutable", imports = {}))
    @JvmName(name = "-deprecated_immutable")
    /* renamed from: -deprecated_immutable  reason: not valid java name */
    public final boolean m118320deprecated_immutable() {
        return this.immutable;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "maxAgeSeconds", imports = {}))
    @JvmName(name = "-deprecated_maxAgeSeconds")
    /* renamed from: -deprecated_maxAgeSeconds  reason: not valid java name */
    public final int m118321deprecated_maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "maxStaleSeconds", imports = {}))
    @JvmName(name = "-deprecated_maxStaleSeconds")
    /* renamed from: -deprecated_maxStaleSeconds  reason: not valid java name */
    public final int m118322deprecated_maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "minFreshSeconds", imports = {}))
    @JvmName(name = "-deprecated_minFreshSeconds")
    /* renamed from: -deprecated_minFreshSeconds  reason: not valid java name */
    public final int m118323deprecated_minFreshSeconds() {
        return this.minFreshSeconds;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "mustRevalidate", imports = {}))
    @JvmName(name = "-deprecated_mustRevalidate")
    /* renamed from: -deprecated_mustRevalidate  reason: not valid java name */
    public final boolean m118324deprecated_mustRevalidate() {
        return this.mustRevalidate;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "noCache", imports = {}))
    @JvmName(name = "-deprecated_noCache")
    /* renamed from: -deprecated_noCache  reason: not valid java name */
    public final boolean m118325deprecated_noCache() {
        return this.noCache;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "noStore", imports = {}))
    @JvmName(name = "-deprecated_noStore")
    /* renamed from: -deprecated_noStore  reason: not valid java name */
    public final boolean m118326deprecated_noStore() {
        return this.noStore;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "noTransform", imports = {}))
    @JvmName(name = "-deprecated_noTransform")
    /* renamed from: -deprecated_noTransform  reason: not valid java name */
    public final boolean m118327deprecated_noTransform() {
        return this.noTransform;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "onlyIfCached", imports = {}))
    @JvmName(name = "-deprecated_onlyIfCached")
    /* renamed from: -deprecated_onlyIfCached  reason: not valid java name */
    public final boolean m118328deprecated_onlyIfCached() {
        return this.onlyIfCached;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "sMaxAgeSeconds", imports = {}))
    @JvmName(name = "-deprecated_sMaxAgeSeconds")
    /* renamed from: -deprecated_sMaxAgeSeconds  reason: not valid java name */
    public final int m118329deprecated_sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    @JvmName(name = "immutable")
    public final boolean immutable() {
        return this.immutable;
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    @JvmName(name = "maxAgeSeconds")
    public final int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    @JvmName(name = "maxStaleSeconds")
    public final int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    @JvmName(name = "minFreshSeconds")
    public final int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    @JvmName(name = "mustRevalidate")
    public final boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    @JvmName(name = "noCache")
    public final boolean noCache() {
        return this.noCache;
    }

    @JvmName(name = "noStore")
    public final boolean noStore() {
        return this.noStore;
    }

    @JvmName(name = "noTransform")
    public final boolean noTransform() {
        return this.noTransform;
    }

    @JvmName(name = "onlyIfCached")
    public final boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    @JvmName(name = "sMaxAgeSeconds")
    public final int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public String toString() {
        boolean z;
        String str = this.headerValue;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (noCache()) {
                sb.append("no-cache, ");
            }
            if (noStore()) {
                sb.append("no-store, ");
            }
            if (maxAgeSeconds() != -1) {
                sb.append("max-age=");
                sb.append(maxAgeSeconds());
                sb.append(", ");
            }
            if (sMaxAgeSeconds() != -1) {
                sb.append("s-maxage=");
                sb.append(sMaxAgeSeconds());
                sb.append(", ");
            }
            if (isPrivate()) {
                sb.append("private, ");
            }
            if (isPublic()) {
                sb.append("public, ");
            }
            if (mustRevalidate()) {
                sb.append("must-revalidate, ");
            }
            if (maxStaleSeconds() != -1) {
                sb.append("max-stale=");
                sb.append(maxStaleSeconds());
                sb.append(", ");
            }
            if (minFreshSeconds() != -1) {
                sb.append("min-fresh=");
                sb.append(minFreshSeconds());
                sb.append(", ");
            }
            if (onlyIfCached()) {
                sb.append("only-if-cached, ");
            }
            if (noTransform()) {
                sb.append("no-transform, ");
            }
            if (immutable()) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return "";
            }
            sb.delete(sb.length() - 2, sb.length());
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            this.headerValue = sb2;
            return sb2;
        }
        return str;
    }

    private CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.noCache = z;
        this.noStore = z2;
        this.maxAgeSeconds = i;
        this.sMaxAgeSeconds = i2;
        this.isPrivate = z3;
        this.isPublic = z4;
        this.mustRevalidate = z5;
        this.maxStaleSeconds = i3;
        this.minFreshSeconds = i4;
        this.onlyIfCached = z6;
        this.noTransform = z7;
        this.immutable = z8;
        this.headerValue = str;
    }
}
