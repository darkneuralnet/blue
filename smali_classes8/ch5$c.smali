.class public final Lch5$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj1$a;


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
.method public a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lsf1;

    check-cast p2, Lsf1;

    invoke-virtual {p1, p2}, Lsf1;->K(Lsf1;)Z

    move-result p1

    return p1
.end method
