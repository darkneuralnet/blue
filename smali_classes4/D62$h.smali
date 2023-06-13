.class public final enum LD62$h;
.super LD62;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD62;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4011
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, LD62;-><init>(Ljava/lang/String;ILL62;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILK62;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LD62$h;-><init>(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public b()Landroid/view/animation/Interpolator;
    .locals 1

    sget-object v0, LZX3;->h:Landroid/view/animation/Interpolator;

    return-object v0
.end method
