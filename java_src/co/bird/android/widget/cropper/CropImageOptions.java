package co.bird.android.widget.cropper;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import co.bird.android.widget.cropper.CropImageView;
import kotlin.KotlinVersion;
/* loaded from: classes4.dex */
public class CropImageOptions implements Parcelable {
    public static final Parcelable.Creator<CropImageOptions> CREATOR = new C16639a();

    /* renamed from: A */
    public int f67812A;

    /* renamed from: B */
    public int f67813B;

    /* renamed from: C */
    public int f67814C;

    /* renamed from: D */
    public int f67815D;

    /* renamed from: E */
    public CharSequence f67816E;

    /* renamed from: F */
    public int f67817F;

    /* renamed from: G */
    public Uri f67818G;

    /* renamed from: H */
    public Bitmap.CompressFormat f67819H;

    /* renamed from: I */
    public int f67820I;

    /* renamed from: J */
    public int f67821J;

    /* renamed from: K */
    public int f67822K;

    /* renamed from: P */
    public CropImageView.EnumC16647h f67823P;

    /* renamed from: Q */
    public boolean f67824Q;

    /* renamed from: R */
    public Rect f67825R;

    /* renamed from: S */
    public int f67826S;

    /* renamed from: T */
    public boolean f67827T;

    /* renamed from: U */
    public boolean f67828U;

    /* renamed from: W */
    public boolean f67829W;

    /* renamed from: X */
    public int f67830X;

    /* renamed from: Y */
    public boolean f67831Y;

    /* renamed from: Z */
    public boolean f67832Z;

    /* renamed from: b */
    public CropImageView.EnumC16642c f67833b;

    /* renamed from: c */
    public float f67834c;

    /* renamed from: d */
    public float f67835d;

    /* renamed from: e */
    public CropImageView.EnumC16643d f67836e;

    /* renamed from: f */
    public CropImageView.EnumC16648i f67837f;

    /* renamed from: g */
    public boolean f67838g;

    /* renamed from: h */
    public boolean f67839h;

    /* renamed from: i */
    public boolean f67840i;

    /* renamed from: j */
    public boolean f67841j;

    /* renamed from: k */
    public int f67842k;

    /* renamed from: l */
    public float f67843l;

    /* renamed from: m */
    public boolean f67844m;

    /* renamed from: n */
    public int f67845n;

    /* renamed from: o */
    public int f67846o;

    /* renamed from: p */
    public float f67847p;

    /* renamed from: q */
    public int f67848q;

    /* renamed from: r */
    public float f67849r;

    /* renamed from: s */
    public float f67850s;

    /* renamed from: t */
    public float f67851t;

    /* renamed from: u */
    public int f67852u;

    /* renamed from: v */
    public float f67853v;

    /* renamed from: w */
    public int f67854w;

    /* renamed from: x */
    public int f67855x;

    /* renamed from: y */
    public int f67856y;

    /* renamed from: z */
    public int f67857z;

    /* renamed from: co.bird.android.widget.cropper.CropImageOptions$a */
    /* loaded from: classes4.dex */
    public class C16639a implements Parcelable.Creator<CropImageOptions> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public CropImageOptions createFromParcel(Parcel parcel) {
            return new CropImageOptions(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public CropImageOptions[] newArray(int i) {
            return new CropImageOptions[i];
        }
    }

