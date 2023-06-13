.class public LmM5$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LTj2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LmM5;->l(LyB0;LS83;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LyB0;

.field public final synthetic b:LS83;

.field public final synthetic c:I

.field public final synthetic d:LmM5;


# direct methods
.method public constructor <init>(LmM5;LyB0;LS83;I)V
    .locals 0

    iput-object p1, p0, LmM5$b;->d:LmM5;

    iput-object p2, p0, LmM5$b;->a:LyB0;

    iput-object p3, p0, LmM5$b;->b:LS83;

    iput p4, p0, LmM5$b;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LSj2;)V
    .locals 2

    invoke-virtual {p1}, LSj2;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LhN1;

    invoke-virtual {p1}, LhN1;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LhN1;->a()LyB0;

    move-result-object p1

    iget-object v0, p0, LmM5$b;->a:LyB0;

    invoke-virtual {p1, v0}, LyB0;->g(LyB0;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LmM5$b;->b:LS83;

    iget-object v0, p0, LmM5$b;->a:LyB0;

    iget v1, p0, LmM5$b;->c:I

    invoke-virtual {p1, v0, v1}, LS83;->a(LyB0;I)V

    :cond_0
    return-void
.end method
