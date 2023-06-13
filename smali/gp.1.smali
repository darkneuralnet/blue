.class public final synthetic Lgp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LZD3;

.field public final synthetic c:LZD3;

.field public final synthetic d:Lip;

.field public final synthetic e:I

.field public final synthetic f:LZD3;

.field public final synthetic g:LLs4;

.field public final synthetic h:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(LZD3;LZD3;Lip;ILZD3;LLs4;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgp;->b:LZD3;

    iput-object p2, p0, Lgp;->c:LZD3;

    iput-object p3, p0, Lgp;->d:Lip;

    iput p4, p0, Lgp;->e:I

    iput-object p5, p0, Lgp;->f:LZD3;

    iput-object p6, p0, Lgp;->g:LLs4;

    iput-object p7, p0, Lgp;->h:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lgp;->b:LZD3;

    iget-object v1, p0, Lgp;->c:LZD3;

    iget-object v2, p0, Lgp;->d:Lip;

    iget v3, p0, Lgp;->e:I

    iget-object v4, p0, Lgp;->f:LZD3;

    iget-object v5, p0, Lgp;->g:LLs4;

    iget-object v6, p0, Lgp;->h:Ljava/lang/Runnable;

    invoke-static/range {v0 .. v6}, Lip;->b(LZD3;LZD3;Lip;ILZD3;LLs4;Ljava/lang/Runnable;)V

    return-void
.end method
