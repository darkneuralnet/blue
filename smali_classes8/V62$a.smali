.class public LV62$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LV62;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 6

    check-cast p1, LV62;

    check-cast p2, LV62;

    iget-wide v0, p1, LV62;->a:D

    iget-wide v2, p1, LV62;->b:D

    add-double/2addr v0, v2

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    div-double/2addr v0, v2

    iget-wide v4, p2, LV62;->a:D

    iget-wide p1, p2, LV62;->b:D

    add-double/2addr v4, p1

    div-double/2addr v4, v2

    cmpg-double p1, v0, v4

    if-gez p1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    cmpl-double p1, v0, v4

    if-lez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
