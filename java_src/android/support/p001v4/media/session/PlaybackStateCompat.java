package android.support.p001v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C10911a();

    /* renamed from: b */
    public final int f51380b;

    /* renamed from: c */
    public final long f51381c;

    /* renamed from: d */
    public final long f51382d;

    /* renamed from: e */
    public final float f51383e;

    /* renamed from: f */
    public final long f51384f;

    /* renamed from: g */
    public final int f51385g;

    /* renamed from: h */
    public final CharSequence f51386h;

    /* renamed from: i */
    public final long f51387i;

    /* renamed from: j */
    public List<CustomAction> f51388j;

    /* renamed from: k */
    public final long f51389k;

    /* renamed from: l */
    public final Bundle f51390l;

    /* renamed from: m */
    public PlaybackState f51391m;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    /* loaded from: classes.dex */
    public class C10911a implements Parcelable.Creator<PlaybackStateCompat> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$b */
    /* loaded from: classes.dex */
    public static class C10912b {
        private C10912b() {
        }

        /* renamed from: a */
        public static void m70605a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        /* renamed from: b */
        public static PlaybackState.CustomAction m70604b(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        /* renamed from: c */
        public static PlaybackState m70603c(PlaybackState.Builder builder) {
            return builder.build();
        }

        /* renamed from: d */
        public static PlaybackState.Builder m70602d() {
            return new PlaybackState.Builder();
        }

        /* renamed from: e */
        public static PlaybackState.CustomAction.Builder m70601e(String str, CharSequence charSequence, int i) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i);
        }

        /* renamed from: f */
        public static String m70600f(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        /* renamed from: g */
        public static long m70599g(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        /* renamed from: h */
        public static long m70598h(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        /* renamed from: i */
        public static long m70597i(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        /* renamed from: j */
        public static List<PlaybackState.CustomAction> m70596j(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        /* renamed from: k */
        public static CharSequence m70595k(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        /* renamed from: l */
        public static Bundle m70594l(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        /* renamed from: m */
        public static int m70593m(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }

        /* renamed from: n */
        public static long m70592n(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        /* renamed from: o */
        public static CharSequence m70591o(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        /* renamed from: p */
        public static float m70590p(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        /* renamed from: q */
        public static long m70589q(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        /* renamed from: r */
        public static int m70588r(PlaybackState playbackState) {
            return playbackState.getState();
        }

        /* renamed from: s */
        public static void m70587s(PlaybackState.Builder builder, long j) {
            builder.setActions(j);
        }

        /* renamed from: t */
        public static void m70586t(PlaybackState.Builder builder, long j) {
            builder.setActiveQueueItemId(j);
        }

        /* renamed from: u */
        public static void m70585u(PlaybackState.Builder builder, long j) {
            builder.setBufferedPosition(j);
        }

        /* renamed from: v */
        public static void m70584v(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        /* renamed from: w */
        public static void m70583w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        /* renamed from: x */
        public static void m70582x(PlaybackState.Builder builder, int i, long j, float f, long j2) {
            builder.setState(i, j, f, j2);
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$c */
    /* loaded from: classes.dex */
    public static class C10913c {
        private C10913c() {
        }

        /* renamed from: a */
        public static Bundle m70581a(PlaybackState playbackState) {
            return playbackState.getExtras();
        }

        /* renamed from: b */
        public static void m70580b(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }
    }

    public PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f51380b = i;
        this.f51381c = j;
        this.f51382d = j2;
        this.f51383e = f;
        this.f51384f = j3;
        this.f51385g = i2;
        this.f51386h = charSequence;
        this.f51387i = j4;
        this.f51388j = new ArrayList(list);
        this.f51389k = j5;
        this.f51390l = bundle;
    }

    /* renamed from: a */
    public static PlaybackStateCompat m70611a(Object obj) {
        ArrayList arrayList = null;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> m70596j = C10912b.m70596j(playbackState);
        if (m70596j != null) {
            arrayList = new ArrayList(m70596j.size());
            for (PlaybackState.CustomAction customAction : m70596j) {
                arrayList.add(CustomAction.m70610a(customAction));
            }
        }
        Bundle m70581a = C10913c.m70581a(playbackState);
        MediaSessionCompat.m70632a(m70581a);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C10912b.m70588r(playbackState), C10912b.m70589q(playbackState), C10912b.m70597i(playbackState), C10912b.m70590p(playbackState), C10912b.m70599g(playbackState), 0, C10912b.m70595k(playbackState), C10912b.m70592n(playbackState), arrayList, C10912b.m70598h(playbackState), m70581a);
        playbackStateCompat.f51391m = playbackState;
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f51380b + ", position=" + this.f51381c + ", buffered position=" + this.f51382d + ", speed=" + this.f51383e + ", updated=" + this.f51387i + ", actions=" + this.f51384f + ", error code=" + this.f51385g + ", error message=" + this.f51386h + ", custom actions=" + this.f51388j + ", active item id=" + this.f51389k + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f51380b);
        parcel.writeLong(this.f51381c);
        parcel.writeFloat(this.f51383e);
        parcel.writeLong(this.f51387i);
        parcel.writeLong(this.f51382d);
        parcel.writeLong(this.f51384f);
        TextUtils.writeToParcel(this.f51386h, parcel, i);
        parcel.writeTypedList(this.f51388j);
        parcel.writeLong(this.f51389k);
        parcel.writeBundle(this.f51390l);
        parcel.writeInt(this.f51385g);
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C10910a();

        /* renamed from: b */
        public final String f51392b;

        /* renamed from: c */
        public final CharSequence f51393c;

        /* renamed from: d */
        public final int f51394d;

        /* renamed from: e */
        public final Bundle f51395e;

        /* renamed from: f */
        public PlaybackState.CustomAction f51396f;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        /* loaded from: classes.dex */
        public class C10910a implements Parcelable.Creator<CustomAction> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f51392b = str;
            this.f51393c = charSequence;
            this.f51394d = i;
            this.f51395e = bundle;
        }

        /* renamed from: a */
        public static CustomAction m70610a(Object obj) {
            if (obj != null) {
                PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
                Bundle m70594l = C10912b.m70594l(customAction);
                MediaSessionCompat.m70632a(m70594l);
                CustomAction customAction2 = new CustomAction(C10912b.m70600f(customAction), C10912b.m70591o(customAction), C10912b.m70593m(customAction), m70594l);
                customAction2.f51396f = customAction;
                return customAction2;
            }
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f51393c) + ", mIcon=" + this.f51394d + ", mExtras=" + this.f51395e;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f51392b);
            TextUtils.writeToParcel(this.f51393c, parcel, i);
            parcel.writeInt(this.f51394d);
            parcel.writeBundle(this.f51395e);
        }

        public CustomAction(Parcel parcel) {
            this.f51392b = parcel.readString();
            this.f51393c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f51394d = parcel.readInt();
            this.f51395e = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f51380b = parcel.readInt();
        this.f51381c = parcel.readLong();
        this.f51383e = parcel.readFloat();
        this.f51387i = parcel.readLong();
        this.f51382d = parcel.readLong();
        this.f51384f = parcel.readLong();
        this.f51386h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f51388j = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f51389k = parcel.readLong();
        this.f51390l = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f51385g = parcel.readInt();
    }
}
