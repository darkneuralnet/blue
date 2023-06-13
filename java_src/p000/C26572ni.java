package p000;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogInterface$OnCancelListenerC11663c;
/* renamed from: ni */
/* loaded from: classes.dex */
public class C26572ni extends DialogInterface$OnCancelListenerC11663c {
    public C26572ni() {
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c
    public Dialog onCreateDialog(Bundle bundle) {
        return new DialogC26167mi(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c
    public void setupDialog(Dialog dialog, int i) {
        if (dialog instanceof DialogC26167mi) {
            DialogC26167mi dialogC26167mi = (DialogC26167mi) dialog;
            if (i != 1 && i != 2) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            dialogC26167mi.supportRequestWindowFeature(1);
            return;
        }
        super.setupDialog(dialog, i);
    }

    public C26572ni(int i) {
        super(i);
    }
}
