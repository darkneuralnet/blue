package co.bird.android.app.feature.map.p008ui;

import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.EditText;
import co.bird.android.app.feature.map.p008ui.MapAreasUi;
import co.bird.android.model.persistence.Area;
import co.bird.android.model.wire.WireLocation;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.snackbar.Snackbar;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.model.PaymentMethod;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import p000.UX0;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006J\b\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&J\u001b\u0010\u000f\u001a\u00020\u000b2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\tH&J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013H&J\b\u0010\u0016\u001a\u00020\u0015H&J\b\u0010\u0018\u001a\u00020\u0017H&J\u0018\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH&J\u0012\u0010\u001e\u001a\u00020\u000b2\b\b\u0001\u0010\u001d\u001a\u00020\rH&J\u0010\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH&J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0013H&J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013H&J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013H&J\u0010\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u0015H&J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00150\u0013H&J \u0010+\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\tH&J\u0018\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00170\u00132\b\b\u0002\u0010,\u001a\u00020\tH&¨\u0006."}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/LocationSelectionUi;", "LS74;", "LH31;", "LaM5;", "LUX0;", "Lco/bird/android/app/feature/map/ui/MapAreasUi;", "Ldl2;", "Landroid/view/View;", "getView", "", "enable", "", "enableDoneButton", "", Entry.TYPE_TEXT, "setHeadsUpText", "(Ljava/lang/Integer;)V", "show", "showDoneButton", "Lio/reactivex/Observable;", "doneClicks", "", "getAddress", "Lco/bird/android/model/wire/WireLocation;", "getLocation", "location", "", "radius", "setCurrentLocation", "hint", "setAddressHint", "Lcom/google/android/gms/maps/model/MarkerOptions;", "markerOptions", "showInfoWindow", "Landroid/location/Location;", "centerLocation", "mapClicks", "keyboardDoneClicks", PaymentMethod.BillingDetails.PARAM_ADDRESS, "setAddress", "observeAddressField", "animate", "indirect", "setLocation", "includeIndirectUpdates", "observeLocation", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.app.feature.map.ui.LocationSelectionUi */
/* loaded from: classes2.dex */
public interface LocationSelectionUi extends S74, H31, InterfaceC37910aM5, UX0, MapAreasUi, InterfaceC39940dl2 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.ui.LocationSelectionUi$DefaultImpls */
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Observable observeLocation$default(LocationSelectionUi locationSelectionUi, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                return locationSelectionUi.observeLocation(z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeLocation");
        }

        public static void onCreate(LocationSelectionUi locationSelectionUi, Bundle bundle) {
            UX0.C8308a.m81389a(locationSelectionUi, bundle);
        }

        public static void onDestroy(LocationSelectionUi locationSelectionUi) {
            UX0.C8308a.m81388b(locationSelectionUi);
        }

        public static void onLowMemory(LocationSelectionUi locationSelectionUi) {
            UX0.C8308a.m81387c(locationSelectionUi);
        }

        public static void onPause(LocationSelectionUi locationSelectionUi) {
            UX0.C8308a.m81386d(locationSelectionUi);
        }

        public static void onResume(LocationSelectionUi locationSelectionUi) {
            UX0.C8308a.m81385e(locationSelectionUi);
        }

        public static void onSaveInstanceState(LocationSelectionUi locationSelectionUi, Bundle outState) {
            Intrinsics.checkNotNullParameter(outState, "outState");
            UX0.C8308a.m81384f(locationSelectionUi, outState);
        }

        public static void onStart(LocationSelectionUi locationSelectionUi) {
            UX0.C8308a.m81383g(locationSelectionUi);
        }

        public static void onStop(LocationSelectionUi locationSelectionUi) {
            UX0.C8308a.m81382h(locationSelectionUi);
        }

        public static Observable<Unit> setAreasCompleteChanges(LocationSelectionUi locationSelectionUi) {
            return MapAreasUi.DefaultImpls.setAreasCompleteChanges(locationSelectionUi);
        }

        public static void showInfoWindowForArea(LocationSelectionUi locationSelectionUi, Area area, LatLng latLng) {
            Intrinsics.checkNotNullParameter(area, "area");
            MapAreasUi.DefaultImpls.showInfoWindowForArea(locationSelectionUi, area, latLng);
        }
    }

    @Override // p000.H31
    /* synthetic */ AbstractC23442F agreementDialog(AbstractC20244f9 abstractC20244f9, boolean z, boolean z2);

    /* synthetic */ AbstractC23442F agreementDialog(CharSequence charSequence, CharSequence charSequence2, List list, Integer num, Integer num2, boolean z, boolean z2);

    @Override // p000.H31
    /* synthetic */ AbstractC23442F birdDialog(AbstractC5751Ny abstractC5751Ny, boolean z, boolean z2);

    Observable<Location> centerLocation();

    @Override // p000.H31
    /* synthetic */ AbstractC23442F dialog(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, Integer num6, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2, boolean z3, Function1 function1);

    @Override // p000.H31
    /* synthetic */ AbstractC23442F dialog(AbstractC5751Ny abstractC5751Ny, boolean z, boolean z2);

    /* synthetic */ boolean dialogShown();

    @Override // p000.H31
    /* synthetic */ AbstractC23442F dialogWithInput(String str, String str2, String str3, String str4, Integer num, String str5, String str6, boolean z, boolean z2, boolean z3);

    @Override // p000.H31
    /* synthetic */ void dismissDialog();

    @Override // p000.H31
    /* synthetic */ boolean dismissIfCurrentDialogIsInstanceOf(KClass... kClassArr);

    Observable<Unit> doneClicks();

    void enableDoneButton(boolean z);

    @Override // p000.InterfaceC37910aM5
    /* synthetic */ void error(int i);

    @Override // p000.InterfaceC37910aM5
    /* synthetic */ void error(String str);

    @Override // p000.InterfaceC37910aM5
    /* synthetic */ void error(Throwable th);

    @Override // p000.InterfaceC37910aM5
    /* synthetic */ void errorGeneric();

    String getAddress();

    WireLocation getLocation();

    View getView();

    @Override // p000.InterfaceC39940dl2
    /* synthetic */ void hideKeyboard();

    /* synthetic */ void hideKeyboard(IBinder iBinder);

    /* synthetic */ void hideKeyboard(EditText editText);

    Observable<Unit> keyboardDoneClicks();

    Observable<WireLocation> mapClicks();

    Observable<String> observeAddressField();

    Observable<WireLocation> observeLocation(boolean z);

    /* synthetic */ void onCreate(Bundle bundle);

    /* synthetic */ void onDestroy();

    /* synthetic */ void onLowMemory();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    /* synthetic */ void onSaveInstanceState(Bundle bundle);

    /* synthetic */ void onStart();

    /* synthetic */ void onStop();

    /* synthetic */ Snackbar persistentError(int i);

    @Override // p000.H31
    /* synthetic */ AbstractC24507p selectorDialog(List list, boolean z, CharSequence charSequence);

    void setAddress(String str);

    void setAddressHint(int i);

    void setCurrentLocation(WireLocation wireLocation, double d);

    void setHeadsUpText(Integer num);

    void setLocation(WireLocation wireLocation, boolean z, boolean z2);

    @Override // p000.H31
    /* synthetic */ void showBirdDialog(AbstractC5751Ny abstractC5751Ny, boolean z, boolean z2, Function0 function0, Function0 function02, Function0 function03, String str);

    @Override // p000.H31
    /* synthetic */ AbstractC23442F showBottomSheetAlert(AbstractC5751Ny abstractC5751Ny, Integer num);

    @Override // p000.H31
    /* synthetic */ void showCustomDialog(int i, Integer num, Integer num2, boolean z, boolean z2, boolean z3, Integer num3, Integer num4, CharSequence charSequence, CharSequence charSequence2, int i2, Integer num5, String str, String str2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, boolean z4);

    @Override // p000.H31
    /* synthetic */ void showCustomDialog(View view, Integer num, Integer num2, boolean z, boolean z2, boolean z3, Integer num3, Integer num4, CharSequence charSequence, CharSequence charSequence2, int i, Integer num5, String str, String str2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, boolean z4);

    @Override // p000.H31
    /* synthetic */ void showDialog(AbstractC5751Ny abstractC5751Ny, boolean z, boolean z2, Function0 function0, Function0 function02, Function0 function03, String str);

    @Override // p000.H31
    /* synthetic */ void showDialog(CharSequence charSequence, CharSequence charSequence2, Integer num, Integer num2, boolean z, boolean z2, Function0 function0, Function0 function02, Function0 function03);

    @Override // p000.H31
    /* synthetic */ AbstractC23461c showDialogCompletable(AbstractC5751Ny abstractC5751Ny, boolean z, boolean z2, Function0 function0, Function0 function02, Function0 function03, String str);

    void showDoneButton(boolean z);

    @Override // p000.H31
    /* synthetic */ void showIndeterminateDialog(AbstractC46028o12 abstractC46028o12);

    void showInfoWindow(MarkerOptions markerOptions);

    /* synthetic */ void showKeyboard(IBinder iBinder);

    /* synthetic */ void showKeyboard(View view);

    @Override // p000.S74
    /* synthetic */ void showProgress(boolean z, int i);

    @Override // p000.H31
    /* synthetic */ void showRetrofitExceptionDialog(Throwable th, Function2 function2, Function0 function0);

    @Override // p000.InterfaceC37910aM5
    /* synthetic */ void snackToast(int i);

    @Override // p000.InterfaceC37910aM5
    /* synthetic */ void snackToast(String str);

    @Override // p000.S74
    /* synthetic */ void startProgress();

    @Override // p000.S74
    /* synthetic */ void stopProgress(int i);

    @Override // p000.InterfaceC37910aM5
    /* synthetic */ void success(int i);

    @Override // p000.InterfaceC37910aM5
    /* synthetic */ void success(String str);

    @Override // p000.InterfaceC37910aM5
    /* synthetic */ void warn(int i);

    @Override // p000.InterfaceC37910aM5
    /* synthetic */ void warn(String str);
}
