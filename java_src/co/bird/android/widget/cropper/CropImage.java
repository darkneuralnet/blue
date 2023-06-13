package co.bird.android.widget.cropper;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.MediaStore;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.C11925l;
import co.bird.android.widget.cropper.CropImageView;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes4.dex */
public final class CropImage {

    /* loaded from: classes4.dex */
    public static final class ActivityResult extends CropImageView.C16641b implements Parcelable {
        public static final Parcelable.Creator<ActivityResult> CREATOR = new C16637a();

        /* renamed from: co.bird.android.widget.cropper.CropImage$ActivityResult$a */
        /* loaded from: classes4.dex */
        public class C16637a implements Parcelable.Creator<ActivityResult> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public ActivityResult createFromParcel(Parcel parcel) {
                return new ActivityResult(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public ActivityResult[] newArray(int i) {
                return new ActivityResult[i];
            }
        }

        public ActivityResult(Uri uri, Uri uri2, Exception exc, float[] fArr, Rect rect, int i, Rect rect2, int i2) {
            super(null, uri, null, uri2, exc, fArr, rect, rect2, i, i2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(m54162d(), i);
            parcel.writeParcelable(m54159h(), i);
            parcel.writeSerializable(m54163c());
            parcel.writeFloatArray(m54165a());
            parcel.writeParcelable(m54164b(), i);
            parcel.writeParcelable(m54158i(), i);
            parcel.writeInt(m54161e());
            parcel.writeInt(m54160g());
        }

        public ActivityResult(Parcel parcel) {
            super(null, (Uri) parcel.readParcelable(Uri.class.getClassLoader()), null, (Uri) parcel.readParcelable(Uri.class.getClassLoader()), (Exception) parcel.readSerializable(), parcel.createFloatArray(), (Rect) parcel.readParcelable(Rect.class.getClassLoader()), (Rect) parcel.readParcelable(Rect.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }
    }

    /* renamed from: co.bird.android.widget.cropper.CropImage$a */
    /* loaded from: classes4.dex */
    public static final class C16638a {

        /* renamed from: a */
        public final Uri f67807a;

        /* renamed from: b */
        public final CropImageOptions f67808b;

        /* renamed from: a */
        public Intent m54205a(Context context) {
            return m54204b(context, CropImageActivity.class);
        }

        /* renamed from: b */
        public Intent m54204b(Context context, Class<?> cls) {
            this.f67808b.m54191a();
            Intent intent = new Intent();
            intent.setClass(context, cls);
            Bundle bundle = new Bundle();
            bundle.putParcelable("CROP_IMAGE_EXTRA_SOURCE", this.f67807a);
            bundle.putParcelable("CROP_IMAGE_EXTRA_OPTIONS", this.f67808b);
            intent.putExtra("bundle", bundle);
            return intent;
        }

        /* renamed from: c */
        public C16638a m54203c(int i, int i2) {
            CropImageOptions cropImageOptions = this.f67808b;
            cropImageOptions.f67845n = i;
            cropImageOptions.f67846o = i2;
            cropImageOptions.f67844m = true;
            return this;
        }

        /* renamed from: d */
        public C16638a m54202d(CropImageView.EnumC16642c enumC16642c) {
            this.f67808b.f67833b = enumC16642c;
            return this;
        }

        /* renamed from: e */
        public C16638a m54201e(int i, int i2) {
            CropImageOptions cropImageOptions = this.f67808b;
            cropImageOptions.f67814C = i;
            cropImageOptions.f67815D = i2;
            return this;
        }

        /* renamed from: f */
        public C16638a m54200f(int i, int i2) {
            CropImageOptions cropImageOptions = this.f67808b;
            cropImageOptions.f67856y = i;
            cropImageOptions.f67857z = i2;
            return this;
        }

        /* renamed from: g */
        public void m54199g(Activity activity) {
            this.f67808b.m54191a();
            activity.startActivityForResult(m54205a(activity), 203);
        }

        public C16638a(Uri uri) {
            this.f67807a = uri;
            this.f67808b = new CropImageOptions();
        }
    }

    private CropImage() {
    }

    /* renamed from: a */
    public static C16638a m54220a() {
        return new C16638a(null);
    }

    /* renamed from: b */
    public static ActivityResult m54219b(Intent intent) {
        if (intent != null) {
            return (ActivityResult) intent.getParcelableExtra("CROP_IMAGE_EXTRA_RESULT");
        }
        return null;
    }

    /* renamed from: c */
    public static List<Intent> m54218c(Context context, PackageManager packageManager) {
        ArrayList arrayList = new ArrayList();
        Uri m54217d = m54217d(context);
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 0)) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (m54217d != null) {
                intent2.putExtra("output", m54217d);
            }
            arrayList.add(intent2);
        }
        return arrayList;
    }

