.class public final LwS1$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LwS1;->b(Lco/bird/android/model/wire/WireBird;[Lco/bird/android/model/constant/PartKind;Ljava/lang/String;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Throwable;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "",
        "kotlin.jvm.PlatformType",
        "invoke"
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
.field public final synthetic g:Lco/bird/android/model/wire/WireBird;

.field public final synthetic h:[Lco/bird/android/model/constant/PartKind;

.field public final synthetic i:LwS1;

.field public final synthetic j:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WireBird;[Lco/bird/android/model/constant/PartKind;LwS1;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LwS1$h;->g:Lco/bird/android/model/wire/WireBird;

    iput-object p2, p0, LwS1$h;->h:[Lco/bird/android/model/constant/PartKind;

    iput-object p3, p0, LwS1$h;->i:LwS1;

    iput-object p4, p0, LwS1$h;->j:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LwS1$h;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 6

    iget-object p1, p0, LwS1$h;->g:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v1

    iget-object p1, p0, LwS1$h;->h:[Lco/bird/android/model/constant/PartKind;

    invoke-static {p1}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    sget-object v4, LzQ1;->b:LzQ1;

    iget-object v0, p0, LwS1$h;->i:LwS1;

    const/4 v2, 0x0

    iget-object v5, p0, LwS1$h;->j:Ljava/lang/String;

    invoke-static/range {v0 .. v5}, LwS1;->access$trackIdToolsActionCompleted(LwS1;Ljava/lang/String;ZLjava/util/List;LzQ1;Ljava/lang/String;)V

    return-void
.end method
