package co.bird.android.app.feature.physicallock.smartlock;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter;
import co.bird.android.app.manager.SmartlockManagerImpl;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.constant.Permission;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WirePhysicalLock;
import co.bird.api.request.PromoteProvisionalSmartlockBody;
import co.bird.api.request.ProvisionSmartlockBody;
import co.bird.api.request.ReplacePhysicalLockBody;
import co.bird.api.response.ProvisionSmartlockResponse;
import co.bird.api.response.ProvisionalSmartlock;
import com.amazonaws.services.p026s3.internal.crypto.JceEncryptionConstants;
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
import io.reactivex.rxkotlin.C24530g;
import io.reactivex.schedulers.C24542a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import p000.InterfaceC40099e13;
import p000.InterfaceC5225MD;
@Metadata(m28433d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 n2\u00020\u0001:\u00023oBW\b\u0007\u0012\u0006\u00105\u001a\u000202\u0012\u0006\u00109\u001a\u000206\u0012\u0006\u0010=\u001a\u00020:\u0012\u0006\u0010A\u001a\u00020>\u0012\b\b\u0001\u0010E\u001a\u00020B\u0012\u000e\b\u0001\u0010J\u001a\b\u0012\u0004\u0012\u00020G0F\u0012\b\b\u0001\u0010N\u001a\u00020K\u0012\b\b\u0001\u0010R\u001a\u00020O¢\u0006\u0004\bl\u0010mJ\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004H\u0002J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u0004H\u0002J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\f\u0010\u0014\u001a\u00020\u0002*\u00020\u0013H\u0002J\f\u0010\u0015\u001a\u00020\u0013*\u00020\u0002H\u0002J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0002J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0002J\b\u0010\u001b\u001a\u00020\u0002H\u0002J\b\u0010\u001c\u001a\u00020\u0002H\u0002J\b\u0010\u001d\u001a\u00020\u0002H\u0002J\b\u0010\u001e\u001a\u00020\u0002H\u0002J\b\u0010\u001f\u001a\u00020\u0002H\u0002J\u0018\u0010!\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0002H\u0002J\u0018\u0010\"\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0002H\u0002J\f\u0010$\u001a\u00020#*\u00020\u0002H\u0002J\f\u0010%\u001a\u00020#*\u00020\u0002H\u0002J\f\u0010&\u001a\u00020#*\u00020\u0002H\u0002J\f\u0010'\u001a\u00020#*\u00020\u0002H\u0002J\f\u0010(\u001a\u00020#*\u00020\u0002H\u0002J\f\u0010)\u001a\u00020#*\u00020\u0002H\u0002J\f\u0010*\u001a\u00020#*\u00020\u0002H\u0002J\u0006\u0010,\u001a\u00020+J\u000e\u0010.\u001a\u00020+2\u0006\u0010-\u001a\u00020\u0013J\u000e\u00101\u001a\u00020+2\u0006\u00100\u001a\u00020/R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020G0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010T\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010\u001dR\u0016\u0010V\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010\u001dR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00130W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010^\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010\u0018\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010\u000f\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\ba\u0010`R\u0016\u0010c\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bb\u0010`R\u0016\u0010-\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bd\u0010`R\u0016\u0010g\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010i\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bh\u0010`R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bj\u0010k¨\u0006p"}, m28432d2 = {"Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;", "", "", "payload", "Lio/reactivex/F;", "k1", "LHM4;", "Lco/bird/api/response/ProvisionalSmartlock;", "g1", "Lco/bird/android/model/wire/WirePhysicalLock;", "S", "o1", "j1", "i1", "oldPassword", "newPassword", "W", "targetAesKey", "U", "", "c0", "a0", "o0", "n0", "newAesKey", "m0", "l0", "m1", "Y", "Z", "l1", "n1", "key", "d0", "b0", "", "j0", "i0", "e0", "k0", "f0", "g0", "h0", "", "s0", "serialNumber", "M0", "Lco/bird/android/model/wire/WireBird;", "bird", "p0", "LMD;", C17296a.f69688o, "LMD;", "baseBluetoothManager", "LhI5;", "b", "LhI5;", "smartlockClient", "LJy4;", "c", "LJy4;", "repairClient", "Lgl;", DateTokenConverter.CONVERTER_KEY, "Lgl;", "preference", "LDQ3;", "e", "LDQ3;", "permissionManager", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "f", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "LFF5;", "g", "LFF5;", "ui", "Le13;", "h", "Le13;", "navigator", "i", "resetKey", "j", "revertToFactorySettings", "", "k", "Ljava/util/List;", "seenLockMacAddresses", "Lke5;", "l", "Lke5;", "smartlockConnection", "m", "Ljava/lang/String;", "n", "o", "macAddress", "p", "q", "[B", "sessionToken", "r", "encryptedUnlockPayload", "s", "Lco/bird/android/model/wire/WireBird;", "<init>", "(LMD;LhI5;LJy4;Lgl;LDQ3;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LFF5;Le13;)V", "t", "NotConnected", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSmartlockAssociationPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartlockAssociationPresenter.kt\nco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,592:1\n180#2:593\n180#2:594\n180#2:595\n180#2:596\n180#2:597\n180#2:598\n199#2:599\n199#2:600\n*S KotlinDebug\n*F\n+ 1 SmartlockAssociationPresenter.kt\nco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter\n*L\n94#1:593\n104#1:594\n132#1:595\n143#1:596\n169#1:597\n179#1:598\n321#1:599\n343#1:600\n*E\n"})
/* loaded from: classes2.dex */
public final class SmartlockAssociationPresenter {

    /* renamed from: t */
    public static final C14039a f61999t = new C14039a(null);

    /* renamed from: u */
    public static final int f62000u = 8;

    /* renamed from: v */
    public static final byte[] f62001v = {6, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a */
    public final InterfaceC5225MD f62002a;

    /* renamed from: b */
    public final InterfaceC42042hI5 f62003b;

    /* renamed from: c */
    public final InterfaceC33939Jy4 f62004c;

    /* renamed from: d */
    public final C22454gl f62005d;

    /* renamed from: e */
    public final DQ3 f62006e;

    /* renamed from: f */
    public final LifecycleScopeProvider<EnumC7097RE> f62007f;

    /* renamed from: g */
    public final FF5 f62008g;

    /* renamed from: h */
    public final InterfaceC40099e13 f62009h;

    /* renamed from: i */
    public boolean f62010i;

    /* renamed from: j */
    public boolean f62011j;

    /* renamed from: k */
    public final List<String> f62012k;

    /* renamed from: l */
    public InterfaceC44023ke5 f62013l;

    /* renamed from: m */
    public String f62014m;

    /* renamed from: n */
    public String f62015n;

    /* renamed from: o */
    public String f62016o;

    /* renamed from: p */
    public String f62017p;

    /* renamed from: q */
    public byte[] f62018q;

    /* renamed from: r */
    public String f62019r;

    /* renamed from: s */
    public WireBird f62020s;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\u0010\u0004\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\"\u0010\u0003\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Pair;)[B"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$A */
    /* loaded from: classes2.dex */
    public static final class C14019A extends Lambda implements Function1<Pair<? extends byte[], ? extends byte[]>, byte[]> {

        /* renamed from: g */
        public static final C14019A f62021g = new C14019A();

        public C14019A() {
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
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$B */
    /* loaded from: classes2.dex */
    public static final class C14020B extends Lambda implements Function1<byte[], byte[]> {
        public C14020B() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final byte[] invoke(byte[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            SmartlockAssociationPresenter smartlockAssociationPresenter = SmartlockAssociationPresenter.this;
            return smartlockAssociationPresenter.m60112b0(it, smartlockAssociationPresenter.m60120Y());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "([B)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$C */
    /* loaded from: classes2.dex */
    public static final class C14021C extends Lambda implements Function1<byte[], Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f62024h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14021C(String str) {
            super(1);
            this.f62024h = str;
        }

        /* renamed from: a */
        public final void m60047a(byte[] it) {
            byte[] sliceArray;
            SmartlockAssociationPresenter smartlockAssociationPresenter = SmartlockAssociationPresenter.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            if (smartlockAssociationPresenter.m60088j0(it)) {
                SmartlockAssociationPresenter smartlockAssociationPresenter2 = SmartlockAssociationPresenter.this;
                sliceArray = ArraysKt___ArraysKt.sliceArray(it, new IntRange(3, 6));
                smartlockAssociationPresenter2.f62018q = sliceArray;
            } else if (SmartlockAssociationPresenter.this.m60103e0(it)) {
                SmartlockAssociationPresenter.this.f62008g.mo105546P0(false);
                SmartlockAssociationPresenter.this.f62008g.mo105548O(true);
                SmartlockAssociationPresenter.this.f62008g.mo105547O0(true);
                SmartlockAssociationPresenter.this.f62005d.m37669V1(this.f62024h, SmartlockAssociationPresenter.this.f62011j);
            } else if (SmartlockAssociationPresenter.this.m60085k0(it)) {
                SmartlockAssociationPresenter.this.f62008g.mo105547O0(false);
                SmartlockAssociationPresenter.this.f62008g.mo105552H1(true);
                SmartlockAssociationPresenter.this.f62008g.mo105554Eh(true);
                if (SmartlockAssociationPresenter.this.f62010i) {
                    SmartlockAssociationPresenter smartlockAssociationPresenter3 = SmartlockAssociationPresenter.this;
                    smartlockAssociationPresenter3.f62019r = smartlockAssociationPresenter3.m60115a0(smartlockAssociationPresenter3.m60106d0(it, smartlockAssociationPresenter3.m60120Y()));
                }
            } else if (SmartlockAssociationPresenter.this.m60097g0(it) && SmartlockAssociationPresenter.this.m60094h0(it)) {
                C41318g46.m40163a("got successful lock state response, now promoting provisional...", new Object[0]);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            m60047a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "", C17296a.f69688o, "([B)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$D */
    /* loaded from: classes2.dex */
    public static final class C14022D extends Lambda implements Function1<byte[], Boolean> {
        public C14022D() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(byte[] it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (SmartlockAssociationPresenter.this.m60097g0(it) && SmartlockAssociationPresenter.this.m60094h0(it)) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", C17296a.f69688o, "([B)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$E */
    /* loaded from: classes2.dex */
    public static final class C14023E extends Lambda implements Function1<byte[], InterfaceC24574u<? extends byte[]>> {
        public C14023E() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends byte[]> invoke(byte[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String arrays = Arrays.toString(it);
            C41318g46.m40163a("got a response " + arrays, new Object[0]);
            if (SmartlockAssociationPresenter.this.m60088j0(it)) {
                C41318g46.m40163a("got a session token", new Object[0]);
                SmartlockAssociationPresenter smartlockAssociationPresenter = SmartlockAssociationPresenter.this;
                return smartlockAssociationPresenter.m60124W(smartlockAssociationPresenter.m60081l1(), SmartlockAssociationPresenter.this.m60075n1()).m33125j0();
            } else if (SmartlockAssociationPresenter.this.m60091i0(it)) {
                C41318g46.m40163a("got a password change response", new Object[0]);
                SmartlockAssociationPresenter smartlockAssociationPresenter2 = SmartlockAssociationPresenter.this;
                return smartlockAssociationPresenter2.m60128U(smartlockAssociationPresenter2.m60078m1()).m33125j0();
            } else if (SmartlockAssociationPresenter.this.m60103e0(it)) {
                C41318g46.m40163a("got an aes key change response", new Object[0]);
                return SmartlockAssociationPresenter.this.m60072o1().m33125j0();
            } else if (SmartlockAssociationPresenter.this.m60100f0(it)) {
                C41318g46.m40163a("got a cable inserted response", new Object[0]);
                return SmartlockAssociationPresenter.this.m60090i1().m33118n(3L, TimeUnit.SECONDS).m33125j0();
            } else if (SmartlockAssociationPresenter.this.m60097g0(it) && !SmartlockAssociationPresenter.this.m60094h0(it)) {
                C41318g46.m40163a("got a lock state response but not locked", new Object[0]);
                return SmartlockAssociationPresenter.this.m60087j1().m33125j0();
            } else {
                C41318g46.m40163a("received some other kind of response", new Object[0]);
                return AbstractC24507p.m32024u();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$F */
    /* loaded from: classes2.dex */
    public static final class C14024F extends Lambda implements Function1<Throwable, Unit> {
        public C14024F() {
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
                SmartlockAssociationPresenter.this.f62008g.mo105554Eh(false);
                SmartlockAssociationPresenter.this.f62008g.mo105541c1(true);
                SmartlockAssociationPresenter.this.f62008g.error(C45871nl4.error_network);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/ProvisionalSmartlock;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$G */
    /* loaded from: classes2.dex */
    public static final class C14025G extends Lambda implements Function1<HM4<ProvisionalSmartlock>, Unit> {
        public C14025G() {
            super(1);
        }

        /* renamed from: a */
        public final void m60044a(HM4<ProvisionalSmartlock> hm4) {
            C41318g46.m40163a("promoted smartlock!", new Object[0]);
            SmartlockAssociationPresenter.this.f62008g.mo105554Eh(false);
            SmartlockAssociationPresenter.this.f62008g.mo105545Pb(true);
            SmartlockAssociationPresenter.this.f62008g.mo105556A1(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<ProvisionalSmartlock> hm4) {
            m60044a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$H */
    /* loaded from: classes2.dex */
    public static final class C14026H extends Lambda implements Function1<Throwable, Unit> {
        public C14026H() {
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
            FF5 ff5 = SmartlockAssociationPresenter.this.f62008g;
            String message = it.getMessage();
            ff5.error("Something went wrong: " + message);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LTk5;", "it", "", C17296a.f69688o, "(LTk5;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$I */
    /* loaded from: classes2.dex */
    public static final class C14027I extends Lambda implements Function1<C36154Tk5, Boolean> {

        /* renamed from: g */
        public static final C14027I f62030g = new C14027I();

        public C14027I() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C36154Tk5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(C12325bE.m64814b(it));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LTk5;", "it", "", C17296a.f69688o, "(LTk5;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$J */
    /* loaded from: classes2.dex */
    public static final class C14028J extends Lambda implements Function1<C36154Tk5, Boolean> {
        public C14028J() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C36154Tk5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(!SmartlockAssociationPresenter.this.f62012k.contains(it.m83016a().mo17280e()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTk5;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LTk5;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$K */
    /* loaded from: classes2.dex */
    public static final class C14029K extends Lambda implements Function1<C36154Tk5, Unit> {
        public C14029K() {
            super(1);
        }

        /* renamed from: a */
        public final void m60041a(C36154Tk5 c36154Tk5) {
            List list = SmartlockAssociationPresenter.this.f62012k;
            String mo17280e = c36154Tk5.m83016a().mo17280e();
            Intrinsics.checkNotNullExpressionValue(mo17280e, "it.bleDevice.macAddress");
            list.add(mo17280e);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36154Tk5 c36154Tk5) {
            m60041a(c36154Tk5);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001aÊ\u0001\u0012^\b\u0001\u0012Z\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0004*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005 \u0004*,\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0004*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003 \u0004*d\u0012^\b\u0001\u0012Z\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0004*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005 \u0004*,\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0004*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"LTk5;", "it", "Lio/reactivex/K;", "Lkotlin/Pair;", "kotlin.jvm.PlatformType", "LHM4;", "Lco/bird/api/response/ProvisionSmartlockResponse;", C17296a.f69688o, "(LTk5;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$L */
    /* loaded from: classes2.dex */
    public static final class C14030L extends Lambda implements Function1<C36154Tk5, InterfaceC23447K<? extends Pair<? extends C36154Tk5, ? extends HM4<ProvisionSmartlockResponse>>>> {

        /* renamed from: h */
        public final /* synthetic */ String f62034h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14030L(String str) {
            super(1);
            this.f62034h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Pair<C36154Tk5, HM4<ProvisionSmartlockResponse>>> invoke(C36154Tk5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C24530g c24530g = C24530g.f91174a;
            AbstractC23442F m33158H = AbstractC23442F.m33158H(it);
            Intrinsics.checkNotNullExpressionValue(m33158H, "just(it)");
            InterfaceC42042hI5 interfaceC42042hI5 = SmartlockAssociationPresenter.this.f62003b;
            String mo17280e = it.m83016a().mo17280e();
            Intrinsics.checkNotNullExpressionValue(mo17280e, "it.bleDevice.macAddress");
            return c24530g.m31946a(m33158H, interfaceC42042hI5.m36549b(new ProvisionSmartlockBody(mo17280e, this.f62034h)));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062^\u0010\u0005\u001aZ\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0002*,\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "LTk5;", "kotlin.jvm.PlatformType", "LHM4;", "Lco/bird/api/response/ProvisionSmartlockResponse;", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$N */
    /* loaded from: classes2.dex */
    public static final class C14032N extends Lambda implements Function1<Pair<? extends C36154Tk5, ? extends HM4<ProvisionSmartlockResponse>>, Unit> {
        public C14032N() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends C36154Tk5, ? extends HM4<ProvisionSmartlockResponse>> pair) {
            invoke2((Pair<? extends C36154Tk5, HM4<ProvisionSmartlockResponse>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends C36154Tk5, HM4<ProvisionSmartlockResponse>> pair) {
            ProvisionSmartlockResponse m103944a = pair.component2().m103944a();
            Intrinsics.checkNotNull(m103944a);
            ProvisionSmartlockResponse provisionSmartlockResponse = m103944a;
            SmartlockAssociationPresenter.this.f62016o = provisionSmartlockResponse.getSmartlockResponse().getMacAddress();
            SmartlockAssociationPresenter.this.f62014m = provisionSmartlockResponse.getKey().getAesEncryptionKey();
            SmartlockAssociationPresenter.this.f62015n = provisionSmartlockResponse.getKey().getPassword();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$NotConnected;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes2.dex */
    public static final class NotConnected extends Exception {

        /* renamed from: b */
        public static final NotConnected f62037b = new NotConnected();

        private NotConnected() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lke5;", "connection", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "b", "(Lke5;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$P */
    /* loaded from: classes2.dex */
    public static final class C14035P extends Lambda implements Function1<InterfaceC44023ke5, InterfaceC23447K<? extends InterfaceC44023ke5>> {

        /* renamed from: g */
        public static final C14035P f62040g = new C14035P();

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lue5;", "it", "Lke5;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lue5;)Lke5;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$P$a */
        /* loaded from: classes2.dex */
        public static final class C14036a extends Lambda implements Function1<C49952ue5, InterfaceC44023ke5> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC44023ke5 f62041g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14036a(InterfaceC44023ke5 interfaceC44023ke5) {
                super(1);
                this.f62041g = interfaceC44023ke5;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC44023ke5 invoke(C49952ue5 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f62041g;
            }
        }

        public C14035P() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC44023ke5 m60034c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC44023ke5) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends InterfaceC44023ke5> invoke(InterfaceC44023ke5 connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            C41318g46.m40163a("discovering services...", new Object[0]);
            AbstractC23442F<C49952ue5> mo27058a = connection.mo27058a();
            final C14036a c14036a = new C14036a(connection);
            return mo27058a.m33157I(new InterfaceC23492o() { // from class: CG5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC44023ke5 m60034c;
                    m60034c = SmartlockAssociationPresenter.C14035P.m60034c(Function1.this, obj);
                    return m60034c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\u0010\b\u001ab\u0012*\b\u0001\u0012&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003 \u0005*0\u0012*\b\u0001\u0012&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lke5;", "it", "Lio/reactivex/B;", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "invoke", "(Lke5;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$Q */
    /* loaded from: classes2.dex */
    public static final class C14037Q extends Lambda implements Function1<InterfaceC44023ke5, InterfaceC23434B<? extends Observable<byte[]>>> {

        /* renamed from: g */
        public static final C14037Q f62042g = new C14037Q();

        public C14037Q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Observable<byte[]>> invoke(InterfaceC44023ke5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C41318g46.m40163a("setting up notification...", new Object[0]);
            return it.mo27057b(SmartlockManagerImpl.EnumC14385i.f62937d.m59190b(), EnumC41046fd3.DEFAULT).delaySubscription(500L, TimeUnit.MILLISECONDS);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/ProvisionalSmartlock;", "response", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$R */
    /* loaded from: classes2.dex */
    public static final class C14038R extends Lambda implements Function1<HM4<ProvisionalSmartlock>, InterfaceC23447K<? extends HM4<ProvisionalSmartlock>>> {

        /* renamed from: g */
        public static final C14038R f62043g = new C14038R();

        public C14038R() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends HM4<ProvisionalSmartlock>> invoke(HM4<ProvisionalSmartlock> response) {
            AbstractC23442F m33158H;
            Intrinsics.checkNotNullParameter(response, "response");
            C41318g46.m40163a("got a response from API: " + response, new Object[0]);
            ProvisionalSmartlock m103944a = response.m103944a();
            if (m103944a != null) {
                if (m103944a.getProvisional()) {
                    m33158H = AbstractC23442F.m33100x(new Throwable("Did not promote to provisional"));
                } else {
                    m33158H = AbstractC23442F.m33158H(response);
                }
                if (m33158H != null) {
                    return m33158H;
                }
            }
            return AbstractC23442F.m33100x(new Throwable("Promote provisional API not successful"));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$a;", "", "", "FACTORY_DEFAULT_KEY", "Ljava/lang/String;", "FACTORY_PASSWORD", "", "TOKEN_REQUEST", "[B", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$a */
    /* loaded from: classes2.dex */
    public static final class C14039a {
        public /* synthetic */ C14039a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C14039a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/wire/WirePhysicalLock;", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$b */
    /* loaded from: classes2.dex */
    public static final class C14040b extends Lambda implements Function1<HM4<WirePhysicalLock>, InterfaceC23447K<? extends HM4<WirePhysicalLock>>> {

        /* renamed from: g */
        public static final C14040b f62044g = new C14040b();

        public C14040b() {
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
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$c */
    /* loaded from: classes2.dex */
    public static final class C14041c extends Lambda implements Function1<byte[], InterfaceC23447K<? extends byte[]>> {

        /* renamed from: h */
        public final /* synthetic */ byte[] f62046h;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$c$a */
        /* loaded from: classes2.dex */
        public static final class C14042a extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ SmartlockAssociationPresenter f62047g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14042a(SmartlockAssociationPresenter smartlockAssociationPresenter) {
                super(1);
                this.f62047g = smartlockAssociationPresenter;
            }

            /* renamed from: a */
            public final void m60029a(InterfaceC23465c interfaceC23465c) {
                this.f62047g.f62010i = true;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m60029a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14041c(byte[] bArr) {
            super(1);
            this.f62046h = bArr;
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends byte[]> invoke(byte[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            SmartlockAssociationPresenter smartlockAssociationPresenter = SmartlockAssociationPresenter.this;
            AbstractC23442F m60084k1 = smartlockAssociationPresenter.m60084k1(smartlockAssociationPresenter.m60082l0(this.f62046h));
            final C14042a c14042a = new C14042a(SmartlockAssociationPresenter.this);
            return m60084k1.m33102v(new InterfaceC23484g() { // from class: zG5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    SmartlockAssociationPresenter.C14041c.invoke$lambda$0(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "invoke", "([B)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$d */
    /* loaded from: classes2.dex */
    public static final class C14043d extends Lambda implements Function1<byte[], InterfaceC23447K<? extends byte[]>> {

        /* renamed from: h */
        public final /* synthetic */ byte[] f62049h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14043d(byte[] bArr) {
            super(1);
            this.f62049h = bArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends byte[]> invoke(byte[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            SmartlockAssociationPresenter smartlockAssociationPresenter = SmartlockAssociationPresenter.this;
            return smartlockAssociationPresenter.m60084k1(smartlockAssociationPresenter.m60076n0(this.f62049h));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/wire/WirePhysicalLock;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$e */
    /* loaded from: classes2.dex */
    public static final class C14044e extends Lambda implements Function1<HM4<WirePhysicalLock>, Unit> {
        public C14044e() {
            super(1);
        }

        /* renamed from: a */
        public final void m60028a(HM4<WirePhysicalLock> hm4) {
            SmartlockAssociationPresenter.this.f62008g.mo105539g0(false);
            SmartlockAssociationPresenter.this.f62008g.mo105536s0(true);
            SmartlockAssociationPresenter.this.f62008g.mo105549N(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<WirePhysicalLock> hm4) {
            m60028a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$f */
    /* loaded from: classes2.dex */
    public static final class C14045f extends Lambda implements Function1<Throwable, Unit> {
        public C14045f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            SmartlockAssociationPresenter.this.f62008g.error(th.getMessage());
            SmartlockAssociationPresenter.this.f62008g.mo105539g0(false);
            SmartlockAssociationPresenter.this.f62008g.mo105553H0(true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$g */
    /* loaded from: classes2.dex */
    public static final class C14046g extends Lambda implements Function1<Throwable, Unit> {
        public C14046g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            SmartlockAssociationPresenter.this.f62008g.error(th.getMessage());
            SmartlockAssociationPresenter.this.f62008g.mo105541c1(true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$h */
    /* loaded from: classes2.dex */
    public static final class C14047h extends Lambda implements Function1<Unit, Unit> {
        public C14047h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.goToScanBirdForResult$default(SmartlockAssociationPresenter.this.f62009h, null, null, null, MapMode.SERVICE_CENTER, null, false, 55, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$i */
    /* loaded from: classes2.dex */
    public static final class C14048i extends Lambda implements Function1<Unit, Unit> {
        public C14048i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            SmartlockAssociationPresenter.this.f62008g.mo105539g0(true);
            SmartlockAssociationPresenter.this.f62008g.mo105553H0(false);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LHM4;", "Lco/bird/android/model/wire/WirePhysicalLock;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$j */
    /* loaded from: classes2.dex */
    public static final class C14049j extends Lambda implements Function1<Unit, InterfaceC23447K<? extends HM4<WirePhysicalLock>>> {
        public C14049j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends HM4<WirePhysicalLock>> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return SmartlockAssociationPresenter.this.m60132S();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$k */
    /* loaded from: classes2.dex */
    public static final class C14050k extends Lambda implements Function1<Throwable, Unit> {
        public C14050k() {
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
                SmartlockAssociationPresenter.this.f62008g.error(C45871nl4.error_network);
                SmartlockAssociationPresenter.this.f62008g.mo105553H0(true);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "e", "", C17296a.f69688o, "(Ljava/lang/Throwable;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$l */
    /* loaded from: classes2.dex */
    public static final class C14051l extends Lambda implements Function1<Throwable, Boolean> {

        /* renamed from: g */
        public static final C14051l f62057g = new C14051l();

        public C14051l() {
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
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$m */
    /* loaded from: classes2.dex */
    public static final class C14052m extends Lambda implements Function1<C24576w<HM4<WirePhysicalLock>>, Unit> {
        public C14052m() {
            super(1);
        }

        /* renamed from: a */
        public final void m60026a(C24576w<HM4<WirePhysicalLock>> c24576w) {
            SmartlockAssociationPresenter.this.f62008g.mo105539g0(false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C24576w<HM4<WirePhysicalLock>> c24576w) {
            m60026a(c24576w);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/wire/WirePhysicalLock;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$n */
    /* loaded from: classes2.dex */
    public static final class C14053n extends Lambda implements Function1<HM4<WirePhysicalLock>, Unit> {
        public C14053n() {
            super(1);
        }

        /* renamed from: a */
        public final void m60025a(HM4<WirePhysicalLock> hm4) {
            SmartlockAssociationPresenter.this.f62008g.mo105536s0(true);
            SmartlockAssociationPresenter.this.f62008g.mo105549N(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<WirePhysicalLock> hm4) {
            m60025a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$o */
    /* loaded from: classes2.dex */
    public static final class C14054o extends Lambda implements Function1<Throwable, Unit> {
        public C14054o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            SmartlockAssociationPresenter.this.f62008g.error(th.getMessage());
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$p */
    /* loaded from: classes2.dex */
    public static final class C14055p extends Lambda implements Function1<Unit, Unit> {
        public C14055p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            SmartlockAssociationPresenter.this.f62008g.mo105549N(false);
            SmartlockAssociationPresenter.this.f62008g.mo105543W(true);
            SmartlockAssociationPresenter.this.f62008g.mo105537r();
            SmartlockAssociationPresenter.this.f62008g.mo105542a0(true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$q */
    /* loaded from: classes2.dex */
    public static final class C14056q extends Lambda implements Function1<Unit, Unit> {
        public C14056q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            SmartlockAssociationPresenter.this.f62009h.mo37030e3();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LFQ3;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$r */
    /* loaded from: classes2.dex */
    public static final class C14057r extends Lambda implements Function1<Unit, InterfaceC23447K<? extends FQ3>> {
        public C14057r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends FQ3> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return SmartlockAssociationPresenter.this.f62006e.m110485l(Permission.CAMERA);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$s */
    /* loaded from: classes2.dex */
    public static final class C14058s extends Lambda implements Function1<FQ3, Unit> {
        public C14058s() {
            super(1);
        }

        /* renamed from: a */
        public final void m60024a(FQ3 fq3) {
            if (fq3.m107154a()) {
                SmartlockAssociationPresenter.this.f62009h.mo36931v0();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m60024a(fq3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$t */
    /* loaded from: classes2.dex */
    public static final class C14059t extends Lambda implements Function1<Unit, Unit> {
        public C14059t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            SmartlockAssociationPresenter.this.f62008g.mo105554Eh(true);
            SmartlockAssociationPresenter.this.f62008g.mo105541c1(false);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LHM4;", "Lco/bird/api/response/ProvisionalSmartlock;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$u */
    /* loaded from: classes2.dex */
    public static final class C14060u extends Lambda implements Function1<Unit, InterfaceC23447K<? extends HM4<ProvisionalSmartlock>>> {
        public C14060u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends HM4<ProvisionalSmartlock>> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return SmartlockAssociationPresenter.this.m60096g1();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$v */
    /* loaded from: classes2.dex */
    public static final class C14061v extends Lambda implements Function1<Throwable, Unit> {
        public C14061v() {
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
                SmartlockAssociationPresenter.this.f62008g.error(C45871nl4.error_network);
                SmartlockAssociationPresenter.this.f62008g.mo105541c1(true);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "e", "", C17296a.f69688o, "(Ljava/lang/Throwable;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$w */
    /* loaded from: classes2.dex */
    public static final class C14062w extends Lambda implements Function1<Throwable, Boolean> {

        /* renamed from: g */
        public static final C14062w f62068g = new C14062w();

        public C14062w() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Throwable e) {
            Intrinsics.checkNotNullParameter(e, "e");
            return Boolean.valueOf(S36.m86051a(e));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052B\u0010\u0004\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001 \u0003*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lio/reactivex/w;", "LHM4;", "Lco/bird/api/response/ProvisionalSmartlock;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/w;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$x */
    /* loaded from: classes2.dex */
    public static final class C14063x extends Lambda implements Function1<C24576w<HM4<ProvisionalSmartlock>>, Unit> {
        public C14063x() {
            super(1);
        }

        /* renamed from: a */
        public final void m60022a(C24576w<HM4<ProvisionalSmartlock>> c24576w) {
            SmartlockAssociationPresenter.this.f62008g.mo105554Eh(false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C24576w<HM4<ProvisionalSmartlock>> c24576w) {
            m60022a(c24576w);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/ProvisionalSmartlock;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$y */
    /* loaded from: classes2.dex */
    public static final class C14064y extends Lambda implements Function1<HM4<ProvisionalSmartlock>, Unit> {
        public C14064y() {
            super(1);
        }

        /* renamed from: a */
        public final void m60021a(HM4<ProvisionalSmartlock> hm4) {
            SmartlockAssociationPresenter.this.f62008g.mo105556A1(true);
            SmartlockAssociationPresenter.this.f62008g.mo105545Pb(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<ProvisionalSmartlock> hm4) {
            m60021a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u009a\u0001\u0012F\b\u0001\u0012B\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002* \u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00050\u0005 \u0002*L\u0012F\b\u0001\u0012B\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002* \u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "notificationObservable", "Lio/reactivex/B;", "Lkotlin/Pair;", "invoke", "(Lio/reactivex/Observable;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$z */
    /* loaded from: classes2.dex */
    public static final class C14065z extends Lambda implements Function1<Observable<byte[]>, InterfaceC23434B<? extends Pair<? extends byte[], ? extends byte[]>>> {
        public C14065z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Pair<byte[], byte[]>> invoke(Observable<byte[]> notificationObservable) {
            Intrinsics.checkNotNullParameter(notificationObservable, "notificationObservable");
            C41318g46.m40163a("notifications set up", new Object[0]);
            C24523e c24523e = C24523e.f91168a;
            Observable m33123k0 = SmartlockAssociationPresenter.this.m60084k1(SmartlockAssociationPresenter.f62001v).m33123k0();
            Intrinsics.checkNotNullExpressionValue(m33123k0, "sendPayload(TOKEN_REQUEST).toObservable()");
            return c24523e.m31956a(m33123k0, notificationObservable);
        }
    }

    public SmartlockAssociationPresenter(InterfaceC5225MD baseBluetoothManager, InterfaceC42042hI5 smartlockClient, InterfaceC33939Jy4 repairClient, C22454gl preference, DQ3 permissionManager, LifecycleScopeProvider<EnumC7097RE> scopeProvider, FF5 ui, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(baseBluetoothManager, "baseBluetoothManager");
        Intrinsics.checkNotNullParameter(smartlockClient, "smartlockClient");
        Intrinsics.checkNotNullParameter(repairClient, "repairClient");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f62002a = baseBluetoothManager;
        this.f62003b = smartlockClient;
        this.f62004c = repairClient;
        this.f62005d = preference;
        this.f62006e = permissionManager;
        this.f62007f = scopeProvider;
        this.f62008g = ui;
        this.f62009h = navigator;
        this.f62012k = new ArrayList();
    }

    /* renamed from: A0 */
    public static final void m60167A0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B0 */
    public static final void m60165B0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C0 */
    public static final void m60163C0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D0 */
    public static final void m60161D0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E0 */
    public static final void m60159E0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F0 */
    public static final void m60157F0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G0 */
    public static final InterfaceC23447K m60155G0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: H0 */
    public static final void m60153H0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I0 */
    public static final boolean m60151I0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: J0 */
    public static final void m60149J0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K0 */
    public static final void m60147K0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L0 */
    public static final void m60145L0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N0 */
    public static final boolean m60141N0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: O0 */
    public static final boolean m60139O0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: P0 */
    public static final void m60137P0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q0 */
    public static final InterfaceC23447K m60135Q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: R0 */
    public static final boolean m60133R0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: S0 */
    public static final void m60131S0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final InterfaceC23447K m60130T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: T0 */
    public static final InterfaceC23434B m60129T0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: U0 */
    public static final InterfaceC23447K m60127U0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final InterfaceC23447K m60126V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: V0 */
    public static final InterfaceC23434B m60125V0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: W0 */
    public static final InterfaceC23434B m60123W0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final InterfaceC23447K m60122X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: X0 */
    public static final byte[] m60121X0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (byte[]) tmp0.invoke(obj);
    }

    /* renamed from: Y0 */
    public static final byte[] m60119Y0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (byte[]) tmp0.invoke(obj);
    }

    /* renamed from: Z0 */
    public static final void m60117Z0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a1 */
    public static final boolean m60114a1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: b1 */
    public static final InterfaceC24574u m60111b1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: c1 */
    public static final InterfaceC23447K m60108c1(SmartlockAssociationPresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AbstractC23442F<HM4<ProvisionalSmartlock>> m60096g1 = this$0.m60096g1();
        final C14024F c14024f = new C14024F();
        return m60096g1.m33106t(new InterfaceC23484g() { // from class: sG5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationPresenter.m60105d1(Function1.this, obj);
            }
        });
    }

    /* renamed from: d1 */
    public static final void m60105d1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e1 */
    public static final void m60102e1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f1 */
    public static final void m60099f1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h1 */
    public static final InterfaceC23447K m60093h1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: q0 */
    public static final void m60068q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r0 */
    public static final void m60066r0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t0 */
    public static final void m60062t0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u0 */
    public static final InterfaceC23447K m60060u0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: v0 */
    public static final void m60058v0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w0 */
    public static final void m60056w0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x0 */
    public static final InterfaceC23447K m60054x0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: y0 */
    public static final void m60052y0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z0 */
    public static final boolean m60050z0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: M0 */
    public final void m60143M0(String serialNumber) {
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        this.f62017p = serialNumber;
        this.f62011j = false;
        C41318g46.m40163a("Lock serial number scanned " + serialNumber, new Object[0]);
        boolean z = this.f62011j;
        C41318g46.m40163a("Resetting to factory settings " + z, new Object[0]);
        this.f62008g.mo105535u3(false);
        this.f62008g.mo105555E4(true);
        this.f62008g.mo105546P0(true);
        Observable scanBleDevices$default = InterfaceC5225MD.C5226a.scanBleDevices$default(this.f62002a, 2, false, null, 6, null);
        final C14027I c14027i = C14027I.f62030g;
        Observable throttleFirst = scanBleDevices$default.filter(new InterfaceC23494q() { // from class: YF5
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m60141N0;
                m60141N0 = SmartlockAssociationPresenter.m60141N0(Function1.this, obj);
                return m60141N0;
            }
        }).throttleFirst(500L, TimeUnit.MILLISECONDS);
        final C14028J c14028j = new C14028J();
        Observable filter = throttleFirst.filter(new InterfaceC23494q() { // from class: iG5
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m60139O0;
                m60139O0 = SmartlockAssociationPresenter.m60139O0(Function1.this, obj);
                return m60139O0;
            }
        });
        final C14029K c14029k = new C14029K();
        Observable doOnNext = filter.doOnNext(new InterfaceC23484g() { // from class: jG5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationPresenter.m60137P0(Function1.this, obj);
            }
        });
        final C14030L c14030l = new C14030L(serialNumber);
        Observable flatMapSingle = doOnNext.flatMapSingle(new InterfaceC23492o() { // from class: kG5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m60135Q0;
                m60135Q0 = SmartlockAssociationPresenter.m60135Q0(Function1.this, obj);
                return m60135Q0;
            }
        });
        final C14031M c14031m = C14031M.f62035g;
        Observable filter2 = flatMapSingle.filter(new InterfaceC23494q() { // from class: lG5
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m60133R0;
                m60133R0 = SmartlockAssociationPresenter.m60133R0(Function1.this, obj);
                return m60133R0;
            }
        });
        final C14032N c14032n = new C14032N();
        Observable doOnNext2 = filter2.doOnNext(new InterfaceC23484g() { // from class: mG5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationPresenter.m60131S0(Function1.this, obj);
            }
        });
        final C14033O c14033o = new C14033O();
        Observable flatMap = doOnNext2.flatMap(new InterfaceC23492o() { // from class: nG5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m60129T0;
                m60129T0 = SmartlockAssociationPresenter.m60129T0(Function1.this, obj);
                return m60129T0;
            }
        });
        final C14035P c14035p = C14035P.f62040g;
        Observable flatMapSingle2 = flatMap.flatMapSingle(new InterfaceC23492o() { // from class: pG5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m60127U0;
                m60127U0 = SmartlockAssociationPresenter.m60127U0(Function1.this, obj);
                return m60127U0;
            }
        });
        final C14037Q c14037q = C14037Q.f62042g;
        Observable flatMap2 = flatMapSingle2.flatMap(new InterfaceC23492o() { // from class: qG5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m60125V0;
                m60125V0 = SmartlockAssociationPresenter.m60125V0(Function1.this, obj);
                return m60125V0;
            }
        });
        final C14065z c14065z = new C14065z();
        Observable flatMap3 = flatMap2.flatMap(new InterfaceC23492o() { // from class: rG5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m60123W0;
                m60123W0 = SmartlockAssociationPresenter.m60123W0(Function1.this, obj);
                return m60123W0;
            }
        });
        final C14019A c14019a = C14019A.f62021g;
        Observable map = flatMap3.map(new InterfaceC23492o() { // from class: ZF5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                byte[] m60121X0;
                m60121X0 = SmartlockAssociationPresenter.m60121X0(Function1.this, obj);
                return m60121X0;
            }
        });
        final C14020B c14020b = new C14020B();
        Observable observeOn = map.map(new InterfaceC23492o() { // from class: aG5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                byte[] m60119Y0;
                m60119Y0 = SmartlockAssociationPresenter.m60119Y0(Function1.this, obj);
                return m60119Y0;
            }
        }).retry(1L).subscribeOn(C24542a.m31932c()).observeOn(C23454a.m33087a());
        final C14021C c14021c = new C14021C(serialNumber);
        Observable doOnNext3 = observeOn.doOnNext(new InterfaceC23484g() { // from class: bG5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationPresenter.m60117Z0(Function1.this, obj);
            }
        });
        final C14022D c14022d = new C14022D();
        Observable takeUntil = doOnNext3.takeUntil(new InterfaceC23494q() { // from class: cG5
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m60114a1;
                m60114a1 = SmartlockAssociationPresenter.m60114a1(Function1.this, obj);
                return m60114a1;
            }
        });
        final C14023E c14023e = new C14023E();
        AbstractC23442F m33152N = takeUntil.flatMapMaybe(new InterfaceC23492o() { // from class: eG5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m60111b1;
                m60111b1 = SmartlockAssociationPresenter.m60111b1(Function1.this, obj);
                return m60111b1;
            }
        }).ignoreElements().m33042m(AbstractC23442F.m33124k(new Callable() { // from class: fG5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23447K m60108c1;
                m60108c1 = SmartlockAssociationPresenter.m60108c1(SmartlockAssociationPresenter.this);
                return m60108c1;
            }
        })).m33142Y(C24542a.m31932c()).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "fun onLockQrScanned(seri…\")\n        }\n      })\n  }");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f62007f));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14025G c14025g = new C14025G();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: gG5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationPresenter.m60102e1(Function1.this, obj);
            }
        };
        final C14026H c14026h = new C14026H();
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: hG5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationPresenter.m60099f1(Function1.this, obj);
            }
        });
    }

    /* renamed from: S */
    public final AbstractC23442F<HM4<WirePhysicalLock>> m60132S() {
        String str;
        InterfaceC33939Jy4 interfaceC33939Jy4 = this.f62004c;
        WireBird wireBird = this.f62020s;
        if (wireBird == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
            wireBird = null;
        }
        String id = wireBird.getId();
        String str2 = this.f62017p;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serialNumber");
            str = null;
        } else {
            str = str2;
        }
        AbstractC23442F<HM4<WirePhysicalLock>> m99482f = interfaceC33939Jy4.m99482f(new ReplacePhysicalLockBody(id, "smartlock_cable_nokelock_birdv1", "0000", str, null, null, 48, null));
        final C14040b c14040b = C14040b.f62044g;
        AbstractC23442F<HM4<WirePhysicalLock>> m33152N = m99482f.m33165A(new InterfaceC23492o() { // from class: SF5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m60130T;
                m60130T = SmartlockAssociationPresenter.m60130T(Function1.this, obj);
                return m60130T;
            }
        }).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "repairClient.replacePhys…dSchedulers.mainThread())");
        return m33152N;
    }

    /* renamed from: U */
    public final AbstractC23442F<byte[]> m60128U(byte[] bArr) {
        AbstractC23442F<byte[]> m33122l = m60084k1(m60079m0(bArr)).m33122l(200L, TimeUnit.MILLISECONDS);
        final C14041c c14041c = new C14041c(bArr);
        AbstractC23442F m33165A = m33122l.m33165A(new InterfaceC23492o() { // from class: dG5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m60126V;
                m60126V = SmartlockAssociationPresenter.m60126V(Function1.this, obj);
                return m60126V;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "private fun changeAesKey…tKey = true }\n      }\n  }");
        return m33165A;
    }

    /* renamed from: W */
    public final AbstractC23442F<byte[]> m60124W(byte[] bArr, byte[] bArr2) {
        AbstractC23442F<byte[]> m33122l = m60084k1(m60073o0(bArr)).m33122l(200L, TimeUnit.MILLISECONDS);
        final C14043d c14043d = new C14043d(bArr2);
        AbstractC23442F m33165A = m33122l.m33165A(new InterfaceC23492o() { // from class: oG5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m60122X;
                m60122X = SmartlockAssociationPresenter.m60122X(Function1.this, obj);
                return m60122X;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "private fun changePasswo…newPassword))\n      }\n  }");
        return m33165A;
    }

    /* renamed from: Y */
    public final byte[] m60120Y() {
        String str;
        String str2 = null;
        if (this.f62011j) {
            if (!this.f62010i) {
                str = this.f62014m;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("newAesKey");
                }
                str2 = str;
            }
            str2 = "OmBDKlwBIR8pHg9ODBMoJQ==";
        } else {
            if (this.f62010i) {
                str = this.f62014m;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("newAesKey");
                }
                str2 = str;
            }
            str2 = "OmBDKlwBIR8pHg9ODBMoJQ==";
        }
        return m60109c0(str2);
    }

    /* renamed from: Z */
    public final byte[] m60118Z() {
        String str;
        if (this.f62011j) {
            str = "000000";
        } else {
            str = this.f62015n;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("newPassword");
                str = null;
            }
        }
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    /* renamed from: a0 */
    public final String m60115a0(byte[] bArr) {
        String m108172e = C2029Ey.m108181b().m108172e(bArr);
        Intrinsics.checkNotNullExpressionValue(m108172e, "getEncoder().encodeToString(this)");
        return m108172e;
    }

    /* renamed from: b0 */
    public final byte[] m60112b0(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
        cipher.init(2, secretKeySpec);
        byte[] doFinal = cipher.doFinal(bArr);
        Intrinsics.checkNotNullExpressionValue(doFinal, "cipher.doFinal(payload)");
        return doFinal;
    }

    /* renamed from: c0 */
    public final byte[] m60109c0(String str) {
        byte[] m108180a = C2029Ey.m108182a().m108180a(str);
        Intrinsics.checkNotNullExpressionValue(m108180a, "getDecoder().decode(this)");
        return m108180a;
    }

    /* renamed from: d0 */
    public final byte[] m60106d0(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
        cipher.init(1, secretKeySpec);
        byte[] doFinal = cipher.doFinal(bArr);
        Intrinsics.checkNotNullExpressionValue(doFinal, "cipher.doFinal(payload)");
        return doFinal;
    }

    /* renamed from: e0 */
    public final boolean m60103e0(byte[] bArr) {
        byte[] sliceArray;
        sliceArray = ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(0, 2));
        return Arrays.equals(sliceArray, new byte[]{7, 3, 1});
    }

    /* renamed from: f0 */
    public final boolean m60100f0(byte[] bArr) {
        byte[] sliceArray;
        sliceArray = ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(0, 2));
        return Arrays.equals(sliceArray, new byte[]{5, 8, 1});
    }

    /* renamed from: g0 */
    public final boolean m60097g0(byte[] bArr) {
        byte[] sliceArray;
        sliceArray = ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(0, 2));
        return Arrays.equals(sliceArray, new byte[]{5, 15, 1});
    }

    /* renamed from: g1 */
    public final AbstractC23442F<HM4<ProvisionalSmartlock>> m60096g1() {
        InterfaceC42042hI5 interfaceC42042hI5 = this.f62003b;
        String str = this.f62016o;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("macAddress");
            str = null;
        }
        String str3 = this.f62017p;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serialNumber");
            str3 = null;
        }
        String str4 = this.f62019r;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("encryptedUnlockPayload");
        } else {
            str2 = str4;
        }
        AbstractC23442F<HM4<ProvisionalSmartlock>> m36548c = interfaceC42042hI5.m36548c(new PromoteProvisionalSmartlockBody(str, str3, str2));
        final C14038R c14038r = C14038R.f62043g;
        AbstractC23442F<HM4<ProvisionalSmartlock>> m33152N = m36548c.m33165A(new InterfaceC23492o() { // from class: HF5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m60093h1;
                m60093h1 = SmartlockAssociationPresenter.m60093h1(Function1.this, obj);
                return m60093h1;
            }
        }).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "smartlockClient.promoteP…dSchedulers.mainThread())");
        return m33152N;
    }

    /* renamed from: h0 */
    public final boolean m60094h0(byte[] bArr) {
        return Intrinsics.compare((int) bArr[3], 1) == 0;
    }

    /* renamed from: i0 */
    public final boolean m60091i0(byte[] bArr) {
        byte[] sliceArray;
        sliceArray = ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(0, 2));
        return Arrays.equals(sliceArray, new byte[]{5, 5, 1});
    }

    /* renamed from: i1 */
    public final AbstractC23442F<byte[]> m60090i1() {
        new Random().nextBytes(new byte[3]);
        C41318g46.m40163a("sending lock state request", new Object[0]);
        ByteBuffer put = ByteBuffer.allocate(16).order(ByteOrder.BIG_ENDIAN).put(new byte[]{5, 14, 1, 1});
        byte[] bArr = this.f62018q;
        if (bArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionToken");
            bArr = null;
        }
        byte[] payload = put.put(bArr).array();
        int length = payload.length;
        C41318g46.m40163a("payload length " + length, new Object[0]);
        Intrinsics.checkNotNullExpressionValue(payload, "payload");
        return m60084k1(payload);
    }

    /* renamed from: j0 */
    public final boolean m60088j0(byte[] bArr) {
        byte[] sliceArray;
        sliceArray = ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(0, 1));
        return Arrays.equals(sliceArray, new byte[]{6, 2});
    }

    /* renamed from: j1 */
    public final AbstractC23442F<byte[]> m60087j1() {
        byte[] bArr = new byte[3];
        new Random().nextBytes(bArr);
        C41318g46.m40163a("sending locking request", new Object[0]);
        ByteBuffer put = ByteBuffer.allocate(16).order(ByteOrder.BIG_ENDIAN).put(new byte[]{5, 12, 1, 1}).put(m60118Z());
        byte[] bArr2 = this.f62018q;
        if (bArr2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionToken");
            bArr2 = null;
        }
        byte[] payload = put.put(bArr2).put(bArr).array();
        Intrinsics.checkNotNullExpressionValue(payload, "payload");
        return m60084k1(payload);
    }

    /* renamed from: k0 */
    public final boolean m60085k0(byte[] bArr) {
        byte[] sliceArray;
        sliceArray = ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(0, 2));
        return Arrays.equals(sliceArray, new byte[]{5, 2, 1});
    }

    /* renamed from: k1 */
    public final AbstractC23442F<byte[]> m60084k1(byte[] bArr) {
        AbstractC23442F<byte[]> abstractC23442F;
        String arrays = Arrays.toString(bArr);
        C41318g46.m40163a("sending payload to lock " + arrays, new Object[0]);
        byte[] m60106d0 = m60106d0(bArr, m60120Y());
        InterfaceC44023ke5 interfaceC44023ke5 = this.f62013l;
        if (interfaceC44023ke5 != null) {
            abstractC23442F = interfaceC44023ke5.mo27056c(SmartlockManagerImpl.EnumC14385i.f62936c.m59190b(), m60106d0);
        } else {
            abstractC23442F = null;
        }
        if (abstractC23442F == null) {
            AbstractC23442F<byte[]> m33100x = AbstractC23442F.m33100x(NotConnected.f62037b);
            Intrinsics.checkNotNullExpressionValue(m33100x, "error(NotConnected)");
            return m33100x;
        }
        return abstractC23442F;
    }

    /* renamed from: l0 */
    public final byte[] m60082l0(byte[] bArr) {
        byte[] sliceArray;
        byte[] bArr2 = new byte[1];
        new Random().nextBytes(bArr2);
        ByteBuffer put = ByteBuffer.allocate(16).order(ByteOrder.BIG_ENDIAN).put(new byte[]{7, 2, 8});
        sliceArray = ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(8, 15));
        ByteBuffer put2 = put.put(sliceArray);
        byte[] bArr3 = this.f62018q;
        if (bArr3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionToken");
            bArr3 = null;
        }
        byte[] array = put2.put(bArr3).put(bArr2).array();
        Intrinsics.checkNotNullExpressionValue(array, "allocate(16)\n      .orde…t(padding)\n      .array()");
        return array;
    }

    /* renamed from: l1 */
    public final byte[] m60081l1() {
        String str;
        if (this.f62011j) {
            str = this.f62015n;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("newPassword");
                str = null;
            }
        } else {
            str = "000000";
        }
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    /* renamed from: m0 */
    public final byte[] m60079m0(byte[] bArr) {
        byte[] sliceArray;
        byte[] bArr2 = new byte[1];
        new Random().nextBytes(bArr2);
        ByteBuffer put = ByteBuffer.allocate(16).order(ByteOrder.BIG_ENDIAN).put(new byte[]{7, 1, 8});
        sliceArray = ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(0, 7));
        ByteBuffer put2 = put.put(sliceArray);
        byte[] bArr3 = this.f62018q;
        if (bArr3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionToken");
            bArr3 = null;
        }
        byte[] array = put2.put(bArr3).put(bArr2).array();
        Intrinsics.checkNotNullExpressionValue(array, "allocate(16)\n      .orde…t(padding)\n      .array()");
        return array;
    }

    /* renamed from: m1 */
    public final byte[] m60078m1() {
        String str;
        if (this.f62011j) {
            str = "OmBDKlwBIR8pHg9ODBMoJQ==";
        } else {
            str = this.f62014m;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("newAesKey");
                str = null;
            }
        }
        return m60109c0(str);
    }

    /* renamed from: n0 */
    public final byte[] m60076n0(byte[] bArr) {
        byte[] bArr2 = new byte[3];
        new Random().nextBytes(bArr2);
        ByteBuffer put = ByteBuffer.allocate(16).order(ByteOrder.BIG_ENDIAN).put(new byte[]{5, 4, 6}).put(bArr);
        byte[] bArr3 = this.f62018q;
        if (bArr3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionToken");
            bArr3 = null;
        }
        byte[] array = put.put(bArr3).put(bArr2).array();
        Intrinsics.checkNotNullExpressionValue(array, "allocate(16)\n      .orde…t(padding)\n      .array()");
        return array;
    }

    /* renamed from: n1 */
    public final byte[] m60075n1() {
        String str;
        if (this.f62011j) {
            str = "000000";
        } else {
            str = this.f62015n;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("newPassword");
                str = null;
            }
        }
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    /* renamed from: o0 */
    public final byte[] m60073o0(byte[] bArr) {
        byte[] bArr2 = new byte[3];
        new Random().nextBytes(bArr2);
        ByteBuffer put = ByteBuffer.allocate(16).order(ByteOrder.BIG_ENDIAN).put(new byte[]{5, 3, 6}).put(bArr);
        byte[] bArr3 = this.f62018q;
        if (bArr3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionToken");
            bArr3 = null;
        }
        byte[] array = put.put(bArr3).put(bArr2).array();
        Intrinsics.checkNotNullExpressionValue(array, "allocate(16)\n      .orde…t(padding)\n      .array()");
        return array;
    }

    /* renamed from: o1 */
    public final AbstractC23442F<byte[]> m60072o1() {
        byte[] bArr = new byte[3];
        new Random().nextBytes(bArr);
        ByteBuffer put = ByteBuffer.allocate(16).order(ByteOrder.BIG_ENDIAN).put(new byte[]{5, 1, 6}).put(m60118Z());
        byte[] bArr2 = this.f62018q;
        if (bArr2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionToken");
            bArr2 = null;
        }
        byte[] payload = put.put(bArr2).put(bArr).array();
        Intrinsics.checkNotNullExpressionValue(payload, "payload");
        return m60084k1(payload);
    }

    /* renamed from: p0 */
    public final void m60070p0(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        C41318g46.m40163a("Scanned Bird " + bird, new Object[0]);
        this.f62020s = bird;
        this.f62008g.mo105556A1(false);
        this.f62008g.mo105539g0(true);
        Object m33135e = m60132S().m33135e(AutoDispose.m45239a(this.f62007f));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14044e c14044e = new C14044e();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: WF5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationPresenter.m60068q0(Function1.this, obj);
            }
        };
        final C14045f c14045f = new C14045f();
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: XF5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationPresenter.m60066r0(Function1.this, obj);
            }
        });
    }

    /* renamed from: s0 */
    public final void m60064s0() {
        this.f62008g.mo105542a0(false);
        Object m33094as = this.f62008g.mo105540e0().m33094as(AutoDispose.m45239a(this.f62007f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14056q c14056q = new C14056q();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: tG5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationPresenter.m60062t0(Function1.this, obj);
            }
        });
        Observable<Unit> mo105538la = this.f62008g.mo105538la();
        final C14057r c14057r = new C14057r();
        Observable<R> flatMapSingle = mo105538la.flatMapSingle(new InterfaceC23492o() { // from class: MF5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m60060u0;
                m60060u0 = SmartlockAssociationPresenter.m60060u0(Function1.this, obj);
                return m60060u0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "fun onCreate() {\n    ui.…hButton(true)\n      }\n  }");
        Object m33094as2 = flatMapSingle.m33094as(AutoDispose.m45239a(this.f62007f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14058s c14058s = new C14058s();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: NF5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationPresenter.m60159E0(Function1.this, obj);
            }
        });
        Observable<Unit> mo105544V = this.f62008g.mo105544V();
        final C14059t c14059t = new C14059t();
        Observable<Unit> doOnNext = mo105544V.doOnNext(new InterfaceC23484g() { // from class: OF5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationPresenter.m60157F0(Function1.this, obj);
            }
        });
        final C14060u c14060u = new C14060u();
        Observable<R> flatMapSingle2 = doOnNext.flatMapSingle(new InterfaceC23492o() { // from class: PF5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m60155G0;
                m60155G0 = SmartlockAssociationPresenter.m60155G0(Function1.this, obj);
                return m60155G0;
            }
        });
        final C14061v c14061v = new C14061v();
        Observable doOnError = flatMapSingle2.doOnError(new InterfaceC23484g() { // from class: QF5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationPresenter.m60153H0(Function1.this, obj);
            }
        });
        final C14062w c14062w = C14062w.f62068g;
        Observable retry = doOnError.retry(new InterfaceC23494q() { // from class: RF5
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m60151I0;
                m60151I0 = SmartlockAssociationPresenter.m60151I0(Function1.this, obj);
                return m60151I0;
            }
        });
        final C14063x c14063x = new C14063x();
        Observable doOnEach = retry.doOnEach(new InterfaceC23484g() { // from class: TF5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationPresenter.m60149J0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnEach, "fun onCreate() {\n    ui.…hButton(true)\n      }\n  }");
        Object m33094as3 = doOnEach.m33094as(AutoDispose.m45239a(this.f62007f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14064y c14064y = new C14064y();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: UF5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationPresenter.m60147K0(Function1.this, obj);
            }
        };
        final C14046g c14046g = new C14046g();
        ((ObservableSubscribeProxy) m33094as3).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: VF5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationPresenter.m60145L0(Function1.this, obj);
            }
        });
        Object m33094as4 = this.f62008g.mo105534w().m33094as(AutoDispose.m45239a(this.f62007f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14047h c14047h = new C14047h();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: uG5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationPresenter.m60058v0(Function1.this, obj);
            }
        });
        Observable<Unit> mo105550K1 = this.f62008g.mo105550K1();
        final C14048i c14048i = new C14048i();
        Observable<Unit> doOnNext2 = mo105550K1.doOnNext(new InterfaceC23484g() { // from class: vG5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationPresenter.m60056w0(Function1.this, obj);
            }
        });
        final C14049j c14049j = new C14049j();
        Observable<R> flatMapSingle3 = doOnNext2.flatMapSingle(new InterfaceC23492o() { // from class: wG5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m60054x0;
                m60054x0 = SmartlockAssociationPresenter.m60054x0(Function1.this, obj);
                return m60054x0;
            }
        });
        final C14050k c14050k = new C14050k();
        Observable doOnError2 = flatMapSingle3.doOnError(new InterfaceC23484g() { // from class: xG5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationPresenter.m60052y0(Function1.this, obj);
            }
        });
        final C14051l c14051l = C14051l.f62057g;
        Observable retry2 = doOnError2.retry(new InterfaceC23494q() { // from class: yG5
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m60050z0;
                m60050z0 = SmartlockAssociationPresenter.m60050z0(Function1.this, obj);
                return m60050z0;
            }
        });
        final C14052m c14052m = new C14052m();
        Observable doOnEach2 = retry2.doOnEach(new InterfaceC23484g() { // from class: IF5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationPresenter.m60167A0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnEach2, "fun onCreate() {\n    ui.…hButton(true)\n      }\n  }");
        Object m33094as5 = doOnEach2.m33094as(AutoDispose.m45239a(this.f62007f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14053n c14053n = new C14053n();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: JF5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationPresenter.m60165B0(Function1.this, obj);
            }
        };
        final C14054o c14054o = new C14054o();
        ((ObservableSubscribeProxy) m33094as5).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: KF5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationPresenter.m60163C0(Function1.this, obj);
            }
        });
        Object m33094as6 = this.f62008g.mo105551J0().m33094as(AutoDispose.m45239a(this.f62007f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14055p c14055p = new C14055p();
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: LF5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockAssociationPresenter.m60161D0(Function1.this, obj);
            }
        });
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062.\u0010\u0005\u001a*\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "LTk5;", "kotlin.jvm.PlatformType", "LHM4;", "Lco/bird/api/response/ProvisionSmartlockResponse;", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$M */
    /* loaded from: classes2.dex */
    public static final class C14031M extends Lambda implements Function1<Pair<? extends C36154Tk5, ? extends HM4<ProvisionSmartlockResponse>>, Boolean> {

        /* renamed from: g */
        public static final C14031M f62035g = new C14031M();

        public C14031M() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<? extends C36154Tk5, HM4<ProvisionSmartlockResponse>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            HM4<ProvisionSmartlockResponse> component2 = pair.component2();
            return Boolean.valueOf(component2.m103943b() == 200 && component2.m103944a() != null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends C36154Tk5, ? extends HM4<ProvisionSmartlockResponse>> pair) {
            return invoke2((Pair<? extends C36154Tk5, HM4<ProvisionSmartlockResponse>>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a*\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00070\u0007 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062.\u0010\u0005\u001a*\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "LTk5;", "kotlin.jvm.PlatformType", "LHM4;", "Lco/bird/api/response/ProvisionSmartlockResponse;", "<name for destructuring parameter 0>", "Lio/reactivex/B;", "Lke5;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$O */
    /* loaded from: classes2.dex */
    public static final class C14033O extends Lambda implements Function1<Pair<? extends C36154Tk5, ? extends HM4<ProvisionSmartlockResponse>>, InterfaceC23434B<? extends InterfaceC44023ke5>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lke5;", "kotlin.jvm.PlatformType", "connection", "", "invoke", "(Lke5;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter$O$a */
        /* loaded from: classes2.dex */
        public static final class C14034a extends Lambda implements Function1<InterfaceC44023ke5, Unit> {

            /* renamed from: g */
            public final /* synthetic */ SmartlockAssociationPresenter f62039g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14034a(SmartlockAssociationPresenter smartlockAssociationPresenter) {
                super(1);
                this.f62039g = smartlockAssociationPresenter;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC44023ke5 interfaceC44023ke5) {
                invoke2(interfaceC44023ke5);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(InterfaceC44023ke5 interfaceC44023ke5) {
                this.f62039g.f62013l = interfaceC44023ke5;
                C41318g46.m40163a("lock connected", new Object[0]);
            }
        }

        public C14033O() {
            super(1);
        }

        /* renamed from: c */
        public static final void m60037c(SmartlockAssociationPresenter this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f62013l = null;
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23434B<? extends InterfaceC44023ke5> invoke2(Pair<? extends C36154Tk5, HM4<ProvisionSmartlockResponse>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Observable<InterfaceC44023ke5> delaySubscription = pair.component1().m83016a().mo17284a(false).delaySubscription(500L, TimeUnit.MILLISECONDS);
            final C14034a c14034a = new C14034a(SmartlockAssociationPresenter.this);
            Observable<InterfaceC44023ke5> doOnNext = delaySubscription.doOnNext(new InterfaceC23484g() { // from class: AG5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    SmartlockAssociationPresenter.C14033O.invoke$lambda$0(Function1.this, obj);
                }
            });
            final SmartlockAssociationPresenter smartlockAssociationPresenter = SmartlockAssociationPresenter.this;
            return doOnNext.doOnDispose(new InterfaceC23478a() { // from class: BG5
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    SmartlockAssociationPresenter.C14033O.m60037c(SmartlockAssociationPresenter.this);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends InterfaceC44023ke5> invoke(Pair<? extends C36154Tk5, ? extends HM4<ProvisionSmartlockResponse>> pair) {
            return invoke2((Pair<? extends C36154Tk5, HM4<ProvisionSmartlockResponse>>) pair);
        }
    }
}
