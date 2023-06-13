package zendesk.core;

import java.util.List;
import java.util.Map;
/* loaded from: classes8.dex */
public interface UserProvider {
    void addTags(List<String> list, AbstractC44415lI6<List<String>> abstractC44415lI6);

    void deleteTags(List<String> list, AbstractC44415lI6<List<String>> abstractC44415lI6);

    void getUser(AbstractC44415lI6<User> abstractC44415lI6);

    void getUserFields(AbstractC44415lI6<List<UserField>> abstractC44415lI6);

    void setUserFields(Map<String, String> map, AbstractC44415lI6<Map<String, String>> abstractC44415lI6);
}
