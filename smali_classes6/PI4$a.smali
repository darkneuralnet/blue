.class public final LPI4$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LPI4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:LiT3$e;

.field public final b:Landroid/graphics/Bitmap;

.field public final c:LAN5;

.field public final d:I


# direct methods
.method public constructor <init>(LAN5;LiT3$e;)V
    .locals 2

    const-string v0, "source == null"

    invoke-static {p1, v0}, LFi6;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LAN5;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v1, p1, p2, v0}, LPI4$a;-><init>(Landroid/graphics/Bitmap;LAN5;LiT3$e;I)V

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Bitmap;LAN5;LiT3$e;I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    if-eq v2, v0, :cond_2

    iput-object p1, p0, LPI4$a;->b:Landroid/graphics/Bitmap;

    iput-object p2, p0, LPI4$a;->c:LAN5;

    const-string p1, "loadedFrom == null"

    invoke-static {p3, p1}, LFi6;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LiT3$e;

    iput-object p1, p0, LPI4$a;->a:LiT3$e;

    iput p4, p0, LPI4$a;->d:I

    return-void

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public constructor <init>(Landroid/graphics/Bitmap;LiT3$e;)V
    .locals 2

    const-string v0, "bitmap == null"

    invoke-static {p1, v0}, LFi6;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, p2, v1}, LPI4$a;-><init>(Landroid/graphics/Bitmap;LAN5;LiT3$e;I)V

    return-void
.end method


# virtual methods
.method public a()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, LPI4$a;->b:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, LPI4$a;->d:I

    return v0
.end method

.method public c()LiT3$e;
    .locals 1

    iget-object v0, p0, LPI4$a;->a:LiT3$e;

    return-object v0
.end method

.method public d()LAN5;
    .locals 1

    iget-object v0, p0, LPI4$a;->c:LAN5;

    return-object v0
.end method
