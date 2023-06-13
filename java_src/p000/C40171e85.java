package p000;

import android.content.Context;
import android.view.View;
import co.bird.android.model.FlightBannerNode;
/* renamed from: e85  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C40171e85 {

    /* renamed from: a */
    public final Y94<InterfaceC12495bn> f78007a;

    /* renamed from: b */
    public final Y94<C36207Tq4> f78008b;

    /* renamed from: c */
    public final Y94<Context> f78009c;

    public C40171e85(Y94<InterfaceC12495bn> y94, Y94<C36207Tq4> y942, Y94<Context> y943) {
        this.f78007a = y94;
        this.f78008b = y942;
        this.f78009c = y943;
    }

    /* renamed from: a */
    public static C40171e85 m43191a(Y94<InterfaceC12495bn> y94, Y94<C36207Tq4> y942, Y94<Context> y943) {
        return new C40171e85(y94, y942, y943);
    }

    /* renamed from: c */
    public static C38375b85 m43189c(InterfaceC12495bn interfaceC12495bn, C36207Tq4 c36207Tq4, Context context, FlightBannerNode.RiderBarType riderBarType, View view, boolean z) {
        return new C38375b85(interfaceC12495bn, c36207Tq4, context, riderBarType, view, z);
    }

    /* renamed from: b */
    public C38375b85 m43190b(FlightBannerNode.RiderBarType riderBarType, View view, boolean z) {
        return m43189c(this.f78007a.get(), this.f78008b.get(), this.f78009c.get(), riderBarType, view, z);
    }
}
