package p000;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
/* renamed from: iY7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class FragmentC42781iY7 extends Fragment {

    /* renamed from: b */
    public int f87470b;

    /* renamed from: c */
    public RunnableC38541bQ7 f87471c;

    /* renamed from: d */
    public boolean f87472d;

    /* renamed from: b */
    public final void m33817b(Task task) {
        if (!this.f87472d) {
            this.f87472d = true;
            Activity activity = getActivity();
            activity.getFragmentManager().beginTransaction().remove(this).commit();
            if (task != null) {
                C12186at.m65329i(activity, this.f87470b, task);
            } else {
                C12186at.m65330h(activity, this.f87470b, 0, new Intent());
            }
        }
    }

    /* renamed from: c */
    public final void m33816c() {
        RunnableC38541bQ7 runnableC38541bQ7 = this.f87471c;
        if (runnableC38541bQ7 != null) {
            runnableC38541bQ7.m64538b(this);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f87470b = getArguments().getInt("requestCode");
        if (C12186at.f56481b != getArguments().getLong("initializationElapsedRealtime")) {
            this.f87471c = null;
        } else {
            this.f87471c = (RunnableC38541bQ7) RunnableC38541bQ7.f57480f.get(getArguments().getInt("resolveCallId"));
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("delivered")) {
            z = true;
        }
        this.f87472d = z;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m33816c();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        RunnableC38541bQ7 runnableC38541bQ7 = this.f87471c;
        if (runnableC38541bQ7 != null) {
            runnableC38541bQ7.m64537c(this);
            return;
        }
        if (Log.isLoggable("AutoResolveHelper", 5)) {
            Log.w("AutoResolveHelper", "Sending canceled result for garbage collected task!");
        }
        m33817b(null);
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("delivered", this.f87472d);
        m33816c();
    }
}
