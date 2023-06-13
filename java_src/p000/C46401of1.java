package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.full.KClassifiers;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u000e\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b*\u0010+J\u0014\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bHÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\f\u0010\u0012\u001a\u00020\u000b*\u00020\u0011H\u0002R \u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001d\u001a\u0004\u0018\u00018\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR!\u0010#\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b$\u0010\"R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001e8\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b\u001f\u0010\"R\u0011\u0010)\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b&\u0010(¨\u0006,"}, m28432d2 = {"Lof1;", "", "T", "LTa6;", "", "index", "", "b", "LRa6;", "tweak", C17296a.f69688o, "", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lkotlin/reflect/KType;", "c", "LRa6;", "e", "()LRa6;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "value", "", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "getEnumConstants", "()Ljava/util/List;", "enumConstants", "getEnumNameList", "enumNameList", "f", "selectionList", "()I", "valueIndex", "<init>", "(LRa6;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEnumTweakViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnumTweakViewModel.kt\nco/bird/android/app/feature/settings/tweaks/adapter/EnumTweakViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,30:1\n1549#2:31\n1620#2,3:32\n37#3,2:35\n*S KotlinDebug\n*F\n+ 1 EnumTweakViewModel.kt\nco/bird/android/app/feature/settings/tweaks/adapter/EnumTweakViewModel\n*L\n17#1:31\n17#1:32,3\n18#1:35,2\n*E\n"})
/* renamed from: of1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C46401of1<T> implements InterfaceC36065Ta6<T> {

    /* renamed from: a */
    public final C35597Ra6<T> f102274a;

    /* renamed from: b */
    public final String f102275b;

    /* renamed from: c */
    public final T f102276c;

    /* renamed from: d */
    public final List<Enum<?>> f102277d;

    /* renamed from: e */
    public final List<String> f102278e;

    /* renamed from: f */
    public final List<String> f102279f;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0034, code lost:
        r3 = kotlin.collections.ArraysKt___ArraysJvmKt.filterIsInstance(r3, java.lang.Enum.class);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C46401of1(C35597Ra6<T> tweak) {
        int collectionSizeOrDefault;
        List<String> listOf;
        Intrinsics.checkNotNullParameter(tweak, "tweak");
        this.f102274a = tweak;
        this.f102275b = m20687e().m86601c();
        this.f102276c = m20687e().m86599e();
        Object[] enumConstants = Class.forName(m20689c(m20687e().m86600d())).getEnumConstants();
        List<Enum<?>> emptyList = (enumConstants == null || emptyList == null) ? CollectionsKt__CollectionsKt.emptyList() : emptyList;
        this.f102277d = emptyList;
        List<Enum<?>> list = emptyList;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Enum) it.next()).name());
        }
        this.f102278e = arrayList;
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add("Use Config");
        spreadBuilder.addSpread(arrayList.toArray(new String[0]));
        listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new String[spreadBuilder.size()]));
        this.f102279f = listOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C46401of1 copy$default(C46401of1 c46401of1, C35597Ra6 c35597Ra6, int i, Object obj) {
        if ((i & 1) != 0) {
            c35597Ra6 = c46401of1.f102274a;
        }
        return c46401of1.m20691a(c35597Ra6);
    }

    /* renamed from: a */
    public final C46401of1<T> m20691a(C35597Ra6<T> tweak) {
        Intrinsics.checkNotNullParameter(tweak, "tweak");
        return new C46401of1<>(tweak);
    }

    /* renamed from: b */
    public final Enum<?> m20690b(int i) {
        if (i == 0) {
            return null;
        }
        return this.f102277d.get(i - 1);
    }

    /* renamed from: c */
    public final String m20689c(KType kType) {
        KClassifier classifier = kType.getClassifier();
        return String.valueOf(classifier != null ? KClassifiers.createType$default(classifier, null, false, null, 7, null) : null);
    }

    /* renamed from: d */
    public final List<String> m20688d() {
        return this.f102279f;
    }

    /* renamed from: e */
    public C35597Ra6<T> m20687e() {
        return this.f102274a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C46401of1) && Intrinsics.areEqual(this.f102274a, ((C46401of1) obj).f102274a);
    }

    /* renamed from: f */
    public final int m20686f() {
        return this.f102278e.indexOf(String.valueOf(getValue()));
    }

    @Override // p000.InterfaceC36065Ta6
    public String getName() {
        return this.f102275b;
    }

    @Override // p000.InterfaceC36065Ta6
    public T getValue() {
        return this.f102276c;
    }

    public int hashCode() {
        return this.f102274a.hashCode();
    }

    public String toString() {
        C35597Ra6<T> c35597Ra6 = this.f102274a;
        return "EnumTweakViewModel(tweak=" + c35597Ra6 + ")";
    }
}
