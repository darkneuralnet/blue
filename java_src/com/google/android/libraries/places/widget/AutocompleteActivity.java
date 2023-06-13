package com.google.android.libraries.places.widget;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.C17646R;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import com.google.android.libraries.places.internal.zzev;
import com.google.android.libraries.places.internal.zzfl;
import com.google.android.libraries.places.internal.zzha;
import com.google.android.libraries.places.widget.internal.p033ui.AutocompleteImplFragment;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
/* loaded from: classes6.dex */
public class AutocompleteActivity extends AppCompatActivity implements PlaceSelectionListener {
    public static final int RESULT_ERROR = 2;
    static boolean zza = true;
    private int zzb;
    private int zzc;
    private boolean zzd;

    public AutocompleteActivity() {
        super(C17646R.C17649layout.places_autocomplete_activity);
        this.zzd = false;
    }

    private final void zzc(int i, Place place, Status status) {
        try {
            Intent intent = new Intent();
            if (place != null) {
                intent.putExtra("places/selected_place", place);
            }
            intent.putExtra("places/status", status);
            setResult(i, intent);
            finish();
        } catch (Error | RuntimeException e) {
            zzev.zzb(e);
            throw e;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public void onCreate(Bundle bundle) {
        boolean z;
        try {
            zzha.zzi(Places.isInitialized(), "Places must be initialized.");
            boolean z2 = false;
            if (zza) {
                if (getCallingActivity() != null) {
                    z = true;
                } else {
                    z = false;
                }
                zzha.zzi(z, "Cannot find caller. startActivityForResult should be used.");
            }
            zzfl zzflVar = (zzfl) getIntent().getParcelableExtra("places/AutocompleteOptions");
            zzflVar.getClass();
            AutocompleteActivityMode autocompleteActivityMode = AutocompleteActivityMode.FULLSCREEN;
            int ordinal = zzflVar.zzh().ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    this.zzb = C17646R.C17649layout.places_autocomplete_impl_fragment_overlay;
                    this.zzc = C17646R.style.PlacesAutocompleteOverlay;
                }
            } else {
                this.zzb = C17646R.C17649layout.places_autocomplete_impl_fragment_fullscreen;
                this.zzc = C17646R.style.PlacesAutocompleteFullscreen;
            }
            getSupportFragmentManager().m67282z1(new com.google.android.libraries.places.widget.internal.p033ui.zzh(this.zzb, this, zzflVar));
            setTheme(this.zzc);
            super.onCreate(bundle);
            final AutocompleteImplFragment autocompleteImplFragment = (AutocompleteImplFragment) getSupportFragmentManager().m67325l0(C17646R.C17648id.places_autocomplete_content);
            if (autocompleteImplFragment != null) {
                z2 = true;
            }
            zzha.zzh(z2);
            autocompleteImplFragment.zzh(this);
            final View findViewById = findViewById(16908290);
            findViewById.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.libraries.places.widget.zzb
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return AutocompleteActivity.this.zzb(autocompleteImplFragment, findViewById, view, motionEvent);
                }
            });
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zza
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AutocompleteActivity.this.zza(view);
                }
            });
            if (zzflVar.zzj().isEmpty()) {
                zzc(2, null, new Status((int) PlacesStatusCodes.INVALID_REQUEST, "Place Fields must not be empty."));
            }
        } catch (Error | RuntimeException e) {
            zzev.zzb(e);
            throw e;
        }
    }

    @Override // com.google.android.libraries.places.widget.listener.PlaceSelectionListener
    public void onError(@RecentlyNonNull Status status) {
        zzc(true != status.isCanceled() ? 2 : 0, null, status);
    }

    @Override // com.google.android.libraries.places.widget.listener.PlaceSelectionListener
    public void onPlaceSelected(@RecentlyNonNull Place place) {
        zzc(-1, place, Status.RESULT_SUCCESS);
    }

    public final /* synthetic */ void zza(View view) {
        if (this.zzd) {
            zzc(0, null, new Status(16));
        }
    }

    public final /* synthetic */ boolean zzb(AutocompleteImplFragment autocompleteImplFragment, View view, View view2, MotionEvent motionEvent) {
        this.zzd = false;
        View view3 = autocompleteImplFragment.getView();
        if (view3 == null || motionEvent.getY() <= view3.getBottom()) {
            return false;
        }
        this.zzd = true;
        view.performClick();
        return true;
    }
}
