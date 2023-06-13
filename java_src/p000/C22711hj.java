package p000;

import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Looper;
import androidx.core.app.NotificationManagerCompat;
import androidx.lifecycle.C11736n;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.App;
import co.bird.android.app.feature.main.MainActivity;
import co.bird.android.auth.api.json.TokenPairTypeAdapter;
import co.bird.android.config.tweaks.dsl.Tweaks;
import co.bird.android.lib.webview.bridge.AbstractC16030b;
import co.bird.android.lib.webview.bridge.C16034c;
import co.bird.android.lib.webview.bridge.C16036d;
import co.bird.android.lib.webview.bridge.WebPayloadTypeAdapterFactory;
import co.bird.android.manager.analytics.persistence.AnalyticsDatabase;
import co.bird.android.manager.hardcount.persistence.HardCountDatabase;
import co.bird.android.manager.localasset.persistence.AssetDatabase;
import co.bird.android.model.DynamicLinkConfiguration;
import co.bird.android.model.Point;
import co.bird.android.model.Polygon;
import co.bird.android.model.TokenPair;
import co.bird.android.model.ZigZagVehiclesResponse;
import co.bird.android.model.constant.DeserializerKind;
import co.bird.android.persistence.announcements.AnnouncementDatabase;
import co.bird.android.persistence.announcements.ConfigurableTutorialDatabase;
import co.bird.android.persistence.area.impl.AreaDatabase;
import co.bird.android.persistence.bird.impl.BirdDatabase;
import co.bird.android.persistence.birdplus.BirdPlusViewDatabase;
import co.bird.android.persistence.birdratinghistory.BirdRatingHistoryDatabase;
import co.bird.android.persistence.bountyflightsheet.impl.BountyDatabase;
import co.bird.android.persistence.brainswap.impl.BrainSwapDatabase;
import co.bird.android.persistence.complaintresolution.impl.ComplaintResolutionDatabase;
import co.bird.android.persistence.fleetreport.impl.FleetReportDatabase;
import co.bird.android.persistence.fleetstatus.impl.FleetStatusDatabase;
import co.bird.android.persistence.flightsheet.impl.FlightSheetDatabase;
import co.bird.android.persistence.hardcount.impl.HardCountScanDatabase;
import co.bird.android.persistence.hibernation.impl.HibernationDatabase;
import co.bird.android.persistence.nestflightsheet.impl.NestFlightSheetDatabase;
import co.bird.android.persistence.nestmarker.impl.NestMarkerDatabase;
import co.bird.android.persistence.notificationcenter.impl.NotificationCenterDatabase;
import co.bird.android.persistence.operatorallocation.OperatorAllocationDatabase;
import co.bird.android.persistence.operatorfilter.impl.OperatorFilterDatabase;
import co.bird.android.persistence.operatororderview.OperatorOrderViewDatabase;
import co.bird.android.persistence.operatortaskv2.impl.OperatorTaskV2Database;
import co.bird.android.persistence.releaseassignment.ReleaseAssignmentDatabase;
import co.bird.android.persistence.ridepassview.RidePassViewDatabase;
import co.bird.android.persistence.scraporderview.ScrapOrderViewDatabase;
import co.bird.android.persistence.warehouseflightsheet.impl.WarehouseFlightSheetDatabase;
import co.bird.android.persistence.warehousemarker.impl.WarehouseMarkerDatabase;
import co.bird.android.persistence.zone.impl.ZoneDatabase;
import co.bird.api.json.LocalDateTimeTypeAdapter;
import co.bird.api.json.LocalDateTypeAdapter;
import co.bird.api.json.NokelockResponseTypeAdapter;
import co.bird.api.json.ZigZagTypeAdapter;
import co.bird.api.response.NokelockResponse;
import co.bird.gson.android.factories.EnumTypeAdapterFactory;
import co.bird.gson.android.typeadapters.DateTimeTypeAdapter;
import co.bird.gson.android.typeadapters.PointTypeAdapter;
import com.appboy.Appboy;
import com.auth0.android.jwt.JWT;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.module.kotlin.KotlinModule;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import dagger.Module;
import dagger.Provides;
import dagger.Reusable;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import no.nordicsemi.android.ble.AbstractC26684u0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import p000.AbstractC32563Eb5;
import p000.U10;
@Metadata(m28433d1 = {"\u0000\u0092\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\b\u0010Ý\u0001\u001a\u00030Û\u0001¢\u0006\u0006\bÞ\u0001\u0010ß\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010\t\u001a\u00020\bH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J\b\u0010\r\u001a\u00020\fH\u0007J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0007J\b\u0010\u0018\u001a\u00020\u0017H\u0007J\b\u0010\u001a\u001a\u00020\u0019H\u0007J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0007J\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0007J!\u0010\"\u001a\u00020\u00102\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020\u001f\u0012\t\u0012\u00070\u001b¢\u0006\u0002\b 0\u001eH\u0007J\b\u0010$\u001a\u00020#H\u0007J\u0010\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0018\u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u000eH\u0007J\u0010\u0010-\u001a\u00020,2\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0010\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020,H\u0007J\u0010\u00102\u001a\u0002012\u0006\u0010.\u001a\u00020,H\u0007J\u0010\u00104\u001a\u0002032\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0010\u00106\u001a\u0002052\u0006\u0010.\u001a\u000203H\u0007J\u0010\u00108\u001a\u0002072\u0006\u0010.\u001a\u000203H\u0007J\u0010\u0010:\u001a\u0002092\u0006\u0010.\u001a\u00020,H\u0007J\u0010\u0010<\u001a\u00020;2\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0010\u0010>\u001a\u00020=2\u0006\u0010.\u001a\u00020;H\u0007J\u0010\u0010@\u001a\u00020?2\u0006\u0010.\u001a\u00020;H\u0007J\u0010\u0010B\u001a\u00020A2\u0006\u0010%\u001a\u00020\u0004H\u0007J\n\u0010D\u001a\u0004\u0018\u00010CH\u0007J\b\u0010F\u001a\u00020EH\u0007J\b\u0010H\u001a\u00020GH\u0007J\u0010\u0010J\u001a\u00020I2\u0006\u0010%\u001a\u00020\u0004H\u0007J\b\u0010L\u001a\u00020KH\u0007J\u0010\u0010N\u001a\u00020M2\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0010\u0010P\u001a\u00020O2\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0010\u0010R\u001a\u00020Q2\u0006\u0010.\u001a\u00020OH\u0007J\u0010\u0010T\u001a\u00020S2\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0010\u0010V\u001a\u00020U2\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0010\u0010X\u001a\u00020W2\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0010\u0010\\\u001a\u00020[2\u0006\u0010Z\u001a\u00020YH\u0007J\u0010\u0010^\u001a\u00020]2\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0010\u0010`\u001a\u00020_2\u0006\u0010.\u001a\u00020]H\u0007J\u0010\u0010b\u001a\u00020a2\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0010\u0010d\u001a\u00020c2\u0006\u0010.\u001a\u00020aH\u0007J\u0010\u0010f\u001a\u00020e2\u0006\u0010.\u001a\u00020aH\u0007J\u0010\u0010h\u001a\u00020g2\u0006\u0010.\u001a\u00020aH\u0007J\u0010\u0010j\u001a\u00020i2\u0006\u0010.\u001a\u00020aH\u0007J\u0010\u0010l\u001a\u00020k2\u0006\u0010.\u001a\u00020aH\u0007J\u0010\u0010n\u001a\u00020m2\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0010\u0010p\u001a\u00020o2\u0006\u0010.\u001a\u00020mH\u0007J\u0010\u0010r\u001a\u00020q2\u0006\u0010.\u001a\u00020mH\u0007J\u0010\u0010t\u001a\u00020s2\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0010\u0010v\u001a\u00020u2\u0006\u0010.\u001a\u00020sH\u0007J\u0010\u0010x\u001a\u00020w2\u0006\u0010.\u001a\u00020sH\u0007J\u0010\u0010z\u001a\u00020y2\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0010\u0010|\u001a\u00020{2\u0006\u0010.\u001a\u00020yH\u0007J\u0010\u0010\u007f\u001a\u00020~2\u0006\u0010.\u001a\u00020}H\u0007J\u0011\u0010\u0080\u0001\u001a\u00020}2\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0012\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0013\u0010\u0084\u0001\u001a\u00030\u0083\u00012\u0007\u0010.\u001a\u00030\u0081\u0001H\u0007J\u0012\u0010\u0086\u0001\u001a\u00030\u0085\u00012\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0013\u0010\u0088\u0001\u001a\u00030\u0087\u00012\u0007\u0010.\u001a\u00030\u0085\u0001H\u0007J\u0012\u0010\u008a\u0001\u001a\u00030\u0089\u00012\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0013\u0010\u008c\u0001\u001a\u00030\u008b\u00012\u0007\u0010.\u001a\u00030\u0089\u0001H\u0007J\u0012\u0010\u008e\u0001\u001a\u00030\u008d\u00012\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0013\u0010\u0090\u0001\u001a\u00030\u008f\u00012\u0007\u0010.\u001a\u00030\u008d\u0001H\u0007J\u0012\u0010\u0092\u0001\u001a\u00030\u0091\u00012\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0013\u0010\u0094\u0001\u001a\u00030\u0093\u00012\u0007\u0010.\u001a\u00030\u0091\u0001H\u0007J\u0012\u0010\u0096\u0001\u001a\u00030\u0095\u00012\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0013\u0010\u0098\u0001\u001a\u00030\u0097\u00012\u0007\u0010.\u001a\u00030\u0095\u0001H\u0007J\u0012\u0010\u009a\u0001\u001a\u00030\u0099\u00012\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0013\u0010\u009c\u0001\u001a\u00030\u009b\u00012\u0007\u0010.\u001a\u00030\u0099\u0001H\u0007J\u0012\u0010\u009e\u0001\u001a\u00030\u009d\u00012\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0013\u0010 \u0001\u001a\u00030\u009f\u00012\u0007\u0010.\u001a\u00030\u009d\u0001H\u0007J\u0013\u0010¢\u0001\u001a\u00030¡\u00012\u0007\u0010.\u001a\u00030\u009d\u0001H\u0007J\u0012\u0010¤\u0001\u001a\u00030£\u00012\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0013\u0010¦\u0001\u001a\u00030¥\u00012\u0007\u0010.\u001a\u00030£\u0001H\u0007J\u0012\u0010¨\u0001\u001a\u00030§\u00012\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0013\u0010ª\u0001\u001a\u00030©\u00012\u0007\u0010.\u001a\u00030§\u0001H\u0007J\u0012\u0010¬\u0001\u001a\u00030«\u00012\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0013\u0010®\u0001\u001a\u00030\u00ad\u00012\u0007\u0010.\u001a\u00030«\u0001H\u0007J\u0012\u0010°\u0001\u001a\u00030¯\u00012\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0013\u0010²\u0001\u001a\u00030±\u00012\u0007\u0010.\u001a\u00030¯\u0001H\u0007J\u0012\u0010´\u0001\u001a\u00030³\u00012\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0013\u0010¶\u0001\u001a\u00030µ\u00012\u0007\u0010.\u001a\u00030³\u0001H\u0007J\u0012\u0010¸\u0001\u001a\u00030·\u00012\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0013\u0010º\u0001\u001a\u00030¹\u00012\u0007\u0010.\u001a\u00030·\u0001H\u0007J\u0012\u0010¼\u0001\u001a\u00030»\u00012\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0013\u0010¾\u0001\u001a\u00030½\u00012\u0007\u0010.\u001a\u00030»\u0001H\u0007J\u0013\u0010À\u0001\u001a\u00030¿\u00012\u0007\u0010.\u001a\u00030»\u0001H\u0007J\u0012\u0010Â\u0001\u001a\u00030Á\u00012\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0013\u0010Ä\u0001\u001a\u00030Ã\u00012\u0007\u0010.\u001a\u00030Á\u0001H\u0007J\u0013\u0010Æ\u0001\u001a\u00030Å\u00012\u0007\u0010.\u001a\u00030Á\u0001H\u0007J\u0013\u0010È\u0001\u001a\u00030Ç\u00012\u0007\u0010.\u001a\u00030Á\u0001H\u0007J\u0012\u0010Ê\u0001\u001a\u00030É\u00012\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0013\u0010Ì\u0001\u001a\u00030Ë\u00012\u0007\u0010.\u001a\u00030É\u0001H\u0007J\u0012\u0010Î\u0001\u001a\u00030Í\u00012\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0013\u0010Ð\u0001\u001a\u00030Ï\u00012\u0007\u0010.\u001a\u00030Í\u0001H\u0007J\u0012\u0010Ò\u0001\u001a\u00030Ñ\u00012\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0013\u0010Ô\u0001\u001a\u00030Ó\u00012\u0007\u0010.\u001a\u00030Ñ\u0001H\u0007J\u0014\u0010Ö\u0001\u001a\u0005\u0018\u00010Õ\u00012\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0014\u0010×\u0001\u001a\u0005\u0018\u00010Õ\u00012\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0012\u0010Ù\u0001\u001a\u00030Ø\u00012\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0012\u0010Ú\u0001\u001a\u00030Ø\u00012\u0006\u0010%\u001a\u00020\u0004H\u0007R\u0017\u0010Ý\u0001\u001a\u00030Û\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bD\u0010Ü\u0001¨\u0006à\u0001"}, m28432d2 = {"Lhj;", "", "Landroid/app/Application;", "m", "Landroid/content/Context;", "n", "Landroid/content/res/Resources;", "K0", "Landroid/os/Handler;", "o0", "Lm46;", "Q0", "LEg1;", "O", "Lgl;", "preference", "Lwi2;", "deserializer", "LTq4;", "I0", "Lco/bird/android/config/tweaks/dsl/Tweaks;", "tweaks", "l", "LBX1;", "j0", "LOh;", "k", "LF01;", "c0", "k0", "", "Lco/bird/android/model/constant/DeserializerKind;", "Lkotlin/jvm/JvmSuppressWildcards;", "deserializers", "l0", "LBc;", "h", CoreConstants.CONTEXT_SCOPE_VALUE, "LUI4;", "a0", "buildConfig", "appPreferences", "LP10;", "b", "Lco/bird/android/persistence/bird/impl/BirdDatabase;", "s", "database", "LbL;", "r", "LJM;", "t", "Lco/bird/android/persistence/bountyflightsheet/impl/BountyDatabase;", "y", "LK00;", "z", "LM00;", "A", "Li40;", "D", "Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase;", "G", "LOq0;", "H", "LMq0;", "I", "Lde5;", "N0", "Landroid/bluetooth/BluetoothAdapter;", C17296a.f69688o, "Landroid/content/pm/PackageManager;", "f", "Landroid/location/LocationManager;", DateTokenConverter.CONVERTER_KEY, "Landroidx/core/app/NotificationManagerCompat;", "e", "LLifecycleOwner;", "G0", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "b0", "Lco/bird/android/manager/localasset/persistence/AssetDatabase;", "m0", "LLo;", "q", "Lco/bird/android/manager/analytics/persistence/AnalyticsDatabase;", "g", "Lco/bird/android/model/DynamicLinkConfiguration;", "c", "Landroid/content/Intent;", "n0", "LWV0;", "impl", "LNV0;", "N", "Lco/bird/android/manager/hardcount/persistence/HardCountDatabase;", "e0", "LiF1;", "d0", "Lco/bird/android/persistence/fleetstatus/impl/FleetStatusDatabase;", "W", "Lvr1;", "X", "Lwq1;", "V", "Lwo1;", "P", "LXo1;", "Q", "Lfp1;", "R", "Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase;", "T", "Lzp1;", "S", "LNp1;", "U", "Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase;", "y0", "Lwo3;", "z0", "LAw3;", "F0", "Lco/bird/android/persistence/flightsheet/impl/FlightSheetDatabase;", "Y", "LBs1;", "Z", "Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase;", "LlH1;", "f0", "g0", "Lco/bird/android/persistence/announcements/AnnouncementDatabase;", "j", "Leg;", "i", "Lco/bird/android/persistence/ridepassview/RidePassViewDatabase;", "M0", "LCX4;", "L0", "Lco/bird/android/persistence/birdplus/BirdPlusViewDatabase;", "u", "LlR;", "v", "Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database;", "E0", "Lww3;", "D0", "Lco/bird/android/persistence/hibernation/impl/HibernationDatabase;", "i0", "LSL1;", "h0", "Lco/bird/android/persistence/area/impl/AreaDatabase;", "p", "LXm;", "o", "Lco/bird/android/persistence/operatorallocation/OperatorAllocationDatabase;", "w0", "Lri3;", "x0", "Lco/bird/android/persistence/operatororderview/OperatorOrderViewDatabase;", "B0", "Lbq3;", "C0", "LSp3;", "A0", "Lco/bird/android/persistence/scraporderview/ScrapOrderViewDatabase;", "P0", "Lhp5;", "O0", "Lco/bird/android/persistence/announcements/ConfigurableTutorialDatabase;", "K", "LRv0;", "J", "Lco/bird/android/persistence/releaseassignment/ReleaseAssignmentDatabase;", "J0", "LxI6;", "V0", "Lco/bird/android/persistence/birdratinghistory/BirdRatingHistoryDatabase;", "x", "LCR;", "w", "Lco/bird/android/persistence/nestmarker/impl/NestMarkerDatabase;", "s0", "Le43;", "r0", "Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase;", "q0", "LJ33;", "p0", "Lco/bird/android/persistence/zone/impl/ZoneDatabase;", "X0", "LCI6;", "W0", "LMI6;", "Y0", "Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase;", "t0", "Lro3;", "E", "LPc3;", "v0", "LBc3;", AbstractC26684u0.f100690q, "Lco/bird/android/persistence/brainswap/impl/BrainSwapDatabase;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Ll10;", "B", "Lco/bird/android/persistence/warehousemarker/impl/WarehouseMarkerDatabase;", "U0", "LWy6;", "T0", "Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase;", "S0", "LKy6;", "R0", "Landroid/graphics/drawable/Drawable;", "F", "H0", "", "M", "L", "Lco/bird/android/App;", "Lco/bird/android/App;", Stripe3ds2AuthParams.FIELD_APP, "<init>", "(Lco/bird/android/App;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@Module(includes = {AbstractC5649Nh.class})
@SourceDebugExtension({"SMAP\nAppModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppModule.kt\nco/bird/android/runtime/module/AppModule\n+ 2 IntentBuilder.kt\nco/bird/android/navigator/IntentBuilderKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1204:1\n30#2,2:1205\n32#2:1208\n61#2,26:1209\n33#2:1235\n34#2:1237\n13579#3:1207\n13580#3:1236\n*S KotlinDebug\n*F\n+ 1 AppModule.kt\nco/bird/android/runtime/module/AppModule\n*L\n617#1:1205,2\n617#1:1208\n617#1:1209,26\n617#1:1235\n617#1:1237\n617#1:1207\n617#1:1236\n*E\n"})
/* renamed from: hj */
/* loaded from: classes4.dex */
public final class C22711hj {

    /* renamed from: a */
    public final App f85785a;

    public C22711hj(App app) {
        Intrinsics.checkNotNullParameter(app, "app");
        this.f85785a = app;
    }

    @Provides
    /* renamed from: A */
    public final M00 m36058A(BountyDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55307D();
    }

    @Provides
    /* renamed from: A0 */
    public final AbstractC35963Sp3 m36057A0(OperatorOrderViewDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55120C();
    }

    @Provides
    /* renamed from: B */
    public final AbstractC44247l10 m36056B(BrainSwapDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55295C();
    }

    @Provides
    /* renamed from: B0 */
    public final OperatorOrderViewDatabase m36055B0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (OperatorOrderViewDatabase) C32329Db5.m110126a(context, OperatorOrderViewDatabase.class, "operator_order_view.db").m108710b(C32111Cd3.f4411c, C32345Dd3.f6107c).m108707e().m108708d();
    }

    @Provides
    /* renamed from: C */
    public final BrainSwapDatabase m36054C(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (BrainSwapDatabase) C32329Db5.m110126a(context, BrainSwapDatabase.class, "brain_swaps.db").m108707e().m108708d();
    }

    @Provides
    /* renamed from: C0 */
    public final AbstractC38787bq3 m36053C0(OperatorOrderViewDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55119D();
    }

    @Provides
    /* renamed from: D */
    public final AbstractC42498i40 m36052D(BirdDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55344E();
    }

    @Provides
    /* renamed from: D0 */
    public final AbstractC51315ww3 m36051D0(OperatorTaskV2Database database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55107C();
    }

    @Provides
    /* renamed from: E */
    public final AbstractC48272ro3 m36050E(NotificationCenterDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55159C();
    }

    @Provides
    /* renamed from: E0 */
    public final OperatorTaskV2Database m36049E0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (OperatorTaskV2Database) C32329Db5.m110126a(context, OperatorTaskV2Database.class, "operator_task_group.db").m108710b(C52501yw3.m2238a()).m108707e().m108708d();
    }

    @Provides
    /* renamed from: F */
    public final Drawable m36048F(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return NA0.m94299e(context, C52342yg4.ic_code_scooter);
    }

    @Provides
    /* renamed from: F0 */
    public final AbstractC31814Aw3 m36047F0(OperatorFilterDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55132D();
    }

    @Provides
    /* renamed from: G */
    public final ComplaintResolutionDatabase m36046G(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        return (ComplaintResolutionDatabase) C32329Db5.m110126a(applicationContext, ComplaintResolutionDatabase.class, "complaint_resolution.db").m108707e().m108708d();
    }

    @Provides
    /* renamed from: G0 */
    public final LifecycleOwner m36045G0() {
        return C11736n.f54943j.m66965a();
    }

    @Provides
    /* renamed from: H */
    public final AbstractC35033Oq0 m36044H(ComplaintResolutionDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55265C();
    }

    @Provides
    /* renamed from: H0 */
    public final Drawable m36043H0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return NA0.m94299e(context, C52342yg4.ic_qr_scooter);
    }

    @Provides
    /* renamed from: I */
    public final AbstractC34565Mq0 m36042I(ComplaintResolutionDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55264D();
    }

    @Provides
    /* renamed from: I0 */
    public final C36207Tq4 m36041I0(C22454gl preference, C51174wi2 deserializer) {
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return new C36207Tq4(preference, deserializer);
    }

    @Provides
    /* renamed from: J */
    public final AbstractC35780Rv0 m36040J(ConfigurableTutorialDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55370C();
    }

    @Provides
    /* renamed from: J0 */
    public final ReleaseAssignmentDatabase m36039J0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (ReleaseAssignmentDatabase) C32329Db5.m110126a(context, ReleaseAssignmentDatabase.class, "release_assignment.db").m108710b(C41810gu4.m37347a(), C41810gu4.m37346b(), C41810gu4.m37345c()).m108707e().m108708d();
    }

    @Provides
    /* renamed from: K */
    public final ConfigurableTutorialDatabase m36038K(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (ConfigurableTutorialDatabase) C32329Db5.m110126a(context, ConfigurableTutorialDatabase.class, "configurable_tutorial.db").m108707e().m108708d();
    }

    @Provides
    /* renamed from: K0 */
    public final Resources m36037K0() {
        Resources resources = this.f85785a.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "app.resources");
        return resources;
    }

    @Provides
    /* renamed from: L */
    public final String m36036L(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45278ml4.deeplink_host_gift);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.deeplink_host_gift)");
        return string;
    }

    @Provides
    /* renamed from: L0 */
    public final CX4 m36035L0(RidePassViewDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55083C();
    }

    @Provides
    /* renamed from: M */
    public final String m36034M(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45278ml4.deeplink_host_go);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.deeplink_host_go)");
        return string;
    }

    @Provides
    /* renamed from: M0 */
    public final RidePassViewDatabase m36033M0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (RidePassViewDatabase) C32329Db5.m110126a(context, RidePassViewDatabase.class, "ride_pass_view.db").m108710b(EX4.m108846a(), EX4.m108845b(), EX4.m108844c(), EX4.m108843d(), EX4.m108842e()).m108707e().m108708d();
    }

    @Provides
    /* renamed from: N */
    public final NV0 m36032N(WV0 impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        return impl;
    }

    @Provides
    /* renamed from: N0 */
    public final AbstractC39873de5 m36031N0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AbstractC39873de5 m43954a = AbstractC39873de5.m43954a(context);
        Intrinsics.checkNotNullExpressionValue(m43954a, "create(context)");
        return m43954a;
    }

    @Provides
    /* renamed from: O */
    public final InterfaceC32604Eg1 m36030O() {
        return new C33072Gg1();
    }

    @Provides
    /* renamed from: O0 */
    public final AbstractC42354hp5 m36029O0(ScrapOrderViewDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55071C();
    }

    @Provides
    /* renamed from: P */
    public final AbstractC51233wo1 m36028P(FleetStatusDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55239C();
    }

    @Provides
    /* renamed from: P0 */
    public final ScrapOrderViewDatabase m36027P0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (ScrapOrderViewDatabase) C32329Db5.m110126a(context, ScrapOrderViewDatabase.class, "scrap_order.db").m108707e().m108708d();
    }

    @Provides
    /* renamed from: Q */
    public final AbstractC37122Xo1 m36026Q(FleetStatusDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55238D();
    }

    @Provides
    /* renamed from: Q0 */
    public final InterfaceC44876m46 m36025Q0() {
        return InterfaceC44876m46.f97292a.m26388a();
    }

    @Provides
    /* renamed from: R */
    public final AbstractC41164fp1 m36024R(FleetStatusDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55237E();
    }

    @Provides
    /* renamed from: R0 */
    public final AbstractC34175Ky6 m36023R0(WarehouseFlightSheetDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55059C();
    }

    @Provides
    /* renamed from: S */
    public final AbstractC53022zp1 m36022S(FleetReportDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55252C();
    }

    @Provides
    /* renamed from: S0 */
    public final WarehouseFlightSheetDatabase m36021S0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (WarehouseFlightSheetDatabase) C32329Db5.m110126a(context, WarehouseFlightSheetDatabase.class, "warehouse_flight_sheet.db").m108707e().m108708d();
    }

    @Provides
    /* renamed from: T */
    public final FleetReportDatabase m36020T(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (FleetReportDatabase) C32329Db5.m110126a(context, FleetReportDatabase.class, "fleet_report.db").m108707e().m108708d();
    }

    @Provides
    /* renamed from: T0 */
    public final AbstractC36983Wy6 m36019T0(WarehouseMarkerDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55047C();
    }

    @Provides
    /* renamed from: U */
    public final AbstractC34791Np1 m36018U(FleetReportDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55251D();
    }

    @Provides
    /* renamed from: U0 */
    public final WarehouseMarkerDatabase m36017U0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (WarehouseMarkerDatabase) C32329Db5.m110126a(context, WarehouseMarkerDatabase.class, "warehouse_markers.db").m108707e().m108708d();
    }

    @Provides
    /* renamed from: V */
    public final AbstractC51253wq1 m36016V(FleetStatusDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55236F();
    }

    @Provides
    /* renamed from: V0 */
    public final AbstractC51529xI6 m36015V0(ReleaseAssignmentDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55095C();
    }

    @Provides
    /* renamed from: W */
    public final FleetStatusDatabase m36014W(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (FleetStatusDatabase) C32329Db5.m110126a(context, FleetStatusDatabase.class, "fleet_status.db").m108710b(C52439yq1.m2473a(), C52439yq1.m2472b(), C52439yq1.m2471c(), C52439yq1.m2470d(), C52439yq1.m2469e(), C52439yq1.m2468f(), C52439yq1.m2467g()).m108707e().m108708d();
    }

    @Provides
    /* renamed from: W0 */
    public final CI6 m36013W0(ZoneDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55035C();
    }

    @Provides
    /* renamed from: X */
    public final AbstractC50670vr1 m36012X(FleetStatusDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55235G();
    }

    @Provides
    /* renamed from: X0 */
    public final ZoneDatabase m36011X0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (ZoneDatabase) C32329Db5.m110126a(context, ZoneDatabase.class, "zone.db").m108710b(FI6.m107333a()).m108707e().m108708d();
    }

    @Provides
    /* renamed from: Y */
    public final FlightSheetDatabase m36010Y(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (FlightSheetDatabase) C32329Db5.m110126a(context, FlightSheetDatabase.class, "flight_sheet.db").m108710b(C53052zs1.m206a(), C53052zs1.m205b(), C53052zs1.m204c(), C53052zs1.m203d()).m108707e().m108708d();
    }

    @Provides
    /* renamed from: Y0 */
    public final MI6 m36009Y0(ZoneDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55034D();
    }

    @Provides
    /* renamed from: Z */
    public final AbstractC32010Bs1 m36008Z(FlightSheetDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55223C();
    }

    @Provides
    /* renamed from: a */
    public final BluetoothAdapter m36007a() {
        return BluetoothAdapter.getDefaultAdapter();
    }

    @Provides
    /* renamed from: a0 */
    public final UI4 m36006a0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        UI4 m53138t = ComponentCallbacks2C17096a.m53138t(context);
        Intrinsics.checkNotNullExpressionValue(m53138t, "with(context)");
        return m53138t;
    }

    @Provides
    /* renamed from: b */
    public final P10 m36005b(InterfaceC6097Oh buildConfig, C22454gl appPreferences) {
        Intrinsics.checkNotNullParameter(buildConfig, "buildConfig");
        Intrinsics.checkNotNullParameter(appPreferences, "appPreferences");
        Appboy.configure(this.f85785a, new U10.C8173a().m82153O(C6841Qh.m88190a(buildConfig, appPreferences.m37699O())).m82147U(true).m82149S(true).m82146V(true).m82152P(this.f85785a.getColor(C32364Df4.brandAccent)).m82144a());
        P10 p10 = P10.getInstance(this.f85785a);
        Intrinsics.checkNotNullExpressionValue(p10, "getInstance(app)");
        return p10;
    }

    @Provides
    /* renamed from: b0 */
    public final GoogleSignInClient m36004b0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        GoogleSignInOptions build = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestIdToken(context.getString(C47057pl4.google_client_id)).requestEmail().build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder(GoogleSignInOpti…estEmail()\n      .build()");
        GoogleSignInClient client = GoogleSignIn.getClient(context, build);
        Intrinsics.checkNotNullExpressionValue(client, "getClient(context, gso)");
        return client;
    }

    @Provides
    /* renamed from: c */
    public final DynamicLinkConfiguration m36003c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = "https://" + context.getString(C45278ml4.deeplink_host_gift);
        String string = context.getString(C45278ml4.ios_bundle_id);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.ios_bundle_id)");
        String string2 = context.getString(C45278ml4.ios_app_store_id);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.string.ios_app_store_id)");
        return new DynamicLinkConfiguration(str, string, string2);
    }

    @Provides
    /* renamed from: c0 */
    public final F01 m36002c0(Tweaks tweaks) {
        Intrinsics.checkNotNullParameter(tweaks, "tweaks");
        C46153oE1 gson = new C46746pE1().m19806d().m19804f(BigDecimal.class, new C3456IG()).m19804f(DateTime.class, new DateTimeTypeAdapter()).m19804f(LocalDateTime.class, new LocalDateTimeTypeAdapter()).m19804f(LocalDate.class, new LocalDateTypeAdapter()).m19803g(new EnumTypeAdapterFactory()).m19804f(Point.class, new PointTypeAdapter()).m19804f(Polygon.class, new IX3()).m19804f(NokelockResponse.class, new NokelockResponseTypeAdapter()).m19804f(TokenPair.class, new TokenPairTypeAdapter()).m19804f(Tweaks.class, new C46959pb6(tweaks)).m19803g(new WebPayloadTypeAdapterFactory()).m19804f(AbstractC16030b.class, new C16036d()).m19804f(ZigZagVehiclesResponse.class, new ZigZagTypeAdapter()).m19802h().m19801i(EnumC36618Vk1.f39679f).m19807c().m19799k().m19808b();
        Intrinsics.checkNotNullExpressionValue(gson, "gson");
        return new C47932rE1(gson);
    }

    @Provides
    /* renamed from: d */
    public final LocationManager m36001d() {
        Object systemService = this.f85785a.getSystemService("location");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        return (LocationManager) systemService;
    }

    @Provides
    /* renamed from: d0 */
    public final AbstractC42604iF1 m36000d0(HardCountDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55728C();
    }

    @Provides
    /* renamed from: e */
    public final NotificationManagerCompat m35999e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        NotificationManagerCompat from = NotificationManagerCompat.from(context);
        Intrinsics.checkNotNullExpressionValue(from, "from(context)");
        return from;
    }

    @Provides
    /* renamed from: e0 */
    public final HardCountDatabase m35998e0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (HardCountDatabase) C32329Db5.m110126a(context, HardCountDatabase.class, "hardcount.db").m108707e().m108708d();
    }

    @Provides
    /* renamed from: f */
    public final PackageManager m35997f() {
        PackageManager packageManager = this.f85785a.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "app.packageManager");
        return packageManager;
    }

    @Provides
    /* renamed from: f0 */
    public final AbstractC44401lH1 m35996f0(HardCountScanDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55211C();
    }

    @Provides
    /* renamed from: g */
    public final AnalyticsDatabase m35995g(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (AnalyticsDatabase) C32329Db5.m110126a(context, AnalyticsDatabase.class, "analytics.db").m108707e().m108708d();
    }

    @Provides
    /* renamed from: g0 */
    public final HardCountScanDatabase m35994g0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (HardCountScanDatabase) C32329Db5.m110126a(context, HardCountScanDatabase.class, "hard_count_scan.db").m108707e().m108708d();
    }

    @Provides
    /* renamed from: h */
    public final InterfaceC0650Bc m35993h() {
        return new C1075Cc(this.f85785a);
    }

    @Provides
    /* renamed from: h0 */
    public final SL1 m35992h0(HibernationDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55199C();
    }

    @Provides
    /* renamed from: i */
    public final AbstractC20087eg m35991i(AnnouncementDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55382C();
    }

    @Provides
    /* renamed from: i0 */
    public final HibernationDatabase m35990i0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (HibernationDatabase) C32329Db5.m110126a(context, HibernationDatabase.class, "hibernation.db").m108707e().m108708d();
    }

    @Provides
    /* renamed from: j */
    public final AnnouncementDatabase m35989j(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (AnnouncementDatabase) C32329Db5.m110126a(context, AnnouncementDatabase.class, "announcement.db").m108710b(C22405gg.m37917a(), C22405gg.m37916b(), C22405gg.m37915c()).m108707e().m108708d();
    }

    @Provides
    /* renamed from: j0 */
    public final BX1 m35988j0() {
        UI4 m53138t = ComponentCallbacks2C17096a.m53138t(this.f85785a.getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(m53138t, "with(app.applicationContext)");
        return new CX1(m53138t);
    }

    @Provides
    @Reusable
    /* renamed from: k */
    public final InterfaceC6097Oh m35987k() {
        return new C6450Ph();
    }

    @Provides
    /* renamed from: k0 */
    public final F01 m35986k0(Tweaks tweaks) {
        Intrinsics.checkNotNullParameter(tweaks, "tweaks");
        SimpleModule simpleModule = new SimpleModule();
        simpleModule.addSerializer(BigDecimal.class, new C3113HG());
        simpleModule.addSerializer(DateTime.class, new C45694nT0());
        simpleModule.addSerializer(LocalDateTime.class, new C35539Qu2());
        simpleModule.addSerializer(LocalDate.class, new C35071Ou2());
        simpleModule.addSerializer(Point.class, new VW3());
        simpleModule.addSerializer(Polygon.class, new HX3());
        simpleModule.addSerializer(JWT.class, new C46422oh2());
        simpleModule.addSerializer(Tweaks.class, new C46366ob6());
        simpleModule.addSerializer(AbstractC16030b.class, new C37694Zz6());
        simpleModule.addSerializer(ZigZagVehiclesResponse.class, new C47973rI6());
        simpleModule.addDeserializer(BigDecimal.class, new NumberDeserializers.BigDecimalDeserializer());
        simpleModule.addDeserializer(DateTime.class, new C44508lT0());
        simpleModule.addDeserializer(LocalDateTime.class, new C35305Pu2());
        simpleModule.addDeserializer(LocalDate.class, new C34837Nu2());
        simpleModule.addDeserializer(Point.class, new IW3());
        simpleModule.addDeserializer(Polygon.class, new GX3());
        simpleModule.addDeserializer(JWT.class, new C45236mh2());
        simpleModule.addDeserializer(Tweaks.class, new C39844db6(tweaks));
        simpleModule.addDeserializer(AbstractC16030b.class, new C16034c());
        simpleModule.addDeserializer(ZigZagVehiclesResponse.class, new C47380qI6());
        simpleModule.addDeserializer(NokelockResponse.class, new V83());
        C44029kf1 c44029kf1 = new C44029kf1(null, 1, null);
        c44029kf1.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        c44029kf1.configure(SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
        c44029kf1.configure(SerializationFeature.INDENT_OUTPUT, true);
        c44029kf1.configure(DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES, false);
        c44029kf1.configure(DeserializationFeature.FAIL_ON_NULL_CREATOR_PROPERTIES, false);
        c44029kf1.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        c44029kf1.configure(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY, true);
        c44029kf1.registerModule(simpleModule);
        c44029kf1.registerModule(new KotlinModule(0, false, false, true, null, false, 55, null));
        return new C48201rh2(c44029kf1);
    }

    @Provides
    /* renamed from: l */
    public final C22454gl m35985l(C51174wi2 deserializer, Tweaks tweaks) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(tweaks, "tweaks");
        return new C22454gl(this.f85785a, deserializer, tweaks);
    }

    @Provides
    /* renamed from: l0 */
    public final C51174wi2 m35984l0(Map<DeserializerKind, F01> deserializers) {
        Intrinsics.checkNotNullParameter(deserializers, "deserializers");
        return new C51174wi2(deserializers);
    }

    @Provides
    /* renamed from: m */
    public final Application m35983m() {
        return this.f85785a;
    }

    @Provides
    /* renamed from: m0 */
    public final AssetDatabase m35982m0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (AssetDatabase) C32329Db5.m110126a(context, AssetDatabase.class, "assets.db").m108710b(C6155Oo.m91392a()).m108707e().m108708d();
    }

    @Provides
    /* renamed from: n */
    public final Context m35981n() {
        Context applicationContext = this.f85785a.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "app.applicationContext");
        return applicationContext;
    }

    @Provides
    /* renamed from: n0 */
    public final Intent m35980n0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new Intent(context, MainActivity.class);
    }

    @Provides
    /* renamed from: o */
    public final AbstractC9490Xm m35979o(AreaDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55358C();
    }

    @Provides
    /* renamed from: o0 */
    public final Handler m35978o0() {
        return new Handler(Looper.getMainLooper());
    }

    @Provides
    /* renamed from: p */
    public final AreaDatabase m35977p(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (AreaDatabase) C32329Db5.m110126a(context, AreaDatabase.class, "area.db").m108710b(C10372Zm.m72543a()).m108710b(C10372Zm.m72542b()).m108710b(C10372Zm.m72541c()).m108707e().m108708d();
    }

    @Provides
    /* renamed from: p0 */
    public final J33 m35976p0(NestFlightSheetDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55187C();
    }

    @Provides
    /* renamed from: q */
    public final AbstractC5089Lo m35975q(AssetDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55619C();
    }

    @Provides
    /* renamed from: q0 */
    public final NestFlightSheetDatabase m35974q0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (NestFlightSheetDatabase) C32329Db5.m110126a(context, NestFlightSheetDatabase.class, "nest_flight_sheet.db").m108710b(L33.m97893a(), L33.m97892b(), L33.m97891c(), L33.m97890d()).m108707e().m108708d();
    }

    @Provides
    /* renamed from: r */
    public final AbstractC12358bL m35973r(BirdDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55346C();
    }

    @Provides
    /* renamed from: r0 */
    public final AbstractC40129e43 m35972r0(NestMarkerDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55171C();
    }

    @Provides
    /* renamed from: s */
    public final BirdDatabase m35971s(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        return (BirdDatabase) C32329Db5.m110126a(applicationContext, BirdDatabase.class, "Bird.db").m108710b(C5548NM.m94039d(), C5548NM.m94038e(), C5548NM.m94037f(), C5548NM.m94036g(), C5548NM.m94035h(), C5548NM.m94034i(), C5548NM.m94033j(), C5548NM.m94032k(), C5548NM.m94042a(), C5548NM.m94041b(), C5548NM.m94040c()).m108707e().m108708d();
    }

    @Provides
    /* renamed from: s0 */
    public final NestMarkerDatabase m35970s0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AbstractC32563Eb5.C1898a m110126a = C32329Db5.m110126a(context, NestMarkerDatabase.class, "nest_markers.db");
        NestMarkerDatabase.C16302e c16302e = NestMarkerDatabase.f66854p;
        return (NestMarkerDatabase) m110126a.m108710b(c16302e.m55175a(), c16302e.m55174b(), c16302e.m55173c(), c16302e.m55172d()).m108707e().m108708d();
    }

    @Provides
    /* renamed from: t */
    public final AbstractC4030JM m35969t(BirdDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55345D();
    }

    @Provides
    /* renamed from: t0 */
    public final NotificationCenterDatabase m35968t0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (NotificationCenterDatabase) C32329Db5.m110126a(context, NotificationCenterDatabase.class, "notification_center.db").m108707e().m108708d();
    }

    @Provides
    /* renamed from: u */
    public final BirdPlusViewDatabase m35967u(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (BirdPlusViewDatabase) C32329Db5.m110126a(context, BirdPlusViewDatabase.class, "bird_plus_view.db").m108707e().m108708d();
    }

    @Provides
    /* renamed from: u0 */
    public final AbstractC31868Bc3 m35966u0(NotificationCenterDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55158D();
    }

    @Provides
    /* renamed from: v */
    public final AbstractC25698lR m35965v(BirdPlusViewDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55332C();
    }

    @Provides
    /* renamed from: v0 */
    public final AbstractC35144Pc3 m35964v0(NotificationCenterDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55157E();
    }

    @Provides
    /* renamed from: w */
    public final AbstractC1025CR m35963w(BirdRatingHistoryDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55320C();
    }

    @Provides
    /* renamed from: w0 */
    public final OperatorAllocationDatabase m35962w0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (OperatorAllocationDatabase) C32329Db5.m110126a(context, OperatorAllocationDatabase.class, "sku_order.db").m108707e().m108708d();
    }

    @Provides
    /* renamed from: x */
    public final BirdRatingHistoryDatabase m35961x(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (BirdRatingHistoryDatabase) C32329Db5.m110126a(context, BirdRatingHistoryDatabase.class, "bird_rating_history.db").m108707e().m108708d();
    }

    @Provides
    /* renamed from: x0 */
    public final AbstractC48212ri3 m35960x0(OperatorAllocationDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55145C();
    }

    @Provides
    /* renamed from: y */
    public final BountyDatabase m35959y(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        return (BountyDatabase) C32329Db5.m110126a(applicationContext, BountyDatabase.class, "bounty_flight_sheet.db").m108710b(B00.m114799a()).m108707e().m108708d();
    }

    @Provides
    /* renamed from: y0 */
    public final OperatorFilterDatabase m35958y0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (OperatorFilterDatabase) C32329Db5.m110126a(context, OperatorFilterDatabase.class, "operator_filter.db").m108710b(C37322Yk3.m74340a(), C37322Yk3.m74339b(), C37322Yk3.m74338c(), C37322Yk3.m74337d()).m108707e().m108708d();
    }

    @Provides
    /* renamed from: z */
    public final K00 m35957z(BountyDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55308C();
    }

    @Provides
    /* renamed from: z0 */
    public final AbstractC51235wo3 m35956z0(OperatorFilterDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.mo55133C();
    }
}
