package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B&\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R4\u0010\r\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038V@VX\u0096\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\u000b\"\u0004\b\t\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, m28432d2 = {"Ln32;", "Lm32;", "Lkotlin/Function1;", "Ll32;", "", C17296a.f69688o, "Lkotlin/jvm/functions/Function1;", "onRequestInputModeChange", "<set-?>", "b", "LEX2;", "()I", "(I)V", "inputMode", "initialInputMode", "<init>", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInputModeManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputModeManager.kt\nandroidx/compose/ui/input/InputModeManagerImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,76:1\n76#2:77\n102#2,2:78\n*S KotlinDebug\n*F\n+ 1 InputModeManager.kt\nandroidx/compose/ui/input/InputModeManagerImpl\n*L\n72#1:77\n72#1:78,2\n*E\n"})
/* renamed from: n32  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45455n32 implements InterfaceC44862m32 {

    /* renamed from: a */
    public final Function1<C44269l32, Boolean> f99275a;

    /* renamed from: b */
    public final EX2 f99276b;

    public /* synthetic */ C45455n32(int i, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, function1);
    }

    @Override // p000.InterfaceC44862m32
    /* renamed from: a */
    public int mo24518a() {
        return ((C44269l32) this.f99276b.getValue()).m27984i();
    }

    /* renamed from: b */
    public void m24517b(int i) {
        this.f99276b.setValue(C44269l32.m27990c(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C45455n32(int i, Function1<? super C44269l32, Boolean> function1) {
        EX2 m97025e;
        this.f99275a = function1;
        m97025e = LM5.m97025e(C44269l32.m27990c(i), null, 2, null);
        this.f99276b = m97025e;
    }
}
