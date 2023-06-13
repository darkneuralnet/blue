package co.bird.android.widget.cropper;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import co.bird.android.widget.cropper.CropImage;
import co.bird.android.widget.cropper.CropImageView;
import java.io.File;
import java.io.IOException;
/* loaded from: classes4.dex */
public class CropImageActivity extends AppCompatActivity implements CropImageView.InterfaceC16646g, CropImageView.InterfaceC16644e {

    /* renamed from: b */
    public CropImageView f67809b;

    /* renamed from: c */
    public Uri f67810c;

    /* renamed from: d */
    public CropImageOptions f67811d;

    /* renamed from: A */
    public void m54198A(Uri uri, Exception exc, int i) {
        int i2;
        if (exc == null) {
            i2 = -1;
        } else {
            i2 = 204;
        }
        setResult(i2, m54193x(uri, exc, i));
        finish();
    }

    /* renamed from: B */
    public void m54197B() {
        setResult(0);
        finish();
    }

    /* renamed from: C */
    public final void m54196C(Menu menu, int i, int i2) {
        Drawable icon;
        MenuItem findItem = menu.findItem(i);
        if (findItem != null && (icon = findItem.getIcon()) != null) {
            try {
                icon.mutate();
                icon.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
                findItem.setIcon(icon);
            } catch (Exception e) {
                Log.w("AIC", "Failed to update menu item color", e);
            }
        }
    }

    @Override // co.bird.android.widget.cropper.CropImageView.InterfaceC16644e
    /* renamed from: e */
    public void mo54155e(CropImageView cropImageView, CropImageView.C16641b c16641b) {
        m54198A(c16641b.m54159h(), c16641b.m54163c(), c16641b.m54160g());
    }

