package co.bird.android.lib.shaketoreport.shakedetector;

import android.app.Activity;
import android.app.Application;
import android.graphics.Bitmap;
import android.hardware.SensorManager;
import androidx.lifecycle.AbstractC11719f;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.lib.shaketoreport.BugReportActivity;
import co.bird.android.lib.shaketoreport.shakedetector.ShakeToReportDetector;
import co.bird.android.model.User;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC24574u;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.processors.C24510b;
import io.reactivex.schedulers.C24542a;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C36739Vx5;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b2\u00103J\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010#\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u00020\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.¨\u00064"}, m28432d2 = {"Lco/bird/android/lib/shaketoreport/shakedetector/ShakeToReportDetector;", "LVX0;", "", "p", "LLifecycleOwner;", "owner", "onStart", "onStop", "Landroid/app/Application;", "b", "Landroid/app/Application;", Stripe3ds2AuthParams.FIELD_APP, "Le13;", "c", "Le13;", "navigator", DateTokenConverter.CONVERTER_KEY, "LLifecycleOwner;", "lifecycleOwner", "Llh6;", "e", "Llh6;", "userManager", "LTq4;", "f", "LTq4;", "reactiveConfig", "Lgl;", "g", "Lgl;", "preference", "Lio/reactivex/processors/b;", "kotlin.jvm.PlatformType", "h", "Lio/reactivex/processors/b;", "shakeProcessor", "Landroid/hardware/SensorManager;", "i", "Landroid/hardware/SensorManager;", "sensorManager", "LVx5;", "j", "LVx5;", "detector", "", "k", "Z", "initialized", "l", "registered", "<init>", "(Landroid/app/Application;Le13;LLifecycleOwner;Llh6;LTq4;Lgl;)V", "shaketoreport_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nShakeToReportDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShakeToReportDetector.kt\nco/bird/android/lib/shaketoreport/shakedetector/ShakeToReportDetector\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,154:1\n54#2:155\n161#3:156\n*S KotlinDebug\n*F\n+ 1 ShakeToReportDetector.kt\nco/bird/android/lib/shaketoreport/shakedetector/ShakeToReportDetector\n*L\n110#1:155\n110#1:156\n*E\n"})
/* loaded from: classes3.dex */
public final class ShakeToReportDetector implements VX0 {

    /* renamed from: b */
    public final Application f66058b;

    /* renamed from: c */
    public final InterfaceC40099e13 f66059c;

    /* renamed from: d */
    public final LifecycleOwner f66060d;

    /* renamed from: e */
    public final InterfaceC44647lh6 f66061e;

    /* renamed from: f */
    public final C36207Tq4 f66062f;

    /* renamed from: g */
    public final C22454gl f66063g;

    /* renamed from: h */
    public final C24510b<Unit> f66064h;

    /* renamed from: i */
    public final SensorManager f66065i;

    /* renamed from: j */
    public final C36739Vx5 f66066j;

    /* renamed from: k */
    public boolean f66067k;

