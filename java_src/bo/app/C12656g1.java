package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.enums.CardKey;
import com.appboy.events.FeedUpdatedEvent;
import com.appboy.models.cards.Card;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: bo.app.g1 */
/* loaded from: classes.dex */
public class C12656g1 implements InterfaceC43871kO1<FeedUpdatedEvent> {

    /* renamed from: f */
    private static final String f58478f = C43664k20.m29433n(C12656g1.class);

    /* renamed from: a */
    private final SharedPreferences f58479a;

    /* renamed from: b */
    private final Set<String> f58480b;

    /* renamed from: c */
    private final Set<String> f58481c;

    /* renamed from: d */
    private final InterfaceC12518a2 f58482d = new C12641f1();

    /* renamed from: e */
    private final InterfaceC13231y1 f58483e;

    /* renamed from: bo.app.g1$a */
    /* loaded from: classes.dex */
    public enum EnumC12657a {
        READ_CARDS("read_cards_set", "read_cards_flat"),
        VIEWED_CARDS("viewed_cards_set", "viewed_cards_flat");
        

        /* renamed from: b */
        private final String f58487b;

        /* renamed from: c */
        private final String f58488c;

        EnumC12657a(String str, String str2) {
            this.f58487b = str;
            this.f58488c = str2;
        }

        /* renamed from: a */
        public String m63719a() {
            return this.f58488c;
        }

        /* renamed from: b */
        public String m63718b() {
            return this.f58487b;
        }
    }

    public C12656g1(Context context, String str, InterfaceC13231y1 interfaceC13231y1) {
        String str2;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        String m30602b = C43318jS5.m30602b(context, str2);
        this.f58483e = interfaceC13231y1;
        this.f58479a = context.getSharedPreferences("com.appboy.storage.feedstorageprovider" + m30602b, 0);
        this.f58480b = m63727a(EnumC12657a.VIEWED_CARDS);
        this.f58481c = m63727a(EnumC12657a.READ_CARDS);
        m63726a(str);
    }

    /* renamed from: b */
    public static Set<String> m63720b(String str) {
        HashSet hashSet = new HashSet();
        if (str != null) {
            Collections.addAll(hashSet, str.split(";"));
        }
        return hashSet;
    }

    /* renamed from: a */
    public FeedUpdatedEvent m63722a(JSONArray jSONArray, String str) {
        String str2 = str == null ? "" : str;
        String string = this.f58479a.getString("uid", "");
        if (string.equals(str2)) {
            String str3 = f58478f;
            C43664k20.m29431p(str3, "Updating offline feed for user with id: " + str);
            long m21027i = C46287oT0.m21027i();
            m63723a(jSONArray, m21027i);
            this.f58480b.retainAll(m63724a(jSONArray));
            m63725a(this.f58480b, EnumC12657a.VIEWED_CARDS);
            this.f58481c.retainAll(m63724a(jSONArray));
            m63725a(this.f58481c, EnumC12657a.READ_CARDS);
            return m63721a(jSONArray, str, false, m21027i);
        }
        String str4 = f58478f;
        C43664k20.m29431p(str4, "The received cards are for user " + str + " and the current user is " + string + " , the cards will be discarded and no changes will be made.");
        return null;
    }

    @Override // p000.InterfaceC43871kO1
    public void markCardAsClicked(String str) {
    }

    @Override // p000.InterfaceC43871kO1
    public void markCardAsDismissed(String str) {
    }

    @Override // p000.InterfaceC43871kO1
    public void markCardAsViewed(String str) {
        if (this.f58480b.contains(str)) {
            return;
        }
        this.f58480b.add(str);
        m63725a(this.f58480b, EnumC12657a.VIEWED_CARDS);
    }

    @Override // p000.InterfaceC43871kO1
    public void markCardAsVisuallyRead(String str) {
        if (this.f58481c.contains(str)) {
            return;
        }
        this.f58481c.add(str);
        m63725a(this.f58481c, EnumC12657a.READ_CARDS);
    }

    /* renamed from: a */
    public FeedUpdatedEvent m63728a() {
        return m63721a(new JSONArray(this.f58479a.getString("cards", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)), this.f58479a.getString("uid", ""), true, this.f58479a.getLong("cards_timestamp", -1L));
    }

    /* renamed from: a */
    private FeedUpdatedEvent m63721a(JSONArray jSONArray, String str, boolean z, long j) {
        List arrayList;
        if (jSONArray != null && jSONArray.length() != 0) {
            arrayList = C13149u.m62914a(jSONArray, new CardKey.Provider(false), this.f58483e, this, this.f58482d);
        } else {
            arrayList = new ArrayList();
        }
        List<Card> list = arrayList;
        for (Card card : list) {
            if (this.f58480b.contains(card.getId())) {
                card.setViewed(true);
                card.setIndicatorHighlighted(true);
            }
            if (this.f58481c.contains(card.getId())) {
                card.setIndicatorHighlighted(true);
            }
        }
        return new FeedUpdatedEvent(list, str, z, j);
    }

    /* renamed from: a */
    private Set<String> m63727a(EnumC12657a enumC12657a) {
        String m63719a = enumC12657a.m63719a();
        if (this.f58479a.contains(m63719a)) {
            Set<String> m63720b = m63720b(this.f58479a.getString(m63719a, null));
            SharedPreferences.Editor edit = this.f58479a.edit();
            edit.remove(m63719a);
            edit.apply();
            m63725a(m63720b, enumC12657a);
            return m63720b;
        }
        return new ConcurrentSkipListSet(this.f58479a.getStringSet(enumC12657a.m63718b(), new HashSet()));
    }

    /* renamed from: a */
    private void m63723a(JSONArray jSONArray, long j) {
        SharedPreferences.Editor edit = this.f58479a.edit();
        if (jSONArray != null && jSONArray.length() != 0) {
            edit.putString("cards", jSONArray.toString());
        } else {
            edit.remove("cards");
        }
        edit.putLong("cards_timestamp", j);
        edit.apply();
    }

    /* renamed from: a */
    private void m63726a(String str) {
        SharedPreferences.Editor edit = this.f58479a.edit();
        edit.putString("uid", str);
        edit.apply();
    }

    /* renamed from: a */
    public void m63725a(Set<String> set, EnumC12657a enumC12657a) {
        String m63718b = enumC12657a.m63718b();
        SharedPreferences.Editor edit = this.f58479a.edit();
        if (set != null && !set.isEmpty()) {
            edit.putStringSet(m63718b, set);
        } else {
            edit.remove(m63718b);
        }
        edit.apply();
    }

    /* renamed from: a */
    public static Set<String> m63724a(JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                CardKey cardKey = CardKey.ID;
                if (jSONObject.has(cardKey.getFeedKey())) {
                    hashSet.add(jSONObject.getString(cardKey.getFeedKey()));
                }
            }
        }
        return hashSet;
    }
}
