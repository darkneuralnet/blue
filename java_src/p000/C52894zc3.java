package p000;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.C38054ac3;
/* renamed from: zc3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C52894zc3 implements InterfaceC43981ka3 {

    /* renamed from: a */
    public final Context f121624a;

    /* renamed from: b */
    public final Notification.Builder f121625b;

    /* renamed from: c */
    public final C38054ac3.C10770e f121626c;

    /* renamed from: d */
    public RemoteViews f121627d;

    /* renamed from: e */
    public RemoteViews f121628e;

    /* renamed from: f */
    public final List<Bundle> f121629f = new ArrayList();

    /* renamed from: g */
    public final Bundle f121630g = new Bundle();

    /* renamed from: h */
    public int f121631h;

    /* renamed from: i */
    public RemoteViews f121632i;

    public C52894zc3(C38054ac3.C10770e c10770e) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        List<String> list;
        int i;
        Notification.Builder badgeIconType;
        Notification.Builder settingsText;
        Notification.Builder shortcutId;
        Notification.Builder timeoutAfter;
        this.f121626c = c10770e;
        this.f121624a = c10770e.f50773a;
        if (Build.VERSION.SDK_INT >= 26) {
            C45187mc3.m25312a();
            this.f121625b = C44594lc3.m27090a(c10770e.f50773a, c10770e.f50762K);
        } else {
            this.f121625b = new Notification.Builder(c10770e.f50773a);
        }
        Notification notification = c10770e.f50769R;
        Notification.Builder lights = this.f121625b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, c10770e.f50781i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        if ((notification.flags & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z);
        if ((notification.flags & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z2);
        if ((notification.flags & 16) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z3).setDefaults(notification.defaults).setContentTitle(c10770e.f50777e).setContentText(c10770e.f50778f).setContentInfo(c10770e.f50783k).setContentIntent(c10770e.f50779g).setDeleteIntent(notification.deleteIntent);
        PendingIntent pendingIntent = c10770e.f50780h;
        if ((notification.flags & 128) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        deleteIntent.setFullScreenIntent(pendingIntent, z4).setLargeIcon(c10770e.f50782j).setNumber(c10770e.f50784l).setProgress(c10770e.f50792t, c10770e.f50793u, c10770e.f50794v);
        this.f121625b.setSubText(c10770e.f50789q).setUsesChronometer(c10770e.f50787o).setPriority(c10770e.f50785m);
        Iterator<C38054ac3.C10762a> it = c10770e.f50774b.iterator();
        while (it.hasNext()) {
            m1018b(it.next());
        }
        Bundle bundle = c10770e.f50755D;
        if (bundle != null) {
            this.f121630g.putAll(bundle);
        }
        int i2 = Build.VERSION.SDK_INT;
        this.f121627d = c10770e.f50759H;
        this.f121628e = c10770e.f50760I;
        this.f121625b.setShowWhen(c10770e.f50786n);
        this.f121625b.setLocalOnly(c10770e.f50798z).setGroup(c10770e.f50795w).setGroupSummary(c10770e.f50796x).setSortKey(c10770e.f50797y);
        this.f121631h = c10770e.f50766O;
        this.f121625b.setCategory(c10770e.f50754C).setColor(c10770e.f50756E).setVisibility(c10770e.f50757F).setPublicVersion(c10770e.f50758G).setSound(notification.sound, notification.audioAttributes);
        if (i2 < 28) {
            list = m1015e(m1013g(c10770e.f50775c), c10770e.f50772U);
        } else {
            list = c10770e.f50772U;
        }
        if (list != null && !list.isEmpty()) {
            for (String str : list) {
                this.f121625b.addPerson(str);
            }
        }
        this.f121632i = c10770e.f50761J;
        if (c10770e.f50776d.size() > 0) {
            Bundle bundle2 = c10770e.m71056d().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i3 = 0; i3 < c10770e.f50776d.size(); i3++) {
                bundle4.putBundle(Integer.toString(i3), C31634Ac3.m115440a(c10770e.f50776d.get(i3)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            c10770e.m71056d().putBundle("android.car.EXTENSIONS", bundle2);
            this.f121630g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i4 = Build.VERSION.SDK_INT;
        Icon icon = c10770e.f50771T;
        if (icon != null) {
            this.f121625b.setSmallIcon(icon);
        }
        this.f121625b.setExtras(c10770e.f50755D).setRemoteInputHistory(c10770e.f50791s);
        RemoteViews remoteViews = c10770e.f50759H;
        if (remoteViews != null) {
            this.f121625b.setCustomContentView(remoteViews);
        }
        RemoteViews remoteViews2 = c10770e.f50760I;
        if (remoteViews2 != null) {
            this.f121625b.setCustomBigContentView(remoteViews2);
        }
        RemoteViews remoteViews3 = c10770e.f50761J;
        if (remoteViews3 != null) {
            this.f121625b.setCustomHeadsUpContentView(remoteViews3);
        }
        if (i4 >= 26) {
            badgeIconType = this.f121625b.setBadgeIconType(c10770e.f50763L);
            settingsText = badgeIconType.setSettingsText(c10770e.f50790r);
            shortcutId = settingsText.setShortcutId(c10770e.f50764M);
            timeoutAfter = shortcutId.setTimeoutAfter(c10770e.f50765N);
            timeoutAfter.setGroupAlertBehavior(c10770e.f50766O);
            if (c10770e.f50753B) {
                this.f121625b.setColorized(c10770e.f50752A);
            }
            if (!TextUtils.isEmpty(c10770e.f50762K)) {
                this.f121625b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i4 >= 28) {
            Iterator<C42130hS3> it2 = c10770e.f50775c.iterator();
            while (it2.hasNext()) {
                this.f121625b.addPerson(it2.next().m36377h());
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            this.f121625b.setAllowSystemGeneratedContextualActions(c10770e.f50768Q);
            this.f121625b.setBubbleMetadata(C38054ac3.C10769d.m71069a(null));
        }
        if (i5 >= 31 && (i = c10770e.f50767P) != 0) {
            this.f121625b.setForegroundServiceBehavior(i);
        }
        if (c10770e.f50770S) {
            if (this.f121626c.f50796x) {
                this.f121631h = 2;
            } else {
                this.f121631h = 1;
            }
            this.f121625b.setVibrate(null);
            this.f121625b.setSound(null);
            int i6 = notification.defaults & (-2) & (-3);
            notification.defaults = i6;
            this.f121625b.setDefaults(i6);
            if (i5 >= 26) {
                if (TextUtils.isEmpty(this.f121626c.f50795w)) {
                    this.f121625b.setGroup("silent");
                }
                this.f121625b.setGroupAlertBehavior(this.f121631h);
            }
        }
    }

    /* renamed from: e */
    public static List<String> m1015e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C30704yo c30704yo = new C30704yo(list.size() + list2.size());
        c30704yo.addAll(list);
        c30704yo.addAll(list2);
        return new ArrayList(c30704yo);
    }

    /* renamed from: g */
    public static List<String> m1013g(List<C42130hS3> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (C42130hS3 c42130hS3 : list) {
            arrayList.add(c42130hS3.m36378g());
        }
        return arrayList;
    }

    @Override // p000.InterfaceC43981ka3
    /* renamed from: a */
    public Notification.Builder mo1019a() {
        return this.f121625b;
    }

    /* renamed from: b */
    public final void m1018b(C38054ac3.C10762a c10762a) {
        Icon icon;
        Bundle bundle;
        IconCompat m71092d = c10762a.m71092d();
        if (m71092d != null) {
            icon = m71092d.m67689r();
        } else {
            icon = null;
        }
        Notification.Action.Builder builder = new Notification.Action.Builder(icon, c10762a.m71088h(), c10762a.m71095a());
        if (c10762a.m71091e() != null) {
            for (RemoteInput remoteInput : C37422Yv4.m73991b(c10762a.m71091e())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        if (c10762a.m71093c() != null) {
            bundle = new Bundle(c10762a.m71093c());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", c10762a.m71094b());
        int i = Build.VERSION.SDK_INT;
        builder.setAllowGeneratedReplies(c10762a.m71094b());
        bundle.putInt("android.support.action.semanticAction", c10762a.m71090f());
        if (i >= 28) {
            builder.setSemanticAction(c10762a.m71090f());
        }
        if (i >= 29) {
            builder.setContextual(c10762a.m71086j());
        }
        if (i >= 31) {
            builder.setAuthenticationRequired(c10762a.m71087i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", c10762a.m71089g());
        builder.addExtras(bundle);
        this.f121625b.addAction(builder.build());
    }

    /* renamed from: c */
    public Notification m1017c() {
        RemoteViews remoteViews;
        Bundle m71096a;
        RemoteViews mo71015f;
        RemoteViews mo71017d;
        C38054ac3.AbstractC10775i abstractC10775i = this.f121626c.f50788p;
        if (abstractC10775i != null) {
            abstractC10775i.mo71019b(this);
        }
        if (abstractC10775i != null) {
            remoteViews = abstractC10775i.mo71016e(this);
        } else {
            remoteViews = null;
        }
        Notification m1016d = m1016d();
        if (remoteViews != null) {
            m1016d.contentView = remoteViews;
        } else {
            RemoteViews remoteViews2 = this.f121626c.f50759H;
            if (remoteViews2 != null) {
                m1016d.contentView = remoteViews2;
            }
        }
        if (abstractC10775i != null && (mo71017d = abstractC10775i.mo71017d(this)) != null) {
            m1016d.bigContentView = mo71017d;
        }
        if (abstractC10775i != null && (mo71015f = this.f121626c.f50788p.mo71015f(this)) != null) {
            m1016d.headsUpContentView = mo71015f;
        }
        if (abstractC10775i != null && (m71096a = C38054ac3.m71096a(m1016d)) != null) {
            abstractC10775i.mo71020a(m71096a);
        }
        return m1016d;
    }

    /* renamed from: d */
    public Notification m1016d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f121625b.build();
        }
        Notification build = this.f121625b.build();
        if (this.f121631h != 0) {
            if (build.getGroup() != null && (build.flags & 512) != 0 && this.f121631h == 2) {
                m1012h(build);
            }
            if (build.getGroup() != null && (build.flags & 512) == 0 && this.f121631h == 1) {
                m1012h(build);
            }
        }
        return build;
    }

    /* renamed from: f */
    public Context m1014f() {
        return this.f121624a;
    }

    /* renamed from: h */
    public final void m1012h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & (-2) & (-3);
    }
}
