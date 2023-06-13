package p000;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import com.facebook.C17216a;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import java.util.List;
import p000.M80;
@Deprecated
/* renamed from: a31  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C37728a31 extends AbstractC43476jj1<ShareContent, Object> {

    /* renamed from: f */
    public static final int f49757f = M80.EnumC5210c.DeviceShare.m95691a();

    public C37728a31(Activity activity) {
        super(activity, f49757f);
    }

    @Override // p000.AbstractC43476jj1
    /* renamed from: e */
    public C7501Sh mo23652e() {
        return null;
    }

    @Override // p000.AbstractC43476jj1
    /* renamed from: g */
    public List<AbstractC43476jj1<ShareContent, Object>.AbstractC24996a> mo23651g() {
        return null;
    }

    @Override // p000.AbstractC43476jj1
    /* renamed from: l */
    public boolean mo30033c(ShareContent shareContent, Object obj) {
        return (shareContent instanceof ShareLinkContent) || (shareContent instanceof ShareOpenGraphContent);
    }

    @Override // p000.AbstractC43476jj1
    /* renamed from: m */
    public void mo30028j(ShareContent shareContent, Object obj) {
        if (shareContent != null) {
            if (!(shareContent instanceof ShareLinkContent) && !(shareContent instanceof ShareOpenGraphContent)) {
                throw new FacebookException(getClass().getSimpleName() + " only supports ShareLinkContent or ShareOpenGraphContent");
            }
            Intent intent = new Intent();
            intent.setClass(C17216a.m52741e(), FacebookActivity.class);
            intent.setAction("DeviceShareDialogFragment");
            intent.putExtra("content", shareContent);
            m30027k(intent, m30030h());
            return;
        }
        throw new FacebookException("Must provide non-null content to share");
    }

    public C37728a31(Fragment fragment) {
        super(new C33702Iy1(fragment), f49757f);
    }

    public C37728a31(androidx.fragment.app.Fragment fragment) {
        super(new C33702Iy1(fragment), f49757f);
    }
}
