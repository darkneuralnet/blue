.class public final Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$a;,
        Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$b;,
        Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$NotConnected;,
        Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a6\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0004*.Z2B)\u0008\u0007\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00104\u001a\u000201\u0012\u0006\u00108\u001a\u000205\u00a2\u0006\u0004\u0008X\u0010YJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0002J\u0008\u0010\u0004\u001a\u00020\u0002H\u0002J$\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\u0008\u0010\u000c\u001a\u00020\u0002H\u0002J \u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\rH\u0002J\u000e\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0010H\u0002J\u000c\u0010\u0013\u001a\u00020\r*\u00020\tH\u0002J\u000e\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\u0014H\u0002J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0002J\u0008\u0010\u0018\u001a\u00020\rH\u0002J\u0008\u0010\u0019\u001a\u00020\rH\u0002J\u0018\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\rH\u0002J\u0018\u0010\u001c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\rH\u0002J\u000c\u0010\u001e\u001a\u00020\u001d*\u00020\rH\u0002J\u000e\u0010 \u001a\u0004\u0018\u00010\u001f*\u00020\rH\u0002J\u000c\u0010!\u001a\u00020\u001d*\u00020\rH\u0002J\u000c\u0010\"\u001a\u00020\u001d*\u00020\rH\u0002J\u000c\u0010#\u001a\u00020\u001d*\u00020\rH\u0002J\u000c\u0010$\u001a\u00020\u001d*\u00020\rH\u0002J\u000c\u0010%\u001a\u00020\u001d*\u00020\rH\u0002J\u000c\u0010&\u001a\u00020\u001d*\u00020\rH\u0002J\u000c\u0010\'\u001a\u00020\r*\u00020\rH\u0002J\u0006\u0010(\u001a\u00020\u0002R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00086\u00107R\u001a\u0010<\u001a\u0008\u0012\u0004\u0012\u00020\t098\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008:\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008>\u0010?R\u0016\u0010C\u001a\u00020\r8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008A\u0010BR\u0018\u0010F\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008D\u0010ER\u0018\u0010I\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008G\u0010HR.\u0010N\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 L*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010K0K0J8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010MR:\u0010S\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020Q L*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020Q\u0018\u00010P0P0O8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010RR \u0010W\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020U0T8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010V\u00a8\u0006["
    }
    d2 = {
        "Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;",
        "",
        "",
        "M",
        "v",
        "LTk5;",
        "scanResult",
        "LnI5;",
        "state",
        "",
        "metadata",
        "P",
        "y",
        "",
        "payload",
        "aesKey",
        "Lio/reactivex/F;",
        "I",
        "K",
        "n",
        "Lco/bird/api/response/SmartlockResponse;",
        "Lco/bird/api/response/SmartlockKey;",
        "G",
        "k",
        "j",
        "l",
        "key",
        "o",
        "m",
        "",
        "t",
        "Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$c;",
        "O",
        "u",
        "q",
        "p",
        "r",
        "s",
        "N",
        "L",
        "H",
        "LMD;",
        "a",
        "LMD;",
        "baseBluetoothManager",
        "LhI5;",
        "b",
        "LhI5;",
        "smartlockClient",
        "Lcom/uber/autodispose/ScopeProvider;",
        "c",
        "Lcom/uber/autodispose/ScopeProvider;",
        "scopeProvider",
        "LrK5;",
        "d",
        "LrK5;",
        "ui",
        "",
        "e",
        "Ljava/util/List;",
        "seenLockMacAddresses",
        "Lke5;",
        "f",
        "Lke5;",
        "smartlockConnection",
        "g",
        "[B",
        "sessionToken",
        "h",
        "Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$c;",
        "sessionTokenResponse",
        "i",
        "Lco/bird/api/response/SmartlockResponse;",
        "smartlockResponse",
        "LCG4;",
        "Lco/bird/android/buava/Optional;",
        "kotlin.jvm.PlatformType",
        "LCG4;",
        "bluetoothScanResults",
        "Lma4;",
        "Lkotlin/Pair;",
        "Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$a;",
        "Lma4;",
        "bluetoothRequestRelay",
        "",
        "LlI5;",
        "Ljava/util/Map;",
        "smartlockItems",
        "<init>",
        "(LMD;LhI5;Lcom/uber/autodispose/ScopeProvider;LrK5;)V",
        "NotConnected",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSmartlockOperatorUnlockPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartlockOperatorUnlockPresenter.kt\nco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,410:1\n180#2:411\n180#2:412\n237#2:413\n288#3,2:414\n*S KotlinDebug\n*F\n+ 1 SmartlockOperatorUnlockPresenter.kt\nco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter\n*L\n91#1:411\n120#1:412\n286#1:413\n320#1:414,2\n*E\n"
    }
