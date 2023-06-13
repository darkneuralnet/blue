package co.bird.android.app.feature.map.modelmanager;

import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&J\b\u0010\u0007\u001a\u00020\u0004H&J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/app/feature/map/modelmanager/MapModelManager;", "T", "", "addItems", "", "items", "", "clearItems", "removeItem", "item", "(Ljava/lang/Object;)V", "setItems", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public interface MapModelManager<T> {
    void addItems(List<? extends T> list);

    void clearItems();

    void removeItem(T t);

    void setItems(List<? extends T> list);
}
