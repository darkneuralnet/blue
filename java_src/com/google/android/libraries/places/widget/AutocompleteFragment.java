package com.google.android.libraries.places.widget;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.C17646R;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.internal.zzev;
import com.google.android.libraries.places.internal.zzfj;
import com.google.android.libraries.places.internal.zzha;
import com.google.android.libraries.places.internal.zzhs;
import com.google.android.libraries.places.widget.Autocomplete;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import java.util.List;
@Deprecated
/* loaded from: classes6.dex */
public class AutocompleteFragment extends Fragment {
    private View zza;
    private View zzb;
    private EditText zzc;
    private LocationBias zzd;
    private LocationRestriction zze;
    private String zzf;
    private TypeFilter zzg;
    private zzhs zzh;
    private PlaceSelectionListener zzi;

    private final void zzb() {
        int i;
        boolean isEmpty = this.zzc.getText().toString().isEmpty();
        View view = this.zzb;
        if (true != isEmpty) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        try {
            getView().setEnabled(true);
            if (i == 30421) {
                if (this.zzi == null) {
                    if (Log.isLoggable("Places", 5)) {
                        Log.w("Places", "No PlaceSelectionListener is set. No result will be delivered.");
                    }
                } else if (i2 == -1) {
                    Place placeFromIntent = Autocomplete.getPlaceFromIntent(intent);
                    this.zzi.onPlaceSelected(placeFromIntent);
                    setText(placeFromIntent.getName());
                } else if (i2 == 2) {
                    this.zzi.onError(Autocomplete.getStatusFromIntent(intent));
                    i2 = 2;
                }
                i = 30421;
            }
            super.onActivityResult(i, i2, intent);
        } catch (Error | RuntimeException e) {
            zzev.zzb(e);
            throw e;
        }
    }

    @Override // android.app.Fragment
    @RecentlyNonNull
    public View onCreateView(@RecentlyNonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            View inflate = layoutInflater.inflate(C17646R.C17649layout.places_autocomplete_fragment, viewGroup, false);
            this.zza = inflate.findViewById(C17646R.C17648id.places_autocomplete_search_button);
            this.zzb = inflate.findViewById(C17646R.C17648id.places_autocomplete_clear_button);
            this.zzc = (EditText) inflate.findViewById(C17646R.C17648id.places_autocomplete_search_input);
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zzc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AutocompleteFragment.this.zza(view);
                }
            };
            this.zza.setOnClickListener(onClickListener);
            this.zzc.setOnClickListener(onClickListener);
            this.zzb.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zzd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AutocompleteFragment.this.setText("");
                }
            });
            zzb();
            inflate.setEnabled(false);
            return inflate;
        } catch (Error | RuntimeException e) {
            zzev.zzb(e);
            throw e;
        }
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        try {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            super.onDestroyView();
        } catch (Error | RuntimeException e) {
            zzev.zzb(e);
            throw e;
        }
    }

    public void setCountry(String str) {
        this.zzf = str;
    }

    public void setHint(CharSequence charSequence) {
        if (charSequence == null) {
            try {
                charSequence = getString(C17646R.string.places_autocomplete_search_hint);
            } catch (Error | RuntimeException e) {
                zzev.zzb(e);
                throw e;
            }
        }
        this.zzc.setHint(charSequence);
        this.zza.setContentDescription(charSequence);
    }

    public void setLocationBias(LocationBias locationBias) {
        this.zzd = locationBias;
    }

    public void setLocationRestriction(LocationRestriction locationRestriction) {
        this.zze = locationRestriction;
    }

    public void setOnPlaceSelectedListener(PlaceSelectionListener placeSelectionListener) {
        this.zzi = placeSelectionListener;
    }

    public void setPlaceFields(@RecentlyNonNull List<Place.Field> list) {
        try {
            zzha.zzc(list, "Place Fields must not be null.");
            this.zzh = zzhs.zzk(list);
            getView().setEnabled(true);
        } catch (Error | RuntimeException e) {
            zzev.zzb(e);
            throw e;
        }
    }

    public void setText(CharSequence charSequence) {
        try {
            this.zzc.setText(charSequence);
            zzb();
        } catch (Error | RuntimeException e) {
            zzev.zzb(e);
            throw e;
        }
    }

    public void setTypeFilter(TypeFilter typeFilter) {
        this.zzg = typeFilter;
    }

    public final /* synthetic */ void zza(View view) {
        if (!getView().isEnabled()) {
            zzha.zzc(this.zzh, "Place Fields must be set.");
            if (Log.isLoggable("Places", 6)) {
                Log.e("Places", "Autocomplete activity cannot be launched until fragment is enabled.");
                return;
            }
            return;
        }
        Autocomplete.IntentBuilder intentBuilder = new Autocomplete.IntentBuilder(AutocompleteActivityMode.OVERLAY, this.zzh);
        intentBuilder.setInitialQuery(this.zzc.getText().toString());
        intentBuilder.setHint(this.zzc.getHint().toString());
        intentBuilder.setCountry(this.zzf);
        intentBuilder.setLocationBias(this.zzd);
        intentBuilder.setLocationRestriction(this.zze);
        intentBuilder.setTypeFilter(this.zzg);
        intentBuilder.zza(zzfj.FRAGMENT);
        Intent build = intentBuilder.build(getActivity());
        getView().setEnabled(false);
        startActivityForResult(build, 30421);
    }
}
