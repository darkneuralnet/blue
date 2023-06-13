package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC40818fE3;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B=\u0012\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u0010\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u0019\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b \u0010!J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0017\u0010\n\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\u0007J\b\u0010\u000f\u001a\u00020\u000eH\u0016R)\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001d\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001e¨\u0006\""}, m28432d2 = {"LhE3;", "", "Key", "Value", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "anchorPosition", "b", "(I)Ljava/lang/Object;", "LfE3$b$c;", "c", "", "toString", "", C17296a.f69688o, "Ljava/util/List;", "e", "()Ljava/util/List;", "pages", "Ljava/lang/Integer;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/Integer;", "LeE3;", "LeE3;", "getConfig", "()LeE3;", "config", "I", "leadingPlaceholderCount", "<init>", "(Ljava/util/List;Ljava/lang/Integer;LeE3;I)V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: hE3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42004hE3<Key, Value> {

    /* renamed from: a */
    public final List<AbstractC40818fE3.AbstractC20330b.C20333c<Key, Value>> f84898a;

    /* renamed from: b */
    public final Integer f84899b;

    /* renamed from: c */
    public final C40225eE3 f84900c;

    /* renamed from: d */
    public final int f84901d;

    public C42004hE3(List<AbstractC40818fE3.AbstractC20330b.C20333c<Key, Value>> pages, Integer num, C40225eE3 config, int i) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f84898a = pages;
        this.f84899b = num;
        this.f84900c = config;
        this.f84901d = i;
    }

    /* JADX WARN: Incorrect condition in loop: B:18:0x0041 */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Value m36584b(int i) {
        boolean z;
        int lastIndex;
        int lastIndex2;
        Object last;
        int lastIndex3;
        int lastIndex4;
        Object last2;
        Object first;
        List<AbstractC40818fE3.AbstractC20330b.C20333c<Key, Value>> list = this.f84898a;
        int i2 = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((AbstractC40818fE3.AbstractC20330b.C20333c) it.next()).m41666b().isEmpty()) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return null;
        }
        int i3 = i - this.f84901d;
        while (i2 < lastIndex) {
            lastIndex4 = CollectionsKt__CollectionsKt.getLastIndex(m36581e().get(i2).m41666b());
            if (i3 <= lastIndex4) {
                break;
            }
            i3 -= m36581e().get(i2).m41666b().size();
            i2++;
        }
        Iterator<T> it2 = this.f84898a.iterator();
        while (it2.hasNext()) {
            AbstractC40818fE3.AbstractC20330b.C20333c c20333c = (AbstractC40818fE3.AbstractC20330b.C20333c) it2.next();
            if (!c20333c.m41666b().isEmpty()) {
                List<AbstractC40818fE3.AbstractC20330b.C20333c<Key, Value>> list2 = this.f84898a;
                ListIterator<AbstractC40818fE3.AbstractC20330b.C20333c<Key, Value>> listIterator = list2.listIterator(list2.size());
                while (listIterator.hasPrevious()) {
                    AbstractC40818fE3.AbstractC20330b.C20333c<Key, Value> previous = listIterator.previous();
                    if (!previous.m41666b().isEmpty()) {
                        if (i3 < 0) {
                            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) c20333c.m41666b());
                            return (Value) first;
                        }
                        lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(this.f84898a);
                        if (i2 == lastIndex2) {
                            last = CollectionsKt___CollectionsKt.last((List<? extends Object>) this.f84898a);
                            lastIndex3 = CollectionsKt__CollectionsKt.getLastIndex(((AbstractC40818fE3.AbstractC20330b.C20333c) last).m41666b());
                            if (i3 > lastIndex3) {
                                last2 = CollectionsKt___CollectionsKt.last((List<? extends Object>) previous.m41666b());
                                return (Value) last2;
                            }
                        }
                        return this.f84898a.get(i2).m41666b().get(i3);
                    }
                }
                throw new NoSuchElementException("List contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Incorrect condition in loop: B:18:0x0040 */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC40818fE3.AbstractC20330b.C20333c<Key, Value> m36583c(int i) {
        int lastIndex;
        Object first;
        int lastIndex2;
        List<AbstractC40818fE3.AbstractC20330b.C20333c<Key, Value>> list = this.f84898a;
        int i2 = 0;
        boolean z = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (!((AbstractC40818fE3.AbstractC20330b.C20333c) it.next()).m41666b().isEmpty()) {
                    z = false;
                    break;
                }
            }
        }
        if (z) {
            return null;
        }
        int i3 = i - this.f84901d;
        while (i2 < lastIndex) {
            lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(m36581e().get(i2).m41666b());
            if (i3 <= lastIndex2) {
                break;
            }
            i3 -= m36581e().get(i2).m41666b().size();
            i2++;
        }
        if (i3 < 0) {
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) this.f84898a);
            return (AbstractC40818fE3.AbstractC20330b.C20333c) first;
        }
        return this.f84898a.get(i2);
    }

    /* renamed from: d */
    public final Integer m36582d() {
        return this.f84899b;
    }

    /* renamed from: e */
    public final List<AbstractC40818fE3.AbstractC20330b.C20333c<Key, Value>> m36581e() {
        return this.f84898a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C42004hE3) {
            C42004hE3 c42004hE3 = (C42004hE3) obj;
            if (Intrinsics.areEqual(this.f84898a, c42004hE3.f84898a) && Intrinsics.areEqual(this.f84899b, c42004hE3.f84899b) && Intrinsics.areEqual(this.f84900c, c42004hE3.f84900c) && this.f84901d == c42004hE3.f84901d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f84898a.hashCode();
        Integer num = this.f84899b;
        if (num != null) {
            i = num.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i + this.f84900c.hashCode() + Integer.hashCode(this.f84901d);
    }

    public String toString() {
        return "PagingState(pages=" + this.f84898a + ", anchorPosition=" + this.f84899b + ", config=" + this.f84900c + ", leadingPlaceholderCount=" + this.f84901d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
