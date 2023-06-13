package co.bird.android.lib.webview.bridge;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u000e\u0006\u0010B\t\b\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0007\u0082\u0001\u0003\u0013\u0014\u0015¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/lib/webview/bridge/b;", "T", "", "", "commandName", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "", "params", "Ljava/util/Map;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/Map;", "callbackId", C17296a.f69688o, "error", "c", "<init>", "()V", "Lco/bird/android/lib/webview/bridge/b$a;", "Lco/bird/android/lib/webview/bridge/b$b;", "Lco/bird/android/lib/webview/bridge/b$c;", "bridge_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.lib.webview.bridge.b */
/* loaded from: classes3.dex */
public abstract class AbstractC16030b<T> {
    @JsonIgnore
    private final transient String callbackId;
    @JsonIgnore
    private final transient String commandName;
    @JsonIgnore
    private final transient String error;
    @JsonIgnore
    private final transient Map<String, T> params;

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0003HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R(\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00148\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/lib/webview/bridge/b$a;", "T", "Lco/bird/android/lib/webview/bridge/b;", "", "callbackId", "error", "e", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", C17296a.f69688o, "()Ljava/lang/String;", "c", "commandName", "b", "", "params", "Ljava/util/Map;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/Map;", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "bridge_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.lib.webview.bridge.b$a */
    /* loaded from: classes3.dex */
    public static final class C16031a<T> extends AbstractC16030b<T> {
        @JsonProperty("callback_id")
        @InterfaceC41208ft5("callback_id")
        private final String callbackId;
        @JsonIgnore
        private final transient String commandName;
        @JsonProperty("error")
        @InterfaceC41208ft5("error")
        private final String error;
        @JsonIgnore
        private final transient Map<String, T> params;

        public C16031a() {
            this(null, null, 3, null);
        }

        public static /* synthetic */ C16031a copy$default(C16031a c16031a, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c16031a.callbackId;
            }
            if ((i & 2) != 0) {
                str2 = c16031a.error;
            }
            return c16031a.m56059e(str, str2);
        }

        @Override // co.bird.android.lib.webview.bridge.AbstractC16030b
        /* renamed from: a */
        public String mo56057a() {
            return this.callbackId;
        }

        @Override // co.bird.android.lib.webview.bridge.AbstractC16030b
        /* renamed from: b */
        public String mo56056b() {
            return this.commandName;
        }

        @Override // co.bird.android.lib.webview.bridge.AbstractC16030b
        /* renamed from: c */
        public String mo56055c() {
            return this.error;
        }

        @Override // co.bird.android.lib.webview.bridge.AbstractC16030b
        /* renamed from: d */
        public Map<String, T> mo56054d() {
            return this.params;
        }

        /* renamed from: e */
        public final C16031a<T> m56059e(String str, String error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new C16031a<>(str, error);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C16031a) {
                C16031a c16031a = (C16031a) obj;
                return Intrinsics.areEqual(this.callbackId, c16031a.callbackId) && Intrinsics.areEqual(this.error, c16031a.error);
            }
            return false;
        }

        public int hashCode() {
            String str = this.callbackId;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.error.hashCode();
        }

        public String toString() {
            String str = this.callbackId;
            String str2 = this.error;
            return "FailureCallback(callbackId=" + str + ", error=" + str2 + ")";
        }

