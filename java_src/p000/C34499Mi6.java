package p000;

import android.content.Context;
import android.text.TextUtils;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.services.p026s3.internal.Constants;
import com.facebook.C17216a;
import com.facebook.share.internal.C17296a;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u001e\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006¨\u0006\u0012"}, m28432d2 = {"LMi6;", "", "Ljava/io/File;", C17296a.f69688o, "file", "", "", "LUE2;", "c", "texts", "", "maxLen", "", DateTokenConverter.CONVERTER_KEY, "str", "b", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: Mi6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34499Mi6 {

    /* renamed from: a */
    public static final C34499Mi6 f23423a = new C34499Mi6();

    private C34499Mi6() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final File m95006a() {
        if (TD0.m84203d(C34499Mi6.class)) {
            return null;
        }
        try {
            Context m52741e = C17216a.m52741e();
            Intrinsics.checkNotNullExpressionValue(m52741e, "FacebookSdk.getApplicationContext()");
            File file = new File(m52741e.getFilesDir(), "facebook_ml/");
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return null;
                }
            }
            return file;
        } catch (Throwable th) {
            TD0.m84205b(th, C34499Mi6.class);
            return null;
        }
    }

    @JvmStatic
    /* renamed from: c */
    public static final Map<String, UE2> m95004c(File file) {
        int i;
        if (TD0.m84203d(C34499Mi6.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(file, "file");
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                int available = fileInputStream.available();
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                byte[] bArr = new byte[available];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                if (available < 4) {
                    return null;
                }
                int i2 = 0;
                ByteBuffer bb = ByteBuffer.wrap(bArr, 0, 4);
                bb.order(ByteOrder.LITTLE_ENDIAN);
                Intrinsics.checkNotNullExpressionValue(bb, "bb");
                int i3 = bb.getInt();
                int i4 = i3 + 4;
                if (available < i4) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(new String(bArr, 4, i3, Charsets.UTF_8));
                JSONArray names = jSONObject.names();
                int length = names.length();
                String[] strArr = new String[length];
                for (int i5 = 0; i5 < length; i5++) {
                    strArr[i5] = names.getString(i5);
                }
                ArraysKt___ArraysJvmKt.sort((Object[]) strArr);
                HashMap hashMap = new HashMap();
                int i6 = 0;
                while (i6 < length) {
                    String str = strArr[i6];
                    if (str == null) {
                        i = i2;
                    } else {
                        JSONArray jSONArray = jSONObject.getJSONArray(str);
                        int length2 = jSONArray.length();
                        int[] iArr = new int[length2];
                        int i7 = 1;
                        while (i2 < length2) {
                            int i8 = jSONArray.getInt(i2);
                            iArr[i2] = i8;
                            i7 *= i8;
                            i2++;
                        }
                        int i9 = i7 * 4;
                        int i10 = i4 + i9;
                        if (i10 > available) {
                            return null;
                        }
                        ByteBuffer wrap = ByteBuffer.wrap(bArr, i4, i9);
                        wrap.order(ByteOrder.LITTLE_ENDIAN);
                        UE2 ue2 = new UE2(iArr);
                        i = 0;
                        wrap.asFloatBuffer().get(ue2.m81798a(), 0, i7);
                        hashMap.put(str, ue2);
                        i4 = i10;
                    }
                    i6++;
                    i2 = i;
                }
                return hashMap;
            } catch (Exception unused) {
                return null;
            }
        } catch (Throwable th) {
            TD0.m84205b(th, C34499Mi6.class);
            return null;
        }
    }

    /* renamed from: b */
    public final String m95005b(String str) {
        int i;
        boolean z;
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(str, "str");
            int length = str.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                if (!z2) {
                    i = i2;
                } else {
                    i = length;
                }
                if (Intrinsics.compare((int) str.charAt(i), 32) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z2) {
                    if (!z) {
                        z2 = true;
                    } else {
                        i2++;
                    }
                } else if (!z) {
                    break;
                } else {
                    length--;
                }
            }
            Object[] array = new Regex("\\s+").split(str.subSequence(i2, length + 1).toString(), 0).toArray(new String[0]);
            if (array != null) {
                String join = TextUtils.join(" ", (String[]) array);
                Intrinsics.checkNotNullExpressionValue(join, "TextUtils.join(\" \", strArray)");
                return join;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }

    /* renamed from: d */
    public final int[] m95003d(String texts, int i) {
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(texts, "texts");
            int[] iArr = new int[i];
            String m95005b = m95005b(texts);
            Charset forName = Charset.forName(Constants.DEFAULT_ENCODING);
            Intrinsics.checkNotNullExpressionValue(forName, "Charset.forName(\"UTF-8\")");
            if (m95005b != null) {
                byte[] bytes = m95005b.getBytes(forName);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                for (int i2 = 0; i2 < i; i2++) {
                    if (i2 < bytes.length) {
                        iArr[i2] = bytes[i2] & UByte.MAX_VALUE;
                    } else {
                        iArr[i2] = 0;
                    }
                }
                return iArr;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }
}
