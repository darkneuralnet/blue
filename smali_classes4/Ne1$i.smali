.class public final LNe1$i;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNe1;->D(Lco/bird/android/model/constant/PartKind;Ljava/lang/String;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/Sticker;",
        "Lco/bird/android/model/wire/WirePart;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/Sticker;",
        "sticker",
        "Lco/bird/android/model/wire/WirePart;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/Sticker;)Lco/bird/android/model/wire/WirePart;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/constant/PartKind;


# direct methods
.method public constructor <init>(Lco/bird/android/model/constant/PartKind;)V
    .locals 0

    iput-object p1, p0, LNe1$i;->g:Lco/bird/android/model/constant/PartKind;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/Sticker;)Lco/bird/android/model/wire/WirePart;
    .locals 3

    const-string v0, "sticker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/WirePart;

    invoke-virtual {p1}, Lco/bird/android/model/Sticker;->getId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, LNe1$i;->g:Lco/bird/android/model/constant/PartKind;

    invoke-virtual {p1}, Lco/bird/android/model/Sticker;->getCode()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lco/bird/android/model/wire/WirePart;-><init>(Ljava/lang/String;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/Sticker;

    invoke-virtual {p0, p1}, LNe1$i;->a(Lco/bird/android/model/Sticker;)Lco/bird/android/model/wire/WirePart;

    move-result-object p1

    return-object p1
.end method
