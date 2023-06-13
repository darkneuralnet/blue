.class public final LJz6$a$b;
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
.field public final synthetic g:LJz6;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(LJz6;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LJz6$a$b;->g:LJz6;

    iput-object p2, p0, LJz6$a$b;->h:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lvz6;Lvz6;)I
    .locals 0

    invoke-static {p0, p1}, LJz6$a$b;->b(Lvz6;Lvz6;)I

    move-result p0

    return p0
.end method

.method public static final b(Lvz6;Lvz6;)I
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
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LJz6$a$b;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 3

    invoke-static {p1}, Lg46;->e(Ljava/lang/Throwable;)V

    iget-object p1, p0, LJz6$a$b;->g:LJz6;

    invoke-static {p1}, LJz6;->access$getMutableWebArchives$p(LJz6;)La94;

    move-result-object p1

    iget-object v0, p0, LJz6$a$b;->g:LJz6;

    iget-object v1, p0, LJz6$a$b;->h:Ljava/lang/String;

    const-string v2, "name"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, LNz6;->d:LNz6;

    invoke-virtual {v0, v1, v2}, LJz6;->k(Ljava/lang/String;LNz6;)Lvz6;

    move-result-object v0

    new-instance v1, LKz6;

    invoke-direct {v1}, LKz6;-><init>()V

    invoke-static {p1, v0, v1}, Lb94;->b(La94;Ljava/lang/Object;Ljava/util/Comparator;)V

    return-void
.end method
