package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Handler;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.bottomsheet.DialogC17707a;
import java.util.Locale;
/* renamed from: Ei6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C32627Ei6 {

    /* renamed from: Ei6$a */
    /* loaded from: classes8.dex */
    public static class RunnableC1931a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ DialogC17707a f7966b;

        public RunnableC1931a(DialogC17707a dialogC17707a) {
            this.f7966b = dialogC17707a;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7966b.cancel();
        }
    }

    /* renamed from: Ei6$b */
    /* loaded from: classes8.dex */
    public static class View$OnClickListenerC1932b implements View.OnClickListener {

        /* renamed from: b */
        public final /* synthetic */ View.OnClickListener f7967b;

        /* renamed from: c */
        public final /* synthetic */ View f7968c;

        /* renamed from: d */
        public final /* synthetic */ DialogC17707a f7969d;

        public View$OnClickListenerC1932b(View.OnClickListener onClickListener, View view, DialogC17707a dialogC17707a) {
            this.f7967b = onClickListener;
            this.f7968c = view;
            this.f7969d = dialogC17707a;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f7967b.onClick(this.f7968c);
            this.f7969d.cancel();
        }
    }

    /* renamed from: Ei6$c */
    /* loaded from: classes8.dex */
    public static class DialogInterface$OnCancelListenerC1933c implements DialogInterface.OnCancelListener {

        /* renamed from: b */
        public final /* synthetic */ Handler f7970b;

        /* renamed from: c */
        public final /* synthetic */ Runnable f7971c;

        public DialogInterface$OnCancelListenerC1933c(Handler handler, Runnable runnable) {
            this.f7970b = handler;
            this.f7971c = runnable;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            this.f7970b.removeCallbacks(this.f7971c);
        }
    }

    /* renamed from: Ei6$d */
    /* loaded from: classes8.dex */
    public static class DialogInterface$OnDismissListenerC1934d implements DialogInterface.OnDismissListener {

        /* renamed from: b */
        public final /* synthetic */ Handler f7972b;

        /* renamed from: c */
        public final /* synthetic */ Runnable f7973c;

        public DialogInterface$OnDismissListenerC1934d(Handler handler, Runnable runnable) {
            this.f7972b = handler;
            this.f7973c = runnable;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            this.f7972b.removeCallbacks(this.f7973c);
        }
    }

    /* renamed from: Ei6$e */
    /* loaded from: classes8.dex */
    public static class C1935e implements InterfaceC47298q96 {

        /* renamed from: a */
        public final int f7974a;

        /* renamed from: b */
        public final int f7975b;

        public C1935e(int i, int i2) {
            this.f7974a = i;
            this.f7975b = i2;
        }

        @Override // p000.InterfaceC47298q96
        public String key() {
            return String.format(Locale.US, "rounded-%s-%s", Integer.valueOf(this.f7974a), Integer.valueOf(this.f7975b));
        }

        @Override // p000.InterfaceC47298q96
        public Bitmap transform(Bitmap bitmap) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i = this.f7975b;
            RectF rectF = new RectF(i, i, bitmap.getWidth() - this.f7975b, bitmap.getHeight() - this.f7975b);
            int i2 = this.f7974a;
            canvas.drawRoundRect(rectF, i2, i2, paint);
            if (bitmap != createBitmap) {
                bitmap.recycle();
            }
            return createBitmap;
        }
    }

    /* renamed from: a */
    public static int m108567a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            int i2 = typedValue.resourceId;
            if (i2 == 0) {
                return typedValue.data;
            }
            return NA0.m94301c(context, i2);
        }
        return -16777216;
    }

    /* renamed from: b */
    public static void m108566b(ImageView imageView, int i) {
        if (imageView != null && imageView.getDrawable() != null) {
            P61.m90838n(P61.m90834r(imageView.getDrawable()).mutate(), i);
            imageView.invalidate();
        }
    }

    /* renamed from: c */
    public static boolean m108565c(String str, Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(str, 128).enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static InterfaceC47298q96 m108564d(Context context, int i) {
        return new C1935e(context.getResources().getDimensionPixelOffset(i), 0);
    }

    /* renamed from: e */
    public static void m108563e(View view, String str, long j, CharSequence charSequence, View.OnClickListener onClickListener) {
        DialogC17707a dialogC17707a = new DialogC17707a(view.getContext());
        Handler handler = new Handler();
        RunnableC1931a runnableC1931a = new RunnableC1931a(dialogC17707a);
        dialogC17707a.setContentView(C32175Ck4.belvedere_bottom_sheet);
        TextView textView = (TextView) dialogC17707a.findViewById(C35883Sg4.belvedere_bottom_sheet_message_text);
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = (TextView) dialogC17707a.findViewById(C35883Sg4.belvedere_bottom_sheet_actions_text);
        if (textView2 != null) {
            textView2.setText(charSequence);
            textView2.setOnClickListener(new View$OnClickListenerC1932b(onClickListener, view, dialogC17707a));
        }
        dialogC17707a.setCancelable(true);
        dialogC17707a.setOnCancelListener(new DialogInterface$OnCancelListenerC1933c(handler, runnableC1931a));
        dialogC17707a.setOnDismissListener(new DialogInterface$OnDismissListenerC1934d(handler, runnableC1931a));
        dialogC17707a.show();
        handler.postDelayed(runnableC1931a, j);
    }

    /* renamed from: f */
    public static void m108562f(View view, boolean z) {
        int i;
        View findViewById = view.findViewById(C35883Sg4.image_stream_toolbar);
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        findViewById.setVisibility(i);
        View findViewById2 = view.findViewById(C35883Sg4.image_stream_toolbar_container);
        if (findViewById2 != null) {
            if (!z) {
                i2 = 8;
            }
            findViewById2.setVisibility(i2);
        }
    }
}
