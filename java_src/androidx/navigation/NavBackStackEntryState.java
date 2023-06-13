package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.AbstractC11719f;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 +2\u00020\u0001:\u0001\u000bB\u0011\b\u0016\u0012\u0006\u0010&\u001a\u00020\n¢\u0006\u0004\b'\u0010(B\u0011\b\u0016\u0012\u0006\u0010)\u001a\u00020\u000e¢\u0006\u0004\b'\u0010*J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bJ\b\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0016R\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010%\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!¨\u0006,"}, m28432d2 = {"Landroidx/navigation/NavBackStackEntryState;", "Landroid/os/Parcelable;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LHY2;", "destination", "Landroidx/lifecycle/f$b;", "hostLifecycleState", "LEY2;", "viewModel", "LAY2;", "b", "", "describeContents", "Landroid/os/Parcel;", "parcel", "i", "", "writeToParcel", "", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "c", "I", C17296a.f69688o, "()I", "destinationId", "Landroid/os/Bundle;", DateTokenConverter.CONVERTER_KEY, "Landroid/os/Bundle;", "getArgs", "()Landroid/os/Bundle;", "args", "e", "getSavedState", "savedState", "entry", "<init>", "(LAY2;)V", "inParcel", "(Landroid/os/Parcel;)V", "f", "navigation-runtime_release"}, m28431k = 1, m28430mv = {1, 6, 0})
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class NavBackStackEntryState implements Parcelable {

    /* renamed from: b */
    public final String f55118b;

    /* renamed from: c */
    public final int f55119c;

    /* renamed from: d */
    public final Bundle f55120d;

    /* renamed from: e */
    public final Bundle f55121e;

    /* renamed from: f */
    public static final C11809b f55117f = new C11809b(null);
    @JvmField
    public static final Parcelable.Creator<NavBackStackEntryState> CREATOR = new C11808a();

    @Metadata(m28433d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m28432d2 = {"androidx/navigation/NavBackStackEntryState$a", "Landroid/os/Parcelable$Creator;", "Landroidx/navigation/NavBackStackEntryState;", "Landroid/os/Parcel;", "inParcel", C17296a.f69688o, "", "size", "", "b", "(I)[Landroidx/navigation/NavBackStackEntryState;", "navigation-runtime_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: androidx.navigation.NavBackStackEntryState$a */
    /* loaded from: classes.dex */
    public static final class C11808a implements Parcelable.Creator<NavBackStackEntryState> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public NavBackStackEntryState createFromParcel(Parcel inParcel) {
            Intrinsics.checkNotNullParameter(inParcel, "inParcel");
            return new NavBackStackEntryState(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public NavBackStackEntryState[] newArray(int i) {
            return new NavBackStackEntryState[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m28432d2 = {"Landroidx/navigation/NavBackStackEntryState$b;", "", "Landroid/os/Parcelable$Creator;", "Landroidx/navigation/NavBackStackEntryState;", "CREATOR", "Landroid/os/Parcelable$Creator;", "<init>", "()V", "navigation-runtime_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: androidx.navigation.NavBackStackEntryState$b */
    /* loaded from: classes.dex */
    public static final class C11809b {
        public /* synthetic */ C11809b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C11809b() {
        }
    }

    public NavBackStackEntryState(AY2 entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f55118b = entry.m115581g();
        this.f55119c = entry.m115582f().m103774s();
        this.f55120d = entry.m115584d();
        Bundle bundle = new Bundle();
        this.f55121e = bundle;
        entry.m115577k(bundle);
    }

    /* renamed from: a */
    public final int m66835a() {
        return this.f55119c;
    }

    /* renamed from: b */
    public final AY2 m66834b(Context context, HY2 destination, AbstractC11719f.EnumC11724b hostLifecycleState, EY2 ey2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
        Bundle bundle = this.f55120d;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        return AY2.f752o.m115573a(context, destination, bundle, hostLifecycleState, ey2, this.f55118b, this.f55121e);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getId() {
        return this.f55118b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.f55118b);
        parcel.writeInt(this.f55119c);
        parcel.writeBundle(this.f55120d);
        parcel.writeBundle(this.f55121e);
    }

    public NavBackStackEntryState(Parcel inParcel) {
        Intrinsics.checkNotNullParameter(inParcel, "inParcel");
        String readString = inParcel.readString();
        Intrinsics.checkNotNull(readString);
        this.f55118b = readString;
        this.f55119c = inParcel.readInt();
        this.f55120d = inParcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        Bundle readBundle = inParcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        Intrinsics.checkNotNull(readBundle);
        this.f55121e = readBundle;
    }
}
