.class public final enum LT81$d;
.super LT81;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT81;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4011
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, LT81;-><init>(Ljava/lang/String;ILZ81;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILW81;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LT81$d;-><init>(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public b()Landroid/animation/TimeInterpolator;
    .locals 1

    sget-object v0, Lc91;->c:Landroid/animation/TimeInterpolator;

    return-object v0
.end method
