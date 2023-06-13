package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\nj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m28432d2 = {"Lf56;", "", "", "b", "I", "c", "()I", "duration", "", "J", "()J", "approxDurationMillis", "<init>", "(Ljava/lang/String;IIJ)V", DateTokenConverter.CONVERTER_KEY, "e", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: f56  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC40735f56 {
    SHORT(0, 2000),
    LONG(1, 3500);
    

    /* renamed from: b */
    public final int f79427b;

    /* renamed from: c */
    public final long f79428c;

    EnumC40735f56(int i, long j) {
        this.f79427b = i;
        this.f79428c = j;
    }

    /* renamed from: b */
    public final long m42100b() {
        return this.f79428c;
    }

    /* renamed from: c */
    public final int m42099c() {
        return this.f79427b;
    }
}
