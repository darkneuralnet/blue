package android.support.p001v4.media.session;

import android.annotation.SuppressLint;
import android.media.MediaDescription;
import android.media.session.MediaSession;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.p001v4.media.MediaDescriptionCompat;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: android.support.v4.media.session.MediaSessionCompat */
/* loaded from: classes.dex */
public class MediaSessionCompat {

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    /* loaded from: classes.dex */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new C10907a();

        /* renamed from: b */
        public ResultReceiver f51370b;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        /* loaded from: classes.dex */
        public class C10907a implements Parcelable.Creator<ResultReceiverWrapper> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.f51370b = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f51370b.writeToParcel(parcel, i);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    /* loaded from: classes.dex */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new C10908a();

        /* renamed from: b */
        public final Object f51371b;

        /* renamed from: c */
        public final Object f51372c;

        /* renamed from: d */
        public InterfaceC10917b f51373d;

        /* renamed from: e */
        public InterfaceC33149Go6 f51374e;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        /* loaded from: classes.dex */
        public class C10908a implements Parcelable.Creator<Token> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public Token[] newArray(int i) {
                return new Token[i];
            }
        }

        public Token(Object obj) {
            this(obj, null, null);
        }

        /* renamed from: a */
        public static Token m70621a(Object obj) {
            return m70620b(obj, null);
        }

        /* renamed from: b */
        public static Token m70620b(Object obj, InterfaceC10917b interfaceC10917b) {
            if (obj != null) {
                if (obj instanceof MediaSession.Token) {
                    return new Token(obj, interfaceC10917b);
                }
                throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
            }
            return null;
        }

        /* renamed from: c */
        public InterfaceC10917b m70619c() {
            InterfaceC10917b interfaceC10917b;
            synchronized (this.f51371b) {
                interfaceC10917b = this.f51373d;
            }
            return interfaceC10917b;
        }

        /* renamed from: d */
        public Object m70618d() {
            return this.f51372c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public void m70617e(InterfaceC10917b interfaceC10917b) {
            synchronized (this.f51371b) {
                this.f51373d = interfaceC10917b;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f51372c;
            if (obj2 == null) {
                if (token.f51372c == null) {
                    return true;
                }
                return false;
            }
            Object obj3 = token.f51372c;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        /* renamed from: g */
        public void m70616g(InterfaceC33149Go6 interfaceC33149Go6) {
            synchronized (this.f51371b) {
                this.f51374e = interfaceC33149Go6;
            }
        }

        public int hashCode() {
            Object obj = this.f51372c;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.f51372c, i);
        }

        public Token(Object obj, InterfaceC10917b interfaceC10917b) {
            this(obj, interfaceC10917b, null);
        }

        public Token(Object obj, InterfaceC10917b interfaceC10917b, InterfaceC33149Go6 interfaceC33149Go6) {
            this.f51371b = new Object();
            this.f51372c = obj;
            this.f51373d = interfaceC10917b;
            this.f51374e = interfaceC33149Go6;
        }
    }

    /* renamed from: a */
    public static void m70632a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    /* renamed from: b */
    public static Bundle m70631b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        m70632a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    /* loaded from: classes.dex */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new C10905a();

        /* renamed from: b */
        public final MediaDescriptionCompat f51367b;

        /* renamed from: c */
        public final long f51368c;

        /* renamed from: d */
        public MediaSession.QueueItem f51369d;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        /* loaded from: classes.dex */
        public class C10905a implements Parcelable.Creator<QueueItem> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$b */
        /* loaded from: classes.dex */
        public static class C10906b {
            private C10906b() {
            }

            /* renamed from: a */
            public static MediaSession.QueueItem m70626a(MediaDescription mediaDescription, long j) {
                return new MediaSession.QueueItem(mediaDescription, j);
            }

            /* renamed from: b */
            public static MediaDescription m70625b(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            /* renamed from: c */
            public static long m70624c(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

        public QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if (j != -1) {
                this.f51367b = mediaDescriptionCompat;
                this.f51368c = j;
                this.f51369d = queueItem;
                return;
            }
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }

        /* renamed from: a */
        public static QueueItem m70630a(Object obj) {
            if (obj != null) {
                MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
                return new QueueItem(queueItem, MediaDescriptionCompat.m70683a(C10906b.m70625b(queueItem)), C10906b.m70624c(queueItem));
            }
            return null;
        }

        /* renamed from: b */
        public static List<QueueItem> m70629b(List<?> list) {
            if (list != null) {
                ArrayList arrayList = new ArrayList(list.size());
                Iterator<?> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(m70630a(it.next()));
                }
                return arrayList;
            }
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f51367b + ", Id=" + this.f51368c + " }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f51367b.writeToParcel(parcel, i);
            parcel.writeLong(this.f51368c);
        }

        public QueueItem(Parcel parcel) {
            this.f51367b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f51368c = parcel.readLong();
        }
    }
}