        public /* synthetic */ C16031a(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16031a(String str, String error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.callbackId = str;
            this.error = error;
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B3\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/lib/webview/bridge/b$b;", "T", "Lco/bird/android/lib/webview/bridge/b;", "", "commandName", "", "params", "callbackId", "e", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/Map;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/Map;", C17296a.f69688o, "error", "c", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "bridge_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.lib.webview.bridge.b$b */
    /* loaded from: classes3.dex */
    public static final class C16032b<T> extends AbstractC16030b<T> {
        @JsonProperty("callback_id")
        @InterfaceC41208ft5("callback_id")
        private final String callbackId;
        @JsonProperty("command_name")
        @InterfaceC41208ft5("command_name")
        private final String commandName;
        @JsonIgnore
        private final transient String error;
        @JsonProperty("params")
        @InterfaceC41208ft5("params")
        private final Map<String, T> params;

        public C16032b() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C16032b copy$default(C16032b c16032b, String str, Map map, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c16032b.commandName;
            }
            if ((i & 2) != 0) {
                map = c16032b.params;
            }
            if ((i & 4) != 0) {
                str2 = c16032b.callbackId;
            }
            return c16032b.m56058e(str, map, str2);
        }

        @Override // co.bird.android.lib.webview.bridge.AbstractC16030b
        /* renamed from: a */
        public String mo56057a() {
            return this.callbackId;
        }

        @Override // co.bird.android.lib.webview.bridge.AbstractC16030b
        /* renamed from: b */
        public String mo56056b() {
            return this.commandName;
        }

        @Override // co.bird.android.lib.webview.bridge.AbstractC16030b
        /* renamed from: c */
        public String mo56055c() {
            return this.error;
        }

        @Override // co.bird.android.lib.webview.bridge.AbstractC16030b
        /* renamed from: d */
        public Map<String, T> mo56054d() {
            return this.params;
        }

        /* renamed from: e */
        public final C16032b<T> m56058e(String commandName, Map<String, ? extends T> map, String callbackId) {
            Intrinsics.checkNotNullParameter(commandName, "commandName");
            Intrinsics.checkNotNullParameter(callbackId, "callbackId");
            return new C16032b<>(commandName, map, callbackId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C16032b) {
                C16032b c16032b = (C16032b) obj;
                return Intrinsics.areEqual(this.commandName, c16032b.commandName) && Intrinsics.areEqual(this.params, c16032b.params) && Intrinsics.areEqual(this.callbackId, c16032b.callbackId);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.commandName.hashCode() * 31;
            Map<String, T> map = this.params;
            return ((hashCode + (map == null ? 0 : map.hashCode())) * 31) + this.callbackId.hashCode();
        }

        public String toString() {
            String str = this.commandName;
            Map<String, T> map = this.params;
            String str2 = this.callbackId;
            return "InvokeCommand(commandName=" + str + ", params=" + map + ", callbackId=" + str2 + ")";
        }

        public /* synthetic */ C16032b(String str, Map map, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : map, (i & 4) != 0 ? "" : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16032b(String commandName, Map<String, ? extends T> map, String callbackId) {
            super(null);
            Intrinsics.checkNotNullParameter(commandName, "commandName");
            Intrinsics.checkNotNullParameter(callbackId, "callbackId");
            this.commandName = commandName;
            this.params = map;
            this.callbackId = callbackId;
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B+\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005HÆ\u0001J\t\u0010\b\u001a\u00020\u0003HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/lib/webview/bridge/b$c;", "T", "Lco/bird/android/lib/webview/bridge/b;", "", "callbackId", "", "params", "e", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", C17296a.f69688o, "()Ljava/lang/String;", "Ljava/util/Map;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/Map;", "commandName", "b", "error", "c", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "bridge_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.lib.webview.bridge.b$c */
    /* loaded from: classes3.dex */
    public static final class C16033c<T> extends AbstractC16030b<T> {
        @JsonProperty("callback_id")
        @InterfaceC41208ft5("callback_id")
        private final String callbackId;
        @JsonIgnore
        private final transient String commandName;
        @JsonIgnore
        private final transient String error;
        @JsonProperty("params")
        @InterfaceC41208ft5("params")
        private final Map<String, T> params;

        public C16033c() {
            this(null, null, 3, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C16033c copy$default(C16033c c16033c, String str, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c16033c.callbackId;
            }
            if ((i & 2) != 0) {
                map = c16033c.params;
            }
            return c16033c.m56053e(str, map);
        }

        @Override // co.bird.android.lib.webview.bridge.AbstractC16030b
        /* renamed from: a */
        public String mo56057a() {
            return this.callbackId;
        }

        @Override // co.bird.android.lib.webview.bridge.AbstractC16030b
        /* renamed from: b */
        public String mo56056b() {
            return this.commandName;
        }

        @Override // co.bird.android.lib.webview.bridge.AbstractC16030b
        /* renamed from: c */
        public String mo56055c() {
            return this.error;
        }

        @Override // co.bird.android.lib.webview.bridge.AbstractC16030b
        /* renamed from: d */
        public Map<String, T> mo56054d() {
            return this.params;
        }

        /* renamed from: e */
        public final C16033c<T> m56053e(String str, Map<String, ? extends T> map) {
            return new C16033c<>(str, map);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C16033c) {
                C16033c c16033c = (C16033c) obj;
                return Intrinsics.areEqual(this.callbackId, c16033c.callbackId) && Intrinsics.areEqual(this.params, c16033c.params);
            }
            return false;
        }

        public int hashCode() {
            String str = this.callbackId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Map<String, T> map = this.params;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            String str = this.callbackId;
            Map<String, T> map = this.params;
            return "SuccessCallback(callbackId=" + str + ", params=" + map + ")";
        }

        public /* synthetic */ C16033c(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C16033c(String str, Map<String, ? extends T> map) {
            super(null);
            this.callbackId = str;
            this.params = map;
        }
    }

    public /* synthetic */ AbstractC16030b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public String mo56057a() {
        return this.callbackId;
    }

    /* renamed from: b */
    public String mo56056b() {
        return this.commandName;
    }

    /* renamed from: c */
    public String mo56055c() {
        return this.error;
    }

    /* renamed from: d */
    public Map<String, T> mo56054d() {
        return this.params;
    }

    private AbstractC16030b() {
    }
}
