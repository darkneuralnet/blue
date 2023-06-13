package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\u0002J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0007J\u0006\u0010\u000b\u001a\u00020\u0006R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u0011"}, m28432d2 = {"LWr6;", "", "", "key", "LOr6;", "viewModel", "", DateTokenConverter.CONVERTER_KEY, "b", "", "c", C17296a.f69688o, "", "Ljava/util/Map;", "map", "<init>", "()V", "lifecycle-viewmodel_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Wr6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C36920Wr6 {

    /* renamed from: a */
    public final Map<String, AbstractC35048Or6> f42210a = new LinkedHashMap();

    /* renamed from: a */
    public final void m77779a() {
        for (AbstractC35048Or6 abstractC35048Or6 : this.f42210a.values()) {
            abstractC35048Or6.clear();
        }
        this.f42210a.clear();
    }

    /* renamed from: b */
    public final AbstractC35048Or6 m77778b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f42210a.get(key);
    }

    /* renamed from: c */
    public final Set<String> m77777c() {
        return new HashSet(this.f42210a.keySet());
    }

    /* renamed from: d */
    public final void m77776d(String key, AbstractC35048Or6 viewModel) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        AbstractC35048Or6 put = this.f42210a.put(key, viewModel);
        if (put != null) {
            put.onCleared();
        }
    }
}
