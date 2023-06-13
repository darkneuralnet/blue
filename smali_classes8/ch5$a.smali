.class public final Lch5$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lch5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    check-cast p1, Ls00;

    invoke-interface {p1}, Ls00;->getBounds()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lsf1;

    invoke-static {p1}, Lch5;->p(Lsf1;)D

    move-result-wide v0

    check-cast p2, Ls00;

    invoke-interface {p2}, Ls00;->getBounds()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lsf1;

    invoke-static {p1}, Lch5;->p(Lsf1;)D

    move-result-wide p1

    invoke-static {v0, v1, p1, p2}, Lj1;->d(DD)I

    move-result p1

    return p1
.end method
