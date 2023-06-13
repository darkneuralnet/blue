.class public Lzendesk/belvedere/FloatingActionMenu$a;
.super Lzendesk/belvedere/FloatingActionMenu$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzendesk/belvedere/FloatingActionMenu;->k(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:LsE3;

.field public final synthetic c:Lzendesk/belvedere/FloatingActionMenu;


# direct methods
.method public constructor <init>(Lzendesk/belvedere/FloatingActionMenu;LsE3;)V
    .locals 0

    iput-object p1, p0, Lzendesk/belvedere/FloatingActionMenu$a;->c:Lzendesk/belvedere/FloatingActionMenu;

    iput-object p2, p0, Lzendesk/belvedere/FloatingActionMenu$a;->b:LsE3;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lzendesk/belvedere/FloatingActionMenu$c;-><init>(Lzendesk/belvedere/FloatingActionMenu$a;)V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    iget-object p1, p0, Lzendesk/belvedere/FloatingActionMenu$a;->c:Lzendesk/belvedere/FloatingActionMenu;

    iget-object v0, p0, Lzendesk/belvedere/FloatingActionMenu$a;->b:LsE3;

    iget-object v0, v0, LsE3;->a:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    const/4 v1, 0x4

    invoke-static {p1, v0, v1}, Lzendesk/belvedere/FloatingActionMenu;->a(Lzendesk/belvedere/FloatingActionMenu;Landroid/view/View;I)V

    return-void
.end method