    /* renamed from: l */
    public boolean f66068l;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Unit;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.lib.shaketoreport.shakedetector.ShakeToReportDetector$a */
    /* loaded from: classes3.dex */
    public static final class C16012a extends Lambda implements Function1<Unit, InterfaceC24574u<? extends User>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/User;", "user", "", C17296a.f69688o, "(Lco/bird/android/model/User;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.lib.shaketoreport.shakedetector.ShakeToReportDetector$a$a */
        /* loaded from: classes3.dex */
        public static final class C16013a extends Lambda implements Function1<User, Boolean> {

            /* renamed from: g */
            public final /* synthetic */ ShakeToReportDetector f66070g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16013a(ShakeToReportDetector shakeToReportDetector) {
                super(1);
                this.f66070g = shakeToReportDetector;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(User user) {
                Intrinsics.checkNotNullParameter(user, "user");
                return Boolean.valueOf(C41258fy5.m40397a(user, this.f66070g.f66062f.m82623f8().m73665a(), this.f66070g.f66063g));
            }
        }

        public C16012a() {
            super(1);
        }

        public static final boolean invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends User> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C41318g46.m40163a("ShakeToReportDetector shake detected, checking if user can shakeToReport...", new Object[0]);
            AbstractC23442F<User> user = ShakeToReportDetector.this.f66061e.getUser();
            final C16013a c16013a = new C16013a(ShakeToReportDetector.this);
            return user.m33098z(new InterfaceC23494q() { // from class: by5
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean invoke$lambda$0;
                    invoke$lambda$0 = ShakeToReportDetector.C16012a.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/User;", "it", "Lio/reactivex/u;", "Lco/bird/android/buava/Optional;", "Ljava/io/File;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "(Lco/bird/android/model/User;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.lib.shaketoreport.shakedetector.ShakeToReportDetector$b */
    /* loaded from: classes3.dex */
    public static final class C16014b extends Lambda implements Function1<User, InterfaceC24574u<? extends Optional<File>>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0000 \u0003*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Landroid/graphics/Bitmap;", "bitmap", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Landroid/graphics/Bitmap;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.lib.shaketoreport.shakedetector.ShakeToReportDetector$b$a */
        /* loaded from: classes3.dex */
        public static final class C16015a extends Lambda implements Function1<Bitmap, Optional<Bitmap>> {

            /* renamed from: g */
            public static final C16015a f66072g = new C16015a();

            public C16015a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Optional<Bitmap> invoke(Bitmap bitmap) {
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                return Optional.f63040c.m59032c(bitmap);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Landroid/graphics/Bitmap;", "bitmapOptional", "Ljava/io/File;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nShakeToReportDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShakeToReportDetector.kt\nco/bird/android/lib/shaketoreport/shakedetector/ShakeToReportDetector$2$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n1#2:155\n*E\n"})
        /* renamed from: co.bird.android.lib.shaketoreport.shakedetector.ShakeToReportDetector$b$b */
        /* loaded from: classes3.dex */
        public static final class C16016b extends Lambda implements Function1<Optional<Bitmap>, Optional<File>> {

            /* renamed from: g */
            public final /* synthetic */ ShakeToReportDetector f66073g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16016b(ShakeToReportDetector shakeToReportDetector) {
                super(1);
                this.f66073g = shakeToReportDetector;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Optional<File> invoke(Optional<Bitmap> bitmapOptional) {
                Intrinsics.checkNotNullParameter(bitmapOptional, "bitmapOptional");
                File m86059d = S30.f33090a.m86059d(this.f66073g.f66058b);
                m86059d.delete();
                if (bitmapOptional.m59037c()) {
                    Bitmap m59038b = bitmapOptional.m59038b();
                    Intrinsics.checkNotNullExpressionValue(m59038b, "bitmapOptional.get()");
                    FileOutputStream fileOutputStream = new FileOutputStream(m86059d);
                    m59038b.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                    fileOutputStream.close();
                    return Optional.f63040c.m59032c(m86059d);
                }
                return Optional.f63040c.m59034a();
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.lib.shaketoreport.shakedetector.ShakeToReportDetector$b$c */
        /* loaded from: classes3.dex */
        public static final class C16017c extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public static final C16017c f66074g = new C16017c();

            public C16017c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C41318g46.m40158f(th, "Encountered error while taking shake to report screenshot, continuing without image.", new Object[0]);
            }
        }

        public C16014b() {
            super(1);
        }

        /* renamed from: e */
        public static final Optional m56083e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Optional) tmp0.invoke(obj);
        }

        /* renamed from: f */
        public static final Optional m56082f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Optional) tmp0.invoke(obj);
        }

        /* renamed from: g */
        public static final void m56081g(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d */
        public final InterfaceC24574u<? extends Optional<File>> invoke(User it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C41318g46.m40163a("ShakeToReportDetector confirmed user can S2R, taking screenshot and starting bug report...", new Object[0]);
            Activity mo36934u3 = ShakeToReportDetector.this.f66059c.mo36934u3();
            if (mo36934u3 == null) {
                return AbstractC24507p.m32068G(Optional.f63040c.m59034a());
            }
            if (mo36934u3 instanceof BugReportActivity) {
                C41318g46.m40163a("ShakeToReportDetector detected shake being ignored since we're already on bug report activity", new Object[0]);
                return AbstractC24507p.m32024u();
            }
            AbstractC23442F<Bitmap> m89725b = C35263Pp5.f29121a.m89725b(mo36934u3);
            final C16015a c16015a = C16015a.f66072g;
            AbstractC24507p m32066I = m89725b.m33157I(new InterfaceC23492o() { // from class: cy5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Optional m56083e;
                    m56083e = ShakeToReportDetector.C16014b.m56083e(Function1.this, obj);
                    return m56083e;
                }
            }).m33125j0().m32066I(C24542a.m31932c());
            final C16016b c16016b = new C16016b(ShakeToReportDetector.this);
            AbstractC24507p m32067H = m32066I.m32067H(new InterfaceC23492o() { // from class: dy5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Optional m56082f;
                    m56082f = ShakeToReportDetector.C16014b.m56082f(Function1.this, obj);
                    return m56082f;
                }
            });
            final C16017c c16017c = C16017c.f66074g;
            return m32067H.m32029p(new InterfaceC23484g() { // from class: ey5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    ShakeToReportDetector.C16014b.m56081g(Function1.this, obj);
                }
            }).m32060O(Optional.f63040c.m59034a());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Ljava/io/File;", "kotlin.jvm.PlatformType", "screenshotFile", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.lib.shaketoreport.shakedetector.ShakeToReportDetector$c */
    /* loaded from: classes3.dex */
    public static final class C16018c extends Lambda implements Function1<Optional<File>, Unit> {
        public C16018c() {
            super(1);
        }

        /* renamed from: a */
        public final void m56078a(Optional<File> optional) {
            ShakeToReportDetector.this.f66059c.mo36939t4(optional.m59035e());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<File> optional) {
            m56078a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.lib.shaketoreport.shakedetector.ShakeToReportDetector$d */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C16019d extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C16019d f66076b = new C16019d();

        public C16019d() {
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

    public ShakeToReportDetector(Application app, InterfaceC40099e13 navigator, LifecycleOwner lifecycleOwner, InterfaceC44647lh6 userManager, C36207Tq4 reactiveConfig, C22454gl preference) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(preference, "preference");
        this.f66058b = app;
        this.f66059c = navigator;
        this.f66060d = lifecycleOwner;
        this.f66061e = userManager;
        this.f66062f = reactiveConfig;
        this.f66063g = preference;
        C24510b<Unit> m31978z1 = C24510b.m31978z1();
        Intrinsics.checkNotNullExpressionValue(m31978z1, "create<Unit>()");
        this.f66064h = m31978z1;
        Object systemService = app.getSystemService("sensor");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        this.f66065i = (SensorManager) systemService;
        this.f66066j = new C36739Vx5(new C36739Vx5.InterfaceC8878a() { // from class: Wx5
            @Override // p000.C36739Vx5.InterfaceC8878a
            /* renamed from: a */
            public final void mo77602a() {
                ShakeToReportDetector.m56096j(ShakeToReportDetector.this);
            }
        });
        AbstractC24490k<Unit> m32097x0 = m31978z1.m32140i1(10L, TimeUnit.SECONDS).m32097x0();
        final C16012a c16012a = new C16012a();
        AbstractC24490k m32111s0 = m32097x0.m32154d0(new InterfaceC23492o() { // from class: Xx5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m56095k;
                m56095k = ShakeToReportDetector.m56095k(Function1.this, obj);
                return m56095k;
            }
        }).m32111s0(C23454a.m33087a());
        final C16014b c16014b = new C16014b();
        AbstractC24490k m32152e0 = m32111s0.m32152e0(new InterfaceC23492o() { // from class: Yx5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m56094l;
                m56094l = ShakeToReportDetector.m56094l(Function1.this, obj);
                return m56094l;
            }
        }, false, 1);
        Intrinsics.checkNotNullExpressionValue(m32152e0, "shakeProcessor\n      .th…ent())\n      }, false, 1)");
        AndroidLifecycleScopeProvider m45196e = AndroidLifecycleScopeProvider.m45196e(lifecycleOwner, AbstractC11719f.EnumC11720a.ON_DESTROY);
        Intrinsics.checkExpressionValueIsNotNull(m45196e, "AndroidLifecycleScopePro…er.from(this, untilEvent)");
        Object m32150f = m32152e0.m32150f(AutoDispose.m45239a(m45196e));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C16018c c16018c = new C16018c();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Zx5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ShakeToReportDetector.m56093n(Function1.this, obj);
            }
        };
        final C16019d c16019d = C16019d.f66076b;
        ((FlowableSubscribeProxy) m32150f).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: ay5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ShakeToReportDetector.m56092o(Function1.this, obj);
            }
        });
    }

    /* renamed from: j */
    public static final void m56096j(ShakeToReportDetector this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f66064h.m31981A1(Unit.INSTANCE);
    }

    /* renamed from: k */
    public static final InterfaceC24574u m56095k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final InterfaceC24574u m56094l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m56093n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m56092o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.VX0
    public void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStart(owner);
        if (this.f66068l) {
            return;
        }
        boolean m79083b = this.f66066j.m79083b(this.f66065i, 3);
        this.f66068l = m79083b;
        C41318g46.m40163a("ShakeToReportDetector started: " + m79083b, new Object[0]);
    }

    @Override // p000.VX0
    public void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStop(owner);
        this.f66066j.m79082c();
        this.f66068l = false;
        C41318g46.m40163a("ShakeToReportDetector stopped", new Object[0]);
    }

    /* renamed from: p */
    public final void m56091p() {
        if (this.f66067k) {
            return;
        }
        this.f66060d.getLifecycle().mo67008a(this);
        this.f66067k = true;
    }
}
