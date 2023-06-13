.class public final synthetic Lhp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lip;

.field public final synthetic c:I

.field public final synthetic d:LZD3;

.field public final synthetic e:LZD3;

.field public final synthetic f:Lmd3;

.field public final synthetic g:LLs4;

.field public final synthetic h:LZD3;

.field public final synthetic i:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lip;ILZD3;LZD3;Lmd3;LLs4;LZD3;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhp;->b:Lip;

    iput p2, p0, Lhp;->c:I

    iput-object p3, p0, Lhp;->d:LZD3;

    iput-object p4, p0, Lhp;->e:LZD3;

    iput-object p5, p0, Lhp;->f:Lmd3;

    iput-object p6, p0, Lhp;->g:LLs4;

    iput-object p7, p0, Lhp;->h:LZD3;

    iput-object p8, p0, Lhp;->i:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget-object v0, p0, Lhp;->b:Lip;

    iget v1, p0, Lhp;->c:I

    iget-object v2, p0, Lhp;->d:LZD3;

    iget-object v3, p0, Lhp;->e:LZD3;

    iget-object v4, p0, Lhp;->f:Lmd3;

    iget-object v5, p0, Lhp;->g:LLs4;

    iget-object v6, p0, Lhp;->h:LZD3;

    iget-object v7, p0, Lhp;->i:Ljava/lang/Runnable;

    invoke-static/range {v0 .. v7}, Lip;->a(Lip;ILZD3;LZD3;Lmd3;LLs4;LZD3;Ljava/lang/Runnable;)V

    return-void
.end method
