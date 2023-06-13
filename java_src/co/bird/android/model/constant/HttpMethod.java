package co.bird.android.model.constant;

import co.bird.android.model.persistence.common.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, m28432d2 = {"Lco/bird/android/model/constant/HttpMethod;", "", "(Ljava/lang/String;I)V", "DELETE", "GET", "PATCH", "POST", "PUT", ConstantsKt.NONE, "Companion", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum HttpMethod {
    DELETE,
    GET,
    PATCH,
    POST,
    PUT,
    NONE;
    
    public static final Companion Companion = new Companion(null);

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/constant/HttpMethod$Companion;", "", "()V", "fromString", "Lco/bird/android/model/constant/HttpMethod;", "method", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nDeviceVerification.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceVerification.kt\nco/bird/android/model/constant/HttpMethod$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,26:1\n1282#2,2:27\n*S KotlinDebug\n*F\n+ 1 DeviceVerification.kt\nco/bird/android/model/constant/HttpMethod$Companion\n*L\n21#1:27,2\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final HttpMethod fromString(String method) {
            HttpMethod[] values;
            Intrinsics.checkNotNullParameter(method, "method");
            for (HttpMethod httpMethod : HttpMethod.values()) {
                String name = httpMethod.name();
                String upperCase = method.toUpperCase();
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase()");
                if (Intrinsics.areEqual(name, upperCase)) {
                    return httpMethod;
                }
            }
            return null;
        }

        private Companion() {
        }
    }
}
