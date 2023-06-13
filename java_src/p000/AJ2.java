package p000;

import android.content.Context;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferUtility;
/* renamed from: AJ2 */
/* loaded from: classes4.dex */
public final class AJ2 implements InterfaceC48812sj1<InterfaceC40476ef6> {

    /* renamed from: a */
    public final VH2 f376a;

    /* renamed from: b */
    public final Y94<Context> f377b;

    /* renamed from: c */
    public final Y94<C22454gl> f378c;

    /* renamed from: d */
    public final Y94<TransferUtility> f379d;

    /* renamed from: e */
    public final Y94<InterfaceC10389Zo> f380e;

    /* renamed from: f */
    public final Y94<C36207Tq4> f381f;

    /* renamed from: g */
    public final Y94<InterfaceC39884df6> f382g;

    public AJ2(VH2 vh2, Y94<Context> y94, Y94<C22454gl> y942, Y94<TransferUtility> y943, Y94<InterfaceC10389Zo> y944, Y94<C36207Tq4> y945, Y94<InterfaceC39884df6> y946) {
        this.f376a = vh2;
        this.f377b = y94;
        this.f378c = y942;
        this.f379d = y943;
        this.f380e = y944;
        this.f381f = y945;
        this.f382g = y946;
    }

    /* renamed from: a */
    public static AJ2 m115922a(VH2 vh2, Y94<Context> y94, Y94<C22454gl> y942, Y94<TransferUtility> y943, Y94<InterfaceC10389Zo> y944, Y94<C36207Tq4> y945, Y94<InterfaceC39884df6> y946) {
        return new AJ2(vh2, y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static InterfaceC40476ef6 m115920c(VH2 vh2, Context context, C22454gl c22454gl, TransferUtility transferUtility, InterfaceC10389Zo interfaceC10389Zo, C36207Tq4 c36207Tq4, InterfaceC39884df6 interfaceC39884df6) {
        return (InterfaceC40476ef6) C51679xZ3.m5002e(vh2.m80107G0(context, c22454gl, transferUtility, interfaceC10389Zo, c36207Tq4, interfaceC39884df6));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC40476ef6 get() {
        return m115920c(this.f376a, this.f377b.get(), this.f378c.get(), this.f379d.get(), this.f380e.get(), this.f381f.get(), this.f382g.get());
    }
}
