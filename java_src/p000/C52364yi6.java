package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.services.p026s3.internal.Constants;
import com.facebook.AccessToken;
import com.facebook.C17216a;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import no.nordicsemi.android.ble.AbstractC26684u0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
@Metadata(m28433d1 = {"\u0000¤\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003R$\u0004B\u000b\b\u0002¢\u0006\u0006\bÄ\u0001\u0010½\u0001J\u001e\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0007J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0007J/\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00022\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f\"\u00028\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0007J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0007J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0002J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0018\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J&\u0010!\u001a\u00020 2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0007J\u0012\u0010#\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010\u0007H\u0007J$\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020\u001e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0007H\u0007J$\u0010)\u001a\u00020&2\u0006\u0010$\u001a\u00020\u001e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010(\u001a\u0004\u0018\u00010 H\u0007J$\u0010+\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u001e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u0007J\u0012\u0010.\u001a\u00020&2\b\u0010-\u001a\u0004\u0018\u00010,H\u0007J\u0012\u00101\u001a\u00020&2\b\u00100\u001a\u0004\u0018\u00010/H\u0007J\u0012\u00104\u001a\u00020\u00072\b\u00103\u001a\u0004\u0018\u000102H\u0007J\u001c\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007072\u0006\u00106\u001a\u000205H\u0007J\u0016\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00070;2\u0006\u0010:\u001a\u000209H\u0007J&\u0010>\u001a\u0004\u0018\u00010\u00012\u0006\u00106\u001a\u0002052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010=\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010A\u001a\u00020\u00072\b\u0010@\u001a\u0004\u0018\u00010?H\u0007J\u001a\u0010E\u001a\u00020D2\b\u0010@\u001a\u0004\u0018\u00010?2\u0006\u0010C\u001a\u00020BH\u0007J\u0018\u0010G\u001a\u00020&2\u0006\u00103\u001a\u0002022\u0006\u0010F\u001a\u00020\u0007H\u0002J\u0010\u0010H\u001a\u00020&2\u0006\u00103\u001a\u000202H\u0007J\"\u0010L\u001a\u00020&2\b\u0010I\u001a\u0004\u0018\u00010\u00072\u000e\u0010G\u001a\n\u0018\u00010Jj\u0004\u0018\u0001`KH\u0007J\u001c\u0010N\u001a\u00020&2\b\u0010I\u001a\u0004\u0018\u00010\u00072\b\u0010M\u001a\u0004\u0018\u00010\u0007H\u0007J&\u0010Q\u001a\u00020&2\b\u0010I\u001a\u0004\u0018\u00010\u00072\b\u0010M\u001a\u0004\u0018\u00010\u00072\b\u0010P\u001a\u0004\u0018\u00010OH\u0007J)\u0010R\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00022\b\u0010R\u001a\u0004\u0018\u00018\u00002\b\u0010$\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\bR\u0010SJ\u001c\u0010V\u001a\u00020\u00072\b\u0010T\u001a\u0004\u0018\u0001052\b\u0010U\u001a\u0004\u0018\u00010\u0007H\u0007J\u001e\u0010X\u001a\u0004\u0018\u0001052\b\u0010T\u001a\u0004\u0018\u0001052\b\u0010W\u001a\u0004\u0018\u00010\u0007H\u0007J\u001e\u0010Y\u001a\u0004\u0018\u0001092\b\u0010T\u001a\u0004\u0018\u0001052\b\u0010W\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010\\\u001a\u00020&2\b\u0010[\u001a\u0004\u0018\u00010ZH\u0007J/\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000;\"\u0004\b\u0000\u0010\u00022\u0012\u0010]\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f\"\u00028\u0000H\u0007¢\u0006\u0004\b$\u0010^J\u0016\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00070;2\u0006\u0010:\u001a\u000209H\u0007J\u0016\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00070`2\u0006\u0010:\u001a\u000209H\u0007J \u0010c\u001a\u00020\u00072\u0016\u0010b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000707H\u0007J\u001c\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007072\u0006\u0010d\u001a\u00020\u0007H\u0007J,\u0010k\u001a\u00020&2\u0006\u0010f\u001a\u0002052\b\u0010h\u001a\u0004\u0018\u00010g2\b\u0010i\u001a\u0004\u0018\u00010\u00072\u0006\u0010j\u001a\u00020\u0005H\u0007J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J\u0018\u0010m\u001a\u00020&2\u0006\u0010f\u001a\u0002052\u0006\u0010l\u001a\u000202H\u0007JE\u0010s\u001a\u0004\u0018\u00010r2\n\u0010o\u001a\u0006\u0012\u0002\b\u00030n2\u0006\u0010p\u001a\u00020\u00072\u001e\u0010q\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010n0\f\"\b\u0012\u0002\b\u0003\u0018\u00010nH\u0007¢\u0006\u0004\bs\u0010tJA\u0010v\u001a\u0004\u0018\u00010r2\u0006\u0010u\u001a\u00020\u00072\u0006\u0010p\u001a\u00020\u00072\u001e\u0010q\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010n0\f\"\b\u0012\u0002\b\u0003\u0018\u00010nH\u0007¢\u0006\u0004\bv\u0010wJ;\u0010{\u001a\u0004\u0018\u00010\u00012\b\u0010x\u001a\u0004\u0018\u00010\u00012\u0006\u0010y\u001a\u00020r2\u0016\u0010z\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b{\u0010|J\u0012\u0010}\u001a\u00020\u00072\b\u00103\u001a\u0004\u0018\u000102H\u0007JC\u0010\u0082\u0001\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010;\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010~2\u000e\u0010\u007f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010;2\u0014\u0010\u0081\u0001\u001a\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0080\u0001H\u0007J\u0015\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00072\b\u0010(\u001a\u0004\u0018\u00010 H\u0007J\u0012\u0010\u0002\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010 H\u0007J\u0013\u0010\u0084\u0001\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010 H\u0007J\u0013\u0010\u0085\u0001\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010 H\u0007J\u0013\u0010\u0088\u0001\u001a\u00030\u0087\u00012\u0007\u0010\u0086\u0001\u001a\u00020 H\u0007J)\u0010P\u001a\u0005\u0018\u00010\u0089\u00012\b\u0010*\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u008a\u0001\u001a\u00030\u0089\u0001H\u0007J-\u0010\u008d\u0001\u001a\u00020&2\b\u0010\u008c\u0001\u001a\u00030\u008b\u00012\u0018\u0010b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u000107H\u0007J%\u0010\u008e\u0001\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u0001072\b\u0010\u008c\u0001\u001a\u00030\u008b\u0001H\u0007J\u0015\u0010\u0091\u0001\u001a\u00020\u00052\n\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008f\u0001H\u0007J\u001c\u0010\u0095\u0001\u001a\u00020&2\u0007\u0010\u0092\u0001\u001a\u00020\u00072\b\u0010\u0094\u0001\u001a\u00030\u0093\u0001H\u0007J\u0013\u0010\u0004\u001a\u0004\u0018\u0001052\u0007\u0010\u0092\u0001\u001a\u00020\u0007H\u0007J\u0013\u0010\u0097\u0001\u001a\u00030\u0096\u00012\u0007\u0010\u0092\u0001\u001a\u00020\u0007H\u0002J\t\u0010\u0098\u0001\u001a\u00020DH\u0002J\u0011\u0010\u0099\u0001\u001a\u00020&2\u0006\u0010l\u001a\u000202H\u0002J\t\u0010\u009a\u0001\u001a\u00020&H\u0002J\u0011\u0010\u009b\u0001\u001a\u00020&2\u0006\u0010l\u001a\u000202H\u0002J\t\u0010\u009c\u0001\u001a\u00020\u0005H\u0002J\t\u0010\u009d\u0001\u001a\u00020&H\u0002J\t\u0010\u009e\u0001\u001a\u00020&H\u0002J\u0013\u0010 \u0001\u001a\u00030\u0087\u00012\u0007\u0010\u0013\u001a\u00030\u009f\u0001H\u0002J\u0013\u0010£\u0001\u001a\u00030¢\u00012\u0007\u0010¡\u0001\u001a\u000205H\u0007J\u0012\u0010¥\u0001\u001a\u00020\u00072\u0007\u0010¤\u0001\u001a\u00020DH\u0007J\u0011\u0010¦\u0001\u001a\u00020\u00052\u0006\u00103\u001a\u000202H\u0007J\u0011\u0010§\u0001\u001a\u00020\u00052\u0006\u00103\u001a\u000202H\u0007J\u0011\u0010¨\u0001\u001a\u00020\u00052\u0006\u00103\u001a\u000202H\u0007J\u0015\u0010«\u0001\u001a\u00020&2\n\u0010ª\u0001\u001a\u0005\u0018\u00010©\u0001H\u0007J\u0011\u0010¬\u0001\u001a\u00020\u00072\u0006\u00103\u001a\u000202H\u0007R\u0017\u0010\u00ad\u0001\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010\u0018R\u0018\u0010®\u0001\u001a\u00030\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010{R\u0018\u0010¯\u0001\u001a\u00030\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010{R\u0018\u0010°\u0001\u001a\u00030\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010{R\u0018\u0010²\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bG\u0010±\u0001R\u0018\u0010³\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bH\u0010±\u0001R\u0018\u0010´\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b.\u0010±\u0001R\u0017\u0010¸\u0001\u001a\u0005\u0018\u00010µ\u00018G¢\u0006\b\u001a\u0006\b¶\u0001\u0010·\u0001R\u0015\u0010º\u0001\u001a\u00030µ\u00018G¢\u0006\b\u001a\u0006\b¹\u0001\u0010·\u0001R\u001e\u0010¾\u0001\u001a\u00020\u00058FX\u0087\u0004¢\u0006\u000f\u0012\u0006\b¼\u0001\u0010½\u0001\u001a\u0005\b~\u0010»\u0001R\u0016\u0010Á\u0001\u001a\u0004\u0018\u0001058G¢\u0006\b\u001a\u0006\b¿\u0001\u0010À\u0001R\u0014\u0010Ã\u0001\u001a\u00020\u00058G¢\u0006\b\u001a\u0006\bÂ\u0001\u0010»\u0001¨\u0006Å\u0001"}, m28432d2 = {"Lyi6;", "", "T", "", "c", "", "S", "", "s", "R", "valueIfNullOrEmpty", "h", "", "ts", "y0", "([Ljava/lang/Object;)Ljava/util/Collection;", "key", "c0", "", "bytes", AbstractC26684u0.f100690q, "v0", "algorithm", "H", "I", "Ljava/security/MessageDigest;", "hash", "G", "authority", "path", "Landroid/os/Bundle;", "parameters", "Landroid/net/Uri;", DateTokenConverter.CONVERTER_KEY, "queryString", "e0", "b", "value", "", "g0", "uri", "h0", "bundle", "f0", "Ljava/io/Closeable;", "closeable", "g", "Ljava/net/URLConnection;", "connection", "n", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "z", "Lorg/json/JSONObject;", "jsonObject", "", "k", "Lorg/json/JSONArray;", "jsonArray", "", "j", "nonJSONPropertyKey", "D", "Ljava/io/InputStream;", "inputStream", "i0", "Ljava/io/OutputStream;", "outputStream", "", "l", "domain", "e", "f", "tag", "Ljava/lang/Exception;", "Lkotlin/Exception;", "X", "msg", "Y", "", "t", "Z", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Z", "response", "propertyName", "r0", "propertyKey", "x0", "w0", "Ljava/io/File;", "directoryOrFile", "m", "array", "([Ljava/lang/Object;)Ljava/util/List;", "V", "", "U", "map", "b0", "str", "W", "params", "Lvp;", "attributionIdentifiers", "anonymousAppDeviceGUID", "limitEventUsage", "s0", "appContext", "t0", "Ljava/lang/Class;", "clazz", "methodName", "parameterTypes", "Ljava/lang/reflect/Method;", "A", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "className", "B", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "receiver", "method", "args", "J", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "q", "K", "target", "Lyi6$b;", "mapper", "a0", "E", "N", "Q", "contentUri", "", "u", "Ljava/util/Date;", "dateBase", "Landroid/os/Parcel;", "parcel", "z0", "j0", "Lcom/facebook/AccessToken;", "token", "O", "accessToken", "Lyi6$a;", "callback", "y", "Lcom/facebook/GraphRequest;", "x", "l0", "n0", "o0", "m0", "o", "k0", "p0", "", "i", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lyi6$c;", "F", "length", "p", "d0", "L", "M", "Ljava/lang/Runnable;", "runnable", "q0", "r", "numCPUCores", "timestampOfLastCheck", "totalExternalStorageGB", "availableExternalStorageGB", "Ljava/lang/String;", "deviceTimezoneAbbreviation", "deviceTimeZoneName", "carrierName", "Ljava/util/Locale;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "()Ljava/util/Locale;", "resourceLocale", "v", "currentLocale", "()Z", "isAutoAppLinkSetup$annotations", "()V", "isAutoAppLinkSetup", "w", "()Lorg/json/JSONObject;", "dataProcessingOptions", "P", "isDataProcessingRestricted", "<init>", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: yi6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52364yi6 {

    /* renamed from: a */
    public static int f120034a;

    /* renamed from: h */
    public static final C52364yi6 f120041h = new C52364yi6();

    /* renamed from: b */
    public static long f120035b = -1;

    /* renamed from: c */
    public static long f120036c = -1;

    /* renamed from: d */
    public static long f120037d = -1;

    /* renamed from: e */
    public static String f120038e = "";

    /* renamed from: f */
    public static String f120039f = "";

    /* renamed from: g */
    public static String f120040g = "NoCarrier";

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¨\u0006\t"}, m28432d2 = {"Lyi6$a;", "", "Lorg/json/JSONObject;", "userInfo", "", C17296a.f69688o, "Lcom/facebook/FacebookException;", "error", "b", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: yi6$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC30682a {
        /* renamed from: a */
        void mo2799a(JSONObject jSONObject);

        /* renamed from: b */
        void mo2798b(FacebookException facebookException);
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0017\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lyi6$b;", "T", "K", "", "item", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: yi6$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC30683b<T, K> {
        K apply(T t);
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B1\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\u0004\u0010\u0007\"\u0004\b\f\u0010\tR(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\u000e\u0010\t¨\u0006\u0012"}, m28432d2 = {"Lyi6$c;", "", "", "", C17296a.f69688o, "Ljava/util/List;", "c", "()Ljava/util/List;", "setGrantedPermissions", "(Ljava/util/List;)V", "grantedPermissions", "b", "setDeclinedPermissions", "declinedPermissions", "setExpiredPermissions", "expiredPermissions", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: yi6$c */
    /* loaded from: classes5.dex */
    public static final class C30684c {

        /* renamed from: a */
        public List<String> f120042a;

        /* renamed from: b */
        public List<String> f120043b;

        /* renamed from: c */
        public List<String> f120044c;

        public C30684c(List<String> grantedPermissions, List<String> declinedPermissions, List<String> expiredPermissions) {
            Intrinsics.checkNotNullParameter(grantedPermissions, "grantedPermissions");
            Intrinsics.checkNotNullParameter(declinedPermissions, "declinedPermissions");
            Intrinsics.checkNotNullParameter(expiredPermissions, "expiredPermissions");
            this.f120042a = grantedPermissions;
            this.f120043b = declinedPermissions;
            this.f120044c = expiredPermissions;
        }

        /* renamed from: a */
        public final List<String> m2797a() {
            return this.f120043b;
        }

        /* renamed from: b */
        public final List<String> m2796b() {
            return this.f120044c;
        }

        /* renamed from: c */
        public final List<String> m2795c() {
            return this.f120042a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LWD1;", "response", "", C17296a.f69688o, "(LWD1;)V"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: yi6$d */
    /* loaded from: classes5.dex */
    public static final class C30685d implements GraphRequest.InterfaceC17205b {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC30682a f120045a;

        /* renamed from: b */
        public final /* synthetic */ String f120046b;

        public C30685d(InterfaceC30682a interfaceC30682a, String str) {
            this.f120045a = interfaceC30682a;
            this.f120046b = str;
        }

        @Override // com.facebook.GraphRequest.InterfaceC17205b
        /* renamed from: a */
        public final void mo2794a(WD1 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            if (response.m78704b() != null) {
                this.f120045a.mo2798b(response.m78704b().m52863e());
                return;
            }
            String str = this.f120046b;
            JSONObject m78702d = response.m78702d();
            if (m78702d != null) {
                C49054t74.m13032b(str, m78702d);
                this.f120045a.mo2799a(response.m78702d());
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "dir", "Ljava/io/File;", "kotlin.jvm.PlatformType", "fileName", "", "accept"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: yi6$e */
    /* loaded from: classes5.dex */
    public static final class C30686e implements FilenameFilter {

        /* renamed from: a */
        public static final C30686e f120047a = new C30686e();

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return Pattern.matches("cpu[0-9]+", str);
        }
    }

    private C52364yi6() {
    }

    @JvmStatic
    /* renamed from: A */
    public static final Method m2877A(Class<?> clazz, String methodName, Class<?>... parameterTypes) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        try {
            return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @JvmStatic
    /* renamed from: B */
    public static final Method m2876B(String className, String methodName, Class<?>... parameterTypes) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        try {
            Class<?> cls = Class.forName(className);
            Intrinsics.checkNotNullExpressionValue(cls, "Class.forName(className)");
            return m2877A(cls, methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @JvmStatic
    /* renamed from: C */
    public static final Locale m2875C() {
        try {
            Context m52741e = C17216a.m52741e();
            Intrinsics.checkNotNullExpressionValue(m52741e, "FacebookSdk.getApplicationContext()");
            Resources resources = m52741e.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "FacebookSdk.getApplicationContext().resources");
            return resources.getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    @JvmStatic
    /* renamed from: D */
    public static final Object m2874D(JSONObject jsonObject, String str, String str2) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Object opt = jsonObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt != null && !(opt instanceof JSONObject) && !(opt instanceof JSONArray)) {
            if (str2 != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt(str2, opt);
                return jSONObject;
            }
            throw new FacebookException("Got an unexpected non-JSON object.");
        }
        return opt;
    }

    @JvmStatic
    /* renamed from: E */
    public static final String m2873E(Uri uri) {
        if (uri != null) {
            return uri.toString();
        }
        return null;
    }

    @JvmStatic
    /* renamed from: F */
    public static final C30684c m2872F(JSONObject result) throws JSONException {
        String optString;
        Intrinsics.checkNotNullParameter(result, "result");
        JSONArray jSONArray = result.getJSONObject("permissions").getJSONArray(MessageExtension.FIELD_DATA);
        ArrayList arrayList = new ArrayList(jSONArray.length());
        ArrayList arrayList2 = new ArrayList(jSONArray.length());
        ArrayList arrayList3 = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            String optString2 = optJSONObject.optString("permission");
            if (optString2 != null && !Intrinsics.areEqual(optString2, "installed") && (optString = optJSONObject.optString("status")) != null) {
                if (Intrinsics.areEqual(optString, "granted")) {
                    arrayList.add(optString2);
                } else if (Intrinsics.areEqual(optString, "declined")) {
                    arrayList2.add(optString2);
                } else if (Intrinsics.areEqual(optString, "expired")) {
                    arrayList3.add(optString2);
                }
            }
        }
        return new C30684c(arrayList, arrayList2, arrayList3);
    }

    @JvmStatic
    /* renamed from: J */
    public static final Object m2868J(Object obj, Method method, Object... args) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            return method.invoke(obj, Arrays.copyOf(args, args.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: K */
    public static final boolean m2867K() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{C17216a.m52740f()}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            intent.setData(Uri.parse(format));
            Context ctx = C17216a.m52741e();
            Intrinsics.checkNotNullExpressionValue(ctx, "ctx");
            PackageManager packageManager = ctx.getPackageManager();
            String packageName = ctx.getPackageName();
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 65536)) {
                if (Intrinsics.areEqual(packageName, resolveInfo.activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @JvmStatic
    /* renamed from: L */
    public static final boolean m2866L(Context context) {
        AutofillManager m20824a;
        boolean isAutofillSupported;
        boolean isEnabled;
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT < 26 || (m20824a = C27010ob.m20824a(context.getSystemService(AutofillManager.class))) == null) {
            return false;
        }
        isAutofillSupported = m20824a.isAutofillSupported();
        if (!isAutofillSupported) {
            return false;
        }
        isEnabled = m20824a.isEnabled();
        if (!isEnabled) {
            return false;
        }
        return true;
    }

    @JvmStatic
    /* renamed from: M */
    public static final boolean m2865M(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        if (str != null) {
            Intrinsics.checkNotNullExpressionValue(str, "Build.DEVICE");
            if (new Regex(".+_cheets|cheets_.+").matches(str)) {
                return true;
            }
        }
        return false;
    }

    @JvmStatic
    /* renamed from: N */
    public static final boolean m2864N(Uri uri) {
        boolean equals;
        if (uri != null) {
            equals = StringsKt__StringsJVMKt.equals("content", uri.getScheme(), true);
            if (equals) {
                return true;
            }
        }
        return false;
    }

    @JvmStatic
    /* renamed from: O */
    public static final boolean m2863O(AccessToken accessToken) {
        return accessToken != null && Intrinsics.areEqual(accessToken, AccessToken.f69314q.m52897e());
    }

    @JvmStatic
    /* renamed from: P */
    public static final boolean m2862P() {
        if (TD0.m84203d(C52364yi6.class)) {
            return false;
        }
        try {
            JSONObject m2807w = m2807w();
            if (m2807w != null) {
                try {
                    JSONArray jSONArray = m2807w.getJSONArray("data_processing_options");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String string = jSONArray.getString(i);
                        Intrinsics.checkNotNullExpressionValue(string, "options.getString(i)");
                        if (string != null) {
                            String lowerCase = string.toLowerCase();
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                            if (Intrinsics.areEqual(lowerCase, "ldu")) {
                                return true;
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                } catch (Exception unused) {
                }
            }
            return false;
        } catch (Throwable th) {
            TD0.m84205b(th, C52364yi6.class);
            return false;
        }
    }

    @JvmStatic
    /* renamed from: Q */
    public static final boolean m2861Q(Uri uri) {
        boolean equals;
        if (uri != null) {
            equals = StringsKt__StringsJVMKt.equals("file", uri.getScheme(), true);
            if (equals) {
                return true;
            }
        }
        return false;
    }

    @JvmStatic
    /* renamed from: R */
    public static final boolean m2860R(String str) {
        if (str != null) {
            return str.length() == 0;
        }
        return true;
    }

    @JvmStatic
    /* renamed from: S */
    public static final <T> boolean m2859S(Collection<? extends T> collection) {
        return collection == null || collection.isEmpty();
    }

    @JvmStatic
    /* renamed from: T */
    public static final boolean m2858T(Uri uri) {
        boolean equals;
        boolean equals2;
        boolean equals3;
        if (uri != null) {
            equals = StringsKt__StringsJVMKt.equals("http", uri.getScheme(), true);
            if (equals) {
                return true;
            }
            equals2 = StringsKt__StringsJVMKt.equals("https", uri.getScheme(), true);
            if (equals2) {
                return true;
            }
            equals3 = StringsKt__StringsJVMKt.equals("fbstaging", uri.getScheme(), true);
            if (equals3) {
                return true;
            }
        }
        return false;
    }

    @JvmStatic
    /* renamed from: U */
    public static final Set<String> m2857U(JSONArray jsonArray) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        HashSet hashSet = new HashSet();
        int length = jsonArray.length();
        for (int i = 0; i < length; i++) {
            String string = jsonArray.getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
            hashSet.add(string);
        }
        return hashSet;
    }

    @JvmStatic
    /* renamed from: V */
    public static final List<String> m2856V(JSONArray jsonArray) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(jsonArray.getString(i));
        }
        return arrayList;
    }

    @JvmStatic
    /* renamed from: W */
    public static final Map<String, String> m2855W(String str) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "str");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                Intrinsics.checkNotNullExpressionValue(key, "key");
                String string = jSONObject.getString(key);
                Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(key)");
                hashMap.put(key, string);
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    @JvmStatic
    /* renamed from: X */
    public static final void m2854X(String str, Exception exc) {
        if (C17216a.m52724v() && str != null && exc != null) {
            Log.d(str, exc.getClass().getSimpleName() + ": " + exc.getMessage());
        }
    }

    @JvmStatic
    /* renamed from: Y */
    public static final void m2853Y(String str, String str2) {
        if (C17216a.m52724v() && str != null && str2 != null) {
            Log.d(str, str2);
        }
    }

    @JvmStatic
    /* renamed from: Z */
    public static final void m2852Z(String str, String str2, Throwable th) {
        if (C17216a.m52724v() && !m2860R(str)) {
            Log.d(str, str2, th);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final <T> boolean m2851a(T t, T t2) {
        return t == null ? t2 == null : Intrinsics.areEqual(t, t2);
    }

    @JvmStatic
    /* renamed from: a0 */
    public static final <T, K> List<K> m2850a0(List<? extends T> list, InterfaceC30683b<T, K> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            K apply = mapper.apply(t);
            if (apply != null) {
                arrayList.add(apply);
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    @JvmStatic
    /* renamed from: b */
    public static final <T> List<T> m2849b(T... array) {
        Intrinsics.checkNotNullParameter(array, "array");
        ArrayList arrayList = new ArrayList();
        for (T t : array) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @JvmStatic
    /* renamed from: b0 */
    public static final String m2848b0(Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        String str = "";
        if (!map.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                str = jSONObject.toString();
            } catch (JSONException unused) {
            }
            Intrinsics.checkNotNullExpressionValue(str, "try {\n        val jsonOb…ion) {\n        \"\"\n      }");
        }
        return str;
    }

    @JvmStatic
    /* renamed from: c */
    public static final JSONObject m2847c(String accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        JSONObject m13033a = C49054t74.m13033a(accessToken);
        if (m13033a != null) {
            return m13033a;
        }
        WD1 m52837j = f120041h.m2805x(accessToken).m52837j();
        if (m52837j.m78704b() != null) {
            return null;
        }
        return m52837j.m78702d();
    }

    @JvmStatic
    /* renamed from: c0 */
    public static final String m2846c0(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return f120041h.m2870H("MD5", key);
    }

    @JvmStatic
    /* renamed from: d */
    public static final Uri m2845d(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        Uri build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
        return build;
    }

    @JvmStatic
    /* renamed from: d0 */
    public static final boolean m2844d0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return m2866L(context);
    }

    @JvmStatic
    /* renamed from: e0 */
    public static final Bundle m2842e0(String str) {
        List split$default;
        List split$default2;
        Bundle bundle = new Bundle();
        if (!m2860R(str)) {
            if (str != null) {
                split$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"&"}, false, 0, 6, (Object) null);
                Object[] array = split$default.toArray(new String[0]);
                if (array != null) {
                    for (String str2 : (String[]) array) {
                        split$default2 = StringsKt__StringsKt.split$default((CharSequence) str2, new String[]{"="}, false, 0, 6, (Object) null);
                        Object[] array2 = split$default2.toArray(new String[0]);
                        if (array2 != null) {
                            String[] strArr = (String[]) array2;
                            try {
                                if (strArr.length == 2) {
                                    bundle.putString(URLDecoder.decode(strArr[0], Constants.DEFAULT_ENCODING), URLDecoder.decode(strArr[1], Constants.DEFAULT_ENCODING));
                                } else if (strArr.length == 1) {
                                    bundle.putString(URLDecoder.decode(strArr[0], Constants.DEFAULT_ENCODING), "");
                                }
                            } catch (UnsupportedEncodingException e) {
                                m2854X("FacebookSDK", e);
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        return bundle;
    }

    @JvmStatic
    /* renamed from: f */
    public static final void m2841f(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C52364yi6 c52364yi6 = f120041h;
        c52364yi6.m2843e(context, "facebook.com");
        c52364yi6.m2843e(context, ".facebook.com");
        c52364yi6.m2843e(context, "https://facebook.com");
        c52364yi6.m2843e(context, "https://.facebook.com");
    }

    @JvmStatic
    /* renamed from: f0 */
    public static final boolean m2840f0(Bundle bundle, String str, Object obj) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (obj == null) {
            bundle.remove(str);
            return true;
        } else if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return true;
        } else if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
            return true;
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Number) obj).doubleValue());
            return true;
        } else if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
            return true;
        } else if (obj instanceof Integer) {
            bundle.putInt(str, ((Number) obj).intValue());
            return true;
        } else if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
            return true;
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Number) obj).longValue());
            return true;
        } else if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
            return true;
        } else if (obj instanceof String) {
            bundle.putString(str, (String) obj);
            return true;
        } else if (obj instanceof JSONArray) {
            bundle.putString(str, obj.toString());
            return true;
        } else if (obj instanceof JSONObject) {
            bundle.putString(str, obj.toString());
            return true;
        } else {
            return false;
        }
    }

    @JvmStatic
    /* renamed from: g */
    public static final void m2839g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @JvmStatic
    /* renamed from: g0 */
    public static final void m2838g0(Bundle b, String str, String str2) {
        Intrinsics.checkNotNullParameter(b, "b");
        if (!m2860R(str2)) {
            b.putString(str, str2);
        }
    }

    @JvmStatic
    /* renamed from: h */
    public static final String m2837h(String str, String str2) {
        return m2860R(str) ? str2 : str;
    }

    @JvmStatic
    /* renamed from: h0 */
    public static final void m2836h0(Bundle b, String str, Uri uri) {
        Intrinsics.checkNotNullParameter(b, "b");
        if (uri != null) {
            m2838g0(b, str, uri.toString());
        }
    }

    @JvmStatic
    /* renamed from: i0 */
    public static final String m2834i0(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        InputStreamReader inputStreamReader;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb = new StringBuilder();
                    char[] cArr = new char[2048];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read != -1) {
                            sb.append(cArr, 0, read);
                        } else {
                            String sb2 = sb.toString();
                            Intrinsics.checkNotNullExpressionValue(sb2, "stringBuilder.toString()");
                            m2839g(bufferedInputStream);
                            m2839g(inputStreamReader);
                            return sb2;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    m2839g(bufferedInputStream);
                    m2839g(inputStreamReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            inputStreamReader = null;
        }
    }

    @JvmStatic
    /* renamed from: j */
    public static final List<String> m2833j(JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        try {
            ArrayList arrayList = new ArrayList();
            int length = jsonArray.length();
            for (int i = 0; i < length; i++) {
                String string = jsonArray.getString(i);
                Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                arrayList.add(string);
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    @JvmStatic
    /* renamed from: j0 */
    public static final Map<String, String> m2832j0(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        return hashMap;
    }

    @JvmStatic
    /* renamed from: k */
    public static final Map<String, String> m2831k(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jsonObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            String optString = jsonObject.optString(key);
            if (optString != null) {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                hashMap.put(key, optString);
            }
        }
        return hashMap;
    }

    @JvmStatic
    /* renamed from: l */
    public static final int m2829l(InputStream inputStream, OutputStream outputStream) throws IOException {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[8192];
                int i = 0;
                while (true) {
                    int read = bufferedInputStream2.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                    i += read;
                }
                bufferedInputStream2.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                return i;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @JvmStatic
    /* renamed from: m */
    public static final void m2827m(File file) {
        File[] listFiles;
        if (file != null && file.exists()) {
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    m2827m(file2);
                }
            }
            file.delete();
        }
    }

    @JvmStatic
    /* renamed from: n */
    public static final void m2825n(URLConnection uRLConnection) {
        if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    @JvmStatic
    /* renamed from: p */
    public static final String m2821p(int i) {
        String bigInteger = new BigInteger(i * 5, new Random()).toString(32);
        Intrinsics.checkNotNullExpressionValue(bigInteger, "BigInteger(length * 5, r).toString(32)");
        return bigInteger;
    }

    @JvmStatic
    /* renamed from: q */
    public static final String m2819q(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        String simpleName = context.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "context.javaClass.simpleName");
        return simpleName;
    }

    @JvmStatic
    /* renamed from: q0 */
    public static final void m2818q0(Runnable runnable) {
        try {
            C17216a.m52731o().execute(runnable);
        } catch (Exception unused) {
        }
    }

    @JvmStatic
    /* renamed from: r */
    public static final String m2817r(Context context) {
        String string;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            String m52739g = C17216a.m52739g();
            if (m52739g != null) {
                return m52739g;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = applicationInfo.labelRes;
            if (i == 0) {
                string = applicationInfo.nonLocalizedLabel.toString();
            } else {
                string = context.getString(i);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(stringId)");
            }
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    @JvmStatic
    /* renamed from: r0 */
    public static final String m2816r0(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return "";
        }
        String optString = jSONObject.optString(str, "");
        Intrinsics.checkNotNullExpressionValue(optString, "response.optString(propertyName, \"\")");
        return optString;
    }

    @JvmStatic
    /* renamed from: s */
    public static final String m2815s() {
        Context m52741e = C17216a.m52741e();
        if (m52741e != null) {
            try {
                PackageInfo packageInfo = m52741e.getPackageManager().getPackageInfo(m52741e.getPackageName(), 0);
                if (packageInfo != null) {
                    return packageInfo.versionName;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return null;
    }

    @JvmStatic
    /* renamed from: s0 */
    public static final void m2814s0(JSONObject params, C29645vp c29645vp, String str, boolean z) throws JSONException {
        Intrinsics.checkNotNullParameter(params, "params");
        params.put("anon_id", str);
        boolean z2 = true;
        params.put("application_tracking_enabled", !z);
        params.put("advertiser_id_collection_enabled", C17216a.m52742d());
        if (c29645vp != null) {
            if (c29645vp.m7992l() != null) {
                params.put("attribution", c29645vp.m7992l());
            }
            if (c29645vp.m7994j() != null) {
                params.put("advertiser_id", c29645vp.m7994j());
                params.put("advertiser_tracking_enabled", !c29645vp.m7990n());
            }
            if (!c29645vp.m7990n()) {
                String userData = C36353Ug6.m81188d();
                Intrinsics.checkNotNullExpressionValue(userData, "userData");
                if (userData.length() != 0) {
                    z2 = false;
                }
                if (!z2) {
                    params.put("ud", userData);
                }
            }
            if (c29645vp.m7993k() != null) {
                params.put("installer_package", c29645vp.m7993k());
            }
        }
    }

    @JvmStatic
    /* renamed from: t */
    public static final Date m2813t(Bundle bundle, String str, Date dateBase) {
        long parseLong;
        Intrinsics.checkNotNullParameter(dateBase, "dateBase");
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            parseLong = ((Number) obj).longValue();
        } else {
            if (obj instanceof String) {
                try {
                    parseLong = Long.parseLong((String) obj);
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        if (parseLong == 0) {
            return new Date((long) LongCompanionObject.MAX_VALUE);
        }
        return new Date(dateBase.getTime() + (parseLong * 1000));
    }

    @JvmStatic
    /* renamed from: t0 */
    public static final void m2812t0(JSONObject params, Context appContext) throws JSONException {
        String str;
        Locale locale;
        int i;
        double d;
        Object systemService;
        PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        f120041h.m2824n0(appContext);
        String packageName = appContext.getPackageName();
        int i2 = 0;
        int i3 = -1;
        try {
            packageInfo = appContext.getPackageManager().getPackageInfo(packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            str = "";
        }
        if (packageInfo != null) {
            i3 = packageInfo.versionCode;
            str = packageInfo.versionName;
            jSONArray.put(packageName);
            jSONArray.put(i3);
            jSONArray.put(str);
            jSONArray.put(Build.VERSION.RELEASE);
            jSONArray.put(Build.MODEL);
            try {
                Resources resources = appContext.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "appContext.resources");
                locale = resources.getConfiguration().locale;
            } catch (Exception unused2) {
                locale = Locale.getDefault();
            }
            StringBuilder sb = new StringBuilder();
            Intrinsics.checkNotNullExpressionValue(locale, "locale");
            sb.append(locale.getLanguage());
            sb.append("_");
            sb.append(locale.getCountry());
            jSONArray.put(sb.toString());
            jSONArray.put(f120038e);
            jSONArray.put(f120040g);
            try {
                systemService = appContext.getSystemService("window");
            } catch (Exception unused3) {
                i = 0;
            }
            if (systemService != null) {
                Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                int i4 = displayMetrics.widthPixels;
                try {
                    i2 = displayMetrics.heightPixels;
                    d = displayMetrics.density;
                } catch (Exception unused4) {
                    int i5 = i2;
                    i2 = i4;
                    i = i5;
                    d = 0.0d;
                    int i6 = i2;
                    i2 = i;
                    i4 = i6;
                    jSONArray.put(i4);
                    jSONArray.put(i2);
                    jSONArray.put(new DecimalFormat("#.##").format(d));
                    jSONArray.put(f120041h.m2828l0());
                    jSONArray.put(f120036c);
                    jSONArray.put(f120037d);
                    jSONArray.put(f120039f);
                    params.put("extinfo", jSONArray.toString());
                    return;
                }
                jSONArray.put(i4);
                jSONArray.put(i2);
                jSONArray.put(new DecimalFormat("#.##").format(d));
                jSONArray.put(f120041h.m2828l0());
                jSONArray.put(f120036c);
                jSONArray.put(f120037d);
                jSONArray.put(f120039f);
                params.put("extinfo", jSONArray.toString());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
    }

    @JvmStatic
    /* renamed from: u */
    public static final long m2811u(Uri contentUri) {
        Intrinsics.checkNotNullParameter(contentUri, "contentUri");
        Cursor cursor = null;
        try {
            Context m52741e = C17216a.m52741e();
            Intrinsics.checkNotNullExpressionValue(m52741e, "FacebookSdk.getApplicationContext()");
            cursor = m52741e.getContentResolver().query(contentUri, null, null, null, null);
            if (cursor == null) {
                return 0L;
            }
            int columnIndex = cursor.getColumnIndex("_size");
            cursor.moveToFirst();
            long j = cursor.getLong(columnIndex);
            cursor.close();
            return j;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @JvmStatic
    /* renamed from: u0 */
    public static final String m2810u0(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return f120041h.m2869I("SHA-1", bytes);
    }

    @JvmStatic
    /* renamed from: v */
    public static final Locale m2809v() {
        Locale m2875C = m2875C();
        if (m2875C == null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.getDefault()");
            return locale;
        }
        return m2875C;
    }

    @JvmStatic
    /* renamed from: v0 */
    public static final String m2808v0(String str) {
        if (str == null) {
            return null;
        }
        return f120041h.m2870H("SHA-256", str);
    }

    @JvmStatic
    /* renamed from: w */
    public static final JSONObject m2807w() {
        if (TD0.m84203d(C52364yi6.class)) {
            return null;
        }
        try {
            String string = C17216a.m52741e().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            TD0.m84205b(th, C52364yi6.class);
            return null;
        }
    }

    @JvmStatic
    /* renamed from: w0 */
    public static final JSONArray m2806w0(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONArray(str);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: x0 */
    public static final JSONObject m2804x0(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: y */
    public static final void m2803y(String accessToken, InterfaceC30682a callback) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(callback, "callback");
        JSONObject m13033a = C49054t74.m13033a(accessToken);
        if (m13033a != null) {
            callback.mo2799a(m13033a);
            return;
        }
        C30685d c30685d = new C30685d(callback, accessToken);
        GraphRequest m2805x = f120041h.m2805x(accessToken);
        m2805x.m52821z(c30685d);
        m2805x.m52836k();
    }

    @JvmStatic
    /* renamed from: y0 */
    public static final <T> Collection<T> m2802y0(T... ts) {
        Intrinsics.checkNotNullParameter(ts, "ts");
        Collection<T> unmodifiableCollection = Collections.unmodifiableCollection(Arrays.asList(Arrays.copyOf(ts, ts.length)));
        Intrinsics.checkNotNullExpressionValue(unmodifiableCollection, "Collections.unmodifiable…ction(Arrays.asList(*ts))");
        return unmodifiableCollection;
    }

    @JvmStatic
    /* renamed from: z */
    public static final String m2801z(Context context) {
        C48817sj6.m13765m(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        String m52740f = C17216a.m52740f();
        Intrinsics.checkNotNullExpressionValue(m52740f, "FacebookSdk.getApplicationId()");
        return m52740f;
    }

    @JvmStatic
    /* renamed from: z0 */
    public static final void m2800z0(Parcel parcel, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    /* renamed from: G */
    public final String m2871G(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(Integer.toHexString((b >> 4) & 15));
            sb.append(Integer.toHexString((b >> 0) & 15));
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "builder.toString()");
        return sb2;
    }

    /* renamed from: H */
    public final String m2870H(String str, String str2) {
        Charset charset = Charsets.UTF_8;
        if (str2 != null) {
            byte[] bytes = str2.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            return m2869I(str, bytes);
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: I */
    public final String m2869I(String str, byte[] bArr) {
        try {
            MessageDigest hash = MessageDigest.getInstance(str);
            Intrinsics.checkNotNullExpressionValue(hash, "hash");
            return m2871G(hash, bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public final void m2843e(Context context, String str) {
        List split$default;
        List split$default2;
        int i;
        boolean z;
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie != null) {
            split$default = StringsKt__StringsKt.split$default((CharSequence) cookie, new String[]{";"}, false, 0, 6, (Object) null);
            Object[] array = split$default.toArray(new String[0]);
            if (array != null) {
                for (String str2 : (String[]) array) {
                    split$default2 = StringsKt__StringsKt.split$default((CharSequence) str2, new String[]{"="}, false, 0, 6, (Object) null);
                    Object[] array2 = split$default2.toArray(new String[0]);
                    if (array2 != null) {
                        String[] strArr = (String[]) array2;
                        if (strArr.length > 0) {
                            StringBuilder sb = new StringBuilder();
                            String str3 = strArr[0];
                            int length = str3.length() - 1;
                            int i2 = 0;
                            boolean z2 = false;
                            while (i2 <= length) {
                                if (!z2) {
                                    i = i2;
                                } else {
                                    i = length;
                                }
                                if (Intrinsics.compare((int) str3.charAt(i), 32) <= 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (!z2) {
                                    if (!z) {
                                        z2 = true;
                                    } else {
                                        i2++;
                                    }
                                } else if (!z) {
                                    break;
                                } else {
                                    length--;
                                }
                            }
                            sb.append(str3.subSequence(i2, length + 1).toString());
                            sb.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                            cookieManager.setCookie(str, sb.toString());
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                cookieManager.removeExpiredCookie();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    /* renamed from: i */
    public final long m2835i(double d) {
        return Math.round(d / 1.073741824E9d);
    }

    /* renamed from: k0 */
    public final void m2830k0() {
        try {
            if (m2823o()) {
                File path = Environment.getExternalStorageDirectory();
                Intrinsics.checkNotNullExpressionValue(path, "path");
                StatFs statFs = new StatFs(path.getPath());
                f120037d = statFs.getAvailableBlocks() * statFs.getBlockSize();
            }
            f120037d = m2835i(f120037d);
        } catch (Exception unused) {
        }
    }

    /* renamed from: l0 */
    public final int m2828l0() {
        int i = f120034a;
        if (i > 0) {
            return i;
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(C30686e.f120047a);
            if (listFiles != null) {
                f120034a = listFiles.length;
            }
        } catch (Exception unused) {
        }
        if (f120034a <= 0) {
            f120034a = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return f120034a;
    }

    /* renamed from: m0 */
    public final void m2826m0(Context context) {
        if (Intrinsics.areEqual(f120040g, "NoCarrier")) {
            try {
                Object systemService = context.getSystemService(PaymentMethod.BillingDetails.PARAM_PHONE);
                if (systemService != null) {
                    String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                    Intrinsics.checkNotNullExpressionValue(networkOperatorName, "telephonyManager.networkOperatorName");
                    f120040g = networkOperatorName;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: n0 */
    public final void m2824n0(Context context) {
        if (f120035b == -1 || System.currentTimeMillis() - f120035b >= 1800000) {
            f120035b = System.currentTimeMillis();
            m2822o0();
            m2826m0(context);
            m2820p0();
            m2830k0();
        }
    }

    /* renamed from: o */
    public final boolean m2823o() {
        return Intrinsics.areEqual("mounted", Environment.getExternalStorageState());
    }

    /* renamed from: o0 */
    public final void m2822o0() {
        try {
            TimeZone tz = TimeZone.getDefault();
            String displayName = tz.getDisplayName(tz.inDaylightTime(new Date()), 0);
            Intrinsics.checkNotNullExpressionValue(displayName, "tz.getDisplayName(tz.inD…(Date()), TimeZone.SHORT)");
            f120038e = displayName;
            Intrinsics.checkNotNullExpressionValue(tz, "tz");
            String id = tz.getID();
            Intrinsics.checkNotNullExpressionValue(id, "tz.id");
            f120039f = id;
        } catch (AssertionError | Exception unused) {
        }
    }

    /* renamed from: p0 */
    public final void m2820p0() {
        try {
            if (m2823o()) {
                File path = Environment.getExternalStorageDirectory();
                Intrinsics.checkNotNullExpressionValue(path, "path");
                StatFs statFs = new StatFs(path.getPath());
                f120036c = statFs.getBlockCount() * statFs.getBlockSize();
            }
            f120036c = m2835i(f120036c);
        } catch (Exception unused) {
        }
    }

    /* renamed from: x */
    public final GraphRequest m2805x(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,name,first_name,middle_name,last_name");
        bundle.putString("access_token", str);
        return new GraphRequest(null, "me", bundle, FN1.GET, null, null, 32, null);
    }
}
