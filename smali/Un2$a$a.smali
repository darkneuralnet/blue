.class public final LUn2$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LUn2$a;->a(LEi5;LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LaT5;",
        "Lkz0;",
        "LyO2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LQn2;

.field public final synthetic h:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "LVn2;",
            "Lkz0;",
            "LyO2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LQn2;Lkotlin/jvm/functions/Function2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LQn2;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LVn2;",
            "-",
            "Lkz0;",
            "+",
            "LyO2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LUn2$a$a;->g:LQn2;

    iput-object p2, p0, LUn2$a$a;->h:Lkotlin/jvm/functions/Function2;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LaT5;J)LyO2;
    .locals 2

    const-string v0, "$this$null"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LWn2;

    iget-object v1, p0, LUn2$a$a;->g:LQn2;

    invoke-direct {v0, v1, p1}, LWn2;-><init>(LQn2;LaT5;)V

    iget-object p1, p0, LUn2$a$a;->h:Lkotlin/jvm/functions/Function2;

    invoke-static {p2, p3}, Lkz0;->b(J)Lkz0;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LyO2;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LaT5;

    check-cast p2, Lkz0;

    invoke-virtual {p2}, Lkz0;->s()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, LUn2$a$a;->a(LaT5;J)LyO2;

    move-result-object p1

    return-object p1
.end method
