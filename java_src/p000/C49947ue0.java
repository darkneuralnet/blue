package p000;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"Lue0;", "", "Landroid/graphics/Canvas;", "canvas", "", "enable", "", C17296a.f69688o, "Ljava/lang/reflect/Method;", "b", "Ljava/lang/reflect/Method;", "reorderBarrierMethod", "c", "inorderBarrierMethod", DateTokenConverter.CONVERTER_KEY, "Z", "orderMethodsFetched", "<init>", "()V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCanvasUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CanvasUtils.android.kt\nandroidx/compose/ui/graphics/CanvasUtils\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,101:1\n26#2:102\n26#2:103\n*S KotlinDebug\n*F\n+ 1 CanvasUtils.android.kt\nandroidx/compose/ui/graphics/CanvasUtils\n*L\n54#1:102\n59#1:103\n*E\n"})
/* renamed from: ue0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49947ue0 {

    /* renamed from: a */
    public static final C49947ue0 f112691a = new C49947ue0();

    /* renamed from: b */
    public static Method f112692b;

    /* renamed from: c */
    public static Method f112693c;

    /* renamed from: d */
    public static boolean f112694d;

    private C49947ue0() {
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: a */
    public final void m9929a(Canvas canvas, boolean z) {
        Method method;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            C51725xe0.f117915a.m4912a(canvas, z);
            return;
        }
        if (!f112694d) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f112692b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f112693c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f112692b = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    f112693c = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                }
                Method method2 = f112692b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f112693c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f112694d = true;
        }
        if (z) {
            try {
                Method method4 = f112692b;
                if (method4 != null) {
                    Intrinsics.checkNotNull(method4);
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (!z && (method = f112693c) != null) {
            Intrinsics.checkNotNull(method);
            method.invoke(canvas, new Object[0]);
        }
    }
}
