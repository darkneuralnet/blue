.class public final LwX0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lya1;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000e\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0002R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0008\u00a8\u0006\u000c"
    }
    d2 = {
        "LwX0;",
        "Lya1;",
        "LsP5;",
        "",
        "c",
        "a",
        "LsP5;",
        "loadState",
        "()LsP5;",
        "fontLoaded",
        "<init>",
        "()V",
        "ui-text_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public a:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/emoji2/text/c;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LwX0;->c()LsP5;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, LwX0;->a:LsP5;

    return-void
.end method

.method public static final synthetic b(LwX0;LsP5;)V
    .locals 0

    iput-object p1, p0, LwX0;->a:LsP5;

    return-void
.end method


# virtual methods
.method public a()LsP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LsP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LwX0;->a:LsP5;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Landroidx/emoji2/text/c;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LwX0;->c()LsP5;

    move-result-object v0

    iput-object v0, p0, LwX0;->a:LsP5;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-static {}, Lza1;->a()LOY1;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final c()LsP5;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LsP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    invoke-static {}, Landroidx/emoji2/text/c;->c()Landroidx/emoji2/text/c;

    move-result-object v0

    const-string v1, "get()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/emoji2/text/c;->g()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    new-instance v0, LOY1;

    invoke-direct {v0, v2}, LOY1;-><init>(Z)V

    goto :goto_0

    :cond_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v1, v3, v2, v3}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v1

    new-instance v2, LwX0$a;

    invoke-direct {v2, v1, p0}, LwX0$a;-><init>(LEX2;LwX0;)V

    invoke-virtual {v0, v2}, Landroidx/emoji2/text/c;->v(Landroidx/emoji2/text/c$f;)V

    move-object v0, v1

    :goto_0
    return-object v0
.end method
