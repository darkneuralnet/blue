package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0014\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¨\u0006\u0004"}, m28432d2 = {"LgV2;", "", "tag", C17296a.f69688o, "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: o06  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46022o06 {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lss5;", "", "invoke", "(Lss5;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: o06$a */
    /* loaded from: classes.dex */
    public static final class C26785a extends Lambda implements Function1<InterfaceC48906ss5, Unit> {

        /* renamed from: g */
        public final /* synthetic */ String f101215g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26785a(String str) {
            super(1);
            this.f101215g = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48906ss5 interfaceC48906ss5) {
            invoke2(interfaceC48906ss5);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC48906ss5 semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            C47128ps5.m18605U(semantics, this.f101215g);
        }
    }

    /* renamed from: a */
    public static final InterfaceC41563gV2 m22000a(InterfaceC41563gV2 interfaceC41563gV2, String tag) {
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        return C41198fs5.m40620b(interfaceC41563gV2, false, new C26785a(tag), 1, null);
    }
}
