package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0007\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m28432d2 = {"LLq2;", "", "", "b", "F", "()F", "precision", "<init>", "(Ljava/lang/String;IF)V", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "arsceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Lq2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC34333Lq2 {
    ENVIRONMENTAL_HDR(0.5f),
    ENVIRONMENTAL_HDR_FAKE_REFLECTIONS(0.0f, 1, null),
    ENVIRONMENTAL_HDR_NO_REFLECTIONS(0.0f, 1, null),
    AMBIENT_INTENSITY(0.0f, 1, null),
    DISABLED(0.0f, 1, null);
    

    /* renamed from: b */
    public final float f22108b;

    EnumC34333Lq2(float f) {
        this.f22108b = f;
    }

    /* renamed from: b */
    public final float m96303b() {
        return this.f22108b;
    }

    /* synthetic */ EnumC34333Lq2(float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f);
    }
}
