.class public final Lco/bird/android/app/push/MyFirebaseMessagingService;
.super Lcom/google/firebase/messaging/FirebaseMessagingService;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ae\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\t\u00a2\u0006\u0006\u0008\u0088\u0001\u0010\u0089\u0001J(\u0010\u0008\u001a\u00020\u00072\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0002J*\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000cH\u0002J\u0008\u0010\u0012\u001a\u00020\nH\u0016J\u0008\u0010\u0013\u001a\u00020\nH\u0016J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001eR\"\u0010\'\u001a\u00020 8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$\"\u0004\u0008%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008)\u0010*\u001a\u0004\u0008+\u0010,\"\u0004\u0008-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u00081\u00102\u001a\u0004\u00083\u00104\"\u0004\u00085\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u00089\u0010:\u001a\u0004\u0008;\u0010<\"\u0004\u0008=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008A\u0010B\u001a\u0004\u0008C\u0010D\"\u0004\u0008E\u0010FR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008I\u0010J\u001a\u0004\u0008K\u0010L\"\u0004\u0008M\u0010NR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008Q\u0010R\u001a\u0004\u0008S\u0010T\"\u0004\u0008U\u0010VR\"\u0010_\u001a\u00020X8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008Y\u0010Z\u001a\u0004\u0008[\u0010\\\"\u0004\u0008]\u0010^R\"\u0010f\u001a\u00020`8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010a\u001a\u0004\u0008b\u0010c\"\u0004\u0008d\u0010eR\"\u0010n\u001a\u00020g8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008h\u0010i\u001a\u0004\u0008j\u0010k\"\u0004\u0008l\u0010mR\"\u0010u\u001a\u00020o8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010p\u001a\u0004\u0008q\u0010r\"\u0004\u0008s\u0010tR\"\u0010}\u001a\u00020v8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008w\u0010x\u001a\u0004\u0008y\u0010z\"\u0004\u0008{\u0010|R\u001f\u0010\u0083\u0001\u001a\u00020~8BX\u0082\u0084\u0002\u00a2\u0006\u000f\n\u0005\u0008\u007f\u0010\u0080\u0001\u001a\u0006\u0008\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0084\u00018BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0085\u0001\u0010\u0086\u0001\u00a8\u0006\u008a\u0001"
    }
    d2 = {
        "Lco/bird/android/app/push/MyFirebaseMessagingService;",
        "Lcom/google/firebase/messaging/FirebaseMessagingService;",
        "",
        "",
        "data",
        "Lco/bird/android/model/DispatchUserKind;",
        "dispatchUserKind",
        "Landroid/content/Intent;",
        "K",
        "token",
        "",
        "L",
        "",
        "notificationId",
        "titleResId",
        "bodyResId",
        "priority",
        "N",
        "onCreate",
        "onDestroy",
        "Lcom/google/firebase/messaging/RemoteMessage;",
        "remote",
        "q",
        "s",
        "Ldd3;",
        "h",
        "Ldd3;",
        "I",
        "()Ldd3;",
        "setSender",
        "(Ldd3;)V",
        "sender",
        "LEg1;",
        "i",
        "LEg1;",
        "C",
        "()LEg1;",
        "setEventBus",
        "(LEg1;)V",
        "eventBus",
        "Lwi2;",
        "j",
        "Lwi2;",
        "B",
        "()Lwi2;",
        "setDeserializer",
        "(Lwi2;)V",
        "deserializer",
        "LJT0;",
        "k",
        "LJT0;",
        "A",
        "()LJT0;",
        "setDealManager",
        "(LJT0;)V",
        "dealManager",
        "LEa;",
        "l",
        "LEa;",
        "w",
        "()LEa;",
        "setAnalyticsManager",
        "(LEa;)V",
        "analyticsManager",
        "LfL;",
        "m",
        "LfL;",
        "x",
        "()LfL;",
        "setBirdDeviceCheckManager",
        "(LfL;)V",
        "birdDeviceCheckManager",
        "Lom3;",
        "n",
        "Lom3;",
        "getOperatorManager",
        "()Lom3;",
        "setOperatorManager",
        "(Lom3;)V",
        "operatorManager",
        "LV74;",
        "o",
        "LV74;",
        "G",
        "()LV74;",
        "setPromoManager",
        "(LV74;)V",
        "promoManager",
        "Lgl;",
        "p",
        "Lgl;",
        "F",
        "()Lgl;",
        "setPreference",
        "(Lgl;)V",
        "preference",
        "LuL;",
        "LuL;",
        "y",
        "()LuL;",
        "setBirdEventManager",
        "(LuL;)V",
        "birdEventManager",
        "LaS2;",
        "r",
        "LaS2;",
        "E",
        "()LaS2;",
        "setMerchantManager",
        "(LaS2;)V",
        "merchantManager",
        "LZC6;",
        "LZC6;",
        "J",
        "()LZC6;",
        "setWorkManager",
        "(LZC6;)V",
        "workManager",
        "Ln10;",
        "t",
        "Ln10;",
        "z",
        "()Ln10;",
        "setBrainSwapManager",
        "(Ln10;)V",
        "brainSwapManager",
        "Lgv5;",
        "u",
        "Lkotlin/Lazy;",
        "H",
        "()Lgv5;",
        "scope",
        "Lg46$b;",
        "D",
        "()Lg46$b;",
        "logger",
        "<init>",
        "()V",
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
        "SMAP\nMyFirebaseMessagingService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyFirebaseMessagingService.kt\nco/bird/android/app/push/MyFirebaseMessagingService\n+ 2 IntentBuilder.kt\nco/bird/android/navigator/IntentBuilderKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,243:1\n236#1,2:244\n236#1,2:246\n236#1,2:248\n236#1,2:250\n236#1,2:252\n236#1,2:254\n30#2,2:256\n32#2:259\n61#2,26:260\n33#2:286\n34#2:288\n13579#3:258\n13580#3:287\n1#4:289\n*S KotlinDebug\n*F\n+ 1 MyFirebaseMessagingService.kt\nco/bird/android/app/push/MyFirebaseMessagingService\n*L\n150#1:244,2\n155#1:246,2\n160#1:248,2\n164#1:250,2\n168#1:252,2\n172#1:254,2\n193#1:256,2\n193#1:259\n193#1:260,26\n193#1:286\n193#1:288\n193#1:258\n193#1:287\n*E\n"
    }
