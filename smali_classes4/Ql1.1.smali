.class public final LQl1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LPl1;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bR \u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0004\u0010\u0006\u00a8\u0006\u000c"
    }
    d2 = {
        "LQl1;",
        "LPl1;",
        "La94;",
        "Lco/bird/android/model/filter/NestTypeFilter;",
        "a",
        "La94;",
        "()La94;",
        "nestTypeFilter",
        "Lgl;",
        "preference",
        "<init>",
        "(Lgl;)V",
        "contractor_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Lco/bird/android/model/filter/NestTypeFilter;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lgl;)V
    .locals 5

    const-string v0, "preference"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, La94;->h:La94$a;

    new-instance v1, Lco/bird/android/model/filter/NestTypeFilter;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Lco/bird/android/model/filter/NestTypeFilter;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x2

    invoke-static {v0, v1, v4, v2, v4}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object v0

    iput-object v0, p0, LQl1;->a:La94;

    invoke-virtual {p0}, LQl1;->a()La94;

    move-result-object v0

    invoke-virtual {p1}, Lgl;->j0()Lco/bird/android/model/filter/NestTypeFilter;

    move-result-object p1

    invoke-virtual {v0, p1}, La94;->accept(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a()La94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La94<",
            "Lco/bird/android/model/filter/NestTypeFilter;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LQl1;->a:La94;

    return-object v0
.end method
