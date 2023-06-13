package zendesk.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.ON4;
/* loaded from: classes8.dex */
class ZendeskUserProvider implements UserProvider {
    private final UserService userService;
    private static final ON4.InterfaceC5984b<UserResponse, User> USER_EXTRACTOR = new ON4.InterfaceC5984b<UserResponse, User>() { // from class: zendesk.core.ZendeskUserProvider.6
        @Override // p000.ON4.InterfaceC5984b
        public User extract(UserResponse userResponse) {
            return userResponse.getUser();
        }
    };
    private static final ON4.InterfaceC5984b<UserFieldResponse, List<UserField>> FIELDS_EXTRACTOR = new ON4.InterfaceC5984b<UserFieldResponse, List<UserField>>() { // from class: zendesk.core.ZendeskUserProvider.7
        @Override // p000.ON4.InterfaceC5984b
        public List<UserField> extract(UserFieldResponse userFieldResponse) {
            return userFieldResponse.getUserFields();
        }
    };
    private static final ON4.InterfaceC5984b<UserResponse, Map<String, String>> FIELDS_MAP_EXTRACTOR = new ON4.InterfaceC5984b<UserResponse, Map<String, String>>() { // from class: zendesk.core.ZendeskUserProvider.8
        @Override // p000.ON4.InterfaceC5984b
        public Map<String, String> extract(UserResponse userResponse) {
            if (userResponse != null && userResponse.getUser() != null) {
                return userResponse.getUser().getUserFields();
            }
            return C43505jm0.m29953d(new HashMap());
        }
    };
    private static final ON4.InterfaceC5984b<UserResponse, List<String>> TAGS_EXTRACTOR = new ON4.InterfaceC5984b<UserResponse, List<String>>() { // from class: zendesk.core.ZendeskUserProvider.9
        @Override // p000.ON4.InterfaceC5984b
        public List<String> extract(UserResponse userResponse) {
            if (userResponse != null && userResponse.getUser() != null) {
                return userResponse.getUser().getTags();
            }
            return C43505jm0.m29954c(new ArrayList());
        }
    };

    public ZendeskUserProvider(UserService userService) {
        this.userService = userService;
    }

    @Override // zendesk.core.UserProvider
    public void addTags(List<String> list, final AbstractC44415lI6<List<String>> abstractC44415lI6) {
        this.userService.addTags(new UserTagRequest(C43505jm0.m29952e(list))).mo1284E0(new ON4(new PassThroughErrorZendeskCallback<List<String>>(abstractC44415lI6) { // from class: zendesk.core.ZendeskUserProvider.1
            @Override // zendesk.core.PassThroughErrorZendeskCallback, p000.AbstractC44415lI6
            public void onSuccess(List<String> list2) {
                AbstractC44415lI6 abstractC44415lI62 = abstractC44415lI6;
                if (abstractC44415lI62 != null) {
                    abstractC44415lI62.onSuccess(list2);
                }
            }
        }, TAGS_EXTRACTOR));
    }

    @Override // zendesk.core.UserProvider
    public void deleteTags(List<String> list, final AbstractC44415lI6<List<String>> abstractC44415lI6) {
        this.userService.deleteTags(C44504lS5.m27269f(C43505jm0.m29952e(list))).mo1284E0(new ON4(new PassThroughErrorZendeskCallback<List<String>>(abstractC44415lI6) { // from class: zendesk.core.ZendeskUserProvider.2
            @Override // zendesk.core.PassThroughErrorZendeskCallback, p000.AbstractC44415lI6
            public void onSuccess(List<String> list2) {
                AbstractC44415lI6 abstractC44415lI62 = abstractC44415lI6;
                if (abstractC44415lI62 != null) {
                    abstractC44415lI62.onSuccess(list2);
                }
            }
        }, TAGS_EXTRACTOR));
    }

    @Override // zendesk.core.UserProvider
    public void getUser(final AbstractC44415lI6<User> abstractC44415lI6) {
        this.userService.getUser().mo1284E0(new ON4(new PassThroughErrorZendeskCallback<User>(abstractC44415lI6) { // from class: zendesk.core.ZendeskUserProvider.5
            @Override // zendesk.core.PassThroughErrorZendeskCallback, p000.AbstractC44415lI6
            public void onSuccess(User user) {
                AbstractC44415lI6 abstractC44415lI62 = abstractC44415lI6;
                if (abstractC44415lI62 != null) {
                    abstractC44415lI62.onSuccess(user);
                }
            }
        }, USER_EXTRACTOR));
    }

    @Override // zendesk.core.UserProvider
    public void getUserFields(final AbstractC44415lI6<List<UserField>> abstractC44415lI6) {
        this.userService.getUserFields().mo1284E0(new ON4(new PassThroughErrorZendeskCallback<List<UserField>>(abstractC44415lI6) { // from class: zendesk.core.ZendeskUserProvider.3
            @Override // zendesk.core.PassThroughErrorZendeskCallback, p000.AbstractC44415lI6
            public void onSuccess(List<UserField> list) {
                AbstractC44415lI6 abstractC44415lI62 = abstractC44415lI6;
                if (abstractC44415lI62 != null) {
                    abstractC44415lI62.onSuccess(list);
                }
            }
        }, FIELDS_EXTRACTOR));
    }

    @Override // zendesk.core.UserProvider
    public void setUserFields(Map<String, String> map, final AbstractC44415lI6<Map<String, String>> abstractC44415lI6) {
        this.userService.setUserFields(new UserFieldRequest(map)).mo1284E0(new ON4(new PassThroughErrorZendeskCallback<Map<String, String>>(abstractC44415lI6) { // from class: zendesk.core.ZendeskUserProvider.4
            @Override // zendesk.core.PassThroughErrorZendeskCallback, p000.AbstractC44415lI6
            public void onSuccess(Map<String, String> map2) {
                AbstractC44415lI6 abstractC44415lI62 = abstractC44415lI6;
                if (abstractC44415lI62 != null) {
                    abstractC44415lI62.onSuccess(map2);
                }
            }
        }, FIELDS_MAP_EXTRACTOR));
    }
}
