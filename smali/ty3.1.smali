.class public final synthetic Lty3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Landroidx/camera/core/impl/f$a;

    check-cast p2, Landroidx/camera/core/impl/f$a;

    invoke-static {p1, p2}, Landroidx/camera/core/impl/n;->R(Landroidx/camera/core/impl/f$a;Landroidx/camera/core/impl/f$a;)I

    move-result p1

    return p1
.end method
