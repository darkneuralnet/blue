package p000;

import android.content.Context;
import android.net.Uri;
import ch.qos.logback.classic.pattern.CallerDataConverter;
import com.google.p034ar.sceneform.rendering.AbstractC18039d;
import com.google.p034ar.sceneform.rendering.C18048g;
import com.google.p034ar.sceneform.rendering.InterfaceC18034a;
import java.io.InputStream;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.function.Function;
import java.util.function.Supplier;
/* renamed from: nt2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C45949nt2<T extends AbstractC18039d> {

    /* renamed from: c */
    public static final String f100981c = "nt2";

    /* renamed from: a */
    public final T f100982a;

    /* renamed from: b */
    public final C18048g f100983b;

    public C45949nt2(T t, Context context, final Uri uri, final Function<String, Uri> function) {
        this.f100982a = t;
        InterfaceC18034a m48338l = t.m48338l();
        if (m48338l instanceof C18048g) {
            C18048g c18048g = (C18048g) m48338l;
            this.f100983b = c18048g;
            c18048g.f73974d = new Function() { // from class: mt2
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Uri m22244e;
                    m22244e = C45949nt2.m22244e(uri, (String) obj, function);
                    return m22244e;
                }
            };
            c18048g.f73971a = context.getApplicationContext();
            t.m48344f().m110005d();
            return;
        }
        throw new IllegalStateException("Expected task type " + f100981c);
    }

    /* renamed from: e */
    public static Uri m22244e(Uri uri, String str, Function<String, Uri> function) {
        if (function != null) {
            return function.apply(str);
        }
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Uri parse = Uri.parse(Uri.decode(str));
        if (parse.getScheme() == null) {
            return Uri.parse(Uri.decode(URI.create(Uri.parse(Uri.decode(uri.toString())).buildUpon().appendPath(CallerDataConverter.DEFAULT_RANGE_DELIMITER).appendPath((String) DZ3.m110174c(parse.getPath())).build().toString()).normalize().toString()));
        }
        throw new AssertionError(String.format("Resource path contains a scheme but should be relative, uri: (%s)", parse));
    }

    /* renamed from: f */
    public static /* synthetic */ byte[] m22243f(Callable callable) {
        try {
            return C49439tm5.m11793b(callable);
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ AbstractC18039d m22242g(byte[] bArr) {
        C18048g c18048g = this.f100983b;
        boolean z = false;
        if (bArr[0] == 103 && bArr[1] == 108 && bArr[2] == 84 && bArr[3] == 70) {
            z = true;
        }
        c18048g.f73973c = z;
        c18048g.f73972b = ByteBuffer.wrap(bArr);
        return this.f100982a;
    }

    /* renamed from: d */
    public CompletableFuture<T> m22245d(final Callable<InputStream> callable) {
        return CompletableFuture.supplyAsync(new Supplier() { // from class: kt2
            @Override // java.util.function.Supplier
            public final Object get() {
                byte[] m22243f;
                m22243f = C45949nt2.m22243f(callable);
                return m22243f;
            }
        }, B36.m114760b()).thenApplyAsync(new Function() { // from class: lt2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                AbstractC18039d m22242g;
                m22242g = C45949nt2.this.m22242g((byte[]) obj);
                return m22242g;
            }
        }, B36.m114761a());
    }
}
