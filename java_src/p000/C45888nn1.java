package p000;

import android.content.Context;
import com.google.android.libraries.places.api.net.PlacesClient;
/* renamed from: nn1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C45888nn1 implements InterfaceC48812sj1<PlacesClient> {

    /* renamed from: a */
    public final C43516jn1 f100510a;

    /* renamed from: b */
    public final Y94<Context> f100511b;

    /* renamed from: c */
    public final Y94<String> f100512c;

    public C45888nn1(C43516jn1 c43516jn1, Y94<Context> y94, Y94<String> y942) {
        this.f100510a = c43516jn1;
        this.f100511b = y94;
        this.f100512c = y942;
    }

    /* renamed from: a */
    public static C45888nn1 m23151a(C43516jn1 c43516jn1, Y94<Context> y94, Y94<String> y942) {
        return new C45888nn1(c43516jn1, y94, y942);
    }

    /* renamed from: c */
    public static PlacesClient m23149c(C43516jn1 c43516jn1, Context context, String str) {
        return (PlacesClient) C51679xZ3.m5002e(c43516jn1.m29931d(context, str));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public PlacesClient get() {
        return m23149c(this.f100510a, this.f100511b.get(), this.f100512c.get());
    }
}