.end annotation


# instance fields
.field public h:Ldd3;

.field public i:LEg1;

.field public j:Lwi2;

.field public k:LJT0;

.field public l:LEa;

.field public m:LfL;

.field public n:Lom3;

.field public o:LV74;

.field public p:Lgl;

.field public q:LuL;

.field public r:LaS2;

.field public s:LZC6;

.field public t:Ln10;

.field public final u:Lkotlin/Lazy;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/firebase/messaging/FirebaseMessagingService;-><init>()V

    sget-object v0, Lco/bird/android/app/push/MyFirebaseMessagingService$b;->g:Lco/bird/android/app/push/MyFirebaseMessagingService$b;

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/app/push/MyFirebaseMessagingService;->u:Lkotlin/Lazy;

    sget-object v0, LH22;->a:LH22;

    invoke-virtual {v0, p0}, LH22;->s1(Lco/bird/android/app/push/MyFirebaseMessagingService;)V

    return-void
.end method

.method public static final M(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic v(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/push/MyFirebaseMessagingService;->M(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final A()LJT0;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/push/MyFirebaseMessagingService;->k:LJT0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "dealManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final B()Lwi2;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/push/MyFirebaseMessagingService;->j:Lwi2;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "deserializer"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final C()LEg1;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/push/MyFirebaseMessagingService;->i:LEg1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "eventBus"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final D()Lg46$b;
    .locals 2

    const-string v0, "firebase-messaging-serv"

    invoke-static {v0}, Lg46;->k(Ljava/lang/String;)Lg46$b;

    move-result-object v0

    const-string v1, "tag(\"firebase-messaging-serv\")"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final E()LaS2;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/push/MyFirebaseMessagingService;->r:LaS2;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "merchantManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final F()Lgl;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/push/MyFirebaseMessagingService;->p:Lgl;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "preference"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final G()LV74;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/push/MyFirebaseMessagingService;->o:LV74;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "promoManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final H()Lgv5;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/push/MyFirebaseMessagingService;->u:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgv5;

    return-object v0
.end method

.method public final I()Ldd3;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/push/MyFirebaseMessagingService;->h:Ldd3;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "sender"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final J()LZC6;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/push/MyFirebaseMessagingService;->s:LZC6;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "workManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final K(Ljava/util/Map;Lco/bird/android/model/DispatchUserKind;)Landroid/content/Intent;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lco/bird/android/model/DispatchUserKind;",
            ")",
            "Landroid/content/Intent;"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    const-string v0, "applicationContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lco/bird/android/app/feature/main/MainActivity;

    invoke-direct {v0, p2, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p2, "uri"

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-interface {p1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    if-eqz v3, :cond_2

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    invoke-virtual {p0}, Lco/bird/android/app/push/MyFirebaseMessagingService;->D()Lg46$b;

    move-result-object p2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Detected deeplink uri: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p2, v2, v1}, Lg46$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    :cond_2
    return-object v0
.end method

.method public final L(Ljava/lang/String;)V
    .locals 2

    sget-object v0, LH22;->a:LH22;

    invoke-virtual {v0}, LH22;->r()Lgl;

    move-result-object v1

    invoke-virtual {v1, p1}, Lgl;->B2(Ljava/lang/String;)V

    invoke-virtual {v1}, Lgl;->B0()Lco/bird/android/model/User;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, LH22;->x1()Llh6;

    move-result-object v0

    invoke-interface {v0, p1}, Llh6;->j1(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, Lco/bird/android/app/push/MyFirebaseMessagingService$a;->g:Lco/bird/android/app/push/MyFirebaseMessagingService$a;

    new-instance v1, LbY2;

    invoke-direct {v1, v0}, LbY2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    :cond_0
    return-void
.end method

.method public final N(IIII)V
    .locals 4

    invoke-virtual {p0}, Lco/bird/android/app/push/MyFirebaseMessagingService;->I()Ldd3;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-class v3, Lco/bird/android/app/feature/main/MainActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-interface {v0, p1, v1}, Ldd3;->d(ILandroid/content/Intent;)Lac3$e;

    move-result-object v0

    invoke-virtual {v0, p4}, Lac3$e;->x(I)Lac3$e;

    move-result-object p4

    sget v0, Lrg4;->ic_bird_logo:I

    invoke-virtual {p4, v0}, Lac3$e;->B(I)Lac3$e;

    move-result-object p4

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4, p2}, Lac3$e;->m(Ljava/lang/CharSequence;)Lac3$e;

    move-result-object p2

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p4

    invoke-virtual {p4, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lac3$e;->l(Ljava/lang/CharSequence;)Lac3$e;

    move-result-object p2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p3

    invoke-virtual {p2, p3, p4}, Lac3$e;->I(J)Lac3$e;

    move-result-object p2

    invoke-virtual {p2}, Lac3$e;->c()Landroid/app/Notification;

    move-result-object p2

    const-string p3, "sender.getNotificationBu\u2026eMillis())\n      .build()"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/app/push/MyFirebaseMessagingService;->I()Ldd3;

    move-result-object p3

    invoke-interface {p3, p2, p1}, Ldd3;->e(Landroid/app/Notification;I)V

    return-void
.end method

.method public onCreate()V
    .locals 2

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    invoke-virtual {p0}, Lco/bird/android/app/push/MyFirebaseMessagingService;->H()Lgv5;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/f$a;->ON_CREATE:Landroidx/lifecycle/f$a;

    invoke-virtual {v0, v1}, Lgv5;->i(Landroidx/lifecycle/f$a;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Lcom/google/firebase/messaging/EnhancedIntentService;->onDestroy()V

    invoke-virtual {p0}, Lco/bird/android/app/push/MyFirebaseMessagingService;->H()Lgv5;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/f$a;->ON_DESTROY:Landroidx/lifecycle/f$a;

    invoke-virtual {v0, v1}, Lgv5;->i(Landroidx/lifecycle/f$a;)V

    return-void
.end method

.method public q(Lcom/google/firebase/messaging/RemoteMessage;)V
    .locals 7

    const-string v0, "remote"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/app/push/MyFirebaseMessagingService;->D()Lg46$b;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "Received message"

    invoke-virtual {v0, v3, v2}, Lg46$b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v0, Lcom/braze/push/BrazeFirebaseMessagingService;->h:Lcom/braze/push/BrazeFirebaseMessagingService$a;

    invoke-virtual {v0, p0, p1}, Lcom/braze/push/BrazeFirebaseMessagingService$a;->a(Landroid/content/Context;Lcom/google/firebase/messaging/RemoteMessage;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lco/bird/android/app/push/MyFirebaseMessagingService;->D()Lg46$b;

    move-result-object p1

    const-string v0, "Braze consumed message."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1}, Lg46$b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->u()Lcom/google/firebase/messaging/RemoteMessage$b;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->s()Ljava/util/Map;

    move-result-object v2

    const-string v3, "remote.data"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->F()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    const/4 v3, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object p1, v3

    :goto_0
    const/4 v4, 0x1

    if-eqz p1, :cond_2

    const-string v5, "refresh_merchant_history"

    invoke-interface {p1, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-ne p1, v4, :cond_2

    move v1, v4

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lco/bird/android/app/push/MyFirebaseMessagingService;->E()LaS2;

    move-result-object p1

    invoke-interface {p1}, LaS2;->b()V

    sget p1, Lml4;->bird_pay_label:I

    sget v1, Lnl4;->notification_merchant_new_transaction_body:I

    const/16 v5, 0x4d9

    invoke-virtual {p0, v5, p1, v1, v4}, Lco/bird/android/app/push/MyFirebaseMessagingService;->N(IIII)V

    :cond_3
    const-string p1, "command"

    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_4

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "command_name"

    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v4, "parameters"

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    if-nez p1, :cond_5

    :cond_4
    move-object p1, v2

    :cond_5
    sget-object v1, LLa4;->d:LLa4;

    invoke-virtual {v1}, LLa4;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_6

    invoke-virtual {p0}, Lco/bird/android/app/push/MyFirebaseMessagingService;->B()Lwi2;

    move-result-object v4

    const-class v5, Lco/bird/android/model/wire/WireBirdEvent;

    invoke-static {v5}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v5

    invoke-virtual {v4, v1, v5}, Lwi2;->c(Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_1

    :cond_6
    move-object v1, v3

    :goto_1
    check-cast v1, Lco/bird/android/model/wire/WireBirdEvent;

    if-eqz v1, :cond_7

    invoke-virtual {p0}, Lco/bird/android/app/push/MyFirebaseMessagingService;->y()LuL;

    move-result-object v4

    invoke-interface {v4, v1}, LuL;->a(Lco/bird/android/model/wire/WireBirdEvent;)V

    invoke-virtual {p0}, Lco/bird/android/app/push/MyFirebaseMessagingService;->C()LEg1;

    move-result-object v4

    new-instance v5, LYK;

    invoke-direct {v5, v1}, LYK;-><init>(Lco/bird/android/model/wire/WireBirdEvent;)V

    invoke-interface {v4, v5}, LEg1;->c(Lg70;)V

    :cond_7
    sget-object v1, LLa4;->c:LLa4;

    invoke-virtual {v1}, LLa4;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_8

    invoke-virtual {p0}, Lco/bird/android/app/push/MyFirebaseMessagingService;->B()Lwi2;

    move-result-object v4

    const-class v5, Lco/bird/android/model/Deal;

    invoke-static {v5}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v5

    invoke-virtual {v4, v1, v5}, Lwi2;->c(Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_2

    :cond_8
    move-object v1, v3

    :goto_2
    check-cast v1, Lco/bird/android/model/Deal;

    if-eqz v1, :cond_a

    invoke-virtual {p0}, Lco/bird/android/app/push/MyFirebaseMessagingService;->w()LEa;

    move-result-object v4

    new-instance v5, Lco/bird/android/model/analytics/BonusDealPushed;

    invoke-virtual {p0}, Lco/bird/android/app/push/MyFirebaseMessagingService;->F()Lgl;

    move-result-object v6

    invoke-virtual {v6}, Lgl;->B0()Lco/bird/android/model/User;

    move-result-object v6

    if-eqz v6, :cond_9

    invoke-virtual {v6}, Lco/bird/android/model/User;->getId()Ljava/lang/String;

    move-result-object v6

    goto :goto_3

    :cond_9
    move-object v6, v3

    :goto_3
    invoke-direct {v5, v1, v6}, Lco/bird/android/model/analytics/BonusDealPushed;-><init>(Lco/bird/android/model/Deal;Ljava/lang/String;)V

    invoke-interface {v4, v5}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    invoke-virtual {p0}, Lco/bird/android/app/push/MyFirebaseMessagingService;->A()LJT0;

    move-result-object v4

    invoke-interface {v4, v1}, LJT0;->f(Lco/bird/android/model/Deal;)V

    :cond_a
    sget-object v1, LLa4;->e:LLa4;

    invoke-virtual {v1}, LLa4;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_b

    invoke-virtual {p0}, Lco/bird/android/app/push/MyFirebaseMessagingService;->B()Lwi2;

    move-result-object v4

    const-class v5, Ljava/util/Map;

    invoke-static {v5}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v5

    invoke-virtual {v4, v1, v5}, Lwi2;->c(Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_4

    :cond_b
    move-object v1, v3

    :goto_4
    check-cast v1, Ljava/util/Map;

    if-eqz v1, :cond_c

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v4, "applicationContext"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/app/push/MyFirebaseMessagingService;->J()LZC6;

    move-result-object v4

    invoke-static {v1, v4}, LOa4;->c(Landroid/content/Context;LZC6;)V

    :cond_c
    sget-object v1, LLa4;->h:LLa4;

    invoke-virtual {v1}, LLa4;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_d

    invoke-virtual {p0}, Lco/bird/android/app/push/MyFirebaseMessagingService;->B()Lwi2;

    move-result-object v4

    const-class v5, Lco/bird/api/response/CouponsResponse;

    invoke-static {v5}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v5

    invoke-virtual {v4, v1, v5}, Lwi2;->c(Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_5

    :cond_d
    move-object v1, v3

    :goto_5
    check-cast v1, Lco/bird/api/response/CouponsResponse;

    if-eqz v1, :cond_e

    invoke-virtual {p0}, Lco/bird/android/app/push/MyFirebaseMessagingService;->G()LV74;

    move-result-object v4

    invoke-virtual {v1}, Lco/bird/api/response/CouponsResponse;->getCoupons()Ljava/util/List;

    move-result-object v1

    invoke-interface {v4, v1}, LV74;->e(Ljava/util/List;)V

    :cond_e
    sget-object v1, LLa4;->f:LLa4;

    invoke-virtual {v1}, LLa4;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_f

    invoke-virtual {p0}, Lco/bird/android/app/push/MyFirebaseMessagingService;->B()Lwi2;

    move-result-object v4

    const-class v5, Lco/bird/android/model/wire/WireDeviceCheckParameters;

    invoke-static {v5}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v5

    invoke-virtual {v4, v1, v5}, Lwi2;->c(Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_6

    :cond_f
    move-object v1, v3

    :goto_6
    check-cast v1, Lco/bird/android/model/wire/WireDeviceCheckParameters;

    if-eqz v1, :cond_10

    invoke-virtual {p0}, Lco/bird/android/app/push/MyFirebaseMessagingService;->x()LfL;

    move-result-object v4

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireDeviceCheckParameters;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v1}, LfL;->a(Ljava/lang/String;)V

    :cond_10
    sget-object v1, LLa4;->j:LLa4;

    invoke-virtual {v1}, LLa4;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_11

    invoke-virtual {p0}, Lco/bird/android/app/push/MyFirebaseMessagingService;->B()Lwi2;

    move-result-object v1

    const-class v4, Lco/bird/api/response/BrainSwapPayload;

    invoke-static {v4}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v4

    invoke-virtual {v1, p1, v4}, Lwi2;->c(Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_7

    :cond_11
    move-object p1, v3

    :goto_7
    check-cast p1, Lco/bird/api/response/BrainSwapPayload;

    if-eqz p1, :cond_12

    invoke-virtual {p0}, Lco/bird/android/app/push/MyFirebaseMessagingService;->z()Ln10;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/api/response/BrainSwapPayload;->getImei()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lco/bird/api/response/BrainSwapPayload;->getAssociated()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v1, v4, p1}, Ln10;->U(Ljava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/c;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/c;->subscribe()Lio/reactivex/disposables/c;

    :cond_12
    if-eqz v0, :cond_13

    invoke-virtual {p0}, Lco/bird/android/app/push/MyFirebaseMessagingService;->I()Ldd3;

    move-result-object p1

    invoke-virtual {p0, v2, v3}, Lco/bird/android/app/push/MyFirebaseMessagingService;->K(Ljava/util/Map;Lco/bird/android/model/DispatchUserKind;)Landroid/content/Intent;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ldd3;->c(Lcom/google/firebase/messaging/RemoteMessage$b;Landroid/content/Intent;)V

    :cond_13
    return-void
.end method

.method public s(Ljava/lang/String;)V
    .locals 1

    const-string v0, "token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingService;->s(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lco/bird/android/app/push/MyFirebaseMessagingService;->L(Ljava/lang/String;)V

    return-void
.end method

.method public final w()LEa;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/push/MyFirebaseMessagingService;->l:LEa;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "analyticsManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final x()LfL;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/push/MyFirebaseMessagingService;->m:LfL;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "birdDeviceCheckManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final y()LuL;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/push/MyFirebaseMessagingService;->q:LuL;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "birdEventManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final z()Ln10;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/push/MyFirebaseMessagingService;->t:Ln10;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "brainSwapManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method
