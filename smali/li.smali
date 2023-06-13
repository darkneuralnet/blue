.class public final synthetic Lli;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljk2$a;


# instance fields
.field public final synthetic b:Lmi;


# direct methods
.method public synthetic constructor <init>(Lmi;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lli;->b:Lmi;

    return-void
.end method


# virtual methods
.method public final superDispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Lli;->b:Lmi;

    invoke-virtual {v0, p1}, Lmi;->superDispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
