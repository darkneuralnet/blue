package androidx.compose.foundation.lazy.layout;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0083\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, m28432d2 = {"Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "", "writeToParcel", "describeContents", "", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "b", "I", "index", "<init>", "(I)V", "c", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class DefaultLazyKey implements Parcelable {

    /* renamed from: b */
    public final int f52921b;

    /* renamed from: c */
    public static final C11284b f52920c = new C11284b(null);
    @JvmField
    public static final Parcelable.Creator<DefaultLazyKey> CREATOR = new C11283a();

    @Metadata(m28433d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m28432d2 = {"androidx/compose/foundation/lazy/layout/DefaultLazyKey$a", "Landroid/os/Parcelable$Creator;", "Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;", "Landroid/os/Parcel;", "parcel", C17296a.f69688o, "", "size", "", "b", "(I)[Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.lazy.layout.DefaultLazyKey$a */
    /* loaded from: classes.dex */
    public static final class C11283a implements Parcelable.Creator<DefaultLazyKey> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public DefaultLazyKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DefaultLazyKey(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public DefaultLazyKey[] newArray(int i) {
            return new DefaultLazyKey[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\u0007R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m28432d2 = {"Landroidx/compose/foundation/lazy/layout/DefaultLazyKey$b;", "", "Landroid/os/Parcelable$Creator;", "Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;", "CREATOR", "Landroid/os/Parcelable$Creator;", "getCREATOR$annotations", "()V", "<init>", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.lazy.layout.DefaultLazyKey$b */
    /* loaded from: classes.dex */
    public static final class C11284b {
        public /* synthetic */ C11284b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C11284b() {
        }
    }

    public DefaultLazyKey(int i) {
        this.f52921b = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DefaultLazyKey) && this.f52921b == ((DefaultLazyKey) obj).f52921b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f52921b);
    }

    public String toString() {
        return "DefaultLazyKey(index=" + this.f52921b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.f52921b);
    }
}
