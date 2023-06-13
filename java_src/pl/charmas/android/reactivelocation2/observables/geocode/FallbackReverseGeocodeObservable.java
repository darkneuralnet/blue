package pl.charmas.android.reactivelocation2.observables.geocode;

import android.location.Address;
import android.text.TextUtils;
import com.amazonaws.services.p026s3.internal.Constants;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.reactivex.InterfaceC24578y;
import io.reactivex.InterfaceC24579z;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes8.dex */
class FallbackReverseGeocodeObservable implements InterfaceC24579z<List<Address>> {
    private final double latitude;
    private final Locale locale;
    private final double longitude;
    private final int maxResults;

    public FallbackReverseGeocodeObservable(Locale locale, double d, double d2, int i) {
        this.locale = locale;
        this.latitude = d;
        this.longitude = d2;
        this.maxResults = i;
    }

    private List<Address> alternativeReverseGeocodeQuery() throws IOException, JSONException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(String.format(Locale.ENGLISH, "http://maps.googleapis.com/maps/api/geocode/json?latlng=%1$f,%2$f&sensor=true&language=%3$s", Double.valueOf(this.latitude), Double.valueOf(this.longitude), this.locale.getLanguage())).openConnection()));
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), Constants.DEFAULT_ENCODING));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            JSONObject jSONObject = new JSONObject(sb.toString());
            if ("ZERO_RESULTS".equalsIgnoreCase(jSONObject.getString("status"))) {
                return Collections.emptyList();
            }
            if ("OK".equalsIgnoreCase(jSONObject.getString("status"))) {
                JSONArray jSONArray = jSONObject.getJSONArray("results");
                for (int i = 0; i < jSONArray.length() && i < this.maxResults; i++) {
                    Address address = new Address(Locale.getDefault());
                    String str = "";
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("address_components");
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        String string = jSONArray2.getJSONObject(i2).getString("long_name");
                        String string2 = jSONArray2.getJSONObject(i2).getString("short_name");
                        String string3 = jSONArray2.getJSONObject(i2).getJSONArray("types").getString(0);
                        if (!TextUtils.isEmpty(string)) {
                            if (string3.equalsIgnoreCase("street_number")) {
                                if (!TextUtils.isEmpty(str)) {
                                    str = str + " " + string;
                                } else {
                                    str = string;
                                }
                            } else if (string3.equalsIgnoreCase("route")) {
                                if (!TextUtils.isEmpty(str)) {
                                    str = string + " " + str;
                                }
                                str = string;
                            } else if (string3.equalsIgnoreCase("sublocality")) {
                                address.setSubLocality(string);
                            } else if (string3.equalsIgnoreCase("locality")) {
                                address.setLocality(string);
                            } else if (string3.equalsIgnoreCase("administrative_area_level_2")) {
                                address.setSubAdminArea(string);
                            } else if (string3.equalsIgnoreCase("administrative_area_level_1")) {
                                address.setAdminArea(string);
                            } else if (string3.equalsIgnoreCase("country")) {
                                address.setCountryName(string);
                                address.setCountryCode(string2);
                            } else if (string3.equalsIgnoreCase("postal_code")) {
                                address.setPostalCode(string);
                            }
                        }
                    }
                    String string4 = jSONObject2.getString("formatted_address");
                    if (!TextUtils.isEmpty(string4)) {
                        String[] split = string4.split(",");
                        for (int i3 = 0; i3 < split.length; i3++) {
                            address.setAddressLine(i3, split[i3].trim());
                        }
                    } else if (!TextUtils.isEmpty(str)) {
                        address.setAddressLine(0, str);
                    }
                    arrayList.add(address);
                }
                httpURLConnection.disconnect();
                return Collections.unmodifiableList(arrayList);
            }
            throw new RuntimeException("Wrong API response");
        } finally {
            httpURLConnection.disconnect();
        }
    }

    @Override // io.reactivex.InterfaceC24579z
    public void subscribe(InterfaceC24578y<List<Address>> interfaceC24578y) throws Exception {
        try {
            List<Address> alternativeReverseGeocodeQuery = alternativeReverseGeocodeQuery();
            if (!interfaceC24578y.mo1769e()) {
                interfaceC24578y.onNext(alternativeReverseGeocodeQuery);
                interfaceC24578y.onComplete();
            }
        } catch (Exception e) {
            if (!interfaceC24578y.mo1769e()) {
                interfaceC24578y.onError(e);
            }
        }
    }
}
