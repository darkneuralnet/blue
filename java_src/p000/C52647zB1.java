package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\u000f"}, m28432d2 = {"LzB1;", "", "T", "LSa6;", "Lkotlin/reflect/KType;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/reflect/KType;", "h", "()Lkotlin/reflect/KType;", "i", "(Lkotlin/reflect/KType;)V", "type", "ktype", "<init>", "()V", "config_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: zB1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C52647zB1<T> extends AbstractC35831Sa6<T> {

    /* renamed from: d */
    public KType f120905d;

    @Override // p000.AbstractC35831Sa6
    /* renamed from: d */
    public KType mo1704d() {
        return m1703h();
    }

    /* renamed from: h */
    public final KType m1703h() {
        KType kType = this.f120905d;
        if (kType != null) {
            return kType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("type");
        return null;
    }

    /* renamed from: i */
    public final void m1702i(KType kType) {
        Intrinsics.checkNotNullParameter(kType, "<set-?>");
        this.f120905d = kType;
    }
}
