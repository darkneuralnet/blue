package zendesk.support.request;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import zendesk.support.Attachment;
import zendesk.support.User;
/* loaded from: classes8.dex */
class StateRequestUser implements Serializable {
    private final String avatar;

    /* renamed from: id */
    private final long f122005id;
    private final boolean isAgent;
    private final String name;

    public StateRequestUser(String str, String str2, boolean z, long j) {
        this.name = str;
        this.avatar = str2;
        this.isAgent = z;
        this.f122005id = j;
    }

    public static boolean containsAgent(List<StateRequestUser> list) {
        for (StateRequestUser stateRequestUser : list) {
            if (stateRequestUser.isAgent()) {
                return true;
            }
        }
        return false;
    }

    public static List<StateRequestUser> convert(List<User> list) {
        String str;
        ArrayList arrayList = new ArrayList(list.size());
        for (User user : list) {
            if (user.getId() != null) {
                Attachment photo = user.getPhoto();
                if (photo != null && C44504lS5.m27273b(photo.getContentUrl())) {
                    str = photo.getContentUrl();
                } else {
                    str = "";
                }
                arrayList.add(new StateRequestUser(user.getName(), str, user.isAgent(), user.getId().longValue()));
            }
        }
        return arrayList;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public long getId() {
        return this.f122005id;
    }

    public String getName() {
        return this.name;
    }

    public boolean isAgent() {
        return this.isAgent;
    }
}
