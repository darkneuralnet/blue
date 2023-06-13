package p000;

import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableMap;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\u0006J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m28432d2 = {"LFR3;", "K", "V", "", "LFR3$a;", "builder", C17296a.f69688o, "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: FR3 */
/* loaded from: classes.dex */
public interface FR3<K, V> extends Map, KMappedMarker {

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m28432d2 = {"LFR3$a;", "K", "V", "", "LFR3;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: FR3$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2276a<K, V> extends Map<K, V>, KMutableMap {
        FR3<K, V> build();
    }

    InterfaceC2276a<K, V> builder();
}
