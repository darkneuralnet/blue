package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¨\u0006\u0006"}, m28432d2 = {"LCo2;", TransferTable.COLUMN_STATE, "", "isVertical", "Ldo2;", C17296a.f69688o, "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: eo2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40562eo2 {

    @Metadata(m28433d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u000f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m28432d2 = {"eo2$a", "Ldo2;", "", "delta", "", DateTokenConverter.CONVERTER_KEY, "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "index", "b", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lem0;", "e", "c", "()F", "currentPosition", "", C17296a.f69688o, "()Z", "canScrollForward", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: eo2$a */
    /* loaded from: classes.dex */
    public static final class C20104a implements InterfaceC39969do2 {

        /* renamed from: a */
        public final /* synthetic */ C32209Co2 f78886a;

        /* renamed from: b */
        public final /* synthetic */ boolean f78887b;

        public C20104a(C32209Co2 c32209Co2, boolean z) {
            this.f78886a = c32209Co2;
            this.f78887b = z;
        }

        @Override // p000.InterfaceC39969do2
        /* renamed from: a */
        public boolean mo42540a() {
            return this.f78886a.mo11049a();
        }

        @Override // p000.InterfaceC39969do2
        /* renamed from: b */
        public Object mo42539b(int i, Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            Object m111555C = C32209Co2.m111555C(this.f78886a, i, 0, continuation, 2, null);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return m111555C == coroutine_suspended ? m111555C : Unit.INSTANCE;
        }

        @Override // p000.InterfaceC39969do2
        /* renamed from: c */
        public float mo42538c() {
            return this.f78886a.m111538o() + (this.f78886a.m111537p() / 100000.0f);
        }

        @Override // p000.InterfaceC39969do2
        /* renamed from: d */
        public Object mo42537d(float f, Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            Object m82952b = C36199Tp5.m82952b(this.f78886a, f, null, continuation, 2, null);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return m82952b == coroutine_suspended ? m82952b : Unit.INSTANCE;
        }

        @Override // p000.InterfaceC39969do2
        /* renamed from: e */
        public C40540em0 mo42536e() {
            if (this.f78887b) {
                return new C40540em0(-1, 1);
            }
            return new C40540em0(1, -1);
        }
    }

    /* renamed from: a */
    public static final InterfaceC39969do2 m42541a(C32209Co2 state, boolean z) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new C20104a(state, z);
    }
}
