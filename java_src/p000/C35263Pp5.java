package p000;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.View;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23444H;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C35263Pp5;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\t"}, m28432d2 = {"LPp5;", "", "Landroid/app/Activity;", "activity", "Lio/reactivex/F;", "Landroid/graphics/Bitmap;", "b", "<init>", "()V", "shaketoreport_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Pp5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35263Pp5 {

    /* renamed from: a */
    public static final C35263Pp5 f29121a = new C35263Pp5();

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/H;", "Landroid/graphics/Bitmap;", "emitter", "", "invoke", "(Lio/reactivex/H;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pp5$a */
    /* loaded from: classes3.dex */
    public static final class C6496a extends Lambda implements Function1<InterfaceC23444H<Bitmap>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ View f29122g;

        /* renamed from: h */
        public final /* synthetic */ Activity f29123h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6496a(View view, Activity activity) {
            super(1);
            this.f29122g = view;
            this.f29123h = activity;
        }

        /* renamed from: b */
        public static final void m89722b(InterfaceC23444H emitter, Bitmap bitmap, int i) {
            Intrinsics.checkNotNullParameter(emitter, "$emitter");
            if (i == 0) {
                emitter.onSuccess(bitmap);
            } else {
                emitter.onError(new UnsupportedOperationException("Failed to take screenshot"));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23444H<Bitmap> interfaceC23444H) {
            invoke2(interfaceC23444H);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(final InterfaceC23444H<Bitmap> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            final Bitmap createBitmap = Bitmap.createBitmap(this.f29122g.getWidth(), this.f29122g.getHeight(), Bitmap.Config.ARGB_8888);
            PixelCopy.request(this.f29123h.getWindow(), createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: Op5
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i) {
                    C35263Pp5.C6496a.m89722b(InterfaceC23444H.this, createBitmap, i);
                }
            }, new Handler());
        }
    }

    private C35263Pp5() {
    }

    /* renamed from: c */
    public static final Bitmap m89724c(View view) {
        boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
        if (!view.isDrawingCacheEnabled()) {
            view.setDrawingCacheEnabled(true);
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        if (view.isDrawingCacheEnabled() != isDrawingCacheEnabled) {
            view.setDrawingCacheEnabled(isDrawingCacheEnabled);
        }
        return createBitmap;
    }

    /* renamed from: b */
    public final AbstractC23442F<Bitmap> m89725b(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        final View rootView = activity.getWindow().getDecorView().getRootView();
        if (Build.VERSION.SDK_INT >= 26) {
            return C45832nh5.m23305k(new C6496a(rootView, activity));
        }
        AbstractC23442F<Bitmap> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: Mp5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bitmap m89724c;
                m89724c = C35263Pp5.m89724c(rootView);
                return m89724c;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "{\n      Single.fromCalla…     bitmap\n      }\n    }");
        return m33161E;
    }
}
