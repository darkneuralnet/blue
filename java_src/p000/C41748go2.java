package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b'\u0010(J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u00020\b*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016J<\u0010\u0012\u001a\u00020\b2'\u0010\u0011\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r¢\u0006\u0002\b\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001aR\u0014\u0010\"\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001aR\u0014\u0010$\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001aR\u0014\u0010&\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, m28432d2 = {"Lgo2;", "Lcn2;", "", "index", "e", "(I)Ljava/lang/Integer;", "LWp5;", "scrollOffset", "", "f", "targetScrollOffset", "", C17296a.f69688o, "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "g", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LCo2;", "LCo2;", TransferTable.COLUMN_STATE, "b", "I", "h", "()I", "numOfItemsForTeleport", "Lg01;", "()Lg01;", "density", "c", "firstVisibleItemIndex", "i", "firstVisibleItemScrollOffset", DateTokenConverter.CONVERTER_KEY, "lastVisibleItemIndex", "getItemCount", "itemCount", "<init>", "(LCo2;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyListAnimateScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/LazyListAnimateScrollScope\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,65:1\n116#2,2:66\n33#2,6:68\n118#2:74\n132#2,3:75\n33#2,4:78\n135#2,2:82\n38#2:84\n137#2:85\n*S KotlinDebug\n*F\n+ 1 LazyListAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/LazyListAnimateScrollScope\n*L\n44#1:66,2\n44#1:68,6\n44#1:74\n54#1:75,3\n54#1:78,4\n54#1:82,2\n54#1:84\n54#1:85\n*E\n"})
/* renamed from: go2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41748go2 implements InterfaceC39349cn2 {

    /* renamed from: a */
    public final C32209Co2 f84286a;

    /* renamed from: b */
    public final int f84287b;

    public C41748go2(C32209Co2 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f84286a = state;
        this.f84287b = 100;
    }

    @Override // p000.InterfaceC39349cn2
    /* renamed from: a */
    public float mo33495a(int i, int i2) {
        List<InterfaceC45306mo2> mo8015b = this.f84286a.m111535r().mo8015b();
        int size = mo8015b.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += mo8015b.get(i4).mo4640a();
        }
        int size2 = i3 / mo8015b.size();
        int mo33493c = i - mo33493c();
        int min = Math.min(Math.abs(i2), size2);
        if (i2 < 0) {
            min *= -1;
        }
        return ((size2 * mo33493c) + min) - mo33487i();
    }

    @Override // p000.InterfaceC39349cn2
    /* renamed from: b */
    public InterfaceC41273g01 mo33494b() {
        return this.f84286a.m111539n();
    }

    @Override // p000.InterfaceC39349cn2
    /* renamed from: c */
    public int mo33493c() {
        return this.f84286a.m111538o();
    }

    @Override // p000.InterfaceC39349cn2
    /* renamed from: d */
    public int mo33492d() {
        Object lastOrNull;
        lastOrNull = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) this.f84286a.m111535r().mo8015b());
        InterfaceC45306mo2 interfaceC45306mo2 = (InterfaceC45306mo2) lastOrNull;
        if (interfaceC45306mo2 != null) {
            return interfaceC45306mo2.getIndex();
        }
        return 0;
    }

    @Override // p000.InterfaceC39349cn2
    /* renamed from: e */
    public Integer mo33491e(int i) {
        InterfaceC45306mo2 interfaceC45306mo2;
        boolean z;
        List<InterfaceC45306mo2> mo8015b = this.f84286a.m111535r().mo8015b();
        int size = mo8015b.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                interfaceC45306mo2 = mo8015b.get(i2);
                if (interfaceC45306mo2.getIndex() == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i2++;
            } else {
                interfaceC45306mo2 = null;
                break;
            }
        }
        InterfaceC45306mo2 interfaceC45306mo22 = interfaceC45306mo2;
        if (interfaceC45306mo22 == null) {
            return null;
        }
        return Integer.valueOf(interfaceC45306mo22.mo4639b());
    }

    @Override // p000.InterfaceC39349cn2
    /* renamed from: f */
    public void mo33490f(InterfaceC36901Wp5 interfaceC36901Wp5, int i, int i2) {
        Intrinsics.checkNotNullParameter(interfaceC36901Wp5, "<this>");
        this.f84286a.m111548J(i, i2);
    }

    @Override // p000.InterfaceC39349cn2
    /* renamed from: g */
    public Object mo33489g(Function2<? super InterfaceC36901Wp5, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m65390d = InterfaceC38196aq5.m65390d(this.f84286a, null, function2, continuation, 1, null);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m65390d == coroutine_suspended ? m65390d : Unit.INSTANCE;
    }

    @Override // p000.InterfaceC39349cn2
    public int getItemCount() {
        return this.f84286a.m111535r().mo8016a();
    }

    @Override // p000.InterfaceC39349cn2
    /* renamed from: h */
    public int mo33488h() {
        return this.f84287b;
    }

    @Override // p000.InterfaceC39349cn2
    /* renamed from: i */
    public int mo33487i() {
        return this.f84286a.m111537p();
    }
}
