package com.stripe.android.view;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.C18606R;
import com.stripe.android.core.model.Country;
import com.stripe.android.core.model.CountryCode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B9\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\u0010\rJ\b\u0010\u0018\u001a\u00020\bH\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\bH\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\bH\u0016J\u0012\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010!\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010$\u001a\u00020\u000bH\u0016J\u001b\u0010%\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0000¢\u0006\u0002\b*R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006,"}, m28432d2 = {"Lcom/stripe/android/view/CountryAdapter;", "Landroid/widget/ArrayAdapter;", "Lcom/stripe/android/core/model/Country;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "unfilteredCountries", "", "itemLayoutId", "", "textViewFactory", "Lkotlin/Function1;", "Landroid/view/ViewGroup;", "Landroid/widget/TextView;", "(Landroid/content/Context;Ljava/util/List;ILkotlin/jvm/functions/Function1;)V", "countryFilter", "Lcom/stripe/android/view/CountryAdapter$CountryFilter;", "firstItem", "getFirstItem$payments_core_release", "()Lcom/stripe/android/core/model/Country;", "suggestions", "getUnfilteredCountries$payments_core_release", "()Ljava/util/List;", "setUnfilteredCountries$payments_core_release", "(Ljava/util/List;)V", "getCount", "getFilter", "Landroid/widget/Filter;", "getItem", "i", "getItemId", "", "getPosition", "item", "getView", "Landroid/view/View;", "view", "viewGroup", "updateUnfilteredCountries", "", "allowedCountryCodes", "", "", "updateUnfilteredCountries$payments_core_release", "CountryFilter", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nCountryAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryAdapter.kt\ncom/stripe/android/view/CountryAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,150:1\n766#2:151\n857#2:152\n1747#2,3:153\n858#2:156\n*S KotlinDebug\n*F\n+ 1 CountryAdapter.kt\ncom/stripe/android/view/CountryAdapter\n*L\n76#1:151\n76#1:152\n77#1:153,3\n76#1:156\n*E\n"})
/* loaded from: classes7.dex */
public final class CountryAdapter extends ArrayAdapter<Country> {
    private final CountryFilter countryFilter;
    private List<Country> suggestions;
    private final Function1<ViewGroup, TextView> textViewFactory;
    private List<Country> unfilteredCountries;

