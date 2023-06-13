package p000;

import android.view.View;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"T", "Landroid/view/View;", "defaultValue", "LSs6;", C17296a.f69688o, "(Landroid/view/View;Ljava/lang/Object;)LSs6;", "balloon_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: Ts6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36227Ts6 {

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "", "T", "invoke"}, m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: Ts6$a */
    /* loaded from: classes6.dex */
    public static final class C8137a extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ View f36383g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8137a(View view) {
            super(0);
            this.f36383g = view;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f36383g.invalidate();
        }
    }
}
