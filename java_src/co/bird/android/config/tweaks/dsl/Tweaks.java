package co.bird.android.config.tweaks.dsl;

import co.bird.android.model.wire.configs.Config;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.sequences.Sequence;
@Metadata(m28433d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b/\u00100JE\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u001d\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007H\u0002J\u0010\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u000bJ5\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\b\b\u0000\u0010\u0002*\u00020\u00012\u001d\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007JZ\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u000e\b\u0001\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0012\u001a\u00028\u00012\u001d\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\u001d\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007J+\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\t2\u001d\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007J+\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\t2\u001d\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007J+\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\t2\u001d\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007J+\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\t2\u001d\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007J+\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\t2\u001d\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007J\u000e\u0010#\u001a\u00020!2\u0006\u0010\"\u001a\u00020!J\u0006\u0010$\u001a\u00020!J\u0018\u0010'\u001a\u00020\u00062\u0010\u0010&\u001a\f\u0012\u0004\u0012\u00020\u0017\u0012\u0002\b\u00030%J\u0006\u0010(\u001a\u00020\u0006J\u0012\u0010*\u001a\u00020\u00062\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\tJ\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010+\u001a\u00020\u0017R\u001e\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010.¨\u00061"}, m28432d2 = {"Lco/bird/android/config/tweaks/dsl/Tweaks;", "", "T", "LSa6;", "builder", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "init", "LRa6;", "typedTweak", "", "tweaks", "LzB1;", "tweak", "", "Lkotlin/reflect/KClass;", "K", "kclass", "enumTweak", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)LRa6;", "", "booleanTweak", "", "stringTweak", "", "longTweak", "", "floatTweak", "", "intTweak", "", "doubleTweak", "Lco/bird/android/model/wire/configs/Config;", "config", "apply", "asConfig", "", "storedValues", "restoreTweaks", "clearTweaks", "updatedTweak", "updateTweak", "key", "getTweak", "", "Ljava/util/List;", "<init>", "()V", "config_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTweaks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tweaks.kt\nco/bird/android/config/tweaks/dsl/Tweaks\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,91:1\n1#2:92\n1295#3,2:93\n1855#4,2:95\n1855#4,2:97\n350#4,7:99\n223#4,2:106\n*S KotlinDebug\n*F\n+ 1 Tweaks.kt\nco/bird/android/config/tweaks/dsl/Tweaks\n*L\n53#1:93,2\n68#1:95,2\n72#1:97,2\n76#1:99,7\n82#1:106,2\n*E\n"})
/* loaded from: classes2.dex */
public final class Tweaks {
    private final List<C35597Ra6<?>> tweaks = new ArrayList();

    private final <T> C35597Ra6<T> typedTweak(AbstractC35831Sa6<T> abstractC35831Sa6, Function1<? super AbstractC35831Sa6<T>, Unit> function1) {
        function1.invoke(abstractC35831Sa6);
        C35597Ra6<T> m85217a = abstractC35831Sa6.m85217a();
        this.tweaks.add(m85217a);
        return m85217a;
    }

    public final Config apply(Config config) {
        Sequence<C35597Ra6> asSequence;
        Intrinsics.checkNotNullParameter(config, "config");
        Config copy$default = Config.copy$default(config, null, null, null, null, null, null, null, false, 0.0d, false, false, null, null, null, null, null, null, null, null, false, 0, 0.0d, 0.0d, null, null, 0.0d, 0.0d, null, null, null, null, null, false, null, false, 0.0d, 0.0d, false, false, false, false, 0, false, null, null, false, false, false, false, false, null, null, null, null, null, false, false, false, false, false, false, null, null, false, false, false, false, false, null, false, null, false, false, false, false, false, null, false, false, null, false, null, null, null, null, false, false, false, false, null, 0, null, false, null, false, false, false, null, false, false, false, false, null, null, null, false, null, null, null, null, 0, false, false, 0.0f, false, false, 0L, null, false, null, null, null, null, false, null, null, false, null, null, null, null, false, null, null, null, null, null, null, null, null, 0L, 0.0d, null, null, null, null, null, null, 0.0f, false, false, null, null, null, null, null, null, false, null, -1, -1, -1, -1, Integer.MAX_VALUE, null);
        asSequence = CollectionsKt___CollectionsKt.asSequence(this.tweaks);
        for (C35597Ra6 c35597Ra6 : asSequence) {
            copy$default = c35597Ra6.m86603a(copy$default);
        }
        return copy$default;
    }

    public final Config asConfig() {
        return apply(new Config(null, null, null, null, null, null, null, false, 0.0d, false, false, null, null, null, null, null, null, null, null, false, 0, 0.0d, 0.0d, null, null, 0.0d, 0.0d, null, null, null, null, null, false, null, false, 0.0d, 0.0d, false, false, false, false, 0, false, null, null, false, false, false, false, false, null, null, null, null, null, false, false, false, false, false, false, null, null, false, false, false, false, false, null, false, null, false, false, false, false, false, null, false, false, null, false, null, null, null, null, false, false, false, false, null, 0, null, false, null, false, false, false, null, false, false, false, false, null, null, null, false, null, null, null, null, 0, false, false, 0.0f, false, false, 0L, null, false, null, null, null, null, false, null, null, false, null, null, null, null, false, null, null, null, null, null, null, null, null, 0L, 0.0d, null, null, null, null, null, null, 0.0f, false, false, null, null, null, null, null, null, false, null, -1, -1, -1, -1, Integer.MAX_VALUE, null));
    }

    public final C35597Ra6<Boolean> booleanTweak(Function1<? super AbstractC35831Sa6<Boolean>, Unit> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        return typedTweak(new C33802Jj2(Reflection.getOrCreateKotlinClass(Boolean.TYPE)), init);
    }

    public final void clearTweaks() {
        Iterator<T> it = this.tweaks.iterator();
        while (it.hasNext()) {
            ((C35597Ra6) it.next()).m86596h(null);
        }
    }

    public final C35597Ra6<Double> doubleTweak(Function1<? super AbstractC35831Sa6<Double>, Unit> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        return typedTweak(new C33802Jj2(Reflection.getOrCreateKotlinClass(Double.TYPE)), init);
    }

    public final <T extends Enum<T>, K extends KClass<T>> C35597Ra6<T> enumTweak(K kclass, Function1<? super AbstractC35831Sa6<T>, Unit> init) {
        Intrinsics.checkNotNullParameter(kclass, "kclass");
        Intrinsics.checkNotNullParameter(init, "init");
        return typedTweak(new C33802Jj2(kclass), init);
    }

    public final C35597Ra6<Float> floatTweak(Function1<? super AbstractC35831Sa6<Float>, Unit> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        return typedTweak(new C33802Jj2(Reflection.getOrCreateKotlinClass(Float.TYPE)), init);
    }

    public final <T> C35597Ra6<T> getTweak(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        for (T t : this.tweaks) {
            C35597Ra6<T> c35597Ra6 = (C35597Ra6) t;
            if (Intrinsics.areEqual(c35597Ra6.m86601c(), key)) {
                Intrinsics.checkNotNull(t, "null cannot be cast to non-null type co.bird.android.config.tweaks.dsl.Tweak<T of co.bird.android.config.tweaks.dsl.Tweaks.getTweak>");
                return c35597Ra6;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final C35597Ra6<Integer> intTweak(Function1<? super AbstractC35831Sa6<Integer>, Unit> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        return typedTweak(new C33802Jj2(Reflection.getOrCreateKotlinClass(Integer.TYPE)), init);
    }

    public final C35597Ra6<Long> longTweak(Function1<? super AbstractC35831Sa6<Long>, Unit> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        return typedTweak(new C33802Jj2(Reflection.getOrCreateKotlinClass(Long.TYPE)), init);
    }

    public final void restoreTweaks(Map<String, ?> storedValues) {
        Intrinsics.checkNotNullParameter(storedValues, "storedValues");
        clearTweaks();
        Iterator<T> it = this.tweaks.iterator();
        while (it.hasNext()) {
            C35597Ra6 c35597Ra6 = (C35597Ra6) it.next();
            c35597Ra6.m86598f(storedValues.get(c35597Ra6.m86601c()));
        }
    }

    public final C35597Ra6<String> stringTweak(Function1<? super AbstractC35831Sa6<String>, Unit> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        return typedTweak(new C33802Jj2(Reflection.getOrCreateKotlinClass(String.class)), init);
    }

    public final <T> C35597Ra6<T> tweak(Function1<? super C52647zB1<T>, Unit> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        C52647zB1 c52647zB1 = new C52647zB1();
        init.invoke(c52647zB1);
        C35597Ra6<T> m85217a = c52647zB1.m85217a();
        this.tweaks.add(m85217a);
        return m85217a;
    }

    public final List<C35597Ra6<?>> tweaks() {
        List<C35597Ra6<?>> list;
        list = CollectionsKt___CollectionsKt.toList(this.tweaks);
        return list;
    }

    public final void updateTweak(C35597Ra6<?> updatedTweak) {
        Intrinsics.checkNotNullParameter(updatedTweak, "updatedTweak");
        Iterator<C35597Ra6<?>> it = this.tweaks.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (Intrinsics.areEqual(it.next().m86601c(), updatedTweak.m86601c())) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        this.tweaks.remove(i);
        this.tweaks.add(i, updatedTweak);
    }
}
