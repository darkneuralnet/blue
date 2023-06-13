package p000;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
/* renamed from: SU5 */
/* loaded from: classes.dex */
public class SU5 extends AbstractC37909aM4 implements View.OnClickListener {

    /* renamed from: m */
    public final SearchView f33782m;

    /* renamed from: n */
    public final SearchableInfo f33783n;

    /* renamed from: o */
    public final Context f33784o;

    /* renamed from: p */
    public final WeakHashMap<String, Drawable.ConstantState> f33785p;

    /* renamed from: q */
    public final int f33786q;

    /* renamed from: r */
    public boolean f33787r;

    /* renamed from: s */
    public int f33788s;

    /* renamed from: t */
    public ColorStateList f33789t;

    /* renamed from: u */
    public int f33790u;

    /* renamed from: v */
    public int f33791v;

    /* renamed from: w */
    public int f33792w;

    /* renamed from: x */
    public int f33793x;

    /* renamed from: y */
    public int f33794y;

    /* renamed from: z */
    public int f33795z;

    /* renamed from: SU5$a */
    /* loaded from: classes.dex */
    public static final class C7463a {

        /* renamed from: a */
        public final TextView f33796a;

        /* renamed from: b */
        public final TextView f33797b;

        /* renamed from: c */
        public final ImageView f33798c;

        /* renamed from: d */
        public final ImageView f33799d;

        /* renamed from: e */
        public final ImageView f33800e;

        public C7463a(View view) {
            this.f33796a = (TextView) view.findViewById(16908308);
            this.f33797b = (TextView) view.findViewById(16908309);
            this.f33798c = (ImageView) view.findViewById(16908295);
            this.f33799d = (ImageView) view.findViewById(16908296);
            this.f33800e = (ImageView) view.findViewById(C39902dh4.edit_query);
        }
    }

    public SU5(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f33787r = false;
        this.f33788s = 1;
        this.f33790u = -1;
        this.f33791v = -1;
        this.f33792w = -1;
        this.f33793x = -1;
        this.f33794y = -1;
        this.f33795z = -1;
        this.f33782m = searchView;
        this.f33783n = searchableInfo;
        this.f33786q = searchView.getSuggestionCommitIconResId();
        this.f33784o = context;
        this.f33785p = weakHashMap;
    }

