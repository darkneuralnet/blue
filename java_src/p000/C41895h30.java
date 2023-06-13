package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.github.kittinunf.fuel.core.FuelError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, m28432d2 = {"Lh30;", "Lcom/github/kittinunf/fuel/core/FuelError;", DateTokenConverter.CONVERTER_KEY, "Lcom/github/kittinunf/fuel/core/FuelError;", "e", "()Lcom/github/kittinunf/fuel/core/FuelError;", "inner", "<init>", "(Lcom/github/kittinunf/fuel/core/FuelError;)V", "fuel"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: h30  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41895h30 extends FuelError {

    /* renamed from: d */
    public final FuelError f84661d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41895h30(FuelError inner) {
        super(inner, inner.m52052d());
        Intrinsics.checkNotNullParameter(inner, "inner");
        this.f84661d = inner;
    }

    /* renamed from: e */
    public final FuelError m36879e() {
        return this.f84661d;
    }
}
