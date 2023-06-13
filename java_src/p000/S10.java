package p000;

import android.net.Uri;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p000.Q10;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u0004\u0018\u00010\u0000H\u0000\u001a\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¨\u0006\n"}, m28432d2 = {"LwO1;", "", C17296a.f69688o, "", "Landroid/net/Uri;", "c", "Lorg/json/JSONObject;", "json", "LQ10$a;", "b", "android-sdk-ui_release"}, m28431k = 2, m28430mv = {1, 6, 0})
@JvmName(name = "BrazeActionUtils")
/* renamed from: S10 */
/* loaded from: classes2.dex */
public final class S10 {

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: S10$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C7308a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Q10.EnumC6632a.values().length];
            iArr[Q10.EnumC6632a.f29658f.ordinal()] = 1;
            iArr[Q10.EnumC6632a.f29670r.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final boolean m86124a(InterfaceC50985wO1 interfaceC50985wO1) {
        boolean z;
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(interfaceC50985wO1, "<this>");
        ArrayList<Uri> arrayList = new ArrayList();
        for (Object obj : m86122c(interfaceC50985wO1)) {
            if (Q10.f29655a.m89131d((Uri) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList<JSONObject> arrayList2 = new ArrayList();
        for (Uri uri : arrayList) {
            Pair m89132c = Q10.f29655a.m89132c(uri);
            if (m89132c == null) {
                jSONObject = null;
            } else {
                jSONObject = (JSONObject) m89132c.getSecond();
            }
            if (jSONObject != null) {
                arrayList2.add(jSONObject);
            }
        }
        ArrayList<Q10.EnumC6632a> arrayList3 = new ArrayList();
        for (JSONObject jSONObject2 : arrayList2) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList3, m86123b(jSONObject2));
        }
        if (arrayList3.isEmpty()) {
            return false;
        }
        for (Q10.EnumC6632a enumC6632a : arrayList3) {
            if (enumC6632a == Q10.EnumC6632a.f29661i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final /* synthetic */ List m86123b(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ArrayList arrayList = new ArrayList();
        KQ5 kq5 = new KQ5(json, null, 2, null);
        Q10.EnumC6632a m89133b = Q10.f29655a.m89133b(kq5);
        int i = C7308a.$EnumSwitchMapping$0[m89133b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                arrayList.add(m89133b);
            }
        } else {
            Iterator m82206c = C36284Tz0.f36576b.m82206c(kq5);
            while (m82206c.hasNext()) {
                arrayList.addAll(m86123b((JSONObject) m82206c.next()));
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static final /* synthetic */ List m86122c(InterfaceC50985wO1 interfaceC50985wO1) {
        List emptyList;
        if (interfaceC50985wO1 == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        ArrayList arrayList = new ArrayList();
        Uri mo6946R = interfaceC50985wO1.mo6946R();
        if (mo6946R != null) {
            arrayList.add(mo6946R);
        }
        if (interfaceC50985wO1 instanceof AO1) {
            ArrayList arrayList2 = new ArrayList();
            for (C45103mT2 c45103mT2 : ((AO1) interfaceC50985wO1).mo14016M()) {
                Uri m25552R = c45103mT2.m25552R();
                if (m25552R != null) {
                    arrayList2.add(m25552R);
                }
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }
}
