.class public final synthetic Lxp2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/recyclerview/widget/RecyclerView;

.field public final synthetic c:Lvp2;


# direct methods
.method public synthetic constructor <init>(Landroidx/recyclerview/widget/RecyclerView;Lvp2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxp2;->b:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p2, p0, Lxp2;->c:Lvp2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lxp2;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, p0, Lxp2;->c:Lvp2;

    invoke-static {v0, v1}, Lvp2$e;->b(Landroidx/recyclerview/widget/RecyclerView;Lvp2;)V

    return-void
.end method
