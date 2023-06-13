package co.bird.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.C11164h;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.InterfaceC11183i;
import androidx.camera.view.PreviewView;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.widget.CameraxView;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.location.places.PlacesStatusCodes;
import com.stripe.android.financialconnections.domain.Entry;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23444H;
import java.io.File;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 Q2\u00020\u0001:\u0003R\u001f#B\u0011\b\u0016\u0012\u0006\u0010J\u001a\u00020I¢\u0006\u0004\bK\u0010LB\u0019\b\u0016\u0012\u0006\u0010J\u001a\u00020I\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\bK\u0010MB!\b\u0016\u0012\u0006\u0010J\u001a\u00020I\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010O\u001a\u00020N¢\u0006\u0004\bK\u0010PJ\u0014\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0014\u0010\t\u001a\u00020\u0004*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0014\u0010\n\u001a\u00020\u0004*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0014J\b\u0010\u0011\u001a\u00020\u0004H\u0014J\u0006\u0010\u0012\u001a\u00020\u0004J\u0006\u0010\u0013\u001a\u00020\u0004J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J*\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0017J\u0006\u0010\u001d\u001a\u00020\u0004R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R*\u0010.\u001a\u00020&2\u0006\u0010'\u001a\u00020&8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u00106\u001a\u00020/2\u0006\u0010'\u001a\u00020/8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R*\u0010>\u001a\u0002072\u0006\u0010'\u001a\u0002078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R*\u0010E\u001a\u00020\r2\u0006\u0010'\u001a\u00020\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0014\u0010H\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006S"}, m28432d2 = {"Lco/bird/android/widget/CameraxView;", "Landroid/widget/FrameLayout;", "Landroid/util/AttributeSet;", "attrs", "", "o", "Lxq2;", "Ljava/lang/Runnable;", "runnable", "q", "r", "v", "m", "", "l", "u", "onAttachedToWindow", "onDetachedFromWindow", "y", "z", "Lio/reactivex/F;", "Landroid/graphics/Bitmap;", "A", "", "directory", "filePrefix", "fileExt", "Landroid/net/Uri;", "x", "B", "Landroidx/camera/view/PreviewView;", "b", "Landroidx/camera/view/PreviewView;", "cameraView", "Ljava/util/concurrent/Executor;", "c", "Ljava/util/concurrent/Executor;", "mainExecutor", "Lco/bird/android/widget/CameraxView$c;", "value", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/widget/CameraxView$c;", "getSelectedCamera", "()Lco/bird/android/widget/CameraxView$c;", "setSelectedCamera", "(Lco/bird/android/widget/CameraxView$c;)V", "selectedCamera", "Lco/bird/android/widget/CameraxView$b;", "e", "Lco/bird/android/widget/CameraxView$b;", "n", "()Lco/bird/android/widget/CameraxView$b;", "setFlash", "(Lco/bird/android/widget/CameraxView$b;)V", "flash", "", "f", "F", "getZoomLevel", "()F", "setZoomLevel", "(F)V", "zoomLevel", "g", "Z", "getPinchToZoomEnabled", "()Z", "setPinchToZoomEnabled", "(Z)V", "pinchToZoomEnabled", "h", "Lxq2;", "cameraController", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "i", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class CameraxView extends FrameLayout {

    /* renamed from: i */
    public static final C16475a f67234i = new C16475a(null);

    /* renamed from: b */
    public final PreviewView f67235b;

    /* renamed from: c */
    public final Executor f67236c;

    /* renamed from: d */
    public EnumC16480c f67237d;

    /* renamed from: e */
    public EnumC16478b f67238e;

    /* renamed from: f */
    public float f67239f;

    /* renamed from: g */
    public boolean f67240g;

    /* renamed from: h */
    public final C51847xq2 f67241h;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/widget/CameraxView$a;", "", "", "CAMERA_ATTACH_TIMEOUT_MS", "J", "", "REQUEST_CODE_CAMERA_PERMISSIONS", "I", "<init>", "()V", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.CameraxView$a */
    /* loaded from: classes4.dex */
    public static final class C16475a {

        @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J/\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/widget/CameraxView$a$a;", "Landroidx/fragment/app/Fragment;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "onAttach", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Lco/bird/android/widget/CameraxView$a$a$a;", "b", "Lco/bird/android/widget/CameraxView$a$a$a;", "getPermissionCallback", "()Lco/bird/android/widget/CameraxView$a$a$a;", "a5", "(Lco/bird/android/widget/CameraxView$a$a$a;)V", "permissionCallback", "<init>", "()V", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.widget.CameraxView$a$a */
        /* loaded from: classes4.dex */
        public static final class C16476a extends Fragment {

            /* renamed from: b */
            public InterfaceC16477a f67242b;

            @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/widget/CameraxView$a$a$a;", "", "", "granted", "", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
            /* renamed from: co.bird.android.widget.CameraxView$a$a$a */
            /* loaded from: classes4.dex */
            public interface InterfaceC16477a {
                /* renamed from: a */
                void mo54648a(boolean z);
            }

            /* renamed from: a5 */
            public final void m54654a5(InterfaceC16477a interfaceC16477a) {
                this.f67242b = interfaceC16477a;
            }

            @Override // androidx.fragment.app.Fragment
            public void onAttach(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                super.onAttach(context);
                requestPermissions(new String[]{"android.permission.CAMERA"}, PlacesStatusCodes.KEY_INVALID);
            }

            @Override // androidx.fragment.app.Fragment
            public void onRequestPermissionsResult(int i, String[] permissions, int[] grantResults) {
                Integer orNull;
                Intrinsics.checkNotNullParameter(permissions, "permissions");
                Intrinsics.checkNotNullParameter(grantResults, "grantResults");
                super.onRequestPermissionsResult(i, permissions, grantResults);
                InterfaceC16477a interfaceC16477a = this.f67242b;
                if (interfaceC16477a != null) {
                    boolean z = false;
                    orNull = ArraysKt___ArraysKt.getOrNull(grantResults, 0);
                    if (orNull != null && orNull.intValue() == 0) {
                        z = true;
                    }
                    interfaceC16477a.mo54648a(z);
                }
            }
        }

        public /* synthetic */ C16475a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16475a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004j\u0002\b\u0003j\u0002\b\u0005j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m28432d2 = {"Lco/bird/android/widget/CameraxView$b;", "", "", "b", "", "c", "<init>", "(Ljava/lang/String;I)V", DateTokenConverter.CONVERTER_KEY, "e", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.CameraxView$b */
    /* loaded from: classes4.dex */
    public enum EnumC16478b {
        OFF,
        ON,
        AUTO,
        TORCH;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.widget.CameraxView$b$a */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C16479a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC16478b.values().length];
                try {
                    iArr[EnumC16478b.OFF.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC16478b.ON.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC16478b.AUTO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC16478b.TORCH.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* renamed from: b */
        public final int m54652b() {
            int i = C16479a.$EnumSwitchMapping$0[ordinal()];
            if (i == 1) {
                return 2;
            }
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    return 0;
                }
            }
            return 1;
        }

        /* renamed from: c */
        public final boolean m54651c() {
            return C16479a.$EnumSwitchMapping$0[ordinal()] == 4;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002j\u0002\b\u0003j\u0002\b\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/widget/CameraxView$c;", "", "Lic0;", "b", "<init>", "(Ljava/lang/String;I)V", "c", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.CameraxView$c */
    /* loaded from: classes4.dex */
    public enum EnumC16480c {
        FRONT,
        BACK;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.widget.CameraxView$c$a */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C16481a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC16480c.values().length];
                try {
                    iArr[EnumC16480c.FRONT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC16480c.BACK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* renamed from: b */
        public final C42812ic0 m54649b() {
            int i = C16481a.$EnumSwitchMapping$0[ordinal()];
            if (i != 1) {
                if (i == 2) {
                    C42812ic0 DEFAULT_BACK_CAMERA = C42812ic0.f87522c;
                    Intrinsics.checkNotNullExpressionValue(DEFAULT_BACK_CAMERA, "DEFAULT_BACK_CAMERA");
                    return DEFAULT_BACK_CAMERA;
                }
                throw new NoWhenBranchMatchedException();
            }
            C42812ic0 DEFAULT_FRONT_CAMERA = C42812ic0.f87521b;
            Intrinsics.checkNotNullExpressionValue(DEFAULT_FRONT_CAMERA, "DEFAULT_FRONT_CAMERA");
            return DEFAULT_FRONT_CAMERA;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"co/bird/android/widget/CameraxView$d", "Lco/bird/android/widget/CameraxView$a$a$a;", "", "granted", "", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.CameraxView$d */
    /* loaded from: classes4.dex */
    public static final class C16482d implements C16475a.C16476a.InterfaceC16477a {

        /* renamed from: a */
        public final /* synthetic */ AppCompatActivity f67251a;

        /* renamed from: b */
        public final /* synthetic */ C16475a.C16476a f67252b;

        /* renamed from: c */
        public final /* synthetic */ CameraxView f67253c;

        public C16482d(AppCompatActivity appCompatActivity, C16475a.C16476a c16476a, CameraxView cameraxView) {
            this.f67251a = appCompatActivity;
            this.f67252b = c16476a;
            this.f67253c = cameraxView;
        }

        @Override // co.bird.android.widget.CameraxView.C16475a.C16476a.InterfaceC16477a
        /* renamed from: a */
        public void mo54648a(boolean z) {
            this.f67251a.getSupportFragmentManager().m67311q().mo67105s(this.f67252b).mo67114j();
            if (z) {
                this.f67253c.m54659v();
            } else {
                C41318g46.m40163a("camera permission not granted in CameraxView, the user was prompted", new Object[0]);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/H;", "Landroid/net/Uri;", "emitter", "", "invoke", "(Lio/reactivex/H;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.CameraxView$e */
    /* loaded from: classes4.dex */
    public static final class C16483e extends Lambda implements Function1<InterfaceC23444H<Uri>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ C11164h.C11180n f67255h;

        @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, m28432d2 = {"co/bird/android/widget/CameraxView$e$a", "Landroidx/camera/core/h$m;", "Landroidx/camera/core/h$o;", "outputFileResults", "", C17296a.f69688o, "Landroidx/camera/core/ImageCaptureException;", "exception", "b", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.widget.CameraxView$e$a */
        /* loaded from: classes4.dex */
        public static final class C16484a implements C11164h.InterfaceC11179m {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC23444H<Uri> f67256a;

            public C16484a(InterfaceC23444H<Uri> interfaceC23444H) {
                this.f67256a = interfaceC23444H;
            }

            @Override // androidx.camera.core.C11164h.InterfaceC11179m
            /* renamed from: a */
            public void mo54009a(C11164h.C11182o outputFileResults) {
                Intrinsics.checkNotNullParameter(outputFileResults, "outputFileResults");
                Uri m69481a = outputFileResults.m69481a();
                if (m69481a != null) {
                    this.f67256a.onSuccess(m69481a);
                    return;
                }
                InterfaceC23444H<Uri> interfaceC23444H = this.f67256a;
                interfaceC23444H.onError(new NullPointerException("No uri returned in outputFileResults: " + outputFileResults));
            }

            @Override // androidx.camera.core.C11164h.InterfaceC11179m
            /* renamed from: b */
            public void mo54008b(ImageCaptureException exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.f67256a.onError(exception);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16483e(C11164h.C11180n c11180n) {
            super(1);
            this.f67255h = c11180n;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23444H<Uri> interfaceC23444H) {
            invoke2(interfaceC23444H);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC23444H<Uri> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            CameraxView.this.f67241h.m30254O(this.f67255h, NA0.m94296h(CameraxView.this.getContext()), new C16484a(emitter));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/H;", "Landroid/graphics/Bitmap;", "emitter", "", "invoke", "(Lio/reactivex/H;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.CameraxView$f */
    /* loaded from: classes4.dex */
    public static final class C16485f extends Lambda implements Function1<InterfaceC23444H<Bitmap>, Unit> {

        @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, m28432d2 = {"co/bird/android/widget/CameraxView$f$a", "Landroidx/camera/core/h$l;", "Landroidx/camera/core/i;", Entry.TYPE_IMAGE, "", C17296a.f69688o, "Landroidx/camera/core/ImageCaptureException;", "exception", "b", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.widget.CameraxView$f$a */
        /* loaded from: classes4.dex */
        public static final class C16486a extends C11164h.AbstractC11178l {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC23444H<Bitmap> f67258a;

            public C16486a(InterfaceC23444H<Bitmap> interfaceC23444H) {
                this.f67258a = interfaceC23444H;
            }

            @Override // androidx.camera.core.C11164h.AbstractC11178l
            /* renamed from: a */
            public void mo54647a(InterfaceC11183i image) {
                Intrinsics.checkNotNullParameter(image, "image");
                super.mo54647a(image);
                try {
                    Bitmap bitmapFromImageProxy$default = C25708lU.getBitmapFromImageProxy$default(image, null, 0, 0, 14, null);
                    image.close();
                    this.f67258a.onSuccess(bitmapFromImageProxy$default);
                } catch (Exception e) {
                    C41318g46.m40158f(e, "Exception while parsing bitmap, erroring out", new Object[0]);
                    image.close();
                    this.f67258a.onError(e);
                }
            }

            @Override // androidx.camera.core.C11164h.AbstractC11178l
            /* renamed from: b */
            public void mo54646b(ImageCaptureException exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                super.mo54646b(exception);
                this.f67258a.onError(exception);
            }
        }

        public C16485f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23444H<Bitmap> interfaceC23444H) {
            invoke2(interfaceC23444H);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC23444H<Bitmap> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            CameraxView.this.f67241h.m30253P(NA0.m94296h(CameraxView.this.getContext()), new C16486a(emitter));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraxView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Executor m94296h = NA0.m94296h(getContext());
        Intrinsics.checkNotNullExpressionValue(m94296h, "getMainExecutor(context)");
        this.f67236c = m94296h;
        this.f67237d = EnumC16480c.BACK;
        this.f67238e = EnumC16478b.OFF;
        this.f67241h = new C51847xq2(getContext());
        this.f67235b = new PreviewView(context);
        m54665p(this, null, 1, null);
    }

    /* renamed from: h */
    public static final void m54673h(CameraxView this$0) {
        boolean z;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int m54652b = this$0.f67238e.m54652b();
        boolean m54651c = this$0.f67238e.m54651c();
        C41318g46.m40163a("setting flash mode to " + m54652b, new Object[0]);
        this$0.f67241h.m30266B(m54652b);
        C41318g46.m40163a("setting torch enabled: " + m54651c, new Object[0]);
        this$0.f67241h.m30242h(m54651c);
        InterfaceC33728Jb0 m30239k = this$0.f67241h.m30239k();
        if (m30239k != null && !m30239k.mo100137f()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C41318g46.m40163a("zero shutter lag mode enabled", new Object[0]);
            this$0.f67241h.m30265C(2);
            return;
        }
        C41318g46.m40163a("zero shutter lag is not available on this device, falling back to minimize latency.", new Object[0]);
        this$0.f67241h.m30265C(1);
    }

    /* renamed from: i */
    public static final void m54672i(CameraxView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean z = this$0.f67240g;
        C41318g46.m40163a("setting pinch to zoom enabled: " + z, new Object[0]);
        this$0.f67241h.m30263E(this$0.f67240g);
    }

    /* renamed from: j */
    public static final void m54671j(CameraxView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C42812ic0 m54649b = this$0.f67237d.m54649b();
        if (this$0.f67241h.m30236n(m54649b)) {
            C41318g46.m40163a("updating selected camera to " + m54649b, new Object[0]);
            this$0.f67241h.m30267A(m54649b);
            return;
        }
        C41318g46.m40163a("selected camera (" + m54649b + ") is not available, not updating camera!!!", new Object[0]);
    }

    /* renamed from: k */
    public static final void m54670k(CameraxView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        float f = this$0.f67239f;
        C41318g46.m40163a("setting linear zoom to " + f, new Object[0]);
        this$0.f67241h.m30264D(this$0.f67239f);
    }

    /* renamed from: p */
    public static /* synthetic */ void m54665p(CameraxView cameraxView, AttributeSet attributeSet, int i, Object obj) {
        if ((i & 1) != 0) {
            attributeSet = null;
        }
        cameraxView.m54666o(attributeSet);
    }

    /* renamed from: s */
    public static final void m54662s(final CameraxView this$0, final Runnable runnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        if (this$0.f67241h.m30239k() != null) {
            runnable.run();
            return;
        }
        Handler handler = this$0.getHandler();
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.postDelayed(new Runnable() { // from class: Hc0
            @Override // java.lang.Runnable
            public final void run() {
                CameraxView.m54661t(CameraxView.this, runnable);
            }
        }, 250L);
    }

    public static /* synthetic */ AbstractC23442F savePicture$default(CameraxView cameraxView, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cameraxView.getContext().getCacheDir().getAbsolutePath() + "/photo";
        }
        if ((i & 2) != 0) {
            str2 = "bird_";
        }
        if ((i & 4) != 0) {
            str3 = ".jpg";
        }
        return cameraxView.m54657x(str, str2, str3);
    }

    /* renamed from: t */
    public static final void m54661t(CameraxView this$0, Runnable runnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        if (this$0.f67241h.m30239k() != null) {
            runnable.run();
        } else {
            C41318g46.m40163a("Did not find a camera attached to camera controller after 250ms delay, not calling runnable in onInitializedWithCamera", new Object[0]);
        }
    }

    /* renamed from: w */
    public static final void m54658w(CameraxView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C41318g46.m40163a("setting controller to preview view now", new Object[0]);
        this$0.f67235b.setController(this$0.f67241h);
        this$0.f67241h.m30262F(true);
    }

    /* renamed from: A */
    public final AbstractC23442F<Bitmap> m54682A() {
        return C45832nh5.m23305k(new C16485f());
    }

    /* renamed from: B */
    public final void m54681B() {
        EnumC16478b enumC16478b = this.f67238e;
        EnumC16478b enumC16478b2 = EnumC16478b.TORCH;
        if (enumC16478b == enumC16478b2 || enumC16478b == EnumC16478b.ON) {
            enumC16478b2 = EnumC16478b.OFF;
        }
        setFlash(enumC16478b2);
    }

    /* renamed from: l */
    public final boolean m54669l() {
        return getContext().checkSelfPermission("android.permission.CAMERA") == 0;
    }

    /* renamed from: m */
    public final void m54668m() {
        if (m54669l()) {
            m54659v();
        } else {
            m54660u();
        }
    }

    /* renamed from: n */
    public final EnumC16478b m54667n() {
        return this.f67238e;
    }

    /* renamed from: o */
    public final void m54666o(AttributeSet attributeSet) {
        addView(this.f67235b);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, C34056Kl4.CameraxView, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.theme.obtainStyl…raxView,\n      0, 0\n    )");
        setPinchToZoomEnabled(obtainStyledAttributes.getBoolean(C34056Kl4.CameraxView_allowZoom, false));
        setFlash(EnumC16478b.values()[obtainStyledAttributes.getInt(C34056Kl4.CameraxView_cameraFlashType, 0)]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m54668m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f67241h.m4565U();
    }

    /* renamed from: q */
    public final void m54664q(C51847xq2 c51847xq2, Runnable runnable) {
        this.f67241h.m30238l().addListener(runnable, this.f67236c);
    }

    /* renamed from: r */
    public final void m54663r(C51847xq2 c51847xq2, final Runnable runnable) {
        this.f67241h.m30238l().addListener(new Runnable() { // from class: Gc0
            @Override // java.lang.Runnable
            public final void run() {
                CameraxView.m54662s(CameraxView.this, runnable);
            }
        }, this.f67236c);
    }

    public final void setFlash(EnumC16478b value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f67238e = value;
        m54663r(this.f67241h, new Runnable() { // from class: Dc0
            @Override // java.lang.Runnable
            public final void run() {
                CameraxView.m54673h(CameraxView.this);
            }
        });
    }

    public final void setPinchToZoomEnabled(boolean z) {
        this.f67240g = z;
        m54663r(this.f67241h, new Runnable() { // from class: Ec0
            @Override // java.lang.Runnable
            public final void run() {
                CameraxView.m54672i(CameraxView.this);
            }
        });
    }

    public final void setSelectedCamera(EnumC16480c value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f67237d = value;
        m54663r(this.f67241h, new Runnable() { // from class: Bc0
            @Override // java.lang.Runnable
            public final void run() {
                CameraxView.m54671j(CameraxView.this);
            }
        });
    }

    public final void setZoomLevel(float f) {
        float coerceIn;
        coerceIn = RangesKt___RangesKt.coerceIn(f, 0.0f, 1.0f);
        this.f67239f = coerceIn;
        m54663r(this.f67241h, new Runnable() { // from class: Fc0
            @Override // java.lang.Runnable
            public final void run() {
                CameraxView.m54670k(CameraxView.this);
            }
        });
    }

    /* renamed from: u */
    public final void m54660u() {
        AppCompatActivity appCompatActivity;
        Context context = getContext();
        if (context instanceof AppCompatActivity) {
            appCompatActivity = (AppCompatActivity) context;
        } else {
            appCompatActivity = null;
        }
        if (appCompatActivity == null) {
            return;
        }
        C16475a.C16476a c16476a = new C16475a.C16476a();
        c16476a.m54654a5(new C16482d(appCompatActivity, c16476a, this));
        appCompatActivity.getSupportFragmentManager().m67311q().m67119e(c16476a, "CameraPermissionFragment").mo67114j();
    }

    /* renamed from: v */
    public final void m54659v() {
        LifecycleOwner m87653a = C35534Qt6.m87653a(this);
        if (m87653a != null) {
            C41318g46.m40163a("binding camera controller to lifecycle now", new Object[0]);
            this.f67241h.m4566T(m87653a);
        }
        C41318g46.m40163a("initializing camera controller", new Object[0]);
        m54664q(this.f67241h, new Runnable() { // from class: Cc0
            @Override // java.lang.Runnable
            public final void run() {
                CameraxView.m54658w(CameraxView.this);
            }
        });
    }

    /* renamed from: x */
    public final AbstractC23442F<Uri> m54657x(String directory, String filePrefix, String fileExt) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(filePrefix, "filePrefix");
        Intrinsics.checkNotNullParameter(fileExt, "fileExt");
        File file = new File(directory);
        if (!file.exists()) {
            try {
                file.mkdirs();
            } catch (Exception e) {
                C41318g46.m40158f(e, "Could not create directories for storing identification photo", new Object[0]);
                AbstractC23442F<Uri> m33100x = AbstractC23442F.m33100x(e);
                Intrinsics.checkNotNullExpressionValue(m33100x, "error(e)");
                return m33100x;
            }
        }
        C11164h.C11180n m69483a = new C11164h.C11180n.C11181a(File.createTempFile(filePrefix, fileExt, file)).m69482b(new C11164h.C11177k()).m69483a();
        Intrinsics.checkNotNullExpressionValue(m69483a, "Builder(file)\n      .set…()\n      )\n      .build()");
        return C45832nh5.m23305k(new C16483e(m69483a));
    }

    /* renamed from: y */
    public final void m54656y() {
    }

    /* renamed from: z */
    public final void m54655z() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraxView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Executor m94296h = NA0.m94296h(getContext());
        Intrinsics.checkNotNullExpressionValue(m94296h, "getMainExecutor(context)");
        this.f67236c = m94296h;
        this.f67237d = EnumC16480c.BACK;
        this.f67238e = EnumC16478b.OFF;
        this.f67241h = new C51847xq2(getContext());
        this.f67235b = new PreviewView(context, attrs);
        m54666o(attrs);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraxView(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Executor m94296h = NA0.m94296h(getContext());
        Intrinsics.checkNotNullExpressionValue(m94296h, "getMainExecutor(context)");
        this.f67236c = m94296h;
        this.f67237d = EnumC16480c.BACK;
        this.f67238e = EnumC16478b.OFF;
        this.f67241h = new C51847xq2(getContext());
        this.f67235b = new PreviewView(context, attrs, i);
        m54666o(attrs);
    }
}
