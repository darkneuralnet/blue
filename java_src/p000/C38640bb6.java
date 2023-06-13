package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.config.tweaks.dsl.Tweaks;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.full.KClassifiers;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u0014\u0010\u000f\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\nH\u0002J\u0014\u0010\u0010\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¨\u0006\u0013"}, m28432d2 = {"Lbb6;", "LZa6;", "Lco/bird/android/config/tweaks/dsl/Tweaks;", "tweaks", "", "filterTerms", "Lio/reactivex/F;", "", "LH6;", C17296a.f69688o, "LRa6;", "", "tweak", "LG6;", "c", "e", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTweaksConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TweaksConverter.kt\nco/bird/android/app/feature/settings/tweaks/adapter/TweaksConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n350#2,7:67\n766#2:74\n857#2:75\n1726#2,3:76\n858#2:79\n1603#2,9:80\n1855#2:89\n1856#2:91\n1612#2:92\n1#3:90\n1#3:93\n*S KotlinDebug\n*F\n+ 1 TweaksConverter.kt\nco/bird/android/app/feature/settings/tweaks/adapter/TweaksConverterImpl\n*L\n63#1:67,7\n24#1:74\n24#1:75\n24#1:76,3\n24#1:79\n27#1:80,9\n27#1:89\n27#1:91\n27#1:92\n27#1:90\n*E\n"})
/* renamed from: bb6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C38640bb6 implements InterfaceC37469Za6 {
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* renamed from: f */
    public static final List m64288f(String filterTerms, Tweaks tweaks, C38640bb6 this$0) {
        boolean isBlank;
        List<C35597Ra6<?>> tweaks2;
        List mutableList;
        List listOf;
        boolean areEqual;
        boolean areEqual2;
        boolean areEqual3;
        boolean areEqual4;
        KType kType;
        C2637G6 c2637g6;
        List split$default;
        boolean contains;
        boolean z;
        Intrinsics.checkNotNullParameter(filterTerms, "$filterTerms");
        Intrinsics.checkNotNullParameter(tweaks, "$tweaks");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        isBlank = StringsKt__StringsJVMKt.isBlank(filterTerms);
        if (!isBlank) {
            tweaks2 = new ArrayList<>();
            for (?? r2 : tweaks.tweaks()) {
                C35597Ra6 c35597Ra6 = (C35597Ra6) r2;
                split$default = StringsKt__StringsKt.split$default((CharSequence) filterTerms, new String[]{" "}, false, 0, 6, (Object) null);
                List<String> list = split$default;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (String str : list) {
                        contains = StringsKt__StringsKt.contains((CharSequence) c35597Ra6.m86601c(), (CharSequence) str, true);
                        if (!contains) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                if (z) {
                    tweaks2.add(r2);
                }
            }
        } else {
            tweaks2 = tweaks.tweaks();
        }
        ArrayList arrayList = new ArrayList();
        for (C35597Ra6<?> c35597Ra62 : tweaks2) {
            KType m86600d = c35597Ra62.m86600d();
            if (Intrinsics.areEqual(m86600d, KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(Boolean.TYPE), null, false, null, 7, null))) {
                Intrinsics.checkNotNull(c35597Ra62, "null cannot be cast to non-null type co.bird.android.config.tweaks.dsl.Tweak<kotlin.Boolean>");
                c2637g6 = this$0.m64291c(c35597Ra62);
            } else {
                if (Intrinsics.areEqual(m86600d, KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(Integer.TYPE), null, false, null, 7, null))) {
                    areEqual = true;
                } else {
                    areEqual = Intrinsics.areEqual(m86600d, KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(Long.TYPE), null, false, null, 7, null));
                }
                if (areEqual) {
                    areEqual2 = true;
                } else {
                    areEqual2 = Intrinsics.areEqual(m86600d, KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(Float.TYPE), null, false, null, 7, null));
                }
                if (areEqual2) {
                    areEqual3 = true;
                } else {
                    areEqual3 = Intrinsics.areEqual(m86600d, KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(Double.TYPE), null, false, null, 7, null));
                }
                if (areEqual3) {
                    areEqual4 = true;
                } else {
                    areEqual4 = Intrinsics.areEqual(m86600d, KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(String.class), null, false, null, 7, null));
                }
                if (areEqual4) {
                    c2637g6 = this$0.m64289e(c35597Ra62);
                } else {
                    KClassifier classifier = c35597Ra62.m86600d().getClassifier();
                    if (classifier != null) {
                        kType = KClassifiers.createType$default(classifier, null, false, null, 7, null);
                    } else {
                        kType = null;
                    }
                    if (Intrinsics.areEqual(m86600d, kType)) {
                        c2637g6 = this$0.m64290d(c35597Ra62);
                    } else {
                        c2637g6 = null;
                    }
                }
            }
            if (c2637g6 != null) {
                arrayList.add(c2637g6);
            }
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        C3023H6 c3023h6 = new C3023H6(mutableList, new C2637G6(null, C39311cj4.item_tweaks_search, false, 4, null), null, 4, null);
        c3023h6.m104405h(true);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(c3023h6);
        return listOf;
    }

    @Override // p000.InterfaceC37469Za6
    /* renamed from: a */
    public AbstractC23442F<List<C3023H6>> mo64293a(final Tweaks tweaks, final String filterTerms) {
        Intrinsics.checkNotNullParameter(tweaks, "tweaks");
        Intrinsics.checkNotNullParameter(filterTerms, "filterTerms");
        AbstractC23442F<List<C3023H6>> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: ab6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m64288f;
                m64288f = C38640bb6.m64288f(filterTerms, tweaks, this);
                return m64288f;
            }
        }).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n\n      va…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    /* renamed from: c */
    public final C2637G6 m64291c(C35597Ra6<Boolean> c35597Ra6) {
        return new C2637G6(new C10290ZY(c35597Ra6), C39311cj4.item_tweak_boolean, false, 4, null);
    }

    /* renamed from: d */
    public final C2637G6 m64290d(C35597Ra6<?> c35597Ra6) {
        return new C2637G6(new C46401of1(c35597Ra6), C39311cj4.item_tweak_enum, false, 4, null);
    }

    /* renamed from: e */
    public final C2637G6 m64289e(C35597Ra6<?> c35597Ra6) {
        return new C2637G6(new L26(c35597Ra6), C39311cj4.item_tweak_text, false, 4, null);
    }
}
