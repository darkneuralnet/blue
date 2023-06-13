package p000;

import co.bird.android.app.feature.map.modelmanager.Filter;
import co.bird.android.model.wire.WireBird;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR?\u0010\u0016\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m28432d2 = {"LK01;", "Lco/bird/android/app/feature/map/modelmanager/Filter;", "Lco/bird/android/model/wire/WireBird;", "", "models", "apply", "", "b", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "c", "Lkotlin/jvm/functions/Function1;", "getSetDirty", "()Lkotlin/jvm/functions/Function1;", "setSetDirty", "(Lkotlin/jvm/functions/Function1;)V", "setDirty", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: K01 */
/* loaded from: classes2.dex */
public final class K01 implements Filter<WireBird> {

    /* renamed from: c */
    public static Function1<? super String, Unit> f18901c;

    /* renamed from: a */
    public static final K01 f18899a = new K01();

    /* renamed from: b */
    public static final String f18900b = "destination-edit-bird-filter";

    /* renamed from: d */
    public static final int f18902d = 8;

    private K01() {
    }

    @Override // co.bird.android.app.feature.map.modelmanager.Filter
    public List<WireBird> apply(List<? extends WireBird> models) {
        List<WireBird> emptyList;
        Intrinsics.checkNotNullParameter(models, "models");
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return emptyList;
    }

    @Override // co.bird.android.app.feature.map.modelmanager.Filter
    public String getId() {
        return f18900b;
    }

    @Override // co.bird.android.app.feature.map.modelmanager.Filter
    public Function1<String, Unit> getSetDirty() {
        return f18901c;
    }

    @Override // co.bird.android.app.feature.map.modelmanager.Filter
    public void setSetDirty(Function1<? super String, Unit> function1) {
        f18901c = function1;
    }
}
