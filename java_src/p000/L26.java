package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0019\u001a\u0004\u0018\u00018\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006!"}, m28432d2 = {"LL26;", "", "T", "LTa6;", "LRa6;", "tweak", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "LRa6;", "b", "()LRa6;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "c", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "value", "Lkotlin/reflect/KClass;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/reflect/KClass;", "()Lkotlin/reflect/KClass;", "valueClass", "<init>", "(LRa6;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: L26 */
/* loaded from: classes2.dex */
public final class L26<T> implements InterfaceC36065Ta6<T> {

    /* renamed from: a */
    public final C35597Ra6<T> f20623a;

    /* renamed from: b */
    public final String f20624b;

    /* renamed from: c */
    public final T f20625c;

    /* renamed from: d */
    public final KClass<T> f20626d;

    public L26(C35597Ra6<T> tweak) {
        Intrinsics.checkNotNullParameter(tweak, "tweak");
        this.f20623a = tweak;
        this.f20624b = m97903b().m86601c();
        this.f20625c = m97903b().m86599e();
        KClassifier classifier = m97903b().m86600d().getClassifier();
        Intrinsics.checkNotNull(classifier, "null cannot be cast to non-null type kotlin.reflect.KClass<T of co.bird.android.app.feature.settings.tweaks.adapter.TextTweakViewModel>");
        this.f20626d = (KClass) classifier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ L26 copy$default(L26 l26, C35597Ra6 c35597Ra6, int i, Object obj) {
        if ((i & 1) != 0) {
            c35597Ra6 = l26.f20623a;
        }
        return l26.m97904a(c35597Ra6);
    }

    /* renamed from: a */
    public final L26<T> m97904a(C35597Ra6<T> tweak) {
        Intrinsics.checkNotNullParameter(tweak, "tweak");
        return new L26<>(tweak);
    }

    /* renamed from: b */
    public C35597Ra6<T> m97903b() {
        return this.f20623a;
    }

    /* renamed from: c */
    public final KClass<T> m97902c() {
        return this.f20626d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof L26) && Intrinsics.areEqual(this.f20623a, ((L26) obj).f20623a);
    }

    @Override // p000.InterfaceC36065Ta6
    public String getName() {
        return this.f20624b;
    }

    @Override // p000.InterfaceC36065Ta6
    public T getValue() {
        return this.f20625c;
    }

    public int hashCode() {
        return this.f20623a.hashCode();
    }

    public String toString() {
        C35597Ra6<T> c35597Ra6 = this.f20623a;
        return "TextTweakViewModel(tweak=" + c35597Ra6 + ")";
    }
}
