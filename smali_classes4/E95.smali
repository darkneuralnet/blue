.class public final LE95;
.super LBB;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE95$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 #2\u00020\u0001:\u0001$B9\u0008\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0018\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0014J\u0018\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0014R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\'\u00b2\u0006\u000e\u0010&\u001a\u0004\u0018\u00010%8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "LE95;",
        "LBB;",
        "Lco/bird/android/model/wire/WireBird;",
        "bird",
        "LmM2;",
        "r",
        "Lio/reactivex/F;",
        "LAA3;",
        "t",
        "Lco/bird/android/model/persistence/BirdMapMarker;",
        "birdMarker",
        "q",
        "s",
        "Landroid/content/Context;",
        "j",
        "Landroid/content/Context;",
        "context",
        "LGI3;",
        "k",
        "LGI3;",
        "partnerManager",
        "LTq4;",
        "l",
        "LTq4;",
        "reactiveConfig",
        "LEa;",
        "m",
        "LEa;",
        "analyticsManager",
        "LsP2;",
        "mediaManager",
        "LB95;",
        "bitmapCache",
        "<init>",
        "(LsP2;LB95;Landroid/content/Context;LGI3;LTq4;LEa;)V",
        "n",
        "a",
        "Lco/bird/android/model/wire/WireAssetMedia;",
        "fallbackPartnerAssetMedia",
        "media_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final n:LE95$a;

.field public static final o:LmM2;


# instance fields
.field public final j:Landroid/content/Context;

.field public final k:LGI3;

.field public final l:LTq4;

.field public final m:LEa;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LE95$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LE95$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LE95;->n:LE95$a;

    new-instance v0, LmM2;

    const-string v1, ""

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LmM2;-><init>(Ljava/lang/String;Z)V

    sput-object v0, LE95;->o:LmM2;

    return-void
.end method

.method public constructor <init>(LsP2;LB95;Landroid/content/Context;LGI3;LTq4;LEa;)V
    .locals 1

    const-string v0, "mediaManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bitmapCache"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "partnerManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsManager"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p6}, LBB;-><init>(LsP2;Lwn4;LEa;)V

    iput-object p3, p0, LE95;->j:Landroid/content/Context;

    iput-object p4, p0, LE95;->k:LGI3;

    iput-object p5, p0, LE95;->l:LTq4;

    iput-object p6, p0, LE95;->m:LEa;

    return-void
.end method

.method public static final synthetic access$getAnalyticsManager$p(LE95;)LEa;
    .locals 0

    iget-object p0, p0, LE95;->m:LEa;

    return-object p0
.end method

.method public static final synthetic access$getContext$p(LE95;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, LE95;->j:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic access$getPartnerManager$p(LE95;)LGI3;
    .locals 0

    iget-object p0, p0, LE95;->k:LGI3;

    return-object p0
.end method

.method public static synthetic u(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LAA3;
    .locals 0

    invoke-static {p0, p1}, LE95;->v(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LAA3;

    move-result-object p0

    return-object p0
.end method

.method public static final v(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LAA3;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LAA3;

    return-object p0
.end method


# virtual methods
.method public q(Lco/bird/android/model/persistence/BirdMapMarker;)LmM2;
    .locals 1

    const-string v0, "birdMarker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, LE95;->o:LmM2;

    return-object p1
.end method

.method public r(Lco/bird/android/model/wire/WireBird;)LmM2;
    .locals 2

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getPrivateBird()Lco/bird/android/model/wire/WirePrivateBird;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string p1, "privateOverrideId"

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getPartnerId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getPartnerId()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    goto :goto_0

    :cond_1
    const-string p1, "birdOverrideId"

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    new-instance v1, LmM2;

    invoke-direct {v1, v0, p1}, LmM2;-><init>(Ljava/lang/String;Z)V

    return-object v1
.end method

.method public s(Lco/bird/android/model/persistence/BirdMapMarker;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            ")",
            "Lio/reactivex/F<",
            "LAA3;",
            ">;"
        }
    .end annotation

    const-string v0, "birdMarker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public t(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/F;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireBird;",
            ")",
            "Lio/reactivex/F<",
            "LAA3;",
            ">;"
        }
    .end annotation

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getPrivateBird()Lco/bird/android/model/wire/WirePrivateBird;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getPartnerId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LE95;->k:LGI3;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getPartnerId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, LGI3;->u(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LE95$b;

    invoke-direct {v1, p0, p1}, LE95$b;-><init>(LE95;Lco/bird/android/model/wire/WireBird;)V

    new-instance p1, LD95;

    invoke-direct {p1, v1}, LD95;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v1

    goto :goto_0

    :cond_1
    iget-object p1, p0, LE95;->l:LTq4;

    invoke-virtual {p1}, LTq4;->f8()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getBirdIconOverride()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    new-instance v0, Lco/bird/android/model/wire/WireAssetMedia;

    invoke-direct {v0, p1}, Lco/bird/android/model/wire/WireAssetMedia;-><init>(Ljava/lang/String;)V

    new-instance p1, LAA3;

    new-instance v1, Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireAssetMedia;->getMediaId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireAssetMedia;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireAssetMedia;->getMediaUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireAssetMedia;->getMediaType()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v3, v4, v0}, Lco/bird/android/model/persistence/nestedstructures/AssetMedia;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Bird"

    invoke-direct {p1, v1, v0}, LAA3;-><init>(Lco/bird/android/model/persistence/nestedstructures/AssetMedia;Ljava/lang/String;)V

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object v1

    :cond_2
    :goto_0
    return-object v1
.end method
