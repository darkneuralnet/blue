package p000;

import android.content.SharedPreferences;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B+\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u0004\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\r\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016J\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\b\u0010\u000f\u001a\u00020\tH\u0016R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m28432d2 = {"Lfz5;", "E", "LMj6;", "key", "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "e", "element", "", "h", "(Ljava/lang/Object;)V", "elements", "f", "b", C17296a.f69688o, "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "sharedPreferences", "Lht5;", "", "Lht5;", "serializer", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "stringKey", "<init>", "(Landroid/content/SharedPreferences;Lht5;Ljava/lang/String;)V", "restring_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: fz5  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41268fz5<E> implements InterfaceC34508Mj6<E> {

    /* renamed from: b */
    public final SharedPreferences f81253b;

    /* renamed from: c */
    public final InterfaceC42394ht5<E, String> f81254c;

    /* renamed from: d */
    public final String f81255d;

    public C41268fz5(SharedPreferences sharedPreferences, InterfaceC42394ht5<E, String> serializer, String stringKey) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(stringKey, "stringKey");
        this.f81253b = sharedPreferences;
        this.f81254c = serializer;
        this.f81255d = stringKey;
    }

    @Override // p000.InterfaceC34508Mj6
    /* renamed from: a */
    public void mo40385a() {
        this.f81253b.edit().clear().apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC34508Mj6
    /* renamed from: b */
    public void mo40384b(E e) {
        List minus;
        int collectionSizeOrDefault;
        Set<String> set;
        minus = CollectionsKt___CollectionsKt.minus(mo40382e(), e);
        List<Object> list = minus;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Object obj : list) {
            arrayList.add((String) this.f81254c.serialize(obj));
        }
        set = CollectionsKt___CollectionsKt.toSet(arrayList);
        this.f81253b.edit().putStringSet(this.f81255d, set).apply();
    }

    @Override // p000.InterfaceC34508Mj6
    /* renamed from: c */
    public E mo40383c(E e) {
        Object obj;
        Set<String> stringSet = this.f81253b.getStringSet(this.f81255d, null);
        if (stringSet != null) {
            Iterator<T> it = stringSet.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    String it2 = (String) obj;
                    C32506Dv2 c32506Dv2 = C32506Dv2.f6572a;
                    Intrinsics.checkNotNullExpressionValue(it2, "it");
                    if (Intrinsics.areEqual(c32506Dv2.m109701a(it2), e)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                return this.f81254c.mo35621a(str);
            }
        }
        return null;
    }

    @Override // p000.InterfaceC34508Mj6
    /* renamed from: e */
    public Collection<E> mo40382e() {
        Set emptySet;
        int collectionSizeOrDefault;
        Set<String> stringSet = this.f81253b.getStringSet(this.f81255d, null);
        if (stringSet != null) {
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(stringSet, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (String it : stringSet) {
                InterfaceC42394ht5<E, String> interfaceC42394ht5 = this.f81254c;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                arrayList.add(interfaceC42394ht5.mo35621a(it));
            }
            return arrayList;
        }
        emptySet = SetsKt__SetsKt.emptySet();
        return emptySet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC34508Mj6
    /* renamed from: f */
    public void mo40381f(Collection<? extends E> elements) {
        List plus;
        int collectionSizeOrDefault;
        Set<String> set;
        Intrinsics.checkNotNullParameter(elements, "elements");
        plus = CollectionsKt___CollectionsKt.plus((Collection) mo40382e(), (Iterable) elements);
        List<Object> list = plus;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Object obj : list) {
            arrayList.add((String) this.f81254c.serialize(obj));
        }
        set = CollectionsKt___CollectionsKt.toSet(arrayList);
        this.f81253b.edit().putStringSet(this.f81255d, set).apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC34508Mj6
    /* renamed from: h */
    public void mo40380h(E e) {
        List plus;
        int collectionSizeOrDefault;
        Set<String> set;
        plus = CollectionsKt___CollectionsKt.plus((Collection<? extends E>) ((Collection<? extends Object>) mo40382e()), e);
        List<Object> list = plus;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Object obj : list) {
            arrayList.add((String) this.f81254c.serialize(obj));
        }
        set = CollectionsKt___CollectionsKt.toSet(arrayList);
        this.f81253b.edit().putStringSet(this.f81255d, set).apply();
    }
}
