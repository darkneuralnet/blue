.class public final synthetic LcD;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/f;


# instance fields
.field public final synthetic b:Lcom/afollestad/materialdialogs/MaterialDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/afollestad/materialdialogs/MaterialDialog;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LcD;->b:Lcom/afollestad/materialdialogs/MaterialDialog;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    iget-object v0, p0, LcD;->b:Lcom/afollestad/materialdialogs/MaterialDialog;

    invoke-static {v0}, LXC$f;->b(Lcom/afollestad/materialdialogs/MaterialDialog;)V

    return-void
.end method
