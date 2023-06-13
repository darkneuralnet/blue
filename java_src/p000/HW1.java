package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import ch.qos.logback.core.net.SyslogConstants;
import com.fasterxml.jackson.core.JsonPointer;
import java.io.IOException;
import java.util.Map;
/* renamed from: HW1 */
/* loaded from: classes2.dex */
public class HW1 {

    /* renamed from: d */
    public static final Object f13483d = new Object();

    /* renamed from: a */
    public final Context f13484a;

    /* renamed from: b */
    public final String f13485b;

    /* renamed from: c */
    public final Map<String, UD2> f13486c;

    public HW1(Drawable.Callback callback, String str, GW1 gw1, Map<String, UD2> map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.f13485b = str + JsonPointer.SEPARATOR;
        } else {
            this.f13485b = str;
        }
        this.f13486c = map;
        m103799d(gw1);
        if (!(callback instanceof View)) {
            this.f13484a = null;
        } else {
            this.f13484a = ((View) callback).getContext().getApplicationContext();
        }
    }

    /* renamed from: a */
    public Bitmap m103802a(String str) {
        UD2 ud2 = this.f13486c.get(str);
        if (ud2 == null) {
            return null;
        }
        Bitmap m81819a = ud2.m81819a();
        if (m81819a != null) {
            return m81819a;
        }
        Context context = this.f13484a;
        if (context == null) {
            return null;
        }
        String m81818b = ud2.m81818b();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = SyslogConstants.LOG_LOCAL4;
        if (m81818b.startsWith("data:") && m81818b.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(m81818b.substring(m81818b.indexOf(44) + 1), 0);
                return m103800c(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException e) {
                C32524Dx2.m109585d("data URL did not have correct base64 format.", e);
                return null;
            }
        }
        try {
            if (!TextUtils.isEmpty(this.f13485b)) {
                AssetManager assets = context.getAssets();
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(assets.open(this.f13485b + m81818b), null, options);
                    if (decodeStream == null) {
                        C32524Dx2.m109586c("Decoded image `" + str + "` is null.");
                        return null;
                    }
                    return m103800c(str, C33095Gi6.m104860l(decodeStream, ud2.m81815e(), ud2.m81817c()));
                } catch (IllegalArgumentException e2) {
                    C32524Dx2.m109585d("Unable to decode image `" + str + "`.", e2);
                    return null;
                }
            }
            throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
        } catch (IOException e3) {
            C32524Dx2.m109585d("Unable to open asset.", e3);
            return null;
        }
    }

    /* renamed from: b */
    public boolean m103801b(Context context) {
        return (context == null && this.f13484a == null) || this.f13484a.equals(context);
    }

    /* renamed from: c */
    public final Bitmap m103800c(String str, Bitmap bitmap) {
        synchronized (f13483d) {
            this.f13486c.get(str).m81814f(bitmap);
        }
        return bitmap;
    }

    /* renamed from: d */
    public void m103799d(GW1 gw1) {
    }
}
