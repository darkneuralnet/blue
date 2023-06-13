.class public final LJz6$a$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJz6$a;->e(Ljava/lang/String;)Lio/reactivex/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/LocalAsset;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/LocalAsset;",
        "kotlin.jvm.PlatformType",
        "asset",
        "",
        "b",
        "(Lco/bird/android/model/LocalAsset;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LJz6;


# direct methods
.method public constructor <init>(LJz6;)V
    .locals 0

    iput-object p1, p0, LJz6$a$c;->g:LJz6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lvz6;Lvz6;)I
    .locals 0

    invoke-static {p0, p1}, LJz6$a$c;->c(Lvz6;Lvz6;)I

    move-result p0

    return p0
.end method

.method public static final c(Lvz6;Lvz6;)I
    .locals 0

    invoke-virtual {p0}, Lvz6;->e()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Lvz6;->e()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final b(Lco/bird/android/model/LocalAsset;)V
    .locals 3

    iget-object v0, p0, LJz6$a$c;->g:LJz6;

    invoke-static {v0}, LJz6;->access$getMutableWebArchives$p(LJz6;)La94;

    move-result-object v0

    iget-object v1, p0, LJz6$a$c;->g:LJz6;

    const-string v2, "asset"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p1}, LJz6;->j(Lco/bird/android/model/LocalAsset;)Lvz6;

    move-result-object p1

    new-instance v1, LLz6;

    invoke-direct {v1}, LLz6;-><init>()V

    invoke-static {v0, p1, v1}, Lb94;->b(La94;Ljava/lang/Object;Ljava/util/Comparator;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/LocalAsset;

    invoke-virtual {p0, p1}, LJz6$a$c;->b(Lco/bird/android/model/LocalAsset;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
