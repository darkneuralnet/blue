.class public final LBB$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBB;->m(Ljava/lang/String;Lio/reactivex/F;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LAA3;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LAA3;",
        "kotlin.jvm.PlatformType",
        "overrideMedia",
        "",
        "a",
        "(LAA3;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LBB;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(LBB;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LBB$d;->g:LBB;

    iput-object p2, p0, LBB$d;->h:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LAA3;)V
    .locals 3

    iget-object v0, p0, LBB$d;->g:LBB;

    invoke-static {v0}, LBB;->access$getCachedOverrideMedia$p(LBB;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    iget-object v1, p0, LBB$d;->h:Ljava/lang/String;

    const-string v2, "overrideMedia"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LBB$d;->g:LBB;

    iget-object v1, p0, LBB$d;->h:Ljava/lang/String;

    invoke-virtual {p1}, LAA3;->c()Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

    move-result-object p1

    invoke-static {v0, v1, p1}, LBB;->access$loadBitmap(LBB;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/AssetMedia;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LAA3;

    invoke-virtual {p0, p1}, LBB$d;->a(LAA3;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method