    public CropImageOptions() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        this.f67833b = CropImageView.EnumC16642c.RECTANGLE;
        this.f67834c = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.f67835d = TypedValue.applyDimension(1, 24.0f, displayMetrics);
        this.f67836e = CropImageView.EnumC16643d.ON_TOUCH;
        this.f67837f = CropImageView.EnumC16648i.FIT_CENTER;
        this.f67838g = true;
        this.f67839h = true;
        this.f67840i = true;
        this.f67841j = false;
        this.f67842k = 4;
        this.f67843l = 0.1f;
        this.f67844m = false;
        this.f67845n = 1;
        this.f67846o = 1;
        this.f67847p = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.f67848q = Color.argb(170, (int) KotlinVersion.MAX_COMPONENT_VALUE, (int) KotlinVersion.MAX_COMPONENT_VALUE, (int) KotlinVersion.MAX_COMPONENT_VALUE);
        this.f67849r = TypedValue.applyDimension(1, 2.0f, displayMetrics);
        this.f67850s = TypedValue.applyDimension(1, 5.0f, displayMetrics);
        this.f67851t = TypedValue.applyDimension(1, 14.0f, displayMetrics);
        this.f67852u = -1;
        this.f67853v = TypedValue.applyDimension(1, 1.0f, displayMetrics);
        this.f67854w = Color.argb(170, (int) KotlinVersion.MAX_COMPONENT_VALUE, (int) KotlinVersion.MAX_COMPONENT_VALUE, (int) KotlinVersion.MAX_COMPONENT_VALUE);
        this.f67855x = Color.argb(119, 0, 0, 0);
        this.f67856y = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.f67857z = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.f67812A = 40;
        this.f67813B = 40;
        this.f67814C = 99999;
        this.f67815D = 99999;
        this.f67816E = "";
        this.f67817F = 0;
        this.f67818G = Uri.EMPTY;
        this.f67819H = Bitmap.CompressFormat.JPEG;
        this.f67820I = 90;
        this.f67821J = 0;
        this.f67822K = 0;
        this.f67823P = CropImageView.EnumC16647h.NONE;
        this.f67824Q = false;
        this.f67825R = null;
        this.f67826S = -1;
        this.f67827T = true;
        this.f67828U = true;
        this.f67829W = false;
        this.f67830X = 90;
        this.f67831Y = false;
        this.f67832Z = false;
    }

