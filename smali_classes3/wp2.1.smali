.class public final synthetic Lwp2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic b:Lvp2$e;

.field public final synthetic c:Lvp2;


# direct methods
.method public synthetic constructor <init>(Lvp2$e;Lvp2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwp2;->b:Lvp2$e;

    iput-object p2, p0, Lwp2;->c:Lvp2;

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 2

    iget-object v0, p0, Lwp2;->b:Lvp2$e;

    iget-object v1, p0, Lwp2;->c:Lvp2;

    invoke-static {v0, v1, p1, p2}, Lvp2$e;->a(Lvp2$e;Lvp2;Landroid/view/View;Z)V

    return-void
.end method
