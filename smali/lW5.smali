.class public abstract LlW5;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/util/Size;Landroid/util/Size;Landroid/util/Size;Landroid/util/Size;Landroid/util/Size;)LlW5;
    .locals 7

    new-instance v6, Lnu;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lnu;-><init>(Landroid/util/Size;Landroid/util/Size;Landroid/util/Size;Landroid/util/Size;Landroid/util/Size;)V

    return-object v6
.end method


# virtual methods
.method public abstract b()Landroid/util/Size;
.end method

.method public abstract c()Landroid/util/Size;
.end method

.method public abstract d()Landroid/util/Size;
.end method

.method public abstract e()Landroid/util/Size;
.end method

.method public abstract f()Landroid/util/Size;
.end method
