package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.full.KClassifiers;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\r¨\u0006\u0011"}, m28432d2 = {"LJj2;", "", "T", "LSa6;", "Lkotlin/reflect/KClass;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/reflect/KClass;", "getKclass", "()Lkotlin/reflect/KClass;", "kclass", "Lkotlin/reflect/KType;", "e", "Lkotlin/reflect/KType;", "()Lkotlin/reflect/KType;", "ktype", "<init>", "(Lkotlin/reflect/KClass;)V", "config_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Jj2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C33802Jj2<T> extends AbstractC35831Sa6<T> {

    /* renamed from: d */
    public final KClass<T> f18085d;

    /* renamed from: e */
    public final KType f18086e;

    public C33802Jj2(KClass<T> kclass) {
        Intrinsics.checkNotNullParameter(kclass, "kclass");
        this.f18085d = kclass;
        this.f18086e = KClassifiers.createType$default(kclass, null, false, null, 7, null);
    }

    @Override // p000.AbstractC35831Sa6
    /* renamed from: d */
    public KType mo1704d() {
        return this.f18086e;
    }
}
