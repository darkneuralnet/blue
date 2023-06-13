package p000;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.share.model.CameraEffectTextures;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import com.facebook.share.widget.LikeView;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C36359Uh3;
import p000.C48113rY2;
import p000.C52364yi6;
import p000.M80;
/* renamed from: Ny5  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34876Ny5 {

    /* renamed from: Ny5$a */
    /* loaded from: classes5.dex */
    public static class C5777a implements C52364yi6.InterfaceC30683b<C48113rY2.C27946a, Bundle> {
        @Override // p000.C52364yi6.InterfaceC30683b
        /* renamed from: a */
        public Bundle apply(C48113rY2.C27946a c27946a) {
            Bundle bundle = new Bundle();
            bundle.putString("uri", c27946a.m15776b());
            String m93085k = C34876Ny5.m93085k(c27946a.m15773e());
            if (m93085k != null) {
                C52364yi6.m2838g0(bundle, "extension", m93085k);
            }
            return bundle;
        }
    }

    /* renamed from: Ny5$b */
    /* loaded from: classes5.dex */
    public static class C5778b implements C52364yi6.InterfaceC30683b<ShareMedia, Bundle> {

        /* renamed from: a */
        public final /* synthetic */ UUID f25459a;

        /* renamed from: b */
        public final /* synthetic */ List f25460b;

        public C5778b(UUID uuid, List list) {
            this.f25459a = uuid;
            this.f25460b = list;
        }

        @Override // p000.C52364yi6.InterfaceC30683b
        /* renamed from: a */
        public Bundle apply(ShareMedia shareMedia) {
            C48113rY2.C27946a m93095a = C34876Ny5.m93095a(this.f25459a, shareMedia);
            this.f25460b.add(m93095a);
            Bundle bundle = new Bundle();
            bundle.putString("type", shareMedia.mo52143a().name());
            bundle.putString("uri", m93095a.m15776b());
            String m93085k = C34876Ny5.m93085k(m93095a.m15773e());
            if (m93085k != null) {
                C52364yi6.m2838g0(bundle, "extension", m93085k);
            }
            return bundle;
        }
    }

    /* renamed from: Ny5$c */
    /* loaded from: classes5.dex */
    public static class C5779c implements M80.InterfaceC5208a {

        /* renamed from: a */
        public final /* synthetic */ int f25461a;

        public C5779c(int i) {
            this.f25461a = i;
        }
    }

    /* renamed from: Ny5$d */
    /* loaded from: classes5.dex */
    public static class C5780d implements C52364yi6.InterfaceC30683b<SharePhoto, C48113rY2.C27946a> {

        /* renamed from: a */
        public final /* synthetic */ UUID f25462a;

        public C5780d(UUID uuid) {
            this.f25462a = uuid;
        }

        @Override // p000.C52364yi6.InterfaceC30683b
        /* renamed from: a */
        public C48113rY2.C27946a apply(SharePhoto sharePhoto) {
            return C34876Ny5.m93095a(this.f25462a, sharePhoto);
        }
    }

    /* renamed from: Ny5$e */
    /* loaded from: classes5.dex */
    public static class C5781e implements C52364yi6.InterfaceC30683b<C48113rY2.C27946a, String> {
        @Override // p000.C52364yi6.InterfaceC30683b
        /* renamed from: a */
        public String apply(C48113rY2.C27946a c27946a) {
            return c27946a.m15776b();
        }
    }

    /* renamed from: Ny5$f */
    /* loaded from: classes5.dex */
    public static class C5782f implements C52364yi6.InterfaceC30683b<ShareMedia, Bundle> {

        /* renamed from: a */
        public final /* synthetic */ UUID f25463a;

        /* renamed from: b */
        public final /* synthetic */ List f25464b;

        public C5782f(UUID uuid, List list) {
            this.f25463a = uuid;
            this.f25464b = list;
        }

        @Override // p000.C52364yi6.InterfaceC30683b
        /* renamed from: a */
        public Bundle apply(ShareMedia shareMedia) {
            C48113rY2.C27946a m93095a = C34876Ny5.m93095a(this.f25463a, shareMedia);
            this.f25464b.add(m93095a);
            Bundle bundle = new Bundle();
            bundle.putString("type", shareMedia.mo52143a().name());
            bundle.putString("uri", m93095a.m15776b());
            return bundle;
        }
    }

    /* renamed from: Ny5$g */
    /* loaded from: classes5.dex */
    public static class C5783g implements C36359Uh3.InterfaceC8350a {

        /* renamed from: a */
        public final /* synthetic */ UUID f25465a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f25466b;

        public C5783g(UUID uuid, ArrayList arrayList) {
            this.f25465a = uuid;
            this.f25466b = arrayList;
        }

        @Override // p000.C36359Uh3.InterfaceC8350a
        /* renamed from: a */
        public JSONObject mo81137a(SharePhoto sharePhoto) {
            C48113rY2.C27946a m93095a = C34876Ny5.m93095a(this.f25465a, sharePhoto);
            if (m93095a == null) {
                return null;
            }
            this.f25466b.add(m93095a);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", m93095a.m15776b());
                if (sharePhoto.m52176g()) {
                    jSONObject.put("user_generated", true);
                }
                return jSONObject;
            } catch (JSONException e) {
                throw new FacebookException("Unable to attach images", e);
            }
        }
    }

    /* renamed from: Ny5$h */
    /* loaded from: classes5.dex */
    public static class C5784h implements C36359Uh3.InterfaceC8350a {
        @Override // p000.C36359Uh3.InterfaceC8350a
        /* renamed from: a */
        public JSONObject mo81137a(SharePhoto sharePhoto) {
            Uri m52177e = sharePhoto.m52177e();
            if (C52364yi6.m2858T(m52177e)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", m52177e.toString());
                    return jSONObject;
                } catch (JSONException e) {
                    throw new FacebookException("Unable to attach images", e);
                }
            }
            throw new FacebookException("Only web images may be used in OG objects shared via the web dialog");
        }
    }

    /* renamed from: Ny5$i */
    /* loaded from: classes5.dex */
    public static class C5785i implements C52364yi6.InterfaceC30683b<SharePhoto, C48113rY2.C27946a> {

        /* renamed from: a */
        public final /* synthetic */ UUID f25467a;

        public C5785i(UUID uuid) {
            this.f25467a = uuid;
        }

        @Override // p000.C52364yi6.InterfaceC30683b
        /* renamed from: a */
        public C48113rY2.C27946a apply(SharePhoto sharePhoto) {
            return C34876Ny5.m93095a(this.f25467a, sharePhoto);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ C48113rY2.C27946a m93095a(UUID uuid, ShareMedia shareMedia) {
        if (TD0.m84203d(C34876Ny5.class)) {
            return null;
        }
        try {
            return m93093c(uuid, shareMedia);
        } catch (Throwable th) {
            TD0.m84205b(th, C34876Ny5.class);
            return null;
        }
    }

    /* renamed from: b */
    public static C48113rY2.C27946a m93094b(UUID uuid, Uri uri, Bitmap bitmap) {
        C48113rY2.C27946a c27946a = null;
        if (TD0.m84203d(C34876Ny5.class)) {
            return null;
        }
        try {
        } catch (Throwable th) {
            TD0.m84205b(th, C34876Ny5.class);
        }
        if (bitmap != null) {
            c27946a = C48113rY2.m15786c(uuid, bitmap);
        } else {
            if (uri != null) {
                c27946a = C48113rY2.m15785d(uuid, uri);
            }
            return c27946a;
        }
        return c27946a;
    }

    /* renamed from: c */
    public static C48113rY2.C27946a m93093c(UUID uuid, ShareMedia shareMedia) {
        Uri uri;
        Bitmap bitmap;
        if (TD0.m84203d(C34876Ny5.class)) {
            return null;
        }
        try {
            if (shareMedia instanceof SharePhoto) {
                SharePhoto sharePhoto = (SharePhoto) shareMedia;
                bitmap = sharePhoto.m52179c();
                uri = sharePhoto.m52177e();
            } else if (shareMedia instanceof ShareVideo) {
                uri = ((ShareVideo) shareMedia).m52142c();
                bitmap = null;
            } else {
                uri = null;
                bitmap = null;
            }
            return m93094b(uuid, uri, bitmap);
        } catch (Throwable th) {
            TD0.m84205b(th, C34876Ny5.class);
            return null;
        }
    }

    /* renamed from: d */
    public static Bundle m93092d(ShareStoryContent shareStoryContent, UUID uuid) {
        if (!TD0.m84203d(C34876Ny5.class) && shareStoryContent != null) {
            try {
                if (shareStoryContent.m52148j() != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(shareStoryContent.m52148j());
                    ArrayList arrayList2 = new ArrayList();
                    List m2850a0 = C52364yi6.m2850a0(arrayList, new C5778b(uuid, arrayList2));
                    C48113rY2.m15788a(arrayList2);
                    return (Bundle) m2850a0.get(0);
                }
            } catch (Throwable th) {
                TD0.m84205b(th, C34876Ny5.class);
            }
        }
        return null;
    }

    /* renamed from: e */
    public static Pair<String, String> m93091e(String str) {
        String str2;
        int i;
        if (TD0.m84203d(C34876Ny5.class)) {
            return null;
        }
        try {
            int indexOf = str.indexOf(58);
            if (indexOf != -1 && str.length() > (i = indexOf + 1)) {
                str2 = str.substring(0, indexOf);
                str = str.substring(i);
            } else {
                str2 = null;
            }
            return new Pair<>(str2, str);
        } catch (Throwable th) {
            TD0.m84205b(th, C34876Ny5.class);
            return null;
        }
    }

    /* renamed from: f */
    public static List<Bundle> m93090f(ShareMediaContent shareMediaContent, UUID uuid) {
        if (!TD0.m84203d(C34876Ny5.class) && shareMediaContent != null) {
            try {
                List<ShareMedia> m52232i = shareMediaContent.m52232i();
                if (m52232i != null) {
                    ArrayList arrayList = new ArrayList();
                    List<Bundle> m2850a0 = C52364yi6.m2850a0(m52232i, new C5782f(uuid, arrayList));
                    C48113rY2.m15788a(arrayList);
                    return m2850a0;
                }
            } catch (Throwable th) {
                TD0.m84205b(th, C34876Ny5.class);
            }
        }
        return null;
    }

    /* renamed from: g */
    public static LikeView.EnumC17371g m93089g(LikeView.EnumC17371g enumC17371g, LikeView.EnumC17371g enumC17371g2) {
        if (TD0.m84203d(C34876Ny5.class)) {
            return null;
        }
        if (enumC17371g == enumC17371g2) {
            return enumC17371g;
        }
        try {
            LikeView.EnumC17371g enumC17371g3 = LikeView.EnumC17371g.UNKNOWN;
            if (enumC17371g == enumC17371g3) {
                return enumC17371g2;
            }
            if (enumC17371g2 != enumC17371g3) {
                return null;
            }
            return enumC17371g;
        } catch (Throwable th) {
            TD0.m84205b(th, C34876Ny5.class);
            return null;
        }
    }

    /* renamed from: h */
    public static List<String> m93088h(SharePhotoContent sharePhotoContent, UUID uuid) {
        if (!TD0.m84203d(C34876Ny5.class) && sharePhotoContent != null) {
            try {
                List<SharePhoto> photos = sharePhotoContent.getPhotos();
                if (photos != null) {
                    List m2850a0 = C52364yi6.m2850a0(photos, new C5780d(uuid));
                    List<String> m2850a02 = C52364yi6.m2850a0(m2850a0, new C5781e());
                    C48113rY2.m15788a(m2850a0);
                    return m2850a02;
                }
            } catch (Throwable th) {
                TD0.m84205b(th, C34876Ny5.class);
            }
        }
        return null;
    }

    /* renamed from: i */
    public static Bundle m93087i(ShareStoryContent shareStoryContent, UUID uuid) {
        if (!TD0.m84203d(C34876Ny5.class) && shareStoryContent != null) {
            try {
                if (shareStoryContent.m52146l() != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(shareStoryContent.m52146l());
                    List m2850a0 = C52364yi6.m2850a0(arrayList, new C5785i(uuid));
                    List m2850a02 = C52364yi6.m2850a0(m2850a0, new C5777a());
                    C48113rY2.m15788a(m2850a0);
                    return (Bundle) m2850a02.get(0);
                }
            } catch (Throwable th) {
                TD0.m84205b(th, C34876Ny5.class);
            }
        }
        return null;
    }

    /* renamed from: j */
    public static Bundle m93086j(ShareCameraEffectContent shareCameraEffectContent, UUID uuid) {
        if (!TD0.m84203d(C34876Ny5.class) && shareCameraEffectContent != null) {
            try {
                CameraEffectTextures m52274k = shareCameraEffectContent.m52274k();
                if (m52274k != null) {
                    Bundle bundle = new Bundle();
                    ArrayList arrayList = new ArrayList();
                    for (String str : m52274k.m52285d()) {
                        C48113rY2.C27946a m93094b = m93094b(uuid, m52274k.m52286c(str), m52274k.m52287b(str));
                        arrayList.add(m93094b);
                        bundle.putString(str, m93094b.m15776b());
                    }
                    C48113rY2.m15788a(arrayList);
                    return bundle;
                }
            } catch (Throwable th) {
                TD0.m84205b(th, C34876Ny5.class);
            }
        }
        return null;
    }

    /* renamed from: k */
    public static String m93085k(Uri uri) {
        if (TD0.m84203d(C34876Ny5.class) || uri == null) {
            return null;
        }
        try {
            String uri2 = uri.toString();
            int lastIndexOf = uri2.lastIndexOf(46);
            if (lastIndexOf == -1) {
                return null;
            }
            return uri2.substring(lastIndexOf);
        } catch (Throwable th) {
            TD0.m84205b(th, C34876Ny5.class);
            return null;
        }
    }

    /* renamed from: l */
    public static String m93084l(ShareVideoContent shareVideoContent, UUID uuid) {
        if (!TD0.m84203d(C34876Ny5.class) && shareVideoContent != null) {
            try {
                if (shareVideoContent.m52131l() != null) {
                    C48113rY2.C27946a m15785d = C48113rY2.m15785d(uuid, shareVideoContent.m52131l().m52142c());
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(m15785d);
                    C48113rY2.m15788a(arrayList);
                    return m15785d.m15776b();
                }
            } catch (Throwable th) {
                TD0.m84205b(th, C34876Ny5.class);
            }
        }
        return null;
    }

    /* renamed from: m */
    public static GraphRequest m93083m(AccessToken accessToken, Uri uri, GraphRequest.InterfaceC17205b interfaceC17205b) throws FileNotFoundException {
        if (TD0.m84203d(C34876Ny5.class)) {
            return null;
        }
        try {
            if (C52364yi6.m2861Q(uri)) {
                return m93082n(accessToken, new File(uri.getPath()), interfaceC17205b);
            }
            if (C52364yi6.m2864N(uri)) {
                GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(uri, "image/png");
                Bundle bundle = new Bundle(1);
                bundle.putParcelable("file", parcelableResourceWithMimeType);
                return new GraphRequest(accessToken, "me/staging_resources", bundle, FN1.POST, interfaceC17205b);
            }
            throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
        } catch (Throwable th) {
            TD0.m84205b(th, C34876Ny5.class);
            return null;
        }
    }

    /* renamed from: n */
    public static GraphRequest m93082n(AccessToken accessToken, File file, GraphRequest.InterfaceC17205b interfaceC17205b) throws FileNotFoundException {
        if (TD0.m84203d(C34876Ny5.class)) {
            return null;
        }
        try {
            GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(ParcelFileDescriptor.open(file, 268435456), "image/png");
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", parcelableResourceWithMimeType);
            return new GraphRequest(accessToken, "me/staging_resources", bundle, FN1.POST, interfaceC17205b);
        } catch (Throwable th) {
            TD0.m84205b(th, C34876Ny5.class);
            return null;
        }
    }

    /* renamed from: o */
    public static void m93081o(int i) {
        if (TD0.m84203d(C34876Ny5.class)) {
            return;
        }
        try {
            M80.m95693b(i, new C5779c(i));
        } catch (Throwable th) {
            TD0.m84205b(th, C34876Ny5.class);
        }
    }

    /* renamed from: p */
    public static JSONArray m93080p(JSONArray jSONArray, boolean z) throws JSONException {
        if (TD0.m84203d(C34876Ny5.class)) {
            return null;
        }
        try {
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof JSONArray) {
                    obj = m93080p((JSONArray) obj, z);
                } else if (obj instanceof JSONObject) {
                    obj = m93079q((JSONObject) obj, z);
                }
                jSONArray2.put(obj);
            }
            return jSONArray2;
        } catch (Throwable th) {
            TD0.m84205b(th, C34876Ny5.class);
            return null;
        }
    }

    /* renamed from: q */
    public static JSONObject m93079q(JSONObject jSONObject, boolean z) {
        if (TD0.m84203d(C34876Ny5.class) || jSONObject == null) {
            return null;
        }
        try {
            try {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                JSONArray names = jSONObject.names();
                for (int i = 0; i < names.length(); i++) {
                    String string = names.getString(i);
                    Object obj = jSONObject.get(string);
                    if (obj instanceof JSONObject) {
                        obj = m93079q((JSONObject) obj, true);
                    } else if (obj instanceof JSONArray) {
                        obj = m93080p((JSONArray) obj, true);
                    }
                    Pair<String, String> m93091e = m93091e(string);
                    String str = (String) m93091e.first;
                    String str2 = (String) m93091e.second;
                    if (z) {
                        if (str != null && str.equals("fbsdk")) {
                            jSONObject2.put(string, obj);
                        } else {
                            if (str != null && !str.equals("og")) {
                                jSONObject3.put(str2, obj);
                            }
                            jSONObject2.put(str2, obj);
                        }
                    } else if (str != null && str.equals("fb")) {
                        jSONObject2.put(string, obj);
                    } else {
                        jSONObject2.put(str2, obj);
                    }
                }
                if (jSONObject3.length() > 0) {
                    jSONObject2.put(MessageExtension.FIELD_DATA, jSONObject3);
                }
                return jSONObject2;
            } catch (JSONException unused) {
                throw new FacebookException("Failed to create json object from share content");
            }
        } catch (Throwable th) {
            TD0.m84205b(th, C34876Ny5.class);
            return null;
        }
    }

    /* renamed from: r */
    public static JSONObject m93078r(UUID uuid, ShareOpenGraphContent shareOpenGraphContent) throws JSONException {
        Set m2857U;
        if (TD0.m84203d(C34876Ny5.class)) {
            return null;
        }
        try {
            ShareOpenGraphAction m52192i = shareOpenGraphContent.m52192i();
            ArrayList arrayList = new ArrayList();
            JSONObject m81140b = C36359Uh3.m81140b(m52192i, new C5783g(uuid, arrayList));
            C48113rY2.m15788a(arrayList);
            if (shareOpenGraphContent.m52268d() != null && C52364yi6.m2860R(m81140b.optString("place"))) {
                m81140b.put("place", shareOpenGraphContent.m52268d());
            }
            if (shareOpenGraphContent.m52269c() != null) {
                JSONArray optJSONArray = m81140b.optJSONArray("tags");
                if (optJSONArray == null) {
                    m2857U = new HashSet();
                } else {
                    m2857U = C52364yi6.m2857U(optJSONArray);
                }
                for (String str : shareOpenGraphContent.m52269c()) {
                    m2857U.add(str);
                }
                m81140b.put("tags", new JSONArray((Collection) m2857U));
            }
            return m81140b;
        } catch (Throwable th) {
            TD0.m84205b(th, C34876Ny5.class);
            return null;
        }
    }

    /* renamed from: s */
    public static JSONObject m93077s(ShareOpenGraphContent shareOpenGraphContent) throws JSONException {
        if (TD0.m84203d(C34876Ny5.class)) {
            return null;
        }
        try {
            return C36359Uh3.m81140b(shareOpenGraphContent.m52192i(), new C5784h());
        } catch (Throwable th) {
            TD0.m84205b(th, C34876Ny5.class);
            return null;
        }
    }
}
