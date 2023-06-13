package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u001f\u001a\u00020\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\"\u0010#J\u001e\u0010\u0006\u001a\u00020\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016J\u000f\u0010\u0007\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0004H\u0016J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015¨\u0006$"}, m28432d2 = {"LYr4;", "LsM5;", "Lkotlin/Function1;", "", "", "readObserver", "v", "n", "()V", DateTokenConverter.CONVERTER_KEY, "snapshot", "l", "(LsM5;)V", "m", "LFP5;", TransferTable.COLUMN_STATE, "o", "(LFP5;)V", "g", "Lkotlin/jvm/functions/Function1;", "h", "()Lkotlin/jvm/functions/Function1;", "", "I", "snapshots", "", "i", "()Z", "readOnly", "j", "writeObserver", "id", "LvM5;", "invalid", "<init>", "(ILvM5;Lkotlin/jvm/functions/Function1;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Yr4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37386Yr4 extends AbstractC48600sM5 {

    /* renamed from: g */
    public final Function1<Object, Unit> f47494g;

    /* renamed from: h */
    public int f47495h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37386Yr4(int i, C50378vM5 invalid, Function1<Object, Unit> function1) {
        super(i, invalid, null);
        Intrinsics.checkNotNullParameter(invalid, "invalid");
        this.f47494g = function1;
        this.f47495h = 1;
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: d */
    public void mo1848d() {
        if (!m14301e()) {
            mo14293m(this);
            super.mo1848d();
        }
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: h */
    public Function1<Object, Unit> mo14298h() {
        return this.f47494g;
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: i */
    public boolean mo14297i() {
        return true;
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: j */
    public Function1<Object, Unit> mo14296j() {
        return null;
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: l */
    public void mo14294l(AbstractC48600sM5 snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        this.f47495h++;
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: m */
    public void mo14293m(AbstractC48600sM5 snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        int i = this.f47495h - 1;
        this.f47495h = i;
        if (i == 0) {
            m14303b();
        }
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: n */
    public void mo14292n() {
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: o */
    public void mo14291o(FP5 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        C51564xM5.m5396U();
        throw new KotlinNothingValueException();
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: v */
    public AbstractC48600sM5 mo14284v(Function1<Object, Unit> function1) {
        C51564xM5.m5387b0(this);
        return new A43(mo14300f(), mo14299g(), function1, this);
    }
}
