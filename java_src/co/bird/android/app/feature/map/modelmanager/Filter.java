package co.bird.android.app.feature.map.modelmanager;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R5\u0010\u0007\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bX¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/app/feature/map/modelmanager/Filter;", "MapModel", "", "id", "", "getId", "()Ljava/lang/String;", "setDirty", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "getSetDirty", "()Lkotlin/jvm/functions/Function1;", "setSetDirty", "(Lkotlin/jvm/functions/Function1;)V", "apply", "", "models", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public interface Filter<MapModel> {
    List<MapModel> apply(List<? extends MapModel> list);

    String getId();

    Function1<String, Unit> getSetDirty();

    void setSetDirty(Function1<? super String, Unit> function1);
}
