.class public final LUG6$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LUG6;->c(LaD6;Ljava/lang/String;LEG6;)LXh3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LEG6;

.field public final synthetic h:LaD6;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Lai3;


# direct methods
.method public constructor <init>(LEG6;LaD6;Ljava/lang/String;Lai3;)V
    .locals 0

    iput-object p1, p0, LUG6$a;->g:LEG6;

    iput-object p2, p0, LUG6$a;->h:LaD6;

    iput-object p3, p0, LUG6$a;->i:Ljava/lang/String;

    iput-object p4, p0, LUG6$a;->j:Lai3;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LUG6$a;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 5

    iget-object v0, p0, LUG6$a;->g:LEG6;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v1, LJC6;

    iget-object v2, p0, LUG6$a;->h:LaD6;

    iget-object v3, p0, LUG6$a;->i:Ljava/lang/String;

    sget-object v4, Lfi1;->c:Lfi1;

    invoke-direct {v1, v2, v3, v4, v0}, LJC6;-><init>(LaD6;Ljava/lang/String;Lfi1;Ljava/util/List;)V

    new-instance v0, LNd1;

    iget-object v2, p0, LUG6$a;->j:Lai3;

    invoke-direct {v0, v1, v2}, LNd1;-><init>(LJC6;Lai3;)V

    invoke-virtual {v0}, LNd1;->run()V

    return-void
.end method
