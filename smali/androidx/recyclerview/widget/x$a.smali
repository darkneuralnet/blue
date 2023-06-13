.class public Landroidx/recyclerview/widget/x$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static d:LgY3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LgY3<",
            "Landroidx/recyclerview/widget/x$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:I

.field public b:Landroidx/recyclerview/widget/RecyclerView$m$c;

.field public c:Landroidx/recyclerview/widget/RecyclerView$m$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LiY3;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, LiY3;-><init>(I)V

    sput-object v0, Landroidx/recyclerview/widget/x$a;->d:LgY3;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()V
    .locals 1

    :goto_0
    sget-object v0, Landroidx/recyclerview/widget/x$a;->d:LgY3;

    invoke-interface {v0}, LgY3;->a()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static b()Landroidx/recyclerview/widget/x$a;
    .locals 1

    sget-object v0, Landroidx/recyclerview/widget/x$a;->d:LgY3;

    invoke-interface {v0}, LgY3;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/x$a;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/recyclerview/widget/x$a;

    invoke-direct {v0}, Landroidx/recyclerview/widget/x$a;-><init>()V

    :cond_0
    return-object v0
.end method

.method public static c(Landroidx/recyclerview/widget/x$a;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Landroidx/recyclerview/widget/x$a;->a:I

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/recyclerview/widget/x$a;->b:Landroidx/recyclerview/widget/RecyclerView$m$c;

    iput-object v0, p0, Landroidx/recyclerview/widget/x$a;->c:Landroidx/recyclerview/widget/RecyclerView$m$c;

    sget-object v0, Landroidx/recyclerview/widget/x$a;->d:LgY3;

    invoke-interface {v0, p0}, LgY3;->b(Ljava/lang/Object;)Z

    return-void
.end method
