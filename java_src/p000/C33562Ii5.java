package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.InterfaceC33328Hi5;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B9\u0012\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e\u0018\u00010\r\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tH\u0016J\u001c\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e0\rH\u0016R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R(\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R.\u0010\u0018\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t0\u00160\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014¨\u0006\u001b"}, m28432d2 = {"LIi5;", "LHi5;", "", "value", "", C17296a.f69688o, "", "key", "f", "Lkotlin/Function0;", "valueProvider", "LHi5$a;", "b", "", "", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "canBeSaved", "", "Ljava/util/Map;", "restored", "", "c", "valueProviders", "<init>", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "runtime-saveable_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSaveableStateRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateRegistry.kt\nandroidx/compose/runtime/saveable/SaveableStateRegistryImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,159:1\n1#2:160\n361#3,7:161\n215#4,2:168\n*S KotlinDebug\n*F\n+ 1 SaveableStateRegistry.kt\nandroidx/compose/runtime/saveable/SaveableStateRegistryImpl\n*L\n119#1:161,7\n134#1:168,2\n*E\n"})
/* renamed from: Ii5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33562Ii5 implements InterfaceC33328Hi5 {

    /* renamed from: a */
    public final Function1<Object, Boolean> f16106a;

    /* renamed from: b */
    public final Map<String, List<Object>> f16107b;

    /* renamed from: c */
    public final Map<String, List<Function0<Object>>> f16108c;

    @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"Ii5$a", "LHi5$a;", "", "unregister", "runtime-saveable_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Ii5$a */
    /* loaded from: classes.dex */
    public static final class C3743a implements InterfaceC33328Hi5.InterfaceC3212a {

        /* renamed from: b */
        public final /* synthetic */ String f16110b;

        /* renamed from: c */
        public final /* synthetic */ Function0<Object> f16111c;

        public C3743a(String str, Function0<? extends Object> function0) {
            this.f16110b = str;
            this.f16111c = function0;
        }

        @Override // p000.InterfaceC33328Hi5.InterfaceC3212a
        public void unregister() {
            List list = (List) C33562Ii5.this.f16108c.remove(this.f16110b);
            if (list != null) {
                list.remove(this.f16111c);
            }
            if (list != null && (!list.isEmpty())) {
                C33562Ii5.this.f16108c.put(this.f16110b, list);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
        r2 = kotlin.collections.MapsKt__MapsKt.toMutableMap(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C33562Ii5(Map<String, ? extends List<? extends Object>> map, Function1<Object, Boolean> canBeSaved) {
        Intrinsics.checkNotNullParameter(canBeSaved, "canBeSaved");
        this.f16106a = canBeSaved;
        Map<String, List<Object>> linkedHashMap = (map == null || linkedHashMap == null) ? new LinkedHashMap<>() : linkedHashMap;
        this.f16107b = linkedHashMap;
        this.f16108c = new LinkedHashMap();
    }

    @Override // p000.InterfaceC33328Hi5
    /* renamed from: a */
    public boolean mo19982a(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f16106a.invoke(value).booleanValue();
    }

    @Override // p000.InterfaceC33328Hi5
    /* renamed from: b */
    public InterfaceC33328Hi5.InterfaceC3212a mo19981b(String key, Function0<? extends Object> valueProvider) {
        boolean isBlank;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(valueProvider, "valueProvider");
        isBlank = StringsKt__StringsJVMKt.isBlank(key);
        if (!isBlank) {
            Map<String, List<Function0<Object>>> map = this.f16108c;
            List<Function0<Object>> list = map.get(key);
            if (list == null) {
                list = new ArrayList<>();
                map.put(key, list);
            }
            list.add(valueProvider);
            return new C3743a(key, valueProvider);
        }
        throw new IllegalArgumentException("Registered key is empty or blank".toString());
    }

    @Override // p000.InterfaceC33328Hi5
    /* renamed from: d */
    public Map<String, List<Object>> mo19979d() {
        Map<String, List<Object>> mutableMap;
        ArrayList arrayListOf;
        mutableMap = MapsKt__MapsKt.toMutableMap(this.f16107b);
        for (Map.Entry<String, List<Function0<Object>>> entry : this.f16108c.entrySet()) {
            String key = entry.getKey();
            List<Function0<Object>> value = entry.getValue();
            if (value.size() == 1) {
                Object invoke = value.get(0).invoke();
                if (invoke == null) {
                    continue;
                } else if (mo19982a(invoke)) {
                    arrayListOf = CollectionsKt__CollectionsKt.arrayListOf(invoke);
                    mutableMap.put(key, arrayListOf);
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                int size = value.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    Object invoke2 = value.get(i).invoke();
                    if (invoke2 != null && !mo19982a(invoke2)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    arrayList.add(invoke2);
                }
                mutableMap.put(key, arrayList);
            }
        }
        return mutableMap;
    }

    @Override // p000.InterfaceC33328Hi5
    /* renamed from: f */
    public Object mo19978f(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        List<Object> remove = this.f16107b.remove(key);
        if (remove != null && (!remove.isEmpty())) {
            if (remove.size() > 1) {
                this.f16107b.put(key, remove.subList(1, remove.size()));
            }
            return remove.get(0);
        }
        return null;
    }
}
