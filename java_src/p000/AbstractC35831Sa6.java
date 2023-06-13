package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.configs.Config;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003R\"\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR.\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u00000\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R4\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u000e\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, m28432d2 = {"LSa6;", "", "T", "LRa6;", C17296a.f69688o, "", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "g", "(Ljava/lang/String;)V", "key", "Lkotlin/Function1;", "Lco/bird/android/model/wire/configs/Config;", "b", "Lkotlin/jvm/functions/Function1;", "c", "()Lkotlin/jvm/functions/Function1;", "f", "(Lkotlin/jvm/functions/Function1;)V", "configValue", "Lkotlin/Function2;", "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "e", "(Lkotlin/jvm/functions/Function2;)V", "applyTweak", "Lkotlin/reflect/KType;", DateTokenConverter.CONVERTER_KEY, "()Lkotlin/reflect/KType;", "ktype", "<init>", "()V", "config_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Sa6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC35831Sa6<T> {

    /* renamed from: a */
    public String f33936a = "";

    /* renamed from: b */
    public Function1<? super Config, ? extends T> f33937b;

    /* renamed from: c */
    public Function2<? super Config, ? super T, Config> f33938c;

    /* renamed from: a */
    public final C35597Ra6<T> m85217a() {
        return new C35597Ra6<>(this.f33936a, mo1704d(), m85215c(), m85216b(), null, 16, null);
    }

    /* renamed from: b */
    public final Function2<Config, T, Config> m85216b() {
        Function2 function2 = (Function2<? super Config, ? super T, Config>) this.f33938c;
        if (function2 != null) {
            return function2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("applyTweak");
        return null;
    }

    /* renamed from: c */
    public final Function1<Config, T> m85215c() {
        Function1 function1 = (Function1<? super Config, ? extends T>) this.f33937b;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("configValue");
        return null;
    }

    /* renamed from: d */
    public abstract KType mo1704d();

    /* renamed from: e */
    public final void m85214e(Function2<? super Config, ? super T, Config> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.f33938c = function2;
    }

    /* renamed from: f */
    public final void m85213f(Function1<? super Config, ? extends T> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f33937b = function1;
    }

    /* renamed from: g */
    public final void m85212g(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f33936a = str;
    }
}
