package p000;

import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.RadarTagMetadata;
import co.bird.android.model.constant.PartKind;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WirePart;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010$\u001a\u00020\"\u0012\u0006\u0010'\u001a\u00020%\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010/\u001a\u00020,¢\u0006\u0004\b0\u00101JK\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJA\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u0004\"\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0005H\u0002J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0005H\u0002J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0005H\u0002J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0005H\u0002J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u000fH\u0002J8\u0010!\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00062"}, m28432d2 = {"LwS1;", "LnS1;", "Lco/bird/android/model/wire/WireBird;", "bird", "", "Lco/bird/android/model/wire/WirePart;", "parts", "", "sessionId", "Lco/bird/android/model/RadarTagMetadata;", "radarTagMetadata", "Lio/reactivex/F;", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;[Lco/bird/android/model/wire/WirePart;Ljava/lang/String;Lco/bird/android/model/RadarTagMetadata;)Lio/reactivex/F;", "Lco/bird/android/model/constant/PartKind;", "kinds", "b", "(Lco/bird/android/model/wire/WireBird;[Lco/bird/android/model/constant/PartKind;Ljava/lang/String;)Lio/reactivex/F;", "sourcePart", "m", "k", "r", "l", "kind", "s", "birdId", "", "success", "partKinds", "LzQ1;", "flow", "", "x", "Lom3;", "Lom3;", "operatorManager", "LSM;", "LSM;", "birdPartManager", "LZF;", "c", "LZF;", "beaconConfigurationManager", "LEa;", DateTokenConverter.CONVERTER_KEY, "LEa;", "analyticsManager", "<init>", "(Lom3;LSM;LZF;LEa;)V", "id-tools_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIdToolsManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsManagerImpl.kt\nco/bird/android/manager/idtools/IdToolsManagerImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,141:1\n11335#2:142\n11670#2,3:143\n11335#2:146\n11670#2,3:147\n1549#3:150\n1620#3,3:151\n*S KotlinDebug\n*F\n+ 1 IdToolsManagerImpl.kt\nco/bird/android/manager/idtools/IdToolsManagerImpl\n*L\n31#1:142\n31#1:143,3\n67#1:146\n67#1:147,3\n134#1:150\n134#1:151,3\n*E\n"})
/* renamed from: wS1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C51021wS1 implements InterfaceC45686nS1 {

    /* renamed from: a */
    public final InterfaceC46473om3 f115997a;

    /* renamed from: b */
    public final InterfaceC7381SM f115998b;

    /* renamed from: c */
    public final InterfaceC10163ZF f115999c;

    /* renamed from: d */
    public final InterfaceC1880Ea f116000d;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wS1$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C29879a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PartKind.values().length];
            try {
                iArr[PartKind.STICKER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PartKind.BEACON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PartKind.BRAIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "", "kotlin.jvm.PlatformType", "attachedParts", "", "Lco/bird/android/model/wire/WirePart;", C17296a.f69688o, "([Ljava/lang/Object;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wS1$b */
    /* loaded from: classes4.dex */
    public static final class C29880b extends Lambda implements Function1<Object[], List<? extends WirePart>> {

        /* renamed from: g */
        public static final C29880b f116001g = new C29880b();

        public C29880b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<WirePart> invoke(Object[] attachedParts) {
            List<WirePart> filterIsInstance;
            Intrinsics.checkNotNullParameter(attachedParts, "attachedParts");
            filterIsInstance = ArraysKt___ArraysJvmKt.filterIsInstance(attachedParts, WirePart.class);
            return filterIsInstance;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "attachedParts", "", "Lco/bird/android/model/wire/WirePart;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nIdToolsManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsManagerImpl.kt\nco/bird/android/manager/idtools/IdToolsManagerImpl$attachParts$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,141:1\n1549#2:142\n1620#2,3:143\n*S KotlinDebug\n*F\n+ 1 IdToolsManagerImpl.kt\nco/bird/android/manager/idtools/IdToolsManagerImpl$attachParts$2\n*L\n49#1:142\n49#1:143,3\n*E\n"})
    /* renamed from: wS1$c */
    /* loaded from: classes4.dex */
    public static final class C29881c extends Lambda implements Function1<List<? extends WirePart>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ WireBird f116002g;

        /* renamed from: h */
        public final /* synthetic */ C51021wS1 f116003h;

        /* renamed from: i */
        public final /* synthetic */ String f116004i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29881c(WireBird wireBird, C51021wS1 c51021wS1, String str) {
            super(1);
            this.f116002g = wireBird;
            this.f116003h = c51021wS1;
            this.f116004i = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends WirePart> list) {
            invoke2((List<WirePart>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WirePart> attachedParts) {
            int collectionSizeOrDefault;
            String id = this.f116002g.getId();
            Intrinsics.checkNotNullExpressionValue(attachedParts, "attachedParts");
            List<WirePart> list = attachedParts;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WirePart wirePart : list) {
                arrayList.add(wirePart.getKind());
            }
            this.f116003h.m6799x(id, true, arrayList, EnumC52782zQ1.ASSOCIATE, this.f116004i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nIdToolsManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsManagerImpl.kt\nco/bird/android/manager/idtools/IdToolsManagerImpl$attachParts$3\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,141:1\n11335#2:142\n11670#2,3:143\n*S KotlinDebug\n*F\n+ 1 IdToolsManagerImpl.kt\nco/bird/android/manager/idtools/IdToolsManagerImpl$attachParts$3\n*L\n58#1:142\n58#1:143,3\n*E\n"})
    /* renamed from: wS1$d */
    /* loaded from: classes4.dex */
    public static final class C29882d extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ WireBird f116005g;

        /* renamed from: h */
        public final /* synthetic */ WirePart[] f116006h;

        /* renamed from: i */
        public final /* synthetic */ C51021wS1 f116007i;

        /* renamed from: j */
        public final /* synthetic */ String f116008j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29882d(WireBird wireBird, WirePart[] wirePartArr, C51021wS1 c51021wS1, String str) {
            super(1);
            this.f116005g = wireBird;
            this.f116006h = wirePartArr;
            this.f116007i = c51021wS1;
            this.f116008j = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            String id = this.f116005g.getId();
            WirePart[] wirePartArr = this.f116006h;
            ArrayList arrayList = new ArrayList(wirePartArr.length);
            for (WirePart wirePart : wirePartArr) {
                arrayList.add(wirePart.getKind());
            }
            this.f116007i.m6799x(id, false, arrayList, EnumC52782zQ1.ASSOCIATE, this.f116008j);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Landroid/os/Parcelable;", "it", "Lco/bird/android/model/wire/WirePart;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Landroid/os/Parcelable;)Lco/bird/android/model/wire/WirePart;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wS1$e */
    /* loaded from: classes4.dex */
    public static final class C29883e extends Lambda implements Function1<Parcelable, WirePart> {

        /* renamed from: g */
        public final /* synthetic */ WirePart f116009g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29883e(WirePart wirePart) {
            super(1);
            this.f116009g = wirePart;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final WirePart invoke(Parcelable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f116009g;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "", "kotlin.jvm.PlatformType", "partKinds", "", "Lco/bird/android/model/constant/PartKind;", C17296a.f69688o, "([Ljava/lang/Object;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wS1$f */
    /* loaded from: classes4.dex */
    public static final class C29884f extends Lambda implements Function1<Object[], List<? extends PartKind>> {

        /* renamed from: g */
        public static final C29884f f116010g = new C29884f();

        public C29884f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<PartKind> invoke(Object[] partKinds) {
            List<PartKind> filterIsInstance;
            Intrinsics.checkNotNullParameter(partKinds, "partKinds");
            filterIsInstance = ArraysKt___ArraysJvmKt.filterIsInstance(partKinds, PartKind.class);
            return filterIsInstance;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "detachedKinds", "", "Lco/bird/android/model/constant/PartKind;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wS1$g */
    /* loaded from: classes4.dex */
    public static final class C29885g extends Lambda implements Function1<List<? extends PartKind>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ WireBird f116011g;

        /* renamed from: h */
        public final /* synthetic */ C51021wS1 f116012h;

        /* renamed from: i */
        public final /* synthetic */ String f116013i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29885g(WireBird wireBird, C51021wS1 c51021wS1, String str) {
            super(1);
            this.f116011g = wireBird;
            this.f116012h = c51021wS1;
            this.f116013i = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends PartKind> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends PartKind> detachedKinds) {
            String id = this.f116011g.getId();
            EnumC52782zQ1 enumC52782zQ1 = EnumC52782zQ1.DISSOCIATE;
            C51021wS1 c51021wS1 = this.f116012h;
            Intrinsics.checkNotNullExpressionValue(detachedKinds, "detachedKinds");
            c51021wS1.m6799x(id, true, detachedKinds, enumC52782zQ1, this.f116013i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wS1$h */
    /* loaded from: classes4.dex */
    public static final class C29886h extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ WireBird f116014g;

        /* renamed from: h */
        public final /* synthetic */ PartKind[] f116015h;

        /* renamed from: i */
        public final /* synthetic */ C51021wS1 f116016i;

        /* renamed from: j */
        public final /* synthetic */ String f116017j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29886h(WireBird wireBird, PartKind[] partKindArr, C51021wS1 c51021wS1, String str) {
            super(1);
            this.f116014g = wireBird;
            this.f116015h = partKindArr;
            this.f116016i = c51021wS1;
            this.f116017j = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            List list;
            String id = this.f116014g.getId();
            list = ArraysKt___ArraysKt.toList(this.f116015h);
            this.f116016i.m6799x(id, false, list, EnumC52782zQ1.DISSOCIATE, this.f116017j);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WirePart;", "it", "Lco/bird/android/model/constant/PartKind;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WirePart;)Lco/bird/android/model/constant/PartKind;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wS1$i */
    /* loaded from: classes4.dex */
    public static final class C29887i extends Lambda implements Function1<WirePart, PartKind> {

        /* renamed from: g */
        public final /* synthetic */ PartKind f116018g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29887i(PartKind partKind) {
            super(1);
            this.f116018g = partKind;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final PartKind invoke(WirePart it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f116018g;
        }
    }

    public C51021wS1(InterfaceC46473om3 operatorManager, InterfaceC7381SM birdPartManager, InterfaceC10163ZF beaconConfigurationManager, InterfaceC1880Ea analyticsManager) {
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(birdPartManager, "birdPartManager");
        Intrinsics.checkNotNullParameter(beaconConfigurationManager, "beaconConfigurationManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        this.f115997a = operatorManager;
        this.f115998b = birdPartManager;
        this.f115999c = beaconConfigurationManager;
        this.f116000d = analyticsManager;
    }

    /* renamed from: n */
    public static final WirePart m6809n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WirePart) tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final List m6808o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m6807p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m6806q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final PartKind m6803t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (PartKind) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final List m6802u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m6801v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m6800w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC45686nS1
    /* renamed from: a */
    public AbstractC23442F<List<WirePart>> mo6822a(WireBird bird, WirePart[] parts, String str, RadarTagMetadata radarTagMetadata) {
        AbstractC23442F m6805r;
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(parts, "parts");
        ArrayList arrayList = new ArrayList(parts.length);
        for (WirePart wirePart : parts) {
            int i = C29879a.$EnumSwitchMapping$0[wirePart.getKind().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        m6805r = m6810m(bird, wirePart);
                    } else {
                        m6805r = m6811l(bird, wirePart);
                    }
                } else {
                    m6805r = m6812k(bird, wirePart);
                }
            } else {
                m6805r = m6805r(bird, wirePart);
            }
            AbstractC23442F m33146T = m6805r.m33146T(3L);
            final C29883e c29883e = new C29883e(wirePart);
            arrayList.add(m33146T.m33157I(new InterfaceC23492o() { // from class: sS1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    WirePart m6809n;
                    m6809n = C51021wS1.m6809n(Function1.this, obj);
                    return m6809n;
                }
            }));
        }
        final C29880b c29880b = C29880b.f116001g;
        AbstractC23442F m33107s0 = AbstractC23442F.m33107s0(arrayList, new InterfaceC23492o() { // from class: tS1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m6808o;
                m6808o = C51021wS1.m6808o(Function1.this, obj);
                return m6808o;
            }
        });
        final C29881c c29881c = new C29881c(bird, this, str);
        AbstractC23442F m33101w = m33107s0.m33101w(new InterfaceC23484g() { // from class: uS1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51021wS1.m6807p(Function1.this, obj);
            }
        });
        final C29882d c29882d = new C29882d(bird, parts, this, str);
        AbstractC23442F<List<WirePart>> m33106t = m33101w.m33106t(new InterfaceC23484g() { // from class: vS1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51021wS1.m6806q(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33106t, "override fun attachParts…nId\n        )\n      }\n  }");
        return m33106t;
    }

    @Override // p000.InterfaceC45686nS1
    /* renamed from: b */
    public AbstractC23442F<List<PartKind>> mo6821b(WireBird bird, PartKind[] kinds, String str) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(kinds, "kinds");
        ArrayList arrayList = new ArrayList(kinds.length);
        for (PartKind partKind : kinds) {
            AbstractC23442F<WirePart> m6804s = m6804s(bird, partKind);
            final C29887i c29887i = new C29887i(partKind);
            arrayList.add(m6804s.m33157I(new InterfaceC23492o() { // from class: oS1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    PartKind m6803t;
                    m6803t = C51021wS1.m6803t(Function1.this, obj);
                    return m6803t;
                }
            }));
        }
        final C29884f c29884f = C29884f.f116010g;
        AbstractC23442F m33107s0 = AbstractC23442F.m33107s0(arrayList, new InterfaceC23492o() { // from class: pS1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m6802u;
                m6802u = C51021wS1.m6802u(Function1.this, obj);
                return m6802u;
            }
        });
        final C29885g c29885g = new C29885g(bird, this, str);
        AbstractC23442F m33101w = m33107s0.m33101w(new InterfaceC23484g() { // from class: qS1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51021wS1.m6801v(Function1.this, obj);
            }
        });
        final C29886h c29886h = new C29886h(bird, kinds, this, str);
        AbstractC23442F<List<PartKind>> m33106t = m33101w.m33106t(new InterfaceC23484g() { // from class: rS1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51021wS1.m6800w(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33106t, "override fun detachParts…nId\n        )\n      }\n  }");
        return m33106t;
    }

    /* renamed from: k */
    public final AbstractC23442F<WirePart> m6812k(WireBird wireBird, WirePart wirePart) {
        AbstractC23442F<WirePart> m33042m = this.f115999c.mo44476b(wirePart.getKey(), wireBird.getCode()).m33042m(m6810m(wireBird, wirePart));
        Intrinsics.checkNotNullExpressionValue(m33042m, "beaconConfigurationManag…sourcePart = sourcePart))");
        return m33042m;
    }

    /* renamed from: l */
    public final AbstractC23442F<WirePart> m6811l(WireBird wireBird, WirePart wirePart) {
        return this.f115998b.mo78560f(wireBird.getId(), wirePart, wirePart);
    }

    /* renamed from: m */
    public final AbstractC23442F<WirePart> m6810m(WireBird wireBird, WirePart wirePart) {
        return C38096ag5.m70883l(this.f115998b.mo78563c(wireBird.getId(), wirePart, wirePart));
    }

    /* renamed from: r */
    public final AbstractC23442F<WireBird> m6805r(WireBird wireBird, WirePart wirePart) {
        if (wirePart.getId() != null) {
            InterfaceC46473om3 interfaceC46473om3 = this.f115997a;
            String id = wireBird.getId();
            String id2 = wirePart.getId();
            Intrinsics.checkNotNull(id2);
            return C38096ag5.m70883l(interfaceC46473om3.mo8103g1(id, id2));
        }
        throw new IllegalArgumentException("Sticker id cannot be null");
    }

    /* renamed from: s */
    public final AbstractC23442F<WirePart> m6804s(WireBird wireBird, PartKind partKind) {
        return C38096ag5.m70883l(this.f115998b.mo78561e(wireBird.getId(), partKind));
    }

    /* renamed from: x */
    public final void m6799x(String str, boolean z, List<? extends PartKind> list, EnumC52782zQ1 enumC52782zQ1, String str2) {
        String str3;
        int collectionSizeOrDefault;
        InterfaceC1880Ea interfaceC1880Ea = this.f116000d;
        if (str2 == null) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str3 = uuid;
        } else {
            str3 = str2;
        }
        List<? extends PartKind> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (PartKind partKind : list2) {
            arrayList.add(partKind.name());
        }
        interfaceC1880Ea.mo55905y(new C43889kQ1(null, str, str3, null, null, null, arrayList, enumC52782zQ1.name(), z, 57, null));
    }
}
