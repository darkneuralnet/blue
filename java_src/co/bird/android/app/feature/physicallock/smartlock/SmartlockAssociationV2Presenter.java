package co.bird.android.app.feature.physicallock.smartlock;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.physicallock.smartlock.C14176c;
import co.bird.android.app.feature.physicallock.smartlock.InterfaceC14174b;
import co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter;
import co.bird.android.app.manager.SmartlockManagerImpl;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.constant.PhysicalLockPurpose;
import co.bird.android.model.constant.ScanMode;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WirePhysicalLock;
import co.bird.api.request.GenerateKeyBody;
import co.bird.api.request.PromoteKeyBody;
import co.bird.api.request.ReplacePhysicalLockBody;
import co.bird.api.response.SmartlockKey;
import co.bird.api.response.SmartlockResponse;
import com.amazonaws.services.p026s3.internal.crypto.JceEncryptionConstants;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.C24576w;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.schedulers.C24542a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import no.nordicsemi.android.ble.AbstractC26684u0;
import p000.H31;
import p000.InterfaceC42042hI5;
import p000.InterfaceC5225MD;
@Metadata(m28433d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u0093\u00012\u00020\u0001:\u0004E\u0094\u0001IBa\b\u0007\u0012\u0006\u0010G\u001a\u00020D\u0012\u0006\u0010K\u001a\u00020H\u0012\u0006\u0010O\u001a\u00020L\u0012\u0006\u0010S\u001a\u00020P\u0012\u0006\u0010W\u001a\u00020T\u0012\b\b\u0001\u0010[\u001a\u00020X\u0012\u000e\b\u0001\u0010`\u001a\b\u0012\u0004\u0012\u00020]0\\\u0012\b\b\u0001\u0010d\u001a\u00020a\u0012\b\b\u0001\u0010h\u001a\u00020e¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00132\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010H\u0002J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0013H\u0002J\u0014\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0013H\u0002J\f\u0010\u001b\u001a\u00020\u000b*\u00020\u001aH\u0002J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013H\u0002J\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00132\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0010H\u0002J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\u00132\u0006\u0010 \u001a\u00020\u0010H\u0002J\f\u0010\"\u001a\u00020\u0010*\u00020\u000bH\u0002J\u0010\u0010#\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0010H\u0002J\u0010\u0010$\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0010H\u0002J\u0010\u0010&\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0010H\u0002J\u0010\u0010'\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0010H\u0002J\b\u0010(\u001a\u00020\u0010H\u0002J\u000e\u0010*\u001a\u0004\u0018\u00010)*\u00020\u0015H\u0002J\u000e\u0010+\u001a\u0004\u0018\u00010)*\u00020\u0015H\u0002J\n\u0010,\u001a\u0004\u0018\u00010)H\u0002J\n\u0010-\u001a\u0004\u0018\u00010)H\u0002J\b\u0010.\u001a\u00020\u0010H\u0002J\b\u0010/\u001a\u00020\u0010H\u0002J\b\u00100\u001a\u00020\u0010H\u0002J\b\u00101\u001a\u00020\u0010H\u0002J\b\u00102\u001a\u00020\u0010H\u0002J\u0018\u00104\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u0010H\u0002J\u0018\u00105\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u0010H\u0002J\f\u00106\u001a\u00020\r*\u00020\u0010H\u0002J\f\u00107\u001a\u00020\r*\u00020\u0010H\u0002J\u000e\u00109\u001a\u0004\u0018\u000108*\u00020\u0010H\u0002J\f\u0010:\u001a\u00020\r*\u00020\u0010H\u0002J\f\u0010;\u001a\u00020\r*\u00020\u0010H\u0002J\f\u0010<\u001a\u00020\r*\u00020\u0010H\u0002J\f\u0010=\u001a\u00020\r*\u00020\u0010H\u0002J\f\u0010>\u001a\u00020\r*\u00020\u0010H\u0002J\f\u0010?\u001a\u00020\r*\u00020\u0010H\u0002J\f\u0010@\u001a\u00020\r*\u00020\u0010H\u0002J\f\u0010A\u001a\u00020\r*\u00020\u0010H\u0002J\f\u0010B\u001a\u00020\u0010*\u00020\u0010H\u0002J\f\u0010C\u001a\u00020\r*\u00020\u0010H\u0002R\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020]0\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010h\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010j\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010\u0019R\u0016\u0010l\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010\u0019R\u0016\u0010n\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010\u0019R\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020\u000b0o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010v\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0016\u0010y\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010|\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bz\u0010{R\u0018\u0010\u007f\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R)\u0010\u008a\u0001\u001a\u0014\u0012\u000f\u0012\r \u0087\u0001*\u0005\u0018\u00010\u0086\u00010\u0086\u00010\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R)\u0010\u008e\u0001\u001a\u0014\u0012\u000f\u0012\r \u0087\u0001*\u0005\u0018\u00010\u0086\u00010\u0086\u00010\u008b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R'\u0010\u0090\u0001\u001a\u0012\u0012\r\u0012\u000b \u0087\u0001*\u0004\u0018\u00010\u00020\u00020\u008b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u008d\u0001¨\u0006\u0095\u0001"}, m28432d2 = {"Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;", "", "", "b1", "Lco/bird/android/model/wire/WireBird;", "bird", "Y0", "C1", "I1", "S0", "y0", "", CoreConstants.CONTEXT_SCOPE_VALUE, "", "success", "P1", "", "payload", "aesKey", "Lio/reactivex/F;", "y1", "Lco/bird/api/response/SmartlockResponse;", "v1", "LHM4;", "Lco/bird/android/model/wire/WirePhysicalLock;", "Z", "Lco/bird/android/model/constant/PhysicalLockPurpose;", "N1", "A1", "oldPassword", "newPassword", "d0", "targetAesKey", "b0", "k0", "X0", "V0", "newAesKey", "x0", "w0", "L1", "Lco/bird/api/response/SmartlockKey;", "W0", "x1", "g0", "i0", "f0", "Y", "h0", "H1", "M1", "key", "l0", "j0", "p0", AbstractC26684u0.f100690q, "Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$b;", "O1", "t0", "m0", "v0", "q0", "n0", "r0", "s0", "K1", "B1", "o0", "LMD;", C17296a.f69688o, "LMD;", "baseBluetoothManager", "LhI5;", "b", "LhI5;", "smartlockClient", "LJy4;", "c", "LJy4;", "repairClient", "Lgl;", DateTokenConverter.CONVERTER_KEY, "Lgl;", "preference", "LEa;", "e", "LEa;", "analyticsManager", "LDQ3;", "f", "LDQ3;", "permissionManager", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "g", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "Lco/bird/android/app/feature/physicallock/smartlock/b;", "h", "Lco/bird/android/app/feature/physicallock/smartlock/b;", "ui", "Le13;", "i", "Le13;", "navigator", "j", "useProvisionalPassword", "k", "useProvisionalAesKey", "l", "usedProvisionalAesKeyForTokenRequest", "", "m", "Ljava/util/List;", "seenLockMacAddresses", "Lke5;", "n", "Lke5;", "smartlockConnection", "o", "Ljava/lang/String;", "macAddress", "p", "[B", "sessionToken", "q", "Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$b;", "sessionTokenResponse", "r", "Lco/bird/api/response/SmartlockResponse;", "smartlockResponse", "s", "Lco/bird/android/model/wire/WireBird;", "LCG4;", "LTk5;", "kotlin.jvm.PlatformType", "t", "LCG4;", "bluetoothScanResults", "Lma4;", "u", "Lma4;", "scanResultRelay", "v", "tokenRequestsRelay", "<init>", "(LMD;LhI5;LJy4;Lgl;LEa;LDQ3;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/app/feature/physicallock/smartlock/b;Le13;)V", "w", "NotConnected", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSmartlockAssociationV2Presenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartlockAssociationV2Presenter.kt\nco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,878:1\n180#2:879\n180#2:880\n180#2:881\n180#2:882\n180#2:883\n180#2:884\n180#2:885\n180#2:886\n180#2:887\n199#2:888\n199#2:889\n288#3,2:890\n288#3,2:892\n*S KotlinDebug\n*F\n+ 1 SmartlockAssociationV2Presenter.kt\nco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter\n*L\n129#1:879\n157#1:880\n171#1:881\n185#1:882\n211#1:883\n221#1:884\n253#1:885\n264#1:886\n295#1:887\n536#1:888\n557#1:889\n726#1:890,2\n727#1:892,2\n*E\n"})
/* loaded from: classes2.dex */
public final class SmartlockAssociationV2Presenter {

    /* renamed from: w */
    public static final C14092a f62074w = new C14092a(null);

    /* renamed from: x */
    public static final int f62075x = 8;

    /* renamed from: y */
    public static final byte[] f62076y = {6, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a */
    public final InterfaceC5225MD f62077a;

    /* renamed from: b */
    public final InterfaceC42042hI5 f62078b;

    /* renamed from: c */
    public final InterfaceC33939Jy4 f62079c;

    /* renamed from: d */
    public final C22454gl f62080d;

    /* renamed from: e */
    public final InterfaceC1880Ea f62081e;

    /* renamed from: f */
    public final DQ3 f62082f;

    /* renamed from: g */
    public final LifecycleScopeProvider<EnumC7097RE> f62083g;

    /* renamed from: h */
    public final InterfaceC14174b f62084h;

    /* renamed from: i */
    public final InterfaceC40099e13 f62085i;

    /* renamed from: j */
    public boolean f62086j;

    /* renamed from: k */
    public boolean f62087k;

    /* renamed from: l */
    public boolean f62088l;

    /* renamed from: m */
    public final List<String> f62089m;

    /* renamed from: n */
    public InterfaceC44023ke5 f62090n;

    /* renamed from: o */
    public String f62091o;

    /* renamed from: p */
    public byte[] f62092p;

    /* renamed from: q */
    public C14094b f62093q;

    /* renamed from: r */
    public SmartlockResponse f62094r;

    /* renamed from: s */
    public WireBird f62095s;

    /* renamed from: t */
    public final CG4<C36154Tk5> f62096t;

    /* renamed from: u */
    public final C45168ma4<C36154Tk5> f62097u;

    /* renamed from: v */
    public final C45168ma4<Unit> f62098v;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/wire/WirePhysicalLock;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$A */
    /* loaded from: classes2.dex */
    public static final class C14066A extends Lambda implements Function1<HM4<WirePhysicalLock>, Unit> {
        public C14066A() {
            super(1);
        }

        /* renamed from: a */
        public final void m59873a(HM4<WirePhysicalLock> hm4) {
            SmartlockAssociationV2Presenter.this.f62084h.mo59683g0(false);
            SmartlockAssociationV2Presenter.this.f62084h.mo59678s0(true);
            SmartlockAssociationV2Presenter.this.f62084h.mo59695N(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<WirePhysicalLock> hm4) {
            m59873a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$B */
    /* loaded from: classes2.dex */
    public static final class C14067B extends Lambda implements Function1<Throwable, Unit> {
        public C14067B() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            SmartlockAssociationV2Presenter.this.f62084h.error(th.getMessage());
            SmartlockAssociationV2Presenter.this.f62084h.mo59683g0(false);
            SmartlockAssociationV2Presenter.this.f62084h.mo59699H0(true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$C */
    /* loaded from: classes2.dex */
    public static final class C14068C extends Lambda implements Function1<Unit, InterfaceC23447K<? extends byte[]>> {
        public C14068C() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends byte[]> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return SmartlockAssociationV2Presenter.this.m60017A1();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$D */
    /* loaded from: classes2.dex */
    public static final class C14069D extends Lambda implements Function1<Unit, InterfaceC23447K<? extends WireBird>> {
        public C14069D() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends WireBird> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return InterfaceC14174b.C14175a.operatorScanForBird$default(SmartlockAssociationV2Presenter.this.f62084h, ScanMode.ADMIN, null, null, 6, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$E */
    /* loaded from: classes2.dex */
    public static final class C14070E extends Lambda implements Function1<Throwable, Unit> {
        public C14070E() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            SmartlockAssociationV2Presenter.this.f62084h.errorGeneric();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$F */
    /* loaded from: classes2.dex */
    public static final class C14071F extends Lambda implements Function1<WireBird, Unit> {
        public C14071F() {
            super(1);
        }

        /* renamed from: a */
        public final void m59872a(WireBird it) {
            SmartlockAssociationV2Presenter smartlockAssociationV2Presenter = SmartlockAssociationV2Presenter.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            smartlockAssociationV2Presenter.m59954Y0(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m59872a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$G */
    /* loaded from: classes2.dex */
    public static final class C14072G extends Lambda implements Function1<Unit, Unit> {
        public C14072G() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            SmartlockAssociationV2Presenter.this.f62084h.mo59683g0(true);
            SmartlockAssociationV2Presenter.this.f62084h.mo59699H0(false);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LHM4;", "Lco/bird/android/model/wire/WirePhysicalLock;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$H */
    /* loaded from: classes2.dex */
    public static final class C14073H extends Lambda implements Function1<Unit, InterfaceC23447K<? extends HM4<WirePhysicalLock>>> {
        public C14073H() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends HM4<WirePhysicalLock>> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return SmartlockAssociationV2Presenter.this.m59953Z();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$I */
    /* loaded from: classes2.dex */
    public static final class C14074I extends Lambda implements Function1<Throwable, Unit> {
        public C14074I() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            if (S36.m86051a(it)) {
                SmartlockAssociationV2Presenter.this.f62084h.error(C45871nl4.error_network);
                SmartlockAssociationV2Presenter.this.f62084h.mo59699H0(true);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "e", "", C17296a.f69688o, "(Ljava/lang/Throwable;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$J */
    /* loaded from: classes2.dex */
    public static final class C14075J extends Lambda implements Function1<Throwable, Boolean> {

        /* renamed from: g */
        public static final C14075J f62108g = new C14075J();

        public C14075J() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Throwable e) {
            Intrinsics.checkNotNullParameter(e, "e");
            return Boolean.valueOf(S36.m86051a(e));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052B\u0010\u0004\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001 \u0003*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lio/reactivex/w;", "LHM4;", "Lco/bird/android/model/wire/WirePhysicalLock;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/w;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$K */
    /* loaded from: classes2.dex */
    public static final class C14076K extends Lambda implements Function1<C24576w<HM4<WirePhysicalLock>>, Unit> {
        public C14076K() {
            super(1);
        }

        /* renamed from: a */
        public final void m59870a(C24576w<HM4<WirePhysicalLock>> c24576w) {
            SmartlockAssociationV2Presenter.this.f62084h.mo59683g0(false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C24576w<HM4<WirePhysicalLock>> c24576w) {
            m59870a(c24576w);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/wire/WirePhysicalLock;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$L */
    /* loaded from: classes2.dex */
    public static final class C14077L extends Lambda implements Function1<HM4<WirePhysicalLock>, Unit> {
        public C14077L() {
            super(1);
        }

        /* renamed from: a */
        public final void m59869a(HM4<WirePhysicalLock> hm4) {
            SmartlockAssociationV2Presenter.this.f62084h.mo59678s0(true);
            SmartlockAssociationV2Presenter.this.f62084h.mo59695N(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<WirePhysicalLock> hm4) {
            m59869a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$M */
    /* loaded from: classes2.dex */
    public static final class C14078M extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public static final C14078M f62111g = new C14078M();

        public C14078M() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$N */
    /* loaded from: classes2.dex */
    public static final class C14079N extends Lambda implements Function1<Throwable, Unit> {
        public C14079N() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            SmartlockAssociationV2Presenter.this.f62084h.error(th.getMessage());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$NotConnected;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes2.dex */
    public static final class NotConnected extends Exception {

        /* renamed from: b */
        public static final NotConnected f62113b = new NotConnected();

        private NotConnected() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$O */
    /* loaded from: classes2.dex */
    public static final class C14080O extends Lambda implements Function1<Unit, Unit> {
        public C14080O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            SmartlockAssociationV2Presenter.this.f62084h.mo59695N(false);
            SmartlockAssociationV2Presenter.this.f62084h.mo59689W(true);
            SmartlockAssociationV2Presenter.this.f62084h.mo59679r();
            SmartlockAssociationV2Presenter.this.f62084h.mo59688a0(true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$P */
    /* loaded from: classes2.dex */
    public static final class C14081P extends Lambda implements Function0<Unit> {
        public C14081P() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SmartlockAssociationV2Presenter.this.f62085i.close();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$Q */
    /* loaded from: classes2.dex */
    public static final class C14082Q extends Lambda implements Function1<Unit, Unit> {
        public C14082Q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            SmartlockAssociationV2Presenter.this.f62085i.mo37030e3();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$R */
    /* loaded from: classes2.dex */
    public static final class C14083R extends Lambda implements Function1<Unit, Unit> {
        public C14083R() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            SmartlockAssociationV2Presenter.this.f62084h.mo59687c1(false);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/api/response/SmartlockResponse;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$S */
    /* loaded from: classes2.dex */
    public static final class C14084S extends Lambda implements Function1<Unit, InterfaceC23447K<? extends SmartlockResponse>> {
        public C14084S() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends SmartlockResponse> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return SmartlockAssociationV2Presenter.this.m59886v1();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$T */
    /* loaded from: classes2.dex */
    public static final class C14085T extends Lambda implements Function1<Throwable, Unit> {
        public C14085T() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            if (S36.m86051a(it)) {
                SmartlockAssociationV2Presenter.this.f62084h.error(C45871nl4.error_network);
                SmartlockAssociationV2Presenter.this.f62084h.mo59687c1(true);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "e", "", C17296a.f69688o, "(Ljava/lang/Throwable;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$U */
    /* loaded from: classes2.dex */
    public static final class C14086U extends Lambda implements Function1<Throwable, Boolean> {

        /* renamed from: g */
        public static final C14086U f62120g = new C14086U();

        public C14086U() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Throwable e) {
            Intrinsics.checkNotNullParameter(e, "e");
            return Boolean.valueOf(S36.m86051a(e));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/SmartlockResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/api/response/SmartlockResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$V */
    /* loaded from: classes2.dex */
    public static final class C14087V extends Lambda implements Function1<SmartlockResponse, Unit> {
        public C14087V() {
            super(1);
        }

        /* renamed from: a */
        public final void m59867a(SmartlockResponse smartlockResponse) {
            SmartlockAssociationV2Presenter.this.f62084h.mo59700A1(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SmartlockResponse smartlockResponse) {
            m59867a(smartlockResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$W */
    /* loaded from: classes2.dex */
    public static final class C14088W extends Lambda implements Function1<Throwable, Unit> {
        public C14088W() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            SmartlockAssociationV2Presenter.this.f62084h.error(th.getMessage());
            SmartlockAssociationV2Presenter.this.f62084h.mo59687c1(true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/SmartlockResponse;", "response", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/SmartlockResponse;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$X */
    /* loaded from: classes2.dex */
    public static final class C14089X extends Lambda implements Function1<SmartlockResponse, InterfaceC23447K<? extends SmartlockResponse>> {

        /* renamed from: g */
        public static final C14089X f62123g = new C14089X();

        public C14089X() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends SmartlockResponse> invoke(SmartlockResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            C41318g46.m40163a("got a response from API: " + response, new Object[0]);
            if (response.getNeedsRekey()) {
                return AbstractC23442F.m33100x(new Throwable("Did not promote to provisional"));
            }
            return AbstractC23442F.m33158H(response);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "Lco/bird/android/app/feature/physicallock/smartlock/c$b;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$Y */
    /* loaded from: classes2.dex */
    public static final class C14090Y extends Lambda implements Function1<Unit, InterfaceC24574u<? extends C14176c.EnumC14178b>> {
        public C14090Y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends C14176c.EnumC14178b> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return SmartlockAssociationV2Presenter.this.f62084h.mo59686dg(C45871nl4.smartlock_select_lock_purpose_type);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/app/feature/physicallock/smartlock/c$b;", "kotlin.jvm.PlatformType", "selectedOption", "", C17296a.f69688o, "(Lco/bird/android/app/feature/physicallock/smartlock/c$b;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$Z */
    /* loaded from: classes2.dex */
    public static final class C14091Z extends Lambda implements Function1<C14176c.EnumC14178b, Unit> {
        public C14091Z() {
            super(1);
        }

        /* renamed from: a */
        public final void m59864a(C14176c.EnumC14178b enumC14178b) {
            SmartlockAssociationV2Presenter.this.f62084h.mo59684e4(SmartlockAssociationV2Presenter.m60008D1(enumC14178b.m59674j()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C14176c.EnumC14178b enumC14178b) {
            m59864a(enumC14178b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$a;", "", "", "FACTORY_DEFAULT_KEY", "Ljava/lang/String;", "FACTORY_PASSWORD", "", "TOKEN_REQUEST", "[B", "", "TOKEN_REQUEST_TIMEOUT_SECONDS", "J", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$a */
    /* loaded from: classes2.dex */
    public static final class C14092a {
        public /* synthetic */ C14092a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C14092a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/app/feature/physicallock/smartlock/c$b;", "kotlin.jvm.PlatformType", "selectedOption", "", C17296a.f69688o, "(Lco/bird/android/app/feature/physicallock/smartlock/c$b;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$a0 */
    /* loaded from: classes2.dex */
    public static final class C14093a0 extends Lambda implements Function1<C14176c.EnumC14178b, Unit> {
        public C14093a0() {
            super(1);
        }

        /* renamed from: a */
        public final void m59863a(C14176c.EnumC14178b enumC14178b) {
            SmartlockAssociationV2Presenter.this.f62080d.m37705M1(enumC14178b.m59674j());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C14176c.EnumC14178b enumC14178b) {
            m59863a(enumC14178b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u001a\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0015\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u001d\u0010\u000eR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\b¨\u0006$"}, m28432d2 = {"Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$b;", "", "", "toString", "", C17296a.f69688o, "[B", "getRaw", "()[B", "raw", "", "b", "B", "getLength", "()B", "length", "c", "getSessionToken", "sessionToken", DateTokenConverter.CONVERTER_KEY, "getChipType", "chipType", "e", "getVersion", "version", "f", "getProductNumber", "productNumber", "g", "getLockState", "lockState", "h", "getTotalLockCount", "totalLockCount", "<init>", "([B)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$b */
    /* loaded from: classes2.dex */
    public static final class C14094b {

        /* renamed from: a */
        public final byte[] f62127a;

        /* renamed from: b */
        public final byte f62128b;

        /* renamed from: c */
        public final byte[] f62129c;

        /* renamed from: d */
        public final byte f62130d;

        /* renamed from: e */
        public final byte[] f62131e;

        /* renamed from: f */
        public final byte[] f62132f;

        /* renamed from: g */
        public final byte f62133g;

        /* renamed from: h */
        public final byte[] f62134h;

        public C14094b(byte[] raw) {
            byte[] sliceArray;
            byte[] sliceArray2;
            byte[] sliceArray3;
            byte[] sliceArray4;
            Intrinsics.checkNotNullParameter(raw, "raw");
            this.f62127a = raw;
            this.f62128b = raw[2];
            sliceArray = ArraysKt___ArraysKt.sliceArray(raw, new IntRange(3, 6));
            this.f62129c = sliceArray;
            this.f62130d = raw[7];
            sliceArray2 = ArraysKt___ArraysKt.sliceArray(raw, new IntRange(8, 9));
            this.f62131e = sliceArray2;
            sliceArray3 = ArraysKt___ArraysKt.sliceArray(raw, new IntRange(10, 11));
            this.f62132f = sliceArray3;
            this.f62133g = raw[12];
            sliceArray4 = ArraysKt___ArraysKt.sliceArray(raw, new IntRange(13, 14));
            this.f62134h = sliceArray4;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String arrays = Arrays.toString(this.f62127a);
            Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
            sb.append("raw response: " + arrays);
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
            byte b = this.f62128b;
            sb.append("length: " + ((int) b));
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
            String arrays2 = Arrays.toString(this.f62129c);
            Intrinsics.checkNotNullExpressionValue(arrays2, "toString(this)");
            sb.append("session token: " + arrays2);
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
            byte b2 = this.f62130d;
            sb.append("chip type: " + ((int) b2));
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
            String arrays3 = Arrays.toString(this.f62131e);
            Intrinsics.checkNotNullExpressionValue(arrays3, "toString(this)");
            sb.append("version: " + arrays3);
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
            String arrays4 = Arrays.toString(this.f62132f);
            Intrinsics.checkNotNullExpressionValue(arrays4, "toString(this)");
            sb.append("product number: " + arrays4);
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
            byte b3 = this.f62133g;
            sb.append("lock state: " + ((int) b3));
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
            String arrays5 = Arrays.toString(this.f62134h);
            Intrinsics.checkNotNullExpressionValue(arrays5, "toString(this)");
            sb.append("total unlocks: " + arrays5);
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "builder.toString()");
            return sb2;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LTk5;", "it", "", C17296a.f69688o, "(LTk5;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$b0 */
    /* loaded from: classes2.dex */
    public static final class C14095b0 extends Lambda implements Function1<C36154Tk5, Boolean> {

        /* renamed from: g */
        public static final C14095b0 f62135g = new C14095b0();

        public C14095b0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C36154Tk5 it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (C12325bE.m64814b(it) && !C12325bE.m64813c(it)) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$c */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C14096c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PhysicalLockPurpose.values().length];
            try {
                iArr[PhysicalLockPurpose.HELMET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/wire/WirePhysicalLock;", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$d */
    /* loaded from: classes2.dex */
    public static final class C14097d extends Lambda implements Function1<HM4<WirePhysicalLock>, InterfaceC23447K<? extends HM4<WirePhysicalLock>>> {

        /* renamed from: g */
        public static final C14097d f62136g = new C14097d();

        public C14097d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends HM4<WirePhysicalLock>> invoke(HM4<WirePhysicalLock> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.m103939f()) {
                return AbstractC23442F.m33158H(it);
            }
            return AbstractC23442F.m33100x(new Throwable("Unable to associate lock to Bird"));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "invoke", "([B)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$e */
    /* loaded from: classes2.dex */
    public static final class C14098e extends Lambda implements Function1<byte[], InterfaceC23447K<? extends byte[]>> {

        /* renamed from: h */
        public final /* synthetic */ byte[] f62138h;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$e$a */
        /* loaded from: classes2.dex */
        public static final class C14099a extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ SmartlockAssociationV2Presenter f62139g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14099a(SmartlockAssociationV2Presenter smartlockAssociationV2Presenter) {
                super(1);
                this.f62139g = smartlockAssociationV2Presenter;
            }

            /* renamed from: a */
            public final void m59859a(InterfaceC23465c interfaceC23465c) {
                C41318g46.m40163a("updating to use provisional key moving forward...", new Object[0]);
                this.f62139g.f62087k = true;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m59859a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14098e(byte[] bArr) {
            super(1);
            this.f62138h = bArr;
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends byte[]> invoke(byte[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            SmartlockAssociationV2Presenter smartlockAssociationV2Presenter = SmartlockAssociationV2Presenter.this;
            AbstractC23442F m59874z1 = SmartlockAssociationV2Presenter.m59874z1(smartlockAssociationV2Presenter, smartlockAssociationV2Presenter.m59884w0(this.f62138h), null, 2, null);
            final C14099a c14099a = new C14099a(SmartlockAssociationV2Presenter.this);
            return m59874z1.m33102v(new InterfaceC23484g() { // from class: GH5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    SmartlockAssociationV2Presenter.C14098e.invoke$lambda$0(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "invoke", "([B)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$f */
    /* loaded from: classes2.dex */
    public static final class C14100f extends Lambda implements Function1<byte[], InterfaceC23447K<? extends byte[]>> {

        /* renamed from: h */
        public final /* synthetic */ byte[] f62141h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14100f(byte[] bArr) {
            super(1);
            this.f62141h = bArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends byte[]> invoke(byte[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            SmartlockAssociationV2Presenter smartlockAssociationV2Presenter = SmartlockAssociationV2Presenter.this;
            return SmartlockAssociationV2Presenter.m59874z1(smartlockAssociationV2Presenter, smartlockAssociationV2Presenter.m59960V0(this.f62141h), null, 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u009a\u0001\u0012F\b\u0001\u0012B\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002* \u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00050\u0005 \u0002*L\u0012F\b\u0001\u0012B\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002* \u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "notificationObservable", "Lio/reactivex/B;", "Lkotlin/Pair;", "invoke", "(Lio/reactivex/Observable;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$g */
    /* loaded from: classes2.dex */
    public static final class C14101g extends Lambda implements Function1<Observable<byte[]>, InterfaceC23434B<? extends Pair<? extends byte[], ? extends byte[]>>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$g$a */
        /* loaded from: classes2.dex */
        public static final class C14102a extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ SmartlockAssociationV2Presenter f62143g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14102a(SmartlockAssociationV2Presenter smartlockAssociationV2Presenter) {
                super(1);
                this.f62143g = smartlockAssociationV2Presenter;
            }

            /* renamed from: a */
            public final void m59857a(InterfaceC23465c interfaceC23465c) {
                this.f62143g.f62098v.accept(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m59857a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        public C14101g() {
            super(1);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Pair<byte[], byte[]>> invoke(Observable<byte[]> notificationObservable) {
            Intrinsics.checkNotNullParameter(notificationObservable, "notificationObservable");
            C41318g46.m40163a("notifications set up", new Object[0]);
            C24523e c24523e = C24523e.f91168a;
            Observable m33123k0 = SmartlockAssociationV2Presenter.m59874z1(SmartlockAssociationV2Presenter.this, SmartlockAssociationV2Presenter.f62076y, null, 2, null).m33123k0();
            final C14102a c14102a = new C14102a(SmartlockAssociationV2Presenter.this);
            Observable doOnSubscribe = m33123k0.doOnSubscribe(new InterfaceC23484g() { // from class: HH5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    SmartlockAssociationV2Presenter.C14101g.invoke$lambda$0(Function1.this, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "private fun listenForSma…\")\n        }\n      })\n  }");
            return c24523e.m31956a(doOnSubscribe, notificationObservable);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\u0010\u0004\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\"\u0010\u0003\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Pair;)[B"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$h */
    /* loaded from: classes2.dex */
    public static final class C14103h extends Lambda implements Function1<Pair<? extends byte[], ? extends byte[]>, byte[]> {

        /* renamed from: g */
        public static final C14103h f62144g = new C14103h();

        public C14103h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final byte[] invoke(Pair<byte[], byte[]> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return pair.component2();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0012\n\u0002\b\u0004\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "([B)[B"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSmartlockAssociationV2Presenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartlockAssociationV2Presenter.kt\nco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$listenForSmartlocksViaBluetooth$12\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,878:1\n1#2:879\n*E\n"})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$i */
    /* loaded from: classes2.dex */
    public static final class C14104i extends Lambda implements Function1<byte[], byte[]> {
        public C14104i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final byte[] invoke(byte[] it) {
            byte[] bArr;
            byte[] bArr2;
            byte[] bArr3;
            String key;
            String key2;
            Intrinsics.checkNotNullParameter(it, "it");
            SmartlockAssociationV2Presenter smartlockAssociationV2Presenter = SmartlockAssociationV2Presenter.this;
            SmartlockKey m59926i0 = smartlockAssociationV2Presenter.m59926i0();
            if (m59926i0 == null || (key2 = m59926i0.getKey()) == null || (bArr = SmartlockAssociationV2Presenter.this.m59920k0(key2)) == null) {
                bArr = new byte[0];
            }
            String arrays = Arrays.toString(smartlockAssociationV2Presenter.m59923j0(it, bArr));
            Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
            C41318g46.m40163a("response decrypt using provisional aes key: " + arrays, new Object[0]);
            SmartlockAssociationV2Presenter smartlockAssociationV2Presenter2 = SmartlockAssociationV2Presenter.this;
            SmartlockKey m59932g0 = smartlockAssociationV2Presenter2.m59932g0();
            if (m59932g0 == null || (key = m59932g0.getKey()) == null || (bArr2 = SmartlockAssociationV2Presenter.this.m59920k0(key)) == null) {
                bArr2 = new byte[0];
            }
            String arrays2 = Arrays.toString(smartlockAssociationV2Presenter2.m59923j0(it, bArr2));
            Intrinsics.checkNotNullExpressionValue(arrays2, "toString(this)");
            C41318g46.m40163a("response decrypt using non-provisional aes key: " + arrays2, new Object[0]);
            SmartlockAssociationV2Presenter smartlockAssociationV2Presenter3 = SmartlockAssociationV2Presenter.this;
            byte[] m59923j0 = smartlockAssociationV2Presenter3.m59923j0(it, smartlockAssociationV2Presenter3.m59935f0());
            SmartlockAssociationV2Presenter smartlockAssociationV2Presenter4 = SmartlockAssociationV2Presenter.this;
            byte[] m59923j02 = smartlockAssociationV2Presenter4.m59923j0(it, smartlockAssociationV2Presenter4.m59955Y());
            if (SmartlockAssociationV2Presenter.this.m59905p0(m59923j0)) {
                bArr3 = m59923j0;
            } else {
                bArr3 = null;
            }
            if (bArr3 == null) {
                if (!SmartlockAssociationV2Presenter.this.m59905p0(m59923j02)) {
                    m59923j02 = null;
                }
                if (m59923j02 != null) {
                    return m59923j02;
                }
                return m59923j0;
            }
            return bArr3;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "([B)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$j */
    /* loaded from: classes2.dex */
    public static final class C14105j extends Lambda implements Function1<byte[], Unit> {
        public C14105j() {
            super(1);
        }

        /* renamed from: a */
        public final void m59854a(byte[] it) {
            String str;
            SmartlockAssociationV2Presenter smartlockAssociationV2Presenter = SmartlockAssociationV2Presenter.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            if (smartlockAssociationV2Presenter.m59890u0(it)) {
                SmartlockAssociationV2Presenter smartlockAssociationV2Presenter2 = SmartlockAssociationV2Presenter.this;
                smartlockAssociationV2Presenter2.f62093q = smartlockAssociationV2Presenter2.m59975O1(it);
                SmartlockAssociationV2Presenter smartlockAssociationV2Presenter3 = SmartlockAssociationV2Presenter.this;
                smartlockAssociationV2Presenter3.f62092p = smartlockAssociationV2Presenter3.m60014B1(it);
                InterfaceC14174b interfaceC14174b = SmartlockAssociationV2Presenter.this.f62084h;
                C14094b c14094b = SmartlockAssociationV2Presenter.this.f62093q;
                if (c14094b != null) {
                    str = c14094b.toString();
                } else {
                    str = null;
                }
                interfaceC14174b.mo59682gf(str);
                if (SmartlockAssociationV2Presenter.this.f62088l) {
                    SmartlockAssociationV2Presenter.this.f62084h.mo59692P0(false);
                    SmartlockAssociationV2Presenter.this.f62084h.mo59694O(true);
                    SmartlockAssociationV2Presenter.this.f62084h.mo59693O0(true);
                    SmartlockAssociationV2Presenter.this.f62084h.mo59681h4(true);
                }
            } else if (SmartlockAssociationV2Presenter.this.m59914m0(it)) {
                SmartlockAssociationV2Presenter.this.f62084h.mo59692P0(false);
                SmartlockAssociationV2Presenter.this.f62084h.mo59694O(true);
                SmartlockAssociationV2Presenter.this.f62084h.mo59693O0(true);
                SmartlockAssociationV2Presenter.this.f62084h.mo59681h4(true);
            } else if (SmartlockAssociationV2Presenter.this.m59908o0(it)) {
                SmartlockAssociationV2Presenter.this.f62084h.mo59693O0(false);
                SmartlockAssociationV2Presenter.this.f62084h.mo59693O0(false);
                SmartlockAssociationV2Presenter.this.f62084h.mo59698H1(true);
                SmartlockAssociationV2Presenter.this.f62084h.mo59681h4(false);
                C41318g46.m40163a("got successful unlock response, now promoting provisional...", new Object[0]);
            } else if (SmartlockAssociationV2Presenter.this.m59887v0(it)) {
                SmartlockAssociationV2Presenter.this.f62084h.mo59693O0(false);
                SmartlockAssociationV2Presenter.this.f62084h.mo59693O0(false);
                SmartlockAssociationV2Presenter.this.f62084h.mo59681h4(true);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            m59854a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "", C17296a.f69688o, "([B)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$k */
    /* loaded from: classes2.dex */
    public static final class C14106k extends Lambda implements Function1<byte[], Boolean> {
        public C14106k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(byte[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(SmartlockAssociationV2Presenter.this.m59908o0(it));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", "b", "([B)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$l */
    /* loaded from: classes2.dex */
    public static final class C14107l extends Lambda implements Function1<byte[], InterfaceC24574u<? extends byte[]>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$l$a */
        /* loaded from: classes2.dex */
        public static final class C14108a extends Lambda implements Function1<DialogResponse, InterfaceC24574u<? extends byte[]>> {

            /* renamed from: g */
            public final /* synthetic */ SmartlockAssociationV2Presenter f62149g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14108a(SmartlockAssociationV2Presenter smartlockAssociationV2Presenter) {
                super(1);
                this.f62149g = smartlockAssociationV2Presenter;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC24574u<? extends byte[]> invoke(DialogResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                if (response == DialogResponse.OK) {
                    SmartlockAssociationV2Presenter smartlockAssociationV2Presenter = this.f62149g;
                    return smartlockAssociationV2Presenter.m59941d0(smartlockAssociationV2Presenter.m59996H1(), this.f62149g.m59981M1()).m33125j0();
                }
                this.f62149g.f62085i.close();
                return AbstractC24507p.m32024u();
            }
        }

        public C14107l() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC24574u m59850c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends byte[]> invoke(byte[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String arrays = Arrays.toString(it);
            Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
            C41318g46.m40163a("got a response " + arrays, new Object[0]);
            if (SmartlockAssociationV2Presenter.this.m59890u0(it)) {
                C41318g46.m40163a("got a session token", new Object[0]);
                if (SmartlockAssociationV2Presenter.this.f62088l) {
                    C41318g46.m40163a("provisional aes key was used successfully, we must have already rekeyed, skipping to unlock/promotion step", new Object[0]);
                    return SmartlockAssociationV2Presenter.this.m60017A1().m33125j0();
                }
                AbstractC23442F dialog$default = H31.C3014a.dialog$default(SmartlockAssociationV2Presenter.this.f62084h, C36500Ux0.f38309d, false, false, 4, null);
                final C14108a c14108a = new C14108a(SmartlockAssociationV2Presenter.this);
                return dialog$default.m33163C(new InterfaceC23492o() { // from class: IH5
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC24574u m59850c;
                        m59850c = SmartlockAssociationV2Presenter.C14107l.m59850c(Function1.this, obj);
                        return m59850c;
                    }
                });
            } else if (SmartlockAssociationV2Presenter.this.m59893t0(it)) {
                C41318g46.m40163a("got a password change response", new Object[0]);
                SmartlockAssociationV2Presenter.this.f62086j = true;
                SmartlockAssociationV2Presenter smartlockAssociationV2Presenter = SmartlockAssociationV2Presenter.this;
                return smartlockAssociationV2Presenter.m59947b0(smartlockAssociationV2Presenter.m59984L1()).m33125j0();
            } else if (SmartlockAssociationV2Presenter.this.m59914m0(it)) {
                C41318g46.m40163a("got an aes key change response", new Object[0]);
                return SmartlockAssociationV2Presenter.this.m60017A1().m33125j0();
            } else if (SmartlockAssociationV2Presenter.this.m59887v0(it)) {
                SmartlockAssociationV2Presenter smartlockAssociationV2Presenter2 = SmartlockAssociationV2Presenter.this;
                smartlockAssociationV2Presenter2.m59972P1("operator_tool", smartlockAssociationV2Presenter2.m59987K1(it));
                boolean m59987K1 = SmartlockAssociationV2Presenter.this.m59987K1(it);
                C41318g46.m40163a("got an unlock response - successful: " + m59987K1, new Object[0]);
                return AbstractC24507p.m32024u();
            } else if (SmartlockAssociationV2Presenter.this.m59902q0(it)) {
                boolean m59987K12 = SmartlockAssociationV2Presenter.this.m59987K1(it);
                C41318g46.m40163a("got an lock response - successful: " + m59987K12, new Object[0]);
                return AbstractC24507p.m32024u();
            } else if (SmartlockAssociationV2Presenter.this.m59911n0(it)) {
                boolean m59987K13 = SmartlockAssociationV2Presenter.this.m59987K1(it);
                C41318g46.m40163a("got a cable inserted response - successful: " + m59987K13, new Object[0]);
                return AbstractC24507p.m32024u();
            } else if (SmartlockAssociationV2Presenter.this.m59899r0(it) && !SmartlockAssociationV2Presenter.this.m59896s0(it)) {
                SmartlockAssociationV2Presenter smartlockAssociationV2Presenter3 = SmartlockAssociationV2Presenter.this;
                smartlockAssociationV2Presenter3.m59972P1("operator_tool_lock_state_response", smartlockAssociationV2Presenter3.m59987K1(it));
                C41318g46.m40163a("got a lock state response but not locked", new Object[0]);
                return AbstractC24507p.m32024u();
            } else if (SmartlockAssociationV2Presenter.this.m59899r0(it) && SmartlockAssociationV2Presenter.this.m59896s0(it)) {
                C41318g46.m40163a("got a lock state response and is locked", new Object[0]);
                return AbstractC24507p.m32024u();
            } else {
                C41318g46.m40163a("received some other kind of response", new Object[0]);
                return AbstractC24507p.m32024u();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$m */
    /* loaded from: classes2.dex */
    public static final class C14109m extends Lambda implements Function1<Throwable, Unit> {
        public C14109m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            if (S36.m86051a(it)) {
                SmartlockAssociationV2Presenter.this.f62084h.mo59687c1(true);
                SmartlockAssociationV2Presenter.this.f62084h.error(C45871nl4.error_network);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/SmartlockResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/api/response/SmartlockResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$n */
    /* loaded from: classes2.dex */
    public static final class C14110n extends Lambda implements Function1<SmartlockResponse, Unit> {
        public C14110n() {
            super(1);
        }

        /* renamed from: a */
        public final void m59848a(SmartlockResponse smartlockResponse) {
            C41318g46.m40163a("promoted smartlock!", new Object[0]);
            SmartlockAssociationV2Presenter.this.f62084h.mo59700A1(true);
            SmartlockAssociationV2Presenter.this.f62084h.mo59681h4(false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SmartlockResponse smartlockResponse) {
            m59848a(smartlockResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$o */
    /* loaded from: classes2.dex */
    public static final class C14111o extends Lambda implements Function1<Throwable, Unit> {
        public C14111o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            C41318g46.m40160d("error in lock connection", new Object[0]);
            it.printStackTrace();
            Intrinsics.checkNotNullExpressionValue(it, "it");
            if (S36.m86051a(it)) {
                return;
            }
            InterfaceC14174b interfaceC14174b = SmartlockAssociationV2Presenter.this.f62084h;
            String message = it.getMessage();
            interfaceC14174b.error("Something went wrong: " + message);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTk5;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LTk5;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$p */
    /* loaded from: classes2.dex */
    public static final class C14112p extends Lambda implements Function1<C36154Tk5, Unit> {
        public C14112p() {
            super(1);
        }

        /* renamed from: a */
        public final void m59847a(C36154Tk5 c36154Tk5) {
            SmartlockAssociationV2Presenter.this.f62084h.mo59692P0(true);
            SmartlockAssociationV2Presenter.this.f62084h.mo59681h4(false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36154Tk5 c36154Tk5) {
            m59847a(c36154Tk5);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LTk5;", "it", "", C17296a.f69688o, "(LTk5;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$q */
    /* loaded from: classes2.dex */
    public static final class C14113q extends Lambda implements Function1<C36154Tk5, Boolean> {
        public C14113q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C36154Tk5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(!SmartlockAssociationV2Presenter.this.f62089m.contains(it.m83016a().mo17280e()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTk5;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LTk5;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$r */
    /* loaded from: classes2.dex */
    public static final class C14114r extends Lambda implements Function1<C36154Tk5, Unit> {
        public C14114r() {
            super(1);
        }

        /* renamed from: a */
        public final void m59845a(C36154Tk5 c36154Tk5) {
            List list = SmartlockAssociationV2Presenter.this.f62089m;
            String mo17280e = c36154Tk5.m83016a().mo17280e();
            Intrinsics.checkNotNullExpressionValue(mo17280e, "it.bleDevice.macAddress");
            list.add(mo17280e);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36154Tk5 c36154Tk5) {
            m59845a(c36154Tk5);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTk5;", "scanResult", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", "e", "(LTk5;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$s */
    /* loaded from: classes2.dex */
    public static final class C14115s extends Lambda implements Function1<C36154Tk5, InterfaceC24574u<? extends C36154Tk5>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/SmartlockResponse;", "response", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/api/response/SmartlockResponse;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$s$a */
        /* loaded from: classes2.dex */
        public static final class C14116a extends Lambda implements Function1<SmartlockResponse, InterfaceC23447K<? extends SmartlockResponse>> {

            /* renamed from: g */
            public final /* synthetic */ SmartlockAssociationV2Presenter f62157g;

            /* renamed from: h */
            public final /* synthetic */ C36154Tk5 f62158h;

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/SmartlockResponse;", "generateResponse", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/SmartlockResponse;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$s$a$a */
            /* loaded from: classes2.dex */
            public static final class C14117a extends Lambda implements Function1<SmartlockResponse, InterfaceC23447K<? extends SmartlockResponse>> {

                /* renamed from: g */
                public final /* synthetic */ SmartlockAssociationV2Presenter f62159g;

                /* renamed from: h */
                public final /* synthetic */ SmartlockResponse f62160h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C14117a(SmartlockAssociationV2Presenter smartlockAssociationV2Presenter, SmartlockResponse smartlockResponse) {
                    super(1);
                    this.f62159g = smartlockAssociationV2Presenter;
                    this.f62160h = smartlockResponse;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final InterfaceC23447K<? extends SmartlockResponse> invoke(SmartlockResponse generateResponse) {
                    Intrinsics.checkNotNullParameter(generateResponse, "generateResponse");
                    if (this.f62159g.m59958W0(generateResponse) != null && this.f62159g.m59880x1(generateResponse) != null) {
                        return AbstractC23442F.m33158H(generateResponse);
                    }
                    C41318g46.m40160d("missing required keys after calling generateKey, erroring out. response: " + generateResponse + InstructionFileId.DOT, new Object[0]);
                    this.f62159g.f62084h.error(C45871nl4.smartlock_response_missing_expected_keys_error);
                    SmartlockResponse smartlockResponse = this.f62160h;
                    return AbstractC23442F.m33100x(new Exception("Response indicated that we needed to rekey but we did not have a provisional and non-provisional key supplied as expected (" + smartlockResponse + ")"));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14116a(SmartlockAssociationV2Presenter smartlockAssociationV2Presenter, C36154Tk5 c36154Tk5) {
                super(1);
                this.f62157g = smartlockAssociationV2Presenter;
                this.f62158h = c36154Tk5;
            }

            public static final InterfaceC23447K invoke$lambda$0(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (InterfaceC23447K) tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b */
            public final InterfaceC23447K<? extends SmartlockResponse> invoke(SmartlockResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                C41318g46.m40163a("handling response " + response, new Object[0]);
                if (this.f62157g.m59958W0(response) == null) {
                    C41318g46.m40160d("Missing non provisional key from call to smartlock/by-identifier, no way to proceed. (" + response + ")", new Object[0]);
                    this.f62157g.f62084h.error(C45871nl4.smartlock_response_missing_expected_key_error);
                    return AbstractC23442F.m33100x(new Exception("Response did not have a non-provisional key supplied as expected (" + response + ")"));
                } else if (response.getNeedsRekey() && this.f62157g.m59880x1(response) == null) {
                    String mo17280e = this.f62158h.m83016a().mo17280e();
                    C41318g46.m40160d("Missing provisional key when needing to rekey, calling smartlock/generateKey " + mo17280e, new Object[0]);
                    InterfaceC42042hI5 interfaceC42042hI5 = this.f62157g.f62078b;
                    String mo17280e2 = this.f62158h.m83016a().mo17280e();
                    Intrinsics.checkNotNullExpressionValue(mo17280e2, "scanResult.bleDevice.macAddress");
                    AbstractC23442F<SmartlockResponse> m33152N = interfaceC42042hI5.m36547d(new GenerateKeyBody(mo17280e2, null, 2, null)).m33152N(C23454a.m33087a());
                    final C14117a c14117a = new C14117a(this.f62157g, response);
                    return m33152N.m33165A(new InterfaceC23492o() { // from class: NH5
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            InterfaceC23447K invoke$lambda$0;
                            invoke$lambda$0 = SmartlockAssociationV2Presenter.C14115s.C14116a.invoke$lambda$0(Function1.this, obj);
                            return invoke$lambda$0;
                        }
                    });
                } else {
                    return AbstractC23442F.m33158H(response);
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/SmartlockResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/api/response/SmartlockResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$s$b */
        /* loaded from: classes2.dex */
        public static final class C14118b extends Lambda implements Function1<SmartlockResponse, Unit> {

            /* renamed from: g */
            public final /* synthetic */ SmartlockAssociationV2Presenter f62161g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14118b(SmartlockAssociationV2Presenter smartlockAssociationV2Presenter) {
                super(1);
                this.f62161g = smartlockAssociationV2Presenter;
            }

            /* renamed from: a */
            public final void m59833a(SmartlockResponse smartlockResponse) {
                this.f62161g.f62094r = smartlockResponse;
                this.f62161g.f62091o = smartlockResponse.getMacAddress();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SmartlockResponse smartlockResponse) {
                m59833a(smartlockResponse);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$s$c */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C14119c extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

            /* renamed from: b */
            public static final C14119c f62162b = new C14119c();

            public C14119c() {
                super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C41318g46.m40159e(th);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/SmartlockResponse;", "it", "LTk5;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/SmartlockResponse;)LTk5;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$s$d */
        /* loaded from: classes2.dex */
        public static final class C14120d extends Lambda implements Function1<SmartlockResponse, C36154Tk5> {

            /* renamed from: g */
            public final /* synthetic */ C36154Tk5 f62163g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14120d(C36154Tk5 c36154Tk5) {
                super(1);
                this.f62163g = c36154Tk5;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C36154Tk5 invoke(SmartlockResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f62163g;
            }
        }

        public C14115s() {
            super(1);
        }

        /* renamed from: f */
        public static final void m59839f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: g */
        public static final void m59838g(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: h */
        public static final C36154Tk5 m59837h(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (C36154Tk5) tmp0.invoke(obj);
        }

        public static final InterfaceC23447K invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: e */
        public final InterfaceC24574u<? extends C36154Tk5> invoke(C36154Tk5 scanResult) {
            Intrinsics.checkNotNullParameter(scanResult, "scanResult");
            String mo17280e = scanResult.m83016a().mo17280e();
            C41318g46.m40163a("calling smartlock/by-identifier on mac address " + mo17280e, new Object[0]);
            InterfaceC42042hI5 interfaceC42042hI5 = SmartlockAssociationV2Presenter.this.f62078b;
            String mo17280e2 = scanResult.m83016a().mo17280e();
            Intrinsics.checkNotNullExpressionValue(mo17280e2, "scanResult.bleDevice.macAddress");
            AbstractC23442F m33152N = InterfaceC42042hI5.C22610a.getLockByIdentifier$default(interfaceC42042hI5, mo17280e2, null, null, 6, null).m33152N(C23454a.m33087a());
            final C14116a c14116a = new C14116a(SmartlockAssociationV2Presenter.this, scanResult);
            AbstractC23442F m33165A = m33152N.m33165A(new InterfaceC23492o() { // from class: JH5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K invoke$lambda$0;
                    invoke$lambda$0 = SmartlockAssociationV2Presenter.C14115s.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
            final C14118b c14118b = new C14118b(SmartlockAssociationV2Presenter.this);
            AbstractC24507p m33125j0 = m33165A.m33101w(new InterfaceC23484g() { // from class: KH5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    SmartlockAssociationV2Presenter.C14115s.m59839f(Function1.this, obj);
                }
            }).m33125j0();
            final C14119c c14119c = C14119c.f62162b;
            AbstractC24507p m32065J = m33125j0.m32029p(new InterfaceC23484g() { // from class: LH5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    SmartlockAssociationV2Presenter.C14115s.m59838g(Function1.this, obj);
                }
            }).m32065J();
            final C14120d c14120d = new C14120d(scanResult);
            return m32065J.m32067H(new InterfaceC23492o() { // from class: MH5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    C36154Tk5 m59837h;
                    m59837h = SmartlockAssociationV2Presenter.C14115s.m59837h(Function1.this, obj);
                    return m59837h;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTk5;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LTk5;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$t */
    /* loaded from: classes2.dex */
    public static final class C14121t extends Lambda implements Function1<C36154Tk5, Unit> {
        public C14121t() {
            super(1);
        }

        /* renamed from: a */
        public final void m59831a(C36154Tk5 c36154Tk5) {
            SmartlockResponse smartlockResponse = SmartlockAssociationV2Presenter.this.f62094r;
            boolean z = false;
            if (smartlockResponse != null && smartlockResponse.getNeedsRekey()) {
                z = true;
            }
            boolean z2 = !z;
            SmartlockAssociationV2Presenter smartlockAssociationV2Presenter = SmartlockAssociationV2Presenter.this;
            smartlockAssociationV2Presenter.f62084h.mo59694O(z2);
            smartlockAssociationV2Presenter.f62084h.mo59698H1(z2);
            smartlockAssociationV2Presenter.f62084h.mo59700A1(z2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36154Tk5 c36154Tk5) {
            m59831a(c36154Tk5);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LTk5;", "it", "", C17296a.f69688o, "(LTk5;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$u */
    /* loaded from: classes2.dex */
    public static final class C14122u extends Lambda implements Function1<C36154Tk5, Boolean> {
        public C14122u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C36154Tk5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            SmartlockResponse smartlockResponse = SmartlockAssociationV2Presenter.this.f62094r;
            boolean z = false;
            if (smartlockResponse != null && smartlockResponse.getNeedsRekey()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LTk5;", "scanResult", "Lio/reactivex/B;", "Lke5;", "kotlin.jvm.PlatformType", "c", "(LTk5;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$v */
    /* loaded from: classes2.dex */
    public static final class C14123v extends Lambda implements Function1<C36154Tk5, InterfaceC23434B<? extends InterfaceC44023ke5>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lke5;", "kotlin.jvm.PlatformType", "connection", "", "invoke", "(Lke5;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$v$a */
        /* loaded from: classes2.dex */
        public static final class C14124a extends Lambda implements Function1<InterfaceC44023ke5, Unit> {

            /* renamed from: g */
            public final /* synthetic */ SmartlockAssociationV2Presenter f62167g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14124a(SmartlockAssociationV2Presenter smartlockAssociationV2Presenter) {
                super(1);
                this.f62167g = smartlockAssociationV2Presenter;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC44023ke5 interfaceC44023ke5) {
                invoke2(interfaceC44023ke5);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(InterfaceC44023ke5 interfaceC44023ke5) {
                this.f62167g.f62090n = interfaceC44023ke5;
                C41318g46.m40163a("lock connected", new Object[0]);
            }
        }

        public C14123v() {
            super(1);
        }

        /* renamed from: d */
        public static final void m59826d(SmartlockAssociationV2Presenter this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f62090n = null;
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23434B<? extends InterfaceC44023ke5> invoke(C36154Tk5 scanResult) {
            Intrinsics.checkNotNullParameter(scanResult, "scanResult");
            C41318g46.m40163a("resetting to use non-provisional creds everywhere", new Object[0]);
            SmartlockAssociationV2Presenter.this.f62086j = false;
            SmartlockAssociationV2Presenter.this.f62087k = false;
            SmartlockAssociationV2Presenter.this.f62088l = false;
            SmartlockAssociationV2Presenter.this.f62093q = null;
            Observable<InterfaceC44023ke5> delaySubscription = scanResult.m83016a().mo17284a(false).delaySubscription(500L, TimeUnit.MILLISECONDS);
            final C14124a c14124a = new C14124a(SmartlockAssociationV2Presenter.this);
            Observable<InterfaceC44023ke5> doOnNext = delaySubscription.doOnNext(new InterfaceC23484g() { // from class: OH5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    SmartlockAssociationV2Presenter.C14123v.invoke$lambda$0(Function1.this, obj);
                }
            });
            final SmartlockAssociationV2Presenter smartlockAssociationV2Presenter = SmartlockAssociationV2Presenter.this;
            return doOnNext.doOnDispose(new InterfaceC23478a() { // from class: PH5
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    SmartlockAssociationV2Presenter.C14123v.m59826d(SmartlockAssociationV2Presenter.this);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lke5;", "connection", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "b", "(Lke5;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$w */
    /* loaded from: classes2.dex */
    public static final class C14125w extends Lambda implements Function1<InterfaceC44023ke5, InterfaceC23447K<? extends InterfaceC44023ke5>> {

        /* renamed from: g */
        public static final C14125w f62168g = new C14125w();

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lue5;", "it", "Lke5;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lue5;)Lke5;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$w$a */
        /* loaded from: classes2.dex */
        public static final class C14126a extends Lambda implements Function1<C49952ue5, InterfaceC44023ke5> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC44023ke5 f62169g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14126a(InterfaceC44023ke5 interfaceC44023ke5) {
                super(1);
                this.f62169g = interfaceC44023ke5;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC44023ke5 invoke(C49952ue5 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f62169g;
            }
        }

        public C14125w() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC44023ke5 m59823c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC44023ke5) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends InterfaceC44023ke5> invoke(InterfaceC44023ke5 connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            C41318g46.m40163a("discovering services...", new Object[0]);
            AbstractC23442F<C49952ue5> mo27058a = connection.mo27058a();
            final C14126a c14126a = new C14126a(connection);
            return mo27058a.m33157I(new InterfaceC23492o() { // from class: QH5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC44023ke5 m59823c;
                    m59823c = SmartlockAssociationV2Presenter.C14125w.m59823c(Function1.this, obj);
                    return m59823c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\u0010\b\u001ab\u0012*\b\u0001\u0012&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003 \u0005*0\u0012*\b\u0001\u0012&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lke5;", "it", "Lio/reactivex/B;", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "invoke", "(Lke5;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$x */
    /* loaded from: classes2.dex */
    public static final class C14127x extends Lambda implements Function1<InterfaceC44023ke5, InterfaceC23434B<? extends Observable<byte[]>>> {

        /* renamed from: g */
        public static final C14127x f62170g = new C14127x();

        public C14127x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Observable<byte[]>> invoke(InterfaceC44023ke5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C41318g46.m40163a("setting up notification...", new Object[0]);
            return it.mo27057b(SmartlockManagerImpl.EnumC14385i.f62937d.m59190b(), EnumC41046fd3.DEFAULT).delaySubscription(500L, TimeUnit.MILLISECONDS);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Unit;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$y */
    /* loaded from: classes2.dex */
    public static final class C14128y extends Lambda implements Function1<Unit, InterfaceC24574u<? extends byte[]>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/Long;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$y$a */
        /* loaded from: classes2.dex */
        public static final class C14129a extends Lambda implements Function1<Long, InterfaceC24574u<? extends byte[]>> {

            /* renamed from: g */
            public final /* synthetic */ SmartlockAssociationV2Presenter f62172g;

            @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$y$a$a */
            /* loaded from: classes2.dex */
            public static final class C14130a extends Lambda implements Function1<InterfaceC23465c, Unit> {

                /* renamed from: g */
                public final /* synthetic */ SmartlockAssociationV2Presenter f62173g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C14130a(SmartlockAssociationV2Presenter smartlockAssociationV2Presenter) {
                    super(1);
                    this.f62173g = smartlockAssociationV2Presenter;
                }

                /* renamed from: a */
                public final void m59816a(InterfaceC23465c interfaceC23465c) {
                    C41318g46.m40163a("setting usedProvisionalAesKeyForTokenRequest, useProvisionalPassword and useProvisionalAesKey to true since we've re-requested token with provisional", new Object[0]);
                    this.f62173g.f62088l = true;
                    this.f62173g.f62086j = true;
                    this.f62173g.f62087k = true;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                    m59816a(interfaceC23465c);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14129a(SmartlockAssociationV2Presenter smartlockAssociationV2Presenter) {
                super(1);
                this.f62172g = smartlockAssociationV2Presenter;
            }

            public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b */
            public final InterfaceC24574u<? extends byte[]> invoke(Long it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (this.f62172g.f62093q != null) {
                    C41318g46.m40163a("token request timer expired, a valid token was found, no additional call necessary.", new Object[0]);
                    return AbstractC24507p.m32024u();
                }
                C41318g46.m40163a("token request timer expired, and no token has been parsed, attempting to re-request with provisional token.", new Object[0]);
                AbstractC23442F m59877y1 = this.f62172g.m59877y1(SmartlockAssociationV2Presenter.f62076y, this.f62172g.m59955Y());
                final C14130a c14130a = new C14130a(this.f62172g);
                return m59877y1.m33102v(new InterfaceC23484g() { // from class: SH5
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        SmartlockAssociationV2Presenter.C14128y.C14129a.invoke$lambda$0(Function1.this, obj);
                    }
                }).m33125j0();
            }
        }

        public C14128y() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC24574u m59819c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends byte[]> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C41318g46.m40163a("Starting timer to check back for token status...", new Object[0]);
            AbstractC24507p<Long> m32049a0 = AbstractC24507p.m32049a0(2L, TimeUnit.SECONDS);
            final C14129a c14129a = new C14129a(SmartlockAssociationV2Presenter.this);
            return m32049a0.m32021x(new InterfaceC23492o() { // from class: RH5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC24574u m59819c;
                    m59819c = SmartlockAssociationV2Presenter.C14128y.m59819c(Function1.this, obj);
                    return m59819c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "([B)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter$z */
    /* loaded from: classes2.dex */
    public static final class C14131z extends Lambda implements Function1<byte[], Unit> {

        /* renamed from: g */
        public static final C14131z f62174g = new C14131z();

        public C14131z() {
            super(1);
        }

        /* renamed from: a */
        public final void m59815a(byte[] bArr) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            m59815a(bArr);
            return Unit.INSTANCE;
        }
    }

    public SmartlockAssociationV2Presenter(InterfaceC5225MD baseBluetoothManager, InterfaceC42042hI5 smartlockClient, InterfaceC33939Jy4 repairClient, C22454gl preference, InterfaceC1880Ea analyticsManager, DQ3 permissionManager, LifecycleScopeProvider<EnumC7097RE> scopeProvider, InterfaceC14174b ui, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(baseBluetoothManager, "baseBluetoothManager");
        Intrinsics.checkNotNullParameter(smartlockClient, "smartlockClient");
        Intrinsics.checkNotNullParameter(repairClient, "repairClient");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f62077a = baseBluetoothManager;
        this.f62078b = smartlockClient;
        this.f62079c = repairClient;
        this.f62080d = preference;
        this.f62081e = analyticsManager;
        this.f62082f = permissionManager;
        this.f62083g = scopeProvider;
        this.f62084h = ui;
        this.f62085i = navigator;
        this.f62089m = new ArrayList();
        CG4<C36154Tk5> m112490g = CG4.m112490g();
        Intrinsics.checkNotNullExpressionValue(m112490g, "create<ScanResult>()");
        this.f62096t = m112490g;
        C45168ma4<C36154Tk5> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<ScanResult>()");
        this.f62097u = m25409g;
        C45168ma4<Unit> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<Unit>()");
        this.f62098v = m25409g2;
    }

    /* renamed from: A0 */
    public static final boolean m60018A0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: B0 */
    public static final void m60015B0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C0 */
    public static final InterfaceC24574u m60012C0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: D0 */
    public static final void m60009D0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D1 */
    public static final int m60008D1(PhysicalLockPurpose physicalLockPurpose) {
        int i;
        if (physicalLockPurpose == null) {
            i = -1;
        } else {
            i = C14096c.$EnumSwitchMapping$0[physicalLockPurpose.ordinal()];
        }
        if (i == 1) {
            return C45871nl4.smartlock_lock_purpose_helmet;
        }
        return C45871nl4.smartlock_lock_purpose_lock_to;
    }

    /* renamed from: E0 */
    public static final boolean m60006E0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: E1 */
    public static final InterfaceC24574u m60005E1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: F0 */
    public static final InterfaceC23434B m60003F0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: F1 */
    public static final void m60002F1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G0 */
    public static final InterfaceC23447K m60000G0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: G1 */
    public static final void m59999G1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H0 */
    public static final InterfaceC23434B m59997H0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: I0 */
    public static final InterfaceC23434B m59994I0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: J0 */
    public static final byte[] m59991J0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (byte[]) tmp0.invoke(obj);
    }

    /* renamed from: J1 */
    public static final boolean m59990J1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: K0 */
    public static final byte[] m59988K0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (byte[]) tmp0.invoke(obj);
    }

    /* renamed from: L0 */
    public static final void m59985L0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M0 */
    public static final boolean m59982M0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: N0 */
    public static final InterfaceC24574u m59979N0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: O0 */
    public static final InterfaceC23447K m59976O0(SmartlockAssociationV2Presenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AbstractC23442F<SmartlockResponse> m59886v1 = this$0.m59886v1();
        final C14109m c14109m = new C14109m();
        return m59886v1.m33106t(new InterfaceC23484g() { // from class: zH5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationV2Presenter.m59973P0(Function1.this, obj);
            }
        });
    }

    /* renamed from: P0 */
    public static final void m59973P0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q0 */
    public static final void m59970Q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R0 */
    public static final void m59968R0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T0 */
    public static final InterfaceC24574u m59964T0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: U0 */
    public static final void m59962U0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Z0 */
    public static final void m59952Z0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final InterfaceC23447K m59950a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: a1 */
    public static final void m59949a1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final InterfaceC23447K m59944c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: c1 */
    public static final void m59943c1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d1 */
    public static final void m59940d1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final InterfaceC23447K m59938e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: e1 */
    public static final void m59937e1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f1 */
    public static final void m59934f1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g1 */
    public static final InterfaceC23447K m59931g1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: h1 */
    public static final void m59928h1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i1 */
    public static final boolean m59925i1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: j1 */
    public static final void m59922j1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k1 */
    public static final void m59919k1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l1 */
    public static final void m59916l1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m1 */
    public static final void m59913m1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n1 */
    public static final InterfaceC23447K m59910n1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: o1 */
    public static final void m59907o1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p1 */
    public static final boolean m59904p1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: q1 */
    public static final void m59901q1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r1 */
    public static final void m59898r1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s1 */
    public static final InterfaceC23447K m59895s1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: t1 */
    public static final InterfaceC23447K m59892t1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: u1 */
    public static final void m59889u1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w1 */
    public static final InterfaceC23447K m59883w1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: z0 */
    public static final void m59875z0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z1 */
    public static /* synthetic */ AbstractC23442F m59874z1(SmartlockAssociationV2Presenter smartlockAssociationV2Presenter, byte[] bArr, byte[] bArr2, int i, Object obj) {
        if ((i & 2) != 0) {
            bArr2 = smartlockAssociationV2Presenter.m59935f0();
        }
        return smartlockAssociationV2Presenter.m59877y1(bArr, bArr2);
    }

    /* renamed from: A1 */
    public final AbstractC23442F<byte[]> m60017A1() {
        byte[] bArr = new byte[3];
        new Random().nextBytes(bArr);
        ByteBuffer put = ByteBuffer.allocate(16).order(ByteOrder.BIG_ENDIAN).put(new byte[]{5, 1, 6}).put(m59929h0());
        byte[] bArr2 = this.f62092p;
        if (bArr2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionToken");
            bArr2 = null;
        }
        byte[] payload = put.put(bArr2).put(bArr).array();
        Intrinsics.checkNotNullExpressionValue(payload, "payload");
        return m59874z1(this, payload, null, 2, null);
    }

    /* renamed from: B1 */
    public final byte[] m60014B1(byte[] bArr) {
        byte[] sliceArray;
        sliceArray = ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(3, 6));
        return sliceArray;
    }

    /* renamed from: C1 */
    public final void m60011C1() {
        this.f62084h.mo59684e4(m60008D1(this.f62080d.m37703N()));
        Observable<Unit> observeOn = this.f62084h.mo59690V0().observeOn(C23454a.m33087a());
        final C14090Y c14090y = new C14090Y();
        Observable<R> switchMapMaybe = observeOn.switchMapMaybe(new InterfaceC23492o() { // from class: wH5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m60005E1;
                m60005E1 = SmartlockAssociationV2Presenter.m60005E1(Function1.this, obj);
                return m60005E1;
            }
        });
        final C14091Z c14091z = new C14091Z();
        Observable observeOn2 = switchMapMaybe.doOnNext(new InterfaceC23484g() { // from class: xH5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationV2Presenter.m60002F1(Function1.this, obj);
            }
        }).observeOn(C24542a.m31932c());
        final C14093a0 c14093a0 = new C14093a0();
        Observable doOnNext = observeOn2.doOnNext(new InterfaceC23484g() { // from class: yH5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationV2Presenter.m59999G1(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "private fun setupDropdow…r)\n      .subscribe()\n  }");
        Object m33094as = doOnNext.m33094as(AutoDispose.m45239a(this.f62083g));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe();
    }

    /* renamed from: H1 */
    public final byte[] m59996H1() {
        String password;
        SmartlockKey m59932g0 = m59932g0();
        if (m59932g0 != null && (password = m59932g0.getPassword()) != null) {
            byte[] bytes = password.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            if (bytes != null) {
                return bytes;
            }
        }
        return new byte[0];
    }

    /* renamed from: I1 */
    public final void m59993I1() {
        Observable scanBleDevices$default = InterfaceC5225MD.C5226a.scanBleDevices$default(this.f62077a, 2, false, null, 4, null);
        final C14095b0 c14095b0 = C14095b0.f62135g;
        Observable filter = scanBleDevices$default.filter(new InterfaceC23494q() { // from class: bH5
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m59990J1;
                m59990J1 = SmartlockAssociationV2Presenter.m59990J1(Function1.this, obj);
                return m59990J1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter, "baseBluetoothManager\n   …) && !it.isSolebeLock() }");
        Object m33094as = filter.m33094as(AutoDispose.m45239a(this.f62083g));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe(this.f62096t);
    }

    /* renamed from: K1 */
    public final boolean m59987K1(byte[] bArr) {
        return Intrinsics.compare((int) bArr[3], 0) == 0;
    }

    /* renamed from: L1 */
    public final byte[] m59984L1() {
        String key;
        byte[] m59920k0;
        SmartlockKey m59926i0 = m59926i0();
        return (m59926i0 == null || (key = m59926i0.getKey()) == null || (m59920k0 = m59920k0(key)) == null) ? new byte[0] : m59920k0;
    }

    /* renamed from: M1 */
    public final byte[] m59981M1() {
        String password;
        SmartlockKey m59926i0 = m59926i0();
        if (m59926i0 != null && (password = m59926i0.getPassword()) != null) {
            byte[] bytes = password.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            if (bytes != null) {
                return bytes;
            }
        }
        return new byte[0];
    }

    /* renamed from: N1 */
    public final String m59978N1(PhysicalLockPurpose physicalLockPurpose) {
        return C14096c.$EnumSwitchMapping$0[physicalLockPurpose.ordinal()] == 1 ? "smartlock_cable_oklock_helmet" : "smartlock_cable_nokelock_birdv1";
    }

    /* renamed from: O1 */
    public final C14094b m59975O1(byte[] bArr) {
        if (m59890u0(bArr)) {
            return new C14094b(bArr);
        }
        return null;
    }

    /* renamed from: P1 */
    public final void m59972P1(String str, boolean z) {
        String str2;
        PhysicalLockPurpose m37703N = this.f62080d.m37703N();
        InterfaceC1880Ea interfaceC1880Ea = this.f62081e;
        if (m37703N != null) {
            str2 = m59978N1(m37703N);
        } else {
            str2 = null;
        }
        String str3 = str2;
        String valueOf = String.valueOf(m37703N);
        SmartlockResponse smartlockResponse = this.f62094r;
        interfaceC1880Ea.mo55905y(new RS3(null, null, null, str, z, (smartlockResponse == null || (r1 = smartlockResponse.getId()) == null) ? "" : "", null, null, null, str3, valueOf, null, null, 6599, null));
    }

    /* renamed from: S0 */
    public final void m59966S0() {
        C45168ma4<Unit> c45168ma4 = this.f62098v;
        final C14128y c14128y = new C14128y();
        Observable<R> flatMapMaybe = c45168ma4.flatMapMaybe(new InterfaceC23492o() { // from class: ZG5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m59964T0;
                m59964T0 = SmartlockAssociationV2Presenter.m59964T0(Function1.this, obj);
                return m59964T0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapMaybe, "private fun listenForTok…)\n      .subscribe {}\n  }");
        Object m33094as = flatMapMaybe.m33094as(AutoDispose.m45239a(this.f62083g));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14131z c14131z = C14131z.f62174g;
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: aH5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationV2Presenter.m59962U0(Function1.this, obj);
            }
        });
    }

    /* renamed from: V0 */
    public final byte[] m59960V0(byte[] bArr) {
        byte[] bArr2 = new byte[3];
        new Random().nextBytes(bArr2);
        ByteBuffer put = ByteBuffer.allocate(16).order(ByteOrder.BIG_ENDIAN).put(new byte[]{5, 4, 6}).put(bArr);
        byte[] bArr3 = this.f62092p;
        if (bArr3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionToken");
            bArr3 = null;
        }
        byte[] array = put.put(bArr3).put(bArr2).array();
        Intrinsics.checkNotNullExpressionValue(array, "allocate(16)\n      .orde…t(padding)\n      .array()");
        return array;
    }

    /* renamed from: W0 */
    public final SmartlockKey m59958W0(SmartlockResponse smartlockResponse) {
        Object obj;
        Iterator<T> it = smartlockResponse.getKeysList().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (!((SmartlockKey) obj).getProvisional()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (SmartlockKey) obj;
    }

    /* renamed from: X0 */
    public final byte[] m59956X0(byte[] bArr) {
        byte[] bArr2 = new byte[3];
        new Random().nextBytes(bArr2);
        ByteBuffer put = ByteBuffer.allocate(16).order(ByteOrder.BIG_ENDIAN).put(new byte[]{5, 3, 6}).put(bArr);
        byte[] bArr3 = this.f62092p;
        if (bArr3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionToken");
            bArr3 = null;
        }
        byte[] array = put.put(bArr3).put(bArr2).array();
        Intrinsics.checkNotNullExpressionValue(array, "allocate(16)\n      .orde…t(padding)\n      .array()");
        return array;
    }

    /* renamed from: Y */
    public final byte[] m59955Y() {
        String key;
        byte[] m59920k0;
        String key2;
        byte[] m59920k02;
        if (!this.f62087k) {
            SmartlockKey m59926i0 = m59926i0();
            if (m59926i0 == null || (key2 = m59926i0.getKey()) == null || (m59920k02 = m59920k0(key2)) == null) {
                return new byte[0];
            }
            return m59920k02;
        }
        SmartlockKey m59932g0 = m59932g0();
        if (m59932g0 == null || (key = m59932g0.getKey()) == null || (m59920k0 = m59920k0(key)) == null) {
            return new byte[0];
        }
        return m59920k0;
    }

    /* renamed from: Y0 */
    public final void m59954Y0(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        C41318g46.m40163a("Scanned Bird " + bird, new Object[0]);
        this.f62095s = bird;
        this.f62084h.mo59700A1(false);
        this.f62084h.mo59683g0(true);
        Object m33135e = m59953Z().m33135e(AutoDispose.m45239a(this.f62083g));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14066A c14066a = new C14066A();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: XG5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationV2Presenter.m59952Z0(Function1.this, obj);
            }
        };
        final C14067B c14067b = new C14067B();
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: YG5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationV2Presenter.m59949a1(Function1.this, obj);
            }
        });
    }

    /* renamed from: Z */
    public final AbstractC23442F<HM4<WirePhysicalLock>> m59953Z() {
        String str;
        InterfaceC33939Jy4 interfaceC33939Jy4 = this.f62079c;
        WireBird wireBird = this.f62095s;
        if (wireBird == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
            wireBird = null;
        }
        String id = wireBird.getId();
        PhysicalLockPurpose m37703N = this.f62080d.m37703N();
        String str2 = (m37703N == null || (r1 = m59978N1(m37703N)) == null) ? "smartlock_cable_nokelock_birdv1" : "smartlock_cable_nokelock_birdv1";
        String str3 = this.f62091o;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("macAddress");
            str = null;
        } else {
            str = str3;
        }
        PhysicalLockPurpose m37703N2 = this.f62080d.m37703N();
        if (m37703N2 == null) {
            m37703N2 = PhysicalLockPurpose.LOCK_TO;
        }
        AbstractC23442F<HM4<WirePhysicalLock>> m99482f = interfaceC33939Jy4.m99482f(new ReplacePhysicalLockBody(id, str2, "0000", null, str, m37703N2, 8, null));
        final C14097d c14097d = C14097d.f62136g;
        AbstractC23442F<HM4<WirePhysicalLock>> m33152N = m99482f.m33165A(new InterfaceC23492o() { // from class: eH5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m59950a0;
                m59950a0 = SmartlockAssociationV2Presenter.m59950a0(Function1.this, obj);
                return m59950a0;
            }
        }).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "repairClient.replacePhys…dSchedulers.mainThread())");
        return m33152N;
    }

    /* renamed from: b0 */
    public final AbstractC23442F<byte[]> m59947b0(byte[] bArr) {
        AbstractC23442F m33122l = m59874z1(this, m59881x0(bArr), null, 2, null).m33122l(200L, TimeUnit.MILLISECONDS);
        final C14098e c14098e = new C14098e(bArr);
        AbstractC23442F<byte[]> m33165A = m33122l.m33165A(new InterfaceC23492o() { // from class: IG5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m59944c0;
                m59944c0 = SmartlockAssociationV2Presenter.m59944c0(Function1.this, obj);
                return m59944c0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "private fun changeAesKey…e\n          }\n      }\n  }");
        return m33165A;
    }

    /* renamed from: b1 */
    public final void m59946b1() {
        if (this.f62080d.m37699O() != EnumC49958uf1.f112718k) {
            H31.C3014a.showDialog$default(this.f62084h, C43821kI5.f94223d, false, false, C14078M.f62111g, new C14081P(), null, null, 100, null);
        }
        m60011C1();
        m59993I1();
        m59878y0();
        m59966S0();
        this.f62084h.mo59688a0(false);
        Object m33094as = this.f62084h.mo59685e0().m33094as(AutoDispose.m45239a(this.f62083g));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14082Q c14082q = new C14082Q();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: AH5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationV2Presenter.m59943c1(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn = this.f62084h.mo59691V().observeOn(C23454a.m33087a());
        final C14083R c14083r = new C14083R();
        Observable<Unit> observeOn2 = observeOn.doOnNext(new InterfaceC23484g() { // from class: NG5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationV2Presenter.m59940d1(Function1.this, obj);
            }
        }).observeOn(C24542a.m31932c());
        final C14084S c14084s = new C14084S();
        Observable observeOn3 = observeOn2.flatMapSingle(new InterfaceC23492o() { // from class: OG5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m59910n1;
                m59910n1 = SmartlockAssociationV2Presenter.m59910n1(Function1.this, obj);
                return m59910n1;
            }
        }).observeOn(C23454a.m33087a());
        final C14085T c14085t = new C14085T();
        Observable doOnError = observeOn3.doOnError(new InterfaceC23484g() { // from class: PG5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationV2Presenter.m59907o1(Function1.this, obj);
            }
        });
        final C14086U c14086u = C14086U.f62120g;
        Observable observeOn4 = doOnError.retry(new InterfaceC23494q() { // from class: QG5
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m59904p1;
                m59904p1 = SmartlockAssociationV2Presenter.m59904p1(Function1.this, obj);
                return m59904p1;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "fun onCreate() {\n    // …hButton(true)\n      }\n  }");
        Object m33094as2 = observeOn4.m33094as(AutoDispose.m45239a(this.f62083g));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14087V c14087v = new C14087V();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: RG5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationV2Presenter.m59901q1(Function1.this, obj);
            }
        };
        final C14088W c14088w = new C14088W();
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: SG5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationV2Presenter.m59898r1(Function1.this, obj);
            }
        });
        Observable<Unit> mo59680jg = this.f62084h.mo59680jg();
        final C14068C c14068c = new C14068C();
        Observable retry = mo59680jg.flatMapSingle(new InterfaceC23492o() { // from class: UG5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m59895s1;
                m59895s1 = SmartlockAssociationV2Presenter.m59895s1(Function1.this, obj);
                return m59895s1;
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "fun onCreate() {\n    // …hButton(true)\n      }\n  }");
        Object m33094as3 = retry.m33094as(AutoDispose.m45239a(this.f62083g));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as3).subscribe();
        Observable<Unit> mo59676w = this.f62084h.mo59676w();
        final C14069D c14069d = new C14069D();
        Observable<R> flatMapSingle = mo59676w.flatMapSingle(new InterfaceC23492o() { // from class: VG5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m59892t1;
                m59892t1 = SmartlockAssociationV2Presenter.m59892t1(Function1.this, obj);
                return m59892t1;
            }
        });
        final C14070E c14070e = new C14070E();
        Observable retry2 = flatMapSingle.doOnError(new InterfaceC23484g() { // from class: WG5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationV2Presenter.m59889u1(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry2, "fun onCreate() {\n    // …hButton(true)\n      }\n  }");
        Object m33094as4 = retry2.m33094as(AutoDispose.m45239a(this.f62083g));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14071F c14071f = new C14071F();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: BH5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationV2Presenter.m59937e1(Function1.this, obj);
            }
        });
        Observable<Unit> mo59696K1 = this.f62084h.mo59696K1();
        final C14072G c14072g = new C14072G();
        Observable<Unit> doOnNext = mo59696K1.doOnNext(new InterfaceC23484g() { // from class: CH5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationV2Presenter.m59934f1(Function1.this, obj);
            }
        });
        final C14073H c14073h = new C14073H();
        Observable<R> flatMapSingle2 = doOnNext.flatMapSingle(new InterfaceC23492o() { // from class: DH5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m59931g1;
                m59931g1 = SmartlockAssociationV2Presenter.m59931g1(Function1.this, obj);
                return m59931g1;
            }
        });
        final C14074I c14074i = new C14074I();
        Observable doOnError2 = flatMapSingle2.doOnError(new InterfaceC23484g() { // from class: EH5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationV2Presenter.m59928h1(Function1.this, obj);
            }
        });
        final C14075J c14075j = C14075J.f62108g;
        Observable retry3 = doOnError2.retry(new InterfaceC23494q() { // from class: FH5
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m59925i1;
                m59925i1 = SmartlockAssociationV2Presenter.m59925i1(Function1.this, obj);
                return m59925i1;
            }
        });
        final C14076K c14076k = new C14076K();
        Observable doOnEach = retry3.doOnEach(new InterfaceC23484g() { // from class: JG5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationV2Presenter.m59922j1(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnEach, "fun onCreate() {\n    // …hButton(true)\n      }\n  }");
        Object m33094as5 = doOnEach.m33094as(AutoDispose.m45239a(this.f62083g));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14077L c14077l = new C14077L();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: KG5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationV2Presenter.m59919k1(Function1.this, obj);
            }
        };
        final C14079N c14079n = new C14079N();
        ((ObservableSubscribeProxy) m33094as5).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: LG5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationV2Presenter.m59916l1(Function1.this, obj);
            }
        });
        Object m33094as6 = this.f62084h.mo59697J0().m33094as(AutoDispose.m45239a(this.f62083g));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14080O c14080o = new C14080O();
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: MG5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationV2Presenter.m59913m1(Function1.this, obj);
            }
        });
    }

    /* renamed from: d0 */
    public final AbstractC23442F<byte[]> m59941d0(byte[] bArr, byte[] bArr2) {
        AbstractC23442F m33122l = m59874z1(this, m59956X0(bArr), null, 2, null).m33122l(200L, TimeUnit.MILLISECONDS);
        final C14100f c14100f = new C14100f(bArr2);
        AbstractC23442F<byte[]> m33165A = m33122l.m33165A(new InterfaceC23492o() { // from class: pH5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m59938e0;
                m59938e0 = SmartlockAssociationV2Presenter.m59938e0(Function1.this, obj);
                return m59938e0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "private fun changePasswo…newPassword))\n      }\n  }");
        return m33165A;
    }

    /* renamed from: f0 */
    public final byte[] m59935f0() {
        String key;
        byte[] m59920k0;
        String key2;
        byte[] m59920k02;
        if (this.f62087k) {
            SmartlockKey m59926i0 = m59926i0();
            if (m59926i0 == null || (key2 = m59926i0.getKey()) == null || (m59920k02 = m59920k0(key2)) == null) {
                return new byte[0];
            }
            return m59920k02;
        }
        SmartlockKey m59932g0 = m59932g0();
        if (m59932g0 == null || (key = m59932g0.getKey()) == null || (m59920k0 = m59920k0(key)) == null) {
            return new byte[0];
        }
        return m59920k0;
    }

    /* renamed from: g0 */
    public final SmartlockKey m59932g0() {
        SmartlockResponse smartlockResponse = this.f62094r;
        if (smartlockResponse != null) {
            return m59958W0(smartlockResponse);
        }
        return null;
    }

    /* renamed from: h0 */
    public final byte[] m59929h0() {
        String password;
        String password2;
        if (this.f62086j) {
            SmartlockKey m59926i0 = m59926i0();
            if (m59926i0 != null && (password2 = m59926i0.getPassword()) != null) {
                byte[] bytes = password2.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                if (bytes != null) {
                    return bytes;
                }
            }
            return new byte[0];
        }
        SmartlockKey m59932g0 = m59932g0();
        if (m59932g0 != null && (password = m59932g0.getPassword()) != null) {
            byte[] bytes2 = password.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
            if (bytes2 != null) {
                return bytes2;
            }
        }
        return new byte[0];
    }

    /* renamed from: i0 */
    public final SmartlockKey m59926i0() {
        SmartlockResponse smartlockResponse = this.f62094r;
        if (smartlockResponse != null) {
            return m59880x1(smartlockResponse);
        }
        return null;
    }

    /* renamed from: j0 */
    public final byte[] m59923j0(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
        cipher.init(2, secretKeySpec);
        byte[] doFinal = cipher.doFinal(bArr);
        Intrinsics.checkNotNullExpressionValue(doFinal, "cipher.doFinal(payload)");
        return doFinal;
    }

    /* renamed from: k0 */
    public final byte[] m59920k0(String str) {
        byte[] m108180a = C2029Ey.m108182a().m108180a(str);
        Intrinsics.checkNotNullExpressionValue(m108180a, "getDecoder().decode(this)");
        return m108180a;
    }

    /* renamed from: l0 */
    public final byte[] m59917l0(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
        cipher.init(1, secretKeySpec);
        byte[] doFinal = cipher.doFinal(bArr);
        Intrinsics.checkNotNullExpressionValue(doFinal, "cipher.doFinal(payload)");
        return doFinal;
    }

    /* renamed from: m0 */
    public final boolean m59914m0(byte[] bArr) {
        byte[] sliceArray;
        sliceArray = ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(0, 2));
        return Arrays.equals(sliceArray, new byte[]{7, 3, 1});
    }

    /* renamed from: n0 */
    public final boolean m59911n0(byte[] bArr) {
        byte[] sliceArray;
        sliceArray = ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(0, 2));
        return Arrays.equals(sliceArray, new byte[]{5, 8, 1});
    }

    /* renamed from: o0 */
    public final boolean m59908o0(byte[] bArr) {
        if ((m59899r0(bArr) && !m59896s0(bArr)) || (m59887v0(bArr) && m59987K1(bArr))) {
            return true;
        }
        return false;
    }

    /* renamed from: p0 */
    public final boolean m59905p0(byte[] bArr) {
        if (!m59890u0(bArr) && !m59893t0(bArr) && !m59914m0(bArr) && !m59887v0(bArr) && !m59902q0(bArr) && !m59911n0(bArr) && !m59899r0(bArr)) {
            return false;
        }
        return true;
    }

    /* renamed from: q0 */
    public final boolean m59902q0(byte[] bArr) {
        byte[] sliceArray;
        sliceArray = ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(0, 2));
        return Arrays.equals(sliceArray, new byte[]{5, 13, 1});
    }

    /* renamed from: r0 */
    public final boolean m59899r0(byte[] bArr) {
        byte[] sliceArray;
        sliceArray = ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(0, 2));
        return Arrays.equals(sliceArray, new byte[]{5, 15, 1});
    }

    /* renamed from: s0 */
    public final boolean m59896s0(byte[] bArr) {
        return Intrinsics.compare((int) bArr[3], 1) == 0;
    }

    /* renamed from: t0 */
    public final boolean m59893t0(byte[] bArr) {
        byte[] sliceArray;
        sliceArray = ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(0, 2));
        return Arrays.equals(sliceArray, new byte[]{5, 5, 1});
    }

    /* renamed from: u0 */
    public final boolean m59890u0(byte[] bArr) {
        byte[] sliceArray;
        sliceArray = ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(0, 1));
        return Arrays.equals(sliceArray, new byte[]{6, 2});
    }

    /* renamed from: v0 */
    public final boolean m59887v0(byte[] bArr) {
        byte[] sliceArray;
        sliceArray = ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(0, 2));
        return Arrays.equals(sliceArray, new byte[]{5, 2, 1});
    }

    /* renamed from: v1 */
    public final AbstractC23442F<SmartlockResponse> m59886v1() {
        InterfaceC42042hI5 interfaceC42042hI5 = this.f62078b;
        String str = this.f62091o;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("macAddress");
            str = null;
        }
        String str2 = str;
        SmartlockKey m59926i0 = m59926i0();
        AbstractC23442F<SmartlockResponse> m36545f = interfaceC42042hI5.m36545f(new PromoteKeyBody(str2, null, (m59926i0 == null || (r1 = m59926i0.getId()) == null) ? "" : "", 2, null));
        final C14089X c14089x = C14089X.f62123g;
        AbstractC23442F<SmartlockResponse> m33152N = m36545f.m33165A(new InterfaceC23492o() { // from class: TG5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m59883w1;
                m59883w1 = SmartlockAssociationV2Presenter.m59883w1(Function1.this, obj);
                return m59883w1;
            }
        }).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "smartlockClient.promoteK…dSchedulers.mainThread())");
        return m33152N;
    }

    /* renamed from: w0 */
    public final byte[] m59884w0(byte[] bArr) {
        byte[] sliceArray;
        byte[] bArr2 = new byte[1];
        new Random().nextBytes(bArr2);
        ByteBuffer put = ByteBuffer.allocate(16).order(ByteOrder.BIG_ENDIAN).put(new byte[]{7, 2, 8});
        sliceArray = ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(8, 15));
        ByteBuffer put2 = put.put(sliceArray);
        byte[] bArr3 = this.f62092p;
        if (bArr3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionToken");
            bArr3 = null;
        }
        byte[] array = put2.put(bArr3).put(bArr2).array();
        Intrinsics.checkNotNullExpressionValue(array, "allocate(16)\n      .orde…t(padding)\n      .array()");
        return array;
    }

    /* renamed from: x0 */
    public final byte[] m59881x0(byte[] bArr) {
        byte[] sliceArray;
        byte[] bArr2 = new byte[1];
        new Random().nextBytes(bArr2);
        ByteBuffer put = ByteBuffer.allocate(16).order(ByteOrder.BIG_ENDIAN).put(new byte[]{7, 1, 8});
        sliceArray = ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(0, 7));
        ByteBuffer put2 = put.put(sliceArray);
        byte[] bArr3 = this.f62092p;
        if (bArr3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionToken");
            bArr3 = null;
        }
        byte[] array = put2.put(bArr3).put(bArr2).array();
        Intrinsics.checkNotNullExpressionValue(array, "allocate(16)\n      .orde…t(padding)\n      .array()");
        return array;
    }

    /* renamed from: x1 */
    public final SmartlockKey m59880x1(SmartlockResponse smartlockResponse) {
        Object obj;
        Iterator<T> it = smartlockResponse.getKeysList().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((SmartlockKey) obj).getProvisional()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (SmartlockKey) obj;
    }

    /* renamed from: y0 */
    public final void m59878y0() {
        Observable<C36154Tk5> observeOn = this.f62096t.observeOn(C23454a.m33087a());
        final C14112p c14112p = new C14112p();
        Observable<C36154Tk5> observeOn2 = observeOn.doOnNext(new InterfaceC23484g() { // from class: cH5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationV2Presenter.m59875z0(Function1.this, obj);
            }
        }).observeOn(C24542a.m31932c());
        final C14113q c14113q = new C14113q();
        Observable<C36154Tk5> filter = observeOn2.filter(new InterfaceC23494q() { // from class: mH5
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m60018A0;
                m60018A0 = SmartlockAssociationV2Presenter.m60018A0(Function1.this, obj);
                return m60018A0;
            }
        });
        final C14114r c14114r = new C14114r();
        Observable<C36154Tk5> doOnNext = filter.doOnNext(new InterfaceC23484g() { // from class: nH5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationV2Presenter.m60015B0(Function1.this, obj);
            }
        });
        final C14115s c14115s = new C14115s();
        Observable<R> flatMapMaybe = doOnNext.flatMapMaybe(new InterfaceC23492o() { // from class: oH5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m60012C0;
                m60012C0 = SmartlockAssociationV2Presenter.m60012C0(Function1.this, obj);
                return m60012C0;
            }
        });
        final C14121t c14121t = new C14121t();
        Observable doOnNext2 = flatMapMaybe.doOnNext(new InterfaceC23484g() { // from class: qH5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationV2Presenter.m60009D0(Function1.this, obj);
            }
        });
        final C14122u c14122u = new C14122u();
        Observable observeOn3 = doOnNext2.filter(new InterfaceC23494q() { // from class: rH5
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m60006E0;
                m60006E0 = SmartlockAssociationV2Presenter.m60006E0(Function1.this, obj);
                return m60006E0;
            }
        }).observeOn(C24542a.m31932c());
        final C14123v c14123v = new C14123v();
        Observable flatMap = observeOn3.flatMap(new InterfaceC23492o() { // from class: sH5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m60003F0;
                m60003F0 = SmartlockAssociationV2Presenter.m60003F0(Function1.this, obj);
                return m60003F0;
            }
        });
        final C14125w c14125w = C14125w.f62168g;
        Observable flatMapSingle = flatMap.flatMapSingle(new InterfaceC23492o() { // from class: tH5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m60000G0;
                m60000G0 = SmartlockAssociationV2Presenter.m60000G0(Function1.this, obj);
                return m60000G0;
            }
        });
        final C14127x c14127x = C14127x.f62170g;
        Observable flatMap2 = flatMapSingle.flatMap(new InterfaceC23492o() { // from class: uH5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m59997H0;
                m59997H0 = SmartlockAssociationV2Presenter.m59997H0(Function1.this, obj);
                return m59997H0;
            }
        });
        final C14101g c14101g = new C14101g();
        Observable flatMap3 = flatMap2.flatMap(new InterfaceC23492o() { // from class: vH5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m59994I0;
                m59994I0 = SmartlockAssociationV2Presenter.m59994I0(Function1.this, obj);
                return m59994I0;
            }
        });
        final C14103h c14103h = C14103h.f62144g;
        Observable map = flatMap3.map(new InterfaceC23492o() { // from class: dH5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                byte[] m59991J0;
                m59991J0 = SmartlockAssociationV2Presenter.m59991J0(Function1.this, obj);
                return m59991J0;
            }
        });
        final C14104i c14104i = new C14104i();
        Observable observeOn4 = map.map(new InterfaceC23492o() { // from class: fH5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                byte[] m59988K0;
                m59988K0 = SmartlockAssociationV2Presenter.m59988K0(Function1.this, obj);
                return m59988K0;
            }
        }).retry(1L).subscribeOn(C24542a.m31932c()).observeOn(C23454a.m33087a());
        final C14105j c14105j = new C14105j();
        Observable doOnNext3 = observeOn4.doOnNext(new InterfaceC23484g() { // from class: gH5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationV2Presenter.m59985L0(Function1.this, obj);
            }
        });
        final C14106k c14106k = new C14106k();
        Observable takeUntil = doOnNext3.takeUntil(new InterfaceC23494q() { // from class: hH5
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m59982M0;
                m59982M0 = SmartlockAssociationV2Presenter.m59982M0(Function1.this, obj);
                return m59982M0;
            }
        });
        final C14107l c14107l = new C14107l();
        AbstractC23442F m33152N = takeUntil.flatMapMaybe(new InterfaceC23492o() { // from class: iH5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m59979N0;
                m59979N0 = SmartlockAssociationV2Presenter.m59979N0(Function1.this, obj);
                return m59979N0;
            }
        }).ignoreElements().m33042m(AbstractC23442F.m33124k(new Callable() { // from class: jH5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23447K m59976O0;
                m59976O0 = SmartlockAssociationV2Presenter.m59976O0(SmartlockAssociationV2Presenter.this);
                return m59976O0;
            }
        })).m33142Y(C24542a.m31932c()).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "private fun listenForSma…\")\n        }\n      })\n  }");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f62083g));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14110n c14110n = new C14110n();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: kH5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationV2Presenter.m59970Q0(Function1.this, obj);
            }
        };
        final C14111o c14111o = new C14111o();
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: lH5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationV2Presenter.m59968R0(Function1.this, obj);
            }
        });
    }

    /* renamed from: y1 */
    public final AbstractC23442F<byte[]> m59877y1(byte[] bArr, byte[] bArr2) {
        AbstractC23442F<byte[]> abstractC23442F;
        String arrays = Arrays.toString(bArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        C41318g46.m40163a("sending payload to lock " + arrays, new Object[0]);
        byte[] m59917l0 = m59917l0(bArr, bArr2);
        String arrays2 = Arrays.toString(m59917l0);
        Intrinsics.checkNotNullExpressionValue(arrays2, "toString(this)");
        C41318g46.m40163a("encrypted payload: " + arrays2, new Object[0]);
        InterfaceC44023ke5 interfaceC44023ke5 = this.f62090n;
        if (interfaceC44023ke5 != null) {
            abstractC23442F = interfaceC44023ke5.mo27056c(SmartlockManagerImpl.EnumC14385i.f62936c.m59190b(), m59917l0);
        } else {
            abstractC23442F = null;
        }
        if (abstractC23442F == null) {
            AbstractC23442F<byte[]> m33100x = AbstractC23442F.m33100x(NotConnected.f62113b);
            Intrinsics.checkNotNullExpressionValue(m33100x, "error(NotConnected)");
            return m33100x;
        }
        return abstractC23442F;
    }
}
