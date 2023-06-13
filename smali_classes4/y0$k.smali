.class public Ly0$k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "k"
.end annotation


# instance fields
.field public final a:Landroidx/recyclerview/widget/RecyclerView$D;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView$D;IIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly0$k;->a:Landroidx/recyclerview/widget/RecyclerView$D;

    iput p2, p0, Ly0$k;->b:I

    iput p3, p0, Ly0$k;->c:I

    iput p4, p0, Ly0$k;->d:I

    iput p5, p0, Ly0$k;->e:I

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/recyclerview/widget/RecyclerView$D;IIIILA0;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Ly0$k;-><init>(Landroidx/recyclerview/widget/RecyclerView$D;IIII)V

    return-void
.end method
