package p000;

import ch.qos.logback.core.net.SyslogConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.KotlinVersion;
/* renamed from: YA1 */
/* loaded from: classes6.dex */
public class YA1 {

    /* renamed from: a */
    public static final Map<Integer, String> f44739a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(0, "GATT_SUCCESS");
        hashMap.put(1, "GATT_INVALID_HANDLE");
        hashMap.put(2, "GATT_READ_NOT_PERMIT");
        hashMap.put(3, "GATT_WRITE_NOT_PERMIT");
        hashMap.put(4, "GATT_INVALID_PDU");
        hashMap.put(5, "GATT_INSUF_AUTHENTICATION");
        hashMap.put(6, "GATT_REQ_NOT_SUPPORTED");
        hashMap.put(7, "GATT_INVALID_OFFSET");
        hashMap.put(8, "GATT_INSUF_AUTHORIZATION or GATT_CONN_TIMEOUT");
        hashMap.put(9, "GATT_PREPARE_Q_FULL");
        hashMap.put(10, "GATT_NOT_FOUND");
        hashMap.put(11, "GATT_NOT_LONG");
        hashMap.put(12, "GATT_INSUF_KEY_SIZE");
        hashMap.put(13, "GATT_INVALID_ATTR_LEN");
        hashMap.put(14, "GATT_ERR_UNLIKELY");
        hashMap.put(15, "GATT_INSUF_ENCRYPTION");
        hashMap.put(16, "GATT_UNSUPPORT_GRP_TYPE");
        hashMap.put(17, "GATT_INSUF_RESOURCE");
        hashMap.put(19, "GATT_CONN_TERMINATE_PEER_USER");
        hashMap.put(22, "GATT_CONN_TERMINATE_LOCAL_HOST");
        hashMap.put(34, "GATT_CONN_LMP_TIMEOUT");
        hashMap.put(62, "GATT_CONN_FAIL_ESTABLISH");
        hashMap.put(135, "GATT_ILLEGAL_PARAMETER");
        hashMap.put(128, "GATT_NO_RESOURCES");
        hashMap.put(129, "GATT_INTERNAL_ERROR");
        hashMap.put(130, "GATT_WRONG_STATE");
        hashMap.put(131, "GATT_DB_FULL");
        hashMap.put(132, "GATT_BUSY");
        hashMap.put(133, "GATT_ERROR");
        hashMap.put(134, "GATT_CMD_STARTED");
        hashMap.put(Integer.valueOf((int) SyslogConstants.LOG_LOCAL1), "GATT_PENDING");
        hashMap.put(137, "GATT_AUTH_FAIL");
        hashMap.put(138, "GATT_MORE");
        hashMap.put(139, "GATT_INVALID_CFG");
        hashMap.put(140, "GATT_SERVICE_STARTED");
        hashMap.put(141, "GATT_ENCRYPED_NO_MITM");
        hashMap.put(142, "GATT_NOT_ENCRYPTED");
        hashMap.put(143, "GATT_CONGESTED");
        hashMap.put(253, "GATT_CCC_CFG_ERR");
        hashMap.put(254, "GATT_PRC_IN_PROGRESS");
        hashMap.put(Integer.valueOf((int) KotlinVersion.MAX_COMPONENT_VALUE), "GATT_OUT_OF_RANGE");
        hashMap.put(256, "GATT_CONN_CANCEL");
        f44739a = Collections.unmodifiableMap(hashMap);
    }

    private YA1() {
    }

    /* renamed from: a */
    public static String m75477a(int i) {
        String str = f44739a.get(Integer.valueOf(i));
        return str == null ? "UNKNOWN" : str;
    }
}
