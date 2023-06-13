package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import p000.ZD3;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0001R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u0010"}, m28432d2 = {"LLs4;", "LZD3$b;", "", "position", "count", "", C17296a.f69688o, "b", "c", LegacyRepairType.OTHER_KEY, DateTokenConverter.CONVERTER_KEY, "", "Ljava/util/List;", "list", "<init>", "()V", "paging-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Ls4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34353Ls4 extends ZD3.AbstractC10142b {

    /* renamed from: b */
    public static final C5103a f22160b = new C5103a(null);

    /* renamed from: a */
    public final List<Integer> f22161a = new ArrayList();

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, m28432d2 = {"LLs4$a;", "", "", "Changed", "I", "Inserted", "Removed", "<init>", "()V", "paging-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Ls4$a */
    /* loaded from: classes.dex */
    public static final class C5103a {
        public /* synthetic */ C5103a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C5103a() {
        }
    }

    @Override // p000.ZD3.AbstractC10142b
    /* renamed from: a */
    public void mo31832a(int i, int i2) {
        this.f22161a.add(0);
        this.f22161a.add(Integer.valueOf(i));
        this.f22161a.add(Integer.valueOf(i2));
    }

    @Override // p000.ZD3.AbstractC10142b
    /* renamed from: b */
    public void mo31831b(int i, int i2) {
        this.f22161a.add(1);
        this.f22161a.add(Integer.valueOf(i));
        this.f22161a.add(Integer.valueOf(i2));
    }

    @Override // p000.ZD3.AbstractC10142b
    /* renamed from: c */
    public void mo31830c(int i, int i2) {
        this.f22161a.add(2);
        this.f22161a.add(Integer.valueOf(i));
        this.f22161a.add(Integer.valueOf(i2));
    }

    /* renamed from: d */
    public final void m96259d(ZD3.AbstractC10142b other) {
        IntRange until;
        IntProgression step;
        Intrinsics.checkNotNullParameter(other, "other");
        until = RangesKt___RangesKt.until(0, this.f22161a.size());
        step = RangesKt___RangesKt.step(until, 3);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (true) {
                int intValue = this.f22161a.get(first).intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue == 2) {
                            other.mo31830c(this.f22161a.get(first + 1).intValue(), this.f22161a.get(first + 2).intValue());
                        } else {
                            throw new IllegalStateException("Unexpected recording value");
                        }
                    } else {
                        other.mo31831b(this.f22161a.get(first + 1).intValue(), this.f22161a.get(first + 2).intValue());
                    }
                } else {
                    other.mo31832a(this.f22161a.get(first + 1).intValue(), this.f22161a.get(first + 2).intValue());
                }
                if (first == last) {
                    break;
                }
                first += step2;
            }
        }
        this.f22161a.clear();
    }
}
