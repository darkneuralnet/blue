package p000;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
/* renamed from: Pb3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C35135Pb3 {

    /* renamed from: a */
    public final String f28721a;

    /* renamed from: b */
    public CharSequence f28722b;

    /* renamed from: c */
    public int f28723c;

    /* renamed from: d */
    public String f28724d;

    /* renamed from: e */
    public String f28725e;

    /* renamed from: f */
    public boolean f28726f;

    /* renamed from: g */
    public Uri f28727g;

    /* renamed from: h */
    public AudioAttributes f28728h;

    /* renamed from: i */
    public boolean f28729i;

    /* renamed from: j */
    public int f28730j;

    /* renamed from: k */
    public boolean f28731k;

    /* renamed from: l */
    public long[] f28732l;

    /* renamed from: m */
    public String f28733m;

    /* renamed from: n */
    public String f28734n;

    /* renamed from: o */
    public boolean f28735o;

    /* renamed from: p */
    public int f28736p;

    /* renamed from: q */
    public boolean f28737q;

    /* renamed from: r */
    public boolean f28738r;

    public C35135Pb3(String str, int i) {
        this.f28726f = true;
        this.f28727g = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.f28730j = 0;
        this.f28721a = (String) HZ3.m103731g(str);
        this.f28723c = i;
        this.f28728h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    /* renamed from: a */
    public NotificationChannel m90077a() {
        String str;
        String str2;
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return null;
        }
        C42795ia3.m33793a();
        NotificationChannel m36179a = C42202ha3.m36179a(this.f28721a, this.f28722b, this.f28723c);
        m36179a.setDescription(this.f28724d);
        m36179a.setGroup(this.f28725e);
        m36179a.setShowBadge(this.f28726f);
        m36179a.setSound(this.f28727g, this.f28728h);
        m36179a.enableLights(this.f28729i);
        m36179a.setLightColor(this.f28730j);
        m36179a.setVibrationPattern(this.f28732l);
        m36179a.enableVibration(this.f28731k);
        if (i >= 30 && (str = this.f28733m) != null && (str2 = this.f28734n) != null) {
            m36179a.setConversationId(str, str2);
        }
        return m36179a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C35135Pb3(NotificationChannel notificationChannel) {
        this(r0, r1);
        String id;
        int importance;
        CharSequence name;
        String description;
        String group;
        boolean canShowBadge;
        Uri sound;
        AudioAttributes audioAttributes;
        boolean shouldShowLights;
        int lightColor;
        boolean shouldVibrate;
        long[] vibrationPattern;
        boolean canBypassDnd;
        int lockscreenVisibility;
        boolean isImportantConversation;
        boolean canBubble;
        String parentChannelId;
        String conversationId;
        id = notificationChannel.getId();
        importance = notificationChannel.getImportance();
        name = notificationChannel.getName();
        this.f28722b = name;
        description = notificationChannel.getDescription();
        this.f28724d = description;
        group = notificationChannel.getGroup();
        this.f28725e = group;
        canShowBadge = notificationChannel.canShowBadge();
        this.f28726f = canShowBadge;
        sound = notificationChannel.getSound();
        this.f28727g = sound;
        audioAttributes = notificationChannel.getAudioAttributes();
        this.f28728h = audioAttributes;
        shouldShowLights = notificationChannel.shouldShowLights();
        this.f28729i = shouldShowLights;
        lightColor = notificationChannel.getLightColor();
        this.f28730j = lightColor;
        shouldVibrate = notificationChannel.shouldVibrate();
        this.f28731k = shouldVibrate;
        vibrationPattern = notificationChannel.getVibrationPattern();
        this.f28732l = vibrationPattern;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            parentChannelId = notificationChannel.getParentChannelId();
            this.f28733m = parentChannelId;
            conversationId = notificationChannel.getConversationId();
            this.f28734n = conversationId;
        }
        canBypassDnd = notificationChannel.canBypassDnd();
        this.f28735o = canBypassDnd;
        lockscreenVisibility = notificationChannel.getLockscreenVisibility();
        this.f28736p = lockscreenVisibility;
        if (i >= 29) {
            canBubble = notificationChannel.canBubble();
            this.f28737q = canBubble;
        }
        if (i >= 30) {
            isImportantConversation = notificationChannel.isImportantConversation();
            this.f28738r = isImportantConversation;
        }
    }
}
