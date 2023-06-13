package zendesk.core;
/* loaded from: classes8.dex */
interface PushRegistrationService {
    @AD3("/api/mobile/push_notification_devices.json")
    InterfaceC51431x80<PushRegistrationResponseWrapper> registerDevice(@InterfaceC6404PY PushRegistrationRequestWrapper pushRegistrationRequestWrapper);

    @KF0("/api/mobile/push_notification_devices/{id}.json")
    InterfaceC51431x80<Void> unregisterDevice(@InterfaceC39678dJ3("id") String str);
}
