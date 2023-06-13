package com.stripe.android.core.utils;

import android.util.Base64;
import com.stripe.android.core.networking.JsonUtilsKt;
import com.stripe.android.core.networking.QueryStringFactory;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u001a\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u001a+\u0010\t\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\u000b\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\n\u001a+\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\b\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0007\"\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m28432d2 = {"", "s", "b64Encode", "", "b", "T", "Let5;", "serializer", "value", "encodeToXWWWFormUrl", "(Let5;Ljava/lang/Object;)Ljava/lang/String;", "encodeToJson", "LE01;", "deserializer", "decodeFromJson", "(LE01;Ljava/lang/String;)Ljava/lang/Object;", "urlEncode", "Lbi2;", "json", "Lbi2;", "stripe-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class EncodeKt {
    private static final AbstractC38706bi2 json = C33793Ji2.m99925b(null, EncodeKt$json$1.INSTANCE, 1, null);

    public static final String b64Encode(String s) {
        Intrinsics.checkNotNullParameter(s, "s");
        Charset defaultCharset = Charset.defaultCharset();
        Intrinsics.checkNotNullExpressionValue(defaultCharset, "defaultCharset()");
        byte[] bytes = s.getBytes(defaultCharset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        String encodeToString = Base64.encodeToString(bytes, 2);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(s.toByteA…arset()), Base64.NO_WRAP)");
        return encodeToString;
    }

    public static final <T> T decodeFromJson(E01<? extends T> deserializer, String value) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(value, "value");
        return (T) json.m64105b(deserializer, value);
    }

    public static final <T> String encodeToJson(InterfaceC40615et5<? super T> serializer, T t) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        return json.m64103d(serializer, t);
    }

    public static final <T> String encodeToXWWWFormUrl(InterfaceC40615et5<? super T> serializer, T t) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        return QueryStringFactory.INSTANCE.createFromParamsWithEmptyValues(JsonUtilsKt.toMap(json.m64104c(serializer, t)));
    }

    public static final String urlEncode(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        String encode = URLEncoder.encode(value, Charsets.UTF_8.name());
        Intrinsics.checkNotNullExpressionValue(encode, "encode(value, Charsets.UTF_8.name())");
        return encode;
    }

    public static final String b64Encode(byte[] b) {
        Intrinsics.checkNotNullParameter(b, "b");
        String encodeToString = Base64.encodeToString(b, 2);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(b, Base64.NO_WRAP)");
        return encodeToString;
    }
}
