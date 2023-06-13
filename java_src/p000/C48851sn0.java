package p000;

import android.content.DialogInterface;
import android.widget.Button;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.AlarmCommand;
import co.bird.android.model.LightsCommand;
import co.bird.android.model.LockCommand;
import co.bird.android.model.SleepCommand;
import co.bird.android.model.SoftResetCommand;
import co.bird.android.model.UnlockBatteryCommand;
import co.bird.android.model.UnlockCableCommand;
import co.bird.android.model.UnlockCommand;
import co.bird.android.model.UnlockHelmetCommand;
import co.bird.android.model.VehicleCommand;
import co.bird.android.model.VehicleCommandKt;
import co.bird.android.model.WakeCommand;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0003R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, m28432d2 = {"Lsn0;", "LxE;", "Lio/reactivex/Observable;", "", "J4", "Lco/bird/android/model/VehicleCommand;", "command", "Pl", "dismiss", "Ln31;", "b", "Ln31;", "binding", "Landroid/content/DialogInterface;", "c", "Landroid/content/DialogInterface;", "dialog", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Ln31;Landroid/content/DialogInterface;)V", "co.bird.android.feature.lib.command"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: sn0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48851sn0 extends AbstractC30071xE {

    /* renamed from: b */
    public final C45454n31 f109236b;

    /* renamed from: c */
    public final DialogInterface f109237c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48851sn0(BaseActivity activity, C45454n31 binding, DialogInterface dialog) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.f109236b = binding;
        this.f109237c = dialog;
    }

    /* renamed from: J4 */
    public final Observable<Unit> m13678J4() {
        Button button = this.f109236b.f99271c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.okay");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: Pl */
    public final void m13677Pl(VehicleCommand command) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(command, "command");
        if (command instanceof LockCommand) {
            if (VehicleCommandKt.isBluetooth(command.getMethod())) {
                i = C45871nl4.command_center_bluetooth_lock_error_title;
            } else {
                i = C45871nl4.command_center_cellular_lock_error_title;
            }
        } else {
            boolean z3 = true;
            if (command instanceof UnlockCommand) {
                z = true;
            } else {
                z = command instanceof UnlockBatteryCommand;
            }
            if (z) {
                z2 = true;
            } else {
                z2 = command instanceof UnlockCableCommand;
            }
            if (!z2) {
                z3 = command instanceof UnlockHelmetCommand;
            }
            if (z3) {
                if (VehicleCommandKt.isBluetooth(command.getMethod())) {
                    i = C45871nl4.command_center_bluetooth_unlock_error_title;
                } else {
                    i = C45871nl4.command_center_cellular_unlock_error_title;
                }
            } else if (command instanceof AlarmCommand) {
                i = C45871nl4.command_center_bluetooth_chirp_error_title;
            } else if (command instanceof LightsCommand) {
                i = C45871nl4.command_center_bluetooth_flash_error_title;
            } else if (command instanceof SleepCommand) {
                if (VehicleCommandKt.isBluetooth(command.getMethod())) {
                    i = C45871nl4.command_center_bluetooth_sleep_error_title;
                } else {
                    i = C45871nl4.command_center_cellular_sleep_error_title;
                }
            } else if (command instanceof WakeCommand) {
                i = C45871nl4.command_center_bluetooth_wake_error_title;
            } else if (command instanceof SoftResetCommand) {
                i = C45871nl4.command_center_bluetooth_soft_reset_error_title;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (VehicleCommandKt.isBluetooth(command.getMethod())) {
            i2 = C45871nl4.command_center_bluetooth_error_reasons;
        } else {
            i2 = C45871nl4.command_center_cellular_error_reasons;
        }
        this.f109236b.f99274f.setText(getActivity().getString(i));
        this.f109236b.f99272d.setText(getActivity().getString(i2));
    }

    public final void dismiss() {
        this.f109237c.dismiss();
    }
}
