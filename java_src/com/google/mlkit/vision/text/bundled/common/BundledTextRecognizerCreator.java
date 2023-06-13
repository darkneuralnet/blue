package com.google.mlkit.vision.text.bundled.common;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboo;
@KeepForSdk
@DynamiteApi
/* loaded from: classes6.dex */
public class BundledTextRecognizerCreator extends R77 {
    @Override // p000.S77
    public BinderC50415vQ6 newTextRecognizer(WO1 wo1) throws RemoteException {
        throw new RemoteException("Please use newTextRecognizerWithOptions instead.");
    }

    @Override // p000.S77
    public BinderC50415vQ6 newTextRecognizerWithOptions(WO1 wo1, zboo zbooVar) {
        return new BinderC50415vQ6((Context) Preconditions.checkNotNull((Context) BinderC36557Vd3.m79637d5(wo1)), zbooVar.m51265s(), zbooVar.m51263v(), zbooVar.m51264u());
    }
}
