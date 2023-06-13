package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0002\u0012\u0010B1\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bB\u0011\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\n\u0010\u0016R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016¨\u0006\u001f"}, m28432d2 = {"Landroidx/activity/result/IntentSenderRequest;", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "Landroid/content/IntentSender;", "b", "Landroid/content/IntentSender;", DateTokenConverter.CONVERTER_KEY, "()Landroid/content/IntentSender;", "intentSender", "Landroid/content/Intent;", "c", "Landroid/content/Intent;", C17296a.f69688o, "()Landroid/content/Intent;", "fillInIntent", "I", "()I", "flagsMask", "e", "flagsValues", "<init>", "(Landroid/content/IntentSender;Landroid/content/Intent;II)V", "parcel", "(Landroid/os/Parcel;)V", "f", "activity_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class IntentSenderRequest implements Parcelable {

    /* renamed from: b */
    public final IntentSender f51470b;

    /* renamed from: c */
    public final Intent f51471c;

    /* renamed from: d */
    public final int f51472d;

    /* renamed from: e */
    public final int f51473e;

    /* renamed from: f */
    public static final C10951c f51469f = new C10951c(null);
    @JvmField
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new C10950b();

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\tR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0015"}, m28432d2 = {"Landroidx/activity/result/IntentSenderRequest$a;", "", "Landroid/content/Intent;", "fillInIntent", "b", "", "values", "mask", "c", "Landroidx/activity/result/IntentSenderRequest;", C17296a.f69688o, "Landroid/content/IntentSender;", "Landroid/content/IntentSender;", "intentSender", "Landroid/content/Intent;", "I", "flagsMask", DateTokenConverter.CONVERTER_KEY, "flagsValues", "<init>", "(Landroid/content/IntentSender;)V", "activity_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.activity.result.IntentSenderRequest$a */
    /* loaded from: classes.dex */
    public static final class C10949a {

        /* renamed from: a */
        public final IntentSender f51474a;

        /* renamed from: b */
        public Intent f51475b;

        /* renamed from: c */
        public int f51476c;

        /* renamed from: d */
        public int f51477d;

        public C10949a(IntentSender intentSender) {
            Intrinsics.checkNotNullParameter(intentSender, "intentSender");
            this.f51474a = intentSender;
        }

        /* renamed from: a */
        public final IntentSenderRequest m70463a() {
            return new IntentSenderRequest(this.f51474a, this.f51475b, this.f51476c, this.f51477d);
        }

        /* renamed from: b */
        public final C10949a m70462b(Intent intent) {
            this.f51475b = intent;
            return this;
        }

        /* renamed from: c */
        public final C10949a m70461c(int i, int i2) {
            this.f51477d = i;
            this.f51476c = i2;
            return this;
        }
    }

    @Metadata(m28433d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m28432d2 = {"androidx/activity/result/IntentSenderRequest$b", "Landroid/os/Parcelable$Creator;", "Landroidx/activity/result/IntentSenderRequest;", "Landroid/os/Parcel;", "inParcel", C17296a.f69688o, "", "size", "", "b", "(I)[Landroidx/activity/result/IntentSenderRequest;", "activity_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.activity.result.IntentSenderRequest$b */
    /* loaded from: classes.dex */
    public static final class C10950b implements Parcelable.Creator<IntentSenderRequest> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public IntentSenderRequest createFromParcel(Parcel inParcel) {
            Intrinsics.checkNotNullParameter(inParcel, "inParcel");
            return new IntentSenderRequest(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public IntentSenderRequest[] newArray(int i) {
            return new IntentSenderRequest[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\u0007R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m28432d2 = {"Landroidx/activity/result/IntentSenderRequest$c;", "", "Landroid/os/Parcelable$Creator;", "Landroidx/activity/result/IntentSenderRequest;", "CREATOR", "Landroid/os/Parcelable$Creator;", "getCREATOR$annotations", "()V", "<init>", "activity_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.activity.result.IntentSenderRequest$c */
    /* loaded from: classes.dex */
    public static final class C10951c {
        public /* synthetic */ C10951c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C10951c() {
        }
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2) {
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.f51470b = intentSender;
        this.f51471c = intent;
        this.f51472d = i;
        this.f51473e = i2;
    }

    /* renamed from: a */
    public final Intent m70467a() {
        return this.f51471c;
    }

    /* renamed from: b */
    public final int m70466b() {
        return this.f51472d;
    }

    /* renamed from: c */
    public final int m70465c() {
        return this.f51473e;
    }

    /* renamed from: d */
    public final IntentSender m70464d() {
        return this.f51470b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f51470b, i);
        dest.writeParcelable(this.f51471c, i);
        dest.writeInt(this.f51472d);
        dest.writeInt(this.f51473e);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IntentSenderRequest(Parcel parcel) {
        this((IntentSender) r0, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        Intrinsics.checkNotNull(readParcelable);
    }
}
