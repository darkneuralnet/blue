.class public final Ll84;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV74;
.implements Lbr4;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "CheckResult"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002BI\u0008\u0007\u0012\u0006\u0010V\u001a\u00020U\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010%\u001a\u00020#\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010,\u001a\u00020*\u0012\u0006\u0010/\u001a\u00020-\u0012\u0006\u00102\u001a\u000200\u0012\u0006\u00106\u001a\u000203\u00a2\u0006\u0004\u0008W\u0010XJ\u0008\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\u000c\u001a\u00020\u0003*\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u0012\u0010\r\u001a\u00020\u0003*\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0002J0\u0010\u0010\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b \u000f*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\n0\u00072\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\"\u0010\u0011\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b \u000f*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\n0\u0007H\u0002J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n0\u0007H\u0016J\u000e\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u000e\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0016J\u0016\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00072\u0006\u0010\u0015\u001a\u00020\u0008H\u0016J\u0008\u0010\u0018\u001a\u00020\u0017H\u0016J\u0016\u0010\u0019\u001a\u00020\u00032\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0008\u0010\u001a\u001a\u00020\u0003H\u0016J\u0008\u0010\u001b\u001a\u00020\u0017H\u0016J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0008H\u0016J\u0016\u0010\u001e\u001a\u00020\u00032\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010+R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010.R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00084\u00105R\'\u0010\u000e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n078VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u00108\u001a\u0004\u00089\u0010:R\'\u0010=\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020;0\n078VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008<\u00108\u001a\u0004\u0008\'\u0010:R!\u0010A\u001a\u0008\u0012\u0004\u0012\u00020>078VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008?\u00108\u001a\u0004\u0008@\u0010:R\'\u0010D\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n078VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008B\u00108\u001a\u0004\u0008C\u0010:R\'\u0010F\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n078VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008E\u00108\u001a\u0004\u00084\u0010:R \u0010J\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n0G8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008H\u0010IR \u0010L\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020;0\n0G8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008K\u0010IR\u001a\u0010N\u001a\u0008\u0012\u0004\u0012\u00020>0G8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008M\u0010IR \u0010P\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n0G8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008O\u0010IR \u0010Q\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n0G8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010IR \u0010T\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050R0G8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008S\u0010I\u00a8\u0006Y"
    }
    d2 = {
        "Ll84;",
        "LV74;",
        "Lbr4;",
        "",
        "s1",
        "Lco/bird/android/model/Link;",
        "link",
        "Lio/reactivex/F;",
        "",
        "u0",
        "",
        "Lco/bird/android/model/wire/WireCoupon;",
        "v1",
        "k1",
        "coupons",
        "kotlin.jvm.PlatformType",
        "n0",
        "h0",
        "i",
        "x",
        "v",
        "linkCode",
        "g",
        "Lio/reactivex/c;",
        "f",
        "g0",
        "w",
        "z",
        "couponId",
        "c",
        "e",
        "Landroid/content/Context;",
        "b",
        "Landroid/content/Context;",
        "context",
        "Lco/bird/android/model/DynamicLinkConfiguration;",
        "Lco/bird/android/model/DynamicLinkConfiguration;",
        "dynamicLinkConfiguration",
        "LTg6;",
        "d",
        "LTg6;",
        "userClient",
        "LAD0;",
        "LAD0;",
        "couponClient",
        "LBQ2;",
        "LBQ2;",
        "merchantClient",
        "LTq4;",
        "LTq4;",
        "reactiveConfig",
        "LKm1;",
        "h",
        "LKm1;",
        "dynamicLinks",
        "LZ84;",
        "Lkotlin/Lazy;",
        "y",
        "()LZ84;",
        "Lco/bird/android/model/wire/WireCouponDisplayView;",
        "j",
        "couponDisplayViews",
        "",
        "k",
        "r",
        "skipPreload",
        "l",
        "C",
        "promoOffers",
        "m",
        "noBatteryCoupons",
        "La94;",
        "n",
        "La94;",
        "mutableCoupons",
        "o",
        "mutableCouponDisplayViews",
        "p",
        "mutableSkipPreload",
        "q",
        "mutablePromoOffers",
        "mutableNoBatteryCoupons",
        "Lco/bird/android/buava/Optional;",
        "s",
        "freeRideLink",
        "LRh6;",
        "userStream",
        "<init>",
        "(LRh6;Landroid/content/Context;Lco/bird/android/model/DynamicLinkConfiguration;LTg6;LAD0;LBQ2;LTq4;LKm1;)V",
        "ride_release"
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
        "SMAP\nPromoManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PromoManagerImpl.kt\nco/bird/android/manager/ride/PromoManagerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,239:1\n766#2:240\n857#2,2:241\n1747#2,3:243\n1045#2:246\n766#2:247\n857#2,2:248\n1549#2:250\n1620#2,3:251\n*S KotlinDebug\n*F\n+ 1 PromoManagerImpl.kt\nco/bird/android/manager/ride/PromoManagerImpl\n*L\n171#1:240\n171#1:241,2\n204#1:243,3\n208#1:246\n208#1:247\n208#1:248,2\n216#1:250\n216#1:251,3\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Landroid/content/Context;

.field public final c:Lco/bird/android/model/DynamicLinkConfiguration;

.field public final d:LTg6;

.field public final e:LAD0;

.field public final f:LBQ2;

.field public final g:LTq4;

.field public final h:LKm1;

.field public final i:Lkotlin/Lazy;

.field public final j:Lkotlin/Lazy;

.field public final k:Lkotlin/Lazy;

.field public final l:Lkotlin/Lazy;

.field public final m:Lkotlin/Lazy;

.field public final n:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireCoupon;",
            ">;>;"
        }
    .end annotation
