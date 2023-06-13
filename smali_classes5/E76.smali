.class public final synthetic LE76;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/MenuItem$OnMenuItemClickListener;


# instance fields
.field public final synthetic b:LF76;


# direct methods
.method public synthetic constructor <init>(LF76;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE76;->b:LF76;

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, LE76;->b:LF76;

    invoke-static {v0, p1}, LF76;->a5(LF76;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method
