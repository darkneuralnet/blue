package co.bird.android.app.feature.map.p008ui.renderer;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u000f*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u000fB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0006\u0010\r\u001a\u00020\u000eR\u0012\u0010\u0006\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/renderer/MutableLazy;", "T", "Lkotlin/Lazy;", "initializer", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "cached", "Ljava/lang/Object;", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "reset", "", "Companion", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: co.bird.android.app.feature.map.ui.renderer.MutableLazy */
/* loaded from: classes2.dex */
public final class MutableLazy<T> implements Lazy<T> {
    public static final Companion Companion = new Companion(null);
    private T cached;
    private final Function0<T> initializer;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0007¨\u0006\b"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/renderer/MutableLazy$Companion;", "", "()V", "resettableLazy", "Lco/bird/android/app/feature/map/ui/renderer/MutableLazy;", "T", "value", "Lkotlin/Function0;", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.ui.renderer.MutableLazy$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> MutableLazy<T> resettableLazy(Function0<? extends T> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new MutableLazy<>(value);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MutableLazy(Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.initializer = initializer;
    }

    @Override // kotlin.Lazy
    public T getValue() {
        if (this.cached == null) {
            this.cached = this.initializer.invoke();
        }
        return this.cached;
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return this.cached != null;
    }

    public final void reset() {
        this.cached = null;
    }
}
