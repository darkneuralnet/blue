package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002j\u0002\b\u0004j\u0002\b\u0003j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m28432d2 = {"LkE5;", "", "", "c", "b", "<init>", "(Ljava/lang/String;I)V", DateTokenConverter.CONVERTER_KEY, "e", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: kE5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC43785kE5 {
    LOCKED,
    REQUESTED_UNLOCK,
    UNLOCKED,
    REQUESTED_LOCK;

    /* renamed from: b */
    public final boolean m29159b() {
        return this == LOCKED || this == REQUESTED_LOCK;
    }

    /* renamed from: c */
    public final boolean m29158c() {
        return this == LOCKED || this == UNLOCKED;
    }
}