.end annotation


# static fields
.field public static final m:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$b;

.field public static final n:I

.field public static final o:[B

.field public static final p:J


# instance fields
.field public final a:LMD;

.field public final b:LhI5;

.field public final c:Lcom/uber/autodispose/ScopeProvider;

.field public final d:LrK5;

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public f:Lke5;

.field public g:[B

.field public h:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$c;

.field public i:Lco/bird/api/response/SmartlockResponse;

.field public final j:LCG4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LCG4<",
            "Lco/bird/android/buava/Optional<",
            "LTk5;",
            ">;>;"
        }
    .end annotation
.end field

.field public final k:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lkotlin/Pair<",
            "LTk5;",
            "Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$a;",
            ">;>;"
        }
    .end annotation
.end field

.field public final l:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LlI5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->m:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$b;

    const/16 v0, 0x8

    sput v0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->n:I

    const/16 v0, 0x10

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->o:[B

    const-wide/16 v0, 0x2ee

    sput-wide v0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->p:J

    return-void

    :array_0
    .array-data 1
        0x6t
        0x1t
        0x1t
        0x1t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public constructor <init>(LMD;LhI5;Lcom/uber/autodispose/ScopeProvider;LrK5;)V
    .locals 1

    const-string v0, "baseBluetoothManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "smartlockClient"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ui"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->a:LMD;

    iput-object p2, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->b:LhI5;

    iput-object p3, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->c:Lcom/uber/autodispose/ScopeProvider;

    iput-object p4, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->d:LrK5;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->e:Ljava/util/List;

    invoke-static {}, LCG4;->g()LCG4;

    move-result-object p1

    const-string p2, "create<Optional<ScanResult>>()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->j:LCG4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object p1

    const-string p2, "create<Pair<ScanResult, BluetoothRequestType>>()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->k:Lma4;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->l:Ljava/util/Map;

    return-void
.end method

.method public static final A(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final B(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final C(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/u;

    return-object p0
.end method

.method public static final D(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final E()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "unlocked smartlock!"

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static final F(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic J(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;[B[BILjava/lang/Object;)Lio/reactivex/F;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->j()[B

    move-result-object p2

    :cond_0
    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->I([B[B)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Q(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;LTk5;LnI5;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->P(LTk5;LnI5;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->x(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic access$currentAesKey(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;)[B
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->j()[B

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$decrypt(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;[B[B)[B
    .locals 0

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->m([B[B)[B

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getBluetoothRequestRelay$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;)Lma4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->k:Lma4;

    return-object p0
.end method

.method public static final synthetic access$getSeenLockMacAddresses$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->e:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getSessionTokenResponse$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;)Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$c;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->h:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$c;

    return-object p0
.end method

.method public static final synthetic access$getSmartlockClient$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;)LhI5;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->b:LhI5;

    return-object p0
.end method

.method public static final synthetic access$getSmartlockConnection$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;)Lke5;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->f:Lke5;

    return-object p0
.end method

.method public static final synthetic access$getSmartlockItems$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->l:Ljava/util/Map;

    return-object p0
.end method

.method public static final synthetic access$getTOKEN_REQUEST$cp()[B
    .locals 1

    sget-object v0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->o:[B

    return-object v0
.end method

.method public static final synthetic access$getUi$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;)LrK5;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->d:LrK5;

    return-object p0
.end method

.method public static final synthetic access$isCableInsertedResponse(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;[B)Z
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->p([B)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$isLockResponse(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;[B)Z
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->q([B)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$isLockStateResponse(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;[B)Z
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->r([B)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$isLocked(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;[B)Z
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->s([B)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$isSessionTokenResponse(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;[B)Z
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->t([B)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$isUnlockResponse(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;[B)Z
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->u([B)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$nonProvisionalKey(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;Lco/bird/api/response/SmartlockResponse;)Lco/bird/api/response/SmartlockKey;
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->G(Lco/bird/api/response/SmartlockResponse;)Lco/bird/api/response/SmartlockKey;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$sendUnlockingRequest(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;)Lio/reactivex/F;
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->K()Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$sessionToken(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;[B)[B
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->L([B)[B

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setSessionToken$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;[B)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->g:[B

    return-void
.end method

.method public static final synthetic access$setSessionTokenResponse$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$c;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->h:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$c;

    return-void
.end method

.method public static final synthetic access$setSmartlockConnection$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;Lke5;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->f:Lke5;

    return-void
.end method

.method public static final synthetic access$setSmartlockResponse$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;Lco/bird/api/response/SmartlockResponse;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->i:Lco/bird/api/response/SmartlockResponse;

    return-void
.end method

.method public static final synthetic access$successful(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;[B)Z
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->N([B)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$toSessionTokenResponse(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;[B)Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$c;
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->O([B)Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$updateItemByScanResult(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;LTk5;LnI5;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->P(LTk5;LnI5;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->B(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic c()V
    .locals 0

    invoke-static {}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->E()V

    return-void
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->F(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->z(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->C(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->w(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->A(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->D(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final w(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/u;

    return-object p0
.end method

.method public static final x(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final z(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final G(Lco/bird/api/response/SmartlockResponse;)Lco/bird/api/response/SmartlockKey;
    .locals 2

    invoke-virtual {p1}, Lco/bird/api/response/SmartlockResponse;->getKeysList()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lco/bird/api/response/SmartlockKey;

    invoke-virtual {v1}, Lco/bird/api/response/SmartlockKey;->getProvisional()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Lco/bird/api/response/SmartlockKey;

    return-object v0
.end method

.method public final H()V
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->d:LrK5;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, LrK5;->Pl(Ljava/util/List;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->M()V

    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->y()V

    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->v()V

    return-void
.end method

.method public final I([B[B)Lio/reactivex/F;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B[B)",
            "Lio/reactivex/F<",
            "[B>;"
        }
    .end annotation

    invoke-static {p1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(this)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "sending payload to lock "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->o([B[B)[B

    move-result-object p1

    iget-object p2, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->f:Lke5;

    if-eqz p2, :cond_0

    sget-object v0, Lco/bird/android/app/manager/SmartlockManagerImpl$i;->c:Lco/bird/android/app/manager/SmartlockManagerImpl$i;

    invoke-virtual {v0}, Lco/bird/android/app/manager/SmartlockManagerImpl$i;->b()Ljava/util/UUID;

    move-result-object v0

    invoke-interface {p2, v0, p1}, Lke5;->c(Ljava/util/UUID;[B)Lio/reactivex/F;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    sget-object p1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$NotConnected;->b:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$NotConnected;

    invoke-static {p1}, Lio/reactivex/F;->x(Ljava/lang/Throwable;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "error(NotConnected)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    return-object p1
.end method

.method public final K()Lio/reactivex/F;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "[B>;"
        }
    .end annotation

    const/4 v0, 0x3

    new-array v1, v0, [B

    new-instance v2, Ljava/util/Random;

    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    invoke-virtual {v2, v1}, Ljava/util/Random;->nextBytes([B)V

    const/16 v2, 0x10

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    sget-object v3, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v2

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->l()[B

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v2, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->g:[B

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const-string v2, "sessionToken"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v3

    :cond_0
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    const-string v1, "payload"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    invoke-static {p0, v0, v3, v1, v3}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->J(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;[B[BILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    return-object v0

    :array_0
    .array-data 1
        0x5t
        0x1t
        0x6t
    .end array-data
.end method

.method public final L([B)[B
    .locals 3

    new-instance v0, Lkotlin/ranges/IntRange;

    const/4 v1, 0x3

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    invoke-static {p1, v0}, Lkotlin/collections/ArraysKt;->sliceArray([BLkotlin/ranges/IntRange;)[B

    move-result-object p1

    return-object p1
.end method

.method public final M()V
    .locals 6

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->a:LMD;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LMD$a;->scanBleDevices$default(LMD;IZLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$m;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$m;

    invoke-static {v0, v1}, LYf5;->T(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->c:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    iget-object v1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->j:LCG4;

    invoke-interface {v0, v1}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public final N([B)Z
    .locals 1

    const/4 v0, 0x3

    aget-byte p1, p1, v0

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->compare(II)I

    move-result p1

    if-nez p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public final O([B)Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$c;
    .locals 1

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->t([B)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$c;

    invoke-direct {v0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$c;-><init>([B)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final P(LTk5;LnI5;Ljava/lang/String;)V
    .locals 5

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->l:Ljava/util/Map;

    invoke-static {p1}, LUk5;->o(LTk5;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, LlI5;

    iget-object v3, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->l:Ljava/util/Map;

    invoke-static {p1}, LUk5;->o(LTk5;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LlI5;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, LlI5;->b()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    move-object p3, v3

    :cond_1
    :goto_0
    invoke-direct {v2, p1, p2, p3}, LlI5;-><init>(LTk5;LnI5;Ljava/lang/String;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->d:LrK5;

    iget-object p2, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->l:Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1, p2}, LrK5;->Pl(Ljava/util/List;)V

    return-void
.end method

.method public final j()[B
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->k()Lco/bird/api/response/SmartlockKey;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/api/response/SmartlockKey;->getKey()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->n(Ljava/lang/String;)[B

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [B

    :cond_1
    return-object v0
.end method

.method public final k()Lco/bird/api/response/SmartlockKey;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->i:Lco/bird/api/response/SmartlockResponse;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->G(Lco/bird/api/response/SmartlockResponse;)Lco/bird/api/response/SmartlockKey;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final l()[B
    .locals 2

    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->k()Lco/bird/api/response/SmartlockKey;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/api/response/SmartlockKey;->getPassword()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v1, "this as java.lang.String).getBytes(charset)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [B

    :cond_1
    return-object v0
.end method

.method public final m([B[B)[B
    .locals 2

    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v1, "AES"

    invoke-direct {v0, p2, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    const-string p2, "AES/ECB/NoPadding"

    invoke-static {p2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object p2

    const/4 v1, 0x2

    invoke-virtual {p2, v1, v0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    invoke-virtual {p2, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p1

    const-string p2, "cipher.doFinal(payload)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final n(Ljava/lang/String;)[B
    .locals 1

    invoke-static {}, LEy;->a()LEy$a;

    move-result-object v0

    invoke-virtual {v0, p1}, LEy$a;->a(Ljava/lang/String;)[B

    move-result-object p1

    const-string v0, "getDecoder().decode(this)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final o([B[B)[B
    .locals 2

    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v1, "AES"

    invoke-direct {v0, p2, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    const-string p2, "AES/ECB/NoPadding"

    invoke-static {p2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object p2

    const/4 v1, 0x1

    invoke-virtual {p2, v1, v0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    invoke-virtual {p2, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p1

    const-string p2, "cipher.doFinal(payload)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final p([B)Z
    .locals 3

    new-instance v0, Lkotlin/ranges/IntRange;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    invoke-static {p1, v0}, Lkotlin/collections/ArraysKt;->sliceArray([BLkotlin/ranges/IntRange;)[B

    move-result-object p1

    const/4 v0, 0x3

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1

    :array_0
    .array-data 1
        0x5t
        0x8t
        0x1t
    .end array-data
.end method

.method public final q([B)Z
    .locals 3

    new-instance v0, Lkotlin/ranges/IntRange;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    invoke-static {p1, v0}, Lkotlin/collections/ArraysKt;->sliceArray([BLkotlin/ranges/IntRange;)[B

    move-result-object p1

    const/4 v0, 0x3

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1

    :array_0
    .array-data 1
        0x5t
        0xdt
        0x1t
    .end array-data
.end method

.method public final r([B)Z
    .locals 3

    new-instance v0, Lkotlin/ranges/IntRange;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    invoke-static {p1, v0}, Lkotlin/collections/ArraysKt;->sliceArray([BLkotlin/ranges/IntRange;)[B

    move-result-object p1

    const/4 v0, 0x3

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1

    :array_0
    .array-data 1
        0x5t
        0xft
        0x1t
    .end array-data
.end method

.method public final s([B)Z
    .locals 1

    const/4 v0, 0x3

    aget-byte p1, p1, v0

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->compare(II)I

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final t([B)Z
    .locals 3

    new-instance v0, Lkotlin/ranges/IntRange;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    invoke-static {p1, v0}, Lkotlin/collections/ArraysKt;->sliceArray([BLkotlin/ranges/IntRange;)[B

    move-result-object p1

    const/4 v0, 0x2

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1

    :array_0
    .array-data 1
        0x6t
        0x2t
    .end array-data
.end method

.method public final u([B)Z
    .locals 3

    new-instance v0, Lkotlin/ranges/IntRange;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    invoke-static {p1, v0}, Lkotlin/collections/ArraysKt;->sliceArray([BLkotlin/ranges/IntRange;)[B

    move-result-object p1

    const/4 v0, 0x3

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1

    :array_0
    .array-data 1
        0x5t
        0x2t
        0x1t
    .end array-data
.end method

.method public final v()V
    .locals 3

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->k:Lma4;

    new-instance v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$d;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$d;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;)V

    new-instance v2, LLJ5;

    invoke-direct {v2, v1}, LLJ5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->switchMapMaybe(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "private fun listenForBlu\u2026)\n      .subscribe {}\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->c:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    sget-object v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$e;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$e;

    new-instance v2, LMJ5;

    invoke-direct {v2, v1}, LMJ5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public final y()V
    .locals 5

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->j:LCG4;

    sget-object v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$f;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$f;

    new-instance v2, LNJ5;

    invoke-direct {v2, v1}, LNJ5;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->distinctUntilChanged(Lio/reactivex/functions/d;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "bluetoothScanResults\n   \u2026Null()?.getMacAddress() }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$g;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$g;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;)V

    invoke-static {v0, v1}, LYf5;->T(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lio/reactivex/b;->e:Lio/reactivex/b;

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->toFlowable(Lio/reactivex/b;)Lio/reactivex/k;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lio/reactivex/k;->t0(Lio/reactivex/E;ZI)Lio/reactivex/k;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$h;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$h;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;)V

    new-instance v4, LOJ5;

    invoke-direct {v4, v1}, LOJ5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v4}, Lio/reactivex/k;->K(Lio/reactivex/functions/g;)Lio/reactivex/k;

    move-result-object v0

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1, v2, v3}, Lio/reactivex/k;->t0(Lio/reactivex/E;ZI)Lio/reactivex/k;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$i;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$i;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;)V

    new-instance v4, LPJ5;

    invoke-direct {v4, v1}, LPJ5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v4}, Lio/reactivex/k;->K(Lio/reactivex/functions/g;)Lio/reactivex/k;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$j;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$j;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;)V

    new-instance v4, LQJ5;

    invoke-direct {v4, v1}, LQJ5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v4}, Lio/reactivex/k;->d0(Lio/reactivex/functions/o;)Lio/reactivex/k;

    move-result-object v0

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1, v2, v3}, Lio/reactivex/k;->t0(Lio/reactivex/E;ZI)Lio/reactivex/k;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$k;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$k;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;)V

    new-instance v4, LRJ5;

    invoke-direct {v4, v1}, LRJ5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v4, v2, v3}, Lio/reactivex/k;->a0(Lio/reactivex/functions/o;ZI)Lio/reactivex/c;

    move-result-object v0

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/c;->X(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/c;->P(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object v0

    const-string v1, "private fun listenForSma\u2026\")\n        }\n      })\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->c:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/c;->n(Lio/reactivex/d;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.au\u2026isposable<Any>(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/CompletableSubscribeProxy;

    new-instance v1, LSJ5;

    invoke-direct {v1}, LSJ5;-><init>()V

    new-instance v2, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$l;

    invoke-direct {v2, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$l;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;)V

    new-instance v3, LTJ5;

    invoke-direct {v3, v2}, LTJ5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v1, v3}, Lcom/uber/autodispose/CompletableSubscribeProxy;->e(Lio/reactivex/functions/a;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method
