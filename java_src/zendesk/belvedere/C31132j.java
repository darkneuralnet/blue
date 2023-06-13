package zendesk.belvedere;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: zendesk.belvedere.j */
/* loaded from: classes8.dex */
public class C31132j {

    /* renamed from: a */
    public InterfaceC31135c f121885a = null;

    /* renamed from: zendesk.belvedere.j$a */
    /* loaded from: classes8.dex */
    public class C31133a implements InterfaceC31135c {

        /* renamed from: a */
        public final /* synthetic */ Context f121886a;

        /* renamed from: b */
        public final /* synthetic */ List f121887b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC31136d f121888c;

        public C31133a(Context context, List list, InterfaceC31136d interfaceC31136d) {
            this.f121886a = context;
            this.f121887b = list;
            this.f121888c = interfaceC31136d;
        }

        @Override // zendesk.belvedere.C31132j.InterfaceC31135c
        /* renamed from: a */
        public void mo649a(Map<String, Boolean> map) {
            List<MediaIntent> m656f = C31132j.this.m656f(this.f121886a, this.f121887b);
            if (C31132j.this.m657e(this.f121886a)) {
                this.f121888c.mo648a(m656f);
            } else {
                this.f121888c.mo647b();
            }
        }
    }

    /* renamed from: zendesk.belvedere.j$b */
    /* loaded from: classes8.dex */
    public class C31134b implements InterfaceC31135c {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC31135c f121890a;

        public C31134b(InterfaceC31135c interfaceC31135c) {
            this.f121890a = interfaceC31135c;
        }

        @Override // zendesk.belvedere.C31132j.InterfaceC31135c
        /* renamed from: a */
        public void mo649a(Map<String, Boolean> map) {
            this.f121890a.mo649a(map);
            C31132j.this.m650l(null);
        }
    }

    /* renamed from: zendesk.belvedere.j$c */
    /* loaded from: classes8.dex */
    public interface InterfaceC31135c {
        /* renamed from: a */
        void mo649a(Map<String, Boolean> map);
    }

    /* renamed from: zendesk.belvedere.j$d */
    /* loaded from: classes8.dex */
    public interface InterfaceC31136d {
        /* renamed from: a */
        void mo648a(List<MediaIntent> list);

        /* renamed from: b */
        void mo647b();
    }

    /* renamed from: d */
    public final void m658d(Fragment fragment, List<String> list, InterfaceC31135c interfaceC31135c) {
        m650l(new C31134b(interfaceC31135c));
        fragment.requestPermissions((String[]) list.toArray(new String[list.size()]), 9842);
    }

    /* renamed from: e */
    public final boolean m657e(Context context) {
        if (m652j(context, "android.permission.READ_EXTERNAL_STORAGE")) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final List<MediaIntent> m656f(Context context, List<MediaIntent> list) {
        ArrayList arrayList = new ArrayList();
        for (MediaIntent mediaIntent : list) {
            if (mediaIntent.m796d()) {
                if (TextUtils.isEmpty(mediaIntent.m798b())) {
                    arrayList.add(mediaIntent);
                } else if (m652j(context, mediaIntent.m798b())) {
                    arrayList.add(mediaIntent);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public final List<String> m655g(Context context) {
        ArrayList arrayList = new ArrayList();
        if (!m657e(context)) {
            arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
        }
        return arrayList;
    }

    /* renamed from: h */
    public final List<String> m654h(List<MediaIntent> list) {
        ArrayList arrayList = new ArrayList();
        for (MediaIntent mediaIntent : list) {
            if (!TextUtils.isEmpty(mediaIntent.m798b()) && mediaIntent.m796d()) {
                arrayList.add(mediaIntent.m798b());
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public void m653i(Fragment fragment, List<MediaIntent> list, InterfaceC31136d interfaceC31136d) {
        Context context = fragment.getContext();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m655g(context));
        arrayList.addAll(m654h(list));
        if (m657e(context) && arrayList.isEmpty()) {
            interfaceC31136d.mo648a(m656f(context, list));
        } else if (!m657e(context) && arrayList.isEmpty()) {
            interfaceC31136d.mo647b();
        } else {
            m658d(fragment, arrayList, new C31133a(context, list, interfaceC31136d));
        }
    }

    /* renamed from: j */
    public final boolean m652j(Context context, String str) {
        return C39139cR3.m61309b(context, str);
    }

    /* renamed from: k */
    public boolean m651k(int i, String[] strArr, int[] iArr) {
        if (i != 9842) {
            return false;
        }
        HashMap hashMap = new HashMap();
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                hashMap.put(strArr[i2], Boolean.TRUE);
            } else if (i3 == -1) {
                hashMap.put(strArr[i2], Boolean.FALSE);
            }
        }
        InterfaceC31135c interfaceC31135c = this.f121885a;
        if (interfaceC31135c != null) {
            interfaceC31135c.mo649a(hashMap);
            return true;
        }
        return true;
    }

    /* renamed from: l */
    public final void m650l(InterfaceC31135c interfaceC31135c) {
        this.f121885a = interfaceC31135c;
    }
}
