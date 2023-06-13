package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/model/PhotoSavedModel;", "Landroid/os/Parcelable;", "photoPath", "", "photoFolderPath", "(Ljava/lang/String;Ljava/lang/String;)V", "getPhotoFolderPath", "()Ljava/lang/String;", "getPhotoPath", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class PhotoSavedModel implements Parcelable {
    public static final Parcelable.Creator<PhotoSavedModel> CREATOR = new Creator();
    private final String photoFolderPath;
    private final String photoPath;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<PhotoSavedModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhotoSavedModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PhotoSavedModel(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhotoSavedModel[] newArray(int i) {
            return new PhotoSavedModel[i];
        }
    }

    public PhotoSavedModel(String photoPath, String photoFolderPath) {
        Intrinsics.checkNotNullParameter(photoPath, "photoPath");
        Intrinsics.checkNotNullParameter(photoFolderPath, "photoFolderPath");
        this.photoPath = photoPath;
        this.photoFolderPath = photoFolderPath;
    }

    public static /* synthetic */ PhotoSavedModel copy$default(PhotoSavedModel photoSavedModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = photoSavedModel.photoPath;
        }
        if ((i & 2) != 0) {
            str2 = photoSavedModel.photoFolderPath;
        }
        return photoSavedModel.copy(str, str2);
    }

    public final String component1() {
        return this.photoPath;
    }

    public final String component2() {
        return this.photoFolderPath;
    }

    public final PhotoSavedModel copy(String photoPath, String photoFolderPath) {
        Intrinsics.checkNotNullParameter(photoPath, "photoPath");
        Intrinsics.checkNotNullParameter(photoFolderPath, "photoFolderPath");
        return new PhotoSavedModel(photoPath, photoFolderPath);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PhotoSavedModel) {
            PhotoSavedModel photoSavedModel = (PhotoSavedModel) obj;
            return Intrinsics.areEqual(this.photoPath, photoSavedModel.photoPath) && Intrinsics.areEqual(this.photoFolderPath, photoSavedModel.photoFolderPath);
        }
        return false;
    }

    public final String getPhotoFolderPath() {
        return this.photoFolderPath;
    }

    public final String getPhotoPath() {
        return this.photoPath;
    }

    public int hashCode() {
        return (this.photoPath.hashCode() * 31) + this.photoFolderPath.hashCode();
    }

    public String toString() {
        String str = this.photoPath;
        String str2 = this.photoFolderPath;
        return "PhotoSavedModel(photoPath=" + str + ", photoFolderPath=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.photoPath);
        out.writeString(this.photoFolderPath);
    }
}
