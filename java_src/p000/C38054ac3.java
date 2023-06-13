package p000;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.stripe.android.financialconnections.domain.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* renamed from: ac3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C38054ac3 {

    /* renamed from: ac3$a */
    /* loaded from: classes.dex */
    public static class C10762a {

        /* renamed from: a */
        public final Bundle f50724a;

        /* renamed from: b */
        public IconCompat f50725b;

        /* renamed from: c */
        public final C37422Yv4[] f50726c;

        /* renamed from: d */
        public final C37422Yv4[] f50727d;

        /* renamed from: e */
        public boolean f50728e;

        /* renamed from: f */
        public boolean f50729f;

        /* renamed from: g */
        public final int f50730g;

        /* renamed from: h */
        public final boolean f50731h;
        @Deprecated

        /* renamed from: i */
        public int f50732i;

        /* renamed from: j */
        public CharSequence f50733j;

        /* renamed from: k */
        public PendingIntent f50734k;

        /* renamed from: l */
        public boolean f50735l;

        /* renamed from: ac3$a$a */
        /* loaded from: classes.dex */
        public static final class C10763a {

            /* renamed from: a */
            public final IconCompat f50736a;

            /* renamed from: b */
            public final CharSequence f50737b;

            /* renamed from: c */
            public final PendingIntent f50738c;

            /* renamed from: d */
            public boolean f50739d;

            /* renamed from: e */
            public final Bundle f50740e;

            /* renamed from: f */
            public ArrayList<C37422Yv4> f50741f;

            /* renamed from: g */
            public int f50742g;

            /* renamed from: h */
            public boolean f50743h;

            /* renamed from: i */
            public boolean f50744i;

            /* renamed from: j */
            public boolean f50745j;

            public C10763a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i != 0 ? IconCompat.m67699h(null, "", i) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            /* renamed from: a */
            public C10763a m71085a(Bundle bundle) {
                if (bundle != null) {
                    this.f50740e.putAll(bundle);
                }
                return this;
            }

            /* renamed from: b */
            public C10762a m71084b() {
                C37422Yv4[] c37422Yv4Arr;
                m71083c();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<C37422Yv4> arrayList3 = this.f50741f;
                if (arrayList3 != null) {
                    Iterator<C37422Yv4> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        C37422Yv4 next = it.next();
                        if (next.m73983j()) {
                            arrayList.add(next);
                        } else {
                            arrayList2.add(next);
                        }
                    }
                }
                C37422Yv4[] c37422Yv4Arr2 = null;
                if (arrayList.isEmpty()) {
                    c37422Yv4Arr = null;
                } else {
                    c37422Yv4Arr = (C37422Yv4[]) arrayList.toArray(new C37422Yv4[arrayList.size()]);
                }
                if (!arrayList2.isEmpty()) {
                    c37422Yv4Arr2 = (C37422Yv4[]) arrayList2.toArray(new C37422Yv4[arrayList2.size()]);
                }
                return new C10762a(this.f50736a, this.f50737b, this.f50738c, this.f50740e, c37422Yv4Arr2, c37422Yv4Arr, this.f50739d, this.f50742g, this.f50743h, this.f50744i, this.f50745j);
            }

            /* renamed from: c */
            public final void m71083c() {
                if (!this.f50744i || this.f50738c != null) {
                    return;
                }
                throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
            }

            public C10763a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C37422Yv4[] c37422Yv4Arr, boolean z, int i, boolean z2, boolean z3, boolean z4) {
                this.f50739d = true;
                this.f50743h = true;
                this.f50736a = iconCompat;
                this.f50737b = C10770e.m71055e(charSequence);
                this.f50738c = pendingIntent;
                this.f50740e = bundle;
                this.f50741f = c37422Yv4Arr == null ? null : new ArrayList<>(Arrays.asList(c37422Yv4Arr));
                this.f50739d = z;
                this.f50742g = i;
                this.f50743h = z2;
                this.f50744i = z3;
                this.f50745j = z4;
            }
        }

        public C10762a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.m67699h(null, "", i) : null, charSequence, pendingIntent);
        }

        /* renamed from: a */
        public PendingIntent m71095a() {
            return this.f50734k;
        }

        /* renamed from: b */
        public boolean m71094b() {
            return this.f50728e;
        }

        /* renamed from: c */
        public Bundle m71093c() {
            return this.f50724a;
        }

        /* renamed from: d */
        public IconCompat m71092d() {
            int i;
            if (this.f50725b == null && (i = this.f50732i) != 0) {
                this.f50725b = IconCompat.m67699h(null, "", i);
            }
            return this.f50725b;
        }

        /* renamed from: e */
        public C37422Yv4[] m71091e() {
            return this.f50726c;
        }

        /* renamed from: f */
        public int m71090f() {
            return this.f50730g;
        }

        /* renamed from: g */
        public boolean m71089g() {
            return this.f50729f;
        }

        /* renamed from: h */
        public CharSequence m71088h() {
            return this.f50733j;
        }

        /* renamed from: i */
        public boolean m71087i() {
            return this.f50735l;
        }

        /* renamed from: j */
        public boolean m71086j() {
            return this.f50731h;
        }

        public C10762a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        public C10762a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C37422Yv4[] c37422Yv4Arr, C37422Yv4[] c37422Yv4Arr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
            this.f50729f = true;
            this.f50725b = iconCompat;
            if (iconCompat != null && iconCompat.m67695l() == 2) {
                this.f50732i = iconCompat.m67697j();
            }
            this.f50733j = C10770e.m71055e(charSequence);
            this.f50734k = pendingIntent;
            this.f50724a = bundle == null ? new Bundle() : bundle;
            this.f50726c = c37422Yv4Arr;
            this.f50727d = c37422Yv4Arr2;
            this.f50728e = z;
            this.f50730g = i;
            this.f50729f = z2;
            this.f50731h = z3;
            this.f50735l = z4;
        }
    }

    /* renamed from: ac3$b */
    /* loaded from: classes.dex */
    public static class C10764b extends AbstractC10775i {

        /* renamed from: e */
        public IconCompat f50746e;

        /* renamed from: f */
        public IconCompat f50747f;

        /* renamed from: g */
        public boolean f50748g;

        /* renamed from: h */
        public CharSequence f50749h;

        /* renamed from: i */
        public boolean f50750i;

        /* renamed from: ac3$b$a */
        /* loaded from: classes.dex */
        public static class C10765a {
            private C10765a() {
            }

            /* renamed from: a */
            public static void m71078a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            /* renamed from: b */
            public static void m71077b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* renamed from: ac3$b$b */
        /* loaded from: classes.dex */
        public static class C10766b {
            private C10766b() {
            }

            /* renamed from: a */
            public static void m71076a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* renamed from: ac3$b$c */
        /* loaded from: classes.dex */
        public static class C10767c {
            private C10767c() {
            }

            /* renamed from: a */
            public static void m71075a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            /* renamed from: b */
            public static void m71074b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            /* renamed from: c */
            public static void m71073c(Notification.BigPictureStyle bigPictureStyle, boolean z) {
                bigPictureStyle.showBigPictureWhenCollapsed(z);
            }
        }

        @Override // p000.C38054ac3.AbstractC10775i
        /* renamed from: b */
        public void mo71019b(InterfaceC43981ka3 interfaceC43981ka3) {
            Context context;
            int i = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(interfaceC43981ka3.mo1019a()).setBigContentTitle(this.f50812b);
            IconCompat iconCompat = this.f50746e;
            Context context2 = null;
            if (iconCompat != null) {
                if (i >= 31) {
                    if (interfaceC43981ka3 instanceof C52894zc3) {
                        context = ((C52894zc3) interfaceC43981ka3).m1014f();
                    } else {
                        context = null;
                    }
                    C10767c.m71075a(bigContentTitle, this.f50746e.m67688s(context));
                } else if (iconCompat.m67695l() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f50746e.m67698i());
                }
            }
            if (this.f50748g) {
                if (this.f50747f == null) {
                    C10765a.m71078a(bigContentTitle, null);
                } else {
                    if (interfaceC43981ka3 instanceof C52894zc3) {
                        context2 = ((C52894zc3) interfaceC43981ka3).m1014f();
                    }
                    C10766b.m71076a(bigContentTitle, this.f50747f.m67688s(context2));
                }
            }
            if (this.f50814d) {
                C10765a.m71077b(bigContentTitle, this.f50813c);
            }
            if (i >= 31) {
                C10767c.m71073c(bigContentTitle, this.f50750i);
                C10767c.m71074b(bigContentTitle, this.f50749h);
            }
        }

        @Override // p000.C38054ac3.AbstractC10775i
        /* renamed from: c */
        public String mo71018c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        /* renamed from: h */
        public C10764b m71082h(Bitmap bitmap) {
            IconCompat m67702e;
            if (bitmap == null) {
                m67702e = null;
            } else {
                m67702e = IconCompat.m67702e(bitmap);
            }
            this.f50747f = m67702e;
            this.f50748g = true;
            return this;
        }

        /* renamed from: i */
        public C10764b m71081i(Bitmap bitmap) {
            this.f50746e = bitmap == null ? null : IconCompat.m67702e(bitmap);
            return this;
        }

        /* renamed from: j */
        public C10764b m71080j(CharSequence charSequence) {
            this.f50812b = C10770e.m71055e(charSequence);
            return this;
        }

        /* renamed from: k */
        public C10764b m71079k(CharSequence charSequence) {
            this.f50813c = C10770e.m71055e(charSequence);
            this.f50814d = true;
            return this;
        }
    }

    /* renamed from: ac3$c */
    /* loaded from: classes.dex */
    public static class C10768c extends AbstractC10775i {

        /* renamed from: e */
        public CharSequence f50751e;

        @Override // p000.C38054ac3.AbstractC10775i
        /* renamed from: a */
        public void mo71020a(Bundle bundle) {
            super.mo71020a(bundle);
        }

        @Override // p000.C38054ac3.AbstractC10775i
        /* renamed from: b */
        public void mo71019b(InterfaceC43981ka3 interfaceC43981ka3) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(interfaceC43981ka3.mo1019a()).setBigContentTitle(this.f50812b).bigText(this.f50751e);
            if (this.f50814d) {
                bigText.setSummaryText(this.f50813c);
            }
        }

        @Override // p000.C38054ac3.AbstractC10775i
        /* renamed from: c */
        public String mo71018c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        /* renamed from: h */
        public C10768c m71072h(CharSequence charSequence) {
            this.f50751e = C10770e.m71055e(charSequence);
            return this;
        }

        /* renamed from: i */
        public C10768c m71071i(CharSequence charSequence) {
            this.f50812b = C10770e.m71055e(charSequence);
            return this;
        }

        /* renamed from: j */
        public C10768c m71070j(CharSequence charSequence) {
            this.f50813c = C10770e.m71055e(charSequence);
            this.f50814d = true;
            return this;
        }
    }

    /* renamed from: ac3$d */
    /* loaded from: classes.dex */
    public static final class C10769d {
        /* renamed from: a */
        public static Notification.BubbleMetadata m71069a(C10769d c10769d) {
            return null;
        }
    }

    /* renamed from: ac3$f */
    /* loaded from: classes.dex */
    public static class C10771f extends AbstractC10775i {
        @Override // p000.C38054ac3.AbstractC10775i
        /* renamed from: b */
        public void mo71019b(InterfaceC43981ka3 interfaceC43981ka3) {
            interfaceC43981ka3.mo1019a().setStyle(new Notification.DecoratedCustomViewStyle());
        }

        @Override // p000.C38054ac3.AbstractC10775i
        /* renamed from: c */
        public String mo71018c() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        @Override // p000.C38054ac3.AbstractC10775i
        /* renamed from: d */
        public RemoteViews mo71017d(InterfaceC43981ka3 interfaceC43981ka3) {
            return null;
        }

        @Override // p000.C38054ac3.AbstractC10775i
        /* renamed from: e */
        public RemoteViews mo71016e(InterfaceC43981ka3 interfaceC43981ka3) {
            return null;
        }

        @Override // p000.C38054ac3.AbstractC10775i
        /* renamed from: f */
        public RemoteViews mo71015f(InterfaceC43981ka3 interfaceC43981ka3) {
            return null;
        }
    }

    /* renamed from: ac3$g */
    /* loaded from: classes.dex */
    public static class C10772g extends AbstractC10775i {

        /* renamed from: e */
        public ArrayList<CharSequence> f50799e = new ArrayList<>();

        @Override // p000.C38054ac3.AbstractC10775i
        /* renamed from: b */
        public void mo71019b(InterfaceC43981ka3 interfaceC43981ka3) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(interfaceC43981ka3.mo1019a()).setBigContentTitle(this.f50812b);
            if (this.f50814d) {
                bigContentTitle.setSummaryText(this.f50813c);
            }
            Iterator<CharSequence> it = this.f50799e.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine(it.next());
            }
        }

        @Override // p000.C38054ac3.AbstractC10775i
        /* renamed from: c */
        public String mo71018c() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        /* renamed from: h */
        public C10772g m71033h(CharSequence charSequence) {
            if (charSequence != null) {
                this.f50799e.add(C10770e.m71055e(charSequence));
            }
            return this;
        }
    }

    /* renamed from: ac3$i */
    /* loaded from: classes.dex */
    public static abstract class AbstractC10775i {

        /* renamed from: a */
        public C10770e f50811a;

        /* renamed from: b */
        public CharSequence f50812b;

        /* renamed from: c */
        public CharSequence f50813c;

        /* renamed from: d */
        public boolean f50814d = false;

        /* renamed from: a */
        public void mo71020a(Bundle bundle) {
            if (this.f50814d) {
                bundle.putCharSequence("android.summaryText", this.f50813c);
            }
            CharSequence charSequence = this.f50812b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String mo71018c = mo71018c();
            if (mo71018c != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", mo71018c);
            }
        }

        /* renamed from: b */
        public void mo71019b(InterfaceC43981ka3 interfaceC43981ka3) {
        }

        /* renamed from: c */
        public String mo71018c() {
            return null;
        }

        /* renamed from: d */
        public RemoteViews mo71017d(InterfaceC43981ka3 interfaceC43981ka3) {
            return null;
        }

        /* renamed from: e */
        public RemoteViews mo71016e(InterfaceC43981ka3 interfaceC43981ka3) {
            return null;
        }

        /* renamed from: f */
        public RemoteViews mo71015f(InterfaceC43981ka3 interfaceC43981ka3) {
            return null;
        }

        /* renamed from: g */
        public void m71014g(C10770e c10770e) {
            if (this.f50811a != c10770e) {
                this.f50811a = c10770e;
                if (c10770e != null) {
                    c10770e.m71065D(this);
                }
            }
        }
    }

    /* renamed from: a */
    public static Bundle m71096a(Notification notification) {
        return notification.extras;
    }

    /* renamed from: ac3$h */
    /* loaded from: classes.dex */
    public static class C10773h extends AbstractC10775i {

        /* renamed from: e */
        public final List<C10774a> f50800e = new ArrayList();

        /* renamed from: f */
        public final List<C10774a> f50801f = new ArrayList();

        /* renamed from: g */
        public C42130hS3 f50802g;

        /* renamed from: h */
        public CharSequence f50803h;

        /* renamed from: i */
        public Boolean f50804i;

        /* renamed from: ac3$h$a */
        /* loaded from: classes.dex */
        public static final class C10774a {

            /* renamed from: a */
            public final CharSequence f50805a;

            /* renamed from: b */
            public final long f50806b;

            /* renamed from: c */
            public final C42130hS3 f50807c;

            /* renamed from: d */
            public Bundle f50808d = new Bundle();

            /* renamed from: e */
            public String f50809e;

            /* renamed from: f */
            public Uri f50810f;

            public C10774a(CharSequence charSequence, long j, C42130hS3 c42130hS3) {
                this.f50805a = charSequence;
                this.f50806b = j;
                this.f50807c = c42130hS3;
            }

            /* renamed from: a */
            public static Bundle[] m71028a(List<C10774a> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bundleArr[i] = list.get(i).m71021h();
                }
                return bundleArr;
            }

            /* renamed from: b */
            public String m71027b() {
                return this.f50809e;
            }

            /* renamed from: c */
            public Uri m71026c() {
                return this.f50810f;
            }

            /* renamed from: d */
            public C42130hS3 m71025d() {
                return this.f50807c;
            }

            /* renamed from: e */
            public CharSequence m71024e() {
                return this.f50805a;
            }

            /* renamed from: f */
            public long m71023f() {
                return this.f50806b;
            }

            /* renamed from: g */
            public Notification.MessagingStyle.Message m71022g() {
                Notification.MessagingStyle.Message message;
                C42130hS3 m71025d = m71025d();
                CharSequence charSequence = null;
                Person person = null;
                if (Build.VERSION.SDK_INT >= 28) {
                    C43408jc3.m30202a();
                    CharSequence m71024e = m71024e();
                    long m71023f = m71023f();
                    if (m71025d != null) {
                        person = m71025d.m36377h();
                    }
                    message = C42815ic3.m33752a(m71024e, m71023f, person);
                } else {
                    CharSequence m71024e2 = m71024e();
                    long m71023f2 = m71023f();
                    if (m71025d != null) {
                        charSequence = m71025d.m36382c();
                    }
                    message = new Notification.MessagingStyle.Message(m71024e2, m71023f2, charSequence);
                }
                if (m71027b() != null) {
                    message.setData(m71027b(), m71026c());
                }
                return message;
            }

            /* renamed from: h */
            public final Bundle m71021h() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f50805a;
                if (charSequence != null) {
                    bundle.putCharSequence(Entry.TYPE_TEXT, charSequence);
                }
                bundle.putLong("time", this.f50806b);
                C42130hS3 c42130hS3 = this.f50807c;
                if (c42130hS3 != null) {
                    bundle.putCharSequence("sender", c42130hS3.m36382c());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", this.f50807c.m36377h());
                    } else {
                        bundle.putBundle("person", this.f50807c.m36376i());
                    }
                }
                String str = this.f50809e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f50810f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f50808d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }
        }

        public C10773h() {
        }

        @Override // p000.C38054ac3.AbstractC10775i
        /* renamed from: a */
        public void mo71020a(Bundle bundle) {
            super.mo71020a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f50802g.m36382c());
            bundle.putBundle("android.messagingStyleUser", this.f50802g.m36376i());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f50803h);
            if (this.f50803h != null && this.f50804i.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f50803h);
            }
            if (!this.f50800e.isEmpty()) {
                bundle.putParcelableArray("android.messages", C10774a.m71028a(this.f50800e));
            }
            if (!this.f50801f.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", C10774a.m71028a(this.f50801f));
            }
            Boolean bool = this.f50804i;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        @Override // p000.C38054ac3.AbstractC10775i
        /* renamed from: b */
        public void mo71019b(InterfaceC43981ka3 interfaceC43981ka3) {
            Notification.MessagingStyle messagingStyle;
            m71029k(m71030j());
            if (Build.VERSION.SDK_INT >= 28) {
                C42222hc3.m36162a();
                messagingStyle = C41629gc3.m37978a(this.f50802g.m36377h());
            } else {
                messagingStyle = new Notification.MessagingStyle(this.f50802g.m36382c());
            }
            for (C10774a c10774a : this.f50800e) {
                messagingStyle.addMessage(c10774a.m71022g());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                for (C10774a c10774a2 : this.f50801f) {
                    messagingStyle.addHistoricMessage(c10774a2.m71022g());
                }
            }
            if (this.f50804i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                messagingStyle.setConversationTitle(this.f50803h);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                messagingStyle.setGroupConversation(this.f50804i.booleanValue());
            }
            messagingStyle.setBuilder(interfaceC43981ka3.mo1019a());
        }

        @Override // p000.C38054ac3.AbstractC10775i
        /* renamed from: c */
        public String mo71018c() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        /* renamed from: h */
        public C10773h m71032h(C10774a c10774a) {
            if (c10774a != null) {
                this.f50800e.add(c10774a);
                if (this.f50800e.size() > 25) {
                    this.f50800e.remove(0);
                }
            }
            return this;
        }

        /* renamed from: i */
        public C10773h m71031i(CharSequence charSequence, long j, C42130hS3 c42130hS3) {
            m71032h(new C10774a(charSequence, j, c42130hS3));
            return this;
        }

        /* renamed from: j */
        public boolean m71030j() {
            C10770e c10770e = this.f50811a;
            if (c10770e != null && c10770e.f50773a.getApplicationInfo().targetSdkVersion < 28 && this.f50804i == null) {
                if (this.f50803h == null) {
                    return false;
                }
                return true;
            }
            Boolean bool = this.f50804i;
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        }

        /* renamed from: k */
        public C10773h m71029k(boolean z) {
            this.f50804i = Boolean.valueOf(z);
            return this;
        }

        public C10773h(C42130hS3 c42130hS3) {
            if (!TextUtils.isEmpty(c42130hS3.m36382c())) {
                this.f50802g = c42130hS3;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }
    }

    /* renamed from: ac3$e */
    /* loaded from: classes.dex */
    public static class C10770e {

        /* renamed from: A */
        public boolean f50752A;

        /* renamed from: B */
        public boolean f50753B;

        /* renamed from: C */
        public String f50754C;

        /* renamed from: D */
        public Bundle f50755D;

        /* renamed from: E */
        public int f50756E;

        /* renamed from: F */
        public int f50757F;

        /* renamed from: G */
        public Notification f50758G;

        /* renamed from: H */
        public RemoteViews f50759H;

        /* renamed from: I */
        public RemoteViews f50760I;

        /* renamed from: J */
        public RemoteViews f50761J;

        /* renamed from: K */
        public String f50762K;

        /* renamed from: L */
        public int f50763L;

        /* renamed from: M */
        public String f50764M;

        /* renamed from: N */
        public long f50765N;

        /* renamed from: O */
        public int f50766O;

        /* renamed from: P */
        public int f50767P;

        /* renamed from: Q */
        public boolean f50768Q;

        /* renamed from: R */
        public Notification f50769R;

        /* renamed from: S */
        public boolean f50770S;

        /* renamed from: T */
        public Icon f50771T;
        @Deprecated

        /* renamed from: U */
        public ArrayList<String> f50772U;

        /* renamed from: a */
        public Context f50773a;

        /* renamed from: b */
        public ArrayList<C10762a> f50774b;

        /* renamed from: c */
        public ArrayList<C42130hS3> f50775c;

        /* renamed from: d */
        public ArrayList<C10762a> f50776d;

        /* renamed from: e */
        public CharSequence f50777e;

        /* renamed from: f */
        public CharSequence f50778f;

        /* renamed from: g */
        public PendingIntent f50779g;

        /* renamed from: h */
        public PendingIntent f50780h;

        /* renamed from: i */
        public RemoteViews f50781i;

        /* renamed from: j */
        public Bitmap f50782j;

        /* renamed from: k */
        public CharSequence f50783k;

        /* renamed from: l */
        public int f50784l;

        /* renamed from: m */
        public int f50785m;

        /* renamed from: n */
        public boolean f50786n;

        /* renamed from: o */
        public boolean f50787o;

        /* renamed from: p */
        public AbstractC10775i f50788p;

        /* renamed from: q */
        public CharSequence f50789q;

        /* renamed from: r */
        public CharSequence f50790r;

        /* renamed from: s */
        public CharSequence[] f50791s;

        /* renamed from: t */
        public int f50792t;

        /* renamed from: u */
        public int f50793u;

        /* renamed from: v */
        public boolean f50794v;

        /* renamed from: w */
        public String f50795w;

        /* renamed from: x */
        public boolean f50796x;

        /* renamed from: y */
        public String f50797y;

        /* renamed from: z */
        public boolean f50798z;

        public C10770e(Context context, String str) {
            this.f50774b = new ArrayList<>();
            this.f50775c = new ArrayList<>();
            this.f50776d = new ArrayList<>();
            this.f50786n = true;
            this.f50798z = false;
            this.f50756E = 0;
            this.f50757F = 0;
            this.f50763L = 0;
            this.f50766O = 0;
            this.f50767P = 0;
            Notification notification = new Notification();
            this.f50769R = notification;
            this.f50773a = context;
            this.f50762K = str;
            notification.when = System.currentTimeMillis();
            this.f50769R.audioStreamType = -1;
            this.f50785m = 0;
            this.f50772U = new ArrayList<>();
            this.f50768Q = true;
        }

        /* renamed from: e */
        public static CharSequence m71055e(CharSequence charSequence) {
            if (charSequence == null) {
                return charSequence;
            }
            if (charSequence.length() > 5120) {
                return charSequence.subSequence(0, 5120);
            }
            return charSequence;
        }

        /* renamed from: A */
        public C10770e m71068A(boolean z) {
            this.f50786n = z;
            return this;
        }

        /* renamed from: B */
        public C10770e m71067B(int i) {
            this.f50769R.icon = i;
            return this;
        }

        /* renamed from: C */
        public C10770e m71066C(Uri uri) {
            Notification notification = this.f50769R;
            notification.sound = uri;
            notification.audioStreamType = -1;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            return this;
        }

        /* renamed from: D */
        public C10770e m71065D(AbstractC10775i abstractC10775i) {
            if (this.f50788p != abstractC10775i) {
                this.f50788p = abstractC10775i;
                if (abstractC10775i != null) {
                    abstractC10775i.m71014g(this);
                }
            }
            return this;
        }

        /* renamed from: E */
        public C10770e m71064E(CharSequence charSequence) {
            this.f50789q = m71055e(charSequence);
            return this;
        }

        /* renamed from: F */
        public C10770e m71063F(CharSequence charSequence) {
            this.f50769R.tickerText = m71055e(charSequence);
            return this;
        }

        /* renamed from: G */
        public C10770e m71062G(long[] jArr) {
            this.f50769R.vibrate = jArr;
            return this;
        }

        /* renamed from: H */
        public C10770e m71061H(int i) {
            this.f50757F = i;
            return this;
        }

        /* renamed from: I */
        public C10770e m71060I(long j) {
            this.f50769R.when = j;
            return this;
        }

        /* renamed from: a */
        public C10770e m71059a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f50774b.add(new C10762a(i, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: b */
        public C10770e m71058b(C10762a c10762a) {
            if (c10762a != null) {
                this.f50774b.add(c10762a);
            }
            return this;
        }

        /* renamed from: c */
        public Notification m71057c() {
            return new C52894zc3(this).m1017c();
        }

        /* renamed from: d */
        public Bundle m71056d() {
            if (this.f50755D == null) {
                this.f50755D = new Bundle();
            }
            return this.f50755D;
        }

        /* renamed from: f */
        public final Bitmap m71054f(Bitmap bitmap) {
            if (bitmap != null && Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f50773a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(C36342Uf4.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(C36342Uf4.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                    return bitmap;
                }
                double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
            }
            return bitmap;
        }

        /* renamed from: g */
        public C10770e m71053g(boolean z) {
            m71042r(16, z);
            return this;
        }

        /* renamed from: h */
        public C10770e m71052h(String str) {
            this.f50754C = str;
            return this;
        }

        /* renamed from: i */
        public C10770e m71051i(String str) {
            this.f50762K = str;
            return this;
        }

        /* renamed from: j */
        public C10770e m71050j(int i) {
            this.f50756E = i;
            return this;
        }

        /* renamed from: k */
        public C10770e m71049k(PendingIntent pendingIntent) {
            this.f50779g = pendingIntent;
            return this;
        }

        /* renamed from: l */
        public C10770e m71048l(CharSequence charSequence) {
            this.f50778f = m71055e(charSequence);
            return this;
        }

        /* renamed from: m */
        public C10770e m71047m(CharSequence charSequence) {
            this.f50777e = m71055e(charSequence);
            return this;
        }

        /* renamed from: n */
        public C10770e m71046n(RemoteViews remoteViews) {
            this.f50760I = remoteViews;
            return this;
        }

        /* renamed from: o */
        public C10770e m71045o(RemoteViews remoteViews) {
            this.f50759H = remoteViews;
            return this;
        }

        /* renamed from: p */
        public C10770e m71044p(int i) {
            Notification notification = this.f50769R;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        /* renamed from: q */
        public C10770e m71043q(PendingIntent pendingIntent) {
            this.f50769R.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: r */
        public final void m71042r(int i, boolean z) {
            if (z) {
                Notification notification = this.f50769R;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.f50769R;
            notification2.flags = (~i) & notification2.flags;
        }

        /* renamed from: s */
        public C10770e m71041s(Bitmap bitmap) {
            this.f50782j = m71054f(bitmap);
            return this;
        }

        /* renamed from: t */
        public C10770e m71040t(int i, int i2, int i3) {
            int i4;
            Notification notification = this.f50769R;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            if (i2 != 0 && i3 != 0) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            notification.flags = i4 | (notification.flags & (-2));
            return this;
        }

        /* renamed from: u */
        public C10770e m71039u(boolean z) {
            this.f50798z = z;
            return this;
        }

        /* renamed from: v */
        public C10770e m71038v(int i) {
            this.f50784l = i;
            return this;
        }

        /* renamed from: w */
        public C10770e m71037w(boolean z) {
            m71042r(8, z);
            return this;
        }

        /* renamed from: x */
        public C10770e m71036x(int i) {
            this.f50785m = i;
            return this;
        }

        /* renamed from: y */
        public C10770e m71035y(Notification notification) {
            this.f50758G = notification;
            return this;
        }

        /* renamed from: z */
        public C10770e m71034z(String str) {
            this.f50764M = str;
            return this;
        }

        @Deprecated
        public C10770e(Context context) {
            this(context, null);
        }
    }
}
