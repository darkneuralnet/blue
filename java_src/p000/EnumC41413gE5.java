package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0002j\u0002\b\u0007j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\bj\u0002\b\u0006j\u0002\b\u000b¨\u0006\f"}, m28432d2 = {"LgE5;", "", "", "c", DateTokenConverter.CONVERTER_KEY, "e", "g", "b", "f", "<init>", "(Ljava/lang/String;I)V", "h", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: gE5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC41413gE5 {
    UNINITIALIZED,
    DRAGGING_FROM_UNCHECKED,
    DRAGGING_FROM_CHECKED,
    UNCHECKED,
    REQUESTED_CHECK,
    CHECKED,
    REQUEST_UNCHECKED;

    /* renamed from: b */
    public final boolean m39808b() {
        return this == CHECKED || this == REQUESTED_CHECK;
    }

    /* renamed from: c */
    public final boolean m39807c() {
        return this == DRAGGING_FROM_CHECKED || this == DRAGGING_FROM_UNCHECKED;
    }

    /* renamed from: d */
    public final boolean m39806d() {
        return this == UNCHECKED || this == CHECKED;
    }

    /* renamed from: e */
    public final boolean m39805e() {
        return this == UNCHECKED || this == REQUEST_UNCHECKED;
    }

    /* renamed from: f */
    public final boolean m39804f() {
        return m39808b() || this == DRAGGING_FROM_CHECKED;
    }

    /* renamed from: g */
    public final boolean m39803g() {
        return m39805e() || this == DRAGGING_FROM_UNCHECKED;
    }
}
