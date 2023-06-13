package p000;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.p003ui.focus.C11299c;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¨\u0006\u0006"}, m28432d2 = {"LgV2;", "LC16;", TransferTable.COLUMN_STATE, "LBv1;", "focusManager", C17296a.f69688o, "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: k16  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43660k16 {

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lik2;", "keyEvent", "", "invoke-ZmokQxo", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: k16$a */
    /* loaded from: classes.dex */
    public static final class C25080a extends Lambda implements Function1<C42894ik2, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC32037Bv1 f93776g;

        /* renamed from: h */
        public final /* synthetic */ C16 f93777h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25080a(InterfaceC32037Bv1 interfaceC32037Bv1, C16 c16) {
            super(1);
            this.f93776g = interfaceC32037Bv1;
            this.f93777h = c16;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(C42894ik2 c42894ik2) {
            return m116778invokeZmokQxo(c42894ik2.m33518f());
        }

        /* renamed from: invoke-ZmokQxo  reason: not valid java name */
        public final Boolean m116778invokeZmokQxo(KeyEvent keyEvent) {
            boolean mo68851i;
            Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
            InputDevice device = keyEvent.getDevice();
            if (device == null) {
                return Boolean.FALSE;
            }
            if (device.getKeyboardType() == 2 && device.isVirtual()) {
                return Boolean.FALSE;
            }
            if (!C44673lk2.m26890e(C45266mk2.m25124b(keyEvent), C44673lk2.f96650a.m26889a())) {
                return Boolean.FALSE;
            }
            switch (C36853Wk2.m77893b(C45266mk2.m25125a(keyEvent))) {
                case 19:
                    mo68851i = this.f93776g.mo68851i(C11299c.f52961b.m68800h());
                    break;
                case 20:
                    mo68851i = this.f93776g.mo68851i(C11299c.f52961b.m68807a());
                    break;
                case 21:
                    mo68851i = this.f93776g.mo68851i(C11299c.f52961b.m68804d());
                    break;
                case 22:
                    mo68851i = this.f93776g.mo68851i(C11299c.f52961b.m68801g());
                    break;
                case 23:
                    C37723a26 m112991e = this.f93777h.m112991e();
                    if (m112991e != null) {
                        m112991e.m71959e();
                    }
                    mo68851i = true;
                    break;
                default:
                    mo68851i = false;
                    break;
            }
            return Boolean.valueOf(mo68851i);
        }
    }

    /* renamed from: a */
    public static final InterfaceC41563gV2 m29453a(InterfaceC41563gV2 interfaceC41563gV2, C16 state, InterfaceC32037Bv1 focusManager) {
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(focusManager, "focusManager");
        return C47638qk2.m17172b(interfaceC41563gV2, new C25080a(focusManager, state));
    }
}
