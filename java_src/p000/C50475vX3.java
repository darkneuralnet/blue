package p000;

import android.view.MotionEvent;
import androidx.compose.p003ui.viewinterop.AndroidViewHolder;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¨\u0006\u0004"}, m28432d2 = {"LgV2;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "view", C17296a.f69688o, "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPointerInteropFilter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,350:1\n135#2:351\n*S KotlinDebug\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt\n*L\n73#1:351\n*E\n"})
/* renamed from: vX3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50475vX3 {

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/view/MotionEvent;", "motionEvent", "", C17296a.f69688o, "(Landroid/view/MotionEvent;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vX3$a */
    /* loaded from: classes.dex */
    public static final class C29579a extends Lambda implements Function1<MotionEvent, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ AndroidViewHolder f114224g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29579a(AndroidViewHolder androidViewHolder) {
            super(1);
            this.f114224g = androidViewHolder;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(MotionEvent motionEvent) {
            boolean dispatchTouchEvent;
            Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
            switch (motionEvent.getActionMasked()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    dispatchTouchEvent = this.f114224g.dispatchTouchEvent(motionEvent);
                    break;
                default:
                    dispatchTouchEvent = this.f114224g.dispatchGenericMotionEvent(motionEvent);
                    break;
            }
            return Boolean.valueOf(dispatchTouchEvent);
        }
    }

    /* renamed from: a */
    public static final InterfaceC41563gV2 m8527a(InterfaceC41563gV2 interfaceC41563gV2, AndroidViewHolder view) {
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        C49883uX3 c49883uX3 = new C49883uX3();
        c49883uX3.m10108h(new C29579a(view));
        HI4 hi4 = new HI4();
        c49883uX3.m10107j(hi4);
        view.setOnRequestDisallowInterceptTouchEvent$ui_release(hi4);
        return interfaceC41563gV2.mo39266t0(c49883uX3);
    }
}