    @Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\bH\u0002J \u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u001c\u0010\u001b\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001aH\u0014R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, m28432d2 = {"Lcom/stripe/android/view/CountryAdapter$CountryFilter;", "Landroid/widget/Filter;", "unfilteredCountries", "", "Lcom/stripe/android/core/model/Country;", "adapter", "Lcom/stripe/android/view/CountryAdapter;", "activity", "Landroid/app/Activity;", "(Ljava/util/List;Lcom/stripe/android/view/CountryAdapter;Landroid/app/Activity;)V", "activityRef", "Ljava/lang/ref/WeakReference;", "getUnfilteredCountries", "()Ljava/util/List;", "setUnfilteredCountries", "(Ljava/util/List;)V", "filteredSuggestedCountries", "constraint", "", "getSuggestedCountries", "hideKeyboard", "", "isMatch", "", "countries", "performFiltering", "Landroid/widget/Filter$FilterResults;", "publishResults", "filterResults", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nCountryAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryAdapter.kt\ncom/stripe/android/view/CountryAdapter$CountryFilter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,150:1\n1747#2,3:151\n766#2:154\n857#2,2:155\n*S KotlinDebug\n*F\n+ 1 CountryAdapter.kt\ncom/stripe/android/view/CountryAdapter$CountryFilter\n*L\n109#1:151,3\n130#1:154\n130#1:155,2\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class CountryFilter extends Filter {
        private final WeakReference<Activity> activityRef;
        private final CountryAdapter adapter;
        private List<Country> unfilteredCountries;

        public CountryFilter(List<Country> unfilteredCountries, CountryAdapter adapter, Activity activity) {
            Intrinsics.checkNotNullParameter(unfilteredCountries, "unfilteredCountries");
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            this.unfilteredCountries = unfilteredCountries;
            this.adapter = adapter;
            this.activityRef = new WeakReference<>(activity);
        }

        private final List<Country> filteredSuggestedCountries(CharSequence charSequence) {
            List<Country> suggestedCountries = getSuggestedCountries(charSequence);
            if (suggestedCountries.isEmpty() || isMatch(suggestedCountries, charSequence)) {
                return this.unfilteredCountries;
            }
            return suggestedCountries;
        }

        private final List<Country> getSuggestedCountries(CharSequence charSequence) {
            boolean startsWith$default;
            ArrayList arrayList = new ArrayList();
            for (Object obj : this.unfilteredCountries) {
                String name = ((Country) obj).getName();
                Locale locale = Locale.ROOT;
                String lowerCase = name.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                String lowerCase2 = String.valueOf(charSequence).toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                startsWith$default = StringsKt__StringsJVMKt.startsWith$default(lowerCase, lowerCase2, false, 2, null);
                if (startsWith$default) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (r0.isAcceptingText() == true) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void hideKeyboard(Activity activity) {
            InputMethodManager inputMethodManager;
            boolean z;
            Object systemService = activity.getSystemService("input_method");
            IBinder iBinder = null;
            if (systemService instanceof InputMethodManager) {
                inputMethodManager = (InputMethodManager) systemService;
            } else {
                inputMethodManager = null;
            }
            if (inputMethodManager != null) {
                z = true;
            }
            z = false;
            if (z) {
                View currentFocus = activity.getCurrentFocus();
                if (currentFocus != null) {
                    iBinder = currentFocus.getWindowToken();
                }
                inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
            }
        }

        private final boolean isMatch(List<Country> list, CharSequence charSequence) {
            return list.size() == 1 && Intrinsics.areEqual(list.get(0).getName(), String.valueOf(charSequence));
        }

        public final List<Country> getUnfilteredCountries() {
            return this.unfilteredCountries;
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            List<Country> list;
            Filter.FilterResults filterResults = new Filter.FilterResults();
            if (charSequence == null || (list = filteredSuggestedCountries(charSequence)) == null) {
                list = this.unfilteredCountries;
            }
            filterResults.values = list;
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            Object obj;
            if (filterResults != null) {
                obj = filterResults.values;
            } else {
                obj = null;
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.stripe.android.core.model.Country>");
            List list = (List) obj;
            Activity activity = this.activityRef.get();
            if (activity != null) {
                List list2 = list;
                boolean z = false;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (Intrinsics.areEqual(((Country) it.next()).getName(), charSequence)) {
                            z = true;
                            break;
                        }
                    }
                }
                if (z) {
                    hideKeyboard(activity);
                }
            }
            this.adapter.suggestions = list;
            this.adapter.notifyDataSetChanged();
        }

        public final void setUnfilteredCountries(List<Country> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.unfilteredCountries = list;
        }
    }

    public /* synthetic */ CountryAdapter(Context context, List list, int i, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, list, (i2 & 4) != 0 ? C18606R.C18609layout.country_text_view : i, function1);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.suggestions.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public Filter getFilter() {
        return this.countryFilter;
    }

    public final /* synthetic */ Country getFirstItem$payments_core_release() {
        return getItem(0);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public long getItemId(int i) {
        return getItem(i).hashCode();
    }

    public final List<Country> getUnfilteredCountries$payments_core_release() {
        return this.unfilteredCountries;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView invoke;
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        if (view instanceof TextView) {
            invoke = (TextView) view;
        } else {
            invoke = this.textViewFactory.invoke(viewGroup);
        }
        invoke.setText(getItem(i).getName());
        return invoke;
    }

    public final void setUnfilteredCountries$payments_core_release(List<Country> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.unfilteredCountries = list;
    }

    public final boolean updateUnfilteredCountries$payments_core_release(Set<String> allowedCountryCodes) {
        boolean equals;
        Intrinsics.checkNotNullParameter(allowedCountryCodes, "allowedCountryCodes");
        if (allowedCountryCodes.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.unfilteredCountries.iterator();
        while (true) {
            boolean z = true;
            if (it.hasNext()) {
                Object next = it.next();
                CountryCode component1 = ((Country) next).component1();
                if (!allowedCountryCodes.isEmpty()) {
                    for (String str : allowedCountryCodes) {
                        equals = StringsKt__StringsJVMKt.equals(str, component1.getValue(), true);
                        if (equals) {
                            break;
                        }
                    }
                }
                z = false;
                if (z) {
                    arrayList.add(next);
                }
            } else {
                this.unfilteredCountries = arrayList;
                this.countryFilter.setUnfilteredCountries(arrayList);
                this.suggestions = this.unfilteredCountries;
                notifyDataSetChanged();
                return true;
            }
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public Country getItem(int i) {
        return this.suggestions.get(i);
    }

    @Override // android.widget.ArrayAdapter
    public int getPosition(Country country) {
        int indexOf;
        indexOf = CollectionsKt___CollectionsKt.indexOf((List<? extends Country>) ((List<? extends Object>) this.suggestions), country);
        return indexOf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CountryAdapter(Context context, List<Country> unfilteredCountries, int i, Function1<? super ViewGroup, ? extends TextView> textViewFactory) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(unfilteredCountries, "unfilteredCountries");
        Intrinsics.checkNotNullParameter(textViewFactory, "textViewFactory");
        this.unfilteredCountries = unfilteredCountries;
        this.textViewFactory = textViewFactory;
        this.countryFilter = new CountryFilter(this.unfilteredCountries, this, context instanceof Activity ? (Activity) context : null);
        this.suggestions = this.unfilteredCountries;
    }
}
