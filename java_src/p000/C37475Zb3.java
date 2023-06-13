package p000;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: Zb3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C37475Zb3 {

    /* renamed from: a */
    public final String f48805a;

    /* renamed from: b */
    public CharSequence f48806b;

    /* renamed from: c */
    public String f48807c;

    /* renamed from: d */
    public boolean f48808d;

    /* renamed from: e */
    public List<C35135Pb3> f48809e;

    public C37475Zb3(String str) {
        this.f48809e = Collections.emptyList();
        this.f48805a = (String) HZ3.m103731g(str);
    }

    /* renamed from: a */
    public final List<C35135Pb3> m72904a(List<NotificationChannel> list) {
        String group;
        ArrayList arrayList = new ArrayList();
        for (NotificationChannel notificationChannel : list) {
            NotificationChannel m74829a = C37241Yb3.m74829a(notificationChannel);
            String str = this.f48805a;
            group = m74829a.getGroup();
            if (str.equals(group)) {
                arrayList.add(new C35135Pb3(m74829a));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public NotificationChannelGroup m72903b() {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return null;
        }
        C37007Xb3.m76813a();
        NotificationChannelGroup m78160a = C36773Wb3.m78160a(this.f48805a, this.f48806b);
        if (i >= 28) {
            m78160a.setDescription(this.f48807c);
        }
        return m78160a;
    }

    public C37475Zb3(NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.emptyList());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C37475Zb3(NotificationChannelGroup notificationChannelGroup, List<NotificationChannel> list) {
        this(r0);
        String id;
        CharSequence name;
        boolean isBlocked;
        List<NotificationChannel> channels;
        String description;
        id = notificationChannelGroup.getId();
        name = notificationChannelGroup.getName();
        this.f48806b = name;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            description = notificationChannelGroup.getDescription();
            this.f48807c = description;
        }
        if (i >= 28) {
            isBlocked = notificationChannelGroup.isBlocked();
            this.f48808d = isBlocked;
            channels = notificationChannelGroup.getChannels();
            this.f48809e = m72904a(channels);
            return;
        }
        this.f48809e = m72904a(list);
    }
}
