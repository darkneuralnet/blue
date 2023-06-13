.class final Lco/bird/android/model/wire/WireBird$isProbablySame$imeiMatches$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/model/wire/WireBird;->isProbablySame(Lco/bird/android/model/wire/WireBird;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke",
        "()Ljava/lang/Boolean;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $other:Lco/bird/android/model/wire/WireBird;

.field final synthetic this$0:Lco/bird/android/model/wire/WireBird;


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/wire/WireBird;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/model/wire/WireBird$isProbablySame$imeiMatches$2;->this$0:Lco/bird/android/model/wire/WireBird;

    iput-object p2, p0, Lco/bird/android/model/wire/WireBird$isProbablySame$imeiMatches$2;->$other:Lco/bird/android/model/wire/WireBird;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Boolean;
    .locals 4

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird$isProbablySame$imeiMatches$2;->this$0:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->getImei()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-ne v0, v1, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    if-eqz v0, :cond_4

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird$isProbablySame$imeiMatches$2;->$other:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->getImei()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_2

    move v0, v1

    goto :goto_2

    :cond_2
    move v0, v2

    :goto_2
    if-ne v0, v1, :cond_3

    move v0, v1

    goto :goto_3

    :cond_3
    move v0, v2

    :goto_3
    if-eqz v0, :cond_4

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird$isProbablySame$imeiMatches$2;->this$0:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->getImei()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lco/bird/android/model/wire/WireBird$isProbablySame$imeiMatches$2;->$other:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireBird;->getImei()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_4

    :cond_4
    move v1, v2

    :goto_4
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird$isProbablySame$imeiMatches$2;->invoke()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
