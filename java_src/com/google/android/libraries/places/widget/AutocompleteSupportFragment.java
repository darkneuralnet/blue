package com.google.android.libraries.places.widget;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.RecentlyNonNull;
import androidx.fragment.app.Fragment;
import com.google.android.libraries.places.C17646R;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.internal.zzev;
import com.google.android.libraries.places.internal.zzfj;
import com.google.android.libraries.places.internal.zzfk;
import com.google.android.libraries.places.internal.zzfl;
import com.google.android.libraries.places.internal.zzhs;
import com.google.android.libraries.places.widget.Autocomplete;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import java.util.List;
/* loaded from: classes6.dex */
public class AutocompleteSupportFragment extends Fragment {
    private final C49882uX2 zza;
    private final C49882uX2 zzb;
    private zzfk zzc;
    private PlaceSelectionListener zzd;

    public AutocompleteSupportFragment() {
        super(C17646R.C17649layout.places_autocomplete_fragment);
        this.zza = new C49882uX2();
        this.zzb = new C49882uX2();
        this.zzc = zzfl.zzm(AutocompleteActivityMode.OVERLAY, zzhs.zzm(), zzfj.FRAGMENT);
    }

    @RecentlyNonNull
    public static AutocompleteSupportFragment newInstance() {
        return new AutocompleteSupportFragment();
    }

    public static /* synthetic */ void zzd(EditText editText, View view, CharSequence charSequence) {
        try {
            editText.setHint(charSequence);
            view.setContentDescription(charSequence);
        } catch (Error | RuntimeException e) {
            zzev.zzb(e);
            throw e;
        }
    }

    private final void zze() {
        Intent build = new Autocomplete.IntentBuilder(this.zzc.zzl()).build(requireContext());
        if (requireView().isEnabled()) {
            requireView().setEnabled(false);
            startActivityForResult(build, 30421);
        }
    }

    private final void zzf(View view) {
        int i;
        if (true != TextUtils.isEmpty((CharSequence) this.zza.getValue())) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 30421) {
            try {
                PlaceSelectionListener placeSelectionListener = this.zzd;
                if (placeSelectionListener == null) {
                    if (Log.isLoggable("Places", 5)) {
                        Log.w("Places", "No PlaceSelectionListener is set. No result will be delivered.");
                    }
                } else if (intent == null) {
                    if (Log.isLoggable("Places", 6)) {
                        Log.e("Places", "Intent data was null.");
                    }
                } else if (i2 == -1) {
                    Place placeFromIntent = Autocomplete.getPlaceFromIntent(intent);
                    placeSelectionListener.onPlaceSelected(placeFromIntent);
                    setText(placeFromIntent.getName());
                } else {
                    placeSelectionListener.onError(Autocomplete.getStatusFromIntent(intent));
                }
            } catch (Error | RuntimeException e) {
                zzev.zzb(e);
                throw e;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            try {
                zzfl zzflVar = (zzfl) bundle.getParcelable("options");
                if (zzflVar != null) {
                    if (this.zza.getValue() == null) {
                        this.zza.postValue(zzflVar.zzl());
                    }
                    if (this.zzb.getValue() == null) {
                        this.zzb.postValue(zzflVar.zzk());
                    }
                    this.zzc = zzflVar.zzg();
                }
            } catch (Error | RuntimeException e) {
                zzev.zzb(e);
                throw e;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        requireView().setEnabled(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@RecentlyNonNull Bundle bundle) {
        bundle.putParcelable("options", this.zzc.zzl());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@RecentlyNonNull View view, Bundle bundle) {
        final View findViewById = view.findViewById(C17646R.C17648id.places_autocomplete_search_button);
        final View findViewById2 = view.findViewById(C17646R.C17648id.places_autocomplete_clear_button);
        final EditText editText = (EditText) view.findViewById(C17646R.C17648id.places_autocomplete_search_input);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zze
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AutocompleteSupportFragment.this.zza(view2);
            }
        });
        editText.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zzf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AutocompleteSupportFragment.this.zzb(view2);
            }
        });
        findViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zzg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AutocompleteSupportFragment.this.setText(null);
            }
        });
        zzf(findViewById2);
        this.zza.observe(getViewLifecycleOwner(), new InterfaceC41056fe3() { // from class: com.google.android.libraries.places.widget.zzi
            @Override // p000.InterfaceC41056fe3
            public final void onChanged(Object obj) {
                AutocompleteSupportFragment.this.zzc(editText, findViewById2, (CharSequence) obj);
            }
        });
        this.zzb.observe(getViewLifecycleOwner(), new InterfaceC41056fe3() { // from class: com.google.android.libraries.places.widget.zzh
            @Override // p000.InterfaceC41056fe3
            public final void onChanged(Object obj) {
                AutocompleteSupportFragment.zzd(editText, findViewById, (CharSequence) obj);
            }
        });
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setActivityMode(@RecentlyNonNull AutocompleteActivityMode autocompleteActivityMode) {
        this.zzc.zzf(autocompleteActivityMode);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setCountries(@RecentlyNonNull List<String> list) {
        this.zzc.zza(list);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setCountry(String str) {
        this.zzc.zzm(str);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setHint(CharSequence charSequence) {
        try {
            if (charSequence == null) {
                String string = getString(C17646R.string.places_autocomplete_search_hint);
                this.zzc.zzb(string);
                this.zzb.postValue(string);
            } else {
                this.zzc.zzb(charSequence.toString());
                this.zzb.postValue(charSequence);
            }
            return this;
        } catch (Error | RuntimeException e) {
            zzev.zzb(e);
            throw e;
        }
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setLocationBias(LocationBias locationBias) {
        this.zzc.zzd(locationBias);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setLocationRestriction(LocationRestriction locationRestriction) {
        this.zzc.zze(locationRestriction);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setOnPlaceSelectedListener(PlaceSelectionListener placeSelectionListener) {
        this.zzd = placeSelectionListener;
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setPlaceFields(@RecentlyNonNull List<Place.Field> list) {
        this.zzc.zzh(list);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setText(CharSequence charSequence) {
        String charSequence2;
        try {
            zzfk zzfkVar = this.zzc;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence2 = null;
            } else {
                charSequence2 = charSequence.toString();
            }
            zzfkVar.zzc(charSequence2);
            this.zza.postValue(charSequence);
            return this;
        } catch (Error | RuntimeException e) {
            zzev.zzb(e);
            throw e;
        }
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setTypeFilter(TypeFilter typeFilter) {
        this.zzc.zzk(typeFilter);
        return this;
    }

    public final /* synthetic */ void zza(View view) {
        zze();
    }

    public final /* synthetic */ void zzb(View view) {
        zze();
    }

    public final /* synthetic */ void zzc(EditText editText, View view, CharSequence charSequence) {
        try {
            editText.setText(charSequence);
            zzf(view);
        } catch (Error | RuntimeException e) {
            zzev.zzb(e);
            throw e;
        }
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setCountries(@RecentlyNonNull String... strArr) {
        this.zzc.zza(zzhs.zzl(strArr));
        return this;
    }
}
