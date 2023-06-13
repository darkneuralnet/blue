.class public final LKj5$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKj5;->C(Lco/bird/android/model/constant/PartKind;Ljava/lang/String;)Lio/reactivex/F;
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
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/android/model/wire/WirePart;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0007\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "e",
        "Lio/reactivex/K;",
        "Lco/bird/android/model/wire/WirePart;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/Throwable;)Lio/reactivex/K;",
        "<anonymous>"
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

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:LKj5;

.field public final synthetic j:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lco/bird/android/model/constant/PartKind;Ljava/lang/String;LKj5;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LKj5$d;->g:Lco/bird/android/model/constant/PartKind;

    iput-object p2, p0, LKj5$d;->h:Ljava/lang/String;

    iput-object p3, p0, LKj5$d;->i:LKj5;

    iput-object p4, p0, LKj5$d;->j:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Throwable;)Lio/reactivex/K;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/model/wire/WirePart;",
            ">;"
        }
    .end annotation

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LKj5$d;->g:Lco/bird/android/model/constant/PartKind;

    sget-object v1, Lco/bird/android/model/constant/PartKind;->STICKER:Lco/bird/android/model/constant/PartKind;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, LKj5$d;->h:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object v0, p0, LKj5$d;->i:LKj5;

    invoke-static {v0, p1}, LKj5;->access$getCode(LKj5;Ljava/lang/Throwable;)I

    move-result v0

    const/16 v1, 0x190

    const/4 v2, 0x0

    if-gt v1, v0, :cond_0

    const/16 v1, 0x1f4

    if-ge v0, v1, :cond_0

    const/4 v2, 0x1

    :cond_0
    if-eqz v2, :cond_1

    new-instance p1, Lco/bird/android/model/wire/WirePart;

    const/4 v4, 0x0

    iget-object v5, p0, LKj5$d;->g:Lco/bird/android/model/constant/PartKind;

    iget-object v6, p0, LKj5$d;->j:Ljava/lang/String;

    const/4 v7, 0x1

    const/4 v8, 0x0

    move-object v3, p1

    invoke-direct/range {v3 .. v8}, Lco/bird/android/model/wire/WirePart;-><init>(Ljava/lang/String;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lio/reactivex/F;->x(Ljava/lang/Throwable;)Lio/reactivex/F;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LKj5$d;->invoke(Ljava/lang/Throwable;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
