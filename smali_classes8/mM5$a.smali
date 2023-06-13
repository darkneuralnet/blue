.class public LmM5$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LTj2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LmM5;->k(LyB0;LyB0;LS83;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LyB0;

.field public final synthetic b:LyB0;

.field public final synthetic c:LS83;

.field public final synthetic d:I

.field public final synthetic e:LmM5;


# direct methods
.method public constructor <init>(LmM5;LyB0;LyB0;LS83;I)V
    .locals 0

    iput-object p1, p0, LmM5$a;->e:LmM5;

    iput-object p2, p0, LmM5$a;->a:LyB0;

    iput-object p3, p0, LmM5$a;->b:LyB0;

    iput-object p4, p0, LmM5$a;->c:LS83;

    iput p5, p0, LmM5$a;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LSj2;)V
    .locals 3

    invoke-virtual {p1}, LSj2;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LhN1;

    invoke-virtual {p1}, LhN1;->e()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LmM5$a;->a:LyB0;

    invoke-virtual {p1, v0}, LhN1;->b(LyB0;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LmM5$a;->b:LyB0;

    invoke-virtual {p1, v0}, LhN1;->b(LyB0;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, LmM5$a;->a:LyB0;

    iget-object v1, p0, LmM5$a;->b:LyB0;

    invoke-virtual {p1, v0, v1}, LhN1;->c(LyB0;LyB0;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LmM5$a;->c:LS83;

    invoke-virtual {p1}, LhN1;->a()LyB0;

    move-result-object v1

    iget v2, p0, LmM5$a;->d:I

    invoke-virtual {v0, v1, v2}, LS83;->a(LyB0;I)V

    invoke-virtual {p1}, LhN1;->h()V

    :cond_2
    return-void
.end method