    @Override // co.bird.android.widget.cropper.CropImageView.InterfaceC16646g
    /* renamed from: j */
    public void mo54154j(CropImageView cropImageView, Uri uri, Exception exc) {
        if (exc == null) {
            Rect rect = this.f67811d.f67825R;
            if (rect != null) {
                this.f67809b.setCropRect(rect);
            }
            int i = this.f67811d.f67826S;
            if (i > -1) {
                this.f67809b.setRotatedDegrees(i);
                return;
            }
            return;
        }
        m54198A(null, exc, 1);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    @SuppressLint({"NewApi"})
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 200) {
            if (i2 == 0) {
                m54197B();
            }
            if (i2 == -1) {
                Uri m54213h = CropImage.m54213h(this, intent);
                this.f67810c = m54213h;
                if (CropImage.m54210k(this, m54213h)) {
                    requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 201);
                } else {
                    this.f67809b.setImageUriAsync(this.f67810c);
                }
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        m54197B();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"NewApi"})
    public void onCreate(Bundle bundle) {
        CharSequence charSequence;
        super.onCreate(bundle);
        setContentView(C47047pk4.crop_image_activity);
        this.f67809b = (CropImageView) findViewById(C32391Di4.cropImageView);
        Bundle bundleExtra = getIntent().getBundleExtra("bundle");
        this.f67810c = (Uri) bundleExtra.getParcelable("CROP_IMAGE_EXTRA_SOURCE");
        this.f67811d = (CropImageOptions) bundleExtra.getParcelable("CROP_IMAGE_EXTRA_OPTIONS");
        if (bundle == null) {
            Uri uri = this.f67810c;
            if (uri != null && !uri.equals(Uri.EMPTY)) {
                if (CropImage.m54210k(this, this.f67810c)) {
                    requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 201);
                } else {
                    this.f67809b.setImageUriAsync(this.f67810c);
                }
            } else if (CropImage.m54211j(this)) {
                requestPermissions(new String[]{"android.permission.CAMERA"}, 2011);
            } else {
                CropImage.m54208m(this);
            }
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            CharSequence charSequence2 = this.f67811d.f67816E;
            if (charSequence2 != null && charSequence2.length() > 0) {
                charSequence = this.f67811d.f67816E;
            } else {
                charSequence = "";
            }
            supportActionBar.mo70242E(charSequence);
            supportActionBar.mo70212v(true);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C33345Hk4.menu_crop_image, menu);
        CropImageOptions cropImageOptions = this.f67811d;
        if (!cropImageOptions.f67827T) {
            menu.removeItem(C32391Di4.crop_image_menu_rotate_left);
            menu.removeItem(C32391Di4.crop_image_menu_rotate_right);
        } else if (cropImageOptions.f67829W) {
            menu.findItem(C32391Di4.crop_image_menu_rotate_left).setVisible(true);
        }
        if (!this.f67811d.f67828U) {
            menu.removeItem(C32391Di4.crop_image_menu_flip);
        }
        Drawable drawable = null;
        try {
            TypedValue typedValue = new TypedValue();
            Resources resources = getResources();
            int i = C48785sg4.crop_image_menu_crop;
            resources.getValue(i, typedValue, false);
            if (typedValue.data != C48785sg4.crop_image_menu_crop_stub) {
                drawable = NA0.m94299e(this, i);
                menu.findItem(C32391Di4.crop_image_menu_crop).setIcon(drawable);
            }
        } catch (Exception e) {
            Log.w("AIC", "Failed to read menu crop drawable", e);
        }
        int i2 = this.f67811d.f67817F;
        if (i2 != 0) {
            m54196C(menu, C32391Di4.crop_image_menu_rotate_left, i2);
            m54196C(menu, C32391Di4.crop_image_menu_rotate_right, this.f67811d.f67817F);
            m54196C(menu, C32391Di4.crop_image_menu_flip, this.f67811d.f67817F);
            if (drawable != null) {
                m54196C(menu, C32391Di4.crop_image_menu_crop, this.f67811d.f67817F);
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == C32391Di4.crop_image_menu_crop) {
            m54195v();
            return true;
        } else if (menuItem.getItemId() == C32391Di4.crop_image_menu_rotate_left) {
            m54192y(-this.f67811d.f67830X);
            return true;
        } else if (menuItem.getItemId() == C32391Di4.crop_image_menu_rotate_right) {
            m54192y(this.f67811d.f67830X);
            return true;
        } else if (menuItem.getItemId() == C32391Di4.crop_image_menu_flip_horizontally) {
            this.f67809b.m54184e();
            return true;
        } else if (menuItem.getItemId() == C32391Di4.crop_image_menu_flip_vertically) {
            this.f67809b.m54183f();
            return true;
        } else if (menuItem.getItemId() == 16908332) {
            m54197B();
            return true;
        } else {
            return super.onOptionsItemSelected(menuItem);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 201) {
            Uri uri = this.f67810c;
            if (uri != null && iArr.length > 0 && iArr[0] == 0) {
                this.f67809b.setImageUriAsync(uri);
            } else {
                Toast.makeText(this, "Cancelling, required permissions are not granted", 1).show();
                m54197B();
            }
        }
        if (i == 2011) {
            CropImage.m54208m(this);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.f67809b.setOnSetImageUriCompleteListener(this);
        this.f67809b.setOnCropImageCompleteListener(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f67809b.setOnSetImageUriCompleteListener(null);
        this.f67809b.setOnCropImageCompleteListener(null);
    }

    /* renamed from: v */
    public void m54195v() {
        if (this.f67811d.f67824Q) {
            m54198A(null, null, 1);
            return;
        }
        Uri m54194w = m54194w();
        CropImageView cropImageView = this.f67809b;
        CropImageOptions cropImageOptions = this.f67811d;
        cropImageView.m54171r(m54194w, cropImageOptions.f67819H, cropImageOptions.f67820I, cropImageOptions.f67821J, cropImageOptions.f67822K, cropImageOptions.f67823P);
    }

    /* renamed from: w */
    public Uri m54194w() {
        String str;
        Uri uri = this.f67811d.f67818G;
        if (uri == null || uri.equals(Uri.EMPTY)) {
            try {
                Bitmap.CompressFormat compressFormat = this.f67811d.f67819H;
                if (compressFormat == Bitmap.CompressFormat.JPEG) {
                    str = ".jpg";
                } else if (compressFormat == Bitmap.CompressFormat.PNG) {
                    str = ".png";
                } else {
                    str = ".webp";
                }
                return Uri.fromFile(File.createTempFile("cropped", str, getCacheDir()));
            } catch (IOException e) {
                throw new RuntimeException("Failed to create temp file for output image", e);
            }
        }
        return uri;
    }

    /* renamed from: x */
    public Intent m54193x(Uri uri, Exception exc, int i) {
        CropImage.ActivityResult activityResult = new CropImage.ActivityResult(this.f67809b.m54180i(), uri, exc, this.f67809b.m54182g(), this.f67809b.m54181h(), this.f67809b.m54178k(), this.f67809b.m54177l(), i);
        Intent intent = new Intent();
        intent.putExtra("CROP_IMAGE_EXTRA_RESULT", activityResult);
        return intent;
    }

    /* renamed from: y */
    public void m54192y(int i) {
        this.f67809b.m54172q(i);
    }
}
