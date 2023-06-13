package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
/* renamed from: Mu2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34603Mu2 {

    /* renamed from: f */
    public static final Object f23782f = new Object();

    /* renamed from: g */
    public static C34603Mu2 f23783g;

    /* renamed from: a */
    public final Context f23784a;

    /* renamed from: b */
    public final HashMap<BroadcastReceiver, ArrayList<C5422c>> f23785b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, ArrayList<C5422c>> f23786c = new HashMap<>();

    /* renamed from: d */
    public final ArrayList<C5421b> f23787d = new ArrayList<>();

    /* renamed from: e */
    public final Handler f23788e;

    /* renamed from: Mu2$a */
    /* loaded from: classes.dex */
    public class HandlerC5420a extends Handler {
        public HandlerC5420a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                C34603Mu2.this.m94593a();
            }
        }
    }

    /* renamed from: Mu2$b */
    /* loaded from: classes.dex */
    public static final class C5421b {

        /* renamed from: a */
        public final Intent f23790a;

        /* renamed from: b */
        public final ArrayList<C5422c> f23791b;

        public C5421b(Intent intent, ArrayList<C5422c> arrayList) {
            this.f23790a = intent;
            this.f23791b = arrayList;
        }
    }

    /* renamed from: Mu2$c */
    /* loaded from: classes.dex */
    public static final class C5422c {

        /* renamed from: a */
        public final IntentFilter f23792a;

        /* renamed from: b */
        public final BroadcastReceiver f23793b;

        /* renamed from: c */
        public boolean f23794c;

        /* renamed from: d */
        public boolean f23795d;

        public C5422c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f23792a = intentFilter;
            this.f23793b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f23793b);
            sb.append(" filter=");
            sb.append(this.f23792a);
            if (this.f23795d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public C34603Mu2(Context context) {
        this.f23784a = context;
        this.f23788e = new HandlerC5420a(context.getMainLooper());
    }

    /* renamed from: b */
    public static C34603Mu2 m94592b(Context context) {
        C34603Mu2 c34603Mu2;
        synchronized (f23782f) {
            if (f23783g == null) {
                f23783g = new C34603Mu2(context.getApplicationContext());
            }
            c34603Mu2 = f23783g;
        }
        return c34603Mu2;
    }

    /* renamed from: a */
    public void m94593a() {
        int size;
        C5421b[] c5421bArr;
        while (true) {
            synchronized (this.f23785b) {
                size = this.f23787d.size();
                if (size <= 0) {
                    return;
                }
                c5421bArr = new C5421b[size];
                this.f23787d.toArray(c5421bArr);
                this.f23787d.clear();
            }
            for (int i = 0; i < size; i++) {
                C5421b c5421b = c5421bArr[i];
                int size2 = c5421b.f23791b.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C5422c c5422c = c5421b.f23791b.get(i2);
                    if (!c5422c.f23795d) {
                        c5422c.f23793b.onReceive(this.f23784a, c5421b.f23790a);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public void m94591c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f23785b) {
            C5422c c5422c = new C5422c(intentFilter, broadcastReceiver);
            ArrayList<C5422c> arrayList = this.f23785b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f23785b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(c5422c);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList<C5422c> arrayList2 = this.f23786c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f23786c.put(action, arrayList2);
                }
                arrayList2.add(c5422c);
            }
        }
    }

    /* renamed from: d */
    public boolean m94590d(Intent intent) {
        boolean z;
        int i;
        String str;
        ArrayList arrayList;
        ArrayList<C5422c> arrayList2;
        String str2;
        String str3;
        synchronized (this.f23785b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f23784a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            if ((intent.getFlags() & 8) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<C5422c> arrayList3 = this.f23786c.get(intent.getAction());
            if (arrayList3 != null) {
                if (z) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList3);
                }
                ArrayList arrayList4 = null;
                int i2 = 0;
                while (i2 < arrayList3.size()) {
                    C5422c c5422c = arrayList3.get(i2);
                    if (z) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + c5422c.f23792a);
                    }
                    if (c5422c.f23794c) {
                        if (z) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        i = i2;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = resolveTypeIfNeeded;
                        arrayList = arrayList4;
                    } else {
                        i = i2;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = resolveTypeIfNeeded;
                        int match = c5422c.f23792a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                            }
                            if (arrayList == null) {
                                arrayList4 = new ArrayList();
                            } else {
                                arrayList4 = arrayList;
                            }
                            arrayList4.add(c5422c);
                            c5422c.f23794c = true;
                            i2 = i + 1;
                            action = str;
                            arrayList3 = arrayList2;
                            resolveTypeIfNeeded = str2;
                        } else if (z) {
                            if (match != -4) {
                                if (match != -3) {
                                    if (match != -2) {
                                        if (match != -1) {
                                            str3 = "unknown reason";
                                        } else {
                                            str3 = "type";
                                        }
                                    } else {
                                        str3 = MessageExtension.FIELD_DATA;
                                    }
                                } else {
                                    str3 = "action";
                                }
                            } else {
                                str3 = "category";
                            }
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + str3);
                        }
                    }
                    arrayList4 = arrayList;
                    i2 = i + 1;
                    action = str;
                    arrayList3 = arrayList2;
                    resolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                if (arrayList5 != null) {
                    for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                        ((C5422c) arrayList5.get(i3)).f23794c = false;
                    }
                    this.f23787d.add(new C5421b(intent, arrayList5));
                    if (!this.f23788e.hasMessages(1)) {
                        this.f23788e.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: e */
    public void m94589e(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f23785b) {
            ArrayList<C5422c> remove = this.f23785b.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                C5422c c5422c = remove.get(size);
                c5422c.f23795d = true;
                for (int i = 0; i < c5422c.f23792a.countActions(); i++) {
                    String action = c5422c.f23792a.getAction(i);
                    ArrayList<C5422c> arrayList = this.f23786c.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            C5422c c5422c2 = arrayList.get(size2);
                            if (c5422c2.f23793b == broadcastReceiver) {
                                c5422c2.f23795d = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.f23786c.remove(action);
                        }
                    }
                }
            }
        }
    }
}
