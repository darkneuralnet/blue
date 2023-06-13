.class public Lxi1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYv1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxi1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LYv1$a<",
        "Lp2;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Landroid/graphics/Rect;)V
    .locals 0

    check-cast p1, Lp2;

    invoke-virtual {p0, p1, p2}, Lxi1$a;->b(Lp2;Landroid/graphics/Rect;)V

    return-void
.end method

.method public b(Lp2;Landroid/graphics/Rect;)V
    .locals 0

    invoke-virtual {p1, p2}, Lp2;->m(Landroid/graphics/Rect;)V

    return-void
.end method
