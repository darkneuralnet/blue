package co.bird.android.model;

import co.bird.android.model.constant.ContentKind;
import co.bird.android.model.constant.UploadKind;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/model/Folder;", "", "uploadKind", "Lco/bird/android/model/constant/UploadKind;", "contentKind", "Lco/bird/android/model/constant/ContentKind;", "(Ljava/lang/String;ILco/bird/android/model/constant/UploadKind;Lco/bird/android/model/constant/ContentKind;)V", "getContentKind", "()Lco/bird/android/model/constant/ContentKind;", "getUploadKind", "()Lco/bird/android/model/constant/UploadKind;", "path", "", "PHOTOS", "ID_CARDS", "NEST_PHOTOS", "DROP_PHOTOS", "RIDE_PHOTOS", "HELMET_SELFIES", "INSPECTION_PHOTOS", "REPAIR_PHOTOS", "COMPLAINT_PHOTOS", "LOCK_ISSUE_PHOTOS", "TRANSFER_ORDERS_BOL_PHOTOS", "Companion", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum Folder {
    PHOTOS(UploadKind.USER_PHOTOS, null, 2, null),
    ID_CARDS(UploadKind.ID_CARDS, null, 2, null),
    NEST_PHOTOS(UploadKind.NEST_PHOTOS, null, 2, null),
    DROP_PHOTOS(UploadKind.DROP_PHOTOS, null, 2, null),
    RIDE_PHOTOS(UploadKind.RIDE_PHOTOS, null, 2, null),
    HELMET_SELFIES(UploadKind.HELMET_SELFIES, null, 2, null),
    INSPECTION_PHOTOS(UploadKind.INSPECTION_PHOTOS, null, 2, null),
    REPAIR_PHOTOS(UploadKind.REPAIR_PHOTOS, null, 2, null),
    COMPLAINT_PHOTOS(UploadKind.COMPLAINT_MODE, null, 2, null),
    LOCK_ISSUE_PHOTOS(UploadKind.LOCK_ISSUE_PHOTOS, null, 2, null),
    TRANSFER_ORDERS_BOL_PHOTOS(UploadKind.TRANSFER_ORDER_BOL_PHOTOS, null, 2, null);
    
    public static final Companion Companion = new Companion(null);
    private final ContentKind contentKind;
    private final UploadKind uploadKind;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/Folder$Companion;", "", "()V", "from", "Lco/bird/android/model/Folder;", "folderString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nFolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Folder.kt\nco/bird/android/model/Folder$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,32:1\n1282#2,2:33\n*S KotlinDebug\n*F\n+ 1 Folder.kt\nco/bird/android/model/Folder$Companion\n*L\n28#1:33,2\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Folder from(String folderString) {
            Folder[] values;
            boolean equals;
            boolean equals2;
            Intrinsics.checkNotNullParameter(folderString, "folderString");
            for (Folder folder : Folder.values()) {
                boolean z = true;
                equals = StringsKt__StringsJVMKt.equals(folder.path(), folderString, true);
                if (!equals) {
                    equals2 = StringsKt__StringsJVMKt.equals(folder.name(), folderString, true);
                    if (!equals2) {
                        z = false;
                    }
                }
                if (z) {
                    return folder;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    Folder(UploadKind uploadKind, ContentKind contentKind) {
        this.uploadKind = uploadKind;
        this.contentKind = contentKind;
    }

    public final ContentKind getContentKind() {
        return this.contentKind;
    }

    public final UploadKind getUploadKind() {
        return this.uploadKind;
    }

    public final String path() {
        String replace$default;
        String lowerCase = name().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        replace$default = StringsKt__StringsJVMKt.replace$default(lowerCase, "_", Detail.EMPTY_CHAR, false, 4, (Object) null);
        return replace$default;
    }

    /* synthetic */ Folder(UploadKind uploadKind, ContentKind contentKind, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uploadKind, (i & 2) != 0 ? ContentKind.JPG : contentKind);
    }
}
