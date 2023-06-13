.class public final LxN2$g$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LxN2$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "TS;TS;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00028\u0001\"\u0004\u0008\u0000\u0010\u0000\"\u0008\u0008\u0001\u0010\u0002*\u00020\u0001*\u00028\u0001H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "T",
        "LAN2;",
        "S",
        "a",
        "(LAN2;)LAN2;"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic g:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "TS;",
            "Ldp<",
            "+TT;>;TS;>;"
        }
    .end annotation
.end field

.field public final synthetic h:Ljava/lang/Throwable;

.field public final synthetic i:Lkotlin/reflect/KProperty1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/reflect/KProperty1<",
            "TS;",
            "Ldp<",
            "TT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function2;Ljava/lang/Throwable;Lkotlin/reflect/KProperty1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-TS;-",
            "Ldp<",
            "+TT;>;+TS;>;",
            "Ljava/lang/Throwable;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+",
            "Ldp<",
            "+TT;>;>;)V"
        }
    .end annotation

    iput-object p1, p0, LxN2$g$b;->g:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, LxN2$g$b;->h:Ljava/lang/Throwable;

    iput-object p3, p0, LxN2$g$b;->i:Lkotlin/reflect/KProperty1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LAN2;)LAN2;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TS;)TS;"
        }
    .end annotation

    const-string v0, "$this$setState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LxN2$g$b;->g:Lkotlin/jvm/functions/Function2;

    new-instance v1, LCj1;

    iget-object v2, p0, LxN2$g$b;->h:Ljava/lang/Throwable;

    iget-object v3, p0, LxN2$g$b;->i:Lkotlin/reflect/KProperty1;

    if-eqz v3, :cond_0

    invoke-interface {v3, p1}, Lkotlin/reflect/KProperty1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ldp;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ldp;->a()Ljava/lang/Object;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-direct {v1, v2, v3}, LCj1;-><init>(Ljava/lang/Throwable;Ljava/lang/Object;)V

    invoke-interface {v0, p1, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LAN2;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LAN2;

    invoke-virtual {p0, p1}, LxN2$g$b;->a(LAN2;)LAN2;

    move-result-object p1

    return-object p1
.end method
