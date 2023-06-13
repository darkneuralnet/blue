package com.google.android.libraries.places.widget.internal.p033ui;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RecentlyNonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C11759u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.C17646R;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.internal.zzas;
import com.google.android.libraries.places.internal.zzev;
import com.google.android.libraries.places.internal.zzfl;
import com.google.android.libraries.places.internal.zzfn;
import com.google.android.libraries.places.internal.zzfp;
import com.google.android.libraries.places.internal.zzfz;
import com.google.android.libraries.places.internal.zzgd;
import com.google.android.libraries.places.internal.zzgf;
import com.google.android.libraries.places.internal.zzgi;
import com.google.android.libraries.places.internal.zzgj;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
@SuppressLint({"ValidFragment"})
/* renamed from: com.google.android.libraries.places.widget.internal.ui.AutocompleteImplFragment */
/* loaded from: classes6.dex */
public final class AutocompleteImplFragment extends Fragment {
    private final PlacesClient zza;
    private final zzfl zzb;
    private final zzgj zzc;
    private final zzas zzd;
    private zzgf zze;
    private PlaceSelectionListener zzf;
    private EditText zzg;
    private RecyclerView zzh;
    private View zzi;
    private View zzj;
    private View zzk;
    private View zzl;
    private View zzm;
    private View zzn;
    private View zzo;
    private View zzp;
    private TextView zzq;
    private TextView zzr;
    private zzr zzs;
    private final zzj zzt;

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            zzgi zzgiVar = new zzgi(this.zzb.zzf(), this.zzb.zzh(), this.zzb.zzl(), this.zzd);
            zzgf zzgfVar = (zzgf) new C11759u(this, new zzgd(new zzfz(this.zza, this.zzb, zzgiVar.zzh()), zzgiVar, this.zzc)).m66922a(zzgf.class);
            this.zze = zzgfVar;
            zzgfVar.zze(bundle);
            requireActivity().getOnBackPressedDispatcher().m70498b(this, new zzf(this, true));
        } catch (Error | RuntimeException e) {
            zzev.zzb(e);
            throw e;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.zze.zzi();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.zze.zzh();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@RecentlyNonNull View view, Bundle bundle) {
        String zzk;
        int identifier;
        try {
            this.zzg = (EditText) view.findViewById(C17646R.C17648id.places_autocomplete_search_bar);
            this.zzh = (RecyclerView) view.findViewById(C17646R.C17648id.places_autocomplete_list);
            this.zzi = view.findViewById(C17646R.C17648id.places_autocomplete_back_button);
            this.zzj = view.findViewById(C17646R.C17648id.places_autocomplete_clear_button);
            this.zzk = view.findViewById(C17646R.C17648id.places_autocomplete_search_bar_separator);
            this.zzl = view.findViewById(C17646R.C17648id.places_autocomplete_progress);
            this.zzm = view.findViewById(C17646R.C17648id.places_autocomplete_try_again_progress);
            this.zzn = view.findViewById(C17646R.C17648id.places_autocomplete_powered_by_google);
            this.zzo = view.findViewById(C17646R.C17648id.places_autocomplete_powered_by_google_separator);
            this.zzp = view.findViewById(C17646R.C17648id.places_autocomplete_sad_cloud);
            this.zzq = (TextView) view.findViewById(C17646R.C17648id.places_autocomplete_error_message);
            this.zzr = (TextView) view.findViewById(C17646R.C17648id.places_autocomplete_try_again);
            this.zzg.addTextChangedListener(this.zzt);
            this.zzg.setOnFocusChangeListener(new zzl(null));
            EditText editText = this.zzg;
            if (TextUtils.isEmpty(this.zzb.zzk())) {
                zzk = getString(C17646R.string.places_autocomplete_search_hint);
            } else {
                zzk = this.zzb.zzk();
            }
            editText.setHint(zzk);
            AutocompleteActivityMode autocompleteActivityMode = AutocompleteActivityMode.FULLSCREEN;
            int ordinal = this.zzb.zzh().ordinal();
            if (ordinal != 0) {
                if (ordinal == 1 && (identifier = getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
                    requireActivity().getWindow().addFlags(67108864);
                    C38790bq6.m62529M0(view, view.getPaddingLeft(), view.getPaddingTop() + getResources().getDimensionPixelSize(identifier), view.getPaddingRight(), view.getPaddingBottom());
                }
            } else {
                int zza = this.zzb.zza();
                int zzb = this.zzb.zzb();
                if (Color.alpha(zza) < 255) {
                    zza = 0;
                }
                if (zza != 0 && zzb != 0) {
                    int zza2 = zzfp.zza(zza, NA0.m94301c(requireContext(), C17646R.color.places_text_white_alpha_87), NA0.m94301c(requireContext(), C17646R.color.places_text_black_alpha_87));
                    int zza3 = zzfp.zza(zza, NA0.m94301c(requireContext(), C17646R.color.places_text_white_alpha_26), NA0.m94301c(requireContext(), C17646R.color.places_text_black_alpha_26));
                    view.findViewById(C17646R.C17648id.places_autocomplete_search_bar_container).setBackgroundColor(zza);
                    Window window = requireActivity().getWindow();
                    if (zzfp.zzc(zzb, -1, -16777216)) {
                        window.setStatusBarColor(zzb);
                        window.getDecorView().setSystemUiVisibility(8192);
                    } else {
                        window.setStatusBarColor(zzb);
                    }
                    this.zzg.setTextColor(zza2);
                    this.zzg.setHintTextColor(zza3);
                    zzfp.zzb((ImageView) this.zzi, zza2);
                    zzfp.zzb((ImageView) this.zzj, zza2);
                }
            }
            this.zzi.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.ui.zza
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AutocompleteImplFragment.this.zzc(view2);
                }
            });
            this.zzj.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.ui.zzb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AutocompleteImplFragment.this.zzd(view2);
                }
            });
            this.zzr.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.ui.zzc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AutocompleteImplFragment.this.zzf(view2);
                }
            });
            this.zzs = new zzr(new zze(this), null);
            this.zzh.setLayoutManager(new LinearLayoutManager(requireContext()));
            this.zzh.setItemAnimator(new zzo(getResources()));
            this.zzh.setAdapter(this.zzs);
            this.zzh.addOnScrollListener(new zzg(this));
            this.zze.zza().observe(getViewLifecycleOwner(), new InterfaceC41056fe3() { // from class: com.google.android.libraries.places.widget.internal.ui.zzd
                @Override // p000.InterfaceC41056fe3
                public final void onChanged(Object obj) {
                    AutocompleteImplFragment.this.zzg((zzfn) obj);
                }
            });
        } catch (Error | RuntimeException e) {
            zzev.zzb(e);
            throw e;
        }
    }

    public final /* synthetic */ void zzc(View view) {
        this.zze.zzj();
    }

    public final /* synthetic */ void zzd(View view) {
        try {
            this.zze.zzk();
        } catch (Error | RuntimeException e) {
            zzev.zzb(e);
            throw e;
        }
    }

    public final /* synthetic */ void zze(AutocompletePrediction autocompletePrediction, int i) {
        try {
            this.zze.zzf(autocompletePrediction, i);
        } catch (Error | RuntimeException e) {
            zzev.zzb(e);
            throw e;
        }
    }

    public final /* synthetic */ void zzf(View view) {
        try {
            this.zze.zzl(this.zzg.getText().toString());
        } catch (Error | RuntimeException e) {
            zzev.zzb(e);
            throw e;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final /* synthetic */ void zzg(zzfn zzfnVar) {
        try {
            this.zzj.setVisibility(0);
            this.zzk.setVisibility(0);
            this.zzl.setVisibility(8);
            this.zzm.setVisibility(8);
            this.zzn.setVisibility(0);
            this.zzo.setVisibility(8);
            this.zzp.setVisibility(8);
            this.zzq.setVisibility(8);
            this.zzr.setVisibility(8);
            AutocompleteActivityMode autocompleteActivityMode = AutocompleteActivityMode.FULLSCREEN;
            switch (zzfnVar.zzf() - 1) {
                case 0:
                    if (TextUtils.isEmpty(this.zzb.zzl())) {
                        this.zzj.setVisibility(8);
                    }
                    this.zzg.requestFocus();
                    this.zzg.setText(this.zzb.zzl());
                    EditText editText = this.zzg;
                    editText.setSelection(editText.getText().length());
                    return;
                case 1:
                    this.zzs.submitList(null);
                    this.zzj.setVisibility(8);
                    this.zzg.getText().clear();
                    return;
                case 2:
                    this.zzl.setVisibility(0);
                    return;
                case 3:
                    this.zzr.setVisibility(8);
                    this.zzm.setVisibility(0);
                    this.zzn.setVisibility(8);
                    this.zzp.setVisibility(0);
                    this.zzq.setVisibility(0);
                    return;
                case 4:
                    this.zzs.submitList(zzfnVar.zzd());
                    this.zzo.setVisibility(0);
                    return;
                case 5:
                    this.zzs.submitList(null);
                    this.zzn.setVisibility(8);
                    this.zzp.setVisibility(0);
                    this.zzr.setVisibility(4);
                    this.zzq.setText(getString(C17646R.string.places_autocomplete_no_results_for_query, zzfnVar.zze()));
                    this.zzq.setVisibility(0);
                    return;
                case 6:
                    break;
                case 7:
                default:
                    this.zzf.onPlaceSelected(zzfnVar.zzc());
                    return;
                case 8:
                    this.zzg.clearFocus();
                    this.zzg.removeTextChangedListener(this.zzt);
                    this.zzg.setText(zzfnVar.zzb().getPrimaryText(null));
                    this.zzg.addTextChangedListener(this.zzt);
                    break;
                case 9:
                    this.zzf.onError(zzfnVar.zza());
                    return;
            }
            this.zzs.submitList(null);
            this.zzn.setVisibility(8);
            this.zzp.setVisibility(0);
            this.zzr.setVisibility(0);
            this.zzq.setText(getString(C17646R.string.places_search_error));
            this.zzq.setVisibility(0);
        } catch (Error | RuntimeException e) {
            zzev.zzb(e);
            throw e;
        }
    }

    public final void zzh(@RecentlyNonNull PlaceSelectionListener placeSelectionListener) {
        this.zzf = placeSelectionListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AutocompleteImplFragment(int i, PlacesClient placesClient, zzfl zzflVar, zzgj zzgjVar, zzas zzasVar) {
        super(i);
        this.zzt = new zzj(this, null);
        this.zza = placesClient;
        this.zzb = zzflVar;
        this.zzc = zzgjVar;
        this.zzd = zzasVar;
    }
}
