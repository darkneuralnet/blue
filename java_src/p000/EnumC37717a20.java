package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m28432d2 = {"La20;", "", "", "b", "Ljava/lang/String;", "getFormat", "()Ljava/lang/String;", "format", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: a20  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC37717a20 {
    SHORT("yyyy-MM-dd"),
    LONG("yyyy-MM-dd kk:mm:ss"),
    ANDROID_LOGCAT("MM-dd kk:mm:ss.SSS"),
    CLOCK_12_HOUR("h:mm a");
    

    /* renamed from: b */
    public final String f49735b;

    EnumC37717a20(String str) {
        this.f49735b = str;
    }

    public final String getFormat() {
        return this.f49735b;
    }
}
