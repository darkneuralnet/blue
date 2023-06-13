package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\f\r\u000e\u000f\u0010¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;", "", "announcement", "Lco/bird/android/model/persistence/Announcement;", "(Lco/bird/android/model/persistence/Announcement;)V", "getAnnouncement", "()Lco/bird/android/model/persistence/Announcement;", "Copy", "Dismiss", "LearnMore", "Primary", "Share", "Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Copy;", "Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Dismiss;", "Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$LearnMore;", "Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Primary;", "Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Share;", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public abstract class FeatureAnnouncementDialogResponse {
    private final Announcement announcement;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Copy;", "Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;", "announcement", "Lco/bird/android/model/persistence/Announcement;", "label", "", "(Lco/bird/android/model/persistence/Announcement;Ljava/lang/String;)V", "getAnnouncement", "()Lco/bird/android/model/persistence/Announcement;", "getLabel", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Copy extends FeatureAnnouncementDialogResponse {
        private final Announcement announcement;
        private final String label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Copy(Announcement announcement, String label) {
            super(announcement, null);
            Intrinsics.checkNotNullParameter(announcement, "announcement");
            Intrinsics.checkNotNullParameter(label, "label");
            this.announcement = announcement;
            this.label = label;
        }

        public static /* synthetic */ Copy copy$default(Copy copy, Announcement announcement, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                announcement = copy.announcement;
            }
            if ((i & 2) != 0) {
                str = copy.label;
            }
            return copy.copy(announcement, str);
        }

        public final Announcement component1() {
            return this.announcement;
        }

        public final String component2() {
            return this.label;
        }

        public final Copy copy(Announcement announcement, String label) {
            Intrinsics.checkNotNullParameter(announcement, "announcement");
            Intrinsics.checkNotNullParameter(label, "label");
            return new Copy(announcement, label);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Copy) {
                Copy copy = (Copy) obj;
                return Intrinsics.areEqual(this.announcement, copy.announcement) && Intrinsics.areEqual(this.label, copy.label);
            }
            return false;
        }

        @Override // co.bird.android.model.persistence.FeatureAnnouncementDialogResponse
        public Announcement getAnnouncement() {
            return this.announcement;
        }

        public final String getLabel() {
            return this.label;
        }

        public int hashCode() {
            return (this.announcement.hashCode() * 31) + this.label.hashCode();
        }

        public String toString() {
            Announcement announcement = this.announcement;
            String str = this.label;
            return "Copy(announcement=" + announcement + ", label=" + str + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Dismiss;", "Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;", "announcement", "Lco/bird/android/model/persistence/Announcement;", "(Lco/bird/android/model/persistence/Announcement;)V", "getAnnouncement", "()Lco/bird/android/model/persistence/Announcement;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Dismiss extends FeatureAnnouncementDialogResponse {
        private final Announcement announcement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dismiss(Announcement announcement) {
            super(announcement, null);
            Intrinsics.checkNotNullParameter(announcement, "announcement");
            this.announcement = announcement;
        }

        public static /* synthetic */ Dismiss copy$default(Dismiss dismiss, Announcement announcement, int i, Object obj) {
            if ((i & 1) != 0) {
                announcement = dismiss.announcement;
            }
            return dismiss.copy(announcement);
        }

        public final Announcement component1() {
            return this.announcement;
        }

        public final Dismiss copy(Announcement announcement) {
            Intrinsics.checkNotNullParameter(announcement, "announcement");
            return new Dismiss(announcement);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Dismiss) && Intrinsics.areEqual(this.announcement, ((Dismiss) obj).announcement);
        }

        @Override // co.bird.android.model.persistence.FeatureAnnouncementDialogResponse
        public Announcement getAnnouncement() {
            return this.announcement;
        }

        public int hashCode() {
            return this.announcement.hashCode();
        }

        public String toString() {
            Announcement announcement = this.announcement;
            return "Dismiss(announcement=" + announcement + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$LearnMore;", "Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;", "announcement", "Lco/bird/android/model/persistence/Announcement;", "(Lco/bird/android/model/persistence/Announcement;)V", "getAnnouncement", "()Lco/bird/android/model/persistence/Announcement;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class LearnMore extends FeatureAnnouncementDialogResponse {
        private final Announcement announcement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LearnMore(Announcement announcement) {
            super(announcement, null);
            Intrinsics.checkNotNullParameter(announcement, "announcement");
            this.announcement = announcement;
        }

        public static /* synthetic */ LearnMore copy$default(LearnMore learnMore, Announcement announcement, int i, Object obj) {
            if ((i & 1) != 0) {
                announcement = learnMore.announcement;
            }
            return learnMore.copy(announcement);
        }

        public final Announcement component1() {
            return this.announcement;
        }

        public final LearnMore copy(Announcement announcement) {
            Intrinsics.checkNotNullParameter(announcement, "announcement");
            return new LearnMore(announcement);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LearnMore) && Intrinsics.areEqual(this.announcement, ((LearnMore) obj).announcement);
        }

        @Override // co.bird.android.model.persistence.FeatureAnnouncementDialogResponse
        public Announcement getAnnouncement() {
            return this.announcement;
        }

        public int hashCode() {
            return this.announcement.hashCode();
        }

        public String toString() {
            Announcement announcement = this.announcement;
            return "LearnMore(announcement=" + announcement + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Primary;", "Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;", "announcement", "Lco/bird/android/model/persistence/Announcement;", "(Lco/bird/android/model/persistence/Announcement;)V", "getAnnouncement", "()Lco/bird/android/model/persistence/Announcement;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Primary extends FeatureAnnouncementDialogResponse {
        private final Announcement announcement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Primary(Announcement announcement) {
            super(announcement, null);
            Intrinsics.checkNotNullParameter(announcement, "announcement");
            this.announcement = announcement;
        }

        public static /* synthetic */ Primary copy$default(Primary primary, Announcement announcement, int i, Object obj) {
            if ((i & 1) != 0) {
                announcement = primary.announcement;
            }
            return primary.copy(announcement);
        }

        public final Announcement component1() {
            return this.announcement;
        }

        public final Primary copy(Announcement announcement) {
            Intrinsics.checkNotNullParameter(announcement, "announcement");
            return new Primary(announcement);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Primary) && Intrinsics.areEqual(this.announcement, ((Primary) obj).announcement);
        }

        @Override // co.bird.android.model.persistence.FeatureAnnouncementDialogResponse
        public Announcement getAnnouncement() {
            return this.announcement;
        }

        public int hashCode() {
            return this.announcement.hashCode();
        }

        public String toString() {
            Announcement announcement = this.announcement;
            return "Primary(announcement=" + announcement + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Share;", "Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;", "announcement", "Lco/bird/android/model/persistence/Announcement;", "(Lco/bird/android/model/persistence/Announcement;)V", "getAnnouncement", "()Lco/bird/android/model/persistence/Announcement;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Share extends FeatureAnnouncementDialogResponse {
        private final Announcement announcement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Share(Announcement announcement) {
            super(announcement, null);
            Intrinsics.checkNotNullParameter(announcement, "announcement");
            this.announcement = announcement;
        }

        public static /* synthetic */ Share copy$default(Share share, Announcement announcement, int i, Object obj) {
            if ((i & 1) != 0) {
                announcement = share.announcement;
            }
            return share.copy(announcement);
        }

        public final Announcement component1() {
            return this.announcement;
        }

        public final Share copy(Announcement announcement) {
            Intrinsics.checkNotNullParameter(announcement, "announcement");
            return new Share(announcement);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Share) && Intrinsics.areEqual(this.announcement, ((Share) obj).announcement);
        }

        @Override // co.bird.android.model.persistence.FeatureAnnouncementDialogResponse
        public Announcement getAnnouncement() {
            return this.announcement;
        }

        public int hashCode() {
            return this.announcement.hashCode();
        }

        public String toString() {
            Announcement announcement = this.announcement;
            return "Share(announcement=" + announcement + ")";
        }
    }

    public /* synthetic */ FeatureAnnouncementDialogResponse(Announcement announcement, DefaultConstructorMarker defaultConstructorMarker) {
        this(announcement);
    }

    public Announcement getAnnouncement() {
        return this.announcement;
    }

    private FeatureAnnouncementDialogResponse(Announcement announcement) {
        this.announcement = announcement;
    }
}