    /* renamed from: a */
    public void m54191a() {
        if (this.f67842k >= 0) {
            if (this.f67835d >= 0.0f) {
                float f = this.f67843l;
                if (f >= 0.0f && f < 0.5d) {
                    if (this.f67845n > 0) {
                        if (this.f67846o > 0) {
                            if (this.f67847p >= 0.0f) {
                                if (this.f67849r >= 0.0f) {
                                    if (this.f67853v >= 0.0f) {
                                        if (this.f67857z >= 0) {
                                            int i = this.f67812A;
                                            if (i >= 0) {
                                                int i2 = this.f67813B;
                                                if (i2 >= 0) {
                                                    if (this.f67814C >= i) {
                                                        if (this.f67815D >= i2) {
                                                            if (this.f67821J >= 0) {
                                                                if (this.f67822K >= 0) {
                                                                    int i3 = this.f67830X;
                                                                    if (i3 >= 0 && i3 <= 360) {
                                                                        return;
                                                                    }
                                                                    throw new IllegalArgumentException("Cannot set rotation degrees value to a number < 0 or > 360");
                                                                }
                                                                throw new IllegalArgumentException("Cannot set request height value to a number < 0 ");
                                                            }
                                                            throw new IllegalArgumentException("Cannot set request width value to a number < 0 ");
                                                        }
                                                        throw new IllegalArgumentException("Cannot set max crop result height to smaller value than min crop result height");
                                                    }
                                                    throw new IllegalArgumentException("Cannot set max crop result width to smaller value than min crop result width");
                                                }
                                                throw new IllegalArgumentException("Cannot set min crop result height value to a number < 0 ");
                                            }
                                            throw new IllegalArgumentException("Cannot set min crop result width value to a number < 0 ");
                                        }
                                        throw new IllegalArgumentException("Cannot set min crop window height value to a number < 0 ");
                                    }
                                    throw new IllegalArgumentException("Cannot set guidelines thickness value to a number less than 0.");
                                }
                                throw new IllegalArgumentException("Cannot set corner thickness value to a number less than 0.");
                            }
                            throw new IllegalArgumentException("Cannot set line thickness value to a number less than 0.");
                        }
                        throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
                    }
                    throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
                }
                throw new IllegalArgumentException("Cannot set initial crop window padding value to a number < 0 or >= 0.5");
            }
            throw new IllegalArgumentException("Cannot set touch radius value to a number <= 0 ");
        }
        throw new IllegalArgumentException("Cannot set max zoom to a number < 1");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f67833b.ordinal());
        parcel.writeFloat(this.f67834c);
        parcel.writeFloat(this.f67835d);
        parcel.writeInt(this.f67836e.ordinal());
        parcel.writeInt(this.f67837f.ordinal());
        parcel.writeByte(this.f67838g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f67839h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f67840i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f67841j ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f67842k);
        parcel.writeFloat(this.f67843l);
        parcel.writeByte(this.f67844m ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f67845n);
        parcel.writeInt(this.f67846o);
        parcel.writeFloat(this.f67847p);
        parcel.writeInt(this.f67848q);
        parcel.writeFloat(this.f67849r);
        parcel.writeFloat(this.f67850s);
        parcel.writeFloat(this.f67851t);
        parcel.writeInt(this.f67852u);
        parcel.writeFloat(this.f67853v);
        parcel.writeInt(this.f67854w);
        parcel.writeInt(this.f67855x);
        parcel.writeInt(this.f67856y);
        parcel.writeInt(this.f67857z);
        parcel.writeInt(this.f67812A);
        parcel.writeInt(this.f67813B);
        parcel.writeInt(this.f67814C);
        parcel.writeInt(this.f67815D);
        TextUtils.writeToParcel(this.f67816E, parcel, i);
        parcel.writeInt(this.f67817F);
        parcel.writeParcelable(this.f67818G, i);
        parcel.writeString(this.f67819H.name());
        parcel.writeInt(this.f67820I);
        parcel.writeInt(this.f67821J);
        parcel.writeInt(this.f67822K);
        parcel.writeInt(this.f67823P.ordinal());
        parcel.writeInt(this.f67824Q ? 1 : 0);
        parcel.writeParcelable(this.f67825R, i);
        parcel.writeInt(this.f67826S);
        parcel.writeByte(this.f67827T ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f67828U ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f67829W ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f67830X);
        parcel.writeByte(this.f67831Y ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f67832Z ? (byte) 1 : (byte) 0);
    }

    public CropImageOptions(Parcel parcel) {
        this.f67833b = CropImageView.EnumC16642c.values()[parcel.readInt()];
        this.f67834c = parcel.readFloat();
        this.f67835d = parcel.readFloat();
        this.f67836e = CropImageView.EnumC16643d.values()[parcel.readInt()];
        this.f67837f = CropImageView.EnumC16648i.values()[parcel.readInt()];
        this.f67838g = parcel.readByte() != 0;
        this.f67839h = parcel.readByte() != 0;
        this.f67840i = parcel.readByte() != 0;
        this.f67841j = parcel.readByte() != 0;
        this.f67842k = parcel.readInt();
        this.f67843l = parcel.readFloat();
        this.f67844m = parcel.readByte() != 0;
        this.f67845n = parcel.readInt();
        this.f67846o = parcel.readInt();
        this.f67847p = parcel.readFloat();
        this.f67848q = parcel.readInt();
        this.f67849r = parcel.readFloat();
        this.f67850s = parcel.readFloat();
        this.f67851t = parcel.readFloat();
        this.f67852u = parcel.readInt();
        this.f67853v = parcel.readFloat();
        this.f67854w = parcel.readInt();
        this.f67855x = parcel.readInt();
        this.f67856y = parcel.readInt();
        this.f67857z = parcel.readInt();
        this.f67812A = parcel.readInt();
        this.f67813B = parcel.readInt();
        this.f67814C = parcel.readInt();
        this.f67815D = parcel.readInt();
        this.f67816E = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f67817F = parcel.readInt();
        this.f67818G = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f67819H = Bitmap.CompressFormat.valueOf(parcel.readString());
        this.f67820I = parcel.readInt();
        this.f67821J = parcel.readInt();
        this.f67822K = parcel.readInt();
        this.f67823P = CropImageView.EnumC16647h.values()[parcel.readInt()];
        this.f67824Q = parcel.readByte() != 0;
        this.f67825R = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.f67826S = parcel.readInt();
        this.f67827T = parcel.readByte() != 0;
        this.f67828U = parcel.readByte() != 0;
        this.f67829W = parcel.readByte() != 0;
        this.f67830X = parcel.readInt();
        this.f67831Y = parcel.readByte() != 0;
        this.f67832Z = parcel.readByte() != 0;
    }
}
