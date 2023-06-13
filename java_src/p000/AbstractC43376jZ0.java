package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.zac;
import java.util.LinkedList;
import p000.InterfaceC31759Aq2;
@KeepForSdk
/* renamed from: jZ0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC43376jZ0<T extends InterfaceC31759Aq2> {

    /* renamed from: a */
    public InterfaceC31759Aq2 f92922a;

    /* renamed from: b */
    public Bundle f92923b;

    /* renamed from: c */
    public LinkedList f92924c;

    /* renamed from: d */
    public final InterfaceC46403of3 f92925d = new FP6(this);

    @KeepForSdk
    /* renamed from: k */
    public static void m30332k(FrameLayout frameLayout) {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        Context context = frameLayout.getContext();
        int isGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(context);
        String zad = zac.zad(context, isGooglePlayServicesAvailable);
        String zac = zac.zac(context, isGooglePlayServicesAvailable);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(zad);
        linearLayout.addView(textView);
        Intent errorResolutionIntent = googleApiAvailability.getErrorResolutionIntent(context, isGooglePlayServicesAvailable, null);
        if (errorResolutionIntent != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(zac);
            linearLayout.addView(button);
            button.setOnClickListener(new TP6(context, errorResolutionIntent));
        }
    }

    @KeepForSdk
    /* renamed from: a */
    public abstract void mo22167a(InterfaceC46403of3<T> interfaceC46403of3);

    @KeepForSdk
    /* renamed from: b */
    public T m30341b() {
        return (T) this.f92922a;
    }

    @KeepForSdk
    /* renamed from: c */
    public void m30340c(Bundle bundle) {
        m30326q(bundle, new MP6(this, bundle));
    }

    @KeepForSdk
    /* renamed from: d */
    public void m30339d() {
        InterfaceC31759Aq2 interfaceC31759Aq2 = this.f92922a;
        if (interfaceC31759Aq2 != null) {
            interfaceC31759Aq2.onDestroy();
        } else {
            m30327p(1);
        }
    }

    @KeepForSdk
    /* renamed from: e */
    public void m30338e() {
        InterfaceC31759Aq2 interfaceC31759Aq2 = this.f92922a;
        if (interfaceC31759Aq2 != null) {
            interfaceC31759Aq2.onLowMemory();
        }
    }

    @KeepForSdk
    /* renamed from: f */
    public void m30337f() {
        InterfaceC31759Aq2 interfaceC31759Aq2 = this.f92922a;
        if (interfaceC31759Aq2 != null) {
            interfaceC31759Aq2.onPause();
        } else {
            m30327p(5);
        }
    }

    @KeepForSdk
    /* renamed from: g */
    public void m30336g() {
        m30326q(null, new ZP6(this));
    }

    @KeepForSdk
    /* renamed from: h */
    public void m30335h(Bundle bundle) {
        InterfaceC31759Aq2 interfaceC31759Aq2 = this.f92922a;
        if (interfaceC31759Aq2 != null) {
            interfaceC31759Aq2.onSaveInstanceState(bundle);
            return;
        }
        Bundle bundle2 = this.f92923b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    @KeepForSdk
    /* renamed from: i */
    public void m30334i() {
        m30326q(null, new XP6(this));
    }

    @KeepForSdk
    /* renamed from: j */
    public void m30333j() {
        InterfaceC31759Aq2 interfaceC31759Aq2 = this.f92922a;
        if (interfaceC31759Aq2 != null) {
            interfaceC31759Aq2.onStop();
        } else {
            m30327p(4);
        }
    }

    /* renamed from: p */
    public final void m30327p(int i) {
        while (!this.f92924c.isEmpty() && ((InterfaceC39133cQ6) this.f92924c.getLast()).zaa() >= i) {
            this.f92924c.removeLast();
        }
    }

    /* renamed from: q */
    public final void m30326q(Bundle bundle, InterfaceC39133cQ6 interfaceC39133cQ6) {
        InterfaceC31759Aq2 interfaceC31759Aq2 = this.f92922a;
        if (interfaceC31759Aq2 != null) {
            interfaceC39133cQ6.mo61415a(interfaceC31759Aq2);
            return;
        }
        if (this.f92924c == null) {
            this.f92924c = new LinkedList();
        }
        this.f92924c.add(interfaceC39133cQ6);
        if (bundle != null) {
            Bundle bundle2 = this.f92923b;
            if (bundle2 == null) {
                this.f92923b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        mo22167a(this.f92925d);
    }
}
