package p000;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: jk2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C43487jk2 {

    /* renamed from: a */
    public static boolean f93256a = false;

    /* renamed from: b */
    public static Method f93257b = null;

    /* renamed from: c */
    public static boolean f93258c = false;

    /* renamed from: d */
    public static Field f93259d;

    /* renamed from: jk2$a */
    /* loaded from: classes.dex */
    public interface InterfaceC24999a {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    private C43487jk2() {
    }

    /* renamed from: a */
    public static boolean m30013a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f93256a) {
            try {
                f93257b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f93256a = true;
        }
        Method method = f93257b;
        if (method != null) {
            try {
                Object invoke = method.invoke(actionBar, keyEvent);
                if (invoke == null) {
                    return false;
                }
                return ((Boolean) invoke).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m30012b(Activity activity, KeyEvent keyEvent) {
        KeyEvent.DispatcherState dispatcherState;
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m30013a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C38790bq6.m62481h(decorView, keyEvent)) {
            return true;
        }
        if (decorView != null) {
            dispatcherState = decorView.getKeyDispatcherState();
        } else {
            dispatcherState = null;
        }
        return keyEvent.dispatch(activity, dispatcherState, activity);
    }

    /* renamed from: c */
    public static boolean m30011c(Dialog dialog, KeyEvent keyEvent) {
        KeyEvent.DispatcherState dispatcherState;
        DialogInterface.OnKeyListener m30008f = m30008f(dialog);
        if (m30008f != null && m30008f.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C38790bq6.m62481h(decorView, keyEvent)) {
            return true;
        }
        if (decorView != null) {
            dispatcherState = decorView.getKeyDispatcherState();
        } else {
            dispatcherState = null;
        }
        return keyEvent.dispatch(dialog, dispatcherState, dialog);
    }

    /* renamed from: d */
    public static boolean m30010d(View view, KeyEvent keyEvent) {
        return C38790bq6.m62479i(view, keyEvent);
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: e */
    public static boolean m30009e(InterfaceC24999a interfaceC24999a, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (interfaceC24999a == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return interfaceC24999a.superDispatchKeyEvent(keyEvent);
        }
        if (callback instanceof Activity) {
            return m30012b((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return m30011c((Dialog) callback, keyEvent);
        }
        if ((view == null || !C38790bq6.m62481h(view, keyEvent)) && !interfaceC24999a.superDispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static DialogInterface.OnKeyListener m30008f(Dialog dialog) {
        if (!f93258c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f93259d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f93258c = true;
        }
        Field field = f93259d;
        if (field != null) {
            try {
                return (DialogInterface.OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused2) {
                return null;
            }
        }
        return null;
    }
}
