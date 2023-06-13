package p000;

import co.bird.android.model.constant.NokelockResponseType;
import co.bird.android.model.wire.WireNokelockInsertedData;
import co.bird.android.model.wire.WireNokelockLockingData;
import co.bird.android.model.wire.WireNokelockResponseData;
import co.bird.android.model.wire.WireNokelockStateData;
import co.bird.android.model.wire.WireNokelockTokenResponseData;
import co.bird.android.model.wire.WireNokelockUnknownData;
import co.bird.android.model.wire.WireNokelockUnlockData;
import co.bird.api.response.NokelockResponse;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R8\u0010\u000e\u001a&\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\bj\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"LV83;", "Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;", "Lco/bird/api/response/NokelockResponse;", "Lcom/fasterxml/jackson/core/JsonParser;", "p", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "ctxt", C17296a.f69688o, "Ljava/util/HashMap;", "Lco/bird/android/model/constant/NokelockResponseType;", "Lcom/fasterxml/jackson/databind/JsonDeserializer;", "Lkotlin/collections/HashMap;", "b", "Ljava/util/HashMap;", "deserializerCache", "<init>", "()V", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNokelockMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NokelockMapper.kt\nco/bird/api/json/NokelockDeserializer\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,71:1\n361#2,7:72\n*S KotlinDebug\n*F\n+ 1 NokelockMapper.kt\nco/bird/api/json/NokelockDeserializer\n*L\n49#1:72,7\n*E\n"})
/* renamed from: V83 */
/* loaded from: classes4.dex */
public final class V83 extends StdDeserializer<NokelockResponse> {

    /* renamed from: b */
    public final HashMap<NokelockResponseType, JsonDeserializer<?>> f38673b;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: V83$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C8563a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NokelockResponseType.values().length];
            try {
                iArr[NokelockResponseType.TOKEN_RESPONSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NokelockResponseType.UNLOCK_RESPONSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NokelockResponseType.LOCKING_RESPONSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NokelockResponseType.STATE_RESPONSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NokelockResponseType.INSERTED_NOTIFICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public V83() {
        super(NokelockResponse.class);
        this.f38673b = new HashMap<>();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: a */
    public NokelockResponse deserialize(JsonParser p, DeserializationContext ctxt) {
        int i;
        Class cls;
        JsonParser traverse;
        ResolvableDeserializer resolvableDeserializer;
        Intrinsics.checkNotNullParameter(p, "p");
        Intrinsics.checkNotNullParameter(ctxt, "ctxt");
        JsonNode jsonNode = (JsonNode) p.getCodec().readTree(p);
        NokelockResponseType type = (NokelockResponseType) jsonNode.get("type").traverse(p.getCodec()).readValueAs(NokelockResponseType.class);
        if (type == null) {
            i = -1;
        } else {
            i = C8563a.$EnumSwitchMapping$0[type.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            cls = WireNokelockUnknownData.class;
                        } else {
                            cls = WireNokelockInsertedData.class;
                        }
                    } else {
                        cls = WireNokelockStateData.class;
                    }
                } else {
                    cls = WireNokelockLockingData.class;
                }
            } else {
                cls = WireNokelockUnlockData.class;
            }
        } else {
            cls = WireNokelockTokenResponseData.class;
        }
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(cls);
        if (type == NokelockResponseType.TOKEN_RESPONSE) {
            traverse = jsonNode.get(MessageExtension.FIELD_DATA).get("requests").traverse(p.getCodec());
        } else {
            traverse = jsonNode.get(MessageExtension.FIELD_DATA).traverse(p.getCodec());
        }
        HashMap<NokelockResponseType, JsonDeserializer<?>> hashMap = this.f38673b;
        Intrinsics.checkNotNullExpressionValue(type, "type");
        JsonDeserializer<Object> jsonDeserializer = hashMap.get(type);
        if (jsonDeserializer == null) {
            DeserializationConfig config = ctxt.getConfig();
            JavaType constructType = ctxt.constructType(JvmClassMappingKt.getJavaClass(orCreateKotlinClass));
            ctxt.getConfig().initialize(traverse);
            jsonDeserializer = BeanDeserializerFactory.instance.buildBeanDeserializer(ctxt, constructType, config.introspect(constructType));
            if (jsonDeserializer instanceof ResolvableDeserializer) {
                resolvableDeserializer = (ResolvableDeserializer) jsonDeserializer;
            } else {
                resolvableDeserializer = null;
            }
            if (resolvableDeserializer != null) {
                resolvableDeserializer.resolve(ctxt);
            }
            Intrinsics.checkNotNullExpressionValue(jsonDeserializer, "instance.buildBeanDeseri…r)?.resolve(ctxt)\n      }");
            hashMap.put(type, jsonDeserializer);
        }
        traverse.nextToken();
        Object deserialize = jsonDeserializer.deserialize(traverse, ctxt);
        WireNokelockResponseData wireNokelockResponseData = (WireNokelockResponseData) orCreateKotlinClass.getObjectInstance();
        if (wireNokelockResponseData == null) {
            Intrinsics.checkNotNull(deserialize, "null cannot be cast to non-null type co.bird.android.model.wire.WireNokelockResponseData");
            wireNokelockResponseData = (WireNokelockResponseData) deserialize;
        }
        return new NokelockResponse(type, wireNokelockResponseData);
    }
}
