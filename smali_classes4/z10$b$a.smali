.class public final Lz10$b$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz10$b;->b(LHM4;)Lio/reactivex/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LHM4<",
        "Lco/bird/api/request/SetDefaultProviderBody;",
        ">;",
        "Lkotlin/Pair<",
        "+",
        "LHM4<",
        "Lco/bird/api/request/SetDefaultProviderBody;",
        ">;+",
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0010\u0006\u001a.\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "LHM4;",
        "Lco/bird/api/request/SetDefaultProviderBody;",
        "response",
        "Lkotlin/Pair;",
        "",
        "kotlin.jvm.PlatformType",
        "a",
        "(LHM4;)Lkotlin/Pair;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/api/request/BirdCustomer;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lco/bird/api/request/BirdCustomer;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lz10$b$a;->g:Lco/bird/api/request/BirdCustomer;

    iput-object p2, p0, Lz10$b$a;->h:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LHM4;)Lkotlin/Pair;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Lco/bird/api/request/SetDefaultProviderBody;",
            ">;)",
            "Lkotlin/Pair<",
            "LHM4<",
            "Lco/bird/api/request/SetDefaultProviderBody;",
            ">;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/Pair;

    iget-object v1, p0, Lz10$b$a;->g:Lco/bird/api/request/BirdCustomer;

    invoke-virtual {v1}, Lco/bird/api/request/BirdCustomer;->getEmail()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lz10$b$a;->h:Ljava/lang/String;

    :cond_0
    invoke-direct {v0, p1, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, Lz10$b$a;->a(LHM4;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
