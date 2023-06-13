package p000;

import android.app.DownloadManager;
import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.telephony.TelephonyManager;
import androidx.core.app.NotificationManagerCompat;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.manager.SmartlockManagerImpl;
import co.bird.android.manager.analytics.AnalyticsManagerImpl;
import co.bird.android.manager.analytics.persistence.AnalyticsDatabase;
import co.bird.android.manager.vtbeacon.C16232a;
import co.bird.android.model.DynamicLinkConfiguration;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferUtility;
import com.facebook.share.internal.C17296a;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.stripe.android.Stripe;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import dagger.Reusable;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import no.nordicsemi.android.ble.AbstractC26684u0;
@Metadata(m28433d1 = {"\u0000æ\t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0006\b¹\u0003\u0010º\u0003J\b\u0010\u0003\u001a\u00020\u0002H\u0007J0\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007J8\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0007J`\u0010'\u001a\u00020&2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010%\u001a\u00020\nH\u0007J0\u0010+\u001a\u00020*2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#2\u0006\u0010\t\u001a\u00020\bH\u0007J@\u00104\u001a\u0002032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\b2\u0006\u00100\u001a\u00020/2\u0006\u0010$\u001a\u00020#2\u0006\u00101\u001a\u00020&2\u0006\u00102\u001a\u00020\u000eH\u0007J\u0010\u00105\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007JH\u0010?\u001a\u00020>2\u0006\u0010$\u001a\u00020#2\u0006\u0010\r\u001a\u00020\f2\u0006\u00107\u001a\u0002062\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010=\u001a\u00020<H\u0007J\u0010\u0010C\u001a\u00020B2\u0006\u0010A\u001a\u00020@H\u0007Jp\u0010Z\u001a\u00020Y2\u0006\u0010D\u001a\u00020>2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020I2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020M2\u0006\u0010P\u001a\u00020O2\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020S2\u0006\u0010V\u001a\u00020U2\u0006\u0010X\u001a\u00020WH\u0007J\u0010\u0010\\\u001a\u00020[2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J8\u0010b\u001a\u00020a2\u0006\u0010^\u001a\u00020]2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u00101\u001a\u00020&2\u0006\u0010`\u001a\u00020_H\u0007JX\u0010g\u001a\u00020f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010$\u001a\u00020#2\u0006\u0010d\u001a\u00020c2\u0006\u0010^\u001a\u00020]2\u0006\u0010e\u001a\u00020a2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010`\u001a\u00020_2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u00101\u001a\u00020&H\u0007JH\u0010l\u001a\u00020k2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010^\u001a\u00020h2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010d\u001a\u00020c2\u0006\u0010j\u001a\u00020i2\u0006\u00101\u001a\u00020&2\u0006\u0010$\u001a\u00020#H\u0007JP\u0010p\u001a\u00020o2\u0006\u0010$\u001a\u00020#2\u0006\u0010^\u001a\u00020]2\u0006\u0010m\u001a\u00020[2\u0006\u0010n\u001a\u00020f2\u0006\u00101\u001a\u00020&2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010`\u001a\u00020_H\u0007J8\u0010v\u001a\u00020u2\u0006\u0010^\u001a\u00020]2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010r\u001a\u00020q2\u0006\u0010s\u001a\u00020f2\u0006\u0010t\u001a\u00020k2\u0006\u0010$\u001a\u00020#H\u0007Jî\u0001\u0010\u009d\u0001\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010x\u001a\u00020w2\u0006\u0010z\u001a\u00020y2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010|\u001a\u00020{2\u0006\u0010~\u001a\u00020}2\t\b\u0001\u0010\u0080\u0001\u001a\u00020\u007f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0082\u0001\u001a\u00030\u0081\u00012\b\u0010\u0084\u0001\u001a\u00030\u0083\u00012\b\u0010\u0086\u0001\u001a\u00030\u0085\u00012\b\u0010\u0088\u0001\u001a\u00030\u0087\u00012\b\u0010\u008a\u0001\u001a\u00030\u0089\u00012\b\u0010\u008c\u0001\u001a\u00030\u008b\u00012\b\u0010\u008e\u0001\u001a\u00030\u008d\u00012\b\u0010\u0090\u0001\u001a\u00030\u008f\u00012\b\u0010\u0092\u0001\u001a\u00030\u0091\u00012\u0006\u0010$\u001a\u00020#2\b\u0010\u0094\u0001\u001a\u00030\u0093\u00012\b\u0010\u0096\u0001\u001a\u00030\u0095\u00012\b\u0010\u0098\u0001\u001a\u00030\u0097\u00012\u000f\u0010\u009b\u0001\u001a\n\u0012\u0005\u0012\u00030\u009a\u00010\u0099\u00012\u0007\u0010\u009c\u0001\u001a\u00020OH\u0007J\n\u0010\u009f\u0001\u001a\u00030\u009e\u0001H\u0007J?\u0010¦\u0001\u001a\u00030¥\u00012\b\u0010¡\u0001\u001a\u00030 \u00012\u0007\u0010¢\u0001\u001a\u00020E2\b\u0010¤\u0001\u001a\u00030£\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010$\u001a\u00020#H\u0007JA\u0010¬\u0001\u001a\u00030«\u00012\u0006\u0010\r\u001a\u00020\f2\u0007\u0010¢\u0001\u001a\u00020E2\b\u0010¤\u0001\u001a\u00030£\u00012\b\u0010¨\u0001\u001a\u00030§\u00012\b\u0010ª\u0001\u001a\u00030©\u00012\u0006\u0010\u001c\u001a\u00020\u0016H\u0007J\n\u0010®\u0001\u001a\u00030\u00ad\u0001H\u0007JG\u0010µ\u0001\u001a\u00030´\u00012\u0007\u0010¯\u0001\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010|\u001a\u00020{2\b\u0010±\u0001\u001a\u00030°\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010³\u0001\u001a\u00030²\u0001H\u0007JJ\u0010¾\u0001\u001a\u00030½\u00012\u0006\u0010\r\u001a\u00020\f2\b\u0010·\u0001\u001a\u00030¶\u00012\b\u0010¹\u0001\u001a\u00030¸\u00012\b\u0010º\u0001\u001a\u00030\u00ad\u00012\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010¼\u0001\u001a\u00030»\u00012\u0006\u0010\t\u001a\u00020\bH\u0007J2\u0010Â\u0001\u001a\u00030Á\u00012\b\u0010¿\u0001\u001a\u00030´\u00012\b\u0010À\u0001\u001a\u00030¸\u00012\b\u0010º\u0001\u001a\u00030\u00ad\u00012\b\u0010¼\u0001\u001a\u00030»\u0001H\u0007J-\u0010Å\u0001\u001a\u00030Ä\u00012\u0006\u0010R\u001a\u00020Q2\b\u0010·\u0001\u001a\u00030¶\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0007\u0010Ã\u0001\u001a\u00020YH\u0007J\u001c\u0010Æ\u0001\u001a\u00030¸\u00012\u0006\u0010\r\u001a\u00020\f2\b\u0010º\u0001\u001a\u00030\u00ad\u0001H\u0007J\u0013\u0010É\u0001\u001a\u00020\u001d2\b\u0010È\u0001\u001a\u00030Ç\u0001H\u0007J\"\u0010Ê\u0001\u001a\u00030\u0093\u00012\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010%\u001a\u00020\nH\u0007J\u0012\u0010Ë\u0001\u001a\u00030\u0095\u00012\u0006\u0010\t\u001a\u00020\bH\u0007Jd\u0010Ó\u0001\u001a\u00030Ò\u00012\u0006\u0010\r\u001a\u00020\f2\u0006\u0010|\u001a\u00020{2\b\u0010Í\u0001\u001a\u00030Ì\u00012\b\u0010¿\u0001\u001a\u00030´\u00012\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010Ï\u0001\u001a\u00030Î\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010Ñ\u0001\u001a\u00030Ð\u00012\b\u0010³\u0001\u001a\u00030²\u0001H\u0007J\u0014\u0010×\u0001\u001a\u00030Ö\u00012\b\u0010Õ\u0001\u001a\u00030Ô\u0001H\u0007J(\u0010Ý\u0001\u001a\u00030Ü\u00012\b\u0010Ù\u0001\u001a\u00030Ø\u00012\b\u0010Û\u0001\u001a\u00030Ú\u00012\b\u0010¤\u0001\u001a\u00030£\u0001H\u0007J;\u0010à\u0001\u001a\u00020i2\u0006\u00101\u001a\u00020&2\b\u0010ß\u0001\u001a\u00030Þ\u00012\u0006\u0010)\u001a\u00020(2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0007J)\u0010á\u0001\u001a\u00020O2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\nH\u0007J\u0014\u0010å\u0001\u001a\u00030ä\u00012\b\u0010ã\u0001\u001a\u00030â\u0001H\u0007J\n\u0010ç\u0001\u001a\u00030æ\u0001H\u0007J\u0014\u0010ê\u0001\u001a\u00030é\u00012\b\u0010è\u0001\u001a\u00030©\u0001H\u0007J\u001d\u0010í\u0001\u001a\u00030ì\u00012\u0007\u0010x\u001a\u00030ë\u00012\b\u0010Û\u0001\u001a\u00030Ú\u0001H\u0007J2\u0010÷\u0001\u001a\u00030ö\u00012\b\u0010ï\u0001\u001a\u00030î\u00012\b\u0010ñ\u0001\u001a\u00030ð\u00012\b\u0010ó\u0001\u001a\u00030ò\u00012\b\u0010õ\u0001\u001a\u00030ô\u0001H\u0007J\u0014\u0010ú\u0001\u001a\u00030ù\u00012\b\u0010ø\u0001\u001a\u00030ö\u0001H\u0007J\u001d\u0010ý\u0001\u001a\u00030\u0083\u00012\u0007\u0010x\u001a\u00030û\u00012\b\u0010ü\u0001\u001a\u00030ù\u0001H\u0007J#\u0010\u0080\u0002\u001a\u00030ÿ\u00012\u0007\u0010x\u001a\u00030þ\u00012\u0006\u00101\u001a\u00020&2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007JA\u0010\u0087\u0002\u001a\u00030\u0086\u00022\u0007\u0010x\u001a\u00030\u0081\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010Ï\u0001\u001a\u00030Î\u00012\b\u0010\u0083\u0002\u001a\u00030\u0082\u00022\b\u0010\u0085\u0002\u001a\u00030\u0084\u00022\u0006\u0010$\u001a\u00020#H\u0007J\"\u0010\u0089\u0002\u001a\u00030\u0088\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#2\u0006\u0010\t\u001a\u00020\bH\u0007J\u0013\u0010\u008c\u0002\u001a\u00030\u008b\u00022\u0007\u0010x\u001a\u00030\u008a\u0002H\u0007J\u0013\u0010\u008f\u0002\u001a\u00030\u008e\u00022\u0007\u0010A\u001a\u00030\u008d\u0002H\u0007J\u0013\u0010\u0092\u0002\u001a\u00030\u0091\u00022\u0007\u0010A\u001a\u00030\u0090\u0002H\u0007J\u0013\u0010\u0095\u0002\u001a\u00030\u0094\u00022\u0007\u0010A\u001a\u00030\u0093\u0002H\u0007J#\u0010\u0098\u0002\u001a\u00030\u0097\u00022\u0007\u0010x\u001a\u00030\u0096\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H\u0007J\n\u0010\u009a\u0002\u001a\u00030\u0099\u0002H\u0007J\u0012\u0010\u009c\u0002\u001a\u00030\u009b\u00022\u0006\u0010|\u001a\u00020{H\u0007J\u001e\u0010¡\u0002\u001a\u00030 \u00022\b\u0010\u009e\u0002\u001a\u00030\u009d\u00022\b\u0010\u009f\u0002\u001a\u00030\u009b\u0002H\u0007J<\u0010£\u0002\u001a\u00030¢\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010x\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0084\u0001\u001a\u00030\u0083\u00012\u0006\u0010P\u001a\u00020OH\u0007J%\u0010¦\u0002\u001a\u00030¥\u00022\u0007\u0010Ã\u0001\u001a\u00020Y2\b\u0010¤\u0002\u001a\u00030Á\u00012\u0006\u0010|\u001a\u00020{H\u0007J\u0014\u0010ª\u0002\u001a\u00030©\u00022\b\u0010¨\u0002\u001a\u00030§\u0002H\u0007J$\u0010®\u0002\u001a\u00030\u00ad\u00022\b\u0010¬\u0002\u001a\u00030«\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0007J\u0012\u0010¯\u0002\u001a\u00030¶\u00012\u0006\u0010F\u001a\u00020EH\u0007J\u0014\u0010³\u0002\u001a\u00030²\u00022\b\u0010±\u0002\u001a\u00030°\u0002H\u0007J\u0014\u0010·\u0002\u001a\u00030¶\u00022\b\u0010µ\u0002\u001a\u00030´\u0002H\u0007J\u0014\u0010»\u0002\u001a\u00030º\u00022\b\u0010¹\u0002\u001a\u00030¸\u0002H\u0007J\u001e\u0010Á\u0002\u001a\u00030À\u00022\b\u0010½\u0002\u001a\u00030¼\u00022\b\u0010¿\u0002\u001a\u00030¾\u0002H\u0007J\u001c\u0010Å\u0002\u001a\u00030Ä\u00022\b\u0010Ã\u0002\u001a\u00030Â\u00022\u0006\u00101\u001a\u00020&H\u0007J\u0012\u0010Ç\u0002\u001a\u00030Æ\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J6\u0010Ê\u0002\u001a\u00030É\u00022\b\u0010È\u0002\u001a\u00030\u0097\u00022\u0006\u0010D\u001a\u00020>2\u0006\u0010\t\u001a\u00020\b2\b\u0010Ï\u0001\u001a\u00030Î\u00012\u0006\u0010$\u001a\u00020#H\u0007J\u0012\u0010Ì\u0002\u001a\u00030Ë\u00022\u0006\u0010\r\u001a\u00020\fH\u0007J\u0012\u0010Í\u0002\u001a\u00030\u0085\u00012\u0006\u0010\r\u001a\u00020\fH\u0007J\u0012\u0010Î\u0002\u001a\u00030\u0089\u00012\u0006\u0010\r\u001a\u00020\fH\u0007J\u0012\u0010Ï\u0002\u001a\u00030\u008b\u00012\u0006\u0010\r\u001a\u00020\fH\u0007J\u0012\u0010Ð\u0002\u001a\u00030\u008d\u00012\u0006\u0010\r\u001a\u00020\fH\u0007J\u0012\u0010Ñ\u0002\u001a\u00030ò\u00012\u0006\u0010\r\u001a\u00020\fH\u0007J\u0012\u0010Ó\u0002\u001a\u00030Ò\u00022\u0006\u0010\r\u001a\u00020\fH\u0007J\u0014\u0010×\u0002\u001a\u00030Ö\u00022\b\u0010Õ\u0002\u001a\u00030Ô\u0002H\u0007J\u0014\u0010Û\u0002\u001a\u00030Ú\u00022\b\u0010Ù\u0002\u001a\u00030Ø\u0002H\u0007J<\u0010å\u0002\u001a\u00030ä\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010Ý\u0002\u001a\u00030Ü\u00022\b\u0010ß\u0002\u001a\u00030Þ\u00022\b\u0010á\u0002\u001a\u00030à\u00022\n\b\u0001\u0010ã\u0002\u001a\u00030â\u0002H\u0007J\u0014\u0010é\u0002\u001a\u00030è\u00022\b\u0010ç\u0002\u001a\u00030æ\u0002H\u0007J\u0012\u0010ê\u0002\u001a\u00030\u0082\u00022\u0006\u0010$\u001a\u00020#H\u0007J\u0012\u0010ì\u0002\u001a\u00030ë\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0014\u0010ð\u0002\u001a\u00030ï\u00022\b\u0010î\u0002\u001a\u00030í\u0002H\u0007J9\u0010ù\u0002\u001a\u00030ø\u00022\u0006\u00101\u001a\u00020&2\b\u0010ò\u0002\u001a\u00030ñ\u00022\b\u0010ô\u0002\u001a\u00030ó\u00022\b\u0010ö\u0002\u001a\u00030õ\u00022\u0007\u0010÷\u0002\u001a\u00020\u0004H\u0007J3\u0010ü\u0002\u001a\u00030û\u00022\u0006\u0010\r\u001a\u00020\f2\u0007\u0010x\u001a\u00030ú\u00022\u0006\u0010%\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J,\u0010\u0080\u0003\u001a\u00030ÿ\u00022\b\u0010þ\u0002\u001a\u00030ý\u00022\u0006\u0010P\u001a\u00020O2\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\fH\u0007J\u0014\u0010\u0084\u0003\u001a\u00030\u0083\u00032\b\u0010\u0082\u0003\u001a\u00030\u0081\u0003H\u0007J\u0014\u0010\u0087\u0003\u001a\u00030à\u00022\b\u0010\u0086\u0003\u001a\u00030\u0085\u0003H\u0007J\u0014\u0010\u008a\u0003\u001a\u00030â\u00022\b\u0010\u0089\u0003\u001a\u00030\u0088\u0003H\u0007J\u001d\u0010\u008f\u0003\u001a\f\u0012\u0007\b\u0001\u0012\u00030\u008e\u00030\u008d\u00032\b\u0010\u008c\u0003\u001a\u00030\u008b\u0003H\u0007J\u001d\u0010\u0090\u0003\u001a\f\u0012\u0007\b\u0001\u0012\u00030\u008e\u00030\u008d\u00032\b\u0010\u008c\u0003\u001a\u00030\u008b\u0003H\u0007J\u001d\u0010\u0091\u0003\u001a\f\u0012\u0007\b\u0001\u0012\u00030\u008e\u00030\u008d\u00032\b\u0010\u008c\u0003\u001a\u00030\u008b\u0003H\u0007J\u001d\u0010\u0093\u0003\u001a\f\u0012\u0007\b\u0001\u0012\u00030\u008e\u00030\u008d\u00032\b\u0010\u008c\u0003\u001a\u00030\u0092\u0003H\u0007J\u001d\u0010\u0094\u0003\u001a\f\u0012\u0007\b\u0001\u0012\u00030\u008e\u00030\u008d\u00032\b\u0010\u008c\u0003\u001a\u00030\u0092\u0003H\u0007J\u001d\u0010\u0095\u0003\u001a\f\u0012\u0007\b\u0001\u0012\u00030\u008e\u00030\u008d\u00032\b\u0010\u008c\u0003\u001a\u00030\u0092\u0003H\u0007J0\u0010\u009c\u0003\u001a\u00030\u009b\u00032\b\u0010\u0097\u0003\u001a\u00030\u0096\u00032\b\u0010\u0099\u0003\u001a\u00030\u0098\u00032\b\u0010\u009a\u0003\u001a\u00030 \u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0014\u0010 \u0003\u001a\u00030\u009f\u00032\b\u0010\u009e\u0003\u001a\u00030\u009d\u0003H\u0007J\u0014\u0010¤\u0003\u001a\u00030£\u00032\b\u0010¢\u0003\u001a\u00030¡\u0003H\u0007J\u0013\u0010§\u0003\u001a\u00030¦\u00032\u0007\u0010x\u001a\u00030¥\u0003H\u0007J#\u0010ª\u0003\u001a\u00030©\u00032\u0006\u0010\r\u001a\u00020\f2\u0007\u0010¨\u0003\u001a\u00020<2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0013\u0010\u00ad\u0003\u001a\u00030¬\u00032\u0007\u0010x\u001a\u00030«\u0003H\u0007J\u001b\u0010°\u0003\u001a\u00030¯\u00032\u0007\u0010x\u001a\u00030®\u00032\u0006\u00101\u001a\u00020&H\u0007J\u001e\u0010´\u0003\u001a\u00030³\u00032\b\u0010\u0097\u0003\u001a\u00030\u0096\u00032\b\u0010²\u0003\u001a\u00030±\u0003H\u0007J\u0012\u0010µ\u0003\u001a\u00030\u009a\u00012\u0006\u0010\r\u001a\u00020\fH\u0007R\u001b\u0010\r\u001a\u00020\f8\u0006¢\u0006\u0010\n\u0006\b\u0092\u0002\u0010¶\u0003\u001a\u0006\b·\u0003\u0010¸\u0003¨\u0006»\u0003"}, m28432d2 = {"LVH2;", "", "LaX;", "q", "Lgl;", "preference", "LEa;", "analyticsManager", "LTq4;", "reactiveConfig", "LOh;", "buildConfig", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Le13;", "Z", "Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtility;", "utility", "LZo;", "assetUploadClient", "Ldf6;", "uploadClient", "Lef6;", "G0", "LTg6;", "userClient", "LRp;", "authManager", "uploadManager", "Ll20;", "brazeManager", "Lm46;", "timeProvider", "Lwi2;", "deserializer", "LRh6;", "userStream", "appBuildConfig", "Llh6;", "K0", "LVg6;", "userGuestClient", "LWg6;", "I0", "LOp;", "authInterceptor", "config", "Lhq;", "authTokenManager", "userManager", "navigator", "Ldh6;", "J0", "L0", "Lco/bird/android/model/DynamicLinkConfiguration;", "dynamicLinkConfiguration", "LAD0;", "couponClient", "LBQ2;", "merchantClient", "LKm1;", "dynamicLinks", "LV74;", "c", "Lri1;", "impl", "Lqi1;", "G", "promoManager", "LVK;", "birdClient", "Llj5;", "scanClient", "LdD1;", "googleMapClient", "Lq54;", "privateBirdsManager", "Ljd0;", "cannotAccessClient", "Ldr4;", "reactiveLocationManager", "LAe5;", "rxBleVehicleManager", "LRR;", "birdRepo", "LVL1;", "hibernationRepo", "LxB1;", "genericNonBirdClient", "LaM;", "o", "Lcom/stripe/android/Stripe;", "C0", "LLL3;", "paymentClient", "LfL;", "birdDeviceCheckManagerManager", "Lw10;", "s", "LuS5;", "stripeClient", "brainTreeManager", "LAM3;", "e0", "LML3;", "Llg6;", "userAgreementManager", "LVM3;", "f0", "stripe", "paymentManagerV2", "Lpx5;", "y0", "LiD1;", "googlePayManager", "paymentMangerV2", "paymentMangerV3", "LzN3;", "g0", "LZ9;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "Lab;", "unauthenticatedClient", "Lde5;", "rxBleClient", "LBc;", "deviceManager", "LLifecycleOwner;", "processLifecyclerOwner", "LuQ3;", "permissionDelegate", "LGI3;", "partnerManager", "Landroid/net/ConnectivityManager;", "connectivityManager", "Lo21;", "deviceCheckManager", "Landroid/app/admin/DevicePolicyManager;", "devicePolicyManager", "Landroid/net/wifi/WifiManager;", "wifiManager", "Landroid/telephony/TelephonyManager;", "telephonyManager", "Lco/bird/android/manager/analytics/persistence/AnalyticsDatabase;", "analyticsDatabase", "Li66;", "traceProvider", "Llj1;", "facebookManager", "Lwm1;", "firebaseAnalyticsManager", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "firebaseCrashlytics", "Ldagger/Lazy;", "LZC6;", "workManager", "locationManager", DateTokenConverter.CONVERTER_KEY, "LoB0;", "B", "LiB0;", "contractor", "bird", "LjZ5;", "task", "LjB0;", "A", "LI32;", "inspect", "LJy4;", "repair", "LFO2;", "X", "LaY;", "r", "appContext", "LhY;", "bluetoothTraceClient", "LDX;", "bluetoothManager", "LMD;", "i", "LkJ;", "birdBluetoothApiManager", "Lsm6;", "vehicle", "scheduler", "LKn6;", "vehicleTrackerManager", "LpJ;", "m", "baseBluetoothManager", "vehicleManager", "Llp2;", "T", "birdManager", "Lrd5;", "v0", "O0", "LP10;", "braze", "t", "H", "K", "LhI5;", "smartlockClient", "LYR4;", "rideManager", "LMc2;", "itemLeaseManager", "LoI5;", "A0", "LqF5;", "smartlockManagerImplFactory", "LhF5;", "a0", "LBa5;", "rideRating", "Lmn4;", "rating", "LFk1;", "I", "Lkg6;", "userAgreementClient", "H0", "p0", "LJp0;", "communityClient", "LKp0;", "w", "LVq4;", "o0", "repairClient", "LMB4;", "q0", "Lha2;", "Lla2;", "S", "LUI4;", "glideRequestManager", "Landroid/os/Handler;", "handler", "Landroid/app/DownloadManager;", "downloadManager", "La61;", "downloadClient", "LsP2;", "Y", "mediaManager", "LTo2;", "g", "LFI3;", "assetManager", "d0", "LBt5;", "LGt5;", "x0", "LxK4;", "LpU4;", "rideMapStateManager", "LpM3;", "paymentIntentManager", "LMK4;", "r0", "LIl1;", "p", "Lxs0;", "Lys0;", "x", "LQx4;", "LCx4;", "W", "LTH;", "LgH;", C17296a.f69688o, "LwL;", "LuL;", "b", "LIT0;", "LJT0;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LGl1;", "f", "Laj6;", "M0", "LYF;", "beaconConfigurationClient", "vtBeaconManager", "LZF;", "k", "Lpv0;", "y", "legacyVehicleScanManager", "LyL;", "n", "Ljn0;", "commandCenterClient", "LTn0;", "u", "LDp0;", "communicationOptInClient", "LEp0;", "v", "l", "LMQ5;", "stickerClient", "LNQ5;", "B0", "LgD6;", "workOrderClient", "LaG6;", "T0", "LSL;", "birdLifecycleClient", "LDq2;", "U", "LRy6;", "warehouseInventoryClient", "LU72;", "inventoryCountClient", "LI82;", "R", "LVE;", "batchClient", "LfF;", "j", "LPl1;", "J", "dealManager", "LBf1;", "m0", "Landroid/hardware/SensorManager;", "e", "z", "E", "R0", "F0", "F", "Lgd3;", "b0", "LWY3;", "powerlineClient", "LXY3;", "k0", "LGZ5;", "taxInformationClient", "LHZ5;", "E0", "Lgg5;", "s3Manager", "LLo;", "assetDao", "LWo;", "assetRepairManager", "LQo;", "webArchiveAssetManager", "Lsu2;", "V", "Lt24;", "pricingClient", "Lu24;", "l0", "s0", "LAb4;", "n0", "Lgn5;", "scrapClient", "Leo5;", "w0", "LdF1;", "hardCountClient", "LiF1;", "hardCountDao", "LlH1;", "hardCountScanDao", "appPreference", "LXF1;", "O", "LdT1;", "LmT1;", "Q", "Lq30;", "bugReportClient", "Lr30;", "z0", "Lea5;", "riderProfileClient", "Lfa5;", "t0", "LVo;", "assetRepairClient", "h", "Lyz6;", "webArchiveClient", "Q0", "LQB1;", "factory", "Lwu6;", "Lvt4;", "M", "L", "N", "LRW3;", "i0", "h0", "j0", "Lom3;", "operatorManager", "LSM;", "birdPartManager", "beaconConfigurationManager", "LnS1;", "P", "Lnc5;", "routingClient", "Ltc5;", AbstractC26684u0.f100690q, "LDy6;", "warehouseClient", "LSy6;", "P0", "Lsl6;", "Ltl6;", "N0", "firebaseDynamicLinks", "LhW0;", "D", "LmI6;", "LoI6;", "U0", "LWl3;", "LXl3;", "c0", "LsZ5;", "taskOrderClient", "LtZ5;", "D0", "S0", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@Module(includes = {UH2.class, AbstractC31652Ae3.class})
/* renamed from: VH2 */
/* loaded from: classes4.dex */
public final class VH2 {

    /* renamed from: a */
    public final Context f38828a;

    public VH2(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f38828a = context;
    }

    @Provides
    /* renamed from: A */
    public final InterfaceC43160jB0 m80120A(InterfaceC42567iB0 contractor, InterfaceC8601VK bird, InterfaceC43381jZ5 task, C22454gl preference, C36207Tq4 reactiveConfig, InterfaceC35660Rh6 userStream) {
        Intrinsics.checkNotNullParameter(contractor, "contractor");
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        return new C44346lB0(contractor, bird, task, preference, reactiveConfig, userStream);
    }

    @Provides
    /* renamed from: A0 */
    public final InterfaceC46193oI5 m80119A0(Context context, AbstractC39873de5 rxBleClient, InterfaceC42042hI5 smartlockClient, InterfaceC5225MD baseBluetoothManager, InterfaceC1880Ea analyticsManager, YR4 rideManager, C36207Tq4 reactiveConfig, C22454gl preference, InterfaceC34441Mc2 itemLeaseManager, InterfaceC1510DX bluetoothManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rxBleClient, "rxBleClient");
        Intrinsics.checkNotNullParameter(smartlockClient, "smartlockClient");
        Intrinsics.checkNotNullParameter(baseBluetoothManager, "baseBluetoothManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(itemLeaseManager, "itemLeaseManager");
        Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        return new SmartlockManagerImpl(context, rxBleClient, smartlockClient, baseBluetoothManager, analyticsManager, rideManager, reactiveConfig, preference, itemLeaseManager, bluetoothManager);
    }

    @Provides
    /* renamed from: B */
    public final InterfaceC46125oB0 m80118B() {
        return new C46718pB0();
    }

    @Provides
    /* renamed from: B0 */
    public final NQ5 m80117B0(MQ5 stickerClient) {
        Intrinsics.checkNotNullParameter(stickerClient, "stickerClient");
        return new OQ5(stickerClient);
    }

    @Provides
    /* renamed from: C */
    public final JT0 m80116C(IT0 client, C22454gl preference, InterfaceC35660Rh6 userStream) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        return new OT0(client, preference, userStream);
    }

    @Provides
    /* renamed from: C0 */
    public final Stripe m80115C0(C22454gl preference) {
        Intrinsics.checkNotNullParameter(preference, "preference");
        String string = this.f38828a.getString(preference.m37699O().m9900h());
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(prefer….getEnvironment().stripe)");
        Context applicationContext = this.f38828a.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        return new Stripe(applicationContext, string, (String) null, false, (Set) null, 28, (DefaultConstructorMarker) null);
    }

    @Provides
    @Reusable
    /* renamed from: D */
    public final InterfaceC42163hW0 m80114D(Context context, AbstractC34062Km1 firebaseDynamicLinks, InterfaceC1880Ea analyticsManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(firebaseDynamicLinks, "firebaseDynamicLinks");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        return new C43349jW0(context, firebaseDynamicLinks, analyticsManager);
    }

    @Provides
    /* renamed from: D0 */
    public final InterfaceC49310tZ5 m80113D0(InterfaceC46473om3 operatorManager, InterfaceC48717sZ5 taskOrderClient) {
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(taskOrderClient, "taskOrderClient");
        return new C52867zZ5(operatorManager, taskOrderClient);
    }

    @Provides
    /* renamed from: E */
    public final DevicePolicyManager m80112E(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("device_policy");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.admin.DevicePolicyManager");
        return (DevicePolicyManager) systemService;
    }

    @Provides
    /* renamed from: E0 */
    public final HZ5 m80111E0(GZ5 taxInformationClient) {
        Intrinsics.checkNotNullParameter(taxInformationClient, "taxInformationClient");
        return new KZ5(taxInformationClient);
    }

    @Provides
    /* renamed from: F */
    public final DownloadManager m80110F(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("download");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
        return (DownloadManager) systemService;
    }

    @Provides
    /* renamed from: F0 */
    public final TelephonyManager m80109F0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService(PaymentMethod.BillingDetails.PARAM_PHONE);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        return (TelephonyManager) systemService;
    }

    @Provides
    /* renamed from: G */
    public final InterfaceC47617qi1 m80108G(C48210ri1 impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        return impl;
    }

    @Provides
    /* renamed from: G0 */
    public final InterfaceC40476ef6 m80107G0(Context context, C22454gl preference, TransferUtility utility, InterfaceC10389Zo assetUploadClient, C36207Tq4 reactiveConfig, InterfaceC39884df6 uploadClient) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(utility, "utility");
        Intrinsics.checkNotNullParameter(assetUploadClient, "assetUploadClient");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(uploadClient, "uploadClient");
        return new C44034kf6(context, preference, utility, assetUploadClient, reactiveConfig, uploadClient);
    }

    @Provides
    /* renamed from: H */
    public final InterfaceC44662lj1 m80106H(Context context, C36207Tq4 reactiveConfig, InterfaceC6097Oh appBuildConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(appBuildConfig, "appBuildConfig");
        return new C45255mj1(context, reactiveConfig, appBuildConfig);
    }

    @Provides
    /* renamed from: H0 */
    public final InterfaceC44637lg6 m80105H0(InterfaceC44647lh6 userManager, InterfaceC44044kg6 userAgreementClient, InterfaceC36587Vg6 userGuestClient, C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager, InterfaceC35660Rh6 userStream) {
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(userAgreementClient, "userAgreementClient");
        Intrinsics.checkNotNullParameter(userGuestClient, "userGuestClient");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        return new C52344yg6(userManager, userAgreementClient, userGuestClient, reactiveConfig, analyticsManager, userStream);
    }

    @Provides
    /* renamed from: I */
    public final InterfaceC32874Fk1 m80104I(InterfaceC31852Ba5 rideRating, InterfaceC45298mn4 rating, InterfaceC43381jZ5 task) {
        Intrinsics.checkNotNullParameter(rideRating, "rideRating");
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(task, "task");
        return new C33810Jk1(rideRating, rating, task);
    }

    @Provides
    /* renamed from: I0 */
    public final InterfaceC36821Wg6 m80103I0(Context context, InterfaceC36587Vg6 userGuestClient, C22454gl preference, InterfaceC35660Rh6 userStream, C36207Tq4 reactiveConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userGuestClient, "userGuestClient");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        return new C38700bh6(context, userGuestClient, preference, userStream, reactiveConfig);
    }

    @Provides
    /* renamed from: J */
    public final InterfaceC35223Pl1 m80102J(C22454gl preference) {
        Intrinsics.checkNotNullParameter(preference, "preference");
        return new C35457Ql1(preference);
    }

    @Provides
    /* renamed from: J0 */
    public final InterfaceC39904dh6 m80101J0(Context context, InterfaceC6181Op authInterceptor, C36207Tq4 config, InterfaceC22767hq authTokenManager, InterfaceC35660Rh6 userStream, InterfaceC44647lh6 userManager, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(authInterceptor, "authInterceptor");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(authTokenManager, "authTokenManager");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        return new C44054kh6(context, authInterceptor, config, authTokenManager, userStream, userManager, navigator);
    }

    @Provides
    /* renamed from: K */
    public final InterfaceC51213wm1 m80100K(C36207Tq4 reactiveConfig) {
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        return new C51806xm1(reactiveConfig);
    }

    @Provides
    /* renamed from: K0 */
    public final InterfaceC44647lh6 m80099K0(Context context, InterfaceC36119Tg6 userClient, C22454gl preference, InterfaceC7277Rp authManager, InterfaceC40476ef6 uploadManager, InterfaceC44257l20 brazeManager, InterfaceC44876m46 timeProvider, C51174wi2 deserializer, InterfaceC35660Rh6 userStream, C36207Tq4 reactiveConfig, InterfaceC6097Oh appBuildConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userClient, "userClient");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(uploadManager, "uploadManager");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(appBuildConfig, "appBuildConfig");
        return new C33788Jh6(context, userClient, preference, authManager, uploadManager, brazeManager, timeProvider, deserializer, userStream, reactiveConfig, appBuildConfig);
    }

    @Provides
    /* renamed from: L */
    public final InterfaceC51298wu6<? extends InterfaceC50693vt4> m80098L(QB1 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.mo87218a(BB1.f1976a);
    }

    @Provides
    /* renamed from: L0 */
    public final InterfaceC35660Rh6 m80097L0(C22454gl preference) {
        Intrinsics.checkNotNullParameter(preference, "preference");
        return new C37064Xh6(preference);
    }

    @Provides
    /* renamed from: M */
    public final InterfaceC51298wu6<? extends InterfaceC50693vt4> m80096M(QB1 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.mo87218a(CB1.f3560a);
    }

    @Provides
    /* renamed from: M0 */
    public final InterfaceC38127aj6 m80095M0(AbstractC39873de5 rxBleClient) {
        Intrinsics.checkNotNullParameter(rxBleClient, "rxBleClient");
        return new C16232a(rxBleClient);
    }

    @Provides
    /* renamed from: N */
    public final InterfaceC51298wu6<? extends InterfaceC50693vt4> m80094N(QB1 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.mo87218a(TB1.f34872a);
    }

    @Provides
    /* renamed from: N0 */
    public final InterfaceC49430tl6 m80093N0(InterfaceC48837sl6 client) {
        Intrinsics.checkNotNullParameter(client, "client");
        return new C50023ul6(client);
    }

    @Provides
    /* renamed from: O */
    public final XF1 m80092O(InterfaceC44647lh6 userManager, InterfaceC39640dF1 hardCountClient, AbstractC42604iF1 hardCountDao, AbstractC44401lH1 hardCountScanDao, C22454gl appPreference) {
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(hardCountClient, "hardCountClient");
        Intrinsics.checkNotNullParameter(hardCountDao, "hardCountDao");
        Intrinsics.checkNotNullParameter(hardCountScanDao, "hardCountScanDao");
        Intrinsics.checkNotNullParameter(appPreference, "appPreference");
        return new C46171oG1(userManager, hardCountClient, hardCountDao, hardCountScanDao, appPreference);
    }

    @Provides
    /* renamed from: O0 */
    public final InterfaceC48847sm6 m80091O0(Context context, InterfaceC10732aY scheduler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        return new C35799Rx1(context, scheduler);
    }

    @Provides
    /* renamed from: P */
    public final InterfaceC45686nS1 m80090P(InterfaceC46473om3 operatorManager, InterfaceC7381SM birdPartManager, InterfaceC10163ZF beaconConfigurationManager, InterfaceC1880Ea analyticsManager) {
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(birdPartManager, "birdPartManager");
        Intrinsics.checkNotNullParameter(beaconConfigurationManager, "beaconConfigurationManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        return new C51021wS1(operatorManager, birdPartManager, beaconConfigurationManager, analyticsManager);
    }

    @Provides
    /* renamed from: P0 */
    public final InterfaceC36047Sy6 m80089P0(InterfaceC32537Dy6 warehouseClient) {
        Intrinsics.checkNotNullParameter(warehouseClient, "warehouseClient");
        return new C36281Ty6(warehouseClient);
    }

    @Provides
    /* renamed from: Q */
    public final InterfaceC45102mT1 m80088Q(Context context, InterfaceC39766dT1 client, InterfaceC6097Oh appBuildConfig, C51174wi2 deserializer, InterfaceC1880Ea analyticsManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(appBuildConfig, "appBuildConfig");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        return new AT1(context, client, appBuildConfig, deserializer, analyticsManager);
    }

    @Provides
    /* renamed from: Q0 */
    public final InterfaceC6909Qo m80087Q0(InterfaceC52534yz6 webArchiveClient) {
        Intrinsics.checkNotNullParameter(webArchiveClient, "webArchiveClient");
        return new C51941xz6(webArchiveClient);
    }

    @Provides
    /* renamed from: R */
    public final I82 m80086R(InterfaceC35813Ry6 warehouseInventoryClient, U72 inventoryCountClient) {
        Intrinsics.checkNotNullParameter(warehouseInventoryClient, "warehouseInventoryClient");
        Intrinsics.checkNotNullParameter(inventoryCountClient, "inventoryCountClient");
        return new J82(warehouseInventoryClient, inventoryCountClient);
    }

    @Provides
    /* renamed from: R0 */
    public final WifiManager m80085R0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getApplicationContext().getSystemService("wifi");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        return (WifiManager) systemService;
    }

    @Provides
    /* renamed from: S */
    public final InterfaceC44573la2 m80084S(InterfaceC42201ha2 client, InterfaceC45298mn4 rating) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(rating, "rating");
        return new C45166ma2(client, rating);
    }

    @Provides
    /* renamed from: S0 */
    public final ZC6 m80083S0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ZC6 m73614h = ZC6.m73614h(context);
        Intrinsics.checkNotNullExpressionValue(m73614h, "getInstance(context)");
        return m73614h;
    }

    @Provides
    /* renamed from: T */
    public final InterfaceC44723lp2 m80082T(InterfaceC5225MD baseBluetoothManager, InterfaceC48847sm6 vehicleManager, InterfaceC10732aY scheduler, InterfaceC34076Kn6 vehicleTrackerManager) {
        Intrinsics.checkNotNullParameter(baseBluetoothManager, "baseBluetoothManager");
        Intrinsics.checkNotNullParameter(vehicleManager, "vehicleManager");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        Intrinsics.checkNotNullParameter(vehicleTrackerManager, "vehicleTrackerManager");
        return new C49466tp2(baseBluetoothManager, vehicleManager, scheduler, vehicleTrackerManager);
    }

    @Provides
    /* renamed from: T0 */
    public final InterfaceC37857aG6 m80081T0(InterfaceC41405gD6 workOrderClient) {
        Intrinsics.checkNotNullParameter(workOrderClient, "workOrderClient");
        return new C46769pG6(workOrderClient);
    }

    @Provides
    /* renamed from: U */
    public final InterfaceC32461Dq2 m80080U(InterfaceC7378SL birdLifecycleClient) {
        Intrinsics.checkNotNullParameter(birdLifecycleClient, "birdLifecycleClient");
        return new C32695Eq2(birdLifecycleClient);
    }

    @Provides
    /* renamed from: U0 */
    public final InterfaceC46194oI6 m80079U0(InterfaceC45008mI6 client) {
        Intrinsics.checkNotNullParameter(client, "client");
        return new C46787pI6(client);
    }

    @Provides
    /* renamed from: V */
    public final InterfaceC48923su2 m80078V(Context context, InterfaceC41671gg5 s3Manager, AbstractC5089Lo assetDao, InterfaceC9184Wo assetRepairManager, InterfaceC6909Qo webArchiveAssetManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(s3Manager, "s3Manager");
        Intrinsics.checkNotNullParameter(assetDao, "assetDao");
        Intrinsics.checkNotNullParameter(assetRepairManager, "assetRepairManager");
        Intrinsics.checkNotNullParameter(webArchiveAssetManager, "webArchiveAssetManager");
        return new C33667Iu2(context, s3Manager, assetDao, assetRepairManager, webArchiveAssetManager);
    }

    @Provides
    /* renamed from: W */
    public final InterfaceC32292Cx4 m80077W(C35568Qx4 impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        return impl;
    }

    @Provides
    /* renamed from: X */
    public final FO2 m80076X(Context context, InterfaceC8601VK bird, InterfaceC43381jZ5 task, I32 inspect, InterfaceC33939Jy4 repair, InterfaceC40476ef6 uploadManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(inspect, "inspect");
        Intrinsics.checkNotNullParameter(repair, "repair");
        Intrinsics.checkNotNullParameter(uploadManager, "uploadManager");
        return new NO2(context, bird, task, inspect, repair, uploadManager);
    }

    @Provides
    /* renamed from: Y */
    public final InterfaceC48624sP2 m80075Y(UI4 glideRequestManager, Handler handler, DownloadManager downloadManager, InterfaceC37758a61 downloadClient) {
        Intrinsics.checkNotNullParameter(glideRequestManager, "glideRequestManager");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(downloadClient, "downloadClient");
        return new C50995wP2(glideRequestManager, handler, downloadManager, downloadClient);
    }

    @Provides
    /* renamed from: Z */
    public final InterfaceC40099e13 m80074Z(C22454gl preference, InterfaceC1880Ea analyticsManager, C36207Tq4 reactiveConfig, InterfaceC6097Oh buildConfig, Context context) {
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(buildConfig, "buildConfig");
        Intrinsics.checkNotNullParameter(context, "context");
        return new C41878h13(preference, analyticsManager, reactiveConfig, buildConfig, context);
    }

    @Provides
    /* renamed from: a */
    public final InterfaceC20792gH m80073a(C7708TH impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        return impl;
    }

    @Provides
    /* renamed from: a0 */
    public final InterfaceC42015hF5 m80072a0(InterfaceC47352qF5 smartlockManagerImplFactory) {
        Intrinsics.checkNotNullParameter(smartlockManagerImplFactory, "smartlockManagerImplFactory");
        return smartlockManagerImplFactory.mo16152a(C37824aD0.m71790a(T41.m84378a().plus(XU5.m76946b(null, 1, null))));
    }

    @Provides
    /* renamed from: b */
    public final InterfaceC29169uL m80071b(C29862wL impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        return impl;
    }

    @Provides
    /* renamed from: b0 */
    public final InterfaceC41639gd3 m80070b0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        NotificationManagerCompat from = NotificationManagerCompat.from(context);
        Intrinsics.checkNotNullExpressionValue(from, "from(context)");
        return new C43418jd3(from);
    }

    @Provides
    /* renamed from: c */
    public final V74 m80069c(InterfaceC35660Rh6 userStream, Context context, DynamicLinkConfiguration dynamicLinkConfiguration, InterfaceC36119Tg6 userClient, AD0 couponClient, BQ2 merchantClient, C36207Tq4 reactiveConfig, AbstractC34062Km1 dynamicLinks) {
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dynamicLinkConfiguration, "dynamicLinkConfiguration");
        Intrinsics.checkNotNullParameter(userClient, "userClient");
        Intrinsics.checkNotNullParameter(couponClient, "couponClient");
        Intrinsics.checkNotNullParameter(merchantClient, "merchantClient");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(dynamicLinks, "dynamicLinks");
        return new C44321l84(userStream, context, dynamicLinkConfiguration, userClient, couponClient, merchantClient, reactiveConfig, dynamicLinks);
    }

    @Provides
    /* renamed from: c0 */
    public final InterfaceC37097Xl3 m80068c0(InterfaceC36863Wl3 client, InterfaceC44647lh6 userManager) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        return new C41136fm3(client, userManager);
    }

    @Provides
    /* renamed from: d */
    public final InterfaceC1880Ea m80067d(InterfaceC6097Oh buildConfig, InterfaceC10121Z9 client, InterfaceC10736ab unauthenticatedClient, C22454gl preference, InterfaceC44257l20 brazeManager, AbstractC39873de5 rxBleClient, InterfaceC0650Bc deviceManager, LifecycleOwner processLifecyclerOwner, C36207Tq4 reactiveConfig, InterfaceC49820uQ3 permissionDelegate, GI3 partnerManager, ConnectivityManager connectivityManager, InterfaceC46037o21 deviceCheckManager, DevicePolicyManager devicePolicyManager, WifiManager wifiManager, TelephonyManager telephonyManager, AnalyticsDatabase analyticsDatabase, InterfaceC42524i66 traceProvider, InterfaceC35660Rh6 userStream, InterfaceC44662lj1 facebookManager, InterfaceC51213wm1 firebaseAnalyticsManager, FirebaseCrashlytics firebaseCrashlytics, Lazy<ZC6> workManager, InterfaceC40001dr4 locationManager) {
        Intrinsics.checkNotNullParameter(buildConfig, "buildConfig");
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(unauthenticatedClient, "unauthenticatedClient");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(rxBleClient, "rxBleClient");
        Intrinsics.checkNotNullParameter(deviceManager, "deviceManager");
        Intrinsics.checkNotNullParameter(processLifecyclerOwner, "processLifecyclerOwner");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(permissionDelegate, "permissionDelegate");
        Intrinsics.checkNotNullParameter(partnerManager, "partnerManager");
        Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
        Intrinsics.checkNotNullParameter(deviceCheckManager, "deviceCheckManager");
        Intrinsics.checkNotNullParameter(devicePolicyManager, "devicePolicyManager");
        Intrinsics.checkNotNullParameter(wifiManager, "wifiManager");
        Intrinsics.checkNotNullParameter(telephonyManager, "telephonyManager");
        Intrinsics.checkNotNullParameter(analyticsDatabase, "analyticsDatabase");
        Intrinsics.checkNotNullParameter(traceProvider, "traceProvider");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(facebookManager, "facebookManager");
        Intrinsics.checkNotNullParameter(firebaseAnalyticsManager, "firebaseAnalyticsManager");
        Intrinsics.checkNotNullParameter(firebaseCrashlytics, "firebaseCrashlytics");
        Intrinsics.checkNotNullParameter(workManager, "workManager");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        return new AnalyticsManagerImpl(buildConfig, client, unauthenticatedClient, preference, brazeManager, rxBleClient, deviceManager, processLifecyclerOwner, reactiveConfig, permissionDelegate, partnerManager, connectivityManager, deviceCheckManager, devicePolicyManager, wifiManager, telephonyManager, analyticsDatabase, traceProvider, userStream, facebookManager, firebaseAnalyticsManager, firebaseCrashlytics, workManager, locationManager);
    }

    @Provides
    /* renamed from: d0 */
    public final GI3 m80066d0(FI3 client, InterfaceC36187To2 assetManager) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        return new LI3(client, assetManager);
    }

    @Provides
    /* renamed from: e */
    public final SensorManager m80065e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("sensor");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        return (SensorManager) systemService;
    }

    @Provides
    /* renamed from: e0 */
    public final AM3 m80064e0(Context context, InterfaceC35660Rh6 userStream, InterfaceC49840uS5 stripeClient, LL3 paymentClient, InterfaceC50768w10 brainTreeManager, InterfaceC1880Ea analyticsManager, InterfaceC20357fL birdDeviceCheckManagerManager, C22454gl preference, C36207Tq4 reactiveConfig, InterfaceC44647lh6 userManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(stripeClient, "stripeClient");
        Intrinsics.checkNotNullParameter(paymentClient, "paymentClient");
        Intrinsics.checkNotNullParameter(brainTreeManager, "brainTreeManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(birdDeviceCheckManagerManager, "birdDeviceCheckManagerManager");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        return new SM3(context, userStream, stripeClient, paymentClient, brainTreeManager, analyticsManager, birdDeviceCheckManagerManager, preference, reactiveConfig, userManager);
    }

    @Provides
    /* renamed from: f */
    public final InterfaceC33117Gl1 m80063f() {
        return new C33351Hl1();
    }

    @Provides
    /* renamed from: f0 */
    public final VM3 m80062f0(InterfaceC1880Ea analyticsManager, ML3 paymentClient, C22454gl preference, C36207Tq4 reactiveConfig, InterfaceC49840uS5 stripeClient, InterfaceC44637lg6 userAgreementManager, InterfaceC44647lh6 userManager, InterfaceC35660Rh6 userStream) {
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(paymentClient, "paymentClient");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(stripeClient, "stripeClient");
        Intrinsics.checkNotNullParameter(userAgreementManager, "userAgreementManager");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        return new C45050mN3(analyticsManager, paymentClient, stripeClient, preference, reactiveConfig, userAgreementManager, userManager, userStream);
    }

    @Provides
    /* renamed from: g */
    public final InterfaceC36187To2 m80061g(InterfaceC48624sP2 mediaManager) {
        Intrinsics.checkNotNullParameter(mediaManager, "mediaManager");
        return new C36421Uo2(mediaManager);
    }

    @Provides
    /* renamed from: g0 */
    public final InterfaceC52757zN3 m80060g0(LL3 paymentClient, C36207Tq4 reactiveConfig, InterfaceC42586iD1 googlePayManager, AM3 paymentMangerV2, VM3 paymentMangerV3, InterfaceC35660Rh6 userStream) {
        Intrinsics.checkNotNullParameter(paymentClient, "paymentClient");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        Intrinsics.checkNotNullParameter(paymentMangerV2, "paymentMangerV2");
        Intrinsics.checkNotNullParameter(paymentMangerV3, "paymentMangerV3");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        return new JN3(paymentClient, reactiveConfig, googlePayManager, paymentMangerV2, paymentMangerV3, userStream);
    }

    @Provides
    /* renamed from: h */
    public final InterfaceC9184Wo m80059h(InterfaceC8797Vo assetRepairClient) {
        Intrinsics.checkNotNullParameter(assetRepairClient, "assetRepairClient");
        return new C9495Xo(assetRepairClient);
    }

    @Provides
    /* renamed from: h0 */
    public final InterfaceC51298wu6<? extends InterfaceC50693vt4> m80058h0(RW3 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.mo85316a(PW3.f28623a);
    }

    @Provides
    /* renamed from: i */
    public final InterfaceC5225MD m80057i(Context appContext, C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager, AbstractC39873de5 rxBleClient, InterfaceC22677hY bluetoothTraceClient, C22454gl preference, InterfaceC1510DX bluetoothManager) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(rxBleClient, "rxBleClient");
        Intrinsics.checkNotNullParameter(bluetoothTraceClient, "bluetoothTraceClient");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        return new C10129ZD(appContext, reactiveConfig, analyticsManager, rxBleClient, bluetoothTraceClient, preference, bluetoothManager, null, 128, null);
    }

    @Provides
    /* renamed from: i0 */
    public final InterfaceC51298wu6<? extends InterfaceC50693vt4> m80056i0(RW3 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.mo85316a(QW3.f30463a);
    }

    @Provides
    /* renamed from: j */
    public final InterfaceC20340fF m80055j(InterfaceC8580VE batchClient, InterfaceC44647lh6 userManager) {
        Intrinsics.checkNotNullParameter(batchClient, "batchClient");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        return new C23174iF(batchClient, userManager);
    }

    @Provides
    /* renamed from: j0 */
    public final InterfaceC51298wu6<? extends InterfaceC50693vt4> m80054j0(RW3 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.mo85316a(UW3.f37493a);
    }

    @Provides
    /* renamed from: k */
    public final InterfaceC10163ZF m80053k(InterfaceC9749YF beaconConfigurationClient, InterfaceC38127aj6 vtBeaconManager) {
        Intrinsics.checkNotNullParameter(beaconConfigurationClient, "beaconConfigurationClient");
        Intrinsics.checkNotNullParameter(vtBeaconManager, "vtBeaconManager");
        return new C19707dG(beaconConfigurationClient, vtBeaconManager);
    }

    @Provides
    /* renamed from: k0 */
    public final XY3 m80052k0(WY3 powerlineClient) {
        Intrinsics.checkNotNullParameter(powerlineClient, "powerlineClient");
        return new YY3(powerlineClient);
    }

    @Provides
    /* renamed from: l */
    public final InterfaceC25136kJ m80051l(InterfaceC8601VK birdClient) {
        Intrinsics.checkNotNullParameter(birdClient, "birdClient");
        return new C26900oJ(birdClient);
    }

    @Provides
    /* renamed from: l0 */
    public final InterfaceC49597u24 m80050l0(InterfaceC49004t24 pricingClient) {
        Intrinsics.checkNotNullParameter(pricingClient, "pricingClient");
        return new C50189v24(pricingClient);
    }

    @Provides
    /* renamed from: m */
    public final InterfaceC27246pJ m80049m(Context context, InterfaceC25136kJ birdBluetoothApiManager, InterfaceC48847sm6 vehicle, InterfaceC10732aY scheduler, InterfaceC1880Ea analyticsManager, InterfaceC34076Kn6 vehicleTrackerManager, C36207Tq4 reactiveConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(birdBluetoothApiManager, "birdBluetoothApiManager");
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(vehicleTrackerManager, "vehicleTrackerManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        return new C4805LK(context, birdBluetoothApiManager, vehicle, scheduler, analyticsManager, vehicleTrackerManager, reactiveConfig);
    }

    @Provides
    /* renamed from: m0 */
    public final InterfaceC31893Bf1 m80048m0(JT0 dealManager, V74 promoManager, C36207Tq4 reactiveConfig, YR4 rideManager, InterfaceC35660Rh6 userStream) {
        Intrinsics.checkNotNullParameter(dealManager, "dealManager");
        Intrinsics.checkNotNullParameter(promoManager, "promoManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        return new C35169Pf1(dealManager, promoManager, reactiveConfig, rideManager, userStream);
    }

    @Provides
    /* renamed from: n */
    public final InterfaceC30556yL m80047n(InterfaceC10636aM birdManager, InterfaceC44723lp2 legacyVehicleScanManager, AbstractC39873de5 rxBleClient) {
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(legacyVehicleScanManager, "legacyVehicleScanManager");
        Intrinsics.checkNotNullParameter(rxBleClient, "rxBleClient");
        return new C4017JL(birdManager, legacyVehicleScanManager, rxBleClient);
    }

    @Provides
    /* renamed from: n0 */
    public final InterfaceC31626Ab4 m80046n0(InterfaceC1880Ea analyticsManager) {
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        return new C31860Bb4(analyticsManager);
    }

    @Provides
    /* renamed from: o */
    public final InterfaceC10636aM m80045o(V74 promoManager, InterfaceC6097Oh buildConfig, InterfaceC8601VK birdClient, InterfaceC44666lj5 scanClient, InterfaceC39622dD1 googleMapClient, InterfaceC1880Ea analyticsManager, InterfaceC47256q54 privateBirdsManager, InterfaceC43415jd0 cannotAccessClient, InterfaceC40001dr4 reactiveLocationManager, InterfaceC31654Ae5 rxBleVehicleManager, InterfaceC7168RR birdRepo, VL1 hibernationRepo, InterfaceC51461xB1 genericNonBirdClient) {
        Intrinsics.checkNotNullParameter(promoManager, "promoManager");
        Intrinsics.checkNotNullParameter(buildConfig, "buildConfig");
        Intrinsics.checkNotNullParameter(birdClient, "birdClient");
        Intrinsics.checkNotNullParameter(scanClient, "scanClient");
        Intrinsics.checkNotNullParameter(googleMapClient, "googleMapClient");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(privateBirdsManager, "privateBirdsManager");
        Intrinsics.checkNotNullParameter(cannotAccessClient, "cannotAccessClient");
        Intrinsics.checkNotNullParameter(reactiveLocationManager, "reactiveLocationManager");
        Intrinsics.checkNotNullParameter(rxBleVehicleManager, "rxBleVehicleManager");
        Intrinsics.checkNotNullParameter(birdRepo, "birdRepo");
        Intrinsics.checkNotNullParameter(hibernationRepo, "hibernationRepo");
        Intrinsics.checkNotNullParameter(genericNonBirdClient, "genericNonBirdClient");
        String string = this.f38828a.getString(C45278ml4.google_api_client);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(string.google_api_client)");
        String string2 = this.f38828a.getString(C45278ml4.google_api_secret);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(string.google_api_secret)");
        return new C2793GM(promoManager, buildConfig, birdClient, scanClient, googleMapClient, analyticsManager, cannotAccessClient, privateBirdsManager, string, string2, reactiveLocationManager, rxBleVehicleManager, birdRepo, hibernationRepo, genericNonBirdClient);
    }

    @Provides
    /* renamed from: o0 */
    public final InterfaceC36675Vq4 m80044o0() {
        return new C36909Wq4();
    }

    @Provides
    /* renamed from: p */
    public final InterfaceC33585Il1 m80043p(C22454gl preference, InterfaceC35660Rh6 userStream, C36207Tq4 reactiveConfig) {
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        return new C34755Nl1(preference, userStream, reactiveConfig);
    }

    @Provides
    /* renamed from: p0 */
    public final InterfaceC40001dr4 m80042p0(Context context, C36207Tq4 reactiveConfig, C22454gl preference, InterfaceC6097Oh appBuildConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(appBuildConfig, "appBuildConfig");
        return new C31770Ar4(context, reactiveConfig, preference, appBuildConfig);
    }

    @Provides
    /* renamed from: q */
    public final C10730aX m80041q() {
        return new C10730aX();
    }

    @Provides
    /* renamed from: q0 */
    public final MB4 m80040q0(InterfaceC33939Jy4 repairClient) {
        Intrinsics.checkNotNullParameter(repairClient, "repairClient");
        return new NB4(repairClient);
    }

    @Provides
    /* renamed from: r */
    public final InterfaceC10732aY m80039r() {
        return new C19782dY();
    }

    @Provides
    /* renamed from: r0 */
    public final MK4 m80038r0(InterfaceC51545xK4 client, C22454gl preference, YR4 rideManager, InterfaceC46893pU4 rideMapStateManager, InterfaceC46820pM3 paymentIntentManager, InterfaceC35660Rh6 userStream) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(rideMapStateManager, "rideMapStateManager");
        Intrinsics.checkNotNullParameter(paymentIntentManager, "paymentIntentManager");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        return new TK4(client, preference, rideManager, rideMapStateManager, paymentIntentManager, userStream);
    }

    @Provides
    /* renamed from: s */
    public final InterfaceC50768w10 m80037s(LL3 paymentClient, InterfaceC1880Ea analyticsManager, C22454gl preference, C36207Tq4 reactiveConfig, InterfaceC44647lh6 userManager, InterfaceC20357fL birdDeviceCheckManagerManager) {
        Intrinsics.checkNotNullParameter(paymentClient, "paymentClient");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(birdDeviceCheckManagerManager, "birdDeviceCheckManagerManager");
        return new C52547z10(paymentClient, analyticsManager, preference, reactiveConfig, userManager, birdDeviceCheckManagerManager);
    }

    @Provides
    /* renamed from: s0 */
    public final InterfaceC46893pU4 m80036s0(InterfaceC35660Rh6 userStream) {
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        return new C48079rU4(userStream);
    }

    @Provides
    /* renamed from: t */
    public final InterfaceC44257l20 m80035t(P10 braze) {
        Intrinsics.checkNotNullParameter(braze, "braze");
        return new C44850m20(braze);
    }

    @Provides
    /* renamed from: t0 */
    public final InterfaceC41018fa5 m80034t0(InterfaceC40425ea5 riderProfileClient) {
        Intrinsics.checkNotNullParameter(riderProfileClient, "riderProfileClient");
        return new C43390ja5(riderProfileClient);
    }

    @Provides
    /* renamed from: u */
    public final InterfaceC36176Tn0 m80033u(InterfaceC43515jn0 commandCenterClient) {
        Intrinsics.checkNotNullParameter(commandCenterClient, "commandCenterClient");
        return new C36410Un0(commandCenterClient);
    }

    @Provides
    /* renamed from: u0 */
    public final InterfaceC49339tc5 m80032u0(InterfaceC45782nc5 routingClient) {
        Intrinsics.checkNotNullParameter(routingClient, "routingClient");
        return new C49932uc5(routingClient);
    }

    @Provides
    /* renamed from: v */
    public final InterfaceC32684Ep0 m80031v(InterfaceC32450Dp0 communicationOptInClient, InterfaceC1880Ea analyticsManager, InterfaceC35660Rh6 userStream) {
        Intrinsics.checkNotNullParameter(communicationOptInClient, "communicationOptInClient");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        return new C33620Ip0(communicationOptInClient, analyticsManager, userStream);
    }

    @Provides
    /* renamed from: v0 */
    public final InterfaceC48164rd5 m80030v0(InterfaceC31654Ae5 rxBleVehicleManager, InterfaceC25136kJ birdBluetoothApiManager, InterfaceC1880Ea analyticsManager, InterfaceC10636aM birdManager) {
        Intrinsics.checkNotNullParameter(rxBleVehicleManager, "rxBleVehicleManager");
        Intrinsics.checkNotNullParameter(birdBluetoothApiManager, "birdBluetoothApiManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        return new C37261Yd5(rxBleVehicleManager, birdBluetoothApiManager, analyticsManager, birdManager);
    }

    @Provides
    /* renamed from: w */
    public final InterfaceC34088Kp0 m80029w(InterfaceC33854Jp0 communityClient) {
        Intrinsics.checkNotNullParameter(communityClient, "communityClient");
        return new C34322Lp0(communityClient, null, 2, null);
    }

    @Provides
    /* renamed from: w0 */
    public final InterfaceC40565eo5 m80028w0(InterfaceC41741gn5 scrapClient) {
        Intrinsics.checkNotNullParameter(scrapClient, "scrapClient");
        return new C41158fo5(scrapClient);
    }

    @Provides
    /* renamed from: x */
    public final InterfaceC52458ys0 m80027x(InterfaceC51865xs0 client) {
        Intrinsics.checkNotNullParameter(client, "client");
        return new C53051zs0(client);
    }

    @Provides
    /* renamed from: x0 */
    public final InterfaceC33193Gt5 m80026x0(InterfaceC32023Bt5 client, InterfaceC44647lh6 userManager, InterfaceC1880Ea analyticsManager) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        return new C34597Mt5(client, userManager, analyticsManager);
    }

    @Provides
    /* renamed from: y */
    public final InterfaceC47153pv0 m80025y(InterfaceC6097Oh buildConfig, InterfaceC36119Tg6 client, C22454gl preference, C36207Tq4 reactiveConfig, GI3 partnerManager, InterfaceC40001dr4 reactiveLocationManager) {
        Intrinsics.checkNotNullParameter(buildConfig, "buildConfig");
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(partnerManager, "partnerManager");
        Intrinsics.checkNotNullParameter(reactiveLocationManager, "reactiveLocationManager");
        return new C52488yv0(buildConfig, client, preference, reactiveConfig, partnerManager, reactiveLocationManager);
    }

    @Provides
    /* renamed from: y0 */
    public final InterfaceC47178px5 m80024y0(InterfaceC35660Rh6 userStream, LL3 paymentClient, Stripe stripe, AM3 paymentManagerV2, InterfaceC44647lh6 userManager, C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager, C22454gl preference, InterfaceC20357fL birdDeviceCheckManagerManager) {
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(paymentClient, "paymentClient");
        Intrinsics.checkNotNullParameter(stripe, "stripe");
        Intrinsics.checkNotNullParameter(paymentManagerV2, "paymentManagerV2");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(birdDeviceCheckManagerManager, "birdDeviceCheckManagerManager");
        return new C32995Fx5(userStream, paymentClient, stripe, paymentManagerV2, userManager, reactiveConfig, analyticsManager, preference, birdDeviceCheckManagerManager);
    }

    @Provides
    /* renamed from: z */
    public final ConnectivityManager m80023z(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return (ConnectivityManager) systemService;
    }

    @Provides
    /* renamed from: z0 */
    public final InterfaceC47825r30 m80022z0(InterfaceC47232q30 bugReportClient, InterfaceC40001dr4 reactiveLocationManager, InterfaceC40476ef6 uploadManager, Context context) {
        Intrinsics.checkNotNullParameter(bugReportClient, "bugReportClient");
        Intrinsics.checkNotNullParameter(reactiveLocationManager, "reactiveLocationManager");
        Intrinsics.checkNotNullParameter(uploadManager, "uploadManager");
        Intrinsics.checkNotNullParameter(context, "context");
        return new C50788w30(bugReportClient, reactiveLocationManager, uploadManager, context);
    }
}