    /* renamed from: d */
    public static Uri m54217d(Context context) {
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir != null) {
            File file = new File(externalCacheDir.getPath(), "pickImageResult.jpeg");
            if (!file.exists()) {
                file.mkdirs();
            }
            return FileProvider.m67714f(context, context.getPackageName() + ".fileprovider", file);
        }
        return null;
    }

    /* renamed from: e */
    public static List<Intent> m54216e(PackageManager packageManager, String str, boolean z) {
        Intent intent;
        ArrayList arrayList = new ArrayList();
        if (str.equals("android.intent.action.GET_CONTENT")) {
            intent = new Intent(str);
        } else {
            intent = new Intent(str, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        }
        intent.setType("image/*");
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 0)) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            arrayList.add(intent2);
        }
        if (!z) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Intent intent3 = (Intent) it.next();
                if (intent3.getComponent().getClassName().equals("com.android.documentsui.DocumentsActivity")) {
                    arrayList.remove(intent3);
                    break;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public static Intent m54215f(Context context) {
        return m54214g(context, context.getString(C45871nl4.pick_image_intent_chooser_title), false, true);
    }

    /* renamed from: g */
    public static Intent m54214g(Context context, CharSequence charSequence, boolean z, boolean z2) {
        Intent intent;
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        if (!m54211j(context) && z2) {
            arrayList.addAll(m54218c(context, packageManager));
        }
        List<Intent> m54216e = m54216e(packageManager, "android.intent.action.GET_CONTENT", z);
        if (m54216e.size() == 0) {
            m54216e = m54216e(packageManager, "android.intent.action.PICK", z);
        }
        arrayList.addAll(m54216e);
        if (arrayList.isEmpty()) {
            intent = new Intent();
        } else {
            intent = (Intent) arrayList.get(arrayList.size() - 1);
            arrayList.remove(arrayList.size() - 1);
        }
        Intent createChooser = Intent.createChooser(intent, charSequence);
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[arrayList.size()]));
        return createChooser;
    }

    /* renamed from: h */
    public static Uri m54213h(Context context, Intent intent) {
        String action;
        boolean z = true;
        if (intent != null && intent.getData() != null && ((action = intent.getAction()) == null || !action.equals("android.media.action.IMAGE_CAPTURE"))) {
            z = false;
        }
        if (!z && intent.getData() != null) {
            return intent.getData();
        }
        return m54217d(context);
    }

    /* renamed from: i */
    public static boolean m54212i(Context context, String str) {
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null && strArr.length > 0) {
                for (String str2 : strArr) {
                    if (str2.equalsIgnoreCase(str)) {
                        return true;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m54211j(Context context) {
        if (m54212i(context, "android.permission.CAMERA") && context.checkSelfPermission("android.permission.CAMERA") != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m54210k(Context context, Uri uri) {
        if (context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0 && m54209l(context, uri)) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public static boolean m54209l(Context context, Uri uri) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                openInputStream.close();
                return false;
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: m */
    public static void m54208m(Activity activity) {
        activity.startActivityForResult(m54215f(activity), C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION);
    }
}
