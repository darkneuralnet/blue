package p000;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001J\u001c\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H&J!\u0010\t\u001a\u00020\u00042\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0002\b\u0007H&R\u0014\u0010\f\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m28432d2 = {"LEN2;", "", "S", "Lkotlin/Function1;", "", "block", "b", "Lkotlin/ExtensionFunctionType;", "stateReducer", "c", "getState", "()Ljava/lang/Object;", TransferTable.COLUMN_STATE, "LEu1;", C17296a.f69688o, "()LEu1;", "flow", "mvrx-common"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: EN2 */
/* loaded from: classes2.dex */
public interface EN2<S> {
    /* renamed from: a */
    InterfaceC32730Eu1<S> mo41743a();

    /* renamed from: b */
    void mo41742b(Function1<? super S, Unit> function1);

    /* renamed from: c */
    void mo41741c(Function1<? super S, ? extends S> function1);

    S getState();
}
