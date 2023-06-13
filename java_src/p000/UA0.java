package p000;

import android.content.Context;
import android.content.DialogInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a4\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0000¨\u0006\b"}, m28432d2 = {"Landroid/content/Context;", "Lo31;", "dialogData", "Lkotlin/Function0;", "", "onPositiveClick", "onNegativeClick", "c", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: UA0 */
/* loaded from: classes5.dex */
public final class UA0 {
    /* renamed from: c */
    public static final void m81899c(Context context, C46047o31 dialogData, final Function0<Unit> function0, final Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(dialogData, "dialogData");
        new AM2(context).mo70285q(dialogData.m21924d()).mo70294h(dialogData.m21927a()).m115889H(dialogData.m21925c(), new DialogInterface.OnClickListener() { // from class: SA0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                UA0.m81898d(Function0.this, dialogInterface, i);
            }
        }).m115893D(dialogData.m21926b(), new DialogInterface.OnClickListener() { // from class: TA0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                UA0.m81897e(Function0.this, dialogInterface, i);
            }
        }).m70283s();
    }

    /* renamed from: d */
    public static final void m81898d(Function0 function0, DialogInterface dialogInterface, int i) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* renamed from: e */
    public static final void m81897e(Function0 function0, DialogInterface dialogInterface, int i) {
        if (function0 != null) {
            function0.invoke();
        }
    }
}
