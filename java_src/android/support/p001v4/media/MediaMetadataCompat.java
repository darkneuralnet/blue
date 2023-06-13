package android.support.p001v4.media;

import android.annotation.SuppressLint;
import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.media.session.MediaSessionCompat;
@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.MediaMetadataCompat */
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* renamed from: d */
    public static final C28385so<String, Integer> f51341d;

    /* renamed from: e */
    public static final String[] f51342e;

    /* renamed from: f */
    public static final String[] f51343f;

    /* renamed from: g */
    public static final String[] f51344g;

    /* renamed from: b */
    public final Bundle f51345b;

    /* renamed from: c */
    public MediaMetadata f51346c;

    /* renamed from: android.support.v4.media.MediaMetadataCompat$a */
    /* loaded from: classes.dex */
    public class C10897a implements Parcelable.Creator<MediaMetadataCompat> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    static {
        C28385so<String, Integer> c28385so = new C28385so<>();
        f51341d = c28385so;
        c28385so.put("android.media.metadata.TITLE", 1);
        c28385so.put("android.media.metadata.ARTIST", 1);
        c28385so.put("android.media.metadata.DURATION", 0);
        c28385so.put("android.media.metadata.ALBUM", 1);
        c28385so.put("android.media.metadata.AUTHOR", 1);
        c28385so.put("android.media.metadata.WRITER", 1);
        c28385so.put("android.media.metadata.COMPOSER", 1);
        c28385so.put("android.media.metadata.COMPILATION", 1);
        c28385so.put("android.media.metadata.DATE", 1);
        c28385so.put("android.media.metadata.YEAR", 0);
        c28385so.put("android.media.metadata.GENRE", 1);
        c28385so.put("android.media.metadata.TRACK_NUMBER", 0);
        c28385so.put("android.media.metadata.NUM_TRACKS", 0);
        c28385so.put("android.media.metadata.DISC_NUMBER", 0);
        c28385so.put("android.media.metadata.ALBUM_ARTIST", 1);
        c28385so.put("android.media.metadata.ART", 2);
        c28385so.put("android.media.metadata.ART_URI", 1);
        c28385so.put("android.media.metadata.ALBUM_ART", 2);
        c28385so.put("android.media.metadata.ALBUM_ART_URI", 1);
        c28385so.put("android.media.metadata.USER_RATING", 3);
        c28385so.put("android.media.metadata.RATING", 3);
        c28385so.put("android.media.metadata.DISPLAY_TITLE", 1);
        c28385so.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c28385so.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c28385so.put("android.media.metadata.DISPLAY_ICON", 2);
        c28385so.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c28385so.put("android.media.metadata.MEDIA_ID", 1);
        c28385so.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c28385so.put("android.media.metadata.MEDIA_URI", 1);
        c28385so.put("android.media.metadata.ADVERTISEMENT", 0);
        c28385so.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        f51342e = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        f51343f = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f51344g = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new C10897a();
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f51345b = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    /* renamed from: a */
    public static MediaMetadataCompat m70651a(Object obj) {
        if (obj != null) {
            Parcel obtain = Parcel.obtain();
            MediaMetadata mediaMetadata = (MediaMetadata) obj;
            mediaMetadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.f51346c = mediaMetadata;
            return createFromParcel;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f51345b);
    }
}
