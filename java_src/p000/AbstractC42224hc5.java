package p000;

import android.app.Dialog;
import android.os.Bundle;
import com.google.android.material.bottomsheet.DialogC17707a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0017¨\u0006\n"}, m28432d2 = {"Lhc5;", "Lmi1;", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "", "getTheme", "<init>", "()V", "bottom-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: hc5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC42224hc5 extends AbstractC45245mi1 {
    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c
    public int getTheme() {
        return C32184Cl4.RoundedBottomSheet;
    }

    @Override // com.google.android.material.bottomsheet.C17714b, p000.C26572ni, androidx.fragment.app.DialogInterface$OnCancelListenerC11663c
    public Dialog onCreateDialog(Bundle bundle) {
        return new DialogC17707a(requireContext(), C32184Cl4.RoundedBottomSheet);
    }
}