.end field

.field public final o:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireCouponDisplayView;",
            ">;>;"
        }
    .end annotation
.end field

.field public final p:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final q:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireCoupon;",
            ">;>;"
        }
    .end annotation
.end field

.field public final r:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireCoupon;",
            ">;>;"
        }
    .end annotation
.end field

.field public final s:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/Link;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LRh6;Landroid/content/Context;Lco/bird/android/model/DynamicLinkConfiguration;LTg6;LAD0;LBQ2;LTq4;LKm1;)V
    .locals 1

    const-string v0, "userStream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dynamicLinkConfiguration"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userClient"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "couponClient"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "merchantClient"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dynamicLinks"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll84;->b:Landroid/content/Context;

    iput-object p3, p0, Ll84;->c:Lco/bird/android/model/DynamicLinkConfiguration;

    iput-object p4, p0, Ll84;->d:LTg6;

    iput-object p5, p0, Ll84;->e:LAD0;

    iput-object p6, p0, Ll84;->f:LBQ2;

    iput-object p7, p0, Ll84;->g:LTq4;

    iput-object p8, p0, Ll84;->h:LKm1;

    new-instance p2, Ll84$e;

    invoke-direct {p2, p0}, Ll84$e;-><init>(Ll84;)V

    invoke-static {p2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p2

    iput-object p2, p0, Ll84;->i:Lkotlin/Lazy;

    new-instance p2, Ll84$d;

    invoke-direct {p2, p0}, Ll84$d;-><init>(Ll84;)V

    invoke-static {p2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p2

    iput-object p2, p0, Ll84;->j:Lkotlin/Lazy;

    new-instance p2, Ll84$r;

    invoke-direct {p2, p0}, Ll84$r;-><init>(Ll84;)V

    invoke-static {p2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p2

    iput-object p2, p0, Ll84;->k:Lkotlin/Lazy;

    new-instance p2, Ll84$o;

    invoke-direct {p2, p0}, Ll84$o;-><init>(Ll84;)V

    invoke-static {p2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p2

    iput-object p2, p0, Ll84;->l:Lkotlin/Lazy;

    new-instance p2, Ll84$n;

    invoke-direct {p2, p0}, Ll84$n;-><init>(Ll84;)V

    invoke-static {p2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p2

    iput-object p2, p0, Ll84;->m:Lkotlin/Lazy;

    sget-object p2, La94;->h:La94$a;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p3

    const/4 p4, 0x0

    const/4 p5, 0x2

    invoke-static {p2, p3, p4, p5, p4}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object p3

    iput-object p3, p0, Ll84;->n:La94;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p6

    invoke-static {p2, p6, p4, p5, p4}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object p6

    iput-object p6, p0, Ll84;->o:La94;

    sget-object p6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p2, p6, p4, p5, p4}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object p6

    iput-object p6, p0, Ll84;->p:La94;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p6

    invoke-static {p2, p6, p4, p5, p4}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object p6

    iput-object p6, p0, Ll84;->q:La94;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p6

    invoke-static {p2, p6, p4, p5, p4}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object p6

    iput-object p6, p0, Ll84;->r:La94;

    sget-object p6, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {p6}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object p6

    invoke-static {p2, p6, p4, p5, p4}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object p2

    iput-object p2, p0, Ll84;->s:La94;

    invoke-interface {p1}, LRh6;->f()Lio/reactivex/Observable;

    move-result-object p2

    new-instance p4, Ll84$a;

    invoke-direct {p4, p0}, Ll84$a;-><init>(Ll84;)V

    new-instance p5, Lc84;

    invoke-direct {p5, p4}, Lc84;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->flatMapCompletable(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p2

    invoke-virtual {p2}, Lio/reactivex/c;->subscribe()Lio/reactivex/disposables/c;

    invoke-interface {p1}, LRh6;->i()Lio/reactivex/Observable;

    move-result-object p1

    new-instance p2, Ll84$b;

    invoke-direct {p2, p0}, Ll84$b;-><init>(Ll84;)V

    new-instance p4, Ld84;

    invoke-direct {p4, p2}, Ld84;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p4}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    new-instance p1, Ll84$c;

    invoke-direct {p1, p0}, Ll84$c;-><init>(Ll84;)V

    new-instance p2, Le84;

    invoke-direct {p2, p1}, Le84;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p3, p2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public static synthetic D(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Ll84;->f0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic F(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Ll84;->r1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Ll84;->g1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic I(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Ll84;->c0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic J(Lio/reactivex/H;Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1}, Ll84;->h1(Lio/reactivex/H;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic N(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Ll84;->e0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic O(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Ll84;->k0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic P(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Ll84;->q1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic Q(Ll84;Lco/bird/android/model/Link;Lio/reactivex/H;)V
    .locals 0

    invoke-static {p0, p1, p2}, Ll84;->v0(Ll84;Lco/bird/android/model/Link;Lio/reactivex/H;)V

    return-void
.end method

.method public static synthetic R(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Ll84;->s0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic T(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Ll84;->m0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic V(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Ll84;->j0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Ll84;->t0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a0(Ll84;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0}, Ll84;->i1(Ll84;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$fetchCouponExtensions(Ll84;Ljava/util/List;)Lio/reactivex/F;
    .locals 0

    invoke-virtual {p0, p1}, Ll84;->n0(Ljava/util/List;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getFreeRideLink$p(Ll84;)La94;
    .locals 0

    iget-object p0, p0, Ll84;->s:La94;

    return-object p0
.end method

.method public static final synthetic access$getMutableCouponDisplayViews$p(Ll84;)La94;
    .locals 0

    iget-object p0, p0, Ll84;->o:La94;

    return-object p0
.end method

.method public static final synthetic access$getMutableCoupons$p(Ll84;)La94;
    .locals 0

    iget-object p0, p0, Ll84;->n:La94;

    return-object p0
.end method

.method public static final synthetic access$getMutableNoBatteryCoupons$p(Ll84;)La94;
    .locals 0

    iget-object p0, p0, Ll84;->r:La94;

    return-object p0
.end method

.method public static final synthetic access$getMutablePromoOffers$p(Ll84;)La94;
    .locals 0

    iget-object p0, p0, Ll84;->q:La94;

    return-object p0
.end method

.method public static final synthetic access$getMutableSkipPreload$p(Ll84;)La94;
    .locals 0

    iget-object p0, p0, Ll84;->p:La94;

    return-object p0
.end method

.method public static final synthetic access$getReactiveConfig$p(Ll84;)LTq4;
    .locals 0

    iget-object p0, p0, Ll84;->g:LTq4;

    return-object p0
.end method

.method public static final synthetic access$getShortDynamicLink(Ll84;Lco/bird/android/model/Link;)Lio/reactivex/F;
    .locals 0

    invoke-virtual {p0, p1}, Ll84;->u0(Lco/bird/android/model/Link;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$maybeUpdatePromos(Ll84;Ljava/util/List;)V
    .locals 0

    invoke-virtual {p0, p1}, Ll84;->k1(Ljava/util/List;)V

    return-void
.end method

.method public static final synthetic access$reset(Ll84;)V
    .locals 0

    invoke-virtual {p0}, Ll84;->s1()V

    return-void
.end method

.method public static final synthetic access$updateSkipPreload(Ll84;Ljava/util/List;)V
    .locals 0

    invoke-virtual {p0, p1}, Ll84;->v1(Ljava/util/List;)V

    return-void
.end method

.method public static final c0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final e0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final f0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final g1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final h1(Lio/reactivex/H;Ljava/lang/Exception;)V
    .locals 1

    const-string v0, "$emitter"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lio/reactivex/H;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final i1(Ll84;)Lio/reactivex/h;
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ll84;->f()Lio/reactivex/c;

    move-result-object p0

    const/4 v0, 0x1

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-static {p0, v2, v3, v0, v1}, Lag5;->completeAfterRetry$default(Lio/reactivex/c;JILjava/lang/Object;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static final j0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static final k0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Ll84;->o0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final m0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static final o0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static final q1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final r1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static final s0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final t0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final v0(Ll84;Lco/bird/android/model/Link;Lio/reactivex/H;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$link"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emitter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ll84;->h:LKm1;

    invoke-virtual {v0}, LKm1;->a()Lu81;

    move-result-object v0

    iget-object v1, p0, Ll84;->c:Lco/bird/android/model/DynamicLinkConfiguration;

    invoke-virtual {v1}, Lco/bird/android/model/DynamicLinkConfiguration;->getGiftDomain()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/links"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lu81;->c(Ljava/lang/String;)Lu81;

    iget-object v1, p0, Ll84;->c:Lco/bird/android/model/DynamicLinkConfiguration;

    invoke-virtual {v1}, Lco/bird/android/model/DynamicLinkConfiguration;->getGiftDomain()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/android/model/Link;->getCode()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/share?code="

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v0, p1}, Lu81;->e(Landroid/net/Uri;)Lu81;

    new-instance p1, Lt81$a;

    invoke-direct {p1}, Lt81$a;-><init>()V

    const/16 v1, 0x596

    invoke-virtual {p1, v1}, Lt81$a;->b(I)Lt81$a;

    invoke-virtual {p1}, Lt81$a;->a()Lt81;

    move-result-object p1

    invoke-virtual {v0, p1}, Lu81;->b(Lt81;)Lu81;

    new-instance p1, Lv81$a;

    iget-object v1, p0, Ll84;->c:Lco/bird/android/model/DynamicLinkConfiguration;

    invoke-virtual {v1}, Lco/bird/android/model/DynamicLinkConfiguration;->getBundleId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Lv81$a;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll84;->c:Lco/bird/android/model/DynamicLinkConfiguration;

    invoke-virtual {v1}, Lco/bird/android/model/DynamicLinkConfiguration;->getAppStoreId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lv81$a;->b(Ljava/lang/String;)Lv81$a;

    invoke-virtual {p1}, Lv81$a;->a()Lv81;

    move-result-object p1

    invoke-virtual {v0, p1}, Lu81;->d(Lv81;)Lu81;

    new-instance p1, Lw81$a;

    invoke-direct {p1}, Lw81$a;-><init>()V

    iget-object v1, p0, Ll84;->b:Landroid/content/Context;

    sget v2, Lnl4;->free_rides_share_title:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lw81$a;->d(Ljava/lang/String;)Lw81$a;

    iget-object v1, p0, Ll84;->b:Landroid/content/Context;

    sget v2, Lnl4;->free_rides_share_content:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lw81$a;->b(Ljava/lang/String;)Lw81$a;

    iget-object p0, p0, Ll84;->b:Landroid/content/Context;

    sget v1, Lsl4;->share_free_rides_image_url:I

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {p1, p0}, Lw81$a;->c(Landroid/net/Uri;)Lw81$a;

    invoke-virtual {p1}, Lw81$a;->a()Lw81;

    move-result-object p0

    invoke-virtual {v0, p0}, Lu81;->f(Lw81;)Lu81;

    const/4 p0, 0x2

    invoke-virtual {v0, p0}, Lu81;->a(I)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    new-instance p1, LY74;

    invoke-direct {p1, p2}, LY74;-><init>(Lio/reactivex/H;)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    new-instance p1, Ll84$l;

    invoke-direct {p1, p2}, Ll84$l;-><init>(Lio/reactivex/H;)V

    new-instance p2, LZ74;

    invoke-direct {p2, p1}, LZ74;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method


# virtual methods
.method public C()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireCoupon;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Ll84;->l:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ84;

    return-object v0
.end method

.method public c(Ljava/lang/String;)Lio/reactivex/c;
    .locals 1

    const-string v0, "couponId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ll84;->e:LAD0;

    invoke-interface {v0, p1}, LAD0;->c(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object p1

    const-string v0, "couponClient.activateCou\u2026d)\n      .ignoreElement()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public c()Lio/reactivex/i;
    .locals 1

    invoke-static {p0}, Lbr4$a;->e(Lbr4;)Lio/reactivex/i;

    move-result-object v0

    return-object v0
.end method

.method public d()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireCouponDisplayView;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Ll84;->j:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ84;

    return-object v0
.end method

.method public e(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireCoupon;",
            ">;)V"
        }
    .end annotation

    const-string v0, "coupons"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll84;->z()Lio/reactivex/c;

    move-result-object p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-static {p1, v2, v3, v0, v1}, Lag5;->completeAfterRetry$default(Lio/reactivex/c;JILjava/lang/Object;)Lio/reactivex/c;

    move-result-object p1

    new-instance v0, Lb84;

    invoke-direct {v0, p0}, Lb84;-><init>(Ll84;)V

    invoke-static {v0}, Lio/reactivex/c;->t(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->i(Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/c;->subscribe()Lio/reactivex/disposables/c;

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Ll84;->g0(Ljava/util/List;)V

    :goto_0
    return-void
.end method

.method public f()Lio/reactivex/c;
    .locals 2

    invoke-virtual {p0}, Ll84;->h0()Lio/reactivex/F;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object v0

    const-string v1, "fetchCoupon().ignoreElement()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ll84;->t1(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object v0

    const-string v1, "fetchCoupon().ignoreElement().schedulers()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public g(Ljava/lang/String;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/wire/WireCoupon;",
            ">;"
        }
    .end annotation

    const-string v0, "linkCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ll84;->e:LAD0;

    new-instance v1, Lco/bird/api/request/CreateCouponBody;

    invoke-direct {v1, p1}, Lco/bird/api/request/CreateCouponBody;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, LAD0;->f(Lco/bird/api/request/CreateCouponBody;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, Ll84$p;

    invoke-direct {v0, p0}, Ll84$p;-><init>(Ll84;)V

    new-instance v1, La84;

    invoke-direct {v1, v0}, La84;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "override fun redeemCoupo\u2026}\n      .schedulers()\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ll84;->u1(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public g0(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireCoupon;",
            ">;)V"
        }
    .end annotation

    const-string v0, "coupons"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lco/bird/android/model/wire/WireCoupon;

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireCoupon;->getOrigin()Lco/bird/android/model/constant/CouponOrigin;

    move-result-object v2

    sget-object v3, Lco/bird/android/model/constant/CouponOrigin;->LOW_BATTERY_RIDE:Lco/bird/android/model/constant/CouponOrigin;

    if-ne v2, v3, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iget-object p1, p0, Ll84;->r:La94;

    invoke-virtual {p1, v0}, La94;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public h()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireCoupon;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Ll84;->m:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ84;

    return-object v0
.end method

.method public final h0()Lio/reactivex/F;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireCoupon;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Ll84;->e:LAD0;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, LAD0$a;->getUnRedeemedCoupon$default(LAD0;ZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    sget-object v1, Ll84$f;->g:Ll84$f;

    new-instance v2, Lh84;

    invoke-direct {v2, v1}, Lh84;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Ll84$g;

    invoke-direct {v1, p0}, Ll84$g;-><init>(Ljava/lang/Object;)V

    new-instance v2, Li84;

    invoke-direct {v2, v1}, Li84;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Ll84$h;

    invoke-direct {v1, p0}, Ll84$h;-><init>(Ll84;)V

    new-instance v2, Lj84;

    invoke-direct {v2, v1}, Lj84;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v0

    iget-object v1, p0, Ll84;->n:La94;

    invoke-virtual {v0, v1}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object v0

    const-string v1, "private fun fetchCoupon(\u2026OnSuccess(mutableCoupons)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public i()Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireCoupon;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p0}, Ll84;->h0()Lio/reactivex/F;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll84;->u1(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object v0

    const-string v1, "fetchCoupon().schedulers()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final k1(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireCoupon;",
            ">;)V"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ll84$m;

    invoke-direct {v0}, Ll84$m;-><init>()V

    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lco/bird/android/model/wire/WireCoupon;

    invoke-static {v2}, Lco/bird/android/model/wire/WireCouponKt;->isPromotional(Lco/bird/android/model/wire/WireCoupon;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_2

    iget-object p1, p0, Ll84;->q:La94;

    invoke-virtual {p1, v0}, La94;->accept(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public m()Lio/reactivex/v;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lio/reactivex/v<",
            "TT;TT;>;"
        }
    .end annotation

    invoke-static {p0}, Lbr4$a;->g(Lbr4;)Lio/reactivex/v;

    move-result-object v0

    return-object v0
.end method

.method public final n0(Ljava/util/List;)Lio/reactivex/F;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireCoupon;",
            ">;)",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireCoupon;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Ll84;->f:LBQ2;

    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/WireCoupon;

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireCoupon;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v1, LLD0;

    invoke-direct {v1, v2}, LLD0;-><init>(Ljava/util/List;)V

    invoke-interface {v0, v1}, LBQ2;->c(LLD0;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Ll84$i;

    invoke-direct {v1, p1}, Ll84$i;-><init>(Ljava/util/List;)V

    new-instance p1, LW74;

    invoke-direct {p1, v1}, LW74;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "coupons: List<WireCoupon\u2026(it.id)\n      )\n    }\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public o()Lio/reactivex/C;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lio/reactivex/C<",
            "TT;TT;>;"
        }
    .end annotation

    invoke-static {p0}, Lbr4$a;->i(Lbr4;)Lio/reactivex/C;

    move-result-object v0

    return-object v0
.end method

.method public r()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ll84;->k:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ84;

    return-object v0
.end method

.method public s()Lio/reactivex/L;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lio/reactivex/L<",
            "TT;TT;>;"
        }
    .end annotation

    invoke-static {p0}, Lbr4$a;->k(Lbr4;)Lio/reactivex/L;

    move-result-object v0

    return-object v0
.end method

.method public final s1()V
    .locals 1

    iget-object v0, p0, Ll84;->n:La94;

    invoke-virtual {v0}, La94;->j()V

    iget-object v0, p0, Ll84;->p:La94;

    invoke-virtual {v0}, La94;->j()V

    iget-object v0, p0, Ll84;->q:La94;

    invoke-virtual {v0}, La94;->j()V

    iget-object v0, p0, Ll84;->r:La94;

    invoke-virtual {v0}, La94;->j()V

    iget-object v0, p0, Ll84;->o:La94;

    invoke-virtual {v0}, La94;->j()V

    iget-object v0, p0, Ll84;->s:La94;

    invoke-virtual {v0}, La94;->j()V

    return-void
.end method

.method public t1(Lio/reactivex/c;)Lio/reactivex/c;
    .locals 0

    invoke-static {p0, p1}, Lbr4$a;->m(Lbr4;Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public final u0(Lco/bird/android/model/Link;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Link;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lf84;

    invoke-direct {v0, p0, p1}, Lf84;-><init>(Ll84;Lco/bird/android/model/Link;)V

    invoke-static {v0}, Lio/reactivex/F;->j(Lio/reactivex/J;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "create { emitter ->\n    \u2026ink.toString())\n    }\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public u1(Lio/reactivex/F;)Lio/reactivex/F;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/F<",
            "TT;>;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Lbr4$a;->p(Lbr4;Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public v()Lio/reactivex/F;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Ll84;->x()Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Ll84$k;

    invoke-direct {v1, p0}, Ll84$k;-><init>(Ljava/lang/Object;)V

    new-instance v2, Lk84;

    invoke-direct {v2, v1}, Lk84;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v0

    const-string v1, "getFreeRideLink().flatMap(::getShortDynamicLink)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final v1(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireCoupon;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Ll84;->p:La94;

    check-cast p1, Ljava/lang/Iterable;

    instance-of v1, p1, Ljava/util/Collection;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WireCoupon;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireCoupon;->getCanSkipPreload()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireCoupon;->getRedeemedAt()Lorg/joda/time/DateTime;

    move-result-object v1

    if-nez v1, :cond_2

    move v1, v4

    goto :goto_0

    :cond_2
    move v1, v2

    :goto_0
    if-eqz v1, :cond_1

    move v2, v4

    :cond_3
    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, La94;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public w()V
    .locals 1

    iget-object v0, p0, Ll84;->r:La94;

    invoke-virtual {v0}, La94;->j()V

    return-void
.end method

.method public x()Lio/reactivex/F;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/Link;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ll84;->s:La94;

    invoke-virtual {v0}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/F;

    move-result-object v0

    const-string v1, "freeRideLink.firstOrError()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LYf5;->R(Lio/reactivex/F;)Lio/reactivex/p;

    move-result-object v0

    iget-object v1, p0, Ll84;->d:LTg6;

    invoke-interface {v1}, LTg6;->w()Lio/reactivex/F;

    move-result-object v1

    new-instance v2, Ll84$j;

    invoke-direct {v2, p0}, Ll84$j;-><init>(Ll84;)V

    new-instance v3, LX74;

    invoke-direct {v3, v2}, LX74;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v3}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/p;->W(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object v0

    const-string v1, "override fun getFreeRide\u2026(Optional.of(it)) }\n    )"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public y()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireCoupon;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Ll84;->i:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ84;

    return-object v0
.end method

.method public z()Lio/reactivex/c;
    .locals 3

    iget-object v0, p0, Ll84;->e:LAD0;

    invoke-interface {v0}, LAD0;->d()Lio/reactivex/F;

    move-result-object v0

    sget-object v1, Ll84$q;->g:Ll84$q;

    new-instance v2, Lg84;

    invoke-direct {v2, v1}, Lg84;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v0

    iget-object v1, p0, Ll84;->o:La94;

    invoke-virtual {v0, v1}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object v0

    const-string v1, "couponClient.getCouponDi\u2026s)\n      .ignoreElement()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
