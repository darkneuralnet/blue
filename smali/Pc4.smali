.class public final synthetic LPc4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LPc4;->b:I

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    iget v0, p0, LPc4;->b:I

    check-cast p1, Landroid/util/Size;

    check-cast p2, Landroid/util/Size;

    invoke-static {v0, p1, p2}, LQc4;->a(ILandroid/util/Size;Landroid/util/Size;)I

    move-result p1

    return p1
.end method
