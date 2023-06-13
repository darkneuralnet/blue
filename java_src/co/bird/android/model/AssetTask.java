package co.bird.android.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.AssetManagerType;
import co.bird.android.model.constant.TaskPriority;
import java.io.File;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J=\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020#HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\u0019\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006/"}, m28432d2 = {"Lco/bird/android/model/AssetTask;", "Landroid/os/Parcelable;", "assetId", "", "manager", "Lco/bird/android/model/constant/AssetManagerType;", "priority", "Lco/bird/android/model/constant/TaskPriority;", "date", "Lorg/joda/time/DateTime;", "storageType", "Lco/bird/android/model/StorageType;", "(Ljava/lang/String;Lco/bird/android/model/constant/AssetManagerType;Lco/bird/android/model/constant/TaskPriority;Lorg/joda/time/DateTime;Lco/bird/android/model/StorageType;)V", "getAssetId", "()Ljava/lang/String;", "getDate", "()Lorg/joda/time/DateTime;", "getManager", "()Lco/bird/android/model/constant/AssetManagerType;", "getPriority", "()Lco/bird/android/model/constant/TaskPriority;", "getStorageType", "()Lco/bird/android/model/StorageType;", "assetFile", "Ljava/io/File;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "assetFilePath", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class AssetTask implements Parcelable {
    public static final Parcelable.Creator<AssetTask> CREATOR = new Creator();
    private final String assetId;
    private final DateTime date;
    private final AssetManagerType manager;
    private final TaskPriority priority;
    private final StorageType storageType;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<AssetTask> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetTask createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AssetTask(parcel.readString(), AssetManagerType.valueOf(parcel.readString()), TaskPriority.CREATOR.createFromParcel(parcel), (DateTime) parcel.readSerializable(), StorageType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetTask[] newArray(int i) {
            return new AssetTask[i];
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StorageType.values().length];
            try {
                iArr[StorageType.CACHE_INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StorageType.CACHE_EXTERNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StorageType.FILES_INTERNAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AssetTask(String assetId, AssetManagerType manager, TaskPriority priority, DateTime dateTime, StorageType storageType) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(storageType, "storageType");
        this.assetId = assetId;
        this.manager = manager;
        this.priority = priority;
        this.date = dateTime;
        this.storageType = storageType;
    }

    public static /* synthetic */ AssetTask copy$default(AssetTask assetTask, String str, AssetManagerType assetManagerType, TaskPriority taskPriority, DateTime dateTime, StorageType storageType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = assetTask.assetId;
        }
        if ((i & 2) != 0) {
            assetManagerType = assetTask.manager;
        }
        AssetManagerType assetManagerType2 = assetManagerType;
        if ((i & 4) != 0) {
            taskPriority = assetTask.priority;
        }
        TaskPriority taskPriority2 = taskPriority;
        if ((i & 8) != 0) {
            dateTime = assetTask.date;
        }
        DateTime dateTime2 = dateTime;
        if ((i & 16) != 0) {
            storageType = assetTask.storageType;
        }
        return assetTask.copy(str, assetManagerType2, taskPriority2, dateTime2, storageType);
    }

    public final File assetFile(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new File(assetFilePath(context));
    }

    public final String assetFilePath(Context context) {
        File cacheDir;
        Intrinsics.checkNotNullParameter(context, "context");
        int i = WhenMappings.$EnumSwitchMapping$0[this.storageType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    cacheDir = context.getFilesDir();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                cacheDir = context.getExternalCacheDir();
            }
        } else {
            cacheDir = context.getCacheDir();
        }
        String str = this.assetId;
        return cacheDir + "/assets/" + str;
    }

    public final String component1() {
        return this.assetId;
    }

    public final AssetManagerType component2() {
        return this.manager;
    }

    public final TaskPriority component3() {
        return this.priority;
    }

    public final DateTime component4() {
        return this.date;
    }

    public final StorageType component5() {
        return this.storageType;
    }

    public final AssetTask copy(String assetId, AssetManagerType manager, TaskPriority priority, DateTime dateTime, StorageType storageType) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(storageType, "storageType");
        return new AssetTask(assetId, manager, priority, dateTime, storageType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AssetTask) {
            AssetTask assetTask = (AssetTask) obj;
            return Intrinsics.areEqual(this.assetId, assetTask.assetId) && this.manager == assetTask.manager && this.priority == assetTask.priority && Intrinsics.areEqual(this.date, assetTask.date) && this.storageType == assetTask.storageType;
        }
        return false;
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final DateTime getDate() {
        return this.date;
    }

    public final AssetManagerType getManager() {
        return this.manager;
    }

    public final TaskPriority getPriority() {
        return this.priority;
    }

    public final StorageType getStorageType() {
        return this.storageType;
    }

    public int hashCode() {
        int hashCode = ((((this.assetId.hashCode() * 31) + this.manager.hashCode()) * 31) + this.priority.hashCode()) * 31;
        DateTime dateTime = this.date;
        return ((hashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31) + this.storageType.hashCode();
    }

    public String toString() {
        String str = this.assetId;
        AssetManagerType assetManagerType = this.manager;
        TaskPriority taskPriority = this.priority;
        DateTime dateTime = this.date;
        StorageType storageType = this.storageType;
        return "AssetTask(assetId=" + str + ", manager=" + assetManagerType + ", priority=" + taskPriority + ", date=" + dateTime + ", storageType=" + storageType + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.assetId);
        out.writeString(this.manager.name());
        this.priority.writeToParcel(out, i);
        out.writeSerializable(this.date);
        out.writeString(this.storageType.name());
    }

    public /* synthetic */ AssetTask(String str, AssetManagerType assetManagerType, TaskPriority taskPriority, DateTime dateTime, StorageType storageType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, assetManagerType, taskPriority, (i & 8) != 0 ? null : dateTime, (i & 16) != 0 ? StorageType.FILES_INTERNAL : storageType);
    }
}
