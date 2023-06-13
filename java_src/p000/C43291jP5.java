package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rR\u0014\u0010\u0011\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"LjP5;", "", "LTC6;", "id", "LiP5;", DateTokenConverter.CONVERTER_KEY, "b", "", "workSpecId", "", "c", "", C17296a.f69688o, "LHG6;", "spec", "e", "Ljava/lang/Object;", "lock", "", "Ljava/util/Map;", "runs", "<init>", "()V", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: jP5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43291jP5 {

    /* renamed from: a */
    public final Object f92689a = new Object();

    /* renamed from: b */
    public final Map<TC6, C42698iP5> f92690b = new LinkedHashMap();

    /* renamed from: a */
    public final boolean m30658a(TC6 id) {
        boolean containsKey;
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this.f92689a) {
            containsKey = this.f92690b.containsKey(id);
        }
        return containsKey;
    }

    /* renamed from: b */
    public final C42698iP5 m30657b(TC6 id) {
        C42698iP5 remove;
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this.f92689a) {
            remove = this.f92690b.remove(id);
        }
        return remove;
    }

    /* renamed from: c */
    public final List<C42698iP5> m30656c(String workSpecId) {
        List<C42698iP5> list;
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        synchronized (this.f92689a) {
            Map<TC6, C42698iP5> map = this.f92690b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<TC6, C42698iP5> entry : map.entrySet()) {
                if (Intrinsics.areEqual(entry.getKey().m84208b(), workSpecId)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (TC6 tc6 : linkedHashMap.keySet()) {
                this.f92690b.remove(tc6);
            }
            list = CollectionsKt___CollectionsKt.toList(linkedHashMap.values());
        }
        return list;
    }

    /* renamed from: d */
    public final C42698iP5 m30655d(TC6 id) {
        C42698iP5 c42698iP5;
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this.f92689a) {
            Map<TC6, C42698iP5> map = this.f92690b;
            C42698iP5 c42698iP52 = map.get(id);
            if (c42698iP52 == null) {
                c42698iP52 = new C42698iP5(id);
                map.put(id, c42698iP52);
            }
            c42698iP5 = c42698iP52;
        }
        return c42698iP5;
    }

    /* renamed from: e */
    public final C42698iP5 m30654e(HG6 spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        return m30655d(KG6.m99055a(spec));
    }
}
