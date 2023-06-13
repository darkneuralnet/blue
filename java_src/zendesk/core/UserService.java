package zendesk.core;
/* loaded from: classes8.dex */
interface UserService {
    @AD3("/api/mobile/user_tags.json")
    InterfaceC51431x80<UserResponse> addTags(@InterfaceC6404PY UserTagRequest userTagRequest);

    @KF0("/api/mobile/user_tags/destroy_many.json")
    InterfaceC51431x80<UserResponse> deleteTags(@InterfaceC37017Xc4("tags") String str);

    @NA1("/api/mobile/users/me.json")
    InterfaceC51431x80<UserResponse> getUser();

    @NA1("/api/mobile/user_fields.json")
    InterfaceC51431x80<UserFieldResponse> getUserFields();

    @CD3("/api/mobile/users/me.json")
    InterfaceC51431x80<UserResponse> setUserFields(@InterfaceC6404PY UserFieldRequest userFieldRequest);
}
