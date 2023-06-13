package zendesk.core;

import com.google.gson.JsonSyntaxException;
/* loaded from: classes8.dex */
class GsonSerializer implements Serializer {
    private static final String LOG_TAG = "GsonSerializer";
    private final C46153oE1 gson;

    public GsonSerializer(C46153oE1 c46153oE1) {
        this.gson = c46153oE1;
    }

    @Override // zendesk.core.Serializer
    public <E> E deserialize(Object obj, Class<E> cls) {
        if (obj instanceof String) {
            String str = (String) obj;
            if (C44504lS5.m27273b(str)) {
                try {
                    return (E) this.gson.m21555n(str, cls);
                } catch (JsonSyntaxException unused) {
                    C33694Ix2.m101457b(LOG_TAG, "Unable to deserialize String into object of type %s", cls.getSimpleName());
                    return null;
                }
            }
            return null;
        } else if (obj instanceof AbstractC52360yi2) {
            try {
                return (E) this.gson.m21561h((AbstractC52360yi2) obj, cls);
            } catch (JsonSyntaxException e) {
                C33694Ix2.m101457b(LOG_TAG, "Unable to deserialize JsonElement into object of type %s", cls.getSimpleName(), e);
                return null;
            }
        } else {
            C33694Ix2.m101457b(LOG_TAG, "Unable to deserialize the provided object into %s", cls.getSimpleName());
            return null;
        }
    }

    @Override // zendesk.core.Serializer
    public String serialize(Object obj) {
        return this.gson.m21545x(obj);
    }
}
