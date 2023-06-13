package p000;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.provider.Settings;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
@Metadata(m28433d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u001a\u0014\u0010\b\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u001a\u001e\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\u00032\b\b\u0001\u0010\n\u001a\u00020\u0003\u001a(\u0010\u000e\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0001\u001a2\u0010\u000f\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u00032\b\b\u0001\u0010\t\u001a\u00020\u00032\b\b\u0001\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0001\u001a$\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\b\b\u0001\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0001\u001a\u001e\u0010\u0016\u001a\u00020\u0014*\u00020\u00002\b\b\u0001\u0010\u0010\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u001a#\u0010\u001a\u001a\u00028\u0000\"\b\b\u0000\u0010\u0017*\u00020\u0014*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a%\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0017*\u00020\u0014*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001b\u001a\u0014\u0010\u001e\u001a\u00020\u001d*\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u0003\u001a\u0014\u0010 \u001a\u00020\u001f*\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u0003\u001a\u0012\u0010#\u001a\u00020!*\u00020\u00002\u0006\u0010\"\u001a\u00020!\u001a\u0012\u0010%\u001a\u00020!*\u00020\u00002\u0006\u0010$\u001a\u00020!\u001a\u001a\u0010(\u001a\u00020!*\u00020\u00002\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020!\u001a\n\u0010)\u001a\u00020\u0001*\u00020\u0000\u001a3\u0010-\u001a\u00020\u001f*\u00020\u00002\b\b\u0001\u0010*\u001a\u00020\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b-\u0010.\u001aW\u00108\u001a\u00020\u001f*\u00020\u00002\b\b\u0001\u0010/\u001a\u00020\u00032\b\b\u0001\u00100\u001a\u00020\u00032\b\b\u0001\u00101\u001a\u00020\u00032\u0006\u00103\u001a\u0002022\b\b\u0001\u00104\u001a\u00020\u00032\b\b\u0001\u00105\u001a\u00020\u00032\n\b\u0002\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b8\u00109\u001a&\u0010>\u001a\u00020\u001f*\u00020\u00002\u0006\u0010:\u001a\u00020\u00142\b\u0010;\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010=\u001a\u00020<\u001a$\u0010@\u001a\u00020\u001f*\u00020\u00002\u0006\u0010:\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u00032\b\b\u0002\u0010=\u001a\u00020<\u001a$\u0010A\u001a\u00020\u001d*\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010:\u001a\u00020\u00142\b\u0010;\u001a\u0004\u0018\u00010\u0005\u001a\u0012\u0010E\u001a\u00020D*\u00020\u00002\u0006\u0010C\u001a\u00020B\u001a\u0014\u0010G\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010F\u001a\u00020\u0003\u001a-\u0010L\u001a\u00020K*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00032\u0012\u0010J\u001a\n\u0012\u0006\b\u0001\u0012\u00020I0H\"\u00020I¢\u0006\u0004\bL\u0010M\"\u0015\u0010Q\u001a\u00020N*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006R"}, m28432d2 = {"Landroid/content/Context;", "", "w", "", "drawable", "Landroid/graphics/drawable/Drawable;", "i", "color", "f", "colorAttributeId", "defaultColor", "l", "drawableId", "mutable", "g", "m", "resource", "Landroid/view/ViewGroup;", "root", "attachToRoot", "Landroid/view/View;", "u", "t", "T", "Landroid/app/Activity;", "id", "c", "(Landroid/app/Activity;I)Landroid/view/View;", "x", "Landroid/graphics/Bitmap;", DateTokenConverter.CONVERTER_KEY, "LPT;", "e", "", "dp", "b", "sp", "y", "complexUnit", "value", C17296a.f69688o, "v", "drawableRes", "widthOverride", "heightOverride", "o", "(Landroid/content/Context;ILjava/lang/Integer;Ljava/lang/Integer;)LPT;", "layoutId", "titleContainerId", "titleId", "", "title", "iconId", "iconRes", "", "iconScalePercentage", "s", "(Landroid/content/Context;IIILjava/lang/String;IILjava/lang/Double;)LPT;", "view", "background", "LAP1;", "generator", "r", "backgroundDrawableId", "q", "p", "Landroid/os/IBinder;", "windowToken", "", "n", "dimenRes", "h", "", "", "args", "", "k", "(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/CharSequence;", "Landroid/view/LayoutInflater;", "j", "(Landroid/content/Context;)Landroid/view/LayoutInflater;", "layoutInflater", "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nContext+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Context+.kt\nco/bird/android/library/extension/Context_Kt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,251:1\n1#2:252\n11335#3:253\n11670#3,3:254\n37#4,2:257\n*S KotlinDebug\n*F\n+ 1 Context+.kt\nco/bird/android/library/extension/Context_Kt\n*L\n236#1:253\n236#1:254,3\n238#1:257,2\n*E\n"})
/* renamed from: fB0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40788fB0 {
    /* renamed from: a */
    public static final float m41781a(Context context, int i, float f) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return TypedValue.applyDimension(i, f, context.getResources().getDisplayMetrics());
    }

    /* renamed from: b */
    public static final float m41780b(Context context, float f) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return f * context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: c */
    public static final <T extends View> T m41779c(Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        T t = (T) activity.findViewById(i);
        Intrinsics.checkNotNullExpressionValue(t, "findViewById(id)");
        return t;
    }

    /* renamed from: d */
    public static final Bitmap m41778d(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Drawable m94299e = NA0.m94299e(context, i);
        Intrinsics.checkNotNull(m94299e);
        Bitmap bitmap = Bitmap.createBitmap(m94299e.getIntrinsicWidth(), m94299e.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        m94299e.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        m94299e.draw(canvas);
        Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
        return bitmap;
    }

    /* renamed from: e */
    public static final C6378PT m41777e(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        C6378PT m88495a = C6780QT.m88495a(m41778d(context, i));
        Intrinsics.checkNotNullExpressionValue(m88495a, "fromBitmap(getBitmap(drawableId))");
        return m88495a;
    }

    /* renamed from: f */
    public static final int m41776f(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return NA0.m94301c(context, i);
    }

    /* renamed from: g */
    public static final Drawable m41775g(Context context, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Drawable getColorTintedDrawable$lambda$3 = context.getResources().getDrawable(i);
        if (z) {
            getColorTintedDrawable$lambda$3.mutate();
        }
        Intrinsics.checkNotNullExpressionValue(getColorTintedDrawable$lambda$3, "getColorTintedDrawable$lambda$3");
        C42529i71.m34432a(getColorTintedDrawable$lambda$3, i2);
        Intrinsics.checkNotNullExpressionValue(getColorTintedDrawable$lambda$3, "resources\n    .getDrawab…apply { setColor(color) }");
        return getColorTintedDrawable$lambda$3;
    }

    public static /* synthetic */ Drawable getColorTintedDrawable$default(Context context, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = false;
        }
        return m41775g(context, i, i2, z);
    }

    public static /* synthetic */ Drawable getThemeColorTintedDrawable$default(Context context, int i, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            z = false;
        }
        return m41769m(context, i, i2, i3, z);
    }

    /* renamed from: h */
    public static final int m41774h(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getResources().getDimensionPixelSize(i);
    }

    /* renamed from: i */
    public static final Drawable m41773i(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Drawable m94299e = NA0.m94299e(context, i);
        Intrinsics.checkNotNull(m94299e);
        return m94299e;
    }

    public static /* synthetic */ C6378PT icon$default(Context context, int i, Integer num, Integer num2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            num = null;
        }
        if ((i2 & 4) != 0) {
            num2 = null;
        }
        return m41767o(context, i, num, num2);
    }

    public static /* synthetic */ C6378PT iconBitmapDescriptor$default(Context context, View view, Drawable drawable, AP1 ap1, int i, Object obj) {
        if ((i & 4) != 0) {
            ap1 = new AP1(context);
        }
        return m41764r(context, view, drawable, ap1);
    }

    /* renamed from: j */
    public static final LayoutInflater m41772j(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        LayoutInflater from = LayoutInflater.from(context);
        Intrinsics.checkNotNullExpressionValue(from, "from(this)");
        return from;
    }

    /* renamed from: k */
    public static final CharSequence m41771k(Context context, int i, Object... args) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        ArrayList arrayList = new ArrayList(args.length);
        for (Object obj : args) {
            if (obj instanceof String) {
                obj = TextUtils.htmlEncode((String) obj);
            }
            arrayList.add(obj);
        }
        Object[] array = arrayList.toArray(new Object[0]);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String m6965b = C50976wN1.m6965b(new SpannedString(context.getText(i)), 1);
        Intrinsics.checkNotNullExpressionValue(m6965b, "toHtml(\n        SpannedS…_LINES_INDIVIDUAL\n      )");
        Object[] copyOf = Arrays.copyOf(array, array.length);
        String format = String.format(m6965b, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        Spanned m6966a = C50976wN1.m6966a(format, 0);
        Intrinsics.checkNotNullExpressionValue(m6966a, "fromHtml(\n    String.for…FROM_HTML_MODE_LEGACY\n  )");
        return m6966a;
    }

    /* renamed from: l */
    public static final int m41770l(Context context, int i, int i2) {
        int m41776f;
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            typedValue = null;
        }
        if (typedValue != null) {
            int i3 = typedValue.resourceId;
            if (i3 == 0) {
                m41776f = typedValue.data;
            } else {
                m41776f = m41776f(context, i3);
            }
            return m41776f;
        }
        return i2;
    }

    /* renamed from: m */
    public static final Drawable m41769m(Context context, int i, int i2, int i3, boolean z) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return m41775g(context, i, m41770l(context, i2, i3), z);
    }

    /* renamed from: n */
    public static final void m41768n(Context context, IBinder windowToken) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(windowToken, "windowToken");
        InputMethodManager inputMethodManager = (InputMethodManager) NA0.m94294j(context, InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
        }
    }

    /* renamed from: o */
    public static final C6378PT m41767o(Context context, int i, Integer num, Integer num2) {
        int intrinsicWidth;
        int intrinsicHeight;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Drawable m41773i = m41773i(context, i);
        if (num != null) {
            intrinsicWidth = (int) C49347td3.m12002a(num, context);
        } else {
            intrinsicWidth = m41773i.getIntrinsicWidth();
        }
        if (num2 != null) {
            intrinsicHeight = (int) C49347td3.m12002a(num2, context);
        } else {
            intrinsicHeight = m41773i.getIntrinsicHeight();
        }
        Canvas canvas = new Canvas();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        canvas.setBitmap(createBitmap);
        m41773i.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        m41773i.draw(canvas);
        C6378PT m88495a = C6780QT.m88495a(createBitmap);
        Intrinsics.checkNotNullExpressionValue(m88495a, "fromBitmap(bitmap)");
        return m88495a;
    }

    /* renamed from: p */
    public static final Bitmap m41766p(Context context, AP1 generator, View view, Drawable drawable) {
        ViewGroup viewGroup;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(generator, "generator");
        Intrinsics.checkNotNullParameter(view, "view");
        generator.m115821g(view);
        generator.m115823e(drawable);
        Bitmap bitmap = generator.m115825c();
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
        return bitmap;
    }

    /* renamed from: q */
    public static final C6378PT m41765q(Context context, View view, int i, AP1 generator) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(generator, "generator");
        return m41764r(context, view, context.getDrawable(i), generator);
    }

    /* renamed from: r */
    public static final C6378PT m41764r(Context context, View view, Drawable drawable, AP1 generator) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(generator, "generator");
        C6378PT m88495a = C6780QT.m88495a(m41766p(context, generator, view, drawable));
        Intrinsics.checkNotNullExpressionValue(m88495a, "fromBitmap(iconBitmap(ge…rator, view, background))");
        return m88495a;
    }

    /* renamed from: s */
    public static final C6378PT m41763s(Context context, int i, int i2, int i3, String title, int i4, int i5, Double d) {
        boolean z;
        Drawable m10397f;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(i4);
        ((TextView) inflate.findViewById(i3)).setText(title);
        imageView.setImageResource(i5);
        if (d != null) {
            double doubleValue = d.doubleValue();
            if (doubleValue == 1.0d) {
                z = true;
            } else {
                z = false;
            }
            if (!z && (m10397f = C49785uM4.m10397f(context.getResources(), i5, context.getTheme())) != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (m10397f.getIntrinsicWidth() * doubleValue), (int) (m10397f.getIntrinsicHeight() * doubleValue));
                layoutParams.addRule(3, i2);
                layoutParams.addRule(14);
                imageView.setLayoutParams(layoutParams);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams2).setMargins(0, -((int) C49347td3.m12002a(12, context)), 0, 0);
            }
        }
        inflate.measure(-2, -2);
        Bitmap createBitmap = Bitmap.createBitmap(inflate.getMeasuredWidth(), inflate.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        inflate.layout(inflate.getLeft(), inflate.getTop(), inflate.getRight(), inflate.getBottom());
        inflate.draw(canvas);
        C6378PT m88495a = C6780QT.m88495a(createBitmap);
        Intrinsics.checkNotNullExpressionValue(m88495a, "fromBitmap(bitmap)");
        return m88495a;
    }

    /* renamed from: t */
    public static final View m41762t(Context context, int i, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        View inflate = LayoutInflater.from(context).inflate(i, viewGroup);
        Intrinsics.checkNotNullExpressionValue(inflate, "from(this).inflate(resource, root)");
        return inflate;
    }

    /* renamed from: u */
    public static final View m41761u(Context context, int i, ViewGroup root, boolean z) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(root, "root");
        View inflate = LayoutInflater.from(context).inflate(i, root, z);
        Intrinsics.checkNotNullExpressionValue(inflate, "from(this).inflate(resource, root, attachToRoot)");
        return inflate;
    }

    /* renamed from: v */
    public static final boolean m41760v(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            if (Settings.Secure.getInt(context.getContentResolver(), "location_mode") == 0) {
                return false;
            }
            return true;
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: w */
    public static final boolean m41759w(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (NA0.m94303a(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public static final <T extends View> T m41758x(Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        return (T) activity.findViewById(i);
    }

    /* renamed from: y */
    public static final float m41757y(Context context, float f) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return m41781a(context, 2, f);
    }

    public static /* synthetic */ C6378PT iconBitmapDescriptor$default(Context context, View view, int i, AP1 ap1, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            ap1 = new AP1(context);
        }
        return m41765q(context, view, i, ap1);
    }
}
