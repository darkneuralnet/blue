package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0002R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, m28432d2 = {"LS24;", "", "", "value", "", C17296a.f69688o, "", "b", "c", DateTokenConverter.CONVERTER_KEY, "", "Ljava/util/List;", "list", "<init>", "(Ljava/util/List;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/PrioritySet\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,3443:1\n4513#2,5:3444\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/PrioritySet\n*L\n3392#1:3444,5\n*E\n"})
/* renamed from: S24 */
/* loaded from: classes.dex */
public final class S24 {

    /* renamed from: a */
    public final List<Integer> f33065a;

    public S24() {
        this(null, 1, null);
    }

    /* renamed from: a */
    public final void m86072a(int i) {
        List<Integer> list;
        if (!this.f33065a.isEmpty()) {
            if (this.f33065a.get(0).intValue() != i) {
                if (this.f33065a.get(list.size() - 1).intValue() == i) {
                    return;
                }
            } else {
                return;
            }
        }
        int size = this.f33065a.size();
        this.f33065a.add(Integer.valueOf(i));
        while (size > 0) {
            int i2 = ((size + 1) >>> 1) - 1;
            int intValue = this.f33065a.get(i2).intValue();
            if (i <= intValue) {
                break;
            }
            this.f33065a.set(size, Integer.valueOf(intValue));
            size = i2;
        }
        this.f33065a.set(size, Integer.valueOf(i));
    }

    /* renamed from: b */
    public final boolean m86071b() {
        return !this.f33065a.isEmpty();
    }

    /* renamed from: c */
    public final int m86070c() {
        Object first;
        first = CollectionsKt___CollectionsKt.first((List<? extends Object>) this.f33065a);
        return ((Number) first).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public final int m86069d() {
        boolean z;
        Object last;
        int intValue;
        if (this.f33065a.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int intValue2 = this.f33065a.get(0).intValue();
            while ((!this.f33065a.isEmpty()) && this.f33065a.get(0).intValue() == intValue2) {
                List<Integer> list = this.f33065a;
                last = CollectionsKt___CollectionsKt.last((List<? extends Object>) list);
                list.set(0, last);
                List<Integer> list2 = this.f33065a;
                list2.remove(list2.size() - 1);
                int size = this.f33065a.size();
                int size2 = this.f33065a.size() >>> 1;
                int i = 0;
                while (i < size2) {
                    int intValue3 = this.f33065a.get(i).intValue();
                    int i2 = (i + 1) * 2;
                    int i3 = i2 - 1;
                    int intValue4 = this.f33065a.get(i3).intValue();
                    if (i2 < size && (intValue = this.f33065a.get(i2).intValue()) > intValue4) {
                        if (intValue > intValue3) {
                            this.f33065a.set(i, Integer.valueOf(intValue));
                            this.f33065a.set(i2, Integer.valueOf(intValue3));
                            i = i2;
                        }
                    } else if (intValue4 > intValue3) {
                        this.f33065a.set(i, Integer.valueOf(intValue4));
                        this.f33065a.set(i3, Integer.valueOf(intValue3));
                        i = i3;
                    }
                }
            }
            return intValue2;
        }
        C35528Qt0.m87792x("Set is empty".toString());
        throw new KotlinNothingValueException();
    }

    public S24(List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f33065a = list;
    }

    public /* synthetic */ S24(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