    /* renamed from: o */
    public static String m85357o(Cursor cursor, String str) {
        return m85349w(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: w */
    public static String m85349w(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: A */
    public final void m85363A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f33785p.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: B */
    public final void m85362B(Cursor cursor) {
        Bundle bundle;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // p000.AbstractC39639dF0, p000.C40231eF0.InterfaceC19997a
    /* renamed from: a */
    public void mo43076a(Cursor cursor) {
        if (this.f33787r) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo43076a(cursor);
            if (cursor != null) {
                this.f33790u = cursor.getColumnIndex("suggest_text_1");
                this.f33791v = cursor.getColumnIndex("suggest_text_2");
                this.f33792w = cursor.getColumnIndex("suggest_text_2_url");
                this.f33793x = cursor.getColumnIndex("suggest_icon_1");
                this.f33794y = cursor.getColumnIndex("suggest_icon_2");
                this.f33795z = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // p000.AbstractC39639dF0, p000.C40231eF0.InterfaceC19997a
    /* renamed from: c */
    public CharSequence mo43074c(Cursor cursor) {
        String m85357o;
        String m85357o2;
        if (cursor == null) {
            return null;
        }
        String m85357o3 = m85357o(cursor, "suggest_intent_query");
        if (m85357o3 != null) {
            return m85357o3;
        }
        if (this.f33783n.shouldRewriteQueryFromData() && (m85357o2 = m85357o(cursor, "suggest_intent_data")) != null) {
            return m85357o2;
        }
        if (!this.f33783n.shouldRewriteQueryFromText() || (m85357o = m85357o(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return m85357o;
    }

    @Override // p000.C40231eF0.InterfaceC19997a
    /* renamed from: d */
    public Cursor mo43073d(CharSequence charSequence) {
        String charSequence2;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        if (this.f33782m.getVisibility() == 0 && this.f33782m.getWindowVisibility() == 0) {
            try {
                Cursor m85350v = m85350v(this.f33783n, charSequence2, 50);
                if (m85350v != null) {
                    m85350v.getCount();
                    return m85350v;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    @Override // p000.AbstractC39639dF0
    /* renamed from: e */
    public void mo44487e(View view, Context context, Cursor cursor) {
        int i;
        CharSequence m85349w;
        C7463a c7463a = (C7463a) view.getTag();
        int i2 = this.f33795z;
        if (i2 != -1) {
            i = cursor.getInt(i2);
        } else {
            i = 0;
        }
        if (c7463a.f33796a != null) {
            m85346z(c7463a.f33796a, m85349w(cursor, this.f33790u));
        }
        if (c7463a.f33797b != null) {
            String m85349w2 = m85349w(cursor, this.f33792w);
            if (m85349w2 != null) {
                m85349w = m85360l(m85349w2);
            } else {
                m85349w = m85349w(cursor, this.f33791v);
            }
            if (TextUtils.isEmpty(m85349w)) {
                TextView textView = c7463a.f33796a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    c7463a.f33796a.setMaxLines(2);
                }
            } else {
                TextView textView2 = c7463a.f33796a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    c7463a.f33796a.setMaxLines(1);
                }
            }
            m85346z(c7463a.f33797b, m85349w);
        }
        ImageView imageView = c7463a.f33798c;
        if (imageView != null) {
            m85347y(imageView, m85352t(cursor), 4);
        }
        ImageView imageView2 = c7463a.f33799d;
        if (imageView2 != null) {
            m85347y(imageView2, m85351u(cursor), 8);
        }
        int i3 = this.f33788s;
        if (i3 != 2 && (i3 != 1 || (i & 1) == 0)) {
            c7463a.f33800e.setVisibility(8);
            return;
        }
        c7463a.f33800e.setVisibility(0);
        c7463a.f33800e.setTag(c7463a.f33796a.getText());
        c7463a.f33800e.setOnClickListener(this);
    }

    @Override // p000.AbstractC39639dF0, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View mo44485g = mo44485g(this.f33784o, mo43075b(), viewGroup);
            if (mo44485g != null) {
                ((C7463a) mo44485g.getTag()).f33796a.setText(e.toString());
            }
            return mo44485g;
        }
    }

    @Override // p000.AbstractC39639dF0, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View mo44484h = mo44484h(this.f33784o, mo43075b(), viewGroup);
            if (mo44484h != null) {
                ((C7463a) mo44484h.getTag()).f33796a.setText(e.toString());
            }
            return mo44484h;
        }
    }

    @Override // p000.AbstractC37909aM4, p000.AbstractC39639dF0
    /* renamed from: h */
    public View mo44484h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View mo44484h = super.mo44484h(context, cursor, viewGroup);
        mo44484h.setTag(new C7463a(mo44484h));
        ((ImageView) mo44484h.findViewById(C39902dh4.edit_query)).setImageResource(this.f33786q);
        return mo44484h;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    /* renamed from: k */
    public final Drawable m85361k(String str) {
        Drawable.ConstantState constantState = this.f33785p.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: l */
    public final CharSequence m85360l(CharSequence charSequence) {
        if (this.f33789t == null) {
            TypedValue typedValue = new TypedValue();
            this.f33784o.getTheme().resolveAttribute(C50553vf4.textColorSearchUrl, typedValue, true);
            this.f33789t = this.f33784o.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f33789t, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: m */
    public final Drawable m85359m(ComponentName componentName) {
        PackageManager packageManager = this.f33784o.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable == null) {
                Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
                return null;
            }
            return drawable;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("SuggestionsAdapter", e.toString());
            return null;
        }
    }

    /* renamed from: n */
    public final Drawable m85358n(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.f33785p.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = this.f33785p.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f33784o.getResources());
        }
        Drawable m85359m = m85359m(componentName);
        if (m85359m != null) {
            constantState = m85359m.getConstantState();
        }
        this.f33785p.put(flattenToShortString, constantState);
        return m85359m;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m85362B(mo43075b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m85362B(mo43075b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f33782m.onQueryRefine((CharSequence) tag);
        }
    }

    /* renamed from: p */
    public final Drawable m85356p() {
        Drawable m85358n = m85358n(this.f33783n.getSearchActivity());
        if (m85358n != null) {
            return m85358n;
        }
        return this.f33784o.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: q */
    public final Drawable m85355q(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return m85354r(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f33784o.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                try {
                    openInputStream.close();
                } catch (IOException e) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e);
                }
                return createFromStream;
            }
            throw new FileNotFoundException("Failed to open " + uri);
        } catch (FileNotFoundException e2) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e2.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e2.getMessage());
        return null;
    }

    /* renamed from: r */
    public Drawable m85354r(Uri uri) throws FileNotFoundException {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f33784o.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        }
        throw new FileNotFoundException("No authority: " + uri);
    }

    /* renamed from: s */
    public final Drawable m85353s(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f33784o.getPackageName() + "/" + parseInt;
            Drawable m85361k = m85361k(str2);
            if (m85361k != null) {
                return m85361k;
            }
            Drawable m94299e = NA0.m94299e(this.f33784o, parseInt);
            m85363A(str2, m94299e);
            return m94299e;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable m85361k2 = m85361k(str);
            if (m85361k2 != null) {
                return m85361k2;
            }
            Drawable m85355q = m85355q(Uri.parse(str));
            m85363A(str, m85355q);
            return m85355q;
        }
    }

    /* renamed from: t */
    public final Drawable m85352t(Cursor cursor) {
        int i = this.f33793x;
        if (i == -1) {
            return null;
        }
        Drawable m85353s = m85353s(cursor.getString(i));
        if (m85353s != null) {
            return m85353s;
        }
        return m85356p();
    }

    /* renamed from: u */
    public final Drawable m85351u(Cursor cursor) {
        int i = this.f33794y;
        if (i == -1) {
            return null;
        }
        return m85353s(cursor.getString(i));
    }

    /* renamed from: v */
    public Cursor m85350v(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f33784o.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    /* renamed from: x */
    public void m85348x(int i) {
        this.f33788s = i;
    }

    /* renamed from: y */
    public final void m85347y(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: z */
    public final void m85346z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }
}
