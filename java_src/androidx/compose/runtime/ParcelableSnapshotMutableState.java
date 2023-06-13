package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u0010*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u0011B\u001d\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016¨\u0006\u0012"}, m28432d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "T", "LDM5;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "", "writeToParcel", "describeContents", "value", "LEM5;", "policy", "<init>", "(Ljava/lang/Object;LEM5;)V", DateTokenConverter.CONVERTER_KEY, "b", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ParcelableSnapshotMutableState<T> extends DM5<T> implements Parcelable {

    /* renamed from: d */
    public static final C11288b f52936d = new C11288b(null);
    @JvmField
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new C11287a();

    @Metadata(m28433d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001J\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J'\u0010\r\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m28432d2 = {"androidx/compose/runtime/ParcelableSnapshotMutableState$a", "Landroid/os/Parcelable$ClassLoaderCreator;", "Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "", "Landroid/os/Parcel;", "parcel", "Ljava/lang/ClassLoader;", "loader", "b", C17296a.f69688o, "", "size", "", "c", "(I)[Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.runtime.ParcelableSnapshotMutableState$a */
    /* loaded from: classes.dex */
    public static final class C11287a implements Parcelable.ClassLoaderCreator<ParcelableSnapshotMutableState<Object>> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b */
        public ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            EM5 m105198i;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (classLoader == null) {
                classLoader = C11287a.class.getClassLoader();
            }
            Object readValue = parcel.readValue(classLoader);
            int readInt = parcel.readInt();
            if (readInt != 0) {
                if (readInt != 1) {
                    if (readInt == 2) {
                        m105198i = GM5.m105194m();
                    } else {
                        throw new IllegalStateException("Unsupported MutableState policy " + readInt + " was restored");
                    }
                } else {
                    m105198i = GM5.m105191p();
                }
            } else {
                m105198i = GM5.m105198i();
            }
            return new ParcelableSnapshotMutableState<>(readValue, m105198i);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public ParcelableSnapshotMutableState<Object>[] newArray(int i) {
            return new ParcelableSnapshotMutableState[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u0007R(\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000e"}, m28432d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState$b;", "", "Landroid/os/Parcelable$Creator;", "Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "CREATOR", "Landroid/os/Parcelable$Creator;", "getCREATOR$annotations", "()V", "", "PolicyNeverEquals", "I", "PolicyReferentialEquality", "PolicyStructuralEquality", "<init>", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.runtime.ParcelableSnapshotMutableState$b */
    /* loaded from: classes.dex */
    public static final class C11288b {
        public /* synthetic */ C11288b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C11288b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParcelableSnapshotMutableState(T t, EM5<T> policy) {
        super(t, policy);
        Intrinsics.checkNotNullParameter(policy, "policy");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeValue(getValue());
        EM5<T> mo110564a = mo110564a();
        if (Intrinsics.areEqual(mo110564a, GM5.m105198i())) {
            i2 = 0;
        } else if (Intrinsics.areEqual(mo110564a, GM5.m105191p())) {
            i2 = 1;
        } else if (Intrinsics.areEqual(mo110564a, GM5.m105194m())) {
            i2 = 2;
        } else {
            throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
        }
        parcel.writeInt(i2);
    }
}
