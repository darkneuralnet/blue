package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    public static final PorterDuff.Mode f54290k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f54291a;

    /* renamed from: b */
    public Object f54292b;

    /* renamed from: c */
    public byte[] f54293c;

    /* renamed from: d */
    public Parcelable f54294d;

    /* renamed from: e */
    public int f54295e;

    /* renamed from: f */
    public int f54296f;

    /* renamed from: g */
    public ColorStateList f54297g;

    /* renamed from: h */
    public PorterDuff.Mode f54298h;

    /* renamed from: i */
    public String f54299i;

    /* renamed from: j */
    public String f54300j;

    /* renamed from: androidx.core.graphics.drawable.IconCompat$a */
    /* loaded from: classes.dex */
    public static class C11552a {
        private C11552a() {
        }

        /* renamed from: a */
        public static IconCompat m67686a(Object obj) {
            HZ3.m103731g(obj);
            int m67683d = m67683d(obj);
            if (m67683d != 2) {
                if (m67683d != 4) {
                    if (m67683d != 6) {
                        IconCompat iconCompat = new IconCompat(-1);
                        iconCompat.f54292b = obj;
                        return iconCompat;
                    }
                    return IconCompat.m67704c(m67682e(obj));
                }
                return IconCompat.m67701f(m67682e(obj));
            }
            return IconCompat.m67699h(null, m67684c(obj), m67685b(obj));
        }

        /* renamed from: b */
        public static int m67685b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C11554c.m67677a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon resource", e);
                return 0;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon resource", e2);
                return 0;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon resource", e3);
                return 0;
            }
        }

        /* renamed from: c */
        public static String m67684c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C11554c.m67676b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon package", e);
                return null;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon package", e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon package", e3);
                return null;
            }
        }

        /* renamed from: d */
        public static int m67683d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C11554c.m67675c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e);
                return -1;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e2);
                return -1;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e3);
                return -1;
            }
        }

        /* renamed from: e */
        public static Uri m67682e(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C11554c.m67674d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon uri", e);
                return null;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon uri", e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon uri", e3);
                return null;
            }
        }

        /* renamed from: f */
        public static Drawable m67681f(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* renamed from: g */
        public static Icon m67680g(IconCompat iconCompat, Context context) {
            Icon createWithBitmap;
            switch (iconCompat.f54291a) {
                case -1:
                    return (Icon) iconCompat.f54292b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f54292b);
                    break;
                case 2:
                    createWithBitmap = Icon.createWithResource(iconCompat.m67696k(), iconCompat.f54295e);
                    break;
                case 3:
                    createWithBitmap = Icon.createWithData((byte[]) iconCompat.f54292b, iconCompat.f54295e, iconCompat.f54296f);
                    break;
                case 4:
                    createWithBitmap = Icon.createWithContentUri((String) iconCompat.f54292b);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT >= 26) {
                        createWithBitmap = C11553b.m67678b((Bitmap) iconCompat.f54292b);
                        break;
                    } else {
                        createWithBitmap = Icon.createWithBitmap(IconCompat.m67705b((Bitmap) iconCompat.f54292b, false));
                        break;
                    }
                case 6:
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 30) {
                        createWithBitmap = C11555d.m67673a(iconCompat.m67694m());
                        break;
                    } else if (context != null) {
                        InputStream m67693n = iconCompat.m67693n(context);
                        if (m67693n != null) {
                            if (i >= 26) {
                                createWithBitmap = C11553b.m67678b(BitmapFactory.decodeStream(m67693n));
                                break;
                            } else {
                                createWithBitmap = Icon.createWithBitmap(IconCompat.m67705b(BitmapFactory.decodeStream(m67693n), false));
                                break;
                            }
                        } else {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.m67694m());
                        }
                    } else {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.m67694m());
                    }
            }
            ColorStateList colorStateList = iconCompat.f54297g;
            if (colorStateList != null) {
                createWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f54298h;
            if (mode != IconCompat.f54290k) {
                createWithBitmap.setTintMode(mode);
            }
            return createWithBitmap;
        }
    }

    /* renamed from: androidx.core.graphics.drawable.IconCompat$b */
    /* loaded from: classes.dex */
    public static class C11553b {
        private C11553b() {
        }

        /* renamed from: a */
        public static Drawable m67679a(Drawable drawable, Drawable drawable2) {
            C49216tP1.m12413a();
            return C48623sP1.m14235a(drawable, drawable2);
        }

        /* renamed from: b */
        public static Icon m67678b(Bitmap bitmap) {
            Icon createWithAdaptiveBitmap;
            createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(bitmap);
            return createWithAdaptiveBitmap;
        }
    }

    /* renamed from: androidx.core.graphics.drawable.IconCompat$c */
    /* loaded from: classes.dex */
    public static class C11554c {
        private C11554c() {
        }

        /* renamed from: a */
        public static int m67677a(Object obj) {
            int resId;
            resId = ((Icon) obj).getResId();
            return resId;
        }

        /* renamed from: b */
        public static String m67676b(Object obj) {
            String resPackage;
            resPackage = ((Icon) obj).getResPackage();
            return resPackage;
        }

        /* renamed from: c */
        public static int m67675c(Object obj) {
            int type;
            type = ((Icon) obj).getType();
            return type;
        }

        /* renamed from: d */
        public static Uri m67674d(Object obj) {
            Uri uri;
            uri = ((Icon) obj).getUri();
            return uri;
        }
    }

    /* renamed from: androidx.core.graphics.drawable.IconCompat$d */
    /* loaded from: classes.dex */
    public static class C11555d {
        private C11555d() {
        }

        /* renamed from: a */
        public static Icon m67673a(Uri uri) {
            Icon createWithAdaptiveBitmapContentUri;
            createWithAdaptiveBitmapContentUri = Icon.createWithAdaptiveBitmapContentUri(uri);
            return createWithAdaptiveBitmapContentUri;
        }
    }

    public IconCompat() {
        this.f54291a = -1;
        this.f54293c = null;
        this.f54294d = null;
        this.f54295e = 0;
        this.f54296f = 0;
        this.f54297g = null;
        this.f54298h = f54290k;
        this.f54299i = null;
    }

    /* renamed from: a */
    public static IconCompat m67706a(Icon icon) {
        return C11552a.m67686a(icon);
    }

    /* renamed from: b */
    public static Bitmap m67705b(Bitmap bitmap, boolean z) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    /* renamed from: c */
    public static IconCompat m67704c(Uri uri) {
        C37259Yd3.m74778c(uri);
        return m67703d(uri.toString());
    }

    /* renamed from: d */
    public static IconCompat m67703d(String str) {
        C37259Yd3.m74778c(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f54292b = str;
        return iconCompat;
    }

    /* renamed from: e */
    public static IconCompat m67702e(Bitmap bitmap) {
        C37259Yd3.m74778c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f54292b = bitmap;
        return iconCompat;
    }

    /* renamed from: f */
    public static IconCompat m67701f(Uri uri) {
        C37259Yd3.m74778c(uri);
        return m67700g(uri.toString());
    }

    /* renamed from: g */
    public static IconCompat m67700g(String str) {
        C37259Yd3.m74778c(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f54292b = str;
        return iconCompat;
    }

    /* renamed from: h */
    public static IconCompat m67699h(Resources resources, String str, int i) {
        C37259Yd3.m74778c(str);
        if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f54295e = i;
            if (resources != null) {
                try {
                    iconCompat.f54292b = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f54292b = str;
            }
            iconCompat.f54300j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    /* renamed from: t */
    public static String m67687t(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: i */
    public Bitmap m67698i() {
        int i = this.f54291a;
        if (i == -1) {
            Object obj = this.f54292b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i == 1) {
            return (Bitmap) this.f54292b;
        } else {
            if (i == 5) {
                return m67705b((Bitmap) this.f54292b, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    /* renamed from: j */
    public int m67697j() {
        int i = this.f54291a;
        if (i == -1) {
            return C11552a.m67685b(this.f54292b);
        }
        if (i == 2) {
            return this.f54295e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* renamed from: k */
    public String m67696k() {
        int i = this.f54291a;
        if (i == -1) {
            return C11552a.m67684c(this.f54292b);
        }
        if (i == 2) {
            String str = this.f54300j;
            if (str != null && !TextUtils.isEmpty(str)) {
                return this.f54300j;
            }
            return ((String) this.f54292b).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* renamed from: l */
    public int m67695l() {
        int i = this.f54291a;
        if (i == -1) {
            return C11552a.m67683d(this.f54292b);
        }
        return i;
    }

    /* renamed from: m */
    public Uri m67694m() {
        int i = this.f54291a;
        if (i == -1) {
            return C11552a.m67682e(this.f54292b);
        }
        if (i != 4 && i != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse((String) this.f54292b);
    }

    /* renamed from: n */
    public InputStream m67693n(Context context) {
        Uri m67694m = m67694m();
        String scheme = m67694m.getScheme();
        if (!"content".equals(scheme) && !"file".equals(scheme)) {
            try {
                return new FileInputStream(new File((String) this.f54292b));
            } catch (FileNotFoundException e) {
                Log.w("IconCompat", "Unable to load image from path: " + m67694m, e);
                return null;
            }
        }
        try {
            return context.getContentResolver().openInputStream(m67694m);
        } catch (Exception e2) {
            Log.w("IconCompat", "Unable to load image from URI: " + m67694m, e2);
            return null;
        }
    }

    /* renamed from: o */
    public void m67692o() {
        this.f54298h = PorterDuff.Mode.valueOf(this.f54299i);
        switch (this.f54291a) {
            case -1:
                Parcelable parcelable = this.f54294d;
                if (parcelable != null) {
                    this.f54292b = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f54294d;
                if (parcelable2 != null) {
                    this.f54292b = parcelable2;
                    return;
                }
                byte[] bArr = this.f54293c;
                this.f54292b = bArr;
                this.f54291a = 3;
                this.f54295e = 0;
                this.f54296f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f54293c, Charset.forName("UTF-16"));
                this.f54292b = str;
                if (this.f54291a == 2 && this.f54300j == null) {
                    this.f54300j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f54292b = this.f54293c;
                return;
        }
    }

    /* renamed from: p */
    public void m67691p(boolean z) {
        this.f54299i = this.f54298h.name();
        switch (this.f54291a) {
            case -1:
                if (!z) {
                    this.f54294d = (Parcelable) this.f54292b;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f54292b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f54293c = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.f54294d = (Parcelable) this.f54292b;
                return;
            case 2:
                this.f54293c = ((String) this.f54292b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f54293c = (byte[]) this.f54292b;
                return;
            case 4:
            case 6:
                this.f54293c = this.f54292b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    /* renamed from: q */
    public Bundle m67690q() {
        Bundle bundle = new Bundle();
        switch (this.f54291a) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.f54292b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.f54292b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f54292b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f54292b);
                break;
        }
        bundle.putInt("type", this.f54291a);
        bundle.putInt("int1", this.f54295e);
        bundle.putInt("int2", this.f54296f);
        bundle.putString("string1", this.f54300j);
        ColorStateList colorStateList = this.f54297g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f54298h;
        if (mode != f54290k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    @Deprecated
    /* renamed from: r */
    public Icon m67689r() {
        return m67688s(null);
    }

    /* renamed from: s */
    public Icon m67688s(Context context) {
        return C11552a.m67680g(this, context);
    }

    public String toString() {
        if (this.f54291a == -1) {
            return String.valueOf(this.f54292b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(m67687t(this.f54291a));
        switch (this.f54291a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f54292b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f54292b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f54300j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m67697j())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f54295e);
                if (this.f54296f != 0) {
                    sb.append(" off=");
                    sb.append(this.f54296f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f54292b);
                break;
        }
        if (this.f54297g != null) {
            sb.append(" tint=");
            sb.append(this.f54297g);
        }
        if (this.f54298h != f54290k) {
            sb.append(" mode=");
            sb.append(this.f54298h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i) {
        this.f54293c = null;
        this.f54294d = null;
        this.f54295e = 0;
        this.f54296f = 0;
        this.f54297g = null;
        this.f54298h = f54290k;
        this.f54299i = null;
        this.f54291a = i;
    }
}
