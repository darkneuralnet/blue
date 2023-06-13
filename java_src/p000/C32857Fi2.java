package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a \u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0000\u001a\u0014\u0010\u0011\u001a\u00020\u0010*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0000\u001a\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000\u001a \u0010\u0016\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0000\u001a \u0010\u0017\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0000\u001a \u0010\u0018\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002\u001a\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a\u0016\u0010\u001a\u001a\u00020\u0006*\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0002¨\u0006\u001b"}, m28432d2 = {"", "offset", "", "message", "Lkotlinx/serialization/json/internal/JsonDecodingException;", "e", "", "input", "f", "", "value", "output", "Lkotlinx/serialization/json/internal/JsonEncodingException;", "b", "LC0;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", "j", "LMs5;", "keyDescriptor", DateTokenConverter.CONVERTER_KEY, "key", "c", C17296a.f69688o, "k", "g", "h", "kotlinx-serialization-json"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Fi2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C32857Fi2 {
    /* renamed from: a */
    public static final JsonDecodingException m106735a(Number value, String key, String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(output, "output");
        return m106731e(-1, m106725k(value, key, output));
    }

    /* renamed from: b */
    public static final JsonEncodingException m106734b(Number value, String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(output, "output");
        return new JsonEncodingException("Unexpected special floating-point value " + value + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m106727i(output, 0, 1, null)));
    }

    /* renamed from: c */
    public static final JsonEncodingException m106733c(Number value, String key, String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(output, "output");
        return new JsonEncodingException(m106725k(value, key, output));
    }

    /* renamed from: d */
    public static final JsonEncodingException m106732d(InterfaceC34588Ms5 keyDescriptor) {
        Intrinsics.checkNotNullParameter(keyDescriptor, "keyDescriptor");
        return new JsonEncodingException("Value of type '" + keyDescriptor.mo10456h() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    /* renamed from: e */
    public static final JsonDecodingException m106731e(int i, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (i >= 0) {
            message = "Unexpected JSON token at offset " + i + ": " + message;
        }
        return new JsonDecodingException(message);
    }

    /* renamed from: f */
    public static final JsonDecodingException m106730f(int i, String message, CharSequence input) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(input, "input");
        return m106731e(i, message + "\nJSON input: " + ((Object) m106728h(input, i)));
    }

    /* renamed from: g */
    public static final JsonDecodingException m106729g(String key, String input) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(input, "input");
        return m106731e(-1, "Encountered an unknown key '" + key + "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: " + ((Object) m106727i(input, 0, 1, null)));
    }

    /* renamed from: h */
    public static final CharSequence m106728h(CharSequence charSequence, int i) {
        String str;
        int coerceAtLeast;
        int coerceAtMost;
        int length;
        if (charSequence.length() < 200) {
            return charSequence;
        }
        String str2 = ".....";
        if (i == -1) {
            if (charSequence.length() - 60 <= 0) {
                return charSequence;
            }
            return "....." + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i2 = i - 30;
        int i3 = i + 30;
        if (i2 > 0) {
            str = ".....";
        } else {
            str = "";
        }
        if (i3 >= charSequence.length()) {
            str2 = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i2, 0);
        coerceAtMost = RangesKt___RangesKt.coerceAtMost(i3, charSequence.length());
        sb.append(charSequence.subSequence(coerceAtLeast, coerceAtMost).toString());
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: i */
    public static /* synthetic */ CharSequence m106727i(CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        return m106728h(charSequence, i);
    }

    /* renamed from: j */
    public static final Void m106726j(AbstractC0809C0 abstractC0809C0, Number result) {
        Intrinsics.checkNotNullParameter(abstractC0809C0, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        AbstractC0809C0.m113114y(abstractC0809C0, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: k */
    public static final String m106725k(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m106727i(str2, 0, 1, null));
    }
}
