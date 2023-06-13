.class public Lxi1$c;
.super Ls2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxi1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final synthetic b:Lxi1;


# direct methods
.method public constructor <init>(Lxi1;)V
    .locals 0

    iput-object p1, p0, Lxi1$c;->b:Lxi1;

    invoke-direct {p0}, Ls2;-><init>()V

    return-void
.end method


# virtual methods
.method public b(I)Lp2;
    .locals 1

    iget-object v0, p0, Lxi1$c;->b:Lxi1;

    invoke-virtual {v0, p1}, Lxi1;->w(I)Lp2;

    move-result-object p1

    invoke-static {p1}, Lp2;->S(Lp2;)Lp2;

    move-result-object p1

    return-object p1
.end method

.method public d(I)Lp2;
    .locals 1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lxi1$c;->b:Lxi1;

    iget p1, p1, Lxi1;->h:I

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lxi1$c;->b:Lxi1;

    iget p1, p1, Lxi1;->i:I

    :goto_0
    const/high16 v0, -0x80000000

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    invoke-virtual {p0, p1}, Lxi1$c;->b(I)Lp2;

    move-result-object p1

    return-object p1
.end method

.method public f(IILandroid/os/Bundle;)Z
    .locals 1

    iget-object v0, p0, Lxi1$c;->b:Lxi1;

    invoke-virtual {v0, p1, p2, p3}, Lxi1;->E(IILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method